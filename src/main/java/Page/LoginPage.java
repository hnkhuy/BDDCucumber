package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by huy.huynh on 22/08/2018.
 */
public class LoginPage {

    public WebDriver webDriver;

    public LoginPage() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public void navigatedToLoginPage() {
        webDriver.get("http://www.google.com");
    }
}
