package screen.AT2TRFSU0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;


/**
 * Created by vsolis on 07/09/2016.
 */
public class AT2TRFSU0016Test {
    protected AT2TRFSU0016Locators locators;
    protected AT2TRFSU0016Data data;

    public AT2TRFSU0016Test() {

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

        if (!Aditional_suplementes(driver)) {
            return false;
        }


        return false;
    }

    private boolean Aditional_suplementes(TestDriver driver) {

        if (!Add_aditional(driver)) {
            return false;
        }
        if (!Search_aditional(driver)) {
            return false;
        }


        return true;
    }

    private boolean Search_aditional(TestDriver driver) {


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
                "adi_mon", "1564", " on ADD")) {
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
