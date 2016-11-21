package screen.AT2MDMOR0022;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 18/11/2016.
 */
public class AT2MDMOR0022Sis {
    protected AT2MDMOR0022Locators locators;
    protected AT2MDMOR0022Data data;
    public AT2MDMOR0022Sis() {
    }
    public AT2MDMOR0022Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0022Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0022Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0022Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Agenda");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_table1(driver)) return false;
        if (!search_table1(driver,false)) return false;
        if (!getData(driver)) return false;
        if (!search_table1(driver,true)) return false;
        if (!interaction_edit_table1(driver)) return false;
        if (!qbe_table1(driver)) return false;
        if (!others_actions_table1(driver)) return false;
        if (!delete_table1(driver)) return false;
        if (!interaction_add_table2(driver)) return false;
        if (!search_table2(driver)) return false;
        if (!interaction_edit_table2(driver)) return false;
        if (!qbe_table2(driver)) return false;
        if (!others_actions_table2(driver)) return false;
        if (!delete_table2(driver)) return false;
        return true;
    }

    /**
     * TAB ADDRESS
     * @param driver
     * @return
     */
    public boolean interaction_add_table1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 1";
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkClick(driver,
                new String[]{"address_b_add", getElements("address_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tab1_add_sl_module",getElements("tab1_add_sl_module")},
                "Proforma", "module1", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if(!Functions.createLov(driver,
                new String[]{"tab1_add_lov_supplier",getElements("tab1_add_lov_supplier")}, // b_lov
                new String[]{"tab1_add_i_supplier", getElements("tab1_add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if(!Functions.createLov(driver,
                new String[]{"tab1_add_lov_hotel",getElements("tab1_add_lov_hotel")}, // b_lov
                new String[]{"tab1_add_i_hotel", getElements("tab1_add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"tab1_add_i_fax", getElements("tab1_add_i_fax")},
                "fax1", "00999225545", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_add_i_email", getElements("tab1_add_i_email")},
                "mail1", DataGenerator.getRandomAlphanumericSequence(5,false)+"@"+DataGenerator.getRandomAlphanumericSequence(5,false)+".es", where)) {
            return false;
        }
/*        if (!Functions.checkboxValue(driver,
                getElements("tab1_add_ck_automatic"),"automatic",true,true,where)){return false;}*/
        if (!Functions.getValue(driver, new String[]{"tab1_add_e_company", getElements("tab1_add_e_company")},
                "company", where)) {
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"tab1_add_e_office", getElements("tab1_add_e_office")},
                "office", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) {return false;} //where
        Functions.break_time(driver, 3, 400);
        return true;
    }
    private boolean search_table1(TestDriver driver, boolean second) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH1";
        if (!Functions.selectText(driver,
                new String[]{"tab1_search_sl_module",getElements("tab1_search_sl_module")},
                getData("module1"), "module1", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"tab1_search_lov_supplier", getElements("tab1_search_lov_supplier")}, //LoV button
                new String[]{"tab1_search_i_supplier", getElements("tab1_search_i_supplier")}, //external LoV input
                new String[]{"tab1_search_lov_supplier_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"tab1_search_lov_hotel", getElements("tab1_search_lov_hotel")}, //LoV button
                new String[]{"tab1_search_i_hotel", getElements("tab1_search_i_hotel")}, //external LoV input
                new String[]{"tab1_search_lov_hotel_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel"), // value to search
                "hotel", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"tab1_search_i_fax", getElements("tab1_search_i_fax")},
                "fax1", getData("fax1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_search_i_email", getElements("tab1_search_i_email")},
                "mail1", getData("mail1"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("tab1_search_ck_automatic"),"automatic",false,true,where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"tab1_search_lov_company", getElements("tab1_search_lov_company")}, //LoV button
                new String[]{"tab1_search_i_company", getElements("tab1_search_i_company")}, //external LoV input
                new String[]{"tab1_search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"tab1_search_lov_office", getElements("tab1_search_lov_office")}, //LoV button
                new String[]{"tab1_search_i_office", getElements("tab1_search_i_office")}, //external LoV input
                new String[]{"tab1_search_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"tab1_search_lov_incoming", getElements("tab1_search_lov_incoming")}, //LoV button
                new String[]{"tab1_search_i_incoming", getElements("tab1_search_i_incoming")}, //external LoV input
                new String[]{"tab1_search_lov_incoming_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "1", // value to search
                "incoming", //name of the data
                where)){return false;}
        if (second) {
            if (!Functions.createLovByValue(driver,
                    new String[]{"tab1_search_lov_contrating", getElements("tab1_search_lov_contrating")}, //LoV button
                    new String[]{"tab1_search_i_contracting", getElements("tab1_search_i_contracting")}, //external LoV input
                    new String[]{"tab1_search_lov_contrating_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("contracting"), // value to search
                    "contracting", //name of the data
                    where)){return false;}
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search1", getElements("search_b_search1")}, //search button
                new String[]{"address_e_result", getElements("address_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean getData (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " GET DATA";
        String[] columns = {"company2", "office2", "incoming2", "contracting", "module12", "supplier2","hotel2","email12", "fax12" };
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc2:ofiaddr::db')]",
                1, // row to give values
                where);
        return true;
    }
    private boolean interaction_edit_table1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"address_b_edit", getElements("address_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tab1_add_sl_module",getElements("tab1_add_sl_module")},
                "Transfers", "module1", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if(!Functions.createLov(driver,
                new String[]{"tab1_add_lov_supplier",getElements("tab1_add_lov_supplier")}, // b_lov
                new String[]{"tab1_add_i_supplier", getElements("tab1_add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if(!Functions.createLov(driver,
                new String[]{"tab1_add_lov_hotel",getElements("tab1_add_lov_hotel")}, // b_lov
                new String[]{"tab1_add_i_hotel", getElements("tab1_add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.insertInput(driver, new String[]{"tab1_add_i_fax", getElements("tab1_add_i_fax")},
                "fax1", "00999335475", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_add_i_email", getElements("tab1_add_i_email")},
                "mail1", DataGenerator.getRandomAlphanumericSequence(5,false)+"@"+DataGenerator.getRandomAlphanumericSequence(5,false)+".es", where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("tab1_add_ck_automatic"),"automatic",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_table1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset1", getElements("search_b_reset1")}, //element to click
                where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"address_b_qbe", getElements("address_b_qbe")},// query button
                new String[]{"tab1_qbe_i_company", getElements("tab1_qbe_i_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver);
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_company", getElements("tab1_qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_office", getElements("tab1_qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_incoming", getElements("tab1_qbe_i_incoming")},
                "incoming", getData("incoming"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_contracting", getElements("tab1_qbe_i_contracting")},
                "contracting", getData("contracting"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tab1_qbe_sl_module",getElements("tab1_qbe_sl_module")},
                getData("module1"), "module1", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_supplier", getElements("tab1_qbe_i_supplier")},
                "supplier", getData("supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_hotel", getElements("tab1_qbe_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_email", getElements("tab1_qbe_i_email")},
                "mail1", getData("mail1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab1_qbe_i_fax", getElements("tab1_qbe_i_fax")},
                "fax1", getData("fax1"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tab1_qbe_sl_automatic",getElements("tab1_qbe_sl_automatic")},
                getData("automatic"), "automatic", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tab1_qbe_i_company", getElements("tab1_qbe_i_company")}, //any query input
                new String[]{"address_e_result", getElements("address_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        Functions.break_time(driver, 3, 400);
        if (!Functions.auditData(driver,
                new String[]{"address_b_actions", getElements("address_b_actions")}, //actions button
                new String[]{"address_b_actions_b_audit_data", getElements("address_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"address_b_detach", getElements("address_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"address_b_delete", getElements("address_b_delete")},
                new String[]{"address_e_records", getElements("address_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TAB GENERAL
     * @param driver
     * @return
     */
    public boolean interaction_add_table2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 2";
        Functions.break_time(driver, 3, 400);
        if (!Functions.simpleClick(driver,
                new String[]{"tab_general", getElements("tab_general")}, //element to click
                where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkClick(driver,
                new String[]{"general_b_add", getElements("general_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tab2_add_sl_module",getElements("tab2_add_sl_module")},
                "Activities", "module2", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"tab2_add_lov_to",getElements("tab2_add_lov_to")}, // b_lov
                new String[]{"tab2_add_i_to", getElements("tab2_add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"tab2_add_i_fax", getElements("tab2_add_i_fax")},
                "fax2", "00982225545", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab2_add_i_email", getElements("tab2_add_i_email")},
                "mail2", DataGenerator.getRandomAlphanumericSequence(5,false)+"@"+DataGenerator.getRandomAlphanumericSequence(5,false)+".es", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_table2(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH2";
        if (!Functions.selectText(driver,
                new String[]{"tab2_search_sl_module",getElements("tab2_search_sl_module")},
                getData("module2"), "module2", where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.createLovByValue(driver,
                new String[]{"tab2_search_lov_to", getElements("tab2_search_lov_to")}, //LoV button
                new String[]{"tab2_search_i_to", getElements("tab2_search_i_to")}, //external LoV input
                new String[]{"tab2_searcb_lov_to_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "%"+getData("to"), // value to search
                "to", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"tab2_search_i_fax", getElements("tab2_search_i_fax")},
                "fax2", getData("fax2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab2_search_i_email", getElements("tab2_search_i_email")},
                "mail2", getData("mail2"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search2", getElements("search_b_search2")}, //search button
                new String[]{"general_e_result", getElements("general_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_table2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"general_b_edit", getElements("general_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"tab2_add_sl_module",getElements("tab2_add_sl_module")},
                "Transfers", "module2", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"tab2_add_lov_to",getElements("tab2_add_lov_to")}, // b_lov
                new String[]{"tab2_add_i_to", getElements("tab2_add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"tab2_add_i_fax", getElements("tab2_add_i_fax")},
                "fax2", "00932223345", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab2_add_i_email", getElements("tab2_add_i_email")},
                "mail2", DataGenerator.getRandomAlphanumericSequence(5,false)+"@"+DataGenerator.getRandomAlphanumericSequence(5,false)+".es", where)) {
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
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset2", getElements("search_b_reset2")}, //search button
                new String[]{"general_e_result", getElements("general_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"general_b_qbe", getElements("general_b_qbe")},// query button
                new String[]{"tab2_qbe_i_to_short_name", getElements("tab2_qbe_i_to_short_name")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver);
        if (!Functions.selectText(driver,
                new String[]{"tab2_qbe_sl_module",getElements("tab2_qbe_sl_module")},
                getData("module2"), "module2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"tab2_qbe_i_to_short_name", getElements("tab2_qbe_i_to_short_name")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab2_qbe_i_fax", getElements("tab2_qbe_i_fax")},
                "fax2", getData("fax2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"tab2_qbe_i_email", getElements("tab2_qbe_i_email")},
                "mail2", getData("mail2"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tab2_qbe_i_to_short_name", getElements("tab2_qbe_i_to_short_name")}, //any query input
                new String[]{"general_e_result", getElements("general_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_table2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA2";
        Functions.break_time(driver, 3, 400);
        if (!Functions.auditData(driver,
                new String[]{"general_b_actions", getElements("general_b_actions")}, //actions button
                new String[]{"general_b_actions_b_audit_data", getElements("general_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH2";
        if (!Functions.detachTable(driver,
                new String[]{"general_b_detach", getElements("general_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_table2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"general_b_delete", getElements("general_b_delete")},
                new String[]{"general_e_records", getElements("general_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
