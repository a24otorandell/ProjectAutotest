package screen.AT2MDMSP0028;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0028Test {
    protected AT2MDMSP0028Locators locators;
    protected AT2MDMSP0028Data data;
    public AT2MDMSP0028Test() {
    }
    public AT2MDMSP0028Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0028Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0028Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0028Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Suppliers");
        driver.getTestdetails().setScreen("Supplier manual creation");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!selectOption(driver)) return false;
        CommonProcedures.styleGuide(driver);
        return true;
    }

    public boolean selectOption (TestDriver driver) {
        if (!Functions.selectText(driver,
                new String[]{"select_text_supplier",getElements("select_text_supplier")},
                "Hotel Only", "select", "Select option")){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"select_text_supplier_ok", getElements("select_text_supplier_ok")}, //element to click
                recursiveXPaths.glass,
                "Select option")){return false;}
        return true;
    }
}
