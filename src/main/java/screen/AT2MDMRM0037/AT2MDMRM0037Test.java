package screen.AT2MDMRM0037;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMRM0037Test {
    protected AT2MDMRM0037Locators locators;
    protected AT2MDMRM0037Data data;
    public AT2MDMRM0037Test() {
    }
    public AT2MDMRM0037Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0037Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0037Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0037Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Discount vouchers");
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
        if (!interaction_add_transfer(driver)) return false;
        if (!qbe_transfer(driver,true)) return false;
        if (!interaction_edit_transfer(driver)) return false;
        if (!qbe_transfer(driver, false)) return false;
        if (!others_actions_transfer(driver)) return false;
        if (!delete_transfer(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    /**
     * METHODS TABLE CAMPAING
     * @param driver
     * @return
     */
    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"campaing_b_add", getElements("campaing_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_interface_desc", getElements("add_i_interface_desc")}, // element path
                "interface_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_campaign",getElements("add_i_campaign")},
                "campaign", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_manual",getElements("add_sl_manual")},
                "Manual", "manual", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_affect"),"affect",true,true,where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_ledger", getElements("add_lov_ledger")}, //LoV button
                new String[]{"add_i_ledger", getElements("add_i_ledger")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ledger", //name of the data
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.simpleClick(driver,
                new String[]{"campaing_rb_all", getElements("campaing_rb_all")}, //element to click
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_campaign",getElements("search_i_campaign")},
                "campaign", getData("campaign"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_name",getElements("search_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_manual",getElements("search_sl_manual")},
                getData("manual"), "manual", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_affect"),"affect",true,true,where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_ledger", getElements("search_lov_ledger")}, //LoV button
                new String[]{"search_i_ledger", getElements("search_i_ledger")}, //external LoV input
                new String[]{"search_lov_ledger_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("ledger"), // value to search
                "ledger", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"campaing_e_result", getElements("campaing_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"campaing_b_edit", getElements("campaing_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_manual",getElements("add_sl_manual")},
                "Automatic", "manual", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_affect"),"affect",false,true,where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_ledger", getElements("add_lov_ledger")}, //LoV button
                new String[]{"add_i_ledger", getElements("add_i_ledger")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "ledger", //name of the data
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"campaing_e_result", getElements("campaing_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"campaing_b_qbe", getElements("campaing_b_qbe")},// query button
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_desc", getElements("qbe_i_interface_desc")},
                "interface_des", getData("interface_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_campaign", getElements("qbe_i_campaign")},
                "campaign", getData("campaign"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name_ca", getElements("qbe_i_name_ca")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_manual",getElements("qbe_sl_manual")},
                getData("manual"), "manual", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_affect",getElements("qbe_sl_affect")},
                getData("affect"), "affect", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ledger", getElements("qbe_i_ledger")},
                "ledger", getData("ledger"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, //any query input
                new String[]{"campaing_e_result", getElements("campaing_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if(!Functions.auditData(driver,
                new String[]{"campaing_b_actions",getElements("campaing_b_actions")}, //actions button
                new String[]{"campaing_b_actions_b_audit_data",getElements("campaing_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"campaing_b_detach", getElements("campaing_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"campaing_b_delete", getElements("campaing_b_delete")}, //button delete
                new String[]{"campaing_e_records", getElements("campaing_e_records")}, // result
                new String[]{"campaing_b_delete_yes", getElements("campaing_b_delete_yes")}, //delete button yes
                where)){return false;}
        return true;
    }

    /**
     * METHODS TABLE TRANSFER
     * @param driver
     * @return
     */
    public boolean interaction_add_transfer (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"transfer_b_add", getElements("transfer_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_amount",getElements("add_i_amount")},
                "amount", "", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_currency",getElements("add_i_currency")},
                "currency", "", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_voucher_nr",getElements("add_i_voucher_nr")},
                "v_num", String.valueOf(DataGenerator.random(1,8000)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_voucher_name",getElements("add_i_voucher_name")},
                "v_name", DataGenerator.getRandomAlphanumericSequence(6,true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_control",getElements("add_i_control")},
                "control", String.valueOf(DataGenerator.random(1,1000)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to",getElements("add_lov_to")}, // b_lov
                new String[]{"add_i_to", getElements("add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_begin_trip",getElements("add_i_begin_trip")},
                "b_trip", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_end_trip",getElements("add_i_end_trip")},
                "e_trip",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,15), 0), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_begin_voucher",getElements("add_i_begin_voucher")},
                "b_voucher", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_end_voucher",getElements("add_i_end_voucher")},
                "e_voucher",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,15), 0), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_associated_partner",getElements("add_lov_associated_partner")}, // b_lov
                new String[]{"add_i_associated_partner", getElements("add_i_associated_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "associated", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_associated_desc", getElements("add_i_associated_desc")}, // element path
                "associated_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_allot",getElements("add_i_allot")},
                "allot", String.valueOf(DataGenerator.random(1,500)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_availability",getElements("add_i_availability")},
                "availability", String.valueOf(DataGenerator.random(1,102)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_100x100",getElements("add_i_100x100")},
                "perc", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_mail",getElements("add_i_mail")},
                "mail", DataGenerator.getRandomAlphanumericSequence(8,false) + "@mail.es", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_depart",getElements("add_lov_depart")}, // b_lov
                new String[]{"add_i_depart", getElements("add_i_depart")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "depart", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_notes",getElements("add_i_notes")},
                "notes", DataGenerator.getRandomAlphanumericSequence(8,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_transfer(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"transfer_b_edit", getElements("transfer_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_100x100",getElements("add_i_100x100")},
                "perc", "", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_voucher_name",getElements("add_i_voucher_name")},
                "v_name", DataGenerator.getRandomAlphanumericSequence(6,true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_control",getElements("add_i_control")},
                "control", String.valueOf(DataGenerator.random(1,1000)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_to",getElements("add_lov_to")}, // b_lov
                new String[]{"add_i_to", getElements("add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_begin_trip",getElements("add_i_begin_trip")},
                "b_trip", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_end_trip",getElements("add_i_end_trip")},
                "e_trip",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,15), 0), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_begin_voucher",getElements("add_i_begin_voucher")},
                "b_voucher", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_end_voucher",getElements("add_i_end_voucher")},
                "e_voucher",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1,15), 0), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_associated_partner",getElements("add_lov_associated_partner")}, // b_lov
                new String[]{"add_i_associated_partner", getElements("add_i_associated_partner")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "associated", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_associated_desc", getElements("add_i_associated_desc")}, // element path
                "associated_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_allot",getElements("add_i_allot")},
                "allot", String.valueOf(DataGenerator.random(1,500)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_availability",getElements("add_i_availability")},
                "availability", String.valueOf(DataGenerator.random(1,102)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_amount",getElements("add_i_amount")},
                "amount", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_currency",getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_mail",getElements("add_i_mail")},
                "mail", DataGenerator.getRandomAlphanumericSequence(8,false) + "@mail.es", where)){return false;}
        if(!Functions.createLovByValue(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                new String[]{"add_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "E10", // value to search
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_office",getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_depart",getElements("add_lov_depart")}, // b_lov
                new String[]{"add_i_depart", getElements("add_i_depart")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "depart", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_notes",getElements("add_i_notes")},
                "notes", DataGenerator.getRandomAlphanumericSequence(8,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_transfer(TestDriver driver, boolean first) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"transfer_b_qbe", getElements("transfer_b_qbe")},// query button
                new String[]{"qbe_i_voucher_nr", getElements("qbe_i_voucher_nr")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (first) {
            Functions.zoomOut(driver);
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_voucher_nr", getElements("qbe_i_voucher_nr")},
                "v_num", getData("v_num"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_voucher_name", getElements("qbe_i_voucher_name")},
                "v_name", getData("v_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_control", getElements("qbe_i_control")},
                "control", getData("control"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_begin_trip", getElements("qbe_i_begin_trip")},
                "b_trip", getData("b_trip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_end_trip", getElements("qbe_i_end_trip")},
                "e_trip", getData("e_trip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_begin_voucher", getElements("qbe_i_begin_voucher")},
                "b_voucher", getData("b_voucher"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_end_voucher", getElements("qbe_i_end_voucher")},
                "e_voucher", getData("e_voucher"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_associated_partner", getElements("qbe_i_associated_partner")},
                "associated", getData("associated"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "associated_desc", getData("associated_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_allot", getElements("qbe_i_allot")},
                "allot", getData("allot"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_availability", getElements("qbe_i_availability")},
                "availability", getData("availability"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_100x100", getElements("qbe_i_100x100")},
                "perc", getData("perc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount", getElements("qbe_i_amount")},
                "amount", getData("amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency"), where)) {
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
        if (!Functions.insertInput(driver, new String[]{"qbe_i_depart", getElements("qbe_i_depart")},
                "depart", getData("depart"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_voucher_nr", getElements("qbe_i_voucher_nr")}, //any query input
                new String[]{"transfer_e_result", getElements("transfer_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_transfer(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if(!Functions.auditData(driver,
                new String[]{"transfer_b_actions",getElements("transfer_b_actions")}, //actions button
                new String[]{"transfer_b_actions_b_audit_data",getElements("transfer_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"transfer_b_detach", getElements("transfer_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_transfer(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"transfer_b_delete", getElements("transfer_b_delete")},
                new String[]{"transfer_e_records", getElements("transfer_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
