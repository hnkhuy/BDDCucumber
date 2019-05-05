package Page;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//android.widget.TextView[@text='Official accounts']")
    private WebElement officialAccountsOnFriends;

    @FindBy(id = "jp.naver.line.android:id/frienddetaildialog_name")
    private WebElement friendDetailDialogName;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='jp.naver.line.android:id/frienddetaildialog_button_text'][@text='Home']")
    private WebElement homeButtonIcon;

    @FindBy(id = "jp.naver.line.android:id/myhome_postlist_infoitem_profile_text")
    private WebElement viewProfileItem;

    @FindBy(id = "jp.naver.line.android:id/name")
    private List<WebElement> listAccountName;

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
        actions.verifyElementTextEqual(headerTabNameTitle, "Friends 2", "Header Tab Name Title");
    }

    public void goToUITPageViaFriendList(String accountName) {
        actions.clickElement(officialAccountsOnFriends, "Official Accounts On Friends");
        //unknow issue here, click on not expected element when using getElementByXpath or lambda
        clickOnAccountItemNamed(accountName);
        actions.clickElement(homeButtonIcon, "Home Button Icon");
        actions.clickElement(viewProfileItem, "View Profile Item");
    }

    public void clickOnAccountItemNamed(String accountName) {
        for (int i = 0; i < listAccountName.size(); i++) {
            if (listAccountName.get(i).getText().equals(accountName)) {
                logger.debug("Account at position: " + i + " - " + listAccountName.get(i).getText());
                actions.clickElement(listAccountName.get(i), accountName);
                break;
            }
        }
        actions.verifyElementTextEqual(friendDetailDialogName, accountName, "Friend Detail Dialog Name");
    }

    /*
    public void logInToLINEWithDefaultAccount() {
        actions.clickElement(nextButton, "Next Button");
    }
     */
}
