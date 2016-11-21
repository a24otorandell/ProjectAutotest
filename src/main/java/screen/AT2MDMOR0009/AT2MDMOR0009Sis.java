package screen.AT2MDMOR0009;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 16/11/2016.
 */
public class AT2MDMOR0009Sis {
    protected AT2MDMOR0009Locators locators;
    protected AT2MDMOR0009Data data;

    public AT2MDMOR0009Sis() {
    }
    public AT2MDMOR0009Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0009Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0009Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0009Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Offices e-mail");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!data_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_oe_MDM(driver)) return false;
        if (!qbe_oe_MDM(driver)) return false;
        if (!others_actions_oe_MDM(driver)) return false;
        if (!interaction_record_em_MDM(driver)) return false;
        if (!qbe_em_record_MDM(driver)) return false;
        if (!interaction_edit_em_MDM(driver)) return false;
        if (!qbe_em_edit_MDM(driver)) return false;
        if (!others_actions_em_MDM(driver)) return false;
        if (!delete_em_MDM(driver)) return false;
        //NO SE PUEDEN BORRAR REGISTROS DE LA PRIMERA TABLA POR ESTAR LIGADOS A OTRAS PANTALLAS
        //if (!delete_oe_MDM(driver)) return false;
        return false;
    }

    /* LOS DOS PRIMEROS REGISTROS QUE APARECEN AL EJECUTAR EL CÓDIGO NO ESTÁN EN TEST NORMAL, ASÍ QUE SE HA DE
    SELECCIONAR EL TERCERO PARA QUE LA BÚSQUEDA ARROJE RESULTADOS */
    private boolean data_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on DATA";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_oe_e_result", getElements("MDM_oe_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_company_result", getElements("search_e_company_result")}, // element path
                "company_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_company_description_result", getElements("search_e_company_description_result")}, // element path
                "company_description_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_code_result", getElements("search_e_code_result")}, // element path
                "code_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_code_description_result", getElements("search_e_code_description_result")}, // element path
                "code_description_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getAttr(driver, new String[]{"search_e_one_suppl_result", getElements("search_e_one_suppl_result")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "one_suppl_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_payable_name_result", getElements("search_e_payable_name_result")}, // element path
                "payable_name_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_long_payable_name_result", getElements("search_e_long_payable_name_result")}, // element path
                "long_payable_name_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_i_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company_result"), // value to search
                "company", //name of the d
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_code", getElements("search_lov_code")}, //LoV button
                new String[]{"search_i_code", getElements("search_i_code")}, //external LoV input
                new String[]{"search_i_code_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("code_result"), // value to search
                "code", //name of the d
                where)) {
            return false;
        }
        //EL VALOR QUE APARECE EN EL RESULTADO NO ES EL MISMO QUE EL QUE SALE POR DEFECTO ASÍ QUE SE INTRODUCE MANUALMENTE
        if (!Functions.insertInput(driver, new String[]{"search_i_code_description", getElements("search_i_code_description")},
                "code_description", "ИСПАНИЯ", where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        boolean checkbox;
        if (getData("one_suppl_result").equalsIgnoreCase("checked")) {
            checkbox = true;
        }
        else {
            checkbox = false;
        }
        if(!Functions.checkboxValue(driver, getElements("search_cb_one_suppl"),
                "one_suppl", checkbox, true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (getData("payable_name_result").trim().isEmpty()) {
            if (!Functions.insertInput(driver, new String[]{"search_i_payable_name", getElements("search_i_payable_name")}, // element path
                    "payable_name", "", where)) {
                return false;
            }
        }
        else {
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_payable_name", getElements("search_lov_payable_name")}, //LoV button
                    new String[]{"search_i_payable_name", getElements("search_i_payable_name")}, //external LoV input
                    new String[]{"search_i_payable_name_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    getData("payable_name_result"), // value to search
                    "payable_name", //name of the d
                    where)) {
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        if (getData("long_payable_name_result").trim().isEmpty()) {
            if (!Functions.insertInput(driver, new String[]{"search_i_long_payable_name", getElements("search_i_long_payable_name")}, // element path
                    "long_payable_name", "", where)) {
                return false;
            }
        }
        else {
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_long_payable_name", getElements("search_lov_long_payable_name")}, //LoV button
                    new String[]{"search_i_long_payable_name", getElements("search_i_long_payable_name")}, //external LoV input
                    new String[]{"search_i_long_payable_name_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    getData("long_payable_name_result"), // value to search
                    "long_payable_name", //name of the d
                    where)) {
                return false;
            }
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_oe_e_result", getElements("MDM_oe_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_oe_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_oe_e_result", getElements("MDM_oe_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_oe_b_edit", getElements("MDM_oe_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_oe_cb_one_suppl"),
                    "one_suppl", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_oe_cb_one_suppl"),
                    "one_suppl", false, true,
                    where)){
                return false;
            }
        }
        if (randomBoolean == "Yes") {
            if (!Functions.createLov(driver,
                    new String[]{"add_oe_lov_payable_name", getElements("add_oe_lov_payable_name")}, // b_lov
                    new String[]{"add_oe_i_payable_name", getElements("add_oe_i_payable_name")}, // i_lov
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_altresult, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "payable_name", //Data name
                    where)){
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"add_oe_lov_long_payable_name", getElements("add_oe_lov_long_payable_name")}, // b_lov
                    new String[]{"add_oe_i_long_payable_name", getElements("add_oe_i_long_payable_name")}, // i_lov
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_altresult, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "long_payable_name", //Data name
                    where)){
                return false;
            }
        }
        else {
            if (!Functions.getText(driver, new String[]{"add_oe_i_payable_name", getElements("add_oe_i_payable_name")}, // element path
                    "payable_name", // key for data value (the name)
                    where)) {
                return false; // where this operation occurs
            }
            if (!Functions.getText(driver, new String[]{"add_oe_i_long_payable_name", getElements("add_oe_i_long_payable_name")}, // element path
                    "long_payable_name", // key for data value (the name)
                    where)) {
                return false; // where this operation occurs
            }
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_ext_supplier_email", getElements("add_oe_i_ext_supplier_email")}, // element path
                "ext_supplier_email", getData("ext_supplier_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_hotelbeds_email", getElements("add_oe_i_hotelbeds_email")}, // element path
                "hotelbeds_email", getData("hotelbeds_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_suppliers_web_email", getElements("add_oe_i_suppliers_web_email")}, // element path
                "suppliers_web_email", getData("suppliers_web_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_groups_email", getElements("add_oe_i_groups_email")}, // element path
                "groups_email", getData("groups_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_warning_allot_email", getElements("add_oe_i_warning_allot_email")}, // element path
                "warning_allot_email", getData("warning_allot_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_proforma_web_email", getElements("add_oe_i_proforma_web_email")}, // element path
                "proforma_web_email", getData("proforma_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_hotelbeds_offer_email", getElements("add_oe_i_hotelbeds_offer_email")}, // element path
                "hotelbeds_offer_email", getData("hotelbeds_offers_email_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_email_stop_sale_notification", getElements("add_oe_i_email_stop_sale_notification")}, // element path
                "stop_sale_notification", getData("email_stop_sale_notification_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_email_grace_period_expenses", getElements("add_oe_i_email_grace_period_expenses")}, // element path
                "email_grace_period_expenses", getData("email_grace_period_expenses_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_mail_sender_to_hotel", getElements("add_oe_i_mail_sender_to_hotel")}, // element path
                "mail_sender_to_hotel", getData("mail_sender_to_hotel_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_mail_sender_to_OS_suppl", getElements("add_oe_i_mail_sender_to_OS_suppl")}, // element path
                "mail_sender_to_OS_suppl", getData("mail_sender_to_OS_suppl_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_transfers_email", getElements("add_oe_i_transfers_email")}, // element path
                "transfers_email", getData("transfers_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_change_GPS_zone_email", getElements("add_oe_i_change_GPS_zone_email")}, // element path
                "change_GPS_zone_email", getData("change_GPS_zone_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_oe_i_ext_supp_phone", getElements("add_oe_i_ext_supp_phone")}, // element path
                "ext_supp_phone", getData("ext_supp_phone_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_oe_b_save", getElements("add_oe_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_oe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_oe_b_qbe", getElements("MDM_oe_b_qbe")},// query button
                new String[]{"qbe_oe_i_company", getElements("qbe_oe_i_company")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_oe_i_company", getElements("qbe_oe_i_company")},
                "company", getData("company_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_oe_i_company_description", getElements("qbe_oe_i_company_description")},
                "company_description", getData("company_description_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_oe_i_code", getElements("qbe_oe_i_code")},
                "code", getData("code_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_oe_i_code_description", getElements("qbe_oe_i_code_description")},
                "code_description", getData("code_description_result"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_oe_sl_one_suppl", getElements("qbe_oe_sl_one_suppl")},
                getData("one_suppl"), "one_suppl",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_oe_i_payable_name", getElements("qbe_oe_i_payable_name")},
                "payable_name", getData("payable_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_oe_i_long_payable_name", getElements("qbe_oe_i_long_payable_name")},
                "long_payable_name", getData("long_payable_name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_oe_i_company", getElements("qbe_oe_i_company")}, //search button
                new String[]{"MDM_oe_e_result", getElements("MDM_oe_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_oe_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_oe_b_actions", getElements("MDM_oe_b_actions")}, //actions button
                new String[]{"MDM_oe_b_actions_audit_data", getElements("MDM_oe_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_oe_b_detach", getElements("MDM_oe_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_em_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_em_b_add", getElements("MDM_em_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        //VALOR HARDCODEADO PORQUE SÓLO GUARDA LOS REGISTROS CON DICHO VALOR
        if (!Functions.createLovByValue(driver,
                new String[]{"add_em_lov_mail_type", getElements("add_em_lov_mail_type")}, //LoV button
                new String[]{"add_em_i_mail_type", getElements("add_em_i_mail_type")}, //external LoV input
                new String[]{"Add_em_i_mail_type_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "HR", // value to search
                "mail_type", //name of the d
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_em_lov_business",getElements("add_em_lov_business")}, // b_lov
                new String[]{"add_em_i_business", getElements("add_em_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_em_e_business_description", getElements("add_em_e_business_description")}, // element path
                "business_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_em_i_mail_address", getElements("add_em_i_mail_address")}, // element path
                "mail_address", getData("mail_address"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_em_b_save", getElements("add_em_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_em_e_mail_type_description", getElements("add_em_e_mail_type_description")}, // element path
                "mail_type_description", // key for data value (the name)
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_em_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_em_e_result", getElements("MDM_em_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_em_b_edit", getElements("MDM_em_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_em_lov_mail_type", getElements("add_em_lov_mail_type")}, //LoV button
                new String[]{"add_em_i_mail_type", getElements("add_em_i_mail_type")}, //external LoV input
                new String[]{"Add_em_i_mail_type_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "HR", // value to search
                "mail_type", //name of the d
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_em_e_mail_type_description", getElements("add_em_e_mail_type_description")}, // element path
                "mail_type_description", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_em_lov_business",getElements("add_em_lov_business")}, // b_lov
                new String[]{"add_em_i_business", getElements("add_em_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_em_e_business_description", getElements("add_em_e_business_description")}, // element path
                "business_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_em_i_mail_address", getElements("add_em_i_mail_address")}, // element path
                "mail_address", getData("mail_address_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_em_b_save", getElements("add_em_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_em_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_em_b_qbe", getElements("MDM_em_b_qbe")},// query button
                new String[]{"qbe_em_i_mail_type", getElements("qbe_em_i_mail_type")},//any query input
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_mail_type", getElements("qbe_em_i_mail_type")},
                "mail_type", getData("mail_type"), where)) {
            return false;
        }
        //EL VALOR CAMBIANTE NO SE GUARDA AL CREAR ASÍ QUE HAY QUE INTRODUCIRLO MANUALMENTE
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_mail_type_description", getElements("qbe_em_i_mail_type_description")},
                "mail_type_description", "Sender Mail Hotel", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_business", getElements("qbe_em_i_business")},
                "business", getData("business"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_business_description", getElements("qbe_em_i_business_description")},
                "business_description", getData("business_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_mail_address", getElements("qbe_em_i_mail_address")},
                "mail_address", getData("mail_address"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_em_i_mail_type", getElements("qbe_em_i_mail_type")}, //search button
                new String[]{"MDM_em_e_result", getElements("MDM_em_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_em_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_em_b_qbe", getElements("MDM_em_b_qbe")},// query button
                new String[]{"qbe_em_i_mail_type", getElements("qbe_em_i_mail_type")},//any query input
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_mail_type", getElements("qbe_em_i_mail_type")},
                "mail_type", getData("mail_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_mail_type_description", getElements("qbe_em_i_mail_type_description")},
                "mail_type_description", getData("mail_type_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_business", getElements("qbe_em_i_business")},
                "business", getData("business"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_business_description", getElements("qbe_em_i_business_description")},
                "business_description", getData("business_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_em_i_mail_address", getElements("qbe_em_i_mail_address")},
                "mail_address", getData("mail_address"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_em_i_mail_type", getElements("qbe_em_i_mail_type")}, //search button
                new String[]{"MDM_em_e_result", getElements("MDM_em_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_em_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_em_b_detach", getElements("MDM_em_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_em_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_em_b_delete", getElements("MDM_em_b_delete")},
                new String[]{"MDM_em_e_records", getElements("MDM_em_e_records")},
                new String[]{"MDM_em_b_delete_ok", getElements("MDM_em_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_oe_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_oe_b_delete", getElements("MDM_oe_b_delete")},
                new String[]{"MDM_oe_e_records", getElements("MDM_oe_e_records")},
                new String[]{"MDM_oe_b_delete_ok", getElements("MDM_oe_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
}
