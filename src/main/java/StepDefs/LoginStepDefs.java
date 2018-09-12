package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by huy.huynh on 23/08/2018.
 */
public class LoginStepDefs extends BaseStepDefs {

    @Given("^I navigated to login page$")
    public void navigatedToLoginPage() throws Throwable {
        //        loginPage.navigatedToLoginPage();
        System.out.println("lalala1");
    }

    @When("^I fill User Name with \"([^\"]*)\"$")
    public void fillUserNameWith(String username) throws Throwable {
        System.out.println("lalala2");
    }

    @And("^I fill Password with \"([^\"]*)\"$")
    public void fillPasswordWith(String password) throws Throwable {
        System.out.println("lalala3");
    }

    @Then("^I say st$")
    public void saySt() throws Throwable {
        webDriver.get("http://www.google.com");
    }

}
