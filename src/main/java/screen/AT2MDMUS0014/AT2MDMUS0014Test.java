package screen.AT2MDMUS0014;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMUS0014Test {
    protected AT2MDMUS0014Locators locators;
    protected AT2MDMUS0014Data data;

    public AT2MDMUS0014Test() {
    }
    public AT2MDMUS0014Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0014Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0014Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0014Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Manage users-departments");
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_user", getElements("add_lov_user")}, // b_lov
                new String[]{"add_i_user", getElements("add_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "user", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_e_user_name", getElements("add_e_user_name")}, // element path
                "user_name", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_department", getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_e_department_description", getElements("add_e_department_description")}, // element path
                "department_description", // key for data value (the name)
                where)){
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
                new String[]{"search_lov_user", getElements("search_lov_user")}, //LoV button
                new String[]{"search_i_user", getElements("search_i_user")}, //external LoV input
                new String[]{"search_lov_user_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("user"), // value to search
                "user", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_department", getElements("search_lov_department")}, //LoV button
                new String[]{"search_i_department", getElements("search_i_department")}, //external LoV input
                new String[]{"search_lov_department_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("department"), // value to search
                "department", //name of the data
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
    private boolean interaction_edit_MDM(TestDriver driver) {
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
        if (!Functions.createLov(driver,
                new String[]{"add_lov_department", getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_e_department_description", getElements("add_e_department_description")}, // element path
                "department_description", // key for data value (the name)
                where)){
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
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")}, // element path
                "user", getData("user"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user_name", getElements("qbe_i_user_name")},
                "user_name", getData("user_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department", getElements("qbe_i_department")},
                "department", getData("department"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department_description", getElements("qbe_i_department_description")},
                "department_description", getData("department_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //search button
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
