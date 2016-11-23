package screen.AT2CARSU0014;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 23/11/2016.
 */
public class AT2CARSU0014Sis {
    protected AT2CARSU0014Locators locators;
    protected AT2CARSU0014Data data;

    public AT2CARSU0014Sis() {

    }
    public AT2CARSU0014Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0014Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0014Data getData() {
        return data;
    }
    public void setData(AT2CARSU0014Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Car Hire");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Carnect - Introducir la política de cancelación en la reserva");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        CommonProcedures.styleGuide(driver);
        return false;
    }
}
