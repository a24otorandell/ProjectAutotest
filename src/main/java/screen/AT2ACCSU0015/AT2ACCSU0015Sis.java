package screen.AT2ACCSU0015;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 07/11/2016.
 */
public class AT2ACCSU0015Sis {
    protected AT2ACCSU0015Locators locators;
    protected AT2ACCSU0015Data data;

    public AT2ACCSU0015Sis (){

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


        return true;


    }

}
