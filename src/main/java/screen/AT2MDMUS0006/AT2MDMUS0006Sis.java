package screen.AT2MDMUS0006;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 10/11/2016.
 */
public class AT2MDMUS0006Sis {
    protected AT2MDMUS0006Locators locators;
    protected AT2MDMUS0006Data data;
    public AT2MDMUS0006Sis() {
    }
    public AT2MDMUS0006Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0006Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0006Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0006Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Users control");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!getDatos(driver)) return false;
        if (!search_user(driver)) return false;
        if (!interaction_edit_user(driver)) return false;
        if (!qbe_user(driver)) return false;
        if (!others_actions_user(driver)) return false;
        return true;
    }

    private boolean getDatos (TestDriver driver) {
        driver.getReport().addHeader("GET DATOS", 3, false);
        String where = " on GET DATOS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"table_e_receptive", getElements("table_e_receptive")}, // element path
                "receptive", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_office", getElements("table_e_office")}, // element path
                "office", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_office_des", getElements("table_e_office_des")}, // element path
                "offi_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_user", getElements("table_e_user")}, // element path
                "user", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_module", getElements("table_e_module")}, // element path
                "module", // key for data value (the name)
                where)){return false;}
        if (!Functions.getAttr(driver,
                new String[]{"table_ck_ok", getElements("table_ck_ok")}, // element path
                "alt",
                "ok", // key for data value (the name)
                where)){return  false;};
        return true;
    }
    private boolean search_user(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH USER";
        if (!Functions.insertInput(driver, new String[]{"search_i_receptive",getElements("search_i_receptive")},
                "receptive", getData("receptive"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_user",getElements("search_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_module",getElements("search_i_module")},
                "module", getData("module"), where)){return false;}
        if (getData("ok").equalsIgnoreCase("checked")) {
            if (!Functions.checkboxValue(driver,
                    getElements("search_ck_ok"),"ok",true,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("search_ck_ok"),"ok",false,true,where)){return false;}
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_user(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION USER";
        if (!Functions.checkClick(driver,
                new String[]{"users_b_edit", getElements("users_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (getData("ok").equalsIgnoreCase("checked")) {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_ok"),"ok",true,true,where)){return false;}
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("add_ck_ok"),"ok",false,true,where)){return false;}
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_user(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE USER";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"users_b_qbe", getElements("users_b_qbe")},// query button
                new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_receptive",getElements("qbe_i_receptive")},
                "receptive", getData("receptive"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office",getElements("qbe_i_office")},
                "office", getData("office"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_des",getElements("qbe_i_office_des")},
                "offi_desc", getData("offi_desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_module",getElements("qbe_i_module")},
                "module", getData("module"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_ok",getElements("qbe_sl_ok")},
                getData("ok"), "ok",  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")}, //any query input
                new String[]{"users_e_result", getElements("users_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_user(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA USER";
/*        if (!Functions.auditData(driver,
                new String[]{"users_b_actions", getElements("users_b_actions")}, //actions button
                new String[]{"users_b_actions_b_audit_data", getElements("users_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH USER";
        if (!Functions.detachTable(driver,
                new String[]{"users_b_detach", getElements("users_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
