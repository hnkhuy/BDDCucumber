package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


/**
 * Created by huy.huynh on 23/08/2018.
 */
public class StepDefs {

    @Given("^I navigated to login page$")
    public void navigatedToLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I fill User Name with \"([^\"]*)\"$")
    public void fillUserNameWith(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I fill Password with \"([^\"]*)\"$")
    public void fillPasswordWith(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
