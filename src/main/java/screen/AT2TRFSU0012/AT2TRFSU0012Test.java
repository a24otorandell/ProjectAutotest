package screen.AT2TRFSU0012;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;


/**
 * Created by vsolis on 06/09/2016.
 */
public class AT2TRFSU0012Test {
    protected AT2TRFSU0012Locators locators;
    protected AT2TRFSU0012Data data;

    public AT2TRFSU0012Test() {

    }

    public AT2TRFSU0012Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0012Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0012Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0012Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("TTOO Quality Groups");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {
        if (!Transfer_area(driver)) {
            return false;
        }


        return false;
    }

    private boolean Transfer_area(TestDriver driver) {
        if (!Add_transfer_area(driver)) {
            return false;
        }


        return true;
    }

    private boolean Add_transfer_area(TestDriver driver) {

        driver.getReport().addHeader("ADD IN TRANSFER AREA", 3, false);

        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"b_add", getElements("b_add")}, //element to click
                new String[]{"add_i_code", getElements("add_i_code")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on ADD")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code", getElements("add_i_code")},
                "add_gro", "AG24", " on ADD")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"add_i_description", getElements("add_i_description")},
                "add_des", "Angel24", " on ADD")) {
            return false;
        }
        Functions.checkboxValue(driver,
                getElements("add_cb_terminal"), "false", false, true, " on ADD");


        Functions.checkClickByAbsence(driver,
                new String[]{"b_save", getElements("b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                90, 500,
                " on ADD");


        return true;
    }

}

