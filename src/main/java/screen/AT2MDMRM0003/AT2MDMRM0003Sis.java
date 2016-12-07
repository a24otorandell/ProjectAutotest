package screen.AT2MDMRM0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0003Sis {
    protected AT2MDMRM0003Locators locators;
    protected AT2MDMRM0003Data data;
    public AT2MDMRM0003Sis() {
    }
    public AT2MDMRM0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0003Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Time confirmation maintenance 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
/*        if (!interaction_add_characteristics(driver)) return false;
        if (!search_characteristics(driver)) return false;
        if (!interaction_edit_characteristics(driver)) return false;
        if (!qbe_characteristics(driver)) return false;
        if (!others_actions_characteristics(driver)) return false;
        if (!interaction_add_configuration(driver)) return false;
        if (!search_configuration(driver)) return false;
        if (!interaction_edit_configuration(driver)) return false;
        if (!qbe_configuration(driver)) return false;
        if (!others_actions_configuration(driver)) return false;*/
        if (!interaction_add_status(driver)) return false;
        if (!search_status(driver)) return false;
        if (!interaction_edit_status(driver)) return false;
        if (!qbe_status(driver)) return false;
        if (!others_actions_status(driver)) return false;
        if (!delete_status(driver)) return false;
/*        if (!delete_configuration(driver)) return false;
        if (!delete_characteristics(driver)) return false;*/
        return true;
    }

    /**
     * METHODS OF TAB CHARACTERISTICS
     * @param driver
     * @return
     */
    public boolean interaction_add_characteristics (TestDriver driver) {
        Functions.break_time(driver, 3, 400);
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TAB CHARACTERISTICS";
        if (!Functions.checkClick(driver,
                new String[]{"characteristics_b_add", getElements("characteristics_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_i_char_sequence",getElements("add_i_char_sequence")},
                "c_sequence", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_char_name",getElements("add_i_char_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(5,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_char_description",getElements("add_i_char_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(5,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_web_type",getElements("add_sl_web_type")},
                "Evolution","type" , where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_char_b_save", getElements("add_char_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_characteristics(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH TAB CHARACTERISTICS";
        if (!Functions.insertInput(driver, new String[]{"search_i_char_sequence",getElements("search_i_char_sequence")},
                "c_sequence", getData("c_sequence"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_char_name",getElements("search_i_char_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_char_description",getElements("search_i_char_description")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_web_type",getElements("search_sl_web_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_char_b_search", getElements("search_char_b_search")}, //search button
                new String[]{"characteristics_e_result", getElements("characteristics_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_characteristics(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TAB CHARACTERISTICS";
        if (!Functions.checkClick(driver,
                new String[]{"characteristics_b_edit", getElements("characteristics_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_i_char_sequence",getElements("add_i_char_sequence")},
                "c_sequence", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_char_name",getElements("add_i_char_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(5,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_char_description",getElements("add_i_char_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(5,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_web_type",getElements("add_sl_web_type")},
                "Evolution","type" , where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_char_b_save", getElements("add_char_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_characteristics(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE TAB CHARACTERISTICS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_char_b_reset", getElements("search_char_b_reset")}, //search button
                new String[]{"characteristics_e_result", getElements("characteristics_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"characteristics_b_qbe", getElements("characteristics_b_qbe")},// query button
                new String[]{"qbe_i_char_sequence", getElements("qbe_i_char_sequence")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_char_sequence", getElements("qbe_i_char_sequence")},
                "c_sequence", getData("c_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_char_name", getElements("qbe_i_char_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_char_description", getElements("qbe_i_char_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_web_type",getElements("qbe_sl_web_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_char_sequence", getElements("qbe_i_char_sequence")}, //any query input
                new String[]{"characteristics_e_result", getElements("characteristics_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_characteristics(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA TAB CHARACTERISTICS";
        if (!Functions.auditData(driver,
                new String[]{"characteristics_b_actions", getElements("characteristics_b_actions")}, //actions button
                new String[]{"characteristics_b_actions_b_audit_data", getElements("characteristics_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TAB CHARACTERISTICS";
        if (!Functions.detachTable(driver,
                new String[]{"characteristics_b_detach", getElements("characteristics_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_characteristics(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA TAB CHARACTERISTICS";
        if (!Functions.simpleClick(driver,
                new String[]{"characteristics_tab", getElements("characteristics_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"characteristics_b_delete", getElements("characteristics_b_delete")},
                new String[]{"characteristics_e_records", getElements("characteristics_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TAB CONFIGURATION
     * @param driver
     * @return
     */
    public boolean interaction_add_configuration (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TAB CONFIGURATION";
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_tab", getElements("configuration_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"configuration_b_add", getElements("configuration_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_i_sequence",getElements("add_i_sequence")},
                "sequence", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_atlas_agency_code",getElements("add_lov_atlas_agency_code")}, // b_lov
                new String[]{"add_i_atlas_agency_code", getElements("add_i_atlas_agency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "a_code", //Data name
                where)){return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_agency",getElements("add_i_agency")},
                "agency", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web_code",getElements("add_lov_web_code")}, // b_lov
                new String[]{"add_i_web_code", getElements("add_i_web_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_code", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_web_description",getElements("add_i_web_description")},
                "web_des", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_configuration_b_save", getElements("add_configuration_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_configuration(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH TAB CONFIGURATION";
        if (!Functions.insertInput(driver, new String[]{"search_i_sequence",getElements("search_i_sequence")},
                "sequence", getData("sequence"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_atlas_agency_code", getElements("search_lov_atlas_agency_code")}, //LoV button
                new String[]{"search_i_atlas_agency_code", getElements("search_i_atlas_agency_code")}, //external LoV input
                new String[]{"search_lov_atlas_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("a_code"), // value to search
                "a_code", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_web_code", getElements("search_lov_web_code")}, //LoV button
                new String[]{"search_i_web_code", getElements("search_i_web_code")}, //external LoV input
                new String[]{"search_lov_web_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("web_code"), // value to search
                "web_code", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_conf_b_search", getElements("search_conf_b_search")}, //search button
                new String[]{"configuration_e_result", getElements("configuration_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_configuration(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TAB CONFIGURATION";
        if (!Functions.checkClick(driver,
                new String[]{"configuration_b_edit", getElements("configuration_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_sequence",getElements("add_i_sequence")},
                "sequence", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_atlas_agency_code",getElements("add_lov_atlas_agency_code")}, // b_lov
                new String[]{"add_i_atlas_agency_code", getElements("add_i_atlas_agency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "a_code", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_agency",getElements("add_i_agency")},
                "agency", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web_code",getElements("add_lov_web_code")}, // b_lov
                new String[]{"add_i_web_code", getElements("add_i_web_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_code", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_web_description",getElements("add_i_web_description")},
                "web_des", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_configuration_b_save", getElements("add_configuration_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_configuration(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE TAB CONFIGURATION";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_conf_b_reset", getElements("search_conf_b_reset")}, //search button
                new String[]{"configuration_e_result", getElements("configuration_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"configuration_b_qbe", getElements("configuration_b_qbe")},// query button
                new String[]{"qbe_i_sequence", getElements("qbe_i_sequence")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sequence", getElements("qbe_i_sequence")},
                "sequence", getData("sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_agency_code", getElements("qbe_i_atlas_agency_code")},
                "a_code", getData("a_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web_code", getElements("qbe_i_web_code")},
                "web_code", getData("web_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web_description", getElements("qbe_i_web_description")},
                "web_des", getData("web_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_sequence", getElements("qbe_i_sequence")}, //any query input
                new String[]{"configuration_e_result", getElements("configuration_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_configuration(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA TAB CONFIGURATION";
        if (!Functions.auditData(driver,
                new String[]{"configuration_b_actions", getElements("configuration_b_actions")}, //actions button
                new String[]{"configuration_b_actions_b_audit_data", getElements("configuration_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TAB CONFIGURATION";
        if (!Functions.detachTable(driver,
                new String[]{"configuration_b_detach", getElements("configuration_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_configuration(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA TAB CONFIGURATION";
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_tab", getElements("configuration_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"configuration_b_delete", getElements("configuration_b_delete")},
                new String[]{"configuration_e_records", getElements("configuration_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TAB STATUS
     * @param driver
     * @return
     */
    public boolean interaction_add_status (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD TAB STATUS";
        if (!Functions.simpleClick(driver,
                new String[]{"status_tab", getElements("status_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"status_b_add", getElements("status_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_characteristic_sequence",getElements("add_lov_characteristic_sequence")}, // b_lov
                new String[]{"add_i_characteristic_sequence", getElements("add_i_characteristic_sequence")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "char_seq", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_configuration_sequence",getElements("add_lov_configuration_sequence")}, // b_lov
                new String[]{"add_i_configuration_sequence", getElements("add_i_configuration_sequence")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "conf_seq", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "ACTIVE", "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_est_value",getElements("add_i_est_value")},
                "value", String.valueOf(DataGenerator.random(1,10)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_status_b_save", getElements("add_status_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_status(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH TAB STATUS";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_characteristic_sequence", getElements("search_lov_characteristic_sequence")}, //LoV button
                new String[]{"search_i_characteristic_sequence", getElements("search_i_characteristic_sequence")}, //external LoV input
                new String[]{"search_lov_char_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("char_seq"), // value to search
                "char_seq", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_configuration_sequence", getElements("search_lov_configuration_sequence")}, //LoV button
                new String[]{"search_i_configuration_sequence", getElements("search_i_configuration_sequence")}, //external LoV input
                new String[]{"search_lov_confi_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("conf_seq"), // value to search
                "conf_seq", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_status",getElements("search_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_est_value",getElements("search_i_est_value")},
                "value", getData("value"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_status_b_search", getElements("search_status_b_search")}, //search button
                new String[]{"status_e_result", getElements("status_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_status(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION TAB STATUS";
        if (!Functions.checkClick(driver,
                new String[]{"status_b_edit", getElements("status_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
/*        if(!Functions.createLov(driver,
                new String[]{"add_lov_characteristic_sequence",getElements("add_lov_characteristic_sequence")}, // b_lov
                new String[]{"add_i_characteristic_sequence", getElements("add_i_characteristic_sequence")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult,// lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "char_seq", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_configuration_sequence",getElements("add_lov_configuration_sequence")}, // b_lov
                new String[]{"add_i_configuration_sequence", getElements("add_i_configuration_sequence")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "conf_seq", //Data name
                where)){return false;}*/
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status",getElements("add_sl_status")},
                "INACTIVE", "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_est_value",getElements("add_i_est_value")},
                "value", String.valueOf(DataGenerator.random(1,10)), where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_char_name", getElements("add_i_char_name")}, // element path
                "char_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_char_desc", getElements("add_i_char_desc")}, // element path
                "char_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_agency", getElements("add_i_agency")}, // element path
                "agency", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_idweb", getElements("add_i_idweb")}, // element path
                "idw", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_sl_evolution", getElements("add_sl_evolution")}, // element path
                "evolution", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_status_b_save", getElements("add_status_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_status(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE TAB STATUS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_status_b_reset", getElements("search_status_b_reset")}, //search button
                new String[]{"status_e_result", getElements("status_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"status_b_qbe", getElements("status_b_qbe")},// query button
                new String[]{"qbe_i_characteristic_sequence", getElements("qbe_i_characteristic_sequence")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_characteristic_sequence", getElements("qbe_i_characteristic_sequence")},
                "char_seq", getData("char_seq"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_configuration_sequence", getElements("qbe_i_configuration_sequence")},
                "conf_seq", getData("conf_seq"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status",getElements("qbe_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_est_value", getElements("qbe_i_est_value")},
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_char_name", getElements("qbe_i_char_name")},
                "char_name", getData("char_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_char_desc", getElements("qbe_i_char_desc")},
                "char_desc", getData("char_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_idweb", getElements("qbe_i_idweb")},
                "idw", getData("idw"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 200);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_evolution",getElements("qbe_sl_evolution")},
                getData("evolution"), "evolution", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_characteristic_sequence", getElements("qbe_i_characteristic_sequence")}, //any query input
                new String[]{"status_e_result", getElements("status_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_status(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA TAB STATUS";
        if (!Functions.auditData(driver,
                new String[]{"status_b_actions", getElements("status_b_actions")}, //actions button
                new String[]{"status_b_actions_b_audit_data", getElements("status_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH TAB STATUS";
        if (!Functions.detachTable(driver,
                new String[]{"status_b_detach", getElements("status_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_status(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA TAB STATUS";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"status_b_delete", getElements("status_b_delete")},
                new String[]{"status_e_records", getElements("status_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
