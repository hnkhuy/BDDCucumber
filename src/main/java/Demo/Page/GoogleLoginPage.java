package Demo.Page;

import Utilities.GeneralUtilities;
import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleLoginPage {

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
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatedToGoogleSeachPage() {
        webDriver.get(PropertiesFileReader.getProperty("url"));
    }

    public void fillEmailToEmailBox() {
        emailTextbox.sendKeys(PropertiesFileReader.getProperty("email"));
    }

    public void clickOnEmailNextButton() {
        emailNextButton.click();
    }

    public void fillPasswordToPasswordBox() throws Exception {
        GeneralUtilities.waitSomeSeconds(2);
        passwordTextbox.sendKeys(PropertiesFileReader.getProperty("password"));
    }

    public void clickOnPasswordNextButton() {
        passwordNextButton.click();
    }

    public void wrongPasswordErrorMessageShowed() {
        GeneralUtilities.waitSomeSeconds(2);
        Assert.assertTrue(passwordErrorMessage.isDisplayed(), "Password Error Message not showed");
    }
}
