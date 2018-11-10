package StepDefs;

import Page.EngagementListPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class EngagementListStepDefs extends AbstractStepDefs {

    private EngagementListPage engagementListPage;

    @Override
    protected void initPages() {
        engagementListPage = new EngagementListPage();
    }

    @Then("^I can see Engagement List page$")
    public void seeEngagementListPage() throws Throwable {
        engagementListPage.seeEngagementListPage();
    }

    @Then("^I click on Engagement named: \"([^\"]*)\"$")
    public void clickOnEngagementNamed(String engagementName) throws Throwable {
        engagementListPage.clickOnEngagementNamed(engagementName);
    }

    @Then("^I can see Create Engagement button$")
    public void seeCreateEngagementButton() throws Throwable {
        engagementListPage.seeCreateEngagementButton();
    }

    @And("^I can see text of Create Engagement button: \"([^\"]*)\"$")
    public void seeTextOfCreateEngagementButton(String buttonText) throws Throwable {
        engagementListPage.seeTextOfCreateEngagementButton(buttonText);
    }

    @And("^I can see text color of Create Engagement button is white$")
    public void seeTextColorOfCreateEngagementButtonIsWhite() throws Throwable {
        engagementListPage.seeTextColorOfCreateEngagementButtonIsWhite();
    }

    @Then("^I can see Engagement and its status$")
    public void seeEngagementAndItsStatus(DataTable engagementTable) throws Throwable {
        List<Map<String, String>> list = engagementTable.asMaps(String.class, String.class);
        for(int i=0; i<list.size(); i++) {
            engagementListPage.seeEngagementAndItsStatus(list.get(i));
        }

    }
}
