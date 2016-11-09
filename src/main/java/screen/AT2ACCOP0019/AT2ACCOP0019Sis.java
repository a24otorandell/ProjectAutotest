package screen.AT2ACCOP0019;


import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 28/09/2016.
 * 
 * XPATH DIFERENTES QUE LOS DE SIS
 *
 * ERRORES GRAFICOS QUE HARAN QUE EL CODIGO FALLE.
 */

public class AT2ACCOP0019Sis {
    protected AT2ACCOP0019Locators locators;
    protected AT2ACCOP0019Data data;

    public AT2ACCOP0019Sis() {

    }
    public AT2ACCOP0019Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCOP0019Locators locators) {
        this.locators = locators;
    }
    public AT2ACCOP0019Data getData() {
        return data;
    }
    public void setData(AT2ACCOP0019Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Create Merchant");
    }
    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {

        if (!Create_merchant(driver)) {
            return false;
        }


        return false;
    }

    private boolean Create_merchant(TestDriver driver) {
        if (!Give_elements_merchant(driver)) {
            return false;
        }

        if (!Add_merchant(driver)) {
            return false;
        }
        if (!Search_merchant(driver)) {
            return false;
        }
        if(!Qbe_merchant_and_payment_method(driver)){
            return false;
        }
        if (!Edit_merchant(driver)) {
            return false;
        }
        if (!Qbe_merchant(driver)) {
            return false;
        }
        if (!Other_actions_merchant(driver)) {
            return false;
        }
        if (!Delete_merchant(driver)) {
            return false;
        }
        return true;
    }

    private boolean Qbe_merchant_and_payment_method (TestDriver driver){
        if(!Functions.simpleClick(driver,
                new String[]{"mercant_se_b_reset",getElements("mercant_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }

        if(!Functions.clickQbE(driver,
                new String[]{"mercant_qbe_b_qbe",getElements("mercant_qbe_b_qbe")},// query button
                new String[]{"mercant_qbe_i_provider",getElements("mercant_qbe_i_provider")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"payment_method_record",getElements("payment_method_record")}, // element path
                "method_record", // key for data value (the name)
                " on SIMPLE")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"currency_record",getElements("currency_record")}, // element path
                "currency_record", // key for data value (the name)
                " on SIMPLE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.getText(driver,new String[]{"capture_delay_record",getElements("capture_delay_record")}, // element path
                "delay_record", // key for data value (the name)
                " on SIMPLE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_provider",getElements("mercant_qbe_i_provider")},
                "qbe_provider",data.getData().get("provider")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_merchant",getElements("mercant_qbe_i_merchant")},
                "qbe_mercant",data.getData().get("mercant")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_submerchant",getElements("mercant_qbe_i_submerchant")},
                "qbe_submercant",data.getData().get("submercant")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_country_code",getElements("mercant_qbe_i_country_code")},
                "qbe_country_code",data.getData().get("country_code")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_user",getElements("mercant_qbe_i_user")},
                "qbe_user",data.getData().get("user")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_password",getElements("mercant_qbe_i_password")},
                "qbe_pass",data.getData().get("pass")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_capture_delay",getElements("mercant_qbe_i_capture_delay")},
                "delay_record",data.getData().get("delay_record")," on SIMPLE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_currency",getElements("mercant_qbe_i_currency")},
                "currency_record",data.getData().get("currency_record")," on SIMPLE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"mercant_qbe_i_payment_method",getElements("mercant_qbe_i_payment_method")},
                "method_record",data.getData().get("method_record")," on SIMPLE")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"mercant_qbe_i_submerchant",getElements("mercant_qbe_i_submerchant")}, //search button
                new String[]{"mercant_se_e_result",getElements("mercant_se_e_result")}, //result element
                " on QBE")){
            return false;
        }

        return true;
    }
    private boolean Give_elements_merchant(TestDriver driver) {

        driver.getReport().addHeader("GIVE ELEMENTS IN CREATE MERCHANT", 3, false);

        Functions.break_time(driver, 10, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"mercant_se_sl_currency", getElements("mercant_se_sl_currency")}, //element to click
                " on GIVE ELEMENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"aed_united", getElements("aed_united")}, // element path
                "united", // key for data value (the name)
                " on GIVE ELEMENTS")) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"afn_afgan", getElements("afn_afgan")}, // element path
                "afgan", // key for data value (the name)
                " on GIVE ELEMENTS")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"mercant_se_sl_currency", getElements("mercant_se_sl_currency")}, //element to click
                " on GIVE ELEMENTS")) {
            return false;
        }
        Functions.break_time(driver, 10, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"mercant_se_sl_payment_method", getElements("mercant_se_sl_payment_method")}, //element to click
                " on GIVE ELEMENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"alypay_sis", getElements("alypay_sis")}, // element path
                "alypay", // key for data value (the name)
                " on GIVE ELEMENTS")) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"amex_ssl", getElements("amex_ssl")}, // element path
                "amex", // key for data value (the name)
                " on GIVE ELEMENTS")) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"card_ips", getElements("card_ips")}, // element path
                "card", // key for data value (the name)
                " on GIVE ELEMENTS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_se_sl_payment_method", getElements("mercant_se_sl_payment_method")}, //element to click
                " on GIVE ELEMENTS")) {
            return false;
        }


        try {
            String[] currency_first = data.getData().get("united").split("\\s");
            data.getData().put("currency1", currency_first[0]);
            String[] payment_first = data.getData().get("alypay").split("\\s");
            data.getData().put("payment1", payment_first[0]);
            String[] currency_second = data.getData().get("afgan").split("\\s");
            data.getData().put("currency2", currency_second[0]);
            String[] payment_second = data.getData().get("amex").split("\\s");
            data.getData().put("payment2", payment_second[0]);
            String[] payment_third = data.getData().get("card").split("\\s");
            data.getData().put("payment3", payment_third[0]);
        } catch (Exception e) {
            String ecode = "--ERROR: The split text doesn't work corretly";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }

        return true;
    }
    private boolean Delete_merchant(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN CREATE MERCHANT", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"mercant_se_e_result", getElements("mercant_se_e_result")}, //element to click
                " on DELETE")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"mercant_del_b_delete", getElements("mercant_del_b_delete")}, //element to click
                new String[]{"mercant_del_b_delete_b_ok", getElements("mercant_del_b_delete_b_ok")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on DELETE")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"mercant_del_b_delete_b_ok", getElements("mercant_del_b_delete_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on DELETE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_se_i_delete_date", getElements("mercant_se_i_delete_date")},
                "del_gettoday",DataGenerator.getToday(driver,"dd/MM/yyyy")," on DELETE")){
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"mercant_se_b_save", getElements("mercant_se_b_save")}, //search button
                new String[]{"mercant_se_e_result", getElements("mercant_se_e_result")}, //result element
                " on DELETE")) {
            return false;
        }

        return true;
    }
    private boolean Other_actions_merchant(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN CREATE MERCHANT", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"mercant_oa_b_actions", getElements("mercant_oa_b_actions")}, //actions button
                new String[]{"mercant_oa_b_actions_b_audit_data", getElements("mercant_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"mercant_oa_b_audit_data_ok", getElements("mercant_oa_b_audit_data_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"mercant_oa_b_detach", getElements("mercant_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }
    private boolean Qbe_merchant(TestDriver driver) {
        driver.getReport().addHeader("QBE IN CREATE MERCHANT", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"mercant_se_b_reset", getElements("mercant_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"refresh_qbe",getElements("refresh_qbe")}, //element to click
                " on QBE")){
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"mercant_qbe_b_qbe", getElements("mercant_qbe_b_qbe")},// query button
                new String[]{"mercant_qbe_i_provider", getElements("mercant_qbe_i_provider")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_provider", getElements("mercant_qbe_i_provider")},
                "qbe_provider", data.getData().get("provider"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_merchant", getElements("mercant_qbe_i_merchant")},
                "qbe_mercant", data.getData().get("mercant"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_submerchant", getElements("mercant_qbe_i_submerchant")},
                "qbe_submercant", data.getData().get("mercant"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_country_code", getElements("mercant_qbe_i_country_code")},
                "qbe_country_code", data.getData().get("country_code"), " on QBE")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_user", getElements("mercant_qbe_i_user")},
                "qbe_user", data.getData().get("user"), " on QBE")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_password", getElements("mercant_qbe_i_password")},
                "qbe_pass", data.getData().get("pass"), " on QBE")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.insertInput(driver, new String[]{"mercant_qbe_i_secure_hash", getElements("mercant_qbe_i_secure_hash")},
                "qbe_delay", data.getData().get("delay"), " on QBE")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"mercant_qbe_i_submerchant", getElements("mercant_qbe_i_submerchant")}, //search button
                new String[]{"mercant_se_e_result", getElements("mercant_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;
    }
    private boolean Edit_merchant(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN CREATE MERCHANT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_ed_b_edit", getElements("mercant_ed_b_edit")}, //element to click
                new String[]{"mercant_ed_lov_provider", getElements("mercant_ed_lov_provider")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.simpleClick(driver,
                new String[]{"mercant_ed_e_currency_table",getElements("mercant_ed_e_currency_table")}, //element to click
                " on ADD")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"mercant_add_b_delete_currenzy_and_payment_method",getElements("mercant_add_b_delete_currenzy_and_payment_method")}, //element to click
                new String[]{"mercant_add_b_delete_currenzy_and_payment_method_yes",getElements("mercant_add_b_delete_currenzy_and_payment_method_yes")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"mercant_add_b_delete_currenzy_and_payment_method_yes",getElements("mercant_add_b_delete_currenzy_and_payment_method_yes")}, //element to click
                new String[]{"mercant_add_b_save",getElements("mercant_add_b_save")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"mercant_ed_lov_provider", getElements("mercant_ed_lov_provider")}, // b_lov
                new String[]{"mercant_ed_i_provider", getElements("mercant_ed_i_provider")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "provider", //Data name
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.insertInput(driver, new String[]{"mercant_ed_i_mercant", getElements("mercant_ed_i_mercant")},
                "mercant", DataGenerator.getRandomAlphanumericSequence(8, true), " on EDIT")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"mercant_ed_lov_country_code", getElements("mercant_ed_lov_country_code")}, // b_lov
                new String[]{"mercant_ed_i_counter_code", getElements("mercant_ed_i_counter_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country_code", //Data name
                " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_ed_i_user", getElements("mercant_ed_i_user")},
                "user", DataGenerator.getRandomAlphanumericSequence(8, true), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mercant_ed_i_password", getElements("mercant_ed_i_password")},
                "pass", DataGenerator.getRandomAlphanumericSequence(8, true), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mercant_ed_i_capture_delay", getElements("mercant_ed_i_capture_delay")},
                "delay", (Integer.toString(DataGenerator.random(1, 90))), " on EDIT")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"mercant_ed_b_save", getElements("mercant_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;
    }
    private boolean Search_merchant(TestDriver driver) {
        driver.getReport().addHeader(" SEARCH IN CREATE MERCHANT", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"mercant_se_lov_provider", getElements("mercant_se_lov_provider")}, //LoV button
                new String[]{"mercant_se_i_provider", getElements("mercant_se_i_provider")}, //external LoV input
                new String[]{"mercant_se_lov_provider_i_psp_code", getElements("mercant_se_lov_provider_i_psp_code")}, //internal LoV input
                data.getData().get("provider"), // value to search
                "se_provider", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mercant_se_i_merchant", getElements("mercant_se_i_merchant")},
                "se_mercant", data.getData().get("mercant"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_se_i_submerchant", getElements("mercant_se_i_submerchant")},
                "se_submercant", data.getData().get("submercant"), " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"mercant_se_lov_ocuntry_code", getElements("mercant_se_lov_ocuntry_code")}, //LoV button
                new String[]{"mercant_se_i_country_code", getElements("mercant_se_i_country_code")}, //external LoV input
                new String[]{"mercant_se_lov_country_code_i_country_code", getElements("mercant_se_lov_country_code_i_country_code")}, //internal LoV input
                data.getData().get("country_code"), // value to search
                "se_country_code", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"mercant_se_sl_active", getElements("mercant_se_sl_active")},
                "Yes", "se_active", " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_se_i_creation_date", getElements("mercant_se_i_creation_date")},
                "se_gettoday",DataGenerator.getToday(driver,"dd/MM/yyyy")," on SEARCH")){
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"mercant_se_b_save", getElements("mercant_se_b_save")}, //search button
                new String[]{"mercant_se_e_result", getElements("mercant_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean Add_merchant(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN CREATE MERCHANT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_add", getElements("mercant_add_b_add")}, //element to click
                new String[]{"mercant_add_b_add", getElements("mercant_add_b_add")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"mercant_add_lov_provider", getElements("mercant_add_lov_provider")}, // b_lov
                new String[]{"mercant_add_i_provider", getElements("mercant_add_i_provider")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "provider", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mercant_add_i_mercant", getElements("mercant_add_i_mercant")},
                "mercant", DataGenerator.getRandomAlphanumericSequence(8, true), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_add_i_submercant", getElements("mercant_add_i_submercant")},
                "submercant", DataGenerator.getRandomAlphanumericSequence(8, true), " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"mercant_add_lov_country_code", getElements("mercant_add_lov_country_code")}, // b_lov
                new String[]{"mercant_add_i_counter_code", getElements("mercant_add_i_counter_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country_code", //Data name
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_add_i_user", getElements("mercant_add_i_user")},
                "user", DataGenerator.getRandomAlphanumericSequence(8, true), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_add_i_password", getElements("mercant_add_i_password")},
                "pass", DataGenerator.getRandomAlphanumericSequence(8, true), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"mercant_add_i_capture_delay", getElements("mercant_add_i_capture_delay")},
                "delay", (Integer.toString(DataGenerator.random(1, 90))), " on ADD")) {
            return false;
        }

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_add_currency_and_payment_methods", getElements("mercant_add_b_add_currency_and_payment_methods")}, //element to click
                new String[]{"mercant_add_lov_currency", getElements("mercant_add_lov_currency")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        //Añadir en tabla currency

        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_lov_currency", getElements("mercant_add_lov_currency")}, //element to click
                new String[]{"mercant_add_e_currency_pass", getElements("mercant_add_e_currency_pass")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mercant_add_lov_currenzy_i_currenzy_code", getElements("mercant_add_lov_currenzy_i_currenzy_code")},
                "add_currency1", data.getData().get("currency1"), " on ADD")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"mercant_add_lov_currenzy_b_search", getElements("mercant_add_lov_currenzy_b_search")}, //search button
                new String[]{"mercant_add_e_currency_code", getElements("mercant_add_e_currency_code")}, //result element
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_add_e_currency_code", getElements("mercant_add_e_currency_code")}, //element to click
                " on SEARCH")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_e_currency_pass", getElements("mercant_add_e_currency_pass")}, //element to click
                new String[]{"mercant_add_e_currency_description", getElements("mercant_add_e_currency_description")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_lov_currency_b_ok", getElements("mercant_add_lov_currency_b_ok")}, //element to click
                new String[]{"mercant_add_lov_payment_method", getElements("mercant_add_lov_payment_method")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        //añadir en tabla payment method
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_lov_payment_method", getElements("mercant_add_lov_payment_method")}, //element to click
                new String[]{"mercant_add_e_payment_pass", getElements("mercant_add_e_payment_pass")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.insertInput(driver, new String[]{"mercant_add_lov_payment_method_i_payment_methood", getElements("mercant_add_lov_payment_method_i_payment_methood")},
                "add_payment1", data.getData().get("payment1"), " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"mercant_add_lov_payment_method_b_search", getElements("mercant_add_lov_payment_method_b_search")}, //search button
                new String[]{"mercant_add_e_payment_method_code", getElements("mercant_add_e_payment_method_code")}, //result element
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_add_e_payment_method_code", getElements("mercant_add_e_payment_method_code")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_e_payment_pass", getElements("mercant_add_e_payment_pass")}, //element to click
                new String[]{"mercant_add_e_payment_method_description", getElements("mercant_add_e_payment_method_description")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_lov_payment_method_b_ok", getElements("mercant_add_lov_payment_method_b_ok")}, //element to click
                new String[]{"mercant_add_b_save_currency_and_payment_methods", getElements("mercant_add_b_save_currency_and_payment_methods")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_save_currency_and_payment_methods", getElements("mercant_add_b_save_currency_and_payment_methods")}, //element to click
                new String[]{"mercant_add_b_save", getElements("mercant_add_b_save")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        //Editar en tabla currenzy
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_add_currency_and_payment_methods", getElements("mercant_add_b_add_currency_and_payment_methods")}, //element to click
                new String[]{"mercant_add_b_rollback_currenzy_and_payment_method", getElements("mercant_add_b_rollback_currenzy_and_payment_method")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_rollback_currenzy_and_payment_method", getElements("mercant_add_b_rollback_currenzy_and_payment_method")}, //element to click
                new String[]{"mercant_add_b_rollback_currenzy_and_payment_method_yes", getElements("mercant_add_b_rollback_currenzy_and_payment_method_yes")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_rollback_currenzy_and_payment_method_yes", getElements("mercant_add_b_rollback_currenzy_and_payment_method_yes")}, //element to click
                new String[]{"mercant_ed_e_currency_table", getElements("mercant_ed_e_currency_table")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_ed_e_currency_table", getElements("mercant_ed_e_currency_table")}, //element to click
                " on ADD")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"mercant_ed_lov_currency", getElements("mercant_ed_lov_currency")}, //LoV button
                new String[]{"mercant_ed_i_currcy", getElements("mercant_ed_i_currcy")}, //external LoV input
                new String[]{"mercant_ed_lov_currcency_i_currency_code", getElements("mercant_ed_lov_currcency_i_currency_code")}, //internal LoV input
                data.getData().get("currency2"), // value to search
                "ed_curremcy", //name of the data
                " on ADD")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_ed_b_save_currenzy_and_payment_method", getElements("mercant_ed_b_save_currenzy_and_payment_method")}, //element to click
                " on ADD")) {
            return false;
        }

        //Editar en tabla payment method
        Functions.break_time(driver,6,500);
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_ed_e_currency_table", getElements("mercant_ed_e_currency_table")}, //element to click
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_ed_b_ed_currency_and_payment_methods", getElements("mercant_ed_b_ed_currency_and_payment_methods")}, //element to click
                new String[]{"mercant_ed_lov_payment_method", getElements("mercant_ed_lov_payment_method")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_ed_lov_payment_method", getElements("mercant_ed_lov_payment_method")}, //element to click
                new String[]{"mercant_ed_e_payment_method_pass", getElements("mercant_ed_e_payment_method_pass")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.insertInput(driver, new String[]{"mercant_add_lov_payment_method_i_payment_methood", getElements("mercant_add_lov_payment_method_i_payment_methood")},
                "ed_payment2", data.getData().get("payment2"), " on EDIT")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"mercant_add_lov_payment_method_b_search", getElements("mercant_add_lov_payment_method_b_search")}, //search button
                new String[]{"mercant_ed_e_payment_method_code", getElements("mercant_ed_e_payment_method_code")}, //result element
                " on ADD")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_ed_e_payment_method_code", getElements("mercant_ed_e_payment_method_code")}, //element to click
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_ed_e_payment_method_pass", getElements("mercant_ed_e_payment_method_pass")}, //element to click
                new String[]{"mercant_ed_e_payment_method_description", getElements("mercant_ed_e_payment_method_description")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_ed_lov_payment_method_b_ok", getElements("mercant_ed_lov_payment_method_b_ok")}, //element to click
                new String[]{"mercant_ed_lov_payment_method", getElements("mercant_ed_lov_payment_method")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_ed_b_save_currency_and_payment_methods", getElements("mercant_ed_b_save_currency_and_payment_methods")}, //element to click
                new String[]{"mercant_ed_b_save", getElements("mercant_ed_b_save")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.simpleClick(driver,
                new String[]{"mercant_ed_e_currency_table",getElements("mercant_ed_e_currency_table")}, //element to click
                " on ADD")){
            return false;
        }
        Functions.break_time(driver,6,500);
     /*   if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_delete_currenzy_and_payment_method", getElements("mercant_add_b_delete_currenzy_and_payment_method")}, //element to click
                new String[]{"mercant_add_b_delete_currenzy_and_payment_method_yes", getElements("mercant_add_b_delete_currenzy_and_payment_method_yes")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver,6,500);
        if (!Functions.checkClick(driver,
                new String[]{"mercant_add_b_delete_currenzy_and_payment_method_yes", getElements("mercant_add_b_delete_currenzy_and_payment_method_yes")}, //element to click
                new String[]{"mercant_add_b_save", getElements("mercant_add_b_save")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }*/

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"mercant_add_b_save", getElements("mercant_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }

        return true;
    }
}
