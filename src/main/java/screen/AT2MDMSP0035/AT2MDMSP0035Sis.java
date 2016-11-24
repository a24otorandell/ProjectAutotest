package screen.AT2MDMSP0035;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import java.util.Random;

/**
 * Created by jmrios on 18/11/2016.
 */
public class AT2MDMSP0035Sis {
    protected AT2MDMSP0035Locators locators;
    protected AT2MDMSP0035Data data;

    public AT2MDMSP0035Sis() {
    }
    public AT2MDMSP0035Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0035Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0035Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0035Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("Hotels per office");
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
        if(!Functions.getValue(driver,new String[]{"add_i_company", getElements("add_i_company")}, // element path
                "company", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_i_office", getElements("add_i_office")}, // element path
                "office", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name", getElements("add_i_short_name")}, // element path
                "short_name", getData("short_name"),
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_hotel_code",getElements("add_lov_hotel_code")}, // b_lov
                new String[]{"add_i_hotel_code", getElements("add_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_transfer_area",getElements("add_lov_transfer_area")}, // b_lov
                new String[]{"add_i_transfer_area", getElements("add_i_transfer_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_area", //Data name
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_activities_area",getElements("add_lov_activities_area")}, // b_lov
                new String[]{"add_i_activities_area", getElements("add_i_activities_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_area", //Data name
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_activities_pickup_point",getElements("add_lov_activities_pickup_point")}, // b_lov
                new String[]{"add_i_activities_pickup_point", getElements("add_i_activities_pickup_point")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_pickup_point", //Data name
                where)) {
            return false;
        }
        //PRIMER CHECKBOX
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cb_sold_by_HHT"),
                    "sold_by_HHT", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_cb_sold_by_HHT"),
                    "sold_by_HHT", false, true,
                    where)){
                return false;
            }
        }
        //SEGUNDO CHECKBOX
        booleanValue = new Random();
        getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean2;
        if (getRandomBoolean){
            randomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_activities"),
                    "active_activities", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean2="No";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_activities"),
                    "active_activities", false, true,
                    where)){
                return false;
            }
        }
        //TERCER CHECKBOX
        booleanValue = new Random();
        getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean3;
        if (getRandomBoolean){
            randomBoolean3= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_transfers"),
                    "active_transfers", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean3="No";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_transfers"),
                    "active_transfers", false, true,
                    where)){
                return false;
            }
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
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company"), // value to search
                "company", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_i_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("office"), // value to search
                "office", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_short_name", getElements("search_i_short_name")}, // element path
                "short_name", getData("short_name"),
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel_code", getElements("search_lov_hotel_code")}, //LoV button
                new String[]{"search_i_hotel_code", getElements("search_i_hotel_code")}, //external LoV input
                new String[]{"search_i_hotel_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("hotel_code"), // value to search
                "hotel_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_transfer_area", getElements("search_lov_transfer_area")}, //LoV button
                new String[]{"search_i_transfer_area", getElements("search_i_transfer_area")}, //external LoV input
                new String[]{"search_i_transfer_area_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("transfer_area"), // value to search
                "transfer_area", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_activities_area", getElements("search_lov_activities_area")}, //LoV button
                new String[]{"search_i_activities_area", getElements("search_i_activities_area")}, //external LoV input
                new String[]{"search_i_activities_area_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("activities_area"), // value to search
                "activities_area", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_activities_pickup_point", getElements("search_lov_activities_pickup_point")}, //LoV button
                new String[]{"search_i_activities_pickup_point", getElements("search_i_activities_pickup_point")}, //external LoV input
                new String[]{"search_i_activities_pickup_point_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("activities_pickup_point"), // value to search
                "activities_pickup_point", //name of the data
                where)){
            return false;
        }
        //PRIMER CHECKBOX
        Functions.break_time(driver, 30, 500);
        if (!Functions.getAttr(driver, new String[]{"search_e_sold_by_HHT_result", getElements("search_e_sold_by_HHT_result")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "sold_by_HHT_result", // key for data value (the name)
                where)) {
            return false;
        }
        boolean checkbox;
        if (getData("sold_by_HHT_result").equalsIgnoreCase("checked")) {
            checkbox = true;
        }
        else {
            checkbox = false;
        }
        if(!Functions.checkboxValue(driver, getElements("search_cb_sold_by_HHT"),
                "sold_by_HHT", checkbox, true,
                where)) {
            return false;
        }
        //SEGUNDO CHECKBOX
        Functions.break_time(driver, 30, 500);
        if (!Functions.getAttr(driver, new String[]{"search_e_active_activities_result", getElements("search_e_active_activities_result")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "active_activities_result", // key for data value (the name)
                where)) {
            return false;
        }
        boolean checkbox2;
        if (getData("active_activities_result").equalsIgnoreCase("checked")) {
            checkbox2 = true;
        }
        else {
            checkbox2 = false;
        }
        if(!Functions.checkboxValue(driver, getElements("search_cb_active_activities"),
                "active_activities", checkbox2, true,
                where)) {
            return false;
        }
        //TERCER CHECKBOX
        Functions.break_time(driver, 30, 500);
        if (!Functions.getAttr(driver, new String[]{"search_e_active_transfers_result", getElements("search_e_active_transfers_result")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "active_transfers_result", // key for data value (the name)
                where)) {
            return false;
        }
        boolean checkbox3;
        if (getData("active_transfers_result").equalsIgnoreCase("checked")) {
            checkbox3 = true;
        }
        else {
            checkbox3 = false;
        }
        if(!Functions.checkboxValue(driver, getElements("search_cb_active_transfers"),
                "active_transfers", checkbox3, true,
                where)) {
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name", getElements("add_i_short_name")}, // element path
                "short_name", getData("short_name_edit"),
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_hotel_code",getElements("add_lov_hotel_code")}, // b_lov
                new String[]{"add_i_hotel_code", getElements("add_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_e_hotel_name", getElements("add_e_hotel_name")}, // element path
                "hotel", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_e_hotel_town", getElements("add_e_hotel_town")}, // element path
                "town", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_transfer_area",getElements("add_lov_transfer_area")}, // b_lov
                new String[]{"add_i_transfer_area", getElements("add_i_transfer_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_area", //Data name
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_activities_area",getElements("add_lov_activities_area")}, // b_lov
                new String[]{"add_i_activities_area", getElements("add_i_activities_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_area", //Data name
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_activities_pickup_point",getElements("add_lov_activities_pickup_point")}, // b_lov
                new String[]{"add_i_activities_pickup_point", getElements("add_i_activities_pickup_point")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_pickup_point", //Data name
                where)) {
            return false;
        }
        //PRIMER CHECKBOX
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cb_sold_by_HHT"),
                    "sold_by_HHT", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_cb_sold_by_HHT"),
                    "sold_by_HHT", false, true,
                    where)){
                return false;
            }
        }
        //SEGUNDO CHECKBOX
        booleanValue = new Random();
        getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean2;
        if (getRandomBoolean){
            randomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_activities"),
                    "active_activities", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean2="No";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_activities"),
                    "active_activities", false, true,
                    where)){
                return false;
            }
        }
        //TERCER CHECKBOX
        booleanValue = new Random();
        getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean3;
        if (getRandomBoolean){
            randomBoolean3= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_transfers"),
                    "active_transfers", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean3="No";
            if(!Functions.checkboxValue(driver, getElements("add_cb_active_transfers"),
                    "active_transfers", false, true,
                    where)){
                return false;
            }
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
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")},
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_code", getElements("qbe_i_hotel_code")},
                "hotel_code", getData("hotel_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_town", getElements("qbe_i_town")},
                "town", getData("town"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_transfer_area", getElements("qbe_i_transfer_area")},
                "transfer_area", getData("transfer_area"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_activities_area", getElements("qbe_i_activities_area")},
                "activities_area", getData("activities_area"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_activities_pickup_point", getElements("qbe_i_activities_pickup_point")},
                "activities_pickup_point", getData("activities_pickup_point"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_sold_by_HHT", getElements("qbe_sl_sold_by_HHT")},
                getData("sold_by_HHT"), "sold_by_HHT",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_active_activities", getElements("qbe_sl_active_activities")},
                getData("active_activities"), "active_activities",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_active_transfers", getElements("qbe_sl_active_transfers")},
                getData("active_transfers"), "active_transfers",
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_detach", getElements("MDM_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - PRINT", 3, false);
        where = " on PRINTING";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //element to click
                new String[]{"MDM_b_actions_print", getElements("MDM_b_actions_print")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_actions_print", getElements("MDM_b_actions_print")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"ap_lov_transfer_zone", getElements("ap_lov_transfer_zone")}, //LoV button
                new String[]{"ap_i_transfer_zone", getElements("ap_i_transfer_zone")}, //external LoV input
                new String[]{"ap_i_transfer_zone_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("transfer_area"), // value to search
                "transfer_area", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"ap_lov_excursion_zone", getElements("ap_lov_excursion_zone")}, //LoV button
                new String[]{"ap_i_excursion_zone", getElements("ap_i_excursion_zone")}, //external LoV input
                new String[]{"ap_i_excursion_zone_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("activities_area"), // value to search
                "activities_area", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"ap_lov_pickup_point", getElements("ap_lov_pickup_point")}, //LoV button
                new String[]{"ap_i_pickup_point", getElements("ap_i_pickup_point")}, //external LoV input
                new String[]{"ap_i_pickup_point_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("activities_pickup_point"), // value to search
                "activities_pickup_point", //name of the data
                where)){
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"ap_b_accept", getElements("ap_b_accept")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
}
