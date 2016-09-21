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
                new String[]{"grouping_del_b_delete", getElements("grouping_del_b_delete")},
                new String[]{"grouping_del_records", getElements("grouping_del_records")},
                new String[]{"grouping_del_b_ok", getElements("grouping_del_b_ok")},
                " on DELETE IN GROUPING")) {
            return false;
        }

        return true;
    }

    private boolean Other_actios_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN GROUPING VEHICLES", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"grouping_oc_b_actions", getElements("grouping_oc_b_actions")}, //actions button
                new String[]{"grouping_oc_b_audit_data", getElements("grouping_oc_b_audit_data")}, //audit button
                new String[]{"grouping_oc_exit_ok", getElements("grouping_oc_exit_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"grouping_oc_detach", getElements("grouping_oc_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }


    private boolean Edit_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN GROUPING VEHICLES", 3, false);
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"grouping_ed_b_edit", getElements("grouping_ed_b_edit")}, //element to click
                new String[]{"grouping_ed_check_box_active", getElements("grouping_ed_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkboxValue(driver,
                getElements("grouping_ed_check_box_active"), "active", false, true, " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_ed_i_vehicles_code", getElements("grouping_ed_i_vehicles_code")},
                "vehicles_code", (Integer.toString(DataGenerator.random(1, 100))), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_ed_i_description", getElements("grouping_ed_i_description")},
                "vehicles_descrip", "Prueba2", " on EDIT")) {
            return false;
        }

        Functions.checkClickByAbsence(driver,
                new String[]{"grouping_ed_b_save", getElements("grouping_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90, 500,
                " on EDIT");


        return true;
    }

    private boolean QBE_Grouping_vehicles(TestDriver driver) {

        driver.getReport().addHeader("QBE IN GROUPING VEHICLES", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"grouping_se_b_reset", getElements("grouping_se_b_reset")}, //element to click
                " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"grouping_qbe_b_qbe", getElements("grouping_qbe_b_qbe")},// query button
                new String[]{"grouping_qbe_select_text_active", getElements("grouping_qbe_select_text_active")},//any query input
                " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"grouping_qbe_select_text_active", getElements("grouping_qbe_select_text_active")},
                "No", "qbe_active", " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_qbe_i_vehicles_code", getElements("grouping_qbe_i_vehicles_code")},
                "qbe_vehicles_code", data.getData().get("vehicles_code"), " on QBE IN GROUPING")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_qbe_i_description", getElements("grouping_qbe_i_description")},
                "qbe_vehicles_description", data.getData().get("vehicles_descrip"), " on QBE IN GROUPING")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"grouping_qbe_i_description", getElements("grouping_qbe_i_description")}, //search button
                new String[]{"grouping_se_result", getElements("grouping_se_result")}, //result element
                " on QBE IN GROUPING")) {
            return false;
        }

        return true;
    }

    private boolean Search_Grouping_vehicles(TestDriver driver) {
        driver.getReport().addHeader("SEARCH IN GROUPING VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);

        if (!Functions.insertInput(driver, new String[]{"grouping_se_i_vehicles_code", getElements("grouping_se_i_vehicles_code")},
                "se_code", data.getData().get("vehicles_code"), " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_se_i_description", getElements("grouping_se_i_description")},
                "se_vehicles_descript", data.getData().get("vehicles_descrip"), " on SEARCH")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"grouping_se_b_search", getElements("grouping_se_b_search")}, //search button
                new String[]{"grouping_se_result", getElements("grouping_se_result")},
                " on SEARCH")) {
            return false;
        }

        return true;
    }

    private boolean Add_Grouping_vehicles(TestDriver driver) {

        driver.getReport().addHeader("ADD IN GROUPING VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"grouping_add_b_add", getElements("grouping_add_b_add")}, //element to click
                new String[]{"grouping_add_check_box_active", getElements("grouping_add_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }


        if (!Functions.checkboxValue(driver,
                getElements("grouping_add_check_box_active"), "active", true, true, " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_add_i_vehicles_code", getElements("grouping_add_i_vehicles_code")},
                "vehicles_code", (Integer.toString(DataGenerator.random(1, 100))), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"grouping_add_i_description", getElements("grouping_add_i_description")},
                "vehicles_descrip", "Prueba1", " on ADD")) {
            return false;
        }

        Functions.checkClickByAbsence(driver,
                new String[]{"grouping_add_b_save", getElements("grouping_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90, 500,
                " on ADD");


        return true;
    }
}
