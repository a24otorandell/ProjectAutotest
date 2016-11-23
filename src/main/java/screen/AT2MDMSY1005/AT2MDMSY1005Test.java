package screen.AT2MDMSY1005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 23/11/2016.
 */
public class AT2MDMSY1005Test {
    protected AT2MDMSY1005Locators locators;
    protected AT2MDMSY1005Data data;
    public AT2MDMSY1005Test() {
    }
    public AT2MDMSY1005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY1005Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY1005Data getData() {
        return data;
    }
    public void setData(AT2MDMSY1005Data data) {
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
        if (!first_search_t1(driver)) return false;
        if (!getData_t1(driver)) return false;
        if (!search_t1(driver)) return false;
        /*if (!qbe_t1(driver)) return false;*/
        if (!others_actions_t1(driver)) return false;
        if (!first_search_t2(driver)) return false;
        if (!getData_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        return true;
    }

    private boolean first_search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on FIRST SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "from", "23/11/2016 00:00:00",where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "to", "24/11/2016 00:00:00",where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search1", getElements("search_b_search1")}, //search button
                new String[]{"transaction_e_result", getElements("transaction_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean getData_t1 (TestDriver driver) {
        String[] columns = {"trans", "ref", "type", "desc_type", "company", "currency", "supplier", "cost", "buffer", "amount", "payment", "activa", "expira", "operator", "client", "request", "reference", "id", "status", "code", "origin", "file", "load", "t_amount", "t_currency", "b_amount", "b_currency", "from", "merchant", "b_card", "b_date", "ref1", "ref2", "ref3", "sap", "error", "desc_error", "c_user", "c_date", "m_user", "m_date"};
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:t1::db')]",
                1, // row to give values
                "where");
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "from", getData("from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "to", getData("to"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_reference",getElements("search_i_reference")},
                "ref", getData("ref"),where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_origin",getElements("search_sl_origin")},
                getData("origin"), "origin", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                new String[]{"search_lov_supplier_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_ref_tmp",getElements("search_i_ref_tmp")},
                "reference", getData("reference"),where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("desc_type"), "type", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_staus",getElements("search_sl_staus")},
                getData("status"), "status", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_client",getElements("search_sl_client")},
                getData("client"), "client", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_currency", getElements("search_lov_currency")}, //LoV button
                new String[]{"search_i_currency", getElements("search_i_currency")}, //external LoV input
                new String[]{"search_lov_currency_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("currency"), // value to search
                "currency", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_id",getElements("search_i_id")},
                "id", getData("id"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_load",getElements("search_i_load")},
                "load", getData("load"),where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search1", getElements("search_b_search1")}, //search button
                new String[]{"transaction_e_result", getElements("transaction_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
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
        if (!Functions.insertInput(driver, new String[]{"qbe_i_transaction",getElements("qbe_i_transaction")},
                "trans", getData("trans"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_reference",getElements("qbe_i_reference")},
                "ref", getData("ref"),where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type_desc",getElements("qbe_i_type_desc")},
                "type_desc", getData("type_desc"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company",getElements("qbe_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency",getElements("qbe_i_currency")},
                "currency", getData("currency"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier",getElements("qbe_i_supplier")},
                "supplier", getData("supplier"), where)){return false;}



        if (!Functions.insertInput(driver, new String[]{"qbe_i_date",getElements("qbe_i_date")},
                "from", getData("from"),where)){return false;}


        if (!Functions.selectText(driver,
                new String[]{"search_sl_origin",getElements("search_sl_origin")},
                getData("origin"), "origin", where)){return false;}






        if (!Functions.insertInput(driver, new String[]{"qbe_i_payment",getElements("qbe_i_payment")},
                "payment", getData("payment"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_vcc",getElements("qbe_i_vcc")},
                "vcc", getData("vcc"), where)){return false;}

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
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"transaction_b_actions", getElements("transaction_b_actions")}, //actions button
                new String[]{"transaction_b_actions_b_audit_data", getElements("transaction_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"transaction_b_detach", getElements("transaction_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }


    private boolean first_search_t2(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on FIRST SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "from", "20/11/2016 00:00:00",where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "to", "24/11/2016 00:00:00",where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search2", getElements("search_b_search2")}, //search button
                new String[]{"load_e_result", getElements("load_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean getData_t2 (TestDriver driver) {
        String[] columns = {"load2", "conf", "operator", "start", "end", "file2", "total", "correct", "incorrect", "error2", "desc_error2"};
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:t1::db')]",
                1, // row to give values
                "where");
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"load_b_actions", getElements("load_b_actions")}, //actions button
                new String[]{"load_b_actions_b_audit_data", getElements("load_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"load_b_detach", getElements("load_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
