package screen.AT2MDMSP0026;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0026Test {
    protected AT2MDMSP0026Locators locators;
    protected AT2MDMSP0026Data data;
    public AT2MDMSP0026Test() {
    }
    public AT2MDMSP0026Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0026Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0026Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0026Data data) {
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
