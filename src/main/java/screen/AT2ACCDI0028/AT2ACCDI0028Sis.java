package screen.AT2ACCDI0028;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 29/11/2016.
 */
public class AT2ACCDI0028Sis {
    protected AT2ACCDI0028Locators locators;
    protected AT2ACCDI0028Data data;

    public AT2ACCDI0028Sis (){

    }
    public AT2ACCDI0028Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCDI0028Locators locators){
        this.locators = locators;
    }
    public AT2ACCDI0028Data getData (){
        return data;
    }
    public void setData (AT2ACCDI0028Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Rates 2.0");
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
