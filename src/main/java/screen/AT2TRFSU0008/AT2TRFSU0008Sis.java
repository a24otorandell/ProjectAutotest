package screen.AT2TRFSU0008;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;


/**
 * Created by vsolis on 08/09/2016.
 */
public class AT2TRFSU0008Sis {
    protected AT2TRFSU0008Locators locators;
    protected AT2TRFSU0008Data data;

    public AT2TRFSU0008Sis() {

    }

    public AT2TRFSU0008Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0008Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0008Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0008Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("TTOO Quality Groups");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {

        if (!Routes_by_default(driver)) {
            return false;
        }


        return false;
    }

    private boolean Routes_by_default(TestDriver driver) {

        if (!Add_routes(driver)) {
            return false;
        }

        if (!Search_routes(driver)) {
            return false;
        }

        if (!Edition_routes(driver)) {
            return false;
        }

        if (!Search2_routes(driver)) {
            return false;
        }

        if (!Qbe_routes(driver)) {
            return false;
        }

        if (!Other_actions(driver)) {
            return false;
        }

        if (!Delete_routes(driver)) {
            return false;
        }

        return true;
    }

    private boolean Delete_routes(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN ROUTES BY DEFAULT", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"b_delete", getElements("b_delete")},
                new String[]{"records", getElements("records")},
                new String[]{"b_del_yes", getElements("b_del_yes")},
                " on DELETE")) {
            return false;
        }
        return true;
    }

    private boolean Other_actions(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN ROUTES BY DEFAULT", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"b_actions", getElements("b_actions")}, //actions button
                new String[]{"a_auditdata", getElements("a_auditdata")}, //audit button
                new String[]{"a_b_ok", getElements("a_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"b_detach", getElements("b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean Qbe_routes(TestDriver driver) {

        driver.getReport().addHeader("QBE  IN ROUTES BY DEFAULT", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"b_qbe", getElements("b_qbe")},// query button
                new String[]{"qbe_togro", getElements("qbe_togro")},//any query input
                " on QBE")) {
            return false;
        }


        if (!Functions.insertInput(driver,
                new String[]{"qbe_togro", getElements("qbe_togro")},
                "qbe_c1", data.getData().get("se2_ta"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_description", getElements("qbe_description")},
                "qbe_c2", data.getData().get("se_d2"), " on QBE")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"qbe_arridepar", getElements("qbe_arridepar")},
                "Departure", "qbe_c3", " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_route", getElements("qbe_route")},
                "qbe_c4", data.getData().get("se2_ti"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_terminal", getElements("qbe_terminal")},
                "qbe_c5", data.getData().get("se_d3"), " on QBE")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_terminal", getElements("qbe_terminal")}, //search button
                new String[]{"result", getElements("result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;
    }

    private boolean Search2_routes(TestDriver driver) {

        driver.getReport().addHeader("ADVANCED SEARCH2 IN OPERATIONAL VEHICLES  ", 3, false);
        if (!Functions.createLovByValue(driver,
                new String[]{"se_lov", getElements("se_lov")}, //LoV button
                new String[]{"se_i_togr", getElements("se_i_togr")}, //external LoV input
                new String[]{"se_i_lov_des", getElements("se_i_lov_des")}, //internal LoV input
                data.getData().get("ed_d2"), // value to search
                "se2_ta", //name of the data
                " on SEARCH2")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"se_i_des", getElements("se_i_des")}, // element path
                "se_d2", // key for data value (the name)
                " on EDITION");

        if (!Functions.createLovByValue(driver,
                new String[]{"se_lov2", getElements("se_lov2")}, //LoV button
                new String[]{"se_i_route", getElements("se_i_route")}, //external LoV input
                new String[]{"se_lov2_route", getElements("se_lov2_route")}, //internal LoV input
                data.getData().get("ed_d4"), // value to search
                "se2_ti", //name of the data
                " on SEARCH2")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"se_i_terminal", getElements("se_i_terminal")}, // element path
                "se_d3", // key for data value (the name)
                " on EDITION");
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"result", getElements("result")}, //Falta crear este resultado por bug
                " on SEARCH2")) {
            return false;
        }


        return true;
    }

    private boolean Edition_routes(TestDriver driver) {

        driver.getReport().addHeader("EDITION IN ROUTES BY DEFAULT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_edit", getElements("b_edit")}, //element to click
                new String[]{"ed_lov", getElements("ed_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDITION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"ed_lov", getElements("ed_lov")}, // b_lov
                new String[]{"ed_i_togr", getElements("ed_i_togr")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ed_d1", //Data name
                " on EDITION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ed_i_descri", getElements("ed_i_descri")}, // element path
                "ed_d2", // key for data value (the name)
                " on EDITION");
        if (!Functions.selectText(driver,
                new String[]{"ed_ss_arride", getElements("ed_ss_arride")},
                "Departure", "ed_d3", " on EDITION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"ed_lov2", getElements("ed_lov2")}, // b_lov
                new String[]{"ed_i_route", getElements("ed_i_route")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ed_d4", //Data name
                " on EDITION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ed_i_des2", getElements("ed_i_des2")}, // element path
                "ed_d5", // key for data value (the name)
                " on EDITION");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_save", getElements("b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION")) {
            return false;
        }


        return true;
    }

    private boolean Search_routes(TestDriver driver) {

        driver.getReport().addHeader("ADVANCED SEARCH IN OPERATIONAL VEHICLES  ", 3, false);
        if (!Functions.createLovByValue(driver,
                new String[]{"se_lov", getElements("se_lov")}, //LoV button
                new String[]{"se_i_togr", getElements("se_i_togr")}, //external LoV input
                new String[]{"se_i_lov_des", getElements("se_i_lov_des")}, //internal LoV input
                data.getData().get("ad_d2"), // value to search
                "se_ta", //name of the data
                " on SEARCH")) {
            return false;
        }

        Functions.break_time(driver, 6, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"se_lov2", getElements("se_lov2")}, //LoV button
                new String[]{"se_i_route", getElements("se_i_route")}, //external LoV input
                new String[]{"se_lov2_route", getElements("se_lov2_route")}, //internal LoV input
                data.getData().get("ad_d4"), // value to search
                "se_ta", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"result", getElements("result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }


        return true;
    }

    private boolean Add_routes(TestDriver driver) {

        driver.getReport().addHeader("ADD IN ROUTES BY DEFAULT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_add", getElements("b_add")}, //element to click
                new String[]{"add_lov", getElements("add_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov", getElements("add_lov")}, // b_lov
                new String[]{"add_i_togr", getElements("add_i_togr")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_d1", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"add_i_descri", getElements("add_i_descri")}, // element path
                "ad_d2", // key for data value (the name)
                " on ADD");
        if (!Functions.selectText(driver,
                new String[]{"add_ss_arride", getElements("add_ss_arride")},
                "Arrival", "ad_d3", " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_lov2", getElements("add_lov2")}, // b_lov
                new String[]{"add_i_route", getElements("add_i_route")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_d4", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"add_i_des2", getElements("add_i_des2")}, // element path
                "ad_d5", // key for data value (the name)
                " on ADD");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_save", getElements("b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }
}
