package screen.AT2TRFSU0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 07/09/2016.
 */
public class AT2TRFSU0016Sis {
    protected AT2TRFSU0016Locators locators;
    protected AT2TRFSU0016Data data;

    public AT2TRFSU0016Sis() {

    }

    public AT2TRFSU0016Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0016Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0016Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0016Data data) {
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

        if (!Aditional_suplements(driver)) {
            return false;
        }


        return false;
    }

    private boolean Aditional_suplements(TestDriver driver) {

        if (!Add_aditional(driver)) {
            return false;
        }
        if (!Search_aditional(driver)) {
            return false;
        }
        if (!Edit_aditional(driver)) {
            return false;

        }
        if (!Search2_aditional(driver)) {
            return false;

        }
        if (!QBE_aditional(driver)) {
            return false;

        }

        if (!Other_actions_aditional(driver)) {
            return false;
        }

        if (!Delete_aditional(driver)) {
            return false;
        }
        return true;
    }

    private boolean Delete_aditional(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN ADITIONAL SUPLEMENTS", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"b_delete", getElements("b_delete")},
                new String[]{"records", getElements("records")},
                new String[]{"b_del_ok", getElements("b_del_ok")},
                " on DELETE IN GROUPING")) {
            return false;
        }

        return true;
    }

    private boolean Other_actions_aditional(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN ADITIONAL SUPLEMENTS", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"b_actions", getElements("b_actions")}, //actions button
                new String[]{"o_ac_auditdata", getElements("o_ac_auditdata")}, //audit button
                new String[]{"b_ac_exit", getElements("b_ac_exit")}, //audit_b_ok
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

    private boolean QBE_aditional(TestDriver driver) {
        driver.getReport().addHeader("QBE  IN ADITIONAL SUPLEMENTS", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"b_qbe", getElements("b_qbe")},// query button
                new String[]{"qbe_type", getElements("qbe_type")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_type", getElements("qbe_type")},
                "qbe_aa", data.getData().get("adi2_ta"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_description", getElements("qbe_description")},
                "qbe_ee", data.getData().get("adi2_descr"), " on QBE ")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_pursa", getElements("qbe_pursa")},
                "Sale", "qbe_ii", "  on QBE ")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"qbe_peruni", getElements("qbe_peruni")},
                "Unit", "qbe_per", " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_unit", getElements("qbe_unit")},
                "qbe_uu", data.getData().get("adi2_mon"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_currency", getElements("qbe_currency")},
                "qbe_cc", data.getData().get("adi2_tee"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_guide", getElements("qbe_guide")},
                "qbe_vv", data.getData().get("adi2_dse"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"qbe_remarks", getElements("qbe_remarks")},
                "qbe_bb", data.getData().get("adi2_tuu"), " on QBE ")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_description", getElements("qbe_description")}, //search button
                new String[]{"result", getElements("result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }

    private boolean Search2_aditional(TestDriver driver) {
        driver.getReport().addHeader(" BASIC SEARCH2 IN ADITIONAL SUPLEMENTS", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"b_reset", getElements("b_reset")}, //element to click
                " on SEARCH2 IN ADITIONAL")) {
            return false;
        }


        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_additional", getElements("s_i_additional")}, //external LoV input
                new String[]{"s_lov_suplement", getElements("s_lov_suplement")}, //internal LoV input
                data.getData().get("adi2_too"), // value to search
                "adi2_ta", //name of the data
                " on SEARCH2 IN ADITIONAL")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"s_ss_pursa", getElements("s_ss_pursa")},
                "Sale", "ant2_dess", " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tuuu", " ", " SEARCH IN ADITIONAL")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"s_ss_perun", getElements("s_ss_perun")},
                "Unit", "adi2_dess", " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tii", data.getData().get("adi2_mon"), " SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov3", getElements("s_lov3")}, //LoV button
                new String[]{"s_i_curren", getElements("s_i_curren")}, //external LoV input
                new String[]{"s_lov3_code", getElements("s_lov3_code")}, //internal LoV input
                data.getData().get("adi2_tee"), // value to search
                "adi2_das", //name of the data
                " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov4", getElements("s_lov4")}, //LoV button
                new String[]{"s_i_guide", getElements("s_i_guide")}, //external LoV input
                new String[]{"s_lov4_code", getElements("s_lov4_code")}, //internal LoV input
                data.getData().get("adi2_dse"), // value to search
                "adi2_des", //name of the data
                " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_remarks", getElements("s_i_remarks")},
                "adi2_tri", data.getData().get("adi2_tuu"), " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"result", getElements("result")}, //Falta crear este resultado por bug
                " on SEARCH IN ADITIONAL")) {
            return false;
        }

        return true;
    }

    private boolean Edit_aditional(TestDriver driver) {

        driver.getReport().addHeader("EDIT IN ADITIONAL SUPLEMENTS", 3, false);

        Functions.break_time(driver, 10, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_edit", getElements("b_edit")}, //element to click
                new String[]{"ed_lov", getElements("ed_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"ed_lov", getElements("ed_lov")}, // b_lov
                new String[]{"ed_i_stype", getElements("ed_i_stype")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi2_too", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ed_i_description", getElements("ed_i_description")}, // element path
                "adi2_descr", // key for data value (the name)
                " on Edit");
        if (!Functions.selectText(driver,
                new String[]{"ed_ss_pursa", getElements("ed_ss_pursa")},
                "Sale", "adi2_pur", " on ADD")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"ed_ss_perun", getElements("ed_ss_perun")},
                "Unit", "adi2_per", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ed_i_unit", getElements("ed_i_unit")},
                "adi2_mon", (Integer.toString(DataGenerator.random(1, 9))), " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"ed_lov3", getElements("ed_lov3")}, // b_lov
                new String[]{"ed_i_currency", getElements("ed_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi2_tee", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"ed_lov4", getElements("ed_lov4")}, // b_lov
                new String[]{"ed_i_guide", getElements("ed_i_guide")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi2_dse", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"ed_i_remarks", getElements("ed_i_remarks")},
                "adi2_tuu", "prueba2", " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"ed_b_save", getElements("ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }

        return true;
    }

    private boolean Search_aditional(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN ADITIONAL SUPLEMENTS", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_additional", getElements("s_i_additional")}, //external LoV input
                new String[]{"s_lov_suplement", getElements("s_lov_suplement")}, //internal LoV input
                data.getData().get("adi_too"), // value to search
                "adi_ta", //name of the data
                " on SEARCH2 IN ADITIONAL")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"s_ss_pursa", getElements("s_ss_pursa")},
                "Purchase", "ant_dess", " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov2", getElements("s_lov2")}, //LoV button
                new String[]{"s_i_supli", getElements("s_i_supli")}, //external LoV input
                new String[]{"s_lov2_suplic", getElements("s_lov2_suplic")}, //internal LoV input
                data.getData().get("adi_taa"), // value to search
                "adi_des", //name of the data
                " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"s_ss_perun", getElements("s_ss_perun")},
                "Person", "adi_dess", " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tii", data.getData().get("adi_mon"), " SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov3", getElements("s_lov3")}, //LoV button
                new String[]{"s_i_curren", getElements("s_i_curren")}, //external LoV input
                new String[]{"s_lov3_code", getElements("s_lov3_code")}, //internal LoV input
                data.getData().get("adi_tee"), // value to search
                "adi_das", //name of the data
                " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov4", getElements("s_lov4")}, //LoV button
                new String[]{"s_i_guide", getElements("s_i_guide")}, //external LoV input
                new String[]{"s_lov4_code", getElements("s_lov4_code")}, //internal LoV input
                data.getData().get("adi_tii"), // value to search
                "adi_des", //name of the data
                " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_remarks", getElements("s_i_remarks")},
                "adi2_tii", data.getData().get("adi_tuu"), " on SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"result", getElements("result")}, //Falta crear este resultado por bug
                " on SEARCH IN ADITIONAL")) {
            return false;
        }

        return true;
    }

    private boolean Add_aditional(TestDriver driver) {

        driver.getReport().addHeader("ADD IN ADITIONAL SUPLEMENTS", 3, false);

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
                new String[]{"add_i_stype", getElements("add_i_stype")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi_too", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "and_des", // key for data value (the name)
                " on ADD");
        if (!Functions.selectText(driver,
                new String[]{"add_ss_pursa", getElements("add_ss_pursa")},
                "Purchase", "adi_pur", " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov2", getElements("add_lov2")}, // b_lov
                new String[]{"add_i_supli", getElements("add_i_supli")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi_taa", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"add_ss_perun", getElements("add_ss_perun")},
                "Person", "adi_per", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_unit", getElements("add_i_unit")},
                "adi_mon", (Integer.toString(DataGenerator.random(1, 3))), " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov3", getElements("add_lov3")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi_tee", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"add_lov4", getElements("add_lov4")}, // b_lov
                new String[]{"add_i_guide", getElements("add_i_guide")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "adi_tii", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"add_i_remarks", getElements("add_i_remarks")},
                "adi_tuu", "prueba", " on ADD")) {
            return false;
        }

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
