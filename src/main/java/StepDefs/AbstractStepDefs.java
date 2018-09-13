package StepDefs;

import Center.WebDriverCenter;
import org.openqa.selenium.WebDriver;

/**
 * Created by huy.huynh on 11/09/2018.
 */
public abstract class AbstractStepDefs {
    public WebDriver webDriver;

    public AbstractStepDefs() {
        try {
            webDriver = WebDriverCenter.getPrimaryWebDriver();
        } catch (Exception e) {
            //Let setup driver type on @BeforeTest
            e.printStackTrace();
        }
        initPages();
    }

    protected abstract void initPages();
}
