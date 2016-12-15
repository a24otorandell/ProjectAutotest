package screen.AT2MDMOR0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMOR0010Sis {
    protected AT2MDMOR0010Locators locators;
    protected AT2MDMOR0010Data data;
    public AT2MDMOR0010Sis() {
    }
    public AT2MDMOR0010Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0010Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0010Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0010Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Departments per company");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    private boolean interaction_record(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"department_b_add", getElements("department_b_add")}, //element to click
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
        if(!Functions.getValue(driver,new String[]{"add_i_company_des", getElements("add_i_company_des")}, // element path
                "c_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_dept",getElements("add_lov_dept")}, // b_lov
                new String[]{"add_i_dept", getElements("add_i_dept")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dept", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_dept_desc", getElements("add_i_dept_desc")}, // element path
                "d_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.fileUploader(driver,
                new String[]{"add_logo_01", getElements("add_logo_01")},
                new String[]{"logo1", getData("file_new")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_logo_02", getElements("add_logo_02")},
                new String[]{"logo2", getData("file_new")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_logo_03", getElements("add_logo_03")},
                new String[]{"logo3", getData("file_new")},
                where)) {
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
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_creditor_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_dept", getElements("search_lov_dept")}, //LoV button
                new String[]{"search_i_dept", getElements("search_i_dept")}, //external LoV input
                new String[]{"search_lov_dept_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("dept"), // value to search
                "dept", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"department_e_result", getElements("department_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"department_b_edit", getElements("department_b_edit")}, //element to click
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
                "company", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_company_des", getElements("add_i_company_des")}, // element path
                "c_desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_dept",getElements("add_lov_dept")}, // b_lov
                new String[]{"add_i_dept", getElements("add_i_dept")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "dept", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_dept_desc", getElements("add_i_dept_desc")}, // element path
                "d_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.fileUploader(driver,
                new String[]{"add_logo_01", getElements("add_logo_01")},
                new String[]{"logo1", getData("file_new2")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_logo_02", getElements("add_logo_02")},
                new String[]{"logo2", getData("file_new2")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_logo_03", getElements("add_logo_03")},
                new String[]{"logo3", getData("file_new2")},
                where)) {
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
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"department_e_result", getElements("department_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"department_b_qbe", getElements("department_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company_des", getElements("qbe_i_company_des")},
                "c_desc", getData("c_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dept", getElements("qbe_i_dept")},
                "dept", getData("dept"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dept_desc", getElements("qbe_i_dept_desc")},
                "d_desc", getData("d_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //any query input
                new String[]{"department_e_result", getElements("department_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"department_b_actions", getElements("department_b_actions")}, //actions button
                new String[]{"department_b_actions_b_audit_data", getElements("department_b_actions_b_audit_data")}, //audit button
                new String[]{"department_e_close_audit", getElements("department_e_close_audit")}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"department_b_detach", getElements("department_b_detach")}, //detach button
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
                new String[]{"department_b_delete", getElements("department_b_delete")},
                new String[]{"department_e_records", getElements("department_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
