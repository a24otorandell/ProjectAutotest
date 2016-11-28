package screen.AT2MDMCL0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0003Test {
    protected AT2MDMCL0003Locators locators;
    protected AT2MDMCL0003Data data;
    public AT2MDMCL0003Test() {
    }
    public AT2MDMCL0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0003Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Derivation Rules");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_t1(driver)) return false;
        if (!search_t1(driver, true)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!search_t1(driver, false)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!delete_t1(driver)) return false;
        return true;
    }

    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand", getElements("add_i_commercial_brand")},
                "comercial",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity", getElements("add_i_customer_connectivity")},
                "customer", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source_market", getElements("add_i_source_market")},
                "source",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_collections_company", getElements("add_i_collections_company")},
                "collections", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_commercial_brand", getElements("search_i_commercial_brand")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_brand", getElements("search_i_commercial_brand")},
                "comercial",getData("comercial"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_customer_connectivity", getElements("search_i_customer_connectivity")},
                "customer", getData("customer"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_source_market", getElements("search_i_source_market")},
                "source",getData("source"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand", getElements("add_i_commercial_brand")},
                "comercial",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity", getElements("add_i_customer_connectivity")},
                "customer", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source_market", getElements("add_i_source_market")},
                "source",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //actions button
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //audit button
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //audit_b_ok
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);

        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }

    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_collections_company", getElements("edit_i_collections_company")},
                "collections", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
