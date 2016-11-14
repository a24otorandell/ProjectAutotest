package screen.AT2MDMOR0027;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import java.util.Random;

/**
 * Created by jmrios on 14/11/2016.
 */
public class AT2MDMOR0027Test {
    protected AT2MDMOR0027Locators locators;
    protected AT2MDMOR0027Data data;

    public AT2MDMOR0027Test() {
    }
    public AT2MDMOR0027Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0027Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0027Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0027Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Market Countries");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //MARKETS TABLE
        if (!interaction_record_mrkts_MDM(driver, true)) return false;
        if (!search_MDM(driver, true)) return false;
        if (!delete_lngs_MDM(driver)) return false;
        //LANGUAGES TABLE
        if (!interaction_edit_mrkts_MDM(driver, false)) return false;
        //LANGUAGES TABLE
        if (!delete_lngs_MDM(driver)) return false;
        //MARKETS TABLE
        if (!qbe_mrkts_MDM(driver)) return false;
        if (!others_actions_mrkts_MDM(driver)) return false;
        //LANGUAGES TABLE
        if (!interaction_record_lngs_MDM(driver)) return false;
        if (!qbe_lngs_MDM(driver)) return false;
        if (!interaction_edit_lngs_MDM(driver)) return false;
        if (!qbe_lngs_MDM(driver)) return false;
        if (!others_actions_lngs_MDM(driver)) return false;
        //COUNTRIES BY MARKET TABLE
        if (!interaction_record_cbm_MDM(driver)) return false;
        if (!qbe_cbm_MDM(driver)) return false;
        if (!interaction_edit_cbm_MDM(driver)) return false;
        if (!qbe_cbm_MDM(driver)) return false;
        if (!others_actions_cbm_MDM(driver)) return false;
        if (!delete_cbm_MDM(driver)) return false;
        //LANGUAGES
        if (!delete_lngs_MDM(driver)) return false;
        //MARKETS
        if (!delete_mrkts_MDM(driver)) return false;
        if (!interaction_record_mrkts_MDM(driver, true)) return false;
        //COUNTRIES BY MARKET TABLE
        if (!load_continents(driver)) return false;
        return false;
    }

    private boolean interaction_record_mrkts_MDM(TestDriver driver, boolean active) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mrkts_b_add", getElements("MDM_mrkts_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mrkts_i_market", getElements("add_mrkts_i_market")}, // element path
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mrkts_i_description", getElements("add_mrkts_i_description")}, // element path
                "market_description", getData("market_description"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver, getElements("add_mrkts_cb_active"),
                "active", active, true,
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_mrkts_lov_language", getElements("add_mrkts_lov_language")}, // b_lov
                new String[]{"add_mrkts_i_language", getElements("add_mrkts_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mrkts_i_language_description", getElements("add_mrkts_i_language_description")}, // element path
                "language_description", getData("language_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mrkts_b_save", getElements("add_mrkts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver, boolean active) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_market", getElements("search_i_market")}, // element path
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "market_description", getData("market_description"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver, getElements("search_cb_active"),
                "active", active, true,
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_mrkts_e_result", getElements("MDM_mrkts_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_mrkts_MDM(TestDriver driver, boolean active) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mrkts_b_edit", getElements("MDM_mrkts_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mrkts_i_market", getElements("add_mrkts_i_market")}, // element path
                "market", getData("market_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mrkts_i_description", getElements("add_mrkts_i_description")}, // element path
                "market_description", getData("market_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver, getElements("add_mrkts_cb_active"),
                "active", active, true,
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_mrkts_lov_language", getElements("add_mrkts_lov_language")}, // b_lov
                new String[]{"add_mrkts_i_language", getElements("add_mrkts_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mrkts_i_language_description", getElements("add_mrkts_i_language_description")}, // element path
                "language_description", getData("language_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mrkts_b_save", getElements("add_mrkts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_mrkts_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_mrkts_b_qbe", getElements("MDM_mrkts_b_qbe")},// query button
                new String[]{"qbe_mrkts_i_market", getElements("qbe_mrkts_i_market")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mrkts_i_market", getElements("qbe_mrkts_i_market")}, // element path
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mrkts_i_description", getElements("qbe_mrkts_i_description")}, // element path
                "market_description", getData("market_description"), where)) {
            return false;
        }
        //SE COMENTA ESTE PASO PORQUE PROVOCA QUE LOS BOTONES DE LA TABLA DESAPAREZCAN
        /*if (!Functions.selectText(driver, new String[]{"qbe_mrkts_sl_active", getElements("qbe_mrkts_sl_active")},
                getData("active"), "active",
                where)) {
            return false;
        }*/
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_mrkts_i_market", getElements("qbe_mrkts_i_market")}, //search button
                new String[]{"MDM_mrkts_e_result", getElements("MDM_mrkts_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_mrkts_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_mrkts_b_actions", getElements("MDM_mrkts_b_actions")}, //actions button
                new String[]{"MDM_mrkts_b_actions_audit_data", getElements("MDM_mrkts_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_mrkts_b_detach", getElements("MDM_mrkts_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_lngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_lngs_b_add", getElements("MDM_lngs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lngs_lov_language",getElements("add_lngs_lov_language")}, // b_lov
                new String[]{"add_lngs_i_language", getElements("add_lngs_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_lngs_i_language_description", getElements("add_lngs_i_language_description")}, // element path
                "second_language_description", getData("second_language_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_lngs_b_save", getElements("add_lngs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_lngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_lngs_b_edit", getElements("MDM_lngs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lngs_lov_language",getElements("add_lngs_lov_language")}, // b_lov
                new String[]{"add_lngs_i_language", getElements("add_lngs_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_lngs_i_language_description", getElements("add_lngs_i_language_description")}, // element path
                "second_language_description", getData("second_language_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_lngs_b_save", getElements("add_lngs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_lngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_lngs_b_qbe", getElements("MDM_lngs_b_qbe")},// query button
                new String[]{"qbe_lngs_i_language", getElements("qbe_lngs_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_lngs_i_language", getElements("qbe_lngs_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_lngs_i_description", getElements("qbe_lngs_i_description")},
                "second_language_description", getData("second_language_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_lngs_i_language", getElements("qbe_lngs_i_language")}, //search button
                new String[]{"MDM_lngs_e_result", getElements("MDM_lngs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_lngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_lngs_b_detach", getElements("MDM_lngs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cbm_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cbm_b_add", getElements("MDM_cbm_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cbm_lov_country", getElements("add_cbm_lov_country")}, // b_lov
                new String[]{"add_cbm_i_country", getElements("add_cbm_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_cbm_e_description", getElements("add_cbm_e_description")}, // element path
                "country_description", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_cbm_e_continent", getElements("add_cbm_e_continent")}, // element path
                "continent", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cbm_b_save", getElements("add_cbm_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cbm_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cbm_e_result", getElements("MDM_cbm_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cbm_b_edit", getElements("MDM_cbm_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cbm_lov_country", getElements("add_cbm_lov_country")}, // b_lov
                new String[]{"add_cbm_i_country", getElements("add_cbm_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_cbm_e_description", getElements("add_cbm_e_description")}, // element path
                "country_description", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_cbm_e_continent", getElements("add_cbm_e_continent")}, // element path
                "continent", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cbm_b_save", getElements("add_cbm_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cbm_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cbm_b_qbe", getElements("MDM_cbm_b_qbe")},// query button
                new String[]{"qbe_cbm_i_country", getElements("qbe_cbm_i_country")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cbm_i_country", getElements("qbe_cbm_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cbm_i_description", getElements("qbe_cbm_i_description")},
                "country_description", getData("country_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cbm_i_continent", getElements("qbe_cbm_i_continent")},
                "continent", getData("continent"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cbm_i_country", getElements("qbe_cbm_i_country")}, //search button
                new String[]{"MDM_cbm_e_result", getElements("MDM_cbm_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean load_continents(TestDriver driver) {
        driver.getReport().addHeader("LOAD CONTINENTS RECORD", 3, false);
        String where = " on LOAD CONTINENTS";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cbm_b_qbe_clear", getElements("MDM_cbm_b_qbe_clear")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLov(driver,
                new String[]{"MDM_cbm_lov_load_continents_continent", getElements("MDM_cbm_lov_load_continents_continent")}, // b_lov
                new String[]{"MDM_cbm_i_load_continents_continent", getElements("MDM_cbm_i_load_continents_continent")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "loaded_continent", //Data name
                where)){
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cbm_b_load_continents", getElements("MDM_cbm_b_load_continents")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        return true;
    }
    private boolean others_actions_cbm_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cbm_b_detach", getElements("MDM_cbm_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_cbm_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cbm_e_result", getElements("MDM_cbm_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_cbm_b_delete", getElements("MDM_cbm_b_delete")},
                new String[]{"MDM_cbm_e_records", getElements("MDM_cbm_e_records")},
                new String[]{"MDM_cbm_b_delete_ok", getElements("MDM_cbm_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_lngs_MDM(TestDriver driver){
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_lngs_e_result", getElements("MDM_lngs_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_lngs_b_delete", getElements("MDM_lngs_b_delete")},
                new String[]{"MDM_lngs_e_records", getElements("MDM_lngs_e_records")},
                new String[]{"MDM_lngs_b_delete_ok", getElements("MDM_lngs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;


    }
    private boolean delete_mrkts_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_mrkts_e_result", getElements("MDM_mrkts_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_mrkts_b_delete", getElements("MDM_mrkts_b_delete")},
                new String[]{"MDM_mrkts_e_records", getElements("MDM_mrkts_e_records")},
                new String[]{"MDM_mrkts_b_delete_ok", getElements("MDM_mrkts_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
