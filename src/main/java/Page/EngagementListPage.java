package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class EngagementListPage extends AbstractPage {

    @FindBy(className = "pageHeader-title")
    private WebElement pageHeaderTitle;

    @FindBy(xpath = "//div[contains(@class,'engagement-name')]")
    private List<WebElement> engagementNameList;

    public EngagementListPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void seeEngagementListPage() {
        logger.debug("Debugging Engagement List Page loadding");
        waitors.waitForVisibilityOf(pageHeaderTitle, "Page Header Title");
        Assert.assertTrue(pageHeaderTitle.isDisplayed(), "Expected Page Header Title is displayed");
    }

    public void clickOnEngagementNamed(String engagementName) {
        engagementNameList.stream().filter(engagement -> engagement.getText().equals(engagementName))
                .forEach(WebElement::click);
    }
}
