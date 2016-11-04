package screen.AT2ACCCO0049;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 13/10/2016.
 */
public class AT2ACCCO0049Sis {

    protected AT2ACCCO0049Locators locators;
    protected AT2ACCCO0049Data data;

    public AT2ACCCO0049Sis() {

    }
    public AT2ACCCO0049Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCCO0049Locators locators) {
        this.locators = locators;
    }
    public AT2ACCCO0049Data getData() {
        return data;
    }
    public void setData(AT2ACCCO0049Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Contracting");
        driver.getTestdetails().setScreen("Disney Mapping");
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
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_add", getElements("accommodation_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)){
            return false;
        }
        /* Hardcodeamos el primer elemento de la búsqueda para asegurarnos de que los demás
         también contienen información*/
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_receptive", getElements("add_lov_receptive")}, //LoV button
                new String[]{"add_i_receptive", getElements("add_i_receptive")}, //external LoV input
                new String[]{"add_lov_receptive2", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "1", // value to search
                "receptive", //name of the data
                where)){
            return false;}
        if (!Functions.getText(driver, new String[]{"add_i_receptive_description", getElements("add_i_receptive_description")}, // element path
                "receptive_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_contract", getElements("add_lov_contract")}, // b_lov
                new String[]{"add_i_contract", getElements("add_i_contract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "contract", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_contract_description", getElements("add_i_contract_description")}, // element path
                "contract_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_hotel", getElements("add_lov_hotel")}, // b_lov
                new String[]{"add_i_hotel", getElements("add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_i_hotel_description", getElements("add_i_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_room", getElements("add_lov_atlas_room")}, // b_lov
                new String[]{"add_i_atlas_room", getElements("add_i_atlas_room")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_room", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_characteristics", getElements("add_lov_atlas_characteristics")}, // b_lov
                new String[]{"add_i_atlas_characteristics", getElements("add_i_atlas_characteristics")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_characteristics", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_disney_hotel", getElements("add_i_disney_hotel")}, // element path
                "disney_hotel", getData("disney_hotel"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_disney_room", getElements("add_i_disney_room")}, // element path
                "disney_room", getData("disney_room"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_package_code", getElements("add_i_package_code")}, // element path
                "package_code", getData("package_code"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_calendar_order", getElements("add_i_calendar_order")}, // element path
                "calendar_order", getData("calendar_order"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_contract_type", getElements("add_i_contract_type")}, // element path
                "contract_type", getData("contract_type"), where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean search_accommodation(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_receptive", getElements("search_lov_receptive")}, //LoV button
                new String[]{"search_i_receptive", getElements("search_i_receptive")}, //external LoV input
                new String[]{"search_lov_receptive_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("receptive"), // value to search
                "receptive", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_contract", getElements("search_lov_contract")}, //LoV button
                new String[]{"search_i_contract", getElements("search_i_contract")}, //external LoV input
                new String[]{"search_lov_contract_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("contract"), // value to search
                "contract", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")}, //LoV button
                new String[]{"search_i_hotel", getElements("search_i_hotel")}, //external LoV input
                new String[]{"search_lov_hotel_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("hotel"), // value to search
                "hotel", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_atlas_room", getElements("search_lov_atlas_room")}, //LoV button
                new String[]{"search_i_atlas_room", getElements("search_i_atlas_room")}, //external LoV input
                new String[]{"search_lov_atlas_room_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("atlas_room"), // value to search
                "atlas_room", //name of the data
                where)){
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_atlas_characteristics", getElements("search_lov_atlas_characteristics")}, //LoV button
                new String[]{"search_i_atlas_characteristics", getElements("search_i_atlas_characteristics")}, //external LoV input
                new String[]{"search_lov_atlas_characteristics_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("atlas_characteristics"), // value to search
                "atlas_characteristics", //name of the data
                where)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_disney_hotel", getElements("search_i_disney_hotel")},
                "disney_hotel", data.getData().get("disney_hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_disney_room", getElements("search_i_disney_room")},
                "disney_room", data.getData().get("disney_room"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_package_code", getElements("search_i_package_code")},
                "package_code", data.getData().get("package_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_calendar_order", getElements("search_i_calendar_order")},
                "calendar_order", data.getData().get("calendar_order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"search_i_contract_type", getElements("search_i_contract_type")},
                "contract_type", data.getData().get("contract_type"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"accommodation_e_result_sis", getElements("accommodation_e_result_sis")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;

    }
    private boolean interaction_edit_accommodation(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"accommodation_b_edit", getElements("accommodation_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_receptive", getElements("add_lov_receptive")}, //LoV button
                new String[]{"add_i_receptive", getElements("add_i_receptive")}, //external LoV input
                new String[]{"add_lov_receptive2", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "69", // value to search
                "receptive", //name of the data
                where)){
            return false;}
        if (!Functions.getValue(driver, new String[]{"add_i_receptive_description", getElements("add_i_receptive_description")}, // element path
                "receptive_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_contract", getElements("add_lov_contract")}, // b_lov
                new String[]{"add_i_contract", getElements("add_i_contract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "contract", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_i_contract_description", getElements("add_i_contract_description")}, // element path
                "contract_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_hotel", getElements("add_lov_hotel")}, // b_lov
                new String[]{"add_i_hotel", getElements("add_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){
            return false;
        }
        if (!Functions.getValue(driver, new String[]{"add_i_hotel_description", getElements("add_i_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_room", getElements("add_lov_atlas_room")}, // b_lov
                new String[]{"add_i_atlas_room", getElements("add_i_atlas_room")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_room", //Data name
                where)){
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_characteristics", getElements("add_lov_atlas_characteristics")}, // b_lov
                new String[]{"add_i_atlas_characteristics", getElements("add_i_atlas_characteristics")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_characteristics", //Data name
                where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_disney_hotel", getElements("add_i_disney_hotel")}, // element path
                "disney_hotel", getData("disney_hotel_edit"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_disney_room", getElements("add_i_disney_room")}, // element path
                "disney_room", getData("disney_room_edit"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_package_code", getElements("add_i_package_code")}, // element path
                "package_code", getData("package_code_edit"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_calendar_order", getElements("add_i_calendar_order")}, // element path
                "calendar_order", getData("calendar_order_edit"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_contract_type", getElements("add_i_contract_type")}, // element path
                "contract_type", getData("contract_type_edit"), where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)){
            return false;
        }
        return true;
    }
    private boolean qbe_accommodation(TestDriver driver) {

        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";

        if (!Functions.clickQbE(driver,
                new String[]{"accommodation_b_qbe", getElements("accommodation_b_qbe")},// query button
                new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")},
                "receptive", getData("receptive"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "receptive_description", getData("receptive_description"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contract", getElements("qbe_i_contract")},
                "contract", getData("contract"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description2", getElements("qbe_i_description2")},
                "contract_description", getData("contract_description"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description3", getElements("qbe_i_description3")},
                "hotel_description", getData("hotel_description"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_room", getElements("qbe_i_atlas_room")},
                "atlas_room", getData("atlas_room"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_characteristics", getElements("qbe_i_atlas_characteristics")},
                "atlas_characteristics", getData("atlas_characteristics"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_disney_room", getElements("qbe_i_disney_room")},
                "disney_room", getData("disney_room"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_disney_hotel", getElements("qbe_i_disney_hotel")},
                "disney_hotel", getData("disney_hotel"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_package_code", getElements("qbe_i_package_code")},
                "package_code", getData("package_code"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_calendar_order", getElements("qbe_i_calendar_order")},
                "calendar_order", getData("calendar_order"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contract_type", getElements("qbe_i_contract_type")},
                "contract_type", getData("contract_type"), where)){
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")}, //search button
                new String[]{"accommodation_e_result", getElements("accommodation_e_result")}, //result element
                where)){
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
                where)){
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"accommodation_b_detach", getElements("accommodation_b_detach")}, //detach button
                true,     //screenshot??
                where)){
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
                where)){
            return false;
        }
        return true;
    }
}
