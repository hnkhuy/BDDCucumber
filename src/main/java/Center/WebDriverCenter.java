package Center;

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

    public static void setupPrimaryWebDriver() {
        //init with chrome- multi browser later
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        WebDriver webDriver;
        if (webDrivers.isEmpty()) {
            webDriver = new ChromeDriver(options);
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webDrivers.add(webDriver);
        }
    }

    public static WebDriver getPrimaryWebDriver() throws Exception {
        if (!webDrivers.isEmpty()) {
            return webDrivers.get(0);
        }
        throw new Exception("Webdriver need to setup first");
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
