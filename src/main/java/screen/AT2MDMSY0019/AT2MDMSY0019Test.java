package screen.AT2MDMSY0019;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY0019Test {
    protected AT2MDMSY0019Locators locators;
    protected AT2MDMSY0019Data data;
    public AT2MDMSY0019Test() {
    }
    public AT2MDMSY0019Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0019Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0019Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0019Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Scheduler");
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
                new String[]{"scheduler_b_add", getElements("scheduler_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_id",getElements("add_i_id")},
                "id", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_seq",getElements("add_i_seq")},
                "seq", String.valueOf(DataGenerator.random(1,4000)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_last",getElements("add_i_last")},
                "last", DataGenerator.getToday(driver,"dd/MM/yyyy HH:mm:ss"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_proc",getElements("add_i_proc")},
                "proc",  DataGenerator.getRelativeDateToday("dd/MM/yyyy HH:mm:ss", 0, DataGenerator.random(8,3), 0), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_origin",getElements("add_i_origin")},
                "origin", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_id",getElements("search_i_id")},
                "id", getData("id"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_seq",getElements("search_i_seq")},
                "seq", getData("seq"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_last",getElements("search_i_last")},
                "last", getData("last"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_proc",getElements("search_i_proc")},
                "proc",  getData("proc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_origin",getElements("search_i_origin")},
                "origin", getData("origin"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"scheduler_e_result", getElements("scheduler_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"scheduler_b_edit", getElements("scheduler_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_id",getElements("add_i_id")},
                "id", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_seq",getElements("add_i_seq")},
                "seq", String.valueOf(DataGenerator.random(1,4000)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_last",getElements("add_i_last")},
                "last", DataGenerator.getToday(driver,"dd/MM/yyyy HH:mm:ss"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_proc",getElements("add_i_proc")},
                "proc",  DataGenerator.getRelativeDateToday("dd/MM/yyyy HH:mm:ss", 0, DataGenerator.random(8,3), 0), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_origin",getElements("add_i_origin")},
                "origin", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
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
                new String[]{"scheduler_e_result", getElements("scheduler_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"scheduler_b_qbe", getElements("scheduler_b_qbe")},// query button
                new String[]{"qbe_i_id", getElements("qbe_i_id")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_id",getElements("qbe_i_id")},
                "id", getData("id"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_seq",getElements("qbe_i_seq")},
                "seq", getData("seq"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_last",getElements("qbe_i_last")},
                "last", getData("last"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_proc",getElements("qbe_i_proc")},
                "proc",  getData("proc"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_origin",getElements("qbe_i_origin")},
                "origin", getData("origin"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_id", getElements("qbe_i_id")}, //any query input
                new String[]{"scheduler_e_result", getElements("scheduler_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"scheduler_b_detach", getElements("scheduler_b_detach")}, //detach button
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
                new String[]{"scheduler_b_delete", getElements("scheduler_b_delete")},
                new String[]{"scheduler_e_records", getElements("scheduler_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
