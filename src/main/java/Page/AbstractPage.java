package Page;

import Center.WebDriverCenter;
import Utilities.Actions;
import Utilities.Loggger;
import Utilities.Waitors;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public abstract class AbstractPage {
    protected static WebDriver webDriver;
    protected Logger logger = Loggger.getLogger(this.getClass());
    protected static Actions actions;
    protected static Waitors waitors;

    public AbstractPage() {
        if (webDriver == null) {
            try {
                webDriver = WebDriverCenter.getPrimaryWebDriver();
                waitors = new Waitors(webDriver);
                actions = new Actions(webDriver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
