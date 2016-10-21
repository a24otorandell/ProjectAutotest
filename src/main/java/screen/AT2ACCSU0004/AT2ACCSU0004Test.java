package screen.AT2ACCSU0004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.apache.bcel.generic.IF_ACMPEQ;

/**
 * Created by vsolis on 20/10/2016.
 */
public class AT2ACCSU0004Test {
    protected AT2ACCSU0004Locators locators;
    protected AT2ACCSU0004Data data;

    public AT2ACCSU0004Test (){

    }

    public AT2ACCSU0004Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCSU0004Locators locators){
        this.locators = locators;
    }

    public AT2ACCSU0004Data getData (){
        return data;
    }

    public void setData (AT2ACCSU0004Data data){
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

        if(!Fre_type(driver)){
            return false;
        }

        if(!Lenguaje_description(driver)){
            return false;
        }

        if(!Free_type_delete(driver)){
            return false;
        }
        return false;
    }


    //LENGUAJE DESCRIPTION

    private boolean Lenguaje_description (TestDriver driver){
        if(!Lenguaje_description_add(driver)){
            return false;
        }
        if(!Lenguaje_description_search(driver)){
            return false;
        }
        if(!Lenguaje_description_edit(driver)){
            return false;
        }
        if(!Lenguaje_description_search(driver)){
            return false;
        }
        if(!Lenguaje_description_other_actions(driver)){
            return false;
        }
        if(!Lenguaje_description_delete(driver)){
            return false;
        }
        return true;
    }

    private boolean Lenguaje_description_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN LENGUAJE DESCRIPTION",3,false);


        if(!Functions.auditData(driver,
                new String[]{"lenguaje_description_oa_b_actions",getElements("lenguaje_description_oa_b_actions")}, //actions button
                new String[]{"lenguaje_description_oa_b_actions_b_audit_data",getElements("lenguaje_description_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"lenguaje_description_oa_b_actions_b_audit_data_b_ok",getElements("lenguaje_description_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }

        if(!Functions.detachTable(driver,
                new String[]{"lenguaje_description_oa_b_detach",getElements("lenguaje_description_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }

    private boolean Lenguaje_description_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN LENGUAJE DESCRIPTION",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"lenguaje_description_del_b_delete",getElements("lenguaje_description_del_b_delete")},
                new String[]{"lenguaje_description_del_e_record",getElements("lenguaje_description_del_e_record")},
                new String[]{"lenguaje_description_del_b_delete_ok",getElements("lenguaje_description_del_b_delete_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Lenguaje_description_edit (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN LENGUAJE DESCRIPTION",3,false);

        Functions.break_time(driver,10,500);
        if(!Functions.checkClick(driver,
                new String[]{"lenguaje_description_ed_b_edit",getElements("lenguaje_description_ed_b_edit")}, //element to click
                new String[]{"lenguaje_description_ed_lov_lenguaje_code",getElements("lenguaje_description_ed_lov_lenguaje_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        Functions.break_time(driver,10,500);
        if(!Functions.createLov(driver,
                new String[]{"lenguaje_description_ed_lov_lenguaje_code",getElements("lenguaje_description_ed_lov_lenguaje_code")}, // b_lov
                new String[]{"lenguaje_description_ed_i_lenguaje_code",getElements("lenguaje_description_ed_i_lenguaje_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on EDIT")){
            return false;
        }  // where the operation occurs

        if(!Functions.insertInput(driver,new String[]{"lenguaje_description_ed_i_description",getElements("lenguaje_description_ed_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"lenguaje_description_ed_b_save",getElements("lenguaje_description_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Lenguaje_description_search (TestDriver driver){
        driver.getReport().addHeader(" SEARCH IN LENGUAJE DESCRIPTION",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"lenguaje_description_se_b_qbe",getElements("lenguaje_description_se_b_qbe")},// query button
                new String[]{"lenguaje_description_se_i_lenguaje_code",getElements("lenguaje_description_se_i_lenguaje_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"lenguaje_description_se_i_lenguaje_code",getElements("lenguaje_description_se_i_lenguaje_code")},
                "se_leguaje_code",data.getData().get("leguaje_code")," on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"lenguaje_description_se_i_description",getElements("lenguaje_description_se_i_description")},
                "se_descriptions",data.getData().get("descriptions")," on QBE")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"lenguaje_description_se_i_lenguaje_code",getElements("lenguaje_description_se_i_lenguaje_code")}, //search button
                new String[]{"lenguaje_description_se_e_result",getElements("lenguaje_description_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        return true;

    }

    private boolean Lenguaje_description_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN LENGUAJE DESCRIPTION",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"lenguaje_description_add_b_add",getElements("lenguaje_description_add_b_add")}, //element to click
                new String[]{"lenguaje_description_add_lov_lenguaje_code",getElements("lenguaje_description_add_lov_lenguaje_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"lenguaje_description_add_lov_lenguaje_code",getElements("lenguaje_description_add_lov_lenguaje_code")}, // b_lov
                new String[]{"lenguaje_description_add_i_lenguaje_code",getElements("lenguaje_description_add_i_lenguaje_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "leguaje_code", //Data name
                " on ADD")){
            return false;
        }  // where the operation occurs

        if(!Functions.insertInput(driver,new String[]{"lenguaje_description_add_i_description",getElements("lenguaje_description_add_i_description")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"lenguaje_description_add_b_save",getElements("lenguaje_description_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }


    //Free type

    private boolean Fre_type (TestDriver driver){

        if(!Free_type_add(driver)){
            return false;
        }

        if(!Free_type_search(driver)){
            return false;
        }

        if(!Free_type_edit(driver)){
            return false;
        }

        if(!Free_type_qbe(driver)){
            return false;
        }

        if(!Free_type_other_actions(driver)){
            return false;
        }


        return true;
    }

    private boolean Free_type_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN FREE TYPES",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"free_type_del_b_delete",getElements("free_type_del_b_delete")},
                new String[]{"free_type_del_e_record",getElements("free_type_del_e_record")},
                new String[]{"free_type_del_b_delete_ok",getElements("free_type_del_b_delete_ok")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Free_type_other_actions (TestDriver driver){
        driver.getReport().addHeader(" OTHER ACTIONS IN SEASONS MAINTENANCE",3,false);

        if(!Functions.auditData(driver,
                new String[]{"free_type_oa_b_actions",getElements("free_type_oa_b_actions")}, //actions button
                new String[]{"free_type_oa_b_actions_b_audit_data",getElements("free_type_oa_b_actions_b_audit_data")}, //audit button
                new String[]{"free_type_oa_b_actions_b_audit_data_b_ok",getElements("free_type_oa_b_actions_b_audit_data_b_ok")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"free_type_oa_b_audit_data",getElements("free_type_oa_b_audit_data")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }
        return true;
    }

    private boolean Free_type_qbe (TestDriver driver){
        driver.getReport().addHeader(" QBE IN FREE TYPE",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"free_type_se_b_reset",getElements("free_type_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickQbE(driver,
                new String[]{"free_type_qbe_b_qbe",getElements("free_type_qbe_b_qbe")},// query button
                new String[]{"free_type_qbe_i_free_type_code",getElements("free_type_qbe_i_free_type_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"free_type_qbe_i_free_type_code",getElements("free_type_qbe_i_free_type_code")},
                "se_free_type_code",data.getData().get("free_type_code")," on QBE")){
            return false;
        }

        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"free_type_qbe_i_free_type_code",getElements("free_type_qbe_i_free_type_code")}, //search button
                new String[]{"free_type_se_e_result",getElements("free_type_se_e_result")}, //result element
                " on QBE")){
            return false;
        }
        return true;
    }

    private boolean Free_type_edit (TestDriver driver){

        driver.getReport().addHeader(" EDIT IN FREE TYPE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"free_type_ed_b_edit",getElements("free_type_ed_b_edit")}, //element to click
                new String[]{"free_type_ed_i_free_type_code",getElements("free_type_ed_i_free_type_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"free_type_ed_i_free_type_code",getElements("free_type_ed_i_free_type_code")},
                "free_type_code",DataGenerator.getRandomAlphanumericSequence(3,true)," on EDIT")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"free_type_ed_b_save",getElements("free_type_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Free_type_search (TestDriver driver){
        driver.getReport().addHeader("  SEARCH IN FREE TYPE",3,false);

        if(!Functions.insertInput(driver,new String[]{"free_type_se_i_free_type_code",getElements("free_type_se_i_free_type_code")},
                "se_free_type_code",data.getData().get("free_type_code")," on SEARCH")){
            return false;
        }
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"free_type_se_b_search",getElements("free_type_se_b_search")}, //search button
                new String[]{"free_type_se_e_result",getElements("free_type_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }

        return true;
    }

    private boolean Free_type_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN FREE TYPE",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"free_type_add_b_add",getElements("free_type_add_b_add")}, //element to click
                new String[]{"free_type_add_i_free_type_code",getElements("free_type_add_i_free_type_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"free_type_add_i_free_type_code",getElements("free_type_add_i_free_type_code")},
                "free_type_code",DataGenerator.getRandomAlphanumericSequence(3,true)," on ADD")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"free_type_add_b_save",getElements("free_type_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }


        return true;
    }
}
