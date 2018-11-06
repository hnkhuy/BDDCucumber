package StepDefs;

import Page.EngagementDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * Created by huy.huynh on 21/09/2018.
 */
public class EngagementDetailsStepdefs extends AbstractStepDefs {

    private EngagementDetailsPage engagementDetailsPage;

    @Override
    protected void initPages() {
        engagementDetailsPage = new EngagementDetailsPage();
    }

    @And("^I should see Engagement Detail page of Engagement: \"([^\"]*)\"$")
    public void seeEngagementDetailPageOfEngagement(String engagementName) throws Throwable {
        engagementDetailsPage.seeEngagementDetailPageOfEngagement(engagementName);
    }

    @Then("^I click on To-Dos tab$")
    public void clickOnToDosTab() throws Throwable {
        engagementDetailsPage.clickOnToDosTab();
    }

    @And("^I should see To-Dos title$")
    public void seeToDosTitle() throws Throwable {
        engagementDetailsPage.seeToDosTitle();
    }

    @And("^I should see no To-Dos yet label$")
    public void seeNoToDosYetLabel() throws Throwable {
        engagementDetailsPage.seeNoToDosYetLabel();
    }
}
