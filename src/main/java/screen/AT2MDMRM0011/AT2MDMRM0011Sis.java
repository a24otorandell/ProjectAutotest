package screen.AT2MDMRM0011;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMRM0011Sis {
    protected AT2MDMRM0011Locators locators;
    protected AT2MDMRM0011Data data;

    public AT2MDMRM0011Sis() {
    }
    public AT2MDMRM0011Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0011Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0011Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0011Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("IDWEB");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!id_interaction_record_MDM(driver)) return false;
        if (!pbcc_interaction_record_MDM(driver)) return false;
        if (!pbcc_qbe_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!id_interaction_edit_MDM(driver)) return false;
        if (!id_qbe_MDM(driver)) return false;
        if (!id_others_actions_MDM(driver)) return false;
        if (!pbcc_interaction_edit_MDM(driver)) return false;
        if (!pbcc_qbe_MDM(driver)) return false;
        if (!pbcc_others_actions_MDM(driver)) return false;
        if (!pbcc_delete_MDM(driver)) return false;
        if (!id_delete_MDM(driver)) return false;
        return false;
    }

    private boolean id_interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_id_b_add", getElements("MDM_id_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_id_e_id", getElements("add_id_e_id")}, // element path
                "id", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_name", getElements("add_id_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_url", getElements("add_id_i_url")}, // element path
                "url", getData("url"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_url_form", getElements("add_id_i_url_form")}, // element path
                "url_form", getData("url_form"), where)) {
            return false;
        }
        String list_options[] = {"A","X"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_id_sl_std", getElements("add_id_sl_std")},
                option, "std", where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_id_lov_brand",getElements("add_id_lov_brand")}, // b_lov
                new String[]{"add_id_i_brand", getElements("add_id_i_brand")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "brand", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_id_e_brand_description", getElements("add_id_e_brand_description")}, // element path
                "brand_description", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_id_lov_id_web",getElements("add_id_lov_id_web")}, // b_lov
                new String[]{"add_id_i_id_web", getElements("add_id_i_id_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "id_web", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_web_code", getElements("add_id_i_web_code")}, // element path
                "web_code", getData("web_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_send_days_costs_cancellation", getElements("add_id_i_send_days_costs_cancellation")}, // element path
                "send_days_costs_cancellation", getData("send_days_costs_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_days_send_previous_days_costs_cancellation", getElements("add_id_i_days_send_previous_days_costs_cancellation")}, // element path
                "days_send_previous_days_costs_cancellation", getData("days_send_previous_days_costs_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_days_previous_to_first_send_cancellation", getElements("add_id_i_days_previous_to_first_send_cancellation")}, // element path
                "days_previous_to_first_send_cancellation", getData("days_previous_to_first_send_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_description", getElements("add_id_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_id_b_save", getElements("add_id_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean pbcc_interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_id_e_result", getElements("MDM_id_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_pbcc_b_add", getElements("MDM_pbcc_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_pbcc_i_application_date", getElements("add_pbcc_i_application_date")}, // element path
                "application_date", getData("application_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_pbcc_i_interface", getElements("add_pbcc_i_interface")}, // element path
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_pbcc_i_number_of_days_previous_cancel_prepayment", getElements("add_pbcc_i_number_of_days_previous_cancel_prepayment")}, // element path
                "number_of_days_previous_cancel_prepayment", getData("number_of_days_previous_cancel_prepayment"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_pbcc_b_save", getElements("add_pbcc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_id", getElements("search_i_id")}, // element path
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_name", getElements("search_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_url", getElements("search_i_url")}, // element path
                "url", getData("url"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_url_form", getElements("search_i_url_form")}, // element path
                "url_form", getData("url_form"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_std", getElements("search_sl_std")},
                getData("std"), "std", where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_brand", getElements("search_lov_brand")}, //LoV button
                new String[]{"search_i_brand", getElements("search_i_brand")}, //external LoV input
                new String[]{"search_lov_brand_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("brand"), // value to search
                "brand", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_brand_description", getElements("search_i_brand_description")}, // element path
                "brand_description", getData("brand_description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_id_web", getElements("search_lov_id_web")}, //LoV button
                new String[]{"search_i_id_web", getElements("search_i_id_web")}, //external LoV input
                new String[]{"search_lov_id_web_i_code", recursiveXPaths.lov_i_altgenericinput2}, //internal LoV input
                getData("id_web"), // value to search
                "id_web", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_web_code", getElements("search_i_web_code")}, // element path
                "web_code", getData("web_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_send_days_costs_cancellation", getElements("search_i_send_days_costs_cancellation")}, // element path
                "send_days_costs_cancellation", getData("send_days_costs_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_days_send_previous_days_costs_cancellation", getElements("search_i_days_send_previous_days_costs_cancellation")}, // element path
                "days_send_previous_days_costs_cancellation", getData("days_send_previous_days_costs_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_days_previous_to_first_send_cancellation", getElements("search_i_days_previous_to_first_send_cancellation")}, // element path
                "days_previous_to_first_send_cancellation", getData("days_previous_to_first_send_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_id_e_result", getElements("MDM_id_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean id_interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_id_b_edit", getElements("MDM_id_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_name", getElements("add_id_i_name")}, // element path
                "name", getData("name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_url", getElements("add_id_i_url")}, // element path
                "url", getData("url_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_url_form", getElements("add_id_i_url_form")}, // element path
                "url_form", getData("url_form_edit"), where)) {
            return false;
        }
        String list_options[] = {"A","X"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_id_sl_std", getElements("add_id_sl_std")},
                option, "std", where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_id_lov_brand",getElements("add_id_lov_brand")}, // b_lov
                new String[]{"add_id_i_brand", getElements("add_id_i_brand")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "brand", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_id_e_brand_description", getElements("add_id_e_brand_description")}, // element path
                "brand_description", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_id_lov_id_web",getElements("add_id_lov_id_web")}, // b_lov
                new String[]{"add_id_i_id_web", getElements("add_id_i_id_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "id_web", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_web_code", getElements("add_id_i_web_code")}, // element path
                "web_code", getData("web_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_send_days_costs_cancellation", getElements("add_id_i_send_days_costs_cancellation")}, // element path
                "send_days_costs_cancellation", getData("send_days_costs_cancellation_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_days_send_previous_days_costs_cancellation", getElements("add_id_i_days_send_previous_days_costs_cancellation")}, // element path
                "days_send_previous_days_costs_cancellation", getData("days_send_previous_days_costs_cancellation_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_days_previous_to_first_send_cancellation", getElements("add_id_i_days_previous_to_first_send_cancellation")}, // element path
                "days_previous_to_first_send_cancellation", getData("days_previous_to_first_send_cancellation_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_id_i_description", getElements("add_id_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_id_b_save", getElements("add_id_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean id_qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_id_b_qbe", getElements("MDM_id_b_qbe")},// query button
                new String[]{"qbe_id_i_id", getElements("qbe_id_i_id")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_id", getElements("qbe_id_i_id")},
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_name", getElements("qbe_id_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_url", getElements("qbe_id_i_url")},
                "url", getData("url"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_url_form", getElements("qbe_id_i_url_form")},
                "url_form", getData("url_form"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_id_sl_std", getElements("qbe_id_sl_std")},
                getData("std"), "std", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_brand", getElements("qbe_id_i_brand")},
                "brand", getData("brand"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_brand_description", getElements("qbe_id_i_brand_description")},
                "brand_description", getData("brand_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_id_web", getElements("qbe_id_i_id_web")},
                "id_web", getData("id_web"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_web_code", getElements("qbe_id_i_web_code")},
                "web_code", getData("web_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_send_days_costs_cancellation", getElements("qbe_id_i_send_days_costs_cancellation")},
                "send_days_costs_cancellation", getData("send_days_costs_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_days_send_previous_days_costs_cancellation", getElements("qbe_id_i_days_send_previous_days_costs_cancellation")},
                "days_send_previous_days_costs_cancellation", getData("days_send_previous_days_costs_cancellation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_id_i_days_previous_to_first_send_cancellation", getElements("qbe_id_i_days_previous_to_first_send_cancellation")},
                "days_previous_to_first_send_cancellation", getData("days_previous_to_first_send_cancellation"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_id_i_id", getElements("qbe_id_i_id")}, //search button
                new String[]{"MDM_id_e_result", getElements("MDM_id_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean id_others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_id_b_actions", getElements("MDM_id_b_actions")}, //actions button
                new String[]{"MDM_id_b_actions_audit_data", getElements("MDM_id_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_id_b_detach", getElements("MDM_id_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean pbcc_interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_pbcc_e_result", getElements("MDM_pbcc_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_pbcc_b_edit", getElements("MDM_pbcc_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_pbcc_i_application_date", getElements("add_pbcc_i_application_date")}, // element path
                "application_date", getData("application_date_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_pbcc_i_interface", getElements("add_pbcc_i_interface")}, // element path
                "interface", getData("interface_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_pbcc_i_number_of_days_previous_cancel_prepayment", getElements("add_pbcc_i_number_of_days_previous_cancel_prepayment")}, // element path
                "number_of_days_previous_cancel_prepayment", getData("number_of_days_previous_cancel_prepayment_edit"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_pbcc_b_save", getElements("add_pbcc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean pbcc_qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 6, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_pbcc_b_qbe", getElements("MDM_pbcc_b_qbe")},// query button
                new String[]{"qbe_pbcc_i_application_date", getElements("qbe_pbcc_i_application_date")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_pbcc_i_application_date", getElements("qbe_pbcc_i_application_date")},
                "application_date", getData("application_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_pbcc_i_interface", getElements("qbe_pbcc_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_pbcc_i_number_of_days_previous_cancel_prepayment", getElements("qbe_pbcc_i_number_of_days_previous_cancel_prepayment")},
                "number_of_days_previous_cancel_prepayment", getData("number_of_days_previous_cancel_prepayment"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_pbcc_i_application_date", getElements("qbe_pbcc_i_application_date")}, //search button
                new String[]{"MDM_pbcc_e_result", getElements("MDM_pbcc_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean pbcc_others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_pbcc_b_actions", getElements("MDM_pbcc_b_actions")}, //actions button
                new String[]{"MDM_pbcc_b_actions_audit_data", getElements("MDM_pbcc_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", getElements("MDM_id_b_actions_audit_data_ok")}, //audit_b_ok
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_pbcc_b_detach", getElements("MDM_pbcc_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean pbcc_delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_pbcc_b_delete", getElements("MDM_pbcc_b_delete")}, //button delete
                new String[]{"MDM_pbcc_e_records", getElements("MDM_pbcc_e_records")}, // result
                new String[]{"MDM_pbcc_b_delete_ok", getElements("MDM_pbcc_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean id_delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_id_b_delete", getElements("MDM_id_b_delete")}, //button delete
                new String[]{"MDM_id_e_records", getElements("MDM_id_e_records")}, // result
                new String[]{"MDM_id_b_delete_ok", getElements("MDM_id_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
