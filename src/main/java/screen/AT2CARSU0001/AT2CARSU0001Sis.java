package screen.AT2CARSU0001;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2CARSU0001Sis {
    protected AT2CARSU0001Locators locators;
    protected AT2CARSU0001Data data;

    public AT2CARSU0001Sis() {

    }
    public AT2CARSU0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0001Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0001Data getData() {
        return data;
    }
    public void setData(AT2CARSU0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Car Hire");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Offices Carhire Master Maintenance");
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
