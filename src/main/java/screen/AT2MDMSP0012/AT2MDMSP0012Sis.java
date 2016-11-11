package screen.AT2MDMSP0012;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMSP0012Sis {
    protected AT2MDMSP0012Locators locators;
    protected AT2MDMSP0012Data data;

    public AT2MDMSP0012Sis() {
    }
    public AT2MDMSP0012Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0012Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0012Data getData() {
        return data;
    }
    public void setData (AT2MDMSP0012Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("SWS Reset Password");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        return false;
    }

    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLov(driver,
                new String[]{"search_lov_user", getElements("search_lov_user")}, // b_lov
                new String[]{"search_i_user", getElements("search_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "user", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_consult", getElements("search_b_consult")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"search_b_reset_password", getElements("search_b_reset_password")}, //element to click
                new String[]{"search_b_reset_password_ok", getElements("search_b_reset_password_ok")}, //element expected to appear
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset_password_ok", getElements("search_b_reset_password_ok")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if(!Functions.getValue(driver,
                new String[]{"search_e_company_code_result", getElements("search_e_company_code_result")}, // element path
                "company_code", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"search_e_office_result", getElements("search_e_office_result")}, // element path
                "office", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"search_e_description_result", getElements("search_e_description_result")}, // element path
                "description", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"search_e_hotel_result", getElements("search_e_hotel_result")}, // element path
                "hotel", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")},
                "company_code", getData("company_code"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)){
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_detach", getElements("MDM_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
}
