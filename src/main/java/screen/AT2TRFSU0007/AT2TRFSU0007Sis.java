package screen.AT2TRFSU0007;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;


/**
 * Created by vsolis on 12/09/2016.
 */
public class AT2TRFSU0007Sis {

    protected AT2TRFSU0007Locators locators;
    protected AT2TRFSU0007Data data;

    public AT2TRFSU0007Sis() {

    }
    public AT2TRFSU0007Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFSU0007Locators locators) {
        this.locators = locators;
    }
    public AT2TRFSU0007Data getData() {
        return data;
    }
    public void setData(AT2TRFSU0007Data data) {
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


        if (!Vehicles(driver)) {
            return false;
        }



        return false;
    }

    //Vehicles

    private boolean Vehicles(TestDriver driver) {


        if (!Add_vehicles(driver)) {
            return false;
        }

        if (!Search_vehicles(driver)) {
            return false;
        }

        if (!Edit_vehicles(driver)) {
            return false;
        }

        if (!Qbe_vehicles(driver)) {
            return false;
        }

        if (!Other_actions_vehicles(driver)) {
            return false;
        }

        if (!Delete_vehicles(driver)) {
            return false;
        }

        return true;
    }
    private boolean Delete_vehicles(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN VEHICLES", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"vehicles_delete_b_delete", getElements("vehicles_delete_b_delete")},
                new String[]{"vehicles_delete_records", getElements("vehicles_delete_records")},
                new String[]{"vehicles_delete_b_ok", getElements("vehicles_delete_b_ok")},
                " on DELETE")) {
            return false;
        }


        return true;
    }
    private boolean Other_actions_vehicles(TestDriver driver) {


        driver.getReport().addHeader("OTHER ACTIONS VEHICLES", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"vehicles_actions_b_actions", getElements("vehicles_actions_b_actions")}, //actions button
                new String[]{"vehicles_actions_b_auditdata", getElements("vehicles_actions_b_auditdata")}, //audit button
                new String[]{"vehicles_actions_b_ok", getElements("vehicles_actions_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"vehicles_dtacj_b_detach", getElements("vehicles_dtacj_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }
    private boolean Qbe_vehicles(TestDriver driver) {

        driver.getReport().addHeader(" QBE IN VEHICLES", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"vehicles_se_b_reset", getElements("vehicles_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }


        if (!Functions.clickQbE(driver,
                new String[]{"vehicles_qbe_b_qbe", getElements("vehicles_qbe_b_qbe")},// query button
                new String[]{"vehicles_qbe_sl_active", getElements("vehicles_qbe_sl_active")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"vehicles_qbe_sl_active", getElements("vehicles_qbe_sl_active")},
                "No", "qbe_active", " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"vehicles_qbe_i_vehicle_type", getElements("vehicles_qbe_i_vehicle_type")},
                "qbe_vehicle_type", data.getData().get("add_vehicle_type"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"vehicles_qbe_i_vehicle_type_description", getElements("vehicles_qbe_i_vehicle_type_description")},
                "qbe_vehicles_type_description", data.getData().get("add_vehicles_type_description"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"vehicles_qbe_i_group", getElements("vehicles_qbe_i_group")},
                "qbe_group", data.getData().get("add_group"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"vehicles_qbe_i_desgroupvehic", getElements("vehicles_qbe_i_desgroupvehic")},
                "qbe_group_description", data.getData().get("add_group_description"), " on QBE ")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"vehicles_qbe_preferred", getElements("vehicles_qbe_preferred")},
                "No", "qbe_preferred", " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"vehicles_qbe_i_capacity", getElements("vehicles_qbe_i_capacity")},
                "qbe_capacity", data.getData().get("add_capacity"), " on QBE ")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"vehicles_qbe_i_capacity", getElements("vehicles_qbe_i_capacity")}, //search button
                new String[]{"vehicles_se_result", getElements("vehicles_se_result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }
    private boolean Edit_vehicles(TestDriver driver) {


        driver.getReport().addHeader(" EDIT IN VEHICLES", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"vehicles_b_edit", getElements("vehicles_b_edit")}, //element to click
                new String[]{"vehicles_ed_check_box_active", getElements("vehicles_ed_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("vehicles_ed_check_box_active"), "active", false, true, " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_ed_vehicle_type", getElements("vehicles_ed_vehicle_type")},
                "add_vehicle_type", "$", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_ed_vehicle_type_description", getElements("vehicles_ed_vehicle_type_description")},
                "add_vehicles_type_description", "Prueba2", " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"vehicles_ed_lov_group", getElements("vehicles_ed_lov_group")}, // b_lov
                new String[]{"vehicles_ed_i_group", getElements("vehicles_ed_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_group", //Data name
                " on EDIT")) {
            return false;
        }
        Functions.getText(driver, new String[]{"vehicles_ed_i_group_description", getElements("vehicles_ed_i_group_description")}, // element path
                "add_group_description", // key for data value (the name)
                " on EDIT");

        if (!Functions.checkboxValue(driver,
                getElements("vehicles_ed_check_box_preferred"), "active", false, true, " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_ed_i_capacity", getElements("vehicles_ed_i_capacity")},
                "add_capacity", (Integer.toString(DataGenerator.random(1, 15))), " on EDIT")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"vehicles_ed_b_save", getElements("vehicles_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }


        return true;
    }
    private boolean Search_vehicles(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN VEHICLES", 3, false);

        if (!Functions.selectText(driver,
                new String[]{"vehicles_se_select_text_active", getElements("vehicles_se_select_text_active")},
                "Yes", "se_active", " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"vehicles_se_i_vehicle_type", getElements("vehicles_se_i_vehicle_type")},
                "se_vehicle_type", data.getData().get("add_vehicle_type"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_se_i_vehicle_type_description", getElements("vehicles_se_i_vehicle_type_description")},
                "se_vehicles_type_description", data.getData().get("add_vehicles_type_description"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_se_i_group", getElements("vehicles_se_i_group")},
                "se_group", data.getData().get("add_group"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_se_i_descgroupvehic", getElements("vehicles_se_i_descgroupvehic")},
                "se_group_description", data.getData().get("add_group_description"), " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"vehicles_se_select_text_preferred", getElements("vehicles_se_select_text_preferred")},
                data.getData().get("active"), "se_prefered", " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_se_i_capacity", getElements("vehicles_se_i_capacity")},
                "se_capacity", data.getData().get("add_capacity"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"vehicles_se_b_search", getElements("vehicles_se_b_search")}, //search button
                new String[]{"vehicles_se_result", getElements("vehicles_se_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }


        return true;
    }
    private boolean Add_vehicles(TestDriver driver) {


        driver.getReport().addHeader(" ADD IN VEHICLES", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"vehicles_b_add", getElements("vehicles_b_add")}, //element to click
                new String[]{"vehicles_ad_check_box_active", getElements("vehicles_ad_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("vehicles_ad_check_box_active"), "active", true, true, " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_ad_vehicle_type", getElements("vehicles_ad_vehicle_type")},
                "add_vehicle_type", "Ñ", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_ad_vehicle_type_description", getElements("vehicles_ad_vehicle_type_description")},
                "add_vehicles_type_description", "PRUEBA1", " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"vehicles_ad_lov_group", getElements("vehicles_ad_lov_group")}, // b_lov
                new String[]{"vehicles_ad_i_group", getElements("vehicles_ad_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_group", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getText(driver, new String[]{"vehicles_ad_i_group_description", getElements("vehicles_ad_i_group_description")}, // element path
                "add_group_description", // key for data value (the name)
                " on ADD");

        if (!Functions.checkboxValue(driver,
                getElements("vehicles_ad_check_box_preferred"), "active", false, true, " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"vehicles_ad_i_capacity", getElements("vehicles_ad_i_capacity")},
                "add_capacity", (Integer.toString(DataGenerator.random(1, 15))), " on ADD")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"vehicles_ad_b_save", getElements("vehicles_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }

        return true;
    }
}
