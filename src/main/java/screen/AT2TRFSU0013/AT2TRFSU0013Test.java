package screen.AT2TRFSU0013;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2TRFSU0013.AT2TRFSU0013Data;
import screen.AT2TRFSU0013.AT2TRFSU0013Locators;

/**
 * Created by vsolis on 06/09/2016.
 */
public class AT2TRFSU0013Test {
    protected AT2TRFSU0013Locators locators;
    protected AT2TRFSU0013Data data;

    public AT2TRFSU0013Test() {

    }

    public AT2TRFSU0013Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0013Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0013Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0013Data data) {
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
        if (!Grouping_vehicles(driver)) {
            return false;
        }

        return false;
    }

    private boolean Grouping_vehicles(TestDriver driver) {

        if (!Add_Grouping_vehicles(driver)) {
            return false;
        }
        if (!Search_Grouping_vehicles(driver)) {
            return false;
        }
        if (!QBE_Grouping_vehicles(driver)) {
            return false;
        }


        return true;
    }

    private boolean QBE_Grouping_vehicles(TestDriver driver) {

        driver.getReport().addHeader("QBE IN GROUPING VEHICLES", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"b_qbe", getElements("b_qbe")},// query button
                new String[]{"qbe_i_grouping", getElements("qbe_i_grouping")},//any query input
                " on QBE IN EXCLUSIVE")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"qbe_s_active", getElements("qbe_s_active")},
                "Arrival", "vu_ad", " on ADD IN ANTELA")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"exclusive_qbe_i_transfer", getElements("exclusive_qbe_i_transfer")},
                "ex_tra", "AAA", " on QBE IN EXCLUSIVE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"exclusive_qbe_i_description", getElements("exclusive_qbe_i_description")},
                "ex_des", "CAMPANET", " on QBE IN EXCLUSIVE")) {
            return false;
        }

        return true;
    }

    private boolean Search_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("SEARCH IN GROUPING VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);

        if (!Functions.insertInput(driver, new String[]{"s_i_grouping", getElements("s_i_grouping")},
                "add_gro", "5", " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"s_i_description", getElements("s_i_description")},
                "add_des", "VSSED", " on SEARCH")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"s_records", getElements("s_records")},
                " on SEARCH")) {
            return false;
        }

        return true;
    }

    private boolean Add_Grouping_vehicles(TestDriver driver) {

        driver.getReport().addHeader("ADD IN GROUPING VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_add", getElements("b_add")}, //element to click
                new String[]{"ad_ss_active", getElements("ad_ss_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }


        Functions.checkboxValue(driver,
                getElements("ad_ss_active"), "active", true, true, " on ADD");

        if (!Functions.insertInput(driver, new String[]{"ad_i_grouping", getElements("ad_i_grouping")},
                "add_gro", "5", " where")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"ad_i_description", getElements("ad_i_description")},
                "add_des", "VSSED", " where")) {
            return false;
        }

        Functions.checkClickByAbsence(driver,
                new String[]{"b_ad_b_save", getElements("b_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90, 500,
                " on ADD");


        return true;
    }
}
