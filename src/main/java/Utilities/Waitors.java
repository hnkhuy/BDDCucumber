package Utilities;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void waitForElementToBeClickable(WebElement webElement, String elementName) {
        logger.info("Click on element: " + elementName);
        if (webDriver == null) {
            logger.error("WebDriver must not be null");
        }
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitForVisibilityOf(WebElement webElement, String elementName) {
        logger.info("Visibility of element: " + elementName);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
