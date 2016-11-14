package screen.AT2ACCCM0001;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2ACCCM0001Sis {
    protected AT2ACCCM0001Locators locators;
    protected AT2ACCCM0001Data data;
    public AT2ACCCM0001Sis() {
    }
    public AT2ACCCM0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCCM0001Locators locators) {
        this.locators = locators;
    }
    public AT2ACCCM0001Data getData() {
        return data;
    }
    public void setData(AT2ACCCM0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("Supplier Management");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        CommonProcedures.styleGuide(driver);
        return true;
    }
}
