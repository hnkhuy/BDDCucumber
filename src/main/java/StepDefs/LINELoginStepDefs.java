package StepDefs;

import Page.LINELoginPage;
import cucumber.api.java.en.Given;


public class LINELoginStepDefs extends AbstractStepDefs {

    private LINELoginPage loginPage;

    @Override
    protected void initPages() {
        loginPage = new LINELoginPage();
    }

    @Given("^I navigated to LINE Business ID page$")
    public void navigatedToLINEBusinessIDPage() throws Throwable {
        loginPage.navigatedToLINEBusinessIDPage();
    }
}
