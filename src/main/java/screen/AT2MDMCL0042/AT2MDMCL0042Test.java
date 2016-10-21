package screen.AT2MDMCL0042;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMCL0042Test {
    protected AT2MDMCL0042Locators locators;
    protected AT2MDMCL0042Data data;
    public AT2MDMCL0042Test() {
    }
    public AT2MDMCL0042Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0042Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0042Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0042Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen("Commercial policy 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_comercial(driver)) return false;
        if (!search_comercial(driver)) return false;
        if (!interaction_edit_comercial(driver)) return false;
        if (!qbe_comercial(driver)) return false;
        if (!others_actions_comercial(driver)) return false;
        return true;
    }

    private boolean interaction_record_comercial(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"comercial_b_add", getElements("comercial_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_prod", getElements("add_lov_prod")}, // b_lov
                new String[]{"add_i_prod", getElements("add_i_prod")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "prod", //Data name
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
        if (!Functions.insertInput(driver, new String[]{"add_i_application_from", getElements("add_i_application_from")},
                "apli_f", DataGenerator.getRelativeDateToday("dd/MM/yyyy HH:mm:ss", 0, DataGenerator.random(1,2), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_application_to", getElements("add_i_application_to")},
                "apli_t", DataGenerator.getRelativeDateToday("dd/MM/yyyy HH:mm:ss", 0, DataGenerator.random(2,6), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_booking_from", getElements("add_i_booking_from")},
                "from", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-8,-3), 0), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_booking_to", getElements("add_i_booking_to")},
                "to", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 3), 0), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_invoicing", getElements("add_lov_invoicing")}, // b_lov
                new String[]{"add_i_invoicing", getElements("add_i_invoicing")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "invoicing", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_client", getElements("add_lov_client")}, // b_lov
                new String[]{"add_i_client", getElements("add_i_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_group", getElements("add_lov_group")}, // b_lov
                new String[]{"add_i_group", getElements("add_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_chain", getElements("add_lov_chain")}, // b_lov
                new String[]{"add_i_chain", getElements("add_i_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination", getElements("add_lov_destination")}, // b_lov
                new String[]{"add_i_destination", getElements("add_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_company", getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)) {
            return false;
        }
        /*if (!Functions.createLov(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, // b_lov
                new String[]{"add_i_office", getElements("add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)) {
            return false;
        }*/
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_office", getElements("add_lov_office")}, //LoV button
                new String[]{"add_i_office", getElements("add_i_office")}, //external LoV input
                new String[]{"add_lov_office_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result,
                "92", // value to search
                "office", //name of the data
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type", getElements("add_sl_type")},
                "Ticket", "type", where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_service", getElements("add_lov_service")}, // b_lov
                new String[]{"add_i_service", getElements("add_i_service")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "service", //Data name
                where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_modality", getElements("add_lov_modality")}, // b_lov
                new String[]{"add_i_modality", getElements("add_i_modality")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "modality", //Data name
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_commission", getElements("add_i_commission")},
                "commission", DataGenerator.randomFloat(1,50), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_rappel", getElements("add_i_rappel")},
                "rappel", DataGenerator.randomFloat(1,50), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency", getElements("add_i_agency")},
                "agency", DataGenerator.randomFloat(1,50), where)) {
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
    private boolean search_comercial(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_booking_from", getElements("search_i_booking_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_booking_to", getElements("search_i_booking_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_application_from", getElements("search_i_application_from")},
                "apli_f", getData("apli_f"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_application_to", getElements("search_i_application_to")},
                "apli_t", getData("apli_t"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"comercial_e_result", getElements("comercial_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_comercial(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"comercial_b_edit", getElements("comercial_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_application_to", getElements("add_i_application_to")},
                "apli_t", DataGenerator.getRelativeDateToday("dd/MM/yyyy HH:mm:ss", 0, DataGenerator.random(2,8), 0), where)) {
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
    private boolean qbe_comercial(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"comercial_e_result", getElements("comercial_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"comercial_b_qbe", getElements("comercial_b_qbe")},// query button
                new String[]{"qbe_i_prod", getElements("qbe_i_prod")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_prod", getElements("qbe_i_prod")},
                "prod", getData("prod"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application_from", getElements("qbe_i_application_from")},
                "apli_f", getData("apli_f"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_application_to", getElements("qbe_i_application_to")},
                "apli_t", getData("apli_t"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_from", getElements("qbe_i_booking_from")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_to", getElements("qbe_i_booking_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_invoicing", getElements("qbe_i_invoicing")},
                "invoicing", getData("invoicing"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_client", getElements("qbe_i_client")},
                "client", getData("client"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_group", getElements("qbe_i_group")},
                "group", getData("group"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_chain", getElements("qbe_i_chain")},
                "chain", getData("chain"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type", getElements("qbe_sl_type")},
                getData("type"), "type", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_service", getElements("qbe_i_service")},
                "service", getData("service"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_modality", getElements("qbe_i_modality")},
                "modality", getData("modality"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_commission", getElements("qbe_i_commission")},
                "commission", getData("commission"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rappel", getElements("qbe_i_rappel")},
                "rappel", getData("rappel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_group", getElements("qbe_i_group")}, //search button
                new String[]{"comercial_e_result", getElements("comercial_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_comercial(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"comercial_b_actions", getElements("comercial_b_actions")}, //actions button
                new String[]{"comercial_b_actions_b_audit_data", getElements("comercial_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"comercial_b_detach", getElements("comercial_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
