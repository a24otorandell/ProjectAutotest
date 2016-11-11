package screen.AT2MDMUS0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * Created by jmrios on 11/11/2016.
 */
public class AT2MDMUS0005Sis {
    protected AT2MDMUS0005Locators locators;
    protected AT2MDMUS0005Data data;

    public AT2MDMUS0005Sis() {
    }
    public AT2MDMUS0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0005Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0005Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Export Import Change Password");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!change_password(driver)) return false;
        return false;
    }

    private boolean change_password(TestDriver driver) {
        driver.getReport().addHeader("PASSWORD CHANGE RECORD", 3, false);
        String where = " on PASSWORD CHANGE";
        if (!Functions.insertInput(driver, new String[]{"add_i_new_password", getElements("add_i_new_password")}, // element path
                "new_password", getData(driver.getUserdetails().getPassword()), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_confirm_password", getElements("add_i_confirm_password")}, // element path
                "confirm_password", getData(driver.getUserdetails().getPassword()), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_show_buttons", getElements("MDM_show_buttons")}, //element to click
                new String[]{"add_b_save", getElements("add_b_save")}, //element expected to appear
                where)){
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
}
