package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextPluginPage extends AccountPageSettingsWebPage {

    @FindBy(name = "textPlugin[title]")
    private WebElement titleTextbox;

    @FindBy(name = "textPlugin[text]")
    private WebElement descriptionTextArea;

    public void fillTitle(String title) {
        actions.sendKeyElement(titleTextbox, title, "Title Textbox");
    }

    public void fillDescription(String description) {
        actions.sendKeyElement(descriptionTextArea, description, "Description Text Area");
    }
}
