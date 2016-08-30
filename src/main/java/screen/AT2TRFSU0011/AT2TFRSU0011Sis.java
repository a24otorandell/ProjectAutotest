package screen.AT2TRFSU0011;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;
import screen.AT2ACTSU0037.AT2ACTSU0037Data;
import screen.AT2ACTSU0037.AT2ACTSU0037Locators;

/**
 * Created by vsolis on 29/08/2016.
 */
public class AT2TFRSU0011Sis {

    protected AT2TFRSU0011Locators locators;
    protected AT2TFRSU0011Data data;

    public AT2TFRSU0011Sis() {
    }

    public AT2TFRSU0011Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TFRSU0011Locators locators) {
        this.locators = locators;
    }

    public AT2TFRSU0011Data getData() {
        return data;
    }

    public void setData(AT2TFRSU0011Data data) {
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
        System.out.println("SIS");
        return false;
    }
}
