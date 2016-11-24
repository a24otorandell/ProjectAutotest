package screen.AT2MDMSP0015;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMSP0015Sis {
    protected AT2MDMSP0015Locators locators;
    protected AT2MDMSP0015Data data;

    public AT2MDMSP0015Sis() {
    }
    public AT2MDMSP0015Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0015Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0015Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0015Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("Agencias Externas");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_ea_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
       /* if (!interaction_record_srvcs_MDM(driver)) return false;
        if (!qbe_srvcs_MDM(driver)) return false;
        if (!first_tab_change(driver)) return false;
        if (!interaction_record_stps_MDM(driver)) return false;
        if (!qbe_stps_MDM(driver)) return false;*/
        if (!second_tab_change(driver)) return false;
        if (!interaction_record_rst_MDM(driver)) return false;
        if (!qbe_rst_MDM(driver)) return false;
        /*if (!third_tab_change(driver)) return false;
        if (!interaction_record_cndtn_MDM(driver)) return false;
        if (!qbe_cndtn_MDM(driver)) return false;
        if (!interaction_edit_cndtn_MDM(driver)) return false;
        if (!qbe_cndtn_MDM(driver)) return false;
        if (!others_actions_cndtn_MDM(driver)) return false;
        if (!delete_cndtn_MDM(driver)) return false;
        if (!second_tab_change(driver)) return false;*/
        if (!interaction_edit_rst_MDM(driver)) return false;
        if (!qbe_rst_MDM(driver)) return false;
        if (!others_actions_rst_MDM(driver)) return false;
        if (!delete_rst_MDM(driver)) return false;
       /* if (!first_tab_change(driver)) return false;
        if (!interaction_edit_stps_MDM(driver)) return false;
        if (!qbe_stps_MDM(driver)) return false;
        if (!others_actions_stps_MDM(driver)) return false;
        if (!delete_stps_MDM(driver)) return false;
        if (!fourth_tab_change(driver)) return false;
        if (!interaction_edit_srvcs_MDM(driver)) return false;
        if (!qbe_srvcs_MDM(driver)) return false;
        if (!others_actions_srvcs_MDM(driver)) return false;
        if (!delete_srvcs_MDM(driver)) return false;*/
        if (!interaction_edit_ea_MDM(driver)) return false;
        if (!qbe_ea_MDM(driver)) return false;
        if (!others_actions_ea_MDM(driver)) return false;
        if (!delete_ea_MDM(driver)) return false;
        return false;
    }

    //CREATION
    private boolean interaction_record_ea_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ea_b_add", getElements("MDM_ea_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_name", getElements("add_ea_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        //No se utiliza un random porque este campo ha de tener el valor "N" por defecto. Heredado de FORMS.
        if (!Functions.selectText(driver,
                new String[]{"add_ea_sl_atlas", getElements("add_ea_sl_atlas")},
                "N", "atlas", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_description", getElements("add_ea_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_SAP_code", getElements("add_ea_i_SAP_code")}, // element path
                "SAP_code", getData("SAP_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_supplier", getElements("add_ea_i_supplier")}, // element path
                "supplier", getData("supplier"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_ea_lov_product", getElements("add_ea_lov_product")}, // b_lov
                new String[]{"add_ea_i_product", getElements("add_ea_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "product", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ea_b_save", getElements("add_ea_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_srvcs_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_srvcs_b_add", getElements("MDM_srvcs_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        String first_list_options[] = {"Cars","Cancel Protection","Hotel","Payment Gateway","Transfer","Ticket","Virtual Credit Card"};
        String option = (first_list_options[new Random().nextInt(first_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_srvcs_sl_service_type", getElements("add_srvcs_sl_service_type")},
                option, "service_type", where)) {
            return false;
        }
        String second_list_options[] = {"A","X"};
        String second_option = (second_list_options[new Random().nextInt(second_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_srvcs_sl_parameters_type", getElements("add_srvcs_sl_parameters_type")},
                second_option, "parameters_type", where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_srvcs_b_save", getElements("add_srvcs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_stps_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_stps_b_add", getElements("MDM_stps_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getValue(driver,new String[]{"add_stps_e_sequence", getElements("add_stps_e_sequence")}, // element path
                "sequence", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"add_stps_e_external_agency", getElements("add_stps_e_external_agency")}, // element path
                "external_agency", // key for data value (the name)
                where)) {
            return false;
        }
        String first_list_options[] = {"DAILY","OCCASIONAL"};
        String first_option = (first_list_options[new Random().nextInt(first_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_stps_sl_stop_type", getElements("add_stps_sl_stop_type")},
                first_option, "stop_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_stop_time", getElements("add_stps_i_stop_time")}, // element path
                "stop_time", getData("stop_time"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_start_time", getElements("add_stps_i_start_time")}, // element path
                "start_time", getData("start_time"), where)) {
            return false;
        }
        String second_list_options[] = {"A","X"};
        String second_option = (second_list_options[new Random().nextInt(second_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_stps_sl_status", getElements("add_stps_sl_status")},
                second_option, "status", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_stop_date", getElements("add_stps_i_stop_date")}, // element path
                "stop_date", getData("stop_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_start_date", getElements("add_stps_i_start_date")}, // element path
                "start_date", getData("start_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_comments", getElements("add_stps_i_comments")}, // element path
                "comments", getData("comments"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_stps_b_save", getElements("add_stps_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_rst_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rst_b_add", getElements("MDM_rst_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"add_rst_e_external_agency", getElements("add_rst_e_external_agency")}, // element path
                "rst_external_agency", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_rst_lov_interface", getElements("add_rst_lov_interface")}, // b_lov
                new String[]{"add_rst_i_interface", getElements("add_rst_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_rst_lov_TO", getElements("add_rst_lov_TO")}, // b_lov
                new String[]{"add_rst_i_TO", getElements("add_rst_i_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "TO", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_rst_lov_destination", getElements("add_rst_lov_destination")}, // b_lov
                new String[]{"add_rst_i_destination", getElements("add_rst_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rst_i_app_id", getElements("add_rst_i_app_id")}, // element path
                "app_id", getData("app_id"), where)) {
            return false;
        }
        //El campo se bloquea al introducir una "Destination" así que lo omitimos
            /*if (!Functions.createLov(driver,
                    new String[]{"add_rst_lov_country", getElements("add_rst_lov_country")}, // b_lov
                    new String[]{"add_rst_i_country", getElements("add_rst_i_country")}, // i_lov
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_result, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "country", //Data name
                    where)){
                return false;
            }*/
        if (!Functions.insertInput(driver, new String[]{"add_rst_i_TO_branch", getElements("add_rst_i_TO_branch")}, // element path
                "TO_branch", getData("TO_branch"), where)) {
            return false;
        }
        String list_options[] = {"Cars","Cancel Protection","Hotel","Payment Gateway","Transfer","Ticket","Virtual Credit Card"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_rst_sl_service_type", getElements("add_rst_sl_service_type")},
                option, "service_type", where)) {
            return false;
        }
        if (!Functions.getValue(driver,new String[]{"add_rst_e_filter_type", getElements("add_rst_e_filter_type")}, // element path
                "filter_type", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rst_b_save", getElements("add_rst_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_record_cndtn_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cndtn_b_add", getElements("MDM_cndtn_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cndtn_i_name", getElements("add_cndtn_i_name")}, // element path
                "cndtn_name", getData("cndtn_name"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cndtn_lov_conditional_type", getElements("add_cndtn_lov_conditional_type")}, // b_lov
                new String[]{"add_cndtn_i_conditional_type", getElements("add_cndtn_i_conditional_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "conditional_type", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cndtn_lov_value", getElements("add_cndtn_lov_value")}, // b_lov
                new String[]{"add_cndtn_i_value", getElements("add_cndtn_i_value")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "value", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver,new String[]{"add_cndtn_e_TO", getElements("add_cndtn_e_TO")}, // element path
                "cndtn_TO", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cndtn_i_nom_tip", getElements("add_cndtn_i_nom_tip")}, // element path
                "nom_tip", getData("nom_tip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cndtn_i_description", getElements("add_cndtn_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cndtn_b_save", getElements("add_cndtn_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    //EDITION
    private boolean interaction_edit_ea_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_ea_b_edit", getElements("MDM_ea_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.getText(driver,new String[]{"add_ea_e_code", getElements("add_ea_e_code")}, // element path
                "code", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_name", getElements("add_ea_i_name")}, // element path
                "name", getData("name_edit"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_ea_sl_atlas", getElements("add_ea_sl_atlas")},
                "N", "atlas", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_description", getElements("add_ea_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_SAP_code", getElements("add_ea_i_SAP_code")}, // element path
                "SAP_code", getData("SAP_code_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_ea_i_supplier", getElements("add_ea_i_supplier")}, // element path
                "supplier", getData("supplier_edit"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_ea_lov_product", getElements("add_ea_lov_product")}, // b_lov
                new String[]{"add_ea_i_product", getElements("add_ea_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "product", //Data name
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_ea_b_save", getElements("add_ea_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_srvcs_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_srvcs_e_result", getElements("MDM_srvcs_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_srvcs_b_edit", getElements("MDM_srvcs_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        String first_list_options[] = {"Cars","Cancel Protection","Hotel","Payment Gateway","Transfer","Ticket","Virtual Credit Card"};
        String option = (first_list_options[new Random().nextInt(first_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_srvcs_sl_service_type", getElements("add_srvcs_sl_service_type")},
                option, "service_type", where)) {
            return false;
        }
        String second_list_options[] = {"A","X"};
        String second_option = (second_list_options[new Random().nextInt(second_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_srvcs_sl_parameters_type", getElements("add_srvcs_sl_parameters_type")},
                second_option, "parameters_type", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_srvcs_b_save", getElements("add_srvcs_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_stps_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_stps_e_result", getElements("MDM_stps_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_stps_b_edit", getElements("MDM_stps_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        String list_options[] = {"DAILY", "OCCASIONAL"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_stps_sl_stop_type", getElements("add_stps_sl_stop_type")},
                list_options, "data stop_type",
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_stop_time", getElements("add_stps_i_stop_time")}, // element path
                "stop_time", getData("stop_time_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_start_time", getElements("add_stps_i_start_time")}, // element path
                "start_time", getData("start_time_edit"), where)) {
            return false;
        }
        String second_list_options[] = {"A","X"};
        String second_option = (second_list_options[new Random().nextInt(second_list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_stps_sl_status", getElements("add_stps_sl_status")},
                second_option, "status", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_stop_date", getElements("add_stps_i_stop_date")}, // element path
                "stop_date", getData("stop_date_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_start_date", getElements("add_stps_i_start_date")}, // element path
                "start_date", getData("start_date_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_stps_i_comments", getElements("add_stps_i_comments")}, // element path
                "comments", getData("comments_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_stps_b_save", getElements("add_stps_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_rst_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_rst_e_result", getElements("MDM_rst_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_rst_b_edit", getElements("MDM_rst_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_rst_lov_interface", getElements("add_rst_lov_interface")}, // b_lov
                new String[]{"add_rst_i_interface", getElements("add_rst_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_rst_lov_TO", getElements("add_rst_lov_TO")}, // b_lov
                new String[]{"add_rst_i_TO", getElements("add_rst_i_TO")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "TO", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.createLov(driver,
                new String[]{"add_rst_lov_destination", getElements("add_rst_lov_destination")}, // b_lov
                new String[]{"add_rst_i_destination", getElements("add_rst_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_rst_i_app_id", getElements("add_rst_i_app_id")}, // element path
                "app_id", getData("app_id_edit"), where)) {
            return false;
        }
        //El campo se bloquea al introducir una "Destination" así que lo omitimos
            /*if (!Functions.createLov(driver,
                    new String[]{"add_rst_lov_country", getElements("add_rst_lov_country")}, // b_lov
                    new String[]{"add_rst_i_country", getElements("add_rst_i_country")}, // i_lov
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_altresult, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "country", //Data name
                    where)){
                return false;
            }*/
        if (!Functions.insertInput(driver, new String[]{"add_rst_i_TO_branch", getElements("add_rst_i_TO_branch")}, // element path
                "TO_branch", getData("TO_branch_edit"), where)) {
            return false;
        }
        String list_options[] = {"Cars","Cancel Protection","Hotel","Payment Gateway","Transfer","Ticket","Virtual Credit Card"};
        String option = (list_options[new Random().nextInt(list_options.length)]);
        if (!Functions.selectText(driver,
                new String[]{"add_rst_sl_service_type", getElements("add_rst_sl_service_type")},
                option, "service_type", where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_rst_b_save", getElements("add_rst_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cndtn_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        if (!Functions.simpleClick(driver,
                new String[]{"MDM_cndtn_e_result", getElements("MDM_cndtn_e_result")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_cndtn_b_edit", getElements("MDM_cndtn_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cndtn_i_name", getElements("add_cndtn_i_name")}, // element path
                "cndtn_name", getData("cndtn_name_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cndtn_lov_conditional_type", getElements("add_cndtn_lov_conditional_type")}, // b_lov
                new String[]{"add_cndtn_i_conditional_type", getElements("add_cndtn_i_conditional_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "conditional_type", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_cndtn_lov_value", getElements("add_cndtn_lov_value")}, // b_lov
                new String[]{"add_cndtn_i_value", getElements("add_cndtn_i_value")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "value", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver,new String[]{"add_cndtn_e_TO", getElements("add_cndtn_e_TO")}, // element path
                "cndtn_TO", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cndtn_i_nom_tip", getElements("add_cndtn_i_nom_tip")}, // element path
                "nom_tip", getData("nom_tip_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_cndtn_i_description", getElements("add_cndtn_i_description")}, // element path
                "description", getData("description_edit"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_cndtn_b_save", getElements("add_cndtn_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    //DELETE
    private boolean delete_ea_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_ea_b_delete", getElements("MDM_ea_b_delete")},
                new String[]{"MDM_ea_e_records", getElements("MDM_ea_e_records")},
                new String[]{"MDM_ea_b_delete_ok", getElements("MDM_ea_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_srvcs_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_srvcs_b_delete", getElements("MDM_srvcs_b_delete")},
                new String[]{"MDM_srvcs_e_records", getElements("MDM_srvcs_e_records")},
                new String[]{"MDM_srvcs_b_delete_ok", getElements("MDM_srvcs_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_stps_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_stps_b_delete", getElements("MDM_stps_b_delete")},
                new String[]{"MDM_stps_e_records", getElements("MDM_stps_e_records")},
                new String[]{"MDM_stps_b_delete_ok", getElements("MDM_stps_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_rst_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_rst_b_delete", getElements("MDM_rst_b_delete")},
                new String[]{"MDM_rst_e_records", getElements("MDM_rst_e_records")},
                new String[]{"MDM_rst_b_delete_ok", getElements("MDM_rst_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_cndtn_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_cndtn_b_delete", getElements("MDM_cndtn_b_delete")},
                new String[]{"MDM_cndtn_e_records", getElements("MDM_cndtn_e_records")},
                new String[]{"MDM_cndtn_b_delete_ok", getElements("MDM_cndtn_b_delete_ok")}, //delete button yes
                where)) {
            return false;
        }
        return true;
    }
    //SEARCH
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 90, 500);
        if (!Functions.selectText(driver, new String[]{"search_sl_atlas", getElements("search_sl_atlas")},
                getData("atlas"), "atlas", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_name", getElements("search_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.insertInput(driver, new String[]{"search_i_description", getElements("search_i_description")}, // element path
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_SAP_code", getElements("search_i_SAP_code")}, // element path
                "SAP_code", getData("SAP_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_supplier", getElements("search_i_supplier")}, // element path
                "supplier", getData("supplier"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_product", getElements("search_lov_product")}, //LoV button
                new String[]{"search_i_product", getElements("search_i_product")}, //external LoV input
                new String[]{"search_lov_product_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("product"), // value to search
                "product", //name of the data
                where)){
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_ea_e_result", getElements("MDM_ea_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    //QBE
    private boolean qbe_ea_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_ea_b_qbe", getElements("MDM_ea_b_qbe")},// query button
                new String[]{"qbe_ea_i_code", getElements("qbe_ea_i_code")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_code", getElements("qbe_ea_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_name", getElements("qbe_ea_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_atlas", getElements("qbe_ea_i_atlas")},
                "atlas", getData("atlas"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_description", getElements("qbe_ea_i_description")},
                "description", getData("description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_SAP_code", getElements("qbe_ea_i_SAP_code")},
                "SAP_code", getData("SAP_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_supplier", getElements("qbe_ea_i_supplier")},
                "supplier", getData("supplier"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_ea_i_product", getElements("qbe_ea_i_product")},
                "product", getData("product"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_ea_i_code", getElements("qbe_ea_i_code")}, //search button
                new String[]{"MDM_ea_e_result", getElements("MDM_ea_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_srvcs_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_srvcs_b_qbe", getElements("MDM_srvcs_b_qbe")},// query button
                new String[]{"qbe_srvcs_sl_service_type", getElements("qbe_srvcs_sl_service_type")},//any query input
                where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_srvcs_sl_service_type", getElements("qbe_srvcs_sl_service_type")},
                getData("service_type"), "service_type", where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_srvcs_sl_parameters_type", getElements("qbe_srvcs_sl_parameters_type")},
                getData("parameters_type"), getData("parameters_type"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_srvcs_sl_service_type", getElements("qbe_srvcs_sl_service_type")}, //search button
                new String[]{"MDM_srvcs_e_result", getElements("MDM_srvcs_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_stps_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_stps_b_qbe", getElements("MDM_stps_b_qbe")},// query button
                new String[]{"qbe_stps_i_sequence", getElements("qbe_stps_i_sequence")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_stps_i_sequence", getElements("qbe_stps_i_sequence")},
                "sequence", getData("sequence"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_stps_i_external_agency", getElements("qbe_stps_i_external_agency")},
                "external_agency", getData("external_agency"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_stps_sl_stop_type", getElements("qbe_stps_sl_stop_type")},
                getData("stop_type"), "stop_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_stps_i_stop_time", getElements("qbe_stps_i_stop_time")},
                "stop_time", getData("stop_time"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_stps_i_start_time", getElements("qbe_stps_i_start_time")},
                "start_time", getData("start_time"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_stps_sl_status", getElements("qbe_stps_sl_status")},
                getData("status"), "status", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_stps_i_stop_date", getElements("qbe_stps_i_stop_date")},
                "stop_date", getData("stop_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_stps_i_start_date", getElements("qbe_stps_i_start_date")},
                "start_date", getData("start_date"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_stps_i_sequence", getElements("qbe_stps_i_sequence")}, //search button
                new String[]{"MDM_stps_e_result", getElements("MDM_stps_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_rst_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_rst_b_qbe", getElements("MDM_rst_b_qbe")},// query button
                new String[]{"qbe_rst_i_id", getElements("qbe_rst_i_id")},//any query input
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"search_e_rst_id_result", getElements("search_e_rst_id_result")}, // element path
                "id", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_id", getElements("qbe_rst_i_id")},
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_external_agency", getElements("qbe_rst_i_external_agency")},
                "rst_external_agency", getData("rst_external_agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_interface", getElements("qbe_rst_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_TO", getElements("qbe_rst_i_TO")},
                "TO", getData("TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_destination", getElements("qbe_rst_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_app_id", getElements("qbe_rst_i_app_id")},
                "app_id", getData("app_id"), where)) {
            return false;
        }
        //El campo se bloquea al introducir una "Destination" así que lo omitimos
            /*if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_country", getElements("qbe_rst_i_country")},
                    "country", getData("country"), where)) {
                return false;
            }*/
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_TO_branch", getElements("qbe_rst_i_TO_branch")},
                "TO_branch", getData("TO_branch"), where)) {
            return false;
        }
        if (!Functions.selectText(driver, new String[]{"qbe_rst_sl_service_type", getElements("qbe_rst_sl_service_type")},
                getData("service_type"), "service_type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_rst_i_filter_type", getElements("qbe_rst_i_filter_type")},
                "filter_type", getData("filter_type"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_rst_i_id", getElements("qbe_rst_i_id")}, //search button
                new String[]{"MDM_rst_e_result", getElements("MDM_rst_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cndtn_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.break_time(driver, 90, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_cndtn_b_qbe", getElements("MDM_cndtn_b_qbe")},// query button
                new String[]{"qbe_cndtn_i_name", getElements("qbe_cndtn_i_name")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cndtn_i_name", getElements("qbe_cndtn_i_name")},
                "cndtn_name", getData("cndtn_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cndtn_i_conditional_type", getElements("qbe_cndtn_i_conditional_type")},
                "conditional_type", getData("conditional_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cndtn_i_value", getElements("qbe_cndtn_i_value")},
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cndtn_i_TO", getElements("qbe_cndtn_i_TO")},
                "cndtn_TO", getData("cndtn_TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_cndtn_i_nom_tip", getElements("qbe_cndtn_i_nom_tip")},
                "nom_tip", getData("nom_tip"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_cndtn_i_name", getElements("qbe_cndtn_i_name")}, //search button
                new String[]{"MDM_cndtn_e_result", getElements("MDM_cndtn_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    //OTHERS
    private boolean others_actions_ea_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_ea_b_detach", getElements("MDM_ea_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_srvcs_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_srvcs_b_detach", getElements("MDM_srvcs_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_stps_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_stps_b_detach", getElements("MDM_stps_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_rst_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_rst_b_detach", getElements("MDM_rst_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_cndtn_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_cndtn_b_detach", getElements("MDM_cndtn_b_detach")}, //detach button
                true,     //screenshot??
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
                new String[]{"MDM_b_stops", getElements("MDM_b_stops")}, //element to click
                new String[]{"MDM_stps_b_add", getElements("MDM_stps_b_add")}, //element expected to appear
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
                new String[]{"MDM_b_restrictions", getElements("MDM_b_restrictions")}, //element to click
                new String[]{"MDM_rst_b_add", getElements("MDM_rst_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
    private boolean third_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_conditions", getElements("MDM_b_conditions")}, //element to click
                new String[]{"MDM_cndtn_b_add", getElements("MDM_cndtn_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
    private boolean fourth_tab_change(TestDriver driver) {
        driver.getReport().addHeader("TAB CHANGE RECORD", 3, false);
        String where = " on CHANGING TAB";
        Functions.break_time(driver, 90, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_services", getElements("MDM_b_services")}, //element to click
                new String[]{"MDM_srvcs_b_add", getElements("MDM_srvcs_b_add")}, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 90, 500);
        return true;
    }
}
