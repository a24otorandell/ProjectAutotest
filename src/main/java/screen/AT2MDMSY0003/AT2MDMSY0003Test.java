package screen.AT2MDMSY0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import java.util.Random;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMSY0003Test {
    protected AT2MDMSY0003Locators locators;
    protected AT2MDMSY0003Data data;

    public AT2MDMSY0003Test() {
    }
    public AT2MDMSY0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0003Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Parameters");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //ATLAS PARAMETERS SCREEN
            //PARAMETERS TABLE
                if (!interaction_record_prmt_MDM(driver)) return false;
                if (!search_prmt_MDM(driver)) return false;
                if (!interaction_edit_prmt_MDM(driver)) return false;
                if (!qbe_prmt_MDM(driver)) return false;
                if (!others_actions_prmt_MDM(driver)) return false;
            //PARAMETERS BY COMPANY TABLE
                if (!interaction_record_prmtbc_MDM(driver)) return false;
                if (!search_prmtbc_MDM(driver)) return false;
                if (!interaction_edit_prmtbc_MDM(driver)) return false;
                if (!qbe_prmtbc_MDM(driver)) return false;
                if (!others_actions_prmtbc_MDM(driver)) return false;
            //CHANGE TAB
                if (!first_change_tab(driver)) return false;
        //GENERAL PARAMETERS SCREEN
            //GENERAL PARAMETERS TABLE
                if (!interaction_record_gprmt_MDM(driver)) return false;
                if (!search_gprmt_MDM(driver)) return false;
                if (!interaction_edit_gprmt_MDM(driver)) return false;
                if (!qbe_gprmt_MDM(driver)) return false;
                if (!others_actions_gprmt_MDM(driver)) return false;
                if (!delete_gprmt_MDM(driver)) return false;
            //CHANGE TAB
                if (!second_change_tab(driver)) return false;
            //PARAMETERS BY COMPANY TABLE
                if (!delete_prmtbc_MDM(driver)) return false;
            //PARAMETERS TABLE
                if (!delete_prmt_MDM(driver)) return false;
                return false;
    }

    private boolean interaction_record_prmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prmt_b_add", getElements("MDM_prmt_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmt_i_parameter", getElements("add_prmt_i_parameter")}, // element path
                "prmt_parameter", getData("prmt_parameter"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmt_i_value", getElements("add_prmt_i_value")}, // element path
                "prmt_value", getData("prmt_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmt_i_description", getElements("add_prmt_i_description")}, // element path
                "prmt_description", getData("prmt_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prmt_b_save", getElements("add_prmt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_prmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_prmt_i_parameter", getElements("search_prmt_i_parameter")}, // element path
                "prmt_parameter", getData("prmt_parameter"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prmt_i_value", getElements("search_prmt_i_value")}, // element path
                "prmt_value", getData("prmt_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prmt_i_description", getElements("search_prmt_i_description")}, // element path
                "prmt_description", getData("prmt_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_prmt_b_search", getElements("search_prmt_b_search")}, //search button
                new String[]{"MDM_prmt_e_result", getElements("MDM_prmt_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_prmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prmt_b_edit", getElements("MDM_prmt_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmt_i_parameter", getElements("add_prmt_i_parameter")}, // element path
                "prmt_parameter", getData("prmt_parameter_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmt_i_value", getElements("add_prmt_i_value")}, // element path
                "prmt_value", getData("prmt_value_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmt_i_description", getElements("add_prmt_i_description")}, // element path
                "prmt_description", getData("prmt_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prmt_b_save", getElements("add_prmt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_prmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_prmt_b_reset", getElements("search_prmt_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_prmt_b_qbe", getElements("MDM_prmt_b_qbe")},// query button
                new String[]{"qbe_prmt_i_parameter", getElements("qbe_prmt_i_parameter")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmt_i_parameter", getElements("qbe_prmt_i_parameter")}, // element path
                "prmt_parameter", getData("prmt_parameter"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmt_i_value", getElements("qbe_prmt_i_value")}, // element path
                "prmt_value", getData("prmt_value"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_prmt_i_parameter", getElements("qbe_prmt_i_parameter")}, //search button
                new String[]{"MDM_prmt_e_result", getElements("MDM_prmt_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_prmt_b_actions", getElements("MDM_prmt_b_actions")}, //actions button
                new String[]{"MDM_prmt_b_actions_audit_data", getElements("MDM_prmt_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_prmt_b_detach", getElements("MDM_prmt_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_prmtbc_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prmtbc_b_add", getElements("MDM_prmtbc_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prmtbc_lov_company",getElements("add_prmtbc_lov_company")}, // b_lov
                new String[]{"add_prmtbc_i_company", getElements("add_prmtbc_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"add_prmtbc_company_result", getElements("add_prmtbc_company_result")}, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prmtbc_company", //Data name
                where)) {
            return false;
        }
        if(!Functions.getValue(driver, new String[]{"add_prmtbc_e_company_name", getElements("add_prmtbc_e_company_name")}, // element path
                "prmtbc_company_name", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prmtbc_lov_office",getElements("add_prmtbc_lov_office")}, // b_lov
                new String[]{"add_prmtbc_i_office", getElements("add_prmtbc_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prmtbc_office", //Data name
                where)) {
            return false;
        }
        if(!Functions.getValue(driver, new String[]{"add_prmtbc_e_office_name", getElements("add_prmtbc_e_office_name")}, // element path
                "prmtbc_office_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmtbc_i_parameter", getElements("add_prmtbc_i_parameter")}, // element path
                "prmtbc_parameter", getData("prmtbc_parameter"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmtbc_i_value", getElements("add_prmtbc_i_value")}, // element path
                "prmtbc_value", getData("prmtbc_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmtbc_i_description", getElements("add_prmtbc_i_description")}, // element path
                "prmtbc_description", getData("prmtbc_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prmtbc_b_save", getElements("add_prmtbc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_prmtbc_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_prmtbc_lov_company", getElements("search_prmtbc_lov_company")}, //LoV button
                new String[]{"search_prmtbc_i_company", getElements("search_prmtbc_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("prmtbc_company"), // value to search
                "prmtbc_company", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_prmtbc_lov_office", getElements("search_prmtbc_lov_office")}, //LoV button
                new String[]{"search_prmtbc_i_office", getElements("search_prmtbc_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("prmtbc_office"), // value to search
                "prmtbc_office", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prmtbc_i_parameter", getElements("search_prmtbc_i_parameter")}, // element path
                "prmtbc_parameter", getData("prmtbc_parameter"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prmtbc_i_value", getElements("search_prmtbc_i_value")}, // element path
                "prmtbc_value", getData("prmtbc_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_prmtbc_i_description", getElements("search_prmtbc_i_description")}, // element path
                "prmtbc_description", getData("prmtbc_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_prmtbc_b_search", getElements("search_prmtbc_b_search")}, //search button
                new String[]{"MDM_prmtbc_e_result", getElements("MDM_prmtbc_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_prmtbc_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prmtbc_b_edit", getElements("MDM_prmtbc_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_prmtbc_lov_company", getElements("add_prmtbc_lov_company")}, //LoV button
                new String[]{"add_prmtbc_i_company", getElements("add_prmtbc_i_company")}, //external LoV input
                new String[]{"add_prmtbc_lov_company2", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "998", // value to search
                "prmtbc_company", //name of the data
                where)){
            return false;}
        if(!Functions.getValue(driver, new String[]{"add_prmtbc_e_company_name", getElements("add_prmtbc_e_company_name")}, // element path
                "prmtbc_company_name", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prmtbc_lov_office",getElements("add_prmtbc_lov_office")}, // b_lov
                new String[]{"add_prmtbc_i_office", getElements("add_prmtbc_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prmtbc_office", //Data name
                where)) {
            return false;
        }
        if(!Functions.getValue(driver, new String[]{"add_prmtbc_e_office_name", getElements("add_prmtbc_e_office_name")}, // element path
                "prmtbc_office_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmtbc_i_parameter", getElements("add_prmtbc_i_parameter")}, // element path
                "prmtbc_parameter", getData("prmtbc_parameter_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmtbc_i_value", getElements("add_prmtbc_i_value")}, // element path
                "prmtbc_value", getData("prmtbc_value_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prmtbc_i_description", getElements("add_prmtbc_i_description")}, // element path
                "prmtbc_description", getData("prmtbc_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prmtbc_b_save", getElements("add_prmtbc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_prmtbc_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_prmtbc_b_reset", getElements("search_prmtbc_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_prmtbc_b_qbe", getElements("MDM_prmtbc_b_qbe")},// query button
                new String[]{"qbe_prmtbc_i_company", getElements("qbe_prmtbc_i_company")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmtbc_i_company", getElements("qbe_prmtbc_i_company")},
                "prmtbc_company", getData("prmtbc_company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmtbc_i_company_name", getElements("qbe_prmtbc_i_company_name")},
                "prmtbc_company_name", getData("prmtbc_company_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmtbc_i_office", getElements("qbe_prmtbc_i_office")},
                "prmtbc_office", getData("prmtbc_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmtbc_i_office_name", getElements("qbe_prmtbc_i_office_name")},
                "prmtbc_office_name", getData("prmtbc_office_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmtbc_i_parameter", getElements("qbe_prmtbc_i_parameter")},
                "prmtbc_parameter", getData("prmtbc_parameter"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prmtbc_i_value", getElements("qbe_prmtbc_i_value")},
                "prmtbc_value", getData("prmtbc_value"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_prmtbc_i_company", getElements("qbe_prmtbc_i_company")}, //search button
                new String[]{"MDM_prmtbc_e_result", getElements("MDM_prmtbc_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prmtbc_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_prmtbc_b_detach", getElements("MDM_prmtbc_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean first_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_general_parameters", getElements("MDM_b_general_parameters")}, //element to click
                new String[]{"MDM_gprmt_b_add", getElements("MDM_gprmt_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_gprmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gprmt_b_add", getElements("MDM_gprmt_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_parameters_code", getElements("add_gprmt_i_parameters_code")}, // element path
                "gprmt_parameters_code", getData("gprmt_parameters_code"), where)) {
            return false;
        }
        String list_options[] = {"Alphanumeric", "Numerical"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver, new String[]{"add_gprmt_sl_parameters_type", getElements("add_gprmt_sl_parameters_type")},
                option, "gprmt_parameters_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_supplier", getElements("add_gprmt_i_supplier")}, // element path
                "gprmt_supplier", getData("gprmt_supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_description", getElements("add_gprmt_i_description")}, // element path
                "gprmt_description", getData("gprmt_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_numeric_value", getElements("add_gprmt_i_numeric_value")}, // element path
                "gprmt_numeric_value", getData("gprmt_numeric_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_non_numeric_value", getElements("add_gprmt_i_non_numeric_value")}, // element path
                "gprmt_non_numeric_value", getData("gprmt_non_numeric_value"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gprmt_b_save", getElements("add_gprmt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_gprmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_gprmt_i_parameters_code", getElements("search_gprmt_i_parameters_code")}, // element path
                "gprmt_parameters_code", getData("gprmt_parameters_code"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"search_gprmt_sl_parameters_type",getElements("search_gprmt_sl_parameters_type")},
                getData("gprmt_parameters_type"), "gprmt_parameters_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_gprmt_i_supplier", getElements("search_gprmt_i_supplier")}, // element path
                "gprmt_supplier", getData("gprmt_supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_gprmt_i_description", getElements("search_gprmt_i_description")}, // element path
                "gprmt_description", getData("gprmt_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_gprmt_i_numeric_value", getElements("search_gprmt_i_numeric_value")}, // element path
                "gprmt_numeric_value", getData("gprmt_numeric_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_gprmt_i_non_numeric_value", getElements("search_gprmt_i_non_numeric_value")}, // element path
                "gprmt_non_numeric_value", getData("gprmt_non_numeric_value"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_gprmt_b_search", getElements("search_gprmt_b_search")}, //search button
                new String[]{"MDM_gprmt_e_result", getElements("MDM_gprmt_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_gprmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_gprmt_b_reset", getElements("search_gprmt_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_gprmt_e_result", getElements("MDM_gprmt_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gprmt_b_edit", getElements("MDM_gprmt_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_parameters_code", getElements("add_gprmt_i_parameters_code")}, // element path
                "gprmt_parameters_code", getData("gprmt_parameters_code_edit"), where)) {
            return false;
        }
        String list_options[] = {"Alphanumeric", "Numerical"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver, new String[]{"add_gprmt_sl_parameters_type", getElements("add_gprmt_sl_parameters_type")},
                option, "gprmt_parameters_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_supplier", getElements("add_gprmt_i_supplier")}, // element path
                "gprmt_supplier", getData("gprmt_supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_description", getElements("add_gprmt_i_description")}, // element path
                "gprmt_description", getData("gprmt_description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_numeric_value", getElements("add_gprmt_i_numeric_value")}, // element path
                "gprmt_numeric_value", getData("gprmt_numeric_value_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gprmt_i_non_numeric_value", getElements("add_gprmt_i_non_numeric_value")}, // element path
                "gprmt_non_numeric_value", getData("gprmt_non_numeric_value_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gprmt_b_save", getElements("add_gprmt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_gprmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_gprmt_b_qbe", getElements("MDM_gprmt_b_qbe")},// query button
                new String[]{"qbe_gprmt_i_parameters_code", getElements("qbe_gprmt_i_parameters_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gprmt_i_parameters_code", getElements("qbe_gprmt_i_parameters_code")},
                "gprmt_parameters_code", getData("gprmt_parameters_code"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_gprmt_sl_parameters_type",getElements("qbe_gprmt_sl_parameters_type")},
                getData("gprmt_parameters_type"), "gprmt_parameters_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gprmt_i_supplier", getElements("qbe_gprmt_i_supplier")},
                "gprmt_supplier", getData("gprmt_supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gprmt_i_description", getElements("qbe_gprmt_i_description")},
                "gprmt_description", getData("gprmt_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_gprmt_i_parameters_code", getElements("qbe_gprmt_i_parameters_code")}, //search button
                new String[]{"MDM_gprmt_e_result", getElements("MDM_gprmt_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_gprmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_gprmt_b_detach", getElements("MDM_gprmt_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_gprmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_gprmt_e_result", getElements("MDM_gprmt_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_gprmt_b_delete", getElements("MDM_gprmt_b_delete")},
                new String[]{"MDM_gprmt_e_records", getElements("MDM_gprmt_e_records")},
                new String[]{"MDM_gprmt_b_delete_ok", getElements("MDM_gprmt_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean second_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_ATLAS_parameters", getElements("MDM_b_ATLAS_parameters")}, //element to click
                new String[]{"MDM_prmt_b_add", getElements("MDM_prmt_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prmtbc_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_prmtbc_b_delete", getElements("MDM_prmtbc_b_delete")},
                new String[]{"MDM_prmtbc_e_records", getElements("MDM_prmtbc_e_records")},
                new String[]{"MDM_prmtbc_b_delete_ok", getElements("MDM_prmtbc_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prmt_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_prmt_b_delete", getElements("MDM_prmt_b_delete")},
                new String[]{"MDM_prmt_e_records", getElements("MDM_prmt_e_records")},
                new String[]{"MDM_prmt_b_delete_ok", getElements("MDM_prmt_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
