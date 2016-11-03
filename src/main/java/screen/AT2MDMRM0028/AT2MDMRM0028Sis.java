package screen.AT2MDMRM0028;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0028Sis {
    protected AT2MDMRM0028Locators locators;
    protected AT2MDMRM0028Data data;
    public AT2MDMRM0028Sis() {
    }
    public AT2MDMRM0028Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0028Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0028Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0028Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Other services category 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_categories(driver)) return false;
        if (!search_categories(driver)) return false;
        if (!interaction_edit_categories(driver)) return false;
        if (!qbe_categories(driver)) return false;
        if (!others_actions_categories(driver)) return false;
        if (!interaction_add_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!interaction_edit_multi(driver)) return false;
        if (!qbe_multi(driver)) return false;
        if (!others_actions_multi(driver)) return false;
        if (!delete_multi(driver)) return false;
        if (!delete_categories(driver)) return false;
        return true;
    }

    /**
     * METHODS TABLE CATEGORIES
     * @param driver
     * @return
     */
    public boolean interaction_add_categories (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"categories_b_add", getElements("categories_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_category",getElements("add_i_category")},
                "category",DataGenerator.getRandomAlphanumericSequence(2,true), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Events", "type", " on where")){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_categories(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_category",getElements("search_i_category")},
                "category", getData("category"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", " on where")){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"categories_e_result", getElements("categories_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_categories(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"categories_b_edit", getElements("categories_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
//        if (!Functions.insertInput(driver, new String[]{"add_i_category",getElements("add_i_category")},
//                "category",DataGenerator.getRandomAlphanumericSequence(2,true), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Ticketing", "type", " on where")){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_categories(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"categories_e_result", getElements("categories_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"categories_b_qbe", getElements("categories_b_qbe")},// query button
                new String[]{"qbe_i_category", getElements("qbe_i_category")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_category", getElements("qbe_i_category")},
                "category", getData("category"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", " on where")){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_category", getElements("qbe_i_category")}, //search button
                new String[]{"categories_e_result", getElements("categories_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_categories(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"categories_b_detach", getElements("categories_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_categories(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"categories_b_delete", getElements("categories_b_delete")},
                new String[]{"categories_e_records", getElements("categories_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TABLE MULTI
     * @param driver
     * @return
     */
    public boolean interaction_add_multi (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_add", getElements("multi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc",getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(12,true), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_multi(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_edit", getElements("multi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_desc",getElements("add_i_desc")},
                "desc", DataGenerator.getRandomAlphanumericSequence(12,true), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_multi(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickQbE(driver,
                new String[]{"multi_b_qbe", getElements("multi_b_qbe")},// query button
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_desc", getElements("qbe_i_desc")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")}, //search button
                new String[]{"multi_e_result", getElements("multi_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_multi(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"multi_b_detach", getElements("multi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_multi(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"multi_b_delete", getElements("multi_b_delete")},
                new String[]{"multi_e_records", getElements("multi_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
