package screen.AT2MDMCL0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 28/11/2016.
 */

/**
 * La QBE de la opción Rules Change el campo de Date Modified no funciona
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
        if (!optionSelect1(driver)) return false;
        if (!optionSelect2(driver)) return false;
        if (!optionSelect3(driver)) return false;
        if (!optionSelect4(driver)) return false;
        if (!optionSelect5(driver)) return false;
        if (!optionSelect6(driver)) return false;
        if (!optionSelect7(driver)) return false;
        if (!optionSelect8(driver)) return false;
        if (!optionSelect9(driver)) return false;
        if (!optionSelect10(driver)) return false;
        if (!optionSelect11(driver)) return false;
        if (!optionSelect12(driver)) return false;
        if (!optionSelect13(driver)) return false;
        if (!optionSelect14(driver)) return false;
        if (!optionSelect15(driver)) return false;
        if (!optionSelect16(driver)) return false;
        if (!optionSelect17(driver)) return false;
        if (!optionSelect18(driver)) return false;
        return true;
    }

    public boolean optionSelect1 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_Activate_WebPrepayment_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1(driver, true)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1(driver, false)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;

    }
    public boolean optionSelect2 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_WebUser_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 50, 400);
        if (!interaction_add_t1_2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;

    }
    public boolean optionSelect3 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_WebUser_Cbranch_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_3(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_3(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_3(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_3(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_3(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect4 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_WebUser_Dbranch_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_4(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_4(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_4(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_4(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_4(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect5 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_HX2_SAPCode_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_5(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_5(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_5(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_5(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_5(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect6 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_AdministrativeSupplier_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_6(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_6(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_6(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_6(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_6(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect7 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_SAPSupplier_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_7(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_7(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_7(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_7(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_7(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect8 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_SAPCustomer_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_8(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_8(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_8(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_8(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_8(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect9 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_ICs_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_9(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_9(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_9(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_9(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_9(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect10 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "SP_SupplierClassification_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_10(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_10(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_10(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_10(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_10(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect11 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_Administrative_classification_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_11(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_11(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_11(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_11(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_11(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect12 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_InvoicingCompanies_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_12(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_12(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_12(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_12(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_12(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect13 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_SAPCustomerGroup_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_13(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_13(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_13(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_13(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_13(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect14 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_SAPCustomer_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_14(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_14(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_14(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_14(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_14(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect15 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_SAPSupplier_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_15(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_15(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_15(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_15(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_15(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect16 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_Extensions_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_16(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_16(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_16(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_16(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_16(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect17 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_SAPCustomerType_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_17(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_17(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_17(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_17(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_17(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }
    public boolean optionSelect18 (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"derivation_sl_type",getElements("derivation_sl_type")},
                "CL_AtlasAdmin_classification_DR", "d_type", "SELECT OPTION")){return false;}
        Functions.break_time(driver, 30, 400);
        if (!interaction_add_t1_18(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_18(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t1_18(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!search_t1_18(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!rulesChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!qbeChange(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_rule(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!interaction_edit_t2_18(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!others_actions_t2(driver)) return false;
        Functions.break_time(driver, 6, 400);
        if (!delete_t1(driver)) return false;
        Functions.break_time(driver, 6, 400);
        return true;
    }

    /**
     * MÉTODOS TABLE INPUTS GENERALES
     */
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
        Functions.break_time(driver, 20, 600);
        if (!Functions.clickQbE(driver,
                new String[]{"rules_b_qbe", getElements("rules_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r","", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rule", getElements("qbe_i_rule")},
                "rule", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_original", getElements("qbe_i_original")},
                "original", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_new", getElements("qbe_i_new")},
                "new", "", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"rules_e_result", getElements("rules_e_result")}, //table result
                where)){return false;}
        if (!getData(driver)) return false;
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user", getElements("qbe_i_user")},
                "user_r", getData("user_r"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date_r", ""/* getData("date_r")*/, where)) {
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
     * MÉTODO TABLE OUTPUTS GENERAL
     */
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
     * TABLE INPUTS CL_Activate_WebPrepayment_DR
     */
    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_Activate_WebPrepayment_DR";
        Functions.break_time(driver, 3, 400);
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
        String where = " on SEARCH 1 - CL_Activate_WebPrepayment_DR";
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
        String where = " on EDITTION 1 - CL_Activate_WebPrepayment_DR";
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
    /**
     * TABLE OUTPUTS CL_Activate_WebPrepayment_DR
     */
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_Activate_WebPrepayment_DR";
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

    /**
     * TABLE INPUTS CL_WebUser_DR
     */
    public boolean interaction_add_t1_2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_WebUser_DR";
        Functions.break_time(driver, 50, 400);
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass,
                450, 300,//element expected to appear
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
        Functions.break_time(driver,3, 500);
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
        Functions.break_time(driver,3, 500);
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
    private boolean search_t1_2(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_WebUser_DR";
        Functions.break_time(driver, 50, 400);
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
        Functions.break_time(driver,3, 500);
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
        Functions.break_time(driver,3, 500);
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
        String where = " on EDITTION 1 - CL_WebUser_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass,
                120, 400,//element expected to appear
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
        Functions.break_time(driver,3, 500);
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
        Functions.break_time(driver,3, 500);
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
    /**
     * TABLE OUTPUTS CL_WebUser_DR
     */
    private boolean interaction_edit_t2_2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_WebUser_DR";
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

    /**
     * TABLE INPUTS CL_WebUser_Cbranch_DR
     */
    public boolean interaction_add_t1_3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_WebUser_Cbranch_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass,
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
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity3", getElements("add_i_customer_connectivity3")},
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
    private boolean search_t1_3(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_WebUser_Cbranch_DR";
        Functions.break_time(driver, 3, 400);
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
        String where = " on EDITTION 1 - CL_WebUser_Cbranch_DR";
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
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity3", getElements("add_i_customer_connectivity3")},
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
    /**
     * TABLE OUTPUTS CL_WebUser_Cbranch_DR
     */
    private boolean interaction_edit_t2_3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_WebUser_Cbranch_DR";
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

    /**
     * TABLE INPUTS CL_WebUser_Dbranch_DR
     */
    public boolean interaction_add_t1_4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_WebUser_Dbranch_DR";
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
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity4", getElements("add_i_customer_connectivity4")},
                "customer4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province4", getElements("add_i_comercial_province4")},
                "province4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_direct_hotel4", getElements("add_i_direct_hotel4")},
                "direct4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
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
    private boolean search_t1_4(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_WebUser_Dbranch_DR";
        Functions.break_time(driver, 3, 400);
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
        Functions.break_time(driver,3, 500);
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
        String where = " on EDITTION 1 - CL_WebUser_Dbranch_DR";
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
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_customer_connectivity4", getElements("add_i_customer_connectivity4")},
                "customer4", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_province4", getElements("add_i_comercial_province4")},
                "province4",DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
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
    /**
     * TABLE OUTPUTS CL_WebUser_Dbranch_DR
     */
    private boolean interaction_edit_t2_4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_WebUser_Dbranch_DR";
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

    /**
     * TABLE INPUTS CL_HX2_SAPCode_DR
     */
    public boolean interaction_add_t1_5 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_HX2_SAPCode_DR";
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
    private boolean search_t1_5(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_HX2_SAPCode_DR";
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
        String where = " on EDITTION 1 - CL_HX2_SAPCode_DR";
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
    /**
     * TABLE OUTPUTS CL_HX2_SAPCode_DR
     */
    private boolean interaction_edit_t2_5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_HX2_SAPCode_DR";
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

    /**
     * TABLE INPUTS SP_AdministrativeSupplier_DR
     */
    public boolean interaction_add_t1_6 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - SP_AdministrativeSupplier_DR";
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
    private boolean search_t1_6(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - SP_AdministrativeSupplier_DR";
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
        String where = " on EDITTION 1 - SP_AdministrativeSupplier_DR";
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
    /**
     * TABLE OUTPUTS SP_AdministrativeSupplier_DR
     */
    private boolean interaction_edit_t2_6(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - SP_AdministrativeSupplier_DR";
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

    /**
     * TABLE INPUTS SP_SAPSupplier_DR
     */
    public boolean interaction_add_t1_7 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - SP_SAPSupplier_DR";
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
        Functions.break_time(driver,3, 500);
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
    private boolean search_t1_7(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - SP_SAPSupplier_DR";
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
        String where = " on EDITTION 1 - SP_SAPSupplier_DR";
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
    /**
     * TABLE OUTPUTS SP_SAPSupplier_DR
     */
    private boolean interaction_edit_t2_7(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - SP_SAPSupplier_DR";
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

    /**
     * TABLE INPUTS SP_SAPCustomer_DR
     */
    public boolean interaction_add_t1_8 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - SP_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_bussiness", getElements("add_i_bussiness")},
                "bussiness",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_c", getElements("add_i_atlas_o_c")},
                "atlas_o_c",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_o", getElements("add_i_atlas_o_o")},
                "atlas_o_o", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_payments8", getElements("add_i_payments8")},
                "payment8", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credit8", getElements("add_i_credit8")},
                "cedit7", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap8", getElements("add_i_sap8")},
                "sap8", DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_gl", getElements("add_i_gl")},
                "gl", String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_class", getElements("add_i_class")},
                "class", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial8", getElements("add_i_comercial8")},
                "comercial8", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_treasury", getElements("add_i_treasury")},
                "treasury", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_save", getElements("add_i_save")},
                "save", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_payment_m", getElements("add_i_payment_m")},
                "payment_m", DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_ar", getElements("add_i_ar")},
                "ar", DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dunning_p", getElements("add_i_dunning_p")},
                "dunning_p", DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dunning_b", getElements("add_i_dunning_b")},
                "dunning_b", DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_account8", getElements("add_i_account8")},
                "account8", DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_8(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - SP_SAPCustomer_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_bussiness", getElements("search_i_bussiness")},
                "bussiness",getData("bussiness"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_o_c", getElements("search_i_atlas_o_c")},
                "atlas_o_c",getData("atlas_o_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_o_o", getElements("search_i_atlas_o_o")},
                "atlas_o_o", getData("atlas_o_o"), where)) {
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
    private boolean interaction_edit_t1_8(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - SP_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_bussiness", getElements("add_i_bussiness")},
                "bussiness",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_c", getElements("add_i_atlas_o_c")},
                "atlas_o_c",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_o", getElements("add_i_atlas_o_o")},
                "atlas_o_o", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS SP_SAPCustomer_DR
     */
    private boolean interaction_edit_t2_8(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - SP_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_payments8", getElements("edit_i_payments8")},
                "payment8", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_credit8", getElements("edit_i_credit8")},
                "cedit7", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_sap8", getElements("edit_i_sap8")},
                "sap8", DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_gl", getElements("edit_i_gl")},
                "gl", String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_class", getElements("edit_i_class")},
                "class", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_comercial8", getElements("edit_i_comercial8")},
                "comercial8", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_treasury", getElements("edit_i_treasury")},
                "treasury", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_save", getElements("edit_i_save")},
                "save", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_payment_m", getElements("edit_i_payment_m")},
                "payment_m", DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_ar", getElements("edit_i_ar")},
                "ar", DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_dunning_p", getElements("edit_i_dunning_p")},
                "dunning_p", DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_dunning_b", getElements("edit_i_dunning_b")},
                "dunning_b", DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_account8", getElements("edit_i_account8")},
                "account8", DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
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

    /**
     * TABLE INPUTS SP_ICs_DR
     */
    public boolean interaction_add_t1_9 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - SP_ICs_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_sup", getElements("add_i_adm_sup")},
                "adm_sup",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_c9", getElements("add_i_atlas_o_c9")},
                "atlas_o_c9",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_o9", getElements("add_i_atlas_o_o9")},
                "atlas_o_o9", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_account9", getElements("add_i_account9")},
                "account9", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_management", getElements("add_i_management")},
                "management", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_hotel_chain", getElements("add_i_hotel_chain")},
                "hotel_chain", DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_brand", getElements("add_i_brand")},
                "brand", String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ap_s", getElements("add_i_ap_s")},
                "ap_s",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ap_g", getElements("add_i_ap_g")},
                "ap_g",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_ap_a", getElements("add_i_ap_a")},
                "ap_a",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_chain", getElements("add_i_chain")},
                "chain",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_9(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - SP_ICs_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_sup", getElements("search_i_adm_sup")},
                "adm_sup",getData("adm_sup"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_o_c9", getElements("search_i_atlas_o_c9")},
                "atlas_o_c9",getData("atlas_o_c9"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_o_o9", getElements("search_i_atlas_o_o9")},
                "atlas_o_o9", getData("atlas_o_o9"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_account9", getElements("search_i_account9")},
                "account9", getData("account9"), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_management", getElements("search_i_management")},
                "management", getData("management"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_hotel_chain", getElements("search_i_hotel_chain")},
                "hotel_chain", getData("hotel_chain"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_brand", getElements("search_i_brand")},
                "brand", getData("brand"), where)) {
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
    private boolean interaction_edit_t1_9(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - SP_ICs_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_sup", getElements("add_i_adm_sup")},
                "adm_sup",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_c9", getElements("add_i_atlas_o_c9")},
                "atlas_o_c9",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_o_o9", getElements("add_i_atlas_o_o9")},
                "atlas_o_o9", DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_account9", getElements("add_i_account9")},
                "account9", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_management", getElements("add_i_management")},
                "management", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hotel_chain", getElements("add_i_hotel_chain")},
                "hotel_chain", DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_brand", getElements("add_i_brand")},
                "brand", String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS SP_ICs_DR
     */
    private boolean interaction_edit_t2_9(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - SP_ICs_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ap_s", getElements("edit_i_ap_s")},
                "ap_s",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ap_g", getElements("edit_i_ap_g")},
                "ap_g",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ap_a", getElements("edit_i_ap_a")},
                "ap_a",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_chain", getElements("edit_i_chain")},
                "chain",  String.valueOf(DataGenerator.random(000000,9999999)), where)) {
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

    /**
     * TABLE INPUTS SP_SupplierClassification_DR
     */
    public boolean interaction_add_t1_10 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - SP_SupplierClassification_DR";
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
    private boolean search_t1_10(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - SP_SupplierClassification_DR";
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
        String where = " on EDITTION 1 - SP_SupplierClassification_DR";
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
    /**
     * TABLE OUTPUTS SP_SupplierClassification_DR
     */
    private boolean interaction_edit_t2_10(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - SP_SupplierClassification_DR";
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

    /**
     * TABLE INPUTS CL_Administrative_classification_DR
     */
    public boolean interaction_add_t1_11 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_Administrative_classification_DR";
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source", getElements("add_i_source")},
                "source",DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer", getElements("add_i_customer")},
                "customer",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_b", getElements("add_i_comercial_b")},
                "commercial_b",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_white", getElements("add_i_white")},
                "white",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_connectivity", getElements("add_i_connectivity")},
                "connect",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cust", getElements("add_i_adm_cust")},
                "adm_cust",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_11(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_Administrative_classification_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_source", getElements("search_i_source")},
                "source",getData("source"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_customer", getElements("search_i_customer")},
                "customer",getData("customer"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_comercial_b", getElements("search_i_comercial_b")},
                "commercial_b",getData("commercial_b"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_white", getElements("search_i_white")},
                "white",getData("white"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_connectivity", getElements("search_i_connectivity")},
                "connect",getData("connect"), where)) {
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
    private boolean interaction_edit_t1_11(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - CL_Administrative_classification_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source", getElements("add_i_source")},
                "source",DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_customer", getElements("add_i_customer")},
                "customer",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_b", getElements("add_i_comercial_b")},
                "commercial_b",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_white", getElements("add_i_white")},
                "white",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_connectivity", getElements("add_i_connectivity")},
                "connect",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS CL_Administrative_classification_DR
     */
    private boolean interaction_edit_t2_11(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_Administrative_classification_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_adm_cust", getElements("edit_i_adm_cust")},
                "adm_cust",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
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

    /**
     * TABLE INPUTS CL_InvoicingCompanies_DR
     */
    public boolean interaction_add_t1_12 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_InvoicingCompanies_DR";
        Functions.break_time(driver, 10, 500);
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                200, 600,
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_class", getElements("add_i_adm_class")},
                "adm_class",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_c_brand", getElements("add_i_c_brand")},
                "c_brand",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais", getElements("add_i_pais")},
                "pais",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hotel_pay", getElements("add_i_hotel_pay")},
                "hotel_pay",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_provincia", getElements("add_i_provincia")},
                "provincia",String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_fiscal", getElements("add_i_fiscal")},
                "fiscal",String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_asia", getElements("add_i_asia")},
                "asia",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_white12", getElements("add_i_white12")},
                "white12",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cust_con12", getElements("add_i_cust_con12")},
                "cust_cont12",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_princing12", getElements("add_i_princing12")},
                "princing",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")},
                "type",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adquisition", getElements("add_i_adquisition")},
                "adquisition",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credito", getElements("add_i_credito")},
                "credito",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credito_g", getElements("add_i_credito_g")},
                "credito_g",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_c_saldo", getElements("add_i_c_saldo")},
                "c_saldo",DataGenerator.getRandomAlphanumericSequence(2, false), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credito_t", getElements("add_i_credito_t")},
                "credito_t",String.valueOf(DataGenerator.random(11,9999)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_empresa", getElements("add_i_empresa")},
                "empresa",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_oficina", getElements("add_i_oficina")},
                "oficina",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_canal", getElements("add_i_canal")},
                "canal",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_d_factura", getElements("add_i_d_factura")},
                "factura",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_d_reserva", getElements("add_i_d_reserva")},
                "reserva",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_c_divisa", getElements("add_i_c_divisa")},
                "c_divisa",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_check", getElements("add_i_check")},
                "check",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_imp_c", getElements("add_i_imp_c")},
                "imp_c",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_imp_r", getElements("add_i_imp_r")},
                "imp_r",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_class_o", getElements("add_i_class_o")},
                "class_o",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_class_rap", getElements("add_i_class_rap")},
                "class_rap",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tipo_com", getElements("add_i_tipo_com")},
                "tipo_com",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tipo_rap", getElements("add_i_tipo_rap")},
                "tipo_rap",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais_o", getElements("add_i_pais_o")},
                "pais_o",DataGenerator.getRandomAlphanumericSequence(2, false), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_divisa_res", getElements("add_i_divisa_res")},
                "divisa_res",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_imp_cred", getElements("add_i_imp_cred")},
                "imp_cred",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_divisa_cred", getElements("add_i_divisa_cred")},
                "divisa_cred",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_traslados", getElements("add_i_traslados")},
                "traslados",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ent_sal", getElements("add_i_ent_sal")},
                "ent_sal",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_venta", getElements("add_i_venta")},
                "venta",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_ind_p", getElements("add_i_ind_p")},
                "ind_p",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ind_v", getElements("add_i_ind_v")},
                "ind_v",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ind_pc", getElements("add_i_ind_pc")},
                "ind_pc",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ind_tpv", getElements("add_i_ind_tpv")},
                "ind_tpv",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_ind_tr", getElements("add_i_ind_tr")},
                "ind_tr",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_one", getElements("add_i_one")},
                "one",DataGenerator.getRandomAlphanumericSequence(2, false), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_r", getElements("add_i_atlas_r")},
                "atlas_r",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ref_o", getElements("add_i_ref_o")},
                "ref_o",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_cli_pro", getElements("add_i_cli_pro")},
                "cli_pro",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                150,900,
                where)) return false; //where
        return true;
    }
    private boolean search_t1_12(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_InvoicingCompanies_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_class", getElements("search_i_adm_class")},
                "adm_class", getData("adm_class"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_c_brand", getElements("search_i_c_brand")},
                "c_brand", getData("c_brand"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_pais", getElements("search_i_pais")},
                "pais", getData("pais"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_hotel_pay", getElements("search_i_hotel_pay")},
                "hotel_pay", getData("hotel_pay"), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_provincia", getElements("search_i_provincia")},
                "provincia", getData("provincia"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_fiscal", getElements("search_i_fiscal")},
                "fiscal", getData("fiscal"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_asia", getElements("search_i_asia")},
                "asia", getData("asia"), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_white12", getElements("search_i_white12")},
                "white12", getData("white12"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_cust_con12", getElements("search_i_cust_con12")},
                "cust_cont12", getData("cust_cont12"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_princing12", getElements("search_i_princing12")},
                "princing", getData("princing"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_type", getElements("search_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_adquisition", getElements("search_i_adquisition")},
                "adquisition", getData("adquisition"), where)) {
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
    private boolean interaction_edit_t1_12(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - CL_InvoicingCompanies_DR";
        Functions.break_time(driver, 3, 300);
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                150, 300,
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_class", getElements("add_i_adm_class")},
                "adm_class",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_c_brand", getElements("add_i_c_brand")},
                "c_brand",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais", getElements("add_i_pais")},
                "pais",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_hotel_pay", getElements("add_i_hotel_pay")},
                "hotel_pay",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_provincia", getElements("add_i_provincia")},
                "provincia",String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fiscal", getElements("add_i_fiscal")},
                "fiscal",String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_asia", getElements("add_i_asia")},
                "asia",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_white12", getElements("add_i_white12")},
                "white12",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cust_con12", getElements("add_i_cust_con12")},
                "cust_cont12",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_princing12", getElements("add_i_princing12")},
                "princing",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")},
                "type",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adquisition", getElements("add_i_adquisition")},
                "adquisition",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                100,500,
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS CL_InvoicingCompanies_DR
     */
    private boolean interaction_edit_t2_12(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_InvoicingCompanies_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_credito", getElements("edit_i_credito")},
                "credito",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_credito_g", getElements("edit_i_credito_g")},
                "credito_g",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_c_saldo", getElements("edit_i_c_saldo")},
                "c_saldo",DataGenerator.getRandomAlphanumericSequence(2, false), where)){
            return false;
        }
        Functions.break_time(driver, 50, 400);
        if (!Functions.insertInput(driver, new String[]{"edit_i_credito_t", getElements("edit_i_credito_t")},
                "credito_t",String.valueOf(DataGenerator.random(11,9999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_empresa", getElements("edit_i_empresa")},
                "empresa",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_oficina", getElements("edit_i_oficina")},
                "oficina",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_canal", getElements("edit_i_canal")},
                "canal",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_d_factura", getElements("edit_i_d_factura")},
                "factura",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_d_reserva", getElements("edit_i_d_reserva")},
                "reserva",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_c_divisa", getElements("edit_i_c_divisa")},
                "c_divisa",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_check", getElements("edit_i_check")},
                "check",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_imp_c", getElements("edit_i_imp_c")},
                "imp_c",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_imp_r", getElements("edit_i_imp_r")},
                "imp_r",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_class_o", getElements("edit_i_class_o")},
                "class_o",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_class_rap", getElements("edit_i_class_rap")},
                "class_rap",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_tipo_com", getElements("edit_i_tipo_com")},
                "tipo_com",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_tipo_rap", getElements("edit_i_tipo_rap")},
                "tipo_rap",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_pais_o", getElements("edit_i_pais_o")},
                "pais_o",DataGenerator.getRandomAlphanumericSequence(2, false), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_divisa_res", getElements("edit_i_divisa_res")},
                "divisa_res",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_imp_cred", getElements("edit_i_imp_cred")},
                "imp_cred",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_divisa_cred", getElements("edit_i_divisa_cred")},
                "divisa_cred",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_traslados", getElements("edit_i_traslados")},
                "traslados",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ent_sal", getElements("edit_i_ent_sal")},
                "ent_sal",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_venta", getElements("edit_i_venta")},
                "venta",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ind_p", getElements("edit_i_ind_p")},
                "ind_p",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_ind_v", getElements("edit_i_ind_v")},
                "ind_v",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ind_pc", getElements("edit_i_ind_pc")},
                "ind_pc",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ind_tpv", getElements("edit_i_ind_tpv")},
                "ind_tpv",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ind_tr", getElements("edit_i_ind_tr")},
                "ind_tr",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_one", getElements("edit_i_one")},
                "one",DataGenerator.getRandomAlphanumericSequence(2, false), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_atlas_r", getElements("edit_i_atlas_r")},
                "atlas_r",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_ref_o", getElements("edit_i_ref_o")},
                "ref_o",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_cli_pro", getElements("edit_i_cli_pro")},
                "cli_pro",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                120,500,
                where)) return false; //where
        Functions.break_time(driver,3, 500);
        return true;
    }

    /**
     * TABLE INPUTS CL_SAPCustomerGroup_DR
     */
    public boolean interaction_add_t1_13 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_SAPCustomerGroup_DR";
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                200, 800,
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
    private boolean search_t1_13(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_SAPCustomerGroup_DR";

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
        String where = " on EDITTION 1 - CL_SAPCustomerGroup_DR";
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
    /**
     * TABLE OUTPUTS CL_SAPCustomerGroup_DR
     */
    private boolean interaction_edit_t2_13(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_SAPCustomerGroup_DR";
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

    /**
     * TABLE INPUTS CL_SAPCustomer_DR
     */
    public boolean interaction_add_t1_14 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_SAPCustomer_DR";
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
    private boolean search_t1_14(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_SAPCustomer_DR";
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
        String where = " on EDITTION 1 - CL_SAPCustomer_DR";
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
    /**
     * TABLE OUTPUTS CL_SAPCustomer_DR
     */
    private boolean interaction_edit_t2_14(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_SAPCustomer_DR";
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

    /**
     * TABLE INPUTS CL_SAPCustomer_DR
     */
    public boolean interaction_add_t1_15 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pago_h", getElements("add_i_pago_h")},
                "pago_h",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_white15", getElements("add_i_white15")},
                "white15",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais_cli", getElements("add_i_pais_cli")},
                "pais_cli",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cus", getElements("add_i_adm_cus")},
                "adm_cus",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_g_cuenta", getElements("add_i_g_cuenta")},
                "g_cuenta",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_c_associada", getElements("add_i_c_associada")},
                "c_associado",String.valueOf(DataGenerator.random(111111,99999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_clave", getElements("add_i_clave")},
                "clave",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_grupo15", getElements("add_i_grupo15")},
                "grupo",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_condi", getElements("add_i_condi")},
                "condi",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_condi_abono", getElements("add_i_condi_abono")},
                "condi_abono",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_ver", getElements("add_i_ver")},
                "ver",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_via", getElements("add_i_via")},
                "via",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_bloqueo", getElements("add_i_bloqueo")},
                "bloqueo",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_clave_a", getElements("add_i_clave_a")},
                "clave_a",String.valueOf(DataGenerator.random(1,8)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pago", getElements("add_i_pago")},
                "pago",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_paga_alt", getElements("add_i_paga_alt")},
                "paga_alt",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_adm15", getElements("add_i_adm15")},
                "adm",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_15(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_SAPCustomer_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_pago_h", getElements("search_i_pago_h")},
                "pago_h", getData("pago_h"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_white15", getElements("search_i_white15")},
                "white15",getData("white15"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_pais_cli", getElements("search_i_pais_cli")},
                "pais_cli",getData("pais_cli"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_cus", getElements("search_i_adm_cus")},
                "adm_cus",getData("adm_cus"), where)) {
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
    private boolean interaction_edit_t1_15(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - CL_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pago_h", getElements("add_i_pago_h")},
                "pago_h",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_white15", getElements("add_i_white15")},
                "white15",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais_cli", getElements("add_i_pais_cli")},
                "pais_cli",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cus", getElements("add_i_adm_cus")},
                "adm_cus",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS CL_SAPCustomer_DR
     */
    private boolean interaction_edit_t2_15(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_g_cuenta", getElements("edit_i_g_cuenta")},
                "g_cuenta",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_c_associada", getElements("edit_i_c_associada")},
                "c_associado",String.valueOf(DataGenerator.random(111111,99999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_clave", getElements("edit_i_clave")},
                "clave",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_grupo15", getElements("edit_i_grupo15")},
                "grupo",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_condi", getElements("edit_i_condi")},
                "condi",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_condi_abono", getElements("edit_i_condi_abono")},
                "condi_abono",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_ver", getElements("edit_i_ver")},
                "ver",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_via", getElements("edit_i_via")},
                "via",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_bloqueo", getElements("edit_i_bloqueo")},
                "bloqueo",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_clave_a", getElements("edit_i_clave_a")},
                "clave_a",String.valueOf(DataGenerator.random(1,8)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_pago", getElements("edit_i_pago")},
                "pago",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_paga_alt", getElements("edit_i_paga_alt")},
                "paga_alt",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_adm15", getElements("edit_i_adm15")},
                "adm",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
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

    /**
     * TABLE INPUTS CL_Extensions_DR
     */
    public boolean interaction_add_t1_16 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_Extensions_DR";
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
    private boolean search_t1_16(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_Extensions_DR";
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
        String where = " on EDITTION 1 - CL_Extensions_DR";
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
    /**
     * TABLE OUTPUTS CL_Extensions_DR
     */
    private boolean interaction_edit_t2_16(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_Extensions_DR";
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

    /**
     * TABLE INPUTS CL_SAPCustomer_DR
     */
    public boolean interaction_add_t1_17 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_domiciliado", getElements("add_i_domiciliado")},
                "domiciliado",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap_account17", getElements("add_i_sap_account17")},
                "sap_account17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais17", getElements("add_i_pais17")},
                "pais17",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cus17", getElements("add_i_adm_cus17")},
                "adm_cus17",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_adquisition17", getElements("add_i_adquisition17")},
                "adquisition17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_c_associada17", getElements("add_i_c_associada17")},
                "c_associada17",String.valueOf(DataGenerator.random(111111,99999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_clave17", getElements("add_i_clave17")},
                "clave17",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_grupo17", getElements("add_i_grupo17")},
                "grupo17",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_condi17", getElements("add_i_condi17")},
                "condi17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_condi_abono17", getElements("add_i_condi_abono17")},
                "condi_abono17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_grabar", getElements("add_i_grabar")},
                "grabar",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_via17", getElements("add_i_via17")},
                "via17",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_clave_a17", getElements("add_i_clave_a17")},
                "clave_a17",String.valueOf(DataGenerator.random(1,8)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pago_unico", getElements("add_i_pago_unico")},
                "pago_unico",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_paga_alt17", getElements("add_i_paga_alt17")},
                "paga_alt17",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_17(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_SAPCustomer_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_domiciliado", getElements("search_i_domiciliado")},
                "domiciliado",getData("domiciliado"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sap_account17", getElements("search_i_sap_account17")},
                "sap_account17",getData("sap_account17"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_pais17", getElements("search_i_pais17")},
                "pais17",getData("pais17"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_cus17", getElements("search_i_adm_cus17")},
                "adm_cus17",getData("adm_cus17"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_adquisition17", getElements("search_i_adquisition17")},
                "adquisition17",getData("adquisition17"), where)) {
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
    private boolean interaction_edit_t1_17(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - CL_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_domiciliado", getElements("add_i_domiciliado")},
                "domiciliado",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sap_account17", getElements("add_i_sap_account17")},
                "sap_account17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_pais17", getElements("add_i_pais17")},
                "pais17",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cus17", getElements("add_i_adm_cus17")},
                "adm_cus17",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adquisition17", getElements("add_i_adquisition17")},
                "adquisition17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS CL_SAPCustomer_DR
     */
    private boolean interaction_edit_t2_17(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_SAPCustomer_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_c_associada17", getElements("edit_i_c_associada17")},
                "c_associada17",String.valueOf(DataGenerator.random(111111,99999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_clave17", getElements("edit_i_clave17")},
                "clave17",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_grupo17", getElements("edit_i_grupo17")},
                "grupo17",DataGenerator.getRandomAlphanumericSequence(3, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_condi17", getElements("edit_i_condi17")},
                "condi17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_condi_abono17", getElements("edit_i_condi_abono17")},
                "condi_abono17",DataGenerator.getRandomAlphanumericSequence(4, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_grabar", getElements("edit_i_grabar")},
                "grabar",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_via17", getElements("edit_i_via17")},
                "via17",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_clave_a17", getElements("edit_i_clave_a17")},
                "clave_a17",String.valueOf(DataGenerator.random(1,8)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_pago_unico", getElements("edit_i_pago_unico")},
                "pago_unico",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_paga_alt17", getElements("edit_i_paga_alt17")},
                "paga_alt17",DataGenerator.getRandomAlphanumericSequence(1, false), where)) {
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

    /**
     * TABLE INPUTS CL_AtlasAdmin_classification_DR
     */
    public boolean interaction_add_t1_18 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1 - CL_AtlasAdmin_classification_DR";
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_add", getElements("inputs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source18", getElements("add_i_source18")},
                "source18",DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cus18", getElements("add_i_adm_cus18")},
                "adm_cust18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_division18", getElements("add_i_division18")},
                "division18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_customer18", getElements("add_i_customer18")},
                "customer18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_comercial_b18", getElements("add_i_comercial_b18")},
                "commercial_b18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_white18", getElements("add_i_white18")},
                "white18",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cust_sub", getElements("add_i_cust_sub")},
                "cust_sub",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_acquisition", getElements("add_i_acquisition")},
                "acquisition",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cust_con", getElements("add_i_cust_con")},
                "cust_con",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1_18(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1 - CL_AtlasAdmin_classification_DR";
        if (!Functions.insertInput(driver, new String[]{"search_i_source18", getElements("search_i_source18")},
                "source18",getData("source18"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_adm_cus18", getElements("search_i_adm_cus18")},
                "adm_cust18",getData("adm_cust18"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_division18", getElements("search_i_division18")},
                "division18",getData("division18"), where)) {
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
    private boolean interaction_edit_t1_18(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1 - CL_AtlasAdmin_classification_DR";
        if (!Functions.checkClick(driver,
                new String[]{"inputs_b_edit", getElements("inputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source18", getElements("add_i_source18")},
                "source18",DataGenerator.getRandomAlphanumericSequence(6, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_adm_cus18", getElements("add_i_adm_cus18")},
                "adm_cust18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_division18", getElements("add_i_division18")},
                "division18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    /**
     * TABLE OUTPUTS CL_AtlasAdmin_classification_DR
     */
    private boolean interaction_edit_t2_18(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2 - CL_AtlasAdmin_classification_DR";
        if (!Functions.checkClick(driver,
                new String[]{"outputs_b_edit", getElements("outputs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_customer18", getElements("edit_i_customer18")},
                "customer18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_comercial_b18", getElements("edit_i_comercial_b18")},
                "commercial_b18",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_white18", getElements("edit_i_white18")},
                "white18",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
            return false;
        }
        Functions.break_time(driver,3, 500);
        if (!Functions.insertInput(driver, new String[]{"edit_i_cust_sub", getElements("edit_i_cust_sub")},
                "cust_sub",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_acquisition", getElements("edit_i_acquisition")},
                "acquisition",DataGenerator.getRandomAlphanumericSequence(2, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"edit_i_cust_con", getElements("edit_i_cust_con")},
                "cust_con",DataGenerator.getRandomAlphanumericSequence(5, false), where)) {
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
}
