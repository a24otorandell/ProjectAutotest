package screen.AT2MDMRM0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0005Sis {
    protected AT2MDMRM0005Locators locators;
    protected AT2MDMRM0005Data data;
    public AT2MDMRM0005Sis() {
    }
    public AT2MDMRM0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0005Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0005Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Products 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_products(driver)) return false;
        if (!search_products(driver)) return false;
        if (!interaction_edit_products(driver)) return false;
        if (!qbe_products(driver)) return false;
        if (!others_actions_products(driver)) return false;
        if (!interaction_add_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!interaction_edit_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!others_actions_multi(driver)) return false;
        if (!delete_multi(driver)) return false;
        if (!delete_products(driver)) return false;
        return true;
    }

    /**
     * METHODS OF TABBLE PRODUCTS
     * @param driver
     * @return
     */
    public boolean interaction_add_products (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"product_b_add", getElements("product_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code",getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(2,true), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_system",getElements("add_sl_system")},
                "Excursion", "system", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_product",getElements("add_lov_product")}, // b_lov
                new String[]{"add_i_product", getElements("add_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prod", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_account"),"account",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_products(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_system",getElements("search_sl_system")},
                getData("system"), "system", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_product", getElements("search_lov_product")}, //LoV button
                new String[]{"search_i_product", getElements("search_i_product")}, //external LoV input
                new String[]{"search_lov_product_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("prod"), // value to search
                "prod", //name of the data
                where)){return false;}

        if (!Functions.checkboxValue(driver,
                getElements("search_ck_account"),"account",true,true,where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"product_e_result", getElements("product_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_products(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"product_b_edit", getElements("product_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code",getElements("add_i_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(2,true), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_system",getElements("add_sl_system")},
                "Booking", "system", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_product",getElements("add_lov_product")}, // b_lov
                new String[]{"add_i_product", getElements("add_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prod", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_account"),"account",false,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_products(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"product_e_result", getElements("product_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"product_b_qbe", getElements("product_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_system",getElements("qbe_sl_system")},
                getData("system"), "system", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_product", getElements("qbe_i_product")},
                "prod", getData("prod"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_account",getElements("qbe_sl_account")},
                getData("account"), "account", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //search button
                new String[]{"product_e_result", getElements("product_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_products(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"product_b_actions", getElements("product_b_actions")}, //actions button
                new String[]{"product_b_actions_b_audit_data", getElements("product_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"product_b_detach", getElements("product_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_products(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"product_b_delete", getElements("product_b_delete")},
                new String[]{"product_e_records", getElements("product_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TABLE MULTI
     * @param driver
     * @return
     */
    public boolean interaction_add_multi (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_add", getElements("multi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_desc", getElements("add_i_desc")},
                "desc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prod",getElements("add_i_prod")},
                "product", DataGenerator.getRandomAlphanumericSequence(12,true), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_multi(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_edit", getElements("multi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.getText(driver, new String[]{"add_i_desc", getElements("add_i_desc")},
                "desc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prod",getElements("add_i_prod")},
                "product", DataGenerator.getRandomAlphanumericSequence(12,true), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_multi(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
/*        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"product_e_result", getElements("product_e_result")}, //result element
                where)) {
            return false;
        }*/
        if (!Functions.clickQbE(driver,
                new String[]{"multi_b_qbe", getElements("multi_b_qbe")},// query button
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_prod", getElements("qbe_i_prod")},
                "product", getData("product"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")}, //search button
                new String[]{"multi_e_result", getElements("multi_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_multi(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"multi_b_actions", getElements("multi_b_actions")}, //actions button
                new String[]{"multi_b_actions_b_audit_data", getElements("multi_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"multi_b_detach", getElements("multi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_multi(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"multi_b_delete", getElements("multi_b_delete")},
                new String[]{"multi_e_records", getElements("multi_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
