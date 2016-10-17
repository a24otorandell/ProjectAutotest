package screen.AT2ACCOP0004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCOP0004Sis {
    protected AT2ACCOP0004Locators locators;
    protected AT2ACCOP0004Data data;

    public AT2ACCOP0004Sis() {
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
        if (!data_accommodation(driver)) return false;
        if (!search_accommodation(driver)) return false;
        if (!qbe_accommodation(driver)) return false;
        if (!others_actions_accommodation(driver)) return false;
        return false;
    }

    //Ya que la pantalla es sólo de consulta se utiliza este método para recoger la información que se ha de usar durante la misma
    private boolean data_accommodation(TestDriver driver) {
        driver.getReport().addHeader("DATA RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on DATA";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)) {
            return false;
        }
        Functions.zoomOut(driver, 3);
        if (!Functions.getText(driver, new String[]{"search_e_TO_result", getElements("search_e_TO_result")}, // element path
                "TO_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_interface_result", getElements("search_e_interface_result")}, // element path
                "interface_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_email_result", getElements("search_e_email_result")}, // element path
                "email_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_telephone_result", getElements("search_e_telephone_result")}, // element path
                "telephone_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_ip_result", getElements("search_e_ip_result")}, // element path
                "ip_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_hash_result", getElements("search_e_hash_result")}, // element path
                "hash_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_card_holder_name_result", getElements("search_e_card_holder_name_result")}, // element path
                "card_holder_name_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_amount_result", getElements("search_e_amount_result")}, // element path
                "amount_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_general_name_result", getElements("search_e_general_name_result")}, // element path
                "general_name_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_partner_result", getElements("search_e_partner_result")}, // element path
                "partner_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_creation_date_result", getElements("search_e_creation_date_result")}, // element path
                "creation_date_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_confirmation_date_result", getElements("search_e_confirmation_date_result")}, // element path
                "confirmation_date_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_from_result", getElements("search_e_from_result")}, // element path
                "from_date_result", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_to_result", getElements("search_e_to_result")}, // element path
                "to_date_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_hotel_result", getElements("search_e_hotel_result")}, // element path
                "hotel_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_destination_result", getElements("search_e_destination_result")}, // element path
                "destination_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_creation_user_result", getElements("search_e_creation_user_result")}, // element path
                "creation_user_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_expiry_date_result", getElements("search_e_expiry_date_result")}, // element path
                "expiry_date_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_card_type_result", getElements("search_e_card_type_result")}, // element path
                "card_type_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        if (!Functions.getText(driver, new String[]{"search_e_currency_result", getElements("search_e_currency_result")}, // element path
                "currency_result", // key for data value (the name)
                where)) {
            return false;
        } //where this operation occurs
        return true;
    }
    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_TO", getElements("search_lov_TO")}, //LoV button
                new String[]{"search_i_TO", getElements("search_i_TO")}, //external LoV input
                new String[]{"search_lov_TO_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("TO_result"), // value to search
                "TO", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_altresult,
                getData("interface_result"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.getText(driver,
                new String[]{"search_e_interface_description", getElements("search_e_interface_description")}, // element path
                "interface_description", // key for data value (the name)
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_email", getElements("search_i_email")},
                "email_result", data.getData().get("email_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_telephone", getElements("search_i_telephone")},
                "telephone", data.getData().get("telephone_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_ip_adress", getElements("search_i_ip_adress")},
                "ip_adress", data.getData().get("ip_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_hash", getElements("search_i_hash")},
                "hash", data.getData().get("hash_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_card_holder_name", getElements("search_i_card_holder_name")},
                "card_holder_name", data.getData().get("card_holder_name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_amount", getElements("search_i_amount")},
                "amount", data.getData().get("amount_result").substring(0, getData("amount_result").length() - 3), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_general_name", getElements("search_i_general_name")},
                "general_name", data.getData().get("general_name_result"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_partner", getElements("search_lov_partner")}, //LoV button
                new String[]{"search_i_partner", getElements("search_i_partner")}, //external LoV input
                new String[]{"search_lov_partner_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("partner_result"), // value to search
                "partner", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_creation_date_from", getElements("search_i_creation_date_from")},
                "creation_date_from", data.getData().get("creation_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_creation_date_to", getElements("search_i_creation_date_to")},
                "creation_date_to", data.getData().get("confirmation_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_service_date_from", getElements("search_i_service_date_from")},
                "service_date_from", data.getData().get("from_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_service_date_to", getElements("search_i_service_date_to")},
                "service_date_to", data.getData().get("to_date_result"), where)) {
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
                "interface", getData("interface_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_TO", getElements("qbe_i_TO")},
                "TO", getData("TO_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_general_name", getElements("qbe_i_general_name")},
                "general_name", getData("general_name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_TO_reference", getElements("qbe_i_TO_reference")},
                "TO_reference", getData("TO_reference_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_partner", getElements("qbe_i_partner")},
                "partner", getData("partner_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ip", getElements("qbe_i_ip")},
                "ip", getData("ip_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_creation_user", getElements("qbe_i_creation_user")},
                "creation_user", getData("creation_user_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_creation_date", getElements("qbe_i_creation_date")},
                "creation_date", getData("creation_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_from", getElements("qbe_i_from")},
                "from", getData("from_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_to", getElements("qbe_i_to")},
                "to", getData("to_date_result"), where)) {
            return false;
        }
        //El código funciona pero por alguna razón el campo "Telephone" o el campo "Email", dependiendo de algún factor
        //desconocido, se borran después de autocompletarse y antes de saltar al siguiente campo
        if (!Functions.insertInput(driver, new String[]{"qbe_i_telephone", getElements("qbe_i_telephone")},
                "telephone", getData("telephone_result"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_email", getElements("qbe_i_email")},
                "email", getData("email_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hash", getElements("qbe_i_hash")},
                "hash", getData("hash_result"), where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_expiry_date", getElements("qbe_i_expiry_date")},
                "expiry_date", getData("expiry_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_card_type", getElements("qbe_i_card_type")},
                "card_type", getData("card_type_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_card_holder_name", getElements("qbe_i_card_holder_name")},
                "card_holder_name", getData("card_holder_name_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_confirmation_date", getElements("qbe_i_confirmation_date")},
                "confirmation_date", getData("confirmation_date_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount", getElements("qbe_i_amount")},
                "amount", getData("amount_result"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency_result"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_interface", getElements("qbe_i_interface")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)) {
            return false;
        }
        Functions.zoomIn(driver);
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

