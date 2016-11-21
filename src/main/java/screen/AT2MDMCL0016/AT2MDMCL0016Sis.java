package screen.AT2MDMCL0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 03/11/2016.
 */
public class AT2MDMCL0016Sis {
    protected AT2MDMCL0016Locators locators;
    protected AT2MDMCL0016Data data;
    public AT2MDMCL0016Sis() {
    }
    public AT2MDMCL0016Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0016Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0016Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0016Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Tour Operators Groups");
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
        if (!qbe_to(driver)) return false;
        if (!others_actions_to(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"group_b_add", getElements("group_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group_code", getElements("add_i_group_code")},
                "code", DataGenerator.getRandomAlphanumericSequence(4, true), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group_name", getElements("add_i_group_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6, true), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_hotelextras_group"),"hotelextras",true,true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_group_code", getElements("search_i_group_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_group_name", getElements("search_i_group_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"group_e_result", getElements("group_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"group_b_edit", getElements("group_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_group_name", getElements("add_i_group_name")},
                "name", DataGenerator.getRandomAlphanumericSequence(6, true), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_hotelextras_group"),"hotelextras",false,true, where)){return false;}
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
                new String[]{"group_e_result", getElements("group_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"group_b_qbe", getElements("group_b_qbe")},// query button
                new String[]{"qbe_i_group_code", getElements("qbe_i_group_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group_code", getElements("qbe_i_group_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group_name", getElements("qbe_i_group_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_group_code", getElements("qbe_i_group_code")}, //any query input
                new String[]{"group_e_result", getElements("group_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"group_b_actions", getElements("group_b_actions")}, //actions button
                new String[]{"group_b_actions_audit_data", getElements("group_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"group_b_detach", getElements("group_b_detach")}, //detach button
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
                new String[]{"group_b_delete", getElements("group_b_delete")},
                new String[]{"group_e_records", getElements("group_e_records")},
                where)){
            return false;
        }
        return true;
    }

    private boolean qbe_hard (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE HARD";
        if (!Functions.simpleClick(driver,
                new String[]{"qbe_reset", getElements("qbe_reset")}, //element to click
                where)){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"group_b_qbe", getElements("group_b_qbe")}, //element to click
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"group_e_result", getElements("group_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"group_b_qbe", getElements("group_b_qbe")},// query button
                new String[]{"qbe_i_group_code", getElements("qbe_i_group_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group_code", getElements("qbe_i_group_code")},
                "code", "6TOUR", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group_name", getElements("qbe_i_group_name")},
                "name", "6 TOUR", where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_group_name", getElements("qbe_i_group_name")}, //any query input
                new String[]{"group_e_result", getElements("group_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean qbe_to(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        qbe_hard(driver);
        Functions.zoomOut(driver);
        if (!Functions.clickQbE(driver,
                new String[]{"to_b_qbe", getElements("to_b_qbe")},// query button
                new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")},
                "short", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_name", getElements("qbe_i_to_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")}, //any query input
                new String[]{"to_e_result", getElements("to_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_to(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"to_b_actions", getElements("to_b_actions")}, //actions button
                new String[]{"to_b_actions_audit_data", getElements("to_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"to_b_detach", getElements("to_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

}
