package StepDefs;

import Page.TextPluginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class TextPluginStepDefs extends AbstractStepDefs {

    private TextPluginPage textPluginPage;

    @Override
    protected void initPages() {
        textPluginPage = new TextPluginPage();
    }

    @When("^I fill Text plugin with given title and description$")
    public void fillTextPluginWithGivenTitleAndDescription(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        textPluginPage.fillTitle(data.get(0).get("Title"));
        textPluginPage.fillDescription(data.get(0).get("Description"));
        if (data.get(0).get("PhotoName") != null) {
            textPluginPage.uploadPhoto(data.get(0).get("PhotoName"));
        }
    }
}
