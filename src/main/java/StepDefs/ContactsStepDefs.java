package StepDefs;

import Page.ContactsWebPage;
import cucumber.api.java.en.And;

public class ContactsStepDefs extends AbstractStepDefs {

    private ContactsWebPage contactsPage;

    @Override
    protected void initPages() {
        contactsPage = new ContactsWebPage();
    }

    @And("^I can see Contacts Page$")
    public void seeContactsPage() throws Throwable {
        contactsPage.seeContactsPage();
    }
}
