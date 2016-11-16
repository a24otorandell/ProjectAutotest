package screen.AT2MSCSU0002;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MSCSU0002Test {
    protected AT2MSCSU0002Locators locators;
    protected AT2MSCSU0002Data data;
    public AT2MSCSU0002Test() {
    }
    public AT2MSCSU0002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MSCSU0002Locators locators) {
        this.locators = locators;
    }
    public AT2MSCSU0002Data getData() {
        return data;
    }
    public void setData(AT2MSCSU0002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Miscallaneous");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("MassiveLoadUtility 2.0");
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
