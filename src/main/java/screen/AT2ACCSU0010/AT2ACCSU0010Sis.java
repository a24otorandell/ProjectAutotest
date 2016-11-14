package screen.AT2ACCSU0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 04/11/2016.
 */
public class AT2ACCSU0010Sis {
    protected AT2ACCSU0010Locators locators;
    protected AT2ACCSU0010Data data;

    public AT2ACCSU0010Sis (){

    }

    public AT2ACCSU0010Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCSU0010Locators locators){
        this.locators = locators;
    }
    public AT2ACCSU0010Data getData (){
        return data;
    }
    public void setData (AT2ACCSU0010Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Linked Room descriptions 2.0");
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

        if(!Room_characteristics(driver)){
            return false;
        }

        if(!Lenguage_description(driver)){
            return false;
        }

        if(Room_characteristics_delete(driver)){
            return false;
        }
        return true;
    }

  /*LENGUAGE DESCRIPTION*/
    private boolean Lenguage_description (TestDriver driver){


        if(!Lenguage_description_add(driver)){
            return false;
        }

        if(!Lenguage_description_search(driver)){
            return false;
        }

        if(!Lenguage_description_edit(driver)){
            return false;
        }
        if(!Lenguage_description_search(driver)){
            return false;
        }
        if(!Lenguage_description_other_actions(driver)){
            return false;
        }
        if(!Lenguage_description_delete(driver)){
            return false;
        }

        return true;


    }

    private boolean Lenguage_description_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN MULTI LENGUAJE",3,false);

        if(!Functions.auditData(driver,
                new String[]{"lenguage_description_oa_b_actions",getElements("lenguage_description_oa_b_actions")}, //actions button
                new String[]{"lenguage_description_oa_b_actions_b_audit_data",getElements("lenguage_description_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"lenguage_description_oa_b_actions_b_audit_data_b_ok",getElements("lenguage_description_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"lenguage_description_oa_b_detach",getElements("lenguage_description_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }
    private boolean Lenguage_description_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN MULTI LENGUAJE",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"lenguage_description_del_b_delete",getElements("lenguage_description_del_b_delete")},
                new String[]{"lenguage_description_del_e_record",getElements("lenguage_description_del_e_record")},
                new String[]{"lenguage_description_del_b_delete_b_ok",getElements("lenguage_description_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }
    private boolean Lenguage_description_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN SERVICE AUTORIZATION",3,false);

        Functions.break_time(driver,10,500);
        if(!Functions.checkClick(driver,
                new String[]{"lenguage_description_ed_b_edit",getElements("lenguage_description_ed_b_edit")}, //element to click
                new String[]{"lenguage_description_ed_lov_lenguage",getElements("lenguage_description_ed_lov_lenguage")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,10,500);
        if(!Functions.createLov(driver,
                new String[]{"lenguage_description_ed_lov_lenguage",getElements("lenguage_description_ed_lov_lenguage")}, // b_lov
                new String[]{"lenguage_description_ed_i_lenguage",getElements("lenguage_description_ed_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on EDIT")){
            return false;
        }  // where the operation occurs
        if(!Functions.getValue(driver,new String[]{"lenguage_description_ed_e_description",getElements("lenguage_description_ed_e_description")}, // element path
                "lenguaje_code_desc", // key for data value (the name)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"lenguage_description_ed_i_description",getElements("lenguage_description_ed_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"lenguage_description_ed_b_save",getElements("lenguage_description_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }
    private boolean Lenguage_description_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN MULTI LENGUAJE",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"lenguage_description_se_b_qbe",getElements("lenguage_description_se_b_qbe")},// query button
                new String[]{"lenguage_description_se_i_lenguage",getElements("lenguage_description_se_i_lenguage")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"lenguage_description_se_i_lenguage",getElements("lenguage_description_se_i_lenguage")},
                "se_leguaje_code",data.getData().get("leguaje_code")," on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"lenguage_description_se_i_description",getElements("lenguage_description_se_i_description")},
                "se_descriptions",data.getData().get("lenguaje_code_desc")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"lenguage_description_se_e_description",getElements("lenguage_description_se_e_description")},
                "se_descriptions",data.getData().get("descriptions")," on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"lenguage_description_se_i_description",getElements("lenguage_description_se_i_description")}, //search button
                new String[]{"lenguage_description_se_e_result",getElements("lenguage_description_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"lenguage_description_se_e_result",getElements("lenguage_description_se_e_result")}, //element to click
                " on QBE")){
            return false;
        }
        return true;

    }
    private boolean Lenguage_description_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN MULTI LENGUAJE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"lenguage_description_add_b_add",getElements("lenguage_description_add_b_add")}, //element to click
                new String[]{"lenguage_description_add_lov_lenguage",getElements("lenguage_description_add_lov_lenguage")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"lenguage_description_add_lov_lenguage",getElements("lenguage_description_add_lov_lenguage")}, // b_lov
                new String[]{"lenguage_description_add_i_lenguage",getElements("lenguage_description_add_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on ADD")){
            return false;
        }  // where the operation occurs
        if(!Functions.getValue(driver,new String[]{"lenguage_description_add_e_description",getElements("lenguage_description_add_e_description")}, // element path
                "lenguaje_code_desc", // key for data value (the name)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"lenguage_description_add_i_description",getElements("lenguage_description_add_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"lenguage_description_add_b_save",getElements("lenguage_description_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }


    /*ROOM CHARACTERISTICS*/
    private boolean Room_characteristics (TestDriver driver){

        if(!Room_characteristics_add(driver)){
            return false;
        }
        if(!Room_characteristics_search(driver)){
            return false;
        }
        if(!Room_characteristics_edit(driver)){
            return false;
        }
        if(!Room_characteristics_qbe(driver)){
            return false;
        }
        if(!Room_characteristics_other_actions(driver)){
            return false;
        }


        return true;
    }

    private boolean Room_characteristics_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN RATES MAINTENANCE",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"room_characteristics_del_b_delete",getElements("room_characteristics_del_b_delete")},
                new String[]{"room_characteristics_del_e_record",getElements("room_characteristics_del_e_record")},
                new String[]{"room_characteristics_del_b_delete_b_yes",getElements("room_characteristics_del_b_delete_b_yes")},
                " on DELETE")){
            return false;
        }

        return true;
    }
    private boolean Room_characteristics_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN ROOM CHARACTERISTICS",3,false);
        if(!Functions.auditData(driver,
                new String[]{"room_characteristics_oa_b_actions",getElements("room_characteristics_oa_b_actions")}, //actions button
                new String[]{"room_characteristics_oa_b_actions_b_audit_data",getElements("room_characteristics_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"room_characteristics_oa_b_actions_b_audit_data_b_ok",getElements("room_characteristics_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"room_characteristics_oa_b_detach",getElements("room_characteristics_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }
    private boolean Room_characteristics_qbe (TestDriver driver){
        driver.getReport().addHeader(" QBE IN ROOM CHARACTERISTICS",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"room_characteristics_se_b_reset",getElements("room_characteristics_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickQbE(driver,
                new String[]{"room_characteristics_qbe_b_qbe",getElements("room_characteristics_qbe_b_qbe")},// query button
                new String[]{"room_characteristics_qbe_i_code",getElements("room_characteristics_qbe_i_code")},//any query input
                " on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.insertInput(driver,new String[]{"room_characteristics_qbe_i_code",getElements("room_characteristics_qbe_i_code")},
                "code",getData("code"),"on EDIT")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.selectText(driver,
                new String[]{"room_characteristics_qbe_sl_active",getElements("room_characteristics_qbe_sl_active")},
                "No","qbe_active"," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"room_characteristics_qbe_i_code",getElements("room_characteristics_qbe_i_code")}, //any query input
                new String[]{"room_characteristics_se_e_result",getElements("room_characteristics_se_e_result")}, //table result
                " on QBE")){
            return false;
        } // where this operation occurs
        return true;
    }
    private boolean Room_characteristics_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN ROOM CHARACTERISTICS",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"room_characteristics_ed_b_edit",getElements("room_characteristics_ed_b_edit")}, //element to click
                new String[]{"room_characteristics_ed_i_code",getElements("room_characteristics_ed_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkboxValue(driver,
                getElements("room_characteristics_ed_ch_active"),"active",false,true," on EDIT")){
            return false;
        }//where
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"room_characteristics_ed_b_save",getElements("room_characteristics_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }
    private boolean Room_characteristics_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN ROOM CHARACTERISTICS",3,false);

        if(!Functions.insertInput(driver,new String[]{"room_characteristics_se_i_code",getElements("room_characteristics_se_i_code")},
                "code",getData("code"),"on SEARCH")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"room_characteristics_se_sl_active",getElements("room_characteristics_se_sl_active")},
                "Yes","se_active"," on SEARCH")){
            return false;
        }

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"room_characteristics_se_b_search",getElements("room_characteristics_se_b_search")}, //search button
                new String[]{"room_characteristics_se_e_result",getElements("room_characteristics_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }

        return true;
    }
    private boolean Room_characteristics_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN ROOM CHARACTERISTICS",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"room_characteristics_add_b_add",getElements("room_characteristics_add_b_add")}, //element to click
                new String[]{"room_characteristics_add_i_code",getElements("room_characteristics_add_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"room_characteristics_add_i_code",getElements("room_characteristics_add_i_code")},
                "code",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("room_characteristics_add_ch_active"),"active",true,true," on ADD")){
            return false;
        }//where
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"room_characteristics_add_b_save",getElements("room_characteristics_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }

        return true;
    }
}
