package screen.AT2MDMDE0029;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMDE0029Sis {
    protected AT2MDMDE0029Locators locators;
    protected AT2MDMDE0029Data data;
    public AT2MDMDE0029Sis() {
    }
    public AT2MDMDE0029Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0029Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0029Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0029Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Set Up Web Prepayment 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_web(driver)) return false;
        if (!search_web(driver)) return false;
        if (!interaction_edit_web(driver)) return false;
        if (!qbe_web(driver)) return false;
        if (!others_actions_web(driver)) return false;
        if (!delete_web(driver)) return false;
        return true;
    }

    private boolean interaction_record_web(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        Functions.break_time(driver, 10, 400);
        if (!Functions.checkClick(driver,
                new String[]{"web_b_add", getElements("web_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 10, 400);
        if (!Functions.insertInput(driver, new String[]{"add_i_web",getElements("add_i_web")},
                "web", DataGenerator.getRandomAlphanumericSequence(10, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "description", DataGenerator.getRandomAlphanumericSequence(10, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_days",getElements("add_i_days")},
                "days", String.valueOf(DataGenerator.random(5, 20)), where)){return false;}
        if(!Functions.insertInput(driver,new String[]{"add_i_last", getElements("add_i_last")}, // element path
                "last", String.valueOf(DataGenerator.random(1, 5)), where)){return false;}
        if(!Functions.insertInput(driver,new String[]{"add_i_previst_sec", getElements("add_i_previst_sec")}, // element path
                "p_second", String.valueOf(DataGenerator.random(6, 10)), where)){return false;}
        if(!Functions.insertInput(driver,new String[]{"add_i_previst_firs", getElements("add_i_previst_firs")}, // element path
                "p_first", String.valueOf(DataGenerator.random(11, 20)), where)){return false;}
/*        if(!Functions.getValue(driver,new String[]{"add_i_last", getElements("add_i_last")}, // element path
                "last", // key for data value (the name)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_previst_sec", getElements("add_i_previst_sec")}, // element path
                "p_second", // key for data value (the name)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_previst_firs", getElements("add_i_previst_firs")}, // element path
                "p_first", // key for data value (the name)
                where)){return false;}*/
        Functions.break_time(driver, 2, 400);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_web(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 10, 400);
        if (!Functions.insertInput(driver, new String[]{"search_i_web",getElements("search_i_web")},
                "web", getData("web"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_description",getElements("search_i_description")},
                "description", getData("description"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"web_e_result", getElements("web_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_web(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        Functions.break_time(driver, 10, 400);
        if (!Functions.checkClick(driver,
                new String[]{"web_b_edit", getElements("web_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 10, 400);
        if (!Functions.insertInput(driver, new String[]{"add_i_web",getElements("add_i_web")},
                "web", DataGenerator.getRandomAlphanumericSequence(10, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "description", DataGenerator.getRandomAlphanumericSequence(10, true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_days",getElements("add_i_days")},
                "days", String.valueOf(DataGenerator.random(5, 20)), where)){return false;}
        if(!Functions.insertInput(driver,new String[]{"add_i_last", getElements("add_i_last")}, // element path
                "last", String.valueOf(DataGenerator.random(1, 5)), where)){return false;}
        if(!Functions.insertInput(driver,new String[]{"add_i_previst_sec", getElements("add_i_previst_sec")}, // element path
                "p_second", String.valueOf(DataGenerator.random(6, 10)), where)){return false;}
        if(!Functions.insertInput(driver,new String[]{"add_i_previst_firs", getElements("add_i_previst_firs")}, // element path
                "p_first", String.valueOf(DataGenerator.random(11, 20)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_web(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        /*if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"web_e_result", getElements("web_e_result")}, //result element
                where)) {
            return false;
        }*/
      /*  if (!Functions.insertInput(driver, new String[]{"search_i_web",getElements("search_i_web")},
                "web", getData("web"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_description",getElements("search_i_description")},
                "description", getData("description"), where)){return false;}*/
        Functions.break_time(driver, 10, 400);
        if (!Functions.insertInput(driver, new String[]{"search_i_web",getElements("search_i_web")},
                "web_void", "", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_description",getElements("search_i_description")},
                "description_void", "", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"web_e_result", getElements("web_e_result")}, //result element
                where)) {
            return false;
        }
        Functions.break_time(driver, 10, 400);
        if (!Functions.clickQbE(driver,
                new String[]{"web_b_qbe", getElements("web_b_qbe")},// query button
                new String[]{"qbe_i_web", getElements("qbe_i_web")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web", getElements("qbe_i_web")},
                "web", getData("web"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_days", getElements("qbe_i_days")},
                "days", getData("days"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_last", getElements("qbe_i_last")},
                "last", getData("last"), where)) {
            return false;
        }
        Functions.break_time(driver, 10, 400);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_previst_sec", getElements("qbe_i_previst_sec")},
                "p_second", getData("p_second"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_previst_firs", getElements("qbe_i_previst_firs")},
                "p_first", getData("p_first"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_web", getElements("qbe_i_web")}, //any query input
                new String[]{"web_e_result", getElements("web_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_web(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"web_b_actions", getElements("web_b_actions")}, //actions button
                new String[]{"web_b_actions_b_audit_data", getElements("web_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"web_b_detach", getElements("web_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_web(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"web_b_delete", getElements("web_b_delete")},
                new String[]{"web_e_records", getElements("web_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
