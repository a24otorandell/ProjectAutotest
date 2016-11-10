package screen.AT2MDMRM0033;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 09/11/2016.
 */
public class AT2MDMRM0033Sis {
    protected AT2MDMRM0033Locators locators;
    protected AT2MDMRM0033Data data;

    public AT2MDMRM0033Sis() {
    }
    public AT2MDMRM0033Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0033Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0033Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0033Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Discount vouchers");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //AGENCIES LOCATOR CONTROL TABLE
        if (!interaction_record_alc_MDM(driver)) return false;
        if (!search_alc_MDM(driver)) return false;
        if (!interaction_edit_alc_MDM(driver)) return false;
        if (!qbe_alc_MDM(driver)) return false;
        if (!others_actions_alc_MDM(driver)) return false;
        //VALIDATION TYPE TABLE
        if (!interaction_record_vt_MDM(driver)) return false;
        if (!search_vt_MDM(driver)) return false;
        if (!qbe_vt_MDM(driver)) return false;
        if (!others_actions_vt_MDM(driver)) return false;
        if (!delete_vt_MDM(driver)) return false;
        //AGENCIES LOCATOR CONTROL TABLE
        if (!delete_alc_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_alc_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_alc_b_add", getElements("MDM_alc_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_alc_lov_validation_type", getElements("add_alc_lov_validation_type")}, // b_lov
                new String[]{"add_alc_i_validation_type", getElements("add_alc_i_validation_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "validation_type", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_alc_lov_seq_TO", getElements("add_alc_lov_seq_TO")}, // b_lov
                new String[]{"add_alc_i_seq_TO", getElements("add_alc_i_seq_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "seq_TO", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_alc_e_TO_name", getElements("add_alc_e_TO_name")}, // element path
                "TO_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_alc_lov_branch_TO", getElements("add_alc_lov_branch_TO")}, // b_lov
                new String[]{"add_alc_i_branch_TO", getElements("add_alc_i_branch_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch_TO", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_alc_i_first_char", getElements("add_alc_i_first_char")}, // element path
                "first_char", getData("first_char"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_alc_i_application_date", getElements("add_alc_i_application_date")}, // element path
                "application_date", getData("application_date"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_alc_b_save", getElements("add_alc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_alc_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_alc_lov_validation_type", getElements("search_alc_lov_validation_type")}, //LoV button
                new String[]{"search_alc_i_validation_type", getElements("search_alc_i_validation_type")}, //external LoV input
                new String[]{"search_lov_validation_type_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("validation_type"), // value to search
                "validation_type", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_alc_lov_seq_TO", getElements("search_alc_lov_seq_TO")}, //LoV button
                new String[]{"search_alc_i_seq_TO", getElements("search_alc_i_seq_TO")}, //external LoV input
                new String[]{"search_lov_seq_TO_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("seq_TO"), // value to search
                "seq_TO", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_alc_lov_branch_TO", getElements("search_alc_lov_branch_TO")}, //LoV button
                new String[]{"search_alc_i_branch_TO", getElements("search_alc_i_branch_TO")}, //external LoV input
                new String[]{"search_lov_branch_TO_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("branch_TO"), // value to search
                "branch_TO", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_alc_i_first_char", getElements("search_alc_i_first_char")}, // element path
                "first_char", getData("first_char"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_alc_i_application_date", getElements("search_alc_i_application_date")}, // element path
                "application_date", getData("application_date"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_alc_b_search", getElements("search_alc_b_search")}, //search button
                new String[]{"MDM_alc_e_result", getElements("MDM_alc_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_alc_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_alc_b_reset", getElements("search_alc_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_alc_b_edit", getElements("MDM_alc_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_alc_lov_validation_type", getElements("add_alc_lov_validation_type")}, // b_lov
                new String[]{"add_alc_i_validation_type", getElements("add_alc_i_validation_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "validation_type", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_alc_lov_seq_TO", getElements("add_alc_lov_seq_TO")}, // b_lov
                new String[]{"add_alc_i_seq_TO", getElements("add_alc_i_seq_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "seq_TO", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_alc_e_TO_name", getElements("add_alc_e_TO_name")}, // element path
                "TO_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_alc_lov_branch_TO", getElements("add_alc_lov_branch_TO")}, // b_lov
                new String[]{"add_alc_i_branch_TO", getElements("add_alc_i_branch_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch_TO", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_alc_i_first_char", getElements("add_alc_i_first_char")}, // element path
                "first_char", getData("first_char_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_alc_i_application_date", getElements("add_alc_i_application_date")}, // element path
                "application_date", getData("application_date_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_alc_b_save", getElements("add_alc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_alc_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_alc_b_qbe", getElements("MDM_alc_b_qbe")},// query button
                new String[]{"qbe_alc_i_validation_type", getElements("qbe_alc_i_validation_type")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_alc_i_validation_type", getElements("qbe_alc_i_validation_type")},
                "validation_type", getData("validation_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_alc_i_seq_TO", getElements("qbe_alc_i_seq_TO")},
                "seq_TO", getData("seq_TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_alc_i_TO_name", getElements("qbe_alc_i_TO_name")},
                "TO_name", getData("TO_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_alc_i_branch_TO", getElements("qbe_alc_i_branch_TO")},
                "branch_TO", getData("branch_TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_alc_i_first_char", getElements("qbe_alc_i_first_char")},
                "first_char", getData("first_char"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_alc_i_application_date", getElements("qbe_alc_i_application_date")},
                "application_date", getData("application_date"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_alc_i_validation_type", getElements("qbe_alc_i_validation_type")}, //search button
                new String[]{"MDM_alc_e_result", getElements("MDM_alc_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_alc_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_alc_b_actions", getElements("MDM_alc_b_actions")}, //actions button
                new String[]{"MDM_alc_b_actions_audit_data", getElements("MDM_alc_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_alc_b_detach", getElements("MDM_alc_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_vt_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_vt_b_add", getElements("MDM_vt_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_vt_i_validation_type", getElements("add_vt_i_validation_type")}, // element path
                "second_validation_type", getData("second_validation_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_vt_i_description", getElements("add_vt_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_vt_b_save", getElements("add_vt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_vt_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_vt_i_validation_type", getElements("search_vt_i_validation_type")}, // element path
                "second_validation_type", getData("second_validation_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_vt_i_description", getElements("search_vt_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_vt_b_search", getElements("search_vt_b_search")}, //search button
                new String[]{"MDM_vt_e_result", getElements("MDM_vt_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean qbe_vt_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_vt_b_qbe", getElements("MDM_vt_b_qbe")},// query button
                new String[]{"qbe_vt_i_validation_type", getElements("qbe_vt_i_validation_type")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_vt_i_validation_type", getElements("qbe_vt_i_validation_type")},
                "second_validation_type", getData("second_validation_type"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_vt_i_validation_type", getElements("qbe_vt_i_validation_type")}, //search button
                new String[]{"MDM_vt_e_result", getElements("MDM_vt_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_vt_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_vt_b_actions", getElements("MDM_vt_b_actions")}, //actions button
                new String[]{"MDM_vt_b_actions_audit_data", getElements("MDM_vt_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_vt_b_detach", getElements("MDM_vt_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_vt_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_vt_b_records", getElements("MDM_vt_b_records")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDelete(driver,
                new String[]{"MDM_vt_b_delete", getElements("MDM_vt_b_delete")},
                new String[]{"MDM_vt_b_delete_ok", getElements("MDM_vt_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_vt_b_records", getElements("MDM_vt_b_records")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_alc_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_alc_b_delete", getElements("MDM_alc_b_delete")},
                new String[]{"MDM_alc_e_records", getElements("MDM_alc_e_records")},
                new String[]{"MDM_alc_b_delete_ok", getElements("MDM_alc_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
