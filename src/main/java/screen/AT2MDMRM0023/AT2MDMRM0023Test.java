package screen.AT2MDMRM0023;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 12/12/2016.
 */
public class AT2MDMRM0023Test {
    protected AT2MDMRM0023Locators locators;
    protected AT2MDMRM0023Data data;

    public AT2MDMRM0023Test() {
    }
    public AT2MDMRM0023Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0023Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0023Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0023Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Product Site");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //PRODUCT SITE
        if (!interaction_record_prds_MDM(driver)) return false;
        if (!search_prds_MDM(driver)) return false;
        if (!interaction_edit_prds_MDM(driver)) return false;
        if (!qbe_prds_MDM(driver)) return false;
        if (!others_actions_prds_MDM(driver)) return false;
        if (!first_change_tab(driver)) return false;
        //GROUP OF COUNTRIES
        if (!interaction_record_grc_MDM(driver)) return false;
        if (!search_grc_MDM(driver)) return false;
        if (!interaction_edit_grc_MDM(driver)) return false;
        if (!qbe_grc_MDM(driver)) return false;
        if (!others_actions_grc_MDM(driver)) return false;
        if (!second_change_tab(driver)) return false;
        //COUNTRIES
        if (!interaction_record_cntrs_MDM(driver)) return false;
        if (!search_cntrs_MDM(driver)) return false;
        if (!interaction_edit_cntrs_MDM(driver)) return false;
        if (!qbe_cntrs_MDM(driver)) return false;
        if (!others_actions_cntrs_MDM(driver)) return false;
        if (!third_change_tab(driver)) return false;
        //GROUP OF DESTINATIONS
        if (!interaction_record_grd_MDM(driver)) return false;
        if (!search_grd_MDM(driver)) return false;
        if (!interaction_edit_grd_MDM(driver)) return false;
        if (!qbe_grd_MDM(driver)) return false;
        if (!others_actions_grd_MDM(driver)) return false;
        if (!fourth_change_tab(driver)) return false;
        //DESTINATIONS
        if (!interaction_record_dstnts_MDM(driver)) return false;
        if (!search_dstnts_MDM(driver)) return false;
        if (!interaction_edit_dstnts_MDM(driver)) return false;
        if (!qbe_dstnts_MDM(driver)) return false;
        if (!others_actions_dstnts_MDM(driver)) return false;
        if (!delete_dstnts_MDM(driver)) return false;
        //GROUP OF DESTINATIONS
        if (!third_change_tab(driver)) return false;
        if (!delete_grd_MDM(driver)) return false;
        //COUNTRIES
        if (!second_change_tab(driver)) return false;
        if (!delete_cntrs_MDM(driver)) return false;
        //GROUP OF COUNTRIES
        if (!first_change_tab(driver)) return false;
        if (!delete_grc_MDM(driver)) return false;
        //PRODUCT SITE
        if (!fifth_change_tab(driver)) return false;
        if (!delete_prds_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_prds_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prds_b_add", getElements("MDM_prds_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_group_of_countries",getElements("add_prds_lov_group_of_countries")}, // b_lov
                new String[]{"add_prds_i_group_of_countries", getElements("add_prds_i_group_of_countries")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_group_of_countries", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_country",getElements("add_prds_lov_country")}, // b_lov
                new String[]{"add_prds_i_country", getElements("add_prds_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_country", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_group_of_destinations",getElements("add_prds_lov_group_of_destinations")}, // b_lov
                new String[]{"add_prds_i_group_of_destinations", getElements("add_prds_i_group_of_destinations")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_group_of_destinations", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_destinations",getElements("add_prds_lov_destinations")}, // b_lov
                new String[]{"add_prds_i_destinations", getElements("add_prds_i_destinations")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_destinations", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_img", getElements("add_prds_i_img")}, // element path
                "prds_img", getData("img"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_contents1", getElements("add_prds_i_contents1")}, // element path
                "contents1", getData("contents1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_contents2", getElements("add_prds_i_contents2")}, // element path
                "contents2", getData("contents2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_pdf", getElements("add_prds_i_pdf")}, // element path
                "pdf", getData("pdf"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_pdf2", getElements("add_prds_i_pdf2")}, // element path
                "pdf2", getData("pdf2"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        //PRIMER CHECKBOX
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_accommodation"),
                    "online_accommodation", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_accommodation"),
                    "online_accommodation", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //SEGUNDO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_excursions"),
                    "online_excursions", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_excursions"),
                    "online_excursions", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //TERCER CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_groups"),
                    "online_groups", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_groups"),
                    "online_groups", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //CUARTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tickets"),
                    "online_tickets", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tickets"),
                    "online_tickets", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //QUINTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tours"),
                    "online_tours", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tours"),
                    "online_tours", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //SEXTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_transfers"),
                    "online_transfers", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_transfers"),
                    "online_transfers", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //SÉPTIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_car_rental"),
                    "car_rental", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_car_rental"),
                    "car_rental", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //OCTAVO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_accommodation"),
                    "offline_accommodation", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_accommodation"),
                    "offline_accommodation", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //NOVENO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_excursions"),
                    "offline_excursions", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_excursions"),
                    "offline_excursions", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DÉCIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_groups"),
                    "offline_groups", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_groups"),
                    "offline_groups", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //UNDÉCIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tickets"),
                    "offline_tickets", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tickets"),
                    "offline_tickets", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DUOCÉCIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tours"),
                    "offline_tours", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tours"),
                    "offline_tours", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DECIMOTERCER CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_transfers"),
                    "offline_transfers", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_transfers"),
                    "offline_transfers", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DECIMOCUARTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_car_rental"),
                    "offline_car_rental", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_car_rental"),
                    "offline_car_rental", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prds_b_save", getElements("add_prds_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_prds_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_prds_lov_group_of_countries", getElements("search_prds_lov_group_of_countries")}, //LoV button
                new String[]{"search_prds_i_group_of_countries", getElements("search_prds_i_group_of_countries")}, //external LoV input
                new String[]{"search_prds_group_of_countries_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("prds_group_of_countries"), // value to search
                "prds_group_of_countries", //name of the data
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_prds_lov_country", getElements("search_prds_lov_country")}, //LoV button
                new String[]{"search_prds_i_country", getElements("search_prds_i_country")}, //external LoV input
                new String[]{"search_prds_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("prds_country"), // value to search
                "prds_country", //name of the data
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_prds_lov_group_of_destinations", getElements("search_prds_lov_group_of_destinations")}, //LoV button
                new String[]{"search_prds_i_group_of_destinations", getElements("search_prds_i_group_of_destinations")}, //external LoV input
                new String[]{"search_prds_group_of_destinations_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("prds_group_of_destinations"), // value to search
                "prds_group_of_destinations", //name of the data
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_prds_lov_destinations", getElements("search_prds_lov_destinations")}, //LoV button
                new String[]{"search_prds_i_destinations", getElements("search_prds_i_destinations")}, //external LoV input
                new String[]{"search_prds_destinations_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("prds_destinations"), // value to search
                "prds_destinations", //name of the data
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_prds_b_search", getElements("search_prds_b_search")}, //search button
                new String[]{"MDM_prds_e_result", getElements("MDM_prds_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_prds_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prds_b_edit", getElements("MDM_prds_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_group_of_countries",getElements("add_prds_lov_group_of_countries")}, // b_lov
                new String[]{"add_prds_i_group_of_countries", getElements("add_prds_i_group_of_countries")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_group_of_countries", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_country",getElements("add_prds_lov_country")}, // b_lov
                new String[]{"add_prds_i_country", getElements("add_prds_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_country", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_group_of_destinations",getElements("add_prds_lov_group_of_destinations")}, // b_lov
                new String[]{"add_prds_i_group_of_destinations", getElements("add_prds_i_group_of_destinations")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_group_of_destinations", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_prds_lov_destinations",getElements("add_prds_lov_destinations")}, // b_lov
                new String[]{"add_prds_i_destinations", getElements("add_prds_i_destinations")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prds_destinations", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_img", getElements("add_prds_i_img")}, // element path
                "prds_img", getData("img_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_contents1", getElements("add_prds_i_contents1")}, // element path
                "contents1", getData("contents1_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_contents2", getElements("add_prds_i_contents2")}, // element path
                "contents2", getData("contents2_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_pdf", getElements("add_prds_i_pdf")}, // element path
                "pdf", getData("pdf_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prds_i_pdf2", getElements("add_prds_i_pdf2")}, // element path
                "pdf2", getData("pdf2_edit"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        //PRIMER CHECKBOX
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_accommodation"),
                    "online_accommodation", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_accommodation"),
                    "online_accommodation", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //SEGUNDO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_excursions"),
                    "online_excursions", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_excursions"),
                    "online_excursions", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //TERCER CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_groups"),
                    "online_groups", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_groups"),
                    "online_groups", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //CUARTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tickets"),
                    "online_tickets", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tickets"),
                    "online_tickets", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //QUINTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tours"),
                    "online_tours", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_tours"),
                    "online_tours", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //SEXTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_transfers"),
                    "online_transfers", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_transfers"),
                    "online_transfers", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //SÉPTIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_car_rental"),
                    "car_rental", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_online_car_rental"),
                    "car_rental", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //OCTAVO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_accommodation"),
                    "offline_accommodation", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_accommodation"),
                    "offline_accommodation", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //NOVENO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_excursions"),
                    "offline_excursions", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_excursions"),
                    "offline_excursions", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DÉCIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_groups"),
                    "offline_groups", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_groups"),
                    "offline_groups", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //UNDÉCIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tickets"),
                    "offline_tickets", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tickets"),
                    "offline_tickets", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DUOCÉCIMO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tours"),
                    "offline_tours", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_tours"),
                    "offline_tours", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DECIMOTERCER CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_transfers"),
                    "offline_transfers", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_transfers"),
                    "offline_transfers", false, true,
                    where)){
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        //DECIMOCUARTO CHECKBOX
        getRandomBoolean = booleanValue.nextBoolean();
        if (getRandomBoolean){
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_car_rental"),
                    "offline_car_rental", true, true,
                    where)) {
                return false;
            }
        }
        else {
            if(!Functions.checkboxValue(driver, getElements("add_prds_cb_offline_car_rental"),
                    "offline_car_rental", false, true,
                    where)){
                return false;
            }
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prds_b_save", getElements("add_prds_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_prds_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_prds_b_reset", getElements("search_prds_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_prds_b_qbe", getElements("MDM_prds_b_qbe")},// query button
                new String[]{"qbe_prds_i_group_of_countries", getElements("qbe_prds_i_group_of_countries")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prds_i_group_of_countries", getElements("qbe_prds_i_group_of_countries")}, // element path
                "prds_group_of_countries", getData("prds_group_of_countries"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prds_i_country", getElements("qbe_prds_i_country")}, // element path
                "prds_country", getData("prds_country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prds_i_group_of_destinations", getElements("qbe_prds_i_group_of_destinations")}, // element path
                "prds_group_of_destinations", getData("prds_group_of_destinations"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prds_i_destinations", getElements("qbe_prds_i_destinations")}, // element path
                "prds_destinations", getData("prds_destinations"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_prds_i_group_of_countries", getElements("qbe_prds_i_group_of_countries")}, //search button
                new String[]{"MDM_prds_e_result", getElements("MDM_prds_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prds_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_prds_b_actions", getElements("MDM_prds_b_actions")}, //actions button
                new String[]{"MDM_prds_b_actions_audit_data", getElements("MDM_prds_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_prds_b_detach", getElements("MDM_prds_b_detach")}, //detach button
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
                new String[]{"MDM_b_group_of_countries", getElements("MDM_b_group_of_countries")}, //element to click
                new String[]{"MDM_grc_b_add", getElements("MDM_grc_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_grc_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grc_b_add", getElements("MDM_grc_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grc_i_group_of_countries_code", getElements("add_grc_i_group_of_countries_code")}, // element path
                "grc_group_of_countries_code", getData("grc_group_of_countries_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grc_i_description", getElements("add_grc_i_description")}, // element path
                "grc_description", getData("grc_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grc_b_save", getElements("add_grc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_grc_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_grc_i_group_of_countries_code", getElements("search_grc_i_group_of_countries_code")}, // element path
                "grc_group_of_countries_code", getData("grc_group_of_countries_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_grc_i_description", getElements("search_grc_i_description")}, // element path
                "grc_description", getData("grc_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_grc_b_search", getElements("search_grc_b_search")}, //search button
                new String[]{"MDM_grc_e_result", getElements("MDM_grc_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_grc_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grc_b_edit", getElements("MDM_grc_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grc_i_group_of_countries_code", getElements("add_grc_i_group_of_countries_code")}, // element path
                "grc_group_of_countries_code", getData("grc_group_of_countries_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grc_i_description", getElements("add_grc_i_description")}, // element path
                "grc_description", getData("grc_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grc_b_save", getElements("add_grc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_grc_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_grc_b_reset", getElements("search_grc_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_grc_b_qbe", getElements("MDM_grc_b_qbe")},// query button
                new String[]{"qbe_grc_i_group_of_countries_code", getElements("qbe_grc_i_group_of_countries_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_grc_i_group_of_countries_code", getElements("qbe_grc_i_group_of_countries_code")},
                "grc_group_of_countries_code", getData("grc_group_of_countries_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_grc_i_description", getElements("qbe_grc_i_description")},
                "grc_description", getData("grc_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_grc_i_group_of_countries_code", getElements("qbe_grc_i_group_of_countries_code")}, //search button
                new String[]{"MDM_grc_e_result", getElements("MDM_grc_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_grc_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_grc_b_actions", getElements("MDM_grc_b_actions")}, //actions button
                new String[]{"MDM_grc_b_actions_audit_data", getElements("MDM_grc_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_grc_b_detach", getElements("MDM_grc_b_detach")}, //detach button
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_countries", getElements("MDM_b_countries")}, //element to click
                new String[]{"MDM_cntrs_b_add", getElements("MDM_cntrs_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_add", getElements("MDM_cntrs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_country_code", getElements("add_cntrs_i_country_code")}, // element path
                "cntrs_country_code", getData("cntrs_country_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_description", getElements("add_cntrs_i_description")}, // element path
                "cntrs_description", getData("cntrs_description"), where)) {
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
    private boolean search_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_cntrs_i_country_code", getElements("search_cntrs_i_country_code")}, // element path
                "cntrs_country_code", getData("cntrs_country_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_cntrs_i_description", getElements("search_cntrs_i_description")}, // element path
                "cntrs_description", getData("cntrs_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_cntrs_b_search", getElements("search_cntrs_b_search")}, //search button
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cntrs_b_edit", getElements("MDM_cntrs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_country_code", getElements("add_cntrs_i_country_code")}, // element path
                "cntrs_country_code", getData("cntrs_country_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cntrs_i_description", getElements("add_cntrs_i_description")}, // element path
                "cntrs_description", getData("cntrs_country_code_edit"), where)) {
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
                new String[]{"search_cntrs_b_reset", getElements("search_cntrs_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cntrs_b_qbe", getElements("MDM_cntrs_b_qbe")},// query button
                new String[]{"qbe_cntrs_i_country_code", getElements("qbe_cntrs_i_country_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_country_code", getElements("qbe_cntrs_i_country_code")},
                "cntrs_country_code", getData("cntrs_country_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cntrs_i_description", getElements("qbe_cntrs_i_description")},
                "cntrs_description", getData("cntrs_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cntrs_i_country_code", getElements("qbe_cntrs_i_country_code")}, //search button
                new String[]{"MDM_cntrs_e_result", getElements("MDM_cntrs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cntrs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_cntrs_b_actions", getElements("MDM_cntrs_b_actions")}, //actions button
                new String[]{"MDM_cntrs_b_actions_audit_data", getElements("MDM_cntrs_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cntrs_b_detach", getElements("MDM_cntrs_b_detach")}, //detach button
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_group_of_destinations", getElements("MDM_b_group_of_destinations")}, //element to click
                new String[]{"MDM_grd_b_add", getElements("MDM_grd_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grd_b_add", getElements("MDM_grd_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grd_i_group_of_destinations_code", getElements("add_grd_i_group_of_destinations_code")}, // element path
                "grd_group_of_destinations_code", getData("grd_group_of_destinations_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grd_i_description", getElements("add_grd_i_description")}, // element path
                "grd_description", getData("grd_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grd_b_save", getElements("add_grd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_grd_i_group_of_destinations_code", getElements("search_grd_i_group_of_destinations_code")}, // element path
                "grd_group_of_destinations_code", getData("grd_group_of_destinations_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_grd_i_description", getElements("search_grd_i_description")}, // element path
                "grd_description", getData("grd_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_grd_b_search", getElements("search_grd_b_search")}, //search button
                new String[]{"MDM_grd_e_result", getElements("MDM_grd_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_grd_b_edit", getElements("MDM_grd_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grd_i_group_of_destinations_code", getElements("add_grd_i_group_of_destinations_code")}, // element path
                "grd_group_of_destinations_code", getData("grd_group_of_destinations_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_grd_i_description", getElements("add_grd_i_description")}, // element path
                "grd_description", getData("grd_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_grd_b_save", getElements("add_grd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_grd_b_reset", getElements("search_grd_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_grd_b_qbe", getElements("MDM_grd_b_qbe")},// query button
                new String[]{"qbe_grd_i_group_of_destinations_code", getElements("qbe_grd_i_group_of_destinations_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_grd_i_group_of_destinations_code", getElements("qbe_grd_i_group_of_destinations_code")},
                "grd_group_of_destinations_code", getData("grd_group_of_destinations_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_grd_i_description", getElements("qbe_grd_i_description")},
                "grd_description", getData("grd_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_grd_i_group_of_destinations_code", getElements("qbe_grd_i_group_of_destinations_code")}, //search button
                new String[]{"MDM_grd_e_result", getElements("MDM_grd_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_grd_b_actions", getElements("MDM_grd_b_actions")}, //actions button
                new String[]{"MDM_grd_b_actions_audit_data", getElements("MDM_grd_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_grd_b_detach", getElements("MDM_grd_b_detach")}, //detach button
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_destinations", getElements("MDM_b_destinations")}, //element to click
                new String[]{"MDM_dstnts_b_add", getElements("MDM_dstnts_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_dstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dstnts_b_add", getElements("MDM_dstnts_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dstnts_i_destination_code", getElements("add_dstnts_i_destination_code")}, // element path
                "dstnts_destination_code", getData("dstnts_destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dstnts_i_description", getElements("add_dstnts_i_description")}, // element path
                "dstnts_description", getData("dstnts_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dstnts_b_save", getElements("add_dstnts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_dstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_dstnts_i_destination_code", getElements("search_dstnts_i_destination_code")}, // element path
                "dstnts_destination_code", getData("dstnts_destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_dstnts_i_description", getElements("search_dstnts_i_description")}, // element path
                "dstnts_description", getData("dstnts_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_dstnts_b_search", getElements("search_dstnts_b_search")}, //search button
                new String[]{"MDM_dstnts_e_result", getElements("MDM_dstnts_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_dstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dstnts_b_edit", getElements("MDM_dstnts_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dstnts_i_destination_code", getElements("add_dstnts_i_destination_code")}, // element path
                "dstnts_destination_code", getData("dstnts_destination_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dstnts_i_description", getElements("add_dstnts_i_description")}, // element path
                "dstnts_description", getData("dstnts_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dstnts_b_save", getElements("add_dstnts_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_dstnts_b_reset", getElements("search_dstnts_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dstnts_b_qbe", getElements("MDM_dstnts_b_qbe")},// query button
                new String[]{"qbe_dstnts_i_destination_code", getElements("qbe_dstnts_i_destination_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dstnts_i_destination_code", getElements("qbe_dstnts_i_destination_code")},
                "dstnts_destination_code", getData("dstnts_destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dstnts_i_description", getElements("qbe_dstnts_i_description")},
                "dstnts_description", getData("dstnts_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dstnts_i_destination_code", getElements("qbe_dstnts_i_destination_code")}, //search button
                new String[]{"MDM_dstnts_e_result", getElements("MDM_dstnts_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dstnts_b_actions", getElements("MDM_dstnts_b_actions")}, //actions button
                new String[]{"MDM_dstnts_b_actions_audit_data", getElements("MDM_dstnts_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dstnts_b_detach", getElements("MDM_dstnts_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_dstnts_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_dstnts_e_result", getElements("MDM_dstnts_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dstnts_b_delete", getElements("MDM_dstnts_b_delete")},
                new String[]{"MDM_dstnts_e_records", getElements("MDM_dstnts_e_records")},
                new String[]{"MDM_dstnts_b_delete_ok", getElements("MDM_dstnts_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_grd_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_grd_e_result", getElements("MDM_grd_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_grd_b_delete", getElements("MDM_grd_b_delete")},
                new String[]{"MDM_grd_e_records", getElements("MDM_grd_e_records")},
                new String[]{"MDM_grd_b_delete_ok", getElements("MDM_grd_b_delete_ok")}, //delete button yes
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
    private boolean delete_grc_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_grc_b_delete", getElements("MDM_grc_b_delete")},
                new String[]{"MDM_grc_e_records", getElements("MDM_grc_e_records")},
                new String[]{"MDM_grc_b_delete_ok", getElements("MDM_grc_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean fifth_change_tab(TestDriver driver) {
        driver.getReport().addHeader("CHANGE TAB RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_product_site", getElements("MDM_b_product_site")}, //element to click
                new String[]{"MDM_prds_b_add", getElements("MDM_prds_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prds_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_prds_b_delete", getElements("MDM_prds_b_delete")},
                new String[]{"MDM_prds_e_records", getElements("MDM_prds_e_records")},
                new String[]{"MDM_prds_b_delete_ok", getElements("MDM_prds_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}