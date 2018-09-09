package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Created by huy.huynh on 23/08/2018.
 */
public class LoginStepDefs {

    //    private LoginPage loginPage = new LoginPage();

    @Given("^I navigated to login page$")
    public void navigatedToLoginPage() throws Throwable {
        //        loginPage.navigatedToLoginPage();
        System.out.println("lalala1");
    }

    @When("^I fill User Name with \"([^\"]*)\"$")
    public void fillUserNameWith(String username) throws Throwable {
        System.out.println("lalala2");
    }

    @And("^I fill Password with \"([^\"]*)\"$")
    public void fillPasswordWith(String password) throws Throwable {
        System.out.println("lalala3");
    }

    public WebDriver webDriver;

    @Then("^I say st$")
    public void saySt() throws Throwable {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        webDriver = new ChromeDriver(options);

        webDriver.get("http://www.google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.quit();
    }
}
