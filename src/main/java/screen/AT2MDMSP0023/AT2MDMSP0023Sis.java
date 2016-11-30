package screen.AT2MDMSP0023;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMSP0023Sis {
    protected AT2MDMSP0023Locators locators;
    protected AT2MDMSP0023Data data;
    public AT2MDMSP0023Sis() {
    }
    public AT2MDMSP0023Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0023Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0023Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0023Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("SWS Profiles 2.0");
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
        if (!delete(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_add", getElements("suppliers_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_supplier",getElements("add_lov_supplier")}, // b_lov
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_web"),"web",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_send"),"send",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_allotment"),"allotment",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_finished"),"finished",true,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                new String[]{"search_lov_sup_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_web"),"web",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_send"),"send",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_allotment"),"allotment",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_finished"),"finished",true,true, where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_edit", getElements("suppliers_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_supplier",getElements("add_lov_supplier")}, // b_lov
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_web"),"web",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_send"),"send",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_allotment"),"allotment",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_finished"),"finished",false,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"suppliers_b_qbe", getElements("suppliers_b_qbe")},// query button
                new String[]{"qbe_i_suppliers", getElements("qbe_i_suppliers")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_suppliers", getElements("qbe_i_suppliers")},
                "supplier", getData("supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        Functions.break_time(driver, 2, 300);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_web",getElements("qbe_sl_web")},
                getData("web"), "web", where)){return false;}
        Functions.break_time(driver, 2, 300);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_send",getElements("qbe_sl_send")},
                getData("send"), "send", where)){return false;}
        Functions.break_time(driver, 2, 300);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_allotment",getElements("qbe_sl_allotment")},
                getData("allotment"), "allotment", where)){return false;}
        Functions.break_time(driver, 2, 300);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_finished",getElements("qbe_sl_finished")},
                getData("finished"), "finished", where)){return false;}
        Functions.break_time(driver, 2, 300);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_suppliers", getElements("qbe_i_suppliers")}, //any query input
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
/*        if (!Functions.auditData(driver,
                new String[]{"profiles_b_actions", getElements("profiles_b_actions")}, //actions button
                new String[]{"profiles_b_actions_b_audit_data", getElements("profiles_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"suppliers_b_detach", getElements("suppliers_b_detach")}, //detach button
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
                new String[]{"suppliers_b_delete", getElements("suppliers_b_delete")},
                new String[]{"suppliers_e_records", getElements("suppliers_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
