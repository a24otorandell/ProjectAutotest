package screen.AT2CARSU0012;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2CARSU0012Sis {
    protected AT2CARSU0012Locators locators;
    protected AT2CARSU0012Data data;

    public AT2CARSU0012Sis() {

    }
    public AT2CARSU0012Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0012Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0012Data getData() {
        return data;
    }
    public void setData(AT2CARSU0012Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Car Hire");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Language Mapping");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_commision(driver)) return false;
        if (!search_commision(driver)) return false;
        if (!interaction_edit_commision(driver)) return false;
        if (!qbe_languaje(driver)) return false;
        if (!others_actions_languaje(driver)) return false;
        if (!delete_languaje(driver)) return false;
        return false;
    }

    private boolean interaction_record_commision(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"languaje_b_add", getElements("languaje_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_external_lang", getElements("add_i_external_lang")},
                "ext_lang", DataGenerator.getRandomAlphanumericSequence(3,false), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_external_int", getElements("add_lov_external_int")}, // b_lov
                new String[]{"add_i_external_int", getElements("add_i_external_int")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ext_int", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_des_external", getElements("add_i_des_external")}, // element path
                "desc_lang", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas", getElements("add_lov_atlas")}, // b_lov
                new String[]{"add_i_atlas_lan", getElements("add_i_atlas_lan")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_des_altas", getElements("add_i_des_altas")}, // element path
                "desc", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_commision(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_external", getElements("search_lov_external")}, //LoV button
                new String[]{"search_i_external", getElements("search_i_external")}, //external LoV input
                new String[]{"search_lov_external_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("ext_int"), // value to search
                "ext_int", //name of the data
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"languaje_e_result", getElements("languaje_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_commision(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDIT";
        if (!Functions.checkClick(driver,
                new String[]{"languaje_b_edit", getElements("languaje_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_external_lang", getElements("add_i_external_lang")},
                "ext_lang", DataGenerator.getRandomAlphanumericSequence(3,false), where)) {
            return false;
        }
       /* if (!Functions.createLov(driver,
                new String[]{"add_lov_external_int", getElements("add_lov_external_int")}, // b_lov
                new String[]{"add_i_external_int", getElements("add_i_external_int")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ext_int", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_des_external", getElements("add_i_des_external")}, // element path
                "desc_lang", // key for data value (the name)
                where)) {
            return false;
        }*/
/*        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas", getElements("add_lov_atlas")}, // b_lov
                new String[]{"add_i_atlas_lan", getElements("add_i_atlas_lan")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_atlas", getElements("add_lov_atlas")}, //LoV button
                new String[]{"add_i_atlas_lan", getElements("add_i_atlas_lan")}, //external LoV input
                new String[]{"add_lov_atlas_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "BRI", // value to search
                "atlas", //name of the data
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_des_altas", getElements("add_i_des_altas")}, // element path
                "desc", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_languaje(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"languaje_e_result", getElements("languaje_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"languaje_b_qbe", getElements("languaje_b_qbe")},// query button
                new String[]{"qbe_i_external_lang", getElements("qbe_i_external_lang")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_lang", getElements("qbe_i_external_lang")},
                "ext_lang", getData("ext_lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_int", getElements("qbe_i_external_int")},
                "ext_int", getData("ext_int"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc_lang", getElements("qbe_i_desc_lang")},
                "desc_lang", getData("desc_lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas", getElements("qbe_i_atlas")},
                "atlas", getData("atlas"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_atlas", getElements("qbe_i_atlas")}, //any query input
                new String[]{"languaje_e_result", getElements("languaje_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_languaje(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"languaje_b_actions", getElements("languaje_b_actions")}, //actions button
                new String[]{"languaje_b_actions_b_audit_data", getElements("languaje_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"languaje_b_detach", getElements("languaje_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_languaje(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"languaje_b_delete", getElements("languaje_b_delete")},
                new String[]{"languaje_e_records", getElements("languaje_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
