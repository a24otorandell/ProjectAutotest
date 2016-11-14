package screen.AT2MDMCL0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMCL0005Sis {
    protected AT2MDMCL0005Locators locators;
    protected AT2MDMCL0005Data data;
    public AT2MDMCL0005Sis() {
    }
    public AT2MDMCL0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0005Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0005Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Syncro Errors");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!others_actions(driver)) return false;
        return true;
    }

    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
/*        if (!Functions.insertInput(driver, new String[]{"search_i_id", getElements("search_i_id")},
                "id", "1", where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"search_i_client_system", getElements("search_i_client_system")},
                "system","ATLAS", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_client_registered", getElements("search_i_client_registered")},
                "regis","MDM", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_received_01", getElements("search_i_date_received_01")},
                "date_1","", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_received_02", getElements("search_i_date_received_02")},
                "date_2","", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"synchronization_e_result", getElements("synchronization_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"synchronization_b_edit", getElements("synchronization_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "RESOLVE", "status", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
/*        if (!Functions.auditData(driver,
                new String[]{"group_b_actions", getElements("group_b_actions")}, //actions button
                new String[]{"group_b_actions_audit_data", getElements("group_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"synchronization_b_detach", getElements("synchronization_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
