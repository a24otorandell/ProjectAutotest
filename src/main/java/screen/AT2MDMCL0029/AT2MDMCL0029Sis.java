package screen.AT2MDMCL0029;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 03/11/2016.
 */
public class AT2MDMCL0029Sis {
    protected AT2MDMCL0029Locators locators;
    protected AT2MDMCL0029Data data;
    public AT2MDMCL0029Sis() {
    }
    public AT2MDMCL0029Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0029Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0029Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0029Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Agency 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!interaction_add_branch(driver)) return false;
        if (!qbe_branch(driver)) return false;
        if (!interaction_edit_branch(driver)) return false;
        if (!qbe_branch(driver)) return false;
        if (!others_actions_branch(driver)) return false;
        if (!interaction_add_currency(driver)) return false;
        if (!qbe_currency(driver)) return false;
        if (!interaction_edit_currency(driver)) return false;
        if (!qbe_currency(driver)) return false;
        if (!others_actions_currency(driver)) return false;
        if (!delete_currency(driver)) return false;
        if (!delete_branch(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    /**
     * TABLE AGENCY
     * @param driver
     * @return
     */
    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION AGENCY", 3, false);
        String where = " ADD AGENCY";
        Functions.break_time(driver, 3, 700);
        if (!Functions.checkClick(driver,
                new String[]{"agency_b_add", getElements("agency_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_partner",getElements("add_lov_partner")}, // b_lov
                new String[]{"add_i_partner", getElements("add_i_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "partner", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_partner_des", getElements("add_i_partner_des")}, // element path
                "p_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name", getElements("add_i_short_name")},
                "short", DataGenerator.getRandomAlphanumericSequence(12, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency_name", getElements("add_i_agency_name")},
                "a_name", DataGenerator.getRandomAlphanumericSequence(12, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_external_agency_code", getElements("add_i_external_agency_code")},
                "e_name", DataGenerator.getRandomAlphanumericSequence(2, true), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_group_code",getElements("add_lov_group_code")}, // b_lov
                new String[]{"add_i_group_code", getElements("add_i_group_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_group_desc", getElements("add_i_group_desc")}, // element path
                "g_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language",getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_classification",getElements("add_sl_classification")},
                "Normal", "classification", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_booking_currency",getElements("add_lov_booking_currency")}, // b_lov
                new String[]{"add_i_booking_currency", getElements("add_i_booking_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "booking", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_invoice_currency",getElements("add_lov_invoice_currency")}, // b_lov
                new String[]{"add_i_invoice_currency", getElements("add_i_invoice_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "invoice", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_stop"),"stop",true,true, where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_credit",getElements("add_sl_credit")},
                "Credit", "credit", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_credit_amount", getElements("add_i_credit_amount")},
                "amount", DataGenerator.randomFloat(1,3), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_credit_currency",getElements("add_lov_credit_currency")}, // b_lov
                new String[]{"add_i_credit_currency", getElements("add_i_credit_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "credit_c", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_tax", getElements("add_i_tax")},
                "tax", DataGenerator.randomFloat(1,3), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tax_percentage", getElements("add_i_tax_percentage")},
                "tax_p", DataGenerator.randomFloat(1,3), where)) {
            return false;
        }
/*        if(!Functions.getText(driver,new String[]{"add_i_agency", getElements("add_i_agency")}, // element path
                "agency", // key for data value (the name)
                where)){return false;}*/
        if(!Functions.getAttr(driver,new String[]{"add_i_agency", getElements("add_i_agency")}, // element path
                "value",
                "agency", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_street", getElements("add_i_street")},
                "street", DataGenerator.getRandomAlphanumericSequence(12, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_town", getElements("add_i_town")},
                "town", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_zip_code", getElements("add_i_zip_code")},
                "zip", String.valueOf(DataGenerator.random(00000,99999)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_country",getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_country_des", getElements("add_i_country_des")}, // element path
                "country_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_telephone", getElements("add_i_telephone")},
                "phone", String.valueOf(DataGenerator.random(111111111,999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fax", getElements("add_i_fax")},
                "fax", String.valueOf(DataGenerator.random(111111111,999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_email", getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(5, false) +"@mail.es", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH AGENCY";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_partner", getElements("search_lov_partner")}, //LoV button
                new String[]{"search_i_partner", getElements("search_i_partner")}, //external LoV input
                new String[]{"search_lov_par_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("partner"), // value to search
                "partner", //name of the data
                where)){return false;}
/*        if (!Functions.insertInput(driver, new String[]{"search_i_partner_des", getElements("search_i_partner_des")},
                "p_desc", getData("p_desc"), where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"search_i_short_name", getElements("search_i_short_name")},
                "short", getData("short"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_agency_name", getElements("search_i_agency_name")},
                "a_name", getData("a_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_external_agency_code", getElements("search_i_external_agency_code")},
                "e_name", getData("e_name"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_group_code", getElements("search_lov_group_code")}, //LoV button
                new String[]{"search_i_group_code", getElements("search_i_group_code")}, //external LoV input
                new String[]{"search_lov_group_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("group"), // value to search
                "group", //name of the data
                where)){return false;}
/*        if (!Functions.insertInput(driver, new String[]{"search_i_group_des", getElements("search_i_group_des")},
                "g_desc", getData("g_desc"), where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_language", getElements("search_lov_language")}, //LoV button
                new String[]{"search_i_language", getElements("search_i_language")}, //external LoV input
                new String[]{"search_lov_lang_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("lang"), // value to search
                "lang", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_classification",getElements("search_sl_classification")},
                getData("classification"), "classification", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_booking_currency", getElements("search_lov_booking_currency")}, //LoV button
                new String[]{"search_i_booking_currency", getElements("search_i_booking_currency")}, //external LoV input
                new String[]{"search_lov_book_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("booking"), // value to search
                "booking", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_invoice_currency", getElements("search_lov_invoice_currency")}, //LoV button
                new String[]{"search_i_invoice_currency", getElements("search_i_invoice_currency")}, //external LoV input
                new String[]{"search_lov_invoice_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("invoice"), // value to search
                "invoice", //name of the data
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_stop"),"stop",true,true, where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_credit",getElements("search_sl_credit")},
                getData("credit"), "credit", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_credit_amount", getElements("search_i_credit_amount")},
                "amount", getData("amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_credit_currency", getElements("search_i_credit_currency")},
                "credit_c", getData("credit_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tax", getElements("search_i_tax")},
                "tax", getData("tax"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_tax_percentage", getElements("search_i_tax_percentage")},
                "tax_p", getData("tax_p"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_agency", getElements("search_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"agency_e_result", getElements("agency_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION AGENCY";
        if (!Functions.checkClick(driver,
                new String[]{"agency_b_edit", getElements("agency_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credit_amount", getElements("add_i_credit_amount")},
                "amount", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credit_currency", getElements("add_i_credit_currency")},
                "credit_c", "", where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_partner",getElements("add_lov_partner")}, // b_lov
                new String[]{"add_i_partner", getElements("add_i_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "partner", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_partner_des", getElements("add_i_partner_des")}, // element path
                "p_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name", getElements("add_i_short_name")},
                "short", DataGenerator.getRandomAlphanumericSequence(12, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency_name", getElements("add_i_agency_name")},
                "a_name", DataGenerator.getRandomAlphanumericSequence(12, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_external_agency_code", getElements("add_i_external_agency_code")},
                "e_name", DataGenerator.getRandomAlphanumericSequence(2, true), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_group_code",getElements("add_lov_group_code")}, // b_lov
                new String[]{"add_i_group_code", getElements("add_i_group_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_group_desc", getElements("add_i_group_desc")}, // element path
                "g_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language",getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_classification",getElements("add_sl_classification")},
                "Good", "classification", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_booking_currency",getElements("add_lov_booking_currency")}, // b_lov
                new String[]{"add_i_booking_currency", getElements("add_i_booking_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "booking", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_invoice_currency",getElements("add_lov_invoice_currency")}, // b_lov
                new String[]{"add_i_invoice_currency", getElements("add_i_invoice_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "invoice", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_stop"),"stop",false,true, where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_credit",getElements("add_sl_credit")},
                "Prepaid", "credit", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_tax", getElements("add_i_tax")},
                "tax", DataGenerator.randomFloat(1,3), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_tax_percentage", getElements("add_i_tax_percentage")},
                "tax_p", DataGenerator.randomFloat(1,3), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_street", getElements("add_i_street")},
                "street", DataGenerator.getRandomAlphanumericSequence(12, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_town", getElements("add_i_town")},
                "town", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_zip_code", getElements("add_i_zip_code")},
                "zip", String.valueOf(DataGenerator.random(00000,99999)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_country",getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_country_des", getElements("add_i_country_des")}, // element path
                "country_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_telephone", getElements("add_i_telephone")},
                "phone", String.valueOf(DataGenerator.random(111111111,999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fax", getElements("add_i_fax")},
                "fax", String.valueOf(DataGenerator.random(111111111,999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_email", getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(5, false) +"@mail.es", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE AGENCY";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"agency_e_result", getElements("agency_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"agency_b_qbe", getElements("agency_b_qbe")},// query button
                new String[]{"qbe_i_partner", getElements("qbe_i_partner")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_partner", getElements("qbe_i_partner")},
                "partner", getData("partner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_partner_des", getElements("qbe_i_partner_des")},
                "p_desc", getData("p_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")},
                "short", getData("short"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency_name", getElements("qbe_i_agency_name")},
                "a_name", getData("a_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_external_agency_code", getElements("qbe_i_external_agency_code")},
                "e_name", getData("e_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group_code", getElements("qbe_i_group_code")},
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group_desc", getElements("qbe_i_group_desc")},
                "g_desc", getData("g_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "lang", getData("lang"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_classification",getElements("qbe_sl_classification")},
                getData("classification"), "classification", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_currency", getElements("qbe_i_booking_currency")},
                "booking", getData("booking"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_invoice_currency", getElements("qbe_i_invoice_currency")},
                "invoice", getData("invoice"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_stop",getElements("qbe_sl_stop")},
                getData("stop"), "stop", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_credit",getElements("qbe_sl_credit")},
                getData("credit"), "credit", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"qbe_i_credit_amount", getElements("qbe_i_credit_amount")},
                "amount", getData("amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_credit_currency", getElements("qbe_i_credit_currency")},
                "credit_c", getData("credit_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_tax", getElements("qbe_i_tax")},
                "tax", getData("tax"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_tax_percentage", getElements("qbe_i_tax_percentage")},
                "tax_p", getData("tax_p"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_partner", getElements("qbe_i_partner")}, //any query input
                new String[]{"agency_e_result", getElements("agency_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA AGENCY";
        if (!Functions.auditData(driver,
                new String[]{"agency_b_actions", getElements("agency_b_actions")}, //actions button
                new String[]{"agency_b_actions_audit_data", getElements("agency_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH AGENCY";
        if (!Functions.detachTable(driver,
                new String[]{"agency_b_detach", getElements("agency_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA AGENCY";
/*        if (!Functions.doDeleteNCheck(driver,
                new String[]{"agency_b_delete", getElements("agency_b_delete")},
                new String[]{"agency_e_records", getElements("agency_e_records")},
                where)){
            return false;
        }*/
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"agency_b_delete", getElements("agency_b_delete")}, //button delete
                new String[]{"agency_e_records", getElements("agency_e_records")}, // result
                new String[]{"agency_b_delete_yes", getElements("agency_b_delete_yes")}, //delete button yes
                where)){return false;}
        return true;
    }

    /**
     * TAB BRANCH - TABLE BRANCH
     * @param driver
     * @return
     */
    public boolean interaction_add_branch(TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD BRANCH";
        if (!Functions.simpleClick(driver,
                new String[]{"branch_tab", getElements("branch_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"branch_b_add", getElements("branch_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_short_name", getElements("b_add_i_short_name")},
                "short2", DataGenerator.getRandomAlphanumericSequence(12, true), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("b_add_ck_stop"),"stop2",true,true, where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"b_add_i_abta", getElements("b_add_i_abta")},
                "abta", DataGenerator.getRandomAlphanumericSequence(3, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_name", getElements("b_add_i_name")},
                "branch_name", DataGenerator.getRandomAlphanumericSequence(2, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_street", getElements("b_add_i_street")},
                "b_street", DataGenerator.getRandomAlphanumericSequence(12, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_town", getElements("b_add_i_town")},
                "b_town", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_zip", getElements("b_add_i_zip")},
                "b_zip", String.valueOf(DataGenerator.random(00000,99999)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"b_add_lov_country",getElements("b_add_lov_country")}, // b_lov
                new String[]{"b_add_i_country", getElements("b_add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "b_country", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"b_add_i_phone", getElements("b_add_i_phone")},
                "phone", String.valueOf(DataGenerator.random(111111111, 999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_fax", getElements("b_add_i_fax")},
                "fax", String.valueOf(DataGenerator.random(111111111, 999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_mail", getElements("b_add_i_mail")},
                "mail", DataGenerator.getRandomAlphanumericSequence(5,false)+"@mail.com", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_add_b_save", getElements("b_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_branch(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION BRANCH";
        if (!Functions.checkClick(driver,
                new String[]{"branch_b_edit", getElements("branch_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"b_add_i_short_name", getElements("b_add_i_short_name")},
                "short2", DataGenerator.getRandomAlphanumericSequence(12, true), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("b_add_ck_stop"),"stop2",false,true, where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"b_add_i_abta", getElements("b_add_i_abta")},
                "abta", DataGenerator.getRandomAlphanumericSequence(3, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_name", getElements("b_add_i_name")},
                "branch_name", DataGenerator.getRandomAlphanumericSequence(2, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_street", getElements("b_add_i_street")},
                "b_street", DataGenerator.getRandomAlphanumericSequence(12, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_town", getElements("b_add_i_town")},
                "b_town", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_zip", getElements("b_add_i_zip")},
                "b_zip", String.valueOf(DataGenerator.random(00000,99999)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"b_add_lov_country",getElements("b_add_lov_country")}, // b_lov
                new String[]{"b_add_i_country", getElements("b_add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "b_country", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"b_add_i_phone", getElements("b_add_i_phone")},
                "phone", String.valueOf(DataGenerator.random(111111111, 999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_fax", getElements("b_add_i_fax")},
                "fax", String.valueOf(DataGenerator.random(111111111, 999999999)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_add_i_mail", getElements("b_add_i_mail")},
                "mail", DataGenerator.getRandomAlphanumericSequence(5,false)+"@mail.com", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_add_b_save", getElements("b_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_branch(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE BRANCH";
/*        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"agency_e_result", getElements("agency_e_result")}, //result element
                where)) {
            return false;
        }*/
        if (!Functions.clickQbE(driver,
                new String[]{"branch_b_qbe", getElements("branch_b_qbe")},// query button
                new String[]{"b_qbe_i_short_name", getElements("b_qbe_i_short_name")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"b_qbe_i_short_name", getElements("b_qbe_i_short_name")},
                "short2", getData("short2"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"b_qbe_sl_stop",getElements("b_qbe_sl_stop")},
                getData("stop2"), "stop2", where)){return false;}
/*        if (!Functions.clickSearchAndResult(driver,
                new String[]{"b_qbe_i_short_name", getElements("b_qbe_i_short_name")}, //search button
                new String[]{"branch_e_result", getElements("branch_e_result")}, //result element
                where)) {
            return false;
        }*/
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"b_qbe_i_short_name", getElements("b_qbe_i_short_name")}, //any query input
                new String[]{"branch_e_result", getElements("branch_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_branch(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA BRANCH";
        if (!Functions.auditData(driver,
                new String[]{"branch_b_actions", getElements("branch_b_actions")}, //actions button
                new String[]{"branch_b_actions_audit_data", getElements("branch_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH BRANCH";
        if (!Functions.detachTable(driver,
                new String[]{"branch_b_detach", getElements("branch_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_branch(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA BRANCH";
        Functions.zoomOut(driver);
        if (!Functions.simpleClick(driver,
                new String[]{"branch_tab", getElements("branch_tab")}, //element to click
                where)){return false;}
/*        if (!Functions.doDeleteNCheck(driver,
                new String[]{"branch_b_delete", getElements("branch_b_delete")},
                new String[]{"branch_e_records", getElements("branch_e_records")},
                where)){
            return false;
        }*/
        if(!Functions.doDelete(driver,
                new String[]{"branch_b_delete", getElements("branch_b_delete")},//delete button
                new String[]{"delete_yes", recursiveXPaths.delete_b_yes},//delete button
                where)){return false;}
        return true;
    }

    /**
     * TAB CURRENCIES - TABLE CURRENCIES
     * @param driver
     * @return
     */
    public boolean interaction_add_currency(TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD CURRENCY";
        if (!Functions.simpleClick(driver,
                new String[]{"currencies_tab", getElements("currencies_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"currencies_b_add", getElements("currencies_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"c_add_lov_country",getElements("c_add_lov_country")}, // b_lov
                new String[]{"c_add_i_country", getElements("c_add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "c_country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"c_add_i_country_des", getElements("c_add_i_country_des")}, // element path
                "con_des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"c_add_lov_destination",getElements("c_add_lov_destination")}, // b_lov
                new String[]{"c_add_i_destination", getElements("c_add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"c_add_i_destination_des", getElements("c_add_i_destination_des")}, // element path
                "dest_des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"c_add_lov_currency",getElements("c_add_lov_currency")}, // b_lov
                new String[]{"c_add_i_currency", getElements("c_add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"c_add_i_currency_des", getElements("c_add_i_currency_des")}, // element path
                "curre_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"c_add_b_save", getElements("c_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_currency(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION CURRENCY";
        if (!Functions.checkClick(driver,
                new String[]{"currencies_b_edit", getElements("currencies_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"c_add_lov_country",getElements("c_add_lov_country")}, // b_lov
                new String[]{"c_add_i_country", getElements("c_add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "c_country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"c_add_i_country_des", getElements("c_add_i_country_des")}, // element path
                "con_des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"c_add_lov_destination",getElements("c_add_lov_destination")}, // b_lov
                new String[]{"c_add_i_destination", getElements("c_add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"c_add_i_destination_des", getElements("c_add_i_destination_des")}, // element path
                "dest_des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"c_add_lov_currency",getElements("c_add_lov_currency")}, // b_lov
                new String[]{"c_add_i_currency", getElements("c_add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"c_add_i_currency_des", getElements("c_add_i_currency_des")}, // element path
                "curre_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"c_add_b_save", getElements("c_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_currency(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE CURRENCY";
/*        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"agency_e_result", getElements("agency_e_result")}, //result element
                where)) {
            return false;
        }*/
        if (!Functions.clickQbE(driver,
                new String[]{"currencies_b_qbe", getElements("currencies_b_qbe")},// query button
                new String[]{"c_qbe_i_country", getElements("c_qbe_i_country")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"c_qbe_i_country", getElements("c_qbe_i_country")},
                "c_country", getData("c_country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"c_qbe_i_country_des", getElements("c_qbe_i_country_des")},
                "con_des", getData("con_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"c_qbe_i_destination", getElements("c_qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"c_qbe_i_destination_des", getElements("c_qbe_i_destination_des")},
                "dest_des", getData("dest_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"c_qbe_i_currency", getElements("c_qbe_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"c_qbe_i_currency_des", getElements("c_qbe_i_currency_des")},
                "curre_des", getData("curre_des"), where)) {
            return false;
        }
/*        if (!Functions.clickSearchAndResult(driver,
                new String[]{"c_qbe_i_country", getElements("c_qbe_i_country")}, //search button
                new String[]{"currencies_e_result", getElements("currencies_e_result")}, //result element
                where)) {
            return false;
        }*/
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"c_qbe_i_country", getElements("c_qbe_i_country")}, //any query input
                new String[]{"currencies_e_result", getElements("currencies_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_currency(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA CURRENCY";
        if (!Functions.auditData(driver,
                new String[]{"currencies_b_actions", getElements("currencies_b_actions")}, //actions button
                new String[]{"currencies_b_actions_audit_data", getElements("currencies_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH CURRENCY";
        if (!Functions.detachTable(driver,
                new String[]{"currencies_b_detach", getElements("currencies_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_currency(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA CURRENCY";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"currencies_b_delete", getElements("currencies_b_delete")},
                new String[]{"currencies_e_records", getElements("currencies_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
