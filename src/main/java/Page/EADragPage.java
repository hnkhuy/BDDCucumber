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

    @FindBy(xpath = "//span[text()='Drag and Drop']")
    private WebElement dragTab;

    public EADragPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void seeDragTab() {
        logger.debug("Debugging Drag tab");
        waitors.waitForVisibilityOf(dragTab,"Drag tab");
        Assert.assertTrue(dragTab.isDisplayed(), "Expected Drag tab is displayed");
    }
}
