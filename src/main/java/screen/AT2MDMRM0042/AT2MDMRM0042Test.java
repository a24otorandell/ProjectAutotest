package screen.AT2MDMRM0042;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 28/10/2016.
 */
public class AT2MDMRM0042Test {
    protected AT2MDMRM0042Locators locators;
    protected AT2MDMRM0042Data data;

    public AT2MDMRM0042Test() {
    }
    public AT2MDMRM0042Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0042Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0042Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0042Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Marketing Provisions");
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
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
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
        if (!Functions.insertInput(driver, new String[]{"add_i_date", getElements("add_i_date")}, // element path
                "date", getData("date"), where)) {
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
        if (!Functions.getText(driver, new String[]{"add_e_interface_description", getElements("add_e_interface_description")}, // element path
                "interface_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_TO", getElements("add_lov_TO")}, // b_lov
                new String[]{"add_i_TO", getElements("add_i_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "TO", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_%_endowment", getElements("add_i_%_endowment")}, // element path
                "%_endowment", getData("%_endowment"), where)) {
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
        if (!Functions.insertInput(driver, new String[]{"search_i_date", getElements("search_i_date")}, // element path
                "date", getData("date"),
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_interface_description", getElements("search_i_interface_description")}, // element path
                "interface_description", getData("interface_description"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_TO", getElements("search_lov_TO")}, //LoV button
                new String[]{"search_i_TO", getElements("search_i_TO")}, //external LoV input
                new String[]{"search_lov_TO_i_code", recursiveXPaths.lov_i_altgenericinput2}, //internal LoV input
                "%" + getData("TO"), // value to search
                "TO", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_%_endowment", getElements("search_i_%_endowment")}, // element path
                "%_endowment", getData("%_endowment"), where)) {
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
                new String[]{"qbe_i_date", getElements("qbe_i_date")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")}, // element path
                "date", getData("date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, // element path
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_description", getElements("qbe_i_interface_description")}, // element path
                "interface_description", getData("interface_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_TO", getElements("qbe_i_TO")}, // element path
                "TO", "%" + getData("TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_%_endowment", getElements("qbe_i_%_endowment")}, // element path
                "%_endowment", getData("%_endowment"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_date", getElements("qbe_i_date")}, //search button
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
}
