package screen.AT2TRFSU0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * @author ajvirgili on 01/09/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2TRFSU0005Test {

    protected AT2TRFSU0005Locators locators;
    protected AT2TRFSU0005Data data;

    public AT2TRFSU0005Test(String enviroment) {
        setData(new AT2TRFSU0005Data(enviroment));
        setLocators(new AT2TRFSU0005Locators(enviroment));
    }
    public AT2TRFSU0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFSU0005Locators locators) {
        this.locators = locators;
    }
    public AT2TRFSU0005Data getData() {
        return data;
    }
    public void setData(AT2TRFSU0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfer");
        driver.getTestdetails().setSubmenu("Set Up");
        driver.getTestdetails().setScreen("Grouping transfers areas only for contracts 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        Functions.zoomOut(driver);
        if (!recordInteractionGA(driver, true)) {
            return false;
        }
        if (!searchGA(driver)) {
            return false;
        }
        if (!recordInteractionGA(driver, false)) {
            return false;
        }
        if (!enabler(driver)) {
            return false;
        }
        if (!qbeGA(driver)) {
            return false;
        }
        if (!auditDetachGA(driver)) {
            return false;
        }
        if (!recordInteractionA(driver, true)) {
            return false;
        }
        if (!qbeA(driver, false)) {
            return false;
        }
        if (!recordInteractionA(driver, false)) {
            return false;
        }
        if (!qbeA(driver, true)) {
            return false;
        }
        if (!auditDetachA(driver)) {
            return false;
        }
        if (!deleteA(driver)) {
            return false;
        }
        if (!deleteGA(driver)) {
            return false;
        }
        return false;
    }

    protected boolean recordInteractionGA(TestDriver driver, boolean type) {
        String on, update = "";
        if (type) {
            on = "on ADD Grouping area";
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            Functions.break_time(driver, 1, 0);
            if (!Functions.checkClick(driver,
                    new String[]{"ga_records_b_add", getElements("ga_records_b_add")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        } else {
            update = "update_";
            on = "on EDIT Grouping area";
            driver.getReport().addHeader("RECORD EDITION:", 3, true);
            Functions.break_time(driver, 1, 0);
            if (!Functions.checkClick(driver,
                    new String[]{"ga_records_b_edit", getElements("ga_records_b_edit")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver,
                new String[]{"ga_records_b_add_i_grouping_area", getElements("ga_records_b_add_i_grouping_area")},
                "grouping_area",
                getData(update + "grouping_area"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"ga_records_b_add_i_description", getElements("ga_records_b_add_i_description")},
                "grouping_area_description",
                getData(update + "grouping_area_description"),
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"ga_records_b_add_b_save", getElements("ga_records_b_add_b_save")},
                recursiveXPaths.glass,
                on)) {
            return false;
        }
        return true;
    }
    protected boolean searchGA(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD:", 3, true);
        try {
            Functions.break_time(driver, 1, 0);
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_grouping_area", getElements("search_i_grouping_area")},
                    "grouping_area",
                    getData("grouping_area"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_description", getElements("search_i_description")},
                    "grouping_area_description",
                    getData("grouping_area_description"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"search_b_search", getElements("search_b_search")},
                    " on SEARCH")) {
                return false;
            }
            Functions.break_time(driver, 1, 500);
            if (!Functions.simpleClick(driver,
                    new String[]{"ga_records_e_record", getElements("ga_records_e_record")},
                    " on SEARCH")) {
                return false;
            }
        } catch (Exception search) {
            search.printStackTrace();
        }
        return true;
    }
    protected boolean qbeGA(TestDriver driver) {
        driver.getReport().addHeader("Grouping area - QBE SEARCH RECORD:", 4, false);
        if (!Functions.clickQbE(driver,
                new String[]{"ga_records_b_qbe", getElements("ga_records_b_qbe")},
                new String[]{"ga_records_b_qbe_i_grouping_area", getElements("ga_records_b_qbe_i_grouping_area")},
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"ga_records_b_qbe_i_grouping_area", getElements("ga_records_b_qbe_i_grouping_area")},
                "grouping_area",
                getData("grouping_area"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"ga_records_b_qbe_i_description", getElements("ga_records_b_qbe_i_description")},
                "grouping_area_description",
                getData("grouping_area_description"),
                " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"ga_records_b_qbe_i_grouping_area", getElements("ga_records_b_qbe_i_grouping_area")},
                new String[]{"ga_records_e_record", getElements("ga_records_e_record")},
                " on QBE")) {
            return false;
        }
        return true;
    }
    protected boolean auditDetachGA(TestDriver driver) {
        driver.getReport().addHeader("Grouping area - Data History & Detach table:", 4, false);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"ga_records_e_record", getElements("ga_records_e_record")},
                recursiveXPaths.glass,
                " on Data History")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"ga_records_b_actions", getElements("ga_records_b_actions")},
                new String[]{"ga_records_b_actions_b_data_history", getElements("ga_records_b_actions_b_data_history")},
                new String[]{"ga_records_b_actions_b_data_history_b_ok", getElements("ga_records_b_actions_b_data_history_b_ok")},
                " on Data History")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"ga_records_b_detach", getElements("ga_records_b_detach")},
                false,
                " on Detach table")) {
            return false;
        }
        return true;
    }
    protected boolean deleteGA(TestDriver driver) {
        driver.getReport().addHeader("Grouping area - DELETE RECORD:", 4, true);
        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"search_e_result", getElements("search_e_result")},
                    " on DELETE")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"ga_records_b_delete", getElements("ga_records_b_delete")},
                    " on DELETE")) {
                return false;
            }
            Functions.break_time(driver, 1, 0);
            if (!Functions.simpleClick(driver,
                    new String[]{"ga_records_b_delete_b_ok", getElements("ga_records_b_delete_b_ok")},
                    " on DELETE")) {
                return false;
            }
            Functions.break_time(driver, 1, 0);
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        return true;
    }
    ////////////\\\\\\\\\\\\\\
    protected boolean recordInteractionA(TestDriver driver, boolean type) {
        String on, update = "";
        if (type) {
            on = "on ADD Areas";
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            Functions.break_time(driver, 1, 0);
            if (!Functions.checkClick(driver,
                    new String[]{"area_records_b_add", getElements("area_records_b_add")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        } else {
            update = "update_";
            on = "on EDIT Areas";
            driver.getReport().addHeader("RECORD EDITION:", 3, true);
            Functions.break_time(driver, 1, 0);
            if (!Functions.checkClick(driver,
                    new String[]{"area_records_b_edit", getElements("area_records_b_edit")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"area_records_b_add_lov_area_code", getElements("area_records_b_add_lov_area_code")},
                new String[]{"area_records_b_add_i_area_code", getElements("area_records_b_add_i_area_code")},
                new String[]{"area_records_b_add_lov_area_code_i_area_code", getElements("area_records_b_add_lov_area_code_i_area_code")},
                getData(update + "area_code"),
                "provider",
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"area_records_b_add_b_save", getElements("area_records_b_add_b_save")},
                recursiveXPaths.glass,
                on)) {
            return false;
        }
        return true;
    }
    protected boolean qbeA(TestDriver driver, boolean run) {
        String update = "";
        if (run) {
            update = "update_";
        }
        driver.getReport().addHeader("Areas - QBE SEARCH RECORD:", 4, false);
        if (!Functions.clickQbE(driver,
                new String[]{"area_records_b_qbe", getElements("area_records_b_qbe")},
                new String[]{"area_records_b_qbe_i_grouping_area", getElements("area_records_b_qbe_i_grouping_area")},
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"area_records_b_qbe_i_grouping_area", getElements("area_records_b_qbe_i_grouping_area")},
                "area_code",
                getData(update + "area_code"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"area_records_b_qbe_i_description", getElements("area_records_b_qbe_i_description")},
                "area_code_description",
                getData(update + "area_code_description"),
                " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"area_records_b_qbe_i_grouping_area", getElements("area_records_b_qbe_i_grouping_area")},
                new String[]{"area_records_e_record", getElements("area_records_e_record")},
                " on QBE")) {
            return false;
        }
        return true;
    }
    protected boolean auditDetachA(TestDriver driver) {
        driver.getReport().addHeader("Data History & Detach table:", 4, false);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"area_records_e_record", getElements("area_records_e_record")},
                recursiveXPaths.glass,
                " on Data History")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"area_records_b_actions", getElements("area_records_b_actions")},
                new String[]{"area_records_b_actions_b_data_history", getElements("area_records_b_actions_b_data_history")},
                new String[]{"area_records_b_actions_b_data_history_b_ok", getElements("area_records_b_actions_b_data_history_b_ok")},
                " on Data History")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"area_records_b_detach", getElements("area_records_b_detach")},
                true,
                " on Detach table")) {
            return false;
        }
        return true;
    }
    protected boolean deleteA(TestDriver driver) {
        driver.getReport().addHeader("Areas - DELETE RECORD:", 4, true);
        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"area_records_e_record", getElements("area_records_e_record")},
                    " on DELETE")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"area_records_b_delete", getElements("area_records_b_delete")},
                    " on DELETE")) {
                return false;
            }
            Functions.break_time(driver, 1, 0);
            if (!Functions.checkClick(driver,
                    new String[]{"area_records_b_delete_b_ok", getElements("area_records_b_delete_b_ok")},
                    recursiveXPaths.glass,
                    " on DELETE")) {
                return false;
            }
            Functions.break_time(driver, 1, 0);
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        return true;
    }
    protected boolean enabler(TestDriver driver) {
        Functions.break_time(driver, 1, 0);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")},
                recursiveXPaths.glass,
                " on SEARCH")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                recursiveXPaths.glass,
                " on SEARCH")) {
            return false;
        }
        return true;
    }
}
