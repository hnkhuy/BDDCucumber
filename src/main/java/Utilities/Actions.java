package Utilities;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by huy.huynh on 13/09/2018.
 */
public class Actions {
    private Logger logger = Loggger.getLogger(this.getClass());
    private Waitors waitors;

    public Actions(WebDriver driver) {
        waitors = new Waitors(driver);
    }

    public void clickElement(WebElement element, String elementName) {
        logger.info("Click on element: " + elementName);
        waitors.waitForElementToBeClickable(element, elementName);
        element.click();
    }

    public void sendKeyElement(WebElement element, String value, String elementName) {
        logger.info("Sendkey value: " + value + " to element: " + elementName);
        element.sendKeys(value);
    }
}
