package screen.AT2BOOSA0005;

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

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Bookings");
        driver.getTestdetails().setSubmenu("Sales");
        driver.getTestdetails().setScreen("Occupancy Graphic 2.0");
    }
}
