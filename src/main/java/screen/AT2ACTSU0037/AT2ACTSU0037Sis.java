package screen.AT2ACTSU0037;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2ACTSU0037Sis {
    protected AT2ACTSU0037Locators locators;
    protected AT2ACTSU0037Data data;

    public AT2ACTSU0037Sis() {
    }
    public AT2ACTSU0037Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACTSU0037Locators locators) {
        this.locators = locators;
    }
    public AT2ACTSU0037Data getData() {
        return data;
    }
    public void setData(AT2ACTSU0037Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Suppliers B2B 2.0");

    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_supplier(driver)) return false;
        if (!search_supplier(driver)) return false;
        if (!interaction_edit_supplier(driver)) return false;
        if (!qbe_supplier(driver)) return false;
        if (!others_actions_supplier(driver)) return false;
        if (!delete_supplier(driver)) return false;
        return false;
    }

    private boolean interaction_record_supplier(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_add", getElements("suppliers_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type", getElements("add_sl_type")},
                "TICK", "type", where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, //LoV button
                new String[]{"add_i_to", getElements("add_i_to")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "to", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_to_name", getElements("add_i_to_name")}, // element path
                "to_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, //LoV button
                new String[]{"add_i_interface", getElements("add_i_interface")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_days", getElements("add_i_days")},
                "days", "" + 4, where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_supplier(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type", getElements("search_sl_type")},
                getData("type"), "type", where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_to", getElements("search_lov_to")}, //LoV button
                new String[]{"search_i_to", getElements("search_i_to")}, //external LoV input
                new String[]{"search_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("to"), // value to search
                "to", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_days", getElements("search_i_days")},
                "days", getData("days"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_supplier(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_edit", getElements("suppliers_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type", getElements("add_sl_type")},
                "SITE", "type", where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, //LoV button
                new String[]{"add_i_to", getElements("add_i_to")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "to", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_to_name", getElements("add_i_to_name")}, // element path
                "to_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, //LoV button
                new String[]{"add_i_interface", getElements("add_i_interface")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_days", getElements("add_i_days")},
                "days", "" + 2, where)) {
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
    private boolean qbe_supplier(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"search_i_to", getElements("search_i_to")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"suppliers_b_qbe", getElements("suppliers_b_qbe")},// query button
                new String[]{"qbe_i_to", getElements("qbe_i_to")},//any query input
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type", getElements("qbe_sl_type")},
                getData("type"), "type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_name", getElements("qbe_i_to_name")},
                "to_name", getData("to_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_days", getElements("qbe_i_days")},
                "days", getData("days"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_to", getElements("qbe_i_to")}, //search button
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_supplier(TestDriver driver) {
        // driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = "";
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"suppliers_b_detach", getElements("suppliers_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_supplier(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"suppliers_b_delete", getElements("suppliers_b_delete")},
                new String[]{"suppliers_e_records", getElements("suppliers_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
