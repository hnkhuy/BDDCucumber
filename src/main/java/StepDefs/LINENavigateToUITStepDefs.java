package StepDefs;

import Page.LINENavigateToUITPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LINENavigateToUITStepDefs extends AbstractStepDefs {

    private LINENavigateToUITPage lineNavigateToUITPage;

    @Override
    protected void initPages() {
        lineNavigateToUITPage = new LINENavigateToUITPage();
    }

    @Then("^I open Line app on primary device$")
    public void openLineAppOnPrimaryDevice() throws Exception {
        lineNavigateToUITPage.openLineAppOnPrimaryDevice();
    }

    @And("^I click on Start button on Welcome LINE app$")
    public void clickOnStartButtonOnWelcomeLINEApp() {
        lineNavigateToUITPage.clickOnStartButtonOnWelcomeLINEApp();
    }
}
