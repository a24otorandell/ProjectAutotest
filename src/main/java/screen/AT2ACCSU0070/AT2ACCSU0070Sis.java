package screen.AT2ACCSU0070;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * @author ajvirgili on 19/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCSU0070Sis {

    protected AT2ACCSU0070Locators locators;
    protected AT2ACCSU0070Data data;

    public AT2ACCSU0070Sis(String enviroment) {
        setData(new AT2ACCSU0070Data(enviroment));
        setLocators(new AT2ACCSU0070Locators(enviroment));
    }

    public AT2ACCSU0070Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0070Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0070Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0070Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("");
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
