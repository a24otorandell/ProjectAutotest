package screen.AT2MDMRM0008;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 17/11/2016.
 */
public class AT2MDMRM0008Sis {
    protected AT2MDMRM0008Locators locators;
    protected AT2MDMRM0008Data data;

    public AT2MDMRM0008Sis() {
    }
    public AT2MDMRM0008Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0008Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0008Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0008Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Maintenance allotment by interface");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!data_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_inter_MDM(driver)) return false;
        if (!qbe_inter_MDM(driver)) return false;
        if (!others_actions_inter_MDM(driver)) return false;
        if (!interaction_record_all_MDM(driver)) return false;
        if (!qbe_all_record_MDM(driver)) return false;
        if (!interaction_edit_all_MDM(driver)) return false;
        if (!qbe_all_edit_MDM(driver)) return false;
        if (!others_actions_all_MDM(driver)) return false;
        if (!delete_all_MDM(driver)) return false;
        //LOS REGISTROS DE INTERFACE ESTÁN VINCULADOS CON OTRAS PANTALLAS, NO SE PUEDE BORRAR
        //if (!delete_inter_MDM(driver)) return false;
        return false;
    }

    private boolean data_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on DATA";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_inter_e_result", getElements("MDM_inter_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_code_result", getElements("search_e_code_result")}, // element path
                "code_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_description_result", getElements("search_e_description_result")}, // element path
                "description_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_interface_code_result", getElements("search_e_interface_code_result")}, // element path
                "interface_code_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getAttr(driver, new String[]{"search_e_allotment_result", getElements("search_e_allotment_result")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "allotment_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_no_max_result", getElements("search_e_no_max_result")}, // element path
                "no_max_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_code", getElements("search_i_code")}, // element path
                "code", getData("code_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_interface_code", getElements("search_i_interface_code")}, // element path
                "interface_code", getData("interface_code_result"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        boolean checkbox;
        if (getData("allotment_result").equalsIgnoreCase("checked")) {
            checkbox = true;
        }
        else {
            checkbox = false;
        }
        if(!Functions.checkboxValue(driver, getElements("search_cb_allotment"),
                "allotment", checkbox, true,
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_no_max", getElements("search_i_no_max")}, // element path
                "no_max_result", getData("no_max_result"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_inter_e_result", getElements("MDM_inter_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_inter_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_inter_e_result", getElements("MDM_inter_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_inter_b_edit", getElements("MDM_inter_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_inter_cb_allotment"),
                    "allotment", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_inter_cb_allotment"),
                    "allotment", false, true,
                    where)){
                return false;
            }
        }
        if (randomBoolean == "Yes") {
            if (!Functions.insertInput(driver, new String[]{"add_inter_i_no_max", getElements("add_inter_i_no_max")}, // element path
                    "no_max", getData("no_max_edit"), where)) {
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_inter_b_save", getElements("add_inter_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_inter_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_inter_b_qbe", getElements("MDM_inter_b_qbe")},// query button
                new String[]{"qbe_inter_i_code", getElements("qbe_inter_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_inter_i_code", getElements("qbe_inter_i_code")},
                "code", getData("code_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_inter_i_description", getElements("qbe_inter_i_description")},
                "description", getData("description_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_inter_i_interface_code", getElements("qbe_inter_i_interface_code")},
                "interface_code", getData("interface_code_result"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_inter_sl_allotment", getElements("qbe_inter_sl_allotment")},
                getData("allotment"), "allotment",
                where)) {
            return false;
        }
        if (getData("allotment").equalsIgnoreCase("Yes")) {
            if (!Functions.insertInput(driver, new String[]{"qbe_inter_i_no_max", getElements("qbe_inter_i_no_max")},
                    "no_max", getData("no_max_edit"),
                    where)) {
                return false;
            }
        }
        else {
            if (!Functions.insertInput(driver, new String[]{"qbe_inter_i_no_max", getElements("qbe_inter_i_no_max")},
                    "no_max", getData("no_max_result"),
                    where)) {
                return false;
            }
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_inter_i_code", getElements("qbe_inter_i_code")}, //search button
                new String[]{"MDM_inter_e_result", getElements("MDM_inter_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_inter_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_inter_b_actions", getElements("MDM_inter_b_actions")}, //actions button
                new String[]{"MDM_inter_b_actions_audit_data", getElements("MDM_inter_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("SELECT ALLOTMENT", 3, false);
        where = " on ALLOTMENT SELECTION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_inter_b_actions", getElements("MDM_inter_b_actions")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_inter_b_actions_allotm_selected", getElements("MDM_inter_b_actions_allotm_selected")}, //element to click
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_inter_b_detach", getElements("MDM_inter_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_all_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_all_b_add", getElements("MDM_all_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_all_lov_TO",getElements("add_all_lov_TO")}, // b_lov
                new String[]{"add_all_i_TO", getElements("add_all_i_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "TO", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_all_lov_braofi",getElements("add_all_lov_braofi")}, // b_lov
                new String[]{"add_all_i_braofi", getElements("add_all_i_braofi")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "braofi", //Data name
                where)){
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_all_cb_exclude"),
                    "exclude", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_all_cb_exclude"),
                    "exclude", false, true,
                    where)){
                return false;
            }
        }
        if (randomBoolean == "No") {
            if (!Functions.insertInput(driver, new String[]{"add_all_no_allotm", getElements("add_all_no_allotm")}, // element path
                    "no_allotm", getData("no_allotm"), where)) {
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_all_b_save", getElements("add_all_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_all_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_all_e_result", getElements("MDM_all_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_all_b_edit", getElements("MDM_all_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_all_lov_braofi",getElements("add_all_lov_braofi")}, // b_lov
                new String[]{"add_all_i_braofi", getElements("add_all_i_braofi")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "braofi", //Data name
                where)){
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_all_cb_exclude"),
                    "exclude", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_all_cb_exclude"),
                    "exclude", false, true,
                    where)){
                return false;
            }
        }
        if (randomBoolean == "No") {
            if (!Functions.insertInput(driver, new String[]{"add_all_no_allotm", getElements("add_all_no_allotm")}, // element path
                    "no_allotm", getData("no_allotm_edit"), where)) {
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_all_b_save", getElements("add_all_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_all_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_all_b_qbe", getElements("MDM_all_b_qbe")},// query button
                new String[]{"qbe_all_i_TO", getElements("qbe_all_i_TO")},//any query input
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_all_i_TO", getElements("qbe_all_i_TO")},
                "TO", getData("TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_all_i_braofi", getElements("qbe_all_i_braofi")},
                "braofi", getData("braofi"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_all_sl_exclude", getElements("qbe_all_sl_exclude")},
                getData("exclude"), "exclude",
                where)) {
            return false;
        }
        if (getData("exclude").equalsIgnoreCase("Yes")) {
            if (!Functions.insertInput(driver, new String[]{"qbe_all_i_no_allotm", getElements("qbe_all_i_no_allotm")},
                    "no_allotm", " ", where)) {
                return false;
            }
        }
        else {
            if (!Functions.insertInput(driver, new String[]{"qbe_all_i_no_allotm", getElements("qbe_all_i_no_allotm")},
                    "no_allotm", getData("no_allotm"), where)) {
                return false;
            }
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_all_i_TO", getElements("qbe_all_i_TO")}, //search button
                new String[]{"MDM_all_e_result", getElements("MDM_all_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_all_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_all_b_qbe", getElements("MDM_all_b_qbe")},// query button
                new String[]{"qbe_all_i_TO", getElements("qbe_all_i_TO")},//any query input
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_all_i_TO", getElements("qbe_all_i_TO")},
                "TO", getData("TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_all_i_braofi", getElements("qbe_all_i_braofi")},
                "braofi", getData("braofi"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_all_sl_exclude", getElements("qbe_all_sl_exclude")},
                getData("exclude"), "exclude",
                where)) {
            return false;
        }
        if (getData("exclude").equalsIgnoreCase("Yes")) {
            if (!Functions.insertInput(driver, new String[]{"qbe_all_i_no_allotm", getElements("qbe_all_i_no_allotm")},
                    "no_allotm", " ", where)) {
                return false;
            }
        }
        else {
            if (!Functions.insertInput(driver, new String[]{"qbe_all_i_no_allotm", getElements("qbe_all_i_no_allotm")},
                    "no_allotm", getData("no_allotm_edit"), where)) {
                return false;
            }
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_all_i_TO", getElements("qbe_all_i_TO")}, //search button
                new String[]{"MDM_all_e_result", getElements("MDM_all_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_all_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_all_b_actions", getElements("MDM_all_b_actions")}, //actions button
                new String[]{"MDM_all_b_actions_audit_data", getElements("MDM_all_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - EXCLUDE SELECTED", 3, false);
        where = " on EXCLUDING SELECTION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_all_b_actions", getElements("MDM_all_b_actions")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_all_b_actions_exclude_selected", getElements("MDM_all_b_actions_exclude_selected")}, //element to click
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_all_b_detach", getElements("MDM_all_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_all_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_all_b_delete", getElements("MDM_all_b_delete")},
                new String[]{"MDM_all_e_records", getElements("MDM_all_e_records")},
                new String[]{"MDM_all_b_delete_ok", getElements("MDM_all_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_inter_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_inter_b_delete", getElements("MDM_inter_b_delete")},//delete button
                new String[]{"MDM_inter_e_records", getElements("MDM_inter_e_records")},//delete button
                new String[]{"MDM_inter_b_delete_ok", getElements("MDM_inter_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
