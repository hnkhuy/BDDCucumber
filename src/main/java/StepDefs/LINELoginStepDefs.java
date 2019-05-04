package StepDefs;

import Page.LINELoginWebPage;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LINELoginStepDefs extends AbstractStepDefs {

    private LINELoginWebPage loginPage;

    @Override
    protected void initPages() {
        loginPage = new LINELoginWebPage();
    }

    @Given("^I navigated to LINE Business ID page$")
    public void navigatedToLINEBusinessIDPage() throws Throwable {
        loginPage.navigatedToLINEBusinessIDPage();
    }

    @When("^I click on Log in with LINE account button$")
    public void clickOnLogInWithLINEAccountButton() {
        loginPage.clickOnLogInWithLINEAccountButton();
    }

    @Then("^I navigated to LINE Login page$")
    public void navigatedToLINELoginPage() {
        loginPage.navigatedToLINELoginPage();
        Reporter.addStepLog("++++++++++++++I navigated to LINE Login page");
    }

    @And("^I fill email with LINE default email$")
    public void fillEmailWithLINEDefaultEmail() {
        loginPage.fillEmailWithLINEDefaultEmail();
    }

    @And("^I fill password with LINE default password$")
    public void fillPasswordWithLINEDefaultPassword() {
        loginPage.fillPasswordWithLINEDefaultPassword();
    }

    @Then("^I click on LINE Login button$")
    public void clickOnLINELoginButton() {
        loginPage.clickOnLINELoginButton();
    }

    @Given("^I navigated to LINE Official Account Manager$")
    public void navigatedToLINEOfficialAccountManager() {
        loginPage.navigatedToLINEOfficialAccountManager();
    }
}
