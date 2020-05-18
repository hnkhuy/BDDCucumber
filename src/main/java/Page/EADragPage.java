package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class EADragPage extends AbstractPage {

    @FindBy(id = "draggable")
    private WebElement pageTitle;

    @FindBy(xpath = "//span[text()='Drag and Drop']")
    private WebElement dragTab;

    public EADragPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnDragTab() {
        actions.clickElement(dragTab,"Drag tab");
    }

    public void seeDragPage() {
        logger.debug("Debugging Drag Page loadding");
        waitors.waitForVisibilityOf(pageTitle,"Page Title");
        Assert.assertTrue(pageTitle.isDisplayed(), "Expected Page Header Title is displayed");
    }
}
