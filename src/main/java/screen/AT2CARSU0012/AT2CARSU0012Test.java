package screen.AT2CARSU0012;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2CARSU0012Test {
    protected AT2CARSU0012Locators locators;
    protected AT2CARSU0012Data data;

    public AT2CARSU0012Test() {
    }
    public AT2CARSU0012Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0012Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0012Data getData() {
        return data;
    }
    public void setData(AT2CARSU0012Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Car Hire");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Language Mapping");
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
