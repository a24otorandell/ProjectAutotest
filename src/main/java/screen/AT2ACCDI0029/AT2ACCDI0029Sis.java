package screen.AT2ACCDI0029;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 18/10/2016.
 */

/**
 * BUG EN EL CAMPO DE CREACIÓN DE HOTEL CODE
 */
public class AT2ACCDI0029Sis {
    protected AT2ACCDI0029Locators locators;
    protected AT2ACCDI0029Data data;

    public AT2ACCDI0029Sis() {

    }

    public AT2ACCDI0029Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCDI0029Locators locators) {
        this.locators = locators;
    }

    public AT2ACCDI0029Data getData() {
        return data;
    }

    public void setData(AT2ACCDI0029Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Distribution");
        driver.getTestdetails().setScreen("");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {

        return false;
    }
}
