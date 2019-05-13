package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
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

    public static void uploadMediaByRobot(String fileName) {
        File file = new File("src/main/resources/media/" + fileName);
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Cmd + Tab is needed since it launches a Java app and the browser looses focus
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);

        //Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        //Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

        //Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
