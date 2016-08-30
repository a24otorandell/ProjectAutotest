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
        if (!RecordInteraction(driver)) {
            return false;
        }
        if (!Search(driver)) {
            return false;
        }
        if (!Edit(driver)) {
            return false;
        }
        if (!Search(driver)) {
            return false;
        }
        if (!QBE(driver)) {
            return false;
        }
        if (!Oher_Actions(driver)) {
            return false;
        }
        if (!Delete(driver)) {
            return false;
        }
        return true;
    }

    private boolean Delete(TestDriver driver) {
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

    private boolean Oher_Actions(TestDriver driver) {
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

    private boolean QBE(TestDriver driver) {
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

    private boolean Edit(TestDriver driver) {
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

    private boolean Search(TestDriver driver) {
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

    private boolean RecordInteraction(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
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
