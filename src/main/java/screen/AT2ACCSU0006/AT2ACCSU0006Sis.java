package screen.AT2ACCSU0006;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 21/10/2016.
 */
public class AT2ACCSU0006Sis {
    protected AT2ACCSU0006Locators locators;
    protected AT2ACCSU0006Data data;

    public AT2ACCSU0006Sis (){

    }

    public AT2ACCSU0006Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCSU0006Locators locators){
        this.locators = locators;
    }

    public AT2ACCSU0006Data getData (){
        return data;
    }

    public void setData (AT2ACCSU0006Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Season 2.0");
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

        if(!Rates_maintenance(driver)){
            return false;
        }

        if(!incoming_office(driver)){
            return false;
        }

        if(!Multi_lenguaje(driver)){
            return false;
        }
        if(!Rates_maintenance_delete(driver)){
            return false;
        }

        return false;
    }

    /*Multi Lenguaje*/
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
                new String[]{"multi_lenguaje_ed_lov_lenguaje",getElements("multi_lenguaje_ed_lov_lenguaje")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,10,500);
        if(!Functions.createLov(driver,
                new String[]{"multi_lenguaje_ed_lov_lenguaje",getElements("multi_lenguaje_ed_lov_lenguaje")}, // b_lov
                new String[]{"multi_lenguaje_ed_i_lenguaje",getElements("multi_lenguaje_ed_i_lenguaje")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on EDIT")){
            return false;
        }  // where the operation occurs
        if(!Functions.getValue(driver,new String[]{"multi_lenguaje_ed_e_code",getElements("multi_lenguaje_ed_e_code")}, // element path
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
                new String[]{"multi_lenguaje_se_i_code",getElements("multi_lenguaje_se_i_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_code",getElements("multi_lenguaje_se_i_code")},
                "se_leguaje_code",data.getData().get("leguaje_code")," on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_se_i_description",getElements("multi_lenguaje_se_i_description")},
                "se_descriptions",data.getData().get("descriptions")," on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"multi_lenguaje_se_i_code",getElements("multi_lenguaje_se_i_code")}, //search button
                new String[]{"multi_lenguaje_se_e_result",getElements("multi_lenguaje_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"multi_lenguaje_se_e_result",getElements("multi_lenguaje_se_e_result")}, //element to click
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
                new String[]{"multi_lenguaje_add_lov_lenguaje",getElements("multi_lenguaje_add_lov_lenguaje")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"multi_lenguaje_add_lov_lenguaje",getElements("multi_lenguaje_add_lov_lenguaje")}, // b_lov
                new String[]{"multi_lenguaje_add_i_lenguaje",getElements("multi_lenguaje_add_i_lenguaje")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on ADD")){
            return false;
        }  // where the operation occurs
        if(!Functions.getValue(driver,new String[]{"multi_lenguaje_add_e_code",getElements("multi_lenguaje_add_e_code")}, // element path
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

    /*Incoming Office*/

    private boolean incoming_office (TestDriver driver){
        if(!Incoming_offices_add(driver)){
            return false;
        }
        if(!Incoming_offices_search(driver)){
            return false;
        }
        if(!Incoming_offices_edit(driver)){
            return false;
        }
        if(!Incoming_offices_search(driver)){
            return false;
        }
        if(!Incoming_offices_other_actions(driver)){
            return false;
        }
        if(!Incoming_offices_delete(driver)){
            return false;
        }
        return true;
    }

    private boolean Incoming_offices_delete (TestDriver driver){

        driver.getReport().addHeader(" DELETE IN INCOMING OFFICE",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"incoming_fiels_del_b_delete",getElements("incoming_fiels_del_b_delete")},
                new String[]{"incoming_fiels_del_e_record",getElements("incoming_fiels_del_e_record")},
                new String[]{"incoming_fiels_del_b_delete_b_ok",getElements("incoming_fiels_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Incoming_offices_other_actions (TestDriver driver){
        driver.getReport().addHeader(" OTHER ACTIONS IN INCOMING OFFICES",3,false);

        if(!Functions.auditData(driver,
                new String[]{"incoming_fiels_oa_b_actions",getElements("incoming_fiels_oa_b_actions")}, //actions button
                new String[]{"incoming_fiels_oa_b_actios_b_adit_data",getElements("incoming_fiels_oa_b_actios_b_adit_data")}, //audit button
                new String[]{"incoming_fiels_oa_b_actios_b_adit_data_b_ok",getElements("incoming_fiels_oa_b_actios_b_adit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"incoming_fiels_oa_b_detach",getElements("incoming_fiels_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }

    private boolean Incoming_offices_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN INCOMING FIELS",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"incoming_fiels_ed_b_edit",getElements("incoming_fiels_ed_b_edit")}, //element to click
                new String[]{"incoming_fiels_ed_lov_office",getElements("incoming_fiels_ed_lov_office")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"incoming_fiels_ed_lov_office",getElements("incoming_fiels_ed_lov_office")}, // b_lov
                new String[]{"incoming_fiels_ed_i_office",getElements("incoming_fiels_ed_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                " on EDIT")){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"incoming_fiels_ed_e_company",getElements("incoming_fiels_ed_e_company")}, // element path
                "company", // key for data value (the name)
                " on EDIT")){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"incoming_fiels_ed_e_incoming_office",getElements("incoming_fiels_ed_e_incoming_office")}, // element path
                "incoming_office", // key for data value (the name)
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"incoming_fiels_ed_b_save",getElements("incoming_fiels_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Incoming_offices_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN INCOMING FIELS",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.clickQbE(driver,
                new String[]{"incoming_fiels_se_b_qbe",getElements("incoming_fiels_se_b_qbe")},// query button
                new String[]{"incoming_fiels_se_i_office",getElements("incoming_fiels_se_i_office")},//any query input
                " on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"incoming_fiels_se_i_office",getElements("incoming_fiels_se_i_office")},
                "se_office",data.getData().get("office")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"incoming_fiels_se_i_company",getElements("incoming_fiels_se_i_company")},
                "se_company",data.getData().get("company")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"incoming_fiels_se_i_incoming_office",getElements("incoming_fiels_se_i_incoming_office")},
                "se_incoming_office",data.getData().get("incoming_office")," on SEARCH")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"incoming_fiels_se_i_office",getElements("incoming_fiels_se_i_office")}, //search button
                new String[]{"incoming_fiels_se_e_result",getElements("incoming_fiels_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }

        return true;
    }

    private boolean Incoming_offices_add (TestDriver driver){
        driver.getReport().addHeader(" ADD IN INCOMING FIELS",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"incoming_fiels_add_b_add",getElements("incoming_fiels_add_b_add")}, //element to click
                new String[]{"incoming_fiels_add_lov_office",getElements("incoming_fiels_add_lov_office")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"incoming_fiels_add_lov_office",getElements("incoming_fiels_add_lov_office")}, // b_lov
                new String[]{"incoming_fiels_add_i_office",getElements("incoming_fiels_add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                " on ADD")){
            return false;
        }

        if(!Functions.getValue(driver,new String[]{"incoming_fiels_add_e_company",getElements("incoming_fiels_add_e_company")}, // element path
                "company", // key for data value (the name)
                " on ADD")){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"incoming_fiels_add_e_incoming_office",getElements("incoming_fiels_add_e_incoming_office")}, // element path
                "incoming_office", // key for data value (the name)
                " on ADD")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"incoming_fiels_add_b_save",getElements("incoming_fiels_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

    /*Rates Maintenance*/

    private boolean Rates_maintenance (TestDriver driver){

        if(!Rates_maintenance_add(driver)){
            return false;
        }
        if(!Rates_maintenance_search(driver)){
            return false;
        }
        if(!Rates_maintenance_edit(driver)){
            return false;
        }
        if(!Rates_maintenance_qbe(driver)){
            return false;
        }
        if(!Rates_maintenance_other_actions(driver)){
            return false;
        }


        return true;
    }

    private boolean Rates_maintenance_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN RATES MAINTENANCE",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"rates_maintenance_del_b_delete",getElements("rates_maintenance_del_b_delete")},
                new String[]{"rates_maintenance_del_e_record",getElements("rates_maintenance_del_e_record")},
                new String[]{"rates_maintenance_del_b_delete_b_ok",getElements("rates_maintenance_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Rates_maintenance_other_actions (TestDriver driver){
        driver.getReport().addHeader(" OTHER ACTIONS IN RATES MAINTENANCE",3,false);

        if(!Functions.auditData(driver,
                new String[]{"rates_maintenance_oa_b_actions",getElements("rates_maintenance_oa_b_actions")}, //actions button
                new String[]{"rates_maintenance_oa_b_actions_b_audit_data",getElements("rates_maintenance_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"rates_maintenance_oa_b_actions_b_audit_data_b_ok",getElements("rates_maintenance_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"rates_maintenance_oa_b_ok",getElements("rates_maintenance_oa_b_ok")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }

    private boolean Rates_maintenance_qbe (TestDriver driver){
        driver.getReport().addHeader(" QBE IN SEASONS MAINTENANCE",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"rates_maintenance_se_b_reset",getElements("rates_maintenance_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickQbE(driver,
                new String[]{"rates_maintenance_qbe_b_qbe",getElements("rates_maintenance_qbe_b_qbe")},// query button
                new String[]{"rates_maintenance_qbe_i_code",getElements("rates_maintenance_qbe_i_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_qbe_i_code",getElements("rates_maintenance_qbe_i_code")},
                "se_code",data.getData().get("code")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_qbe_i_rate_description",getElements("rates_maintenance_qbe_i_rate_description")},
                "se_description",data.getData().get("description")," on QBE")){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"rates_maintenance_qbe_sl_active",getElements("rates_maintenance_qbe_sl_active")},
                "No","se_active"," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"rates_maintenance_qbe_sl_visible_wizard",getElements("rates_maintenance_qbe_sl_visible_wizard")},
                "No","se_wizard"," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_qbe_i_b_line",getElements("rates_maintenance_qbe_i_b_line")},
                "se_line",data.getData().get("line")," on QBE")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"rates_maintenance_qbe_i_code",getElements("rates_maintenance_qbe_i_code")}, //search button
                new String[]{"rates_maintenance_se_e_result",getElements("rates_maintenance_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        return true;
    }

    private boolean Rates_maintenance_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN RATES MAINTENANCE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"rates_maintenance_ed_b_edit",getElements("rates_maintenance_ed_b_edit")}, //element to click
                new String[]{"rates_maintenance_ed_i_code",getElements("rates_maintenance_ed_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"rates_maintenance_ed_i_code",getElements("rates_maintenance_ed_i_code")}, // element path
                "code", // key for data value (the name)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_ed_i_rate_description",getElements("rates_maintenance_ed_i_rate_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("rates_maintenance_ed_ch_active"),"active",false,true," on EDIT")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("rates_maintenance_ed_ch_visible_wizard"),"wizard",false,true," on EDIT")){
            return false;
        }//where

        if(!Functions.createLov(driver,
                new String[]{"rates_maintenance_ed_lov_b_line",getElements("rates_maintenance_ed_lov_b_line")}, // b_lov
                new String[]{"rates_maintenance_ed_i_b_line",getElements("rates_maintenance_ed_i_b_line")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "line", //Data name
                " on EDIT")){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"rates_maintenance_ed_b_save",getElements("rates_maintenance_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Rates_maintenance_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN RATES MAINTENANCE",3,false);

        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_se_i_code",getElements("rates_maintenance_se_i_code")},
                "code",data.getData().get("code")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_se_i_rate_description",getElements("rates_maintenance_se_i_rate_description")},
                "description",data.getData().get("description")," on SEARCH")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"rates_maintenance_se_sl_active",getElements("rates_maintenance_se_sl_active")},
                "Yes","se_active"," on SEARCH")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"rates_maintenance_se_sl_visible_wizard",getElements("rates_maintenance_se_sl_visible_wizard")},
                "Yes","se_wizard"," on SEARCH")){
            return false;
        }
        if(!Functions.createLovByValue(driver,
                new String[]{"rates_maintenance_se_lov_b_line",getElements("rates_maintenance_se_lov_b_line")}, //LoV button
                new String[]{"rates_maintenance_se_i_b_line",getElements("rates_maintenance_se_i_b_line")}, //external LoV input
                new String[]{"rates_maintenance_se_lov_i_grouping_code",getElements("rates_maintenance_se_lov_i_grouping_code")}, //internal LoV input
                data.getData().get("line"), // value to search
                "se_line", //name of the data
                " on SEARCH")){
            return false;
        }
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"rates_maintenance_se_b_search",getElements("rates_maintenance_se_b_search")}, //search button
                new String[]{"rates_maintenance_se_e_result",getElements("rates_maintenance_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }

    private boolean Rates_maintenance_add (TestDriver driver){


        driver.getReport().addHeader(" ADD IN RATES MAINTENANCE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"rates_maintenance_add_b_add",getElements("rates_maintenance_add_b_add")}, //element to click
                new String[]{"rates_maintenance_add_i_code",getElements("rates_maintenance_add_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_add_i_code",getElements("rates_maintenance_add_i_code")},
                "code",DataGenerator.getRandomAlphanumericSequence(8,true)," on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"rates_maintenance_add_i_rate_description",getElements("rates_maintenance_add_i_rate_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("rates_maintenance_add_ch_active"),"active",true,true," on ADD")){
            return false;
        }//where
        if(!Functions.checkboxValue(driver,
                getElements("rates_maintenance_add_ch_visible_wizard"),"wizard",true,true," on ADD")){
            return false;
        }//where

        if(!Functions.createLov(driver,
                new String[]{"rates_maintenance_add_lov_b_line",getElements("rates_maintenance_add_lov_b_line")}, // b_lov
                new String[]{"rates_maintenance_add_i_b_line",getElements("rates_maintenance_add_i_b_line")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "line", //Data name
                " on ADD")){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"rates_maintenance_add_b_save",getElements("rates_maintenance_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }
}
