package screen.AT2TRFSU0002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2TRFSU0016.AT2TRFSU0016Data;
import screen.AT2TRFSU0016.AT2TRFSU0016Locators;

/**
 * Created by vsolis on 08/09/2016.
 */
public class AT2TRFSU0002Test {
    protected AT2TRFSU0002Locators locators;
    protected AT2TRFSU0002Data data;

    public AT2TRFSU0002Test() {

    }

    public AT2TRFSU0002Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0002Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0002Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0002Data data) {
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

        if (!Operational_vehicles(driver)) {
            return false;
        }


        return false;
    }

    private boolean Operational_vehicles(TestDriver driver) {

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
        driver.getReport().addHeader("DELETE IN OPERATIONAL VEHICLES", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"operational_b_delete", getElements("operational_b_delete")},
                new String[]{"operational_record", getElements("operational_record")},
                new String[]{"operational_b_del_ok", getElements("operational_b_del_ok")},
                " on DELETE IN OPERATIONAL")) {
            return false;
        }



        return true;
    }

    private boolean Other_actions_vehicles(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN OPERATIONAL VEHICLES", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"operational_b_actions", getElements("operational_b_actions")}, //actions button
                new String[]{"operational_a_auditdata", getElements("operational_a_auditdata")}, //audit button
                new String[]{"operational_b_a_exit", getElements("operational_b_a_exit")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"operational_b_detach", getElements("operational_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }
        return true;
    }

    private boolean Qbe_vehicles(TestDriver driver) {
        driver.getReport().addHeader("QBE IN OPERATIONAL VEHICLES", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"operational_b_qbe", getElements("operational_b_qbe")},// query button
                new String[]{"operational_qbe_select_text_active", getElements("operational_qbe_select_text_active")},//any query input
                " on QBE IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"operational_qbe_select_text_active", getElements("operational_qbe_select_text_active")},
                "No", "qbe_no", " on QBE IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"operational_qbe_i_suplier_test_tineo", getElements("operational_qbe_i_suplier_test_tineo")},
                "qbe_suplier_test", "%" + data.getData().get("lov_suplier_tes"), " on QBE IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"operational_qbe_i_suplier_comercial_name", getElements("operational_qbe_i_suplier_comercial_name")},
                "qbe_suplier_name", data.getData().get("suplier_description"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_qbe_i_vehicle_type", getElements("operational_qbe_i_vehicle_type")},
                "qbe_vehicle_type", data.getData().get("lov_vehicle_type"), " on QBE IN GROUPING")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_qbe_vehicle_cod", getElements("operational_qbe_vehicle_cod")},
                "qbe_vehicle_code", data.getData().get("vehicle_code"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_qbe_i_vehicle_des", getElements("operational_qbe_i_vehicle_des")},
                "qbe_vehicle_description", data.getData().get("vehicle_description"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_qbe_i_capacity", getElements("operational_qbe_i_capacity")},
                "qbe_capacity", data.getData().get("capacity"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"operational_qbe_i_capacity", getElements("operational_qbe_i_capacity")}, //search button
                new String[]{"reoperational_se_resultsult", getElements("operational_se_result")}, //result element
                " on QBE IN OPERATIONAL")) {
            return false;
        }


        return true;
    }



    private boolean Edit_vehicles(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN OPERATIONAL VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"operational_ed_b_edit", getElements("operational_ed_b_edit")}, //element to click
                new String[]{"operational_ed_check_box_active", getElements("operational_ed_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN OPERATIONAL")) {
            return false;
        }

        Functions.checkboxValue(driver,
                getElements("operational_ed_check_box_active"), "active", false, true, " on  ADD IN OPERATIONAL");

        if (!Functions.createLov(driver,
                new String[]{"operational_ed_lov_suplier_test", getElements("operational_ed_lov_suplier_test")}, // b_lov
                new String[]{"operational_ed_i_suplier_test", getElements("operational_ed_i_suplier_test")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_suplier_tes", //Data name
                " on  ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"operational_ed_i_suplier_test_description", getElements("operational_ed_i_suplier_test_description")}, // element path
                "suplier_description", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs

        if (!Functions.createLov(driver,
                new String[]{"operational_ed_lov2_vehicle_type", getElements("operational_ed_lov2_vehicle_type")}, // b_lov
                new String[]{"operational_ed_i_vehicle_type", getElements("operational_ed_i_vehicle_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_vehicle_type", //Data name
                " on ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"operational_ed_i_vehicle_type_description", getElements("operational_ed_i_vehicle_type_description")}, // element path
                "vehicle_type_description", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs


        if (!Functions.insertInput(driver,
                new String[]{"operational_ed_i_vehicle_code",
                        getElements("operational_ed_i_vehicle_code")},
                "vehicle_code",
                (Integer.toString(DataGenerator.random(1, 16))),
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_add_i_vehicle_description", getElements("operational_add_i_vehicle_description")},
                "vehicle_description", "prueba", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_ed_i_capacity", getElements("operational_ed_i_capacity")},
                "capacity", (Integer.toString(DataGenerator.random(1, 15))), " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_ed_i_remarcks", getElements("operational_ed_i_remarcks")},
                "remarks", "PRUEBA2", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"operational_ed_b_save", getElements("operational_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN OPERATIONAL")) {
            return false;
        }


        return true;
    }


    private boolean Search_vehicles(TestDriver driver) {

        driver.getReport().addHeader("ADVANCED SEARCH IN OPERATIONAL VEHICLES  ", 3, false);

        if (!Functions.selectText(driver,
                new String[]{"operational_se_select_text_active", getElements("operational_se_select_text_active")},
                "Yes", "ss_yes", " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"operational_se_lov_suplier_test", getElements("operational_se_lov_suplier_test")}, //LoV button
                new String[]{"operational_se_i_suplier_test", getElements("operational_se_i_suplier_test")}, //external LoV input
                new String[]{"operational_se_i_lov_description", getElements("operational_se_i_lov_description")}, //internal LoV input
                data.getData().get("lov_suplier_tes"), // value to search
                "se_lov_test", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"operational_se_lov2_vehicle_type", getElements("operational_se_lov2_vehicle_type")}, //LoV button
                new String[]{"operational_se_i_vehicle_type", getElements("operational_se_i_vehicle_type")}, //external LoV input
                new String[]{"operational_se_i_lov2_description", getElements("operational_se_i_lov2_description")}, //internal LoV input
                data.getData().get("lov_vehicle_type"), // value to search
                "se_lov2_vehicle_type", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"operational_se_i_vehicle_cod", getElements("operational_se_i_vehicle_cod")},
                "se_vehicle_code", data.getData().get("vehicle_code"), "  on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"operational_se_i_vehicle_decription", getElements("operational_se_i_vehicle_decription")},
                "se_vehicle_description", data.getData().get("vehicle_description"), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"operational_se_i_remarks", getElements("operational_se_i_remarks")},
                "se_remarks", data.getData().get("remarks"), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"operational_se_b_search", getElements("operational_se_b_search")}, //search button
                new String[]{"operational_se_result", getElements("operational_se_result")}, //Falta crear este resultado por bug
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }


        return true;
    }

    private boolean Add_vehicles(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN OPERATIONAL VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"operational_b_add", getElements("operational_b_add")}, //element to click
                new String[]{"operational_add_check_box_active", getElements("operational_add_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN OPERATIONAL")) {
            return false;
        }

        Functions.checkboxValue(driver,
                getElements("operational_add_check_box_active"), "active", true, true, " on  ADD IN OPERATIONAL");

        if (!Functions.createLov(driver,
                new String[]{"operational_add_lov_suplier_test", getElements("operational_add_lov_suplier_test")}, // b_lov
                new String[]{"operational_add_i_suplier_test", getElements("operational_add_i_suplier_test")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_suplier_tes", //Data name
                " on  ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"operational_add_i_description_suplier", getElements("operational_add_i_description_suplier")}, // element path
                "suplier_description", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs

        if (!Functions.createLov(driver,
                new String[]{"operational_add_lov2_vehicle_type", getElements("operational_add_lov2_vehicle_type")}, // b_lov
                new String[]{"operational_add_i_vehicle_type", getElements("operational_add_i_vehicle_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_vehicle_type", //Data name
                " on ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"operational_add_i_description_vehicle", getElements("operational_add_i_description_vehicle")}, // element path
                "vehicle_type_description", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs


        if (!Functions.insertInput(driver,
                new String[]{"operational_add_i_vehicle_cod",
                        getElements("operational_add_i_vehicle_cod")},
                "vehicle_code",
                (Integer.toString(DataGenerator.random(1, 16))),
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_add_i_vehicle_description", getElements("operational_add_i_vehicle_description")},
                "vehicle_description", "prueba", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_add_i_capa", getElements("operational_add_i_capa")},
                "capacity", (Integer.toString(DataGenerator.random(1, 15))), " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"operational_add_remarcks", getElements("operational_add_remarcks")},
                "remarks", "PRUEBA1", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"operational_add_b_save", getElements("operational_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN OPERATIONAL")) {
            return false;
        }


        return true;
    }


}
