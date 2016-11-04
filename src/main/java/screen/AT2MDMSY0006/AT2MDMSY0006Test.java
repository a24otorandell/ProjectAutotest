package screen.AT2MDMSY0006;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMSY0006Test {
    protected AT2MDMSY0006Locators locators;
    protected AT2MDMSY0006Data data;

    public AT2MDMSY0006Test() {
    }
    public AT2MDMSY0006Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0006Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0006Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0006Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Printing");
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
        if (!Functions.insertInput(driver, new String[]{"add_i_spooler", getElements("add_i_spooler")}, // element path
                "spooler", getData("spooler"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_abbreviation", getElements("add_i_abbreviation")}, // element path
                "abbreviation", getData("abbreviation"), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_code",getElements("add_lov_code")}, // b_lov
                new String[]{"add_i_code", getElements("add_i_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_department",getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
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
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_spooler", getElements("search_i_spooler")}, // element path
                "spooler", getData("spooler"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_abbreviation", getElements("search_i_abbreviation")}, // element path
                "abbreviation", getData("abbreviation"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_code", getElements("search_lov_code")}, //LoV button
                new String[]{"search_i_code", getElements("search_i_code")}, //external LoV input
                new String[]{"search_lov_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("code"), // value to search
                "code", //name of the data
                where)) {
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company"), // value to search
                "company", //Data name
                where)){
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("office"), // value to search
                "office", //Data name
                where)){
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"search_lov_department", getElements("search_lov_department")}, //LoV button
                new String[]{"search_i_department", getElements("search_i_department")}, //external LoV input
                new String[]{"search_lov_department_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("department"), // value to search
                "department", //Data name
                where)){
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
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_abbreviation", getElements("add_i_abbreviation")}, // element path
                "abbreviation", getData("abbreviation_edit"), where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_e_printer_type", getElements("add_e_printer_type")}, // element path
                "printer_type", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_e_company_description", getElements("add_e_company_description")}, // element path
                "company_description", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_e_office_description", getElements("add_e_office_description")}, // element path
                "office_description", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_department",getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_e_department_description", getElements("add_e_department_description")}, // element path
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
                new String[]{"qbe_i_spooler", getElements("qbe_i_spooler")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_spooler", getElements("qbe_i_spooler")},
                "spooler", getData("spooler"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_abbreviation", getElements("qbe_i_abbreviation")},
                "abbreviation", getData("abbreviation"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_printer_type", getElements("qbe_i_printer_type")},
                "printer_type", getData("printer_type"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_spooler", getElements("qbe_i_spooler")}, //search button
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