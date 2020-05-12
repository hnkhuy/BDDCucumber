package StepDefs;

import Page.EALoginPage;
import Page.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EALoginStepDefs extends AbstractStepDefs {
    private EALoginPage loginPage;

    @Override
    protected void initPages() {
        loginPage=new EALoginPage(webDriver);
    }

    @Given("^I navigated to EA Login page$")
    public void iNavigatedToEALoginPage() {
        loginPage.navigatedToLoginPage();
    }

    @When("^I fill email and password$")
    public void iFillEmailAndPassword() {
        loginPage.fillEmailAndPassword();
    }

    @And("^I click on EA Login button$")
    public void iClickOnEALoginButton() {
        loginPage.clickOnLoginButton();
    }
}
