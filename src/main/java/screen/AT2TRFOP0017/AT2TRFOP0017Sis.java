package screen.AT2TRFOP0017;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 02/01/2017.
 */
public class AT2TRFOP0017Sis {
    protected AT2TRFOP0017Locators locators;
    protected AT2TRFOP0017Data data;

    public AT2TRFOP0017Sis() {
    }
    public AT2TRFOP0017Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFOP0017Locators locators) {
        this.locators = locators;
    }
    public AT2TRFOP0017Data getData() {
        return data;
    }
    public void setData(AT2TRFOP0017Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("TRANSFER");
        driver.getTestdetails().setSubmenu("OPERATIONS");
        driver.getTestdetails().setScreen("Listado de Control de Escandallos YM");
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
