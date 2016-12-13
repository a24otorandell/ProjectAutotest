package screen.AT2MDMRM0017;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import java.util.Random;

/**
 * Created by jmrios on 13/12/2016.
 */

public class AT2MDMRM0017Test {
    protected AT2MDMRM0017Locators locators;
    protected AT2MDMRM0017Data data;

    public AT2MDMRM0017Test() {
    }
    public AT2MDMRM0017Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0017Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0017Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0017Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("HB Labels Maintenance");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //HB LABELS MAINTENANCE
        if (!interaction_record_hblabels_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_hblabels_MDM(driver)) return false;
        if (!qbe_hblabels_MDM(driver)) return false;
        if (!others_actions_hblabels_MDM(driver)) return false;
        //DICTIONARY
        if (!interaction_record_dct_MDM(driver)) return false;
        if (!qbe_dct_MDM(driver)) return false;
        if (!interaction_edit_dct_MDM(driver)) return false;
        if (!qbe_dct_MDM(driver)) return false;
        if (!others_actions_dct_MDM(driver)) return false;
        //DICTIONARY MULTI-LANGUAGES
        if (!interaction_record_dmulti_MDM(driver)) return false;
        if (!qbe_dmulti_MDM(driver)) return false;
        if (!interaction_edit_dmulti_MDM(driver)) return false;
        if (!qbe_dmulti_MDM(driver)) return false;
        if (!others_actions_dmulti_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_change_tab(driver)) return false;
        //HELP
        if (!interaction_record_hlp_MDM(driver)) return false;
        if (!qbe_hlp_MDM(driver)) return false;
        if (!interaction_edit_hlp_MDM(driver)) return false;
        if (!qbe_hlp_MDM(driver)) return false;
        if (!others_actions_hlp_MDM(driver)) return false;
        //HELP MULTI-LANGUAGES
        if (!interaction_record_hmulti_MDM(driver)) return false;
        if (!qbe_hmulti_MDM(driver)) return false;
        if (!interaction_edit_hmulti_MDM(driver)) return false;
        if (!qbe_hmulti_MDM(driver)) return false;
        if (!others_actions_hmulti_MDM(driver)) return false;
        //CHANGE TAB
        if (!second_change_tab(driver)) return false;
        //BANNER
        if (!interaction_record_bnnr_MDM(driver)) return false;
        if (!qbe_bnnr_MDM(driver)) return false;
        if (!interaction_edit_bnnr_MDM(driver)) return false;
        if (!qbe_bnnr_MDM(driver)) return false;
        if (!others_actions_bnnr_MDM(driver)) return false;
        //CHANGE TAB
        if (!third_change_tab(driver)) return false;
        //HEADER
        if (!interaction_record_hdr_MDM(driver)) return false;
        if (!qbe_hdr_MDM(driver)) return false;
        if (!interaction_edit_hdr_MDM(driver)) return false;
        if (!qbe_hdr_MDM(driver)) return false;
        if (!others_actions_hdr_MDM(driver)) return false;
        //HEADER MULTI-LANGUAGES
        if (!interaction_record_hdmulti_MDM(driver)) return false;
        if (!qbe_hdmulti_MDM(driver)) return false;
        if (!interaction_edit_hdmulti_MDM(driver)) return false;
        if (!qbe_hdmulti_MDM(driver)) return false;
        if (!others_actions_hdmulti_MDM(driver)) return false;
        if (!delete_hdmulti_MDM(driver)) return false;
        //HEADER
        if (!delete_hdr_MDM(driver)) return false;
        //CHANGE TAB
        if (!second_change_tab(driver)) return false;
        //BANNER
        if (!delete_bnnr_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_change_tab(driver)) return false;
        //HELP MULTI-LANGUAGES
        if (!delete_hmulti_MDM(driver)) return false;
        //HELP
        if (!delete_hlp_MDM(driver)) return false;
        //CHANGE TAB
        if (!fourth_change_tab(driver)) return false;
        //DICTIONARY MULTI-LANGUAGES
        if (!delete_dmulti_MDM(driver)) return false;
        //DICTIONARY
        if (!delete_dct_MDM(driver)) return false;
        //HB LABELS MAINTENANCE
        if (!delete_hblabels_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_hblabels_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hblabels_b_add", getElements("MDM_hblabels_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hblabels_i_page", getElements("add_hblabels_i_page")}, // element path
                "page", getData("page"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hblabels_i_description", getElements("add_hblabels_i_description")}, // element path
                "hblabels_description", getData("hblabels_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hblabels_b_save", getElements("add_hblabels_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_page", getElements("search_i_page")}, // element path
                "page", getData("page"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "hblabels_description", getData("hblabels_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_hblabels_e_result", getElements("MDM_hblabels_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hblabels_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hblabels_b_edit", getElements("MDM_hblabels_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hblabels_i_page", getElements("add_hblabels_i_page")}, // element path
                "page", getData("page_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hblabels_i_description", getElements("add_hblabels_i_description")}, // element path
                "hblabels_description", getData("hblabels_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hblabels_b_save", getElements("add_hblabels_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hblabels_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hblabels_b_qbe", getElements("MDM_hblabels_b_qbe")},// query button
                new String[]{"qbe_hblabels_i_page", getElements("qbe_hblabels_i_page")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hblabels_i_page", getElements("qbe_hblabels_i_page")}, // element path
                "page", getData("page"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hblabels_i_description", getElements("qbe_hblabels_i_description")}, // element path
                "hblabels_description", getData("hblabels_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hblabels_i_page", getElements("qbe_hblabels_i_page")}, //search button
                new String[]{"MDM_hblabels_e_result", getElements("MDM_hblabels_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hblabels_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_hblabels_b_actions", getElements("MDM_hblabels_b_actions")}, //actions button
                new String[]{"MDM_hblabels_b_actions_audit_data", getElements("MDM_hblabels_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hblabels_b_detach", getElements("MDM_hblabels_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_dct_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dct_b_add", getElements("MDM_dct_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dct_i_code", getElements("add_dct_i_code")}, // element path
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dct_b_save", getElements("add_dct_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_dct_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dct_b_edit", getElements("MDM_dct_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dct_i_code", getElements("add_dct_i_code")}, // element path
                "code", getData("code_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dct_b_save", getElements("add_dct_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dct_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dct_b_qbe", getElements("MDM_dct_b_qbe")},// query button
                new String[]{"qbe_dct_i_code", getElements("qbe_dct_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dct_i_code", getElements("qbe_dct_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dct_i_code", getElements("qbe_dct_i_code")}, //search button
                new String[]{"MDM_dct_e_result", getElements("MDM_dct_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dct_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dct_b_actions", getElements("MDM_dct_b_actions")}, //actions button
                new String[]{"MDM_dct_b_actions_audit_data", getElements("MDM_dct_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dct_b_detach", getElements("MDM_dct_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_dmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dmulti_b_add", getElements("MDM_dmulti_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_dmulti_lov_language",getElements("add_dmulti_lov_language")}, // b_lov
                new String[]{"add_dmulti_i_language", getElements("add_dmulti_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dmulti_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dmulti_i_description", getElements("add_dmulti_i_description")}, // element path
                "dmulti_description", getData("dmulti_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dmulti_b_save", getElements("add_dmulti_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_dmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dmulti_b_edit", getElements("MDM_dmulti_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_dmulti_lov_language",getElements("add_dmulti_lov_language")}, // b_lov
                new String[]{"add_dmulti_i_language", getElements("add_dmulti_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dmulti_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dmulti_i_description", getElements("add_dmulti_i_description")}, // element path
                "dmulti_description", getData("dmulti_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dmulti_b_save", getElements("add_dmulti_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dmulti_b_qbe", getElements("MDM_dmulti_b_qbe")},// query button
                new String[]{"qbe_dmulti_i_language", getElements("qbe_dmulti_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dmulti_i_language", getElements("qbe_dmulti_i_language")},
                "dmulti_language", getData("dmulti_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dmulti_i_description", getElements("qbe_dmulti_i_description")},
                "dmulti_description", getData("dmulti_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dmulti_i_language", getElements("qbe_dmulti_i_language")}, //search button
                new String[]{"MDM_dmulti_e_result", getElements("MDM_dmulti_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dmulti_b_actions", getElements("MDM_dmulti_b_actions")}, //actions button
                new String[]{"MDM_dmulti_b_actions_audit_data", getElements("MDM_dmulti_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dmulti_b_detach", getElements("MDM_dmulti_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean first_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_help", getElements("MDM_b_help")}, //element to click
                new String[]{"MDM_hlp_b_add", getElements("MDM_hlp_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_hlp_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hlp_b_add", getElements("MDM_hlp_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hlp_i_detail", getElements("add_hlp_i_detail")}, // element path
                "detail", getData("detail"), where)) {
            return false;
        }
        String list_options[] = {"Description", "image", "text"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_hlp_sl_type", getElements("add_hlp_sl_type")},
                list_options, "type", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hlp_b_save", getElements("add_hlp_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hlp_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hlp_b_edit", getElements("MDM_hlp_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hlp_i_detail", getElements("add_hlp_i_detail")}, // element path
                "detail", getData("detail_edit"), where)) {
            return false;
        }
        String list_options[] = {"Description", "image", "text"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_hlp_sl_type", getElements("add_hlp_sl_type")},
                list_options, "type", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hlp_b_save", getElements("add_hlp_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hlp_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hlp_b_qbe", getElements("MDM_hlp_b_qbe")},// query button
                new String[]{"qbe_hlp_i_detail", getElements("qbe_hlp_i_detail")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hlp_i_detail", getElements("qbe_hlp_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_hlp_sl_type",getElements("qbe_hlp_sl_type")},
                getData("type"), "type",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hlp_i_detail", getElements("qbe_hlp_i_detail")}, //search button
                new String[]{"MDM_hlp_e_result", getElements("MDM_hlp_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hlp_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_hlp_b_actions", getElements("MDM_hlp_b_actions")}, //actions button
                new String[]{"MDM_hlp_b_actions_audit_data", getElements("MDM_hlp_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hmulti_b_detach_show", getElements("MDM_hmulti_b_detach_show")}, //element to click
                new String[]{"MDM_hmulti_b_detach", getElements("MDM_hmulti_b_detach")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hlp_b_detach", getElements("MDM_hlp_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_hmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hmulti_b_add", getElements("MDM_hmulti_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_hmulti_lov_language",getElements("add_hmulti_lov_language")}, // b_lov
                new String[]{"add_hmulti_i_language", getElements("add_hmulti_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hmulti_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hmulti_i_concept", getElements("add_hmulti_i_concept")}, // element path
                "hmulti_concept", getData("hmulti_concept"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hmulti_i_description", getElements("add_hmulti_i_description")}, // element path
                "hmulti_description", getData("hmulti_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hmulti_b_save", getElements("add_hmulti_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hmulti_b_edit", getElements("MDM_hmulti_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_hmulti_lov_language",getElements("add_hmulti_lov_language")}, // b_lov
                new String[]{"add_hmulti_i_language", getElements("add_hmulti_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hmulti_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hmulti_i_concept", getElements("add_hmulti_i_concept")}, // element path
                "hmulti_concept", getData("hmulti_concept_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hmulti_i_description", getElements("add_hmulti_i_description")}, // element path
                "hmulti_description", getData("hmulti_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hmulti_b_save", getElements("add_hmulti_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hmulti_b_qbe", getElements("MDM_hmulti_b_qbe")},// query button
                new String[]{"qbe_hmulti_i_language", getElements("qbe_hmulti_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hmulti_i_language", getElements("qbe_hmulti_i_language")},
                "hmulti_language", getData("hmulti_language"), where)) {
            return false;
        } if (!Functions.insertInput(driver, new String[]{"qbe_hmulti_i_concept", getElements("qbe_hmulti_i_concept")},
                "hmulti_concept", getData("hmulti_concept"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hmulti_i_description", getElements("qbe_hmulti_i_description")},
                "hmulti_description", getData("hmulti_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hmulti_i_language", getElements("qbe_hmulti_i_language")}, //search button
                new String[]{"MDM_hmulti_e_result", getElements("MDM_hmulti_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_hmulti_b_actions", getElements("MDM_hmulti_b_actions")}, //actions button
                new String[]{"MDM_hmulti_b_actions_audit_data", getElements("MDM_hmulti_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hmulti_b_detach", getElements("MDM_hmulti_b_detach")}, //detach button
                true,     //screenshot??
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
                new String[]{"MDM_b_banner", getElements("MDM_b_banner")}, //element to click
                new String[]{"MDM_bnnr_b_add", getElements("MDM_bnnr_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_bnnr_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_bnnr_b_add", getElements("MDM_bnnr_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_bnnr_i_code", getElements("add_bnnr_i_code")}, // element path
                "bnnr_code", getData("bnnr_code"), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_bnnr_lov_language",getElements("add_bnnr_lov_language")}, // b_lov
                new String[]{"add_bnnr_i_language", getElements("add_bnnr_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "bnnr_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_bnnr_i_description", getElements("add_bnnr_i_description")}, // element path
                "bnnr_description", getData("bnnr_description"), where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String booleanText;
        if (getRandomBoolean){
            booleanText = "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_bnnr_cb_status"),
                    "status", true, true,
                    where)) {
                return false;
            }
        }
        else {
            booleanText = "No";
            if(!Functions.checkboxValue(driver, getElements("add_bnnr_cb_status"),
                    "status", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_bnnr_b_save", getElements("add_bnnr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_bnnr_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_bnnr_b_edit", getElements("MDM_bnnr_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_bnnr_i_code", getElements("add_bnnr_i_code")}, // element path
                "bnnr_code", getData("bnnr_code_edit"), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_bnnr_lov_language",getElements("add_bnnr_lov_language")}, // b_lov
                new String[]{"add_bnnr_i_language", getElements("add_bnnr_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "bnnr_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_bnnr_i_description", getElements("add_bnnr_i_description")}, // element path
                "bnnr_description", getData("bnnr_description_edit"), where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String booleanText;
        if (getRandomBoolean){
            booleanText = "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_bnnr_cb_status"),
                    "status", true, true,
                    where)) {
                return false;
            }
        }
        else {
            booleanText = "No";
            if(!Functions.checkboxValue(driver, getElements("add_bnnr_cb_status"),
                    "status", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_bnnr_b_save", getElements("add_bnnr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_bnnr_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_bnnr_b_qbe", getElements("MDM_bnnr_b_qbe")},// query button
                new String[]{"qbe_bnnr_i_code", getElements("qbe_bnnr_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_bnnr_i_code", getElements("qbe_bnnr_i_code")},
                "bnnr_code", getData("bnnr_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_bnnr_i_language", getElements("qbe_bnnr_i_language")},
                "bnnr_language", getData("bnnr_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_bnnr_i_description", getElements("qbe_bnnr_i_description")},
                "bnnr_description", getData("bnnr_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_bnnr_sl_status",getElements("qbe_bnnr_sl_status")},
                getData("status"), "status",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_bnnr_i_code", getElements("qbe_bnnr_i_code")}, //search button
                new String[]{"MDM_bnnr_e_result", getElements("MDM_bnnr_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_bnnr_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_bnnr_b_actions", getElements("MDM_bnnr_b_actions")}, //actions button
                new String[]{"MDM_bnnr_b_actions_audit_data", getElements("MDM_bnnr_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_bnnr_b_detach", getElements("MDM_bnnr_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean third_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_header", getElements("MDM_b_header")}, //element to click
                new String[]{"MDM_hdr_b_add", getElements("MDM_hdr_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_hdr_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hdr_b_add", getElements("MDM_hdr_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hdr_i_number", getElements("add_hdr_i_number")}, // element path
                "number", getData("number"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hdr_b_save", getElements("add_hdr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hdr_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hdr_b_edit", getElements("MDM_hdr_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hdr_i_number", getElements("add_hdr_i_number")}, // element path
                "number", getData("number_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hdr_b_save", getElements("add_hdr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hdr_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hdr_b_qbe", getElements("MDM_hdr_b_qbe")},// query button
                new String[]{"qbe_hdr_i_number", getElements("qbe_hdr_i_number")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hdr_i_number", getElements("qbe_hdr_i_number")},
                "number", getData("number"), where)) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hdr_i_number", getElements("qbe_hdr_i_number")}, //search button
                new String[]{"MDM_hdr_e_result", getElements("MDM_hdr_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hdr_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_hdr_b_actions", getElements("MDM_hdr_b_actions")}, //actions button
                new String[]{"MDM_hdr_b_actions_audit_data", getElements("MDM_hdr_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hdr_b_detach", getElements("MDM_hdr_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_hdmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hdmulti_b_add", getElements("MDM_hdmulti_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_hdmulti_lov_language",getElements("add_hdmulti_lov_language")}, // b_lov
                new String[]{"add_hdmulti_i_language", getElements("add_hdmulti_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hdmulti_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hdmulti_i_header_description", getElements("add_hdmulti_i_header_description")}, // element path
                "hdmulti_description", getData("hdmulti_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hdmulti_b_save", getElements("add_hdmulti_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hdmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hdmulti_b_edit", getElements("MDM_hdmulti_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_hdmulti_lov_language",getElements("add_hdmulti_lov_language")}, // b_lov
                new String[]{"add_hdmulti_i_language", getElements("add_hdmulti_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hdmulti_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hdmulti_i_header_description", getElements("add_hdmulti_i_header_description")}, // element path
                "hdmulti_description", getData("hdmulti_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hdmulti_b_save", getElements("add_hdmulti_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hdmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hdmulti_b_qbe", getElements("MDM_hdmulti_b_qbe")},// query button
                new String[]{"qbe_hdmulti_i_language", getElements("qbe_hdmulti_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hdmulti_i_language", getElements("qbe_hdmulti_i_language")},
                "hdmulti_language", getData("hdmulti_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hdmulti_i_header_description", getElements("qbe_hdmulti_i_header_description")},
                "hdmulti_description", getData("hdmulti_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hdmulti_i_language", getElements("qbe_hdmulti_i_language")}, //search button
                new String[]{"MDM_hdmulti_e_result", getElements("MDM_hdmulti_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hdmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_hdmulti_b_actions", getElements("MDM_hdmulti_b_actions")}, //actions button
                new String[]{"MDM_hdmulti_b_actions_audit_data", getElements("MDM_hdmulti_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hdmulti_b_detach", getElements("MDM_hdmulti_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hdmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_hdmulti_e_result", getElements("MDM_hdmulti_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_hdmulti_b_delete", getElements("MDM_hdmulti_b_delete")},
                new String[]{"MDM_hdmulti_e_records", getElements("MDM_hdmulti_e_records")},
                new String[]{"MDM_hdmulti_b_delete_ok", getElements("MDM_hdmulti_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_hdr_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_hdr_e_result", getElements("MDM_hdr_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.doDelete(driver,
                new String[]{"MDM_hdr_b_delete", getElements("MDM_hdr_b_delete")},//delete button
                new String[]{"MDM_hdr_b_delete_ok", getElements("MDM_hdr_b_delete_ok")},//delete button
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_bnnr_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_bnnr_b_delete", getElements("MDM_bnnr_b_delete")},
                new String[]{"MDM_bnnr_e_records", getElements("MDM_bnnr_e_records")},
                new String[]{"MDM_bnnr_b_delete_ok", getElements("MDM_bnnr_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_hmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_hmulti_e_result", getElements("MDM_hmulti_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_hmulti_b_delete", getElements("MDM_hmulti_b_delete")},
                new String[]{"MDM_hmulti_e_records", getElements("MDM_hmulti_e_records")},
                new String[]{"MDM_hmulti_b_delete_ok", getElements("MDM_hmulti_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_hlp_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_hlp_e_result", getElements("MDM_hlp_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.doDelete(driver,
                new String[]{"MDM_hlp_b_delete", getElements("MDM_hlp_b_delete")},//delete button
                new String[]{"MDM_hlp_b_delete_ok", getElements("MDM_hlp_b_delete_ok")},//delete button
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean fourth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_dictionary", getElements("MDM_b_dictionary")}, //element to click
                new String[]{"MDM_dct_b_add", getElements("MDM_dct_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_dmulti_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_dmulti_e_result", getElements("MDM_dmulti_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dmulti_b_delete", getElements("MDM_dmulti_b_delete")},
                new String[]{"MDM_dmulti_e_records", getElements("MDM_dmulti_e_records")},
                new String[]{"MDM_dmulti_b_delete_ok", getElements("MDM_dmulti_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_dct_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_dct_e_result", getElements("MDM_dct_e_result")}, //element to click
                where)) {
            return false;
        } Functions.break_time(driver, 30, 500);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dct_b_delete", getElements("MDM_dct_b_delete")},
                new String[]{"MDM_dct_e_records", getElements("MDM_dct_e_records")},
                new String[]{"MDM_dct_b_delete_ok", getElements("MDM_dct_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean delete_hblabels_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_hblabels_b_delete", getElements("MDM_hblabels_b_delete")},
                new String[]{"MDM_hblabels_e_records", getElements("MDM_hblabels_e_records")},
                new String[]{"MDM_hblabels_b_delete_ok", getElements("MDM_hblabels_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
}