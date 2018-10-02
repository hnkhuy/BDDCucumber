package StepDefs.SerenityStep;

import Page.SerenityLoginPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by huy.huynh on 01/10/2018.
 */
public class SerenityLoginSteps {
    SerenityLoginPage serenityLoginPage;

    @Step
    public void navigatedToLoginPage() {
        serenityLoginPage.open();
    }

    @Step
    public void fillEmailWithDefaultEmail() {
        serenityLoginPage.fillEmailWithDefaultEmail();
    }

    @Step
    public void fillPasswordWithDefaultPassword() {
        serenityLoginPage.fillPasswordWithDefaultPassword();
    }

    @Step
    public void clickOnLoginButton() {
        serenityLoginPage.clickOnLoginButton();
    }
}
