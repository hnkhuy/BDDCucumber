package Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by huy.huynh on 13/09/2018.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/main/resources/features/"/*, glue = {"StepDefs"}*/)
public class SerenityDevelopingTestRunner {
/*    @BeforeTest
    public void setupSomething() throws Exception {
//        WebDriverCenter.setupPrimaryWebDriver();
        PropertiesFileReader.openFileProperty();
    }

    @AfterTest
    public void tearDownTest() {
//        WebDriverCenter.quitAllDriver();
        PropertiesFileReader.closePropertiesFileInputStream();
    }*/
}
