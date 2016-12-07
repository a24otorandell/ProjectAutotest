package screen.AT2MDMRM0035;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 21/11/2016.
 */
public class AT2MDMRM0035Test {
    protected AT2MDMRM0035Locators locators;
    protected AT2MDMRM0035Data data;
    public AT2MDMRM0035Test() {
    }
    public AT2MDMRM0035Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0035Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0035Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0035Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Tabs configuration");
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
        if (!qbe_t4(driver, false)) return false;
        if (!interaction_edit_t4(driver)) return false;
        if (!qbe_t4(driver, true)) return false;
        if (!others_actions_t4(driver)) return false;
        if (!delete_t4(driver)) return false;
/*        if (!delete_t3(driver)) return false;
        if (!delete_t2(driver)) return false;
        if (!delete_t1(driver)) return false;*/
        return true;
    }

    /**
     * TABLE CONFIGURATION
     * @param driver
     * @return
     */
    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD CONFIGURATION";
        if (!Functions.checkClick(driver,
                new String[]{"configurations_b_add", getElements("configurations_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
/*        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, //LoV button
                new String[]{"add_i_interface", getElements("add_i_interface")}, //external LoV input
                new String[]{"add_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "W", // value to search
                "interface", //name of the data
                where)){return false;}*/
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web_desc",getElements("add_lov_web_desc")}, // b_lov
                new String[]{"add_i_web_desc", getElements("add_i_web_desc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_desc", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_web", getElements("add_i_web")}, // element path
                "web", // key for data value (the name)
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status1",getElements("add_sl_status1")},
                "Active", "status", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_ttoo_desc",getElements("add_lov_ttoo_desc")}, // b_lov
                new String[]{"add_i_ttoo_desc", getElements("add_i_ttoo_desc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_desc", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_ttoo", getElements("add_i_ttoo")}, // element path
                "to", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH CONFIGURATION";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_web_desc", getElements("search_lov_web_desc")}, //LoV button
                new String[]{"search_i_web_desc", getElements("search_i_web_desc")}, //external LoV input
                new String[]{"search_lov_web_desc_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("web_desc"), // value to search
                "web_desc", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_status",getElements("search_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_ttoo_desc", getElements("search_lov_ttoo_desc")}, //LoV button
                new String[]{"search_i_ttoo_desc", getElements("search_i_ttoo_desc")}, //external LoV input
                new String[]{"search_lov_ttoo_desc_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "%"+getData("to_desc"), // value to search
                "to_desc", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"configurations_e_result", getElements("configurations_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION CONFIGURATION";
        if (!Functions.checkClick(driver,
                new String[]{"configurations_b_edit", getElements("configurations_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
/*        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, //LoV button
                new String[]{"add_i_interface", getElements("add_i_interface")}, //external LoV input
                new String[]{"add_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "W", // value to search
                "interface", //name of the data
                where)){return false;}*/
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web_desc",getElements("add_lov_web_desc")}, // b_lov
                new String[]{"add_i_web_desc", getElements("add_i_web_desc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_desc", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_web", getElements("add_i_web")}, // element path
                "web", // key for data value (the name)
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status1",getElements("add_sl_status1")},
                "Inactive", "status", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_ttoo_desc",getElements("add_lov_ttoo_desc")}, // b_lov
                new String[]{"add_i_ttoo_desc", getElements("add_i_ttoo_desc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_desc", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_ttoo", getElements("add_i_ttoo")}, // element path
                "to", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE CONFIGURATION";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"configurations_e_result", getElements("configurations_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"configurations_b_qbe", getElements("configurations_b_qbe")},// query button
                new String[]{"qbe_i_web", getElements("qbe_i_web")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web", getElements("qbe_i_web")},
                "web", getData("web"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web_desc", getElements("qbe_i_web_desc")},
                "web_desc", getData("web_desc"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status1",getElements("qbe_sl_status1")},
                getData("status"), "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ttoo", getElements("qbe_i_ttoo")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ttoo_desc", getElements("qbe_i_ttoo_desc")},
                "to_desc", getData("to_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_web", getElements("qbe_i_web")}, //any query input
                new String[]{"configurations_e_result", getElements("configurations_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA CONFIGURATION";
        if(!Functions.auditData(driver,
                new String[]{"configurations_b_actions",getElements("configurations_b_actions")}, //actions button
                new String[]{"configurations_b_actions_b_audit_data",getElements("configurations_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH CONFIGURATION";
        if (!Functions.detachTable(driver,
                new String[]{"configurations_b_detach", getElements("configurations_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA CONFIGURATION";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"configurations_b_delete", getElements("configurations_b_delete")}, //button delete
                new String[]{"configurations_e_records", getElements("configurations_e_records")}, // result
                where)){return false;}
        return true;
    }

    /**
     * TABLE TABS
     */
    public boolean interaction_add_t2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABS";
        if (!Functions.checkClick(driver,
                new String[]{"tabs_b_add", getElements("tabs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_nombre", getElements("add_i_nombre")},
                "nombre", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_desc", getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_orden", getElements("add_i_orden")},
                "orden", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status2",getElements("add_sl_status2")},
                "Active", "status2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_img_on", getElements("add_i_img_on")},
                "i_on", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_img_off", getElements("add_i_img_off")},
                "i_off", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_img_detalle", getElements("add_i_img_detalle")},
                "i_detall", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
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
        String where = " on EDITTION TABS";
        if (!Functions.checkClick(driver,
                new String[]{"tabs_b_edit", getElements("tabs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_nombre", getElements("add_i_nombre")},
                "nombre", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_desc", getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_orden", getElements("add_i_orden")},
                "orden", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status2",getElements("add_sl_status2")},
                "Inactive", "status2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_img_on", getElements("add_i_img_on")},
                "i_on", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_img_off", getElements("add_i_img_off")},
                "i_off", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_img_detalle", getElements("add_i_img_detalle")},
                "i_detall", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
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
        String where = " on QBE TAB";
        if (!Functions.clickQbE(driver,
                new String[]{"tabs_b_qbe", getElements("tabs_b_qbe")},// query button
                new String[]{"qbe_i_nombre", getElements("qbe_i_nombre")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_nombre", getElements("qbe_i_nombre")},
                "nombre", getData("nombre"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_orden", getElements("qbe_i_orden")},
                "orden", getData("orden"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status2",getElements("qbe_sl_status2")},
                getData("status2"), "status2", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_nombre", getElements("qbe_i_nombre")}, //any query input
                new String[]{"tabs_e_result", getElements("tabs_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA TAB";
        if(!Functions.auditData(driver,
                new String[]{"tabs_b_actions",getElements("tabs_b_actions")}, //actions button
                new String[]{"tabs_b_actions_b_audit_data",getElements("tabs_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TAB";
        if (!Functions.detachTable(driver,
                new String[]{"tabs_b_detach", getElements("tabs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA TAB";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"tabs_b_delete", getElements("tabs_b_delete")}, //button delete
                new String[]{"tabs_e_records", getElements("tabs_e_records")}, // result
                where)){return false;}
        return true;
    }

    /**
     * TABLE LABELS
     */
    public boolean interaction_add_t3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD LABELS";
        if (!Functions.checkClick(driver,
                new String[]{"labels_b_add", getElements("labels_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc_lang", getElements("add_i_desc_lang")},
                "desc_lang", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION LABELS";
        if (!Functions.checkClick(driver,
                new String[]{"labels_b_edit", getElements("labels_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc_lang", getElements("add_i_desc_lang")},
                "desc_lang", DataGenerator.getRandomAlphanumericSequence(6,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE LABELS";
        if (!Functions.clickQbE(driver,
                new String[]{"labels_b_qbe", getElements("labels_b_qbe")},// query button
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc_lang", getElements("qbe_i_desc_lang")},
                "desc_lang", getData("desc_lang"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")}, //any query input
                new String[]{"labels_e_result", getElements("labels_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA LABELS";
        if(!Functions.auditData(driver,
                new String[]{"labels_b_actions",getElements("labels_b_actions")}, //actions button
                new String[]{"labels_b_actions_b_audit_data",getElements("labels_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH LABELS";
        if (!Functions.detachTable(driver,
                new String[]{"labels_b_detach", getElements("labels_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA LABELS";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"labels_b_delete", getElements("labels_b_delete")}, //button delete
                new String[]{"labels_e_records", getElements("labels_e_records")}, // result
                where)){return false;}
        return true;
    }

    /**
     * TABLE TABS CONTENT
     */
    public boolean interaction_add_t4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TABS CONTENT";
        if (!Functions.checkClick(driver,
                new String[]{"tabs_c_b_add", getElements("tabs_c_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_zones",getElements("add_lov_zones")}, // b_lov
                new String[]{"add_i_zones", getElements("add_i_zones")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "zones", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_zones_desc", getElements("add_i_zones_desc")}, // element path
                "zones_desc", // key for data value (the name)
                where)){return false;}
/*        if(!Functions.createLov(driver,
                new String[]{"add_lov_dest_gr",getElements("add_lov_dest_gr")}, // b_lov
                new String[]{"add_i_dest_gr", getElements("add_i_dest_gr")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dest", //Data name
                where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"add_i_dest_gr", getElements("add_i_dest_gr")},
                "dest", "", where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_dest_gr_desc", getElements("add_i_dest_gr_desc")}, // element path
                "dest_desc", // key for data value (the name)
                where)){return false;}
/*        if(!Functions.createLov(driver,
                new String[]{"add_lov_destination",getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destina", //Data name
                where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"add_i_destination", getElements("add_i_destination")},
                "destina", "", where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_destination_desc", getElements("add_i_destination_desc")}, // element path
                "destina_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")},
                "order", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status3",getElements("add_sl_status3")},
                "Active", "status3", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TABS CONTENTS ";
        if (!Functions.checkClick(driver,
                new String[]{"tabs_c_b_edit", getElements("tabs_c_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_zones", getElements("add_i_zones")},
                "zones", "", where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_zones_desc", getElements("add_i_zones_desc")}, // element path
                "zones_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_dest_gr",getElements("add_lov_dest_gr")}, // b_lov
                new String[]{"add_i_dest_gr", getElements("add_i_dest_gr")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dest", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_dest_gr_desc", getElements("add_i_dest_gr_desc")}, // element path
                "dest_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_destination",getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destina", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_destination_desc", getElements("add_i_destination_desc")}, // element path
                "destina_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")},
                "order", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status3",getElements("add_sl_status3")},
                "Inactive", "status3", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t4(TestDriver driver, boolean second) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE TABS CONTENTS";
        if (!Functions.clickQbE(driver,
                new String[]{"tabs_c_b_qbe", getElements("tabs_c_b_qbe")},// query button
                new String[]{"qbe_i_zones_gr", getElements("qbe_i_zones_gr")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (second) {
            if (!Functions.insertInput(driver, new String[]{"qbe_i_zones_gr", getElements("qbe_i_zones_gr")},
                    "zones", "", where)) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"qbe_i_zones_desc", getElements("qbe_i_zones_desc")},
                    "zones_desc", "", where)) {
                return false;
            }
        }
        else {
            if (!Functions.insertInput(driver, new String[]{"qbe_i_zones_gr", getElements("qbe_i_zones_gr")},
                    "zones", getData("zones"), where)) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"qbe_i_zones_desc", getElements("qbe_i_zones_desc")},
                    "zones_desc", getData("zones_desc"), where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest_gr", getElements("qbe_i_dest_gr")},
                "dest", getData("dest"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest_desc", getElements("qbe_i_dest_desc")},
                "dest_desc", getData("dest_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destina", getData("destina"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_desc", getElements("qbe_i_destination_desc")},
                "destina_desc", getData("destina_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status3",getElements("qbe_sl_status3")},
                getData("status3"), "status3", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_zones_gr", getElements("qbe_i_zones_gr")}, //any query input
                new String[]{"tabs_c_e_result", getElements("tabs_c_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t4(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA TABS CONTENTS";
        if(!Functions.auditData(driver,
                new String[]{"tabs_c_b_actions",getElements("tabs_c_b_actions")}, //actions button
                new String[]{"tabs_c_b_actions_b_audit_data",getElements("tabs_c_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TABS CONTENTS";
        if (!Functions.detachTable(driver,
                new String[]{"tabs_c_b_detach", getElements("tabs_c_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA TABS CONTENTS";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"tabs_c_b_delete", getElements("tabs_c_b_delete")}, //button delete
                new String[]{"tabs_c_e_records", getElements("tabs_c_e_records")}, // result
                where)){return false;}
        return true;
    }
}
