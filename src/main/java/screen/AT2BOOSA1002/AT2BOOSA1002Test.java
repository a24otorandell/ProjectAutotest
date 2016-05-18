package screen.AT2BOOSA1002;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Test {
    protected AT2BOOSA1002Locators locators;
    protected AT2BOOSA1002Data data;

    public AT2BOOSA1002Test() {
    }
    public AT2BOOSA1002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2BOOSA1002Locators locators) {
        this.locators = locators;
    }
    public AT2BOOSA1002Data getData() {
        return data;
    }
    public void setData(AT2BOOSA1002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BOOKINGS");
        driver.getTestdetails().setSubmenu("SALE");
        driver.getTestdetails().setScreen("Bookings Maintenance");
    }
    protected String getElements(String key){
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData(String key){
        String value = this.data.getData().get(key);
        return value;
    }
    protected boolean testCSED(TestDriver driver) {
        return false;
    }
}
