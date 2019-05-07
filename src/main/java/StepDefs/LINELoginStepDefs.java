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

    @When("^I log in to LINE CMS with default account$")
    public void logInToLINECMSWithDefaultAccount() {
        loginPage.navigatedToLINELoginPage();
        Reporter.addStepLog("+++++I navigated to LINE Login page");
        loginPage.logInWithDefaultAccount();
    }

    @Given("^I navigated to LINE Official Account Manager$")
    public void navigatedToLINEOfficialAccountManager() {
        loginPage.navigatedToLINEOfficialAccountManager();
    }
}
