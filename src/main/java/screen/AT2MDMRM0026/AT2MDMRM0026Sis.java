package screen.AT2MDMRM0026;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMRM0026Sis {
    protected AT2MDMRM0026Locators locators;
    protected AT2MDMRM0026Data data;
    public AT2MDMRM0026Sis() {
    }
    public AT2MDMRM0026Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0026Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0026Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0026Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Countries");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!interaction_add_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!interaction_edit_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!others_actions_multi(driver)) return false;
        if (!delete_multi(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    /**
     * METHODS OF TABBLE PRODUCTS
     * @param driver
     * @return
     */
    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"segment_b_add", getElements("segment_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_code",getElements("add_code")},
                "code", String.valueOf(DataGenerator.random(1,450)), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_type", getElements("add_lov_type")}, //LoV button
                new String[]{"add_i_type", getElements("add_i_type")}, //external LoV input
                new String[]{"add_lov_type_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "Refine", // value to search
                "type", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_desc", getElements("add_i_desc")}, // element path
                "desc_type", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("desc_type"), "desc_type", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"segment_e_result", getElements("segment_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"segment_b_edit", getElements("segment_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_code",getElements("add_code")},
                "code", String.valueOf(DataGenerator.random(1,450)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"segment_e_result", getElements("segment_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"segment_b_qbe", getElements("segment_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "desc_type", getData("desc_type"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"segment_e_result", getElements("segment_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"segment_b_actions", getElements("segment_b_actions")}, //actions button
                new String[]{"segment_b_actions_b_audit_data", getElements("segment_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"segment_b_detach", getElements("segment_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"segment_b_delete", getElements("segment_b_delete")},
                new String[]{"segment_e_records", getElements("segment_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TABLE MULTI
     * @param driver
     * @return
     */
    public boolean interaction_add_multi (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_add", getElements("multi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language",getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_lang_des",getElements("add_i_lang_des")},
                "desc", DataGenerator.getRandomAlphanumericSequence(7,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_multi(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_edit", getElements("multi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_lang_des", getElements("add_i_lang_des")},
                "desc", DataGenerator.getRandomAlphanumericSequence(7, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_multi(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"multi_b_qbe", getElements("multi_b_qbe")},// query button
                new String[]{"qbe_i_language", getElements("qbe_i_language")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang_des", getElements("qbe_i_lang_des")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_language", getElements("qbe_i_language")}, //any query input
                new String[]{"multi_e_result", getElements("multi_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_multi(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"multi_b_actions", getElements("multi_b_actions")}, //actions button
                new String[]{"multi_b_actions_b_audit_data", getElements("multi_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"multi_b_detach", getElements("multi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_multi(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"multi_b_delete", getElements("multi_b_delete")},
                new String[]{"multi_e_records", getElements("multi_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
