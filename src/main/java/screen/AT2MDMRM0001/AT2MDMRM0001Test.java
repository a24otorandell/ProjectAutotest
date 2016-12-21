package screen.AT2MDMRM0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 24/11/2016.
 */

/**
 * DATOS HARDCODEADOS PARA TENER DATOS EN TODOS LOS SITIOS
 */
public class AT2MDMRM0001Test {
    protected AT2MDMRM0001Locators locators;
    protected AT2MDMRM0001Data data;
    boolean act1, act2, act3, act4, act5, act6, act7, act8;
    public AT2MDMRM0001Test() {
    }
    public AT2MDMRM0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0001Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0001Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Contract Classification");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!getData(driver)) return false;
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
        if (!delete_t3(driver)) return false;
        if (!delete_t2(driver)) return false;
        if (!activaTabla4(driver)) return false;
        if (!interaction_add_t4(driver)) return false;
        if (!qbe_t4(driver)) return false;
        if (!interaction_edit_t4(driver)) return false;
        if (!qbe_t4(driver)) return false;
        if (!others_actions_t4(driver)) return false;
        if (!delete_t4(driver)) return false;
        return true;
    }

    /**
     * TABLE CLASSIFICATION
     * @param driver
     * @return
     */
    public boolean getData (TestDriver driver) {
        driver.getReport().addHeader("GET DATA RECORD", 3, false);
        String where = "GET DATA 1";
        if (!Functions.simpleClick(driver,
                new String[]{"classif_e_result", getElements("classif_e_result")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"classif_b_edit", getElements("classif_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_code", getElements("add_i_code")}, // element path
                "code", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_sl_type", getElements("add_sl_type")}, // element path
                "type", // key for data value (the name)
                where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_sl_distribution", getElements("add_sl_distribution")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "dist", // key for data value (the name)
                where);
        if (!Functions.getAttr(driver,
                new String[]{"add_i_priority", getElements("add_i_priority")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "priority", // key for data value (the name)
                where)) {
            return false;}
        Functions.getAttr(driver,
                new String[]{"add_sl_application_type", getElements("add_sl_application_type")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "app_type", // key for data value (the name)
                where);
        Functions.getAttr(driver,
                new String[]{"add_sl_classification", getElements("add_sl_classification")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "class", // key for data value (the name)
                where);
        try {
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_offer", getElements("add_ck_offer")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "offer", // key for data value (the name)
                    where)) {
                    return false;}
            if (getData("offer").equalsIgnoreCase("null")) {
                act1 = false;
            }
            else if (getData("offer").equalsIgnoreCase("true")){
                act1 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_enters", getElements("add_ck_enters")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "enters", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("enters").equalsIgnoreCase("null")) {
                act2 = false;
            }
            else if (getData("enters").equalsIgnoreCase("true")) {
                act2 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_active", getElements("add_ck_active")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "active", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("active").equalsIgnoreCase("null")) {
                act3 = false;
            }
            else if (getData("active").equalsIgnoreCase("true")){
                act3 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_restrictive", getElements("add_ck_restrictive")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "rest", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("rest").equalsIgnoreCase("null")) {
                act4 = false;
            }
            else if (getData("rest").equalsIgnoreCase("true")){
                act4 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_opaque", getElements("add_ck_opaque")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "opaque", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("opaque").equalsIgnoreCase("null")) {
                act5 = false;
            }
            else if (getData("opaque").equalsIgnoreCase("true")){
                act5 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_pep", getElements("add_ck_pep")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "pep", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("pep").equalsIgnoreCase("null")) {
                act6 = false;
            }
            else if (getData("pep").equalsIgnoreCase("true")){
                act6 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_liberate", getElements("add_ck_liberate")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "liberate", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("liberate").equalsIgnoreCase("null")) {
                act7 = false;
            }
            else if (getData("liberate").equalsIgnoreCase("true")){
                act7 = true;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_nrf", getElements("add_ck_nrf")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "nrf", // key for data value (the name)
                    where)) {
                return false;}
            if (getData("nrf").equalsIgnoreCase("null")) {
                act8 = false;
            }
            else if (getData("nrf").equalsIgnoreCase("true")) {
                act8 = true;
            }
        }
        catch (Exception e) {
            System.out.print(e);
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_distribution",getElements("search_sl_distribution")},
                getData("dist"), "dist", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_offer"),"offer",act1, true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_enters"),"enters",act2, true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"),"active",act3, true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_restrictive"),"rest",act4, true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_priority",getElements("search_i_priority")},
                "priority", getData("priority"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_application_type",getElements("search_sl_application_type")},
                getData("app_type"), "app_type", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_opaque"),"opaque",act5, true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_pep"),"pep",act6, true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_liberate"),"liberate",act7, true,where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_classification",getElements("search_sl_classification")},
                getData("class"), "class", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_nrf"),"nrf",act8, true,where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"classif_e_result", getElements("classif_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"classif_b_edit", getElements("classif_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_distribution",getElements("add_sl_distribution")},
                "Special", "dist", where)){return false;}
        if (act2) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_enters"),"enters",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_enters"),"enters",true,true,where)){return false;}
        }
        if (act3) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_active"),"active",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_active"),"active",true,true,where)){return false;}
        }
        if (act4) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_restrictive"),"rest",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_restrictive"),"rest",true,true,where)){return false;}
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_priority",getElements("add_i_priority")},
                "priority", String.valueOf(DataGenerator.random(1,80)),where)){return false;}

        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_type",getElements("add_sl_application_type")},
                "Rate", "app_type", where)){return false;}
        if (act5) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_opaque"),"opaque",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_opaque"),"opaque",true,true,where)){return false;}
        }
        if (act6) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_pep"),"pep",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_pep"),"pep",true,true,where)){return false;}
        }
        if (act7) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_liberate"),"liberate",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_liberate"),"liberate",true,true,where)){return false;}
        }
        if (act8) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_nrf"),"nrf",false,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_nrf"),"nrf",true,true,where)){return false;}
        }

        if (!Functions.selectText(driver,
                new String[]{"add_sl_classification",getElements("add_sl_classification")},
                "Accommodation","class" , where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"classif_e_result", getElements("classif_e_result")}, //result element
                where)) {
            return false;
        }
        Functions.zoomOut(driver);
        if (!Functions.clickQbE(driver,
                new String[]{"classif_b_qbe", getElements("classif_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_distribution",getElements("qbe_sl_distribution")},
                getData("dist"), "dist", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_offer",getElements("qbe_sl_offer")},
                getData("offer"), "offer", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_enters",getElements("qbe_sl_enters")},
                getData("enters"), "enters", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_classification",getElements("qbe_sl_classification")},
                getData("class"), "class", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_restrictive",getElements("qbe_sl_restrictive")},
                getData("rest"), "rest", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_priority", getElements("qbe_i_priority")},
                "priority", getData("priority"), where)) {
            return false;
        }
        Functions.zoomOut(driver);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_application_type",getElements("qbe_sl_application_type")},
                getData("app_type"), "app_type", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_opaque",getElements("qbe_sl_opaque")},
                getData("opaque"), "opaque", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_pep",getElements("qbe_sl_pep")},
                getData("pep"), "pep", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_liberate",getElements("qbe_sl_liberate")},
                getData("liberate"), "liberate", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"classif_e_result", getElements("classif_e_result")}, //table result
                where)){return false;}
        return true;
    }
    public boolean activaTabla4 (TestDriver driver) {
        driver.getReport().addHeader("ACTIVA TABLA 4", 3, false);
        String where = " on ACTIVAR TABLA 4";
        if (!Functions.simpleClick(driver,
                new String[]{"classif_b_reset", getElements("classif_b_reset")}, //element to click
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                "Retailer sale", "type", where)){return false;}
        Functions.break_time(driver, 3, 500);
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"classif_b_actions", getElements("classif_b_actions")}, //actions button
                new String[]{"classif_b_actions_b_audit_data", getElements("classif_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"classif_b_detach", getElements("classif_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INCOMPATIBILITY
     */
    private boolean interaction_add_t2(TestDriver driver) {
        driver.getReport().addHeader("CREATE RECORD", 3, false);
        String where = " on ADD 2";
        if (!Functions.checkClick(driver,
                new String[]{"incompa_b_add", getElements("incompa_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_code",getElements("add_lov_code")}, // b_lov
                new String[]{"add_i_code2", getElements("add_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code2", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type2",getElements("add_sl_type2")},
                "Retailer sale", "type2", where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "c_desc",where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"incompa_b_edit", getElements("incompa_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_code",getElements("add_lov_code")}, // b_lov
                new String[]{"add_i_code2", getElements("add_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code2", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type2",getElements("add_sl_type2")},
                "Retailer sale", "type2", where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "c_desc",where)){return false;}
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
                new String[]{"incompa_b_qbe", getElements("incompa_b_qbe")},// query button
                new String[]{"qbe_i_code2", getElements("qbe_i_code2")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code2", getElements("qbe_i_code2")},
                "code2", getData("code2"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type2",getElements("qbe_sl_type2")},
                getData("type2"), "type2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "c_desc", getData("c_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code2", getElements("qbe_i_code2")}, //any query input
                new String[]{"incompa_e_result", getElements("incompa_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 2";
        if (!Functions.auditData(driver,
                new String[]{"incompa_b_actions", getElements("incompa_b_actions")}, //actions button
                new String[]{"incompa_b_actions_b_audit_data", getElements("incompa_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"incompa_b_detach", getElements("incompa_b_detach")}, //detach button
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
                new String[]{"incompa_b_delete", getElements("incompa_b_delete")},
                new String []{"incompa_e_records", getElements("incompa_e_records")},
                new String[]{"incompa_b_okdel", getElements("incompa_b_okdel")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TABLE MULTI-LANGUAGE
     */
    private boolean interaction_add_t3(TestDriver driver) {
        driver.getReport().addHeader("CREATE RECORD", 3, false);
        String where = " on ADD 3";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_add", getElements("multi_b_add")}, //element to click
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
                "lang_code", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_language_desc",getElements("add_i_language_desc")},
                "lang_desc",where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")},
                "remarks", DataGenerator.getRandomAlphanumericSequence(5,false), where)) {
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
        String where = " on EDITTION 3";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_edit", getElements("multi_b_edit")}, //element to click
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
                "lang_code", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_language_desc",getElements("add_i_language_desc")},
                "lang_desc",where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")},
                "remarks", DataGenerator.getRandomAlphanumericSequence(5,false), where)) {
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
        String where = " on QBE 3";
        if (!Functions.clickQbE(driver,
                new String[]{"multi_b_qbe", getElements("multi_b_qbe")},// query button
                new String[]{"qbe_i_language_code", getElements("qbe_i_language_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language_code", getElements("qbe_i_language_code")},
                "lang_code", getData("lang_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "lang_desc", getData("lang_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_remarks", getElements("qbe_i_remarks")},
                "remarks", getData("remarks"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_language_code", getElements("qbe_i_language_code")}, //any query input
                new String[]{"multi_e_result", getElements("multi_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 3";
        if (!Functions.auditData(driver,
                new String[]{"multi_b_actions", getElements("multi_b_actions")}, //actions button
                new String[]{"multi_b_actions_b_audit_data", getElements("multi_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 3";
        if (!Functions.detachTable(driver,
                new String[]{"multi_b_detach", getElements("multi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 3";
        Functions.zoomOut(driver);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"multi_b_delete", getElements("multi_b_delete")},
                new String[]{"multi_e_records", getElements("multi_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TABLE INTERFACE
     */
    private boolean interaction_add_t4(TestDriver driver) {
        driver.getReport().addHeader("CREATE RECORD", 3, false);
        String where = " on ADD 4";
        if (!Functions.checkClick(driver,
                new String[]{"interface_b_add", getElements("interface_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_interface_desc",getElements("add_i_interface_desc")},
                "interface_desc",where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")},
                "order", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_booking",getElements("add_lov_booking")}, // b_lov
                new String[]{"add_i_booking", getElements("add_i_booking")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "booking", //Data name
                where)){return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_booking_desc",getElements("add_i_booking_desc")},
                "booking_desc",where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 4";
        if (!Functions.checkClick(driver,
                new String[]{"interface_b_edit", getElements("interface_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, //LoV button
                new String[]{"add_i_interface", getElements("add_i_interface")}, //external LoV input
                new String[]{"add_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "AG", // value to search
                "interface", //name of the data
                where)){return false;}

        if (!Functions.getText(driver, new String[]{"add_i_interface_desc",getElements("add_i_interface_desc")},
                "interface_desc",where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")},
                "order", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_booking",getElements("add_lov_booking")}, // b_lov
                new String[]{"add_i_booking", getElements("add_i_booking")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "booking", //Data name
                where)){return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_booking_desc",getElements("add_i_booking_desc")},
                "booking_desc",where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 4";
        if (!Functions.clickQbE(driver,
                new String[]{"interface_b_qbe", getElements("interface_b_qbe")},// query button
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_desc", getElements("qbe_i_interface_desc")},
                "interface_desc", getData("interface_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking", getElements("qbe_i_booking")},
                "booking", getData("booking"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_desc", getElements("qbe_i_booking_desc")},
                "booking_desc", getData("booking_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, //any query input
                new String[]{"interface_e_result", getElements("interface_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t4(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 4";
        if (!Functions.auditData(driver,
                new String[]{"interface_b_actions", getElements("interface_b_actions")}, //actions button
                new String[]{"interface_b_actions_b_audit_data", getElements("interface_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 4";
        if (!Functions.detachTable(driver,
                new String[]{"interface_b_detach", getElements("interface_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 4";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"interface_b_delete", getElements("interface_b_delete")},
                new String[]{"interface_e_records", getElements("interface_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
