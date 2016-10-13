package screen.AT2BOOSU1004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 05/10/2016.
 */
public class AT2BOOSU1004Test {

    protected AT2BOOSU1004Locators locators;
    protected AT2BOOSU1004Data data;

    public AT2BOOSU1004Test() {

    }

    public AT2BOOSU1004Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSU1004Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSU1004Data getData() {
        return data;
    }

    public void setData(AT2BOOSU1004Data data) {
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

        if (!Reconfirmation_clients(driver)) {
            return false;
        }


        return false;
    }

    private boolean Reconfirmation_clients(TestDriver driver) {

        if (!Add_cofiguration_by_tto(driver)) {
            return false;
        }
        if (!Search_configuratons_by_tto(driver)) {
            return false;
        }

        if (!Edit_configuration_by_tto(driver)) {
            return false;
        }
        if (!Search_edit_configuration_by_tto(driver)) {
            return false;
        }

        if (!Other_actions_configuration_by_tto(driver)) {
            return false;
        }

        if (!Delete_configuration_by_tto(driver)) {
            return false;
        }

        if (!Add_configuration_by_clients(driver)) {
            return false;
        }

        if (!Search_configuration_by_clients(driver)) {
            return false;
        }

        if (!Edit_configuration_by_clients(driver)) {
            return false;
        }

        if (!Search_edit_configuration_by_clients(driver)) {
            return false;
        }

        if (!Other_actions_configuration_by_clients(driver)) {
            return false;
        }

        if (!Delete_configuration_by_clients(driver)) {
            return false;
        }
        return true;


    }


    //CONFIGURATION BY CLIENT

    private boolean Delete_configuration_by_clients(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN CONFIGURATION BY CLIENTS", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"configuration_by_clients_rating_b_delete", getElements("configuration_by_clients_rating_b_delete")},
                new String[]{"configuration_by_clients_rating_e_record", getElements("configuration_by_clients_rating_e_record")},
                new String[]{"configuration_by_clients_rating_b_delete_b_ok", getElements("configuration_by_clients_rating_b_delete_b_ok")},
                " on DELETE BY CLIENTS")) {
            return false;
        }

        return true;
    }

    private boolean Other_actions_configuration_by_clients(TestDriver driver) {
        driver.getReport().addHeader(" OTHER ACTIONS IN CONFIGURATION BY CLIENTS", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"configuration_by_clients_rating_b_actions", getElements("configuration_by_clients_rating_b_actions")}, //actions button
                new String[]{"configuration_by_clients_rating_b_actions_b_data_history", getElements("configuration_by_clients_rating_b_actions_b_data_history")}, //audit button
                new String[]{"configuration_by_clients_rating_b_actions_b_data_history_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on OTHER ACTIONS BY CLIENTS")) {
            return false;

        }

        if (!Functions.detachTable(driver,
                new String[]{"configuration_by_clients_rating_b_detach", getElements("configuration_by_clients_rating_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS BY CLIENTS")) {
            return false;
        }
        return true;
    }

    private boolean Search_edit_configuration_by_clients(TestDriver driver) {
        driver.getReport().addHeader(" SEARCH IN CONFIGURATION BY CLIENTS", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"configuration_by_clients_rating_b_qbe", getElements("configuration_by_clients_rating_b_qbe")},// query button
                new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")},//any query input
                " on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.zoomOut(driver, 3)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")},
                "se_client_rating", data.getData().get("client_rating"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_sale_value", getElements("configuration_by_clients_rating_i_sale_value")},
                "se_sale_value", data.getData().get("sale_value"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_arrival_date_from", getElements("configuration_by_clients_rating_i_arrival_date_from")},
                "se_arrivale_from", data.getData().get("arrival_from"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_arrival_date_to", getElements("configuration_by_clients_rating_i_arrival_date_to")},
                "se_arrival_to", data.getData().get("arrival_to"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_stay_date_from", getElements("configuration_by_clients_rating_i_stay_date_from")},
                "se_stay_from", data.getData().get("Stay_from"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_stay_date_to", getElements("configuration_by_clients_rating_i_stay_date_to")},
                "se_stay_to", data.getData().get("stay_to"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_chase_from", getElements("configuration_by_clients_rating_i_chase_from")},
                "se_chase_from", data.getData().get("chase_from"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_chase_until", getElements("configuration_by_clients_rating_i_chase_until")},
                "se_chase_to", data.getData().get("chase_to"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_rechase_days", getElements("configuration_by_clients_rating_i_rechase_days")},
                "se_rechase_days", data.getData().get("rechase_days"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_atlas_co", getElements("configuration_by_clients_rating_i_atlas_co")},
                "se_atlas_co", data.getData().get("atlas_co"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_atlas_office", getElements("configuration_by_clients_rating_i_atlas_office")},
                "se_atlas_office", data.getData().get("atlas_office"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_destination", getElements("configuration_by_clients_rating_i_destination")},
                "se_destination", data.getData().get("destination"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_destination_zone", getElements("configuration_by_clients_rating_i_destination_zone")},
                "se_destination_zone", data.getData().get("destination_zone"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_hotel_category", getElements("configuration_by_clients_rating_i_hotel_category")},
                "se_hotel_category", data.getData().get("hotel_category"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_last_minute_days", getElements("configuration_by_clients_rating_i_last_minute_days")},
                "se_last_minute", data.getData().get("last_minute"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_project_name", getElements("configuration_by_clients_rating_i_project_name")},
                "se_project_name", data.getData().get("project_name"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_dnd_hotels", getElements("configuration_by_clients_rating_sl_include_dnd_hotels")},
                "No", "se_dnd_hotels", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_bms", getElements("configuration_by_clients_rating_sl_include_bms")},
                data.getData().get("include_bms"), "se_include_bms", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_integrations", getElements("configuration_by_clients_rating_sl_include_integrations")},
                data.getData().get("integrations"), "se_integrations", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_ref_to_client", getElements("configuration_by_clients_rating_sl_include_ref_to_client")},
                "No", "se_to_clients", " on SEARCH BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 9, 500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_client_confirmation", getElements("configuration_by_clients_rating_sl_client_confirmation")},
                "No", "se_client_confirmation", " on SEARCH BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 9, 500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_send_copy_kam", getElements("configuration_by_clients_rating_sl_send_copy_kam")},
                "No", "se_copy_kam", " on SEARCH BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 9, 500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_active", getElements("configuration_by_clients_rating_sl_active")},
                "No", "se_active", " on SEARCH BY CLIENTS")) {
            return false;
        }

        Functions.break_time(driver, 9, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")}, //search button
                new String[]{"configuration_by_clients_rating_e_result", getElements("configuration_by_clients_rating_e_result")}, //result element
                " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.zoomIn(driver)) {
            return false;
        }

        return true;
    }

    private boolean Edit_configuration_by_clients(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN CONFIGURATION c", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_edit", getElements("configuration_by_clients_rating_ed_b_edit")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_client_rating", getElements("configuration_by_clients_rating_ed_lov_client_rating")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_client_rating", getElements("configuration_by_clients_rating_ed_lov_client_rating")}, // b_lov
                new String[]{"configuration_by_clients_rating_ed_i_client_rating", getElements("configuration_by_clients_rating_ed_i_client_rating")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client_rating", //Data name
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_arrival_date_from", getElements("configuration_by_clients_rating_ed_i_arrival_date_from")},
                "arrival_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_stay_date_from", getElements("configuration_by_clients_rating_ed_i_stay_date_from")},
                "Stay_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_chase_from", getElements("configuration_by_clients_rating_ed_i_chase_from")},
                "chase_from", (Integer.toString(DataGenerator.random(501, 1000))), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_rechase_days", getElements("configuration_by_clients_rating_ed_i_rechase_days")},
                "rechase_days", (Integer.toString(DataGenerator.random(1, 10))), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_ed_sl_include_bms", getElements("configuration_by_clients_rating_ed_sl_include_bms")},
                "Reconfirm BMS", "include_bms", " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_ed_ch_include_dns_hotels"), "include_dns_hotels", false, true, " on EDIT BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_ed_ch_include_ref_to_client"), "include_ref_to_client", false, true, " on EDIT BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_project_name", getElements("configuration_by_clients_rating_ed_i_project_name")},
                "project_name", "PRUEBA2", " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_ed_ch_active"), "active", false, true, " on EDIT BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_sale_value", getElements("configuration_by_clients_rating_ed_i_sale_value")},
                "sale_value", (Integer.toString(DataGenerator.random(1, 1000))), " on EDIT BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_arrival_date_to", getElements("configuration_by_clients_rating_ed_i_arrival_date_to")},
                "arrival_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_stay_date_to", getElements("configuration_by_clients_rating_ed_i_stay_date_to")},
                "stay_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_chase_to", getElements("configuration_by_clients_rating_ed_i_chase_to")},
                "chase_to", (Integer.toString(DataGenerator.random(1, 500))), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_ed_i_last_minute_day", getElements("configuration_by_clients_rating_ed_i_last_minute_day")},
                "last_minute", (Integer.toString(DataGenerator.random(1, 10))), " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_ed_sl_include_integrations", getElements("configuration_by_clients_rating_ed_sl_include_integrations")},
                "Reconfirm B2B", "integrations", " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_ed_ch_client_confirmation"), "client_confirmation", false, true, " on EDIT BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_ed_ch_send_copy_kam"), "copy_kam", false, true, " on EDIT BY CLIENTS")) {
            return false;
        }//where


        //NEW LOVS

        //LOV ATALAS CO

        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_atlas_co", getElements("configuration_by_clients_rating_ed_b_delete_atlas_co")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co", getElements("configuration_by_clients_rating_ed_lov_atlas_co")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_b_pass", getElements("configuration_by_clients_rating_ed_lov_atlas_co_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb2", getElements("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_b_ok", getElements("configuration_by_clients_rating_ed_lov_atlas_co_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_atlas_co", getElements("configuration_by_clients_rating_ed_i_atlas_co")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_i_atlas_co", getElements("configuration_by_clients_rating_ed_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                " on EDIT BY CLIENTS")) {
            return false;
        }


        //LOV ATALAS OFFICE


        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_atlas_office", getElements("configuration_by_clients_rating_ed_b_delete_atlas_office")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_atlas_office", getElements("configuration_by_clients_rating_lov_atlas_office")}, //element to click
                new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_atlas_office_b_pass", getElements("configuration_by_clients_rating_lov_atlas_office_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2")}, // element path
                "atlas_office", // key for data value (the name)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_office_b_ok", getElements("configuration_by_clients_rating_ed_lov_atlas_office_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_atalas_office", getElements("configuration_by_clients_rating_ed_i_atalas_office")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }


        // LOV DESTINATION
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_destination", getElements("configuration_by_clients_rating_ed_b_delete_destination")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination", getElements("configuration_by_clients_rating_ed_lov_destination")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_b_pass", getElements("configuration_by_clients_rating_ed_lov_destination_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2")}, // element path
                "destination", // key for data value (the name)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_b_ok", getElements("configuration_by_clients_rating_ed_lov_destination_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_destination", getElements("configuration_by_clients_rating_ed_i_destination")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }


        // LOV DESTINATION ZONE
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_destination_zone", getElements("configuration_by_clients_rating_ed_b_delete_destination_zone")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone", getElements("configuration_by_clients_rating_ed_lov_destination_zone")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_destination_zone_b_pass", getElements("configuration_by_clients_rating_lov_destination_zone_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb2", getElements("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_b_ok", getElements("configuration_by_clients_rating_ed_lov_destination_zone_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_destination_zone", getElements("configuration_by_clients_rating_ed_i_destination_zone")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_i_destination_zone", getElements("configuration_by_clients_rating_ed_i_destination_zone")}, // element path
                "destination_zone", // key for data value (the name)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        //LOV HOTEL CATEGORY
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_hotel_category", getElements("configuration_by_clients_rating_ed_b_delete_hotel_category")}, //element to click
                " on EDIT BY CLIENTS")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_hotel_category", getElements("configuration_by_clients_rating_lov_hotel_category")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_b_pass", getElements("configuration_by_clients_rating_ed_lov_hotel_category_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb2", getElements("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_b_ok", getElements("configuration_by_clients_rating_ed_lov_hotel_category_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_hotel_category", getElements("configuration_by_clients_rating_ed_i_hotel_category")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_i_hotel_category", getElements("configuration_by_clients_rating_ed_i_hotel_category")}, // element path
                "hotel_category", // key for data value (the name)
                " on EDIT BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_clients_rating_ed_b_save", getElements("configuration_by_clients_rating_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT BY CLIENTS")) {
            return false;
        }
        return true;
    }

    private boolean Search_configuration_by_clients(TestDriver driver) {
        driver.getReport().addHeader("SEARCH IN CONFIGURATION BY CLIENTS", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"configuration_by_clients_rating_b_qbe", getElements("configuration_by_clients_rating_b_qbe")},// query button
                new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")},//any query input
                " on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.zoomOut(driver, 3)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")},
                "se_client_rating", data.getData().get("client_rating"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_sale_value", getElements("configuration_by_clients_rating_i_sale_value")},
                "se_sale_value", data.getData().get("sale_value"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_arrival_date_from", getElements("configuration_by_clients_rating_i_arrival_date_from")},
                "se_arrivale_from", data.getData().get("arrival_from"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_arrival_date_to", getElements("configuration_by_clients_rating_i_arrival_date_to")},
                "se_arrival_to", data.getData().get("arrival_to"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_stay_date_from", getElements("configuration_by_clients_rating_i_stay_date_from")},
                "se_stay_from", data.getData().get("Stay_from"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_stay_date_to", getElements("configuration_by_clients_rating_i_stay_date_to")},
                "se_stay_to", data.getData().get("stay_to"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_chase_from", getElements("configuration_by_clients_rating_i_chase_from")},
                "se_chase_from", data.getData().get("chase_from"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_chase_until", getElements("configuration_by_clients_rating_i_chase_until")},
                "se_chase_to", data.getData().get("chase_to"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_rechase_days", getElements("configuration_by_clients_rating_i_rechase_days")},
                "se_rechase_days", data.getData().get("rechase_days"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_atlas_co", getElements("configuration_by_clients_rating_i_atlas_co")},
                "se_atlas_co", data.getData().get("atlas_co"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_atlas_office", getElements("configuration_by_clients_rating_i_atlas_office")},
                "se_atlas_office", data.getData().get("atlas_office"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_destination", getElements("configuration_by_clients_rating_i_destination")},
                "se_destination", data.getData().get("destination"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_destination_zone", getElements("configuration_by_clients_rating_i_destination_zone")},
                "se_destination_zone", data.getData().get("destination_zone"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_hotel_category", getElements("configuration_by_clients_rating_i_hotel_category")},
                "se_hotel_category", data.getData().get("hotel_category"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_last_minute_days", getElements("configuration_by_clients_rating_i_last_minute_days")},
                "se_last_minute", data.getData().get("last_minute"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_project_name", getElements("configuration_by_clients_rating_i_project_name")},
                "se_project_name", data.getData().get("project_name"), "on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_dnd_hotels", getElements("configuration_by_clients_rating_sl_include_dnd_hotels")},
                "Yes", "se_dnd_hotels", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_bms", getElements("configuration_by_clients_rating_sl_include_bms")},
                data.getData().get("include_bms"), "se_include_bms", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_integrations", getElements("configuration_by_clients_rating_sl_include_integrations")},
                data.getData().get("integrations"), "se_integrations", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_ref_to_client", getElements("configuration_by_clients_rating_sl_include_ref_to_client")},
                "Yes", "se_to_clients", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_client_confirmation", getElements("configuration_by_clients_rating_sl_client_confirmation")},
                "Yes", "se_client_confirmation", " on SEARCH BY CLIENTS")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_send_copy_kam", getElements("configuration_by_clients_rating_sl_send_copy_kam")},
                "Yes", "se_copy_kam", " on SEARCH BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_active", getElements("configuration_by_clients_rating_sl_active")},
                "Yes", "se_active", " on SEARCH BY CLIENTS")) {
            return false;
        }

        Functions.break_time(driver, 6, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")}, //search button
                new String[]{"configuration_by_clients_rating_e_result", getElements("configuration_by_clients_rating_e_result")}, //result element
                " on QBE BY CLIENTS")) {
            return false;
        }

        if (!Functions.zoomIn(driver)) {
            return false;
        }

        return true;
    }

    private boolean Add_configuration_by_clients(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN CONFIGURATION BY CLIENTS", 3, false);
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_b_add", getElements("configuration_by_clients_rating_add_b_add")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_client_rating", getElements("configuration_by_clients_rating_add_lov_client_rating")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.createLov(driver,
                new String[]{"configuration_by_clients_rating_add_lov_client_rating", getElements("configuration_by_clients_rating_add_lov_client_rating")}, // b_lov
                new String[]{"configuration_by_clients_rating_add_i_client_rating", getElements("configuration_by_clients_rating_add_i_client_rating")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client_rating", //Data name
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_arrival_date_from", getElements("configuration_by_clients_rating_add_i_arrival_date_from")},
                "arrival_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(1, 1), 0), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_stay_date_from", getElements("configuration_by_clients_rating_add_i_stay_date_from")},
                "Stay_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(1, 1), 0), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_chase_from", getElements("configuration_by_clients_rating_add_i_chase_from")},
                "chase_from", (Integer.toString(DataGenerator.random(501, 1000))), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_rechase_days", getElements("configuration_by_clients_rating_add_i_rechase_days")},
                "rechase_days", (Integer.toString(DataGenerator.random(1, 10))), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_add_sl_include_bms", getElements("configuration_by_clients_rating_add_sl_include_bms")},
                "Exclude BMS", "include_bms", " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_add_ch_include_dns_hotels"), "include_dns_hotels", true, true, " on ADD BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_add_ch_include_ref_to_client"), "include_ref_to_client", true, true, " on ADD BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_project_name", getElements("configuration_by_clients_rating_add_i_project_name")},
                "project_name", "PRUEBA1", " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_add_ch_active"), "active", true, true, " on ADD BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_sale_value", getElements("configuration_by_clients_rating_add_i_sale_value")},
                "sale_value", (Integer.toString(DataGenerator.random(1, 1000))), " on ADD BY CLIENTS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_arrival_date_to", getElements("configuration_by_clients_rating_add_i_arrival_date_to")},
                "arrival_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 1), 0), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_stay_date_to", getElements("configuration_by_clients_rating_add_i_stay_date_to")},
                "stay_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 1), 0), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_chase_to", getElements("configuration_by_clients_rating_add_i_chase_to")},
                "chase_to", (Integer.toString(DataGenerator.random(1, 500))), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_add_i_last_minute_day", getElements("configuration_by_clients_rating_add_i_last_minute_day")},
                "last_minute", (Integer.toString(DataGenerator.random(1, 10))), " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_add_sl_include_integrations", getElements("configuration_by_clients_rating_add_sl_include_integrations")},
                "Exclude B2B", "integrations", " on ADDBY CLIENTS")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_add_ch_client_confirmation"), "client_confirmation", true, true, " on ADD BY CLIENTS")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_clients_rating_add_ch_send_copy_kam"), "copy_kam", true, true, " on ADD BY CLIENTS")) {
            return false;
        }//where


        //NEW LOVS

        //LOV ATLAS CO

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_co", getElements("configuration_by_clients_rating_add_lov_atlas_co")}, //element to click
                new String[]{"configuration_by_clients_rating_add_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_add_atlas_co_e_company_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_add_atlas_co_e_company_name_tb1")}, //element to click
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_co_b_pass", getElements("configuration_by_clients_rating_add_lov_atlas_co_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_atlas_co_e_company_name_tb2", getElements("configuration_by_clients_rating_add_lov_atlas_co_e_company_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_atlas_co_b_ok", getElements("configuration_by_clients_rating_add_atlas_co_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_atlas_co", getElements("configuration_by_clients_rating_add_i_atlas_co")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_i_atlas_co", getElements("configuration_by_clients_rating_add_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                " on ADD BY CLIENTS")) {
            return false;
        }


        //LOV ATALAS OFFICE
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office", getElements("configuration_by_clients_rating_add_lov_atlas_office")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1")}, //element to click
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_b_pass", getElements("configuration_by_clients_rating_add_lov_atlas_office_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2")}, // element path
                "atlas_office", // key for data value (the name)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_b_ok", getElements("configuration_by_clients_rating_add_lov_atlas_office_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_atalas_office", getElements("configuration_by_clients_rating_add_i_atalas_office")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }


        // LOV DESTINATION
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination", getElements("configuration_by_clients_rating_add_lov_destination")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1")}, //element to click
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_b_pass", getElements("configuration_by_clients_rating_add_lov_destination_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_add_destination_e_destination_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_add_destination_e_destination_name_tb2")}, // element path
                "destination", // key for data value (the name)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_destination_b_ok", getElements("configuration_by_clients_rating_add_destination_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_destination", getElements("configuration_by_clients_rating_add_i_destination")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }


        // LOV DESTINATION ZONE
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone", getElements("configuration_by_clients_rating_add_lov_destination_zone")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1")}, //element to click
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_b_pass", getElements("configuration_by_clients_rating_add_lov_destination_zone_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb2", getElements("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_b_ok", getElements("configuration_by_clients_rating_add_lov_destination_zone_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_destination_zone", getElements("configuration_by_clients_rating_add_i_destination_zone")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_i_destination_zone", getElements("configuration_by_clients_rating_add_i_destination_zone")}, // element path
                "destination_zone", // key for data value (the name)
                " on ADD BY CLIENTS")) {
            return false;
        }

        //LOV HOTEL CATEGORY
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category", getElements("configuration_by_clients_rating_add_lov_hotel_category")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1")}, //element to click
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_b_pass", getElements("configuration_by_clients_rating_add_lov_hotel_category_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb2", getElements("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_b_ok", getElements("configuration_by_clients_rating_add_lov_hotel_category_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_hotel_category", getElements("configuration_by_clients_rating_add_i_hotel_category")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD BY CLIENTS")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_i_hotel_category", getElements("configuration_by_clients_rating_add_i_hotel_category")}, // element path
                "hotel_category", // key for data value (the name)
                " on ADD BY CLIENTS")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_clients_rating_add_b_save", getElements("configuration_by_clients_rating_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD BY CLIENTS")) {
            return false;
        }

        return true;
    }


    //CONFIGURATION BY TTO

    private boolean Delete_configuration_by_tto(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN CONFIGURATION BY TTO", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"configuration_by_ttoo_b_delete", getElements("configuration_by_ttoo_b_delete")},
                new String[]{"configuration_by_ttoo_e_record", getElements("configuration_by_ttoo_e_record")},
                new String[]{"configuration_by_ttoo_b_delete_b_ok", getElements("configuration_by_ttoo_b_delete_b_ok")},
                " on DELETE")) {
            return false;
        }
        return true;

    }

    private boolean Other_actions_configuration_by_tto(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN CONFIGURATION BY TTO", 3, false);


        if (!Functions.auditData(driver,
                new String[]{"configuration_by_ttoo_b_actions", getElements("configuration_by_ttoo_b_actions")}, //actions button
                new String[]{"configuration_by_ttoo_b_actions_b_data_history", getElements("configuration_by_ttoo_b_actions_b_data_history")}, //audit button
                new String[]{"configuration_by_ttoo_b_actions_b_data_history_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }

        if (!Functions.detachTable(driver,
                new String[]{"configuration_by_ttoo_b_detach", getElements("configuration_by_ttoo_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }
        return true;
    }

    private boolean Search_edit_configuration_by_tto(TestDriver driver) {
        driver.getReport().addHeader(" SEARCH IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"configuration_by_ttoo_se_b_qbe", getElements("configuration_by_ttoo_se_b_qbe")},// query button
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},//any query input
                " on SEARCH")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_se_b_reset", getElements("configuration_by_ttoo_se_b_reset")}, //element to click
                " on SEARCH")) {
            return false;
        }

        if (!Functions.zoomOut(driver, 3)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},
                "se_ttoo", data.getData().get("tto"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo_shortname", getElements("configuration_by_ttoo_se_i_ttoo_shortname")},
                "se_short_name", "%" + data.getData().get("ttoo_shortname"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_sale_value", getElements("configuration_by_ttoo_se_i_sale_value")},
                "se_sale_value", data.getData().get("sale_value"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_from", getElements("configuration_by_ttoo_se_i_arrival_date_from")},
                "se_arrivale_from", data.getData().get("arrival_from"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_to", getElements("configuration_by_ttoo_se_i_arrival_date_to")},
                "se_arrival_to", data.getData().get("arrival_to"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_from", getElements("configuration_by_ttoo_se_i_stay_date_from")},
                "se_stay_from", data.getData().get("Stay_from"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_to", getElements("configuration_by_ttoo_se_i_stay_date_to")},
                "se_stay_to", data.getData().get("stay_to"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_from", getElements("configuration_by_ttoo_se_i_chase_from")},
                "se_chase_from", data.getData().get("chase_from"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_until", getElements("configuration_by_ttoo_se_i_chase_until")},
                "se_chase_to", data.getData().get("chase_to"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_rechase_days", getElements("configuration_by_ttoo_se_rechase_days")},
                "se_rechase_days", data.getData().get("rechase_days"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_co", getElements("configuration_by_ttoo_se_i_atlas_co")},
                "se_atlas_co", data.getData().get("atlas_co"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_office", getElements("configuration_by_ttoo_se_i_atlas_office")},
                "se_atlas_office", data.getData().get("atlas_office"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination", getElements("configuration_by_ttoo_se_i_destination")},
                "se_destination", data.getData().get("destination"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination_zone", getElements("configuration_by_ttoo_se_i_destination_zone")},
                "se_destination_zone", data.getData().get("destination_zone"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_hotel_category", getElements("configuration_by_ttoo_se_i_hotel_category")},
                "se_hotel_category", data.getData().get("hotel_category"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_last_minutes_days", getElements("configuration_by_ttoo_se_i_last_minutes_days")},
                "se_last_minute", data.getData().get("last_minute"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_project_name", getElements("configuration_by_ttoo_se_i_project_name")},
                "se_project_name", data.getData().get("project_name"), "on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_dnd_hotels", getElements("configuration_by_ttoo_se_sl_include_dnd_hotels")},
                "No", "se_dnd_hotels", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_bms", getElements("configuration_by_ttoo_se_sl_include_bms")},
                data.getData().get("include_bms"), "se_include_bms", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_integrations", getElements("configuration_by_ttoo_se_sl_include_integrations")},
                data.getData().get("integrations"), "se_integrations", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_ref_to_clients", getElements("configuration_by_ttoo_se_sl_include_ref_to_clients")},
                "No", "se_to_clients", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_client_confirmation", getElements("configuration_by_ttoo_se_sl_client_confirmation")},
                "No", "se_client_confirmation", " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_send_copy_kam", getElements("configuration_by_ttoo_se_sl_send_copy_kam")},
                "No", "se_copy_kam", " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_active", getElements("configuration_by_ttoo_se_sl_active")},
                "No", "se_active", " on SEARCH")) {
            return false;
        }

        Functions.break_time(driver, 6, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")}, //search button
                new String[]{"configuration_by_ttoo_se_e_result", getElements("configuration_by_ttoo_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }

        if (!Functions.zoomIn(driver)) {
            return false;
        }
        return true;
    }

    private boolean Edit_configuration_by_tto(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_edit", getElements("configuration_by_ttoo_ed_b_edit")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_tto", getElements("configuration_by_ttoo_ed_lov_tto")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"configuration_by_ttoo_ed_lov_tto", getElements("configuration_by_ttoo_ed_lov_tto")}, // b_lov
                new String[]{"configuration_by_ttoo_ed_i_tto", getElements("configuration_by_ttoo_ed_i_tto")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_arrival_date_from", getElements("configuration_by_ttoo_ed_i_arrival_date_from")},
                "arrival_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_stay_date_from", getElements("configuration_by_ttoo_ed_i_stay_date_from")},
                "Stay_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_chase_from", getElements("configuration_by_ttoo_ed_i_chase_from")},
                "chase_from", (Integer.toString(DataGenerator.random(501, 1000))), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_rechase_days", getElements("configuration_by_ttoo_ed_i_rechase_days")},
                "rechase_days", (Integer.toString(DataGenerator.random(1, 10))), " on EDIT")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_ed_sl_include_bms", getElements("configuration_by_ttoo_ed_sl_include_bms")},
                "Reconfirm BMS", "include_bms", " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_ed_ch_include_dns_hotels"), "include_dns_hotels", false, true, " on EDIT")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_ed_ch_include_ref_to_client"), "include_ref_to_client", false, true, " on EDIT")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_project_name", getElements("configuration_by_ttoo_ed_i_project_name")},
                "project_name", "PRUEBA2", " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_ed_ch_active"), "active", false, true, " on EDIT")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_sale_value", getElements("configuration_by_ttoo_ed_i_sale_value")},
                "sale_value", (Integer.toString(DataGenerator.random(1, 1000))), " on EDIT")) {
            return false;
        }


        if (!Functions.getValue(driver, new String[]{"configuration_by_ttoo_ed_i_ttoo_shortname", getElements("configuration_by_ttoo_ed_i_ttoo_shortname")}, // element path
                "ttoo_shortname", // key for data value (the name)
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_arrival_date_to", getElements("configuration_by_ttoo_ed_i_arrival_date_to")},
                "arrival_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_stay_date_to", getElements("configuration_by_ttoo_ed_i_stay_date_to")},
                "stay_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 2), 0), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_chase_to", getElements("configuration_by_ttoo_ed_i_chase_to")},
                "chase_to", (Integer.toString(DataGenerator.random(1, 500))), " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_ed_i_last_minute_day", getElements("configuration_by_ttoo_ed_i_last_minute_day")},
                "last_minute", (Integer.toString(DataGenerator.random(1, 10))), " on EDIT")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_ed_sl_include_integrations", getElements("configuration_by_ttoo_ed_sl_include_integrations")},
                "Reconfirm B2B", "integrations", " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_ed_ch_client_confirmation"), "client_confirmation", false, true, " on EDIT")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_ed_ch_send_copy_kam"), "copy_kam", false, true, " on EDIT")) {
            return false;
        }//where


        //NEW LOVS

        //LOV ATALAS CO

        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_atlas_co", getElements("configuration_by_ttoo_ed_b_delete_atlas_co")}, //element to click
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_co", getElements("configuration_by_ttoo_ed_lov_atlas_co")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_co_b_pass", getElements("configuration_by_ttoo_ed_lov_atlas_co_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb2", getElements("configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_co_b_ok", getElements("configuration_by_ttoo_ed_lov_atlas_co_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_ed_i_atlas_co", getElements("configuration_by_ttoo_ed_i_atlas_co")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_ed_i_atlas_co", getElements("configuration_by_ttoo_ed_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                " on EDIT")) {
            return false;
        }


        //LOV ATALAS OFFICE


        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_atlas_office", getElements("configuration_by_ttoo_ed_b_delete_atlas_office")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_office", getElements("configuration_by_ttoo_ed_lov_atlas_office")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_office_b_pass", getElements("configuration_by_ttoo_ed_lov_atlas_office_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb2")}, // element path
                "atlas_office", // key for data value (the name)
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_atlas_office_b_ok", getElements("configuration_by_ttoo_ed_lov_atlas_office_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_ed_i_atalas_office", getElements("configuration_by_ttoo_ed_i_atalas_office")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }


        // LOV DESTINATION
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_destination", getElements("configuration_by_ttoo_ed_b_delete_destination")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination", getElements("configuration_by_ttoo_ed_lov_destination")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_destination_e_destination_name_tb1", getElements("configuration_by_ttoo_ed_lov_destination_e_destination_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_e_destination_name_tb1", getElements("configuration_by_ttoo_ed_lov_destination_e_destination_name_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_b_pass", getElements("configuration_by_ttoo_ed_lov_destination_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_destination_e_destination_name_tb2", getElements("configuration_by_ttoo_ed_lov_destination_e_destination_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_ed_lov_destination_e_destination_name_tb2", getElements("configuration_by_ttoo_ed_lov_destination_e_destination_name_tb2")}, // element path
                "destination", // key for data value (the name)
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_b_ok", getElements("configuration_by_ttoo_ed_lov_destination_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_ed_i_destination", getElements("configuration_by_ttoo_ed_i_destination")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }


        // LOV DESTINATION ZONE
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_destination_zone", getElements("configuration_by_ttoo_ed_b_delete_destination_zone")}, //element to click
                " on EDIT")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_zone", getElements("configuration_by_ttoo_ed_lov_destination_zone")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_zone_b_pass", getElements("configuration_by_ttoo_ed_lov_destination_zone_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb2", getElements("configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_destination_zone_b_ok", getElements("configuration_by_ttoo_ed_lov_destination_zone_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_ed_i_destination_zone", getElements("configuration_by_ttoo_ed_i_destination_zone")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_ed_i_destination_zone", getElements("configuration_by_ttoo_ed_i_destination_zone")}, // element path
                "destination_zone", // key for data value (the name)
                " on EDIT")) {
            return false;
        }

        //LOV HOTEL CATEGORY
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_hotel_category", getElements("configuration_by_ttoo_ed_b_delete_hotel_category")}, //element to click
                " on EDIT")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_hotel_category", getElements("configuration_by_ttoo_ed_lov_hotel_category")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_hotel_category_b_pass", getElements("configuration_by_ttoo_ed_lov_hotel_category_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb2", getElements("configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_lov_hotel_category_b_ok", getElements("configuration_by_ttoo_ed_lov_hotel_category_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_ed_i_hotel_category", getElements("configuration_by_ttoo_ed_i_hotel_category")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_ed_i_hotel_category", getElements("configuration_by_ttoo_ed_i_hotel_category")}, // element path
                "hotel_category", // key for data value (the name)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_ttoo_ed_b_save", getElements("configuration_by_ttoo_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }


        return true;
    }

    private boolean Search_configuratons_by_tto(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"configuration_by_ttoo_se_b_qbe", getElements("configuration_by_ttoo_se_b_qbe")},// query button
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},//any query input
                " on SEARCH")) {
            return false;
        }
        if (!Functions.zoomOut(driver, 3)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},
                "se_ttoo", data.getData().get("tto"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo_shortname", getElements("configuration_by_ttoo_se_i_ttoo_shortname")},
                "se_short_name", "%" + data.getData().get("ttoo_shortname"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_sale_value", getElements("configuration_by_ttoo_se_i_sale_value")},
                "se_sale_value", data.getData().get("sale_value"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_from", getElements("configuration_by_ttoo_se_i_arrival_date_from")},
                "se_arrivale_from", data.getData().get("arrival_from"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_to", getElements("configuration_by_ttoo_se_i_arrival_date_to")},
                "se_arrival_to", data.getData().get("arrival_to"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_from", getElements("configuration_by_ttoo_se_i_stay_date_from")},
                "se_stay_from", data.getData().get("Stay_from"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_to", getElements("configuration_by_ttoo_se_i_stay_date_to")},
                "se_stay_to", data.getData().get("stay_to"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_from", getElements("configuration_by_ttoo_se_i_chase_from")},
                "se_chase_from", data.getData().get("chase_from"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_until", getElements("configuration_by_ttoo_se_i_chase_until")},
                "se_chase_to", data.getData().get("chase_to"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_rechase_days", getElements("configuration_by_ttoo_se_rechase_days")},
                "se_rechase_days", data.getData().get("rechase_days"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_co", getElements("configuration_by_ttoo_se_i_atlas_co")},
                "se_atlas_co", data.getData().get("atlas_co"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_office", getElements("configuration_by_ttoo_se_i_atlas_office")},
                "se_atlas_office", data.getData().get("atlas_office"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination", getElements("configuration_by_ttoo_se_i_destination")},
                "se_destination", data.getData().get("destination"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination_zone", getElements("configuration_by_ttoo_se_i_destination_zone")},
                "se_destination_zone", data.getData().get("destination_zone"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_hotel_category", getElements("configuration_by_ttoo_se_i_hotel_category")},
                "se_hotel_category", data.getData().get("hotel_category"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_last_minutes_days", getElements("configuration_by_ttoo_se_i_last_minutes_days")},
                "se_last_minute", data.getData().get("last_minute"), "on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_project_name", getElements("configuration_by_ttoo_se_i_project_name")},
                "se_project_name", data.getData().get("project_name"), "on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_dnd_hotels", getElements("configuration_by_ttoo_se_sl_include_dnd_hotels")},
                "Yes", "se_dnd_hotels", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_bms", getElements("configuration_by_ttoo_se_sl_include_bms")},
                data.getData().get("include_bms"), "se_include_bms", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_integrations", getElements("configuration_by_ttoo_se_sl_include_integrations")},
                data.getData().get("integrations"), "se_integrations", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_ref_to_clients", getElements("configuration_by_ttoo_se_sl_include_ref_to_clients")},
                "Yes", "se_to_clients", " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_client_confirmation", getElements("configuration_by_ttoo_se_sl_client_confirmation")},
                "Yes", "se_client_confirmation", " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_send_copy_kam", getElements("configuration_by_ttoo_se_sl_send_copy_kam")},
                "Yes", "se_copy_kam", " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_active", getElements("configuration_by_ttoo_se_sl_active")},
                "Yes", "se_active", " on SEARCH")) {
            return false;
        }

        Functions.break_time(driver, 6, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")}, //search button
                new String[]{"configuration_by_ttoo_se_e_result", getElements("configuration_by_ttoo_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }

        if (!Functions.zoomIn(driver)) {
            return false;
        }
        return true;
    }

    private boolean Add_cofiguration_by_tto(TestDriver driver) {


        driver.getReport().addHeader(" ADD IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_b_add", getElements("configuration_by_ttoo_add_b_add")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_tto", getElements("configuration_by_ttoo_add_lov_tto")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"configuration_by_ttoo_add_lov_tto", getElements("configuration_by_ttoo_add_lov_tto")}, // b_lov
                new String[]{"configuration_by_ttoo_add_i_tto", getElements("configuration_by_ttoo_add_i_tto")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_arrival_date_from", getElements("configuration_by_ttoo_add_i_arrival_date_from")},
                "arrival_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(1, 1), 0), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_stay_date_from", getElements("configuration_by_ttoo_add_i_stay_date_from")},
                "Stay_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(1, 1), 0), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_chase_from", getElements("configuration_by_ttoo_add_i_chase_from")},
                "chase_from", (Integer.toString(DataGenerator.random(501, 1000))), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_rechase_days", getElements("configuration_by_ttoo_add_i_rechase_days")},
                "rechase_days", (Integer.toString(DataGenerator.random(1, 10))), " on ADD")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_add_sl_include_bms", getElements("configuration_by_ttoo_add_sl_include_bms")},
                "Exclude BMS", "include_bms", " on ADD")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_add_ch_include_dns_hotels"), "include_dns_hotels", true, true, " on ADD")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_add_ch_include_ref_to_client"), "include_ref_to_client", true, true, " on ADD")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_project_name", getElements("configuration_by_ttoo_add_i_project_name")},
                "project_name", "PRUEBA1", " on ADD")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_add_ch_active"), "active", true, true, " on ADD")) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_sale_value", getElements("configuration_by_ttoo_add_i_sale_value")},
                "sale_value", (Integer.toString(DataGenerator.random(1, 1000))), " on ADD")) {
            return false;
        }


        if (!Functions.getValue(driver, new String[]{"configuration_by_ttoo_add_i_ttoo_shortname", getElements("configuration_by_ttoo_add_i_ttoo_shortname")}, // element path
                "ttoo_shortname", // key for data value (the name)
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_arrival_date_to", getElements("configuration_by_ttoo_add_i_arrival_date_to")},
                "arrival_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 1), 0), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_stay_date_to", getElements("configuration_by_ttoo_add_i_stay_date_to")},
                "stay_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(2, 1), 0), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_chase_to", getElements("configuration_by_ttoo_add_i_chase_to")},
                "chase_to", (Integer.toString(DataGenerator.random(1, 500))), " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_last_minute_day", getElements("configuration_by_ttoo_add_i_last_minute_day")},
                "last_minute", (Integer.toString(DataGenerator.random(1, 10))), " on ADD")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_add_sl_include_integrations", getElements("configuration_by_ttoo_add_sl_include_integrations")},
                "Exclude B2B", "integrations", " on ADD")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_add_ch_client_confirmation"), "client_confirmation", true, true, " on ADD")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_add_ch_send_copy_kam"), "copy_kam", true, true, " on ADD")) {
            return false;
        }//where


        //NEW LOVS

        //LOV ATALAS CO

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_co", getElements("configuration_by_ttoo_add_lov_atlas_co")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb1")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_co_b_pass", getElements("configuration_by_ttoo_add_lov_atlas_co_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb2", getElements("configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_co_b_ok", getElements("configuration_by_ttoo_add_lov_atlas_co_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_add_i_atlas_co", getElements("configuration_by_ttoo_add_i_atlas_co")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_add_i_atlas_co", getElements("configuration_by_ttoo_add_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                " on ADD")) {
            return false;
        }


        //LOV ATALAS OFFICE
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_office", getElements("configuration_by_ttoo_add_lov_atlas_office")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb1")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_office_b_pass", getElements("configuration_by_ttoo_add_lov_atlas_office_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb2")}, // element path
                "atlas_office", // key for data value (the name)
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_office_b_ok", getElements("configuration_by_ttoo_add_lov_atlas_office_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_add_i_atalas_office", getElements("configuration_by_ttoo_add_i_atalas_office")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }


        // LOV DESTINATION
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination", getElements("configuration_by_ttoo_add_lov_destination")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_destination_e_destination_name_tb1", getElements("configuration_by_ttoo_add_lov_destination_e_destination_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_e_destination_name_tb1", getElements("configuration_by_ttoo_add_lov_destination_e_destination_name_tb1")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_b_pass", getElements("configuration_by_ttoo_add_lov_destination_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_destination_e_destination_name_tb2", getElements("configuration_by_ttoo_add_lov_destination_e_destination_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_add_lov_destination_e_destination_name_tb2", getElements("configuration_by_ttoo_add_lov_destination_e_destination_name_tb2")}, // element path
                "destination", // key for data value (the name)
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_b_ok", getElements("configuration_by_ttoo_add_lov_destination_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_add_i_destination", getElements("configuration_by_ttoo_add_i_destination")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }


        // LOV DESTINATION ZONE
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_zone", getElements("configuration_by_ttoo_add_lov_destination_zone")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb1")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_zone_b_pass", getElements("configuration_by_ttoo_add_lov_destination_zone_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb2", getElements("configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_zone_b_ok", getElements("configuration_by_ttoo_add_lov_destination_zone_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_add_i_destination_zone", getElements("configuration_by_ttoo_add_i_destination_zone")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_add_i_destination_zone", getElements("configuration_by_ttoo_add_i_destination_zone")}, // element path
                "destination_zone", // key for data value (the name)
                " on ADD")) {
            return false;
        }

        //LOV HOTEL CATEGORY
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_hotel_category", getElements("configuration_by_ttoo_add_lov_hotel_category")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb1")}, //element to click
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_hotel_category_b_pass", getElements("configuration_by_ttoo_add_lov_hotel_category_b_pass")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb2", getElements("configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_lov_hotel_category_b_ok", getElements("configuration_by_ttoo_add_lov_hotel_category_b_ok")}, //element to click
                new String[]{"configuration_by_ttoo_add_i_hotel_category", getElements("configuration_by_ttoo_add_i_hotel_category")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_add_i_hotel_category", getElements("configuration_by_ttoo_add_i_hotel_category")}, // element path
                "hotel_category", // key for data value (the name)
                " on ADD")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_ttoo_add_b_save", getElements("configuration_by_ttoo_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }

        return true;
    }
}

