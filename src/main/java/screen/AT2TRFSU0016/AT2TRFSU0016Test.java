package screen.AT2TRFSU0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
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
        driver.getTestdetails().setScreen("Additional suplements 2.0");
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
                new String[]{"aditional_del_b_delete", getElements("aditional_del_b_delete")},
                new String[]{"aditional_del_records", getElements("aditional_del_records")},
                new String[]{"aditional_del_b_delete_ok", getElements("aditional_del_b_delete_ok")},
                " on DELETE IN GROUPING")) {
            return false;
        }

        return true;
    }
    private boolean Other_actions_aditional(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN ADITIONAL SUPLEMENTS", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"aditional_oc_b_actions", getElements("aditional_oc_b_actions")}, //actions button
                new String[]{"aditional_oc_b_audit_data", getElements("aditional_oc_b_audit_data")}, //audit button
                new String[]{"aditional_oc_b_exit", getElements("aditional_oc_b_exit")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"aditional_oc_b_detach", getElements("aditional_oc_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }
    private boolean QBE_aditional(TestDriver driver) {
        driver.getReport().addHeader("QBE  IN ADITIONAL SUPLEMENTS", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"aditional_se_b_reset", getElements("aditional_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }


        if (!Functions.clickQbE(driver,
                new String[]{"aditional_qbe_b_qbe", getElements("aditional_qbe_b_qbe")},// query button
                new String[]{"aditional_qbe_i_suplements_type", getElements("aditional_qbe_i_suplements_type")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_qbe_i_suplements_type", getElements("aditional_qbe_i_suplements_type")},
                "qbe_suplements_type", data.getData().get("suplements_type"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_qbe_i_suplementss_description", getElements("aditional_qbe_i_suplementss_description")},
                "qbe_suplements_description", data.getData().get("suplements_description"), " on QBE ")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"aditional_qbe_sl_purcharse_or_sale", getElements("aditional_qbe_sl_purcharse_or_sale")},
                data.getData().get("select_pur"), "qbe_sl_purcharse_or_sale", "  on QBE ")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"aditional_qbe_sl_person_or_unit", getElements("aditional_qbe_sl_person_or_unit")},
                data.getData().get("select_per"), "qbe_person_or_unit", " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_qbe_i_unit_price", getElements("aditional_qbe_i_unit_price")},
                "qbe_unit_price", data.getData().get("unit_price"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_qbe_i_currency", getElements("aditional_qbe_i_currency")},
                "", data.getData().get("currency"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_qbe_i_guide", getElements("aditional_qbe_i_guide")},
                "qbe_guide", data.getData().get("guide"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_qbe_i_remarks", getElements("aditional_qbe_i_remarks")},
                "qbe_remarks", data.getData().get("remarks"), " on QBE ")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"aditional_qbe_i_remarks", getElements("aditional_qbe_i_remarks")}, //search button
                new String[]{"aditional_se_result", getElements("aditional_se_result")}, //result element
                " on QBE")) {
            return false;
        }


        return true;
    }
    private boolean Edit_aditional(TestDriver driver) {

        driver.getReport().addHeader("EDIT IN ADITIONAL SUPLEMENTS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"aditional_ed_b_edit", getElements("aditional_ed_b_edit")}, //element to click
                new String[]{"aditional_ed_lov_suplements_type", getElements("aditional_ed_lov_suplements_type")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"aditional_ed_lov_suplements_type", getElements("aditional_ed_lov_suplements_type")}, // b_lov
                new String[]{"aditional_ed_i_suplements_type", getElements("aditional_ed_i_suplements_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "suplements_type", //Data name
                " on EDIT")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"aditional_ed_e_suplementss_description", getElements("aditional_ed_e_suplementss_description")}, // element path
                "suplements_description", // key for data value (the name)
                " on EDIT");
        if (!Functions.selectText(driver,
                new String[]{"aditional_ed_sl_purcharse_or_sale", getElements("aditional_ed_sl_purcharse_or_sale")},
                "Sale", "select_pur", " on EDIT")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"aditional_ed_sl_person_or_unit", getElements("aditional_ed_sl_person_or_unit")},
                "Unit", "select_per", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"aditional_ed_i_unit_price", getElements("aditional_ed_i_unit_price")},
                "unit_price", (Integer.toString(DataGenerator.random(1, 90))), " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"aditional_ed_lov_currency", getElements("aditional_ed_lov_currency")}, // b_lov
                new String[]{"aditional_ed_i_currency", getElements("aditional_ed_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"aditional_ed_lov_guide", getElements("aditional_ed_lov_guide")}, // b_lov
                new String[]{"aditional_ed_i_guide", getElements("aditional_ed_i_guide")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "guide", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"aditional_ed_i_remarks", getElements("aditional_ed_i_remarks")},
                "remarks", "Prueba2", " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"aditional_ed_b_save", getElements("aditional_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;

    }
    private boolean Search_aditional(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN ADITIONAL SUPLEMENTS", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"aditional_se_lov_suplements_type", getElements("aditional_se_lov_suplements_type")}, //LoV button
                new String[]{"aditional_se_i_suplements_type", getElements("aditional_se_i_suplements_type")}, //external LoV input
                new String[]{"aditional_se_lov_suplements_type_i_suplement_code", getElements("aditional_se_lov_suplements_type_i_suplement_code")}, //internal LoV input
                data.getData().get("suplements_type"), // value to search
                "se_suplements_type", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"aditional_se_sl_purcharse_or_sale", getElements("aditional_se_sl_purcharse_or_sale")},
                data.getData().get("select_pur"), "se_sl_purcharse_or_sale", " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"aditional_se_lov_suplier_name", getElements("aditional_se_lov_suplier_name")}, //LoV button
                new String[]{"aditional_se_i_suplier_name", getElements("aditional_se_i_suplier_name")}, //external LoV input
                new String[]{"aditional_se_lov_suplier_name_i_short_name", getElements("aditional_se_lov_suplier_name_i_short_name")}, //internal LoV input
                data.getData().get("suplier_name"), // value to search
                "se_suplier_name", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"aditional_se_sl_person_or_unit", getElements("aditional_se_sl_person_or_unit")},
                data.getData().get("select_per"), "sl_person_or_unit", " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_se_i_unit_price", getElements("aditional_se_i_unit_price")},
                "se_i_unit_price", data.getData().get("unit_price"), " on SEARCH ")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"aditional_se_lov_currency", getElements("aditional_se_lov_currency")}, //LoV button
                new String[]{"aditional_se_i_currency", getElements("aditional_se_i_currency")}, //external LoV input
                new String[]{"aditional_se_lov_currency_i_code", getElements("aditional_se_lov_currency_i_code")}, //internal LoV input
                data.getData().get("currency"), // value to search
                "se_i_currency", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"aditional_se_lov_guide", getElements("aditional_se_lov_guide")}, //LoV button
                new String[]{"aditional_se_i_guide", getElements("aditional_se_i_guide")}, //external LoV input
                new String[]{"aditional_se_lov_guide_i_code", getElements("aditional_se_lov_guide_i_code")}, //internal LoV input
                data.getData().get("guide"), // value to search
                "se_guide", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"aditional_se_i_remarks", getElements("aditional_se_i_remarks")},
                "se_remarks", data.getData().get("remarks"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"aditional_se_b_search", getElements("aditional_se_b_search")}, //search button
                new String[]{"aditional_se_result", getElements("aditional_se_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }

        return true;
    }
    private boolean Add_aditional(TestDriver driver) {

        driver.getReport().addHeader("ADD IN ADITIONAL SUPLEMENTS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"aditional_add_b_add", getElements("aditional_add_b_add")}, //element to click
                new String[]{"aditional_add_lov_suplements_type", getElements("aditional_add_lov_suplements_type")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"aditional_add_lov_suplements_type", getElements("aditional_add_lov_suplements_type")}, // b_lov
                new String[]{"aditional_add_i_suplements_type", getElements("aditional_add_i_suplements_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "suplements_type", //Data name
                " on ADD")) {
            return false;
        }
        Functions.getValue(driver, new String[]{"aditional_add_e_suplementss_description", getElements("aditional_add_e_suplementss_description")}, // element path
                "suplements_description", // key for data value (the name)
                " on ADD");
        if (!Functions.selectText(driver,
                new String[]{"aditional_add_sl_purcharse_or_sale", getElements("aditional_add_sl_purcharse_or_sale")},
                "Purchase", "select_pur", " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"aditional_add_lov_suplier_name", getElements("aditional_add_lov_suplier_name")}, // b_lov
                new String[]{"aditional_add_i_suplier_name", getElements("aditional_add_i_suplier_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "suplier_name", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"aditional_add_sl_person_or_unit", getElements("aditional_add_sl_person_or_unit")},
                "Person", "select_per", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"aditional_add_i_unit_price", getElements("aditional_add_i_unit_price")},
                "unit_price", (Integer.toString(DataGenerator.random(1, 90))), " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"aditional_add_lov_currency", getElements("aditional_add_lov_currency")}, // b_lov
                new String[]{"aditional_add_i_currency", getElements("aditional_add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"aditional_add_lov_guide", getElements("aditional_add_lov_guide")}, // b_lov
                new String[]{"aditional_add_i_guide", getElements("aditional_add_i_guide")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "guide", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"aditional_add_i_remarks", getElements("aditional_add_i_remarks")},
                "remarks", "Prueba1", " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"aditional_add_b_save", getElements("aditional_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }
}
