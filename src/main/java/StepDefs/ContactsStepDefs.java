package StepDefs;

import Page.ContactsPage;
import cucumber.api.java.en.And;

public class ContactsStepDefs extends AbstractStepDefs {

    private ContactsPage contactsPage;

    @Override
    protected void initPages() {
        contactsPage = new ContactsPage();
    }

    @And("^I can see Contacts Page$")
    public void seeContactsPage() throws Throwable {
        contactsPage.seeContactsPage();
    }
}
