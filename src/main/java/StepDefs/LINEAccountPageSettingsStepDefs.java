package StepDefs;

import Page.LINEAccountPageSettingsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LINEAccountPageSettingsStepDefs extends AbstractStepDefs {

    private LINEAccountPageSettingsPage lineAccountPageSettingsPage;

    @Override
    protected void initPages() {
        lineAccountPageSettingsPage = new LINEAccountPageSettingsPage();
    }

    @When("^I click account name: (.*) on list account$")
    public void clickAccountNameOnListAccount(String accountName) {
        lineAccountPageSettingsPage.clickAccountNameOnListAccount(accountName);
    }

    @Then("^I navigated to Account Page Settings of: (.*)$")
    public void navigatedToAccountPageSettingsOf(String accountName) {
        lineAccountPageSettingsPage.navigatedToAccountPageSettingsOf(accountName);
    }

    @Then("^I click on Add Plugin button$")
    public void clickOnAddPluginButton() {
        lineAccountPageSettingsPage.clickOnAddPluginButton();
    }

    @And("^I select to add (.*) plugin$")
    public void selectToAddPlugin(String pluginName) {
        lineAccountPageSettingsPage.selectToAddPlugin(pluginName);
    }

    @Then("^I navigated to Collection plugin page$")
    public void navigatedToCollectionPluginPage() {
        lineAccountPageSettingsPage.navigatedToCollectionPluginPage();
    }

    @And("^I fill Collection plugin title$")
    public void fillCollectionPluginTitle() {
        lineAccountPageSettingsPage.fillCollectionPluginTitle();
    }

    @And("^I fill Collection items with given title and description$")
    public void fillCollectionItemsWithGivenTitleAndDescription(DataTable itemTable) {
        //just for happy case, no validation for list item quantity-andrew.huynh
        lineAccountPageSettingsPage.fillCollectionItemsWithGivenTitleAndDescription(itemTable);
    }

    @And("^I click on Save plugin button$")
    public void clickOnSavePluginButton() {
        lineAccountPageSettingsPage.clickOnSavePluginButton();
    }

    @And("^I activate this plugin to Publish$")
    public void activateThisPluginToPublish() {
        lineAccountPageSettingsPage.activateThisPluginToPublish();
    }

    @And("^I click on Publish button$")
    public void clickOnPublishButton() {
        lineAccountPageSettingsPage.clickOnPublishButton();
    }
}
