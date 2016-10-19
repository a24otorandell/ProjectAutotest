package screen.AT2MDMCL0030;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

/**
 * @author otorandell on 29/12/2015.
 */
public class AT2MDMCL0030Test {
    protected AT2MDMCL0030Locators locators;
    protected AT2MDMCL0030Data data;

    public AT2MDMCL0030Test(String enviroment) {
        setData(new AT2MDMCL0030Data(enviroment));
        setLocators(new AT2MDMCL0030Locators(enviroment));
    }
    public AT2MDMCL0030Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0030Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0030Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0030Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen("Partner agency parameters 2.0");
    }
    protected String getElements(String key) {
        return this.locators.getElements().get(key);
    }
    protected String getData(String key) {
        return this.data.getData().get(key);
    }

    protected boolean testCSED(TestDriver driver) {

        if (recordInteraction(driver, true)) {
            if (search(driver)) {
                if (recordInteraction(driver, false)) {
                    if (qbe(driver)) {
                        if (detach(driver)) {
                            if (delete(driver)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * @param driver TestDriver
     * @param add    boolean
     * @return boolean
     */
    protected boolean recordInteraction(TestDriver driver, boolean add) {
        Functions.break_time(driver, 2, 0);
        if (add) {
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"record_interaction_b_add", getElements("record_interaction_b_add")},
                    recursiveXPaths.glass,
                    "")) {
                return false;

            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_i_param_name", getElements("record_interaction_i_param_name")},
                    "param_name",
                    getData("param_name"),
                    " on ADD")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_i_param_value", getElements("record_interaction_i_param_value")},
                    "param_value",
                    getData("param_value"),
                    " on ADD")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_i_age_ext_code", getElements("record_interaction_i_age_ext_code")},
                    "age_ext_code",
                    getData("age_ext_code"),
                    " on ADD")) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"record_interaction_b_save", getElements("record_interaction_b_save")},
                    recursiveXPaths.glass,
                    " on ADD")) {
                return false;
            }

        } else {

            if (!Functions.checkClick(driver,
                    new String[]{"record_interaction_b_edit", getElements("record_interaction_b_edit")},
                    recursiveXPaths.glass,
                    "")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_i_param_name", getElements("record_interaction_i_param_name")},
                    "param_name",
                    getData("update_" + "param_name"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_i_param_value", getElements("record_interaction_i_param_value")},
                    "param_value",
                    getData("update_" + "param_value"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_i_age_ext_code", getElements("record_interaction_i_age_ext_code")},
                    "age_ext_code",
                    getData("update_" + "age_ext_code"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"record_interaction_b_save", getElements("record_interaction_b_save")},
                    recursiveXPaths.glass,
                    " on EDIT")) {
                return false;
            }

        }
        return true;
    }
    protected boolean search(TestDriver driver) {

        try {
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_param_name", getElements("search_i_param_name")},
                    "param_name",
                    getData("param_name"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_param_value", getElements("search_i_param_value")},
                    "param_value",
                    getData("param_value"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_age_ext_code", getElements("search_i_age_ext_code")},
                    "age_ext_code",
                    getData("age_ext_code"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"search_b_search", getElements("search_b_search")},
                    " on SEARCH")) {
                return false;
            }
            Functions.break_time(driver, 3, 0);
            if (!Functions.simpleClick(driver,
                    new String[]{"search_e_result", getElements("search_e_result")},
                    " on SEARCH")) {
                return false;
            }
        } catch (Exception search) {

            search.printStackTrace();
        }
        return true;
    }
    protected boolean delete(TestDriver driver) {

        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"search_e_result", getElements("search_e_result")},
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"delete_b_delete", getElements("delete_b_delete")},
                    " on SEARCH")) {
                return false;
            }
            Functions.break_time(driver, 3, 0);
            if (!Functions.simpleClick(driver,
                    new String[]{"delete_b_yes", recursiveXPaths.delete_b_yes},
                    " on SEARCH")) {
                return false;
            }
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        Functions.break_time(driver, 2, 0);
        return true;
    }
    protected boolean reset(TestDriver driver) {
        if (driver.getDriver().findElements(By.xpath(recursiveXPaths.glass[1])).size() > 0) {
            if (driver.getDriver().findElements(By.xpath(getElements("alert_b_ok"))).size() > 0) {
                if (!Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on SEARCH")) {
                    return false;
                }
            }
            if (driver.getDriver().findElements(By.xpath(getElements("record_interaction_b_cancel"))).size() > 0) {
                if (!Functions.simpleClick(driver,
                        new String[]{"record_interaction_b_cancel", getElements("record_interaction_b_cancel")},
                        " on SEARCH")) {
                    return false;
                }
                if (!Functions.simpleClick(driver,
                        new String[]{"record_interaction_b_cancel_b_ok", getElements("record_interaction_b_cancel_b_ok")},
                        " on SEARCH")) {
                    return false;
                }
            }
        }
        if (driver.getDriver().findElements(By.xpath(getElements("alert_b_ok"))).size() > 0) {

        }
        return true;
    }
    protected boolean qbe(TestDriver driver) {
        this.enabler(driver);
        driver.getReport().addHeader("QBE SEARCH RECORD:", 4, false);
        if (!Functions.clickQbE(driver,
                new String[]{"record_interaction_b_qbe", getElements("record_interaction_b_qbe")},
                new String[]{"record_interaction_b_qbe_i_param_name", getElements("record_interaction_b_qbe_i_param_name")},
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_param_name", getElements("record_interaction_b_qbe_i_param_name")},
                "param_name",
                getData("param_name"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_param_value", getElements("record_interaction_b_qbe_i_param_value")},
                "param_value",
                getData("param_value"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_age_ext_code", getElements("record_interaction_b_qbe_i_age_ext_code")},
                "age_ext_code",
                getData("age_ext_code"),
                " on QBE")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"record_interaction_b_qbe_i_param_name", getElements("record_interaction_b_qbe_i_param_name")},
                new String[]{"search_n_records", getElements("search_n_records")},
                " on QBE")) {
            return false;
        }
        return true;
    }
    protected boolean detach(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"search_n_records", getElements("search_n_records")},
                " on Data History")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"record_interaction_b_detach", getElements("record_interaction_b_detach")},
                true,
                " on Detach table")) {
            return false;
        }
        return true;
    }
    protected boolean enabler(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")},
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on SEARCH")) {
            return false;
        }
        return true;
    }
}
