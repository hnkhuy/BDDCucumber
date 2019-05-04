package Runner;

import Demo.DemoUtilities.DemoPropertiesFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by huy.huynh on 23/08/2018.
 */
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Demo/DemoFeatures/", glue = {"Demo.DemoStepDefs"})
public class DemoTestRunner extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void setupSomething() throws Exception {
//        DriverCenter.setupPrimaryWebDriver();
        DemoPropertiesFileReader.openFileProperty();
    }

    @AfterTest
    public void tearDownTest() {
//        DriverCenter.quitAllDriver();
        DemoPropertiesFileReader.closePropertiesFileInputStream();
    }
}
