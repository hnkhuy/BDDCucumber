package Runner;

import Center.WebDriverCenter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by huy.huynh on 23/08/2018.
 */
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/", glue = {"StepDefs"})
public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void setupSomething() {
        WebDriverCenter.setupPrimaryWebDriver();
    }

    @AfterTest
    public void tearDownTest() {
        WebDriverCenter.quitAllDriver();
    }
}
