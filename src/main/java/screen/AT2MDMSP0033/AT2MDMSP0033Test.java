package screen.AT2MDMSP0033;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 03/11/2016.
 */

public class AT2MDMSP0033Test {
    protected AT2MDMSP0033Locators locators;
    protected AT2MDMSP0033Data data;

    public AT2MDMSP0033Test() {
    }
    public AT2MDMSP0033Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0033Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0033Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0033Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("SP Roles");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_sproles_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_sproles_MDM(driver)) return false;
        if (!qbe_sproles_MDM(driver)) return false;
        if (!others_actions_sproles_MDM(driver)) return false;
        if (!interaction_record_spprofiles_MDM(driver)) return false;
        if (!qbe_spprofiles_MDM(driver)) return false;
        if (!interaction_edit_spprofiles_MDM(driver)) return false;
        if (!qbe_spprofiles_MDM(driver)) return false;
        if (!others_actions_spprofiles_MDM(driver)) return false;
        if (!delete_spprofiles_MDM(driver)) return false;
        if (!delete_sproles_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_sproles_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_sproles_b_add", getElements("MDM_sproles_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")}, // element path
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_sproles_b_save", getElements("add_sproles_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_code", getElements("search_i_code")}, // element path
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_sproles_e_result", getElements("MDM_sproles_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_sproles_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_sproles_b_edit", getElements("MDM_sproles_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")}, // element path
                "code", getData("code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_sproles_b_save", getElements("add_sproles_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_sproles_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_sproles_b_qbe", getElements("MDM_sproles_b_qbe")},// query button
                new String[]{"qbe_sproles_i_code", getElements("qbe_sproles_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_sproles_i_code", getElements("qbe_sproles_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_sproles_i_description", getElements("qbe_sproles_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_sproles_i_code", getElements("qbe_sproles_i_code")}, //search button
                new String[]{"MDM_sproles_e_result", getElements("MDM_sproles_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_sproles_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_sproles_b_actions", getElements("MDM_sproles_b_actions")}, //actions button
                new String[]{"MDM_sproles_b_actions_audit_data", getElements("MDM_sproles_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_sproles_b_detach", getElements("MDM_sproles_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_spprofiles_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_spprofiles_b_add", getElements("MDM_spprofiles_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_profile_code",getElements("add_lov_profile_code")}, // b_lov
                new String[]{"add_i_profile_code", getElements("add_i_profile_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "profile_code", //Data name
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_e_profile_description", getElements("add_e_profile_description")}, // element path
                "profile_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_spprofiles_b_save", getElements("add_spprofiles_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_spprofiles_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_spprofiles_e_result", getElements("MDM_spprofiles_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_spprofiles_b_edit", getElements("MDM_spprofiles_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_profile_code",getElements("add_lov_profile_code")}, // b_lov
                new String[]{"add_i_profile_code", getElements("add_i_profile_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "profile_code", //Data name
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_e_profile_description", getElements("add_e_profile_description")}, // element path
                "profile_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_spprofiles_b_save", getElements("add_spprofiles_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_spprofiles_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_spprofiles_b_qbe", getElements("MDM_spprofiles_b_qbe")},// query button
                new String[]{"qbe_spprofiles_i_profile_code", getElements("qbe_spprofiles_i_profile_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_spprofiles_i_profile_code", getElements("qbe_spprofiles_i_profile_code")},
                "profile_code", getData("profile_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_spprofiles_i_profile_description", getElements("qbe_spprofiles_i_profile_description")},
                "profile_description", getData("profile_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_spprofiles_i_profile_code", getElements("qbe_spprofiles_i_profile_code")}, //search button
                new String[]{"MDM_spprofiles_e_result", getElements("MDM_spprofiles_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_spprofiles_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_spprofiles_b_actions", getElements("MDM_spprofiles_b_actions")}, //actions button
                new String[]{"MDM_spprofiles_b_actions_audit_data", getElements("MDM_spprofiles_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_spprofiles_b_detach", getElements("MDM_spprofiles_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_spprofiles_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_spprofiles_b_delete", getElements("MDM_spprofiles_b_delete")},
                new String[]{"MDM_spprofiles_e_records", getElements("MDM_spprofiles_e_records")},
                new String[]{"MDM_spprofiles_b_delete_ok", getElements("MDM_spprofiles_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_sproles_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_sproles_b_delete", getElements("MDM_sproles_b_delete")},
                new String[]{"MDM_sproles_e_records", getElements("MDM_sproles_e_records")},
                new String[]{"MDM_sproles_b_delete_ok", getElements("MDM_sproles_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
