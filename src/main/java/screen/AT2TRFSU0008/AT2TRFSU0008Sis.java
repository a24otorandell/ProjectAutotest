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
                new String[]{"route_b_delete", getElements("route_b_delete")},
                new String[]{"route_records", getElements("route_records")},
                new String[]{"route_b_del_yes", getElements("route_b_del_yes")},
                " on DELETE")) {
            return false;
        }
        return true;
    }

    private boolean Other_actions(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN ROUTES BY DEFAULT", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"route_b_actions", getElements("route_b_actions")}, //actions button
                new String[]{"route_a_auditdata", getElements("route_a_auditdata")}, //audit button
                new String[]{"route_a_b_ok", getElements("route_a_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"route_b_detach", getElements("route_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean Qbe_routes(TestDriver driver) {

        driver.getReport().addHeader("QBE  IN ROUTES BY DEFAULT", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"route_b_qbe", getElements("route_b_qbe")},// query button
                new String[]{"route_qbe_to_group", getElements("route_qbe_to_group")},//any query input
                " on QBE")) {
            return false;
        }


        if (!Functions.insertInput(driver,
                new String[]{"route_qbe_to_group", getElements("route_qbe_to_group")},
                "qbe_to_group", data.getData().get("lov_to_group"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"route_qbe_description", getElements("route_qbe_description")},
                "qbe_description", data.getData().get("to_group_description"), " on QBE")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"route_qbe_arrival_departure", getElements("route_qbe_arrival_departure")},
                "Departure", "qbe_select_departure", " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"route_qbe_route", getElements("route_qbe_route")},
                "qbe_route", data.getData().get("lov_route"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"route_qbe_terminal_are", getElements("route_qbe_terminal_are")},
                "qbe_terminal_area", data.getData().get("route_description"), " on QBE")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"route_qbe_terminal_are", getElements("route_qbe_terminal_are")}, //search button
                new String[]{"route_result", getElements("route_result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;
    }

    private boolean Edition_routes(TestDriver driver) {

        driver.getReport().addHeader("EDITION IN ROUTES BY DEFAULT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"route_b_edit", getElements("route_b_edit")}, //element to click
                new String[]{"route_ed_lov_to_group", getElements("route_ed_lov_to_group")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDITION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"route_ed_lov_to_group", getElements("route_ed_lov_to_group")}, // b_lov
                new String[]{"route_ed_i_to_group", getElements("route_ed_i_to_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_to_group", //Data name
                " on EDITION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"route_ed_i_to_group_description", getElements("route_ed_i_to_group_description")}, // element path
                "to_group_description", // key for data value (the name)
                " on EDITION");
        if (!Functions.selectText(driver,
                new String[]{"route_ed_select_text_arrival_departure", getElements("route_ed_select_text_arrival_departure")},
                "Departure", "selec_arrival", " on EDITION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"route_ed_lov2_route", getElements("route_ed_lov2_route")}, // b_lov
                new String[]{"route_ed_i_route", getElements("route_ed_i_route")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_route", //Data name
                " on EDITION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"route_ed_i_route_description", getElements("route_ed_i_route_description")}, // element path
                "route_description", // key for data value (the name)
                " on EDITION");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"route_b_save", getElements("route_b_save")}, //element to click
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
                new String[]{"route_se_lov_to_group", getElements("route_se_lov_to_group")}, //LoV button
                new String[]{"route_se_i_to_group", getElements("route_se_i_to_group")}, //external LoV input
                new String[]{"route_se_i_lov_description", getElements("route_se_i_lov_description")}, //internal LoV input
                data.getData().get(""), // value to search
                "", //name of the data
                " on SEARCH")) {
            return false;
        }

        Functions.break_time(driver, 6, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"route_se_lov2_route", getElements("route_se_lov2_route")}, //LoV button
                new String[]{"route_se_i_route", getElements("route_se_i_route")}, //external LoV input
                new String[]{"route_se_lov2_i_route", getElements("route_se_lov2_i_route")}, //internal LoV input
                data.getData().get(""), // value to search
                "", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"route_b_search", getElements("route_b_search")}, //search button
                new String[]{"route_result", getElements("route_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }


        return true;
    }

    private boolean Add_routes(TestDriver driver) {

        driver.getReport().addHeader("ADD IN ROUTES BY DEFAULT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"route_b_add", getElements("route_b_add")}, //element to click
                new String[]{"route_add_lov_to_group", getElements("route_add_lov_to_group")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"route_add_lov_to_group", getElements("route_add_lov_to_group")}, // b_lov
                new String[]{"route_add_i_to_group", getElements("route_add_i_to_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_to_group", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"route_add_i_to_group_description", getElements("route_add_i_to_group_description")}, // element path
                "to_group_description", // key for data value (the name)
                " on ADD");
        if (!Functions.selectText(driver,
                new String[]{"route_add_select_text_arrival_departure", getElements("route_add_select_text_arrival_departure")},
                "Arrival", "selec_arrival", " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"route_add_lov2_route", getElements("route_add_lov2_route")}, // b_lov
                new String[]{"route_add_i_route", getElements("route_add_i_route")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lov_route", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"route_add_i_route_description", getElements("route_add_i_route_description")}, // element path
                "route_description", // key for data value (the name)
                " on ADD");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"route_b_save", getElements("route_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }
}
