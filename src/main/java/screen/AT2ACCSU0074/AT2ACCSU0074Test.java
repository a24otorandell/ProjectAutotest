package screen.AT2ACCSU0074;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 31/10/2016.
 */
public class AT2ACCSU0074Test {
    protected AT2ACCSU0074Locators locators;
    protected AT2ACCSU0074Data data;

    public AT2ACCSU0074Test (){

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
        if(Template_search_search(driver)){
            return false;
        }

        return false;
    }

    private boolean Template_search_search (TestDriver driver){
        driver.getReport().addHeader(" ADD IN TEMPLATE SEARCH ",3,false);

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
                recursiveXPaths.lov_e_result, // lov result
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

       /* if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_template_i_condition_second",getElements("template_descriptions_add_template_i_condition_second")},
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
                new String[]{"template_descriptions_add_lenguaje_text_sl_lenguaje",getElements("template_descriptions_add_lenguaje_text_sl_lenguaje")},
                "ALE","lenguaje"," on ADD")){
            return false;
        }
    /*    if(!Functions.checkClick(driver,
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
        Functions.break_time(driver,10,500);
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
                new String[]{"template_descriptions_add_lenguaje_text_sl_lenguaje",getElements("template_descriptions_add_lenguaje_text_sl_lenguaje")},
                "ALE","lenguaje"," on ADD")){
            return false;
        }*/

        /*Text*/
        Functions.break_time(driver,15,500);
        if(!Functions.insertInput(driver,new String[]{"template_descriptions_add_text_i_description_text",getElements("template_descriptions_add_text_i_description_text")},
                "description_text",DataGenerator.getRandomAlphanumericSequence(7,true)," on ADD")){
            return false;
        }
      /*  if(!Functions.selectText(driver,
                new String[]{"template_descriptions_add_text_sl_secuencial",getElements("template_descriptions_add_text_sl_secuencial")},
                "Secuencial","option"," on ADD")){
            return false;
        }
        Functions.break_time(driver,5,500);
        if(!Functions.checkClick(driver,
                new String[]{"template_descriptions_add_text_sl_button",getElements("template_descriptions_add_text_sl_button")}, //element to click
                new String[]{"template_descriptions_add_text_sl_check_box",getElements("template_descriptions_add_text_sl_check_box")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_text_sl_check_box",getElements("template_descriptions_add_text_sl_check_box")}, //element to click
                " on ADD")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"template_descriptions_add_text_b_add",getElements("template_descriptions_add_text_b_add")}, //element to click
                " on ADD")){
            return false;
        }*/
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




