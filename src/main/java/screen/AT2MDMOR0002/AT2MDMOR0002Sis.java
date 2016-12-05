package screen.AT2MDMOR0002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 28/10/2016.
 */
public class AT2MDMOR0002Sis {
    protected AT2MDMOR0002Locators locators;
    protected AT2MDMOR0002Data data;
    public AT2MDMOR0002Sis() {
    }
    public AT2MDMOR0002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0002Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0002Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Booking Types");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_booking(driver, true)) return false;
        if (!search_booking(driver)) return false;
        if (!interaction_edit_booking(driver, false)) return false;
        if (!qbe_booking(driver)) return false;
        if (!others_actions_booking(driver)) return false;
        if (!interaction_record_booking_des(driver)) return false;
        if (!qbe_booking_des(driver)) return false;
        if (!interaction_edit_booking_des(driver)) return false;
        if (!qbe_booking_des(driver)) return false;
        if (!others_actions_booking_des(driver)) return false;
        if (!delete_booking_des(driver)) return false;
        if (!delete_booking(driver)) return false;
        return true;
    }

    private boolean interaction_record_booking(TestDriver driver, boolean check) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"booking_b_add", getElements("booking_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_booking_type",getElements("add_i_booking_type")},
                "type", DataGenerator.getRandomAlphanumericSequence(2,true), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_groups"),"group",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_internet"),"internet",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_retailer"),"retailer",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_circuits"),"circuits",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_lates"), "lates",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_island"),"island",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_visible"),"visible",check, true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_booking(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_booking_type",getElements("search_i_booking_type")},
                "type", getData("type"), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_groups"), "group", true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_internet"), "internet", true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_retailer"), "retailer", true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_circuits"), "circuits", true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_lates"), "lates", true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_island"), "islands", true, where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_visible"), "visible", true, where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"booking_e_result", getElements("booking_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_booking(TestDriver driver, boolean check) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDIT";
        if (!Functions.checkClick(driver,
                new String[]{"booking_b_edit", getElements("booking_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_booking_type",getElements("add_i_booking_type")},
                "type", DataGenerator.getRandomAlphanumericSequence(2,true), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_groups"),"group",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_internet"),"internet",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_retailer"),"retailer",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_circuits"),"circuits",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_lates"), "lates",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_island"),"island",check, true, where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_visible"),"visible",check, true, where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    public boolean qbe_booking (TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"booking_e_result", getElements("booking_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"booking_b_qbe", getElements("booking_b_qbe")},// query button
                new String[]{"qbe_i_booking_type", getElements("qbe_i_booking_type")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_type", getElements("qbe_i_booking_type")},
                "type", getData("type"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_groups", getElements("qbe_sl_groups")},
                getData("group"), "group", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_internet", getElements("qbe_sl_internet")},
                getData("internet"), "internet", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_retailer", getElements("qbe_sl_retailer")},
                getData("retailer"), "retailer", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_circuits", getElements("qbe_sl_circuits")},
                getData("circuits"), "circuits", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_lates", getElements("qbe_sl_lates")},
                getData("lates"), "lates", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_island", getElements("qbe_sl_island")},
                getData("island"), "island", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_visible", getElements("qbe_sl_visible")},
                getData("visible"), "visible", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_booking_type", getElements("qbe_i_booking_type")}, //any query input
                new String[]{"booking_e_result", getElements("booking_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_booking(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"booking_b_actions", getElements("booking_b_actions")}, //actions button
                new String[]{"booking_b_actions_b_audit_data", getElements("booking_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"booking_b_detach", getElements("booking_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean delete_booking(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"booking_b_delete", getElements("booking_b_delete")},
                new String[]{"booking_e_records", getElements("booking_e_records")},
                where)){
            return false;
        }
        return true;
    }

    private boolean interaction_record_booking_des(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"booking_des_b_add", getElements("booking_des_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"desc_add_lov_lang",getElements("desc_add_lov_lang")}, // b_lov
                new String[]{"desc_add_i_lang", getElements("desc_add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"desc_add_i_description", getElements("desc_add_i_description")},
                "des", DataGenerator.getRandomAlphanumericSequence(5,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"desc_add_b_save", getElements("desc_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_booking_des(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDIT";
        if (!Functions.checkClick(driver,
                new String[]{"booking_des_b_edit", getElements("booking_des_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"desc_add_lov_lang",getElements("desc_add_lov_lang")}, // b_lov
                new String[]{"desc_add_i_lang", getElements("desc_add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"desc_add_i_description", getElements("desc_add_i_description")},
                "des", DataGenerator.getRandomAlphanumericSequence(5,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"desc_add_b_save", getElements("desc_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    public boolean qbe_booking_des(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
//        if (!Functions.clickSearchAndResult(driver,
//                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
//                new String[]{"booking_des_b_result", getElements("booking_des_b_result")}, //result element
//                where)) {
//            return false;
//        }
        if (!Functions.clickQbE(driver,
                new String[]{"booking_des_b_qbe", getElements("booking_des_b_qbe")},// query button
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "des", getData("des"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")}, //any query input
                new String[]{"booking_des_b_result", getElements("booking_des_b_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_booking_des(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"booking_des_b_actions", getElements("booking_des_b_actions")}, //actions button
                new String[]{"booking_des_b_actions_b_audit_data", getElements("booking_des_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;
        }

        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"booking_des_b_detach", getElements("booking_des_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean delete_booking_des(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"booking_des_b_delete", getElements("booking_des_b_delete")},
                new String[]{"booking_des_e_records", getElements("booking_des_e_records")},
                where)){
            return false;
        }
        return true;
    }

}
