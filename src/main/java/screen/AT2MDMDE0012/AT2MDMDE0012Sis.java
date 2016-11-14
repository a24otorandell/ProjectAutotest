package screen.AT2MDMDE0012;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMDE0012Sis {
    protected AT2MDMDE0012Locators locators;
    protected AT2MDMDE0012Data data;

    public AT2MDMDE0012Sis() {
    }
    public AT2MDMDE0012Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0012Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0012Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0012Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Destinations web contents");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_dm_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_dm_MDM(driver)) return false;
        if (!qbe_dm_MDM(driver)) return false;
        if (!others_actions_dm_MDM(driver)) return false;
        if (!interaction_record_ml_MDM(driver)) return false;
        if (!interaction_edit_ml_MDM(driver)) return false;
        if (!qbe_ml_MDM(driver)) return false;
        if (!others_actions_ml_MDM(driver)) return false;
        if (!delete_ml_MDM(driver)) return false;
        if (!delete_dm_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_dm_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dm_b_add", getElements("MDM_dm_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_country_code", getElements("add_lov_country_code")}, // b_lov
                new String[]{"add_i_country_code", getElements("add_i_country_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country_code", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_code", getElements("add_i_destination_code")}, // element path
                "destination_code", getData("destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_destination", getElements("add_i_destination")}, // element path
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_image", getElements("add_i_image")}, // element path
                "image", getData("image"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dm_b_save", getElements("add_dm_b_save")}, //element to click
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
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_country_code", getElements("search_lov_country_code")}, //LoV button
                new String[]{"search_i_country_code", getElements("search_i_country_code")}, //external LoV input
                new String[]{"search_lov_country_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("country_code"), // value to search
                "country_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_destination_code", getElements("search_i_destination_code")},
                "destination_code", getData("destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_destination", getElements("search_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_image", getElements("search_i_image")},
                "image", getData("image"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_dm_e_result", getElements("MDM_dm_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_dm_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_dm_b_edit", getElements("MDM_dm_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_destination", getElements("add_i_destination")}, // element path
                "destination", getData("destination_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_image", getElements("add_i_image")}, // element path
                "image", getData("image_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_dm_b_save", getElements("add_dm_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_dm_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dm_b_qbe", getElements("MDM_dm_b_qbe")},// query button
                new String[]{"qbe_dm_i_country_code", getElements("qbe_dm_i_country_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dm_i_country_code", getElements("qbe_dm_i_country_code")},
                "country_code", getData("country_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dm_i_destination_code", getElements("qbe_dm_i_destination_code")},
                "destination_code", getData("destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dm_i_destination", getElements("qbe_dm_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dm_i_image", getElements("qbe_dm_i_image")},
                "image", getData("image"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dm_i_country_code", getElements("qbe_dm_i_country_code")}, //search button
                new String[]{"MDM_dm_e_result", getElements("MDM_dm_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dm_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dm_b_actions", getElements("MDM_dm_b_actions")}, //actions button
                new String[]{"MDM_dm_b_actions_audit_data", getElements("MDM_dm_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dm_b_detach", getElements("MDM_dm_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ml_b_add", getElements("MDM_ml_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language",getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_description", getElements("add_i_destination_description")}, // element path
                "destination_description", getData("destination_description"), where)) {
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
    private boolean interaction_edit_ml_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_ml_e_result", getElements("MDM_ml_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ml_b_edit", getElements("MDM_ml_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language",getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_description", getElements("add_i_destination_description")}, // element path
                "destination_description", getData("destination_description_edit"), where)) {
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
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_language", getElements("qbe_ml_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_name", getElements("qbe_ml_i_name")},
                "name", getData("name"), where)) {
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
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_ml_b_actions", getElements("MDM_ml_b_actions")}, //actions button
                new String[]{"MDM_ml_b_actions_audit_data", getElements("MDM_ml_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
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
                new String[]{"MDM_ml_b_delete_ok", getElements("MDM_ml_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_dm_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_dm_b_delete", getElements("MDM_dm_b_delete")},
                new String[]{"MDM_dm_e_records", getElements("MDM_dm_e_records")},
                new String[]{"MDM_dm_b_delete_ok", getElements("MDM_dm_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
