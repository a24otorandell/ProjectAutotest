package screen.AT2MDMSY1003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY1003Test {
    protected AT2MDMSY1003Locators locators;
    protected AT2MDMSY1003Data data;
    public AT2MDMSY1003Test() {
    }
    public AT2MDMSY1003Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY1003Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY1003Data getData() {
        return data;
    }
    public void setData(AT2MDMSY1003Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Parameters GVCC");
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
                new String[]{"parameters_b_add", getElements("parameters_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_param",getElements("add_i_param")},
                "param", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_value",getElements("add_i_value")},
                "value", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_type",getElements("add_i_type")},
                "type", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_environment",getElements("add_sl_environment")},
                "Live", "environment", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc",getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_param",getElements("search_i_param")},
                "param", getData("param"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"parameters_e_result", getElements("parameters_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"parameters_b_edit", getElements("parameters_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_param",getElements("add_i_param")},
                "param", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_value",getElements("add_i_value")},
                "value", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_type",getElements("add_i_type")},
                "type", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_environment",getElements("add_sl_environment")},
                "Test", "environment", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc",getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)){return false;}

        if (!Functions.clickQbE(driver,
                new String[]{"parameters_b_qbe", getElements("parameters_b_qbe")},// query button
                new String[]{"qbe_i_param", getElements("qbe_i_param")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_param",getElements("qbe_i_param")},
                "param", getData("param"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_value",getElements("qbe_i_value")},
                "value", getData("value"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type",getElements("qbe_i_type")},
                "type", getData("type"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_environment",getElements("qbe_sl_environment")},
                getData("environment"), "environment", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc",getElements("qbe_i_desc")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_param", getElements("qbe_i_param")}, //any query input
                new String[]{"parameters_e_result", getElements("parameters_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"parameters_b_actions", getElements("parameters_b_actions")}, //actions button
                new String[]{"parameters_b_actions_b_audit_data", getElements("parameters_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"parameters_b_detach", getElements("parameters_b_detach")}, //detach button
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
                new String[]{"parameters_b_delete", getElements("parameters_b_delete")},
                new String[]{"parameters_e_records", getElements("parameters_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
