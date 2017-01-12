package screen.AT2MDMCL0001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * Created by acarrillo on 11/01/2017.
 */
public class AT2MDMCL0001Test {
    protected AT2MDMCL0001Locators locators;
    protected AT2MDMCL0001Data data;

    public AT2MDMCL0001Test() {
    }
    public AT2MDMCL0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0001Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0001Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("MDM");
        driver.getTestdetails().setSubmenu("Client");
        driver.getTestdetails().setScreen("Client Managment");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!create_record(driver))return false;
        if (!search(driver))return false;
        if (!qbe(driver))return false;
        return true;
    }

    private boolean create_record(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION RECROD";
        if (!Functions.checkClick(driver,
                new String[] {"results_b_add",getElements("results_b_add")},
                new String[] {"creation_ls_administrative_customer",getElements("creation_ls_administrative_customer")},
                where))return false;

        if (!Functions.selectText(driver,
                new String[]{"creation_ls_administrative_customer", getElements("creation_ls_administrative_customer")},
                getData("administrative_customer"), "administrative_customer", where)){return false;}
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_atlas_short_name",getElements("creation_i_atlas_short_name")},
                "short_name",getData("short_name"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_commercial_name",getElements("creation_i_commercial_name")},
                "commercial_name",getData("commercial_name"),where))return false;
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_relationship", getElements("creation_ls_relationship")},
                getData("relationship"), "relationship", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_division", getElements("creation_ls_division")},
                getData("division"), "division", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_direct_hotel_payment", getElements("creation_ls_direct_hotel_payment")},
                getData("direct_hotel_payment"), "direct_hotel_payment", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_source_market", getElements("creation_ls_source_market")},
                getData("source_market"), "source_market", where)){return false;}
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_office_comments",getElements("creation_i_office_comments")},
                "office_comments",getData("office_comments"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_fiscal_number",getElements("creation_i_fiscal_number")},
                "fiscal_number",getData("fiscal_number"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_fiscal_name",getElements("creation_i_fiscal_name")},
                "fiscal_number",getData("fiscal_number"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_administrative_street",getElements("creation_i_administrative_street")},
                "administrative_street",getData("administrative_street"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_city",getElements("creation_i_city")},
                "city",getData("city"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_post_code",getElements("creation_i_post_code")},
                "post_code",getData("post_code"),where))return false;
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_country", getElements("creation_ls_country")},
                getData("country"), "country", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_province", getElements("creation_ls_province")},
                getData("province"), "province", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_billing_language", getElements("creation_ls_billing_language")},
                getData("billing_language"), "billing_language", where)){return false;}
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_administrative_phone",getElements("creation_i_administrative_phone")},
                "administrative_phone",getData("administrative_phone"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_administrative_email",getElements("creation_i_administrative_email")},
                "administrative_email",getData("administrative_email"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_fax",getElements("creation_i_fax")},
                "fax",getData("fax"),where))return false;
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_contact_language", getElements("creation_ls_contact_language")},
                getData("contact_language"), "contact_language", where)){return false;}
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_commercial_street",getElements("creation_i_commercial_street")},
                "commercial_street",getData("commercial_street"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_account_owner",getElements("creation_i_account_owner")},
                "account_owner",getData("account_owner"),where))return false;
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_salutation", getElements("creation_ls_salutation")},
                getData("salutation"), "salutation", where)){return false;}

        if (!Functions.insertInput(driver,
                new String[] {"creation_i_first_name",getElements("creation_i_first_name")},
                "first_name",getData("first_name"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_last_name",getElements("creation_i_last_name")},
                "last_name",getData("last_name"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_comercial_phone",getElements("creation_i_comercial_phone")},
                "comercial_phone",getData("comercial_phone"),where))return false;
        if (!Functions.insertInput(driver,
                new String[] {"creation_i_commercial_email",getElements("creation_i_commercial_email")},
                "commercial_email",getData("commercial_email"),where))return false;
        if (!Functions.selectText(driver,
                new String[]{"creation_ls_currency_to_invoice", getElements("creation_ls_currency_to_invoice")},
                getData("currency_to_invoice"), "currency_to_invoice", where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[] {"creation_b_register",getElements("creation_b_register")},
                new String[] {"creation_b_register",getElements("creation_b_register")},
                where))return false;
        return true;
    }
    private boolean search(TestDriver driver) {

        return true;
    }
    private boolean qbe (TestDriver driver){

        return true;
    }
}
