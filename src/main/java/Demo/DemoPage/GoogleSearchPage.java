package Demo.DemoPage;

import Page.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleSearchPage extends AbstractPage {

    @FindBy(id = "lst-ib")
    private WebElement searchTextbox;

    @FindBy(id = "hplogo")
    private WebElement googleLogo;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(id = "gb_70")
    private WebElement loginButton;

    @FindBy(id = "resultStats")
    private WebElement resultCounterBar;

    public GoogleSearchPage() {
        PageFactory.initElements(webDriver, this);
    }

    public void navigatedToGoogleSeachPage() {
        webDriver.get("http://www.google.com");
    }

    public void fillSearchContentToSeachBox(String searchContent) {
        actions.sendKeyElement(searchTextbox, searchContent, "Search Textbox");
    }

    public void clickToSearchButton() {
        actions.clickElement(googleLogo, "Google Logo");
        actions.clickElement(searchButton, "Search Button");
    }

    public void searchResultPageShowed() {
        waitors.waitForVisibilityOf(resultCounterBar, "Result Counter Bar");
        Assert.assertTrue(resultCounterBar.isDisplayed(), "Result Counter Bar not showed");
    }
}
