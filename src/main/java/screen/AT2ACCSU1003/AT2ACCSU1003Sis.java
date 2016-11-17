package screen.AT2ACCSU1003;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 16/11/2016.
 */
public class AT2ACCSU1003Sis {
    protected AT2ACCSU1003Locators locators;
    protected AT2ACCSU1003Data data;

    public AT2ACCSU1003Sis (){

    }

    public AT2ACCSU1003Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCSU1003Locators locators){
        this.locators = locators;
    }

    public AT2ACCSU1003Data getData (){
        return data;
    }

    public void setData (AT2ACCSU1003Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Category types 2.0");
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
