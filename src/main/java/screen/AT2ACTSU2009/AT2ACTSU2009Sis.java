package screen.AT2ACTSU2009;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2ACTSU2009Sis {
    protected AT2ACTSU2009Locators locators;
    protected AT2ACTSU2009Data data;

    public AT2ACTSU2009Sis() {

    }
    public AT2ACTSU2009Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACTSU2009Locators locators) {
        this.locators = locators;
    }
    public AT2ACTSU2009Data getData() {
        return data;
    }
    public void setData(AT2ACTSU2009Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Activities");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Foursquare Mappings");
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
