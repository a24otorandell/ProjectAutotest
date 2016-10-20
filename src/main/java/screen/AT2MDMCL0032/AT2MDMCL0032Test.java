package screen.AT2MDMCL0032;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by aibanez on 20/10/2016.
 */
public class AT2MDMCL0032Test {
    protected AT2MDMCL0032Locators locators;
    protected AT2MDMCL0032Data data;
    double randomNumber = (double) (new Random().nextInt(1001)) / 100;
    public AT2MDMCL0032Test() {
    }
    public AT2MDMCL0032Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0032Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0032Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0032Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen(" Pricing 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!first_search(driver)) return false;
        if (!interaction_record_prising(driver)) return false;
        if (!search_prising(driver)) return false;
        if (!interaction_edit_prising(driver)) return false;
        if (!qbe_prising(driver)) return false;
        if (!others_actions_prising(driver)) return false;
        if (!delete_prising(driver)) return false;
        return false;
    }

    private boolean first_search(TestDriver driver) {
        driver.getReport().addHeader("FIRST SEARCH RECORD", 3, false);
        String where = " SEARCH FIRST";
        if (!Functions.createLov(driver,
                new String[]{"search_lov_partner", getElements("search_lov_partner")}, // b_lov
                new String[]{"search_i_partner", getElements("search_i_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "partner1", //Data name
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean interaction_record_prising(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"pricing_b_add", getElements("pricing_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_group", getElements("add_lov_group")}, // b_lov
                new String[]{"add_i_group", getElements("add_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_type", getElements("add_lov_type")}, // b_lov
                new String[]{"add_i_type", getElements("add_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_apli_date", getElements("add_i_apli_date")},
                "apli", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from", getElements("add_i_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_to", getElements("add_i_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_partner", getElements("add_i_partner")},
                "partner", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency", getElements("add_i_agency")},
                "agency", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_rappel", getElements("add_i_rappel")},
                "rappel", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agent", getElements("add_i_agent")},
                "agent", DataGenerator.randomFloat(1,2), where)) {
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
    private boolean search_prising(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_partner", getElements("search_lov_partner")}, //LoV button
                new String[]{"search_i_partner", getElements("search_i_partner")}, //external LoV input
                new String[]{"search_lov_partner_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("partner1"), // value to search
                "partner1", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_group", getElements("search_lov_group")}, //LoV button
                new String[]{"search_i_group", getElements("search_i_group")}, //external LoV input
                new String[]{"search_lov_group_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("group"), // value to search
                "group", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_type", getElements("search_lov_type")}, //LoV button
                new String[]{"search_i_type", getElements("search_i_type")}, //external LoV input
                new String[]{"search_lov_type_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("type"), // value to search
                "type", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_aply", getElements("search_i_aply")},
                "apli", getData("apli"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_from", getElements("search_i_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_to", getElements("search_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_partner_p", getElements("search_i_partner_p")},
                "partner", getData("partner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_agency", getElements("search_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_rappel", getElements("search_i_rappel")},
                "rappel", getData("rappel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_agent", getElements("search_i_agent")},
                "agent", getData("agent"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 600);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"pricing_e_result", getElements("pricing_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_prising(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"pricing_b_edit", getElements("pricing_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_group", getElements("add_lov_group")}, // b_lov
                new String[]{"add_i_group", getElements("add_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_type", getElements("add_lov_type")}, // b_lov
                new String[]{"add_i_type", getElements("add_i_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_apli_date", getElements("add_i_apli_date")},
                "apli", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from", getElements("add_i_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_to", getElements("add_i_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_partner", getElements("add_i_partner")},
                "partner", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency", getElements("add_i_agency")},
                "agency", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_rappel", getElements("add_i_rappel")},
                "rappel", DataGenerator.randomFloat(1,2), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agent", getElements("add_i_agent")},
                "agent", DataGenerator.randomFloat(1,2), where)) {
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
    private boolean qbe_prising(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        /*if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"pricing_e_result", getElements("pricing_e_result")}, //result element
                where)) {
            return false;
        }*/
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"pricing_b_qbe", getElements("pricing_b_qbe")},// query button
                new String[]{"qbe_i_group", getElements("qbe_i_group")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group", getElements("qbe_i_group")},
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_prod", getElements("qbe_i_prod")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_apli", getElements("qbe_i_apli")},
                "apli", getData("apli"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from", getElements("qbe_i_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_partner", getElements("qbe_i_partner")},
                "partner", getData("partner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rappel", getElements("qbe_i_rappel")},
                "rappel", getData("rappel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agent", getElements("qbe_i_agent")},
                "agent", getData("agent"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_group", getElements("qbe_i_group")}, //search button
                new String[]{"pricing_e_result", getElements("pricing_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prising(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"pricing_b_actions", getElements("pricing_b_actions")}, //actions button
                new String[]{"pricing_b_actions_b_audit_data", getElements("pricing_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"pricing_b_detach", getElements("pricing_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prising(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        first_search(driver);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"pricing_b_delete", getElements("pricing_b_delete")},
                new String[]{"pricing_e_records", getElements("pricing_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}