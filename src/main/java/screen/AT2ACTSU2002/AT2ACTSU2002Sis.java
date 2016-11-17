package screen.AT2ACTSU2002;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2ACTSU2002Sis {
    protected AT2ACTSU2002Locators locators;
    protected AT2ACTSU2002Data data;

    public AT2ACTSU2002Sis() {

    }
    public AT2ACTSU2002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACTSU2002Locators locators) {
        this.locators = locators;
    }
    public AT2ACTSU2002Data getData() {
        return data;
    }
    public void setData(AT2ACTSU2002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Activities");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Voucher Roles");
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
