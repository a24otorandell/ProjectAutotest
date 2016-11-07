package screen.AT2MDMSY0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMSY0001Sis {
    protected AT2MDMSY0001Locators locators;
    protected AT2MDMSY0001Data data;

    public AT2MDMSY0001Sis() {
    }
    public AT2MDMSY0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0001Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0001Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Labels By Interface");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        if (!delete_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_name", getElements("add_lov_name")}, // b_lov
                new String[]{"add_i_name", getElements("add_i_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "name", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_report_description", getElements("add_e_report_description")}, // element path
                "report_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
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
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")}, // element path
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_label", getElements("add_i_label")}, // element path
                "label", getData("label"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")}, // element path
                "remarks", getData("remarks"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_name", getElements("search_lov_name")}, //LoV button
                new String[]{"search_i_name", getElements("search_i_name")}, //external LoV input
                new String[]{"search_lov_name_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("name"), // value to search
                "name", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_language", getElements("search_lov_language")}, //LoV button
                new String[]{"search_i_language", getElements("search_i_language")}, //external LoV input
                new String[]{"search_lov_language_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("language"), // value to search
                "language", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_order", getElements("search_i_order")}, // element path
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_report_description", getElements("search_lov_report_description")}, //LoV button
                new String[]{"search_i_report_description", getElements("search_i_report_description")}, //external LoV input
                new String[]{"search_lov_report_description_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                getData("report_description"), // value to search
                "report_description", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_label", getElements("search_i_label")}, // element path
                "label", getData("label"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_remarks", getElements("search_i_remarks")}, // element path
                "remarks", getData("remarks"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_name", getElements("add_lov_name")}, // b_lov
                new String[]{"add_i_name", getElements("add_i_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "name", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_report_description", getElements("add_e_report_description")}, // element path
                "report_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
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
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")}, // element path
                "order", getData("order_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_label", getElements("add_i_label")}, // element path
                "label", getData("label_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")}, // element path
                "remarks", getData("remarks_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_name", getElements("qbe_i_name")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_report_description", getElements("qbe_i_report_description")},
                "report_description", getData("report_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_name", getElements("qbe_i_name")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_detach", getElements("MDM_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_delete", getElements("MDM_b_delete")},
                new String[]{"MDM_e_records", getElements("MDM_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
