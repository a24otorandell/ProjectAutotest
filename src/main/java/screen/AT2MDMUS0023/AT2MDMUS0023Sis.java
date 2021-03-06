package screen.AT2MDMUS0023;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMUS0023Sis {
    protected AT2MDMUS0023Locators locators;
    protected AT2MDMUS0023Data data;

    public AT2MDMUS0023Sis() {
    }
    public AT2MDMUS0023Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0023Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0023Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0023Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Organization General Parameters");
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
        if (!delete_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_location", getElements("add_i_location")}, // element path
                "location", getData("location"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_network_topology", getElements("add_i_network_topology")}, // element path
                "network_topology", getData("network_topology"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_IP", getElements("add_i_IP")}, // element path
                "IP", getData("IP"), where)) {
            return false;
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
        if (!Functions.insertInput(driver, new String[]{"search_i_location", getElements("search_i_location")}, // element path
                "location", getData("location"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_network_topology", getElements("search_i_network_topology")}, // element path
                "network_topology", getData("network_topology"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_IP", getElements("search_i_IP")}, // element path
                "IP", getData("IP"), where)) {
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
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_location", getElements("add_i_location")}, // element path
                "location", getData("location_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_network_topology", getElements("add_i_network_topology")}, // element path
                "network_topology", getData("network_topology_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_IP", getElements("add_i_IP")}, // element path
                "IP", getData("IP_edit"), where)) {
            return false;
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
                new String[]{"qbe_i_location", getElements("qbe_i_location")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_location", getElements("qbe_i_location")}, // element path
                "location", getData("location"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_network_topology", getElements("qbe_i_network_topology")}, // element path
                "network_topology", getData("network_topology"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_IP", getElements("qbe_i_IP")}, // element path
                "IP", getData("IP"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_location", getElements("qbe_i_location")}, //search button
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
        return true;
    }
    private boolean delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_delete", getElements("MDM_b_delete")},
                new String[]{"MDM_e_records", getElements("MDM_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
