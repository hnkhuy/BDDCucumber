package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderContainerWebPage extends AbstractWebPage {

    @FindBy(id = "h-clientListLink")
    private WebElement contactsPageLink;

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnContactsPageLink() {
        actions.clickElement(contactsPageLink, "Contacts Page Link");
    }
}
