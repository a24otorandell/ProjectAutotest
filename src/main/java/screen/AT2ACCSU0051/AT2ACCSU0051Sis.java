package screen.AT2ACCSU0051;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 21/12/2016.
 */
public class AT2ACCSU0051Sis {
    protected AT2ACCSU0051Locators locators;
    protected AT2ACCSU0051Data data;

    public AT2ACCSU0051Sis (){

    }

    public AT2ACCSU0051Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCSU0051Locators locators){
        this.locators = locators;
    }
    public AT2ACCSU0051Data getData (){
        return data;
    }
    public void setData (AT2ACCSU0051Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Boards Maintenance");
    }
    protected String getElements (String key){
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData (String key){
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){
        if (!checkExist(driver)) return false;
        if (!interaction_record(driver)) return false;
        if (!search(driver)) return false;
       // if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!interaction_record_2(driver)) return false;
        if (!qbe_2(driver)) return false;
        if (!interaction_edit_2(driver)) return false;
        if (!qbe_2(driver)) return false;
        if (!others_actions_2(driver)) return false;
        if (!delete_2(driver)) return false;
        if (!delete(driver)) return false;
        return false;
    }

    /**
     * TABLE BOARD
     */
    public boolean checkExist (TestDriver driver) {
        if (!Functions.checkExistence(driver,
                "", //value
                "board_o",//data name (x)
                new String[]{"search_i_board_order", getElements("search_i_board_order")},//input
                new String[]{"search_b_search", getElements("search_b_search")},//search button
                new String[]{"board_e_result", getElements("board_e_result")},//expected not found result
                "integer",//type of input
                2, //value length
                "CHECK")){return false;}
        return true;
    }
    private boolean interaction_record(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"board_b_add", getElements("board_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_board", getElements("add_i_board")},
                "board", DataGenerator.getRandomAlphanumericSequence(1, true), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_sa"),"sa",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_board_order", getElements("add_i_board_order")},
                "board_o", getData("board_o"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_suplier"),"suplier",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 15, 400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"),"active",true,true,where)){return false;}
        Functions.break_time(driver, 5, 400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_sa"),"sa",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_board", getElements("search_i_board")},
                "board", getData("board"), where)) {
            return false;
        }
        Functions.break_time(driver, 5, 400);
        if (!Functions.insertInput(driver, new String[]{"search_i_board_order", getElements("search_i_board_order")},
                "board_o", getData("board_o"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"board_e_result", getElements("board_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"board_b_edit", getElements("board_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_board", getElements("add_i_board")},
                "board", DataGenerator.getRandomAlphanumericSequence(1, true), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_sa"),"sa",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_board_order", getElements("add_i_board_order")},
                "board_o", String.valueOf(DataGenerator.random(1, 100)), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_suplier"),"suplier",false,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"board_e_result", getElements("board_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"board_b_qbe", getElements("board_b_qbe")},// query button
                new String[]{"qbe_i_board", getElements("qbe_i_board")},//any query input
                where)){
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_board", getElements("qbe_i_board")},
                "board", getData("board"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_sa",getElements("qbe_sl_sa")},
                getData("sa"), "sa", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_board_order", getElements("qbe_i_board_order")},
                "board_o", getData("board_o"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_suplier",getElements("qbe_sl_suplier")},
                getData("suplier"), "suplier", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_board", getElements("qbe_i_board")}, //any query input
                new String[]{"board_e_result", getElements("board_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"board_b_actions", getElements("board_b_actions")}, //actions button
                new String[]{"board_b_actions_b_audit_data", getElements("board_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"board_b_detach", getElements("board_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"board_b_delete", getElements("board_b_delete")},
                new String[]{"board_e_records", getElements("board_e_records")},
                new String[]{"board_b_yes", getElements("board_b_yes")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TABLE LANGUAGE
     */
    private boolean interaction_record_2(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"lang_b_add", getElements("lang_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language_code",getElements("add_lov_language_code")}, // b_lov
                new String[]{"add_i_language_code", getElements("add_i_language_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_des_lang", getElements("add_i_des_lang")}, // element path
                "desc_lang", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_cod", getElements("add_i_cod")},
                "cod", DataGenerator.getRandomAlphanumericSequence(2, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean interaction_edit_2(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"lang_b_edit", getElements("lang_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language_code",getElements("add_lov_language_code")}, // b_lov
                new String[]{"add_i_language_code", getElements("add_i_language_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_des_lang", getElements("add_i_des_lang")}, // element path
                "desc_lang", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_cod", getElements("add_i_cod")},
                "cod", DataGenerator.getRandomAlphanumericSequence(2, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean qbe_2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"lang_b_qbe", getElements("lang_b_qbe")},// query button
                new String[]{"qbe_i_language_code", getElements("qbe_i_language_code")},//any query input
                where)){
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language_code", getElements("qbe_i_language_code")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_des_lang", getElements("qbe_i_des_lang")},
                "desc_lang", getData("desc_lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cod", getElements("qbe_i_cod")},
                "cod", getData("cod"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_language_code", getElements("qbe_i_language_code")}, //any query input
                new String[]{"lang_e_result", getElements("lang_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"lang_b_actions", getElements("lang_b_actions")}, //actions button
                new String[]{"lang_b_actions_b_audit_data", getElements("lang_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"lang_b_detach", getElements("lang_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean delete_2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"lang_b_delete", getElements("lang_b_delete")},
                new String[]{"lang_e_records", getElements("lang_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
