package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by huy.huynh on 23/08/2018.
 */
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/Login.feature", glue = {"StepDefs"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
