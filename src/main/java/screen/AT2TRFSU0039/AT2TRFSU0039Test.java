package screen.AT2TRFSU0039;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 02/01/2017.
 */
public class AT2TRFSU0039Test {
    protected AT2TRFSU0039Locators locators;
    protected AT2TRFSU0039Data data;

    public AT2TRFSU0039Test() {
    }
    public AT2TRFSU0039Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFSU0039Locators locators) {
        this.locators = locators;
    }
    public AT2TRFSU0039Data getData() {
        return data;
    }
    public void setData(AT2TRFSU0039Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("TRANSFER");
        driver.getTestdetails().setSubmenu("SET UP");
        driver.getTestdetails().setScreen("Sentence Template");
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
