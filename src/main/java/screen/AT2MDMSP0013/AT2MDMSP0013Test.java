package screen.AT2MDMSP0013;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMSP0013Test {
    protected AT2MDMSP0013Locators locators;
    protected AT2MDMSP0013Data data;
    public AT2MDMSP0013Test() {
    }
    public AT2MDMSP0013Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0013Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0013Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0013Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("SWS Profiles 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_profiles(driver)) return false;
        if (!search_profiles(driver)) return false;
        if (!interaction_edit_profiles(driver)) return false;
        if (!qbe_profiles(driver)) return false;
        if (!others_actions_profiles(driver)) return false;
        if (!delete_profiles(driver)) return false;
        return true;
    }

    public boolean interaction_add_profiles (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"profiles_b_add", getElements("profiles_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_profile",getElements("add_i_profile")},
                "profile", DataGenerator.getRandomAlphanumericSequence(10,true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(20,true), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_profiles(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_profile",getElements("search_i_profile")},
                "profile", getData("profile"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_description",getElements("search_i_description")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"profiles_e_result", getElements("profiles_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_profiles(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"profiles_b_edit", getElements("profiles_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_profile",getElements("add_i_profile")},
                "profile", DataGenerator.getRandomAlphanumericSequence(10,true), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(20,true), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_profiles(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"profiles_e_result", getElements("profiles_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"profiles_b_qbe", getElements("profiles_b_qbe")},// query button
                new String[]{"qbe_i_profile", getElements("qbe_i_profile")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_profile", getElements("qbe_i_profile")},
                "profile", getData("profile"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_profile", getElements("qbe_i_profile")}, //search button
                new String[]{"profiles_e_result", getElements("profiles_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_profiles(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"profiles_b_actions", getElements("profiles_b_actions")}, //actions button
                new String[]{"profiles_b_actions_b_audit_data", getElements("profiles_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"profiles_b_detach", getElements("profiles_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_profiles(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"profiles_b_delete", getElements("profiles_b_delete")},
                new String[]{"profiles_e_records", getElements("profiles_e_records")},
                where)){
            return false;
        }
        return true;
    }

}
