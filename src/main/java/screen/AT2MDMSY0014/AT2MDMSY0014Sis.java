package screen.AT2MDMSY0014;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 16/11/2016.
 */
public class AT2MDMSY0014Sis {
    protected AT2MDMSY0014Locators locators;
    protected AT2MDMSY0014Data data;

    public AT2MDMSY0014Sis() {
    }
    public AT2MDMSY0014Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0014Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0014Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0014Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Observations types maint.");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_otm_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_otm_MDM(driver)) return false;
        if (!qbe_otm_MDM(driver)) return false;
        if (!others_actions_otm_MDM(driver)) return false;
        if (!interaction_record_ml_MDM(driver)) return false;
        if (!qbe_ml_MDM(driver)) return false;
        if (!interaction_edit_ml_MDM(driver)) return false;
        if (!qbe_ml_MDM(driver)) return false;
        if (!others_actions_ml_MDM(driver)) return false;
        if (!delete_ml_MDM(driver)) return false;
        if (!delete_otm_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_otm_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_otm_b_add", getElements("MDM_otm_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_otm_i_observation_code", getElements("add_otm_i_observation_code")}, // element path
                "observation_code", getData("observation_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_otm_i_observation_description", getElements("add_otm_i_observation_description")}, // element path
                "observation_description", getData("observation_description"), where)) {
            return false;
        }
        String list_options[] = {"Contracts", "Excursions", "HC", "JTB Integration", "Questions OS", "Bookings", "Transfers"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_otm_sl_observation_type", getElements("add_otm_sl_observation_type")},
                list_options, "observation_type",
                where)) {
            return false;
        }
        String list_options2[] = {"Question", "Check"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_otm_sl_ind_modo", getElements("add_otm_sl_ind_modo")},
                list_options2, "ind_modo",
                where)) {
            return false;
        }
        if(!Functions.checkboxValue(driver, getElements("add_otm_cb_purchase_details"),
                "purchase_details", true, true,
                where)) {
            return false;
        }
        if(!Functions.checkboxValue(driver, getElements("add_otm_cb_supplier_sending"),
                "supplier_sending", true, true,
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_otm_b_save", getElements("add_otm_b_save")}, //element to click
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
        if (!Functions.selectText(driver, new String[]{"search_otm_sl_observation_type", getElements("search_otm_sl_observation_type")},
                getData("observation_type"), "observation_type",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"search_otm_sl_ind_modo", getElements("search_otm_sl_ind_modo")},
                getData("ind_modo"), "ind_modo",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.checkboxValue(driver, getElements("search_otm_cb_purchase_details"),
                "purchase_details", true, true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.checkboxValue(driver, getElements("search_otm_cb_supplier_sending"),
                "supplier_sending", true, true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_otm_i_observation_code", getElements("search_otm_i_observation_code")}, // element path
                "observation_code", getData("observation_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_otm_i_observation_description", getElements("search_otm_i_observation_description")}, // element path
                "observation_description", getData("observation_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_otm_e_result", getElements("MDM_otm_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_otm_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_otm_b_edit", getElements("MDM_otm_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        String list_options[] = {"Contracts", "Excursions", "HC", "JTB Integration", "Questions OS", "Bookings", "Transfers"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_otm_sl_observation_type", getElements("add_otm_sl_observation_type")},
                list_options, "observation_type",
                where)) {
            return false;
        }
        String list_options2[] = {"Question", "Check"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_otm_sl_ind_modo", getElements("add_otm_sl_ind_modo")},
                list_options2, "ind_modo",
                where)) {
            return false;
        }
        if(!Functions.checkboxValue(driver, getElements("add_otm_cb_purchase_details"),
                "purchase_details", false, true,
                where)) {
            return false;
        }
        if(!Functions.checkboxValue(driver, getElements("add_otm_cb_supplier_sending"),
                "supplier_sending", false, true,
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_otm_b_save", getElements("add_otm_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_otm_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_otm_b_qbe", getElements("MDM_otm_b_qbe")},// query button
                new String[]{"qbe_otm_i_observation_code", getElements("qbe_otm_i_observation_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_otm_i_observation_code", getElements("qbe_otm_i_observation_code")},
                "observation_code", getData("observation_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_otm_i_observation_description", getElements("qbe_otm_i_observation_description")},
                "observation_description", getData("observation_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_otm_sl_observation_type", getElements("qbe_otm_sl_observation_type")},
                getData("observation_type"), "observation_type",
                where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_otm_sl_ind_modo", getElements("qbe_otm_sl_ind_modo")},
                getData("ind_modo"), "ind_modo",
                where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_otm_sl_purchase_details", getElements("qbe_otm_sl_purchase_details")},
                "No", "purchase_details",
                where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_otm_sl_supplier_sending", getElements("qbe_otm_sl_supplier_sending")},
                "No", "supplier_sending",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_otm_i_observation_code", getElements("qbe_otm_i_observation_code")}, //search button
                new String[]{"MDM_otm_e_result", getElements("MDM_otm_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_otm_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_otm_b_detach", getElements("MDM_otm_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ml_b_add", getElements("MDM_ml_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_ml_lov_language",getElements("add_ml_lov_language")}, // b_lov
                new String[]{"add_ml_i_language", getElements("add_ml_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ml_i_observations", getElements("add_ml_i_observations")}, // element path
                "observations", getData("observations"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ml_b_save", getElements("add_ml_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_ml_e_result", getElements("MDM_ml_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ml_b_edit", getElements("MDM_ml_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_ml_lov_language",getElements("add_ml_lov_language")}, // b_lov
                new String[]{"add_ml_i_language", getElements("add_ml_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ml_i_observations", getElements("add_ml_i_observations")}, // element path
                "observations", getData("observations_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ml_b_save", getElements("add_ml_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_ml_b_qbe", getElements("MDM_ml_b_qbe")},// query button
                new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_observations", getElements("qbe_ml_i_observations")},
                "observations", getData("observations"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")}, //search button
                new String[]{"MDM_ml_e_result", getElements("MDM_ml_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_ml_b_detach", getElements("MDM_ml_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_ml_b_delete", getElements("MDM_ml_b_delete")},
                new String[]{"MDM_ml_e_records", getElements("MDM_ml_e_records")},
                new String[]{"MDM_ml_b_delete_ok", getElements("MDM_ml_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_otm_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_otm_b_delete", getElements("MDM_otm_b_delete")},
                new String[]{"MDM_otm_e_records", getElements("MDM_otm_e_records")},
                new String[]{"MDM_otm_b_delete_ok", getElements("MDM_otm_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}