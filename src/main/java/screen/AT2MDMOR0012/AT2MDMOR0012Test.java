package screen.AT2MDMOR0012;

import com.gargoylesoftware.htmlunit.javascript.host.idb.IDBFactory;
import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 18/10/2016.
 */
public class AT2MDMOR0012Test {
    protected AT2MDMOR0012Locators locators;
    protected AT2MDMOR0012Data data;

    public AT2MDMOR0012Test (){

    }
    public AT2MDMOR0012Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2MDMOR0012Locators locators){
        this.locators = locators;
    }
    public AT2MDMOR0012Data getData (){
        return data;
    }
    public void setData (AT2MDMOR0012Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Management");
        driver.getTestdetails().setScreen("Departments 2.0");
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
        if(!Departments(driver)){
            return false;
        }

        if(!Multi_lenguaje(driver)){
            return false;
        }

        if(!Departments_delete(driver)){
            return false;
        }

        return false;
    }

    //TABLA MULTI LENGUAJE
    private boolean Multi_lenguaje (TestDriver driver){

        if(!Multi_lenguaje_add(driver)){
            return false;
        }

        if(!Multi_lenguaje_search(driver)){
            return false;
        }

        if(!Multi_legunaje_edit(driver)){
            return false;
        }

        if(!Multi_lenguaje_search(driver)){
            return false;
        }

        if(!Multi_lenguaje_other_actions(driver)){
            return false;
        }

        if(!Multi_lenguaje_delete(driver)){
            return false;
        }

        return true;
    }
    private boolean Multi_lenguaje_delete (TestDriver driver){
        driver.getReport().addHeader("DELETE IN MULTI LENGUAJES",3,false);


        if(!Functions.doDeleteNCheck(driver,
                new String[]{"multi_lenguaje_del_b_delete",getElements("multi_lenguaje_del_b_delete")},
                new String[]{"multi_lenguaje_del_e_record",getElements("multi_lenguaje_del_e_record")},
                new String[]{"multi_lenguaje_del_b_delete_b_ok",getElements("multi_lenguaje_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }

        return true;
    }
    private boolean Multi_lenguaje_other_actions (TestDriver driver){
        driver.getReport().addHeader("OTHER ACTIONS IN MULTI LENGUAJE",3,false);

        if(!Functions.detachTable(driver,
                new String[]{"multi_lenguaje_oa_b_detach",getElements("multi_lenguaje_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }
    private boolean Multi_legunaje_edit (TestDriver driver){
        driver.getReport().addHeader("EDIT IN MULTI LENGUAJE",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"multi_lenguaje_ed_b_edit",getElements("multi_lenguaje_ed_b_edit")}, //element to click
                new String[]{"multi_lenguaje_ed_i_description",getElements("multi_lenguaje_ed_i_description")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_ed_i_description",getElements("multi_lenguaje_ed_i_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(6,true)," on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_ed_i_short_description",getElements("multi_lenguaje_ed_i_short_description")},
                "short_description",DataGenerator.getRandomAlphanumericSequence(6,true)," on EDIT")){
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
        driver.getReport().addHeader("SEARCH IN DEPARTMENTS",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"multi_lenguaje_se_b_qbe",getElements("multi_lenguaje_se_b_qbe")},// query button
                new String[]{"multi_lenguaje_se_i_lenguaje",getElements("multi_lenguaje_se_i_lenguaje")},//any query input
                " on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"multi_lenguaje_se_i_lenguaje",getElements("multi_lenguaje_se_i_lenguaje")},
                "se_leguaje",data.getData().get("lenguaje")," on SEARCH ")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"multi_lenguaje_se_i_description",getElements("multi_lenguaje_se_i_description")},
                "se_description",data.getData().get("description")," on SEARCH ")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"multi_lenguaje_se_i_short_description",getElements("multi_lenguaje_se_i_short_description")},
                "se_short_description",data.getData().get("short_description")," on SEARCH ")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"multi_lenguaje_se_i_lenguaje",getElements("multi_lenguaje_se_i_lenguaje")}, //search button
                new String[]{"multi_lenguaje_se_e_result",getElements("multi_lenguaje_se_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }
    private boolean Multi_lenguaje_add (TestDriver driver){

        driver.getReport().addHeader("ADD IN MULTI LENGUAJE",3,false);
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
                "lenguaje", //Data name
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_add_i_description",getElements("multi_lenguaje_add_i_description")},
                "description",DataGenerator.getRandomAlphanumericSequence(6,true)," on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"multi_lenguaje_add_i_short_description",getElements("multi_lenguaje_add_i_short_description")},
                "short_description",DataGenerator.getRandomAlphanumericSequence(6,true)," on ADD")){
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

    //TABLA DEPARTMENT
    private boolean Departments (TestDriver driver){

        if(!Departments_add(driver)){
            return false;
        }

        if(!Departments_search(driver)){
            return false;
        }

        if(!Departments_qbe(driver)){
            return false;
        }

        if(!Departments_other_actions(driver)){
            return false;
        }
        return true;
    }
    private boolean Departments_delete (TestDriver driver){

        driver.getReport().addHeader("DELETE IN DEPARTMENTS",3,false);


        if(!Functions.doDeleteNCheck(driver,
                new String[]{"department_del_b_delete",getElements("department_del_b_delete")},
                new String[]{"department_del_e_record",getElements("department_del_e_record")},
                new String[]{"department_del_b_delete_b_ok",getElements("department_del_b_delete_b_ok")},
                " on DELETE")){
            return false;
        }


        return true;
    }
    private boolean Departments_other_actions (TestDriver driver){

        driver.getReport().addHeader("OTHER ACTIONS IN DEPARTMENTS",3,false);

        if(!Functions.detachTable(driver,
                new String[]{"department_oa_b_detach",getElements("department_oa_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }


        return true;
    }
    private boolean Departments_qbe (TestDriver driver){
        driver.getReport().addHeader("QBE IN DEPARTMENTS",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"departments_se_b_reset",getElements("departments_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }


        if(!Functions.clickQbE(driver,
                new String[]{"departments_qbe_b_qbe",getElements("departments_qbe_b_qbe")},// query button
                new String[]{"departments_qbe_i_department_code",getElements("departments_qbe_i_department_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"departments_qbe_i_department_code",getElements("departments_qbe_i_department_code")},
                "qbe_department_code",data.getData().get("department_code")," on QBE ")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"departments_qbe_i_department_code",getElements("departments_qbe_i_department_code")}, //search button
                new String[]{"departments_se_e_result",getElements("departments_se_e_result")}, //result element
                " on QBE")){
            return false;
        }

        return true;
    }
    private boolean Departments_search (TestDriver driver){
        driver.getReport().addHeader("SEARCH IN DEPARTMENT",3,false);

        if(!Functions.insertInput(driver,
                new String[]{"departments_se_i_department_code",getElements("departments_se_i_department_code")},
                "se_department_code",data.getData().get("department_code")," on SEARCH ")){
            return false;
        }
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"departments_se_b_search",getElements("departments_se_b_search")}, //search button
                new String[]{"departments_se_e_result",getElements("departments_se_e_result")}, //Falta crear este resultado por bug
                " on SEARCH")){
            return false;
        }
        return true;
    }
    private boolean Departments_add (TestDriver driver){

        driver.getReport().addHeader("ADD IN DEPARTMENTS",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"deparments_add_b_add",getElements("deparments_add_b_add")}, //element to click
                new String[]{"departments_add_i_department_code",getElements("departments_add_i_department_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"departments_add_i_department_code",getElements("departments_add_i_department_code")},
                "department_code",DataGenerator.getRandomAlphanumericSequence(4,true)," on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"departments_add_b_save",getElements("departments_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }

        return true;
    }
}
