package screen.AT2BOOSA1003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import screen.AT2BOOSA0001.AT2BOOSA0001Locators;


/**
 * @author ajvirgili  Created on 29/06/2016
 *
 * Necesita cambiarse para que busque una reserva actual en boosa0001 y después vaya a la boosa1003 para generar la estimación
 */
@SuppressWarnings({"unused", "RedundantIfStatement", ""})
public class AT2BOOSA1003Test {

    protected AT2BOOSA1003Locators locators;
    protected AT2BOOSA0001Locators locatorsuno;
    protected AT2BOOSA1003Data data;
    protected Exception exception;


    /**
     * Constructor
     * @param enviroment String
     */
    public AT2BOOSA1003Test(String enviroment) {
        setData(new AT2BOOSA1003Data(enviroment));
        setLocators(new AT2BOOSA1003Locators(enviroment));
        setLocatorsBoosa(new AT2BOOSA0001Locators(enviroment));
    }

    /**
     * @return an AT2BOOSA1003Locators object
     */
    public AT2BOOSA1003Locators getLocators() {
        return locators;
    }

    public AT2BOOSA0001Locators getLocatorsUno() {
        return locatorsuno;
    }

    /**
     * @param locators Gets the locators given in the ATBOOSA1003Locators, a Hashmap with locator_name[0], xpath[1]
     *                 and puts it in the locators variable
     */
    public void setLocators(AT2BOOSA1003Locators locators) {
        this.locators = locators;
    }

    public void setLocatorsBoosa(AT2BOOSA0001Locators locators){
        this.locatorsuno = locators;
    }

    /**
     * @return an AT2BOOSA1003Data object
     */
    public AT2BOOSA1003Data getData() {
        return data;
    }

    /**
     * @param data ATBOOSA1003Data data, that has a Hashmap with data_name[0], xpath[1]
     *             and puts it in the data object of this class
     */
    public void setData(AT2BOOSA1003Data data) {
        this.data = data;
    }

    /**
     * This function calls the setScreenInfo to establish some data and then the goToScreen function
     *
     * @param driver Object that manages the core of the test
     * @see CommonProcedures#goToScreen(TestDriver)
     * @see #setScreenInfo(TestDriver)
     */
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    /**
     * This function sets the test details for the report created
     *
     * @param driver Object that manages the core of the test
     * @see TestDriver#getTestdetails()
     */
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Booking");
        driver.getTestdetails().setSubmenu("Sale");
        driver.getTestdetails().setScreen("Booking estimate 2.0");
    }

    /**
     * @param key String with the locator_name to get
     * @return String with an xpath
     */
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getElementsUno(String key) {
        return String.valueOf(this.locatorsuno.getElements().get(key));
    }

    /**
     * @param key String with the data_name to get
     * @return String with an xpath
     */
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    /**
     * In this function we call the funtions that we want to do in a full test
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean testCSED(TestDriver driver) {

        if (!Search_booking(driver)) {
            return false;
        }


   /*     if (!searchBooking(driver, false)) {
            return false;
        }
        if (!estimationProcess(driver)) {
            return false;
        }

        if (!salesQbe(driver)) {
            return false;
        }
        if (!salesEdit(driver)) {
            return false;
        }
        if (!salesDataHistory(driver)) {
            return false;
        }
        if (!salesDetach(driver)) {
            return false;
        }
        if (!distributionQBE(driver)) {
            return false;
        }
        if (!distributionDataHistory(driver)) {
            return false;
        }
        if (!distributionDetach(driver)) {
            return false;
        }
        if (!changeTab(driver, false)) {
            return false;
        }*/
        return false;
    }

    private boolean Search_booking(TestDriver driver) {
        String where = " on SEARCH BOOKING IN AT2BOOSA0001";
        driver.getReport().addHeader("SEARCH BOOKING IN AT2BOOSA0001",3,false);
        driver.getTestdetails().setTestname("AT2BOOSA0001");
        CommonProcedures.goToScreen(driver,1);

        //Busqueda Del receptivo nada mas entrar ne la pantalla
        Functions.break_time(driver,360,500);
        if(!Functions.createLovByValue(driver,
                new String[]{"query_lov_receptive",getElementsUno("query_lov_receptive")}, //LoV button
                new String[]{"query_simple_i_receptive",getElementsUno("query_simple_i_receptive")}, //external LoV input
                new String[]{"query_lov_i_receptive",getElementsUno("query_lov_i_receptive")}, //internal LoV input
                "1", // value to search
                "receptive", //name of the data
                where)){
            return false;
        }
        Functions.break_time(driver,360,500);
        if(!Functions.insertInput(driver,new String[]{"query_simple_i_creation_date",getElementsUno("query_simple_i_creation_date")},
                "create_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }

        //Busqueda avanzada para encontrar una reserva que no este cancelada y que tengo como mínimo un hotel
        Functions.break_time(driver,360,500);
        if(!Functions.checkClick(driver,
                new String[]{"search_b_advanced_search_2",getElementsUno("search_b_advanced_search_2")}, //element to click
                new String[]{"advanced_search_sl_canceled",getElementsUno("advanced_search_sl_canceled")}, //element expected to appear
                500,1000, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"advanced_search_sl_canceled",getElementsUno("advanced_search_sl_canceled")},
                "No", "No",  where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElementsUno("advanced_search_ch_only_hotel"),"only hotel",true,true, where)){return false;}//where

        Functions.break_time(driver,360,500);
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"query_b_search",getElementsUno("query_b_search")}, //search button
                new String[]{"query_e_result",getElementsUno("query_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
     if(!Functions.displayed(driver,getElementsUno("query_e_result")));
        {

            if(!Functions.insertInput(driver,new String[]{"query_simple_i_creation_date",getElementsUno("query_simple_i_creation_date")},
                    "hola",DataGenerator.getRelativeDateToday("dd/MM/yyyy",-1,DataGenerator.random(0,-1),0),where)){
                return false;
            }
        }

        Functions.getText(driver,
                new String[]{"result_e_booking_reference",getElementsUno("result_e_booking_reference")},
                "result_booking_reference",
                where);



        //Dado que no es posible saber si la booking esta bloqueada en ese momento se entra en la boosa1004 para desbloquear la reserva usada
        Functions.break_time(driver,360,600);
        if(!Functions.checkClick(driver,
                new String[]{"tb_b_actions",getElementsUno("tb_b_actions")}, //element to click
                new String[]{"go_to_actions_b_bloqued_bookings",getElementsUno("go_to_actions_b_bloqued_bookings")}, //element expected to appear
                360,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,360,600);
        if(!Functions.checkClick(driver,
                new String[]{"go_to_actions_b_bloqued_bookings",getElementsUno("go_to_actions_b_bloqued_bookings")}, //element to click
                new String[]{"go_to_bloqued_bookings_ch_select_all_gods",getElementsUno("go_to_bloqued_bookings_ch_select_all_gods")}, //element expected to appear
                360,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,360,600);

        if(Functions.displayed(driver,getElementsUno("go_to_bloqued_bookings_e_result"))){
            if(!Functions.checkboxValue(driver,
                    getElementsUno("go_to_bloqued_bookings_ch_select_all_gods"),"datanme",true,true,where)){
                return false;
            }//where
            if(!Functions.doDeleteNCheck(driver,
                    new String[]{"go_to_bloqued_bookings_b_delete",getElementsUno("go_to_bloqued_bookings_b_delete")},
                    new String[]{"go_to_bloqued_bookings_e_record",getElementsUno("go_to_bloqued_bookings_e_record")},
                    new String[]{"go_to_bloqued_bookings_b_delete_b_ok",getElementsUno("go_to_bloqued_bookings_b_delete_b_ok")},
                    where)){
                return false;
            }
        }
        driver.getTestdetails().setTestname("AT2BOOSA1003");
        CommonProcedures.goToScreen(driver,2);
        return true;
    }

    protected boolean searchBooking(TestDriver driver, boolean wch) {
        String bok = "booking_sales";
        if (wch) {
            bok = "booking_tranfers";
        }
        Functions.sleep(3000);
        if (!Functions.simpleClick(driver,
                new String[]{"general_lov_booking", getElements("general_lov_booking")},
                " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"general_lov_booking_i_receptive", getElements("general_lov_booking_i_receptive")},
                "booking_receptive",
                getData("booking_receptive"),
                " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"general_lov_booking_i_locator", getElements("general_lov_booking_i_locator")},
                "booking_locator",
                getData(bok),
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"general_lov_booking_b_search", getElements("general_lov_booking_b_search")},
                " on SEARCH")) {
            return false;
        }
        Functions.sleep(2000);
        return true;
    }

    protected boolean estimationProcess(TestDriver driver) {
        Functions.sleep(3000);
        if (!Functions.simpleClick(driver,
                new String[]{"general_b_generate_estimation", getElements("general_b_generate_estimation")},
                " on ESTIMATION")) {
            return false;
        }
        Functions.zoomOut(driver, 2);
        Functions.sleep(1000);
        if (!Functions.getText(driver,
                new String[]{"general_original_booking_e_total", getElements("general_original_booking_e_total")},
                "booking_total",
                " on ESTIMATION")) {
            return false;
        }
        Functions.sleep(6000);
        if (!Functions.getText(driver,
                new String[]{"general_booking_estimation_e_total", getElements("general_booking_estimation_e_total")},
                "estimation_total",
                " on ESTIMATION")) {
            return false;
        }
        if (getData("booking_total").contentEquals(getData("estimation_total"))) {
            driver.getReport().addContent("Correct Estimation", "b", "");
        } else {
            ErrorManager.process(driver, "Incorrect Estimation");
        }
        if (!Functions.getAttr(driver,
                new String[]{"general_b_save_changes_to_booking", getElements("general_b_save_changes_to_booking")},
                "class",
                "save_changes_class",
                " on ESTIMATION")) {
            return false;
        }//
        if (getData("save_changes_class").equals("x7j p_AFTextOnly")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"general_b_save_changes_to_booking", getElements("general_b_save_changes_to_booking")},
                    " on ESTIMATION")) {
                return false;
            }
            try {
                Functions.sleep(3500);
                if (!Functions.simpleClick(driver,
                        new String[]{"general_b_save_changes_to_booking_b_ok", getElements("general_b_save_changes_to_booking_b_ok")},
                        " on ESTIMATION")) {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Functions.sleep(1500);
        Functions.zoomIn(driver);
        return true;
    }

    //// TODO: 18/07/2016
    protected boolean salesAdd(TestDriver driver) {
        return true;
    }

    protected boolean salesDelete(TestDriver driver) {
        return true;
    }

    protected boolean salesEdit(TestDriver driver) {
        Functions.zoomOut(driver, 2);
        driver.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ARROW_DOWN));
        if (!Functions.simpleClick(driver,
                new String[]{"sales_hotel_e_record", getElements("sales_hotel_e_record")},
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_contract", getElements("sales_hotel_b_add_i_contract")},
                "sales_contract",
                getData("sales_contract"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_start_date", getElements("sales_hotel_b_add_i_start_date")},
                "sales_start_date",
                getData("sales_start_date"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_nights", getElements("sales_hotel_b_add_i_nights")},
                "sales_nights",
                getData("sales_nights"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_end_date", getElements("sales_hotel_b_add_i_end_date")},
                "sales_end_date",
                getData("sales_end_date"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_hotel", getElements("sales_hotel_b_add_i_hotel")},
                "sales_hotel",
                getData("sales_hotel"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_units", getElements("sales_hotel_b_add_i_units")},
                "sales_units",
                getData("sales_units"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_room", getElements("sales_hotel_b_add_i_room")},
                "sales_room",
                getData("sales_room"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_characteristic", getElements("sales_hotel_b_add_i_characteristic")},
                "sales_chracteristic",
                getData("sales_chracteristic"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_board", getElements("sales_hotel_b_add_i_board")},
                "sales_board",
                getData("sales_board"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_adult", getElements("sales_hotel_b_add_i_adult")},
                "sales_adult",
                getData("sales_adult"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_child", getElements("sales_hotel_b_add_i_child")},
                "sales_child",
                getData("sales_child"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_add_i_infant", getElements("sales_hotel_b_add_i_infant")},
                "sales_infant",
                getData("sales_infant"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
     /*   if (!Functions.selectText(driver,
                new String[]{"sales_hotel_b_add_i_si", getElements("sales_hotel_b_add_i_si")},
                "sales_si",
                getData("sales_si"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"sales_hotel_b_add_i_pi", getElements("sales_hotel_b_add_i_pi")},
                "sales_pi",
                getData("sales_pi"),
                " on SALES HOTEL EDIT")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"sales_hotel_b_add_i_transfer", getElements("sales_hotel_b_add_i_transfer")},
                "sales_transfer",
                getData("sales_transfer"),
                " on SALES HOTEL EDIT")) {
            return false;
        }*/

        return true;
    }

    protected boolean salesQbe(TestDriver driver) {
        Functions.zoomOut(driver, 2);
        driver.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ARROW_DOWN));
        if (!Functions.clickQbE(driver,
                new String[]{"sales_hotel_b_qbe", getElements("sales_hotel_b_qbe")},
                new String[]{"sales_hotel_b_qbe_i_start_date", getElements("sales_hotel_b_qbe_i_start_date")},
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_start_date", getElements("sales_hotel_b_qbe_i_start_date")},
                "sales_start_date",
                getData("sales_start_date"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_nights", getElements("sales_hotel_b_qbe_i_nights")},
                "sales_nights",
                getData("sales_nights"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_end_date", getElements("sales_hotel_b_qbe_i_end_date")},
                "sales_end_date",
                getData("sales_end_date"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_hotel", getElements("sales_hotel_b_qbe_i_hotel")},
                "sales_hotel",
                getData("sales_hotel"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_contract", getElements("sales_hotel_b_qbe_i_contract")},
                "sales_contract",
                getData("sales_contract"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_units", getElements("sales_hotel_b_qbe_i_units")},
                "sales_units",
                getData("sales_units"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_room", getElements("sales_hotel_b_qbe_i_room")},
                "sales_room",
                getData("sales_room"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_characteristic", getElements("sales_hotel_b_qbe_i_characteristic")},
                "sales_chracteristic",
                getData("sales_chracteristic"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_rate", getElements("sales_hotel_b_qbe_i_rate")},
                "sales_rate",
                getData("sales_rate"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_board", getElements("sales_hotel_b_qbe_i_board")},
                "sales_board",
                getData("sales_board"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_adult", getElements("sales_hotel_b_qbe_i_adult")},
                "sales_adult",
                getData("sales_adult"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_child", getElements("sales_hotel_b_qbe_i_child")},
                "sales_child",
                getData("sales_child"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_infant", getElements("sales_hotel_b_qbe_i_infant")},
                "sales_infant",
                getData("sales_infant"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
     /*   if (!Functions.selectText(driver,
                new String[]{"sales_hotel_b_qbe_i_si", getElements("sales_hotel_b_qbe_i_si")},
                "sales_si",
                getData("sales_si"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"sales_hotel_b_qbe_i_pi", getElements("sales_hotel_b_qbe_i_pi")},
                "sales_pi",
                getData("sales_pi"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }*/
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_date_send_hotel", getElements("sales_hotel_b_qbe_i_date_send_hotel")},
                "sales_date_send_hotel",
                getData("sales_date_send_hotel"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_cancellation_date", getElements("sales_hotel_b_qbe_i_cancellation_date")},
                "sales_cancellation_date",
                getData("sales_cancellation_date"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        /*if (!Functions.selectText(driver,
                new String[]{"sales_hotel_b_qbe_i_transfer", getElements("sales_hotel_b_qbe_i_transfer")},
                "sales_transfer",
                getData("sales_transfer"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }*/
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_product_office", getElements("sales_hotel_b_qbe_i_product_office")},
                "sales_product_office",
                getData("sales_product_office"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_b_qbe_i_product", getElements("sales_hotel_b_qbe_i_product")},
                "sales_product",
                getData("sales_product"),
                " on SALES HOTEL QBE SEARCH")) {
            return false;
        }
        driver.getDriver().findElement(By.tagName("html")).sendKeys(Keys.ENTER);
        Functions.zoomIn(driver);
        return true;
    }

    protected boolean salesDataHistory(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"sales_hotel_e_record", getElements("sales_hotel_e_record")},
                " on SALES HOTEL DATA HISTORY")) {
            return false;
        }
        Functions.sleep(2500);
        if (!Functions.auditData(driver,
                new String[]{"sales_hotel_b_actions", getElements("sales_hotel_b_actions")},
                new String[]{"sales_hotel_b_actions_b_data_history", getElements("sales_hotel_b_actions_b_data_history")},
                new String[]{"sales_hotel_b_actions_b_date_history_b_ok", recursiveXPaths.audit_b_ok},
                "on SALES HOTEL DATA HISTORY")) {
            return false;
        }
        return true;
    }

    protected boolean salesDetach(TestDriver driver) {
        if (!Functions.detachTable(driver,
                new String[]{"sales_hotel_b_detach_table", getElements("sales_hotel_b_detach_table")},
                false, " on SALES HOTEL DETACH TABLE")) {
            return false;
        }
        return true;
    }

    protected boolean distributionQBE(TestDriver driver) {
        Functions.zoomOut(driver, 2);
        driver.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ARROW_DOWN));
        if (!Functions.clickQbE(driver,
                new String[]{"sales_hotel_distribution_b_qbe", getElements("sales_hotel_distribution_b_qbe")},
                new String[]{"sales_hotel_distribution_b_qbe_i_order", getElements("sales_hotel_distribution_b_qbe_i_order")},
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_distribution_b_qbe_i_order", getElements("sales_hotel_distribution_b_qbe_i_order")},
                "distribution_order",
                getData("distribution_order"),
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_distribution_b_qbe_i_name", getElements("sales_hotel_distribution_b_qbe_i_name")},
                "distribution_name",
                getData("distribution_name"),
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_distribution_b_qbe_i_surname", getElements("sales_hotel_distribution_b_qbe_i_surname")},
                "distribution_surname",
                getData("distribution_surname"),
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_distribution_b_qbe_i_age", getElements("sales_hotel_distribution_b_qbe_i_age")},
                "distribution_age",
                getData("distribution_age"),
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }
        /*if (!Functions.selectText(driver,
                new String[]{"sales_hotel_distribution_b_qbe_i_type", getElements("sales_hotel_distribution_b_qbe_i_type")},
                "distribution_type",
                getData("distribution_type"),
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }*/
        if (!Functions.insertInput(driver,
                new String[]{"sales_hotel_distribution_b_qbe_i_room", getElements("sales_hotel_distribution_b_qbe_i_room")},
                "distribution_room",
                getData("distribution_room"),
                " on SALES HOTEL DISTRIBUTION QBE SEARCH")) {
            return false;
        }
        Functions.zoomIn(driver);
        return true;
    }

    protected boolean distributionDataHistory(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"sales_hotel_distribution_e_result", getElements("sales_hotel_distribution_e_result")},
                " on SALES HOTEL DISTRIBUTION DATA HISTORY")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"sales_hotel_distribution_b_actions", getElements("sales_hotel_distribution_b_actions")},
                new String[]{"sales_hotel_distribution_b_actions_b_data_history", getElements("sales_hotel_distribution_b_actions_b_data_history")},
                new String[]{"sales_hotel_distribution_b_actions_b_data_history_b_ok", getElements("sales_hotel_distribution_b_actions_b_data_history_b_ok")},
                "on SALES HOTEL DISTRIBUTION DATA HISTORY")) {
            return false;
        }
        return true;
    }

    protected boolean distributionDetach(TestDriver driver) {
        if (!Functions.detachTable(driver,
                new String[]{"sales_hotel_distribution_b_detach_table", getElements("sales_hotel_distribution_b_detach_table")},
                false, " on SALES HOTEL DISTRIBUTION DETACH TABLE")) {
            return false;
        }
        return true;
    }

    protected boolean transfersDetach(TestDriver driver) {
        if (!Functions.detachTable(driver,
                new String[]{"transfers_b_detach_table", getElements("transfers_b_detach_table")},
                false, " on TRANSFERS DETACH TABLE")) {
            return false;
        }
        return true;
    }

    protected boolean changeTab(TestDriver driver, boolean wch) {

      CommonProcedures.goToScreen(driver,2);


        Functions.zoomOut(driver);
        String tab = "general_e_transfers";
        if (wch) {
            tab = "general_e_sales_hotel";
        }
        if (!Functions.simpleClick(driver,
                new String[]{tab, getElements(tab)},
                " on CHANGE TAB")) {
            return false;
        }
        return true;
    }

}
