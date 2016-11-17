package screen.AT2TRFOP0016;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2TRFOP0016Sis {
    protected AT2TRFOP0016Locators locators;
    protected AT2TRFOP0016Data data;
    public AT2TRFOP0016Sis() {
    }
    public AT2TRFOP0016Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFOP0016Locators locators) {
        this.locators = locators;
    }
    public AT2TRFOP0016Data getData() {
        return data;
    }
    public void setData(AT2TRFOP0016Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfer");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Transfers pickup time SMS/Email sending 2.0");
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
