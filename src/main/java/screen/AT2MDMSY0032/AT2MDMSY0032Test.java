package screen.AT2MDMSY0032;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * Created by jmrios on 11/11/2016.
 */
public class AT2MDMSY0032Test {
    protected AT2MDMSY0032Locators locators;
    protected AT2MDMSY0032Data data;

    public AT2MDMSY0032Test() {
    }

    public AT2MDMSY0032Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0032Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0032Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0032Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Refresh Snapshots");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!data_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        return false;
    }

    private boolean data_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on DATA";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_user_result", getElements("search_e_user_result")}, // element path
                "user_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_name_result", getElements("search_e_name_result")}, // element path
                "name_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_table_result", getElements("search_e_table_result")}, // element path
                "table_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_last_refresh_result", getElements("search_e_last_refresh_result")}, // element path
                "last_refresh_result", // key for data value (the name)
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver,
                new String[]{"search_i_user", getElements("search_i_user")},
                "user_result", data.getData().get("user_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_name", getElements("search_i_name")},
                "name_result", data.getData().get("name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_table", getElements("search_i_table")},
                "table_result", data.getData().get("table_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_last_refresh", getElements("search_i_last_refresh")},
                "last_refresh_result", data.getData().get("last_refresh_result"), where)) {
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
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user", getData("user_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name", getData("name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_table", getElements("qbe_i_table")},
                "table", getData("table_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_last_refresh", getElements("qbe_i_last_refresh")},
                "last_refresh", getData("last_refresh_result"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_qbe_clear", getElements("MDM_b_qbe_clear")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.checkClick(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //element to click
                new String[]{"MDM_b_actions_all", getElements("MDM_b_actions_all")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_actions_all", getElements("MDM_b_actions_all")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.checkClick(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //element to click
                new String[]{"MDM_b_actions_no_one", getElements("MDM_b_actions_no_one")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_actions_no_one", getElements("MDM_b_actions_no_one")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.checkClick(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //element to click
                new String[]{"MDM_b_actions_all", getElements("MDM_b_actions_all")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_actions_all", getElements("MDM_b_actions_all")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.checkClick(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //element to click
                new String[]{"MDM_b_actions_refresh", getElements("MDM_b_actions_refresh")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_actions_refresh", getElements("MDM_b_actions_refresh")}, //element to click
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
        return true;
    }
}
