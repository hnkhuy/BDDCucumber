package Page.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleSearchPage {

    private WebDriver webDriver;

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

    public GoogleSearchPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatedToGoogleSeachPage() {
        webDriver.get("http://www.google.com");
    }

    public void fillSearchContentToSeachBox(String searchContent) {
        searchTextbox.sendKeys(searchContent);
    }

    public void clickToSearchButton() {
        googleLogo.click();
        searchButton.click();
    }

    public void searchResultPageShowed() {
        Assert.assertTrue(resultCounterBar.isDisplayed(), "Result Counter Bar not showed");
    }
}
