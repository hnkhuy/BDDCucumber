package Runner;

import Center.WebDriverCenter;
import Utilities.PropertiesFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by huy.huynh on 13/09/2018.
 */

@CucumberOptions(features = "src/main/resources/features/", glue = {"StepDefs"})
public class DevelopingTestRunner extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void setupSomething() throws Exception {
//        WebDriverCenter.setupPrimaryWebDriver();
        PropertiesFileReader.openFileProperty();
    }

    @AfterTest
    public void tearDownTest() {
//        WebDriverCenter.quitAllDriver();
        PropertiesFileReader.closePropertiesFileInputStream();
    }
}
