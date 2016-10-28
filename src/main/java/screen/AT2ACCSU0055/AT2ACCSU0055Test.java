package screen.AT2ACCSU0055;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 21/10/2016.
 */
public class AT2ACCSU0055Test {
    protected AT2ACCSU0055Locators locators;
    protected AT2ACCSU0055Data data;

    public AT2ACCSU0055Test() {
    }

    public AT2ACCSU0055Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0055Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0055Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0055Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Chains Brands");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Clients");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_chains_accommodation(driver)) return false;
        if (!search_chains_accommodation(driver)) return false;
        if (!interaction_edit_chains_accommodation(driver)) return false;
        if (!qbe_chains_accommodation(driver)) return false;
        if (!others_actions_chains_accommodation(driver)) return false;
        if (!interaction_record_brands_accommodation(driver)) return false;
        if (!search_brands_accommodation(driver)) return false;
        if (!interaction_edit_brands_accommodation(driver)) return false;
        if (!qbe_brands_accommodation(driver)) return false;
        if (!others_actions_brands_accommodation(driver)) return false;
        if (!delete_brands_accommodation(driver)) return false;
        if (!delete_chains_accommodation(driver)) return false;
        return false;
    }

    private boolean interaction_record_chains_accommodation(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_chains_add", getElements("accommodation_b_chains_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_crs_code", getElements("add_i_crs_code")}, // element path
                "crs_code", getData("crs_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_crs_name", getElements("add_i_crs_name")}, // element path
                "crs_name", getData("crs_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_crs_description", getElements("add_i_crs_description")}, // element path
                "crs_description", getData("crs_description"), where)) {
            return false;
        }
        String list_options[] = {"Active", "Inactive"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_ls_chains_registration_status_indicator", getElements("add_ls_chains_registration_status_indicator")},
                option, "chains_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_chains_save", getElements("add_b_chains_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_chains_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_crs_code", getElements("search_i_crs_code")}, // element path
                "crs_code", getData("crs_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_crs_name", getElements("search_i_crs_name")}, // element path
                "crs_name", getData("crs_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_crs_description", getElements("search_i_crs_description")}, // element path
                "crs_description", getData("crs_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_ls_chains_registration_status_indicator", getElements("search_ls_chains_registration_status_indicator")},
                getData("chains_registration_status_indicator"), "chains_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_chains_search", getElements("search_b_chains_search")}, //search button
                new String[]{"accommodation_e_chains_result", getElements("accommodation_e_chains_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_chains_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_chains_reset", getElements("search_b_chains_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_chains_edit", getElements("accommodation_b_chains_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_crs_code", getElements("add_i_crs_code")}, // element path
                "crs_code", getData("crs_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_crs_name", getElements("add_i_crs_name")}, // element path
                "crs_name", getData("crs_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_crs_description", getElements("add_i_crs_description")}, // element path
                "crs_description", getData("crs_description_edit"), where)) {
            return false;
        }
        String list_options[] = {"Active", "Inactive"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_ls_chains_registration_status_indicator", getElements("add_ls_chains_registration_status_indicator")},
                option, "chains_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_chains_save", getElements("add_b_chains_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_chains_accommodation(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_chains_qbe", getElements("accommodation_b_chains_qbe")},// query button
                new String[]{"qbe_i_crs_code", getElements("qbe_i_crs_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_crs_code", getElements("qbe_i_crs_code")}, // element path
                "crs_code", getData("crs_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_crs_name", getElements("qbe_i_crs_name")}, // element path
                "crs_name", getData("crs_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_crs_description", getElements("qbe_i_crs_description")}, // element path
                "crs_description", getData("crs_description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_ls_chains_registration_status_indicator", getElements("qbe_ls_chains_registration_status_indicator")},
                getData("chains_registration_status_indicator"), "chains_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_crs_code", getElements("qbe_i_crs_code")}, //search button
                new String[]{"accommodation_e_chains_result", getElements("accommodation_e_chains_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_chains_accommodation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"accommodation_b_chains_actions", getElements("accommodation_b_chains_actions")}, //actions button
                new String[]{"accommodation_b_chains_actions_audit_data", getElements("accommodation_b_chains_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"accommodation_b_chains_detach", getElements("accommodation_b_chains_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_brands_accommodation(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_brands_add", getElements("accommodation_b_brands_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_brand_code", getElements("add_i_brand_code")}, // element path
                "brand_code", getData("brand_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_brand_name", getElements("add_i_brand_name")}, // element path
                "brand_name", getData("brand_name"), where)) {
            return false;
        }
        String list_options[] = {"Active", "Inactive"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_ls_brands_registration_status_indicator", getElements("add_ls_brands_registration_status_indicator")},
                option, "brands_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_brands_save", getElements("add_b_brands_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_brands_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_brand_code", getElements("search_i_brand_code")}, // element path
                "brand_code", getData("brand_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_brand_name", getElements("search_i_brand_name")}, // element path
                "brand_name", getData("brand_name"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_ls_brand_registration_status_indicator", getElements("search_ls_brand_registration_status_indicator")},
                getData("brands_registration_status_indicator"), "brands_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_brands_search", getElements("search_b_brands_search")}, //search button
                new String[]{"accommodation_e_brands_result", getElements("accommodation_e_brands_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_brands_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_brands_reset", getElements("search_b_brands_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_brands_edit", getElements("accommodation_b_brands_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_brand_name", getElements("add_i_brand_name")}, // element path
                "brand_name", getData("brand_name_edit"), where)) {
            return false;
        }
        String list_options[] = {"Active", "Inactive"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_ls_brands_registration_status_indicator", getElements("add_ls_brands_registration_status_indicator")},
                option, "brand_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_brands_save", getElements("add_b_brands_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_brands_accommodation(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_brands_qbe", getElements("accommodation_b_brands_qbe")},// query button
                new String[]{"qbe_i_brand_name", getElements("qbe_i_brand_name")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_brand_code", getElements("qbe_i_brand_code")}, // element path
                "brand_code", getData("brand_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_brand_name", getElements("qbe_i_brand_name")}, // element path
                "brand_name", getData("brand_name"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_ls_brand_registration_status_indicator", getElements("qbe_ls_brand_registration_status_indicator")},
                getData("brand_registration_status_indicator"), "brand_registration_status_indicator", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_brand_name", getElements("qbe_i_brand_name")}, //search button
                new String[]{"accommodation_e_brands_result", getElements("accommodation_e_brands_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_brands_accommodation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"accommodation_b_brands_actions", getElements("accommodation_b_brands_actions")}, //actions button
                new String[]{"accommodation_b_brands_actions_audit_data", getElements("accommodation_b_brands_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"accommodation_b_brands_detach", getElements("accommodation_b_brands_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_brands_accommodation(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"accommodation_b_brands_delete", getElements("accommodation_b_brands_delete")},
                new String[]{"accommodation_e_brands_records", getElements("accommodation_e_brands_records")},
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_chains_accommodation(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
      /*  if (!Functions.doDeleteNCheck(driver,
                new String[]{"accommodation_b_chains_delete", getElements("accommodation_b_chains_delete")},
                new String[]{"accommodation_e_chains_records", getElements("accommodation_e_chains_records")},
                where)){
            return false;
        }*/
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"accommodation_b_chains_delete", getElements("accommodation_b_chains_delete")}, //button delete
                new String[]{"accommodation_e_chains_records", getElements("accommodation_e_chains_records")}, // result
                new String[]{"accommodation_b_chains_delete_ok", getElements("accommodation_b_chains_delete_ok")}, //delete button yes
                " where")) {
            return false;
        }
        return true;
    }
}