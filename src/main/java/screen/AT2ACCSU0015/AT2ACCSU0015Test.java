package screen.AT2ACCSU0015;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 07/11/2016.
 */
public class AT2ACCSU0015Test {
    protected AT2ACCSU0015Locators locators;
    protected AT2ACCSU0015Data data;

    public AT2ACCSU0015Test (){

    }
    public AT2ACCSU0015Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCSU0015Locators locators){
        this.locators = locators;
    }
    public AT2ACCSU0015Data getData (){
        return data;
    }
    public void setData (AT2ACCSU0015Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Hotel Chains 2.0");
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
        if(!Hotel_chain_description(driver)){
            return false;
        }
        if(!Cadena_hotel_id(driver)){
            return false;
        }
        if(!hotel_brand(driver)){
            return false;
        }
        if(!Hotel_brand_delete(driver)){
            return false;
        }
        if(!Cadena_hotel_id_delete(driver)){
            return false;
        }
        if(!Hotel_chain_description_delete(driver)){
            return false;
        }

        return true;
    }

    /*HOTEL BRAND*/
    private boolean hotel_brand (TestDriver driver){

        if(!Hotel_brand_add(driver)){
            return false;
        }
        if(!Hotel_brand_search(driver)){
            return false;
        }
        if(!Hotel_brand_edit(driver)){
            return false;
        }
        if(!Hotel_brand_qbe(driver)){
            return false;
        }
        if(!Hotel_brand_other_actions(driver)){
            return false;
        }



        return true;
    }

    private boolean Hotel_brand_qbe (TestDriver driver){
        driver.getReport().addHeader(" QBE IN HOTEL HOTEL BRAND ID",3,false);
        if(!Functions.simpleClick(driver,
                new String[]{"hotel_brand_se_b_reset",getElements("hotel_brand_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }

        if(!Functions.clickQbE(driver,
                new String[]{"hotel_brand_qbe_b_qbe",getElements("hotel_brand_qbe_b_qbe")},// query button
                new String[]{"hotel_brand_qbe_i_brand",getElements("hotel_brand_qbe_i_brand")},//any query input
                " on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_brand_qbe_i_brand",getElements("hotel_brand_qbe_i_brand")},
                "brand",getData("brand"),"on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_brand_qbe_i_user_description",getElements("hotel_brand_qbe_i_user_description")},
                "user_description",getData("user_description"),"on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_brand_qbe_i_brand",getElements("hotel_brand_qbe_i_brand")}, //any query input
                new String[]{"hotel_brand_se_e_result",getElements("hotel_brand_se_e_result")}, //table result
                " on QBE")){
            return false;
        }

        return true;
    }
    private boolean Hotel_brand_delete (TestDriver driver){

        driver.getReport().addHeader(" DELETE IN HOTEL BRAND",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_brand_del_b_delete",getElements("hotel_brand_del_b_delete")},
                new String[]{"hotel_brand_del_e_record",getElements("hotel_brand_del_e_record")},
                new String[]{"hotel_brand_del_b_delete_b_ok",getElements("hotel_brand_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }

        return true;
    }
    private boolean Hotel_brand_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN HOTEL BRAND",3,false);

        if(!Functions.auditData(driver,
                new String[]{"hotel_brand_oa_b_actions",getElements("hotel_brand_oa_b_actions")}, //actions button
                new String[]{"hotel_brand_oa_b_actions_b_audit_data",getElements("hotel_brand_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"hotel_brand_oa_b_actions_b_audit_data_b_ok",getElements("hotel_brand_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"hotel_brand_oa_b_detach",getElements("hotel_brand_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }
    private boolean Hotel_brand_edit (TestDriver driver){

        driver.getReport().addHeader(" EDIT IN HOTEL BRAND",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_brand_ed_b_edit",getElements("hotel_brand_ed_b_edit")}, //element to click
                new String[]{"hotel_brand_ed_i_brand",getElements("hotel_brand_ed_i_brand")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_brand_ed_i_user_description",getElements("hotel_brand_ed_i_user_description")},
                "user_description",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_brand_ed_b_save",getElements("hotel_brand_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }

        return true;
    }
    private boolean Hotel_brand_search (TestDriver driver){

        driver.getReport().addHeader(" SEARCH IN HOTEL BRAND",3,false);

        if(!Functions.insertInput(driver,new String[]{"hotel_brand_se_i_brand",getElements("hotel_brand_se_i_brand")},
                "brand",getData("brand"),"on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_brand_se_i_user_description",getElements("hotel_brand_se_i_user_description")},
                "user_description",getData("user_description"),"on SEARCH")){
            return false;
        }

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"hotel_brand_se_b_search",getElements("hotel_brand_se_b_search")}, //search button
                new String[]{"hotel_brand_se_e_result",getElements("hotel_brand_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }

        return true;
    }
    private boolean Hotel_brand_add (TestDriver driver){
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_brand_add_b_add",getElements("hotel_brand_add_b_add")}, //element to click
                new String[]{"hotel_brand_add_i_brand",getElements("hotel_brand_add_i_brand")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_brand_add_i_brand",getElements("hotel_brand_add_i_brand")},
                "brand",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_brand_add_i_user_description",getElements("hotel_brand_add_i_user_description")},
                "user_description",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_brand_b_save",getElements("hotel_brand_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    /*CADENA HOTEL ID*/
    private boolean Cadena_hotel_id (TestDriver driver){

        if(!Cadena_hotel_id_add(driver)){
            return false;
        }
        if(!Cadena_hotel_id_search(driver)){
            return false;
        }
        if(!Cadena_hotel_id_edit(driver)){
            return false;
        }
        if(!Cadena_hotel_id_search(driver)){
            return false;
        }

        if(!Cadena_hotel_id_other_actions(driver)){
            return false;
        }


        return true;
    }

    private boolean Cadena_hotel_id_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN CADENA HOTEL ID",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"cadena_hotel_description_del_b_delete",getElements("cadena_hotel_description_del_b_delete")},
                new String[]{"cadena_hotel_description_del_e_record",getElements("cadena_hotel_description_del_e_record")},
                new String[]{"cadena_hotel_description_del_b_delete_b_ok",getElements("cadena_hotel_description_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }

        return true;
    }
    private boolean Cadena_hotel_id_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN CADENA HOTEL ID",3,false);

        if(!Functions.auditData(driver,
                new String[]{"cadena_hotel_description_oa_b_actions",getElements("cadena_hotel_description_oa_b_actions")}, //actions button
                new String[]{"cadena_hotel_description_oa_b_actions_audit_data",getElements("cadena_hotel_description_oa_b_actions_audit_data")}, //audit button
                new String[]{"cadena_hotel_description_oa_b_actions_audit_data_b_ok",getElements("cadena_hotel_description_oa_b_actions_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"cadena_hotel_description_oa_b_detach",getElements("cadena_hotel_description_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }
    private boolean Cadena_hotel_id_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN CADENA HOTEL ID",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"cadena_hotel_description_ed_b_edit",getElements("cadena_hotel_description_ed_b_edit")}, //element to click
                new String[]{"cadena_hotel_description_ed_e_code",getElements("cadena_hotel_description_ed_e_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"cadena_hotel_description_ed_e_code",getElements("cadena_hotel_description_ed_e_code")}, // element path
                "code", // key for data value (the name)
                " on EDIT")){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"cadena_hotel_description_ed_lov_lenguage",getElements("cadena_hotel_description_ed_lov_lenguage")}, // b_lov
                new String[]{"cadena_hotel_description_ed_i_lenguage",getElements("cadena_hotel_description_ed_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lenguaje", //Data name
                " on EDIT")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"cadena_hotel_description_ed_i_description",getElements("cadena_hotel_description_ed_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"cadena_hotel_description_ed_b_save",getElements("cadena_hotel_description_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }
    private boolean Cadena_hotel_id_search (TestDriver driver){

        driver.getReport().addHeader(" SEARCH IN CADENA HOTEL ID",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"cadena_hotel_description_se_b_qbe",getElements("cadena_hotel_description_se_b_qbe")},// query button
                new String[]{"cadena_hotel_description_se_i_code",getElements("cadena_hotel_description_se_i_code")},//any query input
                " on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"cadena_hotel_description_se_i_code",getElements("cadena_hotel_description_se_i_code")},
                "code",getData("code"),"on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"cadena_hotel_description_se_i_lenguage",getElements("cadena_hotel_description_se_i_lenguage")},
                "lenguaje",getData("lenguaje"),"on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"cadena_hotel_description_se_i_description",getElements("cadena_hotel_description_se_i_description")},
                "descriptions",getData("descriptions"),"on SEARCH")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"cadena_hotel_description_se_i_code",getElements("cadena_hotel_description_se_i_code")}, //any query input
                new String[]{"cadena_hotel_description_se_e_result",getElements("cadena_hotel_description_se_e_result")}, //table result
                " on SEARCH")){
            return false;
        }

        return true;
    }
    private boolean Cadena_hotel_id_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN CADENA HOTEL ID",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"cadena_hotel_description_add_b_add",getElements("cadena_hotel_description_add_b_add")}, //element to click
                new String[]{"cadena_hotel_description_add_e_code",getElements("cadena_hotel_description_add_e_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"cadena_hotel_description_add_e_code",getElements("cadena_hotel_description_add_e_code")}, // element path
                "code", // key for data value (the name)
                " on ADD")){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"cadena_hotel_description_add_lov_lenguage",getElements("cadena_hotel_description_add_lov_lenguage")}, // b_lov
                new String[]{"cadena_hotel_description_add_i_lenguage",getElements("cadena_hotel_description_add_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lenguaje", //Data name
                " on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"cadena_hotel_description_add_i_description",getElements("cadena_hotel_description_add_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"cadena_hotel_description_add_b_save",getElements("cadena_hotel_description_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    /*HOTEL CHAIN DESCRIPTION*/
    private boolean Hotel_chain_description (TestDriver driver){


        if(!Hotel_chain_description_add(driver)){
            return false;
        }
        if(!Hotel_chain_description_search(driver)){
            return false;
        }
        if(!Hotel_chain_description_edit(driver)){
            return false;
        }
        if(!Hotel_chain_description_qbe(driver)){
            return false;
        }
        if(!Hotel_chain_description_other_actions(driver)){
            return false;
        }


        return true;
    }

    private boolean Hotel_chain_description_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN HOTEL CHAIN DESCRIPTION",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_chain_description_del_b_delete",getElements("hotel_chain_description_del_b_delete")},
                new String[]{"hotel_chain_description_del_e_record",getElements("hotel_chain_description_del_e_record")},
                new String[]{"hotel_chain_description_del_b_delete_b_ok",getElements("hotel_chain_description_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }
    private boolean Hotel_chain_description_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN HOTEL CHAIN DESCRIPTION",3,false);

        if(!Functions.auditData(driver,
                new String[]{"hotel_chain_description_oa_b_action",getElements("hotel_chain_description_oa_b_action")}, //actions button
                new String[]{"hotel_chain_description_oa_b_actions_b_audit_data",getElements("hotel_chain_description_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"hotel_chain_description_oa_b_actions_b_audit_data_b_ok",getElements("hotel_chain_description_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"hotel_chain_description_oa_b_detach",getElements("hotel_chain_description_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }
    private boolean Hotel_chain_description_qbe (TestDriver driver){

        driver.getReport().addHeader(" QBE IN HOTEL CHAIN DESCRIPTION",3,false);
        if(!Functions.simpleClick(driver,
                new String[]{"hotel_chain_description_se_b_reset",getElements("hotel_chain_description_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }

        if(!Functions.clickQbE(driver,
                new String[]{"hotel_chain_description_qbe_b_qbe",getElements("hotel_chain_description_qbe_b_qbe")},// query button
                new String[]{"hotel_chain_description_qbe_i_chain",getElements("hotel_chain_description_qbe_i_chain")},//any query input
                " on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_qbe_i_chain",getElements("hotel_chain_description_qbe_i_chain")},
                "chain",getData("chain"),"on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_qbe_i_description",getElements("hotel_chain_description_qbe_i_description")},
                "descriptions",getData("descriptions"),"on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_chain_description_qbe_i_chain",getElements("hotel_chain_description_qbe_i_chain")}, //any query input
                new String[]{"hotel_chain_description_se_e_result",getElements("hotel_chain_description_se_e_result")}, //table result
                " on QBE")){
            return false;
        }


        return true;
    }
    private boolean Hotel_chain_description_edit (TestDriver driver){

        driver.getReport().addHeader(" EDIT IN HOTEL CHAIN DESCRIPTION",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_chain_description_ed_b_edit",getElements("hotel_chain_description_ed_b_edit")}, //element to click
                new String[]{"hotel_chain_description_ed_i_chain",getElements("hotel_chain_description_ed_i_chain")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_ed_i_chain",getElements("hotel_chain_description_ed_i_chain")},
                "chain",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_ed_i_description",getElements("hotel_chain_description_ed_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_chain_description_ed_b_save",getElements("hotel_chain_description_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }
    private boolean Hotel_chain_description_search (TestDriver driver){

        driver.getReport().addHeader(" SEARCH IN HOTEL CHAIN DESCRIPTION",3,false);

        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_se_i_chain",getElements("hotel_chain_description_se_i_chain")},
                "chain",getData("chain"),"on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_se_i_description",getElements("hotel_chain_description_se_i_description")},
                "descriptions",getData("descriptions"),"on SEARCH")){
            return false;
        }

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"hotel_chain_description_se_b_save",getElements("hotel_chain_description_se_b_save")}, //search button
                new String[]{"hotel_chain_description_se_e_result",getElements("hotel_chain_description_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }


        return true;
    }
    private boolean Hotel_chain_description_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN HOTEL BRAND",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_chain_description_add_b_add",getElements("hotel_chain_description_add_b_add")}, //element to click
                new String[]{"hotel_chain_description_add_i_chain",getElements("hotel_chain_description_add_i_chain")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_add_i_chain",getElements("hotel_chain_description_add_i_chain")},
                "chain",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_chain_description_add_i_description",getElements("hotel_chain_description_add_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_chain_description_add_b_save",getElements("hotel_chain_description_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }
}
