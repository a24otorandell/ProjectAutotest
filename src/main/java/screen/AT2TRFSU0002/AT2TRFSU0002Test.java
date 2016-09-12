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
        if (!Search_vehicles(driver)) {
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
        driver.getReport().addHeader("DELETE IN OPERATIONAL VEHICLES", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"b_delete", getElements("b_delete")},
                new String[]{"record", getElements("record")},
                new String[]{"b_del_ok", getElements("b_del_ok")},
                " on DELETE IN OPERATIONAL")) {
            return false;
        }



        return true;
    }

    private boolean Other_actions_vehicles(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN OPERATIONAL VEHICLES", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"b_actions", getElements("b_actions")}, //actions button
                new String[]{"a_auditdata", getElements("a_auditdata")}, //audit button
                new String[]{"b_a_exit", getElements("b_a_exit")}, //audit_b_ok
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

    private boolean Qbe_vehicles(TestDriver driver) {
        driver.getReport().addHeader("QBE IN OPERATIONAL VEHICLES", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"b_qbe", getElements("b_qbe")},// query button
                new String[]{"qbe_tes", getElements("qbe_tes")},//any query input
                " on QBE IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"qbe_active", getElements("qbe_active")},
                "No", "qbe_no", " on QBE IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_tes", getElements("qbe_tes")},
                "qbe_a", "%" + data.getData().get("ad2_ca"), " on QBE IN OPERATIONAL")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"qbe_i_supli", getElements("qbe_i_supli")},
                "qbe_b", data.getData().get("ad2_des"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "qbe_c", data.getData().get("ad2_ci"), " on QBE IN GROUPING")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cod", getElements("qbe_cod")},
                "qbe_d", data.getData().get("in4"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_des", getElements("qbe_i_des")},
                "qbe_e", data.getData().get("in5"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_capa", getElements("qbe_i_capa")},
                "qbe_f", data.getData().get("in6"), " on QBE IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_capa", getElements("qbe_i_capa")}, //search button
                new String[]{"result", getElements("result")}, //result element
                " on QBE IN OPERATIONAL")) {
            return false;
        }


        return true;
    }

    private boolean Search2_vehicles(TestDriver driver) {
        driver.getReport().addHeader("ADVANCED SEARCH IN OPERATIONAL VEHICLES  ", 3, false);

        if (!Functions.selectText(driver,
                new String[]{"s_ss_active", getElements("s_ss_active")},
                "No", "ss_no", " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_test", getElements("s_i_test")}, //external LoV input
                new String[]{"s_i_lov_des", getElements("s_i_lov_des")}, //internal LoV input
                recursiveXPaths.lov_e_altresult, // lov result
                data.getData().get("ad2_des"), // value to search
                "se2_ca", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov2", getElements("s_lov2")}, //LoV button
                new String[]{"s_i_type", getElements("s_i_type")}, //external LoV input
                new String[]{"s_i_lov2_cod", getElements("s_i_lov2_cod")}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov result
                data.getData().get("ad2_ci"), // value to search
                "se2_ci", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_cod", getElements("s_i_cod")},
                "iw2", data.getData().get("in4"), "  on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_des", getElements("s_i_des")},
                "ie2", data.getData().get("in5"), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_remarks", getElements("s_i_remarks")},
                "ir2", data.getData().get("in7"), " on SEARCH IN OPERATIONAL")) {
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

    private boolean Edit_vehicles(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN OPERATIONAL VEHICLES", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_edit", getElements("b_edit")}, //element to click
                new String[]{"ed_active", getElements("ed_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD IN OPERATIONAL")) {
            return false;
        }

        Functions.break_time(driver, 3, 500);
        if (!Functions.checkboxValue(driver,
                getElements("ed_active"), "Active", false, true, " where")) {
            return false;
        }//where


        if (!Functions.createLov(driver,
                new String[]{"ed_lov", getElements("ed_lov")}, // b_lov
                new String[]{"ed_i_supli", getElements("ed_i_supli")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_ca", //Data name
                " on  ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ed_i_des", getElements("ed_i_des")}, // element path
                "ad_des", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs

        if (!Functions.createLov(driver,
                new String[]{"ed_lov2", getElements("ed_lov2")}, // b_lov
                new String[]{"ed_i_type", getElements("ed_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ad_ci", //Data name
                " on ADD IN OPERATIONAL")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"ed_i_des2", getElements("ed_i_des2")}, // element path
                "ad_des2", // key for data value (the name)
                " on ADD IN OPERATIONAL"); // whoere this operation occurs


        if (!Functions.insertInput(driver, new String[]{"ed_i_cod", getElements("ed_i_cod")},
                "in1", (Integer.toString(DataGenerator.random(1, 16))), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ed_i_vdes", getElements("ed_i_vdes")},
                "in2", "prueba2", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ed_i_capa", getElements("ed_i_capa")},
                "in3", (Integer.toString(DataGenerator.random(1, 15))), " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"ed_i_remarcks", getElements("ed_i_remarcks")},
                "in4", "PRUEBA2", " on ADD IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"ed_b_save", getElements("ed_b_save")}, //element to click
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
                "Yes", "ss_yes", " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov", getElements("s_lov")}, //LoV button
                new String[]{"s_i_test", getElements("s_i_test")}, //external LoV input
                new String[]{"s_i_lov_des", getElements("s_i_lov_des")}, //internal LoV input
                data.getData().get("ad_des"), // value to search
                "se_ta", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_suplic", getElements("s_i_suplic")},
                "", data.getData().get("ad_des"), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"s_lov2", getElements("s_lov2")}, //LoV button
                new String[]{"s_i_type", getElements("s_i_type")}, //external LoV input
                new String[]{"s_i_lov2_des", getElements("s_i_lov2_des")}, //internal LoV input
                data.getData().get("ad_des2"), // value to search
                "se_te", //name of the data
                " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_cod", getElements("s_i_cod")},
                "iw", data.getData().get("in1"), "  on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_des", getElements("s_i_des")},
                "ie", data.getData().get("in2"), " on SEARCH IN OPERATIONAL")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"s_i_remarks", getElements("s_i_remarks")},
                "ir", data.getData().get("in4"), " on SEARCH IN OPERATIONAL")) {
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


        if (!Functions.insertInput(driver,
                new String[]{"ad_i_cod",
                        getElements("ad_i_cod")},
                "in1",
                (Integer.toString(DataGenerator.random(1, 16))),
                " on ADD")) {
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
                "in4", "PRUEBA1", " on ADD IN OPERATIONAL")) {
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
