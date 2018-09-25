package StepDefs;

import Center.WebDriverCenter;
import Utilities.Loggger;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.logging.log4j.Logger;

public class Hooks {
    private static Logger logger = Loggger.getLogger(Hooks.class);

    @Before
    public void beforeScenario(Scenario scenario) {
        logger.info("--------------------Start Scenario \"" + scenario.getName() + "\"--------------------");
        WebDriverCenter.setupPrimaryWebDriver();
    }

    @After
    public void afterScenario() throws Exception {
        WebDriverCenter.quitPrimaryWebDriver();
    }
}
