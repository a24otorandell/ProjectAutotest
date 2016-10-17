package screen.AT2ACCOP0004;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCOP0004Sis {
    protected AT2ACCOP0004Locators locators;
    protected AT2ACCOP0004Data data;

    public AT2ACCOP0004Sis() {
    }

    public AT2ACCOP0004Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCOP0004Locators locators) {
        this.locators = locators;
    }

    public AT2ACCOP0004Data getData() {
        return data;
    }

    public void setData(AT2ACCOP0004Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BIBIT Blacklist query");
        driver.getTestdetails().setSubmenu("Accommodation");
        driver.getTestdetails().setScreen("Operations");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
       /* if (!search_accommodation(driver)) return false;
        if (!qbe_accommodation(driver)) return false;
        if (!others_actions_accommodation(driver)) return false;*/
        return false;
    }
}

