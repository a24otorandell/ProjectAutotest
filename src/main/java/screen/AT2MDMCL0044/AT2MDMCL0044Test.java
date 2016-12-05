package screen.AT2MDMCL0044;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2MDMCL0044.AT2MDMCL0044Data;
import screen.AT2MDMCL0044.AT2MDMCL0044Locators;

import java.util.Random;

/**
 * Created by jmrios on 21/11/2016.
 */
public class AT2MDMCL0044Test {
    protected AT2MDMCL0044Locators locators;
    protected AT2MDMCL0044Data data;

    public AT2MDMCL0044Test() {
    }
    public AT2MDMCL0044Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0044Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0044Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0044Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Client Notifications");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //CLIENT NOTIFICATIONS
        if (!interaction_record_cn_MDM(driver)) return false;
        if (!search_cn_MDM(driver)) return false;
        if (!interaction_edit_cn_MDM(driver)) return false;
        if (!qbe_cn_MDM(driver)) return false;
        if (!others_actions_cn_MDM(driver)) return false;
        //CONFIGURATION DETAIL
        if (!interaction_record_cd_MDM(driver)) return false;
        if (!qbe_cd_MDM(driver)) return false;
        if (!interaction_edit_cd_MDM(driver)) return false;
        if (!qbe_cd_MDM(driver)) return false;
        if (!others_actions_cd_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_tab_change(driver)) return false;
        //NOTIFICATION TYPE
        if (!interaction_record_nt_MDM(driver)) return false;
        if (!search_nt_MDM(driver)) return false;
        if (!interaction_edit_nt_MDM(driver)) return false;
        if (!qbe_nt_MDM(driver)) return false;
        if (!others_actions_nt_MDM(driver)) return false;
        //CHANGE TAB
        if (!second_tab_change(driver)) return false;
        //NOTIFICATION PROPERTIES
        if (!interaction_record_np_MDM(driver)) return false;
        if (!search_np_MDM(driver)) return false;
        if (!interaction_edit_np_MDM(driver)) return false;
        if (!qbe_np_MDM(driver)) return false;
        if (!others_actions_np_MDM(driver)) return false;
        if (!delete_np_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_tab_change(driver)) return false;
        //NOTIFICATION TYPE
        if (!delete_nt_MDM(driver)) return false;
        //CHANGE TAB
        if (!third_tab_change(driver)) return false;
        //CONFIGURATION DETAIL
        if (!delete_cd_MDM(driver)) return false;
        return false;
    }

    //CREATION
    private boolean interaction_record_cn_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cn_b_add", getElements("MDM_cn_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cn_lov_client", getElements("add_cn_lov_client")}, // b_lov
                new String[]{"add_cn_i_client", getElements("add_cn_i_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cn_lov_branch", getElements("add_cn_lov_branch")}, // b_lov
                new String[]{"add_cn_i_branch", getElements("add_cn_i_branch")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_cn_lov_type", getElements("add_cn_lov_type")}, // b_lov
                new String[]{"add_cn_i_type", getElements("add_cn_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type", //Data name
                where)){
            return false;
        }
        String list_options[] = {"Daily", "Monthly", "Real Time", "Weekly"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_cn_sl_frequency", getElements("add_cn_sl_frequency")},
                list_options, "frequency",
                where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cn_cb_active"),
                    "cn_active", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_cn_cb_active"),
                    "cn_active", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cn_b_save", getElements("add_cn_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cd_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cd_b_add", getElements("MDM_cd_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cd_lov_property", getElements("add_cd_lov_property")}, // b_lov
                new String[]{"add_cd_i_property", getElements("add_cd_i_property")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "property", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cd_i_value", getElements("add_cd_i_value")}, // element path
                "value", getData("value"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cd_b_save", getElements("add_cd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_nt_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_nt_b_add", getElements("MDM_nt_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_nt_i_type", getElements("add_nt_i_type")}, // element path
                "nt_type", getData("nt_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_nt_i_description", getElements("add_nt_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean) {
            randomBoolean = "Yes";
            if (!Functions.checkboxValue(driver, getElements("add_nt_cb_active"),
                    "nt_active", true, true,
                    where)) {
                return false;
            }
        } else {
            randomBoolean = "No";
            if (!Functions.checkboxValue(driver, getElements("add_nt_cb_active"),
                    "nt_active", false, true,
                    where)) {
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_nt_b_save", getElements("add_nt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_np_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_np_b_add", getElements("MDM_np_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_np_i_property", getElements("add_np_i_property")}, // element path
                "np_property", getData("np_property"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_np_i_description", getElements("add_np_i_description")}, // element path
                "np_property_description", getData("np_property_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_np_i_default", getElements("add_np_i_default")}, // element path
                "default", getData("default"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_np_b_save", getElements("add_np_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    //EDITION
    private boolean interaction_edit_cn_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cn_b_edit", getElements("MDM_cn_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cn_lov_client", getElements("add_cn_lov_client")}, // b_lov
                new String[]{"add_cn_i_client", getElements("add_cn_i_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cn_lov_branch", getElements("add_cn_lov_branch")}, // b_lov
                new String[]{"add_cn_i_branch", getElements("add_cn_i_branch")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cn_lov_type", getElements("add_cn_lov_type")}, // b_lov
                new String[]{"add_cn_i_type", getElements("add_cn_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type", //Data name
                where)){
            return false;
        }
        String list_options[] = {"Daily", "Monthly", "Real Time", "Weekly"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_cn_sl_frequency", getElements("add_cn_sl_frequency")},
                list_options, "frequency",
                where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_cn_cb_active"),
                    "cn_active", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_cn_cb_active"),
                    "cn_active", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cn_b_save", getElements("add_cn_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cd_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cd_e_result", getElements("MDM_cd_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cd_b_edit", getElements("MDM_cd_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cd_lov_property", getElements("add_cd_lov_property")}, // b_lov
                new String[]{"add_cd_i_property", getElements("add_cd_i_property")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "property", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cd_i_value", getElements("add_cd_i_value")}, // element path
                "value", getData("value_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cd_b_save", getElements("add_cd_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_nt_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_nt_e_result", getElements("MDM_nt_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_nt_b_edit", getElements("MDM_nt_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_nt_i_type", getElements("add_nt_i_type")}, // element path
                "nt_type", getData("nt_type_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_nt_i_description", getElements("add_nt_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_nt_cb_active"),
                    "nt_active", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_nt_cb_active"),
                    "nt_active", false, true,
                    where)){
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_nt_b_save", getElements("add_nt_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_np_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_np_e_result", getElements("MDM_np_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_np_b_edit", getElements("MDM_np_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_np_i_property", getElements("add_np_i_property")}, // element path
                "np_property", getData("np_property_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_np_i_description", getElements("add_np_i_description")}, // element path
                "np_property_description", getData("np_property_description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_np_i_default", getElements("add_np_i_default")}, // element path
                "default", getData("default_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_np_b_save", getElements("add_np_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    //DELETE
    private boolean delete_cd_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cd_e_result", getElements("MDM_cd_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_cd_b_delete", getElements("MDM_cd_b_delete")},
                new String[]{"MDM_cd_e_records", getElements("MDM_cd_e_records")},
                new String[]{"MDM_cd_b_delete_ok", getElements("MDM_cd_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_nt_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_nt_e_result", getElements("MDM_nt_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_nt_b_delete", getElements("MDM_nt_b_delete")},
                new String[]{"MDM_nt_e_records", getElements("MDM_nt_e_records")},
                new String[]{"MDM_nt_b_delete_ok", getElements("MDM_nt_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_np_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_np_b_delete", getElements("MDM_np_b_delete")},
                new String[]{"MDM_np_e_records", getElements("MDM_np_e_records")},
                new String[]{"MDM_np_b_delete_ok", getElements("MDM_np_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //SEARCH
    private boolean search_cn_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 90, 500);
        if (!Functions.insertInput(driver, new String[]{"search_cn_i_client", getElements("search_cn_i_client")}, // element path
                "client", getData("client"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_cn_i_branch", getElements("search_cn_i_branch")}, // element path
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_cn_i_type", getElements("search_cn_i_type")}, // element path
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_cn_b_search", getElements("search_cn_b_search")}, //search button
                new String[]{"MDM_cn_e_result", getElements("MDM_cn_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_nt_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 90, 500);
        if (!Functions.insertInput(driver, new String[]{"search_nt_i_type", getElements("search_nt_i_type")}, // element path
                "nt_type", getData("nt_type"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_nt_b_search", getElements("search_nt_b_search")}, //search button
                new String[]{"MDM_nt_e_result", getElements("MDM_nt_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_np_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 90, 500);
        if (!Functions.insertInput(driver, new String[]{"search_np_i_property", getElements("search_np_i_property")}, // element path
                "np_property", getData("np_property"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_np_b_search", getElements("search_np_b_search")}, //search button
                new String[]{"MDM_np_e_result", getElements("MDM_np_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    //QBE
    private boolean qbe_cn_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_cn_b_reset", getElements("search_cn_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cn_b_qbe", getElements("MDM_cn_b_qbe")},// query button
                new String[]{"qbe_cn_i_client", getElements("qbe_cn_i_client")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cn_i_client", getElements("qbe_cn_i_client")},
                "client", getData("client"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cn_i_branch", getElements("qbe_cn_i_branch")},
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cn_i_type", getElements("qbe_cn_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_cn_sl_frequency",getElements("qbe_cn_sl_frequency")},
                getData("frequency"), "frequency",
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_cn_sl_active",getElements("qbe_cn_sl_active")},
                getData("cn_active"), "cn_active",
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cn_i_client", getElements("qbe_cn_i_client")}, //search button
                new String[]{"MDM_cn_e_result", getElements("MDM_cn_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cd_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cd_b_qbe", getElements("MDM_cd_b_qbe")},// query button
                new String[]{"qbe_cd_i_property", getElements("qbe_cd_i_property")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cd_i_property", getElements("qbe_cd_i_property")},
                "property", getData("property"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cd_i_value", getElements("qbe_cd_i_value")},
                "value", getData("value"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cd_i_property", getElements("qbe_cd_i_property")}, //search button
                new String[]{"MDM_cd_e_result", getElements("MDM_cd_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_nt_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_nt_b_reset", getElements("search_nt_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);;
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_nt_b_qbe", getElements("MDM_nt_b_qbe")},// query button
                new String[]{"qbe_nt_i_type", getElements("qbe_nt_i_type")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_nt_i_type", getElements("qbe_nt_i_type")},
                "nt_type", getData("nt_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_nt_i_description", getElements("qbe_nt_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_nt_sl_active", getElements("qbe_nt_sl_active")},
                getData("nt_active"), "nt_active", where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_nt_i_type", getElements("qbe_nt_i_type")}, //search button
                new String[]{"MDM_nt_e_result", getElements("MDM_nt_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_np_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_np_b_reset", getElements("search_np_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);;
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_np_b_qbe", getElements("MDM_np_b_qbe")},// query button
                new String[]{"qbe_np_i_property", getElements("qbe_np_i_property")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_np_i_property", getElements("qbe_np_i_property")},
                "np_property", getData("np_property"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_np_i_description", getElements("qbe_np_i_description")},
                "np_property_description", getData("np_property_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_np_i_default", getElements("qbe_np_i_default")},
                "default", getData("default"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_np_i_property", getElements("qbe_np_i_property")}, //search button
                new String[]{"MDM_np_e_result", getElements("MDM_np_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    //OTHERS
    private boolean others_actions_cn_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 90, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_cn_b_actions", getElements("MDM_cn_b_actions")}, //actions button
                new String[]{"MDM_cn_b_actions_audit_data", getElements("MDM_cn_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cn_b_detach", getElements("MDM_cn_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cd_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 90, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_cd_b_actions", getElements("MDM_cd_b_actions")}, //actions button
                new String[]{"MDM_cd_b_actions_audit_data", getElements("MDM_cd_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cd_b_detach", getElements("MDM_cd_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_nt_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 90, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_nt_b_actions", getElements("MDM_nt_b_actions")}, //actions button
                new String[]{"MDM_nt_b_actions_audit_data", getElements("MDM_nt_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_nt_b_detach", getElements("MDM_nt_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_np_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        Functions.break_time(driver, 90, 500);
        if (!Functions.auditData(driver,
                new String[]{"MDM_np_b_actions", getElements("MDM_np_b_actions")}, //actions button
                new String[]{"MDM_np_b_actions_audit_data", getElements("MDM_np_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_np_b_detach", getElements("MDM_np_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    //TAB CHANGE
    private boolean first_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_notification_type", getElements("MDM_b_notification_type")}, //element to click
                new String[]{"MDM_nt_b_add", getElements("MDM_nt_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
    private boolean second_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_notification_properties", getElements("MDM_b_notification_properties")}, //element to click
                new String[]{"MDM_np_b_add", getElements("MDM_np_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
    private boolean third_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_notification_configuration", getElements("MDM_b_notification_configuration")}, //element to click
                new String[]{"MDM_cn_b_add", getElements("MDM_cn_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
}
