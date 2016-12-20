package screen.AT2MDMCL0007;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0007Sis {
    protected AT2MDMCL0007Locators locators;
    protected AT2MDMCL0007Data data;
    public AT2MDMCL0007Sis() {
    }
    public AT2MDMCL0007Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0007Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0007Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0007Data data) {
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
        if (!interaction_add(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!qbeHard(driver)) return false;
        if (!historicActions(driver)) return false;
/*        if (!getData(driver)) return false;
        if (!qbeHistoric(driver)) return false;*/
        if (!others_actionsHistoric(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClick(driver,
                new String[]{"user_b_add", getElements("user_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_internal_user", getElements("add_i_internal_user")},
                "internal", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_surname", getElements("add_i_surname")},
                "surname", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver, 10, 800);
        if (!Functions.insertInput(driver, new String[]{"add_i_pass", getElements("add_i_pass")},
                "passd", String.valueOf(DataGenerator.random(1,2050)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_psw", getElements("add_i_psw")},
                "psw", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(2, 10), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_email", getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(5,false) + "@mail.es", where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to_agency",getElements("add_lov_to_agency")}, // b_lov
                new String[]{"add_i_to_agency", getElements("add_i_to_agency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_branch",getElements("add_lov_branch")}, // b_lov
                new String[]{"add_i_branch", getElements("add_i_branch")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        String list_options[] = {"Blocked", "Active", "Inactive"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_status", getElements("add_sl_status")},
                list_options, "status", where)){return false;}
        String list_options2[] = {"Read only", "Full access", "Modify and cancel"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_profile",getElements("add_sl_profile")},
                list_options2, "profile", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_super"),"super",true,true, where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web",getElements("add_lov_web")}, // b_lov
                new String[]{"add_i_web", getElements("add_i_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_default",getElements("add_lov_default")}, // b_lov
                new String[]{"add_i_default", getElements("add_i_default")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "default", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_client_xml"),"xml",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_client_html"),"html",true,true, where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")},
                "type", "E", where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_hotel",getElements("add_lov_hotel")}, // b_lov
                new String[]{"add_i_hotel", getElements("add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel",
                100, 700,//Data name
                where)){return false;}
        String list_options3[] = {"Test"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_subcategory",getElements("add_sl_subcategory")},
                list_options3, "sub", where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_user_id", getElements("add_e_user_id")}, // element path
                "id", // key for data value (the name)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_usu_login", getElements("add_i_usu_login")}, // element path
                "user_log", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_hotel_desc", getElements("add_i_hotel_desc")}, // element path
                "hotel_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_user", getElements("search_i_user")},
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_name", getElements("search_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_surname", getElements("search_i_surname")},
                "surname", getData("surname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_usu_login", getElements("search_i_usu_login")},
                "user_log", getData("user_log"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_password", getElements("search_i_password")},
                "passd", getData("passd"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_psw", getElements("search_i_psw")},
                "psw", getData("psw"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_mail", getElements("search_i_mail")},
                "mail", getData("mail"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_to_agency", getElements("search_lov_to_agency")}, //LoV button
                new String[]{"search_i_to_agency", getElements("search_i_to_agency")}, //external LoV input
                new String[]{"search_lov_to_agency_code", recursiveXPaths.lov_i_altgenericinput2}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "%"+getData("to"), // value to search
                "to", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_branch", getElements("search_lov_branch")}, //LoV button
                new String[]{"search_i_branch", getElements("search_i_branch")}, //external LoV input
                new String[]{"search_lov_branch_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("branch"), // value to search
                "branch", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_lang", getElements("search_lov_lang")}, //LoV button
                new String[]{"search_i_lang", getElements("search_i_lang")}, //external LoV input
                new String[]{"search_lov_lang_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("lang"), // value to search
                "lang", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_status",getElements("search_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_profile",getElements("search_sl_profile")},
                getData("profile"), "profile", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_web", getElements("search_lov_web")}, //LoV button
                new String[]{"search_i_web", getElements("search_i_web")}, //external LoV input
                new String[]{"search_lov_web_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("web"), // value to search
                "web", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_default", getElements("search_lov_default")}, //LoV button
                new String[]{"search_i_default", getElements("search_i_default")}, //external LoV input
                new String[]{"search_lov_default_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("default"), // value to search
                "default", //name of the data
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_super"),"super",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_xml"),"xml",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_html"),"html",true,true, where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_type", getElements("search_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        Functions.break_time(driver, 4, 600);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")}, //LoV button
                new String[]{"search_i_hotel", getElements("search_i_hotel")}, //external LoV input
                new String[]{"search_lov_hotel_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel"), // value to search
                "hotel", //name of the data
                where)){return false;}
        Functions.break_time(driver, 4, 600);
        if (!Functions.selectText(driver,
                new String[]{"search_sl_subcategory",getElements("search_sl_subcategory")},
                getData("sub"), "sub", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"user_e_result", getElements("user_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"user_b_edit", getElements("user_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")},
                "type", "I", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_surname", getElements("add_i_surname")},
                "surname", DataGenerator.getRandomAlphanumericSequence(8, false), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"add_i_pass", getElements("add_i_pass")},
                "passd", String.valueOf(DataGenerator.random(1,2050)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_psw", getElements("add_i_psw")},
                "psw", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(2, 10), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_email", getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(5,false) + "@mail.es", where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to_agency",getElements("add_lov_to_agency")}, // b_lov
                new String[]{"add_i_to_agency", getElements("add_i_to_agency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_branch",getElements("add_lov_branch")}, // b_lov
                new String[]{"add_i_branch", getElements("add_i_branch")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "branch", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        String list_options[] = {"Blocked", "Active", "Inactive"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_status", getElements("add_sl_status")},
                list_options, "status", where)){return false;}
        String list_options2[] = {"Read only", "Full access", "Modify and cancel"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_profile",getElements("add_sl_profile")},
                list_options2, "profile", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_super"),"super",false,true, where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web",getElements("add_lov_web")}, // b_lov
                new String[]{"add_i_web", getElements("add_i_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_default",getElements("add_lov_default")}, // b_lov
                new String[]{"add_i_default", getElements("add_i_default")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "default", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_client_xml"),"xml",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_client_html"),"html",false,true, where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_internal_user", getElements("add_i_internal_user")},
                "internal", DataGenerator.getRandomAlphanumericSequence(5,false), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_hotel",getElements("add_lov_hotel")}, // b_lov
                new String[]{"add_i_hotel", getElements("add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_user_id", getElements("add_e_user_id")}, // element path
                "id", // key for data value (the name)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_usu_login", getElements("add_i_usu_login")}, // element path
                "user_log", // key for data value (the name)
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if(!Functions.getText(driver,new String[]{"add_i_hotel_desc", getElements("add_i_hotel_desc")}, // element path
                "hotel_desc", // key for data value (the name)
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"add_i_internal_user", getElements("add_i_internal_user")},
                "internal", DataGenerator.getRandomAlphanumericSequence(5,false), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        String list_options3[] = {"Internal Cost", "DMC Accounts", "Internal Sales"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_subcategory",getElements("add_sl_subcategory")},
                list_options3, "sub", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"user_e_result", getElements("user_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //element to click
                where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"user_b_qbe", getElements("user_b_qbe")},// query button
                new String[]{"qbe_i_user_id", getElements("qbe_i_user_id")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user_id", getElements("qbe_i_user_id")},
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname", getElements("qbe_i_surname")},
                "surname", getData("surname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_usu_login", getElements("qbe_i_usu_login")},
                "user_log", getData("user_log"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_pass", getElements("qbe_i_pass")},
                "passd", getData("passd"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_psw", getElements("qbe_i_psw")},
                "psw", getData("psw"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_email", getElements("qbe_i_email")},
                "mail", getData("mail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_agency", getElements("qbe_i_to_agency")},
                "to", "%"+getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch", getElements("qbe_i_branch")},
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch_name", getElements("qbe_i_branch_name")},
                "branch_name", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel_desc", getData("hotel_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 200);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_status",getElements("qbe_sl_status")},
                getData("status"), "status", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_profile",getElements("qbe_sl_profile")},
                getData("profile"), "profile", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_super",getElements("qbe_sl_super")},
                getData("super"), "super", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web", getElements("qbe_i_web")},
                "web", getData("web"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_default_prof", getElements("qbe_i_default_prof")},
                "default", getData("default"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_client_xml",getElements("qbe_sl_client_xml")},
                getData("xml"), "xml", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_client_html",getElements("qbe_sl_client_html")},
                getData("html"), "html", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_internal_user", getElements("qbe_i_internal_user")},
                "internal", getData("internal"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_subcategory",getElements("qbe_sl_subcategory")},
                getData("sub"), "sub", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user_id", getElements("qbe_i_user_id")}, //any query input
                new String[]{"user_e_result", getElements("user_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"user_b_actions", getElements("user_b_actions")}, //actions button
                new String[]{"user_b_actions_b_audit", getElements("user_b_actions_b_audit")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"user_b_detach", getElements("user_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    public boolean qbeHard (TestDriver driver) {
        driver.getReport().addHeader("QBE HARD", 3, false);
        String where = "QBE HARD";
        if (!Functions.simpleClick(driver,
                new String[]{"user_qbe_reset", getElements("user_qbe_reset")}, //element to click
                "QBE RESET")){return false;}

        if (!Functions.insertInput(driver, new String[]{"qbe_i_user_id", getElements("qbe_i_user_id")},
                "id", "KVILIANIOT", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user_id", getElements("qbe_i_user_id")}, //any query input
                new String[]{"user_e_result", getElements("user_e_result")}, //table result
                where)){return false;}
        return true;
    }
    public boolean historicActions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS HISTORIC", 3, false);
        String where = " on OTHER HISTORIC";
        if (!Functions.checkClick(driver,
                new String[]{"user_b_actions", getElements("user_b_actions")}, //element to click
                new String[]{"user_b_actions_b_historic", getElements("user_b_actions_b_historic")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"user_b_actions_b_historic", getElements("user_b_actions_b_historic")},
                new String[]{"user_b_hist_close", getElements("user_b_hist_close")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
    public boolean getData (TestDriver driver) {
        String[] columns = {"user_p","start_d", "start_u", "end_d", "end_u"};
        if (!Functions.collectTableData(driver,columns,"//*[contains(@id, 'pc2:t7::db')]",1,"GET DATA"))return false;
        return true;
    }
    private boolean qbeHistoric (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickQbE(driver,
                new String[]{"historic_b_qbe", getElements("historic_b_qbe")},// query button
                new String[]{"qbe_i_user_profile", getElements("qbe_i_user_profile")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user_profile", getElements("qbe_i_user_profile")},
                "user_p", getData("user_p"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_start_d", getElements("qbe_i_start_d")},
                "start_d", getData("start_d"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_start_u", getElements("qbe_i_start_u")},
                "start_u", getData("start_u"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_end_d", getElements("qbe_i_end_d")},
                "end_d", getData("end_d"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_end_u", getElements("qbe_i_end_u")},
                "end_u", getData("end_u"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user_profile", getElements("qbe_i_user_profile")}, //any query input
                new String[]{"historic_e_result", getElements("historic_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actionsHistoric(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"historic_b_detach", getElements("historic_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"user_b_hist_close", getElements("user_b_hist_close")}, //element to click
                "CLOSE")){return false;}
        return true;
    }
}
