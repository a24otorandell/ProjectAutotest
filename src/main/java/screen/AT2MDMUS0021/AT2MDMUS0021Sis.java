package screen.AT2MDMUS0021;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMUS0021Sis {
    protected AT2MDMUS0021Locators locators;
    protected AT2MDMUS0021Data data;

    public AT2MDMUS0021Sis() {
    }
    public AT2MDMUS0021Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0021Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0021Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0021Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Authorizations");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //BUSINESS OWNER SCREEN
        //RESULT BUSINESS OWNER TABLE
        if (!interaction_record_rbo_MDM(driver)) return false;
        if (!search_rbo_MDM(driver)) return false;
        if (!interaction_edit_rbo_MDM(driver)) return false;
        if (!qbe_rbo_MDM(driver)) return false;
        if (!others_actions_rbo_MDM(driver)) return false;
        //BO RESULTS USERS TABLE
        if (!interaction_record_boru_MDM(driver)) return false;
        if (!search_boru_MDM(driver)) return false;
        if (!interaction_edit_boru_MDM(driver)) return false;
        if (!qbe_boru_MDM(driver)) return false;
        if (!others_actions_boru_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_change_tab(driver)) return false;
        //PROCESS OWNER SCREEN
        //RESULTS PROCESS OWNER TABLE
        if (!interaction_record_rpo_MDM(driver)) return false;
        if (!search_rpo_MDM(driver)) return false;
        if (!interaction_edit_rpo_MDM(driver)) return false;
        if (!qbe_rpo_MDM(driver)) return false;
        if (!others_actions_rpo_MDM(driver)) return false;
        //PO RESULTS USERS TABLE
        if (!interaction_record_poru_MDM(driver)) return false;
        if (!search_poru_MDM(driver)) return false;
        if (!interaction_edit_poru_MDM(driver)) return false;
        if (!qbe_poru_MDM(driver)) return false;
        if (!others_actions_poru_MDM(driver)) return false;
        if (!delete_poru_MDM(driver)) return false;
        //RESULTS PROCESS OWNER TABLE
        if (!qbe_rpo_MDM(driver)) return false;
        if (!delete_rpo_MDM(driver)) return false;
        //CHANGE TAB
        if (!second_change_tab(driver)) return false;
        //BO RESULTS USERS TABLE
        if (!delete_boru_MDM(driver)) return false;
        //RESULT BUSINESS OWNER TABLE
        if (!qbe_rbo_MDM(driver)) return false;
        if (!delete_rbo_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_rbo_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rbo_b_add", getElements("MDM_rbo_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbo_i_code", getElements("add_rbo_i_code")}, // element path
                "rbo_code", getData("rbo_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbo_i_description", getElements("add_rbo_i_description")}, // element path
                "rbo_description", getData("rbo_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rbo_b_save", getElements("add_rbo_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_rbo_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_rbo_i_code", getElements("search_rbo_i_code")}, // element path
                "rbo_code", getData("rbo_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbo_i_description", getElements("search_rbo_i_description")}, // element path
                "rbo_description", getData("rbo_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_rbo_b_search", getElements("search_rbo_b_search")}, //search button
                new String[]{"MDM_rbo_e_result", getElements("MDM_rbo_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_rbo_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rbo_b_edit", getElements("MDM_rbo_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbo_i_description", getElements("add_rbo_i_description")}, // element path
                "rbo_description", getData("rbo_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rbo_b_save", getElements("add_rbo_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_rbo_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_rbo_b_reset", getElements("search_rbo_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_rbo_b_qbe", getElements("MDM_rbo_b_qbe")},// query button
                new String[]{"qbe_rbo_i_code", getElements("qbe_rbo_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbo_i_code", getElements("qbe_rbo_i_code")}, // element path
                "rbo_code", getData("rbo_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbo_description", getElements("qbe_rbo_i_description")}, // element path
                "rbo_description", getData("rbo_description"), where)) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_rbo_i_code", getElements("qbe_rbo_i_code")}, //search button
                new String[]{"MDM_rbo_e_result", getElements("MDM_rbo_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_rbo_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_rbo_b_actions", getElements("MDM_rbo_b_actions")}, //actions button
                new String[]{"MDM_rbo_b_actions_audit_data", getElements("MDM_rbo_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_rbo_b_detach", getElements("MDM_rbo_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_boru_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_boru_b_add", getElements("MDM_boru_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_boru_lov_owner",getElements("add_boru_lov_owner")}, // b_lov
                new String[]{"add_boru_i_owner", getElements("add_boru_i_owner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "boru_owner", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"GUEST", "KEY USER", "USER"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_boru_sl_user_type", getElements("add_boru_sl_user_type")},
                list_options, "boru_user_type",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_boru_lov_user",getElements("add_boru_lov_user")}, // b_lov
                new String[]{"add_boru_i_user", getElements("add_boru_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "boru_user", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_boru_b_save", getElements("add_boru_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_boru_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_boru_lov_owner", getElements("search_boru_lov_owner")}, //LoV button
                new String[]{"search_boru_i_owner", getElements("search_boru_i_owner")}, //external LoV input
                new String[]{"search_boru_owner", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("boru_owner"), // value to search
                "boru_owner", //name of the data
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_boru_lov_user", getElements("search_boru_lov_user")}, //LoV button
                new String[]{"search_boru_i_user", getElements("search_boru_i_user")}, //external LoV input
                new String[]{"search_boru_user", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("boru_user"), // value to search
                "boru_user", //name of the data
                where)) {
            return false;}
        String option = " ";
        if (getData("boru_user_type").equalsIgnoreCase("GUEST")) {
            option = "Guest";
        }
        else if (getData("boru_user_type").equalsIgnoreCase("KEY USER")) {
            option = "Key User";
        }
        else {
            option = "User";
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"search_boru_sl_user_type",getElements("search_boru_sl_user_type")},
                option, "boru_user_type", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_rbo_b_search", getElements("search_rbo_b_search")}, //search button
                new String[]{"MDM_boru_e_result", getElements("MDM_boru_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_boru_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_boru_b_edit", getElements("MDM_boru_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_boru_lov_owner",getElements("add_boru_lov_owner")}, // b_lov
                new String[]{"add_boru_i_owner", getElements("add_boru_i_owner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "boru_owner", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"GUEST", "KEY USER", "USER"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_boru_sl_user_type", getElements("add_boru_sl_user_type")},
                list_options, "boru_user_type",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_boru_lov_user",getElements("add_boru_lov_user")}, // b_lov
                new String[]{"add_boru_i_user", getElements("add_boru_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "boru_user", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_boru_b_save", getElements("add_boru_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_boru_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_boru_b_reset", getElements("search_boru_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_boru_b_qbe", getElements("MDM_boru_b_qbe")},// query button
                new String[]{"qbe_boru_i_owner", getElements("qbe_boru_i_owner")},//any query input
                where)) {
            return false;
        }
        String option = " ";
        if (getData("boru_user_type").equalsIgnoreCase("GUEST")) {
            option = "GU";
        }
        else if (getData("boru_user_type").equalsIgnoreCase("KEY USER")) {
            option = "KU";
        }
        else {
            option = "U";
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_boru_i_owner", getElements("qbe_boru_i_owner")},
                "boru_owner", getData("boru_owner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_boru_i_user_type", getElements("qbe_boru_i_user_type")},
                "boru_user_type", option, where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_boru_i_user", getElements("qbe_boru_i_user")},
                "boru_user", getData("boru_user"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_boru_i_owner", getElements("qbe_boru_i_owner")}, //search button
                new String[]{"MDM_boru_e_result", getElements("MDM_boru_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_boru_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_boru_b_actions", getElements("MDM_boru_b_actions")}, //actions button
                new String[]{"MDM_boru_b_actions_audit_data", getElements("MDM_boru_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_boru_b_detach", getElements("MDM_boru_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_rpo_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rpo_b_add", getElements("MDM_rpo_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rpo_i_code", getElements("add_rpo_i_code")}, // element path
                "rpo_code", getData("rpo_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rpo_i_description", getElements("add_rpo_i_description")}, // element path
                "rpo_description", getData("rpo_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rpo_b_save", getElements("add_rpo_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_rpo_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_rpo_i_code", getElements("search_rpo_i_code")}, // element path
                "rpo_code", getData("rpo_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rpo_i_description", getElements("search_rpo_i_description")}, // element path
                "rpo_description", getData("rpo_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_rpo_b_search", getElements("search_rpo_b_search")}, //search button
                new String[]{"MDM_rpo_e_result", getElements("MDM_rpo_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_rpo_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rpo_b_edit", getElements("MDM_rpo_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rpo_i_description", getElements("add_rpo_i_description")}, // element path
                "rpo_description", getData("rpo_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rpo_b_save", getElements("add_rpo_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_rpo_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_rpo_b_reset", getElements("search_rpo_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_rpo_b_qbe", getElements("MDM_rpo_b_qbe")},// query button
                new String[]{"qbe_rpo_i_code", getElements("qbe_rpo_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rpo_i_code", getElements("qbe_rpo_i_code")},
                "rpo_code", getData("rpo_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rpo_i_description", getElements("qbe_rpo_i_description")},
                "rpo_description", getData("rpo_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_rpo_i_code", getElements("qbe_rpo_i_code")}, //search button
                new String[]{"MDM_rpo_e_result", getElements("MDM_rpo_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_rpo_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_rpo_b_actions", getElements("MDM_rpo_b_actions")}, //actions button
                new String[]{"MDM_rpo_b_actions_audit_data", getElements("MDM_rpo_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_rpo_b_detach", getElements("MDM_rpo_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_poru_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_poru_b_add", getElements("MDM_poru_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_poru_lov_owner",getElements("add_poru_lov_owner")}, // b_lov
                new String[]{"add_poru_i_owner", getElements("add_poru_i_owner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "poru_owner", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"GUEST", "KEY USER", "USER"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_poru_sl_user_type", getElements("add_poru_sl_user_type")},
                list_options, "poru_user_type",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_poru_lov_user",getElements("add_poru_lov_user")}, // b_lov
                new String[]{"add_poru_i_user", getElements("add_poru_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "poru_user", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_poru_b_save", getElements("add_poru_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_poru_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_poru_lov_owner", getElements("search_poru_lov_owner")}, //LoV button
                new String[]{"search_poru_i_owner", getElements("search_poru_i_owner")}, //external LoV input
                new String[]{"search_poru_owner", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("poru_owner"), // value to search
                "poru_owner", //name of the data
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_poru_lov_user", getElements("search_poru_lov_user")}, //LoV button
                new String[]{"search_poru_i_user", getElements("search_poru_i_user")}, //external LoV input
                new String[]{"search_poru_user", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("poru_user"), // value to search
                "poru_user", //name of the data
                where)) {
            return false;
        }
        String option = " ";
        if (getData("poru_user_type").equalsIgnoreCase("GUEST")) {
            option = "Guest";
        }
        else if (getData("poru_user_type").equalsIgnoreCase("KEY USER")) {
            option = "Key User";
        }
        else {
            option = "User";
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"search_poru_sl_user_type",getElements("search_poru_sl_user_type")},
                option, "poru_user_type", where)) {
            return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_poru_b_search", getElements("search_poru_b_search")}, //search button
                new String[]{"MDM_poru_e_result", getElements("MDM_poru_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_poru_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_poru_b_edit", getElements("MDM_poru_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_poru_lov_owner",getElements("add_poru_lov_owner")}, // b_lov
                new String[]{"add_poru_i_owner", getElements("add_poru_i_owner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "poru_owner", //Data name
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"GUEST", "KEY USER", "USER"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_poru_sl_user_type", getElements("add_poru_sl_user_type")},
                list_options, "poru_user_type",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_poru_lov_user",getElements("add_poru_lov_user")}, // b_lov
                new String[]{"add_poru_i_user", getElements("add_poru_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "poru_user", //Data name
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_poru_b_save", getElements("add_poru_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_poru_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_poru_b_reset", getElements("search_poru_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_poru_b_qbe", getElements("MDM_poru_b_qbe")},// query button
                new String[]{"qbe_poru_i_owner", getElements("qbe_poru_i_owner")},//any query input
                where)) {
            return false;
        }
        String option = " ";
        if (getData("poru_user_type").equalsIgnoreCase("GUEST")) {
            option = "GU";
        }
        else if (getData("poru_user_type").equalsIgnoreCase("KEY USER")) {
            option = "KU";
        }
        else {
            option = "U";
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_poru_i_owner", getElements("qbe_poru_i_owner")},
                "poru_owner", getData("poru_owner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_poru_i_user_type", getElements("qbe_poru_i_user_type")},
                "poru_user_type", option, where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_poru_i_user", getElements("qbe_poru_i_user")},
                "poru_user", getData("poru_user"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_poru_i_owner", getElements("qbe_poru_i_owner")}, //search button
                new String[]{"MDM_poru_e_result", getElements("MDM_poru_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_poru_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_poru_b_actions", getElements("MDM_poru_b_actions")}, //actions button
                new String[]{"MDM_poru_b_actions_audit_data", getElements("MDM_poru_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_poru_b_detach", getElements("MDM_poru_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_poru_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_poru_e_result", getElements("MDM_poru_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_poru_b_delete", getElements("MDM_poru_b_delete")},
                new String[]{"MDM_poru_e_records", getElements("MDM_poru_e_records")},
                new String[]{"MDM_poru_b_delete_ok", getElements("MDM_poru_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_rpo_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_rpo_b_delete", getElements("MDM_rpo_b_delete")},
                new String[]{"MDM_rpo_e_records", getElements("MDM_rpo_e_records")},
                new String[]{"MDM_rpo_b_delete_ok", getElements("MDM_rpo_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_boru_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_boru_b_delete", getElements("MDM_boru_b_delete")},
                new String[]{"MDM_boru_e_records", getElements("MDM_boru_e_records")},
                new String[]{"MDM_boru_b_delete_ok", getElements("MDM_boru_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_rbo_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_rbo_b_delete", getElements("MDM_rbo_b_delete")},
                new String[]{"MDM_rbo_e_records", getElements("MDM_rbo_e_records")},
                new String[]{"MDM_rbo_b_delete_ok", getElements("MDM_rbo_b_delete_ok")}, //delete button yes
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
                new String[]{"MDM_b_process_owner", getElements("MDM_b_process_owner")}, //element to click
                new String[]{"MDM_rpo_b_add", getElements("MDM_rpo_b_add")}, //element expected to appear
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
                new String[]{"MDM_b_business_owner", getElements("MDM_b_business_owner")}, //element to click
                new String[]{"MDM_rbo_b_add", getElements("MDM_rbo_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
}