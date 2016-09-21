package screen.AT2ACCSU0026;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 13/09/2016.
 */
public class AT2ACCSU0026Test {
    protected AT2ACCSU0026Locators locators;
    protected AT2ACCSU0026Data data;

    public AT2ACCSU0026Test() {

    }

    public AT2ACCSU0026Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0026Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0026Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0026Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("TTOO Quality Groups");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {


        if (!Agreements_users(driver)) {
            return false;
        }


        return false;
    }

    private boolean Agreements_users(TestDriver driver) {

        if (!Kam_user(driver)) {
            return false;
        }
        if (!Controller_user(driver)) {
            return false;
        }


        return true;
    }


    private boolean Controller_user(TestDriver driver) {


        if (!Add_controller(driver)) {
            return false;
        }
        if (!Search_controller(driver)) {
            return false;
        }
        if (!Edit_controller(driver)) {
            return false;
        }
        if (!QBE_controller(driver)) {
            return false;
        }
        if (!Other_actions_controller(driver)) {
            return false;
        }
        if (!Delete_controller(driver)) {
            return false;
        }


        return true;
    }

    private boolean Delete_controller(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN CONTROLER", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"controler_del_b_delete", getElements("controler_del_b_delete")},
                new String[]{"controler_del_i_record", getElements("controler_del_i_record")},
                new String[]{"controler_del_b_delete_ok", getElements("controler_del_b_delete_ok")},
                " on DELETE")) {
            return false;
        }

        return true;
    }

    private boolean Other_actions_controller(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN CONTROLER", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"controler_b_detach", getElements("controler_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean QBE_controller(TestDriver driver) {
        driver.getReport().addHeader("QBE IN CONTROLER", 3, false);
        if (!Functions.simpleClick(driver,
                new String[]{"controler_se_b_reset", getElements("controler_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"controler_qbe_b_qbe", getElements("controler_qbe_b_qbe")},// query button
                new String[]{"controler_qbe_i_user", getElements("controler_qbe_i_user")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"controler_qbe_i_user", getElements("controler_qbe_i_user")},
                "qbe_user", data.getData().get("user"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"controler_qbe_i_user_description", getElements("controler_qbe_i_user_description")},
                "qbe_des_user", data.getData().get("descr_user"), " on QBE ")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"controler_qbe_i_user_description", getElements("controler_qbe_i_user_description")}, //search button
                new String[]{"controler_se_result", getElements("controler_se_result")}, //result element
                " on QBE")) {
            return false;
        }


        return true;
    }

    private boolean Edit_controller(TestDriver driver) {

        driver.getReport().addHeader("EDIT IN CONTROLER", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"controler_b_edit", getElements("controler_b_edit")}, //element to click
                new String[]{"controler_ed_i_user", getElements("controler_ed_i_user")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"controler_ed_i_user", getElements("controler_ed_i_user")},
                "user", "PB4", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"controler_ed_i_user_description", getElements("controler_ed_i_user_description")},
                "descr_user", "Prueba4", " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"controler_ed_b_save", getElements("controler_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }


        return true;
    }

    private boolean Search_controller(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN CONTROLER", 3, false);

        if (!Functions.insertInput(driver,
                new String[]{"controler_se_i_user", getElements("controler_se_i_user")},
                "se_user", data.getData().get("user"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"controler_se_i_user_description", getElements("controler_se_i_user_description")},
                "se_des_user", data.getData().get("descr_user"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"controler_se_b_search", getElements("controler_se_b_search")}, //search button
                new String[]{"controler_se_result", getElements("controler_se_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }

        return true;
    }


    private boolean Add_controller(TestDriver driver) {
        driver.getReport().addHeader("ADD IN CONTROLER", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"controler_b_add", getElements("controler_b_add")}, //element to click
                new String[]{"controler_add_i_user", getElements("controler_add_i_user")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"controler_add_i_user", getElements("controler_add_i_user")},
                "user", "PB3", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"controler_add_i_user_description", getElements("controler_add_i_user_description")},
                "descr_user", "Prueba3", " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"controler_add_b_save", getElements("controler_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }


    private boolean Kam_user(TestDriver driver) {

        if (!Add_kam(driver)) {
            return false;
        }
        if (!Search_kam(driver)) {
            return false;
        }
        if (!Edit_kam(driver)) {
            return false;
        }
        if (!QBE_kam(driver)) {
            return false;
        }
        if (!Other_actions_kam(driver)) {
            return false;
        }
        if (!Delete_kam(driver)) {
            return false;
        }
        return true;
    }

    private boolean Delete_kam(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN KAM", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"kam_del_b_delete", getElements("kam_del_b_delete")},
                new String[]{"kam_del_i_record", getElements("kam_del_i_record")},
                new String[]{"Kam_del_b_delete_ok", getElements("Kam_del_b_delete_ok")},
                " on DELETE")) {
            return false;
        }


        return true;
    }


    private boolean Other_actions_kam(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN KAM", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"Kam_b_detach", getElements("Kam_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean QBE_kam(TestDriver driver) {

        driver.getReport().addHeader("QBE IN KAM", 3, false);
        if (!Functions.simpleClick(driver,
                new String[]{"kam_se_b_reset", getElements("kam_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"kam_qbe_b_qbe", getElements("kam_qbe_b_qbe")},// query button
                new String[]{"kam_qbe_i_user", getElements("kam_qbe_i_user")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"kam_qbe_i_user", getElements("kam_qbe_i_user")},
                "qbe_user", data.getData().get("user"), " on QBE ")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"Kam_qbe_i_user_description", getElements("Kam_qbe_i_user_description")},
                "qbe_des_user", data.getData().get("descr_user"), " on QBE ")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"Kam_qbe_i_user_description", getElements("Kam_qbe_i_user_description")}, //search button
                new String[]{"kam_se_result", getElements("kam_se_result")}, //result element
                " on QBE")) {
            return false;
        }


        return true;
    }

    private boolean Edit_kam(TestDriver driver) {

        driver.getReport().addHeader("EDIT IN KAM", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"kam_b_edit", getElements("kam_b_edit")}, //element to click
                new String[]{"kam_ed_i_user", getElements("kam_ed_i_user")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"kam_ed_i_user", getElements("kam_ed_i_user")},
                "user", "PB2", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"Kam_ed_i_user_description", getElements("Kam_ed_i_user_description")},
                "descr_user", "Prueba2", " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"kam_ed_b_save", getElements("kam_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }


        return true;
    }

    private boolean Search_kam(TestDriver driver) {

        driver.getReport().addHeader(" BASIC SEARCH IN KAM", 3, false);

        if (!Functions.insertInput(driver,
                new String[]{"kam_se_i_user", getElements("kam_se_i_user")},
                "se_user", data.getData().get("user"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"Kam_se_i_user_description", getElements("Kam_se_i_user_description")},
                "se_des_user", data.getData().get("descr_user"), " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"kam_se_b_search", getElements("kam_se_b_search")}, //search button
                new String[]{"kam_se_result", getElements("kam_se_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }

        return true;
    }

    private boolean Add_kam(TestDriver driver) {

        driver.getReport().addHeader("ADD IN KAM", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"kam_b_add", getElements("kam_b_add")}, //element to click
                new String[]{"kam_add_i_user", getElements("kam_add_i_user")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"kam_add_i_user", getElements("kam_add_i_user")},
                "user", "PB1", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"Kam_add_i_user_description", getElements("Kam_add_i_user_description")},
                "descr_user", "Prueba1", " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"kam_add_b_save", getElements("kam_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }

}
