package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class GeneralUtilities {
    public WebElement getElementWithFluentWait(WebDriver webDriver, String xpath) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Static.EXPLITCIT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        return wait.until(driver -> driver.findElement(By.xpath(xpath)));
    }
}
