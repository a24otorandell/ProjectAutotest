package screen.AT2MDMCL0017;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 24/11/2016.
 */
public class AT2MDMCL0017Sis {
    protected AT2MDMCL0017Locators locators;
    protected AT2MDMCL0017Data data;
    public AT2MDMCL0017Sis() {
    }
    public AT2MDMCL0017Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0017Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0017Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0017Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("TO Groups by Office");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!interaction_add_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!getData_t3(driver)) return false;
        if (!qbe_t3(driver)) return false;
        if (!others_actions_t3(driver)) return false;
        if (!marcarSelect(driver)) return false;
        if (!getData_t4(driver)) return false;
        if (!qbe_t4(driver)) return false;
        if (!others_actions_t4(driver)) return false;
        if (!delete_t3(driver)) return false;
        if (!delete_t2(driver)) return false;
        if (!delete_t1(driver)) return false;
        return true;
    }

    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"group_b_add", getElements("group_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"group_b_edit", getElements("group_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickQbE(driver,
                new String[]{"group_b_qbe", getElements("group_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"group_e_result", getElements("group_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"group_b_actions", getElements("group_b_actions")}, //actions button
                new String[]{"group_b_actions_audit_data", getElements("group_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"group_b_detach", getElements("group_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if(!Functions.doDelete(driver,
                new String[]{"group_b_delete", getElements("group_b_delete")},//delete button
                new String[]{"group_e_yes", getElements("group_e_yes")},//delete button
                where)){return false;}
        return true;
    }

    public boolean interaction_add_t2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 2";
        if (!Functions.checkClick(driver,
                new String[]{"to_b_add", getElements("to_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_short",getElements("add_lov_short")}, // b_lov
                new String[]{"add_i_short", getElements("add_i_short")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "short", //Data name
                where)){return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_name_to", getElements("add_i_name_to")},
                "name_to", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        if (!Functions.clickQbE(driver,
                new String[]{"to_b_qbe", getElements("to_b_qbe")},// query button
                new String[]{"qbe_i_short", getElements("qbe_i_short")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short", getElements("qbe_i_short")},
                "short", "%"+getData("short"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name_to", getElements("qbe_i_name_to")},
                "name_to", getData("name_to"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_short", getElements("qbe_i_short")}, //any query input
                new String[]{"to_e_result", getElements("to_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 2";
        if (!Functions.auditData(driver,
                new String[]{"to_b_actions", getElements("to_b_actions")}, //actions button
                new String[]{"to_b_actions_audit_data", getElements("to_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"to_b_detach", getElements("to_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"to_b_delete", getElements("to_b_delete")},
                new String[]{"to_e_records", getElements("to_e_records")},
                where)){
            return false;
        }
        return true;
    }

    public boolean getData_t3 (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " on GET DATA 3";
        String[] columns = {"", "company", "c_name"};
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc31:empresa::db')]",
                1, // row to give values
                where);
        return true;
    }
    public boolean marcarSelect (TestDriver driver) {
        driver.getReport().addHeader("MARCAR SELECT", 3, false);
        String where = " on ACTIVAR SELECT";
        Functions.break_time(driver, 40, 400);
        if (!Functions.checkClick(driver,
                new String[]{"company_ck_select", getElements("company_ck_select")}, //element to click
                new String[]{"office_e_result", getElements("office_e_result")}, //element expected to appear
                100, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 3";
        if (!Functions.clickQbE(driver,
                new String[]{"company_b_qbe", getElements("company_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_c_name", getElements("qbe_i_c_name")},
                "c_name", getData("c_name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //any query input
                new String[]{"company_e_result", getElements("company_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 3";
        Functions.break_time(driver, 3, 400);
        if (!Functions.detachTable(driver,
                new String[]{"company_b_detach", getElements("company_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        return true;
    }
    private boolean delete_t3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 3";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"company_b_delete", getElements("company_b_delete")},
                new String[]{"company_e_records", getElements("company_e_records")},
                where)){
            return false;
        }
        return true;
    }

    public boolean getData_t4 (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " on GET DATA 4";
        Functions.break_time(driver, 3, 400);
        String[] columns = {"", "office", "o_name"};
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc41:oficina::db')]",
                1, // row to give values
                where);
        return true;
    }
    private boolean qbe_t4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 4";
        if (!Functions.clickQbE(driver,
                new String[]{"office_b_qbe", getElements("office_b_qbe")},// query button
                new String[]{"qbe_i_office", getElements("qbe_i_office")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if(!Functions.checkClick(driver,
                new String[]{"company_ck_select", getElements("company_ck_select")}, //element to click
                new String[]{"office_e_result", getElements("office_e_result")}, //element expected to appear
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_o_name", getElements("qbe_i_o_name")},
                "o_name", getData("o_name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_office", getElements("qbe_i_office")}, //any query input
                new String[]{"office_e_result", getElements("office_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t4(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 4";
        if (!Functions.auditData(driver,
                new String[]{"office_b_actions", getElements("office_b_actions")}, //actions button
                new String[]{"office_b_actions_audit_data", getElements("office_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 4";
        if (!Functions.detachTable(driver,
                new String[]{"office_b_detach", getElements("office_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
