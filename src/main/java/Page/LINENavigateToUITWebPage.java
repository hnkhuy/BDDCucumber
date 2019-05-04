package Page;

import Center.DriverCenter;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LINENavigateToUITWebPage extends AbstractMobilePage {

    @FindBy(id = "next")
    private WebElement startButton;

    @FindBy(linkText = "Start")
    private WebElement startButton2;

    @Override
    protected void setUpAppiumDriver() throws Exception {
        DriverCenter.setupPrimaryAppiumDriver();
    }

    @Override
    protected void initPageFactory() {
        PageFactory.initElements(appiumDriver, this);
    }

    public void openLineAppOnPrimaryDevice() throws Exception {
//        DriverCenter.startAppiumServer();
    }

    public void clickOnStartButtonOnWelcomeLINEApp() {
        waitors.waitSomeSeconds(5);
//        actions.clickElement(startButton2, "Start Button");

        MobileElement btn = (MobileElement) appiumDriver.findElement(By.id("jp.naver.line.android:id/next"));
        btn.click();

//        MobileElement head = (MobileElement) webDriver.findElement(By.id("jp.naver.line.android:id/header"));
//        System.out.println("head.gett = " + head.getText());

    }
}
