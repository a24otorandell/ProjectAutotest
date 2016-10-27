package screen.AT2MDMOR0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 27/10/2016.
 */
public class AT2MDMOR0005Test {
    protected AT2MDMOR0005Locators locators;
    protected AT2MDMOR0005Data data;
    public AT2MDMOR0005Test() {
    }
    public AT2MDMOR0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0005Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0005Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Set Up Web Prepayment 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_companies(driver)) return false;
        if (!search_companies(driver)) return false;
        if (!interaction_edit_companies(driver)) return false;
        if (!qbe_companies(driver)) return false;
        if (!others_actions_companies(driver)) return false;
        if (!delete_companies(driver)) return false;
        return true;
    }

    private boolean interaction_record_companies(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"companies_b_add", getElements("companies_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code",getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(3, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name",getElements("add_i_short_name")},
                "short_name", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_vat",getElements("add_i_vat")},
                "vat", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_sap",getElements("add_i_sap")},
                "sap", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_creditor",getElements("add_lov_creditor")}, // b_lov
                new String[]{"add_i_creditor", getElements("add_i_creditor")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "creditor", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_debtor",getElements("add_lov_debtor")}, // b_lov
                new String[]{"add_i_debtor", getElements("add_i_debtor")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "debtor", //Data name
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_street_type", getElements("add_lov_street_type")},
                new String[]{"add_i_street_type", getElements("add_i_street_type")},
                new String[]{"add_i_street_type_code", recursiveXPaths.lov_i_genericinput},
                "CL",
                "street_type",
                where)) {return false;};
        if (!Functions.insertInput(driver, new String[]{"add_i_n_from",getElements("add_i_n_from")},
                "from", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_n_to",getElements("add_i_n_to")},
                "to", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_country",getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_county",getElements("add_lov_county")}, // b_lov
                new String[]{"add_i_county", getElements("add_i_county")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "county", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_street_date",getElements("add_i_street_date")},
                "street", DataGenerator.getRandomAlphanumericSequence(20, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_stairway",getElements("add_i_stairway")},
                "stairway", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_floor",getElements("add_i_floor")},
                "floor", String.valueOf(DataGenerator.random(1,3)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_door",getElements("add_i_door")},
                "door", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
//        if(!Functions.createLov(driver,
//                new String[]{"add_lov_city",getElements("add_lov_city")}, // b_lov
//                new String[]{"add_i_city", getElements("add_i_city")}, // i_lov
//                recursiveXPaths.lov_b_search, // lov b search
//                recursiveXPaths.lov_e_result, // lov result
//                recursiveXPaths.lov_b_ok, //lov b ok
//                "city", //Data name
//                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_companies(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_name",getElements("search_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_short_name",getElements("search_i_short_name")},
                "short_name", getData("short_name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_vat",getElements("search_i_vat")},
                "vat", getData("vat"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_sap",getElements("search_i_sap")},
                "sap", getData("sap"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_creditor", getElements("search_lov_creditor")}, //LoV button
                new String[]{"search_i_creditor", getElements("search_i_creditor")}, //external LoV input
                new String[]{"search_lov_creditor_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("creditor"), // value to search
                "creditor", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_debtor", getElements("search_lov_debtor")}, //LoV button
                new String[]{"search_i_debtor", getElements("search_i_debtor")}, //external LoV input
                new String[]{"search_lov_debtor_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("debtor"), // value to search
                "debtor", //name of the data
                where)){return false;}

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"companies_e_result", getElements("companies_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_companies(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"companies_b_edit", getElements("companies_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code",getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(3, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name",getElements("add_i_short_name")},
                "short_name", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_vat",getElements("add_i_vat")},
                "vat", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_sap",getElements("add_i_sap")},
                "sap", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_creditor",getElements("add_lov_creditor")}, // b_lov
                new String[]{"add_i_creditor", getElements("add_i_creditor")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "creditor", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_debtor",getElements("add_lov_debtor")}, // b_lov
                new String[]{"add_i_debtor", getElements("add_i_debtor")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "debtor", //Data name
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_street_type", getElements("add_lov_street_type")},
                new String[]{"add_i_street_type", getElements("add_i_street_type")},
                new String[]{"add_i_street_type_code", recursiveXPaths.lov_i_genericinput},
                "CL",
                "street_type",
                where)) {return false;};
        if (!Functions.insertInput(driver, new String[]{"add_i_n_from",getElements("add_i_n_from")},
                "from", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_n_to",getElements("add_i_n_to")},
                "to", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_country",getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_county",getElements("add_lov_county")}, // b_lov
                new String[]{"add_i_county", getElements("add_i_county")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "county", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_street_date",getElements("add_i_street_date")},
                "street", DataGenerator.getRandomAlphanumericSequence(20, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_stairway",getElements("add_i_stairway")},
                "stairway", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_floor",getElements("add_i_floor")},
                "floor", String.valueOf(DataGenerator.random(1,3)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_door",getElements("add_i_door")},
                "door", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
//        if(!Functions.createLov(driver,
//                new String[]{"add_lov_city",getElements("add_lov_city")}, // b_lov
//                new String[]{"add_i_city", getElements("add_i_city")}, // i_lov
//                recursiveXPaths.lov_b_search, // lov b search
//                recursiveXPaths.lov_e_altresult, // lov result
//                recursiveXPaths.lov_b_ok, //lov b ok
//                "city", //Data name
//                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_companies(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"companies_e_result", getElements("companies_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"companies_b_qbe", getElements("companies_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")},
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_vat", getElements("qbe_i_vat")},
                "vat", getData("vat"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sap", getElements("qbe_i_sap")},
                "sap", getData("sap"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_creditor", getElements("qbe_i_creditor")},
                "creditor", getData("creditor"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_debtor", getElements("qbe_i_debtor")},
                "debtor", getData("debtor"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //search button
                new String[]{"companies_e_result", getElements("companies_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_companies(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"companies_b_actions", getElements("companies_b_actions")}, //actions button
                new String[]{"companies_b_actions_b_audit_data", getElements("companies_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"companies_b_detach", getElements("companies_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_companies(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"companies_b_delete", getElements("companies_b_delete")},
                new String[]{"companies_e_records", getElements("companies_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
