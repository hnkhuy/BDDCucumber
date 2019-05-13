package Utilities;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by huy.huynh on 17/09/2018.
 */
public class Waitors {
    private Logger logger = Loggger.getLogger(this.getClass());
    private WebDriver webDriver;

    public Waitors(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void waitSomeSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(WebElement webElement, String elementName) {
        logger.info("Waiting for clicking on element: " + elementName);
        if (webDriver == null) {
            logger.error("WebDriver must not be null");
        }
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitUntilPageTitleBeChanged(String title) {
        logger.info("Waiting until page title be changed");
        WebDriverWait wait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        wait.until(ExpectedConditions.titleContains(title));
    }

    public void waitForVisibilityOf(WebElement webElement, String elementName) {
        logger.info("Waiting for Visibility of element: " + elementName);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForInvisibilityOf(WebElement webElement, String elementName) {
        logger.info("Waiting for Invisibility of element: " + elementName);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitForConfirmDialogClosed() {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.attributeToBe(webDriver.findElement(By.id("popModalConfirm")), "style", "display: none;"));

    }

    public boolean waitForAttributeValueChanged(WebElement element, String elementName, String attributeName,
                                                String attributeValue) {
        logger.info("Try to waitForAtrributeValueChanged: " + elementName);
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
            wait.until((ExpectedCondition<Boolean>) driver -> {
                String actualAttributeValue = null;
                if (element.getAttribute(attributeName) != null) {
                    actualAttributeValue = element.getAttribute(attributeName);
                    System.out.println("Actual Displayed Value: " + actualAttributeValue);
                } else {
                    logger.info(String.format("Attribute %s is null", attributeName));
                    return false;
                }
                if (actualAttributeValue.equals(attributeValue))
                    return true;
                else
                    return false;
            });
            return true;
        } catch (Exception e) {
            logger.info(e.getMessage());
            return false;
        }
    }

    public boolean waitForCssValueChanged(WebElement element, String elementName, String cssName, String cssValue) {
        logger.info("Try to waitForCssValueChanged: " + elementName);
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
            wait.until((ExpectedCondition<Boolean>) driver -> {
                String actualcssValue = element.getCssValue(cssName);
                System.out.println("Actual Displayed Value: " + actualcssValue);
                if (actualcssValue.equals(cssValue))
                    return true;
                else
                    return false;
            });
            return true;
        } catch (Exception e) {
            System.out.println(e);
            logger.info("CSS Value is not changed");
            return false;
        }
    }

    public boolean waitForTextValueChanged(WebElement element, String elementName, String textValue) {
        logger.info("Try to waitForTextValueChanged: " + elementName);
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
            wait.until((ExpectedCondition<Boolean>) driver -> {
                String actualTextValue = element.getText().trim();
                System.out.println("Actual Displayed Value: " + actualTextValue);
                System.out.println("Expected Displayed Value: " + textValue);
                if (actualTextValue.equals(textValue))
                    return true;
                else
                    return false;
            });
            logger.info(String.format("Text Value of element '%s' is changed to '%s' ", elementName, textValue));
            return true;
        } catch (Exception e) {
            logger.info("CSS Value is not changed");
            logger.info("Text Value of element '%s' is NOT changed " + elementName);
            return false;
        }
    }
}
