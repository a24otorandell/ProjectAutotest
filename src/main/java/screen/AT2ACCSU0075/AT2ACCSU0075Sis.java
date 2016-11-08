package screen.AT2ACCSU0075;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2ACCSU0075Sis {
    protected AT2ACCSU0075Locators locators;
    protected AT2ACCSU0075Data data;

    public AT2ACCSU0075Sis() {
    }
    public AT2ACCSU0075Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0075Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0075Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0075Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Setup");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Atributos plantillas");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_accommodation(driver)) return false;
        if (!search_accommodation(driver)) return false;
        if (!interaction_edit_accommodation(driver)) return false;
        if (!search_reset(driver)) return false;
        if (!qbe_accommodation(driver)) return false;
        if (!others_actions_accommodation(driver)) return false;
        if (!delete_accommodation(driver)) return false;
        return false;
    }

    private boolean interaction_record_accommodation(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"setup_b_add", getElements("setup_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_modelo", getElements("add_i_modelo")}, // element path
                "modelo", getData("modelo"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_negocio", getElements("add_i_negocio")}, // element path
                "negocio", getData("negocio"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_grupo", getElements("add_lov_grupo")}, // b_lov
                new String[]{"add_i_grupo", getElements("add_i_grupo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "grupo", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_concepto", getElements("add_lov_concepto")}, // b_lov
                new String[]{"add_i_concepto", getElements("add_i_concepto")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "concepto", //Data name
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_modelo", getElements("search_i_modelo")}, // element path
                "modelo", getData("modelo"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_negocio", getElements("search_i_negocio")}, // element path
                "negocio", getData("negocio"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_grupo", getElements("search_lov_grupo")}, //LoV button
                new String[]{"search_i_grupo", getElements("search_i_grupo")}, //external LoV input
                new String[]{"search_lov_grupo_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("grupo"), // value to search
                "grupo", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_concepto", getElements("search_lov_concepto")}, //LoV button
                new String[]{"search_i_concepto", getElements("search_i_concepto")}, //external LoV input
                new String[]{"search_lov_concepto_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("concepto"), // value to search
                "concepto", //name of the data
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"setup_e_result", getElements("setup_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"setup_b_edit", getElements("setup_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_modelo", getElements("add_i_modelo")}, // element path
                "modelo", getData("modelo_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_negocio", getElements("add_i_negocio")}, // element path
                "negocio", getData("negocio_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_grupo", getElements("add_lov_grupo")}, // b_lov
                new String[]{"add_i_grupo", getElements("add_i_grupo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "grupo", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_concepto", getElements("add_lov_concepto")}, // b_lov
                new String[]{"add_i_concepto", getElements("add_i_concepto")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "concepto", //Data name
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_reset(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RESET", 3, false);
        String where = " on SEARCH RESET";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_accommodation(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"setup_b_qbe", getElements("setup_b_qbe")},// query button
                new String[]{"qbe_i_modelo", getElements("qbe_i_modelo")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_modelo", getElements("qbe_i_modelo")}, // element path
                "modelo", getData("modelo"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_negocio", getElements("qbe_i_negocio")}, // element path
                "negocio", getData("negocio"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_grupo", getElements("qbe_i_grupo")}, // element path
                "grupo", getData("grupo"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_concepto", getElements("qbe_i_concepto")}, // element path
                "concepto", getData("concepto"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_modelo", getElements("qbe_i_modelo")}, //search button
                new String[]{"setup_e_result", getElements("setup_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_accommodation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"setup_b_detach", getElements("setup_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_accommodation(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"setup_b_delete", getElements("setup_b_delete")},
                new String[]{"setup_e_records", getElements("setup_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
