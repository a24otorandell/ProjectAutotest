package screen.AT2TRFSU0004;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

/**
 * Created by lchacartegui on 02/09/2016.
 */

/* - BUG 1: la lov country en popup de creacion no funciona
   - BUG 2: Las fechas en el popup de creación tienen formato dd/mm/aaa,
   pero en el motor de búsqueda el formato es ddmmaaa conlo que falla al buscar*/

public class AT2TRFSU0004Sis {
    protected AT2TRFSU0004Locators locators;
    protected AT2TRFSU0004Data data;

    public AT2TRFSU0004Sis() {
    }
    public AT2TRFSU0004Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TRFSU0004Locators locators) {
        this.locators = locators;
    }
    public AT2TRFSU0004Data getData() {
        return data;
    }
    public void setData(AT2TRFSU0004Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfer");
        driver.getTestdetails().setSubmenu("Set up");
        driver.getTestdetails().setScreen("Drivers");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        Functions.break_time(driver, 1000, 500);
        Functions.zoomOut(driver);
        if (!create(driver, true)) {
            return false;
        }
        if (!search(driver)) {
            return false;
        }
        if (!create(driver, false)) {
            return false;
        }
        if (!search(driver)) {
            return false;
        }
        if (!qbe(driver)) {
            return false;
        }
        if (!otherFunctions(driver)) {
            return false;
        }
        if (!delete(driver)) {
            return false;
        }
        return true;
    }
    /////////////// - ADD & EDIT - ///////////////
    private boolean create(TestDriver driver, boolean add) {
        String where;
        String[] element_result;
        String step;
        boolean checkbox_active;
        String date;

        if (add) {
            driver.getReport().addHeader("RECORD CREATION", 3, true);
            where = " on ADD ";
            element_result = recursiveXPaths.lov_e_result;
            step = " add";
            checkbox_active = true;
            date = DataGenerator.getToday(driver, "dd/MM/yyyy");

            if (!Functions.checkClick(driver,
                    new String[]{"add_b_add", getElements("add_b_add")},
                    recursiveXPaths.glass,
                    where)) {
                return false;
            }

        } else {
            driver.getReport().addHeader("RECORD EDITION", 3, true);
            where = " on EDIT ";
            element_result = recursiveXPaths.lov_e_altresult;
            step = " edit";
            checkbox_active = false;
            date = DataGenerator.getRelativeDateToday("dd/MM/yyyy", 2, 1, 0);

            if (!Functions.checkClick(driver,
                    new String[]{"add_b_edit", getElements("add_b_edit")},
                    recursiveXPaths.glass,
                    where)) {
                return false;
            }
        }

        if (!Functions.checkboxValue(driver,
                getElements("add_cb_active"), "active", checkbox_active, true, where)) {
            return false;
        }//where

        // En esta lov hay que introducir algún valor al buscar, no busca si está vacía.
        //Este campo falla en modo debugging, si lanzamos la pantalla normal o en manual va bien.
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_supplier", getElements("add_lov_supplier")}, //LoV button
                new String[]{"add_i_supplier", getElements("add_i_supplier")}, //external LoV input
                new String[]{"add_lov_supplier_i_supplier", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                element_result,
                "a", // value to search
                "supplier", //name of the data
                where)) {
            return false;
        } //where this operation occurs


        if (!Functions.createLov(driver,
                new String[]{"add_lov_language", getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                element_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "language", //Data name
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_incoming_driver_code", getElements("add_i_incoming_driver_code")},
                "incoming_driver_code",
                DataGenerator.getRandomAlphanumericSequence(5, true) + step,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_name", getElements("add_i_name")},
                "name",
                DataGenerator.getRandomAlphanumericSequence(5, true) + step,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_first_name", getElements("add_i_first_name")},
                "first_name",
                DataGenerator.getRandomAlphanumericSequence(5, true) + step,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_last_name", getElements("add_i_last_name")},
                "last_name",
                DataGenerator.getRandomAlphanumericSequence(5, true) + step,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_birthday_date", getElements("add_i_birthday_date")},
                "birthday_date",
                date,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_driver_license_date", getElements("add_i_driver_license_date")},
                "driver_license_date",
                date,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_driver_id", getElements("add_i_driver_id")},
                "driver_id",
                DataGenerator.getRandomAlphanumericSequence(5, true) + step,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_passport", getElements("add_i_passport")},
                "passport",
                DataGenerator.getRandomAlphanumericSequence(5, true) + step,
                where)) {
            return false;
        }

        //Esta lov no funciona (Error: invlaid column index)
        if (!Functions.createLov(driver,
                new String[]{"add_lov_country", getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                element_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_cancellation_date", getElements("add_i_cancellation_date")},
                "cancellation_date",
                date,
                where)) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"add_i_remarks", getElements("add_i_remarks")},
                "remarks",
                DataGenerator.getRandomAlphanumericSequence(10, true) + step,
                where)) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"add_e_supplier_des", getElements("add_e_supplier_des")}, // element path
                "supplier_des", // key for data value (the name)
                where)) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"add_e_language_des", getElements("add_e_language_des")}, // element path
                "language_des", // key for data value (the name)
                where)) {
            return false;
        }

        if (!Functions.getValue(driver, new String[]{"add_e_country_des", getElements("add_e_country_des")}, // element path
                "country_des", // key for data value (the name)
                where)) {
            return false;
        }


        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    /////////////// - SEARCH - ///////////////
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("RECORD SEARCH", 3, true);

        if (!Functions.selectText(driver,
                new String[]{"serach_sel_active", getElements("serach_sel_active")},
                getData("active"),
                "active",
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_supplier", getElements("search_lov_supplier")}, //LoV button
                new String[]{"search_i_supplier", getElements("search_i_supplier")}, //external LoV input
                new String[]{"search_lov_supplier_i_supplier", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("supplier"), // value to search
                "supplier", //name of the data
                " on SEARCH ")) {
            return false;
        } //where this operation occurs

        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_language", getElements("search_lov_language")}, //LoV button
                new String[]{"search_i_language", getElements("search_i_language")}, //external LoV input
                new String[]{"search_lov_language_i_codIdioma", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("language"), // value to search
                "language", //name of the data
                " on SEARCH ")) {
            return false;
        } //where this operation occurs

        if (!Functions.insertInput(driver,
                new String[]{"search_i_incoming_driver_code", getElements("search_i_incoming_driver_code")},
                "incoming_driver_code",
                getData("incoming_driver_code"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_name", getElements("search_i_name")},
                "name",
                getData("name"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_first_name", getElements("search_i_first_name")},
                "first_name",
                getData("first_name"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_last_name", getElements("search_i_last_name")},
                "last_name",
                getData("last_name"),
                " on SEARCH ")) {
            return false;
        }

        //El formato de fecha es diferente en creacion y falla
        if (!Functions.insertInput(driver,
                new String[]{"search_i_birthday_date", getElements("search_i_birthday_date")},
                "birthday_date",
                getData("birthday_date"),
                " on SEARCH ")) {
            return false;
        }

        //El formato de fecha es diferente en creacion y falla
        if (!Functions.insertInput(driver,
                new String[]{"search_i_driver_license_date", getElements("search_i_driver_license_date")},
                "driver_license_date",
                getData("driver_license_date"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_driver_id", getElements("search_i_driver_id")},
                "driver_id",
                getData("driver_id"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_passport", getElements("search_i_passport")},
                "passport",
                getData("passport"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_country", getElements("search_lov_country")}, //LoV button
                new String[]{"search_i_country", getElements("search_i_country")}, //external LoV input
                new String[]{"search_lov_country_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("country"), // value to search
                "country", //name of the data
                " on SEARCH ")) {
            return false;
        }

        //El formato de fecha es diferente en creacion y falla
        if (!Functions.insertInput(driver,
                new String[]{"search_i_cancellation_date", getElements("search_i_cancellation_date")},
                "cancellation_date",
                getData("cancellation_date"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_remarks", getElements("search_i_remarks")},
                "remarks",
                getData("remarks"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"search_i_coun_des", getElements("search_i_coun_des")},
                "country_des",
                getData("country_des"),
                " on SEARCH ")) {
            return false;
        }

        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
                " on SEARCH ")) {
            return false;
        }
        return true;
    }
    /////////////// - QBE - ///////////////
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("RECORD QBE", 3, true);

        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                " on QBE ")) {
            return false;
        }

        if (driver.getDriver().findElements(By.xpath(getElements("qbe_e_coun_des"))).size() < 1) {
            Functions.zoomOut(driver);
        }

        if (!Functions.clickQbE(driver,
                new String[]{"qbe_b_qbe", getElements("qbe_b_qbe")},// query button
                new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")},//any query input
                " on QBE ")) {
            return false;
        } // where the operation occurs

        if (!Functions.selectText(driver,
                new String[]{"qbe_sel_active", getElements("qbe_sel_active")},
                getData("active"),
                "active",
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_supplier", getElements("qbe_i_supplier")},
                "supplier",
                getData("supplier"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "supplier_des",
                getData("supplier_des"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "language",
                getData("language"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_language_des", getElements("qbe_i_language_des")},
                "language_des",
                getData("language_des"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_incoming_driver_code", getElements("qbe_i_incoming_driver_code")},
                "incoming_driver_code",
                getData("incoming_driver_code"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name",
                getData("name"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_first_name", getElements("qbe_i_first_name")},
                "first_name",
                getData("first_name"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_last_name", getElements("qbe_i_last_name")},
                "last_name",
                getData("last_name"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_birthday_date", getElements("qbe_i_birthday_date")},
                "birthday_date",
                getData("birthday_date"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_driver_license_date", getElements("qbe_i_driver_license_date")},
                "driver_license_date",
                getData("driver_license_date"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_driver_id", getElements("qbe_i_driver_id")},
                "driver_id",
                getData("driver_id"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_passport", getElements("qbe_i_passport")},
                "passport",
                getData("passport"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_country", getElements("qbe_i_country")},
                "country",
                getData("country"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_cancellation_date", getElements("qbe_i_cancellation_date")},
                "cancellation_date",
                getData("cancellation_date"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_remarks", getElements("qbe_i_remarks")},
                "remarks",
                getData("remarks"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.insertInput(driver,
                new String[]{"qbe_i_coun_des", getElements("qbe_i_coun_des")},
                "country_des",
                getData("country_des"),
                " on QBE ")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_remarks", getElements("qbe_i_remarks")}, //any query input
                new String[]{"search_e_result", getElements("search_e_result")}, //table result
                " on QBE ")) {
            return false;
        } // where this operation occurs

        return true;
    }
    private boolean otherFunctions(TestDriver driver) {
        driver.getReport().addHeader("RECORD OTHER FUNCTIONS", 3, true);

        if (!Functions.auditData(driver,
                new String[]{"actions_b_actions", getElements("actions_b_actions")}, //actions button
                new String[]{"actions_b_audit", getElements("actions_b_audit")}, //audit button
                new String[]{"actions_b_audit_b_close", getElements("actions_b_audit_b_close")}, //audit_b_ok
                false, //zoom in??
                " on AUDIT DATA ")) {
            return false;
        } //where this occurs

        if (!Functions.detachTable(driver,
                new String[]{"detach_b_detach", getElements("detach_b_detach")}, //detach button
                true,     //screenshot??
                false, //zoom in??
                " on DETACH ")) {
            return false;
        }    //where this occurs
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("RECORD DELETE", 3, true);

        if (!Functions.doDeleteNCheck(driver,
                new String[]{"delete_b_delete", getElements("delete_b_delete")},
                new String[]{"search_n_records", getElements("search_n_records")},
                new String[]{"delete_b_delete_b_yes", recursiveXPaths.delete_b_yes},
                " on DELETE, TABLE: Tour Operator ")) {
            return false;
        }
        return true;
    }
}
