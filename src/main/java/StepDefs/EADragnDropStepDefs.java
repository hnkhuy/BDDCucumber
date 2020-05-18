package StepDefs;

import Page.EADragPage;
import cucumber.api.java.en.Then;

public class EADragnDropStepDefs extends AbstractStepDefs {
    EADragPage eaDragPage;

    @Override
    protected void initPages() {
        eaDragPage= new EADragPage(webDriver);
    }

    @Then("^I click on Dragging and Sorting tab$")
    public void iCanSeeUserFormPage() {
        eaDragPage.clickOnDragTab();
    }

    @Then("^I can see Dragging and Sorting page$")
    public void iCanSeeDoneButton() {
        eaDragPage.seeDragPage();
    }
}
