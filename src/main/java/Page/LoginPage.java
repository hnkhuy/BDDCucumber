package Page;

import Utilities.PropertiesFileReader;
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

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
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
        waitors.waitForElementToBeClickable(signInButton, "Sign In Button");
        actions.clickElement(signInButton, "Sign In Button");
    }

}
