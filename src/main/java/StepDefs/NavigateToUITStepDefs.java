package StepDefs;

import Page.NavigateToUITMobilePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

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
}
