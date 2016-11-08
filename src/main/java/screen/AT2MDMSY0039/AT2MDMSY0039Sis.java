package screen.AT2MDMSY0039;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY0039Sis {
    protected AT2MDMSY0039Locators locators;
    protected AT2MDMSY0039Data data;
    public AT2MDMSY0039Sis() {
    }
    public AT2MDMSY0039Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0039Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0039Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0039Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("List of reports");
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
        if (!delete(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"reports_b_add", getElements("reports_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_report",getElements("add_i_report")},
                "report", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_proc_name",getElements("add_i_proc_name")},
                "proc",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc",getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_lines",getElements("add_i_lines")},
                "lines",  String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_l_letter",getElements("add_i_l_letter")},
                "letter", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_fax_lines",getElements("add_i_fax_lines")},
                "fax",  String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_orientation",getElements("add_i_orientation")},
                "orientation", "H", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_size",getElements("add_i_size")},
                "size",  String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_graphic"),"graphic",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_visible_screen"),"visible",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_modify_labels"),"modify",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_business_labels"),"business",true,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_report",getElements("search_i_report")},
                "report", getData("report"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_proc_name",getElements("search_i_proc_name")},
                "proc",  getData("proc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_desc",getElements("search_i_desc")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_lines",getElements("search_i_lines")},
                "lines",  getData("lines"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_l_letter",getElements("search_i_l_letter")},
                "letter", getData("letter"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_fax_lines",getElements("search_i_fax_lines")},
                "fax",  getData("fax"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_orientation",getElements("search_i_orientation")},
                "orientation", getData("orientation"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_size",getElements("search_i_size")},
                "size",  getData("size"), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_graphic"),"graphic",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_visible_screen"),"visible",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_modify_labels"),"modify",true,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_business_labels"),"business",true,true, where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"reports_e_result", getElements("reports_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"reports_b_edit", getElements("reports_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_report",getElements("add_i_report")},
                "report", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_proc_name",getElements("add_i_proc_name")},
                "proc",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc",getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_lines",getElements("add_i_lines")},
                "lines",  String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_l_letter",getElements("add_i_l_letter")},
                "letter", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_fax_lines",getElements("add_i_fax_lines")},
                "fax",  String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_orientation",getElements("add_i_orientation")},
                "orientation", "V", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_size",getElements("add_i_size")},
                "size",  String.valueOf(DataGenerator.random(1,50)), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_graphic"),"graphic",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_visible_screen"),"visible",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_modify_labels"),"modify",false,true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_business_labels"),"business",false,true, where)){return false;}
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
                new String[]{"reports_e_result", getElements("reports_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"reports_b_qbe", getElements("reports_b_qbe")},// query button
                new String[]{"qbe_i_report", getElements("qbe_i_report")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_report",getElements("qbe_i_report")},
                "report", getData("report"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_proc_name",getElements("qbe_i_proc_name")},
                "proc",  getData("proc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc",getElements("qbe_i_desc")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lines",getElements("qbe_i_lines")},
                "lines",  getData("lines"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_l_lines",getElements("qbe_i_l_lines")},
                "letter", getData("letter"), where)){return false;}
        Functions.zoomOut(driver);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_fax_lines",getElements("qbe_i_fax_lines")},
                "fax",  getData("fax"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_orientation",getElements("qbe_i_orientation")},
                "orientation", getData("orientation"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_size",getElements("qbe_i_size")},
                "size",  getData("size"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_graphic",getElements("qbe_sl_graphic")},
                getData("graphic"), "graphic", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_visible_screen",getElements("qbe_sl_visible_screen")},
                getData("visible"), "visible", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_modify_labels",getElements("qbe_sl_modify_labels")},
                getData("modify"), "modify", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_business_labels",getElements("qbe_sl_business_labels")},
                getData("business"), "business", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_report", getElements("qbe_i_report")}, //any query input
                new String[]{"reports_e_result", getElements("reports_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"reports_b_actions", getElements("reports_b_actions")}, //actions button
                new String[]{"reports_b_actions_b_audit_data", getElements("reports_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"reports_b_detach", getElements("reports_b_detach")}, //detach button
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
                new String[]{"reports_b_delete", getElements("reports_b_delete")},
                new String[]{"reports_e_records", getElements("reports_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
