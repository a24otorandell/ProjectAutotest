package screen.AT2MDMSP0037;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * @author ajvirgili on 17/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2MDMSP0037Test {
    protected AT2MDMSP0037Locators locators;
    protected AT2MDMSP0037Data data;
    public AT2MDMSP0037Test() {
    }
    public AT2MDMSP0037Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0037Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0037Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0037Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Suppliers B2B 2.0");
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
