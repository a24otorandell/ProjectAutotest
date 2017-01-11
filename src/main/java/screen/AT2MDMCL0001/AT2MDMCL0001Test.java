package screen.AT2MDMCL0001;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by acarrillo on 11/01/2017.
 */
public class AT2MDMCL0001Test {
    protected AT2MDMCL0001Locators locators;
    protected AT2MDMCL0001Data data;

    public AT2MDMCL0001Test() {
    }
    public AT2MDMCL0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0001Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0001Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("MDM");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen("Client Managment");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {

        return true;
    }
}
