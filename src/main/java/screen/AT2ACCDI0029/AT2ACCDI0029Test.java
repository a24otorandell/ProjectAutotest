package screen.AT2ACCDI0029;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 18/10/2016.
 */

/**
 * BUG EN EL CAMPO DE CREACIÓN DE HOTEL CODE
 */
public class AT2ACCDI0029Test {
    protected AT2ACCDI0029Locators locators;
    protected AT2ACCDI0029Data data;

    public AT2ACCDI0029Test() {

    }
    public AT2ACCDI0029Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCDI0029Locators locators) {
        this.locators = locators;
    }
    public AT2ACCDI0029Data getData() {
        return data;
    }
    public void setData(AT2ACCDI0029Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Distribution");
        driver.getTestdetails().setScreen("Opaque maintenance 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_opaque(driver)) return false;
        if (!search_opaque(driver)) return false;
        if (!interaction_edit_opaque(driver)) return false;
        if (!qbe_opaque(driver)) return false;
        if (!others_actions_opaque(driver)) return false;
        if (!delete_opaque(driver)) return false;
        return false;
    }

    private boolean interaction_record_opaque(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"opaque_b_add", getElements("opaque_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_incoming_office", getElements("add_i_incoming_office")}, // element path
                "incoming", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_market_country", getElements("add_lov_market_country")}, // b_lov
                new String[]{"add_i_market_country", getElements("add_i_market_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_country", getElements("add_i_country")}, // element path
                "country", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_chain", getElements("add_lov_chain")}, // b_lov
                new String[]{"add_i_chain", getElements("add_i_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_hotel_code", getElements("add_lov_hotel_code")}, // b_lov
                new String[]{"add_i_hotel_code", getElements("add_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_hotel_name", getElements("add_i_hotel_name")}, // element path
                "hotel_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_opaque_type", getElements("add_sl_opaque_type")},
                "Always", "opaque", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_opaque(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company"), // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("office"), // value to search
                "office", //name of the data
                where)) {
            return false;
        }
/*        if (!Functions.insertInput(driver, new String[]{"search_i_incoming_office", getElements("search_i_incoming_office")},
                "incoming", getData("incoming"), where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_market_country", getElements("search_lov_market_country")}, //LoV button
                new String[]{"search_i_market_country", getElements("search_i_market_country")}, //external LoV input
                new String[]{"search_lov_market_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("market"), // value to search
                "market", //name of the data
                where)) {
            return false;
        }
/*        if (!Functions.insertInput(driver, new String[]{"search_i_country", getElements("search_i_country")},
                "country", getData("country"), where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_chain", getElements("search_lov_chain")}, //LoV button
                new String[]{"search_i_chain", getElements("search_i_chain")}, //external LoV input
                new String[]{"search_lov_chain_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("chain"), // value to search
                "chain", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel_code", getElements("search_lov_hotel_code")}, //LoV button
                new String[]{"search_i_hotel_name", getElements("search_i_hotel_name")}, //external LoV input
                new String[]{"search_lov_hotel_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("hotel_code"), // value to search
                "hotel_name", //name of the data
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_opaque_type", getElements("search_sl_opaque_type")},
                getData("opaque"), "opaque", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"opaque_e_result", getElements("opaque_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_opaque(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"opaque_b_edit", getElements("opaque_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_incoming_office", getElements("add_i_incoming_office")}, // element path
                "incoming", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_market_country", getElements("add_lov_market_country")}, // b_lov
                new String[]{"add_i_market_country", getElements("add_i_market_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_country", getElements("add_i_country")}, // element path
                "country", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_chain", getElements("add_lov_chain")}, // b_lov
                new String[]{"add_i_chain", getElements("add_i_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_hotel_code", getElements("add_lov_hotel_code")}, // b_lov
                new String[]{"add_i_hotel_code", getElements("add_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_hotel_name", getElements("add_i_hotel_name")}, // element path
                "hotel_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_opaque_type", getElements("add_sl_opaque_type")},
                "Opaque", "opaque", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_opaque(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"opaque_e_result", getElements("opaque_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"opaque_b_qbe", getElements("opaque_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_incoming_office", getElements("qbe_i_incoming_office")},
                "incoming", getData("incoming"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_market", getElements("qbe_i_market")},
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country", getElements("qbe_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_chain", getElements("qbe_i_chain")},
                "chain", getData("chain"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_code", getElements("qbe_i_hotel_code")},
                "hotel_code", getData("hotel_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_name", getElements("qbe_i_hotel_name")},
                "hotel_name", getData("hotel_name"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_opaque_type", getElements("qbe_sl_opaque_type")},
                getData("opaque"), "opaque", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //any query input
                new String[]{"opaque_e_result", getElements("opaque_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_opaque(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"opaque_b_actions", getElements("opaque_b_actions")}, //actions button
                new String[]{"opaque_b_actions_b_audit_data", getElements("opaque_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"opaque_b_detach", getElements("opaque_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_opaque(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"opaque_b_delete", getElements("opaque_b_delete")},
                new String[]{"opaque_e_records", getElements("opaque_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
