package screen.AT2MDMSY1004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY1004Sis {
    protected AT2MDMSY1004Locators locators;
    protected AT2MDMSY1004Data data;
    public AT2MDMSY1004Sis() {
    }
    public AT2MDMSY1004Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY1004Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY1004Data getData() {
        return data;
    }
    public void setData(AT2MDMSY1004Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("GVCC Configuration Maintenance");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add(driver)) return false;
        if (!getData_1(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_b_add", getElements("configuration_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_currency",getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_from_date",getElements("add_i_from_date")},
                "from", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_to_date",getElements("add_i_to_date")},
                "to",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,15), 0), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_payment",getElements("add_lov_payment")}, // b_lov
                new String[]{"add_i_payment", getElements("add_i_payment")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "payment", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_vcc",getElements("add_lov_vcc")}, // b_lov
                new String[]{"add_i_vcc", getElements("add_i_vcc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "vcc", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_vcc2",getElements("add_lov_vcc2")}, // b_lov
                new String[]{"add_i_vc2c", getElements("add_i_vcc2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "vcc2", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_percentage",getElements("add_i_percentage")},
                "perce", DataGenerator.randomFloat(1,20), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_max",getElements("add_i_max")},
                "max", DataGenerator.randomFloat(1,20), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    public boolean getData_1 (TestDriver driver) {
        String[] columns = {"config"};
        if (!Functions.collectTableData(driver,columns,"//*[contains(@id, 'pc1:ReTVcCo::db')]",1,"get Data"))return false;
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_config",getElements("search_i_config")},
                "config", getData("config"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_currency", getElements("search_lov_currency")}, //LoV button
                new String[]{"search_i_currency", getElements("search_i_currency")}, //external LoV input
                new String[]{"search_lov_currency_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("currency"), // value to search
                "currency", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"configuration_e_result", getElements("configuration_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"configuration_b_edit", getElements("configuration_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_to_date",getElements("add_i_to_date")},
                "to",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,15), 0), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"configuration_e_result", getElements("configuration_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"configuration_b_qbe", getElements("configuration_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_config",getElements("qbe_i_config")},
                "config", getData("config"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company",getElements("qbe_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency",getElements("qbe_i_currency")},
                "currency", getData("currency"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from_date",getElements("qbe_i_from_date")},
                "from", getData("from"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_date",getElements("qbe_i_to_date")},
                "to", getData("to"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_payment",getElements("qbe_i_payment")},
                "payment", getData("payment"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_vcc",getElements("qbe_i_vcc")},
                "vcc", getData("vcc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_vcc2",getElements("qbe_i_vcc2")},
                "vcc2", getData("vcc2"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_percentage",getElements("qbe_i_percentage")},
                "perce", getData("perce"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_max",getElements("qbe_i_max")},
                "max", getData("max"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //any query input
                new String[]{"configuration_e_result", getElements("configuration_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"configuration_b_actions", getElements("configuration_b_actions")}, //actions button
                new String[]{"configuration_b_actions_b_audit_data", getElements("configuration_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"configuration_b_detach", getElements("configuration_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
