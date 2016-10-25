package screen.AT2MDMDE0021;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMDE0021Sis {
    protected AT2MDMDE0021Locators locators;
    protected AT2MDMDE0021Data data;
    public AT2MDMDE0021Sis() {
    }
    public AT2MDMDE0021Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0021Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0021Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0021Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Hotelbeds airport by destination 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_hotelbeds(driver)) return false;
        if (!search_hotelbeds(driver)) return false;
        if (!interaction_edit_hotelbeds(driver)) return false;
        if (!qbe_hotelbeds(driver)) return false;
        if (!others_actions_hotelbeds(driver)) return false;
        if (!delete_hotelbeds(driver)) return false;
        return true;
    }
    private boolean interaction_record_hotelbeds(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"hotelbeds_b_add", getElements("hotelbeds_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_destination",getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_destination_desc", getElements("add_i_destination_desc")}, // element path
                "info_des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_airport",getElements("add_lov_airport")}, // b_lov
                new String[]{"add_i_airport", getElements("add_i_airport")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "airport", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_airport_desc", getElements("add_i_airport_desc")}, // element path
                "info_air", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_hotelbeds(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination", getElements("search_lov_destination")}, //LoV button
                new String[]{"search_i_destination", getElements("search_i_destination")}, //external LoV input
                new String[]{"search_lov_des_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("destination"), // value to search
                "destination", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_airport", getElements("search_lov_airport")}, //LoV button
                new String[]{"search_i_airport", getElements("search_i_airport")}, //external LoV input
                new String[]{"search_lov_airport_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("airport"), // value to search
                "airport", //name of the data
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"hotelbeds_e_result", getElements("hotelbeds_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hotelbeds(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"hotelbeds_b_edit", getElements("hotelbeds_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_destination",getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_destination_desc", getElements("add_i_destination_desc")}, // element path
                "info_des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_airport",getElements("add_lov_airport")}, // b_lov
                new String[]{"add_i_airport", getElements("add_i_airport")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "airport", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_airport_desc", getElements("add_i_airport_desc")}, // element path
                "info_air", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hotelbeds(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"hotelbeds_e_result", getElements("hotelbeds_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"hotelbeds_b_qbe", getElements("hotelbeds_b_qbe")},// query button
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_desc", getElements("qbe_i_destination_desc")},
                "info_des", getData("info_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_airport", getElements("qbe_i_airport")},
                "airport", getData("airport"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_airport_desc", getElements("qbe_i_airport_desc")},
                "info_air", getData("info_air"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")}, //search button
                new String[]{"hotelbeds_e_result", getElements("hotelbeds_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hotelbeds(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"hotelbeds_b_actions", getElements("hotelbeds_b_actions")}, //actions button
                new String[]{"hotelbeds_b_actions_b_audit_data", getElements("hotelbeds_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"hotelbeds_b_detach", getElements("hotelbeds_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hotelbeds(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"hotelbeds_b_delete", getElements("hotelbeds_b_delete")},
                new String[]{"hotelbeds_e_records", getElements("hotelbeds_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
