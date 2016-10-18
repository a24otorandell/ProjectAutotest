package screen.AT2ACCSU0073;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.apache.bcel.generic.I2F;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.w3c.dom.ranges.RangeException;

/**
 * Created by vsolis on 06/10/2016.
 */
public class AT2ACCSU0073Test {
    protected AT2ACCSU0073Locators locators;
    protected AT2ACCSU0073Data data;

    public AT2ACCSU0073Test() {

    }

    public AT2ACCSU0073Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0073Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0073Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0073Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("OM Traker Maintenance 2.0");
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

        if(!Reason(driver)){
            return false;
        }

        if(!Subreason(driver)){
            return false;
        }

        if(!Reason_department(driver)){
            return false;
        }


        if(!Add_subreason_department(driver)){
            return false;
        }

        if(!Search_subreason_deparment(driver)){
            return false;
        }
        if(!Edit_reason(driver)){
            return false;
        }

        if(!Search_edit_reason(driver)){
            return false;
        }
        if(!Add_reason(driver)){
            return false;
        }
        if(!Edit_reason_department(driver)){
            return false;
        }

        if(!Search_edit_reason_department(driver)){
            return false;
        }

        if(!Edit_subreason_department(driver)){
            return false;
        }
        if(!Search_subreason_deparment(driver)){
            return false;
        }

        if(!Other_actions_subreason_department(driver)){
            return false;
        }

        return false;
    }


    //REASON-DEPARTMENT2

    private boolean Other_actions_subreason_department (TestDriver driver){
        if(!Functions.detachTable(driver,
                new String[]{"subreason_department_oa_b_detach",getElements("subreason_department_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }

    private boolean Edit_subreason_department (TestDriver driver){
        driver.getReport().addHeader("EDIT IN SUBREASON DEPARTMENT",3,false);

        Functions.break_time(driver,3,500);

        if(!Functions.simpleClick(driver,
                new String[]{"reason_se_e_secod_result",getElements("reason_se_e_secod_result")}, //element to click
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,3,500);
        if(!Functions.checkClick(driver,
                new String[]{"subreason_department_ed_b_edit",getElements("subreason_department_ed_b_edit")}, //element to click
                new String[]{"subreason_department_ed_lov_reason_code",getElements("subreason_department_ed_lov_reason_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }

        if(!Functions.createLovByValue(driver,
                new String[]{"subreason_department_ed_lov_reason_code",getElements("subreason_department_ed_lov_reason_code")}, //LoV button
                new String[]{"subreason_department_ed_i_reason_code",getElements("subreason_department_ed_i_reason_code")}, //external LoV input
                new String[]{"subreason_department_ed_lov_reason_code_i_code",getElements("subreason_department_ed_lov_reason_code_i_code")}, //internal LoV input
                data.getData().get("reason_code"), // value to search
                "reason_code_sub", //name of the data
                " on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"subreason_department_ed_b_save",getElements("subreason_department_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Search_subreason_deparment (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN SUBREASON",3,false);
        if(!Functions.simpleClick(driver,
                new String[]{"reason_se_e_first_result",getElements("reason_se_e_first_result")}, //element to click
                " on EDIT")){
            return false;
        }
        if(!Functions.clickQbE(driver,
                new String[]{"subreason_department_se_b_qbe",getElements("subreason_department_se_b_qbe")},// query button
                new String[]{"subreason_department_se_i_reason_code",getElements("subreason_department_se_i_reason_code")},//any query input
                " on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_department_se_i_reason_code",getElements("subreason_department_se_i_reason_code")},
                "se_reason_code",data.getData().get("department_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_department_se_i_department_code",getElements("subreason_department_se_i_department_code")},
                "se_department_code",data.getData().get("reason_code")," on SEARCH")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"subreason_department_se_i_reason_code",getElements("subreason_department_se_i_reason_code")}, //any query input
                new String[]{"subreason_department_e_result",getElements("subreason_department_e_result")}, //table result
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Add_subreason_department (TestDriver driver){
        driver.getReport().addHeader("ADD IN SUBREASON DEPARTMENT",3,false);

        Functions.break_time(driver,3,500);
        if(!Functions.checkClick(driver,
                new String[]{"subreason_department_add_b_add",getElements("subreason_department_add_b_add")}, //element to click
                new String[]{"subreason_department_add_lov_department_code",getElements("subreason_department_add_lov_department_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"subreason_department_add_lov_department_code",getElements("subreason_department_add_lov_department_code")}, //LoV button
                new String[]{"subreason_department_add_i_department_code",getElements("subreason_department_add_i_department_code")}, //external LoV input
                new String[]{"subreason_department_add_lov_department_code_i_code",getElements("subreason_department_add_lov_department_code_i_code")}, //internal LoV input
                data.getData().get("department_code"), // value to search
                "deparment_code_sub", //name of the data
                " on SEARCH")){
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"subreason_department_add_lov_reason_code",getElements("subreason_department_add_lov_reason_code")}, //LoV button
                new String[]{"subreason_department_add_i_reason_code",getElements("subreason_department_add_i_reason_code")}, //external LoV input
                new String[]{"subreason_department_add_lov_reason_code_i_code",getElements("subreason_department_add_lov_reason_code_i_code")}, //internal LoV input
                data.getData().get("reason_code"), // value to search
                "reason_code_sub", //name of the data
                " on SEARCH")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"subreason_department_add_b_save",getElements("subreason_department_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }


    //Reason Department

    private boolean Reason_department (TestDriver driver){

        if(!Add_reason_department(driver)){
            return false;
        }

        if(!Search_reason_deparment(driver)){
            return false;
        }

        if(!Other_actions_reason_department(driver)){
            return false;
        }
        return true;
    }

    private boolean Other_actions_reason_department (TestDriver driver){
        driver.getReport().addHeader("OTHER ACTIONS IN REASON DEPARTMENT",3,false);


   /*     if(!Functions.auditData(driver,
                new String[]{"reason_department_oa_b_actions",getElements("reason_department_oa_b_actions")}, //actions button
                new String[]{"reason_department_oa_b_actions_b_data_history",getElements("reason_department_oa_b_actions_b_data_history")}, //audit button
                new String[]{"reason_department_oa_b_actions_b_data_history_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }*/

        if(!Functions.detachTable(driver,
                new String[]{"reason_department_oa_b_detach",getElements("reason_department_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }

    private boolean Search_edit_reason_department (TestDriver driver){
        driver.getReport().addHeader("SEARCH IN REASON DEPARTMENT",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"reason_department_se_b_qbe",getElements("reason_department_se_b_qbe")},// query button
                new String[]{"reason_department_se_i_department_code",getElements("reason_department_se_i_department_code")},//any query input
                " on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_department_se_i_department_code",getElements("reason_department_se_i_department_code")},
                "se_reason_code",data.getData().get("department_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_department_se_i_description",getElements("reason_department_se_i_description")},
                "se_description",data.getData().get("department_description")," on SEARCH")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"reason_department_se_ch_visible",getElements("reason_department_se_ch_visible")},
                "No","se_visible"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"reason_department_se_i_department_code",getElements("reason_department_se_i_department_code")}, //any query input
                new String[]{"reason_department_se_e_result",getElements("reason_department_se_e_result")}, //table result
                " on SEARCH")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"reason_department_se_e_result",getElements("reason_department_se_e_result")}, //element to click
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Edit_reason_department (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN REASON DEPARTMENT",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"reason_department_ed_b_edit",getElements("reason_department_ed_b_edit")}, //element to click
                new String[]{"reason_department_ed_i_department_code",getElements("reason_department_ed_i_department_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_department_ed_i_description",getElements("reason_department_ed_i_description")},
                "department_description",DataGenerator.getRandomAlphanumericSequence(8,true)," on EDIT")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("reason_department_ed_ch_visible"),"visible",false,true," on EDIT")){
            return false;
        }//where

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"reason_department_ed_b_save",getElements("reason_department_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Search_reason_deparment (TestDriver driver){
        driver.getReport().addHeader("SEARCH IN REASON DEPARTMENT",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"reason_department_se_b_qbe",getElements("reason_department_se_b_qbe")},// query button
                new String[]{"reason_department_se_i_department_code",getElements("reason_department_se_i_department_code")},//any query input
                " on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_department_se_i_department_code",getElements("reason_department_se_i_department_code")},
                "department_code",data.getData().get("department_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_department_se_i_description",getElements("reason_department_se_i_description")},
                "department_description",data.getData().get("department_description")," on SEARCH")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"reason_department_se_ch_visible",getElements("reason_department_se_ch_visible")},
                "Yes","se_visible"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"reason_department_se_i_department_code",getElements("reason_department_se_i_department_code")}, //any query input
                new String[]{"reason_department_se_e_result",getElements("reason_department_se_e_result")}, //table result
                " on SEARCH")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"reason_department_se_e_result",getElements("reason_department_se_e_result")}, //element to click
                " on SEARCH")){
            return false;
        }


        return true;
    }

    private boolean Add_reason_department (TestDriver driver){
        driver.getReport().addHeader("ADD IN REASON DEPARTMENT",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"reason_department_add_b_add",getElements("reason_department_add_b_add")}, //element to click
                new String[]{"reason_department_add_i_department_code",getElements("reason_department_add_i_department_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"reason_department_add_i_department_code",getElements("reason_department_add_i_department_code")},
                "department_code",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_department_add_i_description",getElements("reason_department_add_i_description")},
                "department_description",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("reason_department_add_ch_visible"),"visible",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"reason_department_add_b_save",getElements("reason_department_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    //Subreason Table

    private boolean Subreason (TestDriver driver){

        if(!Add_subreason(driver)){
            return false;
        }

        if(!Search_subreason(driver)){
            return false;
        }

        if(!Edit_subreason(driver)){
            return false;
        }

        if(!Search_edit_subreason(driver)){
            return false;
        }

        if(!Other_actions_subreason(driver)){
            return false;
        }
        return true;
    }

    private boolean Other_actions_subreason (TestDriver driver){


        driver.getReport().addHeader("OTHER ACTIONS IN SUBREASON",3,false);


    /*    if(!Functions.auditData(driver,
                new String[]{"subreason_oa_b_actions",getElements("subreason_oa_b_actions")}, //actions button
                new String[]{"subreason_oa_b_actions_b_data_history",getElements("subreason_oa_b_actions_b_data_history")}, //audit button
                new String[]{"subreason_oa_b_actions_b_data_history_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }*/

        if(!Functions.detachTable(driver,
                new String[]{"subreason_oa_b_detach",getElements("subreason_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }


        return true;
    }

    private boolean Search_edit_subreason (TestDriver driver){

        if(!Functions.clickQbE(driver,
                new String[]{"subreason_se_b_qbe",getElements("subreason_se_b_qbe")},// query button
                new String[]{"subreason_se_i_subreason_code",getElements("subreason_se_i_subreason_code")},//any query input
                " on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_se_i_subreason_code",getElements("subreason_se_i_subreason_code")},
                "se_reason_code",data.getData().get("subreason_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_se_i_description",getElements("subreason_se_i_description")},
                "se_description",data.getData().get("sub_description")," on SEARCH")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"subreason_se_ch_visible",getElements("subreason_se_ch_visible")},
                "No","se_visible"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"subreason_se_i_subreason_code",getElements("subreason_se_i_subreason_code")}, //any query input
                new String[]{"reason_se_e_first_result",getElements("reason_se_e_first_result")}, //table result
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Edit_subreason (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN SUBREASON",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"subreason_ed_b_edit",getElements("subreason_ed_b_edit")}, //element to click
                new String[]{"subreason_ed_i_subreason_code",getElements("subreason_ed_i_subreason_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_ed_i_description",getElements("subreason_ed_i_description")},
                "sub_description",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("subreason_ed_ch_visible"),"visible",false,true," on ADD")){
            return false;
        }//where

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"subreason_ed_b_save",getElements("subreason_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    private boolean Search_subreason (TestDriver driver){

        driver.getReport().addHeader(" SEARCH IN SUBREASON",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"subreason_se_b_qbe",getElements("subreason_se_b_qbe")},// query button
                new String[]{"subreason_se_i_subreason_code",getElements("subreason_se_i_subreason_code")},//any query input
                " on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_se_i_subreason_code",getElements("subreason_se_i_subreason_code")},
                "se_reason_code",data.getData().get("subreason_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_se_i_description",getElements("subreason_se_i_description")},
                "se_description",data.getData().get("sub_description")," on SEARCH")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"subreason_se_ch_visible",getElements("subreason_se_ch_visible")},
                "Yes","se_visible"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"subreason_se_i_subreason_code",getElements("subreason_se_i_subreason_code")}, //any query input
                new String[]{"subreason_se_e_result",getElements("subreason_se_e_result")}, //table result
                " on SEARCH")){
            return false;
        }

        return true;
    }

    private boolean Add_subreason (TestDriver driver){

        driver.getReport().addHeader(" ADD IN SUBREASON",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"subreason_add_b_add",getElements("subreason_add_b_add")}, //element to click
                new String[]{"subreason_add_i_subreason_code",getElements("subreason_add_i_subreason_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"subreason_add_i_subreason_code",getElements("subreason_add_i_subreason_code")},
                "subreason_code",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"subreason_add_i_description",getElements("subreason_add_i_description")},
                "sub_description",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("subreason_add_ch_visible"),"visible",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"subreason_add_b_save",getElements("subreason_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }


        return true;
    }


    //Reason Table
    private boolean Reason (TestDriver driver){

        if(!Add_reason(driver)){
            return false;
        }

        if(!Search_reason(driver)){
            return false;
        }

        if(!Other_actions_reason(driver)){
            return false;
        }

        return true;
    }

    private boolean Other_actions_reason (TestDriver driver){

        driver.getReport().addHeader("OTHER ACTIONS IN REASON",3,false);


   /*     if(!Functions.auditData(driver,
                new String[]{"reason_oa_b_actions",getElements("reason_oa_b_actions")}, //actions button
                new String[]{"reason_oa_b_actions_b_data_history",getElements("reason_oa_b_actions_b_data_history")}, //audit button
                new String[]{"reason_oa_b_actions_b_data_history_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }*/

        if(!Functions.detachTable(driver,
                new String[]{"reason_oa_b_detach",getElements("reason_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }

    private boolean Search_edit_reason (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN REASON",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"reset",getElements("reset")}, //element to click
                " on  SEARCH")){
            return false;
        }
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"search",getElements("search")}, //search button
                new String[]{"reason_se_e_first_result",getElements("reason_se_e_first_result")}, //result element
                " on SEARCH")){
            return false;
        }


        if(!Functions.clickQbE(driver,
                new String[]{"reason_se_b_qbe",getElements("reason_se_b_qbe")},// query button
                new String[]{"reason_se_i_reason_code",getElements("reason_se_i_reason_code")},//any query input
                " on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_se_i_reason_code",getElements("reason_se_i_reason_code")},
                "se_reason_code",data.getData().get("reason_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_se_i_description",getElements("reason_se_i_description")},
                "se_description",data.getData().get("description")," on SEARCH")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"reason_se_sl_visible",getElements("reason_se_sl_visible")},
                "No","se_visible"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"reason_se_i_reason_code",getElements("reason_se_i_reason_code")}, //any query input
                new String[]{"reason_se_e_first_result",getElements("reason_se_e_first_result")}, //table result
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Edit_reason (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN REASON",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"reason_ed_b_edit",getElements("reason_ed_b_edit")}, //element to click
                new String[]{"reason_ed_i_reason_code",getElements("reason_ed_i_reason_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"reason_ed_i_description",getElements("reason_ed_i_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(8,true)," on EDIT")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("reason_ed_ch_visible"),"visible",false,true," on EDIT")){
            return false;
        }//where

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"reasonr_ed_b_save",getElements("reasonr_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Search_reason (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN REASON",3,false);

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"search",getElements("search")}, //search button
                new String[]{"reason_se_e_first_result",getElements("reason_se_e_first_result")}, //result element
                " on SEARCH")){
            return false;
        }


        if(!Functions.clickQbE(driver,
                new String[]{"reason_se_b_qbe",getElements("reason_se_b_qbe")},// query button
                new String[]{"reason_se_i_reason_code",getElements("reason_se_i_reason_code")},//any query input
                " on SEARCH")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"reset",getElements("reset")}, //element to click
                " on  SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"reason_se_i_reason_code",getElements("reason_se_i_reason_code")},
                "se_reason_code",data.getData().get("reason_code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_se_i_description",getElements("reason_se_i_description")},
                "se_description",data.getData().get("description")," on SEARCH")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"reason_se_sl_visible",getElements("reason_se_sl_visible")},
                "Yes","se_visible"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"reason_se_i_reason_code",getElements("reason_se_i_reason_code")}, //any query input
                new String[]{"reason_se_e_first_result",getElements("reason_se_e_first_result")}, //table result
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Add_reason (TestDriver driver){


        driver.getReport().addHeader(" ADD IN REASON",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"only_visible",getElements("only_visible")}, //element to click
                " on ADD")){
            return false;
        }

        if(!Functions.checkClick(driver,
                new String[]{"reason_add_b_add",getElements("reason_add_b_add")}, //element to click
                new String[]{"reason_add_i_reason_code",getElements("reason_add_i_reason_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"reason_add_i_reason_code",getElements("reason_add_i_reason_code")},
                "reason_code",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"reason_add_i_description",getElements("reason_add_i_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("reason_add_ch_visible"),"visible",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"reason_add_b_save",getElements("reason_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }

        return true;

    }

}
