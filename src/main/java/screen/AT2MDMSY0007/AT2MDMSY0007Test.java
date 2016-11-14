package screen.AT2MDMSY0007;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMSY0007Test {
    protected AT2MDMSY0007Locators locators;
    protected AT2MDMSY0007Data data;

    public AT2MDMSY0007Test() {
    }
    public AT2MDMSY0007Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0007Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0007Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0007Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Domains");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {

        if (!interaction_record_dms_MDM(driver)) return false;
        if (!interaction_record_ml_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!qbe_dms_MDM(driver)) return false;
        if (!others_actions_dms_MDM(driver)) return false;
        if (!interaction_edit_ml_MDM(driver)) return false;
        if (!qbe_ml_MDM(driver)) return false;
        if (!others_actions_ml_MDM(driver)) return false;
        if (!delete_ml_MDM(driver)) return false;
        if (!delete_dms_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_dms_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dms_b_add", getElements("MDM_dms_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dms_i_domain_code", getElements("add_dms_i_domain_code")}, // element path
                "domain_code", getData("domain_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_dms_i_value", getElements("add_dms_i_value")}, // element path
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dms_b_save", getElements("add_dms_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ml_b_add", getElements("MDM_ml_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_ml_lov_language", getElements("add_ml_lov_language")}, // b_lov
                new String[]{"add_ml_i_language", getElements("add_ml_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ml_i_description", getElements("add_ml_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ml_b_save", getElements("add_ml_b_save")}, //element to click
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
        if (!Functions.insertInput(driver, new String[]{"search_i_domain_code", getElements("search_i_domain_code")}, // element path
                "domain_code", getData("domain_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_value", getElements("search_i_value")}, // element path
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_dms_e_result", getElements("MDM_dms_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean qbe_dms_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dms_b_qbe", getElements("MDM_dms_b_qbe")},// query button
                new String[]{"qbe_dms_i_domain_code", getElements("qbe_dms_i_domain_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dms_i_domain_code", getElements("qbe_dms_i_domain_code")}, // element path
                "domain_code", getData("domain_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dms_i_value", getElements("qbe_dms_i_value")}, // element path
                "value", getData("value"), where)) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dms_i_domain_code", getElements("qbe_dms_i_domain_code")}, //search button
                new String[]{"MDM_dms_e_result", getElements("MDM_dms_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dms_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dms_b_detach", getElements("MDM_dms_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_ml_e_result", getElements("MDM_ml_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ml_b_edit", getElements("MDM_ml_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_ml_lov_language", getElements("add_ml_lov_language")}, // b_lov
                new String[]{"add_ml_i_language", getElements("add_ml_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ml_i_description", getElements("add_ml_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ml_b_save", getElements("add_ml_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_ml_b_qbe", getElements("MDM_ml_b_qbe")},// query button
                new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")}, // element path
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_description", getElements("qbe_ml_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")}, //search button
                new String[]{"MDM_ml_e_result", getElements("MDM_ml_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_ml_b_detach", getElements("MDM_ml_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_ml_b_delete", getElements("MDM_ml_b_delete")},
                new String[]{"MDM_ml_e_records", getElements("MDM_ml_e_records")},
                new String[]{"MDM_ml_b_delete_ok", getElements("MDM_ml_b_delete_ok")},
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_dms_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dms_b_delete", getElements("MDM_dms_b_delete")},
                new String[]{"MDM_dms_e_records", getElements("MDM_dms_e_records")},
                new String[]{"MDM_dms_b_delete_ok", getElements("MDM_dms_b_delete_ok")},
                where)) {
            return false;
        }
        return true;
    }
}
