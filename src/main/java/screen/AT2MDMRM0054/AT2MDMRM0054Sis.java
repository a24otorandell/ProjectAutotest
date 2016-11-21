package screen.AT2MDMRM0054;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 18/11/2016.
 */
public class AT2MDMRM0054Sis {
    protected AT2MDMRM0054Locators locators;
    protected AT2MDMRM0054Data data;
    public AT2MDMRM0054Sis() {
    }
    public AT2MDMRM0054Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0054Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0054Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0054Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Google Hotel feed report");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!search(driver)) return false;
        if (!getData(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_public_date_from",getElements("search_i_public_date_from")},
                "pfrom", "15/12/2014", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_public_date_to",getElements("search_i_public_date_to")},
                "pto", "15/12/2014", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_service_date_from",getElements("search_i_service_date_from")},
                "sfrom", "11/04/2015", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_service_date_to",getElements("search_i_service_date_to")},
                "sto", "12/04/2015", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination", getElements("search_lov_destination")}, //LoV button
                new String[]{"search_i_destination_", getElements("search_i_destination_")}, //external LoV input
                new String[]{"search_lov_destination_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "PMI", // value to search
                "dest", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")}, //LoV button
                new String[]{"search_i_hotel", getElements("search_i_hotel")}, //external LoV input
                new String[]{"ssearch_lov_hotel_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "9748", // value to search
                "hotel", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"query_e_result", getElements("query_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean getData (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " GET DATA";
        String[] columns = {"hotel", "dest", "sfrom", "sto", "market", "days","amount","currency", "name", "number", "", "rate", "public" };
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:t1::db')]",
                1, // row to give values
                where);
        Functions.getAttr(driver,
                new String[]{"element_chek", getElements("element_chek")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "liberate", // key for data value (the name)
                where);
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"query_b_qbe", getElements("query_b_qbe")},// query button
                new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")},
                "hotel", getData("hotel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "dest", getData("dest"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_from", getElements("qbe_i_date_from")},
                "sfrom", getData("sfrom"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date_to", getElements("qbe_i_date_to")},
                "sto", getData("sto"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_market", getElements("qbe_i_market")},
                "market", getData("market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_days", getElements("qbe_i_days")},
                "days", getData("days"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_amount", getElements("qbe_i_amount")},
                "amount", getData("amount"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_currency", getElements("qbe_i_currency")},
                "currency", getData("currency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contr_name", getElements("qbe_i_contr_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contr_number", getElements("qbe_i_contr_number")},
                "number", getData("number"), where)) {
            return false;
        }
        selectBox(driver);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_rate", getElements("qbe_i_rate")},
                "rate", getData("rate"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_public", getElements("qbe_i_public")},
                "public", getData("public"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_hotel", getElements("qbe_i_hotel")}, //any query input
                new String[]{"query_e_result", getElements("query_e_result")}, //table result
                where)){return false;}
        return true;
    }
    public boolean selectBox (TestDriver driver) {
        if (getData("liberate").equalsIgnoreCase("unchecked")) {
            if (!Functions.selectText(driver,
                    new String[]{"qbe_i_liberate",getElements("qbe_i_liberate")},
                    "No", "liberate", "SELECT TEXT")){return false;}
        }
        else {
            if (!Functions.selectText(driver,
                    new String[]{"qbe_i_liberate",getElements("qbe_i_liberate")},
                    "Yes", "liberate", "SELECT TEXT")){return false;}
        }
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"query_b_detach", getElements("query_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"query_b_delete", getElements("query_b_delete")},
                new String[]{"query_e_records", getElements("query_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
