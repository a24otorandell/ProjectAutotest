package screen.AT2MDMOR0017;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 27/10/2016.
 */
public class AT2MDMOR0017Test {
    protected AT2MDMOR0017Locators locators;
    protected AT2MDMOR0017Data data;

    public AT2MDMOR0017Test() {
    }
    public AT2MDMOR0017Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0017Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0017Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0017Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Labels Reports Maintenance");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        if (!delete_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_report", getElements("add_lov_report")}, // b_lov
                new String[]{"add_i_report", getElements("add_i_report")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "report", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")}, // element path
                "order", getData("order"), where)) {
            return false;
        }
        //OMITIMOS ESTE PASO PORQUE LOS REPORTS NO ACEPTAN BUSINESS EN LA CREACIÓN NI EN LA EDICIÓN
      /*if (!Functions.createLov(driver,
                new String[]{"add_lov_business", getElements("add_lov_business")}, // b_lov
                new String[]{"add_i_business", getElements("add_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.createLov(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_department", getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_id_web", getElements("add_lov_id_web")}, // b_lov
                new String[]{"add_i_id_web", getElements("add_i_id_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "id_web", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_notes", getElements("add_i_notes")}, // element path
                "notes", getData("notes"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_label", getElements("add_i_label")}, // element path
                "label", getData("label"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_report", getElements("search_lov_report")}, //LoV button
                new String[]{"search_i_report", getElements("search_i_report")}, //external LoV input
                new String[]{"search_lov_report_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("report"), // value to search
                "report", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_language", getElements("search_lov_language")}, //LoV button
                new String[]{"search_i_language", getElements("search_i_language")}, //external LoV input
                new String[]{"search_lov_language_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("language"), // value to search
                "language", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_order", getElements("search_i_order")}, // element path
                "order", getData("order"), where)) {
            return false;
        }
        //OMITIMOS PORQUE AL NO HABER BUSINESS SE BUSCA UN VALOR NULO Y NO CONTINÚA EL CÓDIGO
        /*if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_business", getElements("search_lov_business")}, //LoV button
                new String[]{"search_i_business", getElements("search_i_business")}, //external LoV input
                new String[]{"search_lov_business_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("business"), // value to search
                "business", //name of the data
                where)) {
            return false;
        }*/
        //OMITIMOS PORQUE AL NO HABER BUSINESS NO HAY DESCRIPCIÓN, SÓLO UN VALOR NULL
        /*if(!Functions.getText(driver,new String[]{"search_e_description_result", getElements("search_e_description_result")}, // element path
                "description", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description_result"), where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company"), // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("office"), // value to search
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_department", getElements("search_lov_department")}, //LoV button
                new String[]{"search_i_department", getElements("search_i_department")}, //external LoV input
                new String[]{"search_lov_department_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("department"), // value to search
                "department", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_id_web", getElements("search_lov_id_web")}, //LoV button
                new String[]{"search_i_id_web", getElements("search_i_id_web")}, //external LoV input
                new String[]{"search_lov_id_web_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("id_web"), // value to search
                "id_web", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_notes", getElements("search_i_notes")}, // element path
                "notes", getData("notes"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_label", getElements("search_i_label")}, // element path
                "label", getData("label"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_report", getElements("add_lov_report")}, // b_lov
                new String[]{"add_i_report", getElements("add_i_report")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "report", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_order", getElements("add_i_order")}, // element path
                "order", getData("order_edit"), where)) {
            return false;
        }
        //OMITIMOS ESTE PASO PORQUE LOS REPORTS NO ACEPTAN BUSINESS EN LA CREACIÓN NI EN LA EDICIÓN
       /*if (!Functions.createLov(driver,
                new String[]{"add_lov_business", getElements("add_lov_business")}, // b_lov
                new String[]{"add_i_business", getElements("add_i_business")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "business", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.createLov(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_department", getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_id_web", getElements("add_lov_id_web")}, // b_lov
                new String[]{"add_i_id_web", getElements("add_i_id_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "id_web", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_notes", getElements("add_i_notes")}, // element path
                "notes", getData("notes_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_label", getElements("add_i_label")}, // element path
                "label", getData("label_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver, 2);
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_report", getElements("qbe_i_report")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_report", getElements("qbe_i_report")},
                "report", getData("report"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "language", getData("language"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        /*if (!Functions.insertInput(driver, new String[]{"qbe_i_business", getElements("qbe_i_business")},
                "business", getData("business"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department", getElements("qbe_i_department")},
                "department", getData("department"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_id_web", getElements("qbe_i_id_web")},
                "id_web", getData("id_web"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_notes", getElements("qbe_i_notes")},
                "notes", getData("notes"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_report", getElements("qbe_i_report")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_detach", getElements("MDM_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_delete", getElements("MDM_b_delete")},
                new String[]{"MDM_e_records", getElements("MDM_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}