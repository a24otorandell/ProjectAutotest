package screen.AT2MDMCL0027;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0027Test {
    protected AT2MDMCL0027Locators locators;
    protected AT2MDMCL0027Data data;

    public AT2MDMCL0027Test() {
    }

    public AT2MDMCL0027Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0027Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0027Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0027Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Commission groups maintenance");
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
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group", getElements("add_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_short_name", getElements("add_lov_short_name")}, // b_lov
                new String[]{"add_i_short_name", getElements("add_i_short_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "short_name", //Data name
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
        if (!Functions.insertInput(driver, new String[]{"search_i_group", getElements("search_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_short_name", getElements("search_lov_short_name")}, //LoV button
                new String[]{"search_i_short_name", getElements("search_i_short_name")}, //external LoV input
                new String[]{"search_lov_short_name_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                getData("short_name"), // value to search
                "short_name", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_language", getElements("search_lov_language")}, //LoV button
                new String[]{"search_i_language", getElements("search_i_language")}, //external LoV input
                new String[]{"search_lov_language_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("language"), // value to search
                "language", //name of the data
                where)) {
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
    private boolean interaction_edit_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
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
        if (!Functions.createLov(driver,
                new String[]{"add_lov_short_name", getElements("add_lov_short_name")}, // b_lov
                new String[]{"add_i_short_name", getElements("add_i_short_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "short_name", //Data name
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
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_group", getElements("qbe_i_group")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group", getElements("qbe_i_group")}, // element path
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")}, // element path
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")}, // element path
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_group", getElements("qbe_i_group")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_accommodation(TestDriver driver) {
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
    private boolean delete_accommodation(TestDriver driver) {
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