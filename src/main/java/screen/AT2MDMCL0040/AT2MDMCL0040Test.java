package screen.AT2MDMCL0040;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMCL0040Test {
    protected AT2MDMCL0040Locators locators;
    protected AT2MDMCL0040Data data;
    public AT2MDMCL0040Test() {
    }
    public AT2MDMCL0040Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0040Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0040Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0040Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen("Hotelopia Commercial Policy");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search_agency(driver)) return false;
        if (!qbe_agency(driver)) return false;
        if (!others_actions_agency(driver)) return false;
        return false;
    }

    private boolean search_agency(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.createLov(driver,
                new String[]{"search_lov_sap", getElements("search_lov_sap")}, //LoV button
                new String[]{"search_i_sap", getElements("search_i_sap")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "sap", //name of the data
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"search_i_code", getElements("search_i_code")},
                "code", "E10", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_short", getElements("search_i_short")},
                "short", "HOTELBEDS", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"credit_e_result", getElements("credit_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_agency(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"credit_e_result", getElements("credit_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"credit_b_qbe", getElements("credit_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short", getElements("qbe_i_short")},
                "short", getData("short"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"credit_e_result", getElements("credit_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_agency(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"credit_b_detach", getElements("credit_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
