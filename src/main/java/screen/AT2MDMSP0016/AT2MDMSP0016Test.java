package screen.AT2MDMSP0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0016Test {
    protected AT2MDMSP0016Locators locators;
    protected AT2MDMSP0016Data data;

    public AT2MDMSP0016Test() {
    }

    public AT2MDMSP0016Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MDMSP0016Locators locators) {
        this.locators = locators;
    }

    public AT2MDMSP0016Data getData() {
        return data;
    }

    public void setData(AT2MDMSP0016Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Supplier prepayment conditions");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Supplier");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_results_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_results_MDM(driver)) return false;
        if (!qbe_results_MDM(driver)) return false;
        if (!others_actions_results_MDM(driver)) return false;
        if (!interaction_record_details_MDM(driver)) return false;
        if (!qbe_details_MDM(driver)) return false;
        if (!others_actions_details_MDM(driver)) return false;
        if (!delete_details_MDM(driver)) return false;
        if (!delete_results_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_results_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_results_b_add", getElements("MDM_results_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        /* Hardcodeamos el primer elemento de la búsqueda para asegurarnos de que los demás
         campos también contienen información*/
        if (!Functions.createLovByValue(driver,
                new String[]{"add_results_lov_company", getElements("add_results_lov_company")}, //LoV button
                new String[]{"add_results_i_company", getElements("add_results_i_company")}, //external LoV input
                new String[]{"add_results_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "BG1", // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_results_lov_office", getElements("add_results_lov_office")}, // b_lov
                new String[]{"add_results_i_office", getElements("add_results_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_results_lov_short_name", getElements("add_results_lov_short_name")}, // b_lov
                new String[]{"add_results_i_short_name", getElements("add_results_i_short_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "short_name", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_results_e_supplier_code", getElements("add_results_e_supplier_code")}, // element path
                "supplier_code", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_results_e_commercial_name", getElements("add_results_e_commercial_name")}, // element path
                "commercial_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_results_e_fiscal_name", getElements("add_results_e_fiscal_name")}, // element path
                "fiscal_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_results_e_VCC_from", getElements("add_results_e_VCC_from")}, // element path
                "VCC_from", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_results_lov_payment_method", getElements("add_results_lov_payment_method")}, // b_lov
                new String[]{"add_results_i_payment_method", getElements("add_results_i_payment_method")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "payment_method", //Data name
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_results_b_save", getElements("add_results_b_save")}, //element to click
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
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company"), // value to search
                "company", //name of the data
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
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_short_name", getElements("search_lov_short_name")}, //LoV button
                new String[]{"search_i_short_name", getElements("search_i_short_name")}, //external LoV input
                new String[]{"search_lov_short_name_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("short_name"), // value to search
                "short_name", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_payment_method", getElements("search_lov_payment_method")}, //LoV button
                new String[]{"search_i_payment_method", getElements("search_i_payment_method")}, //external LoV input
                new String[]{"search_lov_payment_method_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("payment_method"), // value to search
                "payment_method", //name of the data
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_results_e_result", getElements("MDM_results_e_result")}, //result element
                where)) {
            return false;
        }
        return true;

    }

    private boolean interaction_edit_results_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_results_b_edit", getElements("MDM_results_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_results_lov_payment_method", getElements("add_results_lov_payment_method")}, // b_lov
                new String[]{"add_results_i_payment_method", getElements("add_results_i_payment_method")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "payment_method", //Data name
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_results_e_payment_method_description", getElements("add_results_e_payment_method_description")}, // element path
                "payment_method_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_results_b_save", getElements("add_results_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }

    private boolean qbe_results_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_results_b_qbe", getElements("MDM_results_b_qbe")},// query button
                new String[]{"qbe_results_i_company", getElements("qbe_results_i_company")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_company", getElements("qbe_results_i_company")}, // element path
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_office", getElements("qbe_results_i_office")}, // element path
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_short_name", getElements("qbe_results_i_short_name")}, // element path
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_supplier_code", getElements("qbe_results_i_supplier_code")}, // element path
                "supplier_code", getData("supplier_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_commercial_name", getElements("qbe_results_i_commercial_name")}, // element path
                "commercial_name", getData("commercial_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_fiscal_name", getElements("qbe_results_i_fiscal_name")}, // element path
                "fiscal_name", getData("fiscal_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_VCC_from", getElements("qbe_results_i_VCC_from")}, // element path
                "VCC_from", getData("VCC_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_payment_method", getElements("qbe_results_i_payment_method")}, // element path
                "payment_method", getData("payment_method"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_results_i_payment_method_description", getElements("qbe_results_i_payment_method_description")}, // element path
                "payment_method_description", getData("payment_method_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_results_i_company", getElements("qbe_results_i_company")}, //search button
                new String[]{"MDM_results_e_result", getElements("MDM_results_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }

    private boolean others_actions_results_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_results_b_actions", getElements("MDM_results_b_actions")}, //actions button
                new String[]{"MDM_results_b_actions_audit_data", getElements("MDM_results_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_results_b_detach", getElements("MDM_results_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    private boolean interaction_record_details_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_details_b_add", getElements("MDM_details_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_details_i_days_in_advance", getElements("add_details_i_days_in_advance")}, // element path
                "days_in_advance", getData("days_in_advance"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_details_i_%_prepayment", getElements("add_details_i_%_prepayment")}, // element path
                "%_prepayment", getData("%_prepayment"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_details_i_application_date", getElements("add_details_i_application_date")}, // element path
                "application_date", getData("application_date"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_details_b_save", getElements("add_details_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }

    private boolean qbe_details_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_details_b_qbe", getElements("MDM_details_b_qbe")},// query button
                new String[]{"qbe_details_i_days_in_advance", getElements("qbe_details_i_days_in_advance")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_details_i_days_in_advance", getElements("qbe_details_i_days_in_advance")}, // element path
                "days_in_advance", getData("days_in_advance"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_details_i_%_prepayment", getElements("qbe_details_i_%_prepayment")}, // element path
                "%_prepayment", getData("%_prepayment"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_details_i_application_date", getElements("qbe_details_i_application_date")}, // element path
                "application_date", getData("application_date"),
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_details_i_days_in_advance", getElements("qbe_details_i_days_in_advance")}, //search button
                new String[]{"MDM_details_e_result", getElements("MDM_details_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }

    private boolean others_actions_details_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_details_b_actions", getElements("MDM_details_b_actions")}, //actions button
                new String[]{"MDM_details_b_actions_audit_data", getElements("MDM_details_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_details_b_detach", getElements("MDM_details_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    private boolean delete_details_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_details_b_delete", getElements("MDM_details_b_delete")},
                new String[]{"MDM_details_e_records", getElements("MDM_details_e_records")},
                new String[]{"MDM_details_b_delete_ok", getElements("MDM_details_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }

    private boolean delete_results_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_results_b_delete", getElements("MDM_results_b_delete")},
                new String[]{"MDM_results_e_records", getElements("MDM_results_e_records")},
                new String[]{"MDM_results_b_delete_ok", getElements("MDM_results_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}