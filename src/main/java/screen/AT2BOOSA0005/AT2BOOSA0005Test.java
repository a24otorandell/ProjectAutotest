package screen.AT2BOOSA0005;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by icastaneira on 17/05/2016.
 */
public class AT2BOOSA0005Test {

    protected AT2BOOSA0005Locators locators;
    protected AT2BOOSA0005Data data;

    public AT2BOOSA0005Test() {

    }

    public AT2BOOSA0005Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSA0005Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSA0005Data getData() {
        return data;
    }

    public void setData(AT2BOOSA0005Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        driver.getTestdetails().setScreen("AT2BOOSA1002");
        CommonProcedures.goToScreen(driver);
        driver.getTestdetails().setScreen("AT2BOOSA0005");
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Bookings");
        driver.getTestdetails().setSubmenu("Sales");
        driver.getTestdetails().setScreen("Occupancy Graphic 2.0");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(final TestDriver driver) {

        return true;
    }
}
