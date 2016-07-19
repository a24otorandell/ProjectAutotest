package screen.AT2BOOSA1003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * @author ajvirgili  Created on 29/06/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement", ""})
public class AT2BOOSA1003Test {

    protected AT2BOOSA1003Locators locators;
    protected AT2BOOSA1003Data data;
    protected Exception exception;

    /**
     * Void constructor
     */
    public AT2BOOSA1003Test() {

    }

    /**
     * @return an AT2BOOSA1003Locators object
     */
    public AT2BOOSA1003Locators getLocators() {
        return locators;
    }

    /**
     * @param locators Gets the locators given in the ATBOOSA1003Locators, a Hashmap with locator_name[0], xpath[1]
     *                 and puts it in the locators variable
     */
    public void setLocators(AT2BOOSA1003Locators locators) {
        this.locators = locators;
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
        if (!searchBooking(driver)) {
            return false;
        }
        if (!estimationProcess(driver)) {
            return false;
        }
        if (!salesQbe(driver)) {
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
        }
        return false;
    }

    protected boolean searchBooking(TestDriver driver) {
        Functions.sleep(3000);
        if (!Functions.simpleClick(driver,
                new String[]{"general_lov_booking", getElements("general_lov_booking")},
                " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"general_lov_booking_i_locator", getElements("general_lov_booking_i_locator")},
                "booking_locator",
                getData("booking"),
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
        Functions.zoomOut(driver, 2);
        Functions.sleep(3000);
        if (!Functions.simpleClick(driver,
                new String[]{"general_b_generate_estimation", getElements("general_b_generate_estimation")},
                " on ESTIMATION")) {
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"general_original_booking_e_total", getElements("general_original_booking_e_total")},
                "booking_total",
                " on ESTIMATION")) {
            return false;
        }
        Functions.sleep(7000);
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
        if (!Functions.simpleClick(driver,
                new String[]{"general_b_save_changes_to_booking", getElements("general_b_save_changes_to_booking")},
                " on ESTIMATION")) {
            return false;
        }
        try {
            Functions.sleep(2500);
            if (driver.getDriver().findElement(By.xpath(getElements("general_b_save_changes_to_booking_e_info"))).isDisplayed()
                    || driver.getDriver().findElement(By.xpath(getElements("general_b_save_changes_to_booking_b_ok"))).isDisplayed()) {
                if (!Functions.getText(driver,
                        new String[]{"general_b_save_changes_to_booking_e_info", getElements("general_b_save_changes_to_booking_e_info")},
                        "info_text_estimation",
                        " on ESTIMATION")) {
                    return false;
                }
                if (!getData("info_text_estimation").equals("Your changes have been stored successfully.")) {
                    ErrorManager.process(driver, "Cannot complete the ~Save changes of estimation~");
                }
                Functions.simpleClick(driver,
                        new String[]{"general_b_save_changes_to_booking_b_ok", getElements("general_b_save_changes_to_booking_b_ok")},
                        " on ESTIMATION");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Functions.sleep(2500);
        Functions.zoomIn(driver);
        return true;
    }

    //// TODO: 18/07/2016
    protected boolean salesAdd(TestDriver driver) {
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
