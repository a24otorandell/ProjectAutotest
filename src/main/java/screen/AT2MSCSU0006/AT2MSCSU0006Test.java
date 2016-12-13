package screen.AT2MSCSU0006;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by icastaneira on 12/12/2016.
 */
public class AT2MSCSU0006Test {

    protected AT2MSCSU0006Locators locators;
    protected AT2MSCSU0006Data data;

    public AT2MSCSU0006Test(String environment) {
        setLocators(new AT2MSCSU0006Locators(environment));
        setData(new AT2MSCSU0006Data(environment));
    }

    public AT2MSCSU0006Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MSCSU0006Locators locators) {
        this.locators = locators;
    }

    public AT2MSCSU0006Data getData() {
        return data;
    }

    public void setData(AT2MSCSU0006Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Miscellaneous");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("AT2MSCSU0006");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    /**
     * <p>This is the main chain of instructions for the test</p>
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     * @return boolean status: success/error
     */
    protected boolean testCSED(TestDriver driver) {
        // "Elements" TAB
        if (!changeTab(driver, "tab_elements")) {
            return false;
        }
        if (!elementsTabRecordInteraction(driver, true)) {
            return false;
        }
        if (!elementsTabSearch(driver)) {
            return false;
        }
        if (!elementsTabQuery(driver, false)) {
            return false;
        }
        if (!elementsTabRecordInteraction(driver, false)) {
            return false;
        }
        if (!elementsTabQuery(driver, false)) {
            return false;
        }
        if (!elementsTabExtraActions(driver)) {
            return false;
        }

        // "Profile Detail" TAB, "Profile" TABLE
        if (!changeTab(driver, "tab_profile_detail")) {
            return false;
        }
        if (!profileDetailTabProfileTableRecordInteraction(driver, true)) {
            return false;
        }
        if (!profileDetailTabProfileTableQuery(driver)) {
            return false;
        }
        if (!profileDetailTabProfileTableRecordInteraction(driver, false)) {
            return false;
        }
        if (!profileDetailTabProfileTableQuery(driver)) {
            return false;
        }
        if (!profileDetailTabProfileTableExtraActions(driver)) {
            return false;
        }

        // "Profile Detail" TAB, "Profile Detail" TABLE
        if (!profileDetailTabProfileDetailTableRecordInteraction(driver, true)) {
            return false;
        }
        if (!profileDetailTabProfileDetailTableQuery(driver, true)) {
            return false;
        }
        
        // "Elements" TAB
        if (!changeTab(driver, "tab_elements")) {
            return false;
        }
        if (!elementsTabQuery(driver, false)) {
            return false;
        }

        // "Profile Detail" TAB, "Profile" TABLE
        if (!changeTab(driver, "tab_profile_detail")) {
            return false;
        }
        if (!profileDetailTabProfileTableQuery(driver)) {
            return false;
        }

        // "Profile Detail" TAB, "Profile Detail" TABLE
        if (!profileDetailTabProfileDetailTableRecordInteraction(driver, false)) {
            return false;
        }

        // "Elements" TAB
        if (!changeTab(driver, "tab_elements")) {
            return false;
        }
        if (!elementsTabQuerySpecial(driver)) {
            return false;
        }

        // "Profile Detail" TAB, "Profile" TABLE
        if (!changeTab(driver, "tab_profile_detail")) {
            return false;
        }
        if (!profileDetailTabProfileTableQuery(driver)) {
            return false;
        }

        if (!profileDetailTabProfileDetailTableQuery(driver, false)) {
            return false;
        }
        if (!profileDetailTabProfileDetailTableExtraActions(driver)) {
            return false;
        }
        if (!profileDetailTabProfileDetailTableQuery(driver, false)) {
            return false;
        }
        if (!profileDetailTabProfileDetailTableDelete(driver)) {
            return false;
        }

        // "Profile Detail" TAB, "Profile" TABLE
        if (!profileDetailTabProfileTableQuery(driver)) {
            return false;
        }
        if (!profileDetailTabProfileTableDelete(driver)) {
            return false;
        }

        // "Elements" TAB
        if (!changeTab(driver, "tab_elements")) {
            return false;
        }
        if (!elementsTabQuery(driver, true)) {
            return false;
        }
        if (!elementsTabDelete(driver)) {
            return false;
        }

        return true;
    }

    protected boolean elementsTabQuerySpecial(TestDriver driver) {
        if (!Functions.clickQbE(driver,
                new String[]{"elements_tab_elements_table_query_b_qbe", getElements("elements_tab_elements_table_query_b_qbe")},
                new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                " on \"Elements\" TAB, QUERY")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"elements_tab_elements_table_query_sel_operation", getElements("elements_tab_elements_table_query_sel_operation")},
                getData("edited_profile_detail_tab_profile_detail_table_operation"),
                "elements_tab_elements_table_operation",
                " on \"Elements\" TAB, QUERY")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                "elements_tab_elements_table_elements",
                "",
                " on \"Elements\" TAB, QUERY")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                new String[]{"elements_tab_elements_table_search_e_result", getElements("elements_tab_elements_table_search_e_result")},
                " on \"Elements\" TAB, QUERY")) {
            return false;
        }
        return true;
    }

    //<editor-fold desc="Profile Detail TAB, Profile TABLE">
    protected boolean profileDetailTabProfileTableRecordInteraction(TestDriver driver, boolean b) {
        //OPEN CREATE/EDIT POPUP
        String on, update = "";
        if (b) {
            on = " on \"Profile Detail\" TAB, \"Profile\" TABLE, CREATION";
            driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile\" TABLE, CREATION:", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"profile_detail_tab_profile_table_record_intearction_b_add", getElements("profile_detail_tab_profile_table_record_intearction_b_add")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        } else {
            update = "update_";
            on = " on \"Profile Detail\" TAB, \"Profile\" TABLE, EDITION";
            driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile\" TABLE, EDITION:", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"profile_detail_tab_profile_table_record_intearction_b_edit", getElements("profile_detail_tab_profile_table_record_intearction_b_edit")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        }

        //POPULATE RECORD
        if (!Functions.insertInput(driver,
                new String[]{"profile_detail_tab_profile_table_record_intearction_i_profile", getElements("profile_detail_tab_profile_table_record_intearction_i_profile")},
                "profile_detail_tab_profile_table_profile",
                getData(update + "profile_detail_tab_profile_table_profile"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"profile_detail_tab_profile_table_record_intearction_i_description", getElements("profile_detail_tab_profile_table_record_intearction_i_description")},
                "profile_detail_tab_profile_table_description",
                getData(update + "profile_detail_tab_profile_table_description"),
                on)) {
            return false;
        }

        //SAVE RECORD
        if (b) {
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"profile_detail_tab_profile_table_record_intearction_b_save", getElements("profile_detail_tab_profile_table_record_intearction_b_save")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        } else {
            if (!Functions.checkClick(driver,
                    new String[]{"profile_detail_tab_profile_table_record_intearction_b_save", getElements("profile_detail_tab_profile_table_record_intearction_b_save")},
                    new String[]{"profile_detail_tab_profile_table_record_intearction_b_save_cascade_edit", getElements("profile_detail_tab_profile_table_record_intearction_b_save_cascade_edit")},
                    on)) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"profile_detail_tab_profile_table_record_intearction_b_save_cascade_edit", getElements("profile_detail_tab_profile_table_record_intearction_b_save_cascade_edit")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        }
        return true;
    }

    protected boolean profileDetailTabProfileTableQuery(TestDriver driver) {
        driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile\" TABLE, QUERY:", 3, true);
        if (!Functions.clickQbE(driver,
                new String[]{"profile_detail_tab_profile_table_query_b_qbe", getElements("profile_detail_tab_profile_table_query_b_qbe")},
                new String[]{"profile_detail_tab_profile_table_query_i_profile", getElements("profile_detail_tab_profile_table_query_i_profile")},
                " on \"Profile Detail\" TAB, \"Profile\" TABLE, QUERY")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"profile_detail_tab_profile_table_query_i_profile", getElements("profile_detail_tab_profile_table_query_i_profile")},
                "profile_detail_tab_profile_table_profile",
                getData("profile_detail_tab_profile_table_profile"),
                " on \"Profile Detail\" TAB, \"Profile\" TABLE, QUERY")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"profile_detail_tab_profile_table_query_i_description", getElements("profile_detail_tab_profile_table_query_i_description")},
                "profile_detail_tab_profile_table_description",
                getData("profile_detail_tab_profile_table_description"),
                " on \"Profile Detail\" TAB, \"Profile\" TABLE, QUERY")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"profile_detail_tab_profile_table_query_i_profile", getElements("profile_detail_tab_profile_table_query_i_profile")},
                new String[]{"profile_detail_tab_profile_table_search_e_result", getElements("profile_detail_tab_profile_table_search_e_result")},
                " on \"Profile Detail\" TAB, \"Profile\" TABLE, QUERY")) {
            return false;
        }
        return true;
    }

    protected boolean profileDetailTabProfileTableExtraActions(TestDriver driver) {
        driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile\" TABLE, EXTRA ACTIONS:", 3, true);
        if (!Functions.auditData(driver,
                new String[]{"profile_detail_tab_profile_table_audit_b_actions", getElements("profile_detail_tab_profile_table_audit_b_actions")},
                new String[]{"profile_detail_tab_profile_table_audit_b_audit", getElements("profile_detail_tab_profile_table_audit_b_audit")},
                new String[]{"profile_detail_tab_profile_table_audit_b_ok", getElements("profile_detail_tab_profile_table_audit_b_ok")},
                " to AUDIT \"Profile Detail\" TAB, \"Profile\" TABLE DATA")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"profile_detail_tab_profile_table_detach_b_detach", getElements("profile_detail_tab_profile_table_detach_b_detach")},
                true,
                " to DETACH \"Profile Detail\" TAB, \"Profile\" TABLE")) {
            return false;
        }
        return true;
    }

    protected boolean profileDetailTabProfileTableDelete(TestDriver driver) {
        driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile\" TABLE, DELETE", 3, true);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"profile_detail_tab_profile_table_delete_b_delete", getElements("profile_detail_tab_profile_table_delete_b_delete")},
                new String[]{"profile_detail_tab_profile_table_search_n_records", getElements("profile_detail_tab_profile_table_search_n_records")},
                new String[]{"profile_detail_tab_profile_table_delete_b_yes", getElements("profile_detail_tab_profile_table_delete_b_yes")},
                " on \"Profile Detail\" TAB, \"Profile\" TABLE, DELETE")) {
            return false;
        }
        return true;
    }
    //</editor-fold>

    //<editor-fold desc="Profile Detail TAB, Profile Detail TABLE">
    protected boolean profileDetailTabProfileDetailTableRecordInteraction(TestDriver driver, boolean b) {
        String on, update = "";
        if (b) {
            on = " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, CREATION";
            driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile Detail\" TABLE, CREATION:", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_b_add", getElements("profile_detail_tab_profile_detail_table_record_intearction_b_add")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_profile_b_lov", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_profile_b_lov")},
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_i_profile", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_i_profile")},
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_profile_lov_i_profile", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_profile_lov_i_profile")},
                    getData("update_profile_detail_tab_profile_table_profile"),
                    "update_profile_detail_tab_profile_table_profile",
                    on)) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_operation_b_lov", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_operation_b_lov")},
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_i_operation", getElements("profile_detail_tab_profile_detail_table_record_intearction_i_operation")},
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_operation_lov_i_operation", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_operation_lov_i_operation")},
                    getData("update_elements_tab_elements_table_operation"),
                    "update_elements_tab_elements_table_operation",
                    on)) {
                return false;
            }
        } else {
            update = "update_";
            on = " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, EDITION";
            driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile Detail\" TABLE, EDITION:", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_b_edit", getElements("profile_detail_tab_profile_detail_table_record_intearction_b_edit")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_operation_b_lov", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_operation_b_lov")},
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_i_operation", getElements("profile_detail_tab_profile_detail_table_record_intearction_i_operation")},
                    new String[]{"profile_detail_tab_profile_detail_table_record_intearction_lov_operation_lov_i_operation", getElements("profile_detail_tab_profile_detail_table_record_intearction_lov_operation_lov_i_operation")},
                    getData("edited_profile_detail_tab_profile_detail_table_operation"),
                    "edited_profile_detail_tab_profile_detail_table_operation",
                    on)) {
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"profile_detail_tab_profile_detail_table_record_intearction_b_save", getElements("profile_detail_tab_profile_detail_table_record_intearction_b_save")},
                recursiveXPaths.glass, on)) {
            return false;
        }
        return true;
    }

    protected boolean profileDetailTabProfileDetailTableQuery(TestDriver driver, boolean b) {
        driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY:", 3, true);
        if (!Functions.clickQbE(driver,
                new String[]{"profile_detail_tab_profile_detail_table_query_b_qbe", getElements("profile_detail_tab_profile_detail_table_query_b_qbe")},
                new String[]{"profile_detail_tab_profile_detail_table_query_i_profile", getElements("profile_detail_tab_profile_detail_table_query_i_profile")},
                " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY")) {
            return false;
        }
        if (b) {
            if (!Functions.insertInput(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_query_i_profile", getElements("profile_detail_tab_profile_detail_table_query_i_profile")},
                    "update_profile_detail_tab_profile_table_profile",
                    getData("update_profile_detail_tab_profile_table_profile"),
                    " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_query_i_operation", getElements("profile_detail_tab_profile_detail_table_query_i_operation")},
                    "update_elements_tab_elements_table_operation",
                    getData("update_elements_tab_elements_table_operation"),
                    " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY")) {
                return false;
            }
        } else {
            if (!Functions.insertInput(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_query_i_profile", getElements("profile_detail_tab_profile_detail_table_query_i_profile")},
                    "update_profile_detail_tab_profile_table_profile",
                    getData("update_profile_detail_tab_profile_table_profile"),
                    " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"profile_detail_tab_profile_detail_table_query_i_operation", getElements("profile_detail_tab_profile_detail_table_query_i_operation")},
                    "edited_profile_detail_tab_profile_detail_table_operation",
                    getData("edited_profile_detail_tab_profile_detail_table_operation"),
                    " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY")) {
                return false;
            }
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"profile_detail_tab_profile_detail_table_query_i_profile", getElements("profile_detail_tab_profile_detail_table_query_i_profile")},
                new String[]{"profile_detail_tab_profile_detail_table_search_e_result", getElements("profile_detail_tab_profile_detail_table_search_e_result")},
                " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, QUERY")) {
            return false;
        }
        return true;
    }

    protected boolean profileDetailTabProfileDetailTableExtraActions(TestDriver driver) {
        driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile Deatil\" TABLE, EXTRA ACTIONS:", 3, true);
        if (!Functions.auditData(driver,
                new String[]{"profile_detail_tab_profile_detail_table_audit_b_actions", getElements("profile_detail_tab_profile_detail_table_audit_b_actions")},
                new String[]{"profile_detail_tab_profile_detail_table_audit_b_audit", getElements("profile_detail_tab_profile_detail_table_audit_b_audit")},
                new String[]{"profile_detail_tab_profile_detail_table_audit_b_ok", getElements("profile_detail_tab_profile_detail_table_audit_b_ok")},
                " to AUDIT \"Profile Detail\" TAB, \"Profile Detail\" TABLE DATA")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"profile_detail_tab_profile_detail_table_detach_b_detach", getElements("profile_detail_tab_profile_detail_table_detach_b_detach")},
                true,
                " to DETACH \"Profile Detail\" TAB, \"Profile Detail\" TABLE")) {
            return false;
        }
        return true;
    }

    protected boolean profileDetailTabProfileDetailTableDelete(TestDriver driver) {
        driver.getReport().addHeader("\"Profile Detail\" TAB, \"Profile Detail\" TABLE, DELETE", 3, true);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"profile_detail_tab_profile_detail_table_delete_b_delete", getElements("profile_detail_tab_profile_detail_table_delete_b_delete")},
                new String[]{"profile_detail_tab_profile_detail_table_search_n_records", getElements("profile_detail_tab_profile_detail_table_search_n_records")},
                new String[]{"profile_detail_tab_profile_detail_table_delete_b_yes", getElements("profile_detail_tab_profile_detail_table_delete_b_yes")},
                " on \"Profile Detail\" TAB, \"Profile Detail\" TABLE, DELETE")) {
            return false;
        }
        return true;
    }
    //</editor-fold>

    //<editor-fold desc="Elements TAB">
    protected boolean changeTab(TestDriver driver, String tab) {
        driver.getReport().addHeader("TAB CHANGE", 3, true);
        String localTab = tab.replace("tab_", "");
        if (!Functions.simpleClick(driver,
                new String[]{tab, getElements(tab)},
                " to NAVIGATE TO \"" + localTab + "\" TAB")) { //TODO Clean this. Substring + Replace?
            return false;
        }
        return true;
    }

    protected boolean elementsTabRecordInteraction(TestDriver driver, boolean b) {
        //OPEN CREATE/EDIT POPUP
        String on, update = "";
        if (b) {
            on = " on \"Elements\" TAB, CREATION";
            driver.getReport().addHeader("\"Elements\" TAB, CREATION:", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"elements_tab_elements_table_record_intearction_b_add", getElements("elements_tab_elements_table_record_intearction_b_add")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        } else {
            update = "update_";
            on = " on \"Elements\" TAB, EDITION";
            driver.getReport().addHeader("\"Elements\" TAB, EDITION:", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"elements_tab_elements_table_record_intearction_b_edit", getElements("elements_tab_elements_table_record_intearction_b_edit")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        }

        //POPULATE RECORD
        if (!Functions.selectText(driver,
                new String[]{"elements_tab_elements_table_record_intearction_sel_operation", getElements("elements_tab_elements_table_record_intearction_sel_operation")},
                getData(update + "elements_tab_elements_table_operation"),
                "elements_tab_elements_table_operation",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"elements_tab_elements_table_record_intearction_i_element", getElements("elements_tab_elements_table_record_intearction_i_element")},
                "elements_tab_elements_table_elements",
                getData(update + "elements_tab_elements_table_elements"),
                on)) {
            return false;
        }

        //SAVE RECORD
        if (b) {
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"elements_tab_elements_table_record_intearction_b_save", getElements("elements_tab_elements_table_record_intearction_b_save")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        } else {
            if (!Functions.checkClick(driver,
                    new String[]{"elements_tab_elements_table_record_intearction_b_save", getElements("elements_tab_elements_table_record_intearction_b_save")},
                    new String[]{"elements_tab_elements_table_record_intearction_b_save_cascade_edit", getElements("elements_tab_elements_table_record_intearction_b_save_cascade_edit")},
                    on)) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"elements_tab_elements_table_record_intearction_b_save_cascade_edit", getElements("elements_tab_elements_table_record_intearction_b_save_cascade_edit")},
                    recursiveXPaths.glass, on)) {
                return false;
            }
        }
        return true;
    }

    protected boolean elementsTabSearch(TestDriver driver) {
        driver.getReport().addHeader("\"Elements\" TAB, SEARCH:", 3, true);
        //SEARCH
        if (!Functions.selectText(driver,
                new String[]{"elements_tab_elements_table_search_sel_operation", getElements("elements_tab_elements_table_search_sel_operation")},
                getData("elements_tab_elements_table_operation"),
                "elements_tab_elements_table_operation",
                " on \"Elements\" TAB, SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"elements_tab_elements_table_search_b_search", getElements("elements_tab_elements_table_search_b_search")},
                new String[]{"elements_tab_elements_table_search_e_result", getElements("elements_tab_elements_table_search_e_result")},
                " on \"Elements\" TAB, SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"elements_tab_elements_table_search_b_reset", getElements("elements_tab_elements_table_search_b_reset")},
                new String[]{"elements_tab_elements_table_search_e_result", getElements("elements_tab_elements_table_search_e_result")},
                " on \"Elements\" TAB, RESET")) {
            return false;
        }
        return true;
    }

    protected boolean elementsTabQuery(TestDriver driver, boolean b) {
        driver.getReport().addHeader("\"Elements\" TAB, QUERY:", 3, true);
        if (!Functions.clickQbE(driver,
                new String[]{"elements_tab_elements_table_query_b_qbe", getElements("elements_tab_elements_table_query_b_qbe")},
                new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                " on \"Elements\" TAB, QUERY")) {
            return false;
        }
        if (!b) {
            if (!Functions.selectText(driver,
                    new String[]{"elements_tab_elements_table_query_sel_operation", getElements("elements_tab_elements_table_query_sel_operation")},
                    getData("elements_tab_elements_table_operation"),
                    "elements_tab_elements_table_operation",
                    " on \"Elements\" TAB, QUERY")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                    "elements_tab_elements_table_elements",
                    getData("elements_tab_elements_table_elements"),
                    " on \"Elements\" TAB, QUERY")) {
                return false;
            }
        } else {
            if (!Functions.selectText(driver,
                    new String[]{"elements_tab_elements_table_query_sel_operation", getElements("elements_tab_elements_table_query_sel_operation")},
                    getData("update_elements_tab_elements_table_operation"),
                    "elements_tab_elements_table_operation",
                    " on \"Elements\" TAB, QUERY")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                    "elements_tab_elements_table_elements",
                    getData("update_elements_tab_elements_table_elements"),
                    " on \"Elements\" TAB, QUERY")) {
                return false;
            }
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"elements_tab_elements_table_query_i_element", getElements("elements_tab_elements_table_query_i_element")},
                new String[]{"elements_tab_elements_table_search_e_result", getElements("elements_tab_elements_table_search_e_result")},
                " on \"Elements\" TAB, QUERY")) {
            return false;
        }
        return true;
    }

    protected boolean elementsTabExtraActions(TestDriver driver) {
        driver.getReport().addHeader("\"Elements\" TAB, EXTRA ACTIONS:", 3, true);
        if (!Functions.auditData(driver,
                new String[]{"elements_tab_elements_table_audit_b_actions", getElements("elements_tab_elements_table_audit_b_actions")},
                new String[]{"elements_tab_elements_table_audit_b_audit", getElements("elements_tab_elements_table_audit_b_audit")},
                new String[]{"elements_tab_elements_table_audit_b_ok", getElements("elements_tab_elements_table_audit_b_ok")},
                " to AUDIT \"Elements\" TAB, \"Elements\" TABLE DATA")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"elements_tab_elements_table_detach_b_detach", getElements("elements_tab_elements_table_detach_b_detach")},
                true,
                " to DETACH \"Elements\" TAB, \"Elements\" TABLE")) {
            return false;
        }
        return true;
    }

    protected boolean elementsTabDelete(TestDriver driver) {
        driver.getReport().addHeader("\"Elements\" TAB DELETE", 3, true);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"elements_tab_elements_table_delete_b_delete", getElements("elements_tab_elements_table_delete_b_delete")},
                new String[]{"elements_tab_elements_table_search_n_records", getElements("elements_tab_elements_table_search_n_records")},
                new String[]{"elements_tab_elements_table_delete_b_yes", getElements("elements_tab_elements_table_delete_b_yes")},
                " on \"Elements\" TAB, DELETE")) {
            return false;
        }
        return true;
    }
    //</editor-fold>
}
