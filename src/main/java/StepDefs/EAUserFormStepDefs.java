package StepDefs;

import Page.EAUserFormPage;
import cucumber.api.java.en.Then;

public class EAUserFormStepDefs extends AbstractStepDefs {
    EAUserFormPage userFormPage;

    @Override
    protected void initPages() {
        userFormPage= new EAUserFormPage(webDriver);
    }

    @Then("^I can see User Form page$")
    public void iCanSeeUserFormPage() {
        userFormPage.seeUserFormPage();
    }

    @Then("^I can see Done button$")
    public void iCanSeeDoneButton() {
        userFormPage.seeDoneButton();
    }
}
