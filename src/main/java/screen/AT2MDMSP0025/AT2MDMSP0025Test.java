package screen.AT2MDMSP0025;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0025Test {
    protected AT2MDMSP0025Locators locators;
    protected AT2MDMSP0025Data data;

    public AT2MDMSP0025Test() {
    }
    public AT2MDMSP0025Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0025Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0025Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0025Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Markets");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Supplier");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_market_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_market_MDM(driver)) return false;
        if (!qbe_market_MDM(driver)) return false;
        if (!others_actions_market_MDM(driver)) return false;
        if (!interaction_record_marketc_MDM(driver)) return false;
        if (!qbe_marketc_MDM(driver)) return false;
        if (!others_actions_marketc_MDM(driver)) return false;
        if (!delete_marketc_MDM(driver)) return false;
        if (!delete_market_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_market_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_market_b_add", getElements("MDM_market_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_market_i_market", getElements("add_market_i_market")}, // element path
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_market_i_description", getElements("add_market_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_market_lov_country", getElements("add_market_lov_country")}, // b_lov
                new String[]{"add_market_i_country", getElements("add_market_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_market_b_save", getElements("add_market_b_save")}, //element to click
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
        if (!Functions.insertInput(driver, new String[]{"search_i_market", getElements("search_i_market")}, // element path
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_market_e_result", getElements("MDM_market_e_result")}, //result element
                where)) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_market_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_market_b_edit", getElements("MDM_market_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_market_i_description", getElements("add_market_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_market_b_save", getElements("add_market_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_market_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_market_b_qbe", getElements("MDM_market_b_qbe")},// query button
                new String[]{"qbe_market_i_market", getElements("qbe_market_i_market")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_market_i_market", getElements("qbe_market_i_market")}, // element path
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_market_i_description", getElements("qbe_market_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_market_i_market", getElements("qbe_market_i_market")}, //search button
                new String[]{"MDM_market_e_result", getElements("MDM_market_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_market_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_market_b_actions", getElements("MDM_market_b_actions")}, //actions button
                new String[]{"MDM_market_b_actions_audit_data", getElements("MDM_market_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_market_b_actions", getElements("MDM_market_b_actions")}, //element to click
                new String[]{"MDM_market_b_actions_copy_market", getElements("MDM_market_b_actions_copy_market")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_market_b_actions_copy_market", getElements("MDM_market_b_actions_copy_market")}, //element to click
                new String[]{"add_market_i_actions_copy_market", getElements("add_market_i_actions_copy_market")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_market_i_actions_copy_market", getElements("add_market_i_actions_copy_market")}, // element path
                "market", getData("market_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_market_i_actions_copy_description", getElements("add_market_i_actions_copy_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_market_b_actions_copy_save", getElements("add_market_b_actions_copy_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_market_b_detach", getElements("MDM_market_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_marketc_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_marketc_b_add", getElements("MDM_marketc_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_marketc_lov_country", getElements("add_marketc_lov_country")}, // b_lov
                new String[]{"add_marketc_i_country", getElements("add_marketc_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_marketc_e_country_description", getElements("add_marketc_e_country_description")}, // element path
                "country_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_marketc_b_save", getElements("add_marketc_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_marketc_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_marketc_b_qbe", getElements("MDM_marketc_b_qbe")},// query button
                new String[]{"qbe_marketc_i_country", getElements("qbe_marketc_i_country")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_marketc_i_country", getElements("qbe_marketc_i_country")}, // element path
                "country", getData("country"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_marketc_i_country_description", getElements("qbe_marketc_i_country_description")}, // element path
                "country_description", getData("country_description"),
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_marketc_i_country", getElements("qbe_marketc_i_country")}, //search button
                new String[]{"MDM_marketc_e_result", getElements("MDM_marketc_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_marketc_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_marketc_b_actions", getElements("MDM_marketc_b_actions")}, //actions button
                new String[]{"MDM_marketc_b_actions_audit_data", getElements("MDM_marketc_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_marketc_b_detach", getElements("MDM_marketc_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_marketc_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_marketc_b_delete", getElements("MDM_marketc_b_delete")},
                new String[]{"MDM_marketc_e_records", getElements("MDM_marketc_e_records")},
                new String[]{"MDM_marketc_b_delete_ok", getElements("MDM_marketc_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_market_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_market_b_delete", getElements("MDM_market_b_delete")},
                new String[]{"MDM_market_e_records", getElements("MDM_market_e_records")},
                new String[]{"MDM_market_b_delete_ok", getElements("MDM_market_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}