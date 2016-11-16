package screen.AT2ACCSU1002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 09/11/2016.
 *
 * Pantalla con orden de acciones diferentes a las demas debido a ATLAS-51062
 */
public class AT2ACCSU1002Test {

    protected AT2ACCSU1002Locators locators;
    protected AT2ACCSU1002Data data;

    public AT2ACCSU1002Test (){

    }

    public AT2ACCSU1002Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCSU1002Locators locators){
        this.locators = locators;
    }
    public AT2ACCSU1002Data getData (){
        return data;
    }
    public void setData (AT2ACCSU1002Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Category types 2.0");
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
        if(!Hotel_category_search_area(driver)){
            return false;
        }
        if(!Hotel_category_lenguage_data(driver)){
            return false;
        }
        if(!Hotel_category_search_area_delete(driver)){
            return false;
        }
        return false;
    }


    //  HOTEL CATEGORY AND LENGUAGE DATA
    private boolean Hotel_category_lenguage_data (TestDriver driver){
        if(!Hotel_category_lenguage_data_search(driver)){
            return false;
        }
        if(!Hotel_category_lenguage_data_edit(driver)){
            return false;
        }
        if(!Hotel_category_lenguage_data_search(driver)){
            return false;
        }
        if(!Hotel_category_lenguage_data_other_actions(driver)){
            return false;
        }
        if(!Hotel_category_lenguage_data_delete(driver)){
            return false;
        }
        return true;
    }

    private boolean Hotel_category_lenguage_data_delete (TestDriver driver){
        String where = " on DELETE";
        driver.getReport().addHeader("DELETE IN HOTEL CATEGORY LENGUAGE DATA",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_category_lenguage_data_del_b_delete",getElements("hotel_category_lenguage_data_del_b_delete")},
                new String[]{"hotel_category_lenguage_data_del_e_record",getElements("hotel_category_lenguage_data_del_e_record")},
                new String[]{"hotel_category_lenguage_data_del_b_delete_b_ok",getElements("hotel_category_lenguage_data_del_b_delete_b_ok")},
                where)){
            return false;
        }
        return true;
    }
    private boolean Hotel_category_lenguage_data_other_actions (TestDriver driver){
        String where = " on OTHER ACTIONS";
        driver.getReport().addHeader("OTHER ACTIONS IN HOTEL CATEGORY LENGUAGE DATA",3,false);

        if(!Functions.auditData(driver,
                new String[]{"hotel_category_lenguage_data_oa_b_actions",getElements("hotel_category_lenguage_data_oa_b_actions")}, //actions button
                new String[]{"hotel_category_lenguage_data_oa_b_actions_b_audit_data",getElements("hotel_category_lenguage_data_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"hotel_category_lenguage_data_oa_b_actions_b_audit_data_b_ok",getElements("hotel_category_lenguage_data_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                where)){
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"hotel_category_lenguage_data_oa_b_detach",getElements("hotel_category_lenguage_data_oa_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean Hotel_category_lenguage_data_edit (TestDriver driver){
        String where = " on EDIT";
        driver.getReport().addHeader("EDIT IN HOTEL CATEGORY LENGUAGE DATA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_category_lenguage_data_ed_b_edit",getElements("hotel_category_lenguage_data_ed_b_edit")}, //element to click
                new String[]{"hotel_category_lenguage_data_ed_e_category_code",getElements("hotel_category_lenguage_data_ed_e_category_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"hotel_category_lenguage_data_ed_e_category_code",getElements("hotel_category_lenguage_data_ed_e_category_code")}, // element path
                "category_code_lenguage", // key for data value (the name)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_lenguage_data_ed_i_category_description",getElements("hotel_category_lenguage_data_ed_i_category_description")},
                "category_description_lenguage",DataGenerator.getRandomAlphanumericSequence(3,true),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"hotel_category_lenguage_data_ed_lov_lenguage",getElements("hotel_category_lenguage_data_ed_lov_lenguage")}, // b_lov
                new String[]{"hotel_category_lenguage_data_ed_i_lenguage",getElements("hotel_category_lenguage_data_ed_i_lenguage")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lenguage", //Data name
                where)){
            return false;
        }

        Functions.checkClickByAbsence(driver,
                new String[]{"hotel_category_lenguage_data_ed_b_save",getElements("hotel_category_lenguage_data_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear //element expected to disappear
                90,500,
                where);
        return true;
    }
    private boolean Hotel_category_lenguage_data_search (TestDriver driver){
        String where = " on SEARCH";
        driver.getReport().addHeader("SEARCH IN HOTEL CATEGORY LENGUAGE DATA",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"hotel_category_lenguage_data_se_b_qbe",getElements("hotel_category_lenguage_data_se_b_qbe")},// query button
                new String[]{"hotel_category_lenguage_data_se_i_category_code",getElements("hotel_category_lenguage_data_se_i_category_code")},//any query input
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_lenguage_data_se_i_category_code",getElements("hotel_category_lenguage_data_se_i_category_code")},
                "category_code_lenguage",getData("category_code_lenguage"),where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_lenguage_data_se_i_category_descriptions",getElements("hotel_category_lenguage_data_se_i_category_descriptions")},
                "category_description_lenguage",getData("category_description_lenguage"),where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_lenguage_data_se_lenguage",getElements("hotel_category_lenguage_data_se_lenguage")},
                "lenguage",getData("lenguage"),where)){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_category_lenguage_data_se_i_category_code",getElements("hotel_category_lenguage_data_se_i_category_code")}, //any query input
                new String[]{"hotel_category_lenguage_data_se_e_result",getElements("hotel_category_lenguage_data_se_e_result")}, //table result
                where)){
            return false;
        }
        return true;
    }
    private boolean Hotel_category_lenguage_data_add (TestDriver driver){
        String where = " on ADD";
        driver.getReport().addHeader("ADD IN HOTEL CATEGORY LENGUAGE DATA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_category_lenguage_data_add_b_add",getElements("hotel_category_lenguage_data_add_b_add")}, //element to click
                new String[]{"hotel_category_lenguage_data_add_e_category_code",getElements("hotel_category_lenguage_data_add_e_category_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }

        if(!Functions.getValue(driver,new String[]{"hotel_category_lenguage_data_add_e_category_code",getElements("hotel_category_lenguage_data_add_e_category_code")}, // element path
                "category_code_lenguage", // key for data value (the name)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_lenguage_data_add_i_category_description",getElements("hotel_category_lenguage_data_add_i_category_description")},
                "category_description_lenguage",DataGenerator.getRandomAlphanumericSequence(3,true),where)){
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"hotel_category_lenguage_data_add_lov_lenguage",getElements("hotel_category_lenguage_data_add_lov_lenguage")}, //LoV button
                new String[]{"hotel_category_lenguage_data_add_i_lenguage",getElements("hotel_category_lenguage_data_add_i_lenguage")}, //external LoV input
                new String[]{"hotel_category_lenguage_data_add_lov_lenguage_i_cod_idioma",getElements("hotel_category_lenguage_data_add_lov_lenguage_i_cod_idioma")}, //internal LoV input
                "ENG", // value to search
                "lenguage", //name of the data
                where)){
            return false;
        }

        Functions.checkClickByAbsence(driver,
                new String[]{"hotel_category_lenguage_data_add_b_save",getElements("hotel_category_lenguage_data_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90,500,
                where);
        return true;
    }

    //  HOTEL CATEGORY AND SEARCH AREA
    private boolean Hotel_category_search_area (TestDriver driver){
        if(!Hotel_category_search_area_add(driver)){
            return false;
        }
        if(!Hotel_category_lenguage_data_add(driver)){
            return false;
        }
        if(!Hotel_category_search_area_search(driver)){
            return false;
        }
        if(!Hotel_category_search_area_edit(driver)){
            return false;
        }
        if(!Hotel_category_search_area_qbe(driver)){
            return false;
        }
        if(!Hotel_category_search_area_other_actions(driver)){
            return false;
        }

        return true;
    }

    private boolean Hotel_category_search_area_delete (TestDriver driver){

        String where = " on DELETE";
        driver.getReport().addHeader("DELETE IN HOTEL CATEGORY SEARCH AREA",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_category_search_area_del_b_delete",getElements("hotel_category_search_area_del_b_delete")},
                new String[]{"hotel_category_search_area_del_e_record",getElements("hotel_category_search_area_del_e_record")},
                new String[]{"hotel_category_search_area_del_b_delete_ok",getElements("hotel_category_search_area_del_b_delete_ok")},
                where)){
            return false;
        }
        return true;
    }
    private boolean Hotel_category_search_area_other_actions (TestDriver driver){

        String where = " on OTHER ACTIONS";
        driver.getReport().addHeader("OTHER ACTIONS IN HOTEL CATEGORY SEARCH AREA",3,false);

        if(!Functions.auditData(driver,
                new String[]{"hotel_category_search_area_oa_b_actions",getElements("hotel_category_search_area_oa_b_actions")}, //actions button
                new String[]{"hotel_category_search_area_oa_b_actions_b_audit_data",getElements("hotel_category_search_area_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"hotel_category_search_area_oa_b_actions_b_audit_data_b_ok",getElements("hotel_category_search_area_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                where)){
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"hotel_category_search_area_oa_b_detach",getElements("hotel_category_search_area_oa_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }


        return true;
    }
    private boolean Hotel_category_search_area_qbe (TestDriver driver){

        String where = " on QBE";
        driver.getReport().addHeader("QBE IN HOTEL CATEGORY SEARCH AREA",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"hotel_category_search_area_se_b_reset",getElements("hotel_category_search_area_se_b_reset")}, //element to click
                where)){
            return false;
        }
        if(!Functions.clickQbE(driver,
                new String[]{"hotel_category_search_area_qbe_b_qbe",getElements("hotel_category_search_area_qbe_b_qbe")},// query button
                new String[]{"hotel_category_search_area_qbe_i_category_code",getElements("hotel_category_search_area_qbe_i_category_code")},//any query input
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_search_area_qbe_i_category_code",getElements("hotel_category_search_area_qbe_i_category_code")},
                "category_code",getData("category_code"),where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_search_area_qbe_i_category_description",getElements("hotel_category_search_area_qbe_i_category_description")},
                "category_description",getData("category_description"),where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"hotel_category_search_area_qbe_enabledx",getElements("hotel_category_search_area_qbe_enabled")},
                "No","enabled",where)){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_category_search_area_qbe_i_category_code",getElements("hotel_category_search_area_qbe_i_category_code")}, //any query input
                new String[]{"hotel_category_search_area_se_e_result",getElements("hotel_category_search_area_se_e_result")}, //table result
                where)){
            return false;
        }

        return true;
    }
    private boolean Hotel_category_search_area_edit (TestDriver driver){

        String where = " on EDIT";
        driver.getReport().addHeader("EDIT IN HOTEL CATEGORY SEARCH AREA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_category_search_area_ed_b_edit",getElements("hotel_category_search_area_ed_b_edit")}, //element to click
                new String[]{"hotel_category_search_area_ed_i_category_code",getElements("hotel_category_search_area_ed_i_category_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,25,500);
        if(!Functions.getText(driver,new String[]{"hotel_category_search_area_ed_i_category_code",getElements("hotel_category_search_area_ed_i_category_code")}, // element path
                "category_code", // key for data value (the name)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_search_area_ed_i_category_description",getElements("hotel_category_search_area_ed_i_category_description")},
                "category_description",DataGenerator.getRandomAlphanumericSequence(3,true),where)){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("hotel_category_search_area_ed_ch_enabled"),"enabled",false,false,where)){
            return false;
        }//where

        Functions.checkClickByAbsence(driver,
                new String[]{"hotel_category_search_area_ed_b_save",getElements("hotel_category_search_area_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90,500,
                where);
        return true;
    }
    private boolean Hotel_category_search_area_search (TestDriver driver){
        String where = " on SEARCH";
        driver.getReport().addHeader("SEARCH IN HOTEL CATEGORY SEARCH AREA",3,false);
        /*if(!Functions.checkClick(driver,
                new String[]{"hotel_category_search_area_se_lov_category_code",getElements("hotel_category_search_area_se_lov_category_code")}, //element to click
                new String[]{"hotel_category_search_area_se_lov_category_code_i_category_code",getElements("hotel_category_search_area_se_lov_category_code_i_category_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }*/
        Functions.break_time(driver,6,500);
        if(!Functions.createLovByValue(driver,
                new String[]{"hotel_category_search_area_se_lov_category_code",getElements("hotel_category_search_area_se_lov_category_code")}, //LoV button
                new String[]{"hotel_category_search_area_se_i_category_code",getElements("hotel_category_search_area_se_i_category_code")}, //external LoV input
                new String[]{"hotel_category_search_area_se_lov_category_code_i_category_code",getElements("hotel_category_search_area_se_lov_category_code_i_category_code")}, //internal LoV input
                getData("category_code"), // value to search
                "category_code", //name of the data
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"hotel_category_search_area_se_b_search",getElements("hotel_category_search_area_se_b_search")}, //search button
                new String[]{"hotel_category_search_area_se_e_result",getElements("hotel_category_search_area_se_e_result")}, //result element
                where)){
            return false;
        }
        return true;
    }
    private boolean Hotel_category_search_area_add (TestDriver driver){

        String where = " on ADD";

        driver.getReport().addHeader("ADD IN HOTEL CATEGORY SEARCH AREA",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_category_search_area_add_b_add",getElements("hotel_category_search_area_add_b_add")}, //element to click
                new String[]{"hotel_category_search_area_add_i_category_code",getElements("hotel_category_search_area_add_i_category_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_search_area_add_i_category_code",getElements("hotel_category_search_area_add_i_category_code")},
                "category_code",(Integer.toString(DataGenerator.random(5,50))),where)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_category_search_area_add_i_category_description",getElements("hotel_category_search_area_add_i_category_description")},
                "category_description",DataGenerator.getRandomAlphanumericSequence(5,true),where)){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("hotel_category_search_area_add_ch_enabled"),"enabled",true,true,where)){
            return false;
        }//where

        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_category_search_area_add_b_save",getElements("hotel_category_search_area_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                where)){
            return false;
        }

        return true;
    }
}
