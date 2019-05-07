package StepDefs;

import Page.NavigateToUITMobilePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

public class NavigateToUITStepDefs extends AbstractStepDefs {

    private NavigateToUITMobilePage navigateToUITPage;

    @Override
    protected void initPages() {
        navigateToUITPage = new NavigateToUITMobilePage();
    }

    @Then("^I open Line app on primary device$")
    public void openLineAppOnPrimaryDevice() throws Exception {
        navigateToUITPage.openLineAppOnPrimaryDevice();
    }

    @And("^I log in to LINE app with default account$")
    public void logInToLINEappAppWithDefaultAccount() {
        navigateToUITPage.clickOnStartButtonOnWelcomeLINEApp();
        navigateToUITPage.inputDefaultPhoneNumberAndPinCode();
    }

    @And("^I go to UIT page via Friend list: (.*)$")
    public void goToUITPageViaFriendList(String accountName) {
        navigateToUITPage.passGuideSections();
        navigateToUITPage.goToUITPageViaFriendList(accountName);
    }

    @And("^I verify Collection plugin on UIT$")
    public void verifyCollectionPluginOnUIT(DataTable itemTable) {
        navigateToUITPage.verifyCollectionPluginOnUIT(itemTable);
    }

    @And("^I verify Text plugin on UIT$")
    public void verifyTextPluginOnUIT(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        navigateToUITPage.verifyTextPluginTitle(data.get(0).get("Title"));
        navigateToUITPage.verifyTextPluginDescription(data.get(0).get("Description"));
    }
}
