package screen.AT2MSCSU0007;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

//import java.util.concurrent.TimeUnit;

/**
 * @author ajvirgili on 08/09/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2MSCSU0007Test {

    protected AT2MSCSU0007Locators locators;
    protected AT2MSCSU0007Data data;

    public AT2MSCSU0007Test(String enviroment) {
        setLocators(new AT2MSCSU0007Locators(enviroment));
        setData(new AT2MSCSU0007Data(enviroment));
    }

    public AT2MSCSU0007Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2MSCSU0007Locators locators) {
        this.locators = locators;
    }

    public AT2MSCSU0007Data getData() {
        return data;
    }

    public void setData(AT2MSCSU0007Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Miscellaneous");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Country Market by IP 2.0");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!recordInteractionUrlCountry(driver, true)) { // creamos una url
            return false;
        }
        if (!searchUrlCountry(driver)) { // Buscamos la url creada
            return false;
        }
        if (!recordInteractionUrlCountry(driver, false)) {  // editamos la url creada
            return false;
        }
        if (!auditDetachUrl(driver)) { // data history y detach
            return false;
        }
        if (!changeTab(driver, "tab_available_web")) { // cambiamos de pestaña
            return false;
        }
        if (!recordInteractionAvailableWeb(driver, true)) { // creamos una web disponible
            return false;
        }
        if (!searchAvailableWeb(driver)) { //buscamos la web creada
            return false;
        }
        if (!recordInteractionAvailableWeb(driver, false)) { // editamos la web creada
            return false;
        }
        if (!resetWeb(driver)) { //resetamos lo campos de la pestaña web
            return false;
        }
        if (!changeTab(driver, "tab_url_country")) { //volvemos a url country
            return false;
        }
        if (!resetUrl(driver)) { //reseteamos los campos de url country
            return false;
        }
        if (!qbeUrl(driver)) { // mediante el QBE buscamos la url creada y editada
            return false;
        }
        if (!deleteUrl(driver)) { // borramos la url
            return false;
        }
        if (!changeTab(driver, "tab_available_web")) { // vuelta a web
            return false;
        }
        Functions.zoomOut(driver); //zoom para ver toda la pantalla
        if (!qbeAvailable(driver)) { //mediante la QBE buscamos la web creada y editada previamente
            return false;
        }
        if (!recordInteractionAvailableWebDetails(driver, true)) { // creamos un lenguage
            return false;
        }
        if (!qbeDetails(driver)) { //mediante la QBE buscamos el language creado
            return false;
        }
        if (!recordInteractionAvailableWebDetails(driver, false)) { //editamos el language creado
            return false;
        }
        if (!qbeAvailable(driver)) { //mediante la QBE buscamos la web relacionada con el language creado y editado
            return false;
        }
        if (!qbeDetails(driver)) { //mediante la QBE buscamos el language creado, de nuevo
            return false;
        }
        if (!auditDetachWeb(driver)) { // data history y detach
            return false;
        }
        if (!auditDetachWebDetails(driver)) { // data history y detach
            return false;
        }
        if (!deleteWebDetails(driver)) { // borramos el language
            return false;
        }
        if (!deleteWeb(driver)) { //borramos la web creada
            return false;
        }
        /*if () {
            return false;
        }*/

        return true;
    }


    /**
     * @param driver TestDriver
     * @param type   boolean que controla el flujo inicial para saber si creamos o modificamos el registro
     * @return Boolean
     */
    protected boolean recordInteractionUrlCountry(TestDriver driver, boolean type) {
        String on, update = "";
        if (type) {
            on = "on ADD URL COUNTRY";
            driver.getReport().addHeader("RECORD URL COUNTRY CREATION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"url_country_pais_url_b_add", getElements("url_country_pais_url_b_add")},
                    recursiveXPaths.glass, "")) {
                return false;
            }
        } else {
            update = "update_";
            on = "on EDIT URL COUNTRY";
            driver.getReport().addHeader("RECORD URL COUNTRY EDITION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"url_country_pais_url_b_edit", getElements("url_country_pais_url_b_edit")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"url_country_pais_url_b_add_lov_country_code", getElements("url_country_pais_url_b_add_lov_country_code")}, //LoV button
                new String[]{"url_country_pais_url_b_add_i_country_code", getElements("url_country_pais_url_b_add_i_country_code")}, //external LoV input
                new String[]{"url_country_pais_url_b_add_lov_country_code_i_country_code", getElements("url_country_pais_url_b_add_lov_country_code_i_country_code")}, //internal LoV input
                getData(update + "country_code_url"), // value to search
                "country_code_url", //name of the data
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"url_country_pais_url_b_add_i_url", getElements("url_country_pais_url_b_add_i_url")},
                "url_url",
                getData(update + "url_url"),
                on)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"url_country_pais_url_b_add_type", getElements("url_country_pais_url_b_add_type")},
                getData(update + "type"),
                "type",
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"url_country_pais_url_b_add_b_save", getElements("url_country_pais_url_b_add_b_save")},
                recursiveXPaths.glass,
                on)) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @param type   boolean que controla el flujo inicial para saber si creamos o modificamos el registro
     * @return Boolean
     */
    protected boolean recordInteractionAvailableWeb(TestDriver driver, boolean type) {
        String on, update = "";
        if (type) {
            on = "on ADD AVAILABLE WEB";
            driver.getReport().addHeader("RECORD AVAILABLE WEB CREATION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"available_web_b_add", getElements("available_web_b_add")},
                    recursiveXPaths.glass, "")) {
                return false;
            }
        } else {
            update = "update_";
            on = "on EDIT AVAILABLE WEB";
            driver.getReport().addHeader("RECORD AVAILABLE WEB EDITION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"available_web_b_edit", getElements("available_web_b_edit")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_b_add_i_country_code", getElements("available_web_b_add_i_country_code")},
                "country_code_web",
                getData(update + "country_code_web"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_b_add_i_url", getElements("available_web_b_add_i_url")},
                "url_web",
                getData(update + "url_web"),
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"available_web_b_add_b_save", getElements("available_web_b_add_b_save")},
                recursiveXPaths.glass,
                on)) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @param type   boolean que controla el flujo inicial para saber si creamos o modificamos el registro
     * @return Boolean
     */
    protected boolean recordInteractionAvailableWebDetails(TestDriver driver, boolean type) {
        String on, update = "";
        if (type) {
            on = "on ADD AVAILABLE WEB DETAILS";
            driver.getReport().addHeader("RECORD AVAILABLE WEB DETAILS CREATION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"available_web_details_b_add", getElements("available_web_details_b_add")},
                    recursiveXPaths.glass, "")) {
                return false;
            }
        } else {
            update = "update_";
            on = "on EDIT AVAILABLE WEB DETAILS";
            driver.getReport().addHeader("RECORD AVAILABLE WEB DETAILS EDITION", 3, true);
            if (!Functions.checkClick(driver,
                    new String[]{"available_web_details_b_edit", getElements("available_web_details_b_edit")},
                    recursiveXPaths.glass,
                    on)) {
                return false;
            }
        }
        Functions.break_time(driver, 2, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"available_web_details_b_add_lov_language_code", getElements("available_web_details_b_add_lov_language_code")},
                new String[]{"available_web_details_b_add_i_language_code", getElements("available_web_details_b_add_i_language_code")},
                new String[]{"available_web_details_b_add_lov_language_code_i_language", getElements("available_web_details_b_add_lov_language_code_i_language")},
                getData(update + "language_code"),
                "language_code",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_details_b_add_i_web_country_description", getElements("available_web_details_b_add_i_web_country_description")},
                "web_country_description",
                getData(update + "web_country_description"),
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"available_web_details_b_add_b_save", getElements("available_web_details_b_add_b_save")},
                recursiveXPaths.glass,
                on)) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @param tab    String[] element del tab en cuestion
     * @return boolean
     */
    protected boolean changeTab(TestDriver driver, String tab) {
        driver.getReport().addHeader("TAB CHANGE", 4, true);
        if (!Functions.simpleClick(driver,
                new String[]{tab, getElements(tab)},
                " on CHANGING TAB")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean searchUrlCountry(TestDriver driver) {
        driver.getReport().addHeader("SEARCH URL COUNTRY:", 4, false);
        try {
            if (!Functions.createLovByValue(driver,
                    new String[]{"url_country_search_lov_country_code", getElements("url_country_search_lov_country_code")},
                    new String[]{"url_country_search_i_country_code", getElements("url_country_search_i_country_code")},
                    new String[]{"url_country_search_lov_country_code_i_country_code", getElements("url_country_search_lov_country_code_i_country_code")},
                    getData("country_code_url"),
                    "country_code_url",
                    " on SEARCH URL COUNTRY")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"url_country_search_i_url", getElements("url_country_search_i_url")},
                    "url_url",
                    getData("url_url"),
                    " on SEARCH URL COUNTRY")) {
                return false;
            }
            if (!Functions.selectText(driver,
                    new String[]{"url_country_search_i_type", getElements("url_country_search_i_type")},
                    getData("type"),
                    "type",
                    " on SEARCH URL COUNTRY")) {
                return false;
            }
            if (!Functions.clickSearchAndResult(driver,
                    new String[]{"url_country_search_b_search", getElements("url_country_search_b_search")},
                    new String[]{"url_country_search_e_result", getElements("url_country_search_e_result")},
                    " on SEARCH URL COUNTRY")) {
                return false;
            }
        } catch (Exception search) {
            search.printStackTrace();
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean searchAvailableWeb(TestDriver driver) {
        driver.getReport().addHeader("SEARCH AVAILABLE WEB:", 4, false);
        try {
            if (!Functions.insertInput(driver,
                    new String[]{"available_web_search_i_country_code", getElements("available_web_search_i_country_code")},
                    "country_code_web",
                    getData("country_code_web"),
                    " on SEARCH AVAILABLE WEB")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"available_web_search_i_url", getElements("available_web_search_i_url")},
                    "url_web",
                    getData("url_web"),
                    " on SEARCH AVAILABLE WEB")) {
                return false;
            }
            if (!Functions.clickSearchAndResult(driver,
                    new String[]{"available_web_search_b_search", getElements("available_web_search_b_search")},
                    new String[]{"available_web_e_result", getElements("available_web_e_result")},
                    " on SEARCH AVAILABLE WEB")) {
                return false;
            }
        } catch (Exception search) {
            search.printStackTrace();
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean qbeUrl(TestDriver driver) {
        driver.getReport().addContent("QBE SEARCH Url Country:", "h4", "");
        if (!Functions.clickQbE(driver,
                new String[]{"url_country_pais_url_b_qbe", getElements("url_country_pais_url_b_qbe")},
                new String[]{"url_country_pais_url_qbe_i_country_code", getElements("url_country_pais_url_qbe_i_country_code")},
                " on QBE URL COUNTRY")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"url_country_pais_url_qbe_i_country_code", getElements("url_country_pais_url_qbe_i_country_code")},
                "country_code_url",
                getData("country_code_url"),
                " on QBE URL COUNTRY")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"url_country_pais_url_qbe_i_country_description", getElements("url_country_pais_url_qbe_i_country_description")},
                "country_description_url",
                getData("update_country_description_url"),
                // el registro de Country description no se actualiza al editarlo asi que hay que poner update aqui para que coja el valor nuevo
                " on QBE URL COUNTRY")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"url_country_pais_url_qbe_i_url", getElements("url_country_pais_url_qbe_i_url")},
                "url_url",
                getData("url_url"),
                " on QBE URL COUNTRY")) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"url_country_pais_url_qbe_i_type", getElements("url_country_pais_url_qbe_i_type")},
                getData("type"),
                "type",
                " on QBE URL COUNTRY")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"url_country_pais_url_qbe_i_country_code", getElements("url_country_pais_url_qbe_i_country_code")},
                new String[]{"url_country_search_e_result", getElements("url_country_search_e_result")},
                " on QBE URL COUNTRY")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean qbeAvailable(TestDriver driver) {
        driver.getReport().addContent("QBE SEARCH Web Available:", "h4", "");
        if (!Functions.clickQbE(driver,
                new String[]{"available_web_b_qbe", getElements("available_web_b_qbe")},
                new String[]{"available_web_qbe_i_country_code", getElements("available_web_qbe_i_country_code")},
                " on QBE AVAILABLE WEB")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_qbe_i_country_code", getElements("available_web_qbe_i_country_code")},
                "country_code_web",
                getData("country_code_web"),
                " on QBE AVAILABLE WEB")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_qbe_i_url", getElements("available_web_qbe_i_url")},
                "url_web",
                getData("url_web"),
                " on QBE AVAILABLE WEB")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"available_web_qbe_i_country_code", getElements("available_web_qbe_i_country_code")},
                new String[]{"available_web_e_result", getElements("available_web_e_result")},
                " on QBE AVAILABLE WEB")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean qbeDetails(TestDriver driver) {
        driver.getReport().addContent("QBE SEARCH Web Available Details:", "h4", "");
        if (!Functions.clickQbE(driver,
                new String[]{"available_web_details_b_qbe", getElements("available_web_details_b_qbe")},
                new String[]{"available_web_details_qbe_i_language_code", getElements("available_web_details_qbe_i_language_code")},
                " on QBE AVAILABLE WEB DETAILS")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_details_qbe_i_language_code", getElements("available_web_details_qbe_i_language_code")},
                "language_code",
                getData("language_code"),
                " on QBE AVAILABLE WEB DETAILS")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"available_web_details_qbe_i_web_country_description", getElements("available_web_details_qbe_i_web_country_description")},
                "web_country_description",
                getData("web_country_description"),
                " on QBE AVAILABLE WEB DETAILS")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"available_web_details_qbe_i_language_code", getElements("available_web_details_qbe_i_language_code")},
                new String[]{"available_web_details_e_result", getElements("available_web_details_e_result")},
                " on QBE AVAILABLE WEB DETAILS")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return boolean
     */
    protected boolean auditDetachUrl(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"url_country_search_e_result", getElements("url_country_search_e_result")},
                " on DATA HISTORY URL")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"url_country_pais_url_b_actions", getElements("url_country_pais_url_b_actions")},
                new String[]{"url_country_pais_url_b_data_history", getElements("url_country_pais_url_b_data_history")},
                new String[]{"url_country_pais_url_b_data_history_b_ok", getElements("url_country_pais_url_b_data_history_b_ok")},
                " on DATA HISTORY URL")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"url_country_pais_url_b_detach_table", getElements("url_country_pais_url_b_detach_table")},
                true,
                " on DETACH TABLE URL")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return boolean
     */
    protected boolean auditDetachWeb(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"available_web_e_result", getElements("available_web_e_result")},
                " on DATA HISTORY WEB AVAILABLE")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"available_web_b_actions", getElements("available_web_b_actions")},
                new String[]{"available_web_b_data_history", getElements("available_web_b_data_history")},
                new String[]{"available_web_b_data_history_b_ok", getElements("available_web_b_data_history_b_ok")},
                " on DATA HISTORY WEB AVAILABLE")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"available_web_b_detach_table", getElements("available_web_b_detach_table")},
                true,
                " on DETACH TABLE WEB AVAILABLE")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return boolean
     */
    protected boolean auditDetachWebDetails(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"available_web_details_e_result", getElements("available_web_details_e_result")},
                " on DATA HISTORY WEB AVAILABLE DETAILS")) {
            return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"available_web_details_b_actions", getElements("available_web_details_b_actions")},
                new String[]{"available_web_details_b_data_history", getElements("available_web_details_b_data_history")},
                new String[]{"available_web_details_b_data_history_b_ok", getElements("available_web_details_b_data_history_b_ok")},
                " on DATA HISTORY WEB AVAILABLE DETAILS")) {
            return false;
        }
        if (!Functions.detachTable(driver,
                new String[]{"available_web_details_b_detach_table", getElements("available_web_details_b_detach_table")},
                true,
                " on DETACH TABLE WEB AVAILABLE DETAILS")) {
            return false;
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean deleteUrl(TestDriver driver) {
        driver.getReport().addContent("Delete Url Country Record:", "h4", "");
        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"url_country_search_e_result", getElements("url_country_search_e_result")},
                    " on DELETE URL COUNTRY")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"url_country_pais_url_b_remove", getElements("url_country_pais_url_b_remove")},
                    " on DELETE URL COUNTRY")) {
                return false;
            }
            Functions.break_time(driver, 2, 800);
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"url_country_pais_url_b_remove_b_ok", getElements("url_country_pais_url_b_remove_b_ok")},
                    new String[]{"url_country_pais_url_b_remove_b_ok", getElements("url_country_pais_url_b_remove_b_ok")},
                    " on DELETE URL COUNTRY")) {
                return false;
            }
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean deleteWeb(TestDriver driver) {
        driver.getReport().addContent("Delete Web Available Record:", "h4", "");
        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"available_web_e_result", getElements("available_web_e_result")},
                    " on DELETE AVAILABLE WEB")) {
                return false;
            }
            if (!Functions.checkClick(driver,
                    new String[]{"available_web_b_remove", getElements("available_web_b_remove")},
                    recursiveXPaths.glass,
                    " on DELETE AVAILABLE WEB")) {
                return false;
            }
            Functions.break_time(driver, 2, 800);
            if (!Functions.checkClick(driver,
                    new String[]{"available_web_b_remove_b_ok", getElements("available_web_b_remove_b_ok")},
                    new String[]{"available_web_b_remove_b_ok_b_ok", getElements("available_web_b_remove_b_ok_b_ok")},
                    " on DELETE AVAILABLE WEB")) {
                return false;
            }
            Functions.break_time(driver, 1, 500);
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"available_web_b_remove_b_ok_b_ok", getElements("available_web_b_remove_b_ok_b_ok")},
                    recursiveXPaths.glass,
                    " on DELETE AVAILABLE WEB")) {
                return false;
            }
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean deleteWebDetails(TestDriver driver) {
        driver.getReport().addContent("Delete Web Available Details Record:", "h4", "");
        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"available_web_details_e_result", getElements("available_web_details_e_result")},
                    " on DELETE AVAILABLE WEB DETAILS")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"available_web_details_b_remove", getElements("available_web_details_b_remove")},
                    " on DELETE AVAILABLE WEB DETAILS")) {
                return false;
            }
            Functions.break_time(driver, 2, 800);
            if (!Functions.simpleClick(driver,
                    new String[]{"available_web_details_b_remove_b_ok", getElements("available_web_details_b_remove_b_ok")},
                    " on DELETE AVAILABLE WEB DETAILS")) {
                return false;
            }
        } catch (Exception delete) {
            delete.printStackTrace();
        }
        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean resetUrl(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"url_country_search_b_reset", getElements("url_country_search_b_reset")},
                " on RESET")) {
            return false;
        }

        return true;
    }

    /**
     * @param driver TestDriver
     * @return Boolean
     */
    protected boolean resetWeb(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"available_web_search_b_reset", getElements("available_web_search_b_reset")},
                " on RESET")) {
            return false;
        }

        return true;
    }

}
