package Page;

import Utilities.GeneralUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextPluginPage extends AccountPageSettingsWebPage {

    @FindBy(name = "textPlugin[title]")
    private WebElement titleTextbox;

    @FindBy(name = "textPlugin[text]")
    private WebElement descriptionTextArea;

    @FindBy(xpath = "//label[contains(@class,'filePlusBtn')]")
    private WebElement photoUploadButton;

    @FindBy(xpath = "//button[contains(@class,'resize-done')]")
    private WebElement resizeDoneButton;

    @FindBy(id = "modal-file-loading")
    private WebElement fileLoadingModal;

    public void fillTitle(String title) {
        actions.sendKeyElement(titleTextbox, title, "Title Textbox");
    }

    public void fillDescription(String description) {
        actions.sendKeyElement(descriptionTextArea, description, "Description Text Area");
    }

    public void uploadPhoto(String photoName) {
        actions.clickElement(photoUploadButton, "Photo Upload Button");
        GeneralUtilities.uploadMediaByRobot(photoName);
        actions.clickElement(resizeDoneButton, "Resize Done Button");
        //TODO need a closed dialog wait here, tempararily add 1 sec wait-andrew.huynh
        waitors.waitSomeSeconds(5);
    }
}
