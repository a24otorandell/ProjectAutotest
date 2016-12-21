package screen.AT2MDMSP0036;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 21/12/2016.
 */
public class AT2MDMSP0036Sis {
    protected AT2MDMSP0036Locators locators;
    protected AT2MDMSP0036Data data;

    public AT2MDMSP0036Sis() {
    }
    public AT2MDMSP0036Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSP0036Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSP0036Data getData() {
        return data;
    }
    public void setData(AT2MDMSP0036Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        driver.getTestdetails().setTestname("AT2ACCSU0060");
        CommonProcedures.goToScreen(driver);
        driver.getTestdetails().setTestname("AT2MDMSP0036");
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Supplier");
        driver.getTestdetails().setScreen("B2B Hotels");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if(!search(driver)){return false;}
        if(!cambioPantalla(driver)){return false;}
        CommonProcedures.styleGuide(driver);
        return true;
    }

    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        Functions.break_time(driver, 4, 600);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean cambioPantalla (TestDriver driver) {
        if(!Functions.checkClick(driver,
                new String[]{"hotel_b_actions", getElements("hotel_b_actions")}, //element to click
                new String[]{"hotel_b_actions_b2b", getElements("hotel_b_actions_b2b")}, //element expected to appear
                "CAMBIO")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"hotel_b_actions_b2b", getElements("hotel_b_actions_b2b")}, //element to click
                "CAMBIO")){return false;}
        Functions.break_time(driver, 3, 600);
        return true;
    }
}
