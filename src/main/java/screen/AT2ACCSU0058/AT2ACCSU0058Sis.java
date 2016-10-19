package screen.AT2ACCSU0058;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2ACCSU0058Sis {
    protected AT2ACCSU0058Locators locators;
    protected AT2ACCSU0058Data data;

    public AT2ACCSU0058Sis() {
    }
    public AT2ACCSU0058Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0058Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0058Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0058Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Maintenance HSI mapping");
        driver.getTestdetails().setSubmenu("Accommodation");
        driver.getTestdetails().setScreen("Setup");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_accommodation(driver)) return false;
        if (!search_accommodation(driver)) return false;
        if (!interaction_edit_accommodation(driver)) return false;
        if (!qbe_accommodation(driver)) return false;
        if (!others_actions_accommodation(driver)) return false;
        if (!delete_accommodation(driver)) return false;
        return false;
    }

    private boolean interaction_record_accommodation(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.zoomOut(driver, 2);
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_add", getElements("accommodation_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hotel_id", getElements("add_i_hotel_id")}, // element path
                "hotel_id", getData("hotel_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_rate_plan", getElements("add_i_rate_plan")}, // element path
                "rate_plan", getData("rate_plan"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_currency", getElements("add_i_currency")}, // element path
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_baseboard_type", getElements("add_i_baseboard_type")}, // element path
                "baseboard_type", getData("baseboard_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_contract_name", getElements("add_i_contract_name")}, // element path
                "contract_name", getData("contract_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_incoming_office", getElements("add_i_incoming_office")}, // element path
                "incoming_office", getData("incoming_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_contr_seq", getElements("add_i_contr_seq")}, // element path
                "contr_seq", getData("contr_seq"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hsi_user", getElements("add_i_hsi_user")}, // element path
                "hsi_user", getData("hsi_user"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_register_status", getElements("add_i_register_status")}, // element path
                "register_status", getData("register_status"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_activ_date", getElements("add_i_activ_date")}, // element path
                "activ_date", getData("activ_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_room_id", getElements("add_i_room_id")}, // element path
                "room_id", getData("room_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dis_hot_id", getElements("add_i_dis_hot_id")}, // element path
                "dis_hot_id", getData("dis_hot_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dis_room_id", getElements("add_i_dis_room_id")}, // element path
                "dis_room_id", getData("dis_room_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_seq_age_ext", getElements("add_i_seq_age_ext")}, // element path
                "seq_age_ext", getData("seq_age_ext"), where)) {
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
    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_hotel_id", getElements("search_i_hotel_id")}, // element path
                "hotel_id", getData("hotel_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_rate_plan", getElements("search_i_rate_plan")}, // element path
                "rate_plan", getData("rate_plan"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_currency", getElements("search_i_currency")}, // element path
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_baseboard_type", getElements("search_i_baseboard_type")}, // element path
                "baseboard_type", getData("baseboard_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_contract_name", getElements("search_i_contract_name")}, // element path
                "contract_name", getData("contract_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_incoming_office", getElements("search_i_incoming_office")}, // element path
                "incoming_office", getData("incoming_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_contr_seq", getElements("search_i_contr_seq")}, // element path
                "contr_seq", getData("contr_seq"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_hsi_user", getElements("search_i_hsi_user")}, // element path
                "hsi_user", getData("hsi_user"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_register_status", getElements("search_i_register_status")}, // element path
                "register_status", getData("register_status"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_activ_date", getElements("search_i_activ_date")}, // element path
                "activ_date", getData("activ_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_room_id", getElements("search_i_room_id")}, // element path
                "room_id", getData("room_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_dis_hot_id", getElements("search_i_dis_hot_id")}, // element path
                "dis_hot_id", getData("dis_hot_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_dis_room_id", getElements("search_i_dis_room_id")}, // element path
                "dis_room_id", getData("dis_room_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_seq_age_ext", getElements("search_i_seq_age_ext")}, // element path
                "seq_age_ext", getData("seq_age_ext"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_edit", getElements("accommodation_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hotel_id", getElements("add_i_hotel_id")}, // element path
                "hotel_id", getData("hotel_id_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_rate_plan", getElements("add_i_rate_plan")}, // element path
                "rate_plan", getData("rate_plan_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_currency", getElements("add_i_currency")}, // element path
                "currency", getData("currency_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_baseboard_type", getElements("add_i_baseboard_type")}, // element path
                "baseboard_type", getData("baseboard_type_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_contract_name", getElements("add_i_contract_name")}, // element path
                "contract_name", getData("contract_name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_incoming_office", getElements("add_i_incoming_office")}, // element path
                "incoming_office", getData("incoming_office_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_contr_seq", getElements("add_i_contr_seq")}, // element path
                "contr_seq", getData("contr_seq_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_hsi_user", getElements("add_i_hsi_user")}, // element path
                "hsi_user", getData("hsi_user_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_register_status", getElements("add_i_register_status")}, // element path
                "register_status", getData("register_status_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_activ_date", getElements("add_i_activ_date")}, // element path
                "activ_date", getData("activ_date_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_room_id", getElements("add_i_room_id")}, // element path
                "room_id", getData("room_id_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dis_hot_id", getElements("add_i_dis_hot_id")}, // element path
                "dis_hot_id", getData("dis_hot_id_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_dis_room_id", getElements("add_i_dis_room_id")}, // element path
                "dis_room_id", getData("dis_room_id_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_seq_age_ext", getElements("add_i_seq_age_ext")}, // element path
                "seq_age_ext", getData("seq_age_ext_edit"), where)) {
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
    private boolean qbe_accommodation(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_qbe", getElements("accommodation_b_qbe")},// query button
                new String[]{"qbe_i_hotel_id", getElements("qbe_i_hotel_id")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel_id", getElements("qbe_i_hotel_id")}, // element path
                "hotel_id", getData("hotel_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rate_plan", getElements("qbe_i_rate_plan")}, // element path
                "rate_plan", getData("rate_plan"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")}, // element path
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_baseboard_type", getElements("qbe_i_baseboard_type")}, // element path
                "baseboard_type", getData("baseboard_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contract_name", getElements("qbe_i_contract_name")}, // element path
                "contract_name", getData("contract_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_incoming_office", getElements("qbe_i_incoming_office")}, // element path
                "incoming_office", getData("incoming_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contr_seq", getElements("qbe_i_contr_seq")}, // element path
                "contr_seq", getData("contr_seq"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hsi_user", getElements("qbe_i_hsi_user")}, // element path
                "hsi_user", getData("hsi_user"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_register_status", getElements("qbe_i_register_status")}, // element path
                "register_status", getData("register_status"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_activ_date", getElements("qbe_i_activ_date")}, // element path
                "activ_date", getData("activ_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_room_id", getElements("qbe_i_room_id")}, // element path
                "room_id", getData("room_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dis_hot_id", getElements("qbe_i_dis_hot_id")}, // element path
                "dis_hot_id", getData("dis_hot_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dis_room_id", getElements("qbe_i_dis_room_id")}, // element path
                "dis_room_id", getData("dis_room_id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_seq_age_ext", getElements("qbe_i_seq_age_ext")}, // element path
                "seq_age_ext", getData("seq_age_ext"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_hotel_id", getElements("qbe_i_hotel_id")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_accommodation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        String where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"accommodation_b_detach", getElements("accommodation_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_accommodation(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"accommodation_b_delete", getElements("accommodation_b_delete")},
                new String[]{"accommodation_e_records", getElements("accommodation_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}