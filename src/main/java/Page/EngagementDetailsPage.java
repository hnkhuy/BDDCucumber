package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 21/09/2018.
 */
public class EngagementDetailsPage extends AbstractPage {

    @FindBy(tagName = "h1")
    private WebElement engagementNameTitle;

    @FindBy(xpath = "//a[text()='To-Dos']")
    private WebElement todosTab;

    @FindBy(xpath = "//div[text()='To-Dos']")
    private WebElement todosTitle;

    @FindBy(xpath = "//h3[@class='todoList-noTodos']")
    private WebElement noTodosLabel;

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void seeEngagementDetailPageOfEngagement(String engagementName) {
        Assert.assertEquals(engagementNameTitle.getText(), engagementName,
                "Expected Engagement page show with title: " + "" + engagementName);
    }

    public void clickOnToDosTab() {
        actions.clickElement(todosTab, "To-Dos tab");
    }

    public void seeToDosTitle() {
        actions.verifyElementExist(todosTitle, "To-dos Title");
    }

    public void seeNoToDosYetLabel() {
        actions.verifyElementExist(noTodosLabel, "No To-dos Label");
    }
}
