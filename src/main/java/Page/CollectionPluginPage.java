package Page;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class CollectionPluginPage extends AccountPageSettingsWebPage {

    @FindBy(xpath = "//div[@class='input-group']/input[contains(@name,'item')]")
    private List<WebElement> itemTitleTextbox;

    @FindBy(xpath = "//div[@class='input-margin-top']/textarea")
    private List<WebElement> itemDescriptionTextArea;

    public void fillCollectionItemsWithGivenTitleAndDescription(DataTable itemTable) {
        List<Map<String, String>> itemsData = itemTable.asMaps(String.class, String.class);
        for (int i = 0; i < itemsData.size(); i++) {
            actions.sendKeyElement(itemTitleTextbox.get(i), itemsData.get(i).get("ItemTitle"), "Item Title" + (i + 1));
            actions.sendKeyElement(itemDescriptionTextArea.get(i), itemsData.get(i).get("ItemDescription"), "Item Description" + (i + 1));
        }
    }
}
