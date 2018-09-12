package StepDefs;

import Center.WebDriverCenter;
import org.openqa.selenium.WebDriver;

/**
 * Created by huy.huynh on 11/09/2018.
 */
public class BaseStepDefs {
    public WebDriver webDriver;

    public BaseStepDefs() {
        try {
            webDriver = WebDriverCenter.getPrimaryWebDriver();
        } catch (Exception e) {
            //Let setup driver type on @BeforeTest
            e.printStackTrace();
        }
    }
}
