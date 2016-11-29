package screen.AT2MDMRM0015;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 04/11/2016.
 */
public class AT2MDMRM0015Test {
    protected AT2MDMRM0015Locators locators;
    protected AT2MDMRM0015Data data;

    public AT2MDMRM0015Test() {
    }
    public AT2MDMRM0015Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0015Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0015Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0015Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Categories Groups");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_grp_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_grp_MDM(driver)) return false;
        if (!qbe_grp_MDM(driver)) return false;
        if (!others_actions_grp_MDM(driver)) return false;
        if (!interaction_record_dscr_MDM(driver)) return false;
        if (!qbe_dscr_MDM(driver)) return false;
        if (!interaction_edit_dscr_MDM(driver)) return false;
        if (!qbe_dscr_MDM(driver)) return false;
        if (!others_actions_dscr_MDM(driver)) return false;
        if (!interaction_record_ctgrs_MDM(driver)) return false;
        if (!qbe_ctgrs_MDM(driver)) return false;
        if (!interaction_edit_ctgrs_MDM(driver)) return false;
        if (!qbe_ctgrs_MDM(driver)) return false;
        if (!others_actions_ctgrs_MDM(driver)) return false;
        if (!delete_ctgrs_MDM(driver)) return false;
        if (!delete_dscr_MDM(driver)) return false;
        if (!delete_grp_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_grp_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grp_b_add", getElements("MDM_grp_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group", getElements("add_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")}, // element path
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grp_b_save", getElements("add_grp_b_save")}, //element to click
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
        if (!Functions.insertInput(driver, new String[]{"search_i_group", getElements("search_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_order", getElements("search_i_order")}, // element path
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_grp_e_result", getElements("MDM_grp_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_grp_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grp_b_edit", getElements("MDM_grp_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group", getElements("add_i_group")}, // element path
                "group", getData("group_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")}, // element path
                "order", getData("order_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grp_b_save", getElements("add_grp_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_grp_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_grp_b_qbe", getElements("MDM_grp_b_qbe")},// query button
                new String[]{"qbe_i_group", getElements("qbe_i_group")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group", getElements("qbe_i_group")},
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_group", getElements("qbe_i_group")}, //search button
                new String[]{"MDM_grp_e_result", getElements("MDM_grp_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_grp_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_grp_b_actions", getElements("MDM_grp_b_actions")}, //actions button
                new String[]{"MDM_grp_b_actions_audit_data", getElements("MDM_grp_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_grp_b_detach", getElements("MDM_grp_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_dscr_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dscr_b_add", getElements("MDM_dscr_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_language_description", getElements("add_i_language_description")}, // element path
                "language_description", getData("language_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_language_detailed_description", getElements("add_i_language_detailed_description")}, // element path
                "language_detailed_description", getData("language_detailed_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dscr_b_save", getElements("add_dscr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_dscr_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_dscr_e_result", getElements("MDM_dscr_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dscr_b_edit", getElements("MDM_dscr_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_language_description", getElements("add_i_language_description")}, // element path
                "language_description", getData("language_description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_language_detailed_description", getElements("add_i_language_detailed_description")}, // element path
                "language_detailed_description", getData("language_detailed_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dscr_b_save", getElements("add_dscr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dscr_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dscr_b_qbe", getElements("MDM_dscr_b_qbe")},// query button
                new String[]{"qbe_i_language", getElements("qbe_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language_description", getElements("qbe_i_language_description")},
                "language_description", getData("language_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_language", getElements("qbe_i_language")}, //search button
                new String[]{"MDM_dscr_e_result", getElements("MDM_dscr_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dscr_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dscr_b_actions", getElements("MDM_dscr_b_actions")}, //actions button
                new String[]{"MDM_dscr_b_actions_audit_data", getElements("MDM_dscr_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dscr_b_detach", getElements("MDM_dscr_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_ctgrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ctgrs_b_add", getElements("MDM_ctgrs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_category", getElements("add_lov_category")}, // b_lov
                new String[]{"add_i_category", getElements("add_i_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ctgrs_b_save", getElements("add_ctgrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_ctgrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_ctgrs_e_result", getElements("MDM_ctgrs_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ctgrs_b_edit", getElements("MDM_ctgrs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_category", getElements("add_lov_category")}, // b_lov
                new String[]{"add_i_category", getElements("add_i_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_e_category_description", getElements("add_e_category_description")}, // element path
                "category_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ctgrs_b_save", getElements("add_ctgrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_ctgrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_ctgrs_b_qbe", getElements("MDM_ctgrs_b_qbe")},// query button
                new String[]{"qbe_i_category", getElements("qbe_i_category")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_category", getElements("qbe_i_category")},
                "category", getData("category"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_category_description", getElements("qbe_i_category_description")},
                "category_description", getData("category_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_category", getElements("qbe_i_category")}, //search button
                new String[]{"MDM_ctgrs_e_result", getElements("MDM_ctgrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_ctgrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_ctgrs_b_actions", getElements("MDM_ctgrs_b_actions")}, //actions button
                new String[]{"MDM_ctgrs_b_actions_audit_data", getElements("MDM_ctgrs_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_ctgrs_b_detach", getElements("MDM_ctgrs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_ctgrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_ctgrs_b_delete", getElements("MDM_ctgrs_b_delete")},
                new String[]{"MDM_ctgrs_e_records", getElements("MDM_ctgrs_e_records")},
                new String[]{"MDM_ctgrs_b_delete_ok", getElements("MDM_ctgrs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_dscr_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dscr_b_delete", getElements("MDM_dscr_b_delete")},
                new String[]{"MDM_dscr_e_records", getElements("MDM_dscr_e_records")},
                new String[]{"MDM_dscr_b_delete_ok", getElements("MDM_dscr_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_grp_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_grp_b_delete", getElements("MDM_grp_b_delete")},
                new String[]{"MDM_grp_e_records", getElements("MDM_grp_e_records")},
                new String[]{"MDM_grp_b_delete_ok", getElements("MDM_grp_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
