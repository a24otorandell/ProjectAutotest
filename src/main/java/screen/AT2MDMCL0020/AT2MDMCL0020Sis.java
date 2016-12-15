package screen.AT2MDMCL0020;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 21/11/2016.
 */
public class AT2MDMCL0020Sis {
    protected AT2MDMCL0020Locators locators;
    protected AT2MDMCL0020Data data;
    public AT2MDMCL0020Sis() {
    }
    public AT2MDMCL0020Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0020Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0020Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0020Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Anaconda credentials");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_t1(driver)) return false;
        if (!search_t1(driver)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!interaction_add_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!interaction_add_t3(driver)) return false;
        if (!qbe_t3(driver)) return false;
        if (!interaction_edit_t3(driver)) return false;
        if (!qbe_t3(driver)) return false;
        if (!others_actions_t3(driver)) return false;
        if (!interaction_add_t4(driver)) return false;
        if (!search_t4(driver)) return false;
        if (!interaction_edit_t4(driver)) return false;
        if (!qbe_t4(driver)) return false;
        if (!others_actions_t4(driver)) return false;
        if (!interaction_add_t5(driver)) return false;
        if (!qbe_t5(driver)) return false;
        if (!interaction_edit_t5(driver)) return false;
        if (!qbe_t5(driver)) return false;
        if (!others_actions_t5(driver)) return false;
        if (!delete_t5(driver)) return false;
        if (!delete_t4(driver)) return false;
        if (!delete_t3(driver)) return false;
        if (!delete_t2(driver)) return false;
        return true;
    }

    /**
     * TAB USERS TABLE CREDENTIALS
     */
    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABLE CREDENTIALS";
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClick(driver,
                new String[]{"credentials_b_add", getElements("credentials_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pwd", getElements("add_i_pwd")},
                "pwd", DataGenerator.getRandomAlphanumericSequence(6, true), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, //LoV button
                new String[]{"add_i_to", getElements("add_i_to")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_des_ttoo", getElements("add_e_des_ttoo")}, // element path
                "to_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_branch",getElements("add_lov_branch")}, // b_lov
                new String[]{"add_i_branch", getElements("add_i_branch")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_des_sucursal", getElements("add_e_des_sucursal")}, // element path
                "sucursal", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_min", getElements("add_i_min")}, // element path
                "min", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_major", getElements("add_i_major")},
                "major", String.valueOf(DataGenerator.random(0,100)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sub_major", getElements("add_i_sub_major")},
                "sub_major", String.valueOf(DataGenerator.random(100,300)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_detail", getElements("add_i_detail")},
                "detail", String.valueOf(DataGenerator.random(0,400)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_branch2", getElements("add_i_branch2")},
                "branch2", String.valueOf(DataGenerator.random(0,400)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH CREDENTIALS";
        if (!Functions.insertInput(driver, new String[]{"search_i_code", getElements("search_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_pwd", getElements("search_i_pwd")},
                "pwd", getData("pwd"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_to", getElements("search_lov_to")}, //LoV button
                new String[]{"search_i_to", getElements("search_i_to")}, //external LoV input
                new String[]{"search_lov_to_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("to"), // value to search
                "to", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_branch", getElements("search_i_branch")},
                "branch", getData("branch"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"search_i_major", getElements("search_i_major")},
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sub_major", getElements("search_i_sub_major")},
                "sub_major", getData("sub_major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_detail", getElements("search_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_branch2", getElements("search_i_branch2")},
                "branch2",getData("branch2"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search1", getElements("search_b_search1")}, //search button
                new String[]{"credentials_e_result", getElements("credentials_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE CREDENTIALS";
        if (!Functions.checkClick(driver,
                new String[]{"credentials_b_edit", getElements("credentials_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pwd", getElements("add_i_pwd")},
                "pwd", DataGenerator.getRandomAlphanumericSequence(6, true), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to",getElements("add_lov_to")}, // b_lov
                new String[]{"add_i_to", getElements("add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
/*        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, //LoV button
                new String[]{"add_i_to", getElements("add_i_to")}, //external LoV input
                new String[]{"add_lov_to_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "562", // value to search
                "to", //name of the data
                where)){return false;}*/
        if(!Functions.getValue(driver,new String[]{"add_e_des_ttoo", getElements("add_e_des_ttoo")}, // element path
                "to_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_branch",getElements("add_lov_branch")}, // b_lov
                new String[]{"add_i_branch", getElements("add_i_branch")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_des_sucursal", getElements("add_e_des_sucursal")}, // element path
                "sucursal", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_min", getElements("add_i_min")}, // element path
                "min", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_major", getElements("add_i_major")},
                "major", String.valueOf(DataGenerator.random(0,100)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sub_major", getElements("add_i_sub_major")},
                "sub_major", String.valueOf(DataGenerator.random(100,300)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_detail", getElements("add_i_detail")},
                "detail", String.valueOf(DataGenerator.random(0,400)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_branch2", getElements("add_i_branch2")},
                "branch2", String.valueOf(DataGenerator.random(0,400)), where)) {
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
        String where = " on QBE CREDENTIALS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset1", getElements("search_b_reset1")}, //search button
                new String[]{"credentials_e_result", getElements("credentials_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"credentials_b_qbe", getElements("credentials_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_password", getElements("qbe_i_password")},
                "pwd", getData("pwd"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_des_ttoo", getElements("qbe_i_des_ttoo")},
                "to_desc", getData("to_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch", getElements("qbe_i_branch")},
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_des_sucursal", getElements("qbe_i_des_sucursal")},
                "sucursal", getData("sucursal"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_min", getElements("qbe_i_min")},
                "min", getData("min"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_major", getElements("qbe_i_major")},
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sub_major", getElements("qbe_i_sub_major")},
                "sub_major", getData("sub_major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_detail", getElements("qbe_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch2", getElements("qbe_i_branch2")},
                "branch2",getData("branch2"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"credentials_e_result", getElements("credentials_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA CREDENTIALS";
        if (!Functions.auditData(driver,
                new String[]{"credentials_b_actions", getElements("credentials_b_actions")}, //actions button
                new String[]{"credentials_b_actions_audit_data", getElements("credentials_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH CREDENTIALS";
        if (!Functions.detachTable(driver,
                new String[]{"credentials_b_detach", getElements("credentials_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TAB USERS TABLE ENVIRONMENTS
     */
    public boolean interaction_add_t2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABLE ENVIRONMENT";
        if (!Functions.checkClick(driver,
                new String[]{"environment_b_add", getElements("environment_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_environment_id",getElements("add_lov_environment_id")}, // b_lov
                new String[]{"add_i_environment_id", getElements("add_i_environment_id")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "env_id", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "Active", "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")},
                "remarks", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE ENVIRONMENTS";
        if (!Functions.checkClick(driver,
                new String[]{"environment_b_edit", getElements("environment_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_environment_id",getElements("add_lov_environment_id")}, // b_lov
                new String[]{"add_i_environment_id", getElements("add_i_environment_id")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "env_id", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "Inactive", "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")},
                "remarks", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
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
        String where = " on QBE ENVIRONMENTS";
        if (!Functions.clickQbE(driver,
                new String[]{"environment_b_qbe", getElements("environment_b_qbe")},// query button
                new String[]{"qbe_i_environment_id", getElements("qbe_i_environment_id")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_environment_id", getElements("qbe_i_environment_id")},
                "env_id", getData("env_id"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status",getElements("qbe_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_remarks", getElements("qbe_i_remarks")},
                "remarks", getData("remarks"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_environment_id", getElements("qbe_i_environment_id")}, //any query input
                new String[]{"environment_e_result", getElements("environment_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA ENVIRONMENTS";
        if (!Functions.auditData(driver,
                new String[]{"environment_b_actions", getElements("environment_b_actions")}, //actions button
                new String[]{"environment_b_actions_audit_data", getElements("environment_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH ENVIRONMENTS";
        if (!Functions.detachTable(driver,
                new String[]{"environment_b_detach", getElements("environment_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA ENVIRONMENTS";
        if(!Functions.doDelete(driver,
                new String[]{"environment_b_delete", getElements("environment_b_delete")},//delete button
                new String[]{"environment_e_ok_de", getElements("environment_e_ok_de")},//delete button
                where)){return false;}
        return true;
    }

    /**
     * TAB USERS TABLE IP
     */
    public boolean interaction_add_t3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABLE IP";
        if (!Functions.checkClick(driver,
                new String[]{"ip_b_add", getElements("ip_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_ip_id",getElements("add_lov_ip_id")}, // b_lov
                new String[]{"add_i_ip_id", getElements("add_i_ip_id")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ip_id", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_devel_code", getElements("add_i_devel_code")}, // element path
                "devel", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE IP";
        if (!Functions.checkClick(driver,
                new String[]{"ip_b_edit", getElements("ip_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_ip_id",getElements("add_lov_ip_id")}, // b_lov
                new String[]{"add_i_ip_id", getElements("add_i_ip_id")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ip_id", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_devel_code", getElements("add_i_devel_code")}, // element path
                "devel", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE IP";
        if (!Functions.simpleClick(driver,
                new String[]{"ip_e_extra_detach", getElements("ip_e_extra_detach")}, //element to click
                where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"ip_b_qbe", getElements("ip_b_qbe")},// query button
                new String[]{"qbe_i_ip_id", getElements("qbe_i_ip_id")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ip_id", getElements("qbe_i_ip_id")},
                "ip_id", getData("ip_id"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_ip_id", getElements("qbe_i_ip_id")}, //any query input
                new String[]{"ip_e_result", getElements("ip_e_result")}, //table result
                where)){return false;}
        Functions.getText(driver,
                new String[]{"table_e_developed", getElements("table_e_developed")}, // element path
                "devel", // key for data value (the name)
                where);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_devel_code", getElements("qbe_i_devel_code")},
                "devel", getData("devel"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_ip_id", getElements("qbe_i_ip_id")}, //any query input
                new String[]{"ip_e_result", getElements("ip_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA IP";
        Functions.zoomOut(driver);
/*        if (!Functions.simpleClick(driver,
                new String[]{"ip_e_extra_actions", getElements("ip_e_extra_actions")}, //element to click
                where)){return false;}*/
        if (!Functions.auditData(driver,
                new String[]{"ip_b_actions", getElements("ip_b_actions")}, //actions button
                new String[]{"ip_b_actions_audit_data", getElements("ip_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH IP";
        Functions.zoomOut(driver);
/*        if (!Functions.simpleClick(driver,
                new String[]{"ip_e_extra_detach", getElements("ip_e_extra_detach")}, //element to click
                where)){return false;}*/
        if (!Functions.detachTable(driver,
                new String[]{"ip_b_detach", getElements("ip_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA IP";
        Functions.zoomOut(driver);
        if (!Functions.simpleClick(driver,
                new String[]{"users_tab", getElements("users_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"ip_b_delete", getElements("ip_b_delete")},
                new String[]{"ip_e_records", getElements("ip_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TAB DEVELOPER TABLE DEVELOVER
     */
    public boolean interaction_add_t4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABLE DEVELOPED";
        Functions.break_time(driver,3, 400);
        if (!Functions.simpleClick(driver,
                new String[]{"developers_tab", getElements("developers_tab")}, //element to click
                where)){return false;}
        Functions.break_time(driver,3, 400);
        if (!Functions.checkClick(driver,
                new String[]{"develop_b_add", getElements("develop_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dev_code", getElements("add_i_dev_code")},
                "dev_code", DataGenerator.getRandomAlphanumericSequence(8,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t4(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH DEVELOPED";
        if (!Functions.insertInput(driver, new String[]{"search_i_dev_code", getElements("search_i_dev_code")},
                "dev_code", getData("dev_code"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search2", getElements("search_b_search2")}, //search button
                new String[]{"develop_e_result", getElements("develop_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE DEVELOPED";
        if (!Functions.checkClick(driver,
                new String[]{"develop_b_edit", getElements("develop_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dev_code", getElements("add_i_dev_code")},
                "dev_code", DataGenerator.getRandomAlphanumericSequence(8,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DEVELOPED";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset2", getElements("search_b_reset2")}, //search button
                new String[]{"develop_e_result", getElements("develop_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"develop_b_qbe", getElements("develop_b_qbe")},// query button
                new String[]{"qbe_i_dev_code", getElements("qbe_i_dev_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dev_code", getElements("qbe_i_dev_code")},
                "dev_code", getData("dev_code"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_dev_code", getElements("qbe_i_dev_code")}, //any query input
                new String[]{"develop_e_result", getElements("develop_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t4(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA DEVELOPED";
        if (!Functions.auditData(driver,
                new String[]{"develop_b_actions", getElements("develop_b_actions")}, //actions button
                new String[]{"develop_b_actions_audit_data", getElements("develop_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH DEVELOPED";
        if (!Functions.detachTable(driver,
                new String[]{"develop_b_detach", getElements("develop_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA DEVELOPED";
        if(!Functions.doDelete(driver,
                new String[]{"develop_b_delete", getElements("develop_b_delete")},//delete button
                new String[]{"develop_e_ok_de", getElements("develop_e_ok_de")},//delete button
                where)){return false;}
        return true;
    }

    /**
     * TAB DEVELOPER TABLE DEVELOPER IP
     */
    public boolean interaction_add_t5 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABLE DEVELOPED IP";
        if (!Functions.checkClick(driver,
                new String[]{"develop_ip_b_add", getElements("develop_ip_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_ip",getElements("add_lov_ip")}, // b_lov
                new String[]{"add_i_ip", getElements("add_i_ip")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ip", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save5", getElements("add_b_save5")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABLE DEVELOPED IP";
        if (!Functions.checkClick(driver,
                new String[]{"develop_ip_b_edit", getElements("develop_ip_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_ip",getElements("add_lov_ip")}, // b_lov
                new String[]{"add_i_ip", getElements("add_i_ip")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ip", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save5", getElements("add_b_save5")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t5(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DEVELOPED IP";
        if (!Functions.clickQbE(driver,
                new String[]{"develop_ip_b_qbe", getElements("develop_ip_b_qbe")},// query button
                new String[]{"qbe_i_ip", getElements("qbe_i_ip")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ip", getElements("qbe_i_ip")},
                "ip", getData("ip"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_ip", getElements("qbe_i_ip")}, //any query input
                new String[]{"develop_ip_e_result", getElements("develop_ip_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t5(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA DEVELOPED IP";
        if (!Functions.auditData(driver,
                new String[]{"develop_ip_b_actions", getElements("develop_ip_b_actions")}, //actions button
                new String[]{"develop_ip_b_actions_audit_data", getElements("develop_ip_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH DEVELOPED IP";
        if (!Functions.detachTable(driver,
                new String[]{"develop_ip_b_detach", getElements("develop_ip_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t5(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA DEVELOPED IP";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"develop_ip_b_delete", getElements("develop_ip_b_delete")},
                new String[]{"develop_ip_e_records", getElements("develop_ip_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
