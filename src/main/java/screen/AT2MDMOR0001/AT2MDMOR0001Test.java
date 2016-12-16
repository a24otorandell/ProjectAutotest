package screen.AT2MDMOR0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import screen.AT2MDMOR0001.AT2MDMOR0001Data;
import screen.AT2MDMOR0001.AT2MDMOR0001Locators;

/**
 * Created by jmrios on 15/12/2016.
 */
public class AT2MDMOR0001Test {
    protected AT2MDMOR0001Locators locators;
    protected AT2MDMOR0001Data data;

    public AT2MDMOR0001Test() {
        }
    public AT2MDMOR0001Locators getLocators() {
            return locators;
        }
    public void setLocators(AT2MDMOR0001Locators locators) {
            this.locators = locators;
        }
    public AT2MDMOR0001Data getData() {
            return data;
        }
    public void setData(AT2MDMOR0001Data data) {
            this.data = data;
        }
    public void start(TestDriver driver) {
            setScreenInfo(driver);
            CommonProcedures.goToScreen(driver);
        }
    protected void setScreenInfo(TestDriver driver) {
            driver.getTestdetails().setMainmenu("Master Data Management");
            driver.getTestdetails().setSubmenu("Organization");
            driver.getTestdetails().setScreen("Messages. Did you know that...?");
        }
    protected String getElements(String key) {
            return String.valueOf(this.locators.getElements().get(key));
        }
    protected String getData(String key) {
            return String.valueOf(this.data.getData().get(key));
        }

    protected boolean testCSED(TestDriver driver) {
        if (!create_message(driver)) return false;
        if (!data_cmpns_MDM(driver)) return false;
        if (!qbe_cmpns_MDM(driver)) return false;
        if (!others_actions_cmpns_MDM(driver)) return false;
        if (!data_offs_MDM(driver)) return false;
        if (!qbe_offs_MDM(driver)) return false;
        if (!others_actions_offs_MDM(driver)) return false;
        if (!data_pstns_MDM(driver)) return false;
        if (!qbe_pstns_MDM(driver)) return false;
        if (!others_actions_pstns_MDM(driver)) return false;
        if (!data_dprtms_MDM(driver)) return false;
        if (!qbe_dprtms_MDM(driver)) return false;
        if (!others_actions_dprtms_MDM(driver)) return false;
        if (!send_message(driver)) return false;
        return false;
    }

    private boolean create_message(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - CREATE MESSAGE", 3, false);
        String where = " on CREATING MESSAGE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"add_i_text", getElements("add_i_text")}, // element path
                "text", getData("text"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_url", getElements("add_i_url")}, // element path
                "url", getData("url"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String list_options[] = {"CALL CENTER", "SYSTEM DPT"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_sender", getElements("add_sl_sender")},
                list_options, "sender",
                where)) {
            return false;
        }
        return true;
    }
    private boolean data_cmpns_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        String where = " on DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.getText(driver, new String[]{"MDM_cmpns_e_company_code_result", getElements("MDM_cmpns_e_company_code_result")}, // element path
                "cmpns_company_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"MDM_cmpns_e_company_name_result", getElements("MDM_cmpns_e_company_name_result")}, // element path
                "cmpns_company_name", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean qbe_cmpns_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cmpns_b_qbe", getElements("MDM_cmpns_b_qbe")},// query button
                new String[]{"qbe_cmpns_company_code", getElements("qbe_cmpns_company_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmpns_company_code", getElements("qbe_cmpns_company_code")},
                "cmpns_company_code", getData("cmpns_company_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cmpns_company_name", getElements("qbe_cmpns_company_name")},
                "cmpns_company_name", getData("cmpns_company_name"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cmpns_company_code", getElements("qbe_cmpns_company_code")}, //search button
                new String[]{"MDM_cmpns_e_result", getElements("MDM_cmpns_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cmpns_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cmpns_b_detach", getElements("MDM_cmpns_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean data_offs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        String where = " on DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.getText(driver, new String[]{"MDM_offs_e_company_code_result", getElements("MDM_offs_e_company_code_result")}, // element path
                "offs_company_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"MDM_offs_e_office_code_result", getElements("MDM_offs_e_office_code_result")}, // element path
                "offs_office_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"MDM_offs_e_office_name_result", getElements("MDM_offs_e_office_name_result")}, // element path
                "offs_office_name", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean qbe_offs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_offs_b_qbe", getElements("MDM_offs_b_qbe")},// query button
                new String[]{"qbe_offs_company_code", getElements("qbe_offs_company_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_offs_company_code", getElements("qbe_offs_company_code")},
                "offs_company_code", getData("offs_company_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_offs_office_code", getElements("qbe_offs_office_code")},
                "offs_office_code", getData("offs_office_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_offs_office_name", getElements("qbe_offs_office_name")},
                "offs_office_name", getData("offs_office_name"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_offs_company_code", getElements("qbe_offs_company_code")}, //search button
                new String[]{"MDM_offs_e_result", getElements("MDM_offs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_offs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_offs_b_detach_show", getElements("MDM_offs_b_detach_show")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.detachTable(driver,
                new String[]{"MDM_offs_b_detach", getElements("MDM_offs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean data_pstns_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        String where = " on DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.getText(driver, new String[]{"MDM_pstns_e_position_code_result", getElements("MDM_pstns_e_position_code_result")}, // element path
                "pstns_position_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"MDM_pstns_e_position_description_result", getElements("MDM_pstns_e_position_description_result")}, // element path
                "pstns_position_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean qbe_pstns_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_pstns_b_qbe", getElements("MDM_pstns_b_qbe")},// query button
                new String[]{"qbe_pstns_position_code", getElements("qbe_pstns_position_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_pstns_position_code", getElements("qbe_pstns_position_code")},
                "pstns_position_code", getData("pstns_position_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_pstns_position_description", getElements("qbe_pstns_position_description")},
                "pstns_position_description", getData("pstns_position_description"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_pstns_position_code", getElements("qbe_pstns_position_code")}, //search button
                new String[]{"MDM_pstns_e_result", getElements("MDM_pstns_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_pstns_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_pstns_b_detach", getElements("MDM_pstns_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean data_dprtms_MDM(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        String where = " on DATA";
        Functions.break_time(driver, 30, 500);
        if (!Functions.getText(driver, new String[]{"MDM_dprtms_e_department_code_result", getElements("MDM_dprtms_e_department_code_result")}, // element path
                "dprtms_department_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"MDM_dprtms_e_department_description_result", getElements("MDM_dprtms_e_department_description_result")}, // element path
                "dprtms_department_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean qbe_dprtms_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_dprtms_b_qbe", getElements("MDM_dprtms_b_qbe")},// query button
                new String[]{"qbe_dprtms_department_code", getElements("qbe_dprtms_department_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dprtms_department_code", getElements("qbe_dprtms_department_code")},
                "dprtms_department_code", getData("dprtms_department_code"),
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_dprtms_department_description", getElements("qbe_dprtms_department_description")},
                "dprtms_department_description", getData("dprtms_department_description"),
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_dprtms_department_code", getElements("qbe_dprtms_department_code")}, //search button
                new String[]{"MDM_dprtms_e_result", getElements("MDM_dprtms_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_dprtms_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_dprtms_b_actions", getElements("MDM_dprtms_b_actions")}, //actions button
                new String[]{"MDM_dprtms_b_actions_audit_data", getElements("MDM_dprtms_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_dprtms_b_detach", getElements("MDM_dprtms_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean send_message(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - SEND MESSAGE", 3, false);
        String where = " on SENDING MESSAGE";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("MDM_cmpns_cb_yn"), getData("MDM_cmpns_cb_yn"), true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("MDM_offs_cb_yn"), getData("MDM_offs_cb_yn"), true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("MDM_pstns_cb_yn"), getData("MDM_pstns_cb_yn"), true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkboxValue(driver,
                getElements("MDM_dprtms_cb_yn"), getData("MDM_dprtms_cb_yn"), true,
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_message_generation", getElements("MDM_b_message_generation")}, //element to click
                new String[]{"MDM_b_message_generation_yes", getElements("MDM_b_message_generation_yes")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_b_message_generation_yes", getElements("MDM_b_message_generation_yes")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
}
