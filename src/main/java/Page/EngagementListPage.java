package Page;

import Utilities.Static;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class EngagementListPage extends AbstractPage {

    @FindBy(className = "pageHeader-title")
    private WebElement pageHeaderTitle;

    @FindBy(xpath = "//div[contains(@class,'engagement-name')]")
    private List<WebElement> engagementNameList;

    @FindBy(xpath = "//button[contains(@class,'newAuditBtn')]")
    private WebElement createEngagementButton;

    private String engagementRowByNameXpath = "//div[contains(@class,'engagement-name')][text()='%s']/ancestor::tr";
    private String statusByAncestorXpath = ".//span[contains(@class,'status')]";


    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
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

    public void seeCreateEngagementButton() {
        waitors.waitForVisibilityOf(createEngagementButton, "Create Engagement Button");
        Assert.assertTrue(createEngagementButton.isDisplayed(), "Expected Create Engagement Button is displayed");
    }

    public void seeTextOfCreateEngagementButton(String buttonText) {
        Assert.assertEquals(actions.getText(createEngagementButton, "Create Engagement Button"), buttonText,
                "Expected Create Engagement Button text equal " + buttonText);
    }

    public void seeTextColorOfCreateEngagementButtonIsWhite() {
        Assert.assertEquals(createEngagementButton.getCssValue("color"), Static.WHITE_COLOR_CODE,
                "Expected Create Engagement Button color equal " + Static.WHITE_COLOR_CODE);
    }

    public void seeEngagementAndItsStatus(Map<String, String> rowMap) {
        WebElement thisRow = actions.getElementByXpath(engagementRowByNameXpath, rowMap.get("EngagementName"));
        WebElement status = actions.getChildElementByXpath(thisRow, statusByAncestorXpath);
        Assert.assertEquals(actions.getText(status, "Status of engagement"), rowMap.get("Status"),
                "Expected status of engagement " + rowMap.get("EngagementName") + " equal " + rowMap.get("Status"));
    }
}
