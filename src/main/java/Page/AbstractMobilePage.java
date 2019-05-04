package Page;

import Utilities.Actions;
import Utilities.Loggger;
import Utilities.Waitors;
import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.Logger;

import static Center.DriverCenter.getPrimaryAppiumDriver;
import static Center.DriverCenter.getPrimaryWebDriverStatus;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public abstract class AbstractMobilePage {
    protected static AppiumDriver appiumDriver;
    protected Logger logger = Loggger.getLogger(this.getClass());
    protected static Actions actions;
    protected static Waitors waitors;

    public AbstractMobilePage() {
        if (getPrimaryWebDriverStatus()) {
            try {
                setUpAppiumDriver();
                appiumDriver = getPrimaryAppiumDriver();
                waitors = new Waitors(appiumDriver);
                actions = new Actions(appiumDriver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        initPageFactory();
    }

    protected abstract void setUpAppiumDriver() throws Exception;

    protected abstract void initPageFactory();
}
