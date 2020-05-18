package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class EAUserFormPage extends AbstractPage {

    @FindBy(tagName = "h1")
    private WebElement pageHeaderTitle;

    @FindBy(name = "Save")
    private WebElement saveButton;

    public EAUserFormPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void seeUserFormPage() {
        logger.debug("Debugging User Form Page loadding");
        waitors.waitForVisibilityOf(pageHeaderTitle,"Page Header Title");
        Assert.assertTrue(pageHeaderTitle.isDisplayed(), "Expected Page Header Title is displayed");
    }

    public void seeDoneButton() {
        logger.debug("Debugging Done button");
        Assert.assertEquals(saveButton.getText(),"Done","Expect Button Done");
    }
}
