package screen.AT2ACCSU0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 18/10/2016.
 */
public class AT2ACCSU0003Sis {
    protected AT2ACCSU0003Locators locators;
    protected AT2ACCSU0003Data data;

    public AT2ACCSU0003Sis() {
    }
    public AT2ACCSU0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0003Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0003Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Commissions");

    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_commisions(driver)) return false;
        if (!search_commisions(driver)) return false;
        if (!interaction_edit_commisions(driver)) return false;
        if (!qbe_commisions(driver)) return false;
        if (!others_actions_commisions(driver)) return false;
        if (!delete_commisions(driver)) return false;
        return false;
    }

    private boolean interaction_record_commisions(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"commisions_b_add", getElements("commisions_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_crs_code", getElements("add_lov_crs_code")}, //LoV button
                new String[]{"add_i_crs_code", getElements("add_i_crs_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "crs", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_brand_code", getElements("add_lov_brand_code")}, //LoV button
                new String[]{"add_i_brand_code", getElements("add_i_brand_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "brand", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination_code", getElements("add_lov_destination_code")}, //LoV button
                new String[]{"add_i_destination_code", getElements("add_i_destination_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "destination", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface_code", getElements("add_lov_interface_code")}, //LoV button
                new String[]{"add_i_interface_code", getElements("add_i_interface_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_rate_code", getElements("add_lov_rate_code")}, //LoV button
                new String[]{"add_i_rate_code", getElements("add_i_rate_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "rate", //name of the data
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_merch", getElements("add_sl_merch")},
                "All", "merch", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_active", getElements("add_sl_active")},
                "Active", "active", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_from", getElements("add_i_date_from")},
                "date_from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_to", getElements("add_i_date_to")},
                "date_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_hotel_code", getElements("add_lov_hotel_code")}, //LoV button
                new String[]{"add_i_hotel_code", getElements("add_i_hotel_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "hotel", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commission", getElements("add_i_commission")},
                "commission", "" + 1, where)) {
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
    private boolean search_commisions(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_crs_code", getElements("search_lov_crs_code")}, //LoV button
                new String[]{"search_i_crs_code", getElements("search_i_crs_code")}, //external LoV input
                new String[]{"search_lov_crs_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("crs"), // value to search
                "crs", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_brand_code", getElements("search_lov_brand_code")}, //LoV button
                new String[]{"search_i_brand_code", getElements("search_i_brand_code")}, //external LoV input
                new String[]{"search_lov_brand_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("brand"), // value to search
                "brand", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_rate_code", getElements("search_lov_rate_code")}, //LoV button
                new String[]{"search_i_rate_code", getElements("search_i_rate_code")}, //external LoV input
                new String[]{"search_lov_rate_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("rate"), // value to search
                "rate", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel_code", getElements("search_lov_hotel_code")}, //LoV button
                new String[]{"search_i_hotel_code", getElements("search_i_hotel_code")}, //external LoV input
                new String[]{"search_lov_hotel_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("hotel"), // value to search
                "hotel", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination_code", getElements("search_lov_destination_code")}, //LoV button
                new String[]{"search_i_destination_code", getElements("search_i_destination_code")}, //external LoV input
                new String[]{"search_lov_destination_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("destination"), // value to search
                "destination", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface_code", getElements("search_lov_interface_code")}, //LoV button
                new String[]{"search_i_interface_code", getElements("search_i_interface_code")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_from", getElements("search_i_date_from")},
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_to", getElements("search_i_date_to")},
                "date_to", getData("date_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commission", getElements("search_i_commission")},
                "commission", getData("commission"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_merch", getElements("search_sl_merch")},
                getData("merch"), "merch", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_active", getElements("search_sl_active")},
                getData("active"), "active", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"commisions_e_result", getElements("commisions_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_commisions(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"commisions_b_edit", getElements("commisions_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_crs_code", getElements("add_lov_crs_code")}, //LoV button
                new String[]{"add_i_crs_code", getElements("add_i_crs_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok,
                "crs", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_brand_code", getElements("add_lov_brand_code")}, //LoV button
                new String[]{"add_i_brand_code", getElements("add_i_brand_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "brand", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination_code", getElements("add_lov_destination_code")}, //LoV button
                new String[]{"add_i_destination_code", getElements("add_i_destination_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok,
                "destination", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface_code", getElements("add_lov_interface_code")}, //LoV button
                new String[]{"add_i_interface_code", getElements("add_i_interface_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok,
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_rate_code", getElements("add_lov_rate_code")}, //LoV button
                new String[]{"add_i_rate_code", getElements("add_i_rate_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "rate", //name of the data
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_merch", getElements("add_sl_merch")},
                "Liberate", "merch", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_active", getElements("add_sl_active")},
                "Inactive", "active", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_from", getElements("add_i_date_from")},
                "date_from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date_to", getElements("add_i_date_to")},
                "date_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_hotel_code", getElements("add_lov_hotel_code")}, //LoV button
                new String[]{"add_i_hotel_code", getElements("add_i_hotel_code")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok,
                "hotel", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commission", getElements("add_i_commission")},
                "commission", "3", where)) {
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
    private boolean qbe_commisions(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"commisions_e_result", getElements("commisions_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"commisions_b_qbe", getElements("commisions_b_qbe")},// query button
                new String[]{"qbe_i_crs_code", getElements("qbe_i_crs_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_crs_code", getElements("qbe_i_crs_code")},
                "crs", getData("crs"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_brand_code", getElements("qbe_i_brand_code")},
                "brand", getData("brand"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rate_code", getElements("qbe_i_rate_code")},
                "rate", getData("rate"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_code", getElements("qbe_i_hotel_code")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_code", getElements("qbe_i_destination_code")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_code", getElements("qbe_i_interface_code")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_from", getElements("qbe_i_date_from")},
                "date_from", getData("date_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_to", getElements("qbe_i_date_to")},
                "date_to", getData("date_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_commission", getElements("qbe_i_commission")},
                "commission", getData("commission"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_merch", getElements("qbe_sl_merch")},
                getData("merch"), "merch", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active", getElements("qbe_sl_active")},
                getData("active"), "active", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_commission", getElements("qbe_i_commission")}, //any query input
                new String[]{"commisions_e_result", getElements("commisions_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_commisions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"commisions_b_actions", getElements("commisions_b_actions")}, //actions button
                new String[]{"commisions_b_actions_b_audit_data", getElements("commisions_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"commisions_b_detach", getElements("commisions_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_commisions(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"commisions_b_delete", getElements("commisions_b_delete")},
                new String[]{"commisions_e_records", getElements("commisions_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}