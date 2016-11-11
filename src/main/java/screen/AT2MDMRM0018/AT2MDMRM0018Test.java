package screen.AT2MDMRM0018;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMRM0018Test {
    protected AT2MDMRM0018Locators locators;
    protected AT2MDMRM0018Data data;

    public AT2MDMRM0018Test() {
    }
    public AT2MDMRM0018Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0018Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0018Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0018Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Tabs Maintenance");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //TABS SCREEN
            //TABS TABLE
                if (!interaction_record_tabs_MDM(driver)) return false;
                if (!search_tabs_MDM(driver)) return false;
                if (!interaction_edit_tabs_MDM(driver)) return false;
                if (!qbe_tabs_MDM(driver)) return false;
                if (!others_actions_tabs_MDM(driver)) return false;
            //LANGUAGES TABLE
                if (!interaction_record_lang_MDM(driver)) return false;
                if (!interaction_edit_lang_MDM(driver)) return false;
                if (!qbe_lang_MDM(driver)) return false;
                if (!others_actions_lang_MDM(driver)) return false;
            //COUNTRIES TABLE
                if (!interaction_record_cntrs_MDM(driver)) return false;
                if (!delete_dstn_MDM(driver)) return false;
                if (!interaction_edit_cntrs_MDM(driver)) return false;
                if (!qbe_cntrs_MDM(driver)) return false;
                if (!others_actions_cntrs_MDM(driver)) return false;
            //DESTINATION TABLE
                if (!interaction_record_dstn_MDM(driver)) return false;
                if (!interaction_edit_dstn_MDM(driver)) return false;
                if (!qbe_dstn_MDM(driver)) return false;
                if (!others_actions_dstn_MDM(driver)) return false;
                if (!delete_dstn_MDM(driver)) return false;
            //COUNTRIES TABLE
                if (!delete_cntrs_MDM(driver)) return false;
            //LANGUAGE TABLE
                if (!delete_lang_MDM(driver)) return false;
            //CHANGE TAB
                if (!first_change_tab(driver)) return false;
        //CONFIGURATION SCREEN
            //CONFIGURATION TABLE
                if (!interaction_record_config_MDM(driver)) return false;
                if (!search_config_MDM(driver)) return false;
                if (!interaction_edit_config_MDM(driver)) return false;
                if (!qbe_config_MDM(driver)) return false;
                if (!others_actions_config_MDM(driver)) return false;
            //CONFIGURATIONS PER TABLE TABLE
                if (!interaction_record_tabconfig_MDM(driver)) return false;
                if (!interaction_edit_tabconfig_MDM(driver)) return false;
                if (!qbe_tabconfig_MDM(driver)) return false;
                if (!others_actions_tabconfig_MDM(driver)) return false;
                if (!delete_tabconfig_MDM(driver)) return false;
            //CONFIGURATION TABLE
                if (!delete_config_MDM(driver)) return false;
            //CHANGE TAB
                if (!second_change_tab(driver)) return false;
            //TABS TABLE
                if (!delete_tabs_MDM(driver)) return false;
                return false;
    }

    private boolean interaction_record_tabs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tabs_b_add", getElements("MDM_tabs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_tabs_e_code", getElements("add_tabs_e_code")}, // element path
                "tabs_code", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_name", getElements("add_tabs_i_name")}, // element path
                "tabs_name", getData("tabs_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_description", getElements("add_tabs_i_description")}, // element path
                "tabs_description", getData("tabs_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_image_detail", getElements("add_tabs_i_image_detail")}, // element path
                "tabs_image_detail", getData("tabs_image_detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_image_on", getElements("add_tabs_i_image_on")}, // element path
                "tabs_image_on", getData("tabs_image_on"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_image_off", getElements("add_tabs_i_image_off")}, // element path
                "tabs_image_off", getData("tabs_image_off"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tabs_b_save", getElements("add_tabs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_tabs_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_tabs_i_code", getElements("search_tabs_i_code")}, // element path
                "tabs_code", getData("tabs_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_tabs_i_name", getElements("search_tabs_i_name")}, // element path
                "tabs_name", getData("tabs_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_tabs_i_tab_description", getElements("search_tabs_i_tab_description")}, // element path
                "tabs_description", getData("tabs_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_tabs_i_image_detail", getElements("search_tabs_i_image_detail")}, // element path
                "tabs_image_detail", getData("tabs_image_detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_tabs_i_image_on", getElements("search_tabs_i_image_on")}, // element path
                "tabs_image_on", getData("tabs_image_on"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_tabs_i_image_off", getElements("search_tabs_i_image_off")}, // element path
                "tabs_image_off", getData("tabs_image_off"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_tabs_b_search", getElements("search_tabs_b_search")}, //search button
                new String[]{"MDM_tabs_e_result", getElements("MDM_tabs_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_tabs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tabs_b_edit", getElements("MDM_tabs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_name", getElements("add_tabs_i_name")}, // element path
                "tabs_name", getData("tabs_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_description", getElements("add_tabs_i_description")}, // element path
                "tabs_description", getData("tabs_description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_image_detail", getElements("add_tabs_i_image_detail")}, // element path
                "tabs_image_detail", getData("tabs_image_detail_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_image_on", getElements("add_tabs_i_image_on")}, // element path
                "tabs_image_on", getData("tabs_image_on_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabs_i_image_off", getElements("add_tabs_i_image_off")}, // element path
                "tabs_image_off", getData("tabs_image_off_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tabs_b_save", getElements("add_tabs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_tabs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_tabs_b_reset", getElements("search_tabs_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_tabs_b_qbe", getElements("MDM_tabs_b_qbe")},// query button
                new String[]{"qbe_tabs_i_code", getElements("qbe_tabs_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tabs_i_code", getElements("qbe_tabs_i_code")}, // element path
                "tabs_code", getData("tabs_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tabs_i_name", getElements("qbe_tabs_i_name")}, // element path
                "tabs_name", getData("tabs_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tabs_description", getElements("qbe_tabs_i_description")}, // element path
                "tabs_description", getData("tabs_description"), where)) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_tabs_i_code", getElements("qbe_tabs_i_code")}, //search button
                new String[]{"MDM_tabs_e_result", getElements("MDM_tabs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_tabs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_tabs_b_actions", getElements("MDM_tabs_b_actions")}, //actions button
                new String[]{"MDM_tabs_b_actions_audit_data", getElements("MDM_tabs_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_tabs_b_detach", getElements("MDM_tabs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_lang_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_lang_b_add", getElements("MDM_lang_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lang_lov_language",getElements("add_lang_lov_language")}, // b_lov
                new String[]{"add_lang_i_language", getElements("add_lang_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_lang_i_language_description", getElements("add_lang_i_language_description")}, // element path
                "lang_language_description", getData("lang_language_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_lang_b_save", getElements("add_lang_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_lang_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_lang_e_result", getElements("MDM_lang_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_lang_b_edit", getElements("MDM_lang_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lang_lov_language",getElements("add_lang_lov_language")}, // b_lov
                new String[]{"add_lang_i_language", getElements("add_lang_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_lang_i_language_description", getElements("add_lang_i_language_description")}, // element path
                "lang_language_description", getData("lang_language_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_lang_b_save", getElements("add_lang_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_lang_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_lang_b_qbe", getElements("MDM_lang_b_qbe")},// query button
                new String[]{"qbe_lang_i_language", getElements("qbe_lang_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_lang_i_language", getElements("qbe_lang_i_language")},
                "lang_language", getData("lang_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_lang_i_language_description", getElements("qbe_lang_i_language_description")},
                "lang_language_description", getData("lang_language_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_lang_i_language", getElements("qbe_lang_i_language")}, //search button
                new String[]{"MDM_lang_e_result", getElements("MDM_lang_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_lang_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_lang_b_actions", getElements("MDM_lang_b_actions")}, //actions button
                new String[]{"MDM_lang_b_actions_audit_data", getElements("MDM_lang_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_lang_b_detach", getElements("MDM_lang_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_add", getElements("MDM_cntrs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_cntrs_lov_country",getElements("add_cntrs_lov_country")}, // b_lov
                new String[]{"add_cntrs_i_country", getElements("add_cntrs_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cntrs_country", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cntrs_b_save", getElements("add_cntrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_edit", getElements("MDM_cntrs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_cntrs_lov_country",getElements("add_cntrs_lov_country")}, // b_lov
                new String[]{"add_cntrs_i_country", getElements("add_cntrs_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cntrs_country", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_cntrs_e_country_description", getElements("add_cntrs_e_country_description")}, // element path
                "cntrs_country_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cntrs_b_save", getElements("add_cntrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cntrs_b_qbe", getElements("MDM_cntrs_b_qbe")},// query button
                new String[]{"qbe_cntrs_i_country", getElements("qbe_cntrs_i_country")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_country", getElements("qbe_cntrs_i_country")},
                "cntrs_country", getData("cntrs_country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_country_description", getElements("qbe_cntrs_i_country_description")},
                "cntrs_country_description", getData("cntrs_country_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cntrs_i_country", getElements("qbe_cntrs_i_country")}, //search button
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_cntrs_b_actions", getElements("MDM_cntrs_b_actions")}, //actions button
                new String[]{"MDM_cntrs_b_actions_audit_data", getElements("MDM_cntrs_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cntrs_b_detach", getElements("MDM_cntrs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_dstn_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dstn_b_add", getElements("MDM_dstn_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_dstn_lov_destination",getElements("add_dstn_lov_destination")}, // b_lov
                new String[]{"add_dstn_i_destination", getElements("add_dstn_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dstn_destination", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dstn_b_save", getElements("add_dstn_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_dstn_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_dstn_e_result", getElements("MDM_dstn_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dstn_b_edit", getElements("MDM_dstn_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_dstn_lov_destination",getElements("add_dstn_lov_destination")}, // b_lov
                new String[]{"add_dstn_i_destination", getElements("add_dstn_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dstn_destination", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_dstn_e_destination_description", getElements("add_dstn_e_destination_description")}, // element path
                "dstn_destination_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dstn_b_save", getElements("add_dstn_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dstn_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dstn_b_qbe", getElements("MDM_dstn_b_qbe")},// query button
                new String[]{"qbe_dstn_i_destination", getElements("qbe_dstn_i_destination")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dstn_i_destination", getElements("qbe_dstn_i_destination")},
                "dstn_destination", getData("dstn_destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dstn_i_destination_description", getElements("qbe_dstn_i_destination_description")},
                "dstn_destination_description", getData("dstn_destination_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dstn_i_destination", getElements("qbe_dstn_i_destination")}, //search button
                new String[]{"MDM_dstn_e_result", getElements("MDM_dstn_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dstn_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dstn_b_actions", getElements("MDM_dstn_b_actions")}, //actions button
                new String[]{"MDM_dstn_b_actions_audit_data", getElements("MDM_dstn_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dstn_b_detach", getElements("MDM_dstn_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_dstn_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_dstn_e_result", getElements("MDM_dstn_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dstn_b_delete", getElements("MDM_dstn_b_delete")},
                new String[]{"MDM_dstn_e_records", getElements("MDM_dstn_e_records")},
                new String[]{"MDM_dstn_b_delete_ok", getElements("MDM_dstn_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_cntrs_b_delete", getElements("MDM_cntrs_b_delete")},
                new String[]{"MDM_cntrs_e_records", getElements("MDM_cntrs_e_records")},
                new String[]{"MDM_cntrs_b_delete_ok", getElements("MDM_cntrs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_lang_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_lang_b_delete", getElements("MDM_lang_b_delete")},
                new String[]{"MDM_lang_e_records", getElements("MDM_lang_e_records")},
                new String[]{"MDM_lang_b_delete_ok", getElements("MDM_lang_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_tabs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_tabs_b_delete", getElements("MDM_tabs_b_delete")},
                new String[]{"MDM_tabs_e_records", getElements("MDM_tabs_e_records")},
                new String[]{"MDM_tabs_b_delete_ok", getElements("MDM_tabs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean first_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_configuration", getElements("MDM_b_configuration")}, //element to click
                new String[]{"MDM_config_b_add", getElements("MDM_config_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_config_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_config_b_add", getElements("MDM_config_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_config_e_code", getElements("add_config_e_code")}, // element path
                "config_code", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_config_i_configurations_description", getElements("add_config_i_configurations_description")}, // element path
                "config_configuration_description", getData("config_configuration_description"), where)) {
            return false;
        }
        String list_options[] = {"Inactive", "Active"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_config_sl_status", getElements("add_config_sl_status")},
                option, "config_status", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_config_b_save", getElements("add_config_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_config_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_config_i_code", getElements("search_config_i_code")}, // element path
                "config_code", getData("config_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_config_i_configuration_description", getElements("search_config_i_configuration_description")}, // element path
                "config_configuration_description", getData("config_configuration_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_config_sl_status", getElements("search_config_i_status")},
                getData("config_status"), "config_status", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_configuration_b_search", getElements("search_configuration_b_search")}, //search button
                new String[]{"MDM_config_e_result", getElements("MDM_config_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_config_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_config_b_edit", getElements("MDM_config_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_config_i_configurations_description", getElements("add_config_i_configurations_description")}, // element path
                "config_configuration_description", getData("config_configuration_description_edit"), where)) {
            return false;
        }
        String list_options[] = {"Inactive", "Active"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_config_sl_status", getElements("add_config_sl_status")},
                option, "config_status", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_config_b_save", getElements("add_config_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_config_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_configuration_b_reset", getElements("search_configuration_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_config_b_qbe", getElements("MDM_config_b_qbe")},// query button
                new String[]{"qbe_config_i_code", getElements("qbe_config_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_config_i_code", getElements("qbe_config_i_code")}, // element path
                "config_code", getData("config_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_config_i_configurations_description", getElements("qbe_config_i_configurations_description")}, // element path
                "config_configuration_description", getData("config_configuration_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_config_sl_status", getElements("qbe_config_sl_status")},
                getData("config_status"), "config_status", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_config_i_code", getElements("qbe_config_i_code")}, //search button
                new String[]{"MDM_config_e_result", getElements("MDM_config_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_config_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_config_b_actions", getElements("MDM_config_b_actions")}, //actions button
                new String[]{"MDM_config_b_actions_audit_data", getElements("MDM_config_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_config_b_detach", getElements("MDM_config_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_tabconfig_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tabconfig_b_add", getElements("MDM_tabconfig_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_tabconfig_lov_tab",getElements("add_tabconfig_lov_tab")}, // b_lov
                new String[]{"add_tabconfig_i_tab", getElements("add_tabconfig_i_tab")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tabconfig_tab", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabconfig_i_order", getElements("add_tabconfig_i_order")}, // element path
                "tabconfig_order", getData("tabconfig_order"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tabconfig_b_save", getElements("add_tabconfig_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_tabconfig_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_tabconfig_e_result", getElements("MDM_tabconfig_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tabconfig_b_edit", getElements("MDM_tabconfig_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_tabconfig_lov_tab",getElements("add_tabconfig_lov_tab")}, // b_lov
                new String[]{"add_tabconfig_i_tab", getElements("add_tabconfig_i_tab")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tabconfig_tab", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_tabconfig_e_tabconfiguration_description", getElements("add_tabconfig_e_tabconfiguration_description")}, // element path
                "tabconfig_tabconfiguration_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_tabconfig_i_order", getElements("add_tabconfig_i_order")}, // element path
                "tabconfig_order", getData("tabconfig_order_edit"), where)) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tabconfig_b_save", getElements("add_tabconfig_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_tabconfig_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_tabconfig_b_qbe", getElements("MDM_tabconfig_b_qbe")},// query button
                new String[]{"qbe_tabconfig_i_tab", getElements("qbe_tabconfig_i_tab")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tabconfig_i_tab", getElements("qbe_tabconfig_i_tab")}, // element path
                "tabconfig_tab", getData("tabconfig_tab"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tabconfig_i_tabconfiguration_description", getElements("qbe_tabconfig_i_tabconfiguration_description")}, // element path
                "tabconfig_tabconfiguration_description", getData("tabconfig_tabconfiguration_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tabconfig_i_order", getElements("qbe_tabconfig_i_order")}, // element path
                "tabconfig_order", getData("tabconfig_order"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_tabconfig_i_tab", getElements("qbe_tabconfig_i_tab")}, //search button
                new String[]{"MDM_tabconfig_e_result", getElements("MDM_tabconfig_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_tabconfig_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_tabconfig_b_actions", getElements("MDM_tabconfig_b_actions")}, //actions button
                new String[]{"MDM_tabconfig_b_actions_audit_data", getElements("MDM_tabconfig_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_tabconfig_b_detach", getElements("MDM_tabconfig_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_tabconfig_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_tabconfig_b_delete", getElements("MDM_tabconfig_b_delete")},
                new String[]{"MDM_tabconfig_e_records", getElements("MDM_tabconfig_e_records")},
                new String[]{"MDM_tabconfig_b_delete_ok", getElements("MDM_tabconfig_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_config_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_config_b_delete", getElements("MDM_config_b_delete")},
                new String[]{"MDM_config_e_records", getElements("MDM_config_e_records")},
                new String[]{"MDM_config_b_delete_ok", getElements("MDM_config_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean second_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_tabs", getElements("MDM_b_tabs")}, //element to click
                new String[]{"MDM_tabs_b_add", getElements("MDM_tabs_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
}