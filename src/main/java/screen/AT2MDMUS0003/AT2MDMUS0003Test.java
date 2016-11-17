package screen.AT2MDMUS0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2MDMUS0003Test {
    protected AT2MDMUS0003Locators locators;
    protected AT2MDMUS0003Data data;
    public AT2MDMUS0003Test() {
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
        if (!interaction_edit_user(driver)) return false;
        if (!qbe_user(driver)) return false;
        if (!others_actions_user(driver)) return false;
        if (!delete_user(driver))return false;
        return true;
    }

    public boolean interaction_add_user (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"users_b_add", getElements("users_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company",
                where)){return false;}//Data namewhere)){return false;}
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
        if(!Functions.createLov(driver,
                new String[]{"add_lov_business",getElements("add_lov_business")}, // b_lov
                new String[]{"add_i_business", getElements("add_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_01",getElements("add_i_surname_01")},
                "sur01",  DataGenerator.getRandomAlphanumericSequence(7, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_02",getElements("add_i_surname_02")},
                "sur02", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name1",getElements("add_i_name1")},
                "name1", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname1",getElements("add_i_surname1")},
                "sur1", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname2",getElements("add_i_surname2")},
                "sur2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_email",getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_intranet_user",getElements("add_i_intranet_user")},
                "intranet", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
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
        if (!Functions.selectText(driver,
                new String[]{"add_sl_blocking",getElements("add_sl_blocking")},
                "Active", "blocking",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_unblocking",getElements("add_i_unblocking")},
                "unblocking", "unblocking", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_org_role",getElements("add_lov_org_role")}, // b_lov
                new String[]{"add_i_org_role", getElements("add_i_org_role")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "org", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_reference_user",getElements("add_lov_reference_user")}, // b_lov
                new String[]{"add_i_reference_user", getElements("add_i_reference_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "reference", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_user(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH USER";
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
                getData("bussiness"), // value to search
                "bussiness", //name of the data
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
/*        if (!Functions.insertInput(driver, new String[]{"search_i_deactivation",getElements("search_i_deactivation")},
                "desactivation", getData("desactivation"), where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"search_i_name1",getElements("search_i_name1")},
                "name1", getData("name1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname1",getElements("search_i_surname1")},
                "sur1", getData("sur1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_surname2",getElements("search_i_surname2")},
                "sur2", getData("sur2"), where)){return false;}
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
        if (!Functions.checkClick(driver,
                new String[]{"users_b_edit", getElements("users_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company",
                where)){return false;}//Data namewhere)){return false;}
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
        if(!Functions.createLov(driver,
                new String[]{"add_lov_business",getElements("add_lov_business")}, // b_lov
                new String[]{"add_i_business", getElements("add_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_01",getElements("add_i_surname_01")},
                "sur01",  DataGenerator.getRandomAlphanumericSequence(7, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname_02",getElements("add_i_surname_02")},
                "sur02", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name1",getElements("add_i_name1")},
                "name1", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname1",getElements("add_i_surname1")},
                "sur1", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_surname2",getElements("add_i_surname2")},
                "sur2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_email",getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_intranet_user",getElements("add_i_intranet_user")},
                "intranet", DataGenerator.getRandomAlphanumericSequence(7, false), where)){return false;}
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
        if (!Functions.selectText(driver,
                new String[]{"add_sl_blocking",getElements("add_sl_blocking")},
                "Active", "blocking",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_unblocking",getElements("add_i_unblocking")},
                "unblocking", "unblocking", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_org_role",getElements("add_lov_org_role")}, // b_lov
                new String[]{"add_i_org_role", getElements("add_i_org_role")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "org", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_reference_user",getElements("add_lov_reference_user")}, // b_lov
                new String[]{"add_i_reference_user", getElements("add_i_reference_user")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "reference", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_user(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE USER";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"users_e_result", getElements("users_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"users_b_qbe", getElements("users_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        }
        // where the operation occurs
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
/*        if (!Functions.insertInput(driver, new String[]{"search_i_deactivation",getElements("search_i_deactivation")},
                "desactivation", getData("desactivation"), where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name1",getElements("qbe_i_name1")},
                "name1", getData("name1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname1",getElements("qbe_i_surname1")},
                "sur1", getData("sur1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname2",getElements("qbe_i_surname2")},
                "sur2", getData("sur2"), where)){return false;}

        if (!Functions.selectText(driver,
                new String[]{"search_sl_assign",getElements("search_sl_assign")},
                getData("assign"), "assign",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"search_i_email",getElements("search_i_email")},
                "mail", getData("mail"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_intranet_user",getElements("search_i_intranet_user")},
                "intranet", getData("intranet"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language",getElements("qbe_i_language")},
                "lang", getData("lang"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //any query input
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
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"users_b_delete", getElements("users_b_delete")},
                new String[]{"users_e_records", getElements("users_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
