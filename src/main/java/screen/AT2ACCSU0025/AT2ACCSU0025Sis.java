package screen.AT2ACCSU0025;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 13/09/2016.
 */
public class AT2ACCSU0025Sis {
    protected AT2ACCSU0025Locators locators;
    protected AT2ACCSU0025Data data;

    public AT2ACCSU0025Sis() {

    }
    public AT2ACCSU0025Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0025Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0025Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0025Data data) {
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

        if (!offer_types(driver)) {
            return false;
        }


        return false;
    }

    private boolean offer_types(TestDriver driver) {

        if (!Add_offer_types(driver)) {
            return false;
        }

        if (!Search_offer_types(driver)) {
            return false;
        }

        if (!Edit_offer_types(driver)) {
            return false;
        }

        if (!QBE_offer_types(driver)) {
            return false;
        }

        if (!Other_actions_types(driver)) {
            return false;
        }

        if (!Delete_types(driver)) {
            return false;
        }

        return true;
    }

    private boolean Delete_types(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN OFFER TYPES AND AGREEMENTS DISCOUNTS", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"Offer_types_del_b_delete", getElements("Offer_types_del_b_delete")},
                new String[]{"Offer_types_del_records", getElements("Offer_types_del_records")},
                new String[]{"Offer_types_del_b_delete_ok", getElements("Offer_types_del_b_delete_ok")},
                " on DELETE")) {
            return false;
        }


        return true;
    }
    private boolean Other_actions_types(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN OFFER TYPES AND AGREEMENTS DISCOUNTS", 3, false);
        if (!Functions.detachTable(driver,
                new String[]{"Offer_types_detach", getElements("Offer_types_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }
        return true;
    }
    private boolean QBE_offer_types(TestDriver driver) {


        driver.getReport().addHeader("  QBE IN OFFER TYPES AND AGREEMENTS DISCOUNTS", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"Offer_types_se_b_reset", getElements("Offer_types_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }


        if (!Functions.clickQbE(driver,
                new String[]{"Offer_types_qbe_b_qbe", getElements("Offer_types_qbe_b_qbe")},// query button
                new String[]{"Offer_types_qbe_i_discount", getElements("Offer_types_qbe_i_discount")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"Offer_types_qbe_i_discount", getElements("Offer_types_qbe_i_discount")},
                "qbe_i_discount", data.getData().get("input_discount"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"Offer_types_qbe_i_discount_description", getElements("Offer_types_qbe_i_discount_description")},
                "qbe_i_discount_description", data.getData().get("input_description"), " on QBE ")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"Offer_types_qbe_select_text_notes", getElements("Offer_types_qbe_select_text_notes")},
                "No", "qbe_select_no_notes", " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"Offer_types_qbe_select_text_percentage", getElements("Offer_types_qbe_select_text_percentage")},
                "No", "qbe_select_no_percentage", " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"Offer_types_qbe_i_discount", getElements("Offer_types_qbe_i_discount")}, //search button
                new String[]{"Offer_types_se_i_result", getElements("Offer_types_se_i_result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }
    private boolean Edit_offer_types(TestDriver driver) {

        driver.getReport().addHeader(" EDIT IN TOFFER TYPES AND AGREEMENTS DISCOUNTS", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"Offer_types_ed_b_edit", getElements("Offer_types_ed_b_edit")}, //element to click
                new String[]{"Offer_types_ed_i_discount", getElements("Offer_types_ed_i_discount")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"Offer_types_ed_i_discount", getElements("Offer_types_ed_i_discount")},
                "input_discount", "PB2", " on EDIT")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"Offer_types_ed_i_discount_description", getElements("Offer_types_ed_i_discount_description")},
                "input_description", "Prueba2", " on EDIT")) {
            return false;
        }


        if (!Functions.checkboxValue(driver,
                getElements("Offer_types_ed_check_box_notes"), "Notes", false, true, " on EDIT")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("Offer_types_ed_check_box_percentage"), "percentage", false, true, " on EDIT")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"Offer_types_ed_b_save", getElements("Offer_types_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }


        return true;
    }
    private boolean Search_offer_types(TestDriver driver) {
        boolean check_box_notes = false;
        boolean check_box_percentage = false;
        driver.getReport().addHeader(" SEARCH IN TRANSFRE DAR", 3, false);

        if (!Functions.insertInput(driver, new String[]{"Offer_types_se_i_discount", getElements("Offer_types_se_i_discount")},
                "input_discount", data.getData().get("input_discount"), " on ADD")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"Offer_types_se_i_discount_description", getElements("Offer_types_se_i_discount_description")},
                "input_description", data.getData().get("input_description"), " on ADD")) {
            return false;
        }

        if (getData("Notes").equalsIgnoreCase("yes")) {
            check_box_notes = true;
        }

        if (getData("percentage").equalsIgnoreCase("yes")) {
            check_box_percentage = true;
        }

        if (!Functions.checkboxValue(driver,

                getElements("Offer_types_se_check_box_notes"), "Notes", check_box_notes, " on ADD")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("Offer_types_se_check_box_percentage"), "percentage", check_box_percentage, " on ADD")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"Offer_types_se_b_search", getElements("Offer_types_se_b_search")}, //search button
                new String[]{"Offer_types_se_i_result", getElements("Offer_types_se_i_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }


        return true;
    }
    private boolean Add_offer_types(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN OFFER TYPES AND AGREEMENTS DISCOUNTS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"Offer_types_ad__b_add", getElements("Offer_types_ad__b_add")}, //element to click
                new String[]{"Offer_types_ad_i_discount", getElements("Offer_types_ad_i_discount")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"Offer_types_ad_i_discount", getElements("Offer_types_ad_i_discount")},
                "input_discount", "PB", " on ADD")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"Offer_types_ad_i_discount_description", getElements("Offer_types_ad_i_discount_description")},
                "input_description", "Prueba1", " on ADD")) {
            return false;
        }


        if (!Functions.checkboxValue(driver,
                getElements("Offer_types_ad_check_box_notes"), "Notes", true, true, " on ADD")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("Offer_types_ad_check_box_percentage"), "percentage", true, true, " on ADD")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"Offer_types_ad_b_save", getElements("Offer_types_ad_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }
}
