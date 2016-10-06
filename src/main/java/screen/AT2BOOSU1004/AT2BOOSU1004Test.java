package screen.AT2BOOSU1004;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 05/10/2016.
 */
public class AT2BOOSU1004Test {

    protected AT2BOOSU1004Locators locators;
    protected AT2BOOSU1004Data data;

    public AT2BOOSU1004Test() {

    }

    public AT2BOOSU1004Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSU1004Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSU1004Data getData() {
        return data;
    }

    public void setData(AT2BOOSU1004Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("TTOO Quality Groups");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {

        if (!Reconfirmation_clients(driver)) {
            return true;
        }


        return false;
    }

    private boolean Reconfirmation_clients(TestDriver driver) {

        if (Add_cofiguration_by_tto(driver)) {
            return false;
        }


        return true;
    }

    private boolean Add_cofiguration_by_tto(TestDriver driver) {


        driver.getReport().addHeader(" ADD IN CONFIGURATION BY TTO", 3, false);


        return true;
    }


}

