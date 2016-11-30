package screen.AT2MDMSY0023;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 09/11/2016.
 */
public class AT2MDMSY0023Test {
    protected AT2MDMSY0023Locators locators;
    protected AT2MDMSY0023Data data;

    public AT2MDMSY0023Test() {
    }
    public AT2MDMSY0023Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0023Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0023Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0023Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Request params");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search_MDM(driver)) return false;
        if (!interaction_record_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!interaction_edit_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        if (!delete_MDM(driver)) return false;
        return false;
    }

    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.createLov(driver,
                new String[]{"search_lov_environment", getElements("search_lov_environment")}, // b_lov
                new String[]{"search_i_environment", getElements("search_i_environment")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "environment", //Data name
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                where)) {
            return false;
        }
        return true;
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
        if (!Functions.insertInput(driver, new String[]{"add_i_application", getElements("add_i_application")}, // element path
                "application", getData("application"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group", getElements("add_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_value", getElements("add_i_value")}, // element path
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")}, // element path
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")}, // element path
                "remarks", getData("remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_parameter_value", getElements("add_i_parameter_value")}, // element path
                "parameter_value", getData("parameter_value"), where)) {
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
    private boolean interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group", getElements("add_i_group")}, // element path
                "group", getData("group_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_value", getElements("add_i_value")}, // element path
                "value", getData("value_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")}, // element path
                "type", getData("type_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")}, // element path
                "remarks", getData("remarks_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_parameter_value", getElements("add_i_parameter_value")}, // element path
                "parameter_value", getData("parameter_value_edit"), where)) {
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
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_application", getElements("qbe_i_application")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application", getElements("qbe_i_application")}, // element path
                "application", getData("application"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group", getElements("qbe_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_value", getElements("qbe_i_value")}, // element path
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")}, // element path
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_remarks", getElements("qbe_i_remarks")}, // element path
                "remarks", getData("remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_parameter_value", getElements("qbe_i_parameter_value")}, // element path
                "parameter_value", getData("parameter_value"), where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_application", getElements("qbe_i_application")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
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
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_delete", getElements("MDM_b_delete")},
                new String[]{"MDM_e_records", getElements("MDM_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
