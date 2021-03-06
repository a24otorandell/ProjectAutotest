package screen.AT2ACCSU0035;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 13/10/2016.
 */

/**
 * No todas las company_code tienen office, y algunas que tienen, no tienen fiscal_zone
 * Probado MANUALMENTE con los siguientes valores:
 * COMPANY CODE: E10
 * OFFICE: 859
 * Autotest configurado con valores por defecto para que no falle.
 */

public class AT2ACCSU0035Sis {
    protected AT2ACCSU0035Locators locators;
    protected AT2ACCSU0035Data data;

    public AT2ACCSU0035Sis() {
    }
    public AT2ACCSU0035Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0035Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0035Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0035Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Taxes");

    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_taxes(driver)) return false;
        if (!search_taxes(driver)) return false;
        if (!interaction_edit_taxes(driver)) return false;
        if (!qbe_taxes(driver)) return false;
        if (!others_actions_taxes(driver)) return false;
        if (!delete_taxes(driver)) return false;
        return false;
    }

    private boolean search_taxes(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company_code", getElements("search_lov_company_code")}, //LoV button
                new String[]{"search_i_company_code", getElements("search_i_company_code")}, //external LoV input
                new String[]{"search_lov_company_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company_code"), // value to search
                "company_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("office"), // value to search
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date", getElements("search_i_from_date")},
                "from_date", getData("from_date"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_fiscal_zone", getElements("search_lov_fiscal_zone")}, //LoV button
                new String[]{"search_i_fiscal_zone", getElements("search_i_fiscal_zone")}, //external LoV input
                new String[]{"search_lov_fiscal_zone_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("fiscal_zone"), // value to search
                "fiscal_zone", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_purchase_percentage", getElements("search_i_purchase_percentage")},
                "purchase_percentage", getData("purchase_percentage"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_purchase_amount", getElements("search_i_purchase_amount")},
                "purchase_amount", getData("purchase_amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sale_percentage", getElements("search_i_sale_percentage")},
                "sale_percentage", getData("sale_percentage"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sale_amount", getElements("search_i_sale_amount")},
                "sale_amount", getData("sale_amount"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_application_type", getElements("search_sl_application_type")},
                getData("application_type"), "application_type", where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_currency", getElements("search_lov_currency")}, //LoV button
                new String[]{"search_i_currency", getElements("search_i_currency")}, //external LoV input
                new String[]{"search_lov_currency_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("currency"), // value to search
                "currency", //name of the data
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"taxes_e_result", getElements("taxes_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_taxes(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"taxes_b_add", getElements("taxes_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_company_code", getElements("add_lov_company_code")}, //LoV button
                new String[]{"add_i_company_code", getElements("add_i_company_code")}, //external LoV input
                new String[]{"add_lov_company_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result,
                "E10", // value to search
                "company_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, //LoV button
                new String[]{"add_i_office", getElements("add_i_office")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from_date", getElements("add_i_from_date")},
                "from_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_fiscal_zone", getElements("add_lov_fiscal_zone")}, // b_lov
                new String[]{"add_i_fiscal_zone", getElements("add_i_fiscal_zone")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "fiscal_zone", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description2", getElements("add_i_description2")}, // element path
                "description2", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_purchase_percentage", getElements("add_i_purchase_percentage")},
                "purchase_percentage", "1", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_purchase_amount", getElements("add_i_purchase_amount")},
                "purchase_amount", "1", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sale_percentage", getElements("add_i_sale_percentage")},
                "sale_percentage", "1", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sale_amount", getElements("add_i_sale_amount")},
                "sale_amount", "1", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_type", getElements("add_sl_application_type")},
                "Unit", "application_type", where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_currency", getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean interaction_edit_taxes(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"taxes_b_edit", getElements("taxes_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_company_code", getElements("add_lov_company_code")}, //LoV button
                new String[]{"add_i_company_code", getElements("add_i_company_code")}, //external LoV input
                new String[]{"add_lov_company_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result,
                "P01", // value to search
                "company_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, //LoV button
                new String[]{"add_i_office", getElements("add_i_office")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from_date", getElements("add_i_from_date")},
                "from_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_fiscal_zone", getElements("add_lov_fiscal_zone")}, // b_lov
                new String[]{"add_i_fiscal_zone", getElements("add_i_fiscal_zone")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "fiscal_zone", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description2", getElements("add_i_description2")}, // element path
                "description2", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_purchase_percentage", getElements("add_i_purchase_percentage")},
                "purchase_percentage", "2", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_purchase_amount", getElements("add_i_purchase_amount")},
                "purchase_amount", "2", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sale_percentage", getElements("add_i_sale_percentage")},
                "sale_percentage", "2", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sale_amount", getElements("add_i_sale_amount")},
                "sale_amount", "2", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_type", getElements("add_sl_application_type")},
                "Unit", "application_type", where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_currency", getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean qbe_taxes(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"taxes_e_result", getElements("taxes_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"taxes_b_qbe", getElements("taxes_b_qbe")},// query button
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")},//any query input
                where)){
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")},
                "company_code", getData("company_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from_date", getElements("qbe_i_from_date")},
                "from_date", getData("from_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_fiscal_zone", getElements("qbe_i_fiscal_zone")},
                "fiscal_zone", getData("fiscal_zone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description2", getElements("qbe_i_description2")},
                "description2", getData("description2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_purchase_percentage", getElements("qbe_i_purchase_percentage")},
                "purchase_percentage", getData("purchase_percentage"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_purchase_amount", getElements("qbe_i_purchase_amount")},
                "purchase_amount", getData("purchase_amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sale_percentage", getElements("qbe_i_sale_percentage")},
                "sale_percentage", getData("sale_percentage"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sale_amount", getElements("qbe_i_sale_amount")},
                "sale_amount", getData("sale_amount"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_application_type", getElements("qbe_sl_application_type")},
                "Unit", "application_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")}, //any query input
                new String[]{"taxes_e_result", getElements("taxes_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_taxes(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"taxes_b_actions", getElements("taxes_b_actions")}, //actions button
                new String[]{"taxes_b_actions_b_audit_data", getElements("taxes_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"taxes_b_detach", getElements("taxes_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean delete_taxes(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"taxes_b_delete", getElements("taxes_b_delete")},
                new String[]{"taxes_e_records", getElements("taxes_e_records")},
                where)){
            return false;
        }
        return true;
    }
}