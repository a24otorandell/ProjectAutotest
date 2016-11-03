package screen.AT2MDMDE0007;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMDE0007Sis {
    protected AT2MDMDE0007Locators locators;
    protected AT2MDMDE0007Data data;

    public AT2MDMDE0007Sis() {
    }
    public AT2MDMDE0007Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0007Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0007Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0007Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Interest Points");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Destination");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_ip_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_ip_MDM(driver)) return false;
        if (!qbe_ip_MDM(driver)) return false;
        if (!others_actions_ip_MDM(driver)) return false;
        if (!interaction_record_ml_MDM(driver)) return false;
        if (!interaction_edit_ml_MDM(driver)) return false;
        if (!qbe_ml_MDM(driver)) return false;
        if (!others_actions_ml_MDM(driver)) return false;
        if (!delete_ml_MDM(driver)) return false;
        if (!delete_ip_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_ip_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ip_b_add", getElements("MDM_ip_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination_code", getElements("add_lov_destination_code")}, // b_lov
                new String[]{"add_i_destination_code", getElements("add_i_destination_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_e_destination_description", getElements("add_e_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_e_country", getElements("add_e_country")}, // element path
                "country", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_area_code", getElements("add_lov_area_code")}, // b_lov
                new String[]{"add_i_area_code", getElements("add_i_area_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "area_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"add_e_area_name", getElements("add_e_area_name")}, // element path
                "area_name", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_longitude", getElements("add_i_tpi_longitude")}, // element path
                "tpi_longitude", getData("tpi_longitude"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_latitude", getElements("add_i_tpi_latitude")}, // element path
                "tpi_latitude", getData("tpi_latitude"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_telephone", getElements("add_i_tpi_telephone")}, // element path
                "tpi_telephone", getData("tpi_telephone"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_description", getElements("add_i_tpi_description")}, // element path
                "tpi_description", getData("tpi_description"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ip_b_save", getElements("add_ip_b_save")}, //element to click
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
                new String[]{"search_lov_destination_code", getElements("search_lov_destination_code")}, //LoV button
                new String[]{"search_i_destination_code", getElements("search_i_destination_code")}, //external LoV input
                new String[]{"search_lov_destination_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("destination_code"), // value to search
                "destination_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_destination_description", getElements("search_i_destination_description")}, // element path
                "destination_description", getData("destination_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_country", getElements("search_i_country")}, // element path
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_area_code", getElements("search_lov_area_code")}, //LoV button
                new String[]{"search_i_area_code", getElements("search_i_area_code")}, //external LoV input
                new String[]{"search_lov_area_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("area_code"), // value to search
                "area_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_area_name", getElements("search_i_area_name")}, // element path
                "area_name", getData("area_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tpi_longitude", getElements("search_i_tpi_longitude")}, // element path
                "tpi_longitude", getData("tpi_longitude"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tpi_latitude", getElements("search_i_tpi_latitude")}, // element path
                "tpi_latitude", getData("tpi_latitude"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tpi_telephone", getElements("search_i_tpi_telephone")}, // element path
                "tpi_telephone", getData("tpi_telephone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tpi_description", getElements("search_i_tpi_description")}, // element path
                "tpi_description", getData("tpi_description"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_ip_e_result", getElements("MDM_ip_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_ip_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ip_b_edit", getElements("MDM_ip_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination_code", getElements("add_lov_destination_code")}, // b_lov
                new String[]{"add_i_destination_code", getElements("add_i_destination_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_e_destination_description", getElements("add_e_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"add_e_country", getElements("add_e_country")}, // element path
                "country", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_area_code", getElements("add_lov_area_code")}, // b_lov
                new String[]{"add_i_area_code", getElements("add_i_area_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "area_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"add_e_area_name", getElements("add_e_area_name")}, // element path
                "area_name", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_longitude", getElements("add_i_tpi_longitude")}, // element path
                "tpi_longitude", getData("tpi_longitude_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_latitude", getElements("add_i_tpi_latitude")}, // element path
                "tpi_latitude", getData("tpi_latitude_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_telephone", getElements("add_i_tpi_telephone")}, // element path
                "tpi_telephone", getData("tpi_telephone_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tpi_description", getElements("add_i_tpi_description")}, // element path
                "tpi_description", getData("tpi_description_edit"),
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ip_b_save", getElements("add_ip_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_ip_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_ip_b_qbe", getElements("MDM_ip_b_qbe")},// query button
                new String[]{"qbe_ip_i_destination_code", getElements("qbe_ip_i_destination_code")},//any query input
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_destination_code", getElements("qbe_ip_i_destination_code")},
                "destination_code", getData("destination_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_destination_description", getElements("qbe_ip_i_destination_description")},
                "destination_description", getData("destination_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_country", getElements("qbe_ip_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_area_code", getElements("qbe_ip_i_area_code")},
                "area_code", getData("area_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_area_name", getElements("qbe_ip_i_area_name")},
                "area_name", getData("area_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_tpi_longitude", getElements("qbe_ip_i_tpi_longitude")},
                "tpi_longitude", getData("tpi_longitude"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_tpi_latitude", getElements("qbe_ip_i_tpi_latitude")},
                "tpi_latitude", getData("tpi_latitude"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ip_i_tpi_telephone", getElements("qbe_ip_i_tpi_telephone")},
                "tpi_telephone", getData("tpi_telephone"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_ip_i_destination_code", getElements("qbe_ip_i_destination_code")}, //search button
                new String[]{"MDM_ip_e_result", getElements("MDM_ip_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_ip_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_ip_b_actions", getElements("MDM_ip_b_actions")}, //actions button
                new String[]{"MDM_ip_b_actions_audit_data", getElements("MDM_ip_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_ip_b_detach", getElements("MDM_ip_b_detach")}, //detach button
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
        if (!Functions.insertInput(driver, new String[]{"add_i_language", getElements("add_i_language")}, // element path
                "language", getData("language"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description"),
                where)) {
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
        if (!Functions.insertInput(driver, new String[]{"add_i_language", getElements("add_i_language")}, // element path
                "language", getData("language_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name_edit"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "description", getData("description_edit"),
                where)) {
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
        if (!Functions.insertInput(driver, new String[]{"qbe_ml_i_description", getElements("qbe_ml_i_description")},
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
    private boolean delete_ip_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_ip_b_delete", getElements("MDM_ip_b_delete")},
                new String[]{"MDM_ip_e_records", getElements("MDM_ip_e_records")},
                new String[]{"MDM_ip_b_delete_ok", getElements("MDM_ip_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
