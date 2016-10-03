package screen.AT2ACCOP0011;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 22/09/2016.
 */
public class AT2ACCOP0011Test {

    protected AT2ACCOP0011Locators locators;
    protected AT2ACCOP0011Data data;

    public AT2ACCOP0011Test() {

    }
    public AT2ACCOP0011Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCOP0011Locators locators) {
        this.locators = locators;
    }
    public AT2ACCOP0011Data getData() {
        return data;
    }
    public void setData(AT2ACCOP0011Data data) {
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

        if (!Mapping_errors(driver)) {
            return false;
        }


        return false;
    }

    //Mapping

    private boolean Mapping_errors(TestDriver driver) {

        if (!Add_mapping(driver)) {
            return false;
        }

        if (!Search_mapping(driver)) {
            return false;
        }

        if (!Edit_mapping(driver)) {
            return false;
        }

        if (!QBE_mapping(driver)) {
            return false;
        }

        if (!Other_actions_mapping(driver)) {
            return false;
        }

        if (!Delete_mapping(driver)) {
            return false;
        }
        return true;
    }
    private boolean Delete_mapping(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN MAPPING DESC ERRORS ", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"mapping_del_b_delete", getElements("mapping_del_b_delete")},
                new String[]{"mapping_del_e_records", getElements("mapping_del_e_records")},
                new String[]{"mapping_del_b_delete_yes", getElements("mapping_del_b_delete_yes")},
                " on DELETE")) {
            return false;
        }

        return true;
    }
    private boolean Other_actions_mapping(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN MAPPING DESC ERRORS", 3, false);


        if (!Functions.detachTable(driver,
                new String[]{"mapping_oa_b_detach", getElements("mapping_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }

        return true;
    }
    private boolean QBE_mapping(TestDriver driver) {

        driver.getReport().addHeader("QBE IN MAPPING DESC ERRORS", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"mapping_se_b_reset", getElements("mapping_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"mapping_qbe_b_qbe", getElements("mapping_qbe_b_qbe")},// query button
                new String[]{"mapping_qbe_i_error", getElements("mapping_qbe_i_error")},//any query input
                " on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mapping_qbe_i_error", getElements("mapping_qbe_i_error")},
                "qbe_error", data.getData().get("error"), " on QBE")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"mapping_qbe_i_error_description", getElements("mapping_qbe_i_error_description")},
                "qbe_error_description", data.getData().get("error_description"), " on QBE")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"mapping_qbe_i_email", getElements("mapping_qbe_i_email")},
                "qbe_email", data.getData().get("email"), " on QBE")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"mapping_qbe_sl_priority", getElements("mapping_qbe_sl_priority")},
                data.getData().get("priority"), "qbe_priority", " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"mapping_qbe_i_email", getElements("mapping_qbe_i_email")}, //search button
                new String[]{"mapping_se_e_result", getElements("mapping_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }
    private boolean Edit_mapping(TestDriver driver) {

        driver.getReport().addHeader(" EDIT IN MAPPING DESC ERRORS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mapping_ed_b_edit", getElements("mapping_ed_b_edit")}, //element to click
                new String[]{"mapping_ed_i_error", getElements("mapping_ed_i_error")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mapping_ed_i_error", getElements("mapping_ed_i_error")},
                "error", (Integer.toString(DataGenerator.random(20, 100))), " on EDIT")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"mapping_ed_i_error_description", getElements("mapping_ed_i_error_description")},
                "error_description", "Prueba2", " on EDIT")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"mapping_ed_sl_priority", getElements("mapping_ed_sl_priority")},
                "Low", "priority", " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mapping_ed_i_email", getElements("mapping_ed_i_email")},
                "email", "Prueba2@Prueba2.es", " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"mapping_ed_b_exit", getElements("mapping_ed_b_exit")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;
    }
    private boolean Search_mapping(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN MAPPING DESC ERRORS", 3, false);

        if (!Functions.insertInput(driver, new String[]{"mapping_se_i_error", getElements("mapping_se_i_error")},
                "error", data.getData().get("error"), " on ADD")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"mapping_se_i_email", getElements("mapping_se_i_email")},
                "error_description", data.getData().get("email"), " on ADD")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"mapping_se_sl_priority", getElements("mapping_se_sl_priority")},
                data.getData().get("priority"), "priority", " on ADD")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"mapping_se_b_search", getElements("mapping_se_b_search")}, //search button
                new String[]{"mapping_se_e_result", getElements("mapping_se_e_result")}, //Falta crear este resultado por bug
                " on SEARCH")) {
            return false;
        }

        return true;
    }
    private boolean Add_mapping(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN MAPPING DESC ERRORS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"mapping_add_b_add", getElements("mapping_add_b_add")}, //element to click
                new String[]{"mapping_add_i_error", getElements("mapping_add_i_error")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mapping_add_i_error", getElements("mapping_add_i_error")},
                "error", (Integer.toString(DataGenerator.random(20, 100))), " on ADD")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"mapping_add_i_error_description", getElements("mapping_add_i_error_description")},
                "error_description", "Prueba1", " on ADD")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"mapping_add_sl_priority", getElements("mapping_add_sl_priority")},
                "High", "priority", " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"mapping_add_i_email", getElements("mapping_add_i_email")},
                "email", "prueba@prueba.es", " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"mapping_add_b_exit", getElements("mapping_add_b_exit")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }
        return true;
    }


}
