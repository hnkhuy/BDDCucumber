package Page;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.support.PageFactory;

public class LINELoginPage extends AbstractPage {
    @Override
    protected void initPageFactory() {
        PageFactory.initElements(webDriver, this);
    }

    public void navigatedToLINEBusinessIDPage() {
        webDriver.get(PropertiesFileReader.getProperty("url"));
        logger.info("Navigated to LINE Business ID page");
    }
}
