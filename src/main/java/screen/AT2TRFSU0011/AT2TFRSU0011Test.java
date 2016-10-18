package screen.AT2TRFSU0011;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 29/08/2016.
 */

    /*
     * Bugs encontrados 2
     * Boton añadir Calidad Tiempos Vuelos no funciona
     * Dentro del boton añadir de Maximum Seats of a Hotel no se rellena el campo descripcion
     *  --> esto pasa porque el hotel ya está siendo usado
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
        if (!Quality_rules(driver)) return false;
        if (!Go_to_temporaly_rules(driver)) return false;
        if (!Temporaly_quality_rules(driver)) return false;
        if (!Calidad_vuelos_tiempo(driver)) return false;
        if (!Calidad_tiempo_antela(driver)) return false;
        if (!Go_to_incompatibiliy_of_areas(driver)) return false;
        if (!Incompatibility_of_areas(driver)) return false;
        if (!Go_to_exclusive_areas(driver)) return false;
        if (!Exclusive_areas(driver)) return false;
        if (!Go_to_maximun_seats_of_a_hotel(driver)) return false;
        if (!Maximun_seats_of_a_hotel(driver)) return false;
        if (!Delete_qualityRules(driver)) return false;
        return false;
    }

    // Go to
    private boolean Go_to_maximun_seats_of_a_hotel(TestDriver driver) {


        driver.getReport().addHeader("GO TO MAXIMUM SEATS OF A HOTEL", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element to click
                new String[]{"quality_rules_oa_b_actions_b_maximum", getElements("quality_rules_oa_b_actions_b_maximum")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on MAXIMUM")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions_b_maximum", getElements("quality_rules_oa_b_actions_b_maximum")}, //element to click
                new String[]{"maximum_ad_b_add", getElements("maximum_ad_b_add")}, //element expected to appear
                " on MAXIMUM")) {
            return false;
        }

        return true;
    }
    private boolean Go_to_exclusive_areas(TestDriver driver) {

        driver.getReport().addHeader("GO TO EXCLUSIVE AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element to click
                new String[]{"quality_rules_oa_b_actions_b_exclusive", getElements("quality_rules_oa_b_actions_b_exclusive")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EXCLUSIVE")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions_b_exclusive", getElements("quality_rules_oa_b_actions_b_exclusive")}, //element to click
                new String[]{"exclusive_ad_b_add", getElements("exclusive_ad_b_add")}, //element expected to appear
                " on EXCLUSIVE")) {
            return false;
        }

        return true;
    }
    private boolean Go_to_incompatibiliy_of_areas(TestDriver driver) {
        driver.getReport().addHeader("GO TO INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"b_actioquality_rules_oa_b_actionsns", getElements("quality_rules_oa_b_actions")}, //element to click
                new String[]{"quality_rules_oa_b_actions_b_incompatibility", getElements("quality_rules_oa_b_actions_b_incompatibility")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions_b_incompatibility", getElements("quality_rules_oa_b_actions_b_incompatibility")}, //element to click
                new String[]{"areas_s_lov_code1", getElements("areas_s_lov_code1")}, //element expected to appear
                " on INCOMPATIBILITY")) {
            return false;
        }
        return true;
    }
    private boolean Go_to_temporaly_rules(TestDriver driver) {
        driver.getReport().addHeader("GO TO TEMPORALY RULES", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element to click
                new String[]{"quality_rules_oa_b_actions_b_teporary", getElements("quality_rules_oa_b_actions_b_teporary")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on TEMPORALY")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_oa_b_actions_b_teporary", getElements("quality_rules_oa_b_actions_b_teporary")}, //element to click
                new String[]{"rules_b_save", getElements("rules_b_save")}, //element expected to appear
                " on TEMPORALY")) {
            return false;
        }
        return true;
    }

    //Quality rules
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
                new String[]{"quality_rules_b_delete", getElements("quality_rules_b_delete")},
                new String[]{"quality_rules_records", getElements("quality_rules_records")},
                new String[]{"quality_rules_delete_b_yes", getElements("quality_rules_delete_b_yes")},
                " on DELETE")) {
            return false;
        }

        return true;
    }
    private boolean Oher_Actions_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA RECORD", 3, false);
        if (!Functions.auditData(driver,
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //actions button
                new String[]{"quality_rules_oa_b_actions_b_audit", getElements("quality_rules_oa_b_actions_b_audit")}, //audit button
                new String[]{"quality_rules_oa_b_actions_b_close", getElements("quality_rules_oa_b_actions_b_close")}, //audit_b_ok
                " on AUDIT DATA")) {
            return false;
        }//where this occurs
        driver.getReport().addHeader("DETACH RECORD", 3, false);
        if (!Functions.detachTable(driver,
                new String[]{"quality_rules_oa_b_detach", getElements("quality_rules_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on DETACH")) {
            return false;
        }    //where this occurs

        return true;
    }
    private boolean QBE_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        if (!Functions.clickQbE(driver,
                new String[]{"quality_rules_qbe_b_qbe", getElements("quality_rules_qbe_b_qbe")},// query button
                new String[]{"quality_rules_qbe_sl_active", getElements("quality_rules_qbe_sl_active")},//any query input
                " on QBE")) {
            return false;
        } // where the operation occurs
        if (!Functions.selectText(driver,
                new String[]{"quality_rules_qbe_sl_active", getElements("quality_rules_qbe_sl_active")},
                data.getData().get("active"), "active", " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"quality_rules_qbe_i_to_or_group", getElements("quality_rules_qbe_i_to_or_group")},
                "qbe_to_group", data.getData().get("to_group"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"quality_rules_qbe_i_to_or_group_description", getElements("quality_rules_qbe_i_to_or_group_description")},
                "qbe_to_group_description", data.getData().get("to_group_descrip"), " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"quality_rules_qbe_i_to_or_group_description", getElements("quality_rules_qbe_i_to_or_group_description")}, //search button
                new String[]{"quality_rules_se_result", getElements("quality_rules_se_result")}, //result element
                " on QBE")) {
            return false;
        } // where
        return true;
    }
    private boolean Edit_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_b_edit", getElements("quality_rules_b_edit")},
                recursiveXPaths.glass,
                " on EDITION")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("quality_rules_ed_cb_active"), "active", false, true, " on EDITION")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"quality_rules_ed_lov_to_group", getElements("quality_rules_ed_lov_to_group")}, // b_lov
                new String[]{"quality_rules_ed_i_to_group", getElements("quality_rules_ed_i_to_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_group", //Data name
                " on EDITION")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"quality_rules_ed_i_to_group_description", getElements("quality_rules_ed_i_to_group_description")}, // element path
                "to_group_descrip", // key for data value (the name)
                " on EDTION"); // whoere this operation occurs
        Functions.checkClickByAbsence(driver,
                new String[]{"quality_rules_ed_b_save", getElements("quality_rules_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION");
        return true;
    }
    private boolean Search_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        if (!Functions.selectText(driver,
                new String[]{"quality_rules_se_sl_active", getElements("quality_rules_se_sl_active")},
                data.getData().get("active"), "se_active", " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"quality_rules_se_i_to_group", getElements("quality_rules_se_i_to_group")},
                "se_to_group", data.getData().get("to_group"), " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"quality_rules_se_i_to_group_description", getElements("quality_rules_se_i_to_group_description")},
                "se_to_group_description", "%" + data.getData().get("to_group_descrip"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"quality_rules_se_b_search", getElements("quality_rules_se_b_search")}, //search button
                new String[]{"quality_rules_se_result", getElements("quality_rules_se_result")}, //result element
                " on SEARCH")) {
            return false;
        } // where
        return true;
    }
    private boolean Creation_qualityRules(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        Functions.break_time(driver, 10, 500);
        if (!Functions.checkClick(driver,
                new String[]{"quality_rules_b_add", getElements("quality_rules_b_add")},
                recursiveXPaths.glass,
                " on CREATION")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("quality_rules_add_cb_active"), "active", true, true, " on CREATION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"quality_rules_add_lov_to_group", getElements("quality_rules_add_lov_to_group")}, // b_lov
                new String[]{"quality_rules_add_i_to_group", getElements("quality_rules_add_i_to_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_group", //Data name
                " on CREATION")) {
            return false;
        }

        Functions.getValue(driver, new String[]{"quality_rules_add_i_to_group_description", getElements("quality_rules_add_i_to_group_description")}, // element path
                "to_group_descrip", // key for data value (the name)
                " on CREATION"); // whoere this operation occurs

        Functions.checkClickByAbsence(driver,
                new String[]{"quality_rules_add_b_save", getElements("quality_rules_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on CREATION");
        return true;
    }

    // Calidad, Temporaly
    private boolean Calidad_vuelos_tiempo(TestDriver driver) {
        driver.getReport().addHeader("MODIFY VALUES IN TEMPORARY QUALITY RULES", 3, false);
        driver.getReport().addContent("", "br", "");
        driver.getReport().addContent("This block is a style guide and for this reason, only enters and get out, for more information see QA-10978.", "h3", "class='success'");
        driver.getReport().addContent("", "br", "");
        /*
        if (!Add_vuelos(driver)) return false;
        if (!Search_vuelos(driver)) return false;
        if (!Edit_vuelos(driver)) return false;
        if (!Search_vuelos(driver)) return false;
        if (!QBE_vuelos(driver)) return false;
        if (!Other_actions_vuelos(driver)) return false;
        if (!Delete_vuelos(driver)) return false;
        */
        driver.getReport().closeBlock();
        return true;
    }
    /**
     * BUG REPORTADO EN JIRA QA-10978
     */

    private boolean Calidad_tiempo_antela(TestDriver driver) {
        if (!Add_antela(driver)) {
            return false;
        }
        if (!Search_antela(driver)) {
            return false;
        }
        if (!Edit_antela(driver)) {
            return false;
        }

        if (!QBE_antela(driver)) {
            return false;
        }
        if (!other_actions_antela(driver)) {
            return false;
        }
        if (!Delete_antela(driver)) {
            return false;
        }
        if (!Skip_quality_rules(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }
    private boolean Temporaly_quality_rules(TestDriver driver) {
        if (!Creation_temporaly(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Creation_temporaly(TestDriver driver) {
        driver.getReport().addHeader("MODIFY VALUES IN TEMPORARY QUALITY RULES", 3, false);

        if (!Functions.zoomOut(driver, 2)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"rules_gr_add_i_arrivals", getElements("rules_gr_add_i_arrivals")},
                "gr_arrivals",
                Integer.toString(DataGenerator.random(1, 3)),
                " on CREATE TEMPORALY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"rules_gr_add_i_departures", getElements("rules_gr_add_i_departures")},
                "gr_departures", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"rules_nu_add_i_arrivals", getElements("rules_nu_add_i_arrivals")},
                "nu_arrivals", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY ")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"rules_nu_add_i_departures", getElements("rules_nu_add_i_departures")},
                "nu_departures", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_ti_add_i_arrivals", getElements("rules_ti_add_i_arrivals")},
                "ti_arrivals", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_ti_add_i_departures", getElements("rules_ti_add_i_departures")},
                "ti_departures", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_tb_add_i_arrivals", getElements("rules_tb_add_i_arrivals")},
                "tb_arrivals", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_tb_add_i_depertures", getElements("rules_tb_add_i_depertures")},
                "tb_departures", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_dep_add_i_pax", getElements("rules_dep_add_i_pax")},
                "pax_arrivals", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_dep_add_i_every", getElements("rules_dep_add_i_every")},
                "every_departures", (Integer.toString(DataGenerator.random(1, 100))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"rules_b_save", getElements("rules_b_save")}, //element to click
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

    private boolean Skip_quality_rules(TestDriver driver) {
        driver.getReport().addHeader("SKIP TO QUALITY RULES", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"tiempo_b_actions", getElements("tiempo_b_actions")}, //element to click
                new String[]{"tiempo_b_actions_tour", getElements("tiempo_b_actions_tour")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on QUALITY")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"tiempo_b_actions_tour", getElements("tiempo_b_actions_tour")}, //element to click
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element expected to appear
                " on QUALITY")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"quality_rules_se_b_search", getElements("quality_rules_se_b_search")}, //search button
                new String[]{"quality_rules_se_result", getElements("quality_rules_se_result")}, //result element
                " on QUALITY")) {
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
                "vu_ad", "vu_ad", " on EDITION IN VUELO")) {
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
                "vu_ad", "arrival", " on QBE IN VUELOS")) {
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
                " on ADD IN VUELOS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tiempo_cr_sel_ad", getElements("tiempo_cr_sel_ad")},
                "Arrival", "vu_ad", " on ADD IN VUELOS")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"tiempo_cr_lov", getElements("tiempo_cr_lov")}, // b_lov
                new String[]{"tiempo_cr_i_transfer", getElements("tiempo_cr_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                " on ADD IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_cr_i_time", getElements("tiempo_cr_i_time")},
                "vu_tim", (Integer.toString(DataGenerator.random(1, 3))), " on ADD IN VUELOS")) {
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"tiempo_cr_b_save", getElements("tiempo_cr_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN VUELOS");
        return false;
    }
    private boolean Search_vuelos(TestDriver driver) {
        driver.getReport().addHeader("ADVANCED SEARCH IN CALIDAD VUELOS TIEMPO ", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"tiempo_b_advanced", getElements("tiempo_b_advanced")}, //element to click
                new String[]{"tiempo_search_i_time", getElements("tiempo_search_i_time")}, //element expected to appear
                " on SEARCH IN VUELOS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"tiempo_search_sel_ad", getElements("tiempo_search_sel_ad")},
                getData("vu_ad"), "vu_ad", " on SEARCH IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_search_i_time", getElements("tiempo_search_i_time")},
                "vu_tim", getData("vu_tim"), " on SEARCH IN VUELOS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tiempo_search_i_transfer", getElements("tiempo_search_i_transfer")},
                "vu_tra", getData("vu_tra"), " on SEARCH IN VUELOS")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"tiempo_search_lov", getElements("tiempo_search_lov")}, // b_lov
                new String[]{"tiempo_search_i_transfer", getElements("tiempo_search_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "vu_to", //Data name
                " on SEARCH IN VUELOS"))

            if (!Functions.insertInput(driver, new String[]{"tiempo_search_i_description", getElements("tiempo_search_i_description")},
                    "vu_des", getData("vu_des"), " on SEARCH IN VUELOS")) {
                return false;
            }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"tiempo_b_search", getElements("tiempo_b_search")}, //search button
                new String[]{"", getElements("")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }
        return true;
    }

    private boolean Delete_antela(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"antela_b_delete", getElements("antela_b_delete")},
                new String[]{"antela_se_records", getElements("antela_se_records")},
                new String[]{"antela_del_b_yes", getElements("antela_del_b_yes")},
                " on DELETE IN ANTELA")) {
            return false;
        }


        return true;
    }
    private boolean other_actions_antela(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"antela_b_actions", getElements("antela_b_actions")}, //actions button
                new String[]{"antela_b_audit_data", getElements("antela_b_audit_data")}, //audit button
                new String[]{"antela_b_audit_close", getElements("antela_b_audit_close")}, //audit_b_ok
                " on AUDIT DATA")) {
            return false;
        }




        if (!Functions.detachTable(driver,
                new String[]{"antela_detach_b", getElements("antela_detach_b")}, //detach button
                true,     //screenshot??
                " on DETACH IN ANTELA")) {
            return false;
        }


        return true;
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
                new String[]{"antela_add_sl_arrival_departure", getElements("antela_add_sl_arrival_departure")},
                "Departure", "arrival_departure", " on EDITION IN ANTELA")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"antela_add_lov_transfer_type", getElements("antela_add_lov_transfer_type")}, // b_lov
                new String[]{"antela_add_i_transfer_type", getElements("antela_add_i_transfer_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_type", //Data name
                " on EDITION IN ANTELA")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"antela_add_e_transfer_type_description", getElements("antela_add_e_transfer_type_description")}, // element path
                "transfer_type_description", // key for data value (the name)
                " on ADD IN ANTELA");
        if (!Functions.insertInput(driver,
                new String[]{"antela_add_i_time", getElements("antela_add_i_time")},
                "time", "26", " on EDITION IN ANTELA")) {
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
        if (!Functions.simpleClick(driver,
                new String[]{"antela_se_b_reset", getElements("antela_se_b_reset")}, //element to click
                " on QBE IN ANTELA ")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"antela_qbe_b", getElements("antela_qbe_b")},// query button
                new String[]{"antela_qbe_sel_ad", getElements("antela_qbe_sel_ad")},//any query input
                " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_qbe_sel_ad", getElements("antela_qbe_sel_ad")},
                "Departure", "and_dess", " on SEARCH IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_time", getElements("antela_qbe_i_time")},
                "ant_tii", "26", " on SEARCH IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_transfer", getElements("antela_qbe_i_transfer")},
                "ant_tra2", "G", " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_description", getElements("antela_qbe_i_description")},
                "ant2_des", "Groups", " on QBE IN ANTELA")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"antela_qbe_i_time", getElements("antela_qbe_i_time")}, //search button
                new String[]{"antela_se_records", getElements("antela_se_records")}, //result element
                " on QBE IN ANTELA")) {
            return false;
        }


        return true;
        // where
    }
    private boolean Add_antela(TestDriver driver) {
        driver.getReport().addHeader("ADD VUELOS IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"antela_b_advanced", getElements("antela_b_advanced")}, //element to click
                new String[]{"antela_se_i_time", getElements("antela_se_i_time")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN ANTELA")) {
            return false;
        }

        Functions.break_time(driver, 10, 500);


        if (!Functions.checkClick(driver,
                new String[]{"antela_add_b_add", getElements("antela_add_b_add")},
                recursiveXPaths.glass,
                " on ADD IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_add_i_time", getElements("antela_add_i_time")},
                "time", "25", " on ADD IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_add_sl_arrival_departure", getElements("antela_add_sl_arrival_departure")},
                "Arrival", "arrival_departure", " on CREATION IN ANTELA")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"antela_add_lov_transfer_type", getElements("antela_add_lov_transfer_type")}, // b_lov
                new String[]{"antela_add_i_transfer_type", getElements("antela_add_i_transfer_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_type", //Data name
                " on SEARCH IN ANTELA")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"antela_add_e_transfer_type_description", getElements("antela_add_e_transfer_type_description")}, // element path
                "transfer_type_description", // key for data value (the name)
                " on ADD IN ANTELA");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"antela_add_b_save", getElements("antela_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on CREATION IN ANTELA")) {
            return false;
        }
        return true;
    }
    private boolean Search_antela(TestDriver driver) {

        driver.getReport().addHeader("ADVANCED SEARCH IN CALIDAD TIEMPO ANTELA  ", 3, false);

        if (!Functions.selectText(driver,
                new String[]{"antela_se_sl_arrival_departure", getElements("antela_se_sl_arrival_departure")},
                data.getData().get("arrival_departure"), "se_arrival_departure", " on ADD IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_se_i_time", getElements("antela_se_i_time")},
                "se_time", data.getData().get("time"), " on SEARCH IN ANTELA")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"antela_se_lov_transfer_service_type", getElements("antela_se_lov_transfer_service_type")}, //LoV button
                new String[]{"antela_se_i_transfer_service_type", getElements("antela_se_i_transfer_service_type")}, //external LoV input
                new String[]{"antela_se_lov_i_code", getElements("antela_se_lov_i_code")}, //internal LoV input
                data.getData().get("transfer_type"), // value to search
                "se_transfer_type", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"antela_se_i_transfer_service_type_description", getElements("antela_se_i_transfer_service_type_description")},
                "se_transfer_type_description", data.getData().get("transfer_type_description"), " on SEARCH IN ANTELA")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"antela_se_b_search", getElements("antela_se_b_search")}, //search button
                new String[]{"antela_se_records", getElements("antela_se_records")}, //Falta crear este resultado por bug
                " on SEARCH IN ANTELA")) {
            return false;
        }
        return true;
    }

    // Incompatibility
    private boolean Incompatibility_of_areas(TestDriver driver) {
        if (!add_incompatibility(driver)) {
            return false;
        }
        if (!Search_incompatibility(driver)) {
            return false;
        }
        if (!Edit_incompatibility(driver)) {
            return false;
        }
        if (!QBE_incompatibility(driver)) {
            return false;
        }
        if (!Other_actions_incompatibility(driver)) {
            return false;
        }
        if (!Delete_incompatibility(driver)) {
            return false;
        }
        if (!Skip_incompatibilty_of_areas(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Skip_incompatibilty_of_areas(TestDriver driver) {

        driver.getReport().addHeader("SKIP TO INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"areas_b_actions", getElements("areas_b_actions")}, //element to click
                new String[]{"areas_b_actions_tour", getElements("areas_b_actions_tour")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on INCOMPATIBILITY")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"areas_b_actions_tour", getElements("areas_b_actions_tour")}, //element to click
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element expected to appear
                " on INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"quality_rules_se_b_search", getElements("quality_rules_se_b_search")}, //search button
                new String[]{"quality_rules_se_result", getElements("quality_rules_se_result")}, //result element
                " on INCOMPATIBILITY")) {
            return false;
        }

        return true;

    }
    private boolean Delete_incompatibility(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN INCOMPATIBILITY OF AREAS", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"areas_b_delete", getElements("areas_b_delete")},
                new String[]{"areas_records", getElements("areas_records")},
                new String[]{"areas_ss_delete_b_yes", getElements("areas_ss_delete_b_yes")},
                " on DELETE IN INCOMPATIBILITY")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_incompatibility(TestDriver driver) {


        driver.getReport().addHeader("DETACH IN INCOMPATIBILITY OF AREAS", 3, false);


        if (!Functions.auditData(driver,
                new String[]{"areas_b_actions", getElements("areas_b_actions")}, //actions button
                new String[]{"areas_b_audit_data", getElements("areas_b_audit_data")}, //audit button
                new String[]{"areas_b_close", getElements("areas_b_close")}, //audit_b_ok
                " on AUDIT DATA IN INCOMPATIBILITY OF AREAS")) {
            return false;
        }




        if (!Functions.detachTable(driver,
                new String[]{"areas_detach_b", getElements("areas_detach_b")}, //detach button
                false,     //screenshot??
                " on DETACH IN INCOMPATIBILITY")) {
            return false;
        }
        return true;
    }
    private boolean Edit_incompatibility(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"areas_ed_b_edit", getElements("areas_ed_b_edit")},
                recursiveXPaths.glass,
                " on EDITION INCOMPATIBILITY OF AREAS")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"areas_ed_lov_code1", getElements("areas_ed_lov_code1")}, // b_lov
                new String[]{"areas_ad_i_code1", getElements("areas_ad_i_code1")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"areas_ed_lov_code1_result3", getElements("areas_ed_lov_code1_result3")},
                recursiveXPaths.lov_b_ok, //lov b ok
                "code1", //Data name
                " on EDITION INCOMPATIBILITY OF AREAS")) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"areas_ad_i_code1_description", getElements("areas_ad_i_code1_description")}, // element path
                "code1_description", // key for data value (the name)
                " on where")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"areas_ed_lov_code2", getElements("areas_ed_lov_code2")}, // b_lov
                new String[]{"areas_ad_i_code2", getElements("areas_ad_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"areas_ed_lov_code2_result4", getElements("areas_ed_lov_code2_result4")},
                recursiveXPaths.lov_b_ok, //lov b ok
                "code2", //Data name
                " on EDITION INCOMPATIBILITY OF AREAS")) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"areas_ad_i_code2_description", getElements("areas_ad_i_code2_description")}, // element path
                "code2_description", // key for data value (the name)
                " on where")) {
            return false;
        }


        Functions.checkClickByAbsence(driver,
                new String[]{"areas_ed_b_save", getElements("areas_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION INCOMPATIBILITY OF AREAS");

        return true;
    }
    private boolean QBE_incompatibility(TestDriver driver) {
        driver.getReport().addHeader("QBE IN INCOMPATIBILITY OF AREAS", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"areas_qbe_b_qbe", getElements("areas_qbe_b_qbe")},// query button
                new String[]{"areas_qbe_i_code1", getElements("areas_qbe_i_code1")},//any query input
                " on QBE IN INCOMPATIBILITY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_code1", getElements("areas_qbe_i_code1")},
                "qbe_code1", data.getData().get("code1"), " on QBE IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_code1_description", getElements("areas_qbe_i_code1_description")},
                "qbe_code1_description", data.getData().get("code1_description"), " on QBE IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_code2", getElements("areas_qbe_code2")},
                "qbe_code2", data.getData().get("code2"), " on QBE IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_code2_description", getElements("areas_qbe_i_code2_description")},
                "qbe_code2_description", data.getData().get("code2_description"), " on QBE IN INCOMPATIBILITY")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"areas_qbe_code2", getElements("areas_qbe_code2")}, //search button
                new String[]{"areas_i_result", getElements("areas_i_result")}, //result element
                " on QBE IN ANTELA")) {
            return false;
        }

        return true;
    }
    private boolean add_incompatibility(TestDriver driver) {
        driver.getReport().addHeader("ADD CODE IN INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"areas_ad_b_add", getElements("areas_ad_b_add")}, //element to click
                new String[]{"areas_ad_lov_code1", getElements("areas_ad_lov_code1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"areas_ad_lov_code1", getElements("areas_ad_lov_code1")}, // b_lov
                new String[]{"areas_ad_i_code1", getElements("areas_ad_i_code1")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code1", //Data name
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"areas_ad_i_code1_description", getElements("areas_ad_i_code1_description")}, // element path
                "code1_description", // key for data value (the name)
                " on ADD IN INCOMPATIBILITY");

        if (!Functions.createLov(driver,
                new String[]{"areas_ad_lov_code2", getElements("areas_ad_lov_code2")}, // b_lov
                new String[]{"areas_ad_i_code2", getElements("areas_ad_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code2", //Data name
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"areas_ad_i_code2_description", getElements("areas_ad_i_code2_description")}, // element path
                "code2_description", // key for data value (the name)
                " on ADD IN INCOMPATIBILITY");
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"areas_ad_b_save", getElements("areas_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        return true;
    }
    private boolean Search_incompatibility(TestDriver driver) {
        driver.getReport().addHeader("SEARCH IN INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.createLovByValue(driver,
                new String[]{"areas_s_lov_code1", getElements("areas_s_lov_code1")}, //LoV button
                new String[]{"areas_s_i_code1", getElements("areas_s_i_code1")}, //external LoV input
                new String[]{"areas_lov_i_code1_transfer", getElements("areas_lov_i_code1_transfer")}, //internal LoV input
                data.getData().get("code1"), // value to search
                "se_code1", //name of the data
                " on SEARCH IN INCOMPATIBILITY")) {
            return false;
        }


        if (!Functions.createLovByValue(driver,
                new String[]{"areas_s_lov_code2", getElements("areas_s_lov_code2")}, //LoV button
                new String[]{"areas_s_i_code2", getElements("areas_s_i_code2")}, //external LoV input
                new String[]{"areas_lov_i_code2_transfer", getElements("areas_lov_i_code2_transfer")}, //internal LoV input
                data.getData().get("code2"), // value to search
                "se_code2", //name of the data
                " on SEARCH IN INCOMPATIBILITY")) {
            return false;
        }


        if (!Functions.clickSearchAndResult(driver,
                new String[]{"areas_i_b_search", getElements("areas_i_b_search")}, //search button
                new String[]{"areas_i_result", getElements("areas_i_result")}, //Falta crear este resultado por bug
                " on SEARCH IN INCOMPATIBILITY")) {
            return false;
        }
        return true;
    }

    //Exclusive
    private boolean Exclusive_areas(TestDriver driver) {
        if (!Exclusive_add(driver)) {
            return false;
        }
        if (!Exclusive_search(driver)) {
            return false;
        }
        if (!Edit_Exclusive(driver)) {
            return false;
        }
        if (!QBE_Exclusive(driver)) {
            return false;
        }
        if (!Other_actions_Exclusive(driver)) {
            return false;
        }
        if (!Delete_Exclusive(driver)) {
            return false;
        }
        if (!Skip_Exclusive(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Skip_Exclusive(TestDriver driver) {
        driver.getReport().addHeader("SKIP TO  EXCLUSIVE AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"exclusive_b_actions", getElements("exclusive_b_actions")}, //element to click
                new String[]{"exclusive_b_actions_tour", getElements("exclusive_b_actions_tour")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EXCLUSIVE")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"exclusive_b_actions_tour", getElements("exclusive_b_actions_tour")}, //element to click
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element expected to appear
                " on EXCLUSIVE")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"quality_rules_se_b_search", getElements("quality_rules_se_b_search")}, //search button
                new String[]{"quality_rules_se_result", getElements("quality_rules_se_result")}, //result element
                " on EXCLUSIVE")) {
            return false;
        }


        return true;
    }
    private boolean Delete_Exclusive(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN EXCLUSIVE AREAS", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"exclusive_b_delete", getElements("exclusive_b_delete")},
                new String[]{"exclusive_records", getElements("exclusive_records")},
                new String[]{"exclusive_ss_delete_b_yes", getElements("exclusive_ss_delete_b_yes")},
                " on DELETE IN EXCLUSIVE")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_Exclusive(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN EXCLUSIVE AREAS", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"exclusive_b_actions", getElements("exclusive_b_actions")}, //actions button
                new String[]{"exclusive_b_actions_auditdata", getElements("exclusive_b_actions_auditdata")}, //audit button
                new String[]{"exclusive_b_actions_b_close", getElements("exclusive_b_actions_b_close")}, //audit_b_ok
                " on AUDIT DATA")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"exclusive_detach_b", getElements("exclusive_detach_b")}, //detach button
                false,     //screenshot??
                " on DETACH IN XCLUSIVE")) {
            return false;
        }


        return true;
    }
    private boolean Edit_Exclusive(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN EXCLUSIVE AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"exclusive_ed_b_edit", getElements("exclusive_ed_b_edit")},
                recursiveXPaths.glass,
                " on EDITION IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"exclusive_ed_lov_transfer_area", getElements("exclusive_ed_lov_transfer_area")}, // b_lov
                new String[]{"exclusive_ed_i_transfer_area", getElements("exclusive_ed_i_transfer_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_area", //Data name
                " on EDITION IN EXCLUSIVE")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"exclusive_ed_i_description", getElements("exclusive_ed_i_description")}, // element path
                "transfer_area_description", // key for data value (the name)
                " on ADD IN EXCLUSIVE");

        Functions.checkClickByAbsence(driver,
                new String[]{"exclusive_ed_b_save", getElements("exclusive_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDITION IN EXCLUSIVE");
        return true;
    }
    private boolean QBE_Exclusive(TestDriver driver) {
        driver.getReport().addHeader("QBE IN EXCLUSIVE AREAS", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"exclusive_qbe_b_qbe", getElements("exclusive_qbe_b_qbe")},// query button
                new String[]{"exclusive_qbe_i_transfer", getElements("exclusive_qbe_i_transfer")},//any query input
                " on QBE IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"exclusive_qbe_i_transfer", getElements("exclusive_qbe_i_transfer")},
                "qbe_transfer_area", data.getData().get("transfer_area"), " on QBE IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"exclusive_qbe_i_description", getElements("exclusive_qbe_i_description")},
                "qbe_transfer_area_description", data.getData().get("transfer_area_description"), " on QBE IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"exclusive_qbe_i_transfer", getElements("exclusive_qbe_i_transfer")}, //search button
                new String[]{"exclusive_result", getElements("exclusive_result")}, //result element
                " on QBE IN EXCLUSIVE")) {
            return false;
        }
        return true;
    }
    private boolean Exclusive_search(TestDriver driver) {
        driver.getReport().addHeader("BASIC SEARCH IN EXCLUSIVE AREAS", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"exclusive_se_lov_transfer_area", getElements("exclusive_se_lov_transfer_area")}, //LoV button
                new String[]{"exclusive_se_i_transfer_area", getElements("exclusive_se_i_transfer_area")}, //external LoV input
                new String[]{"exclusive_se_lov_transfer_area_i_transfer_area", getElements("exclusive_se_lov_transfer_area_i_transfer_area")}, //internal LoV input
                data.getData().get("transfer_area"), // value to search
                "se_transfer_area", //name of the data
                " on SEARCH IN EXCLUSIVE")) {
            return false;
        }


        if (!Functions.clickSearchAndResult(driver,
                new String[]{"exclusive_se_b_search", getElements("exclusive_se_b_search")}, //search button
                new String[]{"exclusive_result", getElements("exclusive_result")},
                " on SEARCH IN EXCLUSIVE")) {
            return false;
        }

        return true;
    }
    private boolean Exclusive_add(TestDriver driver) {
        driver.getReport().addHeader("ADD IN EXCLUSIVE AREAS", 3, false);

        Functions.break_time(driver, 3, 500);

        if (!Functions.checkClick(driver,
                new String[]{"exclusive_ad_b_add", getElements("exclusive_ad_b_add")}, //element to click
                new String[]{"exclusive_ad_lov_transfer_area", getElements("exclusive_ad_lov_transfer_area")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"exclusive_ad_lov_transfer_area", getElements("exclusive_ad_lov_transfer_area")}, // b_lov
                new String[]{"exclusive_ad_i_transfer_area", getElements("exclusive_ad_i_transfer_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_area", //Data name
                " on ADD IN EXCLUSIVE")) {
            return false;
        }

        Functions.getValue(driver, new String[]{"exclusive_ad_i_transfer_area_description", getElements("exclusive_ad_i_transfer_area_description")}, // element path
                "transfer_area_description", // key for data value (the name)
                " on ADD IN EXCLUSIVE");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"exclusive_ad_b_save", getElements("exclusive_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }

        return true;

    }

    //Maximun
    /*
    Al crear un registro si el hotel ya ha sido creado te deja seleccionarlo pero no te deje gaurdar el registro
     */
    private boolean Maximun_seats_of_a_hotel(TestDriver driver) {
        if (!Add_Maximum(driver)) {
            return false;
        }
        if (!Search_Maximum(driver)) {
            return false;
        }
        if (!Edit_Maximum(driver)) {
            return false;
        }
        if (!QBE_Maximum(driver)) {
            return false;
        }
        if (!Other_actions_Maximum(driver)) {
            return false;
        }
        if (!Delete_Maximum(driver)) {
            return false;
        }
        if (!Skip_Maximum(driver)) {
            return false;
        }
        driver.getReport().closeBlock();
        return true;
    }

    private boolean Skip_Maximum(TestDriver driver) {
        driver.getReport().addHeader("SKIP TO MAXIMUM SEATS OF A HOTEL", 3, false);
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"maximum_b_actions", getElements("maximum_b_actions")}, //element to click
                new String[]{"maximum_b_actions_tour", getElements("maximum_b_actions_tour")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on MAXIMUM")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"maximum_b_actions_tour", getElements("maximum_b_actions_tour")}, //element to click
                new String[]{"quality_rules_oa_b_actions", getElements("quality_rules_oa_b_actions")}, //element expected to appear
                " on MAXIMUM")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"quality_rules_se_b_search", getElements("quality_rules_se_b_search")}, //search button
                new String[]{"quality_rules_se_result", getElements("quality_rules_se_result")}, //result element
                " on MAXIMUM")) {
            return false;
        }

        return true;
    }
    private boolean Delete_Maximum(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN MAXIMUM SEATS OF A HOTEL", 3, false);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"maximum_b_delete", getElements("maximum_b_delete")},
                new String[]{"maximum_records", getElements("maximum_records")},
                new String[]{"maximum_ss_delete_b_yes", getElements("maximum_ss_delete_b_yes")},
                " on DELETE IN MAXIMUM")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_Maximum(TestDriver driver) {

        driver.getReport().addHeader("DETACH IN MAXIMUM SEATS OF A HOTEL", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"maximum_detach_b", getElements("maximum_detach_b")}, //detach button
                false,     //screenshot??
                " on DETACH IN MAXIMUM")) {
            return false;
        }

        return true;
    }
    private boolean QBE_Maximum(TestDriver driver) {
        driver.getReport().addHeader("QBE IN MAXIMUM SEATS OF A HOTEL", 3, false);
        if (!Functions.simpleClick(driver, new String[]{"maximum_b_reset", getElements("maximum_b_reset")},
                " on QBE IN MAXIMUN")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"maximum_qbe_b_qbe", getElements("maximum_qbe_b_qbe")},// query button
                new String[]{"maximum_qbe_i_hotel_name", getElements("maximum_qbe_i_hotel_name")},//any query input
                " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_i_hotel_name", getElements("maximum_qbe_i_hotel_name")},
                "qbe_hotel_name", data.getData().get("hotel_name"), " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_i_hotel_name_description", getElements("maximum_qbe_i_hotel_name_description")},
                "qbe_name_description", data.getData().get("hotel_name_description"), " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_i_number_stops", getElements("maximum_qbe_i_number_stops")},
                "qbe_number_sstops", data.getData().get("number_stops"), " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_i_number_seats", getElements("maximum_qbe_i_number_seats")},
                "qbe_number_seats", data.getData().get("number_seats"), " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"maximum_qbe_i_number_stops", getElements("maximum_qbe_i_number_stops")}, //search button
                new String[]{"maximum_result", getElements("maximum_result")}, //result element
                "  on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"maximum_result_e_code", getElements("maximum_result_e_code")}, // element path
                "maximun_code_hotel", // key for data value (the name)
                "  on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_i_code", getElements("maximum_qbe_i_code")},
                "maximun_code_hotel", data.getData().get("maximun_code_hotel"), " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"maximum_qbe_i_number_stops", getElements("maximum_qbe_i_number_stops")}, //search button
                new String[]{"maximum_result", getElements("maximum_result")}, //result element
                "  on QBE IN MAXIMUM")) {
            return false;
        }
        return true;
    }
    private boolean Edit_Maximum(TestDriver driver) {
        driver.getReport().addHeader("EDIT IN MAXIMUM SEATS OF A HOTEL", 3, false);
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"maximum_ed_b_edit", getElements("maximum_ed_b_edit")}, //element to click
                new String[]{"maximum_ed_lov_hotel_name", getElements("maximum_ed_lov_hotel_name")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT IN MAXIMUM")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"maximum_ed_lov_hotel_name", getElements("maximum_ed_lov_hotel_name")}, // b_lov
                new String[]{"maximum_ed_i_hotel_name", getElements("maximum_ed_i_hotel_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_name", //Data name
                " on EDIT IN MAXIMUM")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"maximum_ad_e_hotel_name_description", getElements("maximum_ad_e_hotel_name_description")}, // element path
                "hotel_name_description", // key for data value (the name)
                " on EDIT IN MAXIMUM");
        if (!Functions.insertInput(driver, new String[]{"maximum_ed_i_number_stops", getElements("maximum_ed_i_number_stops")},
                "number_stops", (Integer.toString(DataGenerator.random(1, 100))), " on EDIT IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_ed_i_number_seats", getElements("maximum_ed_i_number_seats")},
                "number_seats", (Integer.toString(DataGenerator.random(1, 100))), " on EDIT IN MAXIMUM")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"maximum_ed_b_save", getElements("maximum_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                60, 500,
                " on EDIT IN MAXIMUM")) {
            return false;
        }
        return true;
    }
    private boolean Search_Maximum(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN MAXIMUM SEATS OF A HOTEL", 3, false);

        if (!Functions.insertInput(driver, new String[]{"maximum_se_i_number_stops", getElements("maximum_se_i_number_stops")},
                "se_number_stops", data.getData().get("number_stops"), " on SEARCH IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_se_i_number_seats", getElements("maximum_se_i_number_seats")},
                "se_number_seats", data.getData().get("number_seats"), " on SEARCH IN MAXIMUM")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"maximum_b_search", getElements("maximum_b_search")}, //search button
                new String[]{"maximum_result", getElements("maximum_result")}, //Falta crear este resultado por bug
                " on IN MAXIMUM")) {
            return false;
        }

        return true;
    }
    private boolean Add_Maximum(TestDriver driver) {
        driver.getReport().addHeader("ADD IN MAXIMUM SEATS OF A HOTEL", 3, false);
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClick(driver,
                new String[]{"maximum_ad_b_add", getElements("maximum_ad_b_add")}, //element to click
                new String[]{"maximum_ad_lov_hotel_name", getElements("maximum_ad_lov_hotel_name")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN MAXIMUM")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"maximum_ad_lov_hotel_name", getElements("maximum_ad_lov_hotel_name")}, // b_lov
                new String[]{"maximum_ad_i_hotel_name", getElements("maximum_ad_i_hotel_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_name", //Data name
                " on ADD IN MAXIMUM")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"maximum_ad_e_hotel_name_description", getElements("maximum_ad_e_hotel_name_description")}, // element path
                "hotel_name_description", // key for data value (the name)
                " on ADD IN EXCLUSIVE");
        if (!Functions.insertInput(driver, new String[]{"maximum_ad_i_number_stops", getElements("maximum_ad_i_number_stops")},
                "number_stops", (Integer.toString(DataGenerator.random(1, 100))), " on ADD IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_ad_i_number_seats", getElements("maximum_ad_i_number_seats")},
                "number_seats", (Integer.toString(DataGenerator.random(1, 100))), " on ADD IN MAXIMUM")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"maximum_ad_b_save", getElements("maximum_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                60, 500,
                " on ADD IN MAXIMUM")) {
            return false;
        }
        return true;
    }
}
