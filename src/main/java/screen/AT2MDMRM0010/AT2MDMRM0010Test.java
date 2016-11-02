package screen.AT2MDMRM0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 28/10/2016.
 */
public class AT2MDMRM0010Test {
    protected AT2MDMRM0010Locators locators;
    protected AT2MDMRM0010Data data;
    public AT2MDMRM0010Test() {
    }
    public AT2MDMRM0010Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0010Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0010Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0010Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Time confirmation maintenance 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!first_search_time(driver)) return false;
        if (!interaction_edit_time(driver)) return false;
        if (!search_time(driver)) return false;
        if (!qbe_time(driver)) return false;
        if (!others_actions_time(driver)) return false;
        return true;
    }

    public boolean first_search_time (TestDriver driver) {
        driver.getReport().addHeader("FIRST SEARCH", 3, false);
        String where = " FIRST SEARH";
        if (!Functions.insertInput(driver, new String[]{"search_i_to_code",getElements("search_i_to_code")},
                "code", "42732", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_name",getElements("search_i_to_name")},
                "name", "PERFECTTOU", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_desc",getElements("search_i_to_desc")},
                "desc", "PERFECT TOUR", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"time_e_result", getElements("time_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_time(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_to_code",getElements("search_i_to_code")},
                "code", getData("code"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_name",getElements("search_i_to_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_desc",getElements("search_i_to_desc")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_cancel",getElements("search_i_cancel")},
                "cancel", getData("cancel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_time",getElements("search_i_time")},
                "time", getData("time"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"time_e_result", getElements("time_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_time(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"time_b_edit", getElements("time_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_cancel",getElements("edit_i_cancel")},
                "cancel", String.valueOf(DataGenerator.random(1,60)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"edit_i_time",getElements("edit_i_time")},
                "time", String.valueOf(DataGenerator.random(1,72)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_time(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"time_e_result", getElements("time_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"time_b_qbe", getElements("time_b_qbe")},// query button
                new String[]{"qbe_i_to_code", getElements("qbe_i_to_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_code", getElements("qbe_i_to_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_name", getElements("qbe_i_to_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_desc", getElements("qbe_i_to_desc")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cancel", getElements("qbe_i_cancel")},
                "cancel", getData("cancel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_time", getElements("qbe_i_time")},
                "time", getData("time"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_to_code", getElements("qbe_i_to_code")}, //search button
                new String[]{"time_e_result", getElements("time_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_time(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"time_b_actions", getElements("time_b_actions")}, //actions button
                new String[]{"time_b_actions_b_audit_data", getElements("time_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"time_b_detach", getElements("time_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
