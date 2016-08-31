package screen.AT2TRFSU0011;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import screen.AT2MDMCL0030.AT2MDMCL0030Data;
import screen.AT2MDMCL0030.AT2MDMCL0030Locators;

/**
 * Created by vsolis on 29/08/2016.
 */
public class AT2TFRSU0011Test {

    protected AT2TFRSU0011Locators locators;
    protected AT2TFRSU0011Data data;

    public AT2TFRSU0011Test() {

    }

    public AT2TFRSU0011Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TFRSU0011Locators locators) {
        this.locators = locators;
    }
    public AT2TFRSU0011Data getData() {
        return data;
    }
    public void setData(AT2TFRSU0011Data data) {
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
        if (!Quality_rules(driver)) {
            return false;
        }
        if (!Go_to_temporaly_rules(driver)) {
            return false;
        }
        if (!Temporaly_quality_rules(driver)) {
            return false;
        }
        if (!Calidad_vuelos_tiempo(driver)) {
            return false;
        }
        if (!Calidad_tiempo_antela(driver)) {
            return false;
        }
        if (!Delete_qualityRules(driver)) {
            return false;
        }
        return true;
    }


    private boolean Calidad_vuelos_tiempo(TestDriver driver) {
        if (!Add_vuelos(driver)) {
            return false;
        }
        if (!Search_vuelos(driver)) {
            return false;
        }
        if (!Edit_vuelos(driver)) {
            return false;
        }
        if (!Search_vuelos(driver)) {
            return false;
        }
        if (!QBE_vuelos(driver)) {
            return false;
        }
        if (!Other_actions_vuelos(driver)) {
            return false;
        }
        if (!Delete_vuelos(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Calidad_tiempo_antela(TestDriver driver) {
        if (!Search_antela(driver)) {
            return false;
        }
        if (!Add_antela(driver)) {
            return false;
        }
        if (!QBE_antela(driver)) {
            return false;
        }
        if (!Edit_antela(driver)) {
            return false;
        }
        if (!other_actions_antela(driver)) {
            return false;
        }
        if (!Delete_antela(driver)) {
            return false;
        }
        return false;
    }

    private boolean Temporaly_quality_rules(TestDriver driver) {
        if (!Creation_temporaly(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Go_to_temporaly_rules(TestDriver driver) {
        driver.getReport().addHeader("GO TO TEMPORALY RULES", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"b_actions", getElements("b_actions")}, //element to click
                new String[]{"b_actions_b_teporary", getElements("b_actions_b_teporary")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on TEMPORALY")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"b_actions_b_teporary", getElements("b_actions_b_teporary")}, //element to click
                new String[]{"rules_b_save", getElements("rules_b_save")}, //element expected to appear
                " on TEMPORALY")) {
            return false;
        }
        return true;
    }

    private boolean Delete_vuelos(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN CALIDAD VUELOS TIEMPO", 3, false);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"tiempo_b_delete", getElements("tiempo_b_delete")},
                new String[]{"tiempo_n_records", getElements("tiempo_n_records")},
                new String[]{"tiempo_ss_delete_b_yes", getElements("tiempo_ss_delete_b_yes")},
                " on DELETE IN VUELOS")) {
            return false;
        }


        return false;
    }

    private boolean Other_actions_vuelos(TestDriver driver) {

        driver.getReport().addHeader("DETACH IN CALIDAD VUELOS TIEMPO", 3, false);
        if (!Functions.detachTable(driver,
                new String[]{"tiempo_detach_b", getElements("tiempo_detach_b")}, //detach button
                true,     //screenshot??
                " on DETACH IN VUELOS")) {
            return false;
        }


        return false;
    }

    private boolean Edit_vuelos(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN CALIDAD VUELOS TIEMPO", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"tiempo_ed_b_edit", getElements("tiempo_ed_b_edit")},
                recursiveXPaths.glass,
                " on EDITION IN VUELOS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tiempo_ed_sel_ad", getElements("tiempo_ed_sel_ad")},
                getData("vu_e/d"), "vu_e/d", " on EDITION IN VUELO")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"tiempo_ed_lov", getElements("tiempo_ed_lov")}, // b_lov
                new String[]{"tiempo_ed_i_transfer", getElements("tiempo_ed_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "vu_to", //Data name
                " on EDITION IN VUELOS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tiempo_ed_i_time", getElements("tiempo_ed_i_time")},
                getData("vu_ti"), "vu_eti", " on EDITION IN VUELOS")) {
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"tiempo_ed_b_save", getElements("tiempo_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION IN VUELOS");
        return false;
    }

    private boolean QBE_vuelos(TestDriver driver) {
        driver.getReport().addHeader("QBE IN CALIDAD VUELOS TIEMPO", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"tiempo_qbe_b", getElements("tiempo_qbe_b")},// query button
                new String[]{"tiempo_qbe_i_time", getElements("tiempo_qbe_i_time")},//any query input
                " on QBE IN VUELOS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tiempo_qbe_sel_ad", getElements("tiempo_qbe_sel_ad")},
                getData("vu_ad"), "vu_ad", " on QBE IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_qbe_i_time", getElements("tiempo_qbe_i_time")},
                "vu_tim", getData("vu_tim"), " on QBE IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_qbe_i_transfer", getElements("tiempo_qbe_i_transfer")},
                "vu_tra", getData("vu_tra"), " on QBE IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_qbe_i_description", getElements("tiempo_qbe_i_description")},
                "vu_des", getData("vu_des"), " on QBE IN VUELOS")) {
            return false;
        }
        return false;
    }

    private boolean Add_vuelos(TestDriver driver) {
        driver.getReport().addHeader("ADD VUELOS IN CALIDAD VUELOS TIEMPO", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"tiempo_b_add", getElements("tiempo_b_add")},
                recursiveXPaths.glass,
                " on CREATION IN VUELOS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tiempo_cr_sel_ad", getElements("tiempo_cr_sel_ar/de")},
                getData("arrival"), "arrival", " on CREATION IN VUELOS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"tiempo_cr_i_transfer", getElements("tiempo_cr_i_transfer")},
                "vu_tra", getData("vu_tra"), " on CREATION IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_cr_i_time", getElements("tiempo_cr_i_time")},
                "vu_tim", getData("vu_tim"), " on CREATION IN VUELOS")) {
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"tiempo_cr_b_save", getElements("tiempo_cr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on CREATION IN VUELOS");
        return false;
    }

    private boolean Search_vuelos(TestDriver driver) {
        driver.getReport().addHeader("ADVANCED SEARCH IN CALIDAD VUELOS TIEMPO ", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"tiempo_b_advanced", getElements("tiempo_b_advanced")}, //element to click
                new String[]{"tiempo_search_i_time", getElements("tiempo_search_i_time")}, //element expected to appear
                " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"tiempo_search_sel_ad", getElements("tiempo_search_sel_ad")},
                getData("arrival"), "arrival", " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_search_i_time", getElements("tiempo_search_i_time")},
                "vu_tim", getData("vu_tim"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_search_i_transfer", getElements("tiempo_search_i_transfer")},
                "vu_tra", getData("vu_tra"), " on SEARCH")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"tiempo_search_lov", getElements("tiempo_search_lov")}, // b_lov
                new String[]{"tiempo_search_i_transfer", getElements("tiempo_search_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "vu_to", //Data name
                " on SEARCH"))

            if (!Functions.insertInput(driver, new String[]{"tiempo_search_i_description", getElements("tiempo_search_i_description")},
                    "vu_des", getData("vu_des"), " on SEARCH")) {
                return false;
            }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"tiempo_b_search", getElements("tiempo_b_search")}, //search button
                new String[]{"", getElements("")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }
        return false;
    }

    private boolean Creation_temporaly(TestDriver driver) {
        driver.getReport().addHeader("MODIFY VALUES IN TEMPORARY QUALITY RULES", 3, false);

        if (!Functions.zoomOut(driver, 2)) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"rules_gr_add_i_arrivals", getElements("rules_gr_add_i_arrivals")},
                "gr_arrivals", getData("gr_arrivals"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_gr_add_i_departures", getElements("rules_gr_add_i_departures")},
                "gr_departures", getData("gr_departures"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_nu_add_i_arrivals", getElements("rules_nu_add_i_arrivals")},
                "nu_arrivals", getData("nu_arrivals"), " on CREATE TEMPORALY ")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_nu_add_i_departures", getElements("rules_nu_add_i_departures")},
                "nu_departures", getData("nu_departures"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_ti_add_i_arrivals", getElements("rules_ti_add_i_arrivals")},
                "ti_arrivals", getData("ti_arrivals"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_ti_add_i_departures", getElements("rules_ti_add_i_departures")},
                "ti_departures", getData("ti_departures"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_tb_add_i_arrivals", getElements("rules_tb_add_i_arrivals")},
                "tb_arrivals", getData("tb_arrivals"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_tb_add_i_departures", getElements("rules_tb_add_i_departures")},
                "tb_departures", getData("tb_departures"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_dep_add_i_pax", getElements("rules_dep_add_i_pax")},
                "pax_arrivals", getData("pax_arrivals"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_dep_add_i_every", getElements("rules_dep_add_i_every")},
                "every_departures", getData("every_departures"), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"rules_b_safe", getElements("rules_b_safe")}, //element to click
                new String[]{"rules_b_save_b_ok", getElements("rules_b_save_b_ok")}, //element expected to appear
                " on CREATE TEMPORALY")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"rules_b_save_b_ok", getElements("rules_b_save_b_ok")}, //element to click
                new String[]{"rules_b_save_b_ok", getElements("rules_b_save_b_ok")}, //element expected to disappear
                " on CREATE TEMPORALY")) {
            return false;
        }

        return true;
    }

    private boolean Delete_antela(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"antela_b_delete", getElements("antela_b_delete")},
                new String[]{"antela_n_records", getElements("antela_n_records")},
                new String[]{"antela_ss_delete_b_yes", getElements("antela_ss_delete_b_yes")},
                " on DELETE IN ANTELA")) {
            return false;
        }


        return false;
    }

    private boolean other_actions_antela(TestDriver driver) {

        driver.getReport().addHeader("DETACH IN CALIDAD VUELOS ANTELA", 3, false);
        if (!Functions.detachTable(driver,
                new String[]{"antela_detach_b", getElements("antela_detach_b")}, //detach button
                true,     //screenshot??
                " on DETACH IN ANTELA")) {
            return false;
        }


        return false;
    }

    private boolean Edit_antela(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN CALIDAD VUELOS ANTELA", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"antela_ed_b_edit", getElements("antela_ed_b_edit")},
                recursiveXPaths.glass,
                " on EDITION IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_ed_sel_ad", getElements("antela_ed_sel_ad")},
                getData("ant_e/d"), "ant_e/d", " on EDITION IN ANTELA")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"antela_ed_lov", getElements("antela_ed_lov")}, // b_lov
                new String[]{"antela_ed_i_transfer", getElements("antela_ed_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_to", //Data name
                " on EDITION IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_ed_i_time", getElements("antela_ed_i_time")},
                getData("ant_ti"), "ant_eti", " on EDITION IN ANTELA")) {
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"antela_ed_b_save", getElements("antela_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION IN ANTELA");
        return true;
    }

    private boolean QBE_antela(TestDriver driver) {
        driver.getReport().addHeader("QBE  IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"antela_qbe_b", getElements("antela_qbe_b")},// query button
                new String[]{"antela_qbe_i_time", getElements("antela_qbe_i_time")},//any query input
                " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_qbe_sel_ad", getElements("antela_qbe_sel_ad")},
                getData("ant_ad"), "ant_ad", " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_time", getElements("antela_qbe_i_time")},
                "ant_tim", getData("ant_tim"), " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_qbe_i_transfer", getElements("tiempo_qbe_i_transfer")},
                "ant_tra", getData("ant_tra"), " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_description", getElements("antela_qbe_i_description")},
                "ant_des", getData("ant_des"), " on QBE IN ANTELA")) {
            return false;
        }
        {
            return false;
        } // where
    }

    private boolean Add_antela(TestDriver driver) {
        driver.getReport().addHeader("ADD VUELOS IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"antela_cr_b_add", getElements("antela_cr_b_add")},
                recursiveXPaths.glass,
                " on CREATION IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_cr_sel_ad", getElements("antela_cr_sel_ad")},
                getData("ant_ad"), "ant_ad", " on CREATION IN ANTELA")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"antela_cr_i_transfer", getElements("antela_cr_i_transfer")},
                "ant_tra", getData("ant_tra"), " on CREATION IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_cr_i_time", getElements("antela_cr_i_time")},
                "ant_tim", getData("ant_tim"), " on CREATION IN ANTELA")) {
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"antela_cr_b_save", getElements("antela_cr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on CREATION IN ANTELA");
        return false;
    }

    private boolean Search_antela(TestDriver driver) {

        driver.getReport().addHeader("ADVANCED SEARCH IN CALIDAD TIEMPO ANTELA  ", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"antela_b_advanced", getElements("antela_b_advanced")}, //element to click
                new String[]{"antela_search_i_time", getElements("antela_search_i_time")}, //element expected to appear
                " on SEARCH IN ANTELA")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"antela_search_sel_ad ", getElements("antela_search_sel_ad")},
                getData("ant_ar"), "ant_ar", " on SEARCH IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_search_i_time", getElements("antela_search_i_time")},
                "ant_tim", getData("ant_tim"), " on SEARCH IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_search_i_transfer", getElements("antela_search_i_transfer")},
                "ant_tra", getData("ant_tra"), " on SEARCH IN ANTELA")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"antela_search_lov", getElements("antela_search_lov")}, // b_lov
                new String[]{"antela_search_i_transfer", getElements("antela_search_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_to", //Data name
                " on SEARCH IN ANTELA"))

            if (!Functions.insertInput(driver, new String[]{"antela_search_i_description", getElements("antela_search_i_description")},
                    "ant_des", getData("ant_des"), " on SEARCH IN ANTELA")) {
                return false;
            }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"antela_b_search", getElements("antela_b_search")}, //search button
                new String[]{"antela_search_t_result", getElements("antela_search_t_result")}, //Falta crear este resultado por bug
                " on SEARCH IN ANTELA")) {
            return false;
        }
        return false;
    }


    private boolean Quality_rules(TestDriver driver) {
        if (!Creation_qualityRules(driver)) {
            return false;
        }
        if (!Search_qualityRules(driver)) {
            return false;
        }
        if (!Edit_qualityRules(driver)) {
            return false;
        }
        if (!Search_qualityRules(driver)) {
            return false;
        }
        if (!QBE_qualityRules(driver)) {
            return false;
        }
        if (!Oher_Actions_qualityRules(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Delete_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("DELETE RECORD", 3, false);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"b_delete", getElements("b_delete")},
                new String[]{"n_records", getElements("n_records")},
                new String[]{"ss_delete_b_yes", getElements("ss_delete_b_yes")},
                " on DELETE")) {
            return false;
        }

        return true;
    }

    private boolean Oher_Actions_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA RECORD", 3, false);
        if (!Functions.auditData(driver,
                new String[]{"b_actions", getElements("b_actions")}, //actions button
                new String[]{"b_actions_b_audit", getElements("b_actions_b_audit")}, //audit button
                new String[]{"b_actions_b_close", getElements("b_actions_b_close")}, //audit_b_ok
                " on AUDIT DATA")) {
            return false;
        }//where this occurs
        driver.getReport().addHeader("DETACH RECORD", 3, false);
        if (!Functions.detachTable(driver,
                new String[]{"detach_b", getElements("detach_b")}, //detach button
                true,     //screenshot??
                " on DETACH")) {
            return false;
        }    //where this occurs

        return true;
    }

    private boolean QBE_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        if (!Functions.clickQbE(driver,
                new String[]{"qbe_b", getElements("qbe_b")},// query button
                new String[]{"qbe_to_group_i", getElements("qbe_to_group_i")},//any query input
                " on QBE")) {
            return false;
        } // where the operation occurs
        if (!Functions.selectText(driver,
                new String[]{"qbe_select_active", getElements("qbe_select_active")},
                getData("active"), "active", " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_to_group_i", getElements("qbe_to_group_i")},
                "to", getData("to"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "to_descriptions", getData("to_descriptions"), " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_to_group_i", getElements("qbe_to_group_i")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
                " on QBE")) {
            return false;
        } // where
        return true;
    }

    private boolean Edit_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"b_edit", getElements("b_edit")},
                recursiveXPaths.glass,
                " on EDITION")) {
            return false;
        }
        Functions.checkboxValue(driver,
                getElements("ss_edit_cb_active"), "active", false, true, " on EDITION");

        if (!Functions.createLov(driver,
                new String[]{"ss_edit_lov_to_group", getElements("ss_edit_lov_to_group")}, // b_lov
                new String[]{"ss_edit_i_to_group", getElements("ss_edit_i_to_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                " on EDITION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ss_edit_i_to_group_description", getElements("ss_edit_i_to_group_description")}, // element path
                "to_descriptions", // key for data value (the name)
                " on EDTION"); // whoere this operation occurs
        Functions.checkClickByAbsence(driver,
                new String[]{"ss_add_b_save", getElements("ss_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION");
        return true;
    }

    private boolean Search_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        if (!Functions.selectText(driver,
                new String[]{"search_sel_active", getElements("search_sel_active")},
                getData("active"), "active", " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"search_i_to_group", getElements("search_i_to_group")},
                "to", getData("to"), " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"search_i_desc", getElements("search_i_desc")},
                "to_descriptions", "%" + getData("to_descriptions"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
                " on SEARCH")) {
            return false;
        } // where
        return true;
    }

    private boolean Creation_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        Functions.break_time(driver, 10, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_add", getElements("b_add")},
                recursiveXPaths.glass,
                " on CREATION")) {
            return false;
        }
        Functions.checkboxValue(driver,
                getElements("ss_add_cb_active"), "active", true, true, " on CREATION");
        if (!Functions.createLov(driver,
                new String[]{"ss_add_lov_to_group", getElements("ss_add_lov_to_group")}, // b_lov
                new String[]{"ss_add_i_to_group", getElements("ss_add_i_to_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                " on CREATION")) {
            return false;
        }

        Functions.getValue(driver, new String[]{"ss_add_i_to_group_description", getElements("ss_add_i_to_group_description")}, // element path
                "to_descriptions", // key for data value (the name)
                " on CREATION"); // whoere this operation occurs

        Functions.checkClickByAbsence(driver,
                new String[]{"ss_add_b_save", getElements("ss_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on CREATION");
        return true;
    }

}
