package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactsWebPage extends AbstractWebPage {

    @FindBy(id = "c-header-title")
    private WebElement pageHeaderTitle;

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void seeContactsPage() {
        waitors.waitForVisibilityOf(pageHeaderTitle, "Page Header Title");
        Assert.assertTrue(pageHeaderTitle.isDisplayed(), "Expected Page Header Title is displayed");
    }
}
