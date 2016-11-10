package screen.AT2ACCSU0057;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCSU0057Sis {
    protected AT2ACCSU0057Locators locators;
    protected AT2ACCSU0057Data data;

    public AT2ACCSU0057Sis() {
    }
    public AT2ACCSU0057Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0057Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0057Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0057Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Plugin Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Plugin Properties");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_accommodation(driver)) return false;
        if (!search_accommodation(driver)) return false;
        if (!interaction_edit_accommodation(driver)) return false;
        if (!qbe_accommodation(driver)) return false;
        if (!others_actions_accommodation(driver)) return false;
        if (!delete_accommodation(driver)) return false;
        return false;
    }

    private boolean interaction_record_accommodation(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_add", getElements("accommodation_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_key", getElements("add_i_key")}, // element path
                "key", getData("key"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_age_ext_code", getElements("add_i_age_ext_code")}, // element path
                "age_ext_code", getData("age_ext_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_environment_id", getElements("add_i_environment_id")}, // element path
                "environment_id", getData("environment_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_value", getElements("add_i_value")}, // element path
                "value", getData("value"), where)) {
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
    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver,
                new String[]{"search_i_key", getElements("search_i_key")},
                "key", data.getData().get("key"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_age_ext_code", getElements("search_i_age_ext_code")},
                "age_ext_code", data.getData().get("age_ext_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_environment_id", getElements("search_i_environment_id")},
                "environment_id", data.getData().get("environment_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_value", getElements("search_i_value")},
                "value", data.getData().get("value"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_edit", getElements("accommodation_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_key", getElements("add_i_key")}, // element path
                "key", getData("key_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_age_ext_code", getElements("add_i_age_ext_code")}, // element path
                "age_ext_code", getData("age_ext_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_environment_id", getElements("add_i_environment_id")}, // element path
                "environment_id", getData("environment_id_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_value", getElements("add_i_value")}, // element path
                "value", getData("value_edit"), where)) {
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
    private boolean qbe_accommodation(TestDriver driver) {

        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";

        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_qbe", getElements("accommodation_b_qbe")},// query button
                new String[]{"qbe_i_key", getElements("qbe_i_key")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_key", getElements("qbe_i_key")},
                "key", getData("key"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_age_ext_code", getElements("qbe_i_age_ext_code")},
                "age_ext_code", getData("age_ext_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_environment_id", getElements("qbe_i_environment_id")},
                "environment_id", getData("environment_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_value", getElements("qbe_i_value")},
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_key", getElements("qbe_i_key")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_accommodation(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"accommodation_b_detach", getElements("accommodation_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_accommodation(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"accommodation_b_delete", getElements("accommodation_b_delete")},
                new String[]{"accommodation_e_records", getElements("accommodation_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}

