package screen.AT2MDMCL0022;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 25/11/2016.
 */
public class AT2MDMCL0022Test {
    protected AT2MDMCL0022Locators locators;
    protected AT2MDMCL0022Data data;

    public AT2MDMCL0022Test() {
    }
    public AT2MDMCL0022Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0022Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0022Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0022Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("IP's");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_MDM(driver)) return false;
        if (!qbe_special_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_MDM(driver)) return false;
        if (!qbe_special_MDM(driver)) return false;
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
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_code", getElements("add_lov_atlas_code")}, // b_lov
                new String[]{"add_i_atlas_code", getElements("add_i_atlas_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ip", getElements("add_i_ip")}, // element path
                "ip", getData("ip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_valid_ip", getElements("add_i_valid_ip")}, // element path
                "valid_ip", getData("valid_ip"), where)) {
            return false;
        }
        String list_options[] = {"No", "Yes"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_ip_valida", getElements("add_sl_ip_valida")},
                list_options, "ip_valida",
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
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_primary", getElements("search_lov_primary")}, //LoV button
                new String[]{"search_i_primary", getElements("search_i_primary")}, //external LoV input
                new String[]{"search_lov_primary_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("atlas_code"), // value to search
                "primary", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_primsecdetbranch_result", getElements("search_i_primsecdetbranch_result")}, // element path
                "primsecdetbranch", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_secondary_result", getElements("search_i_secondary_result")}, // element path
                "secondary", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_detail_result", getElements("search_i_detail_result")}, // element path
                "detail", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_branch_result", getElements("search_i_branch_result")}, // element path
                "branch", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_agency_code_result", getElements("search_i_agency_code_result")}, // element path
                "agency_code", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_secondary", getElements("search_i_secondary")}, // element path
                "secondary", getData("secondary"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_detail", getElements("search_i_detail")}, // element path
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_branch", getElements("search_i_branch")}, // element path
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_atlas_code", getElements("search_lov_atlas_code")}, //LoV button
                new String[]{"search_i_atlas_code", getElements("search_i_atlas_code")}, //external LoV input
                new String[]{"search_lov_atlas_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("atlas_code"), // value to search
                "atlas_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_agency_code", getElements("search_i_agency_code")}, // element path
                "agency_code", getData("agency_code"), where)) {
            return false;
        }if (!Functions.insertInput(driver, new String[]{"search_i_ip", getElements("search_i_ip")}, // element path
                "ip", getData("ip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_valid_ip", getElements("search_i_valid_ip")}, // element path
                "valid_ip", getData("valid_ip"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_ip_valida",getElements("search_sl_ip_valida")},
                getData("ip_valida"), "ip_valida",
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
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_code", getElements("add_lov_atlas_code")}, // b_lov
                new String[]{"add_i_atlas_code", getElements("add_i_atlas_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ip", getElements("add_i_ip")}, // element path
                "ip", getData("ip_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_valid_ip", getElements("add_i_valid_ip")}, // element path
                "valid_ip", getData("valid_ip_edit"), where)) {
            return false;
        }
        String list_options[] = {"No", "Yes"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_ip_valida", getElements("add_sl_ip_valida")},
                list_options, "ip_valida",
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
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_primsecdetbranch_result", getElements("search_i_primsecdetbranch_result")}, // element path
                "primsecdetbranch", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_primsecdetbranch", getElements("qbe_i_primsecdetbranch")},
                "primsecdetbranch", getData("primsecdetbranch"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_major_result", getElements("search_i_major_result")}, // element path
                "major", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_major", getElements("qbe_i_major")},
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_secondary_result", getElements("search_i_secondary_result")}, // element path
                "secondary", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_detail_result", getElements("search_i_detail_result")}, // element path
                "detail", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_branch_result", getElements("search_i_branch_result")}, // element path
                "branch", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_secondary", getElements("qbe_i_secondary")},
                "secondary", getData("secondary"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_detail", getElements("qbe_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch", getElements("qbe_i_branch")},
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_code", getElements("qbe_i_atlas_code")},
                "atlas_code", getData("atlas_code"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_agency_name_result", getElements("search_i_agency_name_result")}, // element path
                "agency_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_i_agency_code_result", getElements("search_i_agency_code_result")}, // element path
                "agency_code", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency_name", getElements("qbe_i_agency_name")},
                "agency_name", getData("agency_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency_code", getElements("qbe_i_agency_code")},
                "agency_code", getData("agency_code"), where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_i_ip", getElements("qbe_i_ip")},
                "ip", getData("ip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_valid_ip", getElements("qbe_i_valid_ip")},
                "valid_ip", getData("valid_ip"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_ip_valida",getElements("qbe_sl_ip_valida")},
                getData("ip_valida"), "ip_valida",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_special_MDM(TestDriver driver) {
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
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_code", getElements("qbe_i_atlas_code")},
                "atlas_code", getData("atlas_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ip", getElements("qbe_i_ip")},
                "ip", getData("ip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_valid_ip", getElements("qbe_i_valid_ip")},
                "valid_ip", getData("valid_ip"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_ip_valida",getElements("qbe_sl_ip_valida")},
                getData("ip_valida"), "ip_valida",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, //search button
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
