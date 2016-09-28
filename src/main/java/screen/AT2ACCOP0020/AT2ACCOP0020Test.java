package screen.AT2ACCOP0020;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 23/09/2016.
 */
public class AT2ACCOP0020Test {

    protected AT2ACCOP0020Locators locators;
    protected AT2ACCOP0020Data data;

    public AT2ACCOP0020Test() {

    }

    public AT2ACCOP0020Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCOP0020Locators locators) {
        this.locators = locators;
    }

    public AT2ACCOP0020Data getData() {
        return data;
    }

    public void setData(AT2ACCOP0020Data data) {
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

        if (!Payment_method_management(driver)) {
            return false;
        }

        if (!Go_to_Payment_method_mapping_management(driver)) {
            return false;
        }

        if (!Payment_method_mapping_management(driver)) {
            return false;
        }

        return false;
    }


    //PAYMENT METHOD MANAGEMENT

    private boolean Payment_method_management(TestDriver driver) {

        if (!Add_payment(driver)) {
            return false;
        }
        if (!Search_payment(driver)) {
            return false;
        }
        if (!Edit_payment(driver)) {
            return false;
        }
        if (!QBE_payment(driver)) {
            return false;
        }
        if (!Other_actions_payment(driver)) {
            return false;
        }
        if (!Delete_payment(driver)) {
            return false;
        }
        return true;
    }

    private boolean Delete_payment(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN PAYMENT METHOD MANAGEMENT ", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"payment_method_del_b_delete", getElements("payment_method_del_b_delete")},
                new String[]{"payment_method_del_e_records", getElements("payment_method_del_e_records")},
                new String[]{"payment_method_del_b_delete_yes", getElements("payment_method_del_b_delete_yes")},
                " on DELETE")) {
            return false;
        }


        return true;
    }
    private boolean Other_actions_payment(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN PAYMENT METHOD MANAGEMENT ", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"payment_method_oa_b_deacht", getElements("payment_method_oa_b_deacht")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }
    private boolean QBE_payment(TestDriver driver) {

        driver.getReport().addHeader("QBE IN PAYMENT METHOD MANAGEMENT ", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"payment_method_se_b_reset", getElements("payment_method_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"payment_method_qbe_b_qbe", getElements("payment_method_qbe_b_qbe")},// query button
                new String[]{"payment_method_qbe_i_payment_method_code", getElements("payment_method_qbe_i_payment_method_code")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_qbe_i_payment_method_code", getElements("payment_method_qbe_i_payment_method_code")},
                "qbe_code", data.getData().get("code"), " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"payment_method_qbe_i_payment_method_code", getElements("payment_method_qbe_i_payment_method_code")}, //search button
                new String[]{"payment_method_se_e_result", getElements("payment_method_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_qbe_i_payment_method_name", getElements("payment_method_qbe_i_payment_method_name")},
                "qbe_name", data.getData().get("name"), " on QBE")) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"payment_method_qbe_e_type", getElements("payment_method_qbe_e_type")}, // element path
                "e_type", // key for data value (the name)
                " on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_qbe_i_type", getElements("payment_method_qbe_i_type")},
                "qbe_e_type", data.getData().get("e_type"), " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"payment_method_qbe_sl_enabled", getElements("payment_method_qbe_sl_enabled")},
                "No", "qbe_enabled", " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"payment_method_qbe_i_type", getElements("payment_method_qbe_i_type")}, //search button
                new String[]{"payment_method_se_e_result", getElements("payment_method_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }
    private boolean Edit_payment(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN PAYMENT METHOD MANAGEMENT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"payment_method_ed_b_edit", getElements("payment_method_ed_b_edit")}, //element to click
                new String[]{"payment_method_ed_i_payment_method_code", getElements("payment_method_ed_i_payment_method_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_ed_i_payment_method_code", getElements("payment_method_ed_i_payment_method_code")},
                "code", "PB2", " on EDIT")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"payment_method_ed_i_payment_method_name", getElements("payment_method_ed_i_payment_method_name")},
                "name", "Prueba2", " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"payment_method_ed_lov_type", getElements("payment_method_ed_lov_type")}, // b_lov
                new String[]{"payment_method_ed_i_type", getElements("payment_method_ed_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type", //Data name
                " on EDIT")) {
            return false;
        }


        if (!Functions.checkboxValue(driver,
                getElements("payment_method_ed_chb_enabled"), "enabled", false, true, " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"payment_method_ed_b_save", getElements("payment_method_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }

        return true;
    }
    private boolean Search_payment(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN PAYMENT METHOD MANAGEMENT", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"payment_method_se_lov_payment_method_code", getElements("payment_method_se_lov_payment_method_code")}, //LoV button
                new String[]{"payment_method_se_i_payment_method_code", getElements("payment_method_se_i_payment_method_code")}, //external LoV input
                new String[]{"payment_method_se_lov_payment_method_code_i_code", getElements("payment_method_se_lov_payment_method_code_i_code")}, //internal LoV input
                data.getData().get("code"), // value to search
                "se_code", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_se_y_payment_method_name", getElements("payment_method_se_y_payment_method_name")},
                "se_name", data.getData().get("name"), " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"payment_method_se_lov_type", getElements("payment_method_se_lov_type")}, //LoV button
                new String[]{"payment_method_se_i_type", getElements("payment_method_se_i_type")}, //external LoV input
                new String[]{"payment_method_se_lov_type_i_id", getElements("payment_method_se_lov_type_i_id")}, //internal LoV input
                data.getData().get("type"), // value to search
                "se_type", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"payment_method_se_sl_enabled", getElements("payment_method_se_sl_enabled")},
                "Yes", "se_enabled", " on SEARCH")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"payment_method_se_b_search", getElements("payment_method_se_b_search")}, //search button
                new String[]{"payment_method_se_e_result", getElements("payment_method_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean Add_payment(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN PAYMENT METHOD MANAGEMENT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"payment_method_add_b_add", getElements("payment_method_add_b_add")}, //element to click
                new String[]{"payment_method_add_i_payment_method_code", getElements("payment_method_add_i_payment_method_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_add_i_payment_method_code", getElements("payment_method_add_i_payment_method_code")},
                "code", "PB1", " on ADD")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"payment_method_add_i_payment_method_name", getElements("payment_method_add_i_payment_method_name")},
                "name", "Prueba1", " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"payment_method_add_lov_type", getElements("payment_method_add_lov_type")}, // b_lov
                new String[]{"payment_method_add_i_type", getElements("payment_method_add_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type", //Data name
                " on ADD")) {
            return false;
        }


        if (!Functions.checkboxValue(driver,
                getElements("payment_method_add_chb_enabled"), "enabled", true, true, " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"payment_method_add_b_save", getElements("payment_method_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }
        return true;
    }

    //GO TO

    private boolean Go_to_Payment_method_mapping_management(TestDriver driver) {

        driver.getReport().addHeader("GO TO IN PAYMENT METHOD MANAGEMENT ", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"payment_method_mapping", getElements("payment_method_mapping")}, //element to click
                new String[]{"payment_method_mapping_add_b_add", getElements("payment_method_mapping_add_b_add")}, //element expected to appear
                " on Go to")) {
            return false;
        }
        return true;
    }

    //PAYMENT METHOD MAPPING MANAGEMENT

    private boolean Payment_method_mapping_management(TestDriver driver) {

        if (!Add_mapping(driver)) {
            return false;
        }

        if (!Search_mapping(driver)) {
            return false;
        }

        if (!Edit_mapping(driver)) {
            return false;
        }

        if (!QBE_mapping(driver)) {
            return false;
        }

        if (!Other_actions_mapping(driver)) {
            return false;
        }

        if (!Delete_mapping(driver)) {
            return false;
        }
        return true;
    }

    private boolean Delete_mapping(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN PAYMENT MAPPING MANAGEMENT ", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"payment_method_mapping_del_b_delete", getElements("payment_method_mapping_del_b_delete")},
                new String[]{"payment_method_mapping_del_e_records", getElements("payment_method_mapping_del_e_records")},
                new String[]{"payment_method_mapping_del_b_delete_b_yes", getElements("payment_method_mapping_del_b_delete_b_yes")},
                " on DELETE")) {
            return false;
        }
        return true;
    }

    private boolean Other_actions_mapping(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN PAYMENT MAPPING MANAGEMENT ", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"payment_method_mapping_oa_b_detach", getElements("payment_method_mapping_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }
        return true;
    }
    private boolean QBE_mapping(TestDriver driver) {

        driver.getReport().addHeader("QBE IN PAYMENT MAPPING MANAGEMENT ", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"payment_method_mapping_se_b_reset", getElements("payment_method_mapping_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"payment_method_mapping_qbe_b_qbe", getElements("payment_method_mapping_qbe_b_qbe")},// query button
                new String[]{"payment_method_mapping_qbe_i_provider", getElements("payment_method_mapping_qbe_i_provider")},//any query input
                " on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_qbe_i_provider", getElements("payment_method_mapping_qbe_i_provider")},
                "qbe_provider", "World Pay", " on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_qbe_i_ecp_payment_method_code", getElements("payment_method_mapping_qbe_i_ecp_payment_method_code")},
                "qbe_payment_method_code", data.getData().get("payment_method"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_qbe_i_ecp_payment_method_name", getElements("payment_method_mapping_qbe_i_ecp_payment_method_name")},
                "qbe_payment_method_name", "AliPay", " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_qbe_i_psp_payment_method_code", getElements("payment_method_mapping_qbe_i_psp_payment_method_code")},
                "qbe_code", data.getData().get("code"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_qbe_i_psp_payment_method_name", getElements("payment_method_mapping_qbe_i_psp_payment_method_name")},
                "qbe_name", data.getData().get("name"), " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"payment_method_mapping_qbe_sl_autorizable", getElements("payment_method_mapping_qbe_sl_autorizable")},
                "No", "qbe_autorizable", " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"payment_method_mapping_qbe_sl_enabled", getElements("payment_method_mapping_qbe_sl_enabled")},
                "No", "qbe_enabled", " on QBE")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"payment_method_mapping_qbe_i_psp_payment_method_name", getElements("payment_method_mapping_qbe_i_psp_payment_method_name")}, //search button
                new String[]{"payment_method_mapping_se_e_result", getElements("payment_method_mapping_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;
    }
    private boolean Edit_mapping(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN PAYMENT MAPPING MANAGEMENT", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"payment_method_mapping_ed_b_edit", getElements("payment_method_mapping_ed_b_edit")}, //element to click
                new String[]{"payment_method_mapping_ed_lov_provider", getElements("payment_method_mapping_ed_lov_provider")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.createLov(driver,
                new String[]{"payment_method_mapping_ed_lov_provider", getElements("payment_method_mapping_ed_lov_provider")}, // b_lov
                new String[]{"payment_method_mapping_ed_i_provider", getElements("payment_method_mapping_ed_i_provider")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "provider", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"payment_method_mapping_ed_lov_ecp_payment_method_code", getElements("payment_method_mapping_ed_lov_ecp_payment_method_code")}, // b_lov
                new String[]{"payment_method_mapping_ed_i_ecp_payment_method_code", getElements("payment_method_mapping_ed_i_ecp_payment_method_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "payment_method", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_ed_i_psp_payment_method_code", getElements("payment_method_mapping_ed_i_psp_payment_method_code")},
                "code", "PB2", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_ed_i_psp_payment_method_name", getElements("payment_method_mapping_ed_i_psp_payment_method_name")},
                "name", "Prueba2", " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("payment_method_mapping_ed_chb_autorizable"), "autorizable", false, true, " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("payment_method_mapping_ed_cdb_enabled"), "enabled", false, true, " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"payment_method_mapping_ed_b_save", getElements("payment_method_mapping_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }

        return true;
    }
    private boolean Search_mapping(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN PAYMENT MAPPING MANAGEMENT", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"payment_method_mapping_se_lov_provider", getElements("payment_method_mapping_se_lov_provider")}, //LoV button
                new String[]{"payment_method_mapping_se_i_provider", getElements("payment_method_mapping_se_i_provider")}, //external LoV input
                new String[]{"payment_method_mapping_se_lov_provider_i_provider", getElements("payment_method_mapping_se_lov_provider_i_provider")}, //internal LoV input
                data.getData().get("se_provider"), // value to search
                "se_se_provider", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"payment_method_mapping_se_lov_ecp_payment_method_code", getElements("payment_method_mapping_se_lov_ecp_payment_method_code")}, //LoV button
                new String[]{"payment_method_mapping_se_i_ecp_payment_method_code", getElements("payment_method_mapping_se_i_ecp_payment_method_code")}, //external LoV input
                new String[]{"payment_method_mapping_se_lov_ecp_payment_method_code_i_code", getElements("payment_method_mapping_se_lov_ecp_payment_method_code_i_code")}, //internal LoV input
                data.getData().get("payment_method"), // value to search
                "se_payment_method", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"payment_method_mapping_se_lov_psp_payment_method_code", getElements("payment_method_mapping_se_lov_psp_payment_method_code")}, //LoV button
                new String[]{"payment_method_mapping_se_i_psp_payment_method_code", getElements("payment_method_mapping_se_i_psp_payment_method_code")}, //external LoV input
                new String[]{"payment_method_mapping_se_lov_psp_payment_method_code_i_code", getElements("payment_method_mapping_se_lov_psp_payment_method_code_i_code")}, //internal LoV input
                data.getData().get("code"), // value to search
                "se_code", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"payment_method_mapping_se_sl_autorizable", getElements("payment_method_mapping_se_sl_autorizable")},
                "Yes", "se_autorizable", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"payment_method_mapping_se_sl_enabled", getElements("payment_method_mapping_se_sl_enabled")},
                "Yes", "se_enabled", " on SEARCH")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"payment_method_mapping_se_b_search", getElements("payment_method_mapping_se_b_search")}, //search button
                new String[]{"payment_method_mapping_se_e_result", getElements("payment_method_mapping_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }

        return true;
    }
    private boolean Add_mapping(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN PAYMENT MAPPING MANAGEMENT", 3, false);

        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"payment_method_mapping_add_b_add", getElements("payment_method_mapping_add_b_add")}, //element to click
                new String[]{"payment_method_mapping_add_lov_provider", getElements("payment_method_mapping_add_lov_provider")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"payment_method_mapping_add_lov_provider", getElements("payment_method_mapping_add_lov_provider")}, // b_lov
                new String[]{"payment_method_mapping_add_i_provider", getElements("payment_method_mapping_add_i_provider")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "provider", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"payment_method_mapping_add_lov_ecp_payment_method_code", getElements("payment_method_mapping_add_lov_ecp_payment_method_code")}, // b_lov
                new String[]{"payment_method_mapping_add_i_ecp_payment_method_code", getElements("payment_method_mapping_add_i_ecp_payment_method_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "payment_method", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_add_i_psp_payment_method_code", getElements("payment_method_mapping_add_i_psp_payment_method_code")},
                "code", "PB1", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"payment_method_mapping_add_i_psp_payment_method_name", getElements("payment_method_mapping_add_i_psp_payment_method_name")},
                "name", "Prueba1", " on ADD")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("payment_method_mapping_add_chb_autorizable"), "autorizable", true, true, " on ADD")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("payment_method_mapping_add_cdb_enabled"), "enable", true, true, " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"payment_method_mapping_add_b_save", getElements("payment_method_mapping_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }

        return true;
    }


}
