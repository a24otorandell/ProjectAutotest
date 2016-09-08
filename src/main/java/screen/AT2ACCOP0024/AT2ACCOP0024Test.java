package screen.AT2ACCOP0024;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

/**
 * @author ajvirgili  Created on 29/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement", ""})
public class AT2ACCOP0024Test {

    protected AT2ACCOP0024Locators locators;
    protected AT2ACCOP0024Data data;
    protected Exception exception;

    public AT2ACCOP0024Test(String enviroment) {
        setLocators(new AT2ACCOP0024Locators(enviroment));
        setData(new AT2ACCOP0024Data(enviroment));
    }

    /**
     * @return an AT2ACCOP0024Locators object
     */
    public AT2ACCOP0024Locators getLocators() {
        return locators;
    }

    /**
     * @param locators Gets the locators given in the ATACCOP0024Locators, a Hashmap with locator_name[0], xpath[1]
     *                 and puts it in the locators variable
     */
    public void setLocators(AT2ACCOP0024Locators locators) {
        this.locators = locators;
    }

    /**
     * @return an AT2ACCOP0024Data object
     */
    public AT2ACCOP0024Data getData() {
        return data;
    }

    /**
     * @param data ATACCOP0024Data data, that has a Hashmap with data_name[0], xpath[1]
     *             and puts it in the data object of this class
     */
    public void setData(AT2ACCOP0024Data data) {
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
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Financial Monitoring 2.0");
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
        if (!newAction(driver)) {
            return false;
        }
        if (!gettingData(driver)) {
            return false;
        }
        if (!search(driver)) {
            return false;
        }
        if (!detachTable(driver)) {
            return false;
        }
        if (!enabler(driver)) {
            return false;
        }
        if (!financial_report(driver)) {
            return false;
        }
        if (!qbe(driver)) {
            return false;
        }
        if (!exportAction(driver)) {
            return false;
        }
       /* if (!modifyAction(driver)) {
            return false;
        }*/
        if (!reprocessAction(driver)) {
            return false;
        }
        if (!delete(driver)) {
            return false;
        }
        return false;
    }

    /**
     * Gets the data of the first 3 rows after arrange the table by 'total amount' <br>
     * In this component of the Atlas2.0 proyect we can't randomize data so we get it directly from the table
     *
     * @param driver {@code Object} that manages the core of the test
     * @return {@code boolean} to control the process flow
     * @see Functions#sleep(int)
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#getText(TestDriver, String[], String, String)
     * @see core.HTMLReport.AutoReport#addContent(String)
     */
    protected boolean gettingData(TestDriver driver) {
        driver.getReport().addContent("Getting data to test:", "h4", "");
        Functions.zoomOut(driver, 1);
        Functions.break_time(driver, 4, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on Get data")) {
            return false;
        }
        Functions.break_time(driver, 4, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_qbe_total_amount", getElements("record_interaction_b_qbe_total_amount")},
                " on Get data")) {
            return false;
        }
        Functions.break_time(driver, 4, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_qbe_total_amount", getElements("record_interaction_b_qbe_total_amount")},
                " on Get data")) {
            return false;
        }
        Functions.break_time(driver, 4, 500);
        String[] fields = {"", "report", "file", "type", "financial_date_from", "financial_status",
                "merchant", "settelment", "currency", "modification_user", "modification_date_from",
                "batchID", "total_amount", "submerchant"};
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                //'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]
                //el primer num (tbody/tr[n]) es la fila y el ultimo (tr/td[n]) la columna
                Functions.getText(driver,
                        new String[]{fields[j], "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[" + i + "]/td[2]/div/table/tbody/tr/td[" + j + "]"},
                        fields[j] + "_" + Integer.toString(i), " on Getting Data");
            }
        }
        return true;
    }

    /**
     * This function tries to execute the EXPORT action that downloads a file, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#checkClick(TestDriver, String[], String[], String)
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#sleep(int)
     * @see Functions#screenshot(TestDriver, boolean)
     * @see Robot#keyPress(int)
     */
    protected boolean exportAction(TestDriver driver) {
        Functions.break_time(driver, 3, 500);
        driver.getReport().addContent("Action Export:", "h4", "");
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_export", getElements("record_interaction_b_export")},
                " on export")) {
            return false;
        }
        Functions.break_time(driver, 1, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_export", getElements("record_interaction_b_export")},
                " on export")) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
            if (!getData("info_text_export").equals("The report will be process in the next execution")) {
                ErrorManager.process(driver, "Cannot complete the ~Export~ Action");
            }
            Functions.simpleClick(driver,
                    new String[]{"alert_b_ok", getElements("alert_b_ok")},
                    " on export");
            if (!Functions.getText(driver,
                    new String[]{"alert_e_info", getElements("alert_e_info")},
                    "info_text_export",
                    " on export")) {
                return false;
            }
            return true;
        }
        try {// pulsamos enter para descargar el archivo con robot de java
            Robot r = new Robot();
            Functions.screenshot(driver, false);
            r.keyPress(KeyEvent.VK_ENTER);
            driver.getReport().addContent("Enter pressed on export");
            driver.getReport().addContent("File downloaded on export");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * This function tries to execute the MODIFY action that uploads a file, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#sleep(int)
     * @see Functions#checkClick(TestDriver, String[], String[], String)
     * @see Functions#fileUploader(TestDriver, String[], String[], String)
     * @see #modifyActionFileCreator(TestDriver)
     */
    protected boolean modifyAction(TestDriver driver) {
        Functions.break_time(driver, 2, 500);
        driver.getReport().addContent("Action Modify:", "h4", "");
        modifyActionFileCreator(driver);
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_modify", getElements("record_interaction_b_modify")},
                " on modify")) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_modify", getElements("record_interaction_b_modify")},
                " on modify")) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"record_interaction_b_modify_b_file", getElements("record_interaction_b_modify_b_file")},
                new String[]{"test", "C:\\ProjectAutotest\\src\\main\\resources\\" + getData("file_3")},
                " on modify")) {
            return false;
        }
        Functions.break_time(driver, 2, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_modify_b_save", getElements("record_interaction_b_modify_b_save")},
                " on modify")) {
            return false;
        }
        try {
            Functions.break_time(driver, 4, 500);
            if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
                ErrorManager.process(driver, "Cannot complete the ~Modify~ Action");
                Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on modify");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * For the MODIFY action we need a file to upload that has the same name as the previous, so we create one
     * Cheking it's previous exitence
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see File#createNewFile()
     */
    protected boolean modifyActionFileCreator(TestDriver driver) {
        driver.getReport().addContent("Crafting the file:", "h6", "");
        try {
            File actionFile = new File("C:\\ProjectAutotest\\src\\main\\resources\\" + getData("file_3"));
            if (actionFile.createNewFile()) {
                System.out.println("The file was crafted!");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return true;
    }

    /**
     * This function tries to execute the REPROCESS action, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#checkClick(TestDriver, String[], String[], String)
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#screenshot(TestDriver, boolean)
     */
    protected boolean reprocessAction(TestDriver driver) {
        driver.getReport().addContent("Action Reprocess:", "h4", "");
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_reprocess", getElements("record_interaction_b_reprocess")},
                " on reprocess")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_reprocess", getElements("record_interaction_b_reprocess")},
                " on reprocess")) {
            return false;
        }
        try {
            if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
                ErrorManager.process(driver, "Cannot complete the ~Reprocess~ Action");
                Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on reprocess");

                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"record_interaction_b_reprocess_b_ok", getElements("record_interaction_b_reprocess_b_ok")},
                    " on reprocess")) {
                return false;
            }
            Functions.break_time(driver, 2, 500);
            if (!Functions.getText(driver,
                    new String[]{"alert_e_info", getElements("alert_e_info")},
                    "info_text_reprocess",
                    " on new")) {
                return false;
            }
            if (!getData("info_text_reprocess").equals("No such file")) {
                Functions.screenshot(driver, false);
            }
            Functions.break_time(driver, 2, 500);
            if (!Functions.simpleClick(driver,
                    new String[]{"alert_b_ok", getElements("alert_b_ok")},
                    " on reprocess")) {
                return false;
            }
            if (driver.getDriver().findElement(By.xpath(getElements("record_interaction_b_reprocess_b_cancel"))).isDisplayed()) {
                ErrorManager.process(driver, "Cannot complete the ~Reprocess~ Action");
                Functions.simpleClick(driver,
                        new String[]{"record_interaction_b_reprocess_b_cancel", getElements("record_interaction_b_reprocess_b_cancel")},
                        " on reprocess");
            }
        } catch (Exception p) {
            p.printStackTrace();
        }
        return true;
    }

    /**
     * This function tries to execute the NEW action that uploads a file, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean Parameter used to control the process flow
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#selectText(TestDriver, String[], String, String, String)
     * @see Functions#fileUploader(TestDriver, String[], String[], String)
     * @see Functions#getText(TestDriver, String[], String, String)
     */
    protected boolean newAction(TestDriver driver) {
        driver.getReport().addContent("Action New:", "h4", "");
        Functions.break_time(driver, 1, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                " on new")) {
            return false;
        }
        Functions.break_time(driver, 1, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_new", getElements("record_interaction_b_new")},
                " on new")) {
            return false;
        }
        Functions.break_time(driver, 2, 500);
        if (!Functions.selectText(driver,
                new String[]{"record_interaction_b_new_i_type", getElements("record_interaction_b_new_i_type")},
                "IPS",
                "type",
                " on new")) {
            return false;
        }
        //ToDo -> learn to use URLs for the files
        if (!Functions.fileUploader(driver,
                new String[]{"record_interaction_b_new_b_file", getElements("record_interaction_b_new_b_file")},
                new String[]{"test", getData("file_new")},
                " on new")) {
            return false;
        }
        Functions.break_time(driver, 2, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"record_interaction_b_new_i_add", getElements("record_interaction_b_new_i_add")},
                recursiveXPaths.glass,
                " on new")) {
            return false;
        }
        try {
            Functions.break_time(driver, 2, 500);
            if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed()
                    || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
                if (!Functions.getText(driver,
                        new String[]{"alert_e_info", getElements("alert_e_info")},
                        "info_text_new",
                        " on new")) {
                    return false;
                }
                if (!getData("info_text_new").equals("The report will be process in the next execution")) {
                    ErrorManager.process(driver, "Cannot complete the ~New~ Action");
                }
                Functions.checkClickByAbsence(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        recursiveXPaths.glass,
                        " on new");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Searches doing inputs of the previous recolected data
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#insertInput(TestDriver, String[], String, String, String)
     * @see Functions#selectText(TestDriver, String[], String, String, String)
     * @see Functions#createLovByValue(TestDriver, String[], String[], String[], String, String, String)
     */
    protected boolean search(TestDriver driver) {
        String financialStatus;
        driver.getReport().addContent("Search:", "h4", "");
        try {
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_report", getElements("search_i_report")},
                    "report_2",
                    getData("report_2"),
                    " on SEARCH")) {
                return false;
            }
            if (getData("financial_status_2").equals("OK") || getData("financial_status_2").equals("PROCESS")) {
                financialStatus = "PROCESS-OK";
            } else {
                financialStatus = getData("financial_status_2");
            }
            if (!Functions.selectText(driver,
                    new String[]{"search_l_financial_status", getElements("search_l_financial_status")},
                    financialStatus,//financial status list not equal to results fields, so...
                    "financial_status_2",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_modification_user", getElements("search_i_modification_user")},
                    "modification_user_2",//usually empty
                    getData("modification_user_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_file", getElements("search_i_file")},
                    "file_2",
                    getData("file_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_merchant", getElements("search_i_merchant")},
                    "merchant_2",
                    getData("merchant_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_modification_date_from", getElements("search_i_modification_date_from")},
                    "modification_date_from_2",
                    getData("modification_date_from_2"),
                    " on SEARCH")) {
                return false;
            }
            Functions.break_time(driver, 4, 500);
            if (!getData("type_2").equals("ERROR")) {
                if (!Functions.selectText(driver,
                        new String[]{"search_l_type", getElements("search_l_type")},
                        getData("type_2"),
                        "type_2",
                        " on SEARCH")) {
                    return false;
                }
            }
            if (!getData("submerchant_2").equals(" ")) {
                if (!Functions.createLovByValue(driver,
                        new String[]{"search_lov_submerchant", getElements("search_lov_submerchant")},
                        new String[]{"search_i_submerchant", getElements("search_i_submerchant")},
                        new String[]{"search_lov_submerchant_i_submerchant", getElements("search_lov_submerchant_i_submerchant")},
                        getData("submerchant_2"),
                        "submerchant_2",
                        " on SEARCH")) {
                    return false;
                }
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"search_i_modification_date_to", getElements("search_i_modification_date_to")},
                    "modification_date_from_2",
                    getData("modification_date_from_2"),
                    " on SEARCH")) {
                return false;
            }*/
            Functions.break_time(driver, 4, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_financial_date_from", getElements("search_i_financial_date_from")},
                    "financial_date_from_2",
                    getData("financial_date_from_2"),
                    " on SEARCH")) {
                return false;
            }
            Functions.break_time(driver, 4, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_settelment", getElements("search_i_settelment")},
                    "settelment_2",
                    getData("settelment_2"),
                    " on SEARCH")) {
                return false;
            }
         /*   if (!Functions.selectText(driver,
                    new String[]{"search_l_reprocess", getElements("search_l_reprocess")},
                    getData("reprocess_2"),
                    "reprocess_2",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_financial_date_to", getElements("search_i_financial_date_to")},
                    "financial_date_from_2",
                    getData("financial_date_from_2"),
                    " on SEARCH")) {
                return false;
            }*/
            if (!getData("currency_2").equals(" ")) {
                if (!Functions.createLovByValue(driver,
                        new String[]{"search_lov_currency", getElements("search_lov_currency")},
                        new String[]{"search_i_currency", getElements("search_i_currency")},
                        new String[]{"search_lov_currency_i_currency", getElements("search_lov_currency_i_currency")},
                        getData("currency_2"),
                        "currency_2",
                        " on SEARCH")) {
                    return false;
                }
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"search_b_search", getElements("search_b_search")},
                    " on SEARCH")) {
                return false;
            }
            Functions.break_time(driver, 4, 500);
            if (!Functions.simpleClick(driver,
                    new String[]{"search_e_result", getElements("search_e_result")},
                    " on SEARCH")) {
                return false;
            }
        } catch (Exception search) {
            search.printStackTrace();
        }
        return true;
    }

    /**
     * Does a search via the QBE using the previous recolected data
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#zoomOut(TestDriver, int)
     * @see Functions#clickQbE(TestDriver, String[], String[], String)
     * @see Functions#insertInput(TestDriver, String[], String, String, String)
     * @see Functions#simpleClick(TestDriver, String[], String)
     */
    protected boolean qbe(TestDriver driver) {
        driver.getReport().addContent("QBE Search:", "h4", "");
        Functions.zoomOut(driver, 2);
        if (!Functions.clickQbE(driver,
                new String[]{"record_interaction_b_qbe", getElements("record_interaction_b_qbe")},
                new String[]{"record_interaction_b_qbe_i_report", getElements("record_interaction_b_qbe_i_report")},
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_report", getElements("record_interaction_b_qbe_i_report")},
                "report_3",
                getData("report_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_file", getElements("record_interaction_b_qbe_i_file")},
                "file_3",
                getData("file_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_type", getElements("record_interaction_b_qbe_i_type")},
                "type_3",
                getData("type_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_financial_date", getElements("record_interaction_b_qbe_i_financial_date")},
                "financial_date_from_3",
                getData("financial_date_from_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_financial_status", getElements("record_interaction_b_qbe_i_financial_status")},
                "financial_status_3",
                getData("financial_status_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_merchant", getElements("record_interaction_b_qbe_i_merchant")},
                "merchant_3",
                getData("merchant_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_settelment", getElements("record_interaction_b_qbe_i_settelment")},
                "settelment_3",
                getData("settelment_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_currency", getElements("record_interaction_b_qbe_i_currency")},
                "currency_3",
                getData("currency_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_modification_user", getElements("record_interaction_b_qbe_i_modification_user")},
                "modification_user_3",
                getData("modification_user_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_modification_date", getElements("record_interaction_b_qbe_i_modification_date")},
                "modification_date_from_3",
                getData("modification_date_from_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_batchID", getElements("record_interaction_b_qbe_i_batchID")},
                "batchID_3",
                getData("batchID_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_total_amount", getElements("record_interaction_b_qbe_i_total_amount")},
                "total_amount_3",
                getData("total_amount_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_submerchant", getElements("record_interaction_b_qbe_i_submerchant")},
                "submerchant_3",
                getData("submerchant_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on QBE")) {
            return false;
        }
        Functions.break_time(driver, 4, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_e_result", getElements("search_e_result")},
                " on QBE")) {
            return false;
        }
        return true;
    }

    /**
     * Calls the detachtable function
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#detachTable(TestDriver, String[], boolean, boolean, String)
     */
    protected boolean detachTable(TestDriver driver) {
        if (!Functions.detachTable(driver,
                new String[]{"record_interaction_b_detach_table", getElements("record_interaction_b_detach_table")},
                false, false, " on Detach table")
                ) {
            return false;
        }
        return true;
    }

    /**
     * Cleans the form and fills the table with results
     *
     * @param driver TestDriver that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean enabler(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")},
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on SEARCH")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean financial_report(TestDriver driver) {
        driver.getReport().addContent("Financial report:", "h3", "");
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_e_financial_status_window",
                        getElements("record_interaction_e_financial_status_window")},
                recursiveXPaths.glass,
                " on Financial report")) {
            return false;
        }
        if (!getData("financial_status_num_records").equals("0") && !getData("financial_status_num_records").equals("1")) {
            if (!financial_report_getdata(driver, false)) {
                return false;
            }
            if (!financial_report_qbe(driver)) {
                return false;
            }
        } else if (getData("financial_status_num_records").equals("1")) {
            if (!financial_report_getdata(driver, true)) {
                return false;
            }
            if (!financial_report_qbe(driver)) {
                return false;
            }
        }
        if (!Functions.detachTable(driver,
                new String[]{"record_interaction_e_financial_status_window_b_detach",
                        getElements("record_interaction_e_financial_status_window_b_detach")},
                true,
                true,
                " on Financial report - Detach table")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"record_interaction_e_financial_status_window_b_close",
                        getElements("record_interaction_e_financial_status_window_b_close")},
                recursiveXPaths.glass,
                " on Financial report")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean financial_report_qbe(TestDriver driver) {
        driver.getReport().addContent("Financial report - QBE:", "h5", "");
        if (!Functions.clickQbE(driver,
                new String[]{"record_interaction_e_financial_status_window_b_qbe",
                        getElements("record_interaction_e_financial_status_window_b_qbe")},
                new String[]{"record_interaction_e_financial_status_window_b_qbe_i_error_code",
                        getElements("record_interaction_e_financial_status_window_b_qbe_i_error_code")},
                " on Financial report - QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_e_financial_status_window_b_qbe_i_error_code",
                        getElements("record_interaction_e_financial_status_window_b_qbe_i_error_code")},
                "error_code",
                getData("error_code"),
                " on Financial report - QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_e_financial_status_window_b_qbe_i_error_description",
                        getElements("record_interaction_e_financial_status_window_b_qbe_i_error_description")},
                "error_desc",
                getData("error_desc"),
                " on Financial report - QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"record_interaction_e_financial_status_window_b_qbe_i_error_code",
                        getElements("record_interaction_e_financial_status_window_b_qbe_i_error_code")},
                new String[]{"record_interaction_e_financial_status_window_e_result",
                        getElements("record_interaction_e_financial_status_window_e_result")},
                " on Financial report - QBE")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean financial_report_getdata(TestDriver driver, boolean one) {
        String un = "";
        if (one) {
            un = "[1]";
        }
        Functions.break_time(driver, 4, 500);
        driver.getReport().addContent("Financial report - Getting data:", "h5", "");
        String[] fields = {"error_code", "error_desc"};
        for (int j = 1; j < 3; j++) {
            // pc2:t3::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1] Xpath cuando solo hay un registro
            // pc2:t3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1] Xpath cuando hay varios
            //el ultimo (tr/td[n]) es la columna
            Functions.getText(driver,
                    new String[]{fields[j - 1],
                            "//*[contains(@id, 'pc2:t3::db')]/table/tbody/tr" + un + "/td[2]/div/table/tbody/tr/td[" + j + "]"},
                    fields[j - 1]
                    , " on Financial report - Getting Data");
        }
        return true;
    }

    /**
     * @param driver TestDriver that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean delete(TestDriver driver) {
        driver.getReport().addHeader("RECORD DELETE", 3, true);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"record_interaction_b_delete", getElements("record_interaction_b_delete")},
                new String[]{"search_e_result", getElements("search_e_result")},
                new String[]{"record_interaction_b_delete_b_ok", recursiveXPaths.delete_b_yes},
                " on DELETE ")) {
            return false;
        }
        return true;
    }
}
