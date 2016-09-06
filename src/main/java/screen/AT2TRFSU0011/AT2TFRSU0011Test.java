package screen.AT2TRFSU0011;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
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


    /**
     * Bugs encontrados 2
     * Boton añadir Calidad Tiempos Vuelos no funciona
     * Dentro del boton añadir de Maximum Seats of a Hotel no se rellena el campo descripcion
     */

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
        if (!Calidad_tiempo_antela(driver)) {
            return false;
        }
        if (!Go_to_incompatibiliy_of_areas(driver)) {
            return false;
        }
        if (!Incompatibility_of_areas(driver)) {
            return false;
        }

        if (!Go_to_exclusive_areas(driver)) {
            return false;
        }

        if (!Exclusive_areas(driver)) {
            return false;
        }

        if (!Go_to_maximun_seats_of_a_hotel(driver)) {
            return false;
        }
        if (!Maximun_seats_of_a_hotel(driver)) {
            return false;
        }

        return false;
    }


    private boolean Go_to_maximun_seats_of_a_hotel(TestDriver driver) {


        driver.getReport().addHeader("GO TO MAXIMUM SEATS OF A HOTEL", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"b_actions", getElements("b_actions")}, //element to click
                new String[]{"b_actions_b_maximum", getElements("b_actions_b_maximum")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on MAXIMUM")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"b_actions_b_maximum", getElements("b_actions_b_maximum")}, //element to click
                new String[]{"maximum_ad_b_add", getElements("maximum_ad_b_add")}, //element expected to appear
                " on MAXIMUM")) {
            return false;
        }

        return true;
    }

    private boolean Go_to_exclusive_areas(TestDriver driver) {

        driver.getReport().addHeader("GO TO EXCLUSIVE AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"b_actions", getElements("b_actions")}, //element to click
                new String[]{"b_actions_b_exclusive", getElements("b_actions_b_exclusive")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EXCLUSIVE")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"b_actions_b_exclusive", getElements("b_actions_b_exclusive")}, //element to click
                new String[]{"exclusive_ad_b_add", getElements("exclusive_ad_b_add")}, //element expected to appear
                " on EXCLUSIVE")) {
            return false;
        }

        return true;
    }

    private boolean Go_to_incompatibiliy_of_areas(TestDriver driver) {
        driver.getReport().addHeader("GO TO INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"b_actions", getElements("b_actions")}, //element to click
                new String[]{"b_actions_b_incompatibility", getElements("b_actions_b_incompatibility")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"b_actions_b_incompatibility", getElements("b_actions_b_incompatibility")}, //element to click
                new String[]{"areas_s_lov", getElements("areas_s_lov")}, //element expected to appear
                " on INCOMPATIBILITY")) {
            return false;
        }
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
        if (!Add_antela(driver)) {
            return false;
        }
        if (!Search_antela(driver)) {
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
        if (!Skip_quality_rules(driver)) {
            return false;
        }

        return true;
    }

    private boolean Temporaly_quality_rules(TestDriver driver) {
        //  if (!Creation_temporaly(driver)) {
        //   return false;
        //}
        //driver.getReport().closeBlock();
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
                "gr_departures", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_nu_add_i_arrivals", getElements("rules_nu_add_i_arrivals")},
                "nu_arrivals", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY ")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_nu_add_i_departures", getElements("rules_nu_add_i_departures")},
                "nu_departures", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_ti_add_i_arrivals", getElements("rules_ti_add_i_arrivals")},
                "ti_arrivals", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_ti_add_i_departures", getElements("rules_ti_add_i_departures")},
                "ti_departures", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_tb_add_i_arrivals", getElements("rules_tb_add_i_arrivals")},
                "tb_arrivals", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_tb_add_i_depertures", getElements("rules_tb_add_i_depertures")},
                "tb_departures", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_dep_add_i_pax", getElements("rules_dep_add_i_pax")},
                "pax_arrivals", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"rules_dep_add_i_every", getElements("rules_dep_add_i_every")},
                "every_departures", (Integer.toString(DataGenerator.random(1, 3))), " on CREATE TEMPORALY")) {
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

    private boolean Incompatibility_of_areas(TestDriver driver) {
        if (!add_incompatibility(driver)) {
            return false;
        }
        if (!Search_incompatibility(driver)) {
            return false;
        }
        if (!QBE_incompatibility(driver)) {
            return false;
        }
        if (!Edit_incompatibility(driver)) {
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
        return true;
    }

    private boolean Exclusive_areas(TestDriver driver) {
        if (!Exclusive_add(driver)) {
            return false;
        }
        if (!Exclusive_search(driver)) {
            return false;
        }
        if (!QBE_Exclusive(driver)) {
            return false;
        }
        if (!Edit_Exclusive(driver)) {
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

        return true;
    }

    private boolean Maximun_seats_of_a_hotel(TestDriver driver) {
        if (!Add_Maximum(driver)) {
            return false;
        }
        if (!Search_Maximum(driver)) {
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
                new String[]{"antela_n_records", getElements("antela_n_records")},
                new String[]{"antela_ss_delete_b_yes", getElements("antela_ss_delete_b_yes")},
                " on DELETE IN ANTELA")) {
            return false;
        }


        return true;
    }
    private boolean other_actions_antela(TestDriver driver) {

        driver.getReport().addHeader("DETACH IN CALIDAD VUELOS ANTELA", 3, false);
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
                new String[]{"antela_ed_sel_ad", getElements("antela_ed_sel_ad")},
                "Departure", "vu_add", " on EDITION IN ANTELA")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"antela_ed_lov", getElements("antela_ed_lov")}, // b_lov
                new String[]{"antela_ed_i_transfer", getElements("antela_ed_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_too", //Data name
                " on EDITION IN ANTELA")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"antela_ed_i_description", getElements("antela_ed_i_description")}, // element path
                "and_dess", // key for data value (the name)
                " on ADD IN ANTELA");
        if (!Functions.insertInput(driver,
                new String[]{"antela_ed_i_time", getElements("antela_ed_i_time")},
                "ant_tii", "26", " on EDITION IN ANTELA")) {
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
                new String[]{"antela_qbe_sel_ad", getElements("antela_qbe_sel_ad")},//any query input
                " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_qbe_sel_ad", getElements("antela_qbe_sel_ad")},
                "Arrival", "vu_ad", " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_time", getElements("antela_qbe_i_time")},
                "ant_tim", "25", " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_transfer", getElements("antela_qbe_i_transfer")},
                "ant_tra", "B", " on QBE IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_qbe_i_description", getElements("antela_qbe_i_description")},
                "ant_des", "Shared", " on QBE IN ANTELA")) {
            return false;
        }
        {
            return true;
        } // where
    }
    private boolean Add_antela(TestDriver driver) {
        driver.getReport().addHeader("ADD VUELOS IN CALIDAD VUELOS ANTELA", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"antela_b_advanced", getElements("antela_b_advanced")}, //element to click
                new String[]{"antela_search_i_time", getElements("antela_search_i_time")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on where")) {
            return false;
        }

        Functions.break_time(driver, 10, 500);


        if (!Functions.checkClick(driver,
                new String[]{"antela_cr_b_add", getElements("antela_cr_b_add")},
                recursiveXPaths.glass,
                " on CREATION IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_cr_i_time", getElements("antela_cr_i_time")},
                "vu_tim", "25", " on ADD IN ANTELA")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"antela_cr_sel_ad", getElements("antela_cr_sel_ad")},
                "Arrival", "vu_ad", " on CREATION IN ANTELA")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"antela_cr_i_lov", getElements("antela_cr_i_lov")}, // b_lov
                new String[]{"antela_cr_i_transfer", getElements("antela_cr_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_to", //Data name
                " on SEARCH IN ANTELA")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"antela_cr_i_description", getElements("antela_cr_i_description")}, // element path
                "and_des", // key for data value (the name)
                " on ADD IN ANTELA");

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"antela_cr_b_save", getElements("antela_cr_b_save")}, //element to click
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
                new String[]{"antela_search_sel_ad", getElements("antela_search_sel_ad")},
                "Arrival", "vu_ad", " on ADD IN ANTELA")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"antela_search_i_time", getElements("antela_search_i_time")},
                "vu_tim", "25", " on SEARCH IN ANTELA")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"antela_search_lov", getElements("antela_search_lov")}, // b_lov
                new String[]{"antela_search_i_transfer", getElements("antela_search_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_tra", //Data name
                " on SEARCH IN ANTELA")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"antela_search_i_description", getElements("antela_search_i_description")},
                "ant_des", "Shared", " on SEARCH IN ANTELA")) {
            return false;
            }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"antela_search_b_search", getElements("antela_search_b_search")}, //search button
                new String[]{"antela_search_t_result", getElements("antela_search_t_result")}, //Falta crear este resultado por bug
                " on SEARCH IN ANTELA")) {
            return false;
        }
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
                new String[]{"b_actions", getElements("b_actions")}, //element expected to appear
                " on INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
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
                new String[]{"areas_ed_b_ed", getElements("areas_ed_b_ed")},
                recursiveXPaths.glass,
                " on EDITION INCOMPATIBILITY OF AREAS")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"areas_ed_lov", getElements("areas_ed_lov")}, // b_lov
                new String[]{"areas_ad_i_code1", getElements("areas_ad_i_code1")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"areas_ed_lov_code1_result3", getElements("areas_ed_lov_code1_result3")},
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_too", //Data name
                " on EDITION INCOMPATIBILITY OF AREAS")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"areas_ed_lov2", getElements("areas_ed_lov2")}, // b_lov
                new String[]{"areas_ad_i_code2", getElements("areas_ad_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                new String[]{"areas_ed_lov_code1_result4", getElements("areas_ed_lov_code1_result4")},
                recursiveXPaths.lov_b_ok, //lov b ok
                "ant_too", //Data name
                " on EDITION INCOMPATIBILITY OF AREAS")) {
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
                "inc_cod", "AAA", " on QBE IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_description", getElements("areas_qbe_i_description")},
                "inc_des", "CAMPANET", " on QBE IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_code2", getElements("areas_qbe_code2")},
                "inc_cod2", "ALARO", " on QBE IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_description2", getElements("areas_qbe_i_description2")},
                "inc_des2", "Alaro", " on QBE IN INCOMPATIBILITY")) {
            return false;
        }

        return true;
    }

    private boolean add_incompatibility(TestDriver driver) {
        driver.getReport().addHeader("ADD CODE IN INCOMPATIBILITY OF AREAS", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"areas_ad_b_add", getElements("areas_ad_b_add")}, //element to click
                new String[]{"areas_ad_lov", getElements("areas_ad_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"areas_ad_lov", getElements("areas_ad_lov")}, // b_lov
                new String[]{"areas_ad_i_code1", getElements("areas_ad_i_code1")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "inc_to", //Data name
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"areas_ad_i_description", getElements("areas_ad_i_description")}, // element path
                "inc_des", // key for data value (the name)
                " on ADD IN INCOMPATIBILITY");

        if (!Functions.createLov(driver,
                new String[]{"areas_ad_lov2", getElements("areas_ad_lov2")}, // b_lov
                new String[]{"areas_ad_i_code2", getElements("areas_ad_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "inc_to", //Data name
                " on ADD IN INCOMPATIBILITY")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"areas_ad_i:description2", getElements("areas_ad_i:description2")}, // element path
                "inc_des", // key for data value (the name)
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
        if (!Functions.createLov(driver,
                new String[]{"areas_s_lov", getElements("areas_s_lov")}, // b_lov
                new String[]{"areas_s_i_code1", getElements("areas_s_i_code1")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "inc_se", //Data name
                " on SEARCH IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_s_i_description", getElements("areas_s_i_description")},
                "int_des", "CAMPANET", " on SEARCH IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"areas_s_lov2", getElements("areas_s_lov2")}, // b_lov
                new String[]{"areas_s_i_code2", getElements("areas_s_i_code2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "inc_des", //Data name
                " on SEARCH IN INCOMPATIBILITY")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_s_i_description2", getElements("areas_s_i_description2")},
                "int_des2", "Alaro", " on SEARCH IN INCOMPATIBILITY")) {
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


    private boolean Quality_rules(TestDriver driver) {
        if (!Creation_qualityRules(driver)) {
            return false;
        }
        if (!Search_qualityRules(driver)) {
            return false;
        }
        // if (!Edit_qualityRules(driver)) {
        //  return false;
        // }
        //  if (!Search_qualityRules(driver)) {
        //  return false;
        // }
        // if (!QBE_qualityRules(driver)) {
        // return false;
        // }
        // if (!Oher_Actions_qualityRules(driver)) {
        // return false;
        // }
        // driver.getReport().closeBlock();
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
                new String[]{"b_actions", getElements("b_actions")}, //element expected to appear
                " on QUALITY")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
                " on QUALITY")) {
            return false;
        }

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
                new String[]{"b_actions", getElements("b_actions")}, //element expected to appear
                " on EXCLUSIVE")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
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
        driver.getReport().addHeader("DETACH IN EXCLUSIVE AREAS", 3, false);

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
                new String[]{"exclusive_ed_lov", getElements("exclusive_ed_lov")}, // b_lov
                new String[]{"exclusive_ed_i_transfer", getElements("exclusive_ed_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ex_too", //Data name
                " on EDITION IN EXCLUSIVE")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"exclusive_ed_i_description", getElements("exclusive_ed_i_description")}, // element path
                "and_dess", // key for data value (the name)
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
                "ex_tra", "AAA", " on QBE IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"exclusive_qbe_i_description", getElements("exclusive_qbe_i_description")},
                "ex_des", "CAMPANET", " on QBE IN EXCLUSIVE")) {
            return false;
        }

        return true;
    }

    private boolean Exclusive_search(TestDriver driver) {
        driver.getReport().addHeader("BASIC SEARCH IN EXCLUSIVE AREAS", 3, false);
        if (!Functions.createLov(driver,
                new String[]{"exclusive_s_lov", getElements("exclusive_s_lov")}, // b_lov
                new String[]{"exclusive_s_i_transfer", getElements("exclusive_s_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ex_tra", //Data name
                " on SEARCH IN EXCLUSIVE")) {
            return false;
        }


        if (!Functions.clickSearchAndResult(driver,
                new String[]{"exclusive_i_b_search", getElements("exclusive_i_b_search")}, //search button
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
                new String[]{"exclusive_ad_lov", getElements("exclusive_ad_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN EXCLUSIVE")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"exclusive_ad_lov", getElements("exclusive_ad_lov")}, // b_lov
                new String[]{"exclusive_ad_i_transfer", getElements("exclusive_ad_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ex_to", //Data name
                " on ADD IN EXCLUSIVE")) {
            return false;
        }

        Functions.getValue(driver, new String[]{"exclusive_ad_i_description", getElements("exclusive_ad_i_description")}, // element path
                "ex_des", // key for data value (the name)
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

    private boolean Skip_Maximum(TestDriver driver) {

        driver.getReport().addHeader("SKIP TO MAXIMUM SEATS OF A HOTEL", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"maximum_b_actions", getElements("maximum_b_actions")}, //element to click
                new String[]{"maximum_b_actions_tour", getElements("maximum_b_actions_tour")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on MAXIMUM")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"maximum_b_actions_tour", getElements("maximum_b_actions_tour")}, //element to click
                new String[]{"b_actions", getElements("b_actions")}, //element expected to appear
                " on MAXIMUM")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
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

        if (!Functions.clickQbE(driver,
                new String[]{"maximum_qbe_b_qbe", getElements("maximum_qbe_b_qbe")},// query button
                new String[]{"maximum_qbe_code", getElements("maximum_qbe_code")},//any query input
                " on QBE IN MAXIMUM")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_code", getElements("maximum_qbe_code")},
                "max_cod", "430629", " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_hotel", getElements("maximum_qbe_hotel")},
                "max_hot", "430629", " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_description", getElements("maximum_qbe_description")},
                "max_des", "TEST", " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_stops", getElements("maximum_qbe_stops")},
                "max_sto", "5", " on QBE IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_qbe_seats", getElements("maximum_qbe_seats")},
                "max_sea", "4", " on QBE IN MAXIMUM")) {
            return false;
        }


        return true;
    }

    private boolean Search_Maximum(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN MAXIMUM SEATS OF A HOTEL", 3, false);

        if (!Functions.insertInput(driver, new String[]{"maximum_s_i_stops", getElements("maximum_s_i_stops")},
                "max_stops", "5", " on SEARCH IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_ad_seats", getElements("maximum_ad_seats")},
                "max_seats", "4", " on SEARCH IN MAXIMUM")) {
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
                new String[]{"maximum_ad_lov", getElements("maximum_ad_lov")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN MAXIMUM")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"maximum_ad_lov", getElements("maximum_ad_lov")}, // b_lov
                new String[]{"maximum_ad_i_hotel", getElements("maximum_ad_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "max_to", //Data name
                " on ADD IN MAXIMUM")) {
            return false;
        }


        Functions.getValue(driver, new String[]{"maximum_ad_i_description", getElements("maximum_ad_i_description")}, // element path
                "max_des", // key for data value (the name)
                " on ADD IN EXCLUSIVE");
        if (!Functions.insertInput(driver, new String[]{"maximum_ad_i_stops", getElements("maximum_ad_i_stops")},
                "max_stops", "5", " on ADD IN MAXIMUM")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"maximum_ad_seats", getElements("maximum_ad_seats")},
                "max_seats", "4", " on ADD IN MAXIMUM")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"maximum_ad_b_save", getElements("maximum_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                60, 500,
                " on CREATION IN ANTELA")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"maximum_ad_i_code", getElements("maximum_ad_i_code")}, // element path
                "max_cod", // key for data value (the name)
                " on ADD IN EXCLUSIVE");
        return true;
    }


}
