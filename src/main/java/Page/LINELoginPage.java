package Page;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LINELoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement logInWithLINEButton;

    @FindBy(name = "tid")
    private WebElement emailTextbox;

    @FindBy(name = "tpasswd")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logInButton;

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void navigatedToLINEBusinessIDPage() {
        webDriver.get(PropertiesFileReader.getProperty("url"));
        logger.info("Navigated to LINE Business ID page");
    }

    public void clickOnLogInWithLINEAccountButton() {
        waitors.waitForElementToBeClickable(logInWithLINEButton, "Log In With LINE Button");
        actions.clickElement(logInWithLINEButton, "Log In With LINE Button");
    }

    public void navigatedToLINELoginPage() {
        Assert.assertEquals(webDriver.getTitle(), "LINE Login", "Expected navigated to LINE Login page");
    }

    public void fillEmailWithLINEDefaultEmail() {
        actions.sendKeyElement(emailTextbox, PropertiesFileReader.getProperty("email"), "Email Textbox");
    }

    public void fillPasswordWithLINEDefaultPassword() {
        actions.sendKeyElement(passwordTextbox, PropertiesFileReader.getProperty("password"), "Password Textbox");
    }

    public void clickOnLINELoginButton() {
        waitors.waitForElementToBeClickable(logInButton, "Log In Button");
        actions.clickElement(logInButton, "Log In Button");
    }

    public void navigatedToLINEOfficialAccountManager() {
        waitors.waitUntilPageTitleBeChanged("Manager");
        Assert.assertEquals(webDriver.getTitle(), "LINE Official Account Manager", "Expected navigated to LINE Official Account Manager page");
    }
}