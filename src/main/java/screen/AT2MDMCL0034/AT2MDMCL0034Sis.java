package screen.AT2MDMCL0034;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 20/10/2016.
 */
public class AT2MDMCL0034Sis {
    protected AT2MDMCL0034Locators locators;
    protected AT2MDMCL0034Data data;

    public AT2MDMCL0034Sis() {
    }
    public AT2MDMCL0034Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0034Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0034Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0034Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Currency Exchange");
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
                new String[]{"add_lov_partner", getElements("add_lov_partner")}, // b_lov
                new String[]{"add_i_partner", getElements("add_i_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "partner", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_from", getElements("add_i_date_from")}, // element path
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_origin_currency_code", getElements("add_lov_origin_currency_code")}, // b_lov
                new String[]{"add_i_origin_currency_code", getElements("add_i_origin_currency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "origin_currency_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination_currency_code", getElements("add_lov_destination_currency_code")}, // b_lov
                new String[]{"add_i_destination_currency_code", getElements("add_i_destination_currency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination_currency_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tax_number", getElements("add_i_tax_number")}, // element path
                "tax_number", getData("tax_number"), where)) {
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
                new String[]{"search_lov_partner", getElements("search_lov_partner")}, //LoV button
                new String[]{"search_i_partner", getElements("search_i_partner")}, //external LoV input
                new String[]{"search_lov_partner_i_code", recursiveXPaths.lov_i_altgenericinput2}, //internal LoV input
                getData("partner"), // value to search
                "partner", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_from", getElements("search_i_date_from")}, // element path
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_origin_currency_code", getElements("search_lov_origin_currency_code")}, //LoV button
                new String[]{"search_i_origin_currency_code", getElements("search_i_origin_currency_code")}, //external LoV input
                new String[]{"search_lov_origin_currency_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("origin_currency_code"), // value to search
                "origin_currency_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination_currency_code", getElements("search_lov_destination_currency_code")}, //LoV button
                new String[]{"search_i_destination_currency_code", getElements("search_i_destination_currency_code")}, //external LoV input
                new String[]{"search_lov_destination_currency_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("destination_currency_code"), // value to search
                "destination_currency_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tax_number", getElements("search_i_tax_number")}, // element path
                "tax_number", getData("tax_number"), where)) {
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
                new String[]{"add_lov_partner", getElements("add_lov_partner")}, // b_lov
                new String[]{"add_i_partner", getElements("add_i_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "partner", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_partner_description", getElements("add_e_partner_description")}, // element path
                "partner_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_from", getElements("add_i_date_from")}, // element path
                "date_from", getData("date_from_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_origin_currency_code", getElements("add_lov_origin_currency_code")}, // b_lov
                new String[]{"add_i_origin_currency_code", getElements("add_i_origin_currency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "origin_currency_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_origin_currency_code_description", getElements("add_e_origin_currency_code_description")}, // element path
                "origin_currency_code_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination_currency_code", getElements("add_lov_destination_currency_code")}, // b_lov
                new String[]{"add_i_destination_currency_code", getElements("add_i_destination_currency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination_currency_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_destination_currency_code_description", getElements("add_e_destination_currency_code_description")}, // element path
                "destination_currency_code_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tax_number", getElements("add_i_tax_number")}, // element path
                "tax_number", getData("tax_number_edit"), where)) {
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
                new String[]{"qbe_i_partner_name", getElements("qbe_i_partner_name")},//any query input
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_partner_result", getElements("search_i_partner_result")}, // element path
                "partner_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_partner_name", getElements("qbe_i_partner_name")},
                "partner_name", getData("partner_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_from", getElements("qbe_i_date_from")},
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_origin_currency_code", getElements("qbe_i_origin_currency_code")},
                "origin_currency_code", getData("origin_currency_code"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_origin_currency_result", getElements("search_i_origin_currency_result")}, // element path
                "origin_currency", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_origin_currency", getElements("qbe_i_origin_currency")},
                "origin_currency", getData("origin_currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_currency_code", getElements("qbe_i_destination_currency_code")},
                "destination_currency_code", getData("destination_currency_code"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_destination_currency_result", getElements("search_i_destination_currency_result")}, // element path
                "destination_currency", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_currency", getElements("qbe_i_destination_currency")},
                "destination_currency", getData("destination_currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_tax_number", getElements("qbe_i_tax_number")},
                "tax_number", getData("tax_number"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_partner_name", getElements("qbe_i_partner_name")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
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
