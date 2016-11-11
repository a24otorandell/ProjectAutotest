package screen.AT2MDMOR0024;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMOR0024Test {
    protected AT2MDMOR0024Locators locators;
    protected AT2MDMOR0024Data data;

    public AT2MDMOR0024Test() {
    }
    public AT2MDMOR0024Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0024Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0024Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0024Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Zones");
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_region_subregion_code", getElements("add_i_region_subregion_code")}, // element path
                "region_subregion_code", getData("region_subregion_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_region_subregion_name", getElements("add_i_region_subregion_name")}, // element path
                "region_subregion_name", getData("region_subregion_name"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_region_code", getElements("add_lov_region_code")}, // b_lov
                new String[]{"add_i_region_code", getElements("add_i_region_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "region_code", //Data name
                where)) {
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
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_region_subregion_code", getElements("search_lov_region_subregion_code")}, //LoV button
                new String[]{"search_i_region_subregion_code", getElements("search_i_region_subregion_code")}, //external LoV input
                new String[]{"search_lov_region_subregion_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("region_subregion_code"), // value to search
                "region_subregion_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_region_subregion_name", getElements("search_lov_region_subregion_name")}, //LoV button
                new String[]{"search_i_region_subregion_name", getElements("search_i_region_subregion_name")}, //external LoV input
                new String[]{"search_lov_region_subregion_name_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("region_subregion_name"), // value to search
                "region_subregion_name", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_region_code", getElements("search_lov_region_code")}, //LoV button
                new String[]{"search_i_region_code", getElements("search_i_region_code")}, //external LoV input
                new String[]{"search_lov_region_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("region_code"), // value to search
                "region_code", //name of the data
                where)) {
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
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_region_subregion_code", getElements("add_i_region_subregion_code")}, // element path
                "region_subregion_code", getData("region_subregion_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_region_subregion_name", getElements("add_i_region_subregion_name")}, // element path
                "region_subregion_name", getData("region_subregion_name_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_region_code", getElements("add_lov_region_code")}, // b_lov
                new String[]{"add_i_region_code", getElements("add_i_region_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "region_code", //Data name
                where)) {
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
                new String[]{"qbe_i_region_subregion_code", getElements("qbe_i_region_subregion_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_region_subregion_code", getElements("qbe_i_region_subregion_code")},
                "region_subregion_code", getData("region_subregion_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_region_subregion_name", getElements("qbe_i_region_subregion_name")},
                "region_subregion_name", getData("region_subregion_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_region_code", getElements("qbe_i_region_code")},
                "region_code", getData("region_code"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_region_subregion_code", getElements("qbe_i_region_subregion_code")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
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