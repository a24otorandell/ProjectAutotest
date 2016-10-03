package screen.AT2MDMOR0029;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * @author ajvirgili on 27/09/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2MDMOR0029Sis {

    protected AT2MDMOR0029Locators locators;
    protected AT2MDMOR0029Data data;

    public AT2MDMOR0029Sis(String enviroment) {
        setData(new AT2MDMOR0029Data(enviroment));
        setLocators(new AT2MDMOR0029Locators(enviroment));
    }
    public AT2MDMOR0029Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0029Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0029Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0029Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {

        if (!Service_authorization(driver)) {
            return false;
        }


        return false;
    }

    private boolean Service_authorization(TestDriver driver) {

        if (!Add_service(driver)) {
            return false;
        }

        if (!Search_service(driver)) {
            return false;
        }

        if (!Edit_service(driver)) {
            return false;
        }

        if (!QBE_service(driver)) {
            return false;
        }

        if (!Other_actions_service(driver)) {
            return false;
        }

        if (!Delete_service(driver)) {
            return false;
        }
        return true;
    }
    private boolean Delete_service(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN SERVICE AUTORIZATION", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"service_authorization_del_b_delete", getElements("service_authorization_del_b_delete")},
                new String[]{"service_authorization_del_e_records", getElements("service_authorization_del_e_records")},
                new String[]{"service_authorization_del_b_delete_b_yes", getElements("service_authorization_del_b_delete_b_yes")},
                " on DELETE")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_service(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN SERVICE AUTORIZATION", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"service_authorization_oa_b_detach", getElements("service_authorization_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }
    private boolean QBE_service(TestDriver driver) {

        driver.getReport().addHeader(" QBE IN SERVICE AUTORIZATION", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_se_b_reset", getElements("service_authorization_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_se_b_search", getElements("service_authorization_se_b_search")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"service_authorization_qbe_b_qbe", getElements("service_authorization_qbe_b_qbe")},// query button
                new String[]{"service_authorization_qbe_i_atlas_company", getElements("service_authorization_qbe_i_atlas_company")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"service_authorization_qbe_i_atlas_company", getElements("service_authorization_qbe_i_atlas_company")},
                "qbe_atlas_company", data.getData().get("atlas_company"), "on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_qbe_i_receptive", getElements("service_authorization_qbe_i_receptive")},
                "qbe_receptive", data.getData().get("receptive"), "on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_qbe_i_text", getElements("service_authorization_qbe_i_text")},
                "qbe_text", data.getData().get("text"), "on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_qbe_i_apply_date_from", getElements("service_authorization_qbe_i_apply_date_from")},
                "qbe_from", data.getData().get("from"), "on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_qbe_i_apply_date_to", getElements("service_authorization_qbe_i_apply_date_to")},
                "qbe_to", data.getData().get("to"), "on QBE")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"service_authorization_qbe_sl_cod_division", getElements("service_authorization_qbe_sl_cod_division")},
                data.getData().get("cod_division"), "qbe_cod_division", " on QBE")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"service_authorization_qbe_i_text", getElements("service_authorization_qbe_i_text")}, //search button
                new String[]{"service_authorization_se_e_result", getElements("service_authorization_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;
    }
    private boolean Edit_service(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN SERVICE AUTORIZATION", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_ed_b_edit", getElements("service_authorization_ed_b_edit")}, //element to click
                new String[]{"service_authorization_ed_ch_atlas_company", getElements("service_authorization_ed_ch_atlas_company")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_ed_ch_atlas_company", getElements("service_authorization_ed_ch_atlas_company")}, //element to click
                new String[]{"service_authorization_ed_sl_atlas_company_e_company", getElements("service_authorization_ed_sl_atlas_company_e_company")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_ed_sl_atlas_company_e_company", getElements("service_authorization_ed_sl_atlas_company_e_company")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"service_authorization_ed_i_atlas_company", getElements("service_authorization_ed_i_atlas_company")}, // element path
                "atlas_company", // key for data value (the name)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_ed_ch_receptive", getElements("service_authorization_ed_ch_receptive")}, //element to click
                new String[]{"service_authorization_ed_sl_receptive_e_code", getElements("service_authorization_ed_sl_receptive_e_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_ed_sl_receptive_e_code", getElements("service_authorization_ed_sl_receptive_e_code")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"service_authorization_ed_i_receptive", getElements("service_authorization_ed_i_receptive")}, // element path
                "receptive", // key for data value (the name)
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_ed_i_text", getElements("service_authorization_ed_i_text")},
                "text", "Prueba2", "on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_ed_i_apply_date_from", getElements("service_authorization_ed_i_apply_date_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 10), 0), "on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_ed_i_apply_fate_to", getElements("service_authorization_ed_i_apply_fate_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(6, 10), 0), "on EDIT")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"service_authorization_ed_sl_cod_division", getElements("service_authorization_ed_sl_cod_division")},
                "DS", "cod_division", " on EDIT")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"service_authorization_ed_b_save", getElements("service_authorization_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;
    }
    private boolean Search_service(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN SERVICE AUTORIZATION", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_se_se_company_atlas", getElements("service_authorization_se_se_company_atlas")}, //element to click
                new String[]{"service_authorization_se_se_ompany_atlas_e_code", getElements("service_authorization_se_se_ompany_atlas_e_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_se_se_ompany_atlas_e_code", getElements("service_authorization_se_se_ompany_atlas_e_code")}, //element to click
                " on SEARCH")) {
            return false;
        }


        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_se_sl_receptive", getElements("service_authorization_se_sl_receptive")}, //element to click
                new String[]{"service_authorization_se_sl_receptive_e_code", getElements("service_authorization_se_sl_receptive_e_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_se_sl_receptive_e_code", getElements("service_authorization_se_sl_receptive_e_code")}, //element to click
                " on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_se_i_text", getElements("service_authorization_se_i_text")},
                "se_text", data.getData().get("text"), "on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_se_i_apply_date_from", getElements("service_authorization_se_i_apply_date_from")},
                "se_from", data.getData().get("from"), "on SEARCH")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_se_i_apply_date_to", getElements("service_authorization_se_i_apply_date_to")},
                "se_to", data.getData().get("to"), "on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"service_authorization_se_sl_cod_division", getElements("service_authorization_se_sl_cod_division")},
                data.getData().get("cod_division"), "se_cod_divisions", " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"service_authorization_se_b_search", getElements("service_authorization_se_b_search")}, //search button
                new String[]{"service_authorization_se_e_result", getElements("service_authorization_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }

        return true;
    }
    private boolean Add_service(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN SERVICE AUTORIZATION", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_add_b_add", getElements("service_authorization_add_b_add")}, //element to click
                new String[]{"service_authorization_add_ch_atlas_company", getElements("service_authorization_add_ch_atlas_company")}, //element expected to appear
                60, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_add_ch_atlas_company", getElements("service_authorization_add_ch_atlas_company")}, //element to click
                new String[]{"service_authorization_add_sl_atlas_company_e_company", getElements("service_authorization_add_sl_atlas_company_e_company")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_add_sl_atlas_company_e_company", getElements("service_authorization_add_sl_atlas_company_e_company")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"service_authorization_add_i_atlas_company", getElements("service_authorization_add_i_atlas_company")}, // element path
                "atlas_company", // key for data value (the name)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"service_authorization_add_ch_receptive", getElements("service_authorization_add_ch_receptive")}, //element to click
                new String[]{"service_authorization_add_sl_receptive_e_code", getElements("service_authorization_add_sl_receptive_e_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"service_authorization_add_sl_receptive_e_code", getElements("service_authorization_add_sl_receptive_e_code")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"service_authorization_add_i_receptive", getElements("service_authorization_add_i_receptive")}, // element path
                "receptive", // key for data value (the name)
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_add_i_text", getElements("service_authorization_add_i_text")},
                "text", "prueba1", "on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_add_i_apply_date_from", getElements("service_authorization_add_i_apply_date_from")},
                "from", DataGenerator.getToday(driver, "dd/MM/yyyy"), "on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"service_authorization_add_i_apply_fate_to", getElements("service_authorization_add_i_apply_fate_to")},
                "to", DataGenerator.getToday(driver, "dd/MM/yyyy"), "on ADD")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"service_authorization_add_sl_cod_division", getElements("service_authorization_add_sl_cod_division")},
                "TAB", "cod_division", " on ADD")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"service_authorization_add_b_save", getElements("service_authorization_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }
        return true;
    }
}
