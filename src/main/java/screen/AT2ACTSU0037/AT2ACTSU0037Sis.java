package screen.AT2ACTSU0037;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by acarrillo on 10/08/2016.
 */
public class AT2ACTSU0037Sis {
    protected AT2ACTSU0037Locators locators;
    protected AT2ACTSU0037Data data;

    public AT2ACTSU0037Sis() {
    }

    public AT2ACTSU0037Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACTSU0037Locators locators) {
        this.locators = locators;
    }

    public AT2ACTSU0037Data getData() {
        return data;
    }

    public void setData(AT2ACTSU0037Data data) {
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
