package screen.AT2TRFSU0013;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
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
        if (!Edit_Grouping_vehicles(driver)) {
            return false;
        }

        if (!Search2_Grouping_vehicles(driver)) {
            return false;
        }
        if (!QBE_Grouping_vehicles(driver)) {
            return false;
        }
        if (!Other_actios_Grouping_vehicles(driver)) {
            return false;
        }

        if (!Delete_Grouping_vehicles(driver)) {
            return false;
        }
        return true;
    }

    private boolean Delete_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN GROUPING VEHICLES", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"b_delete", getElements("b_delete")},
                new String[]{"i_records", getElements("i_records")},
                new String[]{"b_del_yes", getElements("b_del_yes")},
                " on DELETE IN GROUPING")) {
            return false;
        }

        return true;
    }

    private boolean Other_actios_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN GROUPING VEHICLES", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"o_b_actios", getElements("o_b_actios")}, //actions button
                new String[]{"o_actios_b_auditdata", getElements("o_actios_b_auditdata")}, //audit button
                new String[]{"o_b_close", getElements("o_b_close")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"o_b_detach", getElements("o_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean Search2_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("SEARCH IN GROUPING VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);

        if (!Functions.insertInput(driver, new String[]{"s_i_grouping", getElements("s_i_grouping")},
                "se_gro2", data.getData().get("add_gro2"), " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"s_i_description", getElements("s_i_description")},
                "se_des2", data.getData().get("add_des2"), " on SEARCH")) {
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

    private boolean Edit_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN GROUPING VEHICLES", 3, false);
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_edit", getElements("b_edit")}, //element to click
                new String[]{"ed_ss_active", getElements("ed_ss_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        Functions.checkboxValue(driver,
                getElements("ed_ss_active"), "active", false, true, " on EDIT");

        if (!Functions.insertInput(driver, new String[]{"ed_i_grouping", getElements("ed_i_grouping")},
                "add_gro2", (Integer.toString(DataGenerator.random(1, 9))), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"ed_i_description", getElements("ed_i_description")},
                "add_des2", "BSSET", " on EDIT")) {
            return false;
        }

        Functions.checkClickByAbsence(driver,
                new String[]{"b_ed_b_save", getElements("b_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90, 500,
                " on EDIT");


        return true;
    }

    private boolean QBE_Grouping_vehicles(TestDriver driver) {

        driver.getReport().addHeader("QBE IN GROUPING VEHICLES", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"b_qbe", getElements("b_qbe")},// query button
                new String[]{"qbe_i_grouping", getElements("qbe_i_grouping")},//any query input
                " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"qbe_s_active", getElements("qbe_s_active")},
                data.getData().get(""), "qbe_yes", " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_i_grouping", getElements("qbe_i_grouping")},
                "qbe_gro", data.getData().get("add_gro2"), " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_i_decription", getElements("qbe_i_decription")},
                "qbe_des", data.getData().get("add_des2"), " on QBE IN GROUPING")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_s_active", getElements("qbe_s_active")}, //search button
                new String[]{"s_records", getElements("s_records")}, //result element
                " on QBE IN GROUPING")) {
            return false;
        }

        return true;
    }

    private boolean Search_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("SEARCH IN GROUPING VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);

        if (!Functions.insertInput(driver, new String[]{"s_i_grouping", getElements("s_i_grouping")},
                "se_gro", data.getData().get("add_gro"), " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"s_i_description", getElements("s_i_description")},
                "se_des", data.getData().get("add_des"), " on SEARCH")) {
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
                "add_gro", (Integer.toString(DataGenerator.random(1, 3))), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"ad_i_description", getElements("ad_i_description")},
                "add_des", "VSSED", " on ADD")) {
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
