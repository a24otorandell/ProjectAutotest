package screen.AT2MDMSP0014;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 16/11/2016.
 */
public class AT2MDMSP0014Sis {
    protected AT2MDMSP0014Locators locators;
    protected AT2MDMSP0014Data data;
    public AT2MDMSP0014Sis() {
    }
    public AT2MDMSP0014Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0014Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0014Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0014Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("HSI Credentials");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search_table1(driver)) return false;
        if (!interaction_edit_table1(driver)) return false;
        if (!qbe_table1(driver)) return false;
        if (!others_actions_table1(driver)) return false;
        if (!interaction_add_table2(driver)) return false;
        if (!qbe_table2(driver)) return false;
        if (!interaction_edit_table2(driver)) return false;
        if (!qbe_table2(driver)) return false;
        if (!others_actions_table2(driver)) return false;
        if (!interaction_add_table3(driver)) return false;
        if (!qbe_table3(driver)) return false;
        if (!interaction_edit_table3(driver)) return false;
        if (!qbe_table3(driver)) return false;
        if (!others_actions_table3(driver)) return false;
        if (!interaction_add_table4(driver)) return false;
        if (!search_table4(driver)) return false;
        if (!interaction_edit_table4(driver)) return false;
        if (!qbe_table4(driver)) return false;
        if (!others_actions_table4(driver)) return false;
        if (!interaction_add_table5(driver)) return false;
        if (!search_table5(driver)) return false;
        if (!interaction_edit_table5(driver)) return false;
        if (!qbe_table5(driver)) return false;
        if (!others_actions_table5(driver)) return false;
        if (!interaction_add_table6(driver)) return false;
        if (!qbe_table6(driver)) return false;
        if (!interaction_edit_table6(driver)) return false;
        if (!qbe_table6(driver)) return false;
        if (!others_actions_table6(driver)) return false;
        if (!interaction_add_table7(driver)) return false;
        if (!qbe_table7(driver)) return false;
        if (!interaction_edit_table7(driver)) return false;
        if (!qbe_table7(driver)) return false;
        if (!others_actions_table7(driver)) return false;
/*        if (!interaction_add_table8(driver)) return false;
        if (!search_table8(driver)) return false;
        if (!interaction_edit_table8(driver)) return false;
        if (!qbe_table8(driver)) return false;
        if (!others_actions_table8(driver)) return false;*/
        if (!interaction_add_table9(driver)) return false;
        if (!search_table9(driver)) return false;
        if (!interaction_edit_table9(driver)) return false;
        if (!qbe_table9(driver)) return false;
        if (!others_actions_table9(driver)) return false;
        if (!interaction_add_table10(driver)) return false;
        if (!qbe_table10(driver)) return false;
        if (!interaction_edit_table10(driver)) return false;
        if (!qbe_table10(driver)) return false;
        if (!others_actions_table10(driver)) return false;
        if (!delete_table10(driver)) return false;
        if (!delete_table9(driver)) return false;
        if (!delete_table7(driver)) return false;
        if (!delete_table6(driver)) return false;
        if (!delete_table4(driver)) return false;
        if (!delete_table3(driver)) return false;
        if (!delete_table2(driver)) return false;
        return true;
    }

    /**
     * TAB CREDENTIALS - TABLE CREDENTIALS
     */
    private boolean search_table1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH TABLE1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table1_search_b_search", getElements("table1_search_b_search")}, //search button
                new String[]{"table1_e_result", getElements("table1_e_result")}, //result element
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"table1_data", getElements("table1_data")}, // element path
                "user", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table1_search_i_user",getElements("table1_search_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table1_search_b_search", getElements("table1_search_b_search")}, //search button
                new String[]{"table1_e_result", getElements("table1_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE1";
        if (!Functions.checkClick(driver,
                new String[]{"table1_b_edit", getElements("table1_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table1_add_i_user_code",getElements("table1_add_i_user_code")},
                "user", "222"+DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table1_add_b_save", getElements("table1_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE TABLE1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table1_search_b_reset", getElements("table1_search_b_reset")}, //search button
                new String[]{"table1_e_result", getElements("table1_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"table1_b_qbe", getElements("table1_b_qbe")},// query button
                new String[]{"table1_qbe_i_user", getElements("table1_qbe_i_user")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table1_qbe_i_user", getElements("table1_qbe_i_user")},
                "user", getData("user"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table1_qbe_i_user", getElements("table1_qbe_i_user")}, //any query input
                new String[]{"table1_e_result", getElements("table1_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA TABLE1";
        if (!Functions.auditData(driver,
                new String[]{"table1_b_actions", getElements("table1_b_actions")}, //actions button
                new String[]{"table1_b_actions_b_audit_data", getElements("table1_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE1";
        if (!Functions.detachTable(driver,
                new String[]{"table1_b_detach", getElements("table1_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    /**
     * TAB CREDENTIALS - TABLE ENVIRONMENTS
     */
    private boolean interaction_add_table2(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION TABLE2";
        if (!Functions.checkClick(driver,
                new String[]{"table2_b_add", getElements("table2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table2_add_lov_id_env",getElements("table2_add_lov_id_env")}, // b_lov
                new String[]{"table2_add_i_id_env", getElements("table2_add_i_id_env")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t2_id", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table2_add_sl_status",getElements("table2_add_sl_status")},
                "Active", "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table2_add_i_comments",getElements("table2_add_i_comments")},
                "comments", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table2_add_b_save", getElements("table2_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE2";
        if (!Functions.checkClick(driver,
                new String[]{"table2_b_edit", getElements("table2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table2_add_lov_id_env",getElements("table2_add_lov_id_env")}, // b_lov
                new String[]{"table2_add_i_id_env", getElements("table2_add_i_id_env")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t2_id", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table2_add_sl_status",getElements("table2_add_sl_status")},
                "Inactive", "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table2_add_i_comments",getElements("table2_add_i_comments")},
                "comments", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table2_add_b_save", getElements("table2_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE TABLE2";
        if (!Functions.clickQbE(driver,
                new String[]{"table2_b_qbe", getElements("table2_b_qbe")},// query button
                new String[]{"table2_qbe_i_id_env", getElements("table2_qbe_i_id_env")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table2_qbe_i_id_env", getElements("table2_qbe_i_id_env")},
                "t2_id", getData("t2_id"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"table2_qbe_sl_status",getElements("table2_qbe_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table2_qbe_i_comments", getElements("table2_qbe_i_comments")},
                "comments", getData("comments"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table2_qbe_i_id_env", getElements("table2_qbe_i_id_env")}, //any query input
                new String[]{"table2_e_result", getElements("table2_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA TABLE2";
        if (!Functions.auditData(driver,
                new String[]{"table2_b_actions", getElements("table2_b_actions")}, //actions button
                new String[]{"table2_b_actions_b_audit_data", getElements("table2_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE 2";
        if (!Functions.detachTable(driver,
                new String[]{"table2_b_detach", getElements("table2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA TABLE2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"table2_b_delete", getElements("table2_b_delete")},
                new String[]{"table2_e_records", getElements("table2_e_records")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TAB CREDENTIALS - TABLE CLIENTS
     */
    private boolean interaction_add_table3(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table3";
        if (!Functions.checkClick(driver,
                new String[]{"table3_b_add", getElements("table3_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table3_add_lov_clients",getElements("table3_add_lov_clients")}, // b_lov
                new String[]{"table3_add_i_clients", getElements("table3_add_i_clients")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t3_client", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table3_add_b_save", getElements("table3_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table3";
        if (!Functions.checkClick(driver,
                new String[]{"table3_b_edit", getElements("table3_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table3_add_lov_clients",getElements("table3_add_lov_clients")}, // b_lov
                new String[]{"table3_add_i_clients", getElements("table3_add_i_clients")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t3_client", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table3_add_b_save", getElements("table3_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table3";
        if (!Functions.clickQbE(driver,
                new String[]{"table3_b_qbe", getElements("table3_b_qbe")},// query button
                new String[]{"table3_qbe_i_clients", getElements("table3_qbe_i_clients")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table3_qbe_i_clients", getElements("table3_qbe_i_clients")},
                "t3_client", getData("t3_client"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table3_qbe_i_clients", getElements("table3_qbe_i_clients")}, //any query input
                new String[]{"table3_e_result", getElements("table3_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table3(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA table3";
        if (!Functions.auditData(driver,
                new String[]{"table3_b_actions", getElements("table3_b_actions")}, //actions button
                new String[]{"table3_b_actions_b_audit_data", getElements("table3_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE 3";
        if (!Functions.detachTable(driver,
                new String[]{"table3_b_detach", getElements("table3_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA table3";
        if (!Functions.simpleClick(driver,
                new String[]{"credentials_tab", getElements("credentials_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"table3_b_delete", getElements("table3_b_delete")},
                new String[]{"table3_e_records", getElements("table3_e_records")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TAB ENVIROMENTS - TABLE ENVIRONMENTS
     */
    private boolean interaction_add_table4(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table4";
        if (!Functions.simpleClick(driver,
                new String[]{"environments_tab", getElements("environments_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"table4_b_add", getElements("table4_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table4_add_i_id_env",getElements("table4_add_i_id_env")},
                "t4_id", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_add_i_description",getElements("table4_add_i_description")},
                "t4_desc", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_add_i_reg_exp",getElements("table4_add_i_reg_exp")},
                "reg", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table4_add_b_save", getElements("table4_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table4(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH table4";
        if (!Functions.insertInput(driver, new String[]{"table4_search_i_id_env",getElements("table4_search_i_id_env")},
                "t4_id", getData("t4_id"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_search_i_description",getElements("table4_search_i_description")},
                "t4_desc", getData("t4_desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_search_i_reg_exp",getElements("table4_search_i_reg_exp")},
                "reg", getData("reg"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table4_search_b_search", getElements("table4_search_b_search")}, //search button
                new String[]{"table4_e_result", getElements("table4_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table4";
        if (!Functions.checkClick(driver,
                new String[]{"table4_b_edit", getElements("table4_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table4_add_i_id_env",getElements("table4_add_i_id_env")},
                "t4_id", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_add_i_description",getElements("table4_add_i_description")},
                "t4_desc", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_add_i_reg_exp",getElements("table4_add_i_reg_exp")},
                "reg", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table4_add_b_save", getElements("table4_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table4";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table4_search_b_reset", getElements("table4_search_b_reset")}, //search button
                new String[]{"table4_e_result", getElements("table4_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"table4_b_qbe", getElements("table4_b_qbe")},// query button
                new String[]{"table4_qbe_i_id_env", getElements("table4_qbe_i_id_env")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table4_qbe_i_id_env",getElements("table4_qbe_i_id_env")},
                "t4_id", getData("t4_id"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_qbe_i_description",getElements("table4_qbe_i_description")},
                "t4_desc", getData("t4_desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table4_qbe_i_reg_exp",getElements("table4_qbe_i_reg_exp")},
                "reg", getData("reg"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table4_qbe_i_id_env", getElements("table4_qbe_i_id_env")}, //any query input
                new String[]{"table4_e_result", getElements("table4_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table4(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH TABLE 4";
        if (!Functions.detachTable(driver,
                new String[]{"table4_b_detach", getElements("table4_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA table4";
        if (!Functions.simpleClick(driver,
                new String[]{"environments_tab", getElements("environments_tab")}, //element to click
                where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"table4_e_result", getElements("table4_e_result")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"table4_b_delete", getElements("table4_b_delete")},
                new String[]{"table4_e_records", getElements("table4_e_records")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TAB CLIENTS - TABLE CLIENTS
     */
    private boolean interaction_add_table5(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table5";
        if (!Functions.simpleClick(driver,
                new String[]{"clients_tab", getElements("clients_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"table5_b_add", getElements("table5_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_name",getElements("table5_add_i_name")},
                "t5_name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table5_add_sl_status",getElements("table5_add_sl_status")},
                "Active", "t5_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_start_date",getElements("table5_add_i_start_date")},
                "start", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_go_live_date",getElements("table5_add_i_go_live_date")},
                "go",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8, 3), 0), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_contact",getElements("table5_add_i_contact")},
                "contact", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"table5_add_lov_type_of_client",getElements("table5_add_lov_type_of_client")}, // b_lov
                new String[]{"table5_add_i_type_of_client", getElements("table5_add_i_type_of_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t5_type", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_comments",getElements("table5_add_i_comments")},
                "t5_comments", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_operations",getElements("table5_add_i_operations")},
                "operations", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if(!Functions.getText(driver,new String[]{"table5_add_i_sequence", getElements("table5_add_i_sequence")}, // element path
                "t5_seq", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table5_add_b_save", getElements("table5_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table5(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH table5";
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_name",getElements("table5_search_i_name")},
                "t5_name", getData("t5_name"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table5_search_sl_status",getElements("table5_search_sl_status")},
                getData("t5_status"), "t5_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_start_date",getElements("table5_search_i_start_date")},
                "start", getData("start"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_go_live_date",getElements("table5_search_i_go_live_date")},
                "go",  getData("go") , where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_contact",getElements("table5_search_i_contact")},
                "contact",  getData("contact"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"table5_search_lov_type_of_client", getElements("table5_search_lov_type_of_client")}, //LoV button
                new String[]{"table5_search_i_type_of_client", getElements("table5_search_i_type_of_client")}, //external LoV input
                new String[]{"table5_search_lov_type_of_client_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("t5_type"), // value to search
                "t5_type", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_comments",getElements("table5_search_i_comments")},
                "t5_comments", getData("t5_comments"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_operations",getElements("table5_search_i_operations")},
                "operations", getData("operations"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table5_search_b_search", getElements("table5_search_b_search")}, //search button
                new String[]{"table5_e_result", getElements("table5_e_result")}, //result element
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"table5_e_registro_seq", getElements("table5_e_registro_seq")}, // element path
                "t5_seq", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_search_i_sequence",getElements("table5_search_i_sequence")},
                "t5_seq", getData("t5_seq"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table5_search_b_search", getElements("table5_search_b_search")}, //search button
                new String[]{"table5_e_result", getElements("table5_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table5";
        if (!Functions.checkClick(driver,
                new String[]{"table5_b_edit", getElements("table5_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_name",getElements("table5_add_i_name")},
                "t5_name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table5_add_sl_status",getElements("table5_add_sl_status")},
                "Deactivated", "t5_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_start_date",getElements("table5_add_i_start_date")},
                "start", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_go_live_date",getElements("table5_add_i_go_live_date")},
                "go",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8, 3), 0), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_contact",getElements("table5_add_i_contact")},
                "contact", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"table5_add_lov_type_of_client",getElements("table5_add_lov_type_of_client")}, // b_lov
                new String[]{"table5_add_i_type_of_client", getElements("table5_add_i_type_of_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t5_type", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_comments",getElements("table5_add_i_comments")},
                "t5_comments", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_add_i_operations",getElements("table5_add_i_operations")},
                "operations", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if(!Functions.getText(driver,new String[]{"table5_add_i_sequence", getElements("table5_add_i_sequence")}, // element path
                "t5_seq", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table5_add_b_save", getElements("table5_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table5(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table5";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table5_search_b_reset", getElements("table5_search_b_reset")}, //search button
                new String[]{"table5_e_result", getElements("table5_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"table5_b_qbe", getElements("table5_b_qbe")},// query button
                new String[]{"table5_qbe_i_sequence", getElements("table5_qbe_i_sequence")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table5_qbe_i_sequence",getElements("table5_qbe_i_sequence")},
                "t5_seq", getData("t5_seq"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_qbe_i_name",getElements("table5_qbe_i_name")},
                "t5_name", getData("t5_name"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table5_qbe_sl_status",getElements("table5_qbe_sl_status")},
                getData("t5_status"), "t5_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_qbe_i_start_date",getElements("table5_qbe_i_start_date")},
                "start", getData("start"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_qbe_i_go_live_date",getElements("table5_qbe_i_go_live_date")},
                "go",  getData("go") , where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_qbe_i_contact",getElements("table5_qbe_i_contact")},
                "contact",  getData("contact"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table5_qbe_i_type_of_client",getElements("table5_qbe_i_type_of_client")},
                "t5_type", getData("t5_type"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table5_qbe_i_sequence", getElements("table5_qbe_i_sequence")}, //any query input
                new String[]{"table5_e_result", getElements("table5_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table5(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA table5";
        if (!Functions.auditData(driver,
                new String[]{"table5_b_actions", getElements("table5_b_actions")}, //actions button
                new String[]{"table5_b_actions_b_audit_data", getElements("table5_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE 5";
        if (!Functions.detachTable(driver,
                new String[]{"table5_b_detach", getElements("table5_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    /**
     * TAB CLIENTS - TABLE IP
     */
    private boolean interaction_add_table6(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table6";
        if (!Functions.checkClick(driver,
                new String[]{"table6_b_add", getElements("table6_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table6_add_lov_ip",getElements("table6_add_lov_ip")}, // b_lov
                new String[]{"table6_add_i_ip", getElements("table6_add_i_ip")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t6_ip", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table6_add_b_save", getElements("table6_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table6(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table6";
        if (!Functions.checkClick(driver,
                new String[]{"table6_b_edit", getElements("table6_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table6_add_lov_ip",getElements("table6_add_lov_ip")}, // b_lov
                new String[]{"table6_add_i_ip", getElements("table6_add_i_ip")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t6_ip", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table6_add_b_save", getElements("table6_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table6(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table6";
        if (!Functions.clickQbE(driver,
                new String[]{"table6_b_qbe", getElements("table6_b_qbe")},// query button
                new String[]{"table6_qbe_i_ip", getElements("table6_qbe_i_ip")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table6_qbe_i_ip", getElements("table6_qbe_i_ip")},
                "t6_ip", getData("t6_ip"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table6_qbe_i_ip", getElements("table6_qbe_i_ip")}, //any query input
                new String[]{"table6_e_result", getElements("table6_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table6(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH TABLE 6";
        if (!Functions.detachTable(driver,
                new String[]{"table6_b_detach", getElements("table6_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table6(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA table6";
        if (!Functions.simpleClick(driver,
                new String[]{"table6_e_result", getElements("table6_e_result")}, //element to click
                where)){return false;}
        if(!Functions.doDelete(driver,
                new String[]{"table6_b_delete", getElements("table6_b_delete")},//delete button
                new String[]{"table6_b_yes", getElements("table6_b_yes")},//delete button
                where)){return false;}
        return true;
    }
    /**
     * TAB CLIENTS - TABLE ENVIRONMENT
     */
    private boolean interaction_add_table7(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table7";
        if (!Functions.checkClick(driver,
                new String[]{"table7_b_add", getElements("table7_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table7_add_lov_id_env",getElements("table7_add_lov_id_env")}, // b_lov
                new String[]{"table7_add_i_id_env", getElements("table7_add_i_id_env")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t7_id", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table7_add_b_save", getElements("table7_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table7(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table7";
        if (!Functions.checkClick(driver,
                new String[]{"table7_b_edit", getElements("table7_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table7_add_lov_id_env",getElements("table7_add_lov_id_env")}, // b_lov
                new String[]{"table7_add_i_id_env", getElements("table7_add_i_id_env")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t7_id", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table7_add_b_save", getElements("table7_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table7(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table7";
        if (!Functions.clickQbE(driver,
                new String[]{"table7_b_qbe", getElements("table7_b_qbe")},// query button
                new String[]{"table7_qbe_i_id_env", getElements("table7_qbe_i_id_env")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table7_qbe_i_id_env", getElements("table7_qbe_i_id_env")},
                "t7_id", getData("t7_id"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table7_qbe_i_id_env", getElements("table7_qbe_i_id_env")}, //any query input
                new String[]{"table7_e_result", getElements("table7_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table7(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA table7";
        if (!Functions.auditData(driver,
                new String[]{"table7_b_actions", getElements("table7_b_actions")}, //actions button
                new String[]{"table7_b_actions_b_audit_data", getElements("table7_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE 7";
        if (!Functions.detachTable(driver,
                new String[]{"table7_b_detach", getElements("table7_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table7(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA table7";
        if (!Functions.simpleClick(driver,
                new String[]{"clients_tab", getElements("clients_tab")}, //element to click
                where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"table7_e_result", getElements("table7_e_result")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"table7_b_delete", getElements("table7_b_delete")},
                new String[]{"table7_e_records", getElements("table7_e_records")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TAB IP'S TABLE IP'S
     */
    private boolean interaction_add_table8(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table8";
        if (!Functions.simpleClick(driver,
                new String[]{"ip_tab", getElements("ip_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"table8_b_add", getElements("table8_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_type",getElements("table8_add_i_type")},
                "t8_type", "I", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table8_add_sl_status",getElements("table8_add_sl_status")},
                "Active", "t8_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_1",getElements("table8_add_i_ip_from_1")},
                "ip1", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_2",getElements("table8_add_i_ip_from_2")},
                "ip2", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_3",getElements("table8_add_i_ip_from_3")},
                "ip3", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_4",getElements("table8_add_i_ip_from_4")},
                "ip4", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_5",getElements("table8_add_i_ip_from_5")},
                "ip5", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_comments",getElements("table8_add_i_comments")},
                "t8_comments", DataGenerator.getRandomAlphanumericSequence(7,false), where)){return false;}
        if(!Functions.getValue(driver,new String[]{"table8_add_ip", getElements("table8_add_ip")}, // element path
                "t8_ip", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table8_add_b_save", getElements("table8_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table8(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH table8";
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_type",getElements("table8_search_i_type")},
                "t8_type", getData("t8_type"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table8_search_sl_status",getElements("table8_search_sl_status")},
                getData("t8_status"), "t8_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_ip_from_1",getElements("table8_search_i_ip_from_1")},
                "ip1", getData("ip1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_ip_from_2",getElements("table8_search_i_ip_from_2")},
                "ip2", getData("ip2"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_ip_from_3",getElements("table8_search_i_ip_from_3")},
                "ip3", getData("ip3"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_ip_from_4",getElements("table8_search_i_ip_from_4")},
                "ip4", getData("ip4"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_ip_from_5",getElements("table8_search_i_ip_from_5")},
                "ip5", getData("ip5"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_search_i_comments",getElements("table8_search_i_comments")},
                "t8_comments",getData("t8_comments"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table8_search_b_search", getElements("table8_search_b_search")}, //search button
                new String[]{"table8_e_result", getElements("table8_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table8(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table8";
        if (!Functions.checkClick(driver,
                new String[]{"table8_b_edit", getElements("table8_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_type",getElements("table8_add_i_type")},
                "t8_type", "E", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table8_add_sl_status",getElements("table8_add_sl_status")},
                "Inactive", "t8_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_1",getElements("table8_add_i_ip_from_1")},
                "ip1", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_2",getElements("table8_add_i_ip_from_2")},
                "ip2", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_3",getElements("table8_add_i_ip_from_3")},
                "ip3", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_4",getElements("table8_add_i_ip_from_4")},
                "ip4", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_ip_from_5",getElements("table8_add_i_ip_from_5")},
                "ip5", String.valueOf(DataGenerator.random(1,172)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_add_i_comments",getElements("table8_add_i_comments")},
                "t8_comments", DataGenerator.getRandomAlphanumericSequence(7,false), where)){return false;}
        if(!Functions.getValue(driver,new String[]{"table8_add_ip", getElements("table8_add_ip")}, // element path
                "t8_ip", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table8_add_b_save", getElements("table8_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table8(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table8";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table8_search_b_reset", getElements("table8_search_b_reset")}, //search button
                new String[]{"table8_e_result", getElements("table8_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"table8_b_qbe", getElements("table8_b_qbe")},// query button
                new String[]{"table8_qbe_i_ip", getElements("table8_qbe_i_ip")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_ip",getElements("table8_qbe_i_ip")},
                "t8_ip", getData("t8_ip"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_type",getElements("table8_qbe_i_type")},
                "t8_type", getData("t8_type"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"table8_qbe_sl_status",getElements("table8_qbe_sl_status")},
                getData("t8_status"), "t8_status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_ip_from_1",getElements("table8_qbe_i_ip_from_1")},
                "ip1", getData("ip1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_ip_from_2",getElements("table8_qbe_i_ip_from_2")},
                "ip2", getData("ip2"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_ip_from_3",getElements("table8_qbe_i_ip_from_3")},
                "ip3", getData("ip3"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_ip_from_4",getElements("table8_qbe_i_ip_from_4")},
                "ip4", getData("ip4"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table8_qbe_i_ip_from_5",getElements("table8_qbe_i_ip_from_5")},
                "ip5", getData("ip5"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table8_qbe_i_ip", getElements("table8_qbe_i_ip")}, //any query input
                new String[]{"table8_e_result", getElements("table8_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table8(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA table8";
        if (!Functions.auditData(driver,
                new String[]{"table8_b_actions", getElements("table8_b_actions")}, //actions button
                new String[]{"table8_b_actions_b_audit_data", getElements("table8_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE8";
        if (!Functions.detachTable(driver,
                new String[]{"table8_b_detach", getElements("table8_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    /**
     * TAB TYPE OF CLIENTS - TABLE TYPE OF CLIENTS
     */
    private boolean interaction_add_table9(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table9";
        if (!Functions.simpleClick(driver,
                new String[]{"type_of_clients_tab", getElements("type_of_clients_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"table9_b_add", getElements("table9_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table9_add_i_supplier_sequence",getElements("table9_add_i_supplier_sequence")},
                "supplier", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table9_add_i_name",getElements("table9_add_i_name")},
                "t9_name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table9_add_b_save", getElements("table9_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table9(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH table9";
        if (!Functions.insertInput(driver, new String[]{"table9_search_i_supplier_sequence",getElements("table9_search_i_supplier_sequence")},
                "supplier", getData("supplier"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table9_search_i_name",getElements("table9_search_i_name")},
                "t9_name", getData("t9_name"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table9_search_b_search", getElements("table9_search_b_search")}, //search button
                new String[]{"table9_e_result", getElements("table9_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table9(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table9";
        if (!Functions.checkClick(driver,
                new String[]{"table9_b_edit", getElements("table9_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"table9_add_i_supplier_sequence",getElements("table9_add_i_supplier_sequence")},
                "supplier", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table9_add_i_name",getElements("table9_add_i_name")},
                "t9_name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table9_add_b_save", getElements("table9_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table9(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table9";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"table9_search_b_reset", getElements("table9_search_b_reset")}, //search button
                new String[]{"table9_e_result", getElements("table9_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"table9_b_qbe", getElements("table9_b_qbe")},// query button
                new String[]{"table9_qbe_i_supplier_sequence", getElements("table9_qbe_i_supplier_sequence")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table9_qbe_i_supplier_sequence",getElements("table9_qbe_i_supplier_sequence")},
                "supplier", getData("supplier"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table9_qbe_i_name",getElements("table9_qbe_i_name")},
                "t9_name", getData("t9_name"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table9_qbe_i_supplier_sequence", getElements("table9_qbe_i_supplier_sequence")}, //any query input
                new String[]{"table9_e_result", getElements("table9_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table9(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA table9";
        if (!Functions.auditData(driver,
                new String[]{"table9_b_actions", getElements("table9_b_actions")}, //actions button
                new String[]{"table9_b_actions_b_audit_data", getElements("table9_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABLE9";
        if (!Functions.detachTable(driver,
                new String[]{"table9_b_detach", getElements("table9_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table9(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA table9";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"table9_b_delete", getElements("table9_b_delete")},
                new String[]{"table9_e_records", getElements("table9_e_records")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TAB TYPE OF CLIENTS - TABLE SUPPLIER
     */
    private boolean interaction_add_table10(TestDriver driver) {
        driver.getReport().addHeader("CREATR RECORD", 3, false);
        String where = " on CREATTION table10";
        if (!Functions.checkClick(driver,
                new String[]{"table10_b_add", getElements("table10_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table10_add_lov_language",getElements("table10_add_lov_language")}, // b_lov
                new String[]{"table10_add_i_language", getElements("table10_add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t10_lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table10_add_i_description",getElements("table10_add_i_description")},
                "t10_desc", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table10_add_b_save", getElements("table10_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table10(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION table10";
        if (!Functions.checkClick(driver,
                new String[]{"table10_b_edit", getElements("table10_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"table10_add_lov_language",getElements("table10_add_lov_language")}, // b_lov
                new String[]{"table10_add_i_language", getElements("table10_add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "t10_lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table10_add_i_description",getElements("table10_add_i_description")},
                "t10_desc", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"table10_add_b_save", getElements("table10_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table10(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE table10";
        if (!Functions.clickQbE(driver,
                new String[]{"table10_b_qbe", getElements("table10_b_qbe")},// query button
                new String[]{"table10_qbe_i_language", getElements("table10_qbe_i_language")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"table10_qbe_i_language",getElements("table10_qbe_i_language")},
                "t10_lang", getData("t10_lang"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"table10_qbe_i_description",getElements("table10_qbe_i_description")},
                "t10_desc", getData("t10_desc"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"table10_qbe_i_language", getElements("table10_qbe_i_language")}, //any query input
                new String[]{"table10_e_result", getElements("table10_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table10(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA table10";
        if (!Functions.auditData(driver,
                new String[]{"table10_b_actions", getElements("table10_b_actions")}, //actions button
                new String[]{"table10_b_actions_b_audit_data", getElements("table10_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH table10";
        if (!Functions.detachTable(driver,
                new String[]{"table10_b_detach", getElements("table10_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table10(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA table10";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"table10_b_delete", getElements("table10_b_delete")},
                new String[]{"table10_e_records", getElements("table10_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
