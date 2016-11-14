package screen.AT2MDMOR0021;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 28/10/2016.
 */
public class AT2MDMOR0021Sis {
    protected AT2MDMOR0021Locators locators;
    protected AT2MDMOR0021Data data;

    public AT2MDMOR0021Sis() {
    }
    public AT2MDMOR0021Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0021Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0021Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0021Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Maintenance Of Errors");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!results_interaction_record_MDM(driver)) return false;
        if (!errors_interaction_record_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!errors_interaction_edit_MDM(driver)) return false;
        if (!errors_qbe_MDM(driver)) return false;
        if (!errors_others_actions_MDM(driver)) return false;
        if (!errors_delete_MDM(driver)) return false;
        if (!results_interaction_edit_MDM(driver)) return false;
        if (!results_qbe_MDM(driver)) return false;
        if (!results_others_actions_MDM(driver)) return false;
        if (!results_delete_MDM(driver)) return false;
        return false;
    }

    private boolean results_interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_results_b_add", getElements("MDM_results_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_code", getElements("add_results_i_code")}, // element path
                "results_code", getData("results_code"), where)) {
            return false;
        }
        String list_options[] = {"Error", "Information", "Message", "Question", "Warning"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_results_ls_severity", getElements("add_results_ls_severity")},
                option, "results_severity", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_description", getElements("add_results_i_description")}, // element path
                "results_description", getData("results_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_constraint_name", getElements("add_results_i_constraint_name")}, // element path
                "results_constraint_name", getData("results_constraint_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_domain_name", getElements("add_results_i_domain_name")}, // element path
                "results_domain_name", getData("results_domain_name"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_results_b_save", getElements("add_results_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean errors_interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_results_e_result", getElements("MDM_results_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_errors_b_add", getElements("MDM_errors_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_errors_lov_language", getElements("add_errors_lov_language")}, // b_lov
                new String[]{"add_errors_i_language", getElements("add_errors_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "errors_language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_errors_i_text", getElements("add_errors_i_text")}, // element path
                "errors_text", getData("errors_text"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_errors_i_help_text", getElements("add_errors_i_help_text")}, // element path
                "errors_help_text", getData("errors_help_text"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_errors_b_save", getElements("add_errors_b_save")}, //element to click
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
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_category", getElements("search_lov_category")}, //LoV button
                new String[]{"search_i_category", getElements("search_i_category")}, //external LoV input
                new String[]{"search_lov_category_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("results_code"), // value to search
                "category", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_code", getElements("search_i_code")}, // element path
                "results_code", getData("results_code"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_ls_severity", getElements("search_ls_severity")},
                getData("results_severity"), "results_severity", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "results_description", getData("results_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_constraint_name", getElements("search_i_constraint_name")}, // element path
                "results_constraint_name", getData("results_constraint_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_domain_name", getElements("search_i_domain_name")}, // element path
                "results_domain_name", getData("results_domain_name"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_results_e_result", getElements("MDM_results_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean errors_interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_errors_e_result", getElements("MDM_errors_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_errors_b_edit", getElements("MDM_errors_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_errors_lov_language", getElements("add_errors_lov_language")}, // b_lov
                new String[]{"add_errors_i_language", getElements("add_errors_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "errors_language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_errors_i_text", getElements("add_errors_i_text")}, // element path
                "errors_text", getData("errors_text_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_errors_i_help_text", getElements("add_errors_i_help_text")}, // element path
                "errors_help_text", getData("errors_help_text_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_errors_b_save", getElements("add_errors_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean errors_qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_errors_b_qbe", getElements("MDM_errors_b_qbe")},// query button
                new String[]{"qbe_errors_i_language", getElements("qbe_errors_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_errors_i_language", getElements("qbe_errors_i_language")},
                "errors_language", getData("errors_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_errors_i_text", getElements("qbe_errors_i_text")},
                "errors_text", getData("errors_text"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_errors_i_help_text", getElements("qbe_errors_i_help_text")},
                "errors_help_text", getData("errors_help_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_errors_i_language", getElements("qbe_errors_i_language")}, //search button
                new String[]{"MDM_errors_e_result", getElements("MDM_errors_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean errors_others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_errors_b_actions", getElements("MDM_errors_b_actions")}, //actions button
                new String[]{"MDM_errors_b_actions_audit_data", getElements("MDM_errors_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_errors_b_detach", getElements("MDM_errors_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean errors_delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_errors_b_delete", getElements("MDM_errors_b_delete")}, //button delete
                new String[]{"MDM_errors_e_records", getElements("MDM_errors_e_records")}, // result
                new String[]{"MDM_errors_b_delete_yes", getElements("MDM_errors_b_delete_yes")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean results_interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_results_e_result", getElements("MDM_results_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_results_b_edit", getElements("MDM_results_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        String list_options[] = {"Error", "Information", "Message", "Question", "Warning"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_results_ls_severity", getElements("add_results_ls_severity")},
                option, "results_severity", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_description", getElements("add_results_i_description")}, // element path
                "results_description", getData("results_description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_constraint_name", getElements("add_results_i_constraint_name")}, // element path
                "results_constraint_name", getData("results_constraint_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_results_i_domain_name", getElements("add_results_i_domain_name")}, // element path
                "results_domain_name", getData("results_domain_name_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_results_b_save", getElements("add_results_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean results_qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_results_b_qbe", getElements("MDM_results_b_qbe")},// query button
                new String[]{"qbe_results_i_code", getElements("qbe_results_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_code", getElements("qbe_results_i_code")},
                "results_code", getData("results_code"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_results_ls_severity", getElements("qbe_results_ls_severity")},
                getData("results_severity"), "results_severity", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_description", getElements("qbe_results_i_description")},
                "results_description", getData("results_description"), where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_constraint_name", getElements("qbe_results_i_constraint_name")},
                "results_constraint_name", getData("results_constraint_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_domain_name", getElements("qbe_results_i_domain_name")},
                "results_domain_name", getData("results_domain_name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_results_i_code", getElements("qbe_results_i_code")}, //search button
                new String[]{"MDM_results_e_result", getElements("MDM_results_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean results_others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_results_b_actions", getElements("MDM_results_b_actions")}, //actions button
                new String[]{"MDM_results_b_actions_audit_data", getElements("MDM_results_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_results_b_detach", getElements("MDM_results_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean results_delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_results_b_delete", getElements("MDM_results_b_delete")}, //button delete
                new String[]{"MDM_results_e_records", getElements("MDM_results_e_records")}, // result
                new String[]{"MDM_results_b_delete_yes", getElements("MDM_results_b_delete_yes")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
