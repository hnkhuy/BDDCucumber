package Page;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by huy.huynh on 22/08/2018.
 */
public class EALoginPage extends AbstractPage {

    @FindBy(name = "UserName")
    private WebElement usernameTextbox;

    @FindBy(name = "Password")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement logInButton;

    public EALoginPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatedToLoginPage() {
        webDriver.get("http://www.executeautomation.com/demosite/Login.html");
        logger.info("Navigated to login page");
    }

    public void fillEmailAndPassword() {
        actions.sendKeyElement(usernameTextbox, "admin", "Username Textbox");
        actions.sendKeyElement(passwordTextbox, "adminpassw", "Password Textbox");
    }

    public void clickOnLoginButton() {
//        waitors.waitForElementToBeClickable(logInButton, "Sign In Button");
        actions.clickElement(logInButton, "login Button");
    }

}
