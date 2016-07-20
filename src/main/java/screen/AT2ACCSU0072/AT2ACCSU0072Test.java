package screen.AT2ACCSU0072;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * @author ajvirgili on 17/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCSU0072Test {

    protected AT2ACCSU0072Locators locators;
    protected AT2ACCSU0072Data data;

    public AT2ACCSU0072Test() {

    }

    public AT2ACCSU0072Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0072Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0072Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0072Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Hotel group maintenance 2.0");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {

        return false;
    }

}
