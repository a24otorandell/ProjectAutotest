package screen.AT2MDMCL0045;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 22/11/2016.
 */
public class AT2MDMCL0045Sis {
    protected AT2MDMCL0045Locators locators;
    protected AT2MDMCL0045Data data;
    public AT2MDMCL0045Sis() {
    }
    public AT2MDMCL0045Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0045Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0045Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0045Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("API Key management");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!first_search(driver)) return false;
        if (!getDatos(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        return true;
    }

    private boolean first_search(TestDriver driver) {
        driver.getReport().addHeader("FIRST SEARCH RECORD", 3, false);
        String where = " on FIRST SEARCH";
        Functions.break_time(driver, 300, 5000);
        if (!Functions.insertInput(driver, new String[]{"search_i_key", getElements("search_i_key")},
                "key", "zzs65y3n2ey72u7tsud8syuh", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"results_e_result", getElements("results_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean getDatos (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = "GET DATA";
        Functions.zoomOut(driver, 2);
        String[] columns = {"key", "secret","client","client_desc", "interface","interface_desc","branch", "", "api", "application", "package", "plan", "p_key", "m_user", "m_mail" };
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:t1::db')]",
                1, // row to give values
                where);
        Functions.getAttr(driver,
                new String[]{"results_ck_active", getElements("results_ck_active")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "active", // key for data value (the name)
                where);
        Functions.getAttr(driver,
                new String[]{"results_ck_payment", getElements("results_ck_payment")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "payment", // key for data value (the name)
                where);
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_key", getElements("search_i_key")},
                "key", getData("key"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_client", getElements("search_lov_client")}, //LoV button
                new String[]{"search_i_client", getElements("search_i_client")}, //external LoV input
                new String[]{"search_lov_client_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("client"), // value to search
                "client", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_branch", getElements("search_lov_branch")}, //LoV button
                new String[]{"search_i_branch", getElements("search_i_branch")}, //external LoV input
                new String[]{"search_lov_branch_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("branch"), // value to search
                "branch", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"results_e_result", getElements("results_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"results_b_edit", getElements("results_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_client",getElements("add_lov_client")}, // b_lov
                new String[]{"add_i_client", getElements("add_i_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_branch", getElements("add_lov_branch")},
                new String[]{"add_i_branch",getElements("add_i_branch")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){return false;}
        selectBox(driver, "payment");
/*        if (!Functions.checkboxValue(driver,
                getElements("add_ck_payment"),"payment",true,true,where)){return false;}*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"results_b_qbe", getElements("results_b_qbe")},// query button
                new String[]{"qbe_i_key", getElements("qbe_i_key")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver, 2);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_key", getElements("qbe_i_key")},
                "key", getData("key"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_secret_key", getElements("qbe_i_secret_key")},
                "secret", getData("secret"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_client", getElements("qbe_i_client")},
                "client", getData("client"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_client_desc", getElements("qbe_i_client_desc")},
                "client_desc", getData("client_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_desc", getElements("qbe_i_interface_desc")},
                "interface_desc", getData("interface_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch", getElements("qbe_i_branch")},
                "branch", getData("branch"), where)) {
            return false;
        }
        selectBox(driver, "active");
        if (!Functions.insertInput(driver, new String[]{"qbe_i_api_name", getElements("qbe_i_api_name")},
                "api", getData("api"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application", getElements("qbe_i_application")},
                "application", getData("application"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_package", getElements("qbe_i_package")},
                "package", getData("package"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_plan", getElements("qbe_i_plan")},
                "plan", getData("plan"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_package_key", getElements("qbe_i_package_key")},
                "p_key", getData("p_key"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_member_username", getElements("qbe_i_member_username")},
                "m_user", getData("m_user"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_member_email", getElements("qbe_i_member_email")},
                "m_mail", getData("m_mail"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_payment",getElements("qbe_sl_payment")},
                getData("payment"), "payment", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_key", getElements("qbe_i_key")}, //any query input
                new String[]{"results_e_result", getElements("results_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"results_b_detach", getElements("results_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean selectBox (TestDriver driver, String element) {
        if (element.equalsIgnoreCase("active")) {
            if (getData("active").equalsIgnoreCase("unchecked")) {
                if (!Functions.selectText(driver,
                        new String[]{"qbe_sl_active", getElements("qbe_sl_active")},
                        "No", "active", "SELECT TEXT")) {
                    return false;
                }
            } else {
                if (!Functions.selectText(driver,
                        new String[]{"qbe_sl_active", getElements("qbe_sl_active")},
                        "Yes", "active", "SELECT TEXT")) {
                    return false;
                }
            }
        }
        else {
            if (getData("payment").equalsIgnoreCase("unchecked")) {
                if (!Functions.checkboxValue(driver,
                        getElements("add_ck_payment"), "payment", true, true, "CHECK")) {
                    return false;
                }
            } else {
                if (!Functions.checkboxValue(driver,
                        getElements("add_ck_payment"), "payment", false, true, "CHECK")) {
                    return false;
                }
            }
        }
        return true;
    }
}
