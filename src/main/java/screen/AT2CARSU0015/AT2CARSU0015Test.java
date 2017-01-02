package screen.AT2CARSU0015;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 02/01/2017.
 */
public class AT2CARSU0015Test {
    protected AT2CARSU0015Locators locators;
    protected AT2CARSU0015Data data;

    public AT2CARSU0015Test() {
    }
    public AT2CARSU0015Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2CARSU0015Locators locators) {
        this.locators = locators;
    }
    public AT2CARSU0015Data getData() {
        return data;
    }
    public void setData(AT2CARSU0015Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("CAR HIRE");
        driver.getTestdetails().setSubmenu("SET UP");
        driver.getTestdetails().setScreen("Carhire destination");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        CommonProcedures.styleGuide(driver);
        return true;
    }
}
