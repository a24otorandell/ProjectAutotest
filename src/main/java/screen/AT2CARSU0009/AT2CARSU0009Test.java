package screen.AT2CARSU0009;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 22/11/2016.
 */
public class AT2CARSU0009Test {
    protected AT2CARSU0009Locators locators;
    protected AT2CARSU0009Data data;

    public AT2CARSU0009Test() {
    }
    public AT2CARSU0009Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0009Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0009Data getData() {
        return data;
    }
    public void setData(AT2CARSU0009Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Car Hire");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Extras Carhire Mapping Maintenance");
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
