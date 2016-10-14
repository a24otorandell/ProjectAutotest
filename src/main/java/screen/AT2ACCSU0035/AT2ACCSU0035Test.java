package screen.AT2ACCSU0035;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2MDMDE0011.AT2MDMDE0011Data;
import screen.AT2MDMDE0011.AT2MDMDE0011Locators;

/**
 * Created by aibanez on 13/10/2016.
 */
public class AT2ACCSU0035Test {
    protected AT2ACCSU0035Locators locators;
    protected AT2ACCSU0035Data data;

    public AT2ACCSU0035Test() {
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
        if (!interaction_record_destination(driver)) return false;
        if (!search_destination(driver)) return false;
        if (!interaction_edit_destination(driver)) return false;
        if (!qbe_destination(driver)) return false;
        if (!others_actions_destination(driver)) return false;
        if (!delete_destination(driver)) return false;
        return false;
    }

    private boolean search_destination(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination", getElements("search_lov_destination")}, //LoV button
                new String[]{"search_i_destination", getElements("search_i_destination")}, //external LoV input
                new String[]{"search_lov_destination_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("destination"), // value to search
                "destination", //name of the data
                " on SEARCH")){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("office"), // value to search
                "office", //name of the data
                " on SEARCH")){
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type_zone", getElements("search_sl_type_zone")},
                getData("type_zone"), "type_zone", " on SEARCH")){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_zone_code", getElements("search_lov_zone_code")}, //LoV button
                new String[]{"search_i_zone_code", getElements("search_i_zone_code")}, //external LoV input
                new String[]{"search_lov_zone_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("zone_code"), // value to search
                "zone_code", //name of the data
                " on SEARCH")){
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"destination_e_result", getElements("destination_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean interaction_record_destination(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATON";
        if (!Functions.checkClick(driver,
                new String[]{"taxes_b_add", getElements("taxes_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_company_code", getElements("add_lov_company_code")}, // b_lov
                new String[]{"add_i_company_code", getElements("add_i_company_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", // key for data value (the name)
                where)){
            return false;
        }
        /**
         * FROM DATE
         */
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
        /**
         *CAMPOS RELLENAR
         */
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }

    private boolean interaction_edit_destination(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"destination_b_edit", getElements("destination_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination", getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_destination_description", getElements("add_i_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_office_description", getElements("add_i_office_description")}, // element path
                "office_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type_of_zone", getElements("add_sl_type_of_zone")},
                "Rest of service", "type_zone", where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_zone_code", getElements("add_lov_zone_code")}, // b_lov
                new String[]{"add_i_zone_code", getElements("add_i_zone_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "zone_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_zone_description", getElements("add_i_zone_description")}, // element path
                "zone_description", // key for data value (the name)
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

    private boolean qbe_destination(TestDriver driver) {

        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";

        if (!Functions.clickQbE(driver,
                new String[]{"destination_b_qbe", getElements("destination_b_qbe")},// query button
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")},//any query input
                where)){
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_description", getElements("qbe_i_destination_description")},
                "destination_description", getData("destination_description"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_description", getElements("qbe_i_office_description")},
                "office_description", getData("office_description"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type_zone", getElements("qbe_i_type_zone")},
                "type_zone", getData("type_zone"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_zone_code", getElements("qbe_i_zone_code")},
                "zone_code", getData("zone_code"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_zone_description", getElements("qbe_i_zone_description")},
                "zone_description", getData("zone_description"), where)){
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")}, //search button
                new String[]{"destination_e_result", getElements("destination_e_result")}, //result element
                where)){
            return false;
        }
        return true;
    }

    private boolean others_actions_destination(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"destination_b_actions", getElements("destination_b_actions")}, //actions button
                new String[]{"destination_b_actions_b_audit_data", getElements("destination_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"destination_b_detach", getElements("destination_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }

    private boolean delete_destination(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"destination_b_delete", getElements("destination_b_delete")},
                new String[]{"destination_e_records", getElements("destination_e_records")},
                where)){
            return false;
        }
        return true;

    }
}
