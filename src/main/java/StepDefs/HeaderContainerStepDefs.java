package StepDefs;

import Page.HeaderContainerPage;
import cucumber.api.java.en.Then;

public class HeaderContainerStepDefs extends AbstractStepDefs {

    private HeaderContainerPage headerContainerPage;

    @Override
    protected void initPages() {
        headerContainerPage = new HeaderContainerPage();
    }

    @Then("^I click on Contacts Page link$")
    public void clickOnContactsPageLink() throws Throwable {
        headerContainerPage.clickOnContactsPageLink();
    }


}
