package screen.AT2MDMCL0024;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2MDMCL0024.AT2MDMCL0024Data;
import screen.AT2MDMCL0024.AT2MDMCL0024Locators;

import java.util.Random;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2MDMCL0024Test {
    protected AT2MDMCL0024Locators locators;
    protected AT2MDMCL0024Data data;

    public AT2MDMCL0024Test() {
    }
    public AT2MDMCL0024Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0024Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0024Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0024Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Commision");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_commision(driver)) return false;
        if (!search_commision(driver)) return false;
        if (!interaction_edit_commision(driver)) return false;
        if (!qbe_commision(driver)) return false;
        if (!others_actions_commision(driver)) return false;
        if (!delete_commision(driver)) return false;
        return false;
    }

    private boolean interaction_record_commision(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"commision_b_add", getElements("commision_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_short", getElements("add_lov_short")}, // b_lov
                new String[]{"add_i_short", getElements("add_i_short")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "short", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_atlas", getElements("add_i_atlas")}, // element path
                "atlas", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_sap", getElements("add_lov_sap")}, // b_lov
                new String[]{"add_i_sap", getElements("add_i_sap")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "sap", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_to", getElements("add_i_to")}, // element path
                "to", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_From", getElements("add_i_date_from")},
                "date_from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_to", getElements("add_i_date_to")},
                "date_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_commision_type", getElements("add_sl_commision_type")},
                "Margin", "commision_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commision_margin", getElements("add_i_commision_margin")},
                "commision_margin", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_bank"), "bank", true, true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_excl"), "excl", true, true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_incl"), "incl", true, true, where)) {
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
    private boolean search_commision(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas", getElements("search_i_atlas")},
                "atlas", getData("atlas"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_short", getElements("search_lov_short")}, //LoV button
                new String[]{"search_i_short", getElements("search_i_short")}, //external LoV input
                new String[]{"search_lov_short_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("short"), // value to search
                "short", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_sap", getElements("search_lov_sap")}, //LoV button
                new String[]{"search_i_sap", getElements("search_i_sap")}, //external LoV input
                new String[]{"search_lov_sap_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("sap"), // value to search
                "sap", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_to", getElements("search_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_from", getElements("search_i_date_from")},
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_to", getElements("search_i_date_to")},
                "date_to", getData("date_to"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_commision_type", getElements("search_sl_commision_type")},
                getData("commision_type"), "commision_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commision_margin", getElements("search_i_commision_margin")},
                "commision_margin", getData("commision_margin"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_bank"), getData("bank"), true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_excl"), getData("excl"), true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_incl"), getData("incl"), true, where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"commision_e_result", getElements("commision_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_commision(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"commision_b_edit", getElements("commision_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_short", getElements("add_lov_short")}, // b_lov
                new String[]{"add_i_short", getElements("add_i_short")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "short", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_atlas", getElements("add_i_atlas")}, // element path
                "atlas", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_sap", getElements("add_lov_sap")}, // b_lov
                new String[]{"add_i_sap", getElements("add_i_sap")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "sap", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_to", getElements("add_i_to")}, // element path
                "to", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_From", getElements("add_i_date_from")},
                "date_from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_to", getElements("add_i_date_to")},
                "date_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_commision_type", getElements("add_sl_commision_type")},
                "Sale", "commision_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commision_margin", getElements("add_i_commision_margin")},
                "commision_margin", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_bank"), "bank", false, true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_excl"), "excl", false, true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_incl"), "incl", false, true, where)) {
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
    private boolean qbe_commision(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"commision_e_result", getElements("commision_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_bank"), getData("bank"), false, where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"commision_b_qbe", getElements("commision_b_qbe")},// query button
                new String[]{"qbe_i_atlas", getElements("qbe_i_atlas")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas", getElements("qbe_i_atlas")},
                "atlas", getData("atlas"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short", getElements("qbe_i_short")},
                "short", getData("short"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sap", getElements("qbe_i_sap")},
                "sap", getData("sap"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_from", getElements("qbe_i_date_from")},
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_to", getElements("qbe_i_date_to")},
                "date_to", getData("date_to"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_commision_type", getElements("qbe_sl_commision_type")},
                getData("commision_type"), "commision_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_commision_margin", getElements("qbe_i_commision_margin")},
                "commision_margin", getData("commision_margin"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_bank", getElements("qbe_sl_bank")},
                getData("bank"), "bank", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_excl", getElements("qbe_sl_excl")},
                getData("excl"), "excl", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_incl", getElements("qbe_sl_incl")},
                getData("incl"), "incl", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_atlas", getElements("qbe_i_atlas")}, //search button
                new String[]{"commision_e_result", getElements("commision_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_commision(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"commision_b_actions", getElements("commision_b_actions")}, //actions button
                new String[]{"commision_b_actions_b_audit_data", getElements("commision_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"commision_b_detach", getElements("commision_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_commision(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"commision_b_delete", getElements("commision_b_delete")},
                new String[]{"commision_e_records", getElements("commision_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}