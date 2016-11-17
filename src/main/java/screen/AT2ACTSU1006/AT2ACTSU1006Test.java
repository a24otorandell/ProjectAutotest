package screen.AT2ACTSU1006;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2ACTSU1006Test {
    protected AT2ACTSU1006Locators locators;
    protected AT2ACTSU1006Data data;

    public AT2ACTSU1006Test() {
    }
    public AT2ACTSU1006Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACTSU1006Locators locators) {
        this.locators = locators;
    }
    public AT2ACTSU1006Data getData() {
        return data;
    }
    public void setData(AT2ACTSU1006Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Activities");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("SUPINT - Integrations Cancellation Policies Setup");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        CommonProcedures.styleGuide(driver);
        return false;
    }
}
