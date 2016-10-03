package screen.AT2ACCOP0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by lchacartegui on 31/08/2016.
 */

/* TODO BUG: Fallan todos los campos fecha en la qbe del history */


public class AT2ACCOP0005Sis {
    protected AT2ACCOP0005Locators locators;
    protected AT2ACCOP0005Data data;

    public AT2ACCOP0005Sis() {
    }
    public AT2ACCOP0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCOP0005Locators locators) {
        this.locators = locators;
    }
    public AT2ACCOP0005Data getData() {
        return data;
    }
    public void setData(AT2ACCOP0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Merchant procedence country");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        Functions.zoomOut(driver);
        if (!create(driver, true)) {
            return false;
        }
        if (!search(driver)) {
            return false;
        }
        if (!create(driver, false)) {
            return false;
        }
        if (!qbe(driver)) {
            return false;
        }
        if (!otherFunctions(driver)) {
            return false;
        }
        if (!delete(driver)) {
            return false;
        }
        if (!history_get_values(driver)) return false;
        if (!history_qbe(driver)) return false;
        return true;
    }
    ////////// - CREATE/EDIT - //////////
    private boolean create(TestDriver driver, boolean add) {
        String where;
        String[] element_result;

        if (add) {
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            where = " on ADD ";
            element_result = recursiveXPaths.lov_e_result;

            if (!Functions.checkExistence(driver,
                    "",
                    "merchant",//data name (x)
                    new String[]{"search_i_merchant", getElements("search_i_merchant")},//input
                    new String[]{"search_b_search", getElements("search_b_search")},//search button
                    new String[]{"general_e_result", getElements("wgeneral_e_result")},//expected not found result
                    "both",//type of input
                    8,
                    "on CHECK EXISTENCE")) {
                return false;
            }//where

            if (!Functions.checkClick(driver,
                    new String[]{"add_b_add", getElements("add_b_add")},
                    recursiveXPaths.glass,
                    where)) {
                return false;
            }

            if (!Functions.insertInput(driver,
                    new String[]{"add_i_merchant", getElements("add_i_merchant")},
                    "merchant",
                    getData("merchant"),
                    where)) {
                return false;
            }

        } else {
            driver.getReport().addHeader("RECORD EDITION", 3, true);
            where = " on EDIT ";
            element_result = recursiveXPaths.lov_e_altresult;

            if (!Functions.checkClick(driver,
                    new String[]{"add_b_edit", getElements("add_b_edit")},
                    recursiveXPaths.glass,
                    where)) {
                return false;
            }
        }

        if (!Functions.createLov(driver,
                new String[]{"add_lov_countrycode", getElements("add_lov_countrycode")}, // b_lov
                new String[]{"add_i_countrycode", getElements("add_i_countrycode")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                element_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country_code", //Data name
                where)) {
            return false;
        }  // where the operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    ////////// - SEARCH - //////////
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("RECORD SEARCH", 3, true);

        if (!Functions.insertInput(driver,
                new String[]{"search_i_merchant", getElements("search_i_merchant")},
                "merchant",
                getData("merchant"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_countrycode", getElements("search_lov_countrycode")}, //LoV button
                new String[]{"search_i_country_code", getElements("search_i_country_code")}, //external LoV input
                new String[]{"search_lov_countrycode_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("country_code"), // value to search
                "country_code", //name of the data
                " on SEARCH ")) {
            return false;
        } //where this operation occurs

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"general_e_result", getElements("general_e_result")}, //result element
                " on SEARCH ")) {
            return false;
        } // where

        return true;
    }
    ////////// - QBE - //////////
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("RECORD QBE", 3, true);

        if (!Functions.simpleClick(driver,
                new String[]{"general_b_reset", getElements("general_b_reset")}, //element to click
                " on QBE ")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"qbe_b_qbe", getElements("qbe_b_qbe")},// query button
                new String[]{"qbe_i_bibitmerchant", getElements("qbe_i_bibitmerchant")},//any query input
                " on QBE ")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_bibitmerchant", getElements("qbe_i_bibitmerchant")},
                "merchant",
                getData("merchant"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_domiciledcountry", getElements("qbe_i_domiciledcountry")},
                "country_code",
                getData("country_code"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_bibitmerchant", getElements("qbe_i_bibitmerchant")}, //any query input
                new String[]{"general_e_result", getElements("general_e_result")}, //table result
                " on QBE ")) {
            return false;
        } // where this operation occurs

        return true;
    }
    ////////// - OTHER FUNCTIONS - //////////
    private boolean otherFunctions(TestDriver driver) {
        driver.getReport().addHeader("RECORD OTHER FUNCTIONS", 3, true);

        if (!Functions.auditData(driver,
                new String[]{"general_b_actions", getElements("general_b_actions")}, //actions button
                new String[]{"general_b_actions_b_audit", getElements("general_b_actions_b_audit")}, //audit button
                new String[]{"general_b_actions_b_audit_b_ok", getElements("general_b_actions_b_audit_b_ok")}, //audit_b_ok
                false, //zoom in??
                " on AUDIT DATA ")) {
            return false;
        } //where this occurs

        if (!Functions.detachTable(driver,
                new String[]{"general_b_detach", getElements("general_b_detach")}, //detach button
                true,     //screenshot??
                false, //zoom in??
                " on DETACH ")) {
            return false;
        }    //where this occurs

        return true;
    }
    ////////// - HISTORY GET VALUES - //////////
    private boolean history_get_values(TestDriver driver) {
        driver.getReport().addHeader("RECORD HISTORY: GET VALUES", 3, true);

        if (!Functions.checkClick(driver,
                new String[]{"general_b_actions", getElements("general_b_actions")}, //element to click
                new String[]{"actions_b_history", getElements("actions_b_history")}, //element expected to appear
                " on HISTORY GET VALUES ")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"actions_b_history", getElements("actions_b_history")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on HISTORY GET VALUES ")) {
            return false;
        }

        if (!Functions.getText(driver,
                new String[]{"history_e_fec_iniv", getElements("history_e_fec_iniv")}, // element path
                "fec_iniv", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        if (!Functions.getText(driver,
                new String[]{"history_e_fec_finv", getElements("history_e_fec_finv")}, // element path
                "fec_finv", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        if (!Functions.getText(driver,
                new String[]{"history_e_office_time_from", getElements("history_e_office_time_from")}, // element path
                "office_time_from", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        if (!Functions.getText(driver,
                new String[]{"history_e_office_time_to", getElements("history_e_office_time_to")}, // element path
                "office_time_to", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        if (!Functions.getText(driver,
                new String[]{"history_e_usu_finv", getElements("history_e_usu_finv")}, // element path
                "usu_finv", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        if (!Functions.getText(driver,
                new String[]{"history_e_bibit_merchant", getElements("history_e_bibit_merchant")}, // element path
                "bibit_merchant", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        if (!Functions.getText(driver,
                new String[]{"history_e_cod_pais", getElements("history_e_cod_pais")}, // element path
                "cod_pais", // key for data value (the name)
                " on HISTORY GET VALUES ")) {
            return false;
        } // where this operation occurs

        return true;
    }
    ////////// - HISTORY QBE - //////////
    private boolean history_qbe(TestDriver driver) {
        driver.getReport().addHeader("RECORD HISTORY: QBE", 3, true);

        if (!Functions.clickQbE(driver,
                new String[]{"history_b_qbe", getElements("history_b_qbe")},// query button
                new String[]{"history_qbe_i_fec_iniv", getElements("history_qbe_i_fec_iniv")},//any query input
                " on HISTORY QBE ")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_fec_iniv", getElements("history_qbe_i_fec_iniv")},
                "fec_iniv",
                getData("fec_iniv"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_fec_finv", getElements("history_qbe_i_fec_finv")},
                "fec_finv",
                getData("fec_finv"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_office_time_from", getElements("history_qbe_i_office_time_from")},
                "office_time_from",
                getData("office_time_from"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_office_time_to", getElements("history_qbe_i_office_time_to")},
                "office_time_to",
                getData("office_time_to"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_usu_finv", getElements("history_qbe_i_usu_finv")},
                "usu_finv",
                getData("usu_finv"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_bibit_merchant", getElements("history_qbe_i_bibit_merchant")},
                "bibit_merchant",
                getData("bibit_merchant"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"history_qbe_i_cod_pais", getElements("history_qbe_i_cod_pais")},
                "cod_pais",
                getData("cod_pais"),
                " on HISTORY QBE ")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"history_qbe_i_bibit_merchant", getElements("history_qbe_i_bibit_merchant")}, //any query input
                new String[]{"history_e_result", getElements("history_e_result")}, //table result
                " on HISTORY QBE ")) {
            return false;
        } // where this operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"history_b_ok", getElements("history_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                " on HISTORY QBE ")) {
            return false;
        }

        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("RECORD DELETE", 3, true);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"general_b_delete", getElements("general_b_delete")},
                new String[]{"general_n_records", getElements("general_n_records")},
                new String[]{"delete_b_yes", recursiveXPaths.delete_b_yes},
                " on DELETE ")) {
            return false;
        }

        return true;
    }
}