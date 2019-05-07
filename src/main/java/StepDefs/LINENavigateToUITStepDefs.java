package StepDefs;

import Page.LINENavigateToUITWebPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LINENavigateToUITStepDefs extends AbstractStepDefs {

    private LINENavigateToUITWebPage lineNavigateToUITPage;

    @Override
    protected void initPages() {
        lineNavigateToUITPage = new LINENavigateToUITWebPage();
    }

    @Then("^I open Line app on primary device$")
    public void openLineAppOnPrimaryDevice() throws Exception {
        lineNavigateToUITPage.openLineAppOnPrimaryDevice();
    }

    @And("^I log in to LINE app with default account$")
    public void logInToLINEappAppWithDefaultAccount() {
        lineNavigateToUITPage.clickOnStartButtonOnWelcomeLINEApp();
        lineNavigateToUITPage.inputDefaultPhoneNumberAndPinCode();
    }

    @And("^I go to UIT page via Friend list: (.*)$")
    public void goToUITPageViaFriendList(String accountName) {
        lineNavigateToUITPage.passGuideSections();
        lineNavigateToUITPage.goToUITPageViaFriendList(accountName);
    }

    @And("^I verify Collection plugin on UIT$")
    public void verifyCollectionPluginOnUIT(DataTable itemTable) {
        lineNavigateToUITPage.verifyCollectionPluginOnUIT(itemTable);
    }
}
