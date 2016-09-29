package screen.AT2MDMOR0029;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * @author ajvirgili on 27/09/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2MDMOR0029Sis {

    protected AT2MDMOR0029Locators locators;
    protected AT2MDMOR0029Data data;

    public AT2MDMOR0029Sis(String enviroment) {
        setData(new AT2MDMOR0029Data(enviroment));
        setLocators(new AT2MDMOR0029Locators(enviroment));
    }

    public AT2MDMOR0029Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MDMOR0029Locators locators) {
        this.locators = locators;
    }

    public AT2MDMOR0029Data getData() {
        return data;
    }

    public void setData(AT2MDMOR0029Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("2.0");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
       /* if (!recordInteraction(driver, true)) {
            return false;
        }*/
        return false;
    }
}
