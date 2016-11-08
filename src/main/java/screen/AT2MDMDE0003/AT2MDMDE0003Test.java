package screen.AT2MDMDE0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 04/11/2016.
 */
public class AT2MDMDE0003Test {
    protected AT2MDMDE0003Locators locators;
    protected AT2MDMDE0003Data data;
    public AT2MDMDE0003Test() {
    }
    public AT2MDMDE0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0003Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Countries");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_country(driver)) return false;
        if (!search_country(driver)) return false;
        if (!interaction_edit_country(driver)) return false;
        if (!qbe_country(driver)) return false;
        if (!others_actions_country(driver)) return false;
        if (!interaction_add_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!interaction_edit_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!others_actions_multi(driver)) return false;
        if (!delete_multi(driver)) return false;
        if (!delete_country(driver)) return false;
        return true;
    }

    /**
     * METHODS OF TABBLE PRODUCTS
     * @param driver
     * @return
     */
    public boolean interaction_add_country (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"country_b_add", getElements("country_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_country_code",getElements("add_i_country_code")},
                "c_code", "ZX", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_continent",getElements("add_sl_continent")},
                "AFR", "continent", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_cod_iso",getElements("add_i_cod_iso")},
                "iso", DataGenerator.getRandomAlphanumericSequence(2,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_crc",getElements("add_sl_crc")},
                "Africa", "crc", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prefix",getElements("add_i_prefix")},
                "prefix", "005", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_country(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_country_code",getElements("search_i_country_code")},
                "c_code", getData("c_code"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_continent",getElements("search_i_continent")},
                "continent", getData("continent"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_crc",getElements("search_sl_crc")},
                getData("crc"), "crc", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_cod_iso",getElements("search_i_cod_iso")},
                "iso", getData("iso"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"country_e_result", getElements("country_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_country(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"country_b_edit", getElements("country_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_continent",getElements("add_sl_continent")},
                "AME", "continent", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_cod_iso",getElements("add_i_cod_iso")},
                "iso", DataGenerator.getRandomAlphanumericSequence(2,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_crc",getElements("add_sl_crc")},
                "Cancun", "crc", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prefix",getElements("add_i_prefix")},
                "prefix", "050", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_country(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"country_e_result", getElements("country_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"country_b_qbe", getElements("country_b_qbe")},// query button
                new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")},
                "c_code", getData("c_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_continent", getElements("qbe_i_continent")},
                "continent", getData("continent"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_crc_desc",getElements("qbe_sl_crc_desc")},
                getData("crc"), "crc", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cod_iso", getElements("qbe_i_cod_iso")},
                "iso", getData("iso"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_prefix", getElements("qbe_i_prefix")},
                "prefix", getData("prefix"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")}, //any query input
                new String[]{"country_e_result", getElements("country_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_country(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
/*        if (!Functions.auditData(driver,
                new String[]{"product_b_actions", getElements("product_b_actions")}, //actions button
                new String[]{"product_b_actions_b_audit_data", getElements("product_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"country_b_detach", getElements("country_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_country(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"country_b_delete", getElements("country_b_delete")}, //button delete
                new String[]{"country_e_records", getElements("country_e_records")}, // result
                new String[]{"country_b_delete_yes", getElements("country_b_delete_yes")}, //delete button yes
                where)){return false;}
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
        if (!Functions.insertInput(driver, new String[]{"add_i_language",getElements("add_i_language")},
                "lang", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"multi_add_i_country",getElements("multi_add_i_country")},
                "coun", "SPAIN", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"multi_add_i_country_code",getElements("multi_add_i_country_code")},
                "c_code", getData("c_code"), where)){return false;}
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
        if (!Functions.insertInput(driver, new String[]{"add_i_language",getElements("add_i_language")},
                "lang", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"multi_add_i_country",getElements("multi_add_i_country")},
                "coun", getData("coun"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"multi_add_i_country_code",getElements("multi_add_i_country_code")},
                "c_code", getData("c_code"), where)){return false;}
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
                new String[]{"multi_qbe_i_language", getElements("multi_qbe_i_language")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"multi_qbe_i_language", getElements("multi_qbe_i_language")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_qbe_i_country", getElements("multi_qbe_i_country")},
                "coun", getData("coun"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_qbe_i_country_code", getElements("multi_qbe_i_country_code")},
                "c_code", getData("c_code"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"multi_qbe_i_language", getElements("multi_qbe_i_language")}, //any query input
                new String[]{"multi_e_result", getElements("multi_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_multi(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
/*        if (!Functions.auditData(driver,
                new String[]{"multi_b_actions", getElements("multi_b_actions")}, //actions button
                new String[]{"multi_b_actions_b_audit_data", getElements("multi_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
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
