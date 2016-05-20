package screen.AT2BOOSA1002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;



/**
 * Created by acarrillo on 18/05/2016.
 */
class AT2BOOSA1002Test {
    protected AT2BOOSA1002Locators locators;
    protected AT2BOOSA1002Data data;

    public AT2BOOSA1002Test() {
    }
    public AT2BOOSA1002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2BOOSA1002Locators locators) {
        this.locators = locators;
    }
    public AT2BOOSA1002Data getData() {
        return data;
    }
    public void setData(AT2BOOSA1002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        //driver.getTestdetails().getTestname();
        driver.getTestdetails().setTestname("AT2BOOSA0005");
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BOOKINGS");
        driver.getTestdetails().setSubmenu("SALE");
        driver.getTestdetails().setScreen("Bookings Maintenance");

    }
    protected String getElements(String key){
        return this.locators.getElements().get(key);
    }
    protected String getData(String key){
        return this.data.getData().get(key);
    }
    protected boolean testCSED(TestDriver driver) {
        return create_header(driver);
    }
    private boolean create_header(TestDriver driver) {
        driver.getReport().addHeader("CREATE NEW BOOKING", 2, true);
        if (!Functions.simpleClick(driver,
                new String[]{"header_add", getElements("header_add")}, //element to click
                " on CREATION HEADER")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_interface",getElements("header_add_lov_interface")}, // b_lov
                new String[]{"header_add_i_interface", getElements("header_add_i_interface")}, // i_lov
                new String[]{"header_ad_i_interface",recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_interface"),
                "header_interface", //Data name
                " on HEADER CREATION")){ return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_to", getElements("header_add_lov_to")}, //LoV button
                new String[]{"header_add_i_to", getElements("header_add_i_to")}, //external LoV input
                new String[]{"header_add_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_to"), // value to search
                "header_to", //name of the data
                " on HEADER CREATION")){return false;}
        return true;
    }

}
