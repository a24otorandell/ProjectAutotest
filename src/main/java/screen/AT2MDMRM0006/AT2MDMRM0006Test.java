package screen.AT2MDMRM0006;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMRM0006Test {
    protected AT2MDMRM0006Locators locators;
    protected AT2MDMRM0006Data data;

    public AT2MDMRM0006Test() {
    }

    public AT2MDMRM0006Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MDMRM0006Locators locators) {
        this.locators = locators;
    }

    public AT2MDMRM0006Data getData() {
        return data;
    }

    public void setData(AT2MDMRM0006Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Channel");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Market");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {

        if (!channel_interaction_record_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!channel_qbe_MDM(driver)) return false;
        if (!channel_other_actions_MDM(driver)) return false;
        if (!channel_description_interaction_record_MDM(driver)) return false;
        if (!channel_description_interaction_edit_MDM(driver)) return false;
        if (!channel_description_qbe_MDM(driver)) return false;
        if (!channel_description_other_actions_MDM(driver)) return false;
        if (!channel_description_delete_MDM(driver)) return false;
        if (!channel_delete_MDM(driver)) return false;
        return false;
    }

    private boolean channel_interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_channel_add", getElements("MDM_b_channel_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_channel_code", getElements("add_i_channel_code")}, // element path
                "channel_code", getData("channel_code"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_channel_save", getElements("add_b_channel_save")}, //element to click
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
        if (!Functions.insertInput(driver,
                new String[]{"search_i_channel_code", getElements("search_i_channel_code")},
                "channel_code", data.getData().get("channel_code"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_channel_result", getElements("MDM_e_channel_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }

    private boolean channel_qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_channel_qbe", getElements("MDM_b_channel_qbe")},// query button
                new String[]{"qbe_i_channel_code", getElements("qbe_i_channel_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_channel_code", getElements("qbe_i_channel_code")},
                "channel_code", getData("channel_code"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_channel_code", getElements("qbe_i_channel_code")}, //search button
                new String[]{"MDM_e_channel_result", getElements("MDM_e_channel_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_other_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_channel_actions", getElements("MDM_b_channel_actions")}, //actions button
                new String[]{"MDM_b_channel_actions_audit_data", getElements("MDM_b_channel_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_channel_detach", getElements("MDM_b_channel_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_description_interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_channel_description_add", getElements("MDM_b_channel_description_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_channel_description", getElements("add_i_channel_description")}, // element path
                "channel_description", getData("channel_description"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_channel_description_save", getElements("add_b_channel_description_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_description_interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_e_channel_description_result", getElements("MDM_e_channel_description_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_channel_description_edit", getElements("MDM_b_channel_description_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_channel_description", getElements("add_i_channel_description")}, // element path
                "channel_description", getData("channel_description_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_channel_description_save", getElements("add_b_channel_description_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_description_qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_channel__description_qbe", getElements("MDM_b_channel_description_qbe")},// query button
                new String[]{"qbe_i_language", getElements("qbe_i_language")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_description_result", getElements("add_e_description_result")}, // element path
                "description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_channel_description", getElements("qbe_i_channel_description")},
                "channel_description", getData("channel_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_channel_code", getElements("qbe_i_channel_code")}, //search button
                new String[]{"MDM_e_channel_description_result", getElements("MDM_e_channel_description_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_description_other_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_channel_description_detach", getElements("MDM_b_channel_description_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_description_delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_channel_description_delete", getElements("MDM_b_channel_description_delete")},
                new String[]{"MDM_e_channel_description_records", getElements("MDM_e_channel_description_records")},
                where)) {
            return false;
        }
        return true;
    }

    private boolean channel_delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_e_channel_result", getElements("MDM_e_channel_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_channel_delete", getElements("MDM_b_channel_delete")},
                new String[]{"MDM_e_channel_records", getElements("MDM_e_channel_records")},
                where)) {
            return false;
        }
        return true;
    }
}
