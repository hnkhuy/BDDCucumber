package Demo.DemoPage;

import Demo.DemoUtilities.DemoPropertiesFileReader;
import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleLoginPage extends AbstractPage {

    private WebDriver webDriver;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailTextbox;

    @FindBy(xpath = "//div[@id='identifierNext']/content/span")
    private WebElement emailNextButton;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//div[@id='passwordNext']/content/span")
    private WebElement passwordNextButton;

    @FindBy(xpath = "//div[@id='password']/div/div[@aria-atomic]")
    private WebElement passwordErrorMessage;

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatedToGoogleSeachPage() {
        webDriver.get(DemoPropertiesFileReader.getProperty("url"));
    }

    public void fillEmailToEmailBox() {
        actions.sendKeyElement(emailTextbox, DemoPropertiesFileReader.getProperty("email"), "Email Textbox");
    }

    public void clickOnEmailNextButton() {
        actions.clickElement(emailNextButton, "Email Next Button");
    }

    public void fillPasswordToPasswordBox() throws Exception {
        waitors.waitSomeSeconds(2);
        actions.sendKeyElement(passwordTextbox, DemoPropertiesFileReader.getProperty("password"), "Password Textbox");
    }

    public void clickOnPasswordNextButton() {
        actions.clickElement(passwordNextButton, "Password Next Button");
    }

    public void wrongPasswordErrorMessageShowed() {
        waitors.waitSomeSeconds(2);
        Assert.assertTrue(passwordErrorMessage.isDisplayed(), "Password Error Message not showed");
    }
}
