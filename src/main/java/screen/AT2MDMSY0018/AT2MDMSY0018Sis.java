package screen.AT2MDMSY0018;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMSY0018Sis {
    public static final String[] lov_e_altresult3 = {"lov_e_altresult3", "//*[contains(@id, '_afrLovInternalTableId::db')]/table/tbody/tr[4]/td[1]"};
    protected AT2MDMSY0018Locators locators;
    protected AT2MDMSY0018Data data;
    public AT2MDMSY0018Sis() {
    }
    public AT2MDMSY0018Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY0018Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY0018Data getData() {
        return data;
    }
    public void setData(AT2MDMSY0018Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Handler configuration");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_t1(driver)) return false;
        if (!search_t1(driver)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!interaction_add_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!interaction_add_t3(driver)) return false;
        if (!search_t3(driver)) return false;
        if (!interaction_edit_t3(driver)) return false;
        if (!qbe_t3(driver)) return false;
        if (!others_actions_t3(driver)) return false;
        if (!delete_t3(driver)) return false;
        if (!delete_t2(driver)) return false;
        if (!delete_t1(driver)) return false;
        return true;
    }

    /**
     * TAB 1 - TABLE 1
     * @param driver
     * @return
     */
    public boolean interaction_add_t1 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD COMPONENT";
        Functions.break_time(driver, 3 , 600);
        if (!Functions.checkClick(driver,
                new String[]{"component_b_add", getElements("component_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"t1_add_i_type_name",getElements("t1_add_i_type_name")},
                "type1", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t1_add_i_remarks",getElements("t1_add_i_remarks")},
                "remarks1",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"t1_add_b_save", getElements("t1_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH COMPONENT";
        if (!Functions.insertInput(driver, new String[]{"t1_search_i_type_name",getElements("t1_search_i_type_name")},
                "type1", getData("type1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t1_search_i_remarks",getElements("t1_search_i_remarks")},
                "remarks1",  getData("remarks1"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"component_e_result", getElements("component_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION COMPONENT";
        if (!Functions.checkClick(driver,
                new String[]{"component_b_edit", getElements("component_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"t1_add_i_type_name",getElements("t1_add_i_type_name")},
                "type1", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t1_add_i_remarks",getElements("t1_add_i_remarks")},
                "remarks1",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"t1_add_b_save", getElements("t1_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE COMPONENT";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"component_e_result", getElements("component_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"component_b_qbe", getElements("component_b_qbe")},// query button
                new String[]{"t1_qbe_i_type_name", getElements("t1_qbe_i_type_name")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"t1_qbe_i_type_name",getElements("t1_qbe_i_type_name")},
                "type1", getData("type1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t1_qbe_i_remarks",getElements("t1_qbe_i_remarks")},
                "remarks1",  getData("remarks1"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"t1_qbe_i_type_name", getElements("t1_qbe_i_type_name")}, //any query input
                new String[]{"component_e_result", getElements("component_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH COMPONENT";
        if (!Functions.detachTable(driver,
                new String[]{"component_b_detach", getElements("component_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA COMPONENT";
        if(!Functions.doDelete(driver,
                new String[]{"component_b_delete", getElements("component_b_delete")},//delete button
                new String[]{"delete_b_yes", getElements("delete_b_yes")},//delete button
                where)){return false;}
        return true;
    }

    /**
     * TAB1 - TABLE 2
     * @param driver
     * @return
     */
    public boolean interaction_add_t2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD HANDLER TAB 1";
        if (!Functions.checkClick(driver,
                new String[]{"handler_c_b_add", getElements("handler_c_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"t2_add_i_name",getElements("t2_add_i_name")},
                "name1", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t2_add_i_remarks",getElements("t2_add_i_remarks")},
                "remarks2",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"t2_add_b_save", getElements("t2_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION HANDLER TAB1";
        if (!Functions.checkClick(driver,
                new String[]{"handler_c_b_edit", getElements("handler_c_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"t2_add_i_name",getElements("t2_add_i_name")},
                "name1", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t2_add_i_remarks",getElements("t2_add_i_remarks")},
                "remarks2",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"t2_add_b_save", getElements("t2_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE HANDLER";
        if (!Functions.clickQbE(driver,
                new String[]{"handler_c_b_qbe", getElements("handler_c_b_qbe")},// query button
                new String[]{"t2_qbe_i_name", getElements("t2_qbe_i_name")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"t2_qbe_i_name",getElements("t2_qbe_i_name")},
                "name1", getData("name1"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t2_qbe_i_remarks",getElements("t2_qbe_i_remarks")},
                "remarks2",  getData("remarks2"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"t2_qbe_i_name", getElements("t2_qbe_i_name")}, //any query input
                new String[]{"handler_c_e_result", getElements("handler_c_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH HANDLER";
        if (!Functions.detachTable(driver,
                new String[]{"handler_c_b_detach", getElements("handler_c_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA HANDLER";
        if (!Functions.simpleClick(driver,
                new String[]{"components_tab", getElements("components_tab")}, //element to click
                where)){return false;}
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"handler_c_b_delete", getElements("handler_c_b_delete")},
                new String[]{"handler_c_e_records", getElements("handler_c_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TAB2 - TABLE 1
     * @param driver
     * @return
     */
    public boolean interaction_add_t3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD HANDLER TAB 2";
        Functions.break_time(driver, 3 , 600);
        if (!Functions.simpleClick(driver,
                new String[]{"config_tab", getElements("config_tab")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"t3_b_add", getElements("t3_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"t3_add_i_to_seq",getElements("t3_add_i_to_seq")},
                "to_seq", String.valueOf(DataGenerator.random(1,10)), where)){return false;}
        Functions.break_time(driver, 10, 500);
        if(!Functions.createLov(driver,
                new String[]{"t3_add_lov_type_name",getElements("t3_add_lov_type_name")}, // b_lov
                new String[]{"t3_add_i_type_name", getElements("t3_add_i_type_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type2", //Data name
                where)){return false;}
        Functions.break_time(driver, 10, 500);
        if(!Functions.createLov(driver,
                new String[]{"t3_add_lov_name",getElements("t3_add_lov_name")}, // b_lov
                new String[]{"t3_add_i_name", getElements("t3_add_i_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "name2", //Data name
                where)){return false;}
        Functions.break_time(driver, 30, 500);
        if(!Functions.getValue(driver,new String[]{"t3_add_i_to_name", getElements("t3_add_i_to_name")}, // element path
                "to_name", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"t3_add_b_save", getElements("t3_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t3(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH HANDLER TAB2";
        if (!Functions.createLovByValue(driver,
                new String[]{"t3_search_lov_type_name", getElements("t3_search_lov_type_name")}, //LoV button
                new String[]{"t3_search_i_type_name", getElements("t3_search_i_type_name")}, //external LoV input
                new String[]{"t3_search_lov_type_name_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("type2"), // value to search
                "type2", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"t3_search_lov_name", getElements("t3_search_lov_name")}, //LoV button
                new String[]{"t3_search_i_name", getElements("t3_search_i_name")}, //external LoV input
                new String[]{"t3_search_lov_name_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("name2"), // value to search
                "name2", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t3_search_i_to_seq",getElements("t3_search_i_to_seq")},
                "to_seq", getData("to_seq"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t3_search_i_to_name",getElements("t3_search_i_to_name")},
                "to_name", getData("to_name"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"t3_search_b_search", getElements("t3_search_b_search")}, //search button
                new String[]{"t3_e_result", getElements("t3_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION HANDLER TAB2";
        if (!Functions.checkClick(driver,
                new String[]{"t3_b_edit", getElements("t3_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"t3_add_i_to_seq",getElements("t3_add_i_to_seq")},
                "to_seq", String.valueOf(DataGenerator.random(1,10)), where)){return false;}
        Functions.break_time(driver, 10, 500);
        if(!Functions.createLov(driver,
                new String[]{"t3_add_lov_type_name",getElements("t3_add_lov_type_name")}, // b_lov
                new String[]{"t3_add_i_type_name", getElements("t3_add_i_type_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "type2", //Data name
                where)){return false;}
        Functions.break_time(driver, 10, 500);
        if(!Functions.createLov(driver,
                new String[]{"t3_add_lov_name",getElements("t3_add_lov_name")}, // b_lov
                new String[]{"t3_add_i_name", getElements("t3_add_i_name")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "name2", //Data name
                where)){return false;}
        Functions.break_time(driver, 30, 500);
        if(!Functions.getValue(driver,new String[]{"t3_add_i_to_name", getElements("t3_add_i_to_name")}, // element path
                "to_name", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"t3_add_b_save", getElements("t3_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE HANDLER TAB2";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"t3_search_b_reset", getElements("t3_search_b_reset")}, //search button
                new String[]{"t3_e_result", getElements("t3_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"t3_b_qbe", getElements("t3_b_qbe")},// query button
                new String[]{"t3_i_qbe_type_name", getElements("t3_i_qbe_type_name")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"t3_i_qbe_type_name",getElements("t3_i_qbe_type_name")},
                "type2", getData("type2"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t3_i_qbe_name",getElements("t3_i_qbe_name")},
                "name2",  getData("name2"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t3_i_qbe_to_seq",getElements("t3_i_qbe_to_seq")},
                "to_seq", getData("to_seq"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"t3_i_qbe_to_name",getElements("t3_i_qbe_to_name")},
                "to_name", getData("to_name"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"t3_i_qbe_type_name", getElements("t3_i_qbe_type_name")}, //any query input
                new String[]{"t3_e_result", getElements("t3_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH HANDLER TAB2";
        if (!Functions.detachTable(driver,
                new String[]{"t3_b_detach", getElements("t3_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA HANDLER TAB2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"t3_b_delete", getElements("t3_b_delete")},
                new String[]{"t3_e_records", getElements("t3_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
