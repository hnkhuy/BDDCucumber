package Page;

import Utilities.GeneralUtilities;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class LINEAccountPageSettingsWebPage extends AbstractWebPage {

    @FindBy(id = "topAccountName")
    private WebElement previewAccountName;

    @FindBy(xpath = "//span[@id='nameP']")
    private WebElement previewAccountName2;

    @FindBy(xpath = "//div[@class='form-right']//div[@id='name']")
    private WebElement previewAccountName3;

    @FindBy(xpath = "//div[@class='preview-title']")
    private WebElement previewTitle;

    @FindBy(xpath = "//span[@class='cursor-pointer']")
    private WebElement addPluginButton;

    @FindBy(xpath = "//button[@type='button'][contains(@class,'btn-save ')]")
    private WebElement confirmAddPluginButton;

    @FindBy(xpath = "//div[@class='input-group']/../preceding-sibling::div[contains(@class,'form')]")
    private WebElement pluginTitleLabel;

    @FindBy(xpath = "//div[@class='input-group']/input[@id]")
    private WebElement pluginTitleTextbox;

    @FindBy(xpath = "//div[@class='input-group']/input[contains(@name,'item')]")
    private List<WebElement> itemTitleTextbox;

    @FindBy(xpath = "//div[@class='input-margin-top']/textarea")
    private List<WebElement> itemDescriptionTextArea;

    @FindBy(xpath = "//button[contains(@class,'btn-save-pad')]")
    private WebElement savePluginButton;

    @FindBy(xpath = "//button[contains(@class,'save btn-save')]")
    private WebElement confirmSavePluginButton;

    @FindBy(xpath = "//div[contains(@class,'plugin-active')]//label")
    private WebElement selectedPluginActivationCheckbox;

    @FindBy(xpath = "//button[contains(@class,'btn-publish')]")
    private WebElement publishButton;

    @FindBy(xpath = "//span[contains(@class,'cursor-pointer')][text()='Collection']/ancestor::div[contains(@id,'plugin')]//div[contains(@class,'deleteArea')]")
    private List<WebElement> listCollectionDeleteIcon;

    @FindBy(xpath = "//button[contains(@class,'ok default')]")
    private WebElement confirmOKPluginButton;

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void clickAccountNameOnListAccount(String accountName) {
        WebElement accountNameLink = actions.getElementByXpath("//span[text()='%s']/..", accountName);

        waitors.waitForElementToBeClickable(accountNameLink, "Account Name Link");
        actions.clickElement(accountNameLink, "Account Name Link");
    }

    public void navigatedToAccountPageSettingsOf(String accountName) {
        //Debuging for cannot-gettext-element
//        System.out.println("previewAccountName = " + previewAccountName);
//        System.out.println("previewAccountName2 = " + previewAccountName);
//        System.out.println("previewAccountName = " + previewAccountName.getTagName());
//        System.out.println("previewAccountName3 = " + previewAccountName.getTagName());
//        System.out.println("previewAccountName = " + previewAccountName.getText());
//        System.out.println("previewAccountName3 = " + previewAccountName.getText());
//        System.out.println("previewAccountNam4 = " + previewAccountName2.getAttribute("innerHTML"));
//        System.out.println("previewAccountName5 = " + previewAccountName2.getAttribute("innerText"));
//        System.out.println("previewAccountName6 = " + previewAccountName2.getAttribute("outerText"));
//        System.out.println("previewAccountName7 = " + previewAccountName3.getAttribute("textContent"));
//        System.out.println("previewAccountName3 = " + previewAccountName3.getTagName());
//        System.out.println("previewAccountName6 = " + previewAccountName3.getAttribute("id"));
//        System.out.println("previewAccountName6 = " + previewTitle.getText());
//
//        WebElement element = previewAccountName; // Your element
//        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
//        Object aa=executor.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", element);
//        System.out.println(aa.toString());
//
//        Object a1=executor.executeScript("return arguments[0].attributes;", previewAccountName);
//        System.out.println("a1 "+ a1.toString());
//
//        Object a2=executor.executeScript("return arguments[0].attributes;", previewAccountName2);
//        System.out.println("a2 "+ a2.toString());
//
//        Object a3=executor.executeScript("return arguments[0].attributes;", previewAccountName3);
//        System.out.println("a3 "+ a3.toString());

//        Assert.assertEquals(previewAccountName.getText(), accountName, "Expected account name equal " + accountName);
    }

    public void clickOnAddPluginButton() {
        // issue here, come back later, tempararily add 1 sec wait-andrew.huynh
        waitors.waitSomeSeconds(1);
        waitors.waitForElementToBeClickable(addPluginButton, "Add Plugin Button");
        actions.clickElement(addPluginButton, "Add Plugin Button");
    }

    public void selectToAddPlugin(String pluginName) {
        WebElement pluginRadioButton = actions.getElementByXpath("//input[@id='add%sRadio']", pluginName);

        waitors.waitForElementToBeClickable(pluginRadioButton, "Plugin Radio Button");
        actions.clickElement(pluginRadioButton, "Plugin Radio Button");

        actions.clickElement(confirmAddPluginButton, "Confirm Plugin Radio Button");
    }

    public void navigatedToCollectionPluginPage() {
        actions.verifyElementExist(pluginTitleLabel, "Plugin Title Label");
    }

    public void fillCollectionPluginTitle() {
        actions.sendKeyElement(pluginTitleTextbox, "Col_" + GeneralUtilities.getTimeStampForNameSuffix(), "Plugin Title Textbox");
    }

    public void fillCollectionItemsWithGivenTitleAndDescription(DataTable itemTable) {
        List<Map<String, String>> itemsData = itemTable.asMaps(String.class, String.class);
        for (int i = 0; i < itemsData.size(); i++) {
            actions.sendKeyElement(itemTitleTextbox.get(i), itemsData.get(i).get("ItemTitle"), "Item Title" + (i + 1));
            actions.sendKeyElement(itemDescriptionTextArea.get(i), itemsData.get(i).get("ItemDescription"), "Item Description" + (i + 1));
        }
    }

    public void clickOnSavePluginButton() {
        actions.clickElement(savePluginButton, "Save Plugin Button");
        actions.clickElement(confirmSavePluginButton, "Confirm Save Plugin Button");
    }

    public void activateThisPluginToPublish() {
        // need a better wait here, tempararily add 1 sec wait-andrew.huynh
        waitors.waitSomeSeconds(2);
        actions.clickElement(selectedPluginActivationCheckbox, "Selected Plugin Activation Checkbox");
    }

    public void clickOnPublishButton() {
        actions.clickElement(publishButton, "Publish Button");
    }

    public void deleteAllExistedCollectionPlugin() {
        for (int i = 0; i < listCollectionDeleteIcon.size(); i++) {
            actions.clickElement(listCollectionDeleteIcon.get(i), "Collection Delete Icon Item");
            actions.clickElement(confirmOKPluginButton, "Confirm OK Plugin Button");
        }
    }
}
