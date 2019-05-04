package Center;

import Utilities.Loggger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class DriverCenter {
    private static List<WebDriver> webDrivers = new ArrayList<WebDriver>();
    private static WebDriver webDriver;
    private static Logger logger = Loggger.getLogger(DriverCenter.class);
    private static boolean isPrimaryWebDriverJustChanged = false;
    private static String osDriverTail = "";

    private static AppiumDriverLocalService appiumService = null;
    private static AppiumDriver appiumDriver = null;
    private static boolean isPrimaryAppiumDriverJustChanged = false;


    private static ChromeOptions setupChromeWebDriver() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            osDriverTail = "/chromedriver";
//            options.addArguments("--start-fullscreen");
        } else if (System.getProperty("os.name").toLowerCase().contains("win")) {
            osDriverTail = "\\chromedriver.exe";
            options.addArguments("--start-maximized");
        } else {
            //add an 'if' here if u run it on linux
            throw new Exception("Cannot detect chromedriver for current OS!");
        }
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + osDriverTail);
        return options;
    }

    public static void setupPrimaryWebDriver() throws Exception {
        //init with chrome- multi browser later
        webDriver = new ChromeDriver(setupChromeWebDriver());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        isPrimaryWebDriverJustChanged = true;
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
        if (isPrimaryWebDriverJustChanged) {
            isPrimaryWebDriverJustChanged = false;
            return true;
        }
        return isPrimaryWebDriverJustChanged;
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

    public static void startAppiumServer() {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
    }

    public static void stopAppiumServer() {
        quitPrimaryAppiumDriver();
        if (appiumService != null && appiumService.isRunning()) {
            appiumService.stop();
        }
    }

    private static DesiredCapabilities setupAppiumCapabilities() {
        File appDir = new File(System.getProperty("user.dir") + "/src/main/resources/private/");
        File newApp = new File(appDir, "line-9_4_2-beta.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("device", "Android");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy Note9");

        capabilities.setCapability("appPackage", "jp.naver.line.android");
        capabilities.setCapability("appActivity", ".activity.SplashActivity");
        capabilities.setCapability("app", newApp.getAbsolutePath());

        return capabilities;
    }

    public static AppiumDriver setupPrimaryAppiumDriver() throws Exception {
        //hardcode for single android - multi mobile driver later
        appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), setupAppiumCapabilities());
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        isPrimaryAppiumDriverJustChanged = true;
        return appiumDriver;
    }

    public static AppiumDriver getPrimaryAppiumDriver() throws Exception {
        if (appiumDriver != null) {
            return appiumDriver;
        }
        logger.error("AppiumDriver need to be setup first");
        throw new Exception("AppiumDriver need to be setup first");
    }

    public static void quitPrimaryAppiumDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }

    public static boolean getPrimaryAppiumDriverStatus() {
        if (isPrimaryAppiumDriverJustChanged) {
            isPrimaryAppiumDriverJustChanged = false;
            return true;
        }
        return isPrimaryAppiumDriverJustChanged;
    }
}
