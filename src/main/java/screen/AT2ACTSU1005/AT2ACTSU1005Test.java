package screen.AT2ACTSU1005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2ACTSU1005Test {
    protected AT2ACTSU1005Locators locators;
    protected AT2ACTSU1005Data data;

    public AT2ACTSU1005Test() {
    }
    public AT2ACTSU1005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACTSU1005Locators locators) {
        this.locators = locators;
    }
    public AT2ACTSU1005Data getData() {
        return data;
    }
    public void setData(AT2ACTSU1005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Activities");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Setup Barcodes Loro park integration");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_activities(driver)) return false;
        if (!search_activities(driver)) return false;
        if (!interaction_edit_activities(driver)) return false;
        if (!qbe_activities(driver)) return false;
        if (!others_actions_activities(driver)) return false;
        if (!delete_activities(driver)) return false;
        return false;
    }

    private boolean interaction_record_activities(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"activities_b_add", getElements("activities_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_prefix", getElements("add_i_prefix")}, // element path
                "prefix", getData("prefix"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description"), where)) {
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
    private boolean search_activities(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        //Recuperamos el valor de "Code" para poder usarlo en la búsqueda
        if (!Functions.getText(driver, new String[]{"search_i_code_result", getElements("search_i_code_result")}, // element path
                "code_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_code", getElements("search_i_code")},
                "code", data.getData().get("code_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_prefix", getElements("search_i_prefix")},
                "prefix", data.getData().get("prefix"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_description", getElements("search_i_description")},
                "description", data.getData().get("description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"activities_e_result", getElements("activities_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_activities(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"activities_b_edit", getElements("activities_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_prefix", getElements("add_i_prefix")}, // element path
                "prefix", getData("prefix_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description_edit"), where)) {
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
    private boolean qbe_activities(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"activities_b_qbe", getElements("activities_b_qbe")},// query button
                new String[]{"qbe_i_prefix", getElements("qbe_i_prefix")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_prefix", getElements("qbe_i_prefix")},
                "prefix", getData("prefix"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_prefix", getElements("qbe_i_prefix")}, //search button
                new String[]{"activities_e_result", getElements("activities_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_activities(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"activities_b_actions", getElements("activities_b_actions")}, //actions button
                new String[]{"activities_b_actions_audit_data", getElements("activities_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"activities_b_detach", getElements("activities_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_activities(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"activities_b_delete", getElements("activities_b_delete")},
                new String[]{"activities_e_records", getElements("activities_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}