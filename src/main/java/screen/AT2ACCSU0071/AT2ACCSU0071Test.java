package screen.AT2ACCSU0071;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * @author ajvirgili on 19/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCSU0071Test {

    protected AT2ACCSU0071Locators locators;
    protected AT2ACCSU0071Data data;

    public AT2ACCSU0071Test(String enviroment) {
        setData(new AT2ACCSU0071Data(enviroment));
        setLocators(new AT2ACCSU0071Locators(enviroment));
    }

    public AT2ACCSU0071Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0071Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0071Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0071Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Board Mapping B2B 2.0");
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
