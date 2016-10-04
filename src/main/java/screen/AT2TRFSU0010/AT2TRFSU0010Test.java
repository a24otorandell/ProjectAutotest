package screen.AT2TRFSU0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 09/09/2016.
 */
public class AT2TRFSU0010Test {
    protected AT2TRFSU0010Locators locators;
    protected AT2TRFSU0010Data data;

    public AT2TRFSU0010Test() {
    }
    public AT2TRFSU0010Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFSU0010Locators locators) {
        this.locators = locators;
    }
    public AT2TRFSU0010Data getData() {
        return data;
    }
    public void setData(AT2TRFSU0010Data data) {
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
        if (!Transfer_service_type(driver)) {
            return false;
        }
        return false;
    }
    private boolean Transfer_service_type(TestDriver driver) {

        if (!Add_service_type(driver)) {
            return false;
        }

        if (!Search_service_type(driver)) {
            return false;
        }

        if (!Edit_service_type(driver)) {
            return false;
        }

        if (!QBE_service_type(driver)) {
            return false;
        }

        if (!Other_actions_type(driver)) {
            return false;
        }

        if (!Add_service_type_description(driver)) {
            return false;
        }

        if (!Search_service_type_description(driver)) {
            return false;
        }

        if (!Edit_service_type_description(driver)) {
            return false;
        }

        if (!Other_actions_type_description(driver)) {
            return false;
        }

        if (!Dele_type_description(driver)) {
            return false;
        }


        if (!Delete_type(driver)) {
            return false;
        }

        return true;
    }

    private boolean Dele_type_description(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN SERVICE TYPE DESCRIPTION", 3, false);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"description_b_delete", getElements("description_b_delete")},
                new String[]{"description_a_records", getElements("description_a_records")},
                new String[]{"description_a_b_ok", getElements("description_a_b_ok")},
                " on DELETE IN DESCRIPTION")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_type_description(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN SERVICE TYPE DESCRIPTION", 3, false);
        if (!Functions.simpleClick(driver,
                new String[]{"description_qbe_result", getElements("description_qbe_result")}, //element to click
                " on OTHER ACTIONS IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"description_b_actions", getElements("description_b_actions")}, //actions button
                new String[]{"description_ac_auditdata", getElements("description_ac_auditdata")}, //audit button
                new String[]{"description_ac_b_exit", getElements("description_ac_b_exit")}, //audit_b_ok
                " on OTHER ACTIONS IN DESCRIPTION")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"description_detach", getElements("description_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS IN DESCRIPTION")) {
            return false;
        }
        return true;
    }
    private boolean Edit_service_type_description(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN SERVICE TYPE DESCRIPTION", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"description_b_edit", getElements("description_b_edit")}, //element to click
                new String[]{"description_ed_i_description", getElements("description_ed_i_description")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT IN DESCRIPTION")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"description_ed_i_description", getElements("description_ed_i_description")},
                "des_description", "Prueba2", " on EDIT IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"description_ed_i_long_description", getElements("description_ed_i_long_description")},
                "des_long_description", "Prueba2", " on EDIT IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"description_ed_b_save", getElements("description_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT IN DESCRIPTION")) {
            return false;
        }

        return true;
    }
    private boolean Search_service_type_description(TestDriver driver) {
        driver.getReport().addHeader("QBE  IN SERVICE TYPE DESCRIPTION", 3, false);
        if (!Functions.clickQbE(driver,
                new String[]{"description_b_qbe", getElements("description_b_qbe")},// query button
                new String[]{"description_qbe_i_code_lenguaje", getElements("description_qbe_i_code_lenguaje")},//any query input
                " on QBE IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"description_qbe_i_code_lenguaje", getElements("description_qbe_i_code_lenguaje")},
                "des_qbe_lenguaje", data.getData().get("des_lov_lenguaje"), " on QBE IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"description_qbe_i_lenguaje_description", getElements("description_qbe_i_lenguaje_description")},
                "des_qbe_description", data.getData().get("des_description"), " on QBE IN DESCRIPTION")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"description_qbe_i_long_description", getElements("description_qbe_i_long_description")},
                "des_qbe_long_description", data.getData().get("des_long_description"), " on QBE IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"description_qbe_i_long_description", getElements("description_qbe_i_long_description")}, //search button
                new String[]{"description_qbe_result", getElements("description_qbe_result")}, //result element
                " on QBE IN DESCRIPTION")) {
            return false;
        }
        return true;
    }
    private boolean Add_service_type_description(TestDriver driver) {
        driver.getReport().addHeader("ADD IN SERVICE TYPE DESCRIPTION", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"description_b_add", getElements("description_b_add")}, //element to click
                new String[]{"description_add_lov", getElements("description_add_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"description_add_lov", getElements("description_add_lov")}, // b_lov
                new String[]{"description_add_i_lenguaje", getElements("description_add_i_lenguaje")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "des_lov_lenguaje", //Data name
                " on ADD IN DESCRIPTION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"description_add_i_lenguaje_description", getElements("description_add_i_lenguaje_description")}, // element path
                "des_description_lenguaje", // key for data value (the name)
                " on ADD IN DESCRIPTION");

        if (!Functions.insertInput(driver, new String[]{"description_add_i_description", getElements("description_add_i_description")},
                "des_description", "Prueba1", " on ADD IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"description_add_i_long_description", getElements("description_add_i_long_description")},
                "des_long_description", "Prueba1", " on ADD IN DESCRIPTION")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"description_add_b_save", getElements("description_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN DESCRIPTION")) {
            return false;
        }
        return true;
    }

    private boolean Delete_type(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN SERVICE TYPE", 3, false);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"service_b_delete", getElements("service_b_delete")},
                new String[]{"service_a_records", getElements("service_a_records")},
                new String[]{"service_delete_b_ok", getElements("service_delete_b_ok")},
                " on DELETE")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_type(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN SERVICE TYPE", 3, false);
        if (!Functions.auditData(driver,
                new String[]{"service_b_actions", getElements("service_b_actions")}, //actions button
                new String[]{"service_a_auditdata", getElements("service_a_auditdata")}, //audit button
                new String[]{"service_a_b_ok", getElements("service_a_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"service_detach", getElements("service_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }
        return true;
    }
    private boolean QBE_service_type(TestDriver driver) {
        driver.getReport().addHeader("QBE  IN ADITIONAL SUPLEMENTS", 3, false);
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"service_b_reset", getElements("service_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"service_b_qbe", getElements("service_b_qbe")},// query button
                new String[]{"service_qbe_i_service", getElements("service_qbe_i_service")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"service_qbe_i_service", getElements("service_qbe_i_service")},
                "qbe_service", data.getData().get("add_service"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"service_qbe_vehicle", getElements("service_qbe_vehicle")},
                "qbe_vehicle_type", data.getData().get("add_vehicle"), " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"service_qbe_description", getElements("service_qbe_description")},
                "qbe_type_description", data.getData().get("add_descript"), " on QBE ")) {
        return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"service_qbe_mandatory", getElements("service_qbe_mandatory")},
                "No", "qbe_mandatory", "  on QBE ")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"service_qbe_mandatory", getElements("service_qbe_mandatory")}, //search button
                new String[]{"service_result", getElements("service_result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;
    }
    private boolean Edit_service_type(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN SERVICE TYPE", 3, false);
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_b_edit", getElements("service_b_edit")}, //element to click
                new String[]{"service_ed_i_service", getElements("service_ed_i_service")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"service_ed_i_service", getElements("service_ed_i_service")},
                "add_service", (Integer.toString(DataGenerator.random(1, 9))), " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"service_ed_lov", getElements("service_ed_lov")}, // b_lov
                new String[]{"service_ed_i_vehicle", getElements("service_ed_i_vehicle")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_vehicle", //Data name
                " on EDIT")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"service_ed_i_description", getElements("service_ed_i_description")}, // element path
                "add_descript", // key for data value (the name)
                " on EDIT");
        if (!Functions.checkboxValue(driver,
                getElements("service_ed_check_box_mandatory"), "active", false, true, " on EDIT")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"service_ed_check_box_mandatory", getElements("service_ed_check_box_mandatory")}, // element path
                "add_active", // key for data value (the name)
                " on EDIT");
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"service_ed_b_save", getElements("service_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;
    }
    private boolean Search_service_type(TestDriver driver) {
        driver.getReport().addHeader(" BASIC SEARCH IN SERVICE TYPE", 3, false);
        if (!Functions.insertInput(driver,
                new String[]{"service_se_i_service", getElements("service_se_i_service")},
                "se_i_servi", data.getData().get("add_service"), " SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"service_se_lov", getElements("service_se_lov")}, //LoV button
                new String[]{"service_se_i_vehicle", getElements("service_se_i_vehicle")}, //external LoV input
                new String[]{"service_se_lov_destipo", getElements("service_se_lov_destipo")}, //internal LoV input
                data.getData().get("add_descript"), // value to search
                "se_vehicle", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("service_se_check_box_mandatory"), "active", Boolean.valueOf(data.getData().get("active")), true, " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"service_se_i_description", getElements("service_se_i_description")},
                "se_vehicle_description", data.getData().get("add_descript"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"service_b_search", getElements("service_b_search")}, //search button
                new String[]{"service_result", getElements("service_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean Add_service_type(TestDriver driver) {
        driver.getReport().addHeader("ADD IN SERVICE TYPE", 3, false);
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_b_add", getElements("service_b_add")}, //element to click
                new String[]{"service_add_i_service", getElements("service_add_i_service")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"service_add_i_service", getElements("service_add_i_service")},
                "add_service", (Integer.toString(DataGenerator.random(1, 15))), " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"service_add_lov", getElements("service_add_lov")}, // b_lov
                new String[]{"service_add_i_vehicle", getElements("service_add_i_vehicle")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_vehicle", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"service_add_i_description", getElements("service_add_i_description")}, // element path
                "add_descript", // key for data value (the name)
                " on ADD");


        if (!Functions.checkboxValue(driver,
                getElements("service_add_check_box_mandatory"), "active", true, true, " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"service_add_check_box_mandatory", getElements("service_add_check_box_mandatory")}, // element path
                "add_active", // key for data value (the name)
                " on ADD");
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"service_b_save", getElements("service_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }
        return true;
    }
}
