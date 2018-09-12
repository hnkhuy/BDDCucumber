package StepDefs.demo;

import Page.demo.GoogleLoginPage;
import StepDefs.BaseStepDefs;

/**
 * Created by huy.huynh on 12/09/2018.
 */
public class GoogleLoginStepDef extends BaseStepDefs {

    private GoogleLoginPage googleLoginPage;

    public GoogleLoginStepDef() {
        googleLoginPage = new GoogleLoginPage(webDriver);
    }

}
