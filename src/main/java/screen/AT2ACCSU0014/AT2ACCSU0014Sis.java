package screen.AT2ACCSU0014;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2ACCSU0035.AT2ACCSU0035Data;
import screen.AT2ACCSU0035.AT2ACCSU0035Locators;

/**
 * Created by aibanez on 14/10/2016.
 */
public class AT2ACCSU0014Sis {
    protected AT2ACCSU0014Locators locators;
    protected AT2ACCSU0014Data data;

    public AT2ACCSU0014Sis() {

    }
    public AT2ACCSU0014Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0014Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0014Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0014Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Taxes");

    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_edit_hotel_card(driver)) return false;
        if (!search_hotel_card(driver)) return false;
        if (!qbe_hotel_card(driver)) return false;
        if (!others_actions_hotel_card(driver)) return false;
        if (!delete_hotel_card(driver)) return false;
        return false;
    }

    private boolean search_hotel_card(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_hotel_code", getElements("search_i_hotel_code")},
                "hotel_code", getData("hotel_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_hotel", getElements("search_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_destination", getElements("search_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_destination_name", getElements("search_i_destination_name")},
                "destination_name", getData("destination_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_country", getElements("search_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_country_name", getElements("search_i_country_name")},
                "country_name", getData("country_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_area", getElements("search_i_area")},
                "area", getData("area"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_visible"), "visible", true, where)) {
            return false;
        }//where
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"hotel_card_e_result", getElements("hotel_card_e_result")}, //result element
                where)) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_hotel_card(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        System.out.print("ENTRA A PULSAR");
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"hotel_card_e_result", getElements("hotel_card_e_result")}, //result element
                where)) {
            return false;
        }
        System.out.print("SALE DE PULSAR");
        if (!Functions.simpleClick(driver,
                new String[]{"hotel_card_e_result", getElements("hotel_card_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"hotel_card_b_edit", getElements("hotel_card_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_hotel_code", getElements("edit_i_hotel_code")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_hotel_code", getElements("edit_i_hotel_code")}, // element path
                "hotel_code", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_hotel", getElements("edit_i_hotel")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_hotel", getElements("edit_i_hotel")}, // element path
                "hotel", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_destination", getElements("edit_i_destination")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_destination", getElements("edit_i_destination")}, // element path
                "destination", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_destination_name", getElements("edit_i_destination_name")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_destination_name", getElements("edit_i_destination_name")}, // element path
                "destination_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_country", getElements("edit_i_country")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_country", getElements("edit_i_country")}, // element path
                "country", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_country_name", getElements("edit_i_country_name")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_country_name", getElements("edit_i_country_name")}, // element path
                "country_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"edit_i_area", getElements("edit_i_area")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"edit_i_area", getElements("edit_i_area")}, // element path
                "area", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("edit_ck_visible"), "visible", true, where)) {
            return false;
        }//where
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"edit_b_save", getElements("edit_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;

    }
    private boolean qbe_hotel_card(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"hotel_card_b_qbe", getElements("hotel_card_b_qbe")},// query button
                new String[]{"qbe_i_hotel_code", getElements("qbe_i_hotel_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_code", getElements("qbe_i_hotel_code")},
                "hotel_code", getData("hotel_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_name", getElements("qbe_i_destination_name")},
                "destination_name", getData("destination_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country", getElements("qbe_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_name", getElements("qbe_i_country_name")},
                "country_name", getData("country_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_area", getElements("qbe_i_area")},
                "area", getData("area"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_visible", getElements("qbe_sl_visible")},
                "Yes", "visible", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_hotel_code", getElements("qbe_i_hotel_code")}, //search button
                new String[]{"hotel_card_e_result", getElements("hotel_card_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hotel_card(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"hotel_card_b_actions", getElements("hotel_card_b_actions")}, //actions button
                new String[]{"hotel_card_b_actions_b_audit_data", getElements("hotel_card_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"hotel_card_b_detach", getElements("hotel_card_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hotel_card(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_card_b_delete", getElements("hotel_card_b_delete")},
                new String[]{"hotel_card_e_records", getElements("hotel_card_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
