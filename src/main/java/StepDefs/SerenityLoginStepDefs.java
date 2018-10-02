package StepDefs;

import StepDefs.SerenityStep.SerenityLoginSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


/**
 * Created by huy.huynh on 23/08/2018.
 */
public class SerenityLoginStepDefs{

    @Steps
    SerenityLoginSteps serenityLoginSteps;

    @Given("^Sere I navigated to Login page$")
    public void navigatedToLoginPage() throws Throwable {
        serenityLoginSteps.navigatedToLoginPage();
    }

    @When("^Sere I fill email with default email$")
    public void fillEmailWithDefaultEmail() throws Throwable {
        serenityLoginSteps.fillEmailWithDefaultEmail();
    }

    @And("^Sere I fill password with default password$")
    public void fillPasswordWithDefaultPassword() throws Throwable {
        serenityLoginSteps.fillPasswordWithDefaultPassword();
    }

    @And("^Sere I click on Login button$")
    public void clickOnLoginButton() throws Throwable {
        serenityLoginSteps.clickOnLoginButton();
    }

}
