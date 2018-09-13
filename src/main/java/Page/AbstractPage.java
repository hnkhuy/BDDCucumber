package Page;

import Utilities.Actions;
import org.openqa.selenium.WebDriver;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public abstract class AbstractPage {
    protected static WebDriver webDriver;
    protected static Actions actions = new Actions();
}
