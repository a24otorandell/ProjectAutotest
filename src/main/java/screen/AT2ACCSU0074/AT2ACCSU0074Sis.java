package screen.AT2ACCSU0074;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

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


        return false;
    }
}
