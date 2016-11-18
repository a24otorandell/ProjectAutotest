package screen.AT2ACCSU1003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by vsolis on 16/11/2016.
 */
public class AT2ACCSU1003Test {
    protected AT2ACCSU1003Locators locators;
    protected AT2ACCSU1003Data data;

    public AT2ACCSU1003Test (){

    }

    public AT2ACCSU1003Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCSU1003Locators locators){
        this.locators = locators;
    }
    public AT2ACCSU1003Data getData (){
        return data;
    }
    public void setData (AT2ACCSU1003Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Establishment types 2.0");
    }
    protected String getElements (String key){
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData (String key){
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){


        if(!Establishment_hotel_data(driver)){
            return false;
        }

        if(!Establishment_hotel_lenguage_data(driver)){
            return false;
        }
        if(!establishment_hotel_data_delete(driver)){
            return false;
        }
        return false;
    }

    //  STABLISHMENT HOTEL DATA
    private boolean Establishment_hotel_data (TestDriver driver){

        if(!establishment_hotel_data_add(driver)){
            return false;
        }
        if(!establishment_hotel_data_search(driver)){
            return false;
        }
        if(!establishment_hotel_data_edit(driver)){
            return false;
        }
        if(!establishment_hotel_data_qbe(driver)){
            return false;
        }
        if(!establishment_hotel_data_other_actions(driver)){
            return false;
        }
        return true;
    }

    private boolean establishment_hotel_data_delete (TestDriver driver){
        String where = " on DELETE";
        driver.getReport().addHeader("DELETE IN ESTABLISHMENT HOTEL DATA",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"establishment_hotel_data_del_b_delete",getElements("establishment_hotel_data_del_b_delete")},
                new String[]{"establishment_hotel_data_del_e_record",getElements("establishment_hotel_data_del_e_record")},
                new String[]{"establishment_hotel_data_del_b_delete_ok",getElements("establishment_hotel_data_del_b_delete_ok")},
                where)){
            return false;
        }
        return true;
    }
    private boolean establishment_hotel_data_other_actions (TestDriver driver){
        String where = " on OTHER ACTIONS";
        driver.getReport().addHeader("OTHER ACTIONS IN ESTABLISHMENT HOTEL DATA",3,false);

        Functions.break_time(driver,25,500);
        if(!Functions.auditData(driver,
                new String[]{"establishment_hotel_data_oa_b_actions",getElements("establishment_hotel_data_oa_b_actions")}, //actions button
                new String[]{"establishment_hotel_data_oa_b_actions_b_audit_data",getElements("establishment_hotel_data_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"establishment_hotel_data_oa_b_actions_b_audit_data_b_ok",getElements("establishment_hotel_data_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                where)){
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"establishment_hotel_data_oa_b_detach",getElements("establishment_hotel_data_oa_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }

        return true;
    }
    private boolean establishment_hotel_data_qbe (TestDriver driver){
        String where = " on QBE";
        driver.getReport().addHeader("QBE IN ESTABLISHMENT HOTEL DATA",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"establishment_hotel_data_se_b_reset",getElements("establishment_hotel_data_se_b_reset")}, //element to click
                where)){
            return false;
        }
        if(!Functions.clickQbE(driver,
                new String[]{"establishment_hotel_data_qbe_b_qbe",getElements("establishment_hotel_data_qbe_b_qbe")},// query button
                new String[]{"establishment_hotel_data_qbe_i_establishment_code",getElements("establishment_hotel_data_qbe_i_establishment_code")},//any query input
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.insertInput(driver,new String[]{"establishment_hotel_data_qbe_i_establishment_code",getElements("establishment_hotel_data_qbe_i_establishment_code")},
                "establishment_code",getData("establishment_code"),where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"establishment_hotel_data_qbe_i_establishment_description",getElements("establishment_hotel_data_qbe_i_establishment_description")},
                "establishment_description",getData("establishment_description"),where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"establishment_hotel_data_qbe_ch_enabled",getElements("establishment_hotel_data_qbe_ch_enabled")},
                getData("enabled"),"enabled",where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"establishment_hotel_data_qbe_i_establishment_code",getElements("establishment_hotel_data_qbe_i_establishment_code")}, //any query input
                new String[]{"establishment_hotel_data_se_e_result",getElements("establishment_hotel_data_se_e_result")}, //table result
                where)){
            return false;
        }


        return true;
    }
    private boolean establishment_hotel_data_edit (TestDriver driver){
        String where = " on EDIT";
        driver.getReport().addHeader("EDIT IN ESTABLISHMENT HOTEL DATA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"establishment_hotel_data_ed_b_edit",getElements("establishment_hotel_data_ed_b_edit")}, //element to click
                new String[]{"establishment_hotel_data_ed_e_establishment_code",getElements("establishment_hotel_data_ed_e_establishment_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.getText(driver,new String[]{"establishment_hotel_data_ed_e_establishment_code",getElements("establishment_hotel_data_ed_e_establishment_code")}, // element path
                "establishment_code", // key for data value (the name)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"establishment_hotel_data_ed_i_establishment_description",getElements("establishment_hotel_data_ed_i_establishment_description")},
                "establishment_description",DataGenerator.getRandomAlphanumericSequence(3,true),where)){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("establishment_hotel_data_ed_ch_enabled"),"enabled",false,true,where)){
            return false;
        }//where

        Functions.checkClickByAbsence(driver,
                new String[]{"establishment_hotel_data_ed_b_save",getElements("establishment_hotel_data_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90,500,
                where);
        return true;
    }
    private boolean establishment_hotel_data_search (TestDriver driver){
        String where = " on SEARCH";
        driver.getReport().addHeader("SEARCH IN ESTABLISHMENT HOTEL DATA",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.createLovByValue(driver,
                new String[]{"establishment_hotel_data_se_lov_establishment_code",getElements("establishment_hotel_data_se_lov_establishment_code")}, //LoV button
                new String[]{"establishment_hotel_data_se_i_establishment_code",getElements("establishment_hotel_data_se_i_establishment_code")}, //external LoV input
                new String[]{"establishment_hotel_data_se_lov_establishment_code_i_code",getElements("establishment_hotel_data_se_lov_establishment_code_i_code")}, //internal LoV input
                getData("establishment_code"), // value to search
                "establishment_code", //name of the data
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"establishment_hotel_data_se_b_search",getElements("establishment_hotel_data_se_b_search")}, //search button
                new String[]{"establishment_hotel_data_se_e_result",getElements("establishment_hotel_data_se_e_result")}, //result element
                where)){
            return false;
        }


        return true;
    }
    private boolean establishment_hotel_data_add (TestDriver driver){

        String where = " on ADD";
        driver.getReport().addHeader("ADD IN ESTABLISHMENT HOTEL DATA",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"establishment_hotel_data_add_b_add",getElements("establishment_hotel_data_add_b_add")}, //element to click
                new String[]{"establishment_hotel_data_add_i_establishment_code",getElements("establishment_hotel_data_add_i_establishment_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"establishment_hotel_data_add_i_establishment_code",getElements("establishment_hotel_data_add_i_establishment_code")},
                "establishment_code",(Integer.toString(DataGenerator.random(5,50))),where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"establishment_hotel_data_add_i_establishment_description",getElements("establishment_hotel_data_add_i_establishment_description")},
                "establishment_description",DataGenerator.getRandomAlphanumericSequence(5,true),where)){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("establishment_hotel_data_add_ch_enabled"),"enabled",true,true,where)){
            return false;
        }//where
        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"establishment_hotel_data_add_b_save",getElements("establishment_hotel_data_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                where)){
            return false;
        }


        return true;
    }


    //ESTABLISHMENT HOTEL LENGUAGE DATA
    private boolean Establishment_hotel_lenguage_data (TestDriver driver){

        if(!Establishment_hotel_lenguage_data_add(driver)){
            return false;
        }
        if(!Establishment_hotel_lenguage_data_search(driver)){
            return false;
        }
        if(!Establishment_hotel_lenguage_data_edit(driver)){
            return false;
        }
        if(!Establishment_hotel_lenguage_data_search(driver)){
            return false;
        }
        if(!Establishment_hotel_lenguage_data_other_actions(driver)){
            return false;
        }
        if(!Establishment_hotel_lenguage_data_delete(driver)){
            return false;
        }
        return true;
    }

    private boolean Establishment_hotel_lenguage_data_delete (TestDriver driver){
        String where = " on DELETE";
        driver.getReport().addHeader("DELETE IN ESTABLISHMENT LENGUAGE DATA",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"establishment_lenguage_data_del_b_delete",getElements("establishment_lenguage_data_del_b_delete")},
                new String[]{"establishment_lenguage_data_del_e_record",getElements("establishment_lenguage_data_del_e_record")},
                new String[]{"establishment_lenguage_data_del_b_delete_ok",getElements("establishment_lenguage_data_del_b_delete_ok")},
                where)){
            return false;
        }
        return true;
    }

    private boolean Establishment_hotel_lenguage_data_other_actions (TestDriver driver){
        String where = " on OTHER ACTIONS";
        driver.getReport().addHeader("OTHER ACTIONS IN ESTABLISHMENT LENGUAGE DATA",3,false);

        Functions.break_time(driver,25,500);
        if(!Functions.auditData(driver,
                new String[]{"establishment_lenguage_data_oa_b_actions",getElements("establishment_lenguage_data_oa_b_actions")}, //actions button
                new String[]{"establishment_lenguage_data_oa_b_actions_audit_data",getElements("establishment_lenguage_data_oa_b_actions_audit_data")}, //audit button
                new String[]{"establishment_lenguage_data_oa_b_actions_audit_data_b_ok",getElements("establishment_lenguage_data_oa_b_actions_audit_data_b_ok")}, //audit_b_ok
                where)){
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"establishment_lenguage_data_oa_b_detach",getElements("establishment_lenguage_data_oa_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }

    private boolean Establishment_hotel_lenguage_data_edit (TestDriver driver){
        String where = " on EDIT";
        driver.getReport().addHeader("EDIT IN ESTABLISHMENT LENGUAGE DATA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"establishment_lenguage_data_ed_b_edit",getElements("establishment_lenguage_data_ed_b_edit")}, //element to click
                new String[]{"establishment_lenguage_data_ed_e_hotel",getElements("establishment_lenguage_data_ed_e_hotel")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.getValue(driver,new String[]{"establishment_lenguage_data_ed_e_hotel",getElements("establishment_lenguage_data_ed_e_hotel")}, // element path
                "establishment_code", // key for data value (the name)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"establishment_lenguage_data_ed_i_establishment_description",getElements("establishment_lenguage_data_ed_i_establishment_description")},
                "establishment_description",DataGenerator.getRandomAlphanumericSequence(3,true),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"establishment_lenguage_data_ed_lov_lenguage",getElements("establishment_lenguage_data_ed_lov_lenguage")}, // b_lov
                new String[]{"establishment_lenguage_data_ed_i_lenguage",getElements("establishment_lenguage_data_ed_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lenguage", //Data name
                where)){
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"establishment_lenguage_data_ed_b_save",getElements("establishment_lenguage_data_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90,500,
                where);
        return true;
    }

    private boolean Establishment_hotel_lenguage_data_search (TestDriver driver){
        String where = " on SEARCH";
        driver.getReport().addHeader("SEARCH IN ESTABLISHMENT LENGUAGE DATA",3,false);
        if(!Functions.clickQbE(driver,
                new String[]{"establishment_lenguage_data_se_b_qbe",getElements("establishment_lenguage_data_se_b_qbe")},// query button
                new String[]{"establishment_lenguage_data_se_i_establishment_code",getElements("establishment_lenguage_data_se_i_establishment_code")},//any query input
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.insertInput(driver,new String[]{"establishment_lenguage_data_se_i_establishment_code",getElements("establishment_lenguage_data_se_i_establishment_code")},
                "establishment_code",getData("establishment_code"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"establishment_lenguage_data_se_i_establishment_description",getElements("establishment_lenguage_data_se_i_establishment_description")},
                "establishment_description",getData("establishment_description"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"establishment_lenguage_data_se_i_lenguage",getElements("establishment_lenguage_data_se_i_lenguage")},
                "lenguage",getData("lenguage"),where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"establishment_lenguage_data_se_i_establishment_code",getElements("establishment_lenguage_data_se_i_establishment_code")}, //any query input
                new String[]{"establishment_lenguage_data_se_e_result",getElements("establishment_lenguage_data_se_e_result")}, //table result
                where)){
            return false;
        }

        return true;
    }

    private boolean Establishment_hotel_lenguage_data_add (TestDriver driver){
        String where = " on ADD";
        driver.getReport().addHeader("ADD IN ESTABLISHMENT LENGUAGE DATA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"establishment_lenguage_data_add_b_add",getElements("establishment_lenguage_data_add_b_add")}, //element to click
                new String[]{"establishment_lenguage_data_add_e_hotel",getElements("establishment_lenguage_data_add_e_hotel")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.getValue(driver,new String[]{"establishment_lenguage_data_add_e_hotel",getElements("establishment_lenguage_data_add_e_hotel")}, // element path
                "establishment_code", // key for data value (the name)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"establishment_lenguage_data_add_i_establishment_description",getElements("establishment_lenguage_data_add_i_establishment_description")},
                "establishment_description",DataGenerator.getRandomAlphanumericSequence(3,true),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"establishment_lenguage_data_add_lov_lenguage",getElements("establishment_lenguage_data_add_lov_lenguage")}, // b_lov
                new String[]{"establishment_lenguage_data_add_i_lenguage",getElements("establishment_lenguage_data_add_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lenguage", //Data name
                where)){
            return false;
        }
        Functions.checkClickByAbsence(driver,
                new String[]{"establishment_lenguage_data_add_b_save",getElements("establishment_lenguage_data_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90,500,
                where);
        return true;
    }
}
