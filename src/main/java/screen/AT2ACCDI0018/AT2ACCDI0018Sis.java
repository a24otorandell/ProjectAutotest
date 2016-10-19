package screen.AT2ACCDI0018;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 17/10/2016.
 */

/**
 * AUTOTEST CON DATOS POR DEFECTO. NO TODOS LOS CÓDIGOS TIENEN COMPAÑIAS
 */
public class AT2ACCDI0018Sis {
    protected AT2ACCDI0018Locators locators;
    protected AT2ACCDI0018Data data;

    public AT2ACCDI0018Sis() {

    }

    public AT2ACCDI0018Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCDI0018Locators locators) {
        this.locators = locators;
    }

    public AT2ACCDI0018Data getData() {
        return data;
    }

    public void setData(AT2ACCDI0018Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Distribution");
        driver.getTestdetails().setScreen("Cancellation Policies");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_cancellation(driver)) return false;
        if (!search_cancellation(driver, true)) return false;
        if (!qbe_cancellation(driver)) return false;
        if (!interaction_edit_cancellation(driver)) return false;
        if (!search_cancellation(driver, false)) return false;
        if (!qbe_cancellation(driver)) return false;
        if (!others_actions_cancellation(driver)) return false;
        if (!delete_cancellation(driver)) return false;
        return false;
    }

    private boolean interaction_record_cancellation(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"cancellation_b_add", getElements("cancellation_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")},
                "code", "" + 1234, where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, //LoV button
                new String[]{"add_i_companyy", getElements("add_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "BG0", // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, // b_lov
                new String[]{"add_i_to", getElements("add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_to_desc", getElements("add_i_to_desc")}, // element path
                "to_desc", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_booking_type", getElements("add_lov_booking_type")}, // b_lov
                new String[]{"add_i_booking_type", getElements("add_i_booking_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "booking_type", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from_date", getElements("add_i_from_date")},
                "from_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_to_date", getElements("add_i_to_date")},
                "to_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_days", getElements("add_i_days")},
                "days", "" + 1, where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_time", getElements("add_i_time")},
                "time", "" + 1, where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cost", getElements("add_i_cost")},
                "cost", "" + 1, where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_amount_cost", getElements("add_i_amount_cost")}, // element path
                "amount_cost", // key for data value (the name)
                where)) {
            return false;
        }
        /*if (!Functions.insertInput(driver, new String[]{"add_i_amount_cost", getElements("add_i_amount_cost")},
                "amount_cost", ""+1, where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"add_i_extra", getElements("add_i_extra")},
                "extra", "" + 1, where)) {
            return false;
        }
        /*if (!Functions.insertInput(driver, new String[]{"add_i_amount_extra", getElements("add_i_amount_extra")},
                "amount_extra", ""+1, where)) {
            return false;
        }*/
        if (!Functions.getText(driver, new String[]{"add_i_amount_extra", getElements("add_i_amount_extra")}, // element path
                "amount_extra", // key for data value (the name)
                where)) {
            return false;
        }
        /*if (!Functions.createLov(driver,
                new String[]{"add_lov_currency", getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.getText(driver, new String[]{"add_i_currency", getElements("add_i_currency")}, // element path
                "currency", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_type", getElements("add_sl_application_type")},
                "Stay", "application_type", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_cost", getElements("add_sl_application_cost")},
                "Only Generic.", "application_cost", where)) {
            return false;
        }
        /*if (!Functions.checkboxValue(driver,
                getElements("add_ck_net_amount"), "visible", true, where)) {
            return false;
        }*/
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_net_amount"), "net_amount", true, true, where)) {
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

    private boolean search_cancellation(TestDriver driver, boolean check) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 30, 500);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_b_reset", getElements("qbe_b_reset")}, //search button
                new String[]{"cancellation_e_result", getElements("cancellation_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("company"), // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_office", getElements("search_lov_office")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_lov_office_i_code", recursiveXPaths.lov_i_altgenericinput},
                getData("office"), // value to search
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_to", getElements("search_lov_to")}, //LoV button
                new String[]{"search_i_to", getElements("search_i_to")}, //external LoV input
                new String[]{"search_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("to"), // value to search
                "to", //name of the data
                where)) {
            return false;
        }
        /*if (!Functions.insertInput(driver, new String[]{"search_i_to_description", getElements("search_i_to_description")},
                "to_desc", getData("to_desc"), where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_booking_type", getElements("search_lov_booking_type")}, //LoV button
                new String[]{"search_i_booking_type", getElements("search_i_booking_type")}, //external LoV input
                new String[]{"search_lov_booking_type_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("booking_type"), // value to search
                "booking_type", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_from_date", getElements("search_i_from_date")},
                "from_date", getData("from_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_to_date", getElements("search_i_to_date")},
                "to_date", getData("to_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_days", getElements("search_i_days")},
                "days", getData("days"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_time", getElements("search_i_time")},
                "time", getData("time"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_cost", getElements("search_i_cost")},
                "cost", getData("cost"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_amount_cost", getElements("search_i_amount_cost")},
                "amount_cost", getData("amount_cost"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_extra", getElements("search_i_extra")},
                "extra", getData("extra"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_amount_extra", getElements("search_i_amount_extra")},
                "amount_extra", getData("amount_extra"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_currency", getElements("search_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        /*if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_currency", getElements("search_lov_currency")}, //LoV button
                new String[]{"search_i_currency", getElements("search_i_currency")}, //external LoV input
                new String[]{"search_lov_currency_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("currency"), // value to search
                "currency", //name of the data
                where)) {
            return false;
        }*/
        if (!Functions.selectText(driver,
                new String[]{"search_sl_application_type", getElements("search_sl_application_type")},
                getData("application_type"), "application_type", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_application_cost", getElements("search_sl_application_cost")},
                getData("application_cost"), "application_cost", where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_net_amount"), getData("net_amount"), check, where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"cancellation_e_result", getElements("cancellation_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_cancellation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"cancellation_b_edit", getElements("cancellation_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, //LoV button
                new String[]{"add_i_companyy", getElements("add_i_company")}, //external LoV input
                new String[]{"edit_lov_company_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "CL1", // value to search
                "company", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_to", getElements("add_lov_to")}, // b_lov
                new String[]{"add_i_to", getElements("add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_to_desc", getElements("add_i_to_desc")}, // element path
                "to_desc", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_booking_type", getElements("add_lov_booking_type")}, // b_lov
                new String[]{"add_i_booking_type", getElements("add_i_booking_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "booking_type", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_from_date", getElements("add_i_from_date")},
                "from_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8, -3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_to_date", getElements("add_i_to_date")},
                "to_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_days", getElements("add_i_days")},
                "days", "" + 2, where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cost", getElements("add_i_cost")},
                "cost", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_extra", getElements("add_i_extra")},
                "extra", "", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_time", getElements("add_i_time")},
                "time", "" + 2, where)) {
            return false;
        }
        Functions.break_time(driver, 30, 1200);
        if (!Functions.insertInput(driver, new String[]{"add_i_amount_cost", getElements("add_i_amount_cost")},
                "amount_cost", "" + 2, where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_amount_extra", getElements("add_i_amount_extra")},
                "amount_extra", "" + 2, where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_currency", getElements("add_lov_currency")}, // b_lov
                new String[]{"add_i_currency", getElements("add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "currency", //Data name
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_type", getElements("add_sl_application_type")},
                "First night", "application_type", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_application_cost", getElements("add_sl_application_cost")},
                "Contract+Generic.", "application_cost", where)) {
            return false;
        }
        /*if (!Functions.checkboxValue(driver,
                getElements("add_ck_net_amount"), "net_amount", false, where)) {
            return false;
        }*/
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_net_amount"), "net_amount", false, true, where)) {
            return false;
        }//where
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_cancellation(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.zoomOut(driver)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                new String[]{"search_i_office", getElements("search_i_office")}, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"cancellation_b_qbe", getElements("cancellation_b_qbe")},// query button
                new String[]{"qbe_i_company", getElements("qbe_i_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_desc", getElements("qbe_i_to_desc")},
                "to_desc", "%" + getData("to_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_type", getElements("qbe_i_booking_type")},
                "booking_type", getData("booking_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from_date", getElements("qbe_i_from_date")},
                "from_date", getData("from_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to_date", getElements("qbe_i_to_date")},
                "to_date", getData("to_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_days", getElements("qbe_i_days")},
                "days", getData("days"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_time", getElements("qbe_i_time")},
                "time", getData("time"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cost", getElements("qbe_i_cost")},
                "cost", getData("cost"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount_cost", getElements("qbe_i_amount_cost")},
                "amount_cost", getData("amount_cost"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_extra", getElements("qbe_i_extra")},
                "extra", getData("extra"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount_extra", getElements("qbe_i_amount_extra")},
                "amount_extra", getData("amount_extra"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_application_type", getElements("qbe_sl_application_type")},
                getData("application_type"), "application_type", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_application_cost", getElements("qbe_sl_application_cost")},
                getData("application_cost"), "application_cost", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_net_amount", getElements("qbe_sl_net_amount")},
                getData("net_amount"), "net_amount", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //search button
                new String[]{"cancellation_e_result", getElements("cancellation_e_result")}, //result element
                where)) {
            return false;
        }
/*        if (!Functions.checkClick(driver,
                new String[]{"cancellation_b_qbe", getElements("cancellation_b_qbe")}, //element to click
                new String[]{"qbe_i_company", getElements("qbe_i_company")}, //element expected to appear
                where)) {
            return false;
        }*/
        return true;
    }
    private boolean others_actions_cancellation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"cancellation_b_actions", getElements("cancellation_b_actions")}, //actions button
                new String[]{"cancellation_b_actions_b_audit_data", getElements("cancellation_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"cancellation_b_detach", getElements("cancellation_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_cancellation(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"cancellation_b_delete", getElements("cancellation_b_delete")},
                new String[]{"cancellation_e_records", getElements("cancellation_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
