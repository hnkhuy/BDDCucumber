package Utilities;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


/**
 * Created by huy.huynh on 13/09/2018.
 */
public class Actions {
    private Logger logger = Loggger.getLogger(this.getClass());
    private Waitors waitors;
    private WebDriver webDriver;

    public Actions(WebDriver driver) {
        webDriver = driver;
        waitors = new Waitors(driver);
    }

    public void clickElement(WebElement element, String elementName) {
        logger.info("Click on element: " + elementName);
        waitors.waitForElementToBeClickable(element, elementName);
        element.click();
    }

    public void sendKeyElement(WebElement element, String value, String elementName) {
        logger.info("Sendkey value: " + value + " to element: " + elementName);
        waitors.waitForVisibilityOf(element, elementName);
        element.sendKeys(value);
    }

    public boolean verifyElementExist(WebElement element, String elementName) {
        waitors.waitForVisibilityOf(element, elementName);
        Assert.assertTrue(element.isDisplayed(), "Expected " + elementName + " displayed");
        return element.isDisplayed();
    }

    public void verifyElementTextEqual(WebElement element, String expectedElementText, String elementName) {
        waitors.waitForVisibilityOf(element, elementName);
        Assert.assertEquals(element.getText(), expectedElementText, elementName);
    }

    public void verifyElementTextEqual(WebElement element, String expectedElementText, String elementName, int waitTime) {
        waitors.waitForVisibilityOf(element, elementName, waitTime);
        Assert.assertEquals(element.getText(), expectedElementText, elementName);
    }

    public void verifyElementTextStartWiths(WebElement element, String expectedElementTextPrefix, String elementName) {
        waitors.waitForVisibilityOf(element, elementName);
        Assert.assertTrue(element.getText().startsWith(expectedElementTextPrefix), "Expected " + elementName + " text start with: " + expectedElementTextPrefix);
    }

    public String getText(WebElement element, String elementName) {
        return element.getText();
    }

    /**
     * get element which cant use @FindBy to find
     *
     * @param xpath xpath to get element
     * @param arg   vararg for formating
     */
    public WebElement getElementByXPath(String xpath, String... arg) {
        logger.info("Get Element by Xpath.");
        WebElement webElement = null;
        xpath = String.format(xpath, arg);
        logger.info("xpath = " + xpath);
        try {
            webElement = webDriver.findElement(By.xpath(xpath));
        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }
        return webElement;
    }

    /**
     * get list elements which cant use @FindBy to find
     *
     * @param xpath xpath to get element
     * @param arg   vararg for formating
     */
    public List<WebElement> getElementsByXPath(String xpath, String... arg) {
        List<WebElement> webElements = null;
        xpath = String.format(xpath, arg);
        logger.info("xpaths = " + xpath);
        try {
            webElements = webDriver.findElements(By.xpath(xpath));
        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }
        return webElements;
    }

    public WebElement getChildElementByXPath(WebElement ancestorElement, String xpath, String... arg) {
        logger.info("Get Child Element by Xpath.");
        WebElement webElement = null;
        xpath = String.format(xpath, arg);
        logger.info("xpath = " + xpath);
        try {
            webElement = ancestorElement.findElement(By.xpath(xpath));
        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }
        return webElement;
    }

    public String getTextFromCSSPropertyWebElement(String id) {
        String script = "return window.getComputedStyle(document.querySelector('#" + id + "'),':before').getPropertyValue('content')";
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        return (String) js.executeScript(script);
    }
}
