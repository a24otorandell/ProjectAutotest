package screen.AT2MDMDE0010;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 18/11/2016.
 */
public class AT2MDMDE0010Test {
    protected AT2MDMDE0010Locators locators;
    protected AT2MDMDE0010Data data;
    public AT2MDMDE0010Test() {
    }
    public AT2MDMDE0010Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0010Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0010Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0010Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("HB TTOO Destinations restrictions");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add(driver)) return false;
        if (!search(driver, false)) return false;
        if (!getDatos(driver)) return false;
        if (!search(driver, true)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"restricted_b_add", getElements("restricted_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_ttoo", getElements("add_lov_ttoo")}, //LoV button
                new String[]{"add_i_ttoo", getElements("add_i_ttoo")}, //external LoV input
                new String[]{"add_lov_ttoo_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "140664", // value to search
                "ttoo", //name of the data
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getText(driver,new String[]{"add_i_ttoo_name", getElements("add_i_ttoo_name")}, // element path
                "ttoo_name", // key for data value (the name)
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"add_lov_dest", getElements("add_lov_dest")}, //LoV button
                new String[]{"add_i_dest", getElements("add_i_dest")}, //external LoV input
                new String[]{"add_lov_dest_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "ABK", // value to search
                "dest", //name of the data
                where)){return false;}
        Functions.break_time(driver, 3, 800);
        if(!Functions.getText(driver,new String[]{"add_i_dest_desc", getElements("add_i_dest_desc")}, // element path
                "dest_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver, boolean second) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (second) {
            if (!Functions.insertInput(driver, new String[]{"search_i_id", getElements("search_i_id")},
                    "id", getData("id"), where)) {
                return false;
            }
            if (!Functions.createLovByValue(driver,
                    new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                    new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                    new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                    recursiveXPaths.lov_e_result, // lov internal result
                    getData("interface"), // value to search
                    "interface", //name of the data
                    where)) {
                return false;
            }
        }
        Functions.break_time(driver, 3, 800);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_ttoo", getElements("search_lov_ttoo")}, //LoV button
                new String[]{"search_i_ttoo", getElements("search_i_ttoo")}, //external LoV input
                new String[]{"search_lov_ttoo_code", recursiveXPaths.lov_i_altgenericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("ttoo"), // value to search
                "ttoo", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_dest", getElements("search_lov_dest")}, //LoV button
                new String[]{"search_i_dest", getElements("search_i_dest")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("dest"), // value to search
                "dest", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"restricted_e_result", getElements("restricted_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean getDatos (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = "GET DATA";
        String[] columns = {"id", "external","external_name","interface", "interface_desc", "ttoo", "ttoo_name","dest", "dest_desc" };
        Functions.collectTableData(driver,
                columns, //array with the names of the columns
                "//*[contains(@id, 'pc1:resId1::db')]",
                1, // row to give values
                where);
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DESCRIPTION";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"restricted_e_result", getElements("restricted_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"restricted_b_qbe", getElements("restricted_b_qbe")},// query button
                new String[]{"qbe_i_ttoo", getElements("qbe_i_ttoo")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver);
        if (!Functions.insertInput(driver, new String[]{"qbe_i_id", getElements("qbe_i_id")},
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_des", getElements("qbe_i_interface_des")},
                "interface_desc", getData("interface_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ttoo", getElements("qbe_i_ttoo")},
                "ttoo", getData("ttoo"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_ttoo_name", getElements("qbe_i_ttoo_name")},
                "ttoo_name", getData("ttoo_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest", getElements("qbe_i_dest")},
                "dest", getData("dest"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest_desc", getElements("qbe_i_dest_desc")},
                "dest_desc", getData("dest_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_ttoo", getElements("qbe_i_ttoo")}, //any query input
                new String[]{"restricted_e_result", getElements("restricted_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"restricted_b_detach", getElements("restricted_b_detach")}, //detach button
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
                new String[]{"restricted_b_delete", getElements("restricted_b_delete")},
                new String[]{"restricted_e_records", getElements("restricted_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
