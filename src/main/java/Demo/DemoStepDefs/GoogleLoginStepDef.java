package Demo.DemoStepDefs;

import Demo.DemoPage.GoogleLoginWebPage;
import StepDefs.AbstractStepDefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleLoginStepDef extends AbstractStepDefs {

    private GoogleLoginWebPage googleLoginPage;

    @Override
    protected void initPages() {
        googleLoginPage = new GoogleLoginWebPage();
    }

    @Given("^I navigated to Google Login page$")
    public void navigatedToGoogleLoginPage() throws Throwable {
        googleLoginPage.navigatedToGoogleSeachPage();
    }

    @When("^I fill email to Email Box$")
    public void fillEmailToEmailBox() throws Throwable {
        googleLoginPage.fillEmailToEmailBox();
    }

    @And("^I click on Email Next Button$")
    public void clickOnEmailNextButton() throws Throwable {
        googleLoginPage.clickOnEmailNextButton();
    }

    @And("^I fill password to Password Box$")
    public void fillPasswordToPasswordBox() throws Throwable {
        googleLoginPage.fillPasswordToPasswordBox();
    }

    @And("^I click on Password Next Button$")
    public void clickOnPasswordNextButton() throws Throwable {
        googleLoginPage.clickOnPasswordNextButton();
    }

    @Then("^Wrong password error message showed$")
    public void wrongPasswordErrorMessageShowed() throws Throwable {
        googleLoginPage.wrongPasswordErrorMessageShowed();
    }
}
