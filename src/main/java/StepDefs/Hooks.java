package StepDefs;

import Center.WebDriverCenter;
import Utilities.GeneralUtilities;
import Utilities.Loggger;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {
    private static Logger logger = Loggger.getLogger(Hooks.class);

    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        logger.info("--------------------Start Scenario \"" + scenario.getName() + "\"--------------------");
        WebDriverCenter.setupPrimaryWebDriver();
        if (scenario.getName().contains("hnkhuy")) {
            Reporter.assignAuthor("hnkhuy");
        } else if (scenario.getName().contains("huyhuynhz")) {
            Reporter.assignAuthor("huyhuynhz");
        } else if (scenario.getName().contains("andrew.huynh")) {
            Reporter.assignAuthor("AndrewHuynh");
        } else {
            Reporter.assignAuthor("Other");
        }
    }

    @After(order = 0)
    public void afterScenario() throws Exception {
        Thread.sleep(1000);
        WebDriverCenter.quitPrimaryWebDriver();
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_") + GeneralUtilities
                    .getTimeStampForNameSuffix();
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) WebDriverCenter.getPrimaryWebDriver())
                        .getScreenshotAs(OutputType.FILE);

                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                File destinationPath = new File(System.getProperty(
                        "user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

                //Copy taken screenshot from source location to destination location
                Files.copy(sourcePath, destinationPath);

                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
}
