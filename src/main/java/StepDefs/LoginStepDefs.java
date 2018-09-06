package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by huy.huynh on 23/08/2018.
 */
public class LoginStepDefs {

    //    private LoginPage loginPage = new LoginPage();

    @Given("^I navigated to login page$")
    public void navigatedToLoginPage() throws Throwable {
        //        loginPage.navigatedToLoginPage();
        System.out.println("lalala");
    }

    @When("^I fill User Name with \"([^\"]*)\"$")
    public void fillUserNameWith(String username) throws Throwable {
        System.out.println("lalala");
    }

    @And("^I fill Password with \"([^\"]*)\"$")
    public void fillPasswordWith(String password) throws Throwable {
        System.out.println("lalala");
    }

    public WebDriver webDriver;

    @Then("^I say st$")
    public void iSaySt() throws Throwable {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        System.out.println(System.getProperty("user.dir") + "\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
    }
}
