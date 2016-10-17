package screen.AT2ACCOP0004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCOP0004Test {
    protected AT2ACCOP0004Locators locators;
    protected AT2ACCOP0004Data data;

    public AT2ACCOP0004Test() {
    }

    public AT2ACCOP0004Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCOP0004Locators locators) {
        this.locators = locators;
    }

    public AT2ACCOP0004Data getData() {
        return data;
    }

    public void setData(AT2ACCOP0004Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BIBIT Blacklist query");
        driver.getTestdetails().setSubmenu("Accommodation");
        driver.getTestdetails().setScreen("Operations");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search_accommodation(driver)) return false;
        if (!qbe_accommodation(driver)) return false;
        if (!others_actions_accommodation(driver)) return false;
        return false;
    }

    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_TO", getElements("search_lov_TO")}, //LoV button
                new String[]{"search_i_TO", getElements("search_i_TO")}, //external LoV input
                new String[]{"search_lov_TO_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("search_e_TO_result"), // value to search
                "TO", //name of the data
                where)) {
            return false;
        }
        /*if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_e_interface_result")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)){
            return false;
        }
        if(!Functions.getText(driver,
                new String[]{"search_e_interface_description", getElements("search_e_interface_description")}, // element path
                "interface_description", // key for data value (the name)
                where)){
            return false;}*/
        if (!Functions.getText(driver, new String[]{"search_e_email_result", getElements("search_e_email_result")}, // element path
                "email", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_email", getElements("search_i_email")},
                "email", data.getData().get("email"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_telephone", getElements("search_e_telephone_result")},
                "telephone", data.getData().get("telephone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_ip_adress", getElements("search_e_ip_result")},
                "ip_adress", data.getData().get("ip_adress"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_hash", getElements("search_e_hash_result")},
                "hash", data.getData().get("hash"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_card_holder_name", getElements("search_e_card_holder_name_result")},
                "card_holder_name", data.getData().get("card_holder_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_amount", getElements("search_e_amount_result")},
                "amount", data.getData().get("amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_general_name", getElements("search_e_general_name_result")},
                "general_name", data.getData().get("general_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_partner", getElements("search_e_partner_result")},
                "partner", data.getData().get("partner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_creation_date_from", getElements("search_i_creation_date_from")},
                "amount", data.getData().get("date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_creation_date_to", getElements("search_i_creation_date_to")},
                "amount", data.getData().get("date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_service_date_from", getElements("search_i_service_date_from")},
                "amount", data.getData().get("date2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_service_date_to", getElements("search_i_service_date_to")},
                "amount", data.getData().get("date2"), where)) {
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

    private boolean qbe_accommodation(TestDriver driver) {

        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";

        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_qbe", getElements("accommodation_b_qbe")},// query button
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_TO", getElements("qbe_i_TO")},
                "TO", getData("TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_general_name", getElements("qbe_i_general_name")},
                "general_name", getData("general_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_TO_reference", getElements("qbe_i_TO_reference")},
                "TO_reference", getData("TO_reference"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_partner", getElements("qbe_i_partner")},
                "partner", getData("partner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ip", getElements("qbe_i_ip")},
                "ip", getData("ip"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_creation_user", getElements("qbe_i_creation_user")},
                "creation_user", getData("creation_user"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_creation_date", getElements("qbe_i_creation_date")},
                "creation_date", getData("date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from", getElements("qbe_i_from")},
                "from", getData("date2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("date2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_telephone", getElements("qbe_i_telephone")},
                "telephone", getData("telephone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_email", getElements("qbe_i_email")},
                "email", getData("email"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hash", getElements("qbe_i_hash")},
                "hash", getData("hash"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_expiry_date", getElements("qbe_i_expiry_date")},
                "expiry_date", getData("expiry_date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_card_type", getElements("qbe_i_card_type")},
                "card_type", getData("card_type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_card_holder_name", getElements("qbe_i_card_holder_name")},
                "card_holder_name", getData("card_holder_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_confirmation_date", getElements("qbe_i_confirmation_date")},
                "confirmation_date", getData("date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount", getElements("qbe_i_amount")},
                "amount", getData("amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }

    private boolean others_actions_accommodation(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"accommodation_b_actions", getElements("accommodation_b_actions")}, //actions button
                new String[]{"accommodation_b_actions_audit_data", getElements("accommodation_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"accommodation_b_detach", getElements("accommodation_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

}

