package screen.AT2ACCSU0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 20/10/2016.
 */
public class AT2ACCSU0005Test {
    protected AT2ACCSU0005Locators locators;
    protected AT2ACCSU0005Data data;

    public AT2ACCSU0005Test (){

    }

    public AT2ACCSU0005Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCSU0005Locators locators){
        this.locators = locators;
    }

    public AT2ACCSU0005Data getData (){
        return data;
    }

    public void setData (AT2ACCSU0005Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Seasons 2.0");
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

        if(!Seasons_maintenance(driver)){
            return false;
        }

        if(!Multi_lenguaje(driver)){
            return false;
        }

        if(!Seasons_maintenance_delete(driver)){
            return false;
        }

        return false;
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

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"multi_lenguaje_ed_b_edit",getElements("multi_lenguaje_ed_b_edit")}, //element to click
                new String[]{"multi_lenguaje_ed_lov_lenguaje_code",getElements("multi_lenguaje_ed_lov_lenguaje_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
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
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_season_description",getElements("multi_lenguaje_se_i_season_description")},
                "se_descriptions",data.getData().get("descriptions")," on QBE")){
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
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"multi_lenguaje_add_b_save",getElements("multi_lenguaje_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }


    //SEASONS MAINTENANCE

    private boolean Seasons_maintenance (TestDriver driver){

        if(!Seasons_maintenance_add(driver)){
            return false;
        }

        if(!Seasons_maintenance_search(driver)){
            return false;
        }

        if(!Seasons_maintenance_edit(driver)){
            return false;
        }

        if(!Seasons_maintenance_qbe(driver)){
            return false;
        }

        if(!Seasons_maintenance_other_actions(driver)){
            return false;
        }
        return true;
    }

    private boolean Seasons_maintenance_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN SEASONS MAINTENANCE",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"seasons_maintenance_del_b_delete",getElements("seasons_maintenance_del_b_delete")},
                new String[]{"seasons_maintenance_del_e_records",getElements("seasons_maintenance_del_e_records")},
                new String[]{"seasons_maintenance_del_b_delete_b_ok",getElements("seasons_maintenance_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Seasons_maintenance_other_actions (TestDriver driver){
        driver.getReport().addHeader(" OTHER ACTIONS IN SEASONS MAINTENANCE",3,false);

        if(!Functions.auditData(driver,
                new String[]{"seasons_maintenance_oa_b_actions",getElements("seasons_maintenance_oa_b_actions")}, //actions button
                new String[]{"seasons_maintenance_oa_b_actions_b_audit_data",getElements("seasons_maintenance_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"seasons_maintenance_oa_b_actions_b_audit_data_b_ok",getElements("seasons_maintenance_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"seasons_maintenance_oa_b_detach",getElements("seasons_maintenance_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }


        return true;
    }

    private boolean Seasons_maintenance_qbe (TestDriver driver){

        driver.getReport().addHeader(" QBE IN SEASONS MAINTENANCE",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"seasons_maintenance_se_b_reset",getElements("seasons_maintenance_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickQbE(driver,
                new String[]{"seasons_maintenance_qbe_b_qbe",getElements("seasons_maintenance_qbe_b_qbe")},// query button
                new String[]{"seasons_maintenance_qbe_i_season_code",getElements("seasons_maintenance_qbe_i_season_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_qbe_i_season_code",getElements("seasons_maintenance_qbe_i_season_code")},
                "se_season_code",data.getData().get("season_code")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_qbe_i_date_beginnin_season",getElements("seasons_maintenance_qbe_i_date_beginnin_season")},
                "se_dat_beg",data.getData().get("dat_beg")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_qbe_i_date_to",getElements("seasons_maintenance_qbe_i_date_to")},
                "se_date_to",data.getData().get("date_to")," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"seasons_maintenance_qbe_sl_active",getElements("seasons_maintenance_qbe_sl_active")},
                "Inactive","se_active"," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"seasons_maintenance_qbe_sl_xml",getElements("seasons_maintenance_qbe_sl_xml")},
                "Inactive","se_xml"," on QBE")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"seasons_maintenance_se_i_season_code",getElements("seasons_maintenance_se_i_season_code")}, //search button
                new String[]{"seasons_maintenance_se_e_result",getElements("seasons_maintenance_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        return true;
    }

    private boolean Seasons_maintenance_edit (TestDriver driver){

        driver.getReport().addHeader(" EDIT IN SEASONS MAINTENANCE",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"seasons_maintenance_ed_b_edit",getElements("seasons_maintenance_ed_b_edit")}, //element to click
                new String[]{"seasons_maintenance_ed_i_season_code",getElements("seasons_maintenance_ed_i_season_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_ed_i_date_beginnin_season",getElements("seasons_maintenance_ed_i_date_beginnin_season")},
                "dat_beg",DataGenerator.getRelativeDateToday("dd/MM/yyyy",0,DataGenerator.random(6,5),0),"on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_ed_i_date_to",getElements("seasons_maintenance_ed_i_date_to")},
                "date_to",DataGenerator.getRelativeDateToday("dd/MM/yyyy",0,DataGenerator.random(6,10),0),"on ADD")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("seasons_maintenance_ed_ch_active"),"Active",false,true," on ADD")){
            return false;
        }//where

        if(!Functions.checkboxValue(driver,
                getElements("seasons_maintenance_ed_ch_xml"),"xml",false,true," on ADD")){
            return false;
        }//where

        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"seasons_maintenance_ed_b_save",getElements("seasons_maintenance_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    private boolean Seasons_maintenance_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN SEASONS MAINTENANCE",3,false);

        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_se_i_season_code",getElements("seasons_maintenance_se_i_season_code")},
                "se_season_code",data.getData().get("season_code")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_se_i_date_from",getElements("seasons_maintenance_se_i_date_from")},
                "se_dat_beg",data.getData().get("dat_beg")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_se_i_date_to",getElements("seasons_maintenance_se_i_date_to")},
                "se_date_to",data.getData().get("date_to")," on SEARCH")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"seasons_maintenance_se_sl_active",getElements("seasons_maintenance_se_sl_active")},
                "Active","se_active"," on SEARCH")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"seasons_maintenance_se_sl_xml",getElements("seasons_maintenance_se_sl_xml")},
                "Active","se_xml"," on SEARCH")){
            return false;
        }

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"seasons_maintenance_se_b_search",getElements("seasons_maintenance_se_b_search")}, //search button
                new String[]{"seasons_maintenance_se_e_result",getElements("seasons_maintenance_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }

        return true;
    }

    private boolean Seasons_maintenance_add (TestDriver driver){
        driver.getReport().addHeader(" ADD IN SEASONS MAINTENANCE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"seasons_maintenance_add_b_add",getElements("seasons_maintenance_add_b_add")}, //element to click
                new String[]{"seasons_maintenance_add_i_season_code",getElements("seasons_maintenance_add_i_season_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_add_i_season_code",getElements("seasons_maintenance_add_i_season_code")},
                "season_code",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_add_i_date_beginnin_season",getElements("seasons_maintenance_add_i_date_beginnin_season")},
                "dat_beg",DataGenerator.getRelativeDateToday("dd/MM/yyyy",0,DataGenerator.random(6,5),0),"on ADD")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"seasons_maintenance_add_i_date_to",getElements("seasons_maintenance_add_i_date_to")},
                "date_to",DataGenerator.getRelativeDateToday("dd/MM/yyyy",0,DataGenerator.random(6,10),0),"on ADD")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("seasons_maintenance_add_ch_active"),"Active",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.checkboxValue(driver,
                getElements("seasons_maintenance_add_ch_xml"),"xml",true,true," on ADD")){
            return false;
        }//where

        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"seasons_maintenance_add_b_save",getElements("seasons_maintenance_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }


        return true;
    }

}
