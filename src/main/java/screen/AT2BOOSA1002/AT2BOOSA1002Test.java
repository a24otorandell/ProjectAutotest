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
        //if(!hotel_actions_supplier(driver)){return false;}


        return true;
    }

    private boolean hotel_actions_audit(TestDriver driver) {

        if(!Functions.auditData(driver,
                new String[]{"x",getElements("x")}, //actions button
                new String[]{"y",getElements("y")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                "where")){return false;}

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