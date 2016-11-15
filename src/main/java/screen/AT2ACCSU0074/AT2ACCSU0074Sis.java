package screen.AT2ACCSU0074;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 31/10/2016.
 */
public class AT2ACCSU0074Sis {
    protected AT2ACCSU0074Locators locators;
    protected AT2ACCSU0074Data data;

    public AT2ACCSU0074Sis (){

    }

    public AT2ACCSU0074Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCSU0074Locators locators){
        this.locators = locators;
    }

    public AT2ACCSU0074Data getData (){
        return data;
    }

    public void setData (AT2ACCSU0074Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Template Descriptions 2.0");
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

        if(!Template_search_add(driver)){
            return false;
        }
        if(!Template_search_search(driver)){
            return false;
        }
        if(!Template_search_edit(driver)){
            return false;
        }

        if(!Template_search_qbe(driver)){
            return false;
        }

        if(!Template_search_other_actions(driver)){
            return false;
        }

        if(!Template_search_delete(driver)){
            return false;
        }

        return false;
    }

    private boolean Template_search_delete (TestDriver driver){

        driver.getReport().addHeader(" DELETE IN TEMPLATE SEARCH ",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"template_descriptions_del_b_delete",getElements("template_descriptions_del_b_delete")},
                new String[]{"template_descriptions_del_e_record",getElements("template_descriptions_del_e_record")},
                new String[]{"template_descriptions_del_b_delete_b_ok",getElements("template_descriptions_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Template_search_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN TEMPLATE SEARCH ",3,false);

        if(!Functions.auditData(driver,
                new String[]{"template_descriptions_oa_b_actions",getElements("template_descriptions_oa_b_actions")}, //actions button
                new String[]{"template_descriptions_oa_b_actions_b_audit_data",getElements("template_descriptions_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"template_descriptions_oa_b_actions_b_audit_data_b_ok",getElements("template_descriptions_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on ONTHER ACTIONS")){
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"template_descriptions_oa_b_detach",getElements("template_descriptions_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }

    private boolean Template_search_qbe (TestDriver driver){

        driver.getReport().addHeader(" QBE IN TEMPLATE SEARCH ",3,false);
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_se_b_reset",getElements("template_descriptions_se_b_reset")}, //element to click
                " on ADD")){
            return false;
        }

        if(!Functions.clickQbE(driver,
                new String[]{"template_descriptions_qbe_b_qbe",getElements("template_descriptions_qbe_b_qbe")},// query button
                new String[]{"template_descriptions_qbe_sl_main",getElements("template_descriptions_qbe_sl_main")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_qbe_sl_main",getElements("template_descriptions_qbe_sl_main")},
                "Yes","main"," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_qbe_i_code",getElements("template_descriptions_qbe_i_code")},
                "code",getData("code")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_qbe_i_lenguage",getElements("template_descriptions_qbe_i_lenguage")},
                "lenguage",getData("leguage")," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_qbe_sl_active",getElements("template_descriptions_qbe_sl_active")},
                "No","active"," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_qbe_i_condition",getElements("template_descriptions_qbe_i_condition")},
                "final_condition",getData("final_condition")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_qbe_i_description",getElements("template_descriptions_qbe_i_description")},
                "final_description",getData("final_description")," on QBE")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"template_descriptions_qbe_i_code",getElements("template_descriptions_qbe_i_code")}, //any query input
                new String[]{"template_descriptions_se_e_result",getElements("template_descriptions_se_e_result")}, //table result
                " on QBE")){
            return false;
        }
        return true;
    }

    private boolean Template_search_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN TEMPLATE SEARCH ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_ed_b_edit",getElements("template_descriptions_ed_b_edit")}, //element to click
                new String[]{"template_descriptions_ed_template_i_code",getElements("template_descriptions_ed_template_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }

        /*Template*/

        if(!Functions.getValue(driver,new String[]{"template_descriptions_ed_template_i_code",getElements("template_descriptions_ed_template_i_code")}, // element path
                "code", // key for data value (the name)
                " on where")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_ed_template_i_description",getElements("template_descriptions_ed_template_i_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(6,true)," on ADD")){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"template_descriptions_ed_template_lov_condition",getElements("template_descriptions_ed_template_lov_condition")}, // b_lov
                new String[]{"template_descriptions_ed_template_i_condition",getElements("template_descriptions_ed_template_i_condition")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "condition_alias", //Data name
                " on ADD")){
            return false;
        }
        String list_options[] = {"!","Yes","No"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"template_descriptions_ed_template_sl_condition",getElements("template_descriptions_ed_template_sl_condition")},
                list_options,"condition"," on EDIT")){
            return false;
        }

     /*   if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_template_i_condition_second",getElements("template_descriptions_add_template_i_condition_second")},
                "text",DataGenerator.getRandomAlphanumericSequence(3,true)," on ADD")){
            return false;
        }*/

        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_ed_template_b_or",getElements("template_descriptions_ed_template_b_or")}, //element to click
                " on ADD")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"template_descriptions_ed_i_result",getElements("template_descriptions_ed_i_result")}, // element path
                "final_condition", // key for data value (the name)
                " on ADD")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_ed_template_sl_active"),"active",false,false," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_ed_template_sl_main"),"main",false,false," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_ed_template_sl_legend"),"legend",false,false," on ADD")){
            return false;
        }//where
        Functions.break_time(driver,8,500);

        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_ed_sl_active_final_text"),"final_text",true,true," on EDIT")){
            return false;
        }//where

        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_ed_final_text_b_add",getElements("template_descriptions_ed_final_text_b_add")}, //element to click
                new String[]{"template_descriptions_ed_e_result_final_text",getElements("template_descriptions_ed_e_result_final_text")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"template_descriptions_ed_final_text_lov_template",getElements("template_descriptions_ed_final_text_lov_template")}, // b_lov
                new String[]{"template_descriptions_ed_final_text_i_template",getElements("template_descriptions_ed_final_text_i_template")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "template", //Data name
                " on EDIT")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_ed_final_text_sl_condition",getElements("template_descriptions_ed_final_text_sl_condition")},
                "vr2 resort","resort"," on where")){
            return false;
        }

        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_ed_final_text_b_add",getElements("template_descriptions_ed_final_text_b_add")}, //element to click
                new String[]{"template_descriptions_ed_e_result_final_text",getElements("template_descriptions_ed_e_result_final_text")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_ed_e_result_final_text",getElements("template_descriptions_ed_e_result_final_text")}, //element to click
                " on ADD")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"template_descriptions_ed_final_text_i_final_description",getElements("template_descriptions_ed_final_text_i_final_description")}, // element path
                "final_description", // key for data value (the name)
                " on ADD")){
            return false;
        }

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"template_descriptions_ed_b_save",getElements("template_descriptions_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }
    private boolean Template_search_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN TEMPLATE SEARCH ",3,false);

        if(!Functions.insertInput(driver,new String[]{"template_descriptions_se_i_code",getElements("template_descriptions_se_i_code")},
                "se_template_code",getData("code")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"template_descriptions_se_i_description",getElements("template_descriptions_se_i_description")},
                "se_template_descriptions",getData("description")," on SEARCH")){
            return false;
        }


        if(!Functions.insertInput(driver,new String[]{"template_descriptions_se_i_condition",getElements("template_descriptions_se_i_condition")},
                "se_template_result",getData("result")," on SEARCH")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"template_descriptions_se_i_text",getElements("template_descriptions_se_i_text")},
                "se_template_text",getData("description_text")," on SEARCH")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_se_ch_active"),"active",true,true," on SEARCH")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_se_ch_main"),"main",true,true," on SEARCH")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_se_ch_legend"),"legend",true,true," on SEARCH")){
            return false;
        }//where
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"template_descriptions_se_b_search",getElements("template_descriptions_se_b_search")}, //search button
                new String[]{"template_descriptions_se_e_result",getElements("template_descriptions_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }
    private boolean Template_search_add (TestDriver driver){
        driver.getReport().addHeader(" ADD IN TEMPLATE SEARCH ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_b_add",getElements("template_descriptions_add_b_add")}, //element to click
                new String[]{"template_descriptions_add_template_i_code",getElements("template_descriptions_add_template_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }

        /*Template*/

        if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_template_i_code",getElements("template_descriptions_add_template_i_code")},
                "code",DataGenerator.getRandomAlphanumericSequence(6,true)," on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_template_i_description",getElements("template_descriptions_add_template_i_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(6,true)," on ADD")){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"template_descriptions_add_template_lov_condition",getElements("template_descriptions_add_template_lov_condition")}, // b_lov
                new String[]{"template_descriptions_add_template_i_condition",getElements("template_descriptions_add_template_i_condition")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "condition_alias", //Data name
                " on ADD")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_add_template_sl_condition",getElements("template_descriptions_add_template_sl_condition")},
                "Yes","condition_option"," on ADD")){
            return false;
        }

     /*   if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_template_i_condition_second",getElements("template_descriptions_add_template_i_condition_second")},
                "text",DataGenerator.getRandomAlphanumericSequence(3,true)," on ADD")){
            return false;
        }*/

        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_template_b_and",getElements("template_descriptions_add_template_b_and")}, //element to click
                " on ADD")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"template_descriptions_add_i_result",getElements("template_descriptions_add_i_result")}, // element path
                "result", // key for data value (the name)
                " on where")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_add_template_sl_active"),"active",true,true," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_add_template_sl_main"),"main",true,true," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("template_descriptions_add_template_sl_legend"),"legend",true,true," on ADD")){
            return false;
        }//where
        Functions.break_time(driver,8,500);
        /*Lenguaje Text*/
        Functions.break_time(driver,8,500);
        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_lenguaje_text_b_add",getElements("template_descriptions_add_lenguaje_text_b_add")}, //element to click
                new String[]{"template_descriptions_add_lenguaje_text_e_lenguajeresult",getElements("template_descriptions_add_lenguaje_text_e_lenguajeresult")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        Functions.break_time(driver,8,500);
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_lenguaje_text_e_lenguajeresult",getElements("template_descriptions_add_lenguaje_text_e_lenguajeresult")}, //element to click
                " on ADD")){
            return false;
        }
        Functions.break_time(driver,8,500);
        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_add_lenguaje_text_sl_lenguaje",getElements("template_descriptions_add_lenguaje_text_sl_lenguaje")},
                "ENG","lenguage"," on ADD")){
            return false;
        }
        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_lenguaje_text_b_add",getElements("template_descriptions_add_lenguaje_text_b_add")}, //element to click
                new String[]{"template_descriptions_add_lenguaje_text_e_lenguajeresult",getElements("template_descriptions_add_lenguaje_text_e_lenguajeresult")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_lenguaje_text_e_lenguajeresult",getElements("template_descriptions_add_lenguaje_text_e_lenguajeresult")}, //element to click
                " on ADD")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_add_lenguaje_text_del_lenguaje",getElements("template_descriptions_add_lenguaje_text_del_lenguaje")},
                "CAT","lenguaje_del"," on ADD")){
            return false;
        }
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"template_descriptions_add_lenguaje_text_b_delete", getElements("template_descriptions_add_lenguaje_text_b_delete")}, //button delete
                new String[]{"template_descriptions_add_lenguaje_text_e_record", getElements("template_descriptions_add_lenguaje_text_e_record")}, // result
                new String[]{"template_descriptions_add_lenguaje_text_b_delete_b_ok", getElements("template_descriptions_add_lenguaje_text_b_delete_b_ok")}, //delete button yes
                " on ADD")){
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"template_descriptions_add_lenguaje_text_b_detach",getElements("template_descriptions_add_lenguaje_text_b_detach")}, //detach button
                true,     //screenshot??
                " on ADD")){
            return false;
        }


        /*Text*/
        Functions.break_time(driver,15,500);
        /*if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_text_i_description_text",getElements("template_descriptions_add_text_i_description_text")},
                "description_text","{7015-TDAOP_4,7015-TDAOP_6_1}"," on ADD")){
            return false;
        }*/

     /*   Functions.break_time(driver,5,500);
        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_text_sl_button",getElements("template_descriptions_add_text_sl_button")}, //element to click
                new String[]{"template_descriptions_add_text_sl_check_box",getElements("template_descriptions_add_text_sl_check_box")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_text_sl_secuencial",getElements("template_descriptions_add_text_sl_secuencial")}, //element to click
                " on ADD")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"template_descriptions_add_text_sl_secuencial",getElements("template_descriptions_add_text_sl_secuencial")},
                "Secuencial {,}","option"," on ADD")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_text_b_add",getElements("template_descriptions_add_text_b_add")}, //element to click
                " on ADD")){
            return false;
        }
        /*Template Preview*/

    /*    if(!Functions.createLov(driver,
                new String[]{"template_descriptions_add_template_preview_lov_hotel_code",getElements("template_descriptions_add_template_preview_lov_hotel_code")}, // b_lov
                new String[]{"template_descriptions_add_template_preview_i_hotel_code",getElements("template_descriptions_add_template_preview_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                " on ADD")){
            return false;
        }
        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_template_preview_b_preview",getElements("template_descriptions_add_template_preview_b_preview")}, //element to click
                new String[]{"template_descriptions_add_template_preview_b_preview_b_ok",getElements("template_descriptions_add_template_preview_b_preview_b_ok")}, //element expected to appear
                120,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_template_preview_b_preview_b_ok",getElements("template_descriptions_add_template_preview_b_preview_b_ok")}, //element to click
                new String[]{"template_descriptions_add_b_save",getElements("template_descriptions_add_b_save")}, //element expected to appear
                120,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }*/
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"template_descriptions_add_b_save",getElements("template_descriptions_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }

        return true;
    }
}
