package StepDefs;

import Page.EADragPage;
import cucumber.api.java.en.Then;

public class EADragnDropStepDefs extends AbstractStepDefs {
    EADragPage eaDragPage;

    @Override
    protected void initPages() {
        eaDragPage= new EADragPage(webDriver);
    }

    @Then("^I can see Dragging and Sorting tab$")
    public void iCanSeeDoneButton() {
        eaDragPage.seeDragTab();
    }
}
