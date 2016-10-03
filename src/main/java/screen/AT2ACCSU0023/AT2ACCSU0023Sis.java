package screen.AT2ACCSU0023;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 21/09/2016.
 */
public class AT2ACCSU0023Sis {
    protected AT2ACCSU0023Locators locators;
    protected AT2ACCSU0023Data data;

    public AT2ACCSU0023Sis() {

    }

    public AT2ACCSU0023Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0023Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0023Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0023Data data) {
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
