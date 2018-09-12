package Page.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleLoginPage {

    private WebDriver webDriver;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailTextbox;

    @FindBy(xpath = "//div[@id='identifierNext']/content/span")
    private WebElement emailNextButton;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement passwordTextbox;

    @FindBy(name = "//div[@id='passwordNext']/content/span")
    private WebElement passwordNextButton;

    @FindBy(id = "//div[@id='password']/div/div[@aria-atomic]")
    private WebElement passwordErrorMessage;

    public GoogleLoginPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }


}
