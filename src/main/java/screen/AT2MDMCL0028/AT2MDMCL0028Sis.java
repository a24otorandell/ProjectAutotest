package screen.AT2MDMCL0028;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 28/11/2016.
 */
public class AT2MDMCL0028Sis {
    protected AT2MDMCL0028Locators locators;
    protected AT2MDMCL0028Data data;

    public AT2MDMCL0028Sis() {
    }
    public AT2MDMCL0028Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0028Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0028Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0028Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Hotelopia Partners");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //PARTNERS TABLE
        if (!interaction_record_prtns_MDM(driver)) return false;
        if (!search_prtns_MDM(driver)) return false;
        if (!interaction_edit_prtns_MDM(driver)) return false;
        if (!qbe_prtns_MDM(driver)) return false;
        if (!others_actions_prtns_MDM(driver)) return false;
        //ASSIGNED GROUP TABLE
        if (!interaction_record_assg_MDM(driver)) return false;
        if (!qbe_assg_MDM(driver)) return false;
        if (!interaction_edit_assg_MDM(driver)) return false;
        if (!qbe_assg_MDM(driver)) return false;
        if (!others_actions_assg_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_change_tab(driver)) return false;
        //GROUPS TABLE
        if (!interaction_record_gr_MDM(driver)) return false;
        if (!search_gr_MDM(driver)) return false;
        if (!interaction_edit_gr_MDM(driver)) return false;
        if (!qbe_gr_MDM(driver)) return false;
        if (!others_actions_gr_MDM(driver)) return false;
        //GROUP DESCRIPTION TABLE
        if (!interaction_record_grd_MDM(driver)) return false;
        if (!qbe_grd_MDM(driver)) return false;
        if (!interaction_edit_grd_MDM(driver)) return false;
        if (!qbe_grd_MDM(driver)) return false;
        if (!others_actions_grd_MDM(driver)) return false;
        //ASSOCIATED PARTNER TABLE
        // if (!qbe_assp_MDM(driver)) return false;
        if (!others_actions_assp_MDM(driver)) return false;
        //GROUP DESCRIPTION TABLE
        if (!delete_grd_MDM(driver)) return false;
        //GROUPS TABLE
        if (!delete_gr_MDM(driver)) return false;
        //CHANGE TAB
        if (!second_change_tab(driver)) return false;
        //ASSIGNED GROUP TABLE
        if (!delete_assg_MDM(driver)) return false;
        //PARTNERS TABLE
        if (!delete_prtns_MDM(driver)) return false;
        return false;
    }

    //PARTNERS TABLE
    private boolean interaction_record_prtns_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prtns_b_add", getElements("MDM_prtns_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_prtns_e_identif", getElements("add_prtns_e_identif")}, // element path
                "prtns_identif",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"ACTIVE", "NO ACTIVE"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_prtns_sl_nactive", getElements("add_prtns_sl_nactive")},
                list_options, "prtns_nactive",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prtns_i_name", getElements("add_prtns_i_name")}, // element path
                "prtns_name", getData("prtns_name"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prtns_i_description", getElements("add_prtns_i_description")}, // element path
                "prtns_description", getData("prtns_description"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("add_prtns_cb_internal"),"prtns_internal",true,true, where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("add_prtns_cb_dotmar"),"prtns_dotmar",true,true, where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_prtns_lov_supplier",getElements("add_prtns_lov_supplier")}, // b_lov
                new String[]{"add_prtns_i_supplier", getElements("add_prtns_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prtns_supplier", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_prtns_e_supplier_description", getElements("add_prtns_e_supplier_description")}, // element path
                "prtns_supplier_description",
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prtns_b_save", getElements("add_prtns_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_prtns_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_prtns_i_identif", getElements("search_prtns_i_identif")}, // element path
                "prtns_identif", getData("prtns_identif"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver,
                new String[]{"search_prtns_sl_nactive",getElements("search_prtns_sl_nactive")},
                getData("prtns_nactive"), "prtns_nactive",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prtns_i_name", getElements("search_prtns_i_name")}, // element path
                "prtns_name", getData("prtns_name"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prtns_i_description", getElements("search_prtns_i_description")}, // element path
                "prtns_description", getData("prtns_description"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("search_prtns_cb_internal"),"prtns_internal",true,true, where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("search_prtns_cb_dotmar"),"prtns_dotmar",true,true, where)) {
            return false;
        }
        if (getData("prtns_supplier") == " ") {
            if (!Functions.insertInput(driver, new String[]{"search_prtns_i_supplier", getElements("search_prtns_i_supplier")}, // element path
                    "prtns_supplier", " ",
                    where)) {
                return false;
            }
        }
        else {
            Functions.break_time(driver, 30, 500);
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_prtns_lov_supplier", getElements("search_prtns_lov_supplier")}, //LoV button
                    new String[]{"search_prtns_i_supplier", getElements("search_prtns_i_supplier")}, //external LoV input
                    new String[]{"search_i_supplier_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    getData("prtns_supplier"), // value to search
                    "prtns_supplier", //name of the data
                    where)) {
                return false;
            }
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_prtns_b_search", getElements("search_prtns_b_search")}, //search button
                new String[]{"MDM_prtns_e_result", getElements("MDM_prtns_e_result")}, //result element
                where)) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_prtns_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prtns_b_edit", getElements("MDM_prtns_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"ACTIVE", "NO ACTIVE"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_prtns_sl_nactive", getElements("add_prtns_sl_nactive")},
                list_options, "prtns_nactive",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prtns_i_name", getElements("add_prtns_i_name")}, // element path
                "prtns_name", getData("prtns_name_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prtns_i_description", getElements("add_prtns_i_description")}, // element path
                "prtns_description", getData("prtns_description_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("add_prtns_cb_internal"),"prtns_internal",false,true, where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("add_prtns_cb_dotmar"),"prtns_dotmar",false,true, where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_prtns_i_supplier", getElements("add_prtns_i_supplier")}, // element path
                "prtns_supplier",
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_prtns_e_supplier_description", getElements("add_prtns_e_supplier_description")}, // element path
                "prtns_supplier_description",
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prtns_b_save", getElements("add_prtns_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_prtns_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_prtns_b_reset", getElements("search_prtns_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_prtns_b_qbe", getElements("MDM_prtns_b_qbe")},// query button
                new String[]{"qbe_prtns_i_identif", getElements("qbe_prtns_i_identif")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prtns_i_identif", getElements("qbe_prtns_i_identif")},
                "prtns_identif", getData("prtns_identif"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_prtns_sl_nactive", getElements("qbe_prtns_sl_nactive")},
                getData("prtns_nactive"), "prtns_nactive",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prtns_i_name", getElements("qbe_prtns_i_name")},
                "prtns_name", getData("prtns_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prtns_i_description", getElements("qbe_prtns_i_description")},
                "prtns_description", getData("prtns_description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_prtns_sl_internal", getElements("qbe_prtns_sl_internal")},
                getData("prtns_internal"), "prtns_internal",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_prtns_sl_dotmar", getElements("qbe_prtns_sl_dotmar")},
                getData("prtns_dotmar"), "prtns_dotmar",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prtns_i_supplier", getElements("qbe_prtns_i_supplier")},
                "prtns_supplier", getData("prtns_supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prtns_i_supplier_description", getElements("qbe_prtns_i_supplier_description")},
                "prtns_supplier_description", getData("prtns_supplier_description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_prtns_i_identif", getElements("qbe_prtns_i_identif")}, //search button
                new String[]{"MDM_prtns_e_result", getElements("MDM_prtns_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prtns_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_prtns_b_actions", getElements("MDM_prtns_b_actions")}, //actions button
                new String[]{"MDM_prtns_b_actions_audit_data", getElements("MDM_prtns_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_prtns_b_detach", getElements("MDM_prtns_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prtns_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_prtns_b_delete", getElements("MDM_prtns_b_delete")},
                new String[]{"MDM_prtns_e_records", getElements("MDM_prtns_e_records")},
                new String[]{"MDM_prtns_b_delete_ok", getElements("MDM_prtns_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //ASSIGNED GROUP TABLE
    private boolean interaction_record_assg_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_assg_b_add", getElements("MDM_assg_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_assg_lov_group",getElements("add_assg_lov_group")}, // b_lov
                new String[]{"add_assg_i_group", getElements("add_assg_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "assg_group", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_assg_e_group_description", getElements("add_assg_e_group_description")}, // element path
                "assg_group_description",
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_assg_b_save", getElements("add_assg_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_assg_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_assg_b_edit", getElements("MDM_assg_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_assg_lov_group",getElements("add_assg_lov_group")}, // b_lov
                new String[]{"add_assg_i_group", getElements("add_assg_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "assg_group", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_assg_e_group_description", getElements("add_assg_e_group_description")}, // element path
                "assg_group_description",
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_assg_b_save", getElements("add_assg_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_assg_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_assg_b_qbe", getElements("MDM_assg_b_qbe")},// query button
                new String[]{"qbe_assg_i_group", getElements("qbe_assg_i_group")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_assg_i_group", getElements("qbe_assg_i_group")},
                "assg_group", getData("assg_group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_assg_i_group_description", getElements("qbe_assg_i_group_description")},
                "assg_group_description", getData("assg_group_description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_assg_i_group", getElements("qbe_assg_i_group")}, //search button
                new String[]{"MDM_assg_e_result", getElements("MDM_assg_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_assg_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_assg_b_actions", getElements("MDM_assg_b_actions")}, //actions button
                new String[]{"MDM_assg_b_actions_audit_data", getElements("MDM_assg_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_assg_b_detach", getElements("MDM_assg_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_assg_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_assg_b_delete", getElements("MDM_assg_b_delete")},
                new String[]{"MDM_assg_e_records", getElements("MDM_assg_e_records")},
                new String[]{"MDM_assg_b_delete_ok", getElements("MDM_assg_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //GROUPS TABLE
    private boolean interaction_record_gr_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gr_b_add", getElements("MDM_gr_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gr_i_group_code", getElements("add_gr_i_group_code")}, // element path
                "gr_group_code", getData("gr_group_code"),
                where)) {
            return false;
        } if (!Functions.insertInput(driver, new String[]{"add_gr_i_group_name", getElements("add_gr_i_group_name")}, // element path
                "gr_group_name", getData("gr_group_name"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gr_b_save", getElements("add_gr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_gr_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_gr_i_group_code", getElements("search_gr_i_group_code")}, // element path
                "gr_group_code", getData("gr_group_code"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_gr_i_group_name", getElements("search_gr_i_group_name")}, // element path
                "gr_group_name", getData("gr_group_name"),
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_gr_b_search", getElements("search_gr_b_search")}, //search button
                new String[]{"MDM_gr_e_result", getElements("MDM_gr_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_gr_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gr_b_edit", getElements("MDM_gr_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"add_gr_i_group_code", getElements("add_gr_i_group_code")}, // element path
                "gr_group_code", getData("gr_group_code_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"add_gr_i_group_name", getElements("add_gr_i_group_name")}, // element path
                "gr_group_name", getData("gr_group_name_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gr_b_save", getElements("add_gr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_gr_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_gr_b_reset", getElements("search_gr_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_gr_b_qbe", getElements("MDM_gr_b_qbe")},// query button
                new String[]{"qbe_gr_i_group_code", getElements("qbe_gr_i_group_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gr_i_group_code", getElements("qbe_gr_i_group_code")},
                "gr_group_code", getData("gr_group_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gr_i_group_name", getElements("qbe_gr_i_group_name")},
                "gr_group_name", getData("gr_group_name"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_gr_i_group_code", getElements("qbe_gr_i_group_code")}, //search button
                new String[]{"MDM_gr_e_result", getElements("MDM_gr_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_gr_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_gr_b_actions", getElements("MDM_gr_b_actions")}, //actions button
                new String[]{"MDM_gr_b_actions_audit_data", getElements("MDM_gr_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_gr_b_detach", getElements("MDM_gr_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_gr_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_gr_b_delete", getElements("MDM_gr_b_delete")},
                new String[]{"MDM_gr_e_records", getElements("MDM_gr_e_records")},
                new String[]{"MDM_gr_b_delete_ok", getElements("MDM_gr_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //GROUP DESCRIPTION TABLE
    private boolean interaction_record_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grd_b_add", getElements("MDM_grd_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_grd_i_lov_language",getElements("add_grd_i_lov_language")}, // b_lov
                new String[]{"add_grd_i_language", getElements("add_grd_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "grd_language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grd_i_texto", getElements("add_grd_i_texto")}, // element path
                "grd_texto", getData("grd_texto"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grd_b_save", getElements("add_grd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grd_b_edit", getElements("MDM_grd_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_grd_i_lov_language",getElements("add_grd_i_lov_language")}, // b_lov
                new String[]{"add_grd_i_language", getElements("add_grd_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "grd_language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grd_i_texto", getElements("add_grd_i_texto")}, // element path
                "grd_texto", getData("grd_texto_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grd_b_save", getElements("add_grd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_grd_b_qbe", getElements("MDM_grd_b_qbe")},// query button
                new String[]{"qbe_grd_i_language", getElements("qbe_grd_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_grd_i_language", getElements("qbe_grd_i_language")},
                "grd_language", getData("grd_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_grd_i_texto", getElements("qbe_grd_i_texto")},
                "grd_texto", getData("grd_texto"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_grd_i_language", getElements("qbe_grd_i_language")}, //search button
                new String[]{"MDM_grd_e_result", getElements("MDM_grd_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_grd_b_actions", getElements("MDM_grd_b_actions")}, //actions button
                new String[]{"MDM_grd_b_actions_audit_data", getElements("MDM_grd_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_grd_b_detach", getElements("MDM_grd_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_grd_b_delete", getElements("MDM_grd_b_delete")},
                new String[]{"MDM_grd_e_records", getElements("MDM_grd_e_records")},
                new String[]{"MDM_grd_b_delete_ok", getElements("MDM_grd_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //ASSOCIATED PARTNERS TABLE
    private boolean qbe_assp_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_grd_b_qbe", getElements("MDM_grd_b_qbe")},// query button
                new String[]{"qbe_assp_i_identif", getElements("qbe_assp_i_identif")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_assp_i_identif", getElements("qbe_assp_i_identif")},
                "assp_identif", getData("assp_identif"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_assp_i_name", getElements("qbe_assp_i_name")},
                "assp_name", getData("assp_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_assp_i_description", getElements("qbe_assp_i_description")},
                "assp_description", getData("assp_description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_assp_i_identif", getElements("qbe_assp_i_identif")}, //search button
                new String[]{"MDM_assp_e_result", getElements("MDM_assp_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_assp_MDM(TestDriver driver) {
        /*driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_assp_b_actions", getElements("MDM_assp_b_actions")}, //actions button
                new String[]{"MDM_assp_b_actions_audit_data", getElements("MDM_assp_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_assp_b_detach", getElements("MDM_assp_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    //TAB CHANGE
    private boolean first_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_groups", getElements("MDM_b_groups")}, //element to click
                new String[]{"MDM_gr_b_add", getElements("MDM_gr_b_add")}, //element expected to appear
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
                new String[]{"MDM_b_partners", getElements("MDM_b_partners")}, //element to click
                new String[]{"MDM_prtns_b_add", getElements("MDM_prtns_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
}
