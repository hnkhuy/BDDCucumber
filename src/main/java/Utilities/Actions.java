package Utilities;

import org.openqa.selenium.WebElement;

/**
 * Created by huy.huynh on 13/09/2018.
 */
public class Actions {
    public void clickElement(WebElement element, String elementName) {
        System.out.println("Click on element: " + elementName);
        element.click();
    }

    public void sendKeyElement(WebElement element, String value, String elementName) {
        System.out.println("Sendkey value: " + value + " to element: " + elementName);
        element.sendKeys(value);
    }
}
