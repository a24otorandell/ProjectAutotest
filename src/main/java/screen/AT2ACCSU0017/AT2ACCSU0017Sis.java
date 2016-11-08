package screen.AT2ACCSU0017;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 08/11/2016.
 */
public class AT2ACCSU0017Sis {
    protected AT2ACCSU0017Locators locators;
    protected AT2ACCSU0017Data data;

    public AT2ACCSU0017Sis (){

    }

    public AT2ACCSU0017Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCSU0017Locators locators){
        this.locators = locators;
    }

    public AT2ACCSU0017Data getData (){
        return data;
    }

    public void setData (AT2ACCSU0017Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Hotel Categorias 2.0");
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

        if(!Hotel_categories(driver)){
            return false;
        }
        if(!Multi_lenguaje(driver)){
            return false;
        }
        if(!Hotel_categories_delete(driver)){
            return false;
        }
        return true;
    }

    //MULTI LENGUAJE

    private boolean Multi_lenguaje (TestDriver driver){

        if(!Multi_lenguaje_add(driver)){
            return true;
        }
        if(!Multi_lenguaje_search(driver)){
            return true;
        }
        if(!Multi_lenguaje_edit(driver)){
            return true;
        }
        if(!Multi_lenguaje_search(driver)){
            return true;
        }
        if(!Multi_lenguaje_other_actions(driver)){
            return true;
        }
        if(!Multi_lenguaje_delete(driver)){
            return true;
        }

        return true;
    }

    private boolean Multi_lenguaje_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN MULTI LENGUAJE",3,false);
        if(!Functions.detachTable(driver,
                new String[]{"multi_lenguaje_oa_b_detach",getElements("multi_lenguaje_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }

    private boolean Multi_lenguaje_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN MULTI LENGUAJE",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"multi_lenguaje_del_b_delete",getElements("multi_lenguaje_del_b_delete")},
                new String[]{"multi_lenguaje_del_e_record",getElements("multi_lenguaje_del_e_record")},
                new String[]{"multi_lenguaje_del_b_delete_b_ok",getElements("multi_lenguaje_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Multi_lenguaje_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN SERVICE AUTORIZATION",3,false);

        Functions.break_time(driver,10,500);
        if(!Functions.checkClick(driver,
                new String[]{"multi_lenguaje_ed_b_edit",getElements("multi_lenguaje_ed_b_edit")}, //element to click
                new String[]{"multi_lenguaje_ed_lov_lenguaje_code",getElements("multi_lenguaje_ed_lov_lenguaje_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,10,500);
        if(!Functions.createLov(driver,
                new String[]{"multi_lenguaje_ed_lov_lenguaje_code",getElements("multi_lenguaje_ed_lov_lenguaje_code")}, // b_lov
                new String[]{"multi_lenguaje_ed_i_lenguaje_code",getElements("multi_lenguaje_ed_i_lenguaje_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on EDIT")){
            return false;
        }  // where the operation occurs
        if(!Functions.getValue(driver,new String[]{"multi_lenguaje_ed_e_lenguaje_code_description",getElements("multi_lenguaje_ed_e_lenguaje_code_description")}, // element path
                "lenguaje_code_desc", // key for data value (the name)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_ed_i_descriptions",getElements("multi_lenguaje_ed_i_descriptions")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_ed_i_short_descriptions",getElements("multi_lenguaje_ed_i_short_descriptions")},
                "short_descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"multi_lenguaje_ed_b_save",getElements("multi_lenguaje_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Multi_lenguaje_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN MULTI LENGUAJE",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"multi_lenguaje_se_b_qbe",getElements("multi_lenguaje_se_b_qbe")},// query button
                new String[]{"multi_lenguaje_se_i_lenguaje_code",getElements("multi_lenguaje_se_i_lenguaje_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_lenguaje_code",getElements("multi_lenguaje_se_i_lenguaje_code")},
                "se_leguaje_code",data.getData().get("leguaje_code")," on QBE")){
            return false;
        }
    /*    if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_lenguaje_description",getElements("multi_lenguaje_se_i_lenguaje_description")},
                "se_leguaje_description",data.getData().get("lenguaje_code_desc")," on QBE")){
            return false;
        }*/
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_season_description",getElements("multi_lenguaje_se_i_season_description")},
                "se_descriptions",data.getData().get("descriptions")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_short_descriptions",getElements("multi_lenguaje_se_i_short_descriptions")},
                "se_short_descriptions",data.getData().get("short_descriptions")," on QBE")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"multi_lenguaje_se_i_lenguaje_code",getElements("multi_lenguaje_se_i_lenguaje_code")}, //search button
                new String[]{"multi_lenguaje_se_e_result",getElements("multi_lenguaje_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        return true;

    }

    private boolean Multi_lenguaje_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN MULTI LENGUAJE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"multi_lenguaje_add_b_add",getElements("multi_lenguaje_add_b_add")}, //element to click
                new String[]{"multi_lenguaje_add_lov_lenguaje_code",getElements("multi_lenguaje_add_lov_lenguaje_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"multi_lenguaje_add_lov_lenguaje_code",getElements("multi_lenguaje_add_lov_lenguaje_code")}, // b_lov
                new String[]{"multi_lenguaje_add_i_lenguaje_code",getElements("multi_lenguaje_add_i_lenguaje_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on ADD")){
            return false;
        }  // where the operation occurs
        if(!Functions.getValue(driver,new String[]{"multi_lenguaje_add_e_lenguaje_code_description",getElements("multi_lenguaje_add_e_lenguaje_code_description")}, // element path
                "lenguaje_code_desc", // key for data value (the name)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_add_i_descriptions",getElements("multi_lenguaje_add_i_descriptions")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_add_i_short_descriptions",getElements("multi_lenguaje_add_i_short_descriptions")},
                "short_descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"multi_lenguaje_add_b_save",getElements("multi_lenguaje_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    /*HOTEL CATEGORIES*/
    private boolean Hotel_categories (TestDriver driver){

        if(!Hotel_categories_add(driver)){
            return false;
        }
        if(!Hotel_categories_search(driver)){
            return false;
        }
        if(!Hotel_categories_edit(driver)){
            return false;
        }
        if(!Hotel_categories_qbe(driver)){
            return false;
        }
        if(!Hotel_categories_other_actions(driver)){
            return false;
        }

        return true;
    }

    private boolean Hotel_categories_delete (TestDriver driver){

        driver.getReport().addHeader(" DELETE IN HOTEL CATEGORIES",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"hotel_categories_del_b_delete",getElements("hotel_categories_del_b_delete")},
                new String[]{"hotel_categories_del_e_record",getElements("hotel_categories_del_e_record")},
                new String[]{"hotel_categories_del_b_delete_b_ok",getElements("hotel_categories_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Hotel_categories_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN HOTEL CATEGORIES",3,false);

        if(!Functions.detachTable(driver,
                new String[]{"hotel_categories_oa_b_actions",getElements("hotel_categories_oa_b_actions")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }

    private boolean Hotel_categories_qbe (TestDriver driver){


        driver.getReport().addHeader(" QBE IN HOTEL CATEGORIES",3,false);
        if(!Functions.simpleClick(driver,
                new String[]{"hotel_categories_se_b_reset",getElements("hotel_categories_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }

        if(!Functions.clickQbE(driver,
                new String[]{"hotel_categories_qbe_b_qbe",getElements("hotel_categories_qbe_b_qbe")},// query button
                new String[]{"hotel_categories_qbe_i_categori",getElements("hotel_categories_qbe_i_categori")},//any query input
                " on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_qbe_i_categori",getElements("hotel_categories_qbe_i_categori")},
                "category",getData("category"),"on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_qbe_i_number",getElements("hotel_categories_qbe_i_number")},
                "number",getData("number"),"on QBE")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"hotel_categories_qbe_sl_active",getElements("hotel_categories_qbe_sl_active")},
                "No","active"," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"hotel_categories_qbe_sl_sws",getElements("hotel_categories_qbe_sl_sws")},
                "No","sws"," on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_qbe_i_category_code",getElements("hotel_categories_qbe_i_category_code")},
                "category_code",getData("category_code"),"on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_qbe_i_establishment_type",getElements("hotel_categories_qbe_i_establishment_type")},
                "establishment_type",getData("establishment_type"),"on QBE")){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_categories_qbe_i_categori",getElements("hotel_categories_qbe_i_categori")}, //any query input
                new String[]{"hotel_categories_se_e_resutl",getElements("hotel_categories_se_e_resutl")}, //table result
                " on QBE")){
            return false;
        }
        return true;
    }

    private boolean Hotel_categories_edit (TestDriver driver){

        driver.getReport().addHeader(" EDIT IN HOTEL CATEGORIES",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_categories_ed_b_edit",getElements("hotel_categories_ed_b_edit")}, //element to click
                new String[]{"hotel_categories_ed_i_catregori",getElements("hotel_categories_ed_i_catregori")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("hotel_categories_ed_ch_active"),"active",false,true," on EDIT")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("hotel_categories_ed_ch_sws"),"sws",false,true," on EDIT")){
            return false;
        }//where

        if(!Functions.createLov(driver,
                new String[]{"hotel_categories_ed_lov_category_code",getElements("hotel_categories_ed_lov_category_code")}, // b_lov
                new String[]{"hotel_categories_ed_i_category_code",getElements("hotel_categories_ed_i_category_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category_code", //Data name
                " on EDIT")){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"hotel_categories_ed_lov_establishment_tyoe",getElements("hotel_categories_ed_lov_establishment_tyoe")}, // b_lov
                new String[]{"hotel_categories_ed_i_establishment_typ",getElements("hotel_categories_ed_i_establishment_typ")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "establishment_type", //Data name
                " on EDIT")){
            return false;
        }

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_categories_ed_b_save",getElements("hotel_categories_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }


        return true;
    }

    private boolean Hotel_categories_search (TestDriver driver){

        driver.getReport().addHeader(" SEARCH IN HOTEL CATEGORIES",3,false);

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_se_i_category",getElements("hotel_categories_se_i_category")},
                "category",getData("category"),"on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_se_i_number",getElements("hotel_categories_se_i_number")},
                "number",getData("number"),"on ADD")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("hotel_categories_se_ch_active"),"active",true,true," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("hotel_categories_se_ch_sws"),"sws",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"hotel_categories_se_b_search",getElements("hotel_categories_se_b_search")}, //search button
                new String[]{"hotel_categories_se_e_resutl",getElements("hotel_categories_se_e_resutl")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Hotel_categories_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN HOTEL CATEGORIES",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"hotel_categories_add_b_add",getElements("hotel_categories_add_b_add")}, //element to click
                new String[]{"hotel_categories_add_i_catregori",getElements("hotel_categories_add_i_catregori")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"hotel_categories_add_i_catregori",getElements("hotel_categories_add_i_catregori")},
                "category",DataGenerator.getRandomAlphanumericSequence(5,true),"on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"hotel_categories_add_i_number",getElements("hotel_categories_add_i_number")},
                "number",(Integer.toString(DataGenerator.random(1,100))),"on ADD")){
            return false;
        }

        if(!Functions.checkboxValue(driver,
                getElements("hotel_categories_add_ch_active"),"active",true,true," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("hotel_categories_add_ch_sws"),"sws",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.createLov(driver,
                new String[]{"hotel_categories_add_lov_category_code",getElements("hotel_categories_add_lov_category_code")}, // b_lov
                new String[]{"hotel_categories_add_i_category_code",getElements("hotel_categories_add_i_category_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category_code", //Data name
                " on ADD")){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"hotel_categories_add_lov_establishment_tyoe",getElements("hotel_categories_add_lov_establishment_tyoe")}, // b_lov
                new String[]{"hotel_categories_add_i_establishment_typ",getElements("hotel_categories_add_i_establishment_typ")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "establishment_type", //Data name
                " on ADD")){
            return false;
        }

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_categories_add_b_save",getElements("hotel_categories_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }

        return true;
    }
}
