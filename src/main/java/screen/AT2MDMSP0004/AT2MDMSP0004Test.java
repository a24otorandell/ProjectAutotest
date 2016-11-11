package screen.AT2MDMSP0004;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0004Test {
    protected AT2MDMSP0004Locators locators;
    protected AT2MDMSP0004Data data;
    public AT2MDMSP0004Test() {
    }
    public AT2MDMSP0004Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0004Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0004Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0004Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("Supplier by office");
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
