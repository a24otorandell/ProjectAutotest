package screen.AT2BOOSA1002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;



/**
 * Created by acarrillo on 18/05/2016.
 */
class AT2BOOSA1002Test {
    protected AT2BOOSA1002Locators locators;
    protected AT2BOOSA1002Data data;

    public AT2BOOSA1002Test() {
    }
    public AT2BOOSA1002Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSA1002Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSA1002Data getData() {
        return data;
    }

    public void setData(AT2BOOSA1002Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);

        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BOOKINGS");
        driver.getTestdetails().setSubmenu("SALE");
        driver.getTestdetails().setScreen("Bookings Maintenance");
    }

    protected String getElements(String key){
        return this.locators.getElements().get(key);
    }

    public void putData (String key, String value){
        this.data.getData().put(key,value);
        System.out.println("The value is save in "+key+" ("+value+")");
    }

    protected String getData(String key){
        return this.data.getData().get(key);
    }

    protected boolean testCSED(TestDriver driver) {
        if(!create_header(driver)){return false;}
        //header_edicion
        if(!header_actions(driver)){return false;}
        if(!header_consult(driver)){return false;}
        if(!create_remarks(driver)){return false;}
        if(!hotel(driver)){return false;}
        if(!transfers(driver)){return false;}
        if(!activities(driver)){return false;}

        return true;
    }

    private boolean activities(TestDriver driver) {
        if(!Functions.simpleClick(driver,
                new String[]{"activities_tab_tab", getElements("activities_tab_tab")}, //element to click
                " on BOOSA1002 Activities")){return false;} // where the operation occurs
        if(!create_activites(driver)){return false;}
        //TODO EDITION
        if(!query_activites(driver)){return false;}
       // if(!actions_activites(driver)){return false;}


        return true;
    }

    private boolean query_activites(TestDriver driver) {

        if(!Functions.clickQbE(driver,
                new String[]{"activities_b_query", getElements("activities_b_query")}, //element to click
                new String[]{"activities_b_query_i_service", getElements("activities_b_query_i_service")}, //element expected to appear
                " on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_startdate",getElements("activities_b_query_i_startdate")},
                "activities_startdate", getData("activities_startdate")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_enddate",getElements("activities_b_query_i_enddate")},
                "activities_enddate", getData("activities_enddate")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_service",getElements("activities_b_query_i_service")},
                "activities_service", getData("activities_service")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_modality",getElements("activities_b_query_i_modality")},
                "activities_modality", getData("activities_modality")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_contract",getElements("activities_b_query_i_contract")},
                "activities_contract", getData("activities_contract")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_supplier",getElements("activities_b_query_i_supplier")},
                "activities_supplier", getData("activities_supplier")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_origin",getElements("activities_b_query_i_origin")},
                "activities_origin", getData("activities_origin")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_destination",getElements("activities_b_query_i_destination")},
                "activities_destination", getData("activities_destination")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_adults",getElements("activities_b_query_i_adults")},
                "activities_adults", getData("activities_adults")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_children",getElements("activities_b_query_i_children")},
                "activities_children", getData("activities_children")," on BOOSA1002 Activities")){return false;}

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"activities_b_query_i_children", getElements("activities_b_query_i_children")}, //any query input
                new String[]{"activities_e_result", getElements("activities_e_result")}, //table result
                "where")){return false;} // where this operation occurs

        return true;
    }

    private boolean create_activites(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"activities_b_add", getElements("activities_b_add")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Activities")){return false;}

        if (!Functions.selectText(driver,
                new String[]{"activities_b_add_select_activity",getElements("activities_b_add_select_activity")},
                "Car hire",
                "activities_activity",
                " on BOOSA1002 Activities")){return false;}
        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_startdate",getElements("activities_b_add_select_i_startdate")},
                "activities_startdate", getData("activities_startdate")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_enddate",getElements("activities_b_add_select_i_enddate")},
                "activities_enddate", getData("activities_enddate")," on BOOSA1002 Activities")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_service",getElements("activities_b_add_select_lov_service")}, // b_lov
                new String[]{"activities_b_add_select_i_service", getElements("activities_b_add_select_i_service")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_service", //Data name
                " on BOOSA1002 Activities")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_modality",getElements("activities_b_add_select_lov_modality")}, // b_lov
                new String[]{"activities_b_add_select_i_modality", getElements("activities_b_add_select_i_modality")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_modality", //Data name
                " on BOOSA1002 Activities")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_contract",getElements("activities_b_add_select_lov_contract")}, // b_lov
                new String[]{"activities_b_add_select_i_contract", getElements("activities_b_add_select_i_contract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_contract", //Data name
                " on BOOSA1002 Activities")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_supplier",getElements("activities_b_add_select_lov_supplier")}, // b_lov
                new String[]{"activities_b_add_select_i_supplier", getElements("activities_b_add_select_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_supplier", //Data name
                " on BOOSA1002 Activities")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_origin",getElements("activities_b_add_select_lov_origin")}, // b_lov
                new String[]{"activities_b_add_select_i_origin", getElements("activities_b_add_select_i_origin")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_origin", //Data name
                " on BOOSA1002 Activities")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_destination",getElements("activities_b_add_select_lov_destination")}, // b_lov
                new String[]{"activities_b_add_select_i_destination", getElements("activities_b_add_select_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_destination", //Data name
                " on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_adults",getElements("activities_b_add_select_i_adults")},
                "activities_adults", getData("activities_adults")," on BOOSA1002 Activities")){return false;}

        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_children",getElements("activities_b_add_select_i_children")},
                "activities_children", getData("activities_children")," on BOOSA1002 Activities")){return false;}

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"activities_b_add_select_b_save", getElements("activities_b_add_select_b_save")},// query button
                new String[]{"glass", recursiveXPaths.glass},//any query input
                " on BOOSA1002 Activities")){return false;} // where the operation occurs

        return true;
    }

    private boolean transfers(TestDriver driver) {
        if(!Functions.simpleClick(driver,
                new String[]{"transfer_tab_tab", getElements("transfer_tab_tab")}, //element to click
                " on BOOSA1002 Transfer")){return false;} // where the operation occurs
        if(!create_transfer(driver)){return false;}
        if(!query_transfer(driver)){return false;}
        if(!actions_transfer(driver)){return false;}
        //edit
        //TODO


        return true;
    }

    private boolean actions_transfer(TestDriver driver) {

        //TODO
        return true;
    }

    private boolean query_transfer(TestDriver driver) {

        if(!Functions.clickQbE(driver,
                new String[]{"transfer_b_query", getElements("transfer_b_query")},// query button
                new String[]{"transfer_b_query_i_date", getElements("transfer_b_query_i_date")},//any query input
                " on BOOSA1002 Transfer")){return false;} // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_date",getElements("transfer_b_query_i_date")},
                "transfer_date", getData("transfer_date")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_fromzone",getElements("transfer_b_query_i_fromzone")},
                "transfer_fromzone", getData("transfer_fromzone")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_hotel",getElements("transfer_b_query_i_hotel")},
                "transfer_hotel", getData("transfer_hotel")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_tozone",getElements("transfer_b_query_i_tozone")},
                "transfer_tozone", getData("transfer_tozone")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_tohotel",getElements("transfer_b_query_i_tohotel")},
                "transfer_tohotel", getData("transfer_tohotel")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_salecontract",getElements("transfer_b_query_i_salecontract")},
                "transfer_salecontract", getData("transfer_salecontract")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_purchasecontract",getElements("transfer_b_query_i_purchasecontract")},
                "transfer_purchasecontract", getData("transfer_purchasecontract")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_mastertype",getElements("transfer_b_query_i_mastertype")},
                "transfer_mastertype", getData("transfer_mastertype")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_vehicletype",getElements("transfer_b_query_i_vehicletype")},
                "transfer_vehicletype", getData("transfer_vehicletype")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_flight",getElements("transfer_b_query_i_flight")},
                "transfer_flight", getData("transfer_flight")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_flighthour",getElements("transfer_b_query_i_flighthour")},
                "transfer_flighthour", getData("transfer_flighthour")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_depart",getElements("transfer_b_query_i_depart")},
                "transfer_depart", getData("transfer_depart")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_arrival",getElements("transfer_b_query_i_arrival")},
                "transfer_arrival", getData("transfer_arrival")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_pickupdate",getElements("transfer_b_query_i_pickupdate")},
                "transfer_pickupdate", getData("transfer_pickupdate")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_pickupoint",getElements("transfer_b_query_i_pickupoint")},
                "transfer_pickupoint", getData("transfer_pickupoint")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_ticketn",getElements("transfer_b_query_i_ticketn")},
                "transfer_ticketn", getData("transfer_ticketn")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_ref",getElements("transfer_b_query_i_ref")},
                "transfer_ref", getData("transfer_ref")," on BOOSA1002 Hotel")){return false;}



        return true;
    }

    private boolean create_transfer(TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"transfer_b_add", getElements("transfer_b_add")}, //element to click
                new String[]{"transfer_e_result", getElements("transfer_e_result")}, //element expected to appear
                " on BOOSA1002 Transfer")){return false;} // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"transfer_e_result_i_date",getElements("transfer_e_result_i_date")},
                "transfer_date", getData("transfer_date")," on BOOSA1002 Hotel")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_fromzone",getElements("transfer_e_result_lov_fromzone")}, // b_lov
                new String[]{"transfer_e_result_i_fromzone", getElements("transfer_e_result_i_fromzone")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_fromzone", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_hotel",getElements("transfer_e_result_lov_hotel")}, // b_lov
                new String[]{"transfer_e_result_i_hotel", getElements("transfer_e_result_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_hotel", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_tozone",getElements("transfer_e_result_lov_tozone")}, // b_lov
                new String[]{"transfer_e_result_i_tozone", getElements("transfer_e_result_i_tozone")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_tozone", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_tohotel",getElements("transfer_e_result_lov_tohotel")}, // b_lov
                new String[]{"transfer_e_result_i_tohotel", getElements("transfer_e_result_i_tohotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_tohotel", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_salecontract",getElements("transfer_e_result_lov_salecontract")}, // b_lov
                new String[]{"transfer_e_result_i_salecontract", getElements("transfer_e_result_i_salecontract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_salecontract", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_purchasecontract",getElements("transfer_e_result_lov_purchasecontract")}, // b_lov
                new String[]{"transfer_e_result_i_purchasecontract", getElements("transfer_e_result_i_purchasecontract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_purchasecontract", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_mastertype",getElements("transfer_e_result_lov_mastertype")}, // b_lov
                new String[]{"transfer_e_result_i_mastertype", getElements("transfer_e_result_i_mastertype")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_mastertype", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_vehicle",getElements("transfer_e_result_lov_vehicle")}, // b_lov
                new String[]{"transfer_e_result_i_vehicle", getElements("transfer_e_result_i_vehicle")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_vehicle", //Data name
                " on BOOSA1002 Transfer")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_flight",getElements("transfer_e_result_lov_flight")}, // b_lov
                new String[]{"transfer_e_result_i_flight", getElements("transfer_e_result_i_flight")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_flight", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_e_result_i_flighthour",getElements("transfer_e_result_i_flighthour")},
                "transfer_flighthour", getData("transfer_flighthour")," on BOOSA1002 Hotel")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_depart",getElements("transfer_e_result_lov_depart")}, // b_lov
                new String[]{"transfer_e_result_i_depart", getElements("transfer_e_result_i_depart")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_depart", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_arrival",getElements("transfer_e_result_lov_arrival")}, // b_lov
                new String[]{"transfer_e_result_i_arrival", getElements("transfer_e_result_i_arrival")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_arrival", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_e_result_i_pickupdate",getElements("transfer_e_result_i_pickupdate")},
                "transfer_pickupdate", getData("transfer_pickupdate")," on BOOSA1002 Hotel")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_pickupoint",getElements("transfer_e_result_lov_pickupoint")}, // b_lov
                new String[]{"transfer_e_result_i_pickupoint", getElements("transfer_e_result_i_pickupoint")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_pickupoint", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if (!Functions.insertInput(driver, new String[]{"transfer_e_result_i_ticketn",getElements("transfer_e_result_i_ticketn")},
                "transfer_ticketn", getData("transfer_ticketn")," on BOOSA1002 Hotel")){return false;}

        if(!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_ref",getElements("transfer_e_result_lov_ref")}, // b_lov
                new String[]{"transfer_e_result_i_ref", getElements("transfer_e_result_i_ref")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_ref", //Data name
                " on BOOSA1002 Transfer")){return false;}

        if (!Functions.simpleClick(driver,
                new String[]{"transfer_b_save", getElements("transfer_b_save")}, //element to click
                " on BOOSA1002 Transfer")){return false;}


        return true;
    }

    private boolean hotel(TestDriver driver) {
        if(!create_hotel(driver)){return false;}
        //Hotel edition
        if(!query_hotel(driver)){return false;}
        if(!hotel_actions(driver)){return false;}

    return true;
    }

    private boolean hotel_actions(TestDriver driver) {

        if(!hotel_actions_audit(driver)){return false;}
        if(!hotel_actions_supplier(driver)){return false;}
        if(!hotel_actions_fixinfo(driver)){return false;}
        if(!service_notifications(driver)){return false;}


        return true;
    }

    private boolean service_notifications(TestDriver driver) {


        if(!Functions.auditData(driver,
                new String[]{"hotel_b_actions",getElements("hotel_b_actions")}, //actions button
                new String[]{"hotel_b_notification",getElements("hotel_b_notification")}, //audit button
                new String[]{"hotel_b_notification_b_ok",getElements("hotel_b_notification_b_ok")}, //audit_b_ok
                " on BOOSA1002 Hotel")){return false;} // where the operation occurs

        return true;
    }

    private boolean hotel_actions_fixinfo(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"hotel_b_fixinfo", getElements("hotel_b_fixinfo")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_fixinfo_i_telephone",getElements("hotel_b_fixinfo_i_telephone")},
                "hotel_fixinfo_phone", getData("hotel_fixinfo_phone")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_fixinfo_i_email",getElements("hotel_b_fixinfo_i_email")},
                "hotel_fixinfo_mail", getData("hotel_fixinfo_mail")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_fixinfo_i_comments",getElements("hotel_b_fixinfo_i_comments")},
                "hotel_fixinfo_comment", getData("hotel_fixinfo_comment")," on BOOSA1002 Hotel")){return false;}

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_b_fixinfo_b_ok", getElements("hotel_b_fixinfo_b_ok")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Hotel")){return false;}

        return true;
    }

    private boolean hotel_actions_supplier(TestDriver driver) {

        if(!Functions.auditData(driver,
                new String[]{"hotel_b_actions",getElements("hotel_b_actions")}, //actions button
                new String[]{"hotel_b_actions_b_supplierinfo",getElements("hotel_b_actions_b_supplierinfo")}, //audit button
                new String[]{"hotel_b_actions_b_supplierinfo_b_ok",getElements("hotel_b_actions_b_supplierinfo_b_ok")}, //audit_b_ok
                " on BOOSA1002 Hotel")){return false;} // where the operation occurs

        return true;
    }

    private boolean hotel_actions_audit(TestDriver driver) {

        if(!Functions.auditData(driver,
                new String[]{"hotel_b_actions",getElements("hotel_b_actions")}, //actions button
                new String[]{"hotel_b_actions_b_audit",getElements("hotel_b_actions_b_audit")}, //audit button
                new String[]{"audit_b_ok",getElements("hotel_b_actions_b_audit_b_ok")}, //audit_b_ok
                " on BOOSA1002 Hotel")){return false;} // where the operation occurs

        return true;
    }

    private boolean query_hotel(TestDriver driver) {

        if(!Functions.clickQbE(driver,
                new String[]{"hotel_b_query", getElements("hotel_b_query")},// query button
                new String[]{"hotel_b_query_i_startdate", getElements("hotel_b_query_i_startdate")},//any query input
                " on BOOSA1002 Hotel")){return false;} // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_startdate",getElements("hotel_b_query_i_startdate")},
                "hotel_startdate", getData("hotel_startdate")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_night",getElements("hotel_b_query_i_night")},
                "hotel_night", getData("hotel_night")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_hotel",getElements("hotel_b_query_i_hotel")},
                "hotel_hotel", getData("hotel_hotel")," on BOOSA1002 Hotel")){return false;}
        //contract
        //uni
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_room",getElements("hotel_b_query_i_room")},
                "hotel_room", getData("hotel_room")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_char",getElements("hotel_b_query_i_char")},
                "hotel_char", getData("hotel_char")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_board",getElements("hotel_b_query_i_board")},
                "hotel_board", getData("hotel_board")," on BOOSA1002 Hotel")){return false;}

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_b_query_i_board", getElements("hotel_b_query_i_board")}, //any query input
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //table result
                "where")){return false;}
        return true;
    }

    private boolean create_hotel(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_add", getElements("hotel_b_add")}, //element to click
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //element expected to appear
                " on BOOSA1002 Hotel")) {return false;}
        if (!Functions.insertInput(driver, new String[]{"hotel_e_result_i_startdate",getElements("hotel_e_result_i_startdate")},
                "hotel_startdate", getData("hotel_startdate")," on BOOSA1002 Hotel")){return false;}
        if (!Functions.insertInput(driver, new String[]{"hotel_e_result_i_night",getElements("hotel_e_result_i_night")},
                "hotel_night", getData("hotel_night")," on BOOSA1002 Hotel")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"hotel_e_result_lov_hotel", getElements("hotel_e_result_lov_hotel")}, //LoV button
                new String[]{"hotel_e_result_i_hotel", getElements("hotel_e_result_i_hotel")}, //external LoV input
                new String[]{"lovinput", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("hotel_name"), // value to search
                "hotel_name", //name of the data
                " on BOOSA1002 Hotel")){return false;}

        //contract
        //uni

        if (!Functions.createLovByValue(driver,
                new String[]{"hotel_e_result_lov_room", getElements("hotel_e_result_lov_room")}, //LoV button
                new String[]{"hotel_e_result_i_room", getElements("hotel_e_result_i_room")}, //external LoV input
                new String[]{"lovinput", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("room_name"), // value to search
                "room_name", //name of the data
                " on BOOSA1002 Hotel")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"hotel_e_result_lov_char", getElements("hotel_e_result_lov_char")}, //LoV button
                new String[]{"hotel_e_result_i_char", getElements("hotel_e_result_i_char")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "char_name", //name of the data
                " on BOOSA1002 Hotel")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"hotel_e_result_lov_board", getElements("hotel_e_result_lov_board")}, //LoV button
                new String[]{"hotel_e_result_i_board", getElements("hotel_e_result_i_board")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "board_name", //name of the data
                " on BOOSA1002 Hotel")){return false;}

        if (!Functions.simpleClick(driver,
                new String[]{"hotel_b_save", getElements("hotel_b_save")}, //element to click
                " on BOOSA1002 Hotel")) {return false;}
        return true;
    }

    private boolean header_consult(TestDriver driver) {

        if(!header_booking_cases(driver)){return false;}
        if(!header_cancelation(driver)){return false;}
        if(!header_headerhistoric(driver)){return false;}
        if(!header_headeroperationhistoric(driver)){return false;}
        if(!header_generalhistoric(driver)){return false;}
        if(!header_generalremarks(driver)){return false;} //Ha de ser posterior
        if(!header_audit(driver)){return false;}

        return true;
    }

    private boolean header_audit(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_audit", getElements("header_b_consult_b_audit")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_audit", getElements("header_b_consult_b_audit")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_audit_b_close", getElements("header_b_consult_b_audit_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_generalremarks(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_generalremarks", getElements("header_b_consult_b_generalremarks")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_generalremarks", getElements("header_b_consult_b_generalremarks")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_generalremarks_b_close", getElements("header_b_consult_b_generalremarks_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_generalhistoric(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_generalhistoric", getElements("header_b_consult_b_generalhistoric")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_generalhistoric", getElements("header_b_consult_b_generalhistoric")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_generalhistoric_b_close", getElements("header_b_consult_b_generalhistoric_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_headeroperationhistoric(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_headeroperationhistoric", getElements("header_b_consult_b_headeroperationhistoric")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric", getElements("header_b_consult_b_headeroperationhistoric")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_close", getElements("header_b_consult_b_headeroperationhistoric_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_headerhistoric(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_headerhistoric", getElements("header_b_consult_b_headerhistoric")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_headerhistoric", getElements("header_b_consult_b_headerhistoric")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_headerhistoric_b_close", getElements("header_b_consult_b_headerhistoric_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_cancelation(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_cancelation", getElements("header_b_consult_b_cancelation")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_cancelation", getElements("header_b_consult_b_cancelation")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        Functions.screenshot(driver);

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_cancelation_b_close", getElements("header_b_consult_b_cancelation_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        return true;
    }

    private boolean header_booking_cases(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_cases", getElements("header_b_consult_b_cases")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_cases", getElements("header_b_consult_b_cases")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        Functions.screenshot(driver);

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_cases_b_close", getElements("header_b_consult_b_cases_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        return true;
    }

    private boolean header_actions(TestDriver driver) {

        if(!header_to_booking(driver)){return false;}
        if(!header_paxes(driver)){return false;}
        if(!header_collectiondata(driver)){return false;}
        if(!header_hotelopiaclient(driver)){return false;}
        return true;
    }

    private boolean header_hotelopiaclient(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_hotelopiaclient", getElements("header_b_actions_b_hotelopiaclient")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_hotelopiaclient", getElements("header_b_actions_b_hotelopiaclient")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps", getElements("header_b_actions_b_hotelopiaclient_b_chargecps")}, //element to click
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps_b_close", getElements("header_b_actions_b_hotelopiaclient_b_chargecps_b_close")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        Functions.screenshot(driver);

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps_b_close", getElements("header_b_actions_b_hotelopiaclient_b_chargecps_b_close")}, //element to click
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps_b_close", getElements("header_b_actions_b_hotelopiaclient_b_chargecps_b_close")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_hotelopiaclient_b_close", getElements("header_b_actions_b_hotelopiaclient_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        return true;
    }

    private boolean header_collectiondata(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_collectiondata", getElements("header_b_actions_b_collectiondata")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_collectiondata", getElements("header_b_actions_b_collectiondata")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        Functions.screenshot(driver);

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_collectiondata_b_close", getElements("header_b_actions_b_collectiondata_b_close")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        return true;
    }

    private boolean header_paxes(TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_paxes", getElements("header_b_actions_b_paxes")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_paxes", getElements("header_b_actions_b_paxes")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        Functions.screenshot(driver);

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_paxes_b_colse", getElements("header_b_actions_b_paxes_b_colse")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}
            return true;
    }

    private boolean header_to_booking(TestDriver driver) {

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_tobooking", getElements("header_b_actions_b_tobooking")}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        if(!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_tobooking", getElements("header_b_actions_b_tobooking")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        Functions.screenshot(driver);

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_tobooking_b_accept", getElements("header_b_actions_b_tobooking_b_accept")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on BOOSA1002 Header")){return false;}

        return true;
    }

    private boolean create_remarks(TestDriver driver) {
        if(!bookingadmin_comments(driver)){return false;}
        if(!to_comments(driver)){return false;}
        if(!various_comments(driver)){return false;}

        return true;
    }

    private boolean various_comments(TestDriver driver) {



        return true;
    }

    private boolean to_comments(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_to_tab", getElements("remmarks_to_tab")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_to_i_commentsadd", getElements("remmarks_to_i_commentsadd")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        if (!Functions.insertInput(driver, new String[]{"remmarks_to_i_commentsadd",getElements("remmarks_to_i_commentsadd")},
                "comments_remmarks", getData("booking_remmarks")," on BOOSA1002 REMARKS")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_to_b_commentsadd", getElements("remmarks_to_b_commentsadd")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}

    return true;
    }

    private boolean bookingadmin_comments(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_tab_booking", getElements("remmarks_tab_booking")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_i_bookingadd", getElements("remmarks_booking_i_bookingadd")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        if (!Functions.insertInput(driver, new String[]{"remmarks_booking_i_bookingadd",getElements("remmarks_booking_i_bookingadd")},
                "booking_remmarks", getData("booking_remmarks")," on BOOSA1002 REMARKS")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_b_bookingadd", getElements("remmarks_booking_b_bookingadd")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}

        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_tab_booking", getElements("remmarks_tab_booking")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_i_adminadd", getElements("remmarks_booking_i_adminadd")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        if (!Functions.insertInput(driver, new String[]{"remmarks_booking_i_adminadd",getElements("remmarks_booking_i_adminadd")},
                "admin_remmarks", getData("booking_remmarks")," on BOOSA1002 REMARKS")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_b_adminadd", getElements("remmarks_booking_b_adminadd")}, //element to click
                " on BOOSA1002 REMARKS")){return false;}
        return true;
    }

    private boolean create_header(TestDriver driver) {
        driver.getReport().addHeader("CREATE NEW BOOKING", 2, true);
        Functions.zoomOut(driver);
        if (!Functions.simpleClick(driver,
                new String[]{"header_add", getElements("header_add")}, //element to click
                " on CREATION HEADER")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_interface",getElements("header_add_lov_interface")}, // b_lov
                new String[]{"header_add_i_interface", getElements("header_add_i_interface")}, // i_lov
                new String[]{"header_ad_i_interface",recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_interface"),
                "header_interface", //Data name
                " on HEADER CREATION")){ return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_to", getElements("header_add_lov_to")}, //LoV button
                new String[]{"header_add_i_to", getElements("header_add_i_to")}, //external LoV input
                new String[]{"header_add_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_to"), // value to search
                "header_to", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_branch", getElements("header_add_lov_branch")}, //LoV button
                new String[]{"header_add_i_branch", getElements("header_add_i_branch")}, //external LoV input
                new String[]{"header_add_lov_branch_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_branch"), // value to search
                "header_branch", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_user", getElements("header_add_lov_user")}, //LoV button
                new String[]{"header_add_i_user", getElements("header_add_i_user")}, //external LoV input
                new String[]{"header_add_lov_user_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_user"), // value to search
                "header_user", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_booking_type", getElements("header_add_lov_booking_type")}, //LoV button
                new String[]{"header_add_i_booking_type", getElements("header_add_i_booking_type")}, //external LoV input
                new String[]{"header_add_lov_booking_type_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_booking_type"), // value to search
                "header_booking_type", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_ag_ref",getElements("header_add_i_ag_ref")},
                "header_ag_ref", getData("header_ag_ref")," on HEADER CREATION")){return false;}
        if (!Functions.selectText(driver,
                new String[]{"header_add_i_despt",getElements("header_add_i_despt")},
                getData("header_despt"),
                "header_despt",
                " on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_adults",getElements("header_add_i_adults")},
                "header_adults", getData("header_adults")," on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_child",getElements("header_add_i_child")},
                "header_child", getData("header_child")," on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_baby",getElements("header_add_i_baby")},
                "header_baby", getData("header_baby")," on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_pax_mane",getElements("header_add_i_pax_mane")},
                "header_pax_name", getData("header_pax_name")," on HEADER CREATION")){return false;}
        if (!Functions.selectText(driver,
                new String[]{"header_add_i_transfers_valuation",getElements("header_add_i_transfers_valuation")},
                getData("header_valuation"),
                "header_valuation",
                " on HEADER CREATION")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"header_add_b_save", getElements("header_add_b_save")}, //element to click
                " on CREATION HEADER")){return false;}
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){

        }
        if (!Functions.getText(driver,new String[]{"header_edit_booking_tab", getElements("header_edit_booking_tab")}, // element path
                "booking_value", // key for data value (the name)
                " on BOOKING CREATED")){return false;}

        String mystring = getData("booking_value");
        System.out.println(mystring);
        String bookings_value [] = mystring.split("-");
        putData("booking",bookings_value[1]);
        String recep_value [] = bookings_value[0].split(" ");
        putData("receptive",recep_value[2]);

        return true;
    }

}