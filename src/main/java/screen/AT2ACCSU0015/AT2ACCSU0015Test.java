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
        driver.getTestdetails().setScreen("Room descriptions");
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

        return true;


    }

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
        if(!Hotel_chain_description_delete(driver)){
            return false;
        }

        return true;
    }

    private boolean Hotel_chain_description_delete (TestDriver driver){
        driver.getReport().addHeader(" DELETE IN HOTEL CHAIN DESCRIPTION",3,false);

        if(!Functions.doDeleteNCheck(driver,
                new String[]{"",getElements("")},
                new String[]{"",getElements("")},
                new String[]{"",getElements("")},
                " on DELETE")){
            return false;
        }
        return true;
    }

    private boolean Hotel_chain_description_other_actions (TestDriver driver){

        driver.getReport().addHeader(" OTHER ACTIONS IN HOTEL CHAIN DESCRIPTION",3,false);

        if(!Functions.auditData(driver,
                new String[]{"",getElements("")}, //actions button
                new String[]{"",getElements("")}, //audit button
                new String[]{"",getElements("")}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"",getElements("")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }

        return true;
    }

    private boolean Hotel_chain_description_qbe (TestDriver driver){

        driver.getReport().addHeader(" QBE IN HOTEL CHAIN DESCRIPTION",3,false);
        if(!Functions.simpleClick(driver,
                new String[]{"",getElements("")}, //element to click
                " on QBE")){
            return false;
        }

        if(!Functions.clickQbE(driver,
                new String[]{"",getElements("")},// query button
                new String[]{"",getElements("")},//any query input
                " on QBE")){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "chain",getData("chain"),"on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "description",getData("description"),"on QBE")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"",getElements("")}, //any query input
                new String[]{"",getElements("")}, //table result
                " on QBE")){
            return false;
        }


        return false;
    }

    private boolean Hotel_chain_description_edit (TestDriver driver){

        driver.getReport().addHeader(" EDIT IN HOTEL CHAIN DESCRIPTION",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"",getElements("")}, //element to click
                new String[]{"",getElements("")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "chain",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on EDIT")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"",getElements("")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }
        return true;
    }

    private boolean Hotel_chain_description_search (TestDriver driver){

        driver.getReport().addHeader(" SEARCH IN HOTEL CHAIN DESCRIPTION",3,false);

        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "chain",getData("chain"),"on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "descriptions",getData("description"),"on SEARCH")){
            return false;
        }

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"",getElements("")}, //search button
                new String[]{"",getElements("")}, //result element
                " on SEARCH")){
            return false;
        }


        return true;
    }

    private boolean Hotel_chain_description_add (TestDriver driver){

        driver.getReport().addHeader(" ADD IN HOTEL CHAIN DESCRIPTION",3,false);

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"",getElements("")}, //element to click
                new String[]{"",getElements("")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "chain",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"",getElements("")},
                "descriptions",DataGenerator.getRandomAlphanumericSequence(8,true),"on ADD")){
            return false;
        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"",getElements("")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on ADD")){
            return false;
        }
        return true;
    }

}
