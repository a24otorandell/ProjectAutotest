package screen.AT2MDMDE0013;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMDE0013Sis {
    protected AT2MDMDE0013Locators locators;
    protected AT2MDMDE0013Data data;
    public AT2MDMDE0013Sis() {
    }
    public AT2MDMDE0013Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0013Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0013Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0013Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("B2B destinations 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_b2b(driver)) return false;
        if (!search_b2b(driver)) return false;
        if (!interaction_edit_b2b(driver)) return false;
        if (!qbe_b2b(driver)) return false;
        if (!others_actions_b2b(driver)) return false;
        if (!delete_b2b(driver)) return false;

        return true;
    }

    private boolean interaction_record_b2b(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"b2b_b_add", getElements("b2b_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination", getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_area", getElements("add_lov_area")}, // b_lov
                new String[]{"add_i_area", getElements("add_i_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "area", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_area_name", getElements("add_i_area_name")}, // element path
                "area_name", // key for data value (the name)
                where)){return false;}
/*        if (!Functions.createLov(driver,
                new String[]{"add_lov_external_supplier", getElements("add_lov_external_supplier")}, // b_lov
                new String[]{"add_i_external_supplier", getElements("add_i_external_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ext_su", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_external_supplier", getElements("add_lov_external_supplier")}, //LoV button
                new String[]{"add_i_external_supplier", getElements("add_i_external_supplier")}, //external LoV input
                new String[]{"add_lov_ext_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                "8", // value to search
                "ext_su", //name of the data
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_external_name", getElements("add_i_external_name")}, // element path
                "ext_name", // key for data value (the name)
                where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_b2b", getElements("add_lov_b2b")}, // b_lov
                new String[]{"add_i_b2b", getElements("add_i_b2b")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "b2b", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_b2b_des", getElements("add_i_b2b_des")}, // element path
                "b2b_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_b2b(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination", getElements("search_lov_destination")}, //LoV button
                new String[]{"search_i_destination", getElements("search_i_destination")}, //external LoV input
                new String[]{"search_lov_des_code_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                getData("destination"), // value to search
                "destination", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_area", getElements("search_lov_area")}, //LoV button
                new String[]{"search_i_area", getElements("search_i_area")}, //external LoV input
                new String[]{"search_lov_area_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("area"), // value to search
                "area", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_external_supplier", getElements("search_lov_external_supplier")}, //LoV button
                new String[]{"search_i_external_supplier", getElements("search_i_external_supplier")}, //external LoV input
                new String[]{"search_lov_ext_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                getData("ext_su"), // value to search
                "ext_su", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_b2b", getElements("search_lov_b2b")}, //LoV button
                new String[]{"search_i_b2b", getElements("search_i_b2b")}, //external LoV input
                new String[]{"search_lov_b2b_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("b2b"), // value to search
                "b2b", //name of the data
                where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"b2b_e_result", getElements("b2b_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_b2b(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"b2b_b_edit", getElements("b2b_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination", getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_area", getElements("add_lov_area")}, // b_lov
                new String[]{"add_i_area", getElements("add_i_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "area", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_area_name", getElements("add_i_area_name")}, // element path
                "area_name", // key for data value (the name)
                where)){return false;}
/*        if (!Functions.createLov(driver,
                new String[]{"add_lov_external_supplier", getElements("add_lov_external_supplier")}, // b_lov
                new String[]{"add_i_external_supplier", getElements("add_i_external_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "invoicing", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_external_supplier", getElements("add_lov_external_supplier")}, //LoV button
                new String[]{"add_i_external_supplier", getElements("add_i_external_supplier")}, //external LoV input
                new String[]{"add_lov_ext_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                "11", // value to search
                "ext_su", //name of the data
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_external_name", getElements("add_i_external_name")}, // element path
                "ext_name", // key for data value (the name)
                where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_b2b", getElements("add_lov_b2b")}, // b_lov
                new String[]{"add_i_b2b", getElements("add_i_b2b")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "b2b", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_i_b2b_des", getElements("add_i_b2b_des")}, // element path
                "b2b_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_b2b(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"b2b_e_result", getElements("b2b_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"b2b_b_qbe", getElements("b2b_b_qbe")},// query button
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_area", getElements("qbe_i_area")},
                "area", getData("area"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_area_name", getElements("qbe_i_area_name")},
                "area_name", getData("area_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_supplier", getElements("qbe_i_external_supplier")},
                "ext_su", getData("ext_su"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_name", getElements("qbe_i_external_name")},
                "ext_name", getData("ext_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b2b", getElements("qbe_i_b2b")},
                "b2b", getData("b2b"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b2b_des", getElements("qbe_i_b2b_des")},
                "b2b_des", getData("b2b_des"), where)) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")}, //search button
                new String[]{"b2b_e_result", getElements("b2b_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_b2b(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"b2b_b_actions", getElements("b2b_b_actions")}, //actions button
                new String[]{"b2b_b_actions_b_audit_data", getElements("b2b_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"b2b_b_detach", getElements("b2b_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_b2b(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"b2b_b_delete", getElements("b2b_b_delete")},
                new String[]{"b2b_e_records", getElements("b2b_e_records")},
                where)){
            return false;
        }
        return true;
    }

}
