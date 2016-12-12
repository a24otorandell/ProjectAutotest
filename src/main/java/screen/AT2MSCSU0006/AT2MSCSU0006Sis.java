package screen.AT2MSCSU0006;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by icastaneira on 12/12/2016.
 */
public class AT2MSCSU0006Sis {

    protected AT2MSCSU0006Locators locators;
    protected AT2MSCSU0006Data data;
    public AT2MSCSU0006Sis(String enviroment) {
        setLocators(new AT2MSCSU0006Locators(enviroment));
        setData(new AT2MSCSU0006Data(enviroment));
    }

    public AT2MSCSU0006Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MSCSU0006Locators locators) {
        this.locators = locators;
    }

    public AT2MSCSU0006Data getData() {
        return data;
    }

    public void setData(AT2MSCSU0006Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Miscellaneous");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("AT2MSCSU0006");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //TAB01

        /*if () {
            return false;
        }*/

        return true;
    }
}
