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
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.titleContains(title));
    }

    public void waitForVisibilityOf(WebElement webElement, String elementName) {
        logger.info("Waiting for Visibility of element: " + elementName);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Static.EXPLITCIT_TIMEOUT_IN_SECONDS);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
