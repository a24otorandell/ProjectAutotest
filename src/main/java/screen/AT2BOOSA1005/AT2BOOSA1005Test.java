package screen.AT2BOOSA1005;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 17/11/2016.
 */
public class AT2BOOSA1005Test {

    protected AT2BOOSA1005Locators locators;
    protected AT2BOOSA1005Data data;

    public AT2BOOSA1005Test (){

    }
    public AT2BOOSA1005Locators getLocators (){
        return locators;
    }
    public void setLocators (AT2BOOSA1005Locators locators){
        this.locators = locators;
    }
    public AT2BOOSA1005Data getData (){
        return data;
    }
    public void setData (AT2BOOSA1005Data data){
        this.data = data;
    }
    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Bookings");
        driver.getTestdetails().setSubmenu("Sale");
        driver.getTestdetails().setScreen("Booking Reconfirmations management2.0");
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
