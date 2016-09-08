package screen.AT2TRFSU0002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2TRFSU0016.AT2TRFSU0016Data;
import screen.AT2TRFSU0016.AT2TRFSU0016Locators;

/**
 * Created by vsolis on 08/09/2016.
 */
public class AT2TRFSU0002Test {
    protected AT2TRFSU0002Locators locators;
    protected AT2TRFSU0002Data data;

    public AT2TRFSU0002Test() {

    }

    public AT2TRFSU0002Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0002Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0002Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0002Data data) {
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

        if (!Operational_vehicles(driver)) {
            return false;
        }


        return false;
    }

    private boolean Operational_vehicles(TestDriver driver) {

        if (!Add_vehicles(driver)) {

            return false;
        }
        if (!Search_vehicles(driver)) {
            return false;
        }

        if (!Edit_vehicles(driver)) {
            return false;
        }

        if (!Search2_vehicles(driver)) {
            return false;
        }

        if (!Qbe_vehicles(driver)) {
            return false;
        }

        if (!Other_actions_vehicles(driver)) {
            return false;
        }

        if (!Delete_vehicles(driver)) {
            return false;
        }

        return true;
    }

    private boolean Delete_vehicles(TestDriver driver) {

        return true;
    }

    private boolean Other_actions_vehicles(TestDriver driver) {


        return true;
    }

    private boolean Qbe_vehicles(TestDriver driver) {

        return false;
    }

    private boolean Search2_vehicles(TestDriver driver) {
        driver.getReport().addHeader("ADVANCED SEARCH IN CALIDAD TIEMPO ANTELA  ", 3, false);

        if (!Functions.selectText(driver,
                new String[]{"antela_search_sel_ad", getElements("antela_search_sel_ad")},
                "Arrival", "vu_ad", " on ADD IN ANTELA")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_additional", getElements("s_i_additional")}, //external LoV input
                new String[]{"s_lov_suplement", getElements("s_lov_suplement")}, //internal LoV input
                data.getData().get("adi_too"), // value to search
                "adi_ta", //name of the data
                " on SEARCH2 IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tii", data.getData().get("adi_mon"), " SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_additional", getElements("s_i_additional")}, //external LoV input
                new String[]{"s_lov_suplement", getElements("s_lov_suplement")}, //internal LoV input
                data.getData().get("adi_too"), // value to search
                "adi_ta", //name of the data
                " on SEARCH2 IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tii", data.getData().get("adi_mon"), " SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tii", data.getData().get("adi_mon"), " SEARCH IN ADITIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "adi2_tii", data.getData().get("adi_mon"), " SEARCH IN ADITIONAL")) {
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

    private boolean Edit_vehicles(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN OPERATIONAL VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_add", getElements("b_add")}, //element to click
                new String[]{"ad_active", getElements("ad_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN OPERATIONAL")) {
            return false;
        }


        Functions.checkboxValue(driver,
                getElements("ad_active"), "active", true, true, " on ad_active");

        if (!Functions.createLov(driver,
                new String[]{"ad_lov", getElements("ad_lov")}, // b_lov
                new String[]{"ad_i_supli", getElements("ad_i_supli")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_ca", //Data name
                " on  ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ad_i_des", getElements("ad_i_des")}, // element path
                "ad_des", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs

        if (!Functions.createLov(driver,
                new String[]{"ad_lov2", getElements("ad_lov2")}, // b_lov
                new String[]{"ad_i_type", getElements("ad_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_ci", //Data name
                " on ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ad_i_des2", getElements("ad_i_des2")}, // element path
                "ad_des2", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs


        if (!Functions.insertInput(driver, new String[]{"ad_i_cod", getElements("ad_i_cod")},
                "in1", (Integer.toString(DataGenerator.random(1, 16))), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ad_i_vdes", getElements("ad_i_vdes")},
                "in2", "prueba", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ad_i_capa", getElements("ad_i_capa")},
                "in3", (Integer.toString(DataGenerator.random(1, 15))), " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ad_i_remarcks", getElements("ad_i_remarcks")},
                "in3", "PRUEBA1", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_save", getElements("b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN OPERATIONAL")) {
            return false;
        }


        return true;
    }


    private boolean Search_vehicles(TestDriver driver) {

        driver.getReport().addHeader("ADVANCED SEARCH IN OPERATIONAL VEHICLES  ", 3, false);

        if (!Functions.selectText(driver,
                new String[]{"s_ss_active", getElements("s_ss_active")},
                "Arrival", "", " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_suplic", getElements("s_i_suplic")}, //external LoV input
                new String[]{"s_lov_suplement", getElements("s_lov_suplement")}, //internal LoV input
                data.getData().get(""), // value to search
                "", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "", data.getData().get(""), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_additional", getElements("s_i_additional")}, //external LoV input
                new String[]{"s_lov_suplement", getElements("s_lov_suplement")}, //internal LoV input
                data.getData().get(""), // value to search
                "", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "", data.getData().get(""), "  on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "", data.getData().get(""), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_unit", getElements("s_i_unit")},
                "", data.getData().get(""), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_search", getElements("b_search")}, //search button
                new String[]{"result", getElements("result")}, //Falta crear este resultado por bug
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }


        return true;
    }

    private boolean Add_vehicles(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN OPERATIONAL VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_add", getElements("b_add")}, //element to click
                new String[]{"ad_active", getElements("ad_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN OPERATIONAL")) {
            return false;
        }


        Functions.checkboxValue(driver,
                getElements("ad_active"), "active", true, true, " on ad_active");

        if (!Functions.createLov(driver,
                new String[]{"ad_lov", getElements("ad_lov")}, // b_lov
                new String[]{"ad_i_supli", getElements("ad_i_supli")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_ca", //Data name
                " on  ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ad_i_des", getElements("ad_i_des")}, // element path
                "ad_des", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs

        if (!Functions.createLov(driver,
                new String[]{"ad_lov2", getElements("ad_lov2")}, // b_lov
                new String[]{"ad_i_type", getElements("ad_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_ci", //Data name
                " on ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ad_i_des2", getElements("ad_i_des2")}, // element path
                "ad_des2", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs


        if (!Functions.insertInput(driver, new String[]{"ad_i_cod", getElements("ad_i_cod")},
                "in1", (Integer.toString(DataGenerator.random(1, 16))), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ad_i_vdes", getElements("ad_i_vdes")},
                "in2", "prueba", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ad_i_capa", getElements("ad_i_capa")},
                "in3", (Integer.toString(DataGenerator.random(1, 15))), " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ad_i_remarcks", getElements("ad_i_remarcks")},
                "in3", "PRUEBA1", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_save", getElements("b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD IN OPERATIONAL")) {
            return false;
        }


        return true;
    }
}
