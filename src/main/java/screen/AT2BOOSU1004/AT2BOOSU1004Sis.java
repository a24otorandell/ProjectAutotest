package screen.AT2BOOSU1004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 05/10/2016.
 */
public class AT2BOOSU1004Sis {
    protected AT2BOOSU1004Locators locators;
    protected AT2BOOSU1004Data data;

    public AT2BOOSU1004Sis() {

    }

    public AT2BOOSU1004Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSU1004Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSU1004Data getData() {
        return data;
    }

    public void setData(AT2BOOSU1004Data data) {
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

