package screen.AT2MDMCL0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0003Sis {
    protected AT2MDMCL0003Locators locators;
    protected AT2MDMCL0003Data data;
    public AT2MDMCL0003Sis() {
    }
    public AT2MDMCL0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0003Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Derivation Rules");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
/*        if (!optionSelect1(driver)) return false;
        if (!optionSelect2(driver)) return false;
        if (!optionSelect3(driver)) return false;
        if (!optionSelect4(driver)) return false;
        if (!optionSelect5(driver)) return false;
        if (!optionSelect6(driver)) return false;
        if (!optionSelect7(driver)) return false;
        if (!optionSelect10(driver)) return false;
        if (!optionSelect13(driver)) return false;
        if (!optionSelect14(driver)) return false;
        if (!optionSelect16(driver)) return false;*/
        return true;
    }

    public boolean optionSelect1 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_Activate_WebPrepayment_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1(driver)) return false;
        if (!search_t1(driver, true)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!search_t1(driver, false)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!rulesChange(driver)) return false;
        if (!getData(driver)) return false;
        if (!qbeChange(driver)) return false;
        if (!others_actions_rule(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!delete_t1(driver)) return false;
        return true;

    }
    public boolean optionSelect2 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_WebUser_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_2(driver)) return false;
        if (!search_t1_2(driver, true)) return false;
        if (!interaction_edit_t1_2(driver)) return false;
        if (!search_t1_2(driver, false)) return false;
        if (!others_actions_t1_2(driver)) return false;
        if (!rulesChange_2(driver)) return false;
        if (!getData_2(driver)) return false;
        if (!qbeChange_2(driver)) return false;
        if (!others_actions_rule_2(driver)) return false;
        if (!interaction_edit_t2_2(driver)) return false;
        if (!others_actions_t2_2(driver)) return false;
        if (!delete_t1_2(driver)) return false;
        return true;

    }
    public boolean optionSelect3 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_WebUser_Cbranch_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_3(driver)) return false;
        if (!search_t1_3(driver, true)) return false;
        if (!interaction_edit_t1_3(driver)) return false;
        if (!search_t1_3(driver, false)) return false;
        if (!others_actions_t1_3(driver)) return false;
        if (!rulesChange_3(driver)) return false;
        if (!getData_3(driver)) return false;
        if (!qbeChange_3(driver)) return false;
        if (!others_actions_rule_3(driver)) return false;
        if (!interaction_edit_t2_3(driver)) return false;
        if (!others_actions_t2_3(driver)) return false;
        if (!delete_t1_3(driver)) return false;
        return true;
    }
    public boolean optionSelect4 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_WebUser_Dbranch_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_4(driver)) return false;
        if (!search_t1_4(driver, true)) return false;
        if (!interaction_edit_t1_4(driver)) return false;
        if (!search_t1_4(driver, false)) return false;
        if (!others_actions_t1_4(driver)) return false;
        if (!rulesChange_4(driver)) return false;
        if (!getData_4(driver)) return false;
        if (!qbeChange_4(driver)) return false;
        if (!others_actions_rule_4(driver)) return false;
        if (!interaction_edit_t2_4(driver)) return false;
        if (!others_actions_t2_4(driver)) return false;
        if (!delete_t1_4(driver)) return false;
        return true;
    }
    public boolean optionSelect5 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_HX2_SAPCode_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_5(driver)) return false;
        if (!search_t1_5(driver, true)) return false;
        if (!interaction_edit_t1_5(driver)) return false;
        if (!search_t1_5(driver, false)) return false;
        if (!others_actions_t1_5(driver)) return false;
        if (!rulesChange_5(driver)) return false;
        if (!getData_5(driver)) return false;
        if (!qbeChange_5(driver)) return false;
        if (!others_actions_rule_5(driver)) return false;
        if (!interaction_edit_t2_5(driver)) return false;
        if (!others_actions_t2_5(driver)) return false;
        if (!delete_t1_5(driver)) return false;
        return true;
    }
    public boolean optionSelect6 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_AdministrativeSupplier_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_6(driver)) return false;
        if (!search_t1_6(driver, true)) return false;
        if (!interaction_edit_t1_6(driver)) return false;
        if (!search_t1_6(driver, false)) return false;
        if (!others_actions_t1_6(driver)) return false;
        if (!rulesChange_6(driver)) return false;
        if (!getData_6(driver)) return false;
        if (!qbeChange_6(driver)) return false;
        if (!others_actions_rule_6(driver)) return false;
        if (!interaction_edit_t2_6(driver)) return false;
        if (!others_actions_t2_6(driver)) return false;
        if (!delete_t1_6(driver)) return false;
        return true;
    }
    public boolean optionSelect7 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_SAPSupplier_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_7(driver)) return false;
        if (!search_t1_7(driver, true)) return false;
        if (!interaction_edit_t1_7(driver)) return false;
        if (!search_t1_7(driver, false)) return false;
        if (!others_actions_t1_7(driver)) return false;
        if (!rulesChange_7(driver)) return false;
        if (!getData_7(driver)) return false;
        if (!qbeChange_7(driver)) return false;
        if (!others_actions_rule_7(driver)) return false;
        if (!interaction_edit_t2_7(driver)) return false;
        if (!others_actions_t2_7(driver)) return false;
        if (!delete_t1_7(driver)) return false;
        return true;
    }

    public boolean optionSelect10 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_SupplierClassification_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_10(driver)) return false;
        if (!search_t1_10(driver, true)) return false;
        if (!interaction_edit_t1_10(driver)) return false;
        if (!search_t1_10(driver, false)) return false;
        if (!others_actions_t1_10(driver)) return false;
        if (!rulesChange_10(driver)) return false;
        if (!getData_10(driver)) return false;
        if (!qbeChange_10(driver)) return false;
        if (!others_actions_rule_10(driver)) return false;
        if (!interaction_edit_t2_10(driver)) return false;
        if (!others_actions_t2_10(driver)) return false;
        if (!delete_t1_10(driver)) return false;
        return true;
    }


    public boolean optionSelect13 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_SAPCustomerGroup_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_13(driver)) return false;
        if (!search_t1_13(driver, true)) return false;
        if (!interaction_edit_t1_13(driver)) return false;
        if (!search_t1_13(driver, false)) return false;
        if (!others_actions_t1_13(driver)) return false;
        if (!rulesChange_13(driver)) return false;
        if (!getData_13(driver)) return false;
        if (!qbeChange_13(driver)) return false;
        if (!others_actions_rule_13(driver)) return false;
        if (!interaction_edit_t2_13(driver)) return false;
        if (!others_actions_t2_13(driver)) return false;
        if (!delete_t1_13(driver)) return false;
        return true;
    }
    public boolean optionSelect14 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_SAPCustomer_DR", "d_type", "SELECT OPTION")){return false;}
        if (!interaction_add_t1_14(driver)) return false;
        if (!search_t1_14(driver, true)) return false;
        if (!interaction_edit_t1_14(driver)) return false;
        if (!search_t1_14(driver, false)) return false;
        if (!others_actions_t1_14(driver)) return false;
        if (!rulesChange_14(driver)) return false;
        if (!getData_14(driver)) return false;
        if (!qbeChange_14(driver)) return false;
        if (!others_actions_rule_14(driver)) return false;
        if (!interaction_edit_t2_14(driver)) return false;
        if (!others_actions_t2_14(driver)) return false;
        if (!delete_t1_14(driver)) return false;
        return true;
    }
    public boolean optionSelect16 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_Extensions_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_16(driver)) return false;
        if (!search_t1_16(driver, true)) return false;
        if (!interaction_edit_t1_16(driver)) return false;
        if (!search_t1_16(driver, false)) return false;
        if (!others_actions_t1_16(driver)) return false;
        if (!rulesChange_16(driver)) return false;
        if (!getData_16(driver)) return false;
        if (!qbeChange_16(driver)) return false;
        if (!others_actions_rule_16(driver)) return false;
        if (!interaction_edit_t2_16(driver)) return false;
        if (!others_actions_t2_16(driver)) return false;
        if (!delete_t1_16(driver)) return false;
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand", getElements("add_i_commercial_brand")},
                "comercial",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity", getElements("add_i_customer_connectivity")},
                "customer", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source_market", getElements("add_i_source_market")},
                "source",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_collections_company", getElements("add_i_collections_company")},
                "collections", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_commercial_brand", getElements("search_i_commercial_brand")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_brand", getElements("search_i_commercial_brand")},
                "comercial",getData("comercial"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_customer_connectivity", getElements("search_i_customer_connectivity")},
                "customer", getData("customer"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_source_market", getElements("search_i_source_market")},
                "source",getData("source"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand", getElements("add_i_commercial_brand")},
                "comercial",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity", getElements("add_i_customer_connectivity")},
                "customer", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source_market", getElements("add_i_source_market")},
                "source",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData (TestDriver driver) {
        Functions.break_time(driver, 5, 400);
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_collections_company", getElements("edit_i_collections_company")},
                "collections", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_country", getElements("add_i_commercial_country")},
                "country",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand2", getElements("add_i_commercial_brand2")},
                "comercial2",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity2", getElements("add_i_customer_connectivity2")},
                "customer2", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province", getElements("add_i_comercial_province")},
                "province",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel", getElements("add_i_direct_hotel")},
                "direct", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web_user", getElements("add_i_web_user")},
                "web_u", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type_widget", getElements("add_i_type_widget")},
                "type_w", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hotelextras", getElements("add_i_hotelextras")},
                "hotel_e", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_princing", getElements("add_i_princing")},
                "princing", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_interface", getElements("add_i_interface")},
                "interface", DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web", getElements("add_i_web")},
                "web", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass,
                90, 500,
                where)) return false; //where
        Functions.break_time(driver, 60, 400);
        return true;
    }
    private boolean search_t1_2(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        Functions.break_time(driver, 3, 400);
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_commercial_country", getElements("search_i_commercial_country")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_country", getElements("search_i_commercial_country")},
                "country",getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_brand2", getElements("search_i_commercial_brand2")},
                "comercial2",getData("comercial2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_customer_connectivity2", getElements("search_i_customer_connectivity2")},
                "customer2", getData("customer2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_province", getElements("search_i_commercial_province")},
                "province",getData("province"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_direct_hotel", getElements("search_i_direct_hotel")},
                "direct",getData("direct"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_web_user", getElements("search_i_web_user")},
                "web_u",getData("web_u"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_type_widget", getElements("search_i_type_widget")},
                "type_w",getData("type_w"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_hotelextras", getElements("search_i_hotelextras")},
                "hotel_e", getData("hotel_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_princing", getElements("search_i_princing")},
                "princing", getData("princing"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_country", getElements("add_i_commercial_country")},
                "country",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand2", getElements("add_i_commercial_brand2")},
                "comercial2",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity2", getElements("add_i_customer_connectivity2")},
                "customer2", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province", getElements("add_i_comercial_province")},
                "province",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel", getElements("add_i_direct_hotel")},
                "direct", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web_user", getElements("add_i_web_user")},
                "web_u", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type_widget", getElements("add_i_type_widget")},
                "type_w", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hotelextras", getElements("add_i_hotelextras")},
                "hotel_e", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_princing", getElements("add_i_princing")},
                "princing", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass,
                90, 500,
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_2 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_2 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_2 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_interface", getElements("edit_i_interface")},
                "interface", DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_web", getElements("edit_i_web")},
                "web", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_country3", getElements("add_i_commercial_country3")},
                "country3",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand3", getElements("add_i_commercial_brand3")},
                "comercial3",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity2", getElements("add_i_customer_connectivity2")},
                "customer3", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province3", getElements("add_i_comercial_province3")},
                "province3",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel3", getElements("add_i_direct_hotel3")},
                "direct3", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web_user3", getElements("add_i_web_user3")},
                "web_u3", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_interface3", getElements("add_i_interface3")},
                "interface3", DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web3", getElements("add_i_web3")},
                "web3", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass,
                90, 500,
                where)) return false; //where
        Functions.break_time(driver, 60, 400);
        return true;
    }
    private boolean search_t1_3(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        Functions.break_time(driver, 3, 400);
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_commercial_country", getElements("search_i_commercial_country")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_country3", getElements("search_i_commercial_country3")},
                "country3",getData("country3"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_brand3", getElements("search_i_commercial_brand3")},
                "comercial3",getData("comercial3"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_customer_connectivity3", getElements("search_i_customer_connectivity3")},
                "customer3", getData("customer3"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_province3", getElements("search_i_commercial_province3")},
                "province3",getData("province3"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_direct_hotel3", getElements("search_i_direct_hotel3")},
                "direct3",getData("direct3"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_web_user3", getElements("search_i_web_user3")},
                "web_u3",getData("web_u3"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_country3", getElements("add_i_commercial_country3")},
                "country3",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand3", getElements("add_i_commercial_brand3")},
                "comercial3",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity2", getElements("add_i_customer_connectivity2")},
                "customer3", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province3", getElements("add_i_comercial_province3")},
                "province3",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel3", getElements("add_i_direct_hotel3")},
                "direct3", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web_user3", getElements("add_i_web_user3")},
                "web_u3", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass,
                90, 500,
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_3 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_3 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_3 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_interface", getElements("edit_i_interface")},
                "interface", DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_web", getElements("edit_i_web")},
                "web", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_country4", getElements("add_i_commercial_country4")},
                "country4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand4", getElements("add_i_commercial_brand4")},
                "comercial4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity2", getElements("add_i_customer_connectivity2")},
                "customer4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province4", getElements("add_i_comercial_province4")},
                "province4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel4", getElements("add_i_direct_hotel4")},
                "direct4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web_user4", getElements("add_i_web_user4")},
                "web_u4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type_widget4", getElements("add_i_type_widget4")},
                "type_w4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_interface4", getElements("add_i_interface4")},
                "interface4", DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web4", getElements("add_i_web4")},
                "web4", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass,
                90, 500,
                where)) return false; //where
        Functions.break_time(driver, 60, 400);
        return true;
    }
    private boolean search_t1_4(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        Functions.break_time(driver, 3, 400);
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_commercial_country", getElements("search_i_commercial_country")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_country4", getElements("search_i_commercial_country4")},
                "country4",getData("country4"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_brand4", getElements("search_i_commercial_brand4")},
                "comercial4",getData("comercial4"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_customer_connectivity4", getElements("search_i_customer_connectivity4")},
                "customer4", getData("customer4"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_commercial_province4", getElements("search_i_commercial_province4")},
                "province4",getData("province4"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_direct_hotel4", getElements("search_i_direct_hotel4")},
                "direct4",getData("direct4"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_web_user4", getElements("search_i_web_user4")},
                "web_u4",getData("web_u4"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_type_widget4", getElements("search_i_type_widget4")},
                "type_w4",getData("type_w4"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_country4", getElements("add_i_commercial_country4")},
                "country4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commercial_brand4", getElements("add_i_commercial_brand4")},
                "comercial4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity2", getElements("add_i_customer_connectivity2")},
                "customer4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province4", getElements("add_i_comercial_province4")},
                "province4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel4", getElements("add_i_direct_hotel4")},
                "direct4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_web_user4", getElements("add_i_web_user4")},
                "web_u4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type_widget4", getElements("add_i_type_widget4")},
                "type_w4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass,
                90, 500,
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_4(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_4 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_4 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_4 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_4(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_interface", getElements("edit_i_interface")},
                "interface", DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_web", getElements("edit_i_web")},
                "web", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_4(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_5 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_invoicing", getElements("add_i_invoicing")},
                "invoicing",DataGenerator.getRandomAlphanumericSequence(3, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_office", getElements("add_i_office")},
                "office",String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap", getElements("add_i_sap")},
                "sap", String.valueOf(DataGenerator.random(0000,999999)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_5(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_commercial_country4", getElements("search_i_commercial_country4")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_invoicing", getElements("search_i_invoicing")},
                "invoicing",getData("invoicing"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_office", getElements("search_i_office")},
                "office",getData("office"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_invoicing", getElements("add_i_invoicing")},
                "invoicing",DataGenerator.getRandomAlphanumericSequence(3, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_office", getElements("add_i_office")},
                "office",String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_5(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_5 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_5 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_5 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_5(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_5(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_sap", getElements("edit_i_sap")},
                "sap", String.valueOf(DataGenerator.random(0000,999999)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_5(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_6 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_supplier", getElements("add_i_supplier")},
                "supplier",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sup_sub", getElements("add_i_sup_sub")},
                "s_sub",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm", getElements("add_i_adm")},
                "adm", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_6(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_supplier", getElements("search_i_supplier")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_supplier", getElements("search_i_supplier")},
                "supplier",getData("supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sup_sub", getElements("search_i_sup_sub")},
                "s_sub",getData("s_sub"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_6(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_supplier", getElements("add_i_supplier")},
                "supplier",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sup_sub", getElements("add_i_sup_sub")},
                "s_sub",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_6(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_6 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_6 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_6 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_6(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_6(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_6(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_adm", getElements("edit_i_adm")},
                "adm", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_6(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_7 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_c", getElements("add_i_atlas_c")},
                "atlas_c",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o", getElements("add_i_atlas_o")},
                "atlas_o",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap_c", getElements("add_i_sap_c")},
                "sap_c", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_s", getElements("add_i_adm_s")},
                "adm_s", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap_group", getElements("add_i_sap_group")},
                "sap_g", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_account", getElements("add_i_account")},
                "account", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pay", getElements("add_i_pay")},
                "pay", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credit", getElements("add_i_credit")},
                "credit", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_7(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_supplier", getElements("search_i_supplier")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_c", getElements("search_i_atlas_c")},
                "atlas_c",getData("atlas_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_o", getElements("search_i_atlas_o")},
                "atlas_o",getData("atlas_o"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sap_c", getElements("search_i_sap_c")},
                "sap_c",getData("sap_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_s", getElements("search_i_adm_s")},
                "adm_s", getData("adm_s"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_7(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_c", getElements("add_i_atlas_c")},
                "atlas_c",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o", getElements("add_i_atlas_o")},
                "atlas_o",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap_c", getElements("add_i_sap_c")},
                "sap_c", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_s", getElements("add_i_adm_s")},
                "adm_s", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_7(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_7 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_7 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_7 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_7(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_7(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_7(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_sap_group", getElements("edit_i_sap_group")},
                "sap_g", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_account", getElements("edit_i_account")},
                "account", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_pay", getElements("edit_i_pay")},
                "pay", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_credit", getElements("edit_i_credit")},
                "credit", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_7(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }




    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_10 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_supplier10", getElements("add_i_supplier10")},
                "supplier10",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_supplier_c_10", getElements("add_i_supplier_c_10")},
                "sup_c10",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_10(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_supplier10", getElements("search_i_supplier10")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_supplier10", getElements("search_i_supplier10")},
                "supplier10",getData("supplier10"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_10(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_supplier10", getElements("add_i_supplier10")},
                "supplier10",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_10(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_10 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_10 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_10 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_10(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_10(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_10(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_supplier_c_10", getElements("edit_i_supplier_c_10")},
                "sup_c10",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_10(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }



    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_13 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_relation", getElements("add_i_relation")},
                "relation",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_grupo", getElements("add_i_grupo")},
                "grupo",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_13(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_relation", getElements("search_i_relation")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_relation", getElements("search_i_relation")},
                "relation", getData("relation"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_13(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_relation", getElements("add_i_relation")},
                "relation",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_13(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_13 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_13 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_13 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r",getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_13(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_13(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_13(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_grupo", getElements("edit_i_grupo")},
                "grupo",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_13(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_14 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_relation14", getElements("add_i_relation14")},
                "relation14",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_grupo14", getElements("add_i_grupo14")},
                "grupo14",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_type", getElements("add_i_adm_type")},
                "adm_type",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap_a_group", getElements("add_i_sap_a_group")},
                "sap_a_group",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_clas", getElements("add_i_adm_clas")},
                "adm_class",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_14(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_relation14", getElements("search_i_relation14")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_relation14", getElements("search_i_relation14")},
                "relation14",getData("relation14"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_grupo14", getElements("search_i_grupo14")},
                "grupo14",getData("grupo14"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_type", getElements("search_i_adm_type")},
                "adm_type",getData("adm_type"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_14(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_relation14", getElements("add_i_relation14")},
                "relation14",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_grupo14", getElements("add_i_grupo14")},
                "grupo14",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_type", getElements("add_i_adm_type")},
                "adm_type",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_14(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_14 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_14 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_14 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r",getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_14(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_14(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_14(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_sap_a_group", getElements("edit_i_sap_a_group")},
                "sap_a_group",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_adm_clas", getElements("edit_i_adm_clas")},
                "adm_class",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_14(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE INPUTS
     */
    public boolean interaction_add_t1_16 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_duplicity", getElements("add_i_duplicity")},
                "duplicity",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_sap"),"sap",true,where)){return false;}//where
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_16(TestDriver driver, boolean first) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (first) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_show_search", getElements("search_b_show_search")}, //element to click
                    new String[]{"search_i_relation", getElements("search_i_relation")}, //element expected to appear
                    where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_duplicity", getElements("search_i_duplicity")},
                "duplicity", getData("duplicity"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"inputs_e_result", getElements("inputs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1_16(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_duplicity", getElements("add_i_duplicity")},
                "duplicity",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions_t1_16(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"inputs_b_detach", getElements("inputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    public boolean rulesChange_16 (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions", getElements("inputs_b_actions")}, //element to click
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element expected to appear
                "RULES CHANGE")){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"inputs_b_actions_rules", getElements("inputs_b_actions_rules")}, //element to click
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element expected to appear
                "RULES CHANGE")){return false;}
        return true;
    }
    public boolean getData_16 (TestDriver driver) {
        if(!Functions.getText(driver,new String[]{"table_i_user", getElements("table_i_user")}, // element path
                "user_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date", getElements("table_i_date")}, // element path
                "date_r", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_rule", getElements("table_i_rule")}, // element path
                "rule", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_original", getElements("table_i_original")}, // element path
                "original", // key for data value (the name)
                "GET DATA")){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_new", getElements("table_i_new")}, // element path
                "new", // key for data value (the name)
                "GET DATA")){return false;}
        return true;
    }
    private boolean qbeChange_16 (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE RULES";
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r",getData("date_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", getData("rule"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", getData("original"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", getData("new"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_rule_16(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH RULE";
        if (!Functions.detachTable(driver,
                new String[]{"rules_b_detach", getElements("rules_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"inputs_b_actions_rules_cancel", getElements("inputs_b_actions_rules_cancel")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean delete_t1_16(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDelete(driver,
                new String[]{"inputs_b_delete", getElements("inputs_b_delete")},
                new String[]{"inputs_b_ok_delete", getElements("inputs_b_ok_delete")},
                where)){
            return false;
        }
        return true;
    }
    /**
     * TABLE OUTPUTS
     */
    private boolean interaction_edit_t2_16(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("edit_ck_sap"),"sap",false,where)){return false;}//where
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }
    private boolean others_actions_t2_16(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"outputs_b_detach", getElements("outputs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
