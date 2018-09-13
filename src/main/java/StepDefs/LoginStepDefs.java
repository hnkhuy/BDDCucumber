package StepDefs;

import Page.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


/**
 * Created by huy.huynh on 23/08/2018.
 */
public class LoginStepDefs extends AbstractStepDefs {

    private LoginPage loginPage;


    @Override
    protected void initPages() {
        loginPage= new LoginPage(webDriver);
    }

    @Given("^I navigated to Login page$")
    public void navigatedToLoginPage() throws Throwable {
        loginPage.navigatedToLoginPage();
    }

    @When("^I fill email with default email$")
    public void fillEmailWithDefaultEmail() throws Throwable {
        loginPage.fillEmailWithDefaultEmail();
    }

    @And("^I fill password with default password$")
    public void fillPasswordWithDefaultPassword() throws Throwable {
        loginPage.fillPasswordWithDefaultPassword();
    }

    @And("^I click on Login button$")
    public void clickOnLoginButton() throws Throwable {
        loginPage.clickOnLoginButton();
    }

}
