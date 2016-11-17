package screen.AT2CARSU0002;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2CARSU0002Test {
    protected AT2CARSU0002Locators locators;
    protected AT2CARSU0002Data data;

    public AT2CARSU0002Test() {
    }
    public AT2CARSU0002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0002Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0002Data getData() {
        return data;
    }
    public void setData(AT2CARSU0002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Car Hire");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Rates Carhire Master Maintenance");
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
