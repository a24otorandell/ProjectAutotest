package screen.AT2MDMSP0008;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0008Test {
    protected AT2MDMSP0008Locators locators;
    protected AT2MDMSP0008Data data;
    public AT2MDMSP0008Test() {
    }
    public AT2MDMSP0008Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0008Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0008Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0008Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("Third party suppliers 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add(driver)) return false;
        if (!search(driver, false, true)) return false;
        if (!qbe(driver, false, true)) return false;
        if (!interaction_edit(driver)) return false;
        if (!search(driver, true, false)) return false;
        if (!qbe(driver, true, false)) return false;
        if (!others_actions(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        Functions.break_time(driver, 3, 600);
        if (!Functions.checkClick(driver,
                new String[]{"supplier_b_add", getElements("supplier_b_add")}, //element to click
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
                new String[]{"add_lov_supplier",getElements("add_lov_supplier")}, // b_lov
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_application_date",getElements("add_i_application_date")},
                "date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8, 3), 0), where)){return false;}
/*        if (!Functions.insertInput(driver, new String[]{"add_i_amount",getElements("add_i_amount")},
                "amount", String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_currency",getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"add_i_commission",getElements("add_i_commission")},
                "comission", DataGenerator.randomFloat(1,50), where)){return false;}
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_ck_inhouse"),
                    "inhouse", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_ck_inhouse"),
                    "inhouse", false, true,
                    where)){
                return false;
            }
        }

/*        if (!Functions.checkboxValue(driver,
                getElements("add_ck_inhouse"),"inhouse",inhouse,true,where)){return false;}*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver, boolean currency, boolean commision) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                new String[]{"search_lov_supplier_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_application_date", getElements("search_i_application_date")},
                "date", getData("date"), where)) {
            return false;
        }
        if (currency) {
            if (!Functions.insertInput(driver, new String[]{"search_i_amount", getElements("search_i_amount")},
                    "amount", getData("amount"), where)) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_currency", getElements("search_lov_currency")}, //LoV button
                    new String[]{"search_i_currency", getElements("search_i_currency")}, //external LoV input
                    new String[]{"search_lov_currency_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("currency"), // value to search
                    "currency", //name of the data
                    where)) {
                return false;
            }
        }
        if (commision) {
            if (!Functions.insertInput(driver, new String[]{"search_i_commission", getElements("search_i_commission")},
                    "comission", getData("comission"), where)) {
                return false;
            }
        }
        Functions.break_time(driver, 3, 500);
        boolean inhouse;
        if (getData("inhouse").equalsIgnoreCase("yes")) {
            inhouse = true;
        }else{
            inhouse = false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.checkboxValue(driver, getElements("search_ck_inhouse"), "inhouse", inhouse, true, where)) {
                return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"supplier_e_result", getElements("supplier_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.simpleClick(driver,
                new String[]{"supplier_qbe_reset", getElements("supplier_qbe_reset")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"supplier_b_edit", getElements("supplier_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commission",getElements("add_i_commission")},
                "comission", "", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
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
                new String[]{"add_lov_supplier",getElements("add_lov_supplier")}, // b_lov
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "supplier", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_description", getElements("add_i_description")}, // element path
                "desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_application_date",getElements("add_i_application_date")},
                "date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8, 3), 0), where)){return false;}
        Functions.break_time(driver, 10, 700);
        if (!Functions.insertInput(driver, new String[]{"add_i_amount",getElements("add_i_amount")},
                "amount", DataGenerator.randomFloat(1,50), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_currency",getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)){return false;}
        Random booleanValue = new Random();
        boolean getRandomBoolean = booleanValue.nextBoolean();
        String randomBoolean;
        if (getRandomBoolean){
            randomBoolean= "Yes";
            if(!Functions.checkboxValue(driver, getElements("add_ck_inhouse"),
                    "inhouse", true, true,
                    where)) {
                return false;
            }
        }
        else {
            randomBoolean="No";
            if(!Functions.checkboxValue(driver, getElements("add_ck_inhouse"),
                    "inhouse", false, true,
                    where)){
                return false;
            }
        }
/*        if (!Functions.checkboxValue(driver,
                getElements("add_ck_inhouse"),"inhouse",inhouse,true,where)){return false;}*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver, boolean currency, boolean commision) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"supplier_e_result", getElements("supplier_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"supplier_b_qbe", getElements("supplier_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")},
                "supplier", getData("supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application_date", getElements("qbe_i_application_date")},
                "date", getData("date"), where)) {
            return false;
        }
        if (currency) {
            if (!Functions.insertInput(driver, new String[]{"qbe_i_amount", getElements("qbe_i_amount")},
                    "amount", getData("amount"), where)) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                    "currency", getData("currency"), where)) {
                return false;
            }
        }
        if (commision) {
            if (!Functions.insertInput(driver, new String[]{"qbe_i_commission", getElements("qbe_i_commission")},
                    "comission", getData("comission"), where)) {
                return false;
            }
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_inhouse",getElements("qbe_sl_inhouse")},
                getData("inhouse"), "inhouse", where)){return false;}

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //any query input
                new String[]{"supplier_e_result", getElements("supplier_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if(!Functions.auditData(driver,
                new String[]{"supplier_b_actions",getElements("supplier_b_actions")}, //actions button
                new String[]{"supplier_b_actions_b_audit_data",getElements("supplier_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"supplier_b_detach", getElements("supplier_b_detach")}, //detach button
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
                new String[]{"supplier_b_delete", getElements("supplier_b_delete")}, //button delete
                new String[]{"supplier_e_records", getElements("supplier_e_records")}, // result
                where)){return false;}
        return true;
    }
}
