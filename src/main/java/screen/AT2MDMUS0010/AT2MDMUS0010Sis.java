package screen.AT2MDMUS0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 09/11/2016.
 */
public class AT2MDMUS0010Sis {
    protected AT2MDMUS0010Locators locators;
    protected AT2MDMUS0010Data data;
    public AT2MDMUS0010Sis() {
    }
    public AT2MDMUS0010Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0010Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0010Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0010Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Users per interface 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search(driver)) return false;
        if (!getDatos(driver)) return false;
        if (!cambiarPass(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        return true;
    }

    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_user", getElements("search_lov_user")}, //LoV button
                new String[]{"search_i_user", getElements("search_i_user")}, //external LoV input
                new String[]{"search_lov_user_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("user"), // value to search
                "user", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"passwords_e_result", getElements("passwords_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean getDatos (TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on GET DATOS";
        if(!Functions.getText(driver,new String[]{"table_e_user", getElements("table_e_user")}, // element path
                "user", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_name", getElements("table_e_name")}, // element path
                "name", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_surname1", getElements("table_e_surname1")}, // element path
                "surname1", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_e_surname2", getElements("table_e_surname2")}, // element path
                "surname2", // key for data value (the name)
                where)){return false;}
        return true;
    }
    public boolean cambiarPass (TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on CAMBIAR PASS";
        if(!Functions.checkClick(driver,
                new String[]{"passwords_b_actions", getElements("passwords_b_actions")}, //element to click
                new String[]{"passwords_b_actions_b_change", getElements("passwords_b_actions_b_change")}, //element expected to appear
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"passwords_b_actions_b_change", getElements("passwords_b_actions_b_change")}, //element to click
                new String[]{"change_b_ok", getElements("change_b_ok")}, //element expected to appear
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"change_i_new_pass",getElements("change_i_new_pass")},
                "pass", DataGenerator.getRandomAlphanumericSequence(5,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"change_i_confirm",getElements("change_i_confirm")},
                "new", getData("pass"), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"change_b_ok", getElements("change_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){return false;}
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"passwords_e_result", getElements("passwords_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"passwords_b_qbe", getElements("passwords_b_qbe")},// query button
                new String[]{"qbe_i_user", getElements("qbe_i_user")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_user",getElements("qbe_i_user")},
                "user", getData("user"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name",getElements("qbe_i_name")},
                "name", getData("name"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname1",getElements("qbe_i_surname1")},
                "surname1", getData("surname1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname2",getElements("qbe_i_surname2")},
                "surname2", getData("surname2"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_user", getElements("qbe_i_user")}, //any query input
                new String[]{"passwords_e_result", getElements("passwords_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"passwords_b_detach", getElements("passwords_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
