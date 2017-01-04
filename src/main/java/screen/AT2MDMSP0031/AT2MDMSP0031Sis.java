package screen.AT2MDMSP0031;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

/**
 * Created by aibanez on 16/11/2016.
 */
public class AT2MDMSP0031Sis {
    protected AT2MDMSP0031Locators locators;
    protected AT2MDMSP0031Data data;
    public AT2MDMSP0031Sis() {
    }
    public AT2MDMSP0031Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0031Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0031Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0031Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("XML Sendings (BMS)");
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
        String[] columns = {"commercial_name","supplier"};
        String table = "//*[contains(@id, '_afrLovInternalTableId::db')]";
        if (!checkexistence(driver,columns,
                "search_b_search", "search_lov_supplier","search_i_supplier", table,"supplier"))

        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";

        if (!Functions.checkClick(driver,
                new String[]{"suppliers_b_add", getElements("suppliers_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_supplier", getElements("add_lov_supplier")}, //LoV button
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, //external LoV input
                new String[]{"add_lov_supplier_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_comercial", getElements("add_i_comercial")}, // element path
                "comercial", // key for data value (the name)
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_service",getElements("add_sl_service")},
                "Hotel", "service", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_hotel",getElements("add_lov_hotel")}, // b_lov
                new String[]{"add_i_hotel", getElements("add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_hotel_desc", getElements("add_i_hotel_desc")}, // element path
                "hotel_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_url",getElements("add_i_url")},
                "url", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_client_code",getElements("add_i_client_code")},
                "client",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_send"),"send",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_mail",getElements("add_i_mail")},
                "mail",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.zoomOut(driver);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                new String[]{"search_lov_supplier_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("supplier"), // value to search
                "supplier", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_service",getElements("search_sl_service")},
                getData("service"), "service", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")}, //LoV button
                new String[]{"search_i_hotel", getElements("search_i_hotel")}, //external LoV input
                new String[]{"search_lov_hotel_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel"), // value to search
                "hotel", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_url",getElements("search_i_url")},
                "url", getData("url"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_client_code",getElements("search_i_client_code")},
                "client",  getData("client"), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_send"),"send",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_mail",getElements("search_i_mail")},
                "mail",  getData("mail"), where)){return false;}
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
        if (!Functions.selectText(driver,
                new String[]{"add_sl_service",getElements("add_sl_service")},
                "Tickets", "service", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_hotel",getElements("add_lov_hotel")}, // b_lov
                new String[]{"add_i_hotel", getElements("add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_hotel_desc", getElements("add_i_hotel_desc")}, // element path
                "hotel_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_url",getElements("add_i_url")},
                "url", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_client_code",getElements("add_i_client_code")},
                "client",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_send"),"send",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_mail",getElements("add_i_mail")},
                "mail",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
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
        if (!Functions.insertInput(driver, new String[]{"qbe_i_supplier",getElements("qbe_i_supplier")},
                "supplier", getData("supplier"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_comercial",getElements("qbe_i_comercial")},
                "comercial",  getData("comercial").replace(" ","%"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_service",getElements("qbe_sl_service")},
                getData("service"), "service", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel",getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_desc",getElements("qbe_i_hotel_desc")},
                "hotel_desc",  getData("hotel_desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_url",getElements("qbe_i_url")},
                "url", getData("url"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_client_code",getElements("qbe_i_client_code")},
                "client",  getData("client"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_send",getElements("qbe_sl_send")},
                getData("send"), "send", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")}, //any query input
                new String[]{"suppliers_e_result", getElements("suppliers_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS", 3, false);
        String where = " on AUDIT DATA";
        if(!Functions.auditData(driver,
                new String[]{"suppliers_b_actions",getElements("suppliers_b_actions")}, //actions button
                new String[]{"suppliers_b_actions_audit_data",getElements("suppliers_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
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

    private boolean checkexistence (TestDriver driver, String[] columns, String b_search, String b_lov, String input, String resulttable, String dataname){
        driver.getReport().addHeader("CHECK EXISTENCE", 3, false);
        String where = " on CHECK EXISTENCE SUPPLIER";
        int i = 1;
        if (!Functions.checkClick(driver, new String[]{b_lov, getElements(b_lov)}, recursiveXPaths.lov_b_search, where))return false;
        if (!Functions.checkClick(driver,recursiveXPaths.lov_b_search,recursiveXPaths.lov_e_result, where))return false;
        if (!collectTableDataLoV(driver,columns,resulttable,11,where))return false;
        if (!Functions.checkClickByAbsence(driver,recursiveXPaths.lov_b_ok,recursiveXPaths.glass, where))return false;
        do {
            if (!Functions.insertInput(driver, new String[]{input, getElements(input)},
                    dataname,getData(dataname+i), where)) return false;
            if (!Functions.simpleClick(driver, new String[] {b_search,getElements(b_search)}, where))return false;
            i++;
        } while (Functions.displayed(driver,getElements("suppliers_e_result")) || i >= 11);
        return true;
    }
    private boolean collectTableDataLoV (TestDriver driver, String[] columns, String xpathtable, int rows, String where){
        String xpathBegin = "/table/tbody/tr[";
        String xpathMid = "]/td[2]/div/table/tbody/tr/td[";
        String xpathEnd = "]";
        if (xpathtable.isEmpty()) {
            String ecode = "--ERROR: The xpath table is null " + where;
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            for (int i = 1; i < rows+1;i++) {
                for (int j = 1; j < columns.length + 1; j++) {
                    Functions.getText(driver,
                            new String[]{columns[j - 1], xpathtable + xpathBegin + i + xpathMid + j + xpathEnd},
                            columns[j - 1]+i, where);
                }
            }
        } catch (Exception e) {
            String ecode = "--ERROR: error to retrieve values " + where;
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

}
