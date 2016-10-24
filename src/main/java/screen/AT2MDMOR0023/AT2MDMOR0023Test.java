package screen.AT2MDMOR0023;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2MDMCL0013.AT2MDMCL0013Data;
import screen.AT2MDMCL0013.AT2MDMCL0013Locators;

import java.util.Random;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMOR0023Test {
    protected AT2MDMOR0023Locators locators;
    protected AT2MDMOR0023Data data;

    public AT2MDMOR0023Test() {
    }

    public AT2MDMOR0023Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MDMOR0023Locators locators) {
        this.locators = locators;
    }

    public AT2MDMOR0023Data getData() {
        return data;
    }

    public void setData(AT2MDMOR0023Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Report Of Offices");
        driver.getTestdetails().setSubmenu("Master Data Management");
        driver.getTestdetails().setScreen("Organization");
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
        if (!Functions.getValue(driver, new String[]{"search_e_company_result", getElements("search_e_company_result")}, // element path
                "company_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getValue(driver, new String[]{"search_e_company_description_result", getElements("search_e_company_description_result")}, // element path
                "company_description_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getValue(driver, new String[]{"search_e_office_result", getElements("search_e_office_result")}, // element path
                "office_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getValue(driver, new String[]{"search_e_receptive_description_result", getElements("search_e_receptive_description_result")}, // element path
                "receptive_description_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getValue(driver, new String[]{"search_e_receptive_code_result", getElements("search_e_receptive_code_result")}, // element path
                "receptive_code_result", // key for data value (the name)
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
                new String[]{"search_i_company", getElements("search_i_company")},
                "company_result", data.getData().get("company_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_office", getElements("search_i_office")},
                "office_result", data.getData().get("office_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_receptive_description", getElements("search_i_receptive_description")},
                "receptive_description_result", data.getData().get("receptive_description_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_receptive_code", getElements("search_i_receptive_code")},
                "receptive_code_result", data.getData().get("receptive_code_result"), where)) {
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

    private boolean qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_e_company", getElements("qbe_e_company")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_e_company", getElements("qbe_e_company")},
                "company", getData("company_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_e_company_description", getElements("qbe_e_company_description")},
                "company_description", getData("company_description_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_e_office", getElements("qbe_e_office")},
                "office", getData("office_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_e_receptive_description", getElements("qbe_e_receptive_description")},
                "receptive_description", getData("receptive_description_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_e_receptive_code", getElements("qbe_e_receptive_code")},
                "receptive_code", getData("receptive_code_result"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_e_company", getElements("qbe_e_company")}, //search button
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
