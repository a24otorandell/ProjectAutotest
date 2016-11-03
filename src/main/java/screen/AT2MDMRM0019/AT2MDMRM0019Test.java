package screen.AT2MDMRM0019;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0019Test {
    protected AT2MDMRM0019Locators locators;
    protected AT2MDMRM0019Data data;
    public AT2MDMRM0019Test() {
    }
    public AT2MDMRM0019Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0019Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0019Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0019Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Hotels advertising 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_hotel(driver)) return false;
        if (!search_products(driver)) return false;
        if (!interaction_edit_hotel(driver)) return false;
        if (!qbe_hotel(driver)) return false;
        if (!others_actions_hotel(driver)) return false;
        if (!delete_hotel(driver)) return false;
        return true;
    }

    public boolean interaction_add_hotel (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_add", getElements("hotel_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_sequence",getElements("add_lov_sequence")}, // b_lov
                new String[]{"add_i_sequence", getElements("add_i_sequence")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "sequence", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_hotel", getElements("add_i_hotel")},
                "hotel", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_classification",getElements("add_i_classification")},
                "classification", String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order",getElements("add_i_order")},
                "order", String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_products(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_sequence", getElements("search_lov_sequence")}, //LoV button
                new String[]{"search_i_sequence", getElements("search_i_sequence")}, //external LoV input
                new String[]{"search_lov_seq_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("sequence"), // value to search
                "sequence", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_int_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_classification",getElements("search_i_classification")},
                "classification", getData("classification"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_order",getElements("search_i_order")},
                "order", getData("order"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_hotel(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_edit", getElements("hotel_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_sequence",getElements("add_lov_sequence")}, // b_lov
                new String[]{"add_i_sequence", getElements("add_i_sequence")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "sequence", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_hotel", getElements("add_i_hotel")},
                "hotel", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_classification",getElements("add_i_classification")},
                "classification", String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order",getElements("add_i_order")},
                "order", String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_hotel(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"hotel_b_qbe", getElements("hotel_b_qbe")},// query button
                new String[]{"qbe_i_sequence", getElements("qbe_i_sequence")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sequence", getElements("qbe_i_sequence")},
                "sequence", getData("sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_classification", getElements("qbe_i_classification")},
                "classification", getData("classification"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_sequence", getElements("qbe_i_sequence")}, //search button
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_hotel(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"hotel_b_actions", getElements("hotel_b_actions")}, //actions button
                new String[]{"hotel_b_actions_b_audit_data", getElements("hotel_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"hotel_b_detach", getElements("hotel_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_hotel(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_b_delete", getElements("hotel_b_delete")},
                new String[]{"hotel_e_records", getElements("hotel_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
