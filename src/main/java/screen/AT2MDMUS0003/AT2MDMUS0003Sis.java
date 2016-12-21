package screen.AT2MDMUS0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import sun.net.www.protocol.file.FileURLConnection;

/**
 * Created by aibanez on 17/11/2016.
 */
/**
 * 1º En creación y edición los campos de last login date (blooqueado) y org role (no tiene datos) no se utilizan
 * 2º En busqueda el campo desactivation date, no hay datos para introducir
 * 3º Los campos Name std, Surname std y Second Surname std, deberían autorrellenarse y no siempre lo hacen, por eso introduzco el valor de los campos del mismo nombre.
 */
public class AT2MDMUS0003Sis {
    protected AT2MDMUS0003Locators locators;
    protected AT2MDMUS0003Data data;
    public AT2MDMUS0003Sis() {
    }
    public AT2MDMUS0003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0003Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Atlas users");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_user(driver)) return false;
        if (!search_user(driver)) return false;
        if (!qbe_hard(driver, "997")) return false;
        if (!delete_2(driver))return false;
        if (!interaction_add_2(driver)) return false;
        if (!qbe_2(driver)) return false;
        if (!interaction_edit_2(driver)) return false;
        if (!qbe_2(driver)) return false;
        if (!others_actions_2(driver)) return false;
        if (!delete_2(driver))return false;
        if (!interaction_add_3(driver)) return false;
        if (!qbe_3(driver)) return false;
        if (!interaction_edit_3(driver)) return false;
        if (!qbe_3(driver)) return false;
        if (!others_actions_3(driver)) return false;
        if (!delete_3(driver))return false;
        if (!interaction_add_4(driver)) return false;
        if (!qbe_4(driver)) return false;
        if (!interaction_edit_4(driver)) return false;
        if (!qbe_4(driver)) return false;
        if (!others_actions_4(driver)) return false;
        if (!delete_4(driver))return false;
        if (!interaction_edit_user(driver)) return false;
        if (!qbe_user(driver)) return false;
        if (!others_actions_user(driver)) return false;
        if (!delete_user(driver))return false;
        if (!print_user(driver)) return false;
        return true;
    }

    public boolean interaction_add_user (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        Functions.break_time(driver, 3, 400);
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_add", getElements("users_b_add")}, //element to click
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_user",getElements("add_i_user")},
                "user", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_short_name", getElements("add_i_short_name")}, // element path
                "short", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_office_des", getElements("add_i_office_des")}, // element path
                "office_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_department",getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_department_des", getElements("add_i_department_des")}, // element path
                "department_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name1",getElements("add_i_name1")},
                "name1", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_email",getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
/*        if(!Functions.createLov(driver,
                new String[]{"add_lov_org_role",getElements("add_lov_org_role")}, // b_lov
                new String[]{"add_i_org_role", getElements("add_i_org_role")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "org", //Data name
                where)){return false;}*/
        if(!Functions.createLov(driver,
                new String[]{"add_lov_business",getElements("add_lov_business")}, // b_lov
                new String[]{"add_i_business", getElements("add_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_01",getElements("add_i_surname_01")},
                "sur01",  DataGenerator.getRandomAlphanumericSequence(7, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname1",getElements("add_i_surname1")},
                "sur1", getData("sur01"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_intranet_user",getElements("add_i_intranet_user")},
                "intranet", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_blocking",getElements("add_sl_blocking")},
                "Administrative", "blocking",  where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_reference_user",getElements("add_lov_reference_user")}, // b_lov
                new String[]{"add_i_reference_user", getElements("add_i_reference_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "reference", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_02",getElements("add_i_surname_02")},
                "sur02", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname2",getElements("add_i_surname2")},
                "sur2", getData("sur02"), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_assign"),"assign",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_unblocking",getElements("add_i_unblocking")},
                "unblocking", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.simpleClick(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                where)){return false;}
        Functions.break_time(driver, 70, 400);
        return true;
    }
    private boolean search_user(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH USER";
        if (!Functions.simpleClick(driver,
                new String[]{"users_tab", getElements("users_tab")}, //element to click
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_user",getElements("search_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_department", getElements("search_lov_department")}, //LoV button
                new String[]{"search_i_department", getElements("search_i_department")}, //external LoV input
                new String[]{"search_lov_department_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("department"), // value to search
                "department", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_business", getElements("search_lov_business")}, //LoV button
                new String[]{"search_i_business", getElements("search_i_business")}, //external LoV input
                new String[]{"search_lov_business_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("business"), // value to search
                "business", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_name",getElements("search_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname_01",getElements("search_i_surname_01")},
                "sur01", getData("sur01"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname_02",getElements("search_i_surname_02")},
                "sur02", getData("sur02"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_active",getElements("search_sl_active")},
                getData("active"), "active",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_name1",getElements("search_i_name1")},
                "name1", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname1",getElements("search_i_surname1")},
                "sur1", getData("sur01"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname2",getElements("search_i_surname2")},
                "sur2", getData("sur02"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_assign",getElements("search_sl_assign")},
                getData("assign"), "assign",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_email",getElements("search_i_email")},
                "mail", getData("mail"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_intranet_user",getElements("search_i_intranet_user")},
                "intranet", getData("intranet"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_lang", getElements("search_lov_lang")}, //LoV button
                new String[]{"search_i_lang", getElements("search_i_lang")}, //external LoV input
                new String[]{"search_lov_business_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("lang"), // value to search
                "lang", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_blocking",getElements("search_sl_blocking")},
                getData("blocking"), "blocking",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_unblocking",getElements("search_i_unblocking")},
                "unblocking", getData("unblocking"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_user(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        Functions.break_time(driver, 3, 200);
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_edit2", getElements("users_b_edit2")}, //element to click
                where)){return false;}
        Functions.break_time(driver, 3, 200);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_short_name", getElements("add_i_short_name")}, // element path
                "short", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_office_des", getElements("add_i_office_des")}, // element path
                "office_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_department",getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_department_des", getElements("add_i_department_des")}, // element path
                "department_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name1",getElements("add_i_name1")},
                "name1", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_email",getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
/*        if(!Functions.createLov(driver,
                new String[]{"add_lov_org_role",getElements("add_lov_org_role")}, // b_lov
                new String[]{"add_i_org_role", getElements("add_i_org_role")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "org", //Data name
                where)){return false;}*/
        if(!Functions.createLov(driver,
                new String[]{"add_lov_business",getElements("add_lov_business")}, // b_lov
                new String[]{"add_i_business", getElements("add_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_01",getElements("add_i_surname_01")},
                "sur01",  DataGenerator.getRandomAlphanumericSequence(7, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname1",getElements("add_i_surname1")},
                "sur1", getData("sur01"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_intranet_user",getElements("add_i_intranet_user")},
                "intranet", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_reference_user",getElements("add_lov_reference_user")}, // b_lov
                new String[]{"add_i_reference_user", getElements("add_i_reference_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "reference", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_02",getElements("add_i_surname_02")},
                "sur02", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname2",getElements("add_i_surname2")},
                "sur2", getData("sur02"), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_assign"),"assign",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_unblocking",getElements("add_i_unblocking")},
                "unblocking", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean qbe_user(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE USER";
        if (!Functions.simpleClick(driver,
                new String[]{"users_tab", getElements("users_tab")}, //element to click
                where)){return false;}
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"users_b_qbe", getElements("users_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company",getElements("qbe_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name",getElements("qbe_i_short_name")},
                "short", getData("short"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office",getElements("qbe_i_office")},
                "office", getData("office"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_des",getElements("qbe_i_office_des")},
                "office_desc", getData("office_desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department",getElements("qbe_i_department")},
                "department", getData("department"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department_des",getElements("qbe_i_department_des")},
                "department_desc", getData("department_desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_business",getElements("qbe_i_business")},
                "business", getData("business"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name",getElements("qbe_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname_01",getElements("qbe_i_surname_01")},
                "sur01", getData("sur01"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname_02",getElements("qbe_i_surname_02")},
                "sur02", getData("sur02"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest_date",getElements("qbe_i_dest_date")},
                "dest_date", "", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name1",getElements("qbe_i_name1")},
                "name1", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname1",getElements("qbe_i_surname1")},
                "sur1", getData("sur01"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname2",getElements("qbe_i_surname2")},
                "sur2", getData("sur02"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_assing",getElements("qbe_sl_assing")},
                getData("assign"), "assign",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_email",getElements("qbe_i_email")},
                "mail", getData("mail"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_intranet_user",getElements("qbe_i_intranet_user")},
                "intranet", getData("intranet"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language",getElements("qbe_i_language")},
                "lang", getData("lang"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_unblocking",getElements("qbe_i_unblocking")},
                "unblocking", getData("unblocking"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"users_e_result", getElements("users_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_user(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA USER";
        if (!Functions.auditData(driver,
                new String[]{"users_b_actions", getElements("users_b_actions")}, //actions button
                new String[]{"users_b_actions_b_audit_data", getElements("users_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"users_b_detach", getElements("users_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_user(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_actions", getElements("users_b_actions")}, //element to click
                where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_actions_b_delete", getElements("users_b_actions_b_delete")}, //element to click
                where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_yes", getElements("users_b_yes")}, //element to click
                where)){return false;}
        return true;
    }
    private boolean print_user (TestDriver driver) {
        driver.getReport().addHeader("PRINT DATA", 3, false);
        String where = " on PRINT DATA";
        String windowsadf = driver.getDriver().getCurrentUrl();
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_actions", getElements("users_b_actions")}, //element to click
                where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"users_b_actions_b_print", getElements("users_b_actions_b_print")}, //element to click
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"print_lov_company", getElements("print_lov_company")}, //LoV button
                new String[]{"print_i_company", getElements("print_i_company")}, //external LoV input
                new String[]{"print_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company_p", //name of the data
                where)){return false;}
        if(!Functions.createLovByValue(driver,
                new String[]{"print_lov_office",getElements("print_lov_office")}, // b_lov
                new String[]{"print_i_office", getElements("print_i_office")}, // i_lov
                new String[]{"print_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office_p", //name of the data
                where)){return false;}
        String list_options[] = {"All", "Yes", "No"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"print_sl_status", getElements("print_sl_status")},
                list_options, "status_p", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"print_b_print", getElements("print_b_print")},
                recursiveXPaths.glass,
                where)){return false;}

        driver.getDriver().get("http://atlbipsis.hotelbeds.com/xmlpserver/reports/ATLAS20/MDM/XDO/AT2MDMRP0008.xdo?_xpf=&_xpt=0&_xmode=4&_paramsPC_ACTIVO=T&_paramsPG_LANGUAGE=ENG&_paramsPC_COD_EMP=997&_xt=AT2MDMRP0008_01&_xf=pdf");
        Functions.screenshot(driver);
        driver.getDriver().navigate().to(windowsadf);
        return true;
    }

    public boolean interaction_add_2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 2";
        if (!Functions.checkClick(driver,
                new String[]{"office_b_add", getElements("office_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"office_add_lov_company",getElements("office_add_lov_company")}, // b_lov
                new String[]{"office_add_i_company", getElements("office_add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "o_company", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"office_add_lov_office",getElements("office_add_lov_office")}, // b_lov
                new String[]{"office_add_i_office", getElements("office_add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "o_office", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"office_add_e_office_des", getElements("office_add_e_office_des")}, // element path
                "o_office_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"office_add_i_mail_address",getElements("office_add_i_mail_address")},
                "omail", DataGenerator.getRandomAlphanumericSequence(7, false)+"@email.es", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"office_add_lov_language",getElements("office_add_lov_language")}, // b_lov
                new String[]{"office_add_i_language", getElements("office_add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "o_lang", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save_o", getElements("add_b_save_o")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"office_b_edit", getElements("office_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"office_add_i_mail_address",getElements("office_add_i_mail_address")},
                "omail", DataGenerator.getRandomAlphanumericSequence(7, false)+"@email.es", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"office_add_lov_language",getElements("office_add_lov_language")}, // b_lov
                new String[]{"office_add_i_language", getElements("office_add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "o_lang", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save_o", getElements("add_b_save_o")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_hard (TestDriver driver, String company) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE HARD2";
        Functions.break_time(driver, 3, 400);
            if (!Functions.simpleClick(driver,
                    new String[]{"users_b_edit", getElements("users_b_edit")}, //element to click
                    where)) {
                return false;
            }
        Functions.break_time(driver, 3, 400);
        if (!Functions.clickQbE(driver,
                new String[]{"office_b_qbe", getElements("office_b_qbe")},// query button
                new String[]{"office_qbe_i_company", getElements("office_qbe_i_company")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"office_qbe_i_company",getElements("office_qbe_i_company")},
                "o_company", company, where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"office_qbe_i_company", getElements("office_qbe_i_company")}, //any query input
                new String[]{"office_e_result", getElements("office_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean qbe_2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        if (!Functions.clickQbE(driver,
                new String[]{"office_b_qbe", getElements("office_b_qbe")},// query button
                new String[]{"office_qbe_i_company", getElements("office_qbe_i_company")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"office_qbe_i_company", getElements("office_qbe_i_company")},
                "o_company", getData("o_company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"office_qbe_i_office", getElements("office_qbe_i_office")},
                "o_office", getData("o_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"office_qbe_i_office_des", getElements("office_qbe_i_office_des")},
                "o_office_desc", getData("o_office_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"office_qbe_i_mail_address", getElements("office_qbe_i_mail_address")},
                "omail", getData("omail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"office_qbe_i_language", getElements("office_qbe_i_language")},
                "o_lang", getData("o_lang"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"office_qbe_i_company", getElements("office_qbe_i_company")}, //any query input
                new String[]{"office_e_result", getElements("office_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"office_b_detach", getElements("office_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"office_b_delete", getElements("office_b_delete")},
                new String[]{"office_e_records", getElements("office_e_records")},
                where)){
            return false;
        }
        return true;
    }

    public boolean interaction_add_3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 3";
        if (!Functions.simpleClick(driver,
                new String[]{"apps_subtab", getElements("apps_subtab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"app_b_add", getElements("app_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"app_add_lov_application_code",getElements("app_add_lov_application_code")}, // b_lov
                new String[]{"app_add_i_application_code", getElements("app_add_i_application_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "app_code", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"app_add_e_user_position", getElements("app_add_e_user_position")}, // element path
                "app_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("app_add_ck_pertain"),"pertain",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save_aa", getElements("add_b_save_aa")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 4";
        if (!Functions.checkClick(driver,
                new String[]{"app_b_edit", getElements("app_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"app_add_lov_application_code",getElements("app_add_lov_application_code")}, // b_lov
                new String[]{"app_add_i_application_code", getElements("app_add_i_application_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "app_code", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"app_add_e_user_position", getElements("app_add_e_user_position")}, // element path
                "app_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("app_add_ck_pertain"),"pertain",false,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save_aa", getElements("add_b_save_aa")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 3";
        Functions.break_time(driver, 3, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"app_b_qbe", getElements("app_b_qbe")},// query button
                new String[]{"app_qbe_i_application_code", getElements("app_qbe_i_application_code")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"app_qbe_i_application_code",getElements("app_qbe_i_application_code")},
                "app_code", getData("app_code"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"app_qbe_i_user_position",getElements("app_qbe_i_user_position")},
                "app_desc", getData("app_desc"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"app_qbe_sl_pertain",getElements("app_qbe_sl_pertain")},
                getData("pertain"), "pertain", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"app_qbe_i_application_code", getElements("app_qbe_i_application_code")}, //any query input
                new String[]{"app_e_result", getElements("app_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH 3";
        if (!Functions.detachTable(driver,
                new String[]{"app_b_detach", getElements("app_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"app_b_delete", getElements("app_b_delete")},
                new String[]{"app_e_records", getElements("app_e_records")},
                where)){
            return false;
        }
        return true;
    }

    public boolean interaction_add_4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 4";
        if (!Functions.checkClick(driver,
                new String[]{"bussiness_b_add", getElements("bussiness_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"business_add_grouping_code_b_lov",getElements("business_add_grouping_code_b_lov")}, // b_lov
                new String[]{"business_add_i_grouping_code", getElements("business_add_i_grouping_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group_code", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("business_add_ck_default"),"default",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save_bb", getElements("add_b_save_bb")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 4";
        if (!Functions.checkClick(driver,
                new String[]{"bussiness_b_edit", getElements("bussiness_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"business_add_grouping_code_b_lov",getElements("business_add_grouping_code_b_lov")}, // b_lov
                new String[]{"business_add_i_grouping_code", getElements("business_add_i_grouping_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group_code", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("business_add_ck_default"),"default",false,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save_bb", getElements("add_b_save_bb")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 4";
        if (!Functions.clickQbE(driver,
                new String[]{"bussiness_b_qbe", getElements("bussiness_b_qbe")},// query button
                new String[]{"business_qbe_i_grouping_code", getElements("business_qbe_i_grouping_code")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"business_qbe_i_grouping_code",getElements("business_qbe_i_grouping_code")},
                "group_code", getData("group_code"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"business_qbe_sl_default",getElements("business_qbe_sl_default")},
                getData("default"), "default", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"business_qbe_i_grouping_code", getElements("business_qbe_i_grouping_code")}, //any query input
                new String[]{"bussiness_e_result", getElements("bussiness_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_4(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 4";
        if (!Functions.auditData(driver,
                new String[]{"bussiness_b_actions", getElements("bussiness_b_actions")}, //actions button
                new String[]{"bussiness_b_actions_b_audit_data", getElements("bussiness_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 4";
        if (!Functions.detachTable(driver,
                new String[]{"bussiness_b_detach", getElements("bussiness_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 4";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"bussiness_b_delete", getElements("bussiness_b_delete")},
                new String[]{"bussiness_e_records", getElements("bussiness_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
