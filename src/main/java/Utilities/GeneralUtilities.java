package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class GeneralUtilities {
    public static WebElement getElementWithFluentWait(WebDriver webDriver, String xpath) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Static.EXPLITCIT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        return wait.until(driver -> driver.findElement(By.xpath(xpath)));
    }

    public static String getTimeStampForNameSuffix() {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy_HHmmss");
        Date date = new Date();
        return sdf.format(date);
    }

    public static String collectionPluginTitle = null;

    public static void setCollectionPluginTitle(String title) {
        collectionPluginTitle = title;
    }

    public static String getCollectionPluginTitle() {
        return collectionPluginTitle;
    }
}
