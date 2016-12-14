package screen.AT2MDMUS0015;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 09/11/2016.
 */
public class AT2MDMUS0015Sis {
    protected AT2MDMUS0015Locators locators;
    protected AT2MDMUS0015Data data;
    public AT2MDMUS0015Sis() {
    }
    public AT2MDMUS0015Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0015Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0015Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0015Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Users per interface 2.0");
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
        if (!copyUser(driver)) return false;
        if (!searachHard(driver, "user2")) return false;
        if (!delete(driver)) return false;
        if (!searachHard(driver, "user")) return false;
        if (!delete(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"users_b_add", getElements("users_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Envio Desvios", "type", where)){return false;}
        Functions.break_time(driver, 30, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_user",getElements("add_lov_user")}, // b_lov
                new String[]{"add_i_user", getElements("add_i_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "user", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_user_name", getElements("add_i_user_name")}, // element path
                "user_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_interface_des", getElements("add_i_interface_des")}, // element path
                "inter_desc", // key for data value (the name)
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
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_user", getElements("search_lov_user")}, //LoV button
                new String[]{"search_i_user", getElements("search_i_user")}, //external LoV input
                new String[]{"search_lov_user_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("user_name"), // value to search
                "user", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"users_b_edit", getElements("users_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3, 400);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Acceso Reservas", "type", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_user", getElements("add_lov_user")}, //LoV button
                new String[]{"add_i_user", getElements("add_i_user")}, //external LoV input
                new String[]{"add_lov_user_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "VSOLIS", // value to search
                "user", //name of the data
                "SEARCH")){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_user_name", getElements("add_i_user_name")}, // element path
                "user_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_interface_des", getElements("add_i_interface_des")}, // element path
                "inter_desc", // key for data value (the name)
                where)){return false;}
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
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"users_b_qbe", getElements("users_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.break_time(driver, 2, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user_name",getElements("qbe_i_user_name")},
                "user_name", getData("user_name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface",getElements("qbe_i_interface")},
                "interface", getData("interface"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_des",getElements("qbe_i_interface_des")},
                "inter_desc", getData("inter_desc"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"users_e_result", getElements("users_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"users_b_actions", getElements("users_b_actions")}, //actions button
                new String[]{"users_b_actions_b_audit_data", getElements("users_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"users_b_detach", getElements("users_b_detach")}, //detach button
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
                new String[]{"users_b_delete", getElements("users_b_delete")},
                new String[]{"users_e_records", getElements("users_e_records")},
                where)){
            return false;
        }
        return true;
    }
    public boolean copyUser (TestDriver driver) {
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_from_user", getElements("search_lov_from_user")}, //LoV button
                new String[]{"search_i_from_user", getElements("search_i_from_user")}, //external LoV input
                new String[]{"search_lov_from_user_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("user"), // value to search
                "user", //name of the data
                "COPY USER")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_to_user", getElements("search_lov_to_user")}, //LoV button
                new String[]{"search_i_to_user", getElements("search_i_to_user")}, //external LoV input
                new String[]{"search_lov_to_user_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "AVIRGILI", // value to search
                "user2", //name of the data
                "COPY USER")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_copy", getElements("search_b_copy")}, //element to click
                "COPY USER")){return false;}
        Functions.break_time(driver, 300, 700);
        return true;
    }
    public boolean searachHard (TestDriver driver, String user) {
        Functions.break_time(driver, 300, 700);
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_reset", getElements("users_b_reset")}, //element to click
                "COPY USER")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_user", getElements("search_lov_user")}, //LoV button
                new String[]{"search_i_user", getElements("search_i_user")}, //external LoV input
                new String[]{"search_lov_user_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData(user), // value to search
                "user4", //name of the data
                "SEARCH")){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                "SEARCH")) {
            return false;
        }
        return true;
    }
}
