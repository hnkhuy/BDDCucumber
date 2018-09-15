package Page;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by huy.huynh on 22/08/2018.
 */
public class LoginPage extends AbstractPage {

    @FindBy(id = "login-email")
    private WebElement emailTextbox;

    @FindBy(id = "login-password")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatedToLoginPage() {
        webDriver.get(PropertiesFileReader.getProperty("url"));
        logger.info("Navigated to login page");
    }

    public void fillEmailWithDefaultEmail() {
        actions.sendKeyElement(emailTextbox, PropertiesFileReader.getProperty("email"), "Email Textbox");
    }

    public void fillPasswordWithDefaultPassword() {
        actions.sendKeyElement(passwordTextbox, PropertiesFileReader.getProperty("password"), "Password Textbox");
    }

    public void clickOnLoginButton() {
        actions.clickElement(signInButton, "Sign In Button");
    }
    
}
