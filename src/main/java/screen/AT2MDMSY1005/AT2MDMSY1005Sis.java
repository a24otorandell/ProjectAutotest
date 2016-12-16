package screen.AT2MDMSY1005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 23/11/2016.
 */

/**
 * Hay select list que tienen más datos en la qbe que en la busqueda y viceversa
 */
public class AT2MDMSY1005Sis {
    protected AT2MDMSY1005Locators locators;
    protected AT2MDMSY1005Data data;
    public AT2MDMSY1005Sis() {
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
        driver.getTestdetails().setScreen("Consulta de Mapper File");
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
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!first_search_t2(driver)) return false;
        if (!getData_t2(driver)) return false;
        if (!search_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!others_actions_t3(driver)) return false;
        return true;
    }

    /**
     * TAB TRANSACTIONS MAPPER FILE - TABLE TRANSACTION
     */
    private boolean first_search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on FIRST SEARCH 1";
        Functions.zoomOut(driver);
        Functions.zoomOut(driver);
        Functions.zoomOut(driver);
        Functions.break_time(driver, 4, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "from", "23/11/2016 23:30:00",where)){return false;}
        Functions.break_time(driver, 4, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "to", "23/11/2016 23:31:00",where)){return false;}
        Functions.break_time(driver, 3, 600);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search1", getElements("search_b_search1")}, //search button
                new String[]{"transaction_e_result", getElements("transaction_e_result")}, //result element
                200, 600,
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 600);
        return true;
    }
    private boolean getData_t1 (TestDriver driver) {
        //Functions.zoomOut(driver);
        String[] columns = {"trans", "ref", "type", "desc_type", "company", "currency", "supplier", "cost", "buffer", "amount", "payment", "activa", "expira", "operator", "client", "request", "reference", "id", "status", "code", "origin", "file", "load", "t_amount", "t_currency", "b_amount", "b_currency", "from", "merchant", "b_card", "b_date", "ref1", "ref2", "ref3", "sap", "error", "desc_error", "c_user", "c_date", "m_user", "m_date"};
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:t1::db')]",
                25, // row to give values
                "GET DATA 1");
        return true;


    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "from", getData("from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "to", getData("to"),where)){return false;}
        if (!getData("operator").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_operator", getElements("search_sl_operator")},
                    getData("operator"), "operator", where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_reference",getElements("search_i_reference")},
                "ref", getData("ref"),where)){return false;}
        if (!getData("origin").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_origin", getElements("search_sl_origin")},
                    getData("origin"), "origin", where)) {
                return false;
            }
        }
        if (!getData("company").equalsIgnoreCase(" ")) {
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                    new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                    new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("company"), // value to search
                    "company", //name of the data
                    where)) {
                return false;
            }
        }
        if (!getData("supplier").equalsIgnoreCase(" ")) {
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                    new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                    new String[]{"search_lov_supplier_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("supplier"), // value to search
                    "supplier", //name of the data
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_ref_tmp",getElements("search_i_ref_tmp")},
                "reference", getData("reference"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_file",getElements("search_i_file")},
                "file", getData("file"),where)){return false;}
        if (getData("sap").equalsIgnoreCase("S")) {
            if (!Functions.checkboxValue(driver,
                    getElements("search_ck_sap"), "sap", true, true, where)) {
                return false;
            }
        }
        else {
            if (!Functions.checkboxValue(driver,
                    getElements("search_ck_sap"), "sap", false, true, where)) {
                return false;
            }
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("desc_type"), "type2", where)){return false;}
        if (!getData("status").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_staus", getElements("search_sl_staus")},
                    getData("status"), "status", where)) {
                return false;
            }
        }
        if (!getData("client").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_client", getElements("search_sl_client")},
                    getData("client"), "client", where)) {
                return false;
            }
        }
        if (!getData("currency").equalsIgnoreCase(" ")) {
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_currency", getElements("search_lov_currency")}, //LoV button
                    new String[]{"search_i_currency", getElements("search_i_currency")}, //external LoV input
                    new String[]{"search_lov_currency_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("currency"), // value to search
                    "currency", //name of the data
                    where)) {
                return false;
            }
        }
        if (!getData("t_currency").equalsIgnoreCase(" ")) {
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_trans", getElements("search_lov_trans")}, //LoV button
                    new String[]{"search_i_trans", getElements("search_i_trans")}, //external LoV input
                    new String[]{"search_lov_trans_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("t_currency"), // value to search
                    "t_currency", //name of the data
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_id",getElements("search_i_id")},
                "id", getData("id"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_load",getElements("search_i_load")},
                "load", getData("load"),where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search1", getElements("search_b_search1")}, //search button
                new String[]{"transaction_e_result_1", getElements("transaction_e_result_1")}, //result element
                200,600,
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset1", getElements("search_b_reset1")}, //search button
                new String[]{"transaction_e_result_1", getElements("transaction_e_result_1")}, //result element
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "from", getData("from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "to", getData("to"),where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"transaction_b_qbe", getElements("transaction_b_qbe")},// query button
                new String[]{"qbe_i_transaction", getElements("qbe_i_transaction")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_transaction",getElements("qbe_i_transaction")},
                "trans", getData("trans"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_reference",getElements("qbe_i_reference")},
                "ref", getData("ref"),where)){return false;}
        if (!getData("type").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"qbe_sl_type", getElements("qbe_sl_type")},
                    getData("type"), "type", where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type_desc",getElements("qbe_i_type_desc")},
                "desc_type", getData("desc_type"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company",getElements("qbe_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency",getElements("qbe_i_currency")},
                "currency", getData("currency"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier",getElements("qbe_i_supplier")},
                "supplier", getData("supplier"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cost",getElements("qbe_i_cost")},
                "cost", getData("cost"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_buffer",getElements("qbe_i_buffer")},
                "buffer", getData("buffer"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount",getElements("qbe_i_amount")},
                "amount", getData("amount"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_payment",getElements("qbe_i_payment")},
                "payment", getData("payment"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_act",getElements("qbe_i_act")},
                "activa", getData("activa"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_exp",getElements("qbe_i_exp")},
                "expira", getData("expira"),where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_operator",getElements("qbe_sl_operator")},
                getData("operator"), "operator", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_client",getElements("qbe_sl_client")},
                getData("client"), "client", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_req",getElements("qbe_i_req")},
                "request", getData("request"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ref_tmp",getElements("qbe_i_ref_tmp")},
                "reference", getData("reference"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_id",getElements("qbe_i_id")},
                "id", getData("id"),where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!getData("status").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"qbe_sl_status", getElements("qbe_sl_status")},
                    getData("status"), "status", where)) {
                return false;
            }
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code",getElements("qbe_i_code")},
                "code", getData("code"),where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_origin",getElements("qbe_sl_origin")},
                getData("origin"), "origin", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_file",getElements("qbe_i_file")},
                "file", getData("file"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_load",getElements("qbe_i_load")},
                "load", getData("load"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_t_amount",getElements("qbe_i_t_amount")},
                "t_amount", getData("t_amount"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_t_currency",getElements("qbe_i_t_currency")},
                "t_currency", getData("t_currency"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b_amount",getElements("qbe_i_b_amount")},
                "b_amount", getData("b_amount"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b_currency",getElements("qbe_i_b_currency")},
                "b_currency", getData("b_currency"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date",getElements("qbe_i_date")},
                "from", getData("from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_merchant",getElements("qbe_i_merchant")},
                "merchant", getData("merchant"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_balance",getElements("qbe_i_balance")},
                "b_card", getData("b_card"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b_date",getElements("qbe_i_b_date")},
                "b_date", getData("b_date"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ref1",getElements("qbe_i_ref1")},
                "ref1", getData("ref1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ref2",getElements("qbe_i_ref2")},
                "ref2", getData("ref2"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ref3",getElements("qbe_i_ref3")},
                "ref3", getData("ref3"), where)){return false;}
        if (getData("sap").equalsIgnoreCase("S")) {
            if (!Functions.selectText(driver,
                    new String[]{"qbe_sl_status", getElements("qbe_sl_status")},
                    "Yes", "sap", where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_error",getElements("qbe_i_error")},
                "error", getData("error"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc_error",getElements("qbe_i_desc_error")},
                "desc_error", getData("desc_error"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "c_user", getData("c_user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_c_date",getElements("qbe_i_c_date")},
                "c_date", getData("c_date"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_m_user",getElements("qbe_i_m_user")},
                "m_user", getData("m_user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_m_date",getElements("qbe_i_m_date")},
                "m_date", getData("m_date"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_desc_error", getElements("qbe_i_desc_error")}, //any query input
                new String[]{"transaction_e_result_1", getElements("transaction_e_result_1")}, //table result
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

    /**
     * TAB LOAD MAPPER FILE - TABLE LOAD
     */
    private boolean first_search_t2(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on FIRST SEARCH 2";
        Functions.break_time(driver, 3, 400);
        if (!Functions.simpleClick(driver,
                new String[]{"load_tab", getElements("load_tab")}, //element to click
                where)){return false;}
        Functions.break_time(driver, 4, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date",getElements("search_i_from_date")},
                "start1", "21/11/2016",where)){return false;}
        Functions.break_time(driver, 4, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date",getElements("search_i_to_date")},
                "end1", "22/11/2016",where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search2", getElements("search_b_search2")}, //search button
                new String[]{"load_e_result_1", getElements("load_e_result_1")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean getData_t2 (TestDriver driver) {
        String[] columns = {"load2", "conf", "operator2", "start", "end", "file2", "total", "correct", "incorrect", "error2", "desc_error2"};
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:t1::db')]",
                4, // row to give values
                "GET DATA 2");
        return true;
    }
    private boolean search_t2(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 2";
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date1",getElements("search_i_from_date1")},
                "start1", getData("start1"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date1",getElements("search_i_to_date1")},
                "end1", getData("end1"),where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_operator2",getElements("search_sl_operator2")},
                getData("operator2"), "operator2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_file2",getElements("search_i_file2")},
                "file2", getData("file2"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_load2",getElements("search_i_load2")},
                "load2", getData("load2"),where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search2", getElements("search_b_search2")}, //search button
                new String[]{"load_e_result", getElements("load_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset2", getElements("search_b_reset2")}, //search button
                new String[]{"load_e_result", getElements("load_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date1",getElements("search_i_from_date1")},
                "start1", getData("start1"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date1",getElements("search_i_to_date1")},
                "end1", getData("end1"),where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"load_b_qbe", getElements("load_b_qbe")},// query button
                new String[]{"qbe_i_load2", getElements("qbe_i_load2")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_load2",getElements("qbe_i_load2")},
                "load2", getData("load2"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_conf2",getElements("qbe_i_conf2")},
                "conf", getData("conf"),where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_operator2",getElements("qbe_sl_operator2")},
                getData("operator2"), "operator2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_start",getElements("qbe_i_start")},
                "start", getData("start"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_end",getElements("qbe_i_end")},
                "end", getData("end"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_file2",getElements("qbe_i_file2")},
                "file2", getData("file2"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_total",getElements("qbe_i_total")},
                "total", getData("total"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_correct",getElements("qbe_i_correct")},
                "correct", getData("correct"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_incorrect",getElements("qbe_i_incorrect")},
                "incorrect", getData("incorrect"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_error2",getElements("qbe_i_error2")},
                "error2", getData("error2"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc_error2",getElements("qbe_i_desc_error2")},
                "desc_error2", getData("desc_error2"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_load2", getElements("qbe_i_load2")}, //any query input
                new String[]{"load_e_result", getElements("load_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 2";
        if (!Functions.auditData(driver,
                new String[]{"load_b_actions", getElements("load_b_actions")}, //actions button
                new String[]{"load_b_actions_b_audit_data", getElements("load_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"load_b_detach", getElements("load_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TAB LOAD - TABLE ISSUES LOAD
     */
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 3";
        if (!Functions.detachTable(driver,
                new String[]{"issues_b_detach", getElements("issues_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
