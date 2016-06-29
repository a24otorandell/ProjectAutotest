package screen.AT2ACCOP0025;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

/***
 * Created by ajvirgili on 23/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
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
                        if (reset(driver)) {
                            if (auditDetach(driver)) {
                                if (qbe(driver)) {
                                    if (delete(driver)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /***
     * @param driver TestDriver
     * @param type   boolean que controla el flujo inicial para saber si creamos o modificamos el registro
     * @return Boolean
     */
    protected boolean recordInteraction(TestDriver driver, boolean type) {
        String on, update = "";
        if (type) {
            on = "on ADD";
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"record_interaction_b_add", getElements("record_interaction_b_add")},
                    new String[]{"glass", recursiveXPaths.glass}, "")) {
                return false;
            }
        } else {
            update = "update_";
            on = "on EDIT";
            if (!Functions.checkClick(driver,
                    new String[]{"record_interaction_b_edit", getElements("record_interaction_b_edit")},
                    new String[]{"glass", recursiveXPaths.glass},
                    on)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_add_i_initialDate", getElements("record_interaction_b_add_i_initialDate")},
                "initial_date",
                getData(update + "initial_date"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_add_i_endDate", getElements("record_interaction_b_add_i_endDate")},
                "end_date",
                getData(update + "end_date"),
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"record_interaction_b_add_lov_provider", getElements("record_interaction_b_add_lov_provider")},
                new String[]{"record_interaction_b_add_i_provider", getElements("record_interaction_b_add_i_provider")},
                new String[]{"record_interaction_b_add_lov_provider_i_provider", getElements("record_interaction_b_add_lov_provider_i_provider")},
                getData(update + "provider"),
                "provider",
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"record_interaction_b_add_lov_merchant", getElements("record_interaction_b_add_lov_merchant")},
                new String[]{"record_interaction_b_add_i_merchant", getElements("record_interaction_b_add_i_merchant")},
                new String[]{"record_interaction_b_add_lov_merchant_i_merchant", getElements("record_interaction_b_add_lov_merchant_i_merchant")},
                getData(update + "merchant"),
                "merchant",
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"record_interaction_b_add_lov_paymentMethod", getElements("record_interaction_b_add_lov_paymentMethod")},
                new String[]{"record_interaction_b_add_i_paymentMethod", getElements("record_interaction_b_add_i_paymentMethod")},
                new String[]{"record_interaction_b_add_lov_paymentMethod_i_paymentMethod", getElements("record_interaction_b_add_lov_paymentMethod_i_paymentMethod")},
                getData(update + "payment_method"),
                "payment_method",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_add_i_fix", getElements("record_interaction_b_add_i_fix")},
                "fix",
                getData(update + "fix"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_add_i_percentage", getElements("record_interaction_b_add_i_percentage")},
                "percentage",
                getData(update + "percentage"),
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"record_interaction_b_add_lov_currencyFix", getElements("record_interaction_b_add_lov_currencyFix")},
                new String[]{"record_interaction_b_add_i_currencyFix", getElements("record_interaction_b_add_i_currencyFix")},
                new String[]{"record_interaction_b_add_lov_currencyFix_i_currency", getElements("record_interaction_b_add_lov_currencyFix_i_currency")},
                getData(update + "currency_fix"),
                "currency_fix",
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"record_interaction_b_add_b_save", getElements("record_interaction_b_add_b_save")},
                new String[]{"glass", recursiveXPaths.glass},
                on)) {
            return false;
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
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_provider", getElements("search_lov_provider")},
                    new String[]{"search_i_provider", getElements("search_i_provider")},
                    new String[]{"search_lov_provider_i_provider", getElements("search_lov_provider_i_provider")},
                    getData("provider"),
                    "provider",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_merchant", getElements("search_lov_merchant")},
                    new String[]{"search_i_merchant", getElements("search_i_merchant")},
                    new String[]{"search_lov_merchant_i_merchant", getElements("search_lov_merchant_i_merchant")},
                    getData("merchant"),
                    "merchant",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_paymentMethod", getElements("search_lov_paymentMethod")},
                    new String[]{"search_i_paymentMethod", getElements("search_i_paymentMethod")},
                    new String[]{"search_lov_paymentMethod_i_paymentMethod", getElements("search_lov_paymentMethod_i_paymentMethod")},
                    getData("payment_method"),
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
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_currencyFix", getElements("search_lov_currencyFix")},
                    new String[]{"search_i_currencyFix", getElements("search_i_currencyFix")},
                    new String[]{"search_lov_currencyFix_i_currencyFix", getElements("search_lov_currencyFix_i_currencyFix")},
                    getData("currency_fix"),
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
    protected boolean qbe(TestDriver driver) {
        //Functions.zoomOut(driver);
        if (!Functions.clickQbE(driver,
                new String[]{"record_interaction_b_qbe", getElements("record_interaction_b_qbe")},
                new String[]{"record_interaction_qbe_i_initialDate", getElements("record_interaction_qbe_i_initialDate")},
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_initialDate", getElements("record_interaction_qbe_i_initialDate")},
                "update_initial_date",
                getData("update_initial_date"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_endDate", getElements("record_interaction_qbe_i_endDate")},
                "update_end_date",
                getData("update_end_date"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_provider", getElements("record_interaction_qbe_i_provider")},
                "update_provider",
                getData("update_provider"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_provider_description", getElements("record_interaction_qbe_i_provider_description")},
                "update_provider_description",
                getData("update_provider_description"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_merchant", getElements("record_interaction_qbe_i_merchant")},
                "update_merchant",
                getData("update_merchant"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_submerchant", getElements("record_interaction_qbe_i_submerchant")},
                "update_submerchant",
                getData("update_submerchant"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_payment_method", getElements("record_interaction_qbe_i_payment_method")},
                "update_payment_method",
                getData("update_payment_method"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_payment_method_description", getElements("record_interaction_qbe_i_payment_method_description")},
                "update_payment_method_description",
                getData("update_payment_method_description"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_fix", getElements("record_interaction_qbe_i_fix")},
                "update_fix",
                getData("update_fix"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_currency_fix", getElements("record_interaction_qbe_i_currency_fix")},
                "update_currency_fix",
                getData("update_currency_fix"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_currency_fix_description", getElements("record_interaction_qbe_i_currency_fix_description")},
                "update_currency_fix_description",
                getData("update_currency_fix_description"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_qbe_i_percentage", getElements("record_interaction_qbe_i_percentage")},
                "update_percentage",
                getData("update_percentage"),
                " on QBE")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on QBE")) {
            return false;
        }
        return true;
    }

    /***
     * @param driver TestDriver
     * @return boolean
     */
    protected boolean auditDetach(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"search_e_result", getElements("search_e_result")},
                " on Data History")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_dataHistory", getElements("record_interaction_b_dataHistory")},
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok},
                " on Data History")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"record_interaction_b_fullPage", getElements("record_interaction_b_fullPage")},
                false,
                " on Detach table"
        )) {
            return false;
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
                    new String[]{"record_interaction_b_remove_b_ok", getElements("record_interaction_b_remove_b_ok")},
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

        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")},
                " on RESET")) {
            return false;
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

}
