package screen.AT2MDMSP0017;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 09/11/2016.
 */
public class AT2MDMSP0017Test {
    protected AT2MDMSP0017Locators locators;
    protected AT2MDMSP0017Data data;
    public AT2MDMSP0017Test() {
    }
    public AT2MDMSP0017Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0017Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0017Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0017Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("VCC Suppliers");
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
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        Functions.break_time(driver, 3, 670);
        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_add", getElements("suppliers_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_supplier",getElements("add_lov_supplier")}, // b_lov
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_vcc",getElements("add_sl_vcc")},
                "WireCard", "vcc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_from",getElements("add_i_from")},
                "from", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_to",getElements("add_i_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8, 3), 0), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type_",getElements("add_sl_type_")},
                "Creation Date", "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_days",getElements("add_i_days")},
                "days", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_expiration_days",getElements("add_i_expiration_days")},
                "expiration", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_cost"),"cost",true,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_card"),"card",true,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_advice"),"advice",true,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_cvc"),"cvc",true,true,where)){return false;}//where
        if (!Functions.insertInput(driver, new String[]{"add_i_days_previous",getElements("add_i_days_previous")},
                "previous", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_address_book",getElements("add_sl_address_book")},
                "Invoicing", "address", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                new String[]{"z", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"search_i_comercial", getElements("search_i_comercial")}, // element path
                "comercial", // key for data value (the name)
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_vcc",getElements("search_sl_vcc")},
                getData("vcc"), "vcc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_from",getElements("search_i_from")},
                "from",getData("from"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_to",getElements("search_i_to")},
                "to", getData("to"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_days",getElements("search_i_days")},
                "days", getData("days"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_expiration",getElements("search_i_expiration")},
                "expiration", getData("expiration"), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_cost"),"cost",true,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_card"),"card",true,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_advice"),"advice",true,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_cvc"),"cvc",true,true,where)){return false;}//where
        if (!Functions.insertInput(driver, new String[]{"search_i_days_previous",getElements("search_i_days_previous")},
                "previous", getData("previous"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_address_book",getElements("search_sl_address_book")},
                getData("address"), "address", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_edit", getElements("suppliers_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_supplier",getElements("add_lov_supplier")}, // b_lov
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_vcc",getElements("add_sl_vcc")},
                "General Electric", "vcc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_from",getElements("add_i_from")},
                "from", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_to",getElements("add_i_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8, 3), 0), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type_",getElements("add_sl_type_")},
                "Arrival Date", "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_days",getElements("add_i_days")},
                "days", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_expiration_days",getElements("add_i_expiration_days")},
                "expiration", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_cost"),"cost",false,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_card"),"card",false,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_advice"),"advice",false,true,where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_cvc"),"cvc",false,true,where)){return false;}//where
        if (!Functions.insertInput(driver, new String[]{"add_i_days_previous",getElements("add_i_days_previous")},
                "previous", String.valueOf(DataGenerator.random(1,20)), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_address_book",getElements("add_sl_address_book")},
                "Bookings", "address", where)){return false;}
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
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"suppliers_b_qbe", getElements("suppliers_b_qbe")},// query button
                new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")},
                "supplier", getData("supplier"), where)) {
            return false;
        }
/*        if (!Functions.insertInput(driver, new String[]{"qbe_i_comercial", getElements("qbe_i_comercial")},
                "comercial", getData("comercial"), where)) {
            return false;
        }*/
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_vcc",getElements("qbe_sl_vcc")},
                getData("vcc"), "vcc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from",getElements("qbe_i_from")},
                "from",getData("from"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to",getElements("qbe_i_to")},
                "to", getData("to"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_days",getElements("qbe_i_days")},
                "days", getData("days"), where)){return false;}
        Functions.zoomOut(driver);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_expiration_days",getElements("qbe_i_expiration_days")},
                "expiration", getData("expiration"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_cost",getElements("qbe_sl_cost")},
                getData("cost"), "cost", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_card",getElements("qbe_sl_card")},
                getData("card"), "card", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_advice",getElements("qbe_sl_advice")},
                getData("advice"), "advice", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_cvc",getElements("qbe_sl_cvc")},
                getData("cvc"), "cvc", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_days_previous_to_sending",getElements("qbe_i_days_previous_to_sending")},
                "previous", getData("previous"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_address_book",getElements("qbe_sl_address_book")},
                getData("address"), "address", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")}, //any query input
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //table result
                where)){return false;}

        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"suppliers_b_actions", getElements("suppliers_b_actions")}, //actions button
                new String[]{"suppliers_b_actions_b_audit_data", getElements("suppliers_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"suppliers_b_detach", getElements("suppliers_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
