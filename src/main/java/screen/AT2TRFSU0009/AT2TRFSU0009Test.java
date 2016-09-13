package screen.AT2TRFSU0009;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;


/**
 * Created by vsolis on 12/09/2016.
 */
public class AT2TRFSU0009Test {


    protected AT2TRFSU0009Locators locators;
    protected AT2TRFSU0009Data data;

    public AT2TRFSU0009Test() {

    }

    public AT2TRFSU0009Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0009Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0009Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0009Data data) {
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


        if (!transfer_day(driver)) {
            return false;
        }

        return false;
    }

    private boolean transfer_day(TestDriver driver) {

        if (!Add_transfer_day(driver)) {
            return false;
        }

        if (!Search_transfer_day(driver)) {
            return false;
        }

        if (!Edit_transfer_day(driver)) {
            return false;
        }

        if (!Qbe_transfer_day(driver)) {
            return false;
        }

        if (!Other_actions_transfer_day(driver)) {
            return false;
        }

        if (!Delete_transfer_day(driver)) {
            return false;
        }

        return true;
    }

    private boolean Delete_transfer_day(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN TRANSFER DAY", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"transfer_day_del_b_delete", getElements("transfer_day_del_b_delete")},
                new String[]{"transfer_day_records", getElements("transfer_day_records")},
                new String[]{"transfer_day_del_b_ok", getElements("transfer_day_del_b_ok")},
                " on DELETE")) {
            return false;
        }


        return true;
    }

    private boolean Other_actions_transfer_day(TestDriver driver) {


        driver.getReport().addHeader("OTHER ACTIONS IN TRANSFER DAY", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"transfer_day_ac_b_actions", getElements("transfer_day_ac_b_actions")}, //actions button
                new String[]{"transfer_day_ac_b_audit_data", getElements("transfer_day_ac_b_audit_data")}, //audit button
                new String[]{"transfer_day_ac_b_auidit_data_exit", getElements("transfer_day_ac_b_auidit_data_exit")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"transfer_day_b_detach", getElements("transfer_day_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean Qbe_transfer_day(TestDriver driver) {
        driver.getReport().addHeader(" QBE IN TRANSFER DAY", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"transfer_day_se_b_reset", getElements("transfer_day_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }


        if (!Functions.clickQbE(driver,
                new String[]{"transfer_day_qbe_b_qbe", getElements("transfer_day_qbe_b_qbe")},// query button
                new String[]{"transfer_day_qbe_select_text_active", getElements("transfer_day_qbe_select_text_active")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"transfer_day_qbe_select_text_active", getElements("transfer_day_qbe_select_text_active")},
                "No", "qbe_select_no", " on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_cod_company", getElements("transfer_day_qbe_cod_company")},
                "qbe_i_company", data.getData().get("add_lov_company"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_cod_office", getElements("transfer_day_qbe_cod_office")},
                "qbe_i_office", data.getData().get("add_lov_office"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_i_office_description", getElements("transfer_day_qbe_i_office_description")},
                "qbe_i_description", data.getData().get("add_ofice_description"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_i_date_from", getElements("transfer_day_qbe_i_date_from")},
                "qbe_i_date_from", data.getData().get("add_date_from"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_i_date_to", getElements("transfer_day_qbe_i_date_to")},
                "qbe_i_date_to", data.getData().get("add_date_to"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_i_time", getElements("transfer_day_qbe_i_time")},
                "qbe_i_time", data.getData().get("add_time"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_day_qbe_i_remarks", getElements("transfer_day_qbe_i_remarks")},
                "qbe_i_remarks", data.getData().get("add_remarks"), " on QBE ")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"transfer_day_qbe_cod_office", getElements("transfer_day_qbe_cod_office")}, //search button
                new String[]{"transfer_day_se_b_result", getElements("transfer_day_se_b_result")}, //result element
                " on QBE")) {
            return false;
        }


        return true;
    }

    private boolean Edit_transfer_day(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN TRANSFER DAY", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"transfer_day_ed_b_edit", getElements("transfer_day_ed_b_edit")}, //element to click
                new String[]{"transfer_day_ed_check_box_active", getElements("transfer_day_ed_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("transfer_day_ed_check_box_active"), "active", false, true, " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_day_ed_lov_company", getElements("transfer_day_ed_lov_company")}, // b_lov
                new String[]{"transfer_day_ed_i_company_code", getElements("transfer_day_ed_i_company_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_lov_company", //Data name
                " on EDIT")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"transfer_day_ed_i_description", getElements("transfer_day_ed_i_description")}, // element path
                "add_company_description", // key for data value (the name)
                " on EDIT");

        if (!Functions.createLov(driver,
                new String[]{"transfer_day_ed_lov_office", getElements("transfer_day_ed_lov_office")}, // b_lov
                new String[]{"transfer_day_ed_i_office_code", getElements("transfer_day_ed_i_office_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_lov_office", //Data name
                " on EDIT")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"transfer_day_ed_i_office_description", getElements("transfer_day_ed_i_office_description")}, // element path
                "add_ofice_description", // key for data value (the name)
                " on EDIT");

        if (!Functions.insertInput(driver, new String[]{"transfer_day_ed_i_date_from", getElements("transfer_day_ed_i_date_from")},
                "add_date_from", DataGenerator.getRelativeDateToday("ddMMyyyy", 0, DataGenerator.random(-6, -3), 0), " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_ed_i_date_to", getElements("transfer_day_ed_i_date_to")},
                "add_date_to", DataGenerator.getRelativeDateToday("ddMMyyyy", 0, DataGenerator.random(3, 6), 0), " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_ed_i_time", getElements("transfer_day_ed_i_time")},
                "add_time", "15:50", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_ed_i_remarks", getElements("transfer_day_ed_i_remarks")},
                "add_remarks", "Prueba2", " on EDIT")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"transfer_day_ed_selec_text_ind", getElements("transfer_day_ed_selec_text_ind")},
                "Departure", "add_select_tipo", " on EDIT")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"transfer_day_ed_b_save", getElements("transfer_day_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }

        return true;
    }

    private boolean Search_transfer_day(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN TRANSFRE DAR", 3, false);


        if (!Functions.selectText(driver,
                new String[]{"transfer_day_se_select_text_active", getElements("transfer_day_se_select_text_active")},
                "Yes", "se_select_yes", " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_day_se_lov_company", getElements("transfer_day_se_lov_company")}, //LoV button
                new String[]{"transfer_day_se_i_company", getElements("transfer_day_se_i_company")}, //external LoV input
                new String[]{"transfer_day_se_i_company_code", getElements("transfer_day_se_i_company_code")}, //internal LoV input
                data.getData().get("add_lov_company"), // value to search
                "se_lov_company", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_day_se_lov_offce", getElements("transfer_day_se_lov_offce")}, //LoV button
                new String[]{"transfer_day_se_i_office", getElements("transfer_day_se_i_office")}, //external LoV input
                new String[]{"transfer_day_se_i_office_code", getElements("transfer_day_se_i_office_code")}, //internal LoV input
                data.getData().get("add_lov_office"), // value to search
                "se_lov_office", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_se_i_date_form", getElements("transfer_day_se_i_date_form")},
                "se_date_from", data.getData().get("add_date_from"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_se_i_date_to", getElements("transfer_day_se_i_date_to")},
                "se_date_to", data.getData().get("add_date_to"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_se_i_time", getElements("transfer_day_se_i_time")},
                "se_time", data.getData().get("add_time"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"transfer_day_se_search", getElements("transfer_day_se_search")}, //search button
                new String[]{"transfer_day_se_b_result", getElements("transfer_day_se_b_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }
        return true;
    }

    private boolean Add_transfer_day(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN TRANSFER DAY", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"transfer_day_ad_b_add", getElements("transfer_day_ad_b_add")}, //element to click
                new String[]{"transfer_day_ad_check_box_active", getElements("transfer_day_ad_check_box_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("transfer_day_ad_check_box_active"), "active", true, true, " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_day_ad_lov_company", getElements("transfer_day_ad_lov_company")}, // b_lov
                new String[]{"transfer_day_ad_i_company_code", getElements("transfer_day_ad_i_company_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_lov_company", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"transfer_day_ad_i_description", getElements("transfer_day_ad_i_description")}, // element path
                "add_company_description", // key for data value (the name)
                " on ADD");

        if (!Functions.createLov(driver,
                new String[]{"transfer_day_ad_lov_office", getElements("transfer_day_ad_lov_office")}, // b_lov
                new String[]{"transfer_day_ad_i_office_code", getElements("transfer_day_ad_i_office_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "add_lov_office", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"transfer_day_ad_i_office_descriptoin", getElements("transfer_day_ad_i_office_descriptoin")}, // element path
                "add_ofice_description", // key for data value (the name)
                " on ADD");

        if (!Functions.insertInput(driver, new String[]{"transfer_day_ad_i_date_from", getElements("transfer_day_ad_i_date_from")},
                "add_date_from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-5, -2), 0), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_ad_i_date_to", getElements("transfer_day_ad_i_date_to")},
                "add_date_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 5), 0), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_ad_i_time", getElements("transfer_day_ad_i_time")},
                "add_time", "15:46", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"transfer_day_ad_i_remarks", getElements("transfer_day_ad_i_remarks")},
                "add_remarks", "Prueba1", " on ADD")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"transfer_day_ad_selec_text_ind", getElements("transfer_day_ad_selec_text_ind")},
                "Arrival", "add_select_tipo", " on ADD")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"transfer_day_ad_b_save", getElements("transfer_day_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }


}
