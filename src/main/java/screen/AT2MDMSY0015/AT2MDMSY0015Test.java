package screen.AT2MDMSY0015;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import java.util.Random;

/**
 * Created by jmrios on 21/11/2016.
 */
public class AT2MDMSY0015Test {
    protected AT2MDMSY0015Locators locators;
    protected AT2MDMSY0015Data data;

    public AT2MDMSY0015Test() {
    }
    public AT2MDMSY0015Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0015Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0015Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0015Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Rollback core2");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //ROLLBACK CORE2
        if (!interaction_record_rbc2_MDM(driver)) return false;
        if (!search_rbc2_MDM(driver)) return false;
        if (!interaction_edit_rbc2_MDM(driver)) return false;
        if (!qbe_rbc2_MDM(driver)) return false;
        if (!others_actions_rbc2_MDM(driver)) return false;
        //PARAMETERS ROLLBACK C2
        if (!interaction_record_prb2_MDM(driver)) return false;
        if (!qbe_prb2_MDM(driver)) return false;
        if (!interaction_edit_prb2_MDM(driver)) return false;
        if (!qbe_prb2_MDM(driver)) return false;
        if (!others_actions_prb2_MDM(driver)) return false;
        //CHANGE TAB
        if (!first_tab_change(driver)) return false;
        //ASSISTED ROLLBACK CORE2
        if (!interaction_record_arc2_MDM(driver)) return false;
        if (!search_arc2_MDM(driver)) return false;
        if (!interaction_edit_arc2_MDM(driver)) return false;
        if (!qbe_arc2_MDM(driver)) return false;
        if (!others_actions_arc2_MDM(driver)) return false;
        //PARAMETERS ROLLBACK C2 (2)
        if (!interaction_record_prrb2_MDM(driver)) return false;
        if (!qbe_prrb2_MDM(driver)) return false;
        if (!interaction_edit_prrb2_MDM(driver)) return false;
        if (!qbe_prrb2_MDM(driver)) return false;
        if (!others_actions_prrb2_MDM(driver)) return false;
        if (!delete_prrb2_MDM(driver)) return false;
        //ASSISTED ROLLBACK CORE2
        if (!delete_arc2_MDM(driver)) return false;
        //CHANGE TAB
        if (!second_tab_change(driver)) return false;
        //PARAMETERS ROLLBACK C2
        if (!delete_prb2_MDM(driver)) return false;
        //ROLLBACK CORE2
        if (!delete_rbc2_MDM(driver)) return false;
        return false;
    }

    //ROLLBACK CORE2
    private boolean interaction_record_rbc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rbc2_b_add", getElements("MDM_rbc2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_rbc2_lov_external_agency_code", getElements("add_rbc2_lov_external_agency_code")}, // b_lov
                new String[]{"add_rbc2_i_external_agency_code", getElements("add_rbc2_i_external_agency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "rbc2_external_agency_code", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_B2B_reference", getElements("add_rbc2_i_B2B_reference")}, // element path
                "rbc2_B2B_reference", getData("rbc2_B2B_reference"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_hotelbeds_reference", getElements("add_rbc2_i_hotelbeds_reference")}, // element path
                "rbc2_hotelbeds_reference", getData("rbc2_hotelbeds_reference"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_remarks", getElements("add_rbc2_i_remarks")}, // element path
                "rbc2_remarks", getData("rbc2_remarks"), where)) {
            return false;
        }
        if (!Functions.getValue(driver,new String[]{"add_rbc2_i_status", getElements("add_rbc2_i_status")}, // element path
                "rbc2_status", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rbc2_b_save", getElements("add_rbc2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_rbc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " ON SEARCH";
        Functions.break_time(driver, 90, 500);
        if (!Functions.getText(driver,new String[]{"search_rbc2_e_sequence_result", getElements("search_rbc2_e_sequence_result")}, // element path
                "rbc2_sequence", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"search_rbc2_e_creation_date_result", getElements("search_rbc2_e_creation_date_result")}, // element path
                "rbc2_creation_date", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"search_rbc2_e_modification_date_result", getElements("search_rbc2_e_modification_date_result")}, // element path
                "rbc2_modification_date", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_sequence", getElements("search_rbc2_i_sequence")}, // element path
                "rbc2_sequence", getData("rbc2_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_creation_date", getElements("search_rbc2_i_creation_date")}, // element path
                "rbc2_creation_date", getData("rbc2_creation_date"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_rbc2_lov_external_agency_code", getElements("search_rbc2_lov_external_agency_code")}, //LoV button
                new String[]{"search_rbc2_i_external_agency_code", getElements("search_rbc2_i_external_agency_code")}, //external LoV input
                new String[]{"search_rbc2_lov_external_agency_code_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                getData("rbc2_external_agency_code"), // value to search
                "rbc2_external_agency_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_B2B_reference", getElements("search_rbc2_i_B2B_reference")}, // element path
                "rbc2_B2B_reference", getData("rbc2_B2B_reference"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_hotelbeds_reference", getElements("search_rbc2_i_hotelbeds_reference")}, // element path
                "rbc2_hotelbeds_reference", getData("rbc2_hotelbeds_reference"), where)) {
            return false;
        }
        if (getData("search_rbc2_i_modification_date").isEmpty()) {
            if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_modification_date", getElements("search_rbc2_i_modification_date")}, // element path
                    "rbc2_modification_date", " ", where)) {
                return false;
            }
        }
        else {
            if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_modification_date", getElements("search_rbc2_i_modification_date")}, // element path
                    "rbc2_modification_date", getData("rbc2_modification_date"), where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_remarks", getElements("search_rbc2_i_remarks")}, // element path
                "rbc2_remarks", getData("rbc2_remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_rbc2_i_status", getElements("search_rbc2_i_status")}, // element path
                "rbc2_status", getData("rbc2_status"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_rbc2_b_search", getElements("search_rbc2_b_search")}, //search button
                new String[]{"MDM_rbc2_e_result", getElements("MDM_rbc2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_rbc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rbc2_b_edit", getElements("MDM_rbc2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_rbc2_lov_external_agency_code", getElements("add_rbc2_lov_external_agency_code")}, // b_lov
                new String[]{"add_rbc2_i_external_agency_code", getElements("add_rbc2_i_external_agency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "rbc2_external_agency_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,new String[]{"add_rbc2_e_external_agency_name", getElements("add_rbc2_e_external_agency_name")}, // element path
                "rbc2_external_agency_name", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_B2B_reference", getElements("add_rbc2_i_B2B_reference")}, // element path
                "rbc2_B2B_reference", getData("rbc2_B2B_reference_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_hotelbeds_reference", getElements("add_rbc2_i_hotelbeds_reference")}, // element path
                "rbc2_hotelbeds_reference", getData("rbc2_hotelbeds_reference_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_remarks", getElements("add_rbc2_i_remarks")}, // element path
                "rbc2_remarks", getData("rbc2_remarks_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rbc2_i_status", getElements("add_rbc2_i_status")}, // element path
                "rbc2_status", getData("rbc2_status_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rbc2_b_save", getElements("add_rbc2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_rbc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_rbc2_b_reset", getElements("search_rbc2_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_rbc2_b_qbe", getElements("MDM_rbc2_b_qbe")},// query button
                new String[]{"qbe_rbc2_i_sequence", getElements("qbe_rbc2_i_sequence")},//any query input
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"search_rbc2_e_modification_date_result", getElements("search_rbc2_e_modification_date_result")}, // element path
                "rbc2_modification_date", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_sequence", getElements("qbe_rbc2_i_sequence")},
                "rbc2_sequence", getData("rbc2_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_date", getElements("qbe_rbc2_i_date")},
                "rbc2_creation_date", getData("rbc2_creation_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_external_agency_code", getElements("qbe_rbc2_i_external_agency_code")},
                "rbc2_external_agency_code", getData("rbc2_external_agency_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_external_agency_name", getElements("qbe_rbc2_i_external_agency_name")},
                "rbc2_external_agency_name", getData("rbc2_external_agency_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_B2B_reference", getElements("qbe_rbc2_i_B2B_reference")},
                "rbc2_B2B_reference", getData("rbc2_B2B_reference"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_hotelbeds_reference", getElements("qbe_rbc2_i_hotelbeds_reference")},
                "rbc2_hotelbeds_reference", getData("rbc2_hotelbeds_reference"), where)) {
            return false;
        }
        /*if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_modification_date", getElements("qbe_rbc2_i_modification_date")},
                "rbc2_modification_date", getData("rbc2_modification_date"), where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_remarks", getElements("qbe_rbc2_i_remarks")},
                "rbc2_remarks", getData("rbc2_remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rbc2_i_status", getElements("qbe_rbc2_i_status")},
                "rbc2_status", getData("rbc2_status"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_rbc2_i_sequence", getElements("qbe_rbc2_i_sequence")}, //search button
                new String[]{"MDM_rbc2_e_result", getElements("MDM_rbc2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_rbc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_rbc2_b_detach", getElements("MDM_rbc2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_rbc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_rbc2_e_result", getElements("MDM_rbc2_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_rbc2_b_delete", getElements("MDM_rbc2_b_delete")},
                new String[]{"MDM_rbc2_e_records", getElements("MDM_rbc2_e_records")},
                new String[]{"MDM_rbc2_b_delete_ok", getElements("MDM_rbc2_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //PARAMETERS ROLLBACK C2
    private boolean interaction_record_prb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prb2_b_add", getElements("MDM_prb2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prb2_i_name", getElements("add_prb2_i_name")}, // element path
                "prb2_name", getData("prb2_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prb2_i_value", getElements("add_prb2_i_value")}, // element path
                "prb2_value", getData("prb2_value"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prb2_b_save", getElements("add_prb2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_prb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prb2_b_edit", getElements("MDM_prb2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prb2_i_name", getElements("add_prb2_i_name")}, // element path
                "prb2_name", getData("prb2_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prb2_i_value", getElements("add_prb2_i_value")}, // element path
                "prb2_value", getData("prb2_value_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prb2_b_save", getElements("add_prb2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_prb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_prb2_b_qbe", getElements("MDM_prb2_b_qbe")},// query button
                new String[]{"qbe_prb2_i_sequence", getElements("qbe_prb2_i_sequence")},//any query input
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"search_prb2_e_sequence_result", getElements("search_prb2_e_sequence_result")}, // element path
                "prb2_sequence", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prb2_i_sequence", getElements("qbe_prb2_i_sequence")},
                "prb2_sequence", getData("prb2_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prb2_i_name", getElements("qbe_prb2_i_name")},
                "prb2_name", getData("prb2_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prb2_i_value", getElements("qbe_prb2_i_value")},
                "prb2_value", getData("prb2_value"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_prb2_i_sequence", getElements("qbe_prb2_i_sequence")}, //search button
                new String[]{"MDM_prb2_e_result", getElements("MDM_prb2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_prb2_b_detach", getElements("MDM_prb2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_prb2_e_result", getElements("MDM_prb2_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_prb2_b_delete", getElements("MDM_prb2_b_delete")},
                new String[]{"MDM_prb2_e_records", getElements("MDM_prb2_e_records")},
                new String[]{"MDM_prb2_b_delete_ok", getElements("MDM_prb2_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }













    //ASSISTED ROLLBACK CORE2
    private boolean interaction_record_arc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_arc2_b_add", getElements("MDM_arc2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        String list_options[] = {"C", "H", "O", "T"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_arc2_sl_service_type", getElements("add_arc2_sl_service_type")},
                list_options, "arc2_service_type",
                where)) {
            return false;
        }
        String list_options2[] = {"0", "100", "200", "300", "400"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_arc2_sl_service_status", getElements("add_arc2_sl_service_status")},
                list_options2, "arc2_service_status",
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_arc2_lov_external_agency_code", getElements("add_arc2_lov_external_agency_code")}, // b_lov
                new String[]{"add_arc2_i_external_agency_code", getElements("add_arc2_i_external_agency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "arc2_external_agency_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,new String[]{"add_arc2_e_nom", getElements("add_arc2_e_nom")}, // element path
                "arc2_nom", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_arc2_i_remarks", getElements("add_arc2_i_remarks")}, // element path
                "arc2_remarks", getData("arc2_remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_arc2_i_status", getElements("add_arc2_i_status")}, // element path
                "arc2_status", getData("arc2_status"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_arc2_b_save", getElements("add_arc2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_arc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " ON SEARCH";
        Functions.break_time(driver, 90, 500);
        if (!Functions.getText(driver,new String[]{"search_arc2_e_sequence_result", getElements("search_arc2_e_sequence_result")}, // element path
                "arc2_sequence", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"search_arc2_e_creation_date_result", getElements("search_arc2_e_creation_date_result")}, // element path
                "arc2_creation_date_result", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_arc2_i_sequence", getElements("search_arc2_i_sequence")}, // element path
                "arc2_sequence", getData("arc2_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_arc2_i_creation_date", getElements("search_arc2_i_creation_date")}, // element path
                "arc2_creation_date", getData("arc2_creation_date_result"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"search_arc2_sl_service_type", getElements("search_arc2_sl_service_type")},
                getData("arc2_service_type"), "arc2_service_type", where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"search_arc2_sl_service_status", getElements("search_arc2_sl_service_status")},
                getData("arc2_service_status"), "arc2_service_status", where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_arc2_lov_external_agency_code", getElements("search_arc2_lov_external_agency_code")}, //LoV button
                new String[]{"search_arc2_i_external_agency_code", getElements("search_arc2_i_external_agency_code")}, //external LoV input
                new String[]{"search_arc2_lov_external_agency_code_i_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                getData("arc2_external_agency_code"), // value to search
                "arc2_external_agency_code", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_arc2_i_remarks", getElements("search_arc2_i_remarks")}, // element path
                "arc2_remarks", getData("arc2_remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_arc2_i_status", getElements("search_arc2_i_status")}, // element path
                "arc2_status", getData("arc2_status"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_arc2_b_search", getElements("search_arc2_b_search")}, //search button
                new String[]{"MDM_arc2_e_result", getElements("MDM_arc2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_arc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_arc2_b_edit", getElements("MDM_arc2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        String list_options[] = {"C", "H", "O", "T"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_arc2_sl_service_type", getElements("add_arc2_sl_service_type")},
                list_options, "arc2_service_type",
                where)) {
            return false;
        }
        String list_options2[] = {"0", "100", "200", "300", "400"};
        if (!Functions.selectTextRandom(driver, new String[]{"add_arc2_sl_service_status", getElements("add_arc2_sl_service_status")},
                list_options2, "arc2_service_status",
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_arc2_lov_external_agency_code", getElements("add_arc2_lov_external_agency_code")}, // b_lov
                new String[]{"add_arc2_i_external_agency_code", getElements("add_arc2_i_external_agency_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "arc2_external_agency_code", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver,new String[]{"add_arc2_e_nom", getElements("add_arc2_e_nom")}, // element path
                "arc2_nom", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_arc2_i_remarks", getElements("add_arc2_i_remarks")}, // element path
                "arc2_remarks", getData("arc2_remarks_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_arc2_i_status", getElements("add_arc2_i_status")}, // element path
                "arc2_status", getData("arc2_status_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_arc2_b_save", getElements("add_arc2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_arc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_arc2_b_reset", getElements("search_arc2_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_arc2_b_qbe", getElements("MDM_arc2_b_qbe")},// query button
                new String[]{"qbe_arc2_i_sequence", getElements("qbe_arc2_i_sequence")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_sequence", getElements("qbe_arc2_i_sequence")},
                "arc2_sequence", getData("arc2_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_creation_date", getElements("qbe_arc2_i_creation_date")},
                "arc2_creation_date", getData("arc2_creation_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_service_type", getElements("qbe_arc2_i_service_type")},
                "arc2_service_type", getData("arc2_service_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_service_status", getElements("qbe_arc2_i_service_status")},
                "arc2_service_status", getData("arc2_service_status"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_external_agency_code", getElements("qbe_arc2_i_external_agency_code")},
                "arc2_external_agency_code", getData("arc2_external_agency_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_nom", getElements("qbe_arc2_i_nom")},
                "arc2_nom", getData("arc2_nom"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_remarks", getElements("qbe_arc2_i_remarks")},
                "arc2_remarks", getData("arc2_remarks"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_arc2_i_status", getElements("qbe_arc2_i_status")},
                "arc2_status", getData("arc2_status"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_arc2_i_sequence", getElements("qbe_arc2_i_sequence")}, //search button
                new String[]{"MDM_arc2_e_result", getElements("MDM_arc2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_arc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_arc2_b_detach", getElements("MDM_arc2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_arc2_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_arc2_b_delete", getElements("MDM_arc2_b_delete")},
                new String[]{"MDM_arc2_e_records", getElements("MDM_arc2_e_records")},
                new String[]{"MDM_arc2_b_delete_ok", getElements("MDM_arc2_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //PARAMETERS ROLLBACK C2
    private boolean interaction_record_prrb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prrb2_b_add", getElements("MDM_prrb2_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prrb2_i_name", getElements("add_prrb2_i_name")}, // element path
                "prrb2_name", getData("prrb2_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prrb2_i_value", getElements("add_prrb2_i_value")}, // element path
                "prrb2_value", getData("prrb2_value"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prrb2_b_save", getElements("add_prrb2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_prrb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_prrb2_b_edit", getElements("MDM_prrb2_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to apprbc2r
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prrb2_i_name", getElements("add_prrb2_i_name")}, // element path
                "prrb2_name", getData("prrb2_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_prrb2_i_value", getElements("add_prrb2_i_value")}, // element path
                "prrb2_value", getData("prrb2_value_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_prrb2_b_save", getElements("add_prrb2_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disapprbc2r
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_prrb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);;
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_prrb2_b_qbe", getElements("MDM_prrb2_b_qbe")},// query button
                new String[]{"qbe_prrb2_i_sequence", getElements("qbe_prrb2_i_sequence")},//any query input
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"search_prrb2_e_sequence_result", getElements("search_prrb2_e_sequence_result")}, // element path
                "prrb2_sequence", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prrb2_i_sequence", getElements("qbe_prrb2_i_sequence")},
                "prrb2_sequence", getData("prrb2_sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prrb2_i_name", getElements("qbe_prrb2_i_name")},
                "prrb2_name", getData("prrb2_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_prrb2_i_value", getElements("qbe_prrb2_i_value")},
                "prrb2_value", getData("prrb2_value"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_prrb2_i_sequence", getElements("qbe_prrb2_i_sequence")}, //search button
                new String[]{"MDM_prrb2_e_result", getElements("MDM_prrb2_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_prrb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_prrb2_b_detach", getElements("MDM_prrb2_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_prrb2_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_prrb2_b_delete", getElements("MDM_prrb2_b_delete")},
                new String[]{"MDM_prrb2_e_records", getElements("MDM_prrb2_e_records")},
                new String[]{"MDM_prrb2_b_delete_ok", getElements("MDM_prrb2_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //TAB CHANGE
    private boolean first_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_hotelbeds_reference", getElements("MDM_b_hotelbeds_reference")}, //element to click
                new String[]{"MDM_arc2_b_add", getElements("MDM_arc2_b_add")}, //element expected to apprbc2r
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
    private boolean second_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_rollback_core2", getElements("MDM_b_rollback_core2")}, //element to click
                new String[]{"MDM_prb2_b_add", getElements("MDM_prb2_b_add")}, //element expected to apprbc2r
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
}