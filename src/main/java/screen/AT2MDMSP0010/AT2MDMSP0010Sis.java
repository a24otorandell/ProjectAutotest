package screen.AT2MDMSP0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0010Sis {
    protected AT2MDMSP0010Locators locators;
    protected AT2MDMSP0010Data data;

    public AT2MDMSP0010Sis() {
    }
    public AT2MDMSP0010Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0010Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0010Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0010Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("External Payments");
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
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_supplier_SAP_code", getElements("add_lov_supplier_SAP_code")}, // b_lov
                new String[]{"add_i_supplier_SAP_code", getElements("add_i_supplier_SAP_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier_SAP_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_external_agency", getElements("add_lov_external_agency")}, // b_lov
                new String[]{"add_i_external_agency", getElements("add_i_external_agency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "external_agency", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_payable_company_name", getElements("add_i_payable_company_name")}, // element path
                "payable_company_name", getData("payable_company_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_long_payable_company_name", getElements("add_i_long_payable_company_name")}, // element path
                "long_payable_company_name", getData("long_payable_company_name"), where)) {
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
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier_SAP_code", getElements("search_lov_supplier_SAP_code")}, //LoV button
                new String[]{"search_i_supplier_SAP_code", getElements("search_i_supplier_SAP_code")}, //external LoV input
                new String[]{"search_lov_partner_i_supplier_SAP_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("supplier_SAP_code"), // value to search
                "supplier_SAP_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_external_agency", getElements("search_lov_external_agency")}, //LoV button
                new String[]{"search_i_external_agency", getElements("search_i_external_agency")}, //external LoV input
                new String[]{"search_lov_origin_currency_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("external_agency"), // value to search
                "external_agency", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_payable_company_name", getElements("search_i_payable_company_name")}, // element path
                "payable_company_name", getData("payable_company_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_long_payable_company_name", getElements("search_i_long_payable_company_name")}, // element path
                "long_payable_company_name", getData("long_payable_company_name"), where)) {
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
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_supplier_SAP_code", getElements("add_lov_supplier_SAP_code")}, // b_lov
                new String[]{"add_i_supplier_SAP_code", getElements("add_i_supplier_SAP_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier_SAP_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_fiscal_name", getElements("add_e_fiscal_name")}, // element path
                "fiscal_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_external_agency", getElements("add_lov_external_agency")}, // b_lov
                new String[]{"add_i_external_agency", getElements("add_i_external_agency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "external_agency", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_e_external_agency_description", getElements("add_e_external_agency_description")}, // element path
                "external_agency_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_payable_company_name", getElements("add_i_payable_company_name")}, // element path
                "payable_company_name", getData("payable_company_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_long_payable_company_name", getElements("add_i_long_payable_company_name")}, // element path
                "long_payable_company_name", getData("long_payable_company_name_edit"), where)) {
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
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_supplier_SAP_code", getElements("qbe_i_supplier_SAP_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier_SAP_code", getElements("qbe_i_supplier_SAP_code")},
                "supplier_SAP_code", getData("supplier_SAP_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_fiscal_name", getElements("qbe_i_fiscal_name")},
                "fiscal_name", getData("fiscal_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_agency", getElements("qbe_i_external_agency")},
                "external_agency", getData("external_agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_agency_description", getElements("qbe_i_external_agency_description")},
                "external_agency_description", getData("external_agency_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_payable_company_name", getElements("qbe_i_payable_company_name")},
                "payable_company_name", getData("payable_company_name"), where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_i_long_payable_company_name", getElements("qbe_i_long_payable_company_name")},
                "long_payable_company_name", getData("long_payable_company_name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_supplier_SAP_code", getElements("qbe_i_supplier_SAP_code")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        Functions.break_time(driver, 30, 500);
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
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_delete", getElements("MDM_b_delete")},
                new String[]{"MDM_e_records", getElements("MDM_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
