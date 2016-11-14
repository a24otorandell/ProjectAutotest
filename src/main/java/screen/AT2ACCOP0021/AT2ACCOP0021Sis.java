package screen.AT2ACCOP0021;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 26/09/2016.
 */

/**
 * Campos harcodeados en la qbe debido a problemas de la pantalla.
 */
public class AT2ACCOP0021Sis {
    protected AT2ACCOP0021Locators locators;
    protected AT2ACCOP0021Data data;

    public AT2ACCOP0021Sis() {

    }
    public AT2ACCOP0021Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCOP0021Locators locators) {
        this.locators = locators;
    }
    public AT2ACCOP0021Data getData() {
        return data;
    }
    public void setData(AT2ACCOP0021Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Operation");
        driver.getTestdetails().setScreen("Payment Service Provider Template Configuration");
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

        if(!Template_management(driver)) return false;
        if(!Go_to_template_mapping_management(driver)) return false;
        if(!Template_mapping_management(driver)) return false;
        if(!Return_template_management(driver)){
            return false;
        }
        if(!Delete_management(driver)){
            return false;
        }
        return false;
    }

    private boolean Return_template_management (TestDriver driver){
        driver.getReport().addHeader("GO TO IN TEMPLATE MANAGEMENT ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"go_to_template_management",getElements("go_to_template_management")}, //element to click
                new String[]{"template_management_del_b_delete",getElements("template_management_del_b_delete")}, //element expected to appear
                " on Go to")){
            return false;
        }

        return true;


    }

    //TEMPLATE MANAGEMENT
    private boolean Template_management(TestDriver driver) {

        if (!Add_management(driver)) {
            return false;
        }

        if (!Search_management(driver)) {
            return false;
        }

        if (!Edit_management(driver)) {
            return false;
        }

        if (!Qbe_management(driver)) {
            return false;
        }

        if (!Other_actions_management(driver)) {
            return false;
        }


        return true;
    }
    private boolean Delete_management(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN TEMPLATE MANAGEMENT ", 3, false);


        if (!Functions.doDeleteNCheck(driver,
                new String[]{"template_management_del_b_delete", getElements("template_management_del_b_delete")},
                new String[]{"template_management_del_e_record", getElements("template_management_del_e_record")},
                new String[]{"template_management_del_b_delete_ok", getElements("template_management_del_b_delete_ok")},
                " on DELETE")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_management(TestDriver driver) {

        driver.getReport().addHeader("OTHER ACTIONS IN TEMPLATE MANAGEMENT ", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"template_management_oa_b_detach", getElements("template_management_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }

        return true;
    }
    private boolean Qbe_management(TestDriver driver) {

        driver.getReport().addHeader("QBE IN TEMPLATE MANAGEMENT ", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"template_management_se_b_reset", getElements("template_management_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"template_management_qbe_b_qbe", getElements("template_management_qbe_b_qbe")},// query button
                new String[]{"template_management_qbe_i_template_code", getElements("template_management_qbe_i_template_code")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_management_qbe_i_template_code", getElements("template_management_qbe_i_template_code")},
                "qbe_code", data.getData().get("code"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_management_qbe_i_template_name", getElements("template_management_qbe_i_template_name")},
                "qbe_name", data.getData().get("name"), " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"template_management_qbe_sl_enabled", getElements("template_management_qbe_sl_enabled")},
                "Yes","qbe_enabled"," on QBE")){
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"template_management_qbe_i_template_name", getElements("template_management_qbe_i_template_name")}, //search button
                new String[]{"template_management_se_e_result", getElements("template_management_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }
        return true;

    }
    private boolean Edit_management(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN TEMPLATE MANAGEMENT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"template_management_ed_b_edit", getElements("template_management_ed_b_edit")}, //element to click
                new String[]{"template_management_ed_i_template_code", getElements("template_management_ed_i_template_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_management_ed_i_template_code", getElements("template_management_ed_i_template_code")},
                "code",DataGenerator.getRandomAlphanumericSequence(4,true)," on EDIT")){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_management_ed_i_template_name", getElements("template_management_ed_i_template_name")},
                "name",DataGenerator.getRandomAlphanumericSequence(6,true)," on EDIT")){
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"template_management_ed_i_template_code", getElements("template_management_ed_i_template_code")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkboxValue(driver,
                getElements("template_management_ed_cb_enabled"),"enabled",true,true," on EDIT")){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"template_management_ed_b_save", getElements("template_management_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on EDIT")) {
            return false;
        }
        return true;
    }
    private boolean Search_management(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN TEMPLATE MANAGEMENT", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"template_management_se_lov_template_code", getElements("template_management_se_lov_template_code")}, //LoV button
                new String[]{"template_management_se_i_template_code", getElements("template_management_se_i_template_code")}, //external LoV input
                new String[]{"template_management_se_lov_template_code_i_template", getElements("template_management_se_lov_template_code_i_template")}, //internal LoV input
                data.getData().get("code"), // value to search
                "se_code", //name of the data
                " on SEARCH")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"template_management_se_sl_enabled", getElements("template_management_se_sl_enabled")},
                "No","se_enabled"," on SEARCH")){
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"template_management_se_b_search", getElements("template_management_se_b_search")}, //search button
                new String[]{"template_management_se_e_result", getElements("template_management_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }


        return true;
    }
    private boolean Add_management(TestDriver driver) {
        driver.getReport().addHeader(" ADD IN TEMPLATE MANAGEMENT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"template_management_add_b_add", getElements("template_management_add_b_add")}, //element to click
                new String[]{"template_management_add_i_template_code", getElements("template_management_add_i_template_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_management_add_i_template_code", getElements("template_management_add_i_template_code")},
                "code",DataGenerator.getRandomAlphanumericSequence(4,true)," on ADD")){
            return false;
        }
        Functions.break_time(driver,7,500);
        if(!Functions.checkboxValue(driver,
                getElements("template_management_add_cb_enabled"),"enabled",false,true," on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_management_add_i_template_name",getElements("template_management_add_i_template_name")},
                "name",DataGenerator.getRandomAlphanumericSequence(6,true)," on ADD")){
            return false;
        }
        Functions.break_time(driver,6,500);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"template_management_add_b_save", getElements("template_management_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }

    //GO TO
    private boolean Go_to_template_mapping_management(TestDriver driver) {


        driver.getReport().addHeader("GO TO IN TEMPLATE MANAGEMENT ", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"go_to_template_mapping_management", getElements("go_to_template_mapping_management")}, //element to click
                new String[]{"template_mapping_add_b_add", getElements("template_mapping_add_b_add")}, //element expected to appear
                " on Go to")) {
            return false;
        }

        return true;
    }

    //TEMPLATE  MAPPING MANAGEMENT
    private boolean Template_mapping_management(TestDriver driver) {

        if(!Add_mapping(driver)) return false;
        if(!Search_mapping(driver)) return false;
        if(!Edit_mapping(driver)) return false;
        if(!Qbe_mapping(driver)) return false;
        if(!Other_actions_mapping(driver)) return false;
        if(!Delete_mapping(driver)) return false;
        return true;
    }
    private boolean Delete_mapping(TestDriver driver) {
        driver.getReport().addHeader("DELETE IN TEMPLATE MAPPING MANAGEMENT ", 3, false);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"template_mapping_del_b_delete", getElements("template_mapping_del_b_delete")},
                new String[]{"template_mapping_del_e_record", getElements("template_mapping_del_e_record")},
                new String[]{"template_mapping_del_b_delete_ok", getElements("template_mapping_del_b_delete_ok")},
                " on DELETE")) {
            return false;
        }
        return true;
    }
    private boolean Other_actions_mapping(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS IN TEMPLATE MAPPING MANAGEMENT ", 3, false);

        if (!Functions.detachTable(driver,
                new String[]{"template_mapping_oa_b_detach", getElements("template_mapping_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")) {
            return false;
        }
        return true;
    }
    private boolean Qbe_mapping(TestDriver driver) {
        driver.getReport().addHeader("QBE IN TEMPLATE MAPPING MANAGEMENT ", 3, false);


        if (!Functions.simpleClick(driver,
                new String[]{"template_mapping_se_b_reset", getElements("template_mapping_se_b_reset")}, //element to click
                " on QBE")) {
            return false;
        }Functions.break_time(driver, 6, 500);
        if (!Functions.clickQbE(driver,
                new String[]{"template_mapping_qbe_b_qbe", getElements("template_mapping_qbe_b_qbe")},// query button
                new String[]{"template_mapping_qbe_i_provider", getElements("template_mapping_qbe_i_provider")},//any query input
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_mapping_qbe_i_provider", getElements("template_mapping_qbe_i_provider")},
                "qbe_provider", "World Pay", " on QBE")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"template_mapping_qbe_i_pc_template_code", getElements("template_mapping_qbe_i_pc_template_code")},
                "qbe_code",data.getData().get("code_mapping")," on QBE")){
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"template_mapping_qbe_i_psp_template_code", getElements("template_mapping_qbe_i_psp_template_code")},
                "qbe_psp_code", data.getData().get("psp_code"), " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_mapping_qbe_i_psp_template_name", getElements("template_mapping_qbe_i_psp_template_name")},
                "qbe_psp_name", data.getData().get("psp_name"), " on QBE")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"template_mapping_qbe_sl_enabled", getElements("template_mapping_qbe_sl_enabled")},
                "No", "qbe_enabled", " on QBE")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if(!Functions.getText(driver,new String[]{"template_mapping_qbe_e_template_name_result",getElements("template_mapping_qbe_e_template_name_result")}, // element path
                "template_name", // key for data value (the name)
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_mapping_qbe_i_template_name",getElements("template_mapping_qbe_i_template_name")},
                "qbe_name",getData("template_name")," on QBE")){
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"template_mapping_qbe_i_psp_template_code", getElements("template_mapping_qbe_i_psp_template_code")}, //search button
                new String[]{"template_mapping_se_e_result", getElements("template_mapping_se_e_result")}, //result element
                " on QBE")) {
            return false;
        }

        return true;
    }
    private boolean Edit_mapping(TestDriver driver) {
        driver.getReport().addHeader(" EDIT IN TEMPLATE MAPPING MANAGEMENT", 3, false);


        if (!Functions.checkClick(driver,
                new String[]{"template_mapping_ed_b_edit", getElements("template_mapping_ed_b_edit")}, //element to click
                new String[]{"template_mapping_ed_lov_pc_template_code", getElements("template_mapping_ed_lov_pc_template_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on EDIT")) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.createLov(driver,
                new String[]{"template_mapping_ed_lov_pc_template_code", getElements("template_mapping_ed_lov_pc_template_code")}, // b_lov
                new String[]{"template_mapping_ed_i_pc_template_code", getElements("template_mapping_ed_i_pc_template_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code_mapping", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"template_mapping_ed_lov_provider", getElements("template_mapping_ed_lov_provider")}, // b_lov
                new String[]{"template_mapping_ed_i_provider", getElements("template_mapping_ed_i_provider")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "provider_mapping", //Data name
                " on EDIT")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"template_mapping_ed_i_psp_template_code", getElements("template_mapping_ed_i_psp_template_code")},
                "psp_code",getData("code")," on EDIT")){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_mapping_ed_i_psp_template_name", getElements("template_mapping_ed_i_psp_template_name")},
                "psp_name",getData("name")," on EDIT")){
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("template_mapping_ed_cb_enabled"), "enabled", false, true, " on EDIT")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"template_mapping_ed_b_save", getElements("template_mapping_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }
    private boolean Search_mapping(TestDriver driver) {

        driver.getReport().addHeader(" SEARCH IN PAYMENT MAPPING MANAGEMENT", 3, false);

        if (!Functions.createLovByValue(driver,
                new String[]{"template_mapping_se_lov_pc_template_code", getElements("template_mapping_se_lov_pc_template_code")}, //LoV button
                new String[]{"template_mapping_se_i_pc_template_code", getElements("template_mapping_se_i_pc_template_code")}, //external LoV input
                new String[]{"template_mapping_se_lov_pc_template_code_i_template", getElements("template_mapping_se_lov_pc_template_code_i_template")}, //internal LoV input
                data.getData().get("code_mapping"), // value to search
                "se_code", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"template_mapping_se_sl_provider", getElements("template_mapping_se_sl_provider")}, //element to click
                new String[]{"template_mapping_se_sl_provider_digital_river", getElements("template_mapping_se_sl_provider_digital_river")}, //element expected to appear
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"template_mapping_se_sl_provider_digital_river", getElements("template_mapping_se_sl_provider_digital_river")}, //element to click
                " on SEARCH")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"template_mapping_se_lov_psp_template_code", getElements("template_mapping_se_lov_psp_template_code")}, //LoV button
                new String[]{"template_mapping_se_i_psp_template_code", getElements("template_mapping_se_i_psp_template_code")}, //external LoV input
                new String[]{"template_mapping_se_lov_psp_template_code_i_template", getElements("template_mapping_se_lov_psp_template_code_i_template")}, //internal LoV input
                data.getData().get("psp_code"), // value to search
                "se_psp_code", //name of the data
                " on SEARCH")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"template_mapping_se_sl_enabled", getElements("template_mapping_se_sl_enabled")},
                "Yes", "se_enabled", " on SEARCH")) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"template_mapping_se_b_search", getElements("template_mapping_se_b_search")}, //search button
                new String[]{"template_mapping_se_e_result", getElements("template_mapping_se_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }

        return true;
    }
    private boolean Add_mapping(TestDriver driver) {

        driver.getReport().addHeader(" ADD IN TEMPLATE MAPPING MANAGEMENT", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"template_mapping_add_b_add", getElements("template_mapping_add_b_add")}, //element to click
                new String[]{"template_mapping_add_lov_pc_template_code", getElements("template_mapping_add_lov_pc_template_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"template_mapping_add_lov_pc_template_code", getElements("template_mapping_add_lov_pc_template_code")}, // b_lov
                new String[]{"template_mapping_add_i_pc_template_code", getElements("template_mapping_add_i_pc_template_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code_mapping", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"template_mapping_add_lov_provider", getElements("template_mapping_add_lov_provider")}, // b_lov
                new String[]{"template_mapping_add_i_provider", getElements("template_mapping_add_i_provider")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "provider_mapping", //Data name
                " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"template_mapping_add_i_psp_template_code", getElements("template_mapping_add_i_psp_template_code")},
                "psp_code",getData("code")," on ADD")){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"template_mapping_add_i_psp_template_name", getElements("template_mapping_add_i_psp_template_name")},
                "psp_name",getData("name")," on ADD")){
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("template_mapping_add_cb_enabled"), "enabled", true, true, " on ADD")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"template_mapping_add_b_save", getElements("template_mapping_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                " on ADD")) {
            return false;
        }


        return true;
    }
}
