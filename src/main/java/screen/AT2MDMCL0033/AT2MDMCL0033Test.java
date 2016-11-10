package screen.AT2MDMCL0033;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMCL0033Test {
    protected AT2MDMCL0033Locators locators;
    protected AT2MDMCL0033Data data;
    public AT2MDMCL0033Test() {
    }
    public AT2MDMCL0033Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0033Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0033Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0033Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen("Agency commision 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_agency(driver)) return false;
        if (!search_agency(driver)) return false;
        if (!qbe_agency(driver)) return false;
        if (!others_actions_agency(driver)) return false;
        return false;
    }
    private boolean interaction_record_agency(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"agency_b_add", getElements("agency_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, // b_lov
                new String[]{"add_i_to", getElements("add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
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
        if (!Functions.insertInput(driver, new String[]{"add_i_finish_date", getElements("add_i_finish_date")},
                "finish", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_product", getElements("add_lov_product")}, // b_lov
                new String[]{"add_i_product", getElements("add_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "product", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_application_date", getElements("add_i_application_date")},
                "apli", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from", getElements("add_i_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_f_to", getElements("add_i_f_to")},
                "f_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
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
    private boolean search_agency(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_to", getElements("search_lov_to")}, //LoV button
                new String[]{"search_i_to", getElements("search_i_to")}, //external LoV input
                new String[]{"search_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("to"), // value to search
                "to", //name of the data
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
        if (!Functions.insertInput(driver, new String[]{"search_i_finish_date", getElements("search_i_finish_date")},
                "finish", getData("finish"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_product", getElements("search_lov_product")}, //LoV button
                new String[]{"search_i_product", getElements("search_i_product")}, //external LoV input
                new String[]{"search_lov_product_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("product"), // value to search
                "product", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_application_date", getElements("search_i_application_date")},
                "apli", getData("apli"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_from", getElements("search_i_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_f_to", getElements("search_i_f_to")},
                "f_to", getData("f_to"), where)) {
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
                new String[]{"agency_e_result", getElements("agency_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_agency(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"agency_e_result", getElements("agency_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"agency_b_qbe", getElements("agency_b_qbe")},// query button
                new String[]{"qbe_i_to", getElements("qbe_i_to")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group", getElements("qbe_i_group")},
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_product", getElements("qbe_i_product")},
                "product", getData("product"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application_date", getElements("qbe_i_application_date")},
                "apli", getData("apli"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_finish_date", getElements("qbe_i_finish_date")},
                "finish", getData("finish"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from", getElements("qbe_i_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_f_to", getElements("qbe_i_f_to")},
                "f_to", getData("f_to"), where)) {
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
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_group", getElements("qbe_i_group")}, //any query input
                new String[]{"agency_e_result", getElements("agency_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_agency(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"agency_b_actions", getElements("agency_b_actions")}, //actions button
                new String[]{"agency_b_actions_b_audit_data", getElements("agency_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"agency_b_detach", getElements("agency_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
