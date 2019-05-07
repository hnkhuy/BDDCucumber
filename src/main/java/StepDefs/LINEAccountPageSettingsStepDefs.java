package StepDefs;

import Page.LINEAccountPageSettingsWebPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LINEAccountPageSettingsStepDefs extends AbstractStepDefs {

    private LINEAccountPageSettingsWebPage lineAccountPageSettingsPage;

    @Override
    protected void initPages() {
        lineAccountPageSettingsPage = new LINEAccountPageSettingsWebPage();
    }

    @When("^I navigate to Account Page Settings of: (.*)$")
    public void navigateToAccountPageSettingsOf(String accountName) {
        lineAccountPageSettingsPage.clickAccountNameOnListAccount(accountName);
        lineAccountPageSettingsPage.navigateToAccountPageSettingsOf(accountName);
        lineAccountPageSettingsPage.deleteAllExistedCollectionPlugin();
    }

    @Then("^I add new (.*) plugin$")
    public void selectToAddPlugin(String pluginName) {
        lineAccountPageSettingsPage.clickOnAddPluginButton();
        lineAccountPageSettingsPage.selectToAddPlugin(pluginName);
        lineAccountPageSettingsPage.navigatedToCollectionPluginPage();
    }

    @And("^I fill Collection plugin with given title and description$")
    public void fillCollectionPluginWithGivenTitleAndDescription(DataTable itemTable) {
        //just for happy case, no validation for list item quantity-andrew.huynh
        lineAccountPageSettingsPage.fillCollectionItemsWithGivenTitleAndDescription(itemTable);
        lineAccountPageSettingsPage.fillCollectionPluginTitle();
    }

    @And("^I Save plugin$")
    public void savePlugin() {
        lineAccountPageSettingsPage.clickOnSavePluginButton();
    }

    @And("^I Publish plugin$")
    public void publishPlugin() {
        lineAccountPageSettingsPage.activateThisPluginToPublish();
        lineAccountPageSettingsPage.clickOnPublishButton();
    }
}
