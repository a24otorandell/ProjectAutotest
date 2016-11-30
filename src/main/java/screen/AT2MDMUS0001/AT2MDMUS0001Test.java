package screen.AT2MDMUS0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2MDMUS0001Test {
    protected AT2MDMUS0001Locators locators;
    protected AT2MDMUS0001Data data;
    public AT2MDMUS0001Test() {
    }
    public AT2MDMUS0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0001Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0001Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Assign printer to user");
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
        if (!qbe_user(driver)) return false;
        if (!others_actions_user(driver)) return false;
        if (!interaction_add(driver)) return false;
        if (!qbe(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!search(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!delete(driver))return false;
        return true;
    }

    /**
     * TABLA USERS
     * @param driver
     * @return
     */
    public boolean getDatos (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = "GET DATA";
        String[] columns = {"user", "name","surname","company", "office","office_des","department", "department_des" };
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:master3::db')]",
                1, // row to give values
                where);
        return true;
    }
    private boolean search_user(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH USER";
        if (!Functions.insertInput(driver, new String[]{"search_i_user",getElements("search_i_user")},
                "user", "%"+getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_name",getElements("search_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname",getElements("search_i_surname")},
                "surname", getData("surname"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_company",getElements("search_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_office",getElements("search_i_office")},
                "office", getData("office"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_office_des",getElements("search_i_office_des")},
                "office_des", getData("office_des"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_department",getElements("search_i_department")},
                "department", getData("department"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_department_des",getElements("search_i_department_des")},
                "department_des", getData("department_des"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_user(TestDriver driver) {
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
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name",getElements("qbe_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname",getElements("qbe_i_surname")},
                "surname", getData("surname"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company",getElements("qbe_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office",getElements("qbe_i_office")},
                "office", getData("office"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_des",getElements("qbe_i_office_des")},
                "office_des", getData("office_des"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department",getElements("qbe_i_department")},
                "department", getData("department"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department_des",getElements("qbe_i_department_des")},
                "department_des", getData("department_des"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"users_e_result", getElements("users_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_user(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"users_b_detach", getElements("users_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE ASSOCIATED PRINTERS
     * @param driver
     * @return
     */
    private boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"associated_b_add", getElements("associated_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_spooler",getElements("add_lov_spooler")}, // b_lov
                new String[]{"add_i_spooler", getElements("add_i_spooler")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "spooler", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_paper",getElements("add_lov_paper")}, // b_lov
                new String[]{"add_i_paper", getElements("add_i_paper")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "paper", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_defect"),"defect",true,true,where)){return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_printer",getElements("add_i_printer")},
                "printer", where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean search (TestDriver driver) {
        driver.getReport().addHeader("SEARCH", 3, false);
        String where = " SEARCH PRINT";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_spooler", getElements("search_lov_spooler")}, //LoV button
                new String[]{"search_i_spooler", getElements("search_i_spooler")}, //external LoV input
                new String[]{"search_lov_spooler_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("spooler"), // value to search
                "spooler", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_user2", getElements("search_lov_user2")}, //LoV button
                new String[]{"search_i_user2", getElements("search_i_user2")}, //external LoV input
                new String[]{"search_lov_user2_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("user"), // value to search
                "user", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_i_find", getElements("search_i_find")}, //search button
                new String[]{"associated_e_result", getElements("associated_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"copy_printer", getElements("copy_printer")}, //element to click
                where)){return false;}
        Functions.break_time(driver,2,300);
        if (!Functions.simpleClick(driver,
                new String[]{"asign_printer", getElements("asign_printer")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"associated_b_edit", getElements("associated_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_spooler",getElements("add_lov_spooler")}, // b_lov
                new String[]{"add_i_spooler", getElements("add_i_spooler")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "spooler", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_paper",getElements("add_lov_paper")}, // b_lov
                new String[]{"add_i_paper", getElements("add_i_paper")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "paper", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_defect"),"defect",false,true,where)){return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_printer",getElements("add_i_printer")},
                "printer", where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"associated_b_qbe", getElements("associated_b_qbe")},// query button
                new String[]{"qbe_i_spooler", getElements("qbe_i_spooler")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_spooler",getElements("qbe_i_spooler")},
                "spooler", getData("spooler"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_printer",getElements("qbe_i_printer")},
                "printer", getData("printer"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_paper",getElements("qbe_i_paper")},
                "paper", getData("paper"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_defect",getElements("qbe_sl_defect")},
                getData("defect"), "defect",  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_spooler", getElements("qbe_i_spooler")}, //any query input
                new String[]{"associated_e_result", getElements("associated_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA USER";
        if (!Functions.auditData(driver,
                new String[]{"associated_b_actions", getElements("associated_b_actions")}, //actions button
                new String[]{"associated_b_actions_b_audit_data", getElements("associated_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"associated_b_detach", getElements("associated_b_detach")}, //detach button
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
                new String[]{"associated_b_delete", getElements("associated_b_delete")},
                new String[]{"associated_e_records", getElements("associated_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
