package screen.AT2ACCDI0001;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 28/10/2016.
 */
public class AT2ACCDI0001Test {
    protected AT2ACCDI0001Locators locators;
    protected AT2ACCDI0001Data data;

    public AT2ACCDI0001Test (){

    }

    public AT2ACCDI0001Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCDI0001Locators locators){
        this.locators = locators;
    }

    public AT2ACCDI0001Data getData (){
        return data;
    }

    public void setData (AT2ACCDI0001Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Additional suplements 2.0");
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
