package screen.AT2MDMDE0004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 21/12/2016.
 */
public class AT2MDMDE0004Sis {
    protected AT2MDMDE0004Locators locators;
    protected AT2MDMDE0004Data data;

    public AT2MDMDE0004Sis() {
    }
    public AT2MDMDE0004Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0004Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0004Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0004Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Countries Web Contents");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRIES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_cntrs_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_cntrs_MDM(driver)) return false;
        if (!qbe_cntrs_MDM(driver)) return false;
        if (!others_actions_cntrs_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRY IMAGES - MAP LENGUAGE DESCRIPTION
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_mld_MDM(driver)) return false;
        if (!qbe_mld_MDM(driver)) return false;
        if (!interaction_edit_mld_MDM(driver)) return false;
        if (!qbe_mld_MDM(driver)) return false;
        if (!others_actions_mld_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRY IMAGES - COMMERCIAL CONTRACT
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_cmmc_MDM(driver)) return false;
        if (!interaction_edit_cmmc_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRY IMAGES - COMMERCIAL CONTRACT 2
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_cmmc2_MDM(driver)) return false;
        if (!qbe_cmmc2_MDM(driver)) return false;
        if (!interaction_edit_cmmc2_MDM(driver)) return false;
        if (!qbe_cmmc2_MDM(driver)) return false;
        if (!others_actions_cmmc2_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - BIG IMAGE
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!first_change_tab(driver)) return false;
        if (!interaction_record_bigi_MDM(driver)) return false;
        if (!qbe_bigi_MDM(driver)) return false;
        if (!interaction_edit_bigi_MDM(driver)) return false;
        if (!qbe_bigi_MDM(driver)) return false;
        if (!others_actions_bigi_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - SMALL IMAGE
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!second_change_tab(driver)) return false;
        if (!interaction_record_smalli_MDM(driver)) return false;
        if (!qbe_smalli_MDM(driver)) return false;
        if (!interaction_edit_smalli_MDM(driver)) return false;
        if (!qbe_smalli_MDM(driver)) return false;
        if (!others_actions_smalli_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - IMAGE MAP
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!third_change_tab(driver)) return false;
        if (!interaction_record_mapi_MDM(driver)) return false;
        if (!qbe_mapi_MDM(driver)) return false;
        if (!interaction_edit_mapi_MDM(driver)) return false;
        if (!qbe_mapi_MDM(driver)) return false;
        if (!others_actions_mapi_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - IMAGE MAP 2
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!fourth_change_tab(driver)) return false;
        if (!interaction_record_mapi2_MDM(driver)) return false;
        if (!qbe_mapi2_MDM(driver)) return false;
        if (!interaction_edit_mapi2_MDM(driver)) return false;
        if (!qbe_mapi2_MDM(driver)) return false;
        if (!others_actions_mapi2_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //DATA - SLOGANS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!fifth_change_tab(driver)) return false;
        if (!interaction_record_dslgns_MDM(driver)) return false;
        if (!qbe_dslgns_MDM(driver)) return false;
        if (!interaction_edit_dslgns_MDM(driver)) return false;
        if (!qbe_dslgns_MDM(driver)) return false;
        if (!others_actions_dslgns_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //DATA - LONG DESCRIPTION
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_longd_MDM(driver)) return false;
        if (!qbe_longd_MDM(driver)) return false;
        if (!interaction_edit_longd_MDM(driver)) return false;
        if (!qbe_longd_MDM(driver)) return false;
        if (!others_actions_longd_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //DATA - SHORT DESCRIPTION
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_shortd_MDM(driver)) return false;
        if (!qbe_shortd_MDM(driver)) return false;
        if (!interaction_edit_shortd_MDM(driver)) return false;
        if (!qbe_shortd_MDM(driver)) return false;
        if (!others_actions_shortd_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //GENERAL SERVICE - SLOGANS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!sixth_change_tab(driver)) return false;
        if (!interaction_record_gsslgns_MDM(driver)) return false;
        if (!qbe_gsslgns_MDM(driver)) return false;
        if (!interaction_edit_gsslgns_MDM(driver)) return false;
        if (!qbe_gsslgns_MDM(driver)) return false;
        if (!others_actions_gsslgns_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //GENERAL SERVICE - GENERAL SERVICE
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_gnrls_MDM(driver)) return false;
        if (!qbe_gnrls_MDM(driver)) return false;
        if (!interaction_edit_gnrls_MDM(driver)) return false;
        if (!qbe_gnrls_MDM(driver)) return false;
        if (!others_actions_gnrls_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //GENERAL SERVICE - LANGUAGES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_gnrlslngs_MDM(driver)) return false;
        if (!qbe_gnrlslngs_MDM(driver)) return false;
        if (!interaction_edit_gnrlslngs_MDM(driver)) return false;
        if (!qbe_gnrlslngs_MDM(driver)) return false;
        if (!others_actions_gnrlslngs_MDM(driver)) return false;
        if (!delete_gnrlslngs_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //GENERAL SERVICE - GENERAL SERVICE
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_gnrls_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //GENERAL SERVICE - SLOGANS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_gsslgns_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //DATA - SHORT DESCRIPTION
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!fifth_change_tab(driver)) return false;
        if (!delete_shortd_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //DATA - LONG DESCRIPTION
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_longd_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //DATA - SLOGANS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_dslgns_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - IMAGE MAP 2
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!seventh_change_tab(driver)) return false;
        if (!fourth_change_tab(driver)) return false;
        if (!delete_mapi2_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - IMAGE MAP
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!third_change_tab(driver)) return false;
        if (!delete_mapi_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - SMALL IMAGE
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!second_change_tab(driver)) return false;
        if (!delete_smalli_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - BIG IMAGE
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!first_change_tab(driver)) return false;
        if (!delete_bigi_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRY IMAGES - COMMERCIAL CONTRACT 2
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!eighth_change_tab(driver)) return false;
        if (!delete_cmmc2_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRY IMAGES - COMMERCIAL CONTRACT
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_cmmc_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRY IMAGES - MAP LENGUAGE DESCRIPTION
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_mld_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //COUNTRIES - COUNTRIES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_cntrs_MDM(driver)) return false;
        //ESCOGEMOS ESTE REGISTRO PARA PODER CREAR Y EDITAR CON TODOS LOS CAMPOS EN LAS TABLAS DE LAS DOS ÚLTIMAS PESTAÑAS
        if (!qbe_MX_cntrs_MDM(driver)) return false;
        //RULA HASTA AQUÍ

        //-----------------------------------------------------------------------------------------------------------------------------------
        //HIGHLIGHTS - SLOGANS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!ninth_change_tab(driver)) return false;
        if (!interaction_record_hghltssl_MDM(driver)) return false;
        if (!qbe_hghltssl_MDM(driver)) return false;
        if (!interaction_edit_hghltssl_MDM(driver)) return false;
        if (!qbe_hghltssl_MDM(driver)) return false;
        if (!others_actions_hghltssl_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //HIGHLIGHTS - HIGHLIGHTS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_hghlts_MDM(driver)) return false;
        if (!qbe_hghlts_MDM(driver)) return false;
        if (!interaction_edit_hghlts_MDM(driver)) return false;
        if (!qbe_hghlts_MDM(driver)) return false;
        if (!others_actions_hghlts_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //HIGHLIGHTS - LANGUAGES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_hghltslngs_MDM(driver)) return false;
        if (!qbe_hghltslngs_MDM(driver)) return false;
        if (!interaction_edit_hghltslngs_MDM(driver)) return false;
        if (!qbe_hghltslngs_MDM(driver)) return false;
        if (!others_actions_hghltslngs_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //TOPS - TOP COUNTRIES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!tenth_change_tab(driver)) return false;
        if (!interaction_record_tpcntrs_MDM(driver)) return false;
        if (!qbe_tpcntrs_MDM(driver)) return false;
        if (!others_actions_tpcntrs_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //TOPS - TOP DESTINATIONS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_tpdstnts_MDM(driver)) return false;
        if (!qbe_tpdstnts_MDM(driver)) return false;
        if (!others_actions_tpdstnts_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //TOPS - TOP EVENTS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!interaction_record_tpevents_MDM(driver)) return false;
        if (!qbe_tpevents_MDM(driver)) return false;
        if (!others_actions_tpevents_MDM(driver)) return false;
        if (!delete_tpevents_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //TOPS - TOP DESTINATIONS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_tpdstnts_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //TOPS - TOP COUNTRIES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_tpcntrs_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //HIGHLIGHTS - LANGUAGES
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!ninth_change_tab(driver)) return false;
        if (!delete_hghltslngs_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //HIGHLIGHTS - HIGHLIGHTS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_hghlts_MDM(driver)) return false;
        //-----------------------------------------------------------------------------------------------------------------------------------
        //HIGHLIGHTS - SLOGANS
        //-----------------------------------------------------------------------------------------------------------------------------------
        if (!delete_hghltssl_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_add", getElements("MDM_cntrs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cntrs_lov_code", getElements("add_cntrs_lov_code")}, // b_lov
                new String[]{"add_cntrs_i_code", getElements("add_cntrs_i_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cntrs_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_cntrs_e_code_description", getElements("add_cntrs_e_code_description")}, // element path
                "cntrs_code_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_order", getElements("add_cntrs_i_order")}, // element path
                "cntrs_order", getData("cntrs_order"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_url", getElements("add_cntrs_i_url")}, // element path
                "cntrs_url", getData("cntrs_url"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cntrs_lov_page_publication", getElements("add_cntrs_lov_page_publication")}, // b_lov
                new String[]{"add_cntrs_i_page_publication", getElements("add_cntrs_i_page_publication")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cntrs_page_publication", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cntrs_cb_active"),
                    "cntrs_active", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_cntrs_cb_active"),
                    "cntrs_active", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_larger_image", getElements("add_cntrs_i_larger_image")}, // element path
                "cntrs_larger_image", getData("cntrs_larger_image"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_small_image", getElements("add_cntrs_i_small_image")}, // element path
                "cntrs_small_image", getData("cntrs_small_image"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_map_image", getElements("add_cntrs_i_map_image")}, // element path
                "cntrs_map_image", getData("cntrs_map_image"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_map_image2", getElements("add_cntrs_i_map_image2")}, // element path
                "cntrs_map_image2", getData("cntrs_map_image2"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cntrs_b_save", getElements("add_cntrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_code", getElements("search_lov_code")}, //LoV button
                new String[]{"search_i_code", getElements("search_i_code")}, //external LoV input
                new String[]{"search_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("cntrs_code"), // value to search
                "cntrs_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_order", getElements("search_i_order")}, // element path
                "cntrs_order", getData("cntrs_order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_url", getElements("search_i_url")}, // element path
                "cntrs_url", getData("cntrs_url"), where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_page_publication", getElements("search_lov_page_publication")}, //LoV button
                new String[]{"search_i_page_publication", getElements("search_i_page_publication")}, //external LoV input
                new String[]{"search_page_publication_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("cntrs_page_publication"), // value to search
                "cntrs_page_publication", //name of the data
                where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        boolean checkbox;
        if (getData("cntrs_active").equalsIgnoreCase("Yes")) {
            checkbox = true;
        }
        else {
            checkbox = false;
        }
        if(!Functions.checkboxValue(driver, getElements("search_cb_active"),
                "cntrs_active", checkbox, true,
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_larger_image", getElements("search_i_larger_image")}, // element path
                "cntrs_larger_image", getData("cntrs_larger_image"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_small_image", getElements("search_i_small_image")}, // element path
                "cntrs_small_image", getData("cntrs_small_image"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_map_image", getElements("search_i_map_image")}, // element path
                "cntrs_map_image", getData("cntrs_map_image"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_map_image2", getElements("search_i_map_image2")}, // element path
                "cntrs_map_image2", getData("cntrs_map_image2"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_edit", getElements("MDM_cntrs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_order", getElements("add_cntrs_i_order")}, // element path
                "cntrs_order", getData("cntrs_order_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_url", getElements("add_cntrs_i_url")}, // element path
                "cntrs_url", getData("cntrs_url_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cntrs_lov_page_publication", getElements("add_cntrs_lov_page_publication")}, // b_lov
                new String[]{"add_cntrs_i_page_publication", getElements("add_cntrs_i_page_publication")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cntrs_page_publication", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_cntrs_e_page_publication_description", getElements("add_cntrs_e_page_publication_description")}, // element path
                "cntrs_page_publication_description", // key for data value (the name)
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cntrs_cb_active"),
                    "cntrs_active", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_cntrs_cb_active"),
                    "cntrs_active", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_larger_image", getElements("add_cntrs_i_larger_image")}, // element path
                "cntrs_larger_image", getData("cntrs_larger_image_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_small_image", getElements("add_cntrs_i_small_image")}, // element path
                "cntrs_small_image", getData("cntrs_small_image_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_map_image", getElements("add_cntrs_i_map_image")}, // element path
                "cntrs_map_image", getData("cntrs_map_image_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_map_image2", getElements("add_cntrs_i_map_image2")}, // element path
                "cntrs_map_image2", getData("cntrs_map_image2_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cntrs_b_save", getElements("add_cntrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cntrs_b_qbe", getElements("MDM_cntrs_b_qbe")},// query button
                new String[]{"qbe_cntrs_i_code", getElements("qbe_cntrs_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_code", getElements("qbe_cntrs_i_code")},
                "cntrs_code", getData("cntrs_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_code_description", getElements("qbe_cntrs_i_code_description")},
                "cntrs_code_description", getData("cntrs_code_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_order", getElements("qbe_cntrs_i_order")},
                "cntrs_order", getData("cntrs_order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_url", getElements("qbe_cntrs_i_url")},
                "cntrs_url", getData("cntrs_url"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_page_publication", getElements("qbe_cntrs_i_page_publication")},
                "cntrs_page_publication", getData("cntrs_page_publication"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_page_publication_description", getElements("qbe_cntrs_i_page_publication_description")},
                "cntrs_page_publication_description", getData("cntrs_page_publication_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_cntrs_sl_active",getElements("qbe_cntrs_sl_active")},
                getData("cntrs_active"), "cntrs_active",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cntrs_i_code", getElements("qbe_cntrs_i_code")}, //search button
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 120, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_cntrs_b_actions", getElements("MDM_cntrs_b_actions")}, //actions button
                new String[]{"MDM_cntrs_b_actions_audit_data", getElements("MDM_cntrs_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cntrs_b_detach", getElements("MDM_cntrs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_mld_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mld_b_add", getElements("MDM_mld_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_mld_lov_language", getElements("add_mld_lov_language")}, // b_lov
                new String[]{"add_mld_i_language", getElements("add_mld_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "mld_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mld_i_link_map", getElements("add_mld_i_link_map")}, // element path
                "mld_link", getData("mld_link"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mld_b_save", getElements("add_mld_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_mld_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_mld_e_result", getElements("MDM_mld_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mld_b_edit", getElements("MDM_mld_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_mld_lov_language", getElements("add_mld_lov_language")}, // b_lov
                new String[]{"add_mld_i_language", getElements("add_mld_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "mld_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mld_i_link_map", getElements("add_mld_i_link_map")}, // element path
                "mld_link", getData("mld_link_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mld_b_save", getElements("add_mld_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_mld_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_mld_b_qbe", getElements("MDM_mld_b_qbe")},// query button
                new String[]{"qbe_mld_i_language", getElements("qbe_mld_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mld_i_language", getElements("qbe_mld_i_language")},
                "mld_language", getData("mld_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mld_i_link_map", getElements("qbe_mld_i_link_map")},
                "mld_link", getData("mld_link"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_mld_i_language", getElements("qbe_mld_i_language")}, //search button
                new String[]{"MDM_mld_e_result", getElements("MDM_mld_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_mld_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_mld_b_detach", getElements("MDM_mld_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cmmc_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cmmc_b_add", getElements("MDM_cmmc_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cmmc_lov_job_position", getElements("add_cmmc_lov_job_position")}, // b_lov
                new String[]{"add_cmmc_i_job_position", getElements("add_cmmc_i_job_position")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cmmc_job_position", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_telephone", getElements("add_cmmc_i_telephone")}, // element path
                "cmmc_telephone", getData("cmmc_telephone"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_fax", getElements("add_cmmc_i_fax")}, // element path
                "cmmc_fax", getData("cmmc_fax"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_postal_code", getElements("add_cmmc_i_postal_code")}, // element path
                "cmmc_postal_code", getData("cmmc_postal_code"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_email", getElements("add_cmmc_i_email")}, // element path
                "cmmc_email", getData("cmmc_email"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cmmc_b_save", getElements("add_cmmc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                240,500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cmmc_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cmmc_b_edit", getElements("MDM_cmmc_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cmmc_lov_job_position", getElements("add_cmmc_lov_job_position")}, // b_lov
                new String[]{"add_cmmc_i_job_position", getElements("add_cmmc_i_job_position")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cmmc_job_position", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_telephone", getElements("add_cmmc_i_telephone")}, // element path
                "cmmc_telephone", getData("cmmc_telephone_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_fax", getElements("add_cmmc_i_fax")}, // element path
                "cmmc_fax", getData("cmmc_fax_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_postal_code", getElements("add_cmmc_i_postal_code")}, // element path
                "cmmc_postal_code", getData("cmmc_postal_code_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc_i_email", getElements("add_cmmc_i_email")}, // element path
                "cmmc_email", getData("cmmc_email_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cmmc_b_save", getElements("add_cmmc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                120,500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cmmc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cmmc2_b_add", getElements("MDM_cmmc2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cmmc2_lov_language", getElements("add_cmmc2_lov_language")}, // b_lov
                new String[]{"add_cmmc2_i_language", getElements("add_cmmc2_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cmmc2_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_office", getElements("add_cmmc2_i_office")}, // element path
                "cmmc2_office", getData("cmmc2_office"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_name", getElements("add_cmmc2_i_name")}, // element path
                "cmmc2_name", getData("cmmc2_name"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_address", getElements("add_cmmc2_i_address")}, // element path
                "cmmc2_address", getData("cmmc2_address"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_province", getElements("add_cmmc2_i_province")}, // element path
                "cmmc2_province", getData("cmmc2_province"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_country", getElements("add_cmmc2_i_country")}, // element path
                "cmmc2_country", getData("cmmc2_country"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cmmc2_b_save", getElements("add_cmmc2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cmmc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cmmc2_b_edit", getElements("MDM_cmmc2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cmmc2_lov_language", getElements("add_cmmc2_lov_language")}, // b_lov
                new String[]{"add_cmmc2_i_language", getElements("add_cmmc2_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "cmmc2_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_office", getElements("add_cmmc2_i_office")}, // element path
                "cmmc2_office", getData("cmmc2_office_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_name", getElements("add_cmmc2_i_name")}, // element path
                "cmmc2_name", getData("cmmc2_name_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_address", getElements("add_cmmc2_i_address")}, // element path
                "cmmc2_address", getData("cmmc2_address_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_province", getElements("add_cmmc2_i_province")}, // element path
                "cmmc2_province", getData("cmmc2_province_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cmmc2_i_country", getElements("add_cmmc2_i_country")}, // element path
                "cmmc2_country", getData("cmmc2_country_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cmmc2_b_save", getElements("add_cmmc2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cmmc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cmmc2_b_qbe", getElements("MDM_cmmc2_b_qbe")},// query button
                new String[]{"qbe_cmmc2_i_language", getElements("qbe_cmmc2_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmmc2_i_language", getElements("qbe_cmmc2_i_language")},
                "cmmc2_language", getData("cmmc2_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmmc2_i_office", getElements("qbe_cmmc2_i_office")},
                "cmmc2_office", getData("cmmc2_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmmc2_i_name", getElements("qbe_cmmc2_i_name")},
                "cmmc2_name", getData("cmmc2_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmmc2_i_address", getElements("qbe_cmmc2_i_address")},
                "cmmc2_address", getData("cmmc2_address"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmmc2_i_province", getElements("qbe_cmmc2_i_province")},
                "cmmc2_province", getData("cmmc2_province"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmmc2_i_country", getElements("qbe_cmmc2_i_country")},
                "cmmc2_country", getData("cmmc2_country"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cmmc2_i_language", getElements("qbe_cmmc2_i_language")}, //search button
                new String[]{"MDM_cmmc2_e_result", getElements("MDM_cmmc2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cmmc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cmmc2_b_detach", getElements("MDM_cmmc2_b_detach")}, //detach button
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
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_big_image", getElements("MDM_cntrs_b_big_image")}, //element to click
                new String[]{"MDM_bigi_b_add", getElements("MDM_bigi_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_bigi_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_bigi_b_add", getElements("MDM_bigi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_bigi_lov_language", getElements("add_bigi_lov_language")}, // b_lov
                new String[]{"add_bigi_i_language", getElements("add_bigi_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "bigi_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_bigi_i_alternative_text", getElements("add_bigi_i_alternative_text")}, // element path
                "bigi_alt_text", getData("bigi_alt_text"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_bigi_b_save", getElements("add_bigi_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_bigi_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_bigi_b_edit", getElements("MDM_bigi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_bigi_lov_language", getElements("add_bigi_lov_language")}, // b_lov
                new String[]{"add_bigi_i_language", getElements("add_bigi_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "bigi_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_bigi_i_alternative_text", getElements("add_bigi_i_alternative_text")}, // element path
                "bigi_alt_text", getData("bigi_alt_text_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_bigi_b_save", getElements("add_bigi_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_bigi_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_bigi_b_qbe", getElements("MDM_bigi_b_qbe")},// query button
                new String[]{"qbe_bigi_i_language", getElements("qbe_bigi_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_bigi_i_language", getElements("qbe_bigi_i_language")},
                "bigi_language", getData("bigi_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_bigi_i_alternative_text", getElements("qbe_bigi_i_alternative_text")},
                "bigi_alt_text", getData("bigi_alt_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_bigi_i_language", getElements("qbe_bigi_i_language")}, //search button
                new String[]{"MDM_bigi_e_result", getElements("MDM_bigi_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_bigi_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_bigi_b_detach", getElements("MDM_bigi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean second_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_small_image", getElements("MDM_cntrs_b_small_image")}, //element to click
                new String[]{"MDM_smalli_b_add", getElements("MDM_smalli_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_smalli_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_smalli_b_add", getElements("MDM_smalli_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_smalli_lov_language", getElements("add_smalli_lov_language")}, // b_lov
                new String[]{"add_smalli_i_language", getElements("add_smalli_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "smalli_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_smalli_i_alternative_text", getElements("add_smalli_i_alternative_text")}, // element path
                "smalli_alt_text", getData("smalli_alt_text"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_smalli_b_save", getElements("add_smalli_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_smalli_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_smalli_b_edit", getElements("MDM_smalli_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_smalli_lov_language", getElements("add_smalli_lov_language")}, // b_lov
                new String[]{"add_smalli_i_language", getElements("add_smalli_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "smalli_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_smalli_i_alternative_text", getElements("add_smalli_i_alternative_text")}, // element path
                "smalli_alt_text", getData("smalli_alt_text_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_smalli_b_save", getElements("add_smalli_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_smalli_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_smalli_b_qbe", getElements("MDM_smalli_b_qbe")},// query button
                new String[]{"qbe_smalli_i_language", getElements("qbe_smalli_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_smalli_i_language", getElements("qbe_smalli_i_language")},
                "smalli_language", getData("smalli_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_smalli_i_alternative_text", getElements("qbe_smalli_i_alternative_text")},
                "smalli_alt_text", getData("smalli_alt_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_smalli_i_language", getElements("qbe_smalli_i_language")}, //search button
                new String[]{"MDM_smalli_e_result", getElements("MDM_smalli_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_smalli_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_smalli_b_detach", getElements("MDM_smalli_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean third_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_map_image", getElements("MDM_cntrs_b_map_image")}, //element to click
                new String[]{"MDM_mapi_b_add", getElements("MDM_mapi_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_mapi_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mapi_b_add", getElements("MDM_mapi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_mapi_lov_language", getElements("add_mapi_lov_language")}, // b_lov
                new String[]{"add_mapi_i_language", getElements("add_mapi_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "mapi_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mapi_i_alternative_text", getElements("add_mapi_i_alternative_text")}, // element path
                "mapi_alt_text", getData("mapi_alt_text"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mapi_b_save", getElements("add_mapi_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_mapi_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mapi_b_edit", getElements("MDM_mapi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_mapi_lov_language", getElements("add_mapi_lov_language")}, // b_lov
                new String[]{"add_mapi_i_language", getElements("add_mapi_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "mapi_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mapi_i_alternative_text", getElements("add_mapi_i_alternative_text")}, // element path
                "mapi_alt_text", getData("mapi_alt_text_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mapi_b_save", getElements("add_mapi_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_mapi_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_mapi_b_qbe", getElements("MDM_mapi_b_qbe")},// query button
                new String[]{"qbe_mapi_i_language", getElements("qbe_mapi_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mapi_i_language", getElements("qbe_mapi_i_language")},
                "mapi_language", getData("mapi_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mapi_i_alternative_text", getElements("qbe_mapi_i_alternative_text")},
                "mapi_alt_text", getData("mapi_alt_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_mapi_i_language", getElements("qbe_mapi_i_language")}, //search button
                new String[]{"MDM_mapi_e_result", getElements("MDM_mapi_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_mapi_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_mapi_b_detach", getElements("MDM_mapi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean fourth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_map_image2", getElements("MDM_cntrs_b_map_image2")}, //element to click
                new String[]{"MDM_mapi2_b_add", getElements("MDM_mapi2_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_mapi2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mapi2_b_add", getElements("MDM_mapi2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_mapi2_lov_language", getElements("add_mapi2_lov_language")}, // b_lov
                new String[]{"add_mapi2_i_language", getElements("add_mapi2_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "mapi2_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mapi2_i_alternative_text", getElements("add_mapi2_i_alternative_text")}, // element path
                "mapi2_alt_text", getData("mapi2_alt_text"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mapi2_b_save", getElements("add_mapi2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_mapi2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_mapi2_b_edit", getElements("MDM_mapi2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_mapi2_lov_language", getElements("add_mapi2_lov_language")}, // b_lov
                new String[]{"add_mapi2_i_language", getElements("add_mapi2_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "mapi2_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_mapi2_i_alternative_text", getElements("add_mapi2_i_alternative_text")}, // element path
                "mapi2_alt_text", getData("mapi2_alt_text_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_mapi2_b_save", getElements("add_mapi2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_mapi2_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_mapi2_b_qbe", getElements("MDM_mapi2_b_qbe")},// query button
                new String[]{"qbe_mapi2_i_language", getElements("qbe_mapi2_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mapi2_i_language", getElements("qbe_mapi2_i_language")},
                "mapi2_language", getData("mapi2_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_mapi2_i_alternative_text", getElements("qbe_mapi2_i_alternative_text")},
                "mapi2_alt_text", getData("mapi2_alt_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_mapi2_i_language", getElements("qbe_mapi2_i_language")}, //search button
                new String[]{"MDM_mapi2_e_result", getElements("MDM_mapi2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_mapi2_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_mapi2_b_detach", getElements("MDM_mapi2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean fifth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_data", getElements("MDM_b_data")}, //element to click
                new String[]{"MDM_dslgns_b_add", getElements("MDM_dslgns_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_dslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dslgns_b_add", getElements("MDM_dslgns_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_dslgns_lov_language", getElements("add_dslgns_lov_language")}, // b_lov
                new String[]{"add_dslgns_i_language", getElements("add_dslgns_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dslgns_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dslgns_i_slogan", getElements("add_dslgns_i_slogan")}, // element path
                "dslgns_slogan", getData("dslgns_slogan"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dslgns_b_save", getElements("add_dslgns_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_dslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dslgns_b_edit", getElements("MDM_dslgns_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_dslgns_lov_language", getElements("add_dslgns_lov_language")}, // b_lov
                new String[]{"add_dslgns_i_language", getElements("add_dslgns_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dslgns_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dslgns_i_slogan", getElements("add_dslgns_i_slogan")}, // element path
                "dslgns_slogan", getData("dslgns_slogan_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dslgns_b_save", getElements("add_dslgns_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dslgns_b_qbe", getElements("MDM_dslgns_b_qbe")},// query button
                new String[]{"qbe_dslgns_i_language", getElements("qbe_dslgns_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dslgns_i_language", getElements("qbe_dslgns_i_language")},
                "dslgns_language", getData("dslgns_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dslgns_i_slogan", getElements("qbe_dslgns_i_slogan")},
                "dslgns_slogan", getData("dslgns_slogan"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dslgns_i_language", getElements("qbe_dslgns_i_language")}, //search button
                new String[]{"MDM_dslgns_e_result", getElements("MDM_dslgns_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dslgns_b_detach", getElements("MDM_dslgns_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_longd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_longd_b_add", getElements("MDM_longd_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_longd_lov_language", getElements("add_longd_lov_language")}, // b_lov
                new String[]{"add_longd_i_language", getElements("add_longd_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "longd_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_longd_i_description", getElements("add_longd_i_description")}, // element path
                "longd_description", getData("longd_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_longd_b_save", getElements("add_longd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_longd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_longd_b_edit", getElements("MDM_longd_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_longd_lov_language", getElements("add_longd_lov_language")}, // b_lov
                new String[]{"add_longd_i_language", getElements("add_longd_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "longd_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_longd_i_description", getElements("add_longd_i_description")}, // element path
                "longd_description", getData("longd_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_longd_b_save", getElements("add_longd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_longd_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_longd_b_qbe", getElements("MDM_longd_b_qbe")},// query button
                new String[]{"qbe_longd_i_language", getElements("qbe_longd_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_longd_i_language", getElements("qbe_longd_i_language")},
                "longd_language", getData("longd_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_longd_i_description", getElements("qbe_longd_i_description")},
                "longd_description", getData("longd_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_longd_i_language", getElements("qbe_longd_i_language")}, //search button
                new String[]{"MDM_longd_e_result", getElements("MDM_longd_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_longd_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_longd_b_detach", getElements("MDM_longd_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_shortd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_shortd_b_add", getElements("MDM_shortd_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_shortd_lov_language", getElements("add_shortd_lov_language")}, // b_lov
                new String[]{"add_shortd_i_language", getElements("add_shortd_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "shortd_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_shortd_i_description", getElements("add_shortd_i_description")}, // element path
                "shortd_description", getData("shortd_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_shortd_b_save", getElements("add_shortd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_shortd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_shortd_b_edit", getElements("MDM_shortd_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_shortd_lov_language", getElements("add_shortd_lov_language")}, // b_lov
                new String[]{"add_shortd_i_language", getElements("add_shortd_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "shortd_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_shortd_i_description", getElements("add_shortd_i_description")}, // element path
                "shortd_description", getData("shortd_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_shortd_b_save", getElements("add_shortd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_shortd_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_shortd_b_qbe", getElements("MDM_shortd_b_qbe")},// query button
                new String[]{"qbe_shortd_i_language", getElements("qbe_shortd_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_shortd_i_language", getElements("qbe_shortd_i_language")},
                "shortd_language", getData("shortd_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_shortd_i_description", getElements("qbe_shortd_i_description")},
                "shortd_description", getData("shortd_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_shortd_i_language", getElements("qbe_shortd_i_language")}, //search button
                new String[]{"MDM_shortd_e_result", getElements("MDM_shortd_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_shortd_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_shortd_b_detach", getElements("MDM_shortd_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean sixth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_general_service", getElements("MDM_b_general_service")}, //element to click
                new String[]{"MDM_gsslgns_b_add", getElements("MDM_gsslgns_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_gsslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gsslgns_b_add", getElements("MDM_gsslgns_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_gsslgns_lov_language", getElements("add_gsslgns_lov_language")}, // b_lov
                new String[]{"add_gsslgns_i_language", getElements("add_gsslgns_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "gsslgns_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gsslgns_i_slogan", getElements("add_gsslgns_i_slogan")}, // element path
                "gsslgns_slogan", getData("gsslgns_slogan"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gsslgns_i_description", getElements("add_gsslgns_i_description")}, // element path
                "gsslgns_description", getData("gsslgns_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gsslgns_b_save", getElements("add_gsslgns_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_gsslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gsslgns_b_edit", getElements("MDM_gsslgns_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.insertInput(driver, new String[]{"add_gsslgns_i_slogan", getElements("add_gsslgns_i_slogan")}, // element path
                "gsslgns_slogan", getData("gsslgns_slogan_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gsslgns_i_description", getElements("add_gsslgns_i_description")}, // element path
                "gsslgns_description", getData("gsslgns_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gsslgns_b_save", getElements("add_gsslgns_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_gsslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_gsslgns_b_qbe", getElements("MDM_gsslgns_b_qbe")},// query button
                new String[]{"qbe_gsslgns_i_language", getElements("qbe_gsslgns_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gsslgns_i_language", getElements("qbe_gsslgns_i_language")},
                "gsslgns_language", getData("gsslgns_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gsslgns_i_slogan", getElements("qbe_gsslgns_i_slogan")},
                "gsslgns_slogan", getData("gsslgns_slogan"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_gsslgns_i_language", getElements("qbe_gsslgns_i_language")}, //search button
                new String[]{"MDM_gsslgns_e_result", getElements("MDM_gsslgns_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_gsslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_gsslgns_b_detach", getElements("MDM_gsslgns_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_gnrls_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gnrls_b_add", getElements("MDM_gnrls_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrls_i_order", getElements("add_gnrls_i_order")}, // element path
                "gnrls_order", getData("gnrls_order"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,new String[]{"add_gnrls_lov_category", getElements("add_gnrls_lov_category")},where))return false;
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_gnrls_lov_category", getElements("add_gnrls_lov_category")}, // b_lov
                new String[]{"add_gnrls_i_category", getElements("add_gnrls_i_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "gnrls_category", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_gnrls_i_category", getElements("add_gnrls_i_category")}, // element path
                "gnrls_category", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_gnrls_e_type", getElements("add_gnrls_e_type")}, // element path
                "gnrls_type", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_gnrls_e_description", getElements("add_gnrls_e_description")}, // element path
                "gnrls_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gnrls_b_save", getElements("add_gnrls_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_gnrls_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gnrls_b_edit", getElements("MDM_gnrls_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrls_i_order", getElements("add_gnrls_i_order")}, // element path
                "gnrls_order", getData("gnrls_order_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_gnrls_lov_category", getElements("add_gnrls_lov_category")}, // b_lov
                new String[]{"add_gnrls_i_category", getElements("add_gnrls_i_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "gnrls_category", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_gnrls_e_type", getElements("add_gnrls_e_type")}, // element path
                "gnrls_type", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_gnrls_e_description", getElements("add_gnrls_e_description")}, // element path
                "gnrls_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gnrls_b_save", getElements("add_gnrls_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_gnrls_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_gnrls_b_qbe", getElements("MDM_gnrls_b_qbe")},// query button
                new String[]{"qbe_gnrls_i_order", getElements("qbe_gnrls_i_order")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrls_i_order", getElements("qbe_gnrls_i_order")},
                "gnrls_order", getData("gnrls_order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrls_i_category", getElements("qbe_gnrls_i_category")},
                "gnrls_category", getData("gnrls_category"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrls_i_description", getElements("qbe_gnrls_i_description")},
                "gnrls_description", getData("gnrls_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrls_i_type", getElements("qbe_gnrls_i_type")},
                "gnrls_type", getData("gnrls_type"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_gnrls_i_order", getElements("qbe_gnrls_i_order")}, //search button
                new String[]{"MDM_gnrls_e_result", getElements("MDM_gnrls_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_gnrls_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_gnrls_b_detach", getElements("MDM_gnrls_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_gnrlslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gnrlslngs_b_add", getElements("MDM_gnrlslngs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_gnrlslngs_lov_language", getElements("add_gnrlslngs_lov_language")}, // b_lov
                new String[]{"add_gnrlslngs_i_language", getElements("add_gnrlslngs_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "gnrlslngs_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_title", getElements("add_gnrlslngs_i_title")}, // element path
                "gnrlslngs_title", getData("gnrlslngs_title"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_link", getElements("add_gnrlslngs_i_link")}, // element path
                "gnrlslngs_link", getData("gnrlslngs_link"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_image", getElements("add_gnrlslngs_i_image")}, // element path
                "gnrlslngs_image", getData("gnrlslngs_image"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_alternative_text", getElements("add_gnrlslngs_i_alternative_text")}, // element path
                "gnrlslngs_alternative_text", getData("gnrlslngs_alternative_text"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_description", getElements("add_gnrlslngs_i_description")}, // element path
                "gnrlslngs_description", getData("gnrlslngs_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gnrlslngs_b_save", getElements("add_gnrlslngs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_gnrlslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_gnrlslngs_b_edit", getElements("MDM_gnrlslngs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_title", getElements("add_gnrlslngs_i_title")}, // element path
                "gnrlslngs_title", getData("gnrlslngs_title_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_link", getElements("add_gnrlslngs_i_link")}, // element path
                "gnrlslngs_link", getData("gnrlslngs_link_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_image", getElements("add_gnrlslngs_i_image")}, // element path
                "gnrlslngs_image", getData("gnrlslngs_image_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_alternative_text", getElements("add_gnrlslngs_i_alternative_text")}, // element path
                "gnrlslngs_alternative_text", getData("gnrlslngs_alternative_text_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_gnrlslngs_i_description", getElements("add_gnrlslngs_i_description")}, // element path
                "gnrlslngs_description", getData("gnrlslngs_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_gnrlslngs_b_save", getElements("add_gnrlslngs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_gnrlslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_gnrlslngs_b_qbe", getElements("MDM_gnrlslngs_b_qbe")},// query button
                new String[]{"qbe_gnrlslngs_i_language", getElements("qbe_gnrlslngs_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrlslngs_i_language", getElements("qbe_gnrlslngs_i_language")},
                "gnrlslngs_language", getData("gnrlslngs_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrlslngs_i_title", getElements("qbe_gnrlslngs_i_title")},
                "gnrlslngs_title", getData("gnrlslngs_title"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrlslngs_i_link", getElements("qbe_gnrlslngs_i_link")},
                "gnrlslngs_link", getData("gnrlslngs_link"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrlslngs_i_image", getElements("qbe_gnrlslngs_i_image")},
                "gnrlslngs_image", getData("gnrlslngs_image"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_gnrlslngs_i_alternative_text", getElements("qbe_gnrlslngs_i_alternative_text")},
                "gnrlslngs_alternative_text", getData("gnrlslngs_alternative_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_gnrlslngs_i_language", getElements("qbe_gnrlslngs_i_language")}, //search button
                new String[]{"MDM_gnrlslngs_e_result", getElements("MDM_gnrlslngs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_gnrlslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_gnrlslngs_b_detach", getElements("MDM_gnrlslngs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_gnrlslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_gnrlslngs_b_delete", getElements("MDM_gnrlslngs_b_delete")},
                new String[]{"MDM_gnrlslngs_e_records", getElements("MDM_gnrlslngs_e_records")},
                new String[]{"MDM_gnrlslngs_b_delete_ok", getElements("MDM_gnrlslngs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_gnrls_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_gnrls_b_delete", getElements("MDM_gnrls_b_delete")},
                new String[]{"MDM_gnrls_e_records", getElements("MDM_gnrls_e_records")},
                new String[]{"MDM_gnrls_b_delete_ok", getElements("MDM_gnrls_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_gsslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_gsslgns_b_delete", getElements("MDM_gsslgns_b_delete")},
                new String[]{"MDM_gsslgns_e_records", getElements("MDM_gsslgns_e_records")},
                new String[]{"MDM_gsslgns_b_delete_ok", getElements("MDM_gsslgns_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_shortd_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_shortd_b_delete", getElements("MDM_shortd_b_delete")},
                new String[]{"MDM_shortd_e_records", getElements("MDM_shortd_e_records")},
                new String[]{"MDM_shortd_b_delete_ok", getElements("MDM_shortd_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_longd_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_longd_b_delete", getElements("MDM_longd_b_delete")},
                new String[]{"MDM_longd_e_records", getElements("MDM_longd_e_records")},
                new String[]{"MDM_longd_b_delete_ok", getElements("MDM_longd_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_dslgns_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dslgns_b_delete", getElements("MDM_dslgns_b_delete")},
                new String[]{"MDM_dslgns_e_records", getElements("MDM_dslgns_e_records")},
                new String[]{"MDM_dslgns_b_delete_ok", getElements("MDM_dslgns_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean seventh_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_countries", getElements("MDM_b_countries")}, //element to click
                new String[]{"MDM_cntrs_b_add", getElements("MDM_cntrs_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean delete_mapi2_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_mapi2_b_delete", getElements("MDM_mapi2_b_delete")},
                new String[]{"MDM_mapi2_e_records", getElements("MDM_mapi2_e_records")},
                new String[]{"MDM_mapi2_b_delete_ok", getElements("MDM_mapi2_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_mapi_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_mapi_b_delete", getElements("MDM_mapi_b_delete")},
                new String[]{"MDM_mapi_e_records", getElements("MDM_mapi_e_records")},
                new String[]{"MDM_mapi_b_delete_ok", getElements("MDM_mapi_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_smalli_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_smalli_b_delete", getElements("MDM_smalli_b_delete")},
                new String[]{"MDM_smalli_e_records", getElements("MDM_smalli_e_records")},
                new String[]{"MDM_smalli_b_delete_ok", getElements("MDM_smalli_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_bigi_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_bigi_b_delete", getElements("MDM_bigi_b_delete")},
                new String[]{"MDM_bigi_e_records", getElements("MDM_bigi_e_records")},
                new String[]{"MDM_bigi_b_delete_ok", getElements("MDM_bigi_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean eighth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_country_images", getElements("MDM_cntrs_b_country_images")}, //element to click
                new String[]{"MDM_mld_b_add", getElements("MDM_mld_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean delete_cmmc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_cmmc2_b_delete", getElements("MDM_cmmc2_b_delete")},
                new String[]{"MDM_cmmc2_e_records", getElements("MDM_cmmc2_e_records")},
                new String[]{"MDM_cmmc2_b_delete_ok", getElements("MDM_cmmc2_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_cmmc_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if(!Functions.doDelete(driver,
                new String[]{"MDM_cmmc_b_delete", getElements("MDM_cmmc_b_delete")},//delete button
                new String[]{"MDM_cmmc_b_delete_ok", getElements("MDM_cmmc_b_delete_ok")},//delete button
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_mld_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_mld_b_delete", getElements("MDM_mld_b_delete")},
                new String[]{"MDM_mld_e_records", getElements("MDM_mld_e_records")},
                new String[]{"MDM_mld_b_delete_ok", getElements("MDM_mld_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_cntrs_b_delete", getElements("MDM_cntrs_b_delete")},
                new String[]{"MDM_cntrs_e_records", getElements("MDM_cntrs_e_records")},
                new String[]{"MDM_cntrs_b_delete_ok", getElements("MDM_cntrs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_MX_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 120, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cntrs_b_qbe", getElements("MDM_cntrs_b_qbe")},// query button
                new String[]{"qbe_cntrs_i_code", getElements("qbe_cntrs_i_code")},//any query input
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cntrs_b_clear_qbe", getElements("MDM_cntrs_b_clear_qbe")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_code", getElements("qbe_cntrs_i_code")},
                "cntrs_code", "MX", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cntrs_i_code", getElements("qbe_cntrs_i_code")}, //search button
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean ninth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_highlights", getElements("MDM_b_highlights")}, //element to click
                new String[]{"MDM_hghltssl_b_add", getElements("MDM_hghltssl_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_hghltssl_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hghltssl_b_add", getElements("MDM_hghltssl_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghltssl_lov_language", getElements("add_hghltssl_lov_language")}, // b_lov
                new String[]{"add_hghltssl_i_language", getElements("add_hghltssl_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghltssl_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltssl_i_slogan", getElements("add_hghltssl_i_slogan")}, // element path
                "hghltssl_slogan", getData("hghltssl_slogan"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltssl_i_description", getElements("add_hghltssl_i_description")}, // element path
                "hghltssl_description", getData("hghltssl_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hghltssl_b_save", getElements("add_hghltssl_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hghltssl_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hghltssl_b_edit", getElements("MDM_hghltssl_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltssl_i_slogan", getElements("add_hghltssl_i_slogan")}, // element path
                "hghltssl_slogan", getData("hghltssl_slogan_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltssl_i_description", getElements("add_hghltssl_i_description")}, // element path
                "hghltssl_description", getData("hghltssl_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hghltssl_b_save", getElements("add_hghltssl_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hghltssl_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hghltssl_b_qbe", getElements("MDM_hghltssl_b_qbe")},// query button
                new String[]{"qbe_hghltssl_i_language", getElements("qbe_hghltssl_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltssl_i_language", getElements("qbe_hghltssl_i_language")},
                "hghltssl_language", getData("hghltssl_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltssl_i_slogan", getElements("qbe_hghltssl_i_slogan")},
                "hghltssl_slogan", getData("hghltssl_slogan"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hghltssl_i_language", getElements("qbe_hghltssl_i_language")}, //search button
                new String[]{"MDM_hghltssl_e_result", getElements("MDM_hghltssl_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hghltssl_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hghltssl_b_detach", getElements("MDM_hghltssl_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_hghlts_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hghlts_b_add", getElements("MDM_hghlts_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghlts_i_order", getElements("add_hghlts_i_order")}, // element path
                "hghlts_order", getData("hghlts_order"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghlts_lov_category", getElements("add_hghlts_lov_category")}, // b_lov
                new String[]{"add_hghlts_i_category", getElements("add_hghlts_i_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"add_hghlts_e_altresultX", getElements("add_hghlts_e_altresultX")}, // lov_e_result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghlts_category", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_hghlts_e_description", getElements("add_hghlts_e_description")}, // element path
                "hghlts_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_hghlts_e_type", getElements("add_hghlts_e_type")}, // element path
                "hghlts_type", // key for data value (the name)
                where)){
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghlts_lov_destination", getElements("add_hghlts_lov_destination")}, // b_lov
                new String[]{"add_hghlts_i_destination", getElements("add_hghlts_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghlts_destination", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghlts_lov_service", getElements("add_hghlts_lov_service")}, // b_lov
                new String[]{"add_hghlts_i_service", getElements("add_hghlts_i_service")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghlts_service", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hghlts_b_save", getElements("add_hghlts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hghlts_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hghlts_b_edit", getElements("MDM_hghlts_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghlts_i_order", getElements("add_hghlts_i_order")}, // element path
                "hghlts_order", getData("hghlts_order_edit"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghlts_lov_category", getElements("add_hghlts_lov_category")}, // b_lov
                new String[]{"add_hghlts_i_category", getElements("add_hghlts_i_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"add_hghlts_e_altresultY", getElements("add_hghlts_e_altresultY")}, // lov_e_result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghlts_category", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_hghlts_e_description", getElements("add_hghlts_e_description")}, // element path
                "hghlts_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_hghlts_e_type", getElements("add_hghlts_e_type")}, // element path
                "hghlts_type", // key for data value (the name)
                where)){
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghlts_lov_destination", getElements("add_hghlts_lov_destination")}, // b_lov
                new String[]{"add_hghlts_i_destination", getElements("add_hghlts_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghlts_destination", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghlts_lov_service", getElements("add_hghlts_lov_service")}, // b_lov
                new String[]{"add_hghlts_i_service", getElements("add_hghlts_i_service")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghlts_service", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hghlts_b_save", getElements("add_hghlts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hghlts_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hghlts_b_qbe", getElements("MDM_hghlts_b_qbe")},// query button
                new String[]{"qbe_hghlts_i_order", getElements("qbe_hghlts_i_order")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghlts_i_order", getElements("qbe_hghlts_i_order")},
                "hghlts_order", getData("hghlts_order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghlts_i_category", getElements("qbe_hghlts_i_category")},
                "hghlts_category", getData("hghlts_category"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghlts_i_description", getElements("qbe_hghlts_i_description")},
                "hghlts_description", getData("hghlts_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghlts_i_type", getElements("qbe_hghlts_i_type")},
                "hghlts_type", getData("hghlts_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghlts_i_destination", getElements("qbe_hghlts_i_destination")},
                "hghlts_destination", getData("hghlts_destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghlts_i_service", getElements("qbe_hghlts_i_service")},
                "hghlts_service", getData("hghlts_service"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hghlts_i_order", getElements("qbe_hghlts_i_order")}, //search button
                new String[]{"MDM_hghlts_e_result", getElements("MDM_hghlts_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hghlts_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hghlts_b_detach", getElements("MDM_hghlts_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_hghltslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hghltslngs_b_add", getElements("MDM_hghltslngs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_hghltslngs_lov_language", getElements("add_hghltslngs_lov_language")}, // b_lov
                new String[]{"add_hghltslngs_i_language", getElements("add_hghltslngs_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hghltslngs_language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_title", getElements("add_hghltslngs_i_title")}, // element path
                "hghltslngs_title", getData("hghltslngs_title"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_link", getElements("add_hghltslngs_i_link")}, // element path
                "hghltslngs_link", getData("hghltslngs_link"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_image", getElements("add_hghltslngs_i_image")}, // element path
                "hghltslngs_image", getData("hghltslngs_image"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_alternative_text", getElements("add_hghltslngs_i_alternative_text")}, // element path
                "hghltslngs_alternative_text", getData("hghltslngs_alternative_text"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_description", getElements("add_hghltslngs_i_description")}, // element path
                "hghltslngs_description", getData("hghltslngs_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hghltslngs_b_save", getElements("add_hghltslngs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hghltslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_hghltslngs_b_edit", getElements("MDM_hghltslngs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_title", getElements("add_hghltslngs_i_title")}, // element path
                "hghltslngs_title", getData("hghltslngs_title_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_link", getElements("add_hghltslngs_i_link")}, // element path
                "hghltslngs_link", getData("hghltslngs_link_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_image", getElements("add_hghltslngs_i_image")}, // element path
                "hghltslngs_image", getData("hghltslngs_image_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_alternative_text", getElements("add_hghltslngs_i_alternative_text")}, // element path
                "hghltslngs_alternative_text", getData("hghltslngs_alternative_text_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_hghltslngs_i_description", getElements("add_hghltslngs_i_description")}, // element path
                "hghltslngs_description", getData("hghltslngs_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_hghltslngs_b_save", getElements("add_hghltslngs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hghltslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_hghltslngs_b_qbe", getElements("MDM_hghltslngs_b_qbe")},// query button
                new String[]{"qbe_hghltslngs_i_language", getElements("qbe_hghltslngs_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltslngs_i_language", getElements("qbe_hghltslngs_i_language")},
                "hghltslngs_language", getData("hghltslngs_language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltslngs_i_title", getElements("qbe_hghltslngs_i_title")},
                "hghltslngs_title", getData("hghltslngs_title"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltslngs_i_link", getElements("qbe_hghltslngs_i_link")},
                "hghltslngs_link", getData("hghltslngs_link"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltslngs_i_image", getElements("qbe_hghltslngs_i_image")},
                "hghltslngs_image", getData("hghltslngs_image"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_hghltslngs_i_alternative_text", getElements("qbe_hghltslngs_i_alternative_text")},
                "hghltslngs_alternative_text", getData("hghltslngs_alternative_text"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_hghltslngs_i_language", getElements("qbe_hghltslngs_i_language")}, //search button
                new String[]{"MDM_hghltslngs_e_result", getElements("MDM_hghltslngs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hghltslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_hghltslngs_b_detach", getElements("MDM_hghltslngs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean tenth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_tops", getElements("MDM_b_tops")}, //element to click
                new String[]{"MDM_tpcntrs_b_add", getElements("MDM_tpcntrs_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }
    private boolean interaction_record_tpcntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tpcntrs_b_add", getElements("MDM_tpcntrs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_tpcntrs_lov_country", getElements("add_tpcntrs_lov_country")}, // b_lov
                new String[]{"add_tpcntrs_i_country", getElements("add_tpcntrs_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tpcntrs_country", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_tpcntrs_e_country_description", getElements("add_tpcntrs_e_country_description")}, // element path
                "tpcntrs_country_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tpcntrs_b_save", getElements("add_tpcntrs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_tpcntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_tpcntrs_b_qbe", getElements("MDM_tpcntrs_b_qbe")},// query button
                new String[]{"qbe_tpcntrs_i_country", getElements("qbe_tpcntrs_i_country")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpcntrs_i_country", getElements("qbe_tpcntrs_i_country")},
                "tpcntrs_country", getData("tpcntrs_country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpcntrs_i_country_description", getElements("qbe_tpcntrs_i_country_description")},
                "tpcntrs_country_description", getData("tpcntrs_country_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_tpcntrs_i_country", getElements("qbe_tpcntrs_i_country")}, //search button
                new String[]{"MDM_tpcntrs_e_result", getElements("MDM_tpcntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_tpcntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_tpcntrs_b_detach", getElements("MDM_tpcntrs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_tpdstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("VERIFY IF EXISTE RECORDS", 3, false);
        String where = " on VERIFY EXISTENCE RECORDS";
        Functions.break_time(driver, 120, 500);
        if (Functions.displayed(driver,getElements("MDM_tpdstnts_e_result"))) {
            if (!Functions.simpleClick(driver, new String[]{"MDM_tpdstnts_e_result", getElements("MDM_tpdstnts_e_result")}, where))
                return false;
            if (!delete_tpdstnts_MDM(driver)) return false;
        }else{
            driver.getReport().addContent("Not exist record in TOP DESTINATION TABLE");
        }
        if (Functions.displayed(driver,getElements("MDM_tpevents_e_result"))) {
            if (!Functions.simpleClick(driver,new String[]{"MDM_tpevents_e_result", getElements("MDM_tpevents_e_result")},where))return false;
            if (!delete_tpevents_MDM(driver)) return false;
        }else{
            driver.getReport().addContent("Not exist record in TOP EVENTS TABLE");
        }
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tpdstnts_b_add", getElements("MDM_tpdstnts_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_tpdstnts_lov_destination", getElements("add_tpdstnts_lov_destination")}, // b_lov
                new String[]{"add_tpdstnts_i_destination", getElements("add_tpdstnts_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tpdstnts_destination", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_tpdstnts_e_destination_description", getElements("add_tpdstnts_e_destination_description")}, // element path
                "tpdstnts_destination_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tpdstnts_b_save", getElements("add_tpdstnts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_tpdstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_tpdstnts_b_qbe", getElements("MDM_tpdstnts_b_qbe")},// query button
                new String[]{"qbe_tpdstnts_i_destination", getElements("qbe_tpdstnts_i_destination")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpdstnts_i_destination", getElements("qbe_tpdstnts_i_destination")},
                "tpdstnts_destination", getData("tpdstnts_destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpdstnts_i_destination_description", getElements("qbe_tpdstnts_i_destination_description")},
                "tpdstnts_destination_description", getData("tpdstnts_destination_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_tpdstnts_i_destination", getElements("qbe_tpdstnts_i_destination")}, //search button
                new String[]{"MDM_tpdstnts_e_result", getElements("MDM_tpdstnts_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_tpdstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_tpdstnts_b_detach", getElements("MDM_tpdstnts_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_tpevents_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 120, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_tpevents_b_add", getElements("MDM_tpevents_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }

        Functions.break_time(driver, 120, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_tpevents_lov_event", getElements("add_tpevents_lov_event")}, // b_lov
                new String[]{"add_tpevents_i_event", getElements("add_tpevents_i_event")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tpevents_event", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_tpevents_e_title", getElements("add_tpevents_e_title")}, // element path
                "tpevents_title", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_tpevents_e_destination", getElements("add_tpevents_e_destination")}, // element path
                "tpevents_destination", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_tpevents_b_save", getElements("add_tpevents_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_tpevents_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_tpevents_b_qbe", getElements("MDM_tpevents_b_qbe")},// query button
                new String[]{"qbe_tpevents_i_event", getElements("qbe_tpevents_i_event")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpevents_i_event", getElements("qbe_tpevents_i_event")},
                "tpevents_event", getData("tpevents_event"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpevents_i_title", getElements("qbe_tpevents_i_title")},
                "tpevents_title", getData("tpevents_title"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_tpevents_i_destination", getElements("qbe_tpevents_i_destination")},
                "tpevents_destination", getData("tpevents_destination"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_tpevents_i_event", getElements("qbe_tpevents_i_event")}, //search button
                new String[]{"MDM_tpevents_e_result", getElements("MDM_tpevents_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_tpevents_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 120, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_tpevents_b_detach", getElements("MDM_tpevents_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_tpevents_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_tpevents_b_delete", getElements("MDM_tpevents_b_delete")},
                new String[]{"MDM_tpevents_e_records", getElements("MDM_tpevents_e_records")},
                new String[]{"MDM_tpevents_b_delete_ok", getElements("MDM_tpevents_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_tpdstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_tpdstnts_b_delete", getElements("MDM_tpdstnts_b_delete")},
                new String[]{"MDM_tpdstnts_e_records", getElements("MDM_tpdstnts_e_records")},
                new String[]{"MDM_tpdstnts_b_delete_ok", getElements("MDM_tpdstnts_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_tpcntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_tpcntrs_b_delete", getElements("MDM_tpcntrs_b_delete")},
                new String[]{"MDM_tpcntrs_e_records", getElements("MDM_tpcntrs_e_records")},
                new String[]{"MDM_tpcntrs_b_delete_ok", getElements("MDM_tpcntrs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hghltslngs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_hghltslngs_b_delete", getElements("MDM_hghltslngs_b_delete")},
                new String[]{"MDM_hghltslngs_e_records", getElements("MDM_hghltslngs_e_records")},
                new String[]{"MDM_hghltslngs_b_delete_ok", getElements("MDM_hghltslngs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hghlts_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_hghlts_b_delete", getElements("MDM_hghlts_b_delete")},
                new String[]{"MDM_hghlts_e_records", getElements("MDM_hghlts_e_records")},
                new String[]{"MDM_hghlts_b_delete_ok", getElements("MDM_hghlts_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hghltssl_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_hghltssl_b_delete", getElements("MDM_hghltssl_b_delete")},
                new String[]{"MDM_hghltssl_e_records", getElements("MDM_hghltssl_e_records")},
                new String[]{"MDM_hghltssl_b_delete_ok", getElements("MDM_hghltssl_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
