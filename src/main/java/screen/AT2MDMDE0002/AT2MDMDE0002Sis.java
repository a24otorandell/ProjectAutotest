package screen.AT2MDMDE0002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 15/11/2016.
 */
/**
 * NO DEJA ELIMINAR REGISTRO DE LA PRIMERA TABLA SI SE CREA UN AREA CON ÉL.
 */
public class AT2MDMDE0002Sis {
    protected AT2MDMDE0002Locators locators;
    protected AT2MDMDE0002Data data;
    public AT2MDMDE0002Sis() {
    }
    public AT2MDMDE0002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0002Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0002Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Destinations Maintenance");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_table1(driver)) return false;
        if (!search_table1(driver)) return false;
        if (!interaction_edit_table1(driver)) return false;
        if (!qbe_table1(driver)) return false;
        if (!others_actions_table1(driver)) return false;
        if (!interaction_add_table2(driver)) return false;
        if (!qbe_table2(driver)) return false;
        if (!interaction_edit_table2(driver)) return false;
        if (!qbe_table2(driver)) return false;
        if (!others_actions_table2(driver)) return false;
        if (!interaction_add_table3(driver)) return false;
        if (!search_table3(driver)) return false;
        if (!interaction_edit_table3(driver)) return false;
        if (!qbe_table3(driver)) return false;
        if (!others_actions_table3(driver)) return false;
        if (!interaction_add_table4(driver)) return false;
        if (!qbe_table4(driver)) return false;
        if (!interaction_edit_table4(driver)) return false;
        if (!qbe_table4(driver)) return false;
        if (!others_actions_table4(driver)) return false;
        if (!getData(driver)) return false;
        if (!interaction_add_table5(driver)) return false;
        if (!qbe_table5(driver)) return false;
        if (!interaction_edit_table5(driver)) return false;
        if (!qbe_table5(driver)) return false;
        if (!others_actions_table5(driver)) return false;
        if (!delete_table5(driver)) return false;
        if (!qbe_table5b(driver)) return false;
        if (!delete_table5(driver)) return false;
        if (!delete_table4(driver)) return false;
        if (!delete_table3(driver)) return false;
        if (!delete_table2(driver)) return false;
        if (!delete_table1(driver)) return false;
        return true;
    }

    /**
     * TABLE DESCRIPTION
     * @param driver
     * @return
     */
    public boolean interaction_add_table1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD DESCRIPTION";
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClick(driver,
                new String[]{"description1_b_add", getElements("description1_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_country", getElements("add_lov_country")}, //LoV button
                new String[]{"add_i_country", getElements("add_i_country")}, //external LoV input
                new String[]{"add_lov_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "AD", // value to search
                "country", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_destination", getElements("add_i_destination")},
                "destination", DataGenerator.getRandomAlphanumericSequence(3,true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(8,false), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, //LoV button
                new String[]{"add_i_company", getElements("add_i_company")}, //external LoV input
                new String[]{"add_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "D01", // value to search
                "company", //name of the data
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getValue(driver,new String[]{"add_i_office_desc", getElements("add_i_office_desc")}, // element path
                "office_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_region",getElements("add_lov_region")}, // b_lov
                new String[]{"add_i_region", getElements("add_i_region")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "region", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getText(driver,new String[]{"add_i_region_desc", getElements("add_i_region_desc")}, // element path
                "region_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_time",getElements("add_lov_time")}, // b_lov
                new String[]{"add_i_time", getElements("add_i_time")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "time", //Data name
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_transfer"),"transfer",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_wkd"),"wkd",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_kd"),"kd",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_sd"),"sd",false,true,where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_typology",getElements("add_sl_typology")},
                "Rest", "typology", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH DESCRIPTION";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_country", getElements("search_lov_country")}, //LoV button
                new String[]{"search_i_country", getElements("search_i_country")}, //external LoV input
                new String[]{"search_lov_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("country"), // value to search
                "country", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_destination", getElements("search_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 800);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_region", getElements("search_lov_region")}, //LoV button
                new String[]{"search_i_region", getElements("search_i_region")}, //external LoV input
                new String[]{"search_lov_region_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("region"), // value to search
                "region", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_time", getElements("search_lov_time")}, //LoV button
                new String[]{"search_i_time", getElements("search_i_time")}, //external LoV input
                new String[]{"search_lov_time_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("time"), // value to search
                "time", //name of the data
                where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"),"active",true,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_transfer"),"transfer",true,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_wkd"),"wkd",true,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_kd"),"kd",false,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_sd"),"sd",false,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"description1_e_result", getElements("description1_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION DESCRIPTION";
        if (!Functions.checkClick(driver,
                new String[]{"description1_b_edit", getElements("description1_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_country", getElements("add_lov_country")}, //LoV button
                new String[]{"add_i_country", getElements("add_i_country")}, //external LoV input
                new String[]{"add_lov_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "DZ", // value to search
                "country", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_destination", getElements("add_i_destination")},
                "destination", DataGenerator.getRandomAlphanumericSequence(3,true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(8,false), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, //LoV button
                new String[]{"add_i_company", getElements("add_i_company")}, //external LoV input
                new String[]{"add_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "E10", // value to search
                "company", //name of the data
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getValue(driver,new String[]{"add_i_office_desc", getElements("add_i_office_desc")}, // element path
                "office_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_region",getElements("add_lov_region")}, // b_lov
                new String[]{"add_i_region", getElements("add_i_region")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "region", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getText(driver,new String[]{"add_i_region_desc", getElements("add_i_region_desc")}, // element path
                "region_desc", // key for data value (the name)
                where)){return false;}
        Functions.break_time(driver, 3,400);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_time",getElements("add_lov_time")}, // b_lov
                new String[]{"add_i_time", getElements("add_i_time")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "time", //Data name
                where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_transfer"),"transfer",false,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_wkd"),"wkd",false,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_kd"),"kd",false,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_sd"),"sd",true,true,where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_typology",getElements("add_sl_typology")},
                "Top2", "typology", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DESCRIPTION";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"description1_e_result", getElements("description1_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"description1_b_qbe", getElements("description1_b_qbe")},// query button
                new String[]{"qbe_i_country", getElements("qbe_i_country")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country", getElements("qbe_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_desc", getElements("qbe_i_office_desc")},
                "office_desc", getData("office_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_region", getElements("qbe_i_region")},
                "region", getData("region"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_region_desc", getElements("qbe_i_region_desc")},
                "region_desc", getData("region_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_time", getElements("qbe_i_time")},
                "time", getData("time"), where)) {
            return false;
        }
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_typology",getElements("qbe_sl_typology")},
                getData("typology"), "typology", where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active", where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_transfer",getElements("qbe_sl_transfer")},
                getData("transfer"), "transfer", where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_wkd",getElements("qbe_sl_wkd")},
                getData("wkd"), "wkd", where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_kd",getElements("qbe_sl_kd")},
                getData("kd"), "kd", where)){return false;}
        Functions.break_time(driver, 3,400);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_sd",getElements("qbe_sl_sd")},
                getData("sd"), "sd", where)){return false;}
//        Functions.break_time(driver, 3,400);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_country", getElements("qbe_i_country")}, //any query input
                new String[]{"description1_e_result", getElements("description1_e_result")}, //table result
                where)){return false;}
        Functions.break_time(driver, 3, 500);
        return true;
    }
    private boolean others_actions_table1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA DESCRIPTION";
        Functions.break_time(driver, 3, 400);
        if (!Functions.auditData(driver,
                new String[]{"description1_b_actions", getElements("description1_b_actions")}, //actions button
                new String[]{"description1_b_actions_audit_data", getElements("description1_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH DESCRIPTION";
        if (!Functions.detachTable(driver,
                new String[]{"description1_b_detach", getElements("description1_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA DESCRIPTION";
        if(!Functions.doDelete(driver,
                new String[]{"description1_b_delete", getElements("description1_b_delete")},//delete button
                new String[]{"a_delete_ok", getElements("a_delete_ok")},//delete button
                where)){return false;}
        return true;
    }

    /**
     * TAB DESCRIPTION - TABLE DESCRIPTION
     * @param driver
     * @return
     */
    public boolean interaction_add_table2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD DESCRIPTION2";
        if (!Functions.checkClick(driver,
                new String[]{"description2_b_add", getElements("description2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 100, 1000);
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        Functions.break_time(driver, 10, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_description_lang", getElements("add_i_description_lang")},
                "desc_lang", DataGenerator.getRandomAlphanumericSequence(8,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION DESCRIPTION2";
        if (!Functions.checkClick(driver,
                new String[]{"description2_b_edit", getElements("description2_b_edit")}, //element to click
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
        if (!Functions.insertInput(driver, new String[]{"add_i_description_lang", getElements("add_i_description_lang")},
                "desc_lang", DataGenerator.getRandomAlphanumericSequence(8,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DESCRIPTION2";
        if (!Functions.clickQbE(driver,
                new String[]{"description2_b_qbe", getElements("description2_b_qbe")},// query button
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description_lang", getElements("qbe_i_description_lang")},
                "desc_lang", getData("desc_lang"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")}, //any query input
                new String[]{"description2_e_result", getElements("description2_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA DESCRIPTION2";
        if (!Functions.auditData(driver,
                new String[]{"description2_b_actions", getElements("description2_b_actions")}, //actions button
                new String[]{"description2_b_actions_audit_data", getElements("description2_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH DESCRIPTION2";
        if (!Functions.detachTable(driver,
                new String[]{"description2_b_detach", getElements("description2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA DESCRIPTION2";
        if (!Functions.simpleClick(driver,
                new String[]{"desc_tab", getElements("desc_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"description2_b_delete", getElements("description2_b_delete")},
                new String[]{"description2_e_records", getElements("description2_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TAB AREAS - TABLE AREAS
     * @param driver
     * @return
     */
    public boolean interaction_add_table3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD AREA";
        if (!Functions.simpleClick(driver,
                new String[]{"areas_tab", getElements("areas_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"areas_b_add", getElements("areas_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_area", getElements("areas_add_i_area")},
                "area",  String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_description", getElements("areas_add_i_description")},
                "area_desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("areas_add_ck_priority"),"priority",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_latitude", getElements("areas_add_i_latitude")},
                "latitude", String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_longitude", getElements("areas_add_i_longitude")},
                "longitude", String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table3(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH DESCRIPTION - AREA";
        if (!Functions.simpleClick(driver,
                new String[]{"qbe_reset", getElements("qbe_reset")}, //element to click
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_country", getElements("search_lov_country")}, //LoV button
                new String[]{"search_i_country", getElements("search_i_country")}, //external LoV input
                new String[]{"search_lov_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("country"), // value to search
                "country", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_destination", getElements("search_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 800);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_region", getElements("search_lov_region")}, //LoV button
                new String[]{"search_i_region", getElements("search_i_region")}, //external LoV input
                new String[]{"search_lov_region_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("region"), // value to search
                "region", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_time", getElements("search_lov_time")}, //LoV button
                new String[]{"search_i_time", getElements("search_i_time")}, //external LoV input
                new String[]{"search_lov_time_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("time"), // value to search
                "time", //name of the data
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_transfer"),"transfer",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_wkd"),"wkd",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_kd"),"kd",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_sd"),"sd",true,true,where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"description1_e_result", getElements("description1_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_area", getElements("search_i_area")},
                "area", getData("area"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_area_description", getElements("search_i_area_description")},
                "area_desc", getData("area_desc"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"areas_e_result", getElements("areas_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION AREAS";
        if (!Functions.checkClick(driver,
                new String[]{"areas_b_edit", getElements("areas_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_area", getElements("areas_add_i_area")},
                "area",  String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_description", getElements("areas_add_i_description")},
                "area_desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("areas_add_ck_priority"),"priority",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_latitude", getElements("areas_add_i_latitude")},
                "latitude", String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_add_i_longitude", getElements("areas_add_i_longitude")},
                "longitude", String.valueOf(DataGenerator.random(1,50)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE AREAS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"areas_e_result", getElements("areas_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"areas_b_qbe", getElements("areas_b_qbe")},// query button
                new String[]{"areas_qbe_i_area", getElements("areas_qbe_i_area")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_area", getElements("areas_qbe_i_area")},
                "area", getData("area"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_description", getElements("areas_qbe_i_description")},
                "area_desc", getData("area_desc"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"areas_qbe_sl_priority",getElements("areas_qbe_sl_priority")},
                getData("priority"), "priority", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_latitude", getElements("areas_qbe_i_latitude")},
                "latitude", getData("latitude"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"areas_qbe_i_longitude", getElements("areas_qbe_i_longitude")},
                "longitude", getData("longitude"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"areas_qbe_i_area", getElements("areas_qbe_i_area")}, //any query input
                new String[]{"areas_e_result", getElements("areas_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table3(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA AREA";
        if (!Functions.auditData(driver,
                new String[]{"areas_b_actions", getElements("areas_b_actions")}, //actions button
                new String[]{"areas_b_actions_audit_data", getElements("areas_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH AREA";
        if (!Functions.detachTable(driver,
                new String[]{"areas_b_detach", getElements("areas_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA AREA";
        if(!Functions.doDelete(driver,
                new String[]{"areas_b_delete", getElements("areas_b_delete")},//delete button
                new String[]{"b_delete_ok", getElements("b_delete_ok")},//delete button
                where)){return false;}
        return true;
    }

    /**
     * TAB AREAS - TABLE MULTI
     * @param driver
     * @return
     */
    public boolean interaction_add_table4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD MULTI";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_add", getElements("multi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"multi_add_lov_language",getElements("multi_add_lov_language")}, // b_lov
                new String[]{"multi_add_i_language", getElements("multi_add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "multi_lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"multi_add_i_description", getElements("multi_add_i_description")},
                "multi_desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION MULTI";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_edit", getElements("multi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"multi_add_lov_language",getElements("multi_add_lov_language")}, // b_lov
                new String[]{"multi_add_i_language", getElements("multi_add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "multi_lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"multi_add_i_description", getElements("multi_add_i_description")},
                "multi_desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE MULTI";
        if (!Functions.clickQbE(driver,
                new String[]{"multi_b_qbe", getElements("multi_b_qbe")},// query button
                new String[]{"multi_qbe_i_code", getElements("multi_qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"multi_qbe_i_code", getElements("multi_qbe_i_code")},
                "area", getData("area"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_qbe_i_language", getElements("multi_qbe_i_language")},
                "multi_lang", getData("multi_lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_qbe_i_description", getElements("multi_qbe_i_description")},
                "multi_desc", getData("multi_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"multi_qbe_i_code", getElements("multi_qbe_i_code")}, //any query input
                new String[]{"multi_e_result", getElements("multi_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table4(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH MULTI";
        if (!Functions.detachTable(driver,
                new String[]{"multi_b_detach", getElements("multi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA MULTI";
        if (!Functions.simpleClick(driver,
                new String[]{"areas_tab", getElements("areas_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"multi_b_delete", getElements("multi_b_delete")},
                new String[]{"multi_e_records", getElements("multi_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TAB EXTERNAL - TABLE SUPPLIER
     * @param driver
     * @return
     */
    public boolean getData (TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"supplier_tab", getElements("supplier_tab")}, //element to click
                "GET DATA")){return false;}
        String[] columns = {"external_c","description_c", "office", "office_desc_c"};
        if (!Functions.collectTableData(driver,columns,"//*[contains(@id, 'pc4:Retindestproext::db')]",1,"GET DATA"))return false;
        return true;
    }
    public boolean interaction_add_table5 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD SUPPLIER";
        if (!Functions.simpleClick(driver,
                new String[]{"supplier_tab", getElements("supplier_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"supplier_b_add", getElements("supplier_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"supplier_add_lov_agency",getElements("supplier_add_lov_agency")}, // b_lov
                new String[]{"supplier_add_i_agency", getElements("supplier_add_i_agency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getValue(driver,new String[]{"supplier_add_i_agency_description", getElements("supplier_add_i_agency_description")}, // element path
                "agency_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"supplier_add_lov_office",getElements("supplier_add_lov_office")}, // b_lov
                new String[]{"supplier_add_i_office", getElements("supplier_add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "s_office", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getValue(driver,new String[]{"supplier_add_i_office_description", getElements("supplier_add_i_office_description")}, // element path
                "s_office_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"supplier_b_save", getElements("supplier_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_table5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION SUPPLIER";
        if (!Functions.checkClick(driver,
                new String[]{"supplier_b_edit", getElements("supplier_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"supplier_add_lov_agency",getElements("supplier_add_lov_agency")}, // b_lov
                new String[]{"supplier_add_i_agency", getElements("supplier_add_i_agency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getValue(driver,new String[]{"supplier_add_i_agency_description", getElements("supplier_add_i_agency_description")}, // element path
                "agency_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"supplier_add_lov_office",getElements("supplier_add_lov_office")}, // b_lov
                new String[]{"supplier_add_i_office", getElements("supplier_add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "s_office", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getValue(driver,new String[]{"supplier_add_i_office_description", getElements("supplier_add_i_office_description")}, // element path
                "s_office_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"supplier_b_save", getElements("supplier_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table5(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE AREAS";
        if (!Functions.clickQbE(driver,
                new String[]{"supplier_b_qbe", getElements("supplier_b_qbe")},// query button
                new String[]{"supplier_i_qbe_agency", getElements("supplier_i_qbe_agency")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_agency", getElements("supplier_i_qbe_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_agency_description", getElements("supplier_i_qbe_agency_description")},
                "agency_desc", getData("agency_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_office", getElements("supplier_i_qbe_office")},
                "s_office", getData("s_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_office_description", getElements("supplier_i_qbe_office_description")},
                "s_office_desc", getData("s_office_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"supplier_i_qbe_agency", getElements("supplier_i_qbe_agency")}, //any query input
                new String[]{"supplier_e_result", getElements("supplier_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean qbe_table5b(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE AREAS";
        if (!Functions.clickQbE(driver,
                new String[]{"supplier_b_qbe", getElements("supplier_b_qbe")},// query button
                new String[]{"supplier_i_qbe_agency", getElements("supplier_i_qbe_agency")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_agency", getElements("supplier_i_qbe_agency")},
                "external_c", getData("external_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_agency_description", getElements("supplier_i_qbe_agency_description")},
                "description_c", getData("description_c"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_office", getElements("supplier_i_qbe_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"supplier_i_qbe_office_description", getElements("supplier_i_qbe_office_description")},
                "office_desc_c", getData("office_desc_c"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"supplier_i_qbe_agency", getElements("supplier_i_qbe_agency")}, //any query input
                new String[]{"supplier_e_result", getElements("supplier_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table5(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA SUPPLIER";
        if (!Functions.auditData(driver,
                new String[]{"supplier_b_actions", getElements("supplier_b_actions")}, //actions button
                new String[]{"supplier_b_actions_audit_data", getElements("supplier_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH SUPPLIER";
        if (!Functions.detachTable(driver,
                new String[]{"supplier_b_detach", getElements("supplier_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table5(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA SUPPLIER";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"supplier_b_delete", getElements("supplier_b_delete")},
                new String[]{"supplier_e_records", getElements("supplier_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
