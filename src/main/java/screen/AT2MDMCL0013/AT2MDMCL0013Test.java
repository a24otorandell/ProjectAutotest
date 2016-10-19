package screen.AT2MDMCL0013;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0013Test {
    protected AT2MDMCL0013Locators locators;
    protected AT2MDMCL0013Data data;

    public AT2MDMCL0013Test() {
    }

    public AT2MDMCL0013Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MDMCL0013Locators locators) {
        this.locators = locators;
    }

    public AT2MDMCL0013Data getData() {
        return data;
    }

    public void setData(AT2MDMCL0013Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Limited availability");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Clients");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!data_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        return false;
    }

    private boolean data_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on DATA";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_ATLAS_number_result", getElements("search_e_ATLAS_number_result")}, // element path
                "ATLAS_number_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_short_name_result", getElements("search_e_short_name_result")}, // element path
                "short_name_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_TO_name_result", getElements("search_e_TO_name_result")}, // element path
                "TO_name_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_availability_disp_result", getElements("search_e_availability_disp_result")}, // element path
                "availability_disp_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_availability_iteration_number_result", getElements("search_e_availability_iteration_number_result")}, // element path
                "availability_iteration_number_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }

    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver,
                new String[]{"search_i_ATLAS_number", getElements("search_i_ATLAS_number")},
                "ATLAS_number_result", data.getData().get("ATLAS_number_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_short_name", getElements("search_i_short_name")},
                "short_name_result", "%" + data.getData().get("short_name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_TO_name", getElements("search_i_TO_name")},
                "TO_name_result", data.getData().get("TO_name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_availability_disp", getElements("search_i_availability_disp")},
                "availability_disp_result", data.getData().get("availability_disp_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_availability_iteration_number", getElements("search_i_availability_iteration_number")},
                "availability_iteration_number_result", data.getData().get("availability_iteration_number_result"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }

    private boolean interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        //ESTE PASO GENERA UN ERROR EN LA BASE DE DATOS AL INTENTAR CAMBIAR EL CAMPO "Availability disp"
        if (!Functions.selectText(driver,
                new String[]{"add_sl_availability_disp", getElements("add_sl_availability_disp")},
                "Hotel", "add_sl_availability_disp", where)) {
            return false;
        }
        //A PARTIR DE AQUÍ EL CÓDIGO VUELVE A FUNCIONAR CON NORMALIDAD
        if (!Functions.insertInput(driver, new String[]{"add_i_availability_iteration_number", getElements("add_i_availability_iteration_number")}, // element path
                "availability_iteration_number", getData("availability_iteration_number"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }

    private boolean qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_ATLAS_number", getElements("qbe_i_ATLAS_number")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ATLAS_number", getElements("qbe_i_ATLAS_number")},
                "ATLAS_number", getData("ATLAS_number_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name", getElements("qbe_i_short_name")},
                "short_name", getData("short_name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_TO_name", getElements("qbe_i_TO_name")},
                "TO_name", getData("TO_name_result"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_availability_disp", getElements("qbe_sl_availability_disp")},
                "Hotel", "availability_disp", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_availability_iteration_number", getElements("qbe_i_availability_iteration_number")},
                "availability_iteration_number", getData("availability_iteration_number"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_ATLAS_number", getElements("qbe_i_ATLAS_number")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }

    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_detach", getElements("MDM_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}