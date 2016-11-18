package screen.AT2ACCSU0051;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2ACCSU0051Sis {
    protected AT2ACCSU0051Locators locators;
    protected AT2ACCSU0051Data data;

    public AT2ACCSU0051Sis (){

    }

    public AT2ACCSU0051Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2ACCSU0051Locators locators){
        this.locators = locators;
    }
    public AT2ACCSU0051Data getData (){
        return data;
    }
    public void setData (AT2ACCSU0051Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Boards Maintenance");
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
