package Center;

import Utilities.Loggger;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class WebDriverCenter {
    private static List<WebDriver> webDrivers = new ArrayList<WebDriver>();
    private static WebDriver webDriver;
    private static Logger logger = Loggger.getLogger(WebDriverCenter.class);
    private static boolean isPrimaryDriverJustChanged = false;

    private static ChromeOptions setupChromeWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        return options;
    }

    public static void setupPrimaryWebDriver() {
        //init with chrome- multi browser later
        webDriver = new ChromeDriver(setupChromeWebDriver());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        isPrimaryDriverJustChanged = true;
    }

    public static WebDriver getPrimaryWebDriver() throws Exception {
        if (webDriver != null) {
            return webDriver;
        }
        logger.error("Webdriver need to be setup first");
        throw new Exception("Webdriver need to be setup first");
    }

    public static void quitPrimaryWebDriver() {
        webDriver.quit();
    }

    public static boolean getPrimaryWebDriverStatus() {
        if(isPrimaryDriverJustChanged){
            isPrimaryDriverJustChanged=false;
            return true;
        }
        return isPrimaryDriverJustChanged;
    }

    public static void quitAllDriver() {
        try {
            //Do not close so fast now, I want to see a little bit more :)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDrivers.forEach(driver -> driver.quit());
    }
}
