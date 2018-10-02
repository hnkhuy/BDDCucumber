package Page;

import Utilities.PropertiesFileReader;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by huy.huynh on 22/08/2018.
 */
@DefaultUrl("https://qaperfapp.qaperfauvenir.com/login")
public class SerenityLoginPage extends PageObject {

    @FindBy(id = "login-email")
    private WebElement emailTextbox;

    @FindBy(id = "login-password")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public void fillEmailWithDefaultEmail() {
//        actions.sendKeyElement(emailTextbox, PropertiesFileReader.getProperty("email"), "Email Textbox");
        emailTextbox.sendKeys(PropertiesFileReader.getProperty("email"));
    }

    public void fillPasswordWithDefaultPassword() {
//        actions.sendKeyElement(passwordTextbox, PropertiesFileReader.getProperty("password"), "Password Textbox");
        passwordTextbox.sendKeys(PropertiesFileReader.getProperty("password"));
    }

    public void clickOnLoginButton() {
//        waitors.waitForElementToBeClickable(signInButton, "Sign In Button");
//        actions.clickElement(signInButton, "Sign In Button");
        signInButton.click();
    }
}
