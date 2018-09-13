package Demo.DemoStepDefs;

import Demo.Page.GoogleSearchPage;
import StepDefs.AbstractStepDefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleSearchStepDef extends AbstractStepDefs {

    private GoogleSearchPage googleSearchPage;

    @Override
    protected void initPages() {
        googleSearchPage = new GoogleSearchPage(webDriver);
    }

    @Given("^I navigated to Google seach page$")
    public void navigatedToGoogleSeachPage() throws Throwable {
        googleSearchPage.navigatedToGoogleSeachPage();
    }

    @When("^I fill search content to Seach Box: \"([^\"]*)\"$")
    public void fillSearchContentToSeachBox(String searchContent) throws Throwable {
        googleSearchPage.fillSearchContentToSeachBox(searchContent);
    }

    @And("^I click to Search Button$")
    public void clickToSearchButton() throws Throwable {
        googleSearchPage.clickToSearchButton();
    }

    @Then("^Search result page showed$")
    public void searchResultPageShowed() throws Throwable {
        googleSearchPage.searchResultPageShowed();
    }

}
