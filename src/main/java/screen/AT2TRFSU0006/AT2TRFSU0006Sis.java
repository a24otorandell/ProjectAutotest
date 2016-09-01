package screen.AT2TRFSU0006;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by lchacartegui on 01/09/2016.
 */
public class AT2TRFSU0006Sis {
    protected AT2TRFSU0006Locators locators;
    protected AT2TRFSU0006Data data;

    public AT2TRFSU0006Sis() {
    }

    public AT2TRFSU0006Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0006Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0006Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0006Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfer");
        driver.getTestdetails().setSubmenu("Set up");
        driver.getTestdetails().setScreen("TO groups");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        grouping_testCSED(driver);
        //ttoo_testCSED(driver);
        return false;
    }

    protected boolean grouping_testCSED(TestDriver driver) {
        Functions.zoomOut(driver);
        if (!grouping_check_existence(driver)) {
            return false;
        }
        if (!grouping_create(driver, true)) {
            return false;
        }
        if (!grouping_search(driver)) {
            return false;
        }
        if (!grouping_create(driver, false)) {
            return false;
        }
        if (!grouping_search(driver)) {
            return false;
        }
        if (!grouping_qbe(driver)) {
            return false;
        }
        if (!grouping_otherFunctions(driver)) {
            return false;
        }
        return false;
    }


    protected boolean ttoo_testCSED(TestDriver driver) {
        if (!ttoo_create(driver)) {
            return false;
        }
        if (!ttoo_qbe(driver)) {
            return false;
        }
        if (!ttoo_otherFunctions(driver)) {
            return false;
        }
        if (!ttoo_delete(driver)) {
            return false;
        }
        if (!grouping_delete(driver)) {
            return false;
        }
        return false;
    }


    ///////////////////////////////////////////////////////////
    /////////// - TABLE: GROUPING TOUR OPERATOR - /////////////
    ///////////////////////////////////////////////////////////

    ////////// - TABLE GROUPING CHECK EXISTENCE - //////////
    private boolean grouping_check_existence(TestDriver driver) {

        if (!Functions.checkExistence(driver,
                "",
                "code_add",//data name (x)
                new String[]{"grouping_search_i_code", getElements("grouping_search_i_code")},//input
                new String[]{"grouping_b_search", getElements("grouping_b_search")},//search button
                new String[]{"grouping_search_e_result", getElements("grouping_search_e_result")},//expected not found result
                "both",//type of input
                8,
                "on CHECK EXISTENCE")) {
            return false;
        }

        if (!Functions.checkExistence(driver,
                "",
                "code_edit",//data name (x)
                new String[]{"grouping_search_i_code", getElements("grouping_search_i_code")},//input
                new String[]{"grouping_b_search", getElements("grouping_b_search")},//search button
                new String[]{"grouping_search_e_result", getElements("grouping_search_e_result")},//expected not found result
                "both",//type of input
                8,
                "on CHECK EXISTENCE")) {
            return false;
        }
        return true;
    }


    ////////// - TABLE GROUPING CREATE/EDIT - //////////
    private boolean grouping_create(TestDriver driver, boolean add) {
        String where;
        boolean checkbox_group_by_default;
        driver.getTest().getData().put("code", getData("code_add"));

        if (add) {
            driver.getReport().addHeader("TABLE: Grouping Tour Operator, RECORD CREATION", 3, true);
            where = " on ADD, TABLE: Grouping Tour Operator ";
            checkbox_group_by_default = true;

            if (!Functions.checkClick(driver,
                    new String[]{"grouping_b_add", getElements("grouping_b_add")},
                    recursiveXPaths.glass,
                    where)) {
                return false;
            }

        } else {
            driver.getReport().addHeader("TABLE: Grouping Tour Operator, RECORD EDITION", 3, true);
            where = " on EDIT, TABLE: Grouping Tour Operator ";
            checkbox_group_by_default = false;
            driver.getTest().getData().put("code", getData("code_edit"));

            if (!Functions.checkClick(driver,
                    new String[]{"grouping_b_edit", getElements("grouping_b_edit")},
                    recursiveXPaths.glass,
                    where)) {
                return false;
            }
        }

        if (!Functions.insertInput(driver,
                new String[]{"grouping_add_i_code", getElements("grouping_add_i_code")},
                "code",
                getData("code"),
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"grouping_add_i_description", getElements("grouping_add_i_description")},
                "description",
                DataGenerator.getRandomAlphanumericSequence(8, true),
                where)) {
            return false;
        }

        Functions.checkboxValue(driver,
                getElements("grouping_add_cb_group"), "group_by_default", checkbox_group_by_default, true, where);//where

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"grouping_add_b_save", getElements("grouping_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }

        return true;
    }


    ////////// - TABLE GROUPING SEARCH - //////////
    private boolean grouping_search(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Grouping Tour Operator, SEARCH RECORD", 3, true);

        if (!Functions.insertInput(driver,
                new String[]{"grouping_search_i_code", getElements("grouping_search_i_code")},
                "code",
                getData("code"),
                " on SEARCH, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"grouping_search_i_description", getElements("grouping_search_i_description")},
                "description",
                getData("description"),
                " on SEARCH, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"grouping_search_sel_group", getElements("grouping_search_sel_group")},
                getData("group_by_default"),
                "group_by_default",
                " on SEARCH, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"grouping_b_search", getElements("grouping_b_search")}, //search button
                new String[]{"grouping_search_e_result", getElements("grouping_search_e_result")}, //result element
                " on SEARCH, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        return true;
    }


    ////////// - TABLE GROUPING QBE - //////////
    private boolean grouping_qbe(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Grouping Tour Operator, RECORD QBE", 3, true);

        if (!Functions.simpleClick(driver,
                new String[]{"grouping_b_reset", getElements("grouping_b_reset")}, //element to click
                " on QBE, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"grouping_b_qbe", getElements("grouping_b_qbe")},// query button
                new String[]{"grouping_qbe_i_code", getElements("grouping_qbe_i_code")},//any query input
                " on QBE, TABLE: Grouping Tour Operator ")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver,
                new String[]{"grouping_qbe_i_code", getElements("grouping_qbe_i_code")},
                "code",
                getData("code"),
                " on QBE, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"grouping_qbe_i_description", getElements("grouping_qbe_i_description")},
                "description",
                getData("description"),
                " on QBE, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"grouping_qbe_sel_group_by_default", getElements("grouping_qbe_sel_group_by_default")},
                getData("group_by_default"),
                "group_by_default",
                " on QBE, TABLE: Grouping Tour Operator ")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"grouping_qbe_i_description", getElements("grouping_qbe_i_description")}, //any query input
                new String[]{"grouping_search_e_result", getElements("grouping_search_e_result")}, //table result
                " on QBE, TABLE: Grouping Tour Operator ")) {
            return false;
        } // where this operation occurs

        return true;
    }


    ////////// - TABLE GROUPING OTHER FUNCTIONS - //////////
    private boolean grouping_otherFunctions(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Grouping Tour Operator, OTHER FUNCTIONS", 3, true);

        if (!Functions.auditData(driver,
                new String[]{"grouping_b_actions", getElements("grouping_b_actions")}, //actions button
                new String[]{"grouping_b_actions_b_audit", getElements("grouping_b_actions_b_audit")}, //audit button
                new String[]{"grouping_b_actions_b_audit_b_close", getElements("grouping_b_actions_b_audit_b_close")}, //audit_b_ok
                false, //zoom in??
                " on AUDIT DATA, TABLE: Grouping Tour Operator ")) {
            return false;
        } //where this occurs

        if (!Functions.detachTable(driver,
                new String[]{"grouping_b_detach", getElements("grouping_b_detach")}, //detach button
                true,     //screenshot??
                false, //zoom in??
                " on DETACH, TABLE: Grouping Tour Operator ")) {
            return false;
        }    //where this occurs

        return true;
    }


    ////////// - TABLE GROUPING DELETE - //////////
    private boolean grouping_delete(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Grouping Tour Operator, RECORD DELETE", 3, true);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"grouping_b_delete", getElements("grouping_b_delete")},
                new String[]{"grouping_n_records", getElements("grouping_n_records")},
                new String[]{"grouping_b_delete_b_yes", getElements("grouping_b_delete_b_yes")},
                " on DELETE ")) {
            return false;
        }
        return true;
    }

    //////////////////////////////////////////////////////////////
    /////////////// - TABLE: TOUR OPERATOR - /////////////////////
    //////////////////////////////////////////////////////////////

    /////////////// - TABLE: TOUR OPERATOR, CREATION- //////////////

    private boolean ttoo_create(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Tour Operator, RECORD CREATION", 3, true);

        if (!Functions.checkClick(driver,
                new String[]{"ttoo_b_add", getElements("ttoo_b_add")}, //element to click
                recursiveXPaths.glass, // , //element expected to appear
                "on ADD, TABLE: Tour Operator ")) {
            return false;
        }


        // En esta lov hay que introducir un valor para buscar. No se puede buscar vacía.
        if (!Functions.createLovByValue(driver,
                new String[]{"ttoo_add_lov_ttoo", getElements("ttoo_add_lov_ttoo")}, //LoV button
                new String[]{"ttoo_add_i_ttoo", getElements("ttoo_add_i_ttoo")}, //external LoV input
                new String[]{"ttoo_add_lov_ttoo_i_ttoo", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "a", // value to search
                "ttoo", //name of the data
                "on ADD, TABLE: Tour Operator ")) {
            return false;
        } //where this operation occurs

        if (!Functions.getValue(driver, new String[]{"ttoo_add_e_ttoo_des", getElements("ttoo_add_e_ttoo_des")}, // element path
                "ttoo_des", // key for data value (the name)
                "on ADD, TABLE: Tour Operator ")) {
            return false;
        } // where this operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"ttoo_add_b_save", getElements("ttoo_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                "on ADD, TABLE: Tour Operator ")) {
            return false;
        }

        return true;
    }


    private boolean ttoo_qbe(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Tour Operator, RECORD QBE", 3, true);

        if (!Functions.clickQbE(driver,
                new String[]{"ttoo_b_qbe", getElements("ttoo_b_qbe")},// query button
                new String[]{"ttoo_qbe_i_ttoo", getElements("ttoo_qbe_i_ttoo")},//any query input
                "on QBE, TABLE: Tour Operator ")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver,
                new String[]{"ttoo_qbe_i_ttoo", getElements("ttoo_qbe_i_ttoo")},
                "ttoo",
                getData("ttoo"),
                "on QBE, TABLE: Tour Operator ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"ttoo_qbe_i_no_name", getElements("ttoo_qbe_i_no_name")},
                "ttoo_des",
                getData("ttoo_des"),
                "on QBE, TABLE: Tour Operator ")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"ttoo_qbe_i_no_name", getElements("ttoo_qbe_i_no_name")}, //any query input
                new String[]{"ttoo_qbe_e_result", getElements("ttoo_qbe_e_result")}, //table result
                "on QBE, TABLE: Tour Operator ")) {
            return false;
        } // where this operation occurs
        return true;
    }


    private boolean ttoo_otherFunctions(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Tour Operator, OTHER FUNCTIONS", 3, true);

        if (!Functions.detachTable(driver,
                new String[]{"ttoo_b_detach", getElements("ttoo_b_detach")}, //detach button
                true,     //screenshot??
                false, //zoom in??
                " on DETACH, TABLE: Tour Operator ")) {
            return false;
        }    //where this occurs

        return true;
    }


    private boolean ttoo_delete(TestDriver driver) {
        driver.getReport().addHeader("TABLE: Tour Operator, RECORD DELETE", 3, true);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"ttoo_b_delete", getElements("ttoo_b_delete")},
                new String[]{"ttoo_n_records", getElements("ttoo_n_records")},
                new String[]{"ttoo_b_delete_b_yes", getElements("ttoo_b_delete_b_yes")},
                " on DELETE, TABLE: Tour Operator ")) {
            return false;
        }
        return true;
    }
}
