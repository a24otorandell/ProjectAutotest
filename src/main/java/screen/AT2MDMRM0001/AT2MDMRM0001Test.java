package screen.AT2MDMRM0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 24/11/2016.
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
        driver.getTestdetails().setScreen("Web t1 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search_t1(driver)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!delete_t1(driver)) return false;
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
                    act1 = true;
                    return false;}
            else {
                act1 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_enters", getElements("add_ck_enters")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "enters", // key for data value (the name)
                    where)) {
                act2 = true;
                return false;}
            else {
                act2 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_active", getElements("add_ck_active")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "active", // key for data value (the name)
                    where)) {
                act3 = true;
                return false;}
            else {
                act3 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_restrictive", getElements("add_ck_restrictive")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "rest", // key for data value (the name)
                    where)) {
                act4 = true;
                return false;}
            else {
                act4 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_opaque", getElements("add_ck_opaque")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "opaque", // key for data value (the name)
                    where)) {
                act5 = true;
                return false;}
            else {
                act5 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_pep", getElements("add_ck_pep")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "pep", // key for data value (the name)
                    where)) {
                act6 = true;
                return false;}
            else {
                act6 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_liberate", getElements("add_ck_liberate")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "liberate", // key for data value (the name)
                    where)) {
                act7 = true;
                return false;}
            else {
                act7 = false;
            }
            if (!Functions.getAttr(driver,
                    new String[]{"add_ck_nrf", getElements("add_ck_nrf")}, // element path
                    "checked", // atribute to get data (class, value, id, style, etc...)
                    "nrf", // key for data value (the name)
                    where)) {
                act8 = true;
                return false;}
            else {
                act8 = false;
            }
        }
        catch (Exception e) {
            System.out.print(e);
        }
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
        String where = " on QBE t1";
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
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"classif_b_delete", getElements("classif_b_delete")},
                new String[]{"classif_e_records", getElements("classif_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
