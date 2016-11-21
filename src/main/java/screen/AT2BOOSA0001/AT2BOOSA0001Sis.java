package screen.AT2BOOSA0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2BOOSA0001Sis {
    protected AT2BOOSA0001Locators locators;
    protected AT2BOOSA0001Data data;

    public AT2BOOSA0001Sis (){

    }

    public AT2BOOSA0001Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2BOOSA0001Locators locators){
        this.locators = locators;
    }
    public AT2BOOSA0001Data getData (){
        return data;
    }
    public void setData (AT2BOOSA0001Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Bookings");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Search Booking 2.0");
    }
    protected String getElements (String key){
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData (String key){
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){

        if(!Search_booking_simple_search(driver)){
            return false;
        }
        if(!Getrecords(driver)){
            return false;
        }
        if(!Search_booking_qbe(driver)){
            return false;
        }
        if(!Search_booking_advanced_search(driver)){return true;}
        return false;
    }

    //SEARCH BOOKING
    private boolean Search_booking_qbe (TestDriver driver){
        String where = " on HARD QBE";
        driver.getReport().addHeader("HARD QBE IN SEARCH BOOKING",3,false);



        if(!Functions.clickQbE(driver,
                new String[]{"query_b_qbe",getElements("query_b_qbe")},// query button
                new String[]{"query_i_booking_reference",getElements("query_i_booking_reference")},//any query input
                where)){
            return false;
        } // where the operation occurs

        if(!Functions.insertInput(driver,new String[]{"query_i_booking_reference",getElements("query_i_booking_reference")},
                "result_receptive",getData("result_receptive"),where)){
            return false;
        }
        Functions.insertInput(driver,
                new String[]{"query_i_atlas_company",getElements("query_i_atlas_company")},
                "result_atlas_company",
                getData("result_atlas_company"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_atlas_office",getElements("query_i_atlas_office")},
                "result_atlas_office",
                getData("result_atlas_office"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_booking_reference",getElements("query_i_booking_reference")},
                "result_booking_reference",
                getData("result_booking_reference"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_creation_date",getElements("query_i_creation_date")},
                "result_creation_date",
                getData("result_creation_date"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_client",getElements("query_i_client")},
                "result_client",
                getData("result_client"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_branch",getElements("query_i_branch")},
                "result_branch",
                getData("result_branch"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_crc",getElements("query_i_crc")},
                "result_crc",
                getData("result_crc"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_pax_name",getElements("query_i_pax_name")},
                "result_pax_name",
                getData("result_pax_name"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_adults",getElements("query_i_adults")},
                "result_adults",
                getData("result_adults"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_children",getElements("query_i_children")},
                "result_children",
                getData("result_children"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_babies",getElements("query_i_babies")},
                "result_babies",
                getData("result_babies"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_hotel_code",getElements("query_i_hotel_code")},
                "result_hotel_code",
                getData("result_hotel_code"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_first_hotel",getElements("query_i_first_hotel")},
                "result_first_hotel",
                getData("result_first_hotel"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_arrival_booking",getElements("query_i_arrival_booking")},
                "result_arrival_booking",
                getData("result_arrival_booking"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_departure_booking",getElements("query_i_departure_booking")},
                "result_departure_booking",
                getData("result_departure_booking"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_hotel_send",getElements("query_i_hotel_send")},
                "result_hotel_send",
                getData("result_hotel_send"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_client_reference",getElements("query_i_client_reference")},
                "result_client_reference",
                getData("result_client_reference"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_interface",getElements("query_i_interface")},
                "result_interface",
                getData("result_interface"),
                where);
        Functions.break_time(driver,25,500);
        Functions.insertInput(driver,
                new String[]{"query_i_booking_status",getElements("query_i_booking_status")},
                "result_booking_status",
                getData("result_booking_status"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_description",getElements("query_i_description")},
                "result_e_description",
                getData("result_e_description"),
                where);
        Functions.break_time(driver,25,500);
        Functions.insertInput(driver,
                new String[]{"query_i_canrec_status",getElements("query_i_canrec_status")},
                "result_canrec_status",
                getData("result_canrec_status"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_canrec_description",getElements("query_i_canrec_description")},
                "result_canrec_description",
                getData("result_canrec_description"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_invoiced_company",getElements("query_i_invoiced_company")},
                "result_invoiced_company",
                getData("result_invoiced_company"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_cost",getElements("query_i_cost")},
                "result_cost",
                getData("result_cost"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_sale",getElements("query_i_sale")},
                "result_sale",
                getData("result_sale"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_profit",getElements("query_i_profit")},
                "result_profit",
                getData("result_profit"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_profitability",getElements("query_i_profitability")},
                "result_profitability",
                getData("result_profitability"),
                where);
        Functions.break_time(driver,25,500);
        Functions.insertInput(driver,
                new String[]{"query_i_currency",getElements("query_i_currency")},
                "result_currency",
                getData("result_currency"),
                where);
     /*  Functions.insertInput(driver,
                new String[]{"query_i_bm",getElements("query_i_bm")},
                "result_bm",
                getData("result_bm"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_bco",getElements("query_i_bco")},
                "result_bco",
                getData("result_bco"),
                where);*/
        Functions.insertInput(driver,
                new String[]{"query_i_ticket_number",getElements("query_i_ticket_number")},
                "result_ticket_number",
                getData("result_ticket_number"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_room",getElements("query_i_room")},
                "result_room",
                getData("result_room"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_type_of_room",getElements("query_i_type_of_room")},
                "result_type_of_room",
                getData("result_type_of_room"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_cancellation_date",getElements("query_i_cancellation_date")},
                "result_cancellation_date",
                getData("result_cancellation_date"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_cancellation_fee_date",getElements("query_i_cancellation_fee_date")},
                "result_e_cancellation_fee_date",
                getData("result_e_cancellation_fee_date"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_auto_cancellation_date_time",getElements("query_i_auto_cancellation_date_time")},
                "result_auto_cancellation_date_time",
                getData("result_auto_cancellation_date_time"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_client_code",getElements("query_i_client_code")},
                "result_client_code",
                getData("result_client_code"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_customer",getElements("query_i_customer")},
                "result_customer",
                getData("result_customer"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_sap_client_code",getElements("query_i_sap_client_code")},
                "result_sap_client_code",
                getData("result_sap_client_code"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_destination",getElements("query_i_destination")},
                "result_destination",
                getData("result_destination"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_country_market",getElements("query_i_country_market")},
                "result_country_market",
                getData("result_country_market"),
                where);
    /*    Functions.insertInput(driver,
                new String[]{"query_i_paid",getElements("query_i_paid")},
                "result_paid",
                getData("result_paid"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_invoiced",getElements("query_i_invoiced")},
                "result_invoiced",
                getData("result_invoiced"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_multi_destination",getElements("query_i_multi_destination")},
                "result_multi_destination",
                getData("result_multi_destination"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_transfer",getElements("query_i_transfer")},
                "result_transfer",
                getData("result_transfer"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_retailer",getElements("query_i_retailer")},
                "result_retailer",
                getData("result_retailer"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_refundable",getElements("query_i_refundable")},
                "result_refundable",
                getData("result_refundable"),
                where);*/
        Functions.insertInput(driver,
                new String[]{"query_i_excluded_cancellation_process",getElements("query_i_excluded_cancellation_process")},
                "result_excluded_cancellation_process",
                getData("result_excluded_cancellation_process"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_error_message",getElements("query_i_error_message")},
                "query_i_error_message",
                getData("query_i_error_message"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_n_attempts",getElements("query_i_n_attempts")},
                "result_n_attempts",
                getData("result_n_attempts"),
                where);
        Functions.selectText(driver,
                new String[]{"query_i_cancellation_reason",getElements("query_i_cancellation_reason")},
                getData("result_cancellation_reason"),
                "result_cancellation_reason",
                " on QUERY ");
        Functions.insertInput(driver,
                new String[]{"query_i_booking_type",getElements("query_i_booking_type")},
                "result_booking_type",
                getData("result_booking_type"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_contract_code",getElements("query_i_contract_code")},
                "result_contract_code",
                getData("result_contract_code"),
                where);
        Functions.insertInput(driver,
                new String[]{"query_i_contract_name",getElements("query_i_contract_name")},
                "result_contract_name",
                getData("result_contract_name"),
                where);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"query_i_atlas_company",getElements("query_i_atlas_company")}, //any query input
                new String[]{"query_e_result",getElements("query_e_result")}, //table result
                where)){
            return false;
        } // where this operation occurs

        return true;
    }
    private boolean Getrecords (TestDriver driver){

        String where = " on GET RECORDS";
        driver.getReport().addHeader("GET RECORDS SEARCH IN SEARCH BOOKING",3,false);
        if(!Functions.zoomOut(driver,4)){
            return false;
        }
        Functions.getValue(driver,
                new String[]{"result_e_receptive",getElements("result_e_receptive")},
                "result_receptive",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_atlas_company",getElements("result_e_atlas_company")},
                "result_atlas_company",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_atlas_office",getElements("result_e_atlas_office")},
                "result_atlas_office",
                where);
        Functions.getText(driver,
                new String[]{"result_e_booking_reference",getElements("result_e_booking_reference")},
                "result_booking_reference",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_creation_date",getElements("result_e_creation_date")},
                "result_creation_date",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_client",getElements("result_e_client")},
                "result_client",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_branch",getElements("result_e_branch")},
                "result_branch",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_crc",getElements("result_e_crc")},
                "result_crc",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_pax_name",getElements("result_e_pax_name")},
                "result_pax_name",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_adults",getElements("result_e_adults")},
                "result_adults",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_children",getElements("result_e_children")},
                "result_children",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_babies",getElements("result_e_babies")},
                "result_babies",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_hotel_code",getElements("result_e_hotel_code")},
                "result_hotel_code",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_first_hotel",getElements("result_e_first_hotel")},
                "result_first_hotel",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_arrival_booking",getElements("result_e_arrival_booking")},
                "result_arrival_booking",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_departure_booking",getElements("result_e_departure_booking")},
                "result_departure_booking",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_hotel_send",getElements("result_e_hotel_send")},
                "result_hotel_send",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_client_reference",getElements("result_e_client_reference")},
                "result_client_reference",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_interface",getElements("result_e_interface")},
                "result_interface",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_booking_status",getElements("result_e_booking_status")},
                "result_booking_status",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_description",getElements("result_e_description")},
                "result_e_description",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_canrec_status",getElements("result_e_canrec_status")},
                "result_canrec_status",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_canrec_description",getElements("result_e_canrec_description")},
                "result_canrec_description",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_invoiced_company",getElements("result_e_invoiced_company")},
                "result_invoiced_company",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_cost",getElements("result_e_cost")},
                "result_cost",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_sale",getElements("result_e_sale")},
                "result_sale",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_profit",getElements("result_e_profit")},
                "result_profit",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_profitability",getElements("result_e_profitability")},
                "result_profitability",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_currency",getElements("result_e_currency")},
                "result_currency",
                where);
        Functions.getAttr(driver,
                new String[]{"result_e_bm",getElements("result_e_bm")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_bm", // key for data value (the name)
                where); // where this operation occurs
        Functions.getAttr(driver,
                new String[]{"result_e_bco",getElements("result_e_bco")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_bco", // key for data value (the name)
                where); // where this operation occurs
        Functions.getValue(driver,
                new String[]{"result_e_ticket_number",getElements("result_e_ticket_number")},
                "result_ticket_number",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_room",getElements("result_e_room")},
                "result_room",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_type_of_room",getElements("result_e_type_of_room")},
                "result_type_of_room",
                where);

        Functions.getValue(driver,
                new String[]{"result_e_cancellation_date",getElements("result_e_cancellation_date")},
                "result_cancellation_date",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_cancellation_fee_date",getElements("result_e_cancellation_fee_date")},
                "result_e_cancellation_fee_date",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_auto_cancellation_date_time",getElements("result_e_auto_cancellation_date_time")},
                "result_auto_cancellation_date_time",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_client_code",getElements("result_e_client_code")},
                "result_client_code",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_customer",getElements("result_e_customer")},
                "result_customer",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_sap_client_code",getElements("result_e_sap_client_code")},
                "result_sap_client_code",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_destination",getElements("result_e_destination")},
                "result_destination",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_country_market",getElements("result_e_country_market")},
                "result_country_market",
                where);
        Functions.getAttr(driver,
                new String[]{"result_e_paid",getElements("result_e_paid")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_paid", // key for data value (the name)
                where); // where this operation occurs
        Functions.getAttr(driver,
                new String[]{"result_e_invoiced",getElements("result_e_invoiced")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_invoiced", // key for data value (the name)
                where); // where
        Functions.getAttr(driver,
                new String[]{"result_e_multi_destination",getElements("result_e_multi_destination")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_multi_destination", // key for data value (the name)
                where); // where
        Functions.getAttr(driver,
                new String[]{"result_e_transfer",getElements("result_e_transfer")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_transfer", // key for data value (the name)
                where); // where
        Functions.getAttr(driver,
                new String[]{"result_e_retailer",getElements("result_e_retailer")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_retailer", // key for data value (the name)
                where); // where
        Functions.getAttr(driver,
                new String[]{"result_e_refundable",getElements("result_e_refundable")}, // element path
                "alt", // atribute to get data (class, value, id, style, etc...)
                "result_refundable", // key for data value (the name)
                where); // where
        Functions.getValue(driver,
                new String[]{"result_e_excluded_cancellation_process",getElements("result_e_excluded_cancellation_process")},
                "result_excluded_cancellation_process",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_error_message",getElements("result_e_error_message")},
                "result_error_message",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_n_attempts",getElements("result_e_n_attempts")},
                "result_n_attempts",
                where);
        Functions.getText(driver,
                new String[]{"result_e_cancellation_reason",getElements("result_e_cancellation_reason")},
                "result_cancellation_reason",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_booking_type",getElements("result_e_booking_type")},
                "result_booking_type",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_contract_code",getElements("result_e_contract_code")},
                "result_contract_code",
                where);
        Functions.getValue(driver,
                new String[]{"result_e_contract_name",getElements("result_e_contract_name")},
                "result_contract_name",
                where);
        return true;
    }
    private boolean Search_booking_simple_search (TestDriver driver){

        String where = " on SIMPLE SEARCH";
        driver.getReport().addHeader("SIMPLE SEARCH IN SEARCH BOOKING",3,false);
        Functions.break_time(driver,25,500);
        if(!Functions.createLovByValue(driver,
                new String[]{"query_lov_receptive",getElements("query_lov_receptive")}, //LoV button
                new String[]{"query_simple_i_receptive",getElements("query_simple_i_receptive")}, //external LoV input
                new String[]{"query_lov_i_receptive",getElements("query_lov_i_receptive")}, //internal LoV input
                "1", // value to search
                "receptive", //name of the data
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.insertInput(driver,new String[]{"query_simple_i_creation_date",getElements("query_simple_i_creation_date")},
                "create_date",DataGenerator.getRelativeDateToday("dd/MM/yyyy",0,DataGenerator.random(0,-3),0),where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"query_b_search",getElements("query_b_search")}, //search button
                new String[]{"query_e_result",getElements("query_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }
    private boolean Search_booking_advanced_search (TestDriver driver){
        String where = " on SUPER SEARCH";
        driver.getReport().addHeader("SUPER SEARCH IN SEARCH BOOKING",3,false);
        return true;
    }
}
