package screen.AT2ACCSU0073;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 06/10/2016.
 */
public class AT2ACCSU0073Sis {
    protected AT2ACCSU0073Locators locators;
    protected AT2ACCSU0073Data data;

    public AT2ACCSU0073Sis() {

    }

    public AT2ACCSU0073Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0073Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0073Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0073Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("TTOO Quality Groups");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {


        return false;
    }
}
