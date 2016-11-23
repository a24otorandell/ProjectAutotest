package screen.AT2MDMCL0012;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 22/11/2016.
 */
public class AT2MDMCL0012Sis {
    protected AT2MDMCL0012Locators locators;
    protected AT2MDMCL0012Data data;
    public AT2MDMCL0012Sis() {
    }
    public AT2MDMCL0012Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0012Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0012Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0012Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Platforms");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_t1(driver)) return false;
        if (!search_t1(driver)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!interaction_add_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!delete_t2(driver)) return false;
        if (!delete_t1(driver)) return false;
        return true;
    }

    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"platform_b_add", getElements("platform_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_platform", getElements("add_i_platform")},
                "platform", String.valueOf(DataGenerator.random(1,2050)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_email"),"mail",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_push"),"push",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_voucher"),"voucher",true,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_platform", getElements("search_i_platform")},
                "platform", getData("platform"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_email"),"mail",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_push"),"push",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_voucher"),"voucher",true,true, where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"platform_e_result", getElements("platform_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"platform_b_edit", getElements("platform_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_platform", getElements("add_i_platform")},
                "platform", String.valueOf(DataGenerator.random(1,2050)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_email"),"mail",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_push"),"push",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_voucher"),"voucher",false,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"platform_e_result", getElements("platform_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"platform_b_qbe", getElements("platform_b_qbe")},// query button
                new String[]{"qbe_i_platform", getElements("qbe_i_platform")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_platform", getElements("qbe_i_platform")},
                "platform", getData("platform"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "desc", getData("desc"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_email",getElements("qbe_sl_email")},
                getData("mail"), "mail", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_push",getElements("qbe_sl_push")},
                getData("push"), "push", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_voucher",getElements("qbe_sl_voucher")},
                getData("voucher"), "voucher", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_platform", getElements("qbe_i_platform")}, //any query input
                new String[]{"platform_e_result", getElements("platform_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"platform_b_actions", getElements("platform_b_actions")}, //actions button
                new String[]{"platform_b_actions_audit_data", getElements("platform_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"platform_b_detach", getElements("platform_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"platform_b_delete", getElements("platform_b_delete")},
                new String[]{"platform_b_ok_delete", getElements("platform_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }

    public boolean interaction_add_t2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 2";
        if (!Functions.checkClick(driver,
                new String[]{"free_b_add", getElements("free_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_app_date_start", getElements("add_i_app_date_start")},
                "app_start", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,5), 0), where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"add_i_app_date_end", getElements("add_i_app_date_end")},
                "app_end", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(2,5), 0), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to_code",getElements("add_lov_to_code")}, // b_lov
                new String[]{"add_i_to_code", getElements("add_i_to_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_e_to_code_name", getElements("add_e_to_code_name")}, // element path
                "to_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_country",getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_country_info", getElements("add_i_country_info")}, // element path
                "c_name", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_date_from", getElements("add_i_date_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,5), 0), where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"add_i_date_to", getElements("add_i_date_to")},
                "d_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(2,5), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_amount", getElements("add_i_amount")},
                "amount", String.valueOf(DataGenerator.random(1,800)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_currency",getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_currency_info", getElements("add_i_currency_info")}, // element path
                "currency_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_imp", getElements("add_i_imp")},
                "imp", "", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_canceled",getElements("add_sl_canceled")},
                "Yes", "cancel", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_tax"),"tax",true,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"free_b_edit", getElements("free_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_app_date_start", getElements("add_i_app_date_start")},
                "app_start", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,5), 0), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_app_date_end", getElements("add_i_app_date_end")},
                "app_end", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(2,9), 0), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to_code",getElements("add_lov_to_code")}, // b_lov
                new String[]{"add_i_to_code", getElements("add_i_to_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        Functions.break_time(driver,3 ,500);
        if(!Functions.getText(driver,new String[]{"add_e_to_code_name", getElements("add_e_to_code_name")}, // element path
                "to_name", // key for data value (the name)
                where)){return false;}
        Functions.break_time(driver,3 ,500);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_country",getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        Functions.break_time(driver,3 ,500);
        if(!Functions.getText(driver,new String[]{"add_i_country_info", getElements("add_i_country_info")}, // element path
                "c_name", // key for data value (the name)
                where)){return false;}
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_date_from", getElements("add_i_date_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,5), 0), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_date_to", getElements("add_i_date_to")},
                "d_to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(4,9), 0), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_amount", getElements("add_i_amount")},
                "amount", "", where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_currency", getElements("add_i_currency")},
                "currency", "", where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if(!Functions.getText(driver,new String[]{"add_i_currency_info", getElements("add_i_currency_info")}, // element path
                "currency_desc", // key for data value (the name)
                where)){return false;}
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"add_i_imp", getElements("add_i_imp")},
                "imp", String.valueOf(DataGenerator.random(1,800)), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_canceled",getElements("add_sl_canceled")},
                "No", "cancel", where)){return false;}
        Functions.break_time(driver,3 ,500);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_tax"),"tax",false,true, where)){return false;};
        Functions.break_time(driver,3 ,500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        Functions.zoomOut(driver);
        if (!Functions.clickQbE(driver,
                new String[]{"free_b_qbe", getElements("free_b_qbe")},// query button
                new String[]{"qbe_i_app_date_start", getElements("qbe_i_app_date_start")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_app_date_start", getElements("qbe_i_app_date_start")},
                "app_start", getData("app_start"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_app_date_end", getElements("qbe_i_app_date_end")},
                "app_end", getData("app_end"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_code", getElements("qbe_i_to_code")},
                "to", getData("to"), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_name", getElements("qbe_i_to_name")},
                "to_name", getData("to_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_name", getElements("qbe_i_country_name")},
                "c_name", getData("c_name"), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_from", getElements("qbe_i_date_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_to", getElements("qbe_i_date_to")},
                "d_to", getData("d_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount", getElements("qbe_i_amount")},
                "amount",  getData("amount"), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency_des", getElements("qbe_i_currency_des")},
                "currency_desc", getData("currency_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_imp", getElements("qbe_i_imp")},
                "imp", getData("imp"), where)) {
            return false;
        }
        Functions.break_time(driver,3 ,500);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_canceled",getElements("qbe_sl_canceled")},
                getData("cancel"), "cancel", where)){return false;}
        Functions.break_time(driver,3 ,500);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_tax",getElements("qbe_sl_tax")},
                getData("tax"), "tax", where)){return false;}
        Functions.break_time(driver,3 ,500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_app_date_start", getElements("qbe_i_app_date_start")}, //any query input
                new String[]{"free_e_result", getElements("free_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 2";
        if (!Functions.auditData(driver,
                new String[]{"free_b_actions", getElements("free_b_actions")}, //actions button
                new String[]{"free_b_actions_audit_data", getElements("free_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"free_b_detach", getElements("free_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"free_b_delete", getElements("free_b_delete")},
                new String[]{"free_e_records", getElements("free_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
