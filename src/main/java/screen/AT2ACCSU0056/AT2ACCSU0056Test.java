package screen.AT2ACCSU0056;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2ACCSU0056Test {
    protected AT2ACCSU0056Locators locators;
    protected AT2ACCSU0056Data data;

    public AT2ACCSU0056Test() {
    }
    public AT2ACCSU0056Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0056Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0056Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0056Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Distribution rules");
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
        if (!Functions.insertInput(driver, new String[]{"add_i_client_exp", getElements("add_i_client_exp")}, // element path
                "client_exp", getData("client_exp"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_product_exp", getElements("add_i_product_exp")}, // element path
                "product_exp", getData("product_exp"), where)) {
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
    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver,
                new String[]{"search_i_client_exp", getElements("search_i_client_exp")},
                "client_exp", data.getData().get("client_exp"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_product_exp", getElements("search_i_product_exp")},
                "product_exp", data.getData().get("product_exp"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_description", getElements("search_i_description")},
                "description", data.getData().get("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_creation_user", getElements("search_i_creation_user")},
                "creation_user", driver.getUserdetails().getUsername(), where)) {
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
        if (!Functions.insertInput(driver, new String[]{"add_i_client_exp", getElements("add_i_client_exp")}, // element path
                "client_exp", getData("client_exp_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_product_exp", getElements("add_i_product_exp")}, // element path
                "product_exp", getData("product_exp_edit"), where)) {
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
    private boolean qbe_accommodation(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_qbe", getElements("accommodation_b_qbe")},// query button
                new String[]{"qbe_i_client_exp", getElements("qbe_i_client_exp")},//any query input
                where)) {
            return false;
        }
        //Recuperamos primero el valor de "Rule sequence" para evitar que nos devuelva un valor nulo al llamarlo
        if (!Functions.getText(driver, new String[]{"search_e_rule_sequence_result", getElements("search_e_rule_sequence_result")}, // element path
                "rule_sequence_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule_sequence", getElements("qbe_i_rule_sequence")},
                "rule_sequence", getData("rule_sequence_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_client_exp", getElements("qbe_i_client_exp")},
                "client_exp", getData("client_exp"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_product_exp", getElements("qbe_i_product_exp")},
                "product_exp", getData("product_exp"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_client_exp", getElements("qbe_i_client_exp")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_accommodation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"accommodation_b_actions", getElements("accommodation_b_actions")}, //actions button
                new String[]{"accommodation_b_actions_audit_data", getElements("accommodation_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
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