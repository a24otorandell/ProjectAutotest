package screen.AT2ACCOP0025;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/***
 * Created by ajvirgili on 23/06/2016.
 */
public class AT2ACCOP0025Test {

    protected AT2ACCOP0025Locators locators;
    protected AT2ACCOP0025Data data;

    public AT2ACCOP0025Test() {

    }

    public AT2ACCOP0025Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCOP0025Locators locators) {
        this.locators = locators;
    }

    public AT2ACCOP0025Data getData() {
        return data;
    }

    public void setData(AT2ACCOP0025Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Commissions Rules 2.0");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (recordInteraction(driver, true)) {
            if (search(driver)) {
                if (recordInteraction(driver, false)) {
                    if (search(driver)) {
                        if (delete(driver)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /***
     * @param driver TestDriver
     * @param add    Boolean
     * @return Boolean
     */
    protected boolean recordInteraction(TestDriver driver, boolean add) {

        if (add) {
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"record_interaction_b_add", getElements("record_interaction_b_add")},
                    new String[]{"glass", recursiveXPaths.glass}, "")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_initialDate", getElements("record_interaction_b_add_i_initialDate")},
                    "initial_date",
                    getData("initial_date"),
                    " on ADD")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_endDate", getElements("record_interaction_b_add_i_endDate")},
                    "end_date",
                    getData("end_date"),
                    " on ADD")) {
                return false;
            }
            System.out.println(getElements("record_interaction_b_add_lov_provider_i_provider"));
            if (!Functions.createLov(driver,
                    new String[]{"record_interaction_b_add_lov_provider", getElements("record_interaction_b_add_lov_provider")},
                    new String[]{"record_interaction_b_add_lov_provider_i_provider", getElements("record_interaction_b_add_lov_provider_i_provider")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "provider",
                    " on ADD")) {
                return false;
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_provider", getElements("record_interaction_b_add_i_provider")},
                    "provider",
                    getData("provider"),
                    " on ADD")) {
                return false;
            }*/
            if (!Functions.createLov(driver,
                    new String[]{"record_interaction_b_add_lov_merchant", getElements("record_interaction_b_add_lov_merchant")},
                    new String[]{"record_interaction_b_add_lov_merchant_i_merchant", getElements("record_interaction_b_add_lov_merchant_i_merchant")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "merchant",
                    " on ADD")) {
                return false;
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_merchant", getElements("record_interaction_b_add_i_merchant")},
                    "merchant",
                    getData("merchant"),
                    " on ADD")) {
                return false;
            }*/
            if (!Functions.createLov(driver,
                    new String[]{"record_interaction_b_add_lov_paymentMethod", getElements("record_interaction_b_add_lov_paymentMethod")},
                    new String[]{"record_interaction_b_add_lov_paymentMethod_i_paymentMethod", getElements("record_interaction_b_add_lov_paymentMethod_i_paymentMethod")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "payment_method",
                    " on ADD")) {
                return false;
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_paymentMethod", getElements("record_interaction_b_add_i_paymentMethod")},
                    "payment_method",
                    getData("payment_method"),
                    " on ADD")) {
                return false;
            }*/
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_fix", getElements("record_interaction_b_add_i_fix")},
                    "fix",
                    getData("fix"),
                    " on ADD")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_percentage", getElements("record_interaction_b_add_i_percentage")},
                    "percentage",
                    getData("percentage"),
                    " on ADD")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"record_interaction_b_add_lov_currencyFix", getElements("record_interaction_b_add_lov_currencyFix")},
                    new String[]{"record_interaction_b_add_lov_currencyFix_i_currencyFix", getElements("record_interaction_b_add_lov_currencyFix_i_currencyFix")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "currency_fix",
                    " on ADD")) {
                return false;
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_currencyFix", getElements("record_interaction_b_add_i_currencyFix")},
                    "currency_fix",
                    getData("currency_fix"),
                    " on ADD")) {
                return false;
            }*/
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"record_interaction_b_add_b_save", getElements("record_interaction_b_add_b_save")},
                    new String[]{"glass", recursiveXPaths.glass},
                    " on ADD")) {
                return false;
            }
        } else {

            if (!Functions.checkClick(driver,
                    new String[]{"record_interaction_b_edit", getElements("record_interaction_b_edit")},
                    new String[]{"glass", recursiveXPaths.glass},
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_initialDate", getElements("record_interaction_b_add_i_initialDate")},
                    "initial_date",
                    getData("update_initial_date"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_endDate", getElements("record_interaction_b_add_i_endDate")},
                    "end_date",
                    getData("update_end_date"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"record_interaction_b_add_lov_provider", getElements("record_interaction_b_add_lov_provider")},
                    new String[]{"record_interaction_b_add_lov_provider_i_provider", getElements("record_interaction_b_add_lov_provider_i_provider")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "update_provider",
                    " on EDIT")) {
                return false;
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_provider", getElements("record_interaction_b_add_i_provider")},
                    "provider",
                    getData("update_provider"),
                    " on EDIT")) {
                return false;
            }*/
            if (!Functions.createLov(driver,
                    new String[]{"record_interaction_b_add_lov_merchant", getElements("record_interaction_b_add_lov_merchant")},
                    new String[]{"record_interaction_b_add_lov_merchant_i_merchant", getElements("record_interaction_b_add_lov_merchant_i_merchant")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "update_merchant",
                    " on EDIT")) {
                return false;
            }
            /*if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_merchant", getElements("record_interaction_b_add_i_merchant")},
                    "merchant",
                    getData("update_merchant"),
                    " on EDIT")) {
                return false;
            }*/
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_paymentMethod", getElements("record_interaction_b_add_i_paymentMethod")},
                    "payment_method",
                    getData("update_payment_method"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_fix", getElements("record_interaction_b_add_i_fix")},
                    "fix",
                    getData("update_fix"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_percentage", getElements("record_interaction_b_add_i_percentage")},
                    "percentage",
                    getData("update_percentage"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"record_interaction_b_add_i_currencyFix", getElements("record_interaction_b_add_i_currencyFix")},
                    "currency_fix",
                    getData("update_currency_fix"),
                    " on EDIT")) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"record_interaction_b_add_b_save", getElements("record_interaction_b_add_b_save")},
                    new String[]{"glass", recursiveXPaths.glass},
                    " on EDIT")) {
                return false;
            }
        }

        return true;
    }

    /***
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean search(TestDriver driver) {
        try {
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_initialDate", getElements("search_i_initialDate")},
                    "initial_date",
                    getData("initial_date"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_endDate", getElements("search_i_endDate")},
                    "end_date",
                    getData("end_date"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_initialDate2", getElements("search_i_initialDate2")},
                    "initial_date2",
                    getData("initial_date"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_endDate2", getElements("search_i_endDate2")},
                    "end_date2",
                    getData("end_date"),
                    " on SEARCH")) {
                return false;
            }
           /* break_time(driver,5,400,getElements("search_i_provider"));*/
            if (!Functions.createLov(driver,
                    new String[]{"search_lov_provider", getElements("search_lov_provider")},
                    new String[]{"search_lov_provider_i_provider", getElements("search_lov_provider_i_provider")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "provider",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"search_lov_merchant", getElements("search_lov_merchant")},
                    new String[]{"search_lov_merchant_i_merchant", getElements("search_lov_merchant_i_merchant")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "merchant",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"search_lov_paymentMethod", getElements("search_lov_paymentMethod")},
                    new String[]{"search_lov_paymentMethod_i_paymentMethod", getElements("search_lov_paymentMethod_i_paymentMethod")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "payment_method",
                    " on SEARCH")) {
                return false;
            }

            if (!Functions.insertInput(driver,
                    new String[]{"search_i_fix", getElements("search_i_fix")},
                    "fix",
                    getData("fix"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"search_lov_currencyFix", getElements("search_lov_currencyFix")},
                    new String[]{"search_lov_currencyFix_i_currency", getElements("search_lov_currencyFix_i_currency")},
                    recursiveXPaths.lov_b_search,
                    recursiveXPaths.lov_e_result,
                    recursiveXPaths.lov_b_ok,
                    "currency_fix",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_percentage", getElements("search_i_percentage")},
                    "percentage",
                    getData("percentage"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"search_b_search", getElements("search_b_search")},
                    " on SEARCH")) {
                return false;
            }
            Thread.sleep(2800);
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

    /***
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean delete(TestDriver driver) {
        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"search_e_result", getElements("search_e_result")},
                    " on DELETE")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"record_interaction_b_remove", getElements("record_interaction_b_remove")},
                    " on DELETE")) {
                return false;
            }
            Thread.sleep(2800);
            if (!Functions.simpleClick(driver,
                    new String[]{"record_interaction_b_remove_b_ok", recursiveXPaths.delete_b_yes},
                    " on DELETE")) {
                return false;
            }
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        return true;
    }

    /***
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean reset(TestDriver driver) {
        if (driver.getDriver().findElements(By.xpath(recursiveXPaths.glass)).size() > 0) {
            if (driver.getDriver().findElements(By.xpath(getElements("alert_b_ok"))).size() > 0) {
                if (!Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on RESET")) {
                    return false;
                }
            }
            if (driver.getDriver().findElements(By.xpath(getElements("record_interaction_b_cancel"))).size() > 0) {
                if (!Functions.simpleClick(driver,
                        new String[]{"record_interaction_b_cancel", getElements("record_interaction_b_cancel")},
                        " on RESET")) {
                    return false;
                }
                if (!Functions.simpleClick(driver,
                        new String[]{"record_interaction_b_cancel_b_ok", getElements("record_interaction_b_cancel_b_ok")},
                        " on RESET")) {
                    return false;
                }
            }
        }
        return true;
    }

    /***
     * @param driver TestDriver
     * @return Boolean
     */

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

    private void break_time(TestDriver driver, int seconds, long miliseconds, String element) {

        try {
            System.out.println("Searching time");
            WebDriverWait wdw = new WebDriverWait(driver.getDriver(), seconds, miliseconds);
            wdw.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
            System.out.println("Searching time finished");
        } catch (Exception e) {
            String ecode = "--ERROR: Time waiting finished and the system continue in working";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
    }
}
