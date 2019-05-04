package StepDefs;

import Page.HeaderContainerWebPage;
import cucumber.api.java.en.Then;

public class HeaderContainerStepDefs extends AbstractStepDefs {

    private HeaderContainerWebPage headerContainerPage;

    @Override
    protected void initPages() {
        headerContainerPage = new HeaderContainerWebPage();
    }

    @Then("^I click on Contacts Page link$")
    public void clickOnContactsPageLink() throws Throwable {
        headerContainerPage.clickOnContactsPageLink();
    }


}
