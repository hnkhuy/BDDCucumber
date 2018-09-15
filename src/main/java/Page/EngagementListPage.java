package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class EngagementListPage extends AbstractPage {

    @FindBy(className = "pageHeader-title")
    private WebElement pageHeaderTitle;

    public EngagementListPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void seeEngagementListPage() {
        logger.debug("Debugging Engagement List Page loadding");
        Assert.assertTrue(pageHeaderTitle.isDisplayed(), "Expected Page Header Title is displayed");
    }
}
