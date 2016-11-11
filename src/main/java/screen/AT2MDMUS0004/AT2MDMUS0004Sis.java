package screen.AT2MDMUS0004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 10/11/2016.
 */
public class AT2MDMUS0004Sis {
    protected AT2MDMUS0004Locators locators;
    protected AT2MDMUS0004Data data;
    public AT2MDMUS0004Sis() {
    }
    public AT2MDMUS0004Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0004Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0004Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0004Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("GVCC Configuration Maintenance");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_user(driver)) return false;
        if (!search_user(driver)) return false;
        if (!interaction_edit_user(driver)) return false;
        if (!qbe_user(driver)) return false;
        if (!others_actions_user(driver)) return false;
        if (!interaction_add_apli(driver)) return false;
        if (!qbe_apli(driver)) return false;
        if (!interaction_edit_apli(driver)) return false;
        if (!qbe_apli(driver)) return false;
        if (!others_actions_apli(driver)) return false;
        if (!delete_apli(driver))return false;
        if (!delete_user(driver))return false;
        return true;
    }

    /**
     * TABLE USERS
     * @param driver
     * @return
     */
    public boolean interaction_add_user (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD USER";
        if (!Functions.checkClick(driver,
                new String[]{"users_b_add", getElements("users_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_user",getElements("add_i_user")},
                "user", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_password",getElements("add_i_password")},
                "pass",  DataGenerator.getRandomAlphanumericSequence(7, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname1",getElements("add_i_surname1")},
                "sur1", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname2",getElements("add_i_surname2")},
                "sur2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "Active", "status",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_language",getElements("add_i_language")},
                "lang", "ESP", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_user(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH USER";
        if (!Functions.insertInput(driver, new String[]{"search_i_user",getElements("search_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_password",getElements("search_i_password")},
                "pass", getData("pass"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_name",getElements("search_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname1",getElements("search_i_surname1")},
                "sur1", getData("sur1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname2",getElements("search_i_surname2")},
                "sur2", getData("sur2"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_status",getElements("search_sl_status")},
                getData("status"), "status",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_language",getElements("search_i_language")},
                "lang", getData("lang"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_user(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION USER";
        if (!Functions.checkClick(driver,
                new String[]{"users_b_edit", getElements("users_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_user",getElements("add_i_user")},
                "user", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_password",getElements("add_i_password")},
                "pass",  DataGenerator.getRandomAlphanumericSequence(7, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname1",getElements("add_i_surname1")},
                "sur1", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname2",getElements("add_i_surname2")},
                "sur2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "Inactive", "status",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_language",getElements("add_i_language")},
                "lang", "ING", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_user(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE USER";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"users_b_qbe", getElements("users_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_password",getElements("qbe_i_password")},
                "pass", getData("pass"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name",getElements("qbe_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname1",getElements("qbe_i_surname1")},
                "sur1", getData("sur1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname2",getElements("qbe_i_surname2")},
                "sur2", getData("sur2"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status",getElements("qbe_sl_status")},
                getData("status"), "status",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language",getElements("qbe_i_language")},
                "lang", getData("lang"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"users_e_result", getElements("users_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_user(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA USER";
        if (!Functions.auditData(driver,
                new String[]{"users_b_actions", getElements("users_b_actions")}, //actions button
                new String[]{"users_b_actions_b_audit_data", getElements("users_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH USER";
        if (!Functions.detachTable(driver,
                new String[]{"users_b_detach", getElements("users_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_user(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA USER";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"users_b_delete", getElements("users_b_delete")},
                new String[]{"users_e_records", getElements("users_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TABLE APPLICATIONS
     * @param driver
     * @return
     */
    public boolean interaction_add_apli (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD APLICATION";
        if (!Functions.checkClick(driver,
                new String[]{"application_b_add", getElements("application_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_application",getElements("add_lov_application")}, // b_lov
                new String[]{"add_i_application", getElements("add_i_application")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "appli", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"t2_add_sl_status",getElements("t2_add_sl_status")},
                "Active", "status2",  where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    public boolean interaction_edit_apli (TestDriver driver) {
        driver.getReport().addHeader("EDITTION", 3, false);
        String where = " EDIT APPLICATION";
        if (!Functions.checkClick(driver,
                new String[]{"application_b_edit", getElements("application_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_application",getElements("add_lov_application")}, // b_lov
                new String[]{"add_i_application", getElements("add_i_application")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "appli", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"t2_add_sl_status",getElements("t2_add_sl_status")},
                "Inactive", "status2",  where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_apli(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE APLI";
        if (!Functions.clickQbE(driver,
                new String[]{"application_b_qbe", getElements("application_b_qbe")},// query button
                new String[]{"qbe_i_application", getElements("qbe_i_application")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application",getElements("qbe_i_application")},
                "appli", getData("appli"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description",getElements("qbe_i_description")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"t2_qbe_sl_status",getElements("t2_qbe_sl_status")},
                getData("status2"), "status2",  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_application", getElements("qbe_i_application")}, //any query input
                new String[]{"application_e_result", getElements("application_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_apli(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA USER";
        if (!Functions.auditData(driver,
                new String[]{"application_b_actions", getElements("application_b_actions")}, //actions button
                new String[]{"application_b_actions_b_audit_data", getElements("application_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH USER";
        if (!Functions.detachTable(driver,
                new String[]{"application_b_detach", getElements("application_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_apli(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA USER";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"application_b_delete", getElements("application_b_delete")},
                new String[]{"application_e_records", getElements("application_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
