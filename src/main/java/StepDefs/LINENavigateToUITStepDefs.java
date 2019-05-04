package StepDefs;

import Page.LINENavigateToUITWebPage;
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

    @And("^I click on Start button on Welcome LINE app$")
    public void clickOnStartButtonOnWelcomeLINEApp() {
        lineNavigateToUITPage.clickOnStartButtonOnWelcomeLINEApp();
    }
}
