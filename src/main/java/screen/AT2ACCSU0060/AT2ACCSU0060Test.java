package screen.AT2ACCSU0060;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 16/11/2016.
 */
public class AT2ACCSU0060Test {
    protected AT2ACCSU0060Locators locators;
    protected AT2ACCSU0060Data data;
    public AT2ACCSU0060Test() {
    }
    public AT2ACCSU0060Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0060Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0060Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0060Data data) {
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
