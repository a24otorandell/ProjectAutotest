package screen.AT2ACCSU0018;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.apache.bcel.generic.I2F;
import org.apache.bcel.generic.IF_ACMPEQ;

/**
 * Created by vsolis on 29/09/2016.
 *
 * Bug en el campo hotel description, se borra en la tabla nada mas darle al search
 */
public class AT2ACCSU0018Test {
    protected AT2ACCSU0018Locators locators;
    protected AT2ACCSU0018Data data;

    public AT2ACCSU0018Test() {

    }

    public AT2ACCSU0018Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0018Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0018Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0018Data data) {
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

        if (!Hotel_coments(driver)) {
            return false;
        }

        if (!Multi_lenguage(driver)) {
            return false;
        }

        if (!Delete_actions_hotel(driver)) {
            return false;
        }
        return false;
    }

    //HOTEL COMMENTS

    private boolean Hotel_coments(TestDriver driver) {

        if (!Add_hotel_coments(driver)) {
            return false;
        }

        if (!Search_hotel_coments(driver)) {
            return false;
        }

        if (!Edit_hotel_coments(driver)) {
            return false;
        }

        if (!Qbe_hotel_coments(driver)) {
            return false;
        }

        if (!Other_actions_hotel_coments(driver)) {
            return false;
        }


        return true;
    }

    private boolean Delete_actions_hotel(TestDriver driver) {

        driver.getReport().addHeader("DELETE IN HOTEL COMMENTS", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_comments_del_b_delete", getElements("hotel_comments_del_b_delete")},
                new String[]{"hotel_comments_del_e_records", getElements("hotel_comments_del_e_records")},
                new String[]{"hotel_comments_del_b_delete_b_ok", getElements("hotel_comments_del_b_delete_b_ok")},
                " on DELETE")) {
            return false;
        }

        return true;
    }

    private boolean Other_actions_hotel_coments(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN HOTEL COMMENTS", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"hotel_comments_oa_b_actions", getElements("hotel_comments_oa_b_actions")}, //actions button
                new String[]{"hotel_comments_oa_b_audit_data", getElements("hotel_comments_oa_b_audit_data")}, //audit button
                new String[]{"hotel_comments_oa_b_aduit_data_ok", getElements("hotel_comments_oa_b_aduit_data_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"hotel_comments_oa_b_detach", getElements("hotel_comments_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean Qbe_hotel_coments(TestDriver driver) {

        driver.getReport().addHeader("QBE IN HOTEL COMMENTS", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"hotel_comments_se_b_reset", getElements("hotel_comments_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"hotel_comments_qbe_b_qbe", getElements("hotel_comments_qbe_b_qbe")},// query button
                new String[]{"hotel_comments_qbe_i_from", getElements("hotel_comments_qbe_i_from")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_i_from", getElements("hotel_comments_qbe_i_from")},
                "qbe_from", data.getData().get("from"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbei_to", getElements("hotel_comments_qbei_to")},
                "qbe_to", data.getData().get("to"), " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_comments_qbe_sl_date_type", getElements("hotel_comments_qbe_sl_date_type")},
                data.getData().get("date_type"), "qbe_date_type", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_to", getElements("hotel_comments_qbe_to")},
                "qbe_tto", data.getData().get("tto"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_to_desc", getElements("hotel_comments_qbe_to_desc")},
                "qbe_tto_desc", data.getData().get("tto_desc"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_hotel", getElements("hotel_comments_qbe_hotel")},
                "qbe_hotel", data.getData().get("hotel"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_hotel_description", getElements("hotel_comments_qbe_hotel_description")},
                "qbe_hotel_description", "%" + data.getData().get("hotel_description"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_chain", getElements("hotel_comments_qbe_chain")},
                "qbe_chain", data.getData().get("chain"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_qbe_chain_description", getElements("hotel_comments_qbe_chain_description")},
                "qbe_chain_description", data.getData().get("chain_description"), " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_comments_qbe_ch_send_hotel", getElements("hotel_comments_qbe_ch_send_hotel")},
                "No", "qbe_send_hotel", " on ADD")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_comments_qbe_ch_voucher", getElements("hotel_comments_qbe_ch_voucher")},
                "No", "qbe_vouncher", " on ADD")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_comments_qbe_i_from", getElements("hotel_comments_qbe_i_from")}, //search button
                new String[]{"hotel_comments_se_e_result", getElements("hotel_comments_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }

    private boolean Edit_hotel_coments(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN HOTEL COMMENTS", 3, false);

        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"hotel_comments_ed_b_edit", getElements("hotel_comments_ed_b_edit")}, //element to click
                new String[]{"hotel_comments_ed_i_from", getElements("hotel_comments_ed_i_from")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_ed_i_from", getElements("hotel_comments_ed_i_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_ed_i_to", getElements("hotel_comments_ed_i_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-3, -3), 0), " on EDIT")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_comments_ed_sl_date_type", getElements("hotel_comments_ed_sl_date_type")},
                "Stay", "date_type", " on EDIT")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"hotel_comments_ed_lov_to_desc", getElements("hotel_comments_ed_lov_to_desc")}, // b_lov
                new String[]{"hotel_comments_ed_i_to_desc", getElements("hotel_comments_ed_i_to_desc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto_desc", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"hotel_comments_ed_e_to", getElements("hotel_comments_ed_e_to")}, // element path
                "tto", // key for data value (the name)
                " on EDIT")) {
            return false;
        }


        if (!Functions.insertInput(driver, new String[]{"hotel_comments_ed_i_hotel", getElements("hotel_comments_ed_i_hotel")},
                "white", " ", " on EDIT")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"hotel_comments_ed_lov_chain", getElements("hotel_comments_ed_lov_chain")}, //LoV button
                new String[]{"hotel_comments_ed_i_chain", getElements("hotel_comments_ed_i_chain")}, //external LoV input
                new String[]{"hotel_comments_ed_lov_chain_i_code", getElements("hotel_comments_ed_lov_chain_i_code")}, //internal LoV input
                "HILGV", // value to search
                "chain", //name of the data
                " on EDIT")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"hotel_comments_ed_lov_hotel", getElements("hotel_comments_ed_lov_hotel")}, // b_lov
                new String[]{"hotel_comments_ed_i_hotel", getElements("hotel_comments_ed_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"hotel_comments_ed_e_hotel_description", getElements("hotel_comments_ed_e_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                " on EDIT")) {
            return false;
        }


        if (!Functions.getValue(driver, new String[]{"hotel_comments_ed_e_chain_description", getElements("hotel_comments_ed_e_chain_description")}, // element path
                "chain_description", // key for data value (the name)
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("hotel_comments_ed_ch_send_hotel"), "send_hotel", false, true, " on EDIT")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("hotel_comments_ed_ch_voucher"), "vouncher", false, true, " on EDIT")) {
            return false;
        }//where

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_comments_ed_b_save", getElements("hotel_comments_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }

        return true;
    }

    private boolean Search_hotel_coments(TestDriver driver) {

        driver.getReport().addHeader("SEARCH IN HOTEL COMMENTS", 3, false);

        boolean check_box_send_hotel = false;
        boolean check_box_voucher = false;
        if (getData("send_hotel").equalsIgnoreCase("yes")) {
            check_box_send_hotel = true;
        }
        if (getData("vouncher").equalsIgnoreCase("yes")) {
            check_box_voucher = true;
        }

        if (!Functions.insertInput(driver, new String[]{"hotel_comments_se_i_from", getElements("hotel_comments_se_i_from")},
                "se_from", data.getData().get("from"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_se_i_to", getElements("hotel_comments_se_i_to")},
                "se_to", data.getData().get("to"), " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_comments_se_sl_date_type", getElements("hotel_comments_se_sl_date_type")},
                data.getData().get("date_type"), "se_date_type", " on SEARCH")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"hotel_comments_se_lov_hotel", getElements("hotel_comments_se_lov_hotel")}, //LoV button
                new String[]{"hotel_comments_se_i_hotel", getElements("hotel_comments_se_i_hotel")}, //external LoV input
                new String[]{"hotel_comments_se_lov_hotel_i_seqhotel", getElements("hotel_comments_se_lov_hotel_i_seqhotel")}, //internal LoV input
                data.getData().get("hotel"), // value to search
                "se_hotel", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"hotel_comments_se_lov_chain", getElements("hotel_comments_se_lov_chain")}, //LoV button
                new String[]{"hotel_comments_se_i_chain", getElements("hotel_comments_se_i_chain")}, //external LoV input
                new String[]{"hotel_comments_se_lov_chain_i_code", getElements("hotel_comments_se_lov_chain_i_code")}, //internal LoV input
                data.getData().get("chain"), // value to search
                "se_chain", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,

                getElements("hotel_comments_se_ch_send_hotel"), "se_send_hotel", check_box_send_hotel, " on SEARCH")) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("hotel_comments_se_ch_voucher"), "se_vouncher", check_box_voucher, " on SEARCH")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"hotel_comments_se_b_search", getElements("hotel_comments_se_b_search")}, //search button
                new String[]{"hotel_comments_se_e_result", getElements("hotel_comments_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }

        return true;
    }

    private boolean Add_hotel_coments(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN HOTEL COMMENTS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"hotel_comments_add_b_add", getElements("hotel_comments_add_b_add")}, //element to click
                new String[]{"hotel_comments_add_i_from", getElements("hotel_comments_add_i_from")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_add_i_from", getElements("hotel_comments_add_i_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_comments_add_i_to", getElements("hotel_comments_add_i_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-3, -3), 0), " on ADD")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_comments_add_sl_date_type", getElements("hotel_comments_add_sl_date_type")},
                "Creation", "date_type", " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"hotel_comments_add_lov_to_desc", getElements("hotel_comments_add_lov_to_desc")}, // b_lov
                new String[]{"hotel_comments_add_i_to_desc", getElements("hotel_comments_add_i_to_desc")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto_desc", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"hotel_comments_add_lov_hotel", getElements("hotel_comments_add_lov_hotel")}, // b_lov
                new String[]{"hotel_comments_add_i_hotel", getElements("hotel_comments_add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"hotel_comments_add_lov_chain", getElements("hotel_comments_add_lov_chain")}, // b_lov
                new String[]{"hotel_comments_add_i_chain", getElements("hotel_comments_add_i_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("hotel_comments_add_ch_send_hotel"), "send_hotel", true, true, " on ADD")) {
            return false;
        }//where

        if (!Functions.checkboxValue(driver,
                getElements("hotel_comments_add_ch_voucher"), "vouncher", true, true, " on ADD")) {
            return false;
        }//where

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_comments_add_b_save", getElements("hotel_comments_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }
        return true;
    }

    //MULTI LENGUAGE

    private boolean Multi_lenguage(TestDriver driver) {
        if (!Add_multi(driver)) {
            return false;
        }
        if (!Search_multi(driver)) {
            return false;
        }
        if (!Edit_multi(driver)) {
            return false;
        }
        if (!Search_multi(driver)) {
            return false;
        }
        if (!Other_actions_multi(driver)) {
            return false;
        }
        if (!Delete_multi(driver)) {
            return false;
        }

        return true;
    }

    private boolean Delete_multi(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN HOTEL COMMENTS", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"multi_lenguaje_se_e_result", getElements("multi_lenguaje_se_e_result")}, //element to click
                " on DELETE")) {
            return false;
        }
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"multi_lenguaje_del_b_delete", getElements("multi_lenguaje_del_b_delete")},
                new String[]{"multi_lenguaje_del_e_records", getElements("multi_lenguaje_del_e_records")},
                new String[]{"multi_lenguaje_del_b_delete_b_yes", getElements("multi_lenguaje_del_b_delete_b_yes")},
                " on DELETE")) {
            return false;
        }
        return true;
    }

    private boolean Other_actions_multi(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN HOTEL COMMENTS", 3, false);

        if (!Functions.auditData(driver,
                new String[]{"multi_lenguaje_oa_b_actions", getElements("multi_lenguaje_oa_b_actions")}, //actions button
                new String[]{"multi_lenguaje_oa_b_adit_data", getElements("multi_lenguaje_oa_b_adit_data")}, //audit button
                new String[]{"multi_lenguaje_oa_b_audit_data_b_ok", getElements("multi_lenguaje_oa_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")) {
            return false;

        }
        if (!Functions.detachTable(driver,
                new String[]{"multi_lenguaje_oa_b_detach", getElements("multi_lenguaje_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }


        return true;
    }

    private boolean Edit_multi(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN HOTEL COMMENTS", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"multi_lenguaje_se_e_result", getElements("multi_lenguaje_se_e_result")}, //element to click
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"multi_lenguaje_ed_b_edit", getElements("multi_lenguaje_ed_b_edit")}, //element to click
                new String[]{"multi_lenguaje_ed_i_lenguage", getElements("multi_lenguaje_ed_i_lenguage")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_lenguaje_ed_i_lenguage", getElements("multi_lenguaje_ed_i_lenguage")},
                "cas", "ING", " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_lenguaje_ed_i_remarks", getElements("multi_lenguaje_ed_i_remarks")},
                "castellano", "ingles", " on EDIT")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"multi_lenguaje_ed_b_save", getElements("multi_lenguaje_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;
    }

    private boolean Search_multi(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN HOTEL COMMENTS", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"multi_lenguaje_se_b_qbe", getElements("multi_lenguaje_se_b_qbe")},// query button
                new String[]{"multi_lenguaje_se_i_lenaguage", getElements("multi_lenguaje_se_i_lenaguage")},//any query input
                " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_lenguaje_se_i_lenaguage", getElements("multi_lenguaje_se_i_lenaguage")},
                "se_cas", data.getData().get("cas"), " on SEARCH")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_lenguaje_se_i_remarks", getElements("multi_lenguaje_se_i_remarks")},
                "se_castellano", data.getData().get("castellano"), " on SEARCH")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"multi_lenguaje_se_i_remarks", getElements("multi_lenguaje_se_i_remarks")}, //search button
                new String[]{"multi_lenguaje_se_e_result", getElements("multi_lenguaje_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }

    private boolean Add_multi(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN HOTEL COMMENTS", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"multi_lenguaje_add_b_add", getElements("multi_lenguaje_add_b_add")}, //element to click
                new String[]{"multi_lenguaje_add_i_lenguage", getElements("multi_lenguaje_add_i_lenguage")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_lenguaje_add_i_lenguage", getElements("multi_lenguaje_add_i_lenguage")},
                "cas", "CAS", " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"multi_lenguaje_add_i_remarks", getElements("multi_lenguaje_add_i_remarks")},
                "castellano", "Castellano", " on ADD")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"multi_lenguaje_add_b_save", getElements("multi_lenguaje_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }
        return true;
    }

}
