package Page;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LINENavigateToUITWebPage extends AbstractMobilePage {

    @FindBy(id = "jp.naver.line.android:id/header")
    private WebElement welcomeTitle;

    @FindBy(id = "jp.naver.line.android:id/next")
    private WebElement nextButton;

    @FindBy(id = "jp.naver.line.android:id/common_dialog_cancel_btn")
    private WebElement dialogCancelButton;

    @FindBy(id = "jp.naver.line.android:id/common_dialog_ok_btn")
    private WebElement dialogOKButton;

    @FindBy(id = "jp.naver.line.android:id/country_code")
    private WebElement countrySelect;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Japan')]")
    private WebElement japanCountryItem;

    @FindBy(id = "jp.naver.line.android:id/edit_text")
    private WebElement phoneNumerEditText;

    @FindBy(id = "jp.naver.line.android:id/code_verification_real")
    private WebElement codeVerification;

    @FindBy(id = "jp.naver.line.android:id/skip_button")
    private WebElement skipButton;

    @FindBy(id = "jp.naver.line.android:id/header_title")
    private WebElement headerTabNameTitle;

    @FindBy(id = "next")
    private WebElement startButton5;

    @FindBy(id = "next")
    private WebElement startButton6;

    @FindBy(id = "next")
    private WebElement startButton7;

    @FindBy(id = "next")
    private WebElement startButton8;

    @FindBy(id = "next")
    private WebElement startButto9;

    @FindBy(id = "next")
    private WebElement startButton10;

    @FindBy(id = "next")
    private WebElement startButto11;

    @FindBy(id = "next")
    private WebElement startButton12;

    @FindBy(id = "next")
    private WebElement startButton13;

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(appiumDriver, this);
    }

    public void openLineAppOnPrimaryDevice() throws Exception {
        actions.verifyElementTextEqual(welcomeTitle, "Welcome to LINE", "Welcome Title");
    }

    public void clickOnStartButtonOnWelcomeLINEApp() {
        actions.clickElement(nextButton, "Next Button");
        actions.clickElement(dialogCancelButton, "Dialog Cancel Button");
    }

    public void inputDefaultPhoneNumberAndPinCode() {
        actions.clickElement(countrySelect, "Country Select");
        actions.clickElement(japanCountryItem, "Japan Country Item");
        actions.sendKeyElement(phoneNumerEditText, PropertiesFileReader.getProperty("phoneNumberGalaxyNote9"), "Phone Numer Edit Text");
        actions.clickElement(nextButton, "Next Button");
        actions.clickElement(dialogOKButton, "Dialog OK Button");
        actions.sendKeyElement(codeVerification, PropertiesFileReader.getProperty("pinCodeGalaxyNote9"), "Code Verification");
    }

    public void passGuideSections() {
        actions.clickElement(nextButton, "Next Button");
        actions.clickElement(dialogCancelButton, "Dialog Cancel Button");
        actions.clickElement(skipButton, "Skip Button");
        actions.verifyElementTextEqual(headerTabNameTitle, "Friends", "Header Tab Name Title");
    }

    /*
    public void logInToLINEWithDefaultAccount() {
        actions.clickElement(nextButton, "Next Button");
    }
     */
}
