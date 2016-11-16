package screen.AT2MDMUS0002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

/**
 * Created by jmrios on 15/11/2016.
 */
public class AT2MDMUS0002Test {
    protected AT2MDMUS0002Locators locators;
    protected AT2MDMUS0002Data data;

    public AT2MDMUS0002Test() {
    }
    public AT2MDMUS0002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0002Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0002Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("Printer workplace");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_jp_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_jp_MDM(driver)) return false;
        if (!qbe_jp_MDM(driver)) return false;
        if (!others_actions_jp_MDM(driver)) return false;
        if (!interaction_record_jpp_MDM(driver)) return false;
        if (!qbe_jpp_true_MDM(driver)) return false;
        if (!interaction_edit_jpp_MDM(driver)) return false;
        if (!qbe_jpp_false_MDM(driver)) return false;
        if (!others_actions_jpp_MDM(driver)) return false;
        if (!delete_jpp_MDM(driver)) return false;
        if (!delete_jp_MDM(driver)) return false;
        if (!actions(driver)) return false;
        return false;
    }

    private boolean interaction_record_jp_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_jp_b_add", getElements("MDM_jp_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_jp_i_job_position", getElements("add_jp_i_job_position")}, // element path
                "job_position", getData("job_position"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_jp_i_description", getElements("add_jp_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_jp_i_short_name", getElements("add_jp_i_short_name")}, // element path
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_jp_lov_company", getElements("add_jp_lov_company")}, // b_lov
                new String[]{"add_jp_i_company", getElements("add_jp_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "jp_company", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_jp_e_company_description", getElements("add_jp_e_company_description")}, // element path
                "company_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_jp_lov_office", getElements("add_jp_lov_office")}, // b_lov
                new String[]{"add_jp_i_office", getElements("add_jp_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "jp_office", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_jp_e_office_description", getElements("add_jp_e_office_description")}, // element path
                "office_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_jp_lov_department", getElements("add_jp_lov_department")}, // b_lov
                new String[]{"add_jp_i_department", getElements("add_jp_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "jp_department", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_jp_e_department_description", getElements("add_jp_e_department_description")}, // element path
                "department_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_jp_b_save", getElements("add_jp_b_save")}, //element to click
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
        if (!Functions.insertInput(driver, new String[]{"search_jp_i_job_position", getElements("search_jp_i_job_position")}, // element path
                "job_position", getData("job_position"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_jp_i_description", getElements("search_jp_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_jp_i_short_name", getElements("search_jp_i_short_name")}, // element path
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_jp_lov_company", getElements("search_jp_lov_company")}, //LoV button
                new String[]{"search_jp_i_company", getElements("search_jp_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("jp_company"), // value to search
                "jp_company", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_jp_lov_office", getElements("search_jp_lov_office")}, //LoV button
                new String[]{"search_jp_i_office", getElements("search_jp_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("jp_office"), // value to search
                "jp_office", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_jp_lov_department", getElements("search_jp_lov_department")}, //LoV button
                new String[]{"search_jp_i_department", getElements("search_jp_i_department")}, //external LoV input
                new String[]{"search_lov_department_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("jp_department"), // value to search
                "jp_department", //name of the data
                where)){
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_jp_e_result", getElements("MDM_jp_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;

    }
    private boolean interaction_edit_jp_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_jp_b_edit", getElements("MDM_jp_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_jp_i_description", getElements("add_jp_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_jp_i_short_name", getElements("add_jp_i_short_name")}, // element path
                "short_name", getData("short_name_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_jp_lov_company", getElements("add_jp_lov_company")}, // b_lov
                new String[]{"add_jp_i_company", getElements("add_jp_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "jp_company", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_jp_e_company_description", getElements("add_jp_e_company_description")}, // element path
                "company_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_jp_lov_office", getElements("add_jp_lov_office")}, // b_lov
                new String[]{"add_jp_i_office", getElements("add_jp_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "jp_office", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_jp_e_office_description", getElements("add_jp_e_office_description")}, // element path
                "office_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_jp_lov_department", getElements("add_jp_lov_department")}, // b_lov
                new String[]{"add_jp_i_department", getElements("add_jp_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "jp_department", //Data name
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"add_jp_e_department_description", getElements("add_jp_e_department_description")}, // element path
                "department_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_jp_b_save", getElements("add_jp_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_jp_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_jp_b_qbe", getElements("MDM_jp_b_qbe")},// query button
                new String[]{"qbe_jp_i_job_position", getElements("qbe_jp_i_job_position")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_job_position", getElements("qbe_jp_i_job_position")},
                "job_position", getData("job_position"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_description", getElements("qbe_jp_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_short_name", getElements("qbe_jp_i_short_name")},
                "short_name", getData("short_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_company", getElements("qbe_jp_i_company")},
                "jp_company", getData("jp_company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_company_description", getElements("qbe_jp_i_company_description")},
                "company_description", getData("company_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_office", getElements("qbe_jp_i_office")},
                "jp_office", getData("jp_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_office_description", getElements("qbe_jp_i_office_description")},
                "office_description", getData("office_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_department", getElements("qbe_jp_i_department")},
                "jp_department", getData("jp_department"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jp_i_department_description", getElements("qbe_jp_i_department_description")},
                "department_description", getData("department_description"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_jp_i_job_position", getElements("qbe_jp_i_job_position")}, //search button
                new String[]{"MDM_jp_e_result", getElements("MDM_jp_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_jp_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_jp_b_detach", getElements("MDM_jp_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_jpp_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_jpp_b_add", getElements("MDM_jpp_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_jpp_lov_spooler",getElements("add_jpp_lov_spooler")}, // b_lov
                new String[]{"add_jpp_i_spooler", getElements("add_jpp_i_spooler")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "spooler", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"add_jpp_e_printer", getElements("add_jpp_e_printer")}, // element path
                "printer", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_jpp_lov_paper",getElements("add_jpp_lov_paper")}, // b_lov
                new String[]{"add_jpp_i_paper", getElements("add_jpp_i_paper")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "paper", //Data name
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.getText(driver,new String[]{"add_jpp_e_company", getElements("add_jpp_e_company")}, // element path
                "jpp_company", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.getText(driver,new String[]{"add_jpp_e_office", getElements("add_jpp_e_office")}, // element path
                "jpp_office", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.getText(driver,new String[]{"add_jpp_e_department", getElements("add_jpp_e_department")}, // element path
                "jpp_department", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.checkboxValue(driver, getElements("add_jpp_cb_default"),
                "default", true, true,
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_jpp_b_save", getElements("add_jpp_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_jpp_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_jpp_e_result", getElements("MDM_jpp_e_result")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_jpp_b_edit", getElements("MDM_jpp_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.getText(driver,new String[]{"add_jpp_e_company", getElements("add_jpp_e_company")}, // element path
                "jpp_company", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.getText(driver,new String[]{"add_jpp_e_office", getElements("add_jpp_e_office")}, // element path
                "jpp_office", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if(!Functions.getText(driver,new String[]{"add_jpp_e_department", getElements("add_jpp_e_department")}, // element path
                "jpp_department", // key for data value (the name)
                where)) {
            return false;
        }
        if(!Functions.checkboxValue(driver, getElements("add_jpp_cb_default"),
                "default", false, true,
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_jpp_b_save", getElements("add_jpp_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_jpp_true_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_jpp_b_qbe", getElements("MDM_jpp_b_qbe")},// query button
                new String[]{"qbe_jpp_i_spooler", getElements("qbe_jpp_i_spooler")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_spooler", getElements("qbe_jpp_i_spooler")},
                "spooler", getData("spooler"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_printer", getElements("qbe_jpp_i_printer")},
                "printer", getData("printer"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_paper", getElements("qbe_jpp_i_paper")},
                "paper", getData("paper"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_company", getElements("qbe_jpp_i_company")},
                "jpp_company", getData("jpp_company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_office", getElements("qbe_jpp_i_office")},
                "jpp_office", getData("jpp_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_department", getElements("qbe_jpp_i_department")},
                "jpp_department", getData("jpp_department"), where)) {
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"qbe_jpp_sl_default", getElements("qbe_jpp_sl_default")},
                "Yes", "default",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_jpp_i_spooler", getElements("qbe_jpp_i_spooler")}, //search button
                new String[]{"MDM_jpp_e_result", getElements("MDM_jpp_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_jpp_false_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_jpp_b_qbe", getElements("MDM_jpp_b_qbe")},// query button
                new String[]{"qbe_jpp_i_spooler", getElements("qbe_jpp_i_spooler")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_spooler", getElements("qbe_jpp_i_spooler")},
                "spooler", getData("spooler"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_printer", getElements("qbe_jpp_i_printer")},
                "printer", getData("printer"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_paper", getElements("qbe_jpp_i_paper")},
                "paper", getData("paper"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_company", getElements("qbe_jpp_i_company")},
                "jpp_company", getData("jpp_company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_office", getElements("qbe_jpp_i_office")},
                "jpp_office", getData("jpp_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_jpp_i_department", getElements("qbe_jpp_i_department")},
                "jpp_department", getData("jpp_department"), where)) {
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"qbe_jpp_sl_default", getElements("qbe_jpp_sl_default")},
                "No", "default",
                where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_jpp_i_spooler", getElements("qbe_jpp_i_spooler")}, //search button
                new String[]{"MDM_jpp_e_result", getElements("MDM_jpp_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_jpp_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_jpp_b_detach", getElements("MDM_jpp_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_jpp_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_jpp_b_delete", getElements("MDM_jpp_b_delete")},
                new String[]{"MDM_jpp_e_records", getElements("MDM_jpp_e_records")},
                new String[]{"MDM_jpp_b_delete_ok", getElements("MDM_jpp_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_jp_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_jp_b_delete", getElements("MDM_jp_b_delete")},
                new String[]{"MDM_jp_e_records", getElements("MDM_jp_e_records")},
                new String[]{"MDM_jp_b_delete_ok", getElements("MDM_jp_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean actions(TestDriver driver) {
        driver.getReport().addHeader("ACTIONS RECORD", 3, false);
        String where = " on ACTIONS";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_jp_b_qbe_clear", getElements("MDM_jp_b_qbe_clear")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_jpp_b_qbe_clear", getElements("MDM_jpp_b_qbe_clear")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLov(driver,
                new String[]{"search_act_lov_spooler", getElements("search_act_lov_spooler")}, // b_lov
                new String[]{"search_act_i_spooler", getElements("search_act_i_spooler")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "act_spooler", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_act_i_ip_address", getElements("search_act_i_ip_address")}, // element path
                "job_position", getData("job_position"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"MDM_act_b_search_ip", getElements("MDM_act_b_search_ip")}, //search button
                new String[]{"MDM_jp_e_result", getElements("MDM_jp_e_result")}, //result element
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_act_b_copy_id", getElements("MDM_act_b_copy_id")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_jpp_e_result", getElements("MDM_jpp_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_act_b_copy_paper_type", getElements("MDM_act_b_copy_paper_type")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
}
