package screen.AT2MDMCL0005;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import javax.sound.midi.SysexMessage;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMCL0005Test {
    protected AT2MDMCL0005Locators locators;
    protected AT2MDMCL0005Data data;
    public AT2MDMCL0005Test() {
    }
    public AT2MDMCL0005Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0005Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0005Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0005Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Syncro Errors");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!getDatos(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!getFechaModified(driver)) return false;
        if (!search(driver)) return false;
        if (!others_actions(driver)) return false;
        return true;
    }

    public  boolean getDatos (TestDriver driver) {
        driver.getReport().addHeader("GET DATOS", 3, false);
        String where = " GET DATOS";
        if (!Functions.insertInput(driver, new String[]{"search_i_date_received_01", getElements("search_i_date_received_01")},
                "date_1","", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_received_02", getElements("search_i_date_received_02")},
                "date_1b","", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"synchronization_e_result", getElements("synchronization_e_result")}, //result element
                where)) {
            return false;
        }
        if(!Functions.getText(driver,new String[]{"table_i_id", getElements("table_i_id")}, // element path
                "id", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_client_system", getElements("table_i_client_system")}, // element path
                "system", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_client_request", getElements("table_i_client_request")}, // element path
                "request", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_client_registered", getElements("table_i_client_registered")}, // element path
                "regis", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date_modified", getElements("table_i_date_modified")}, // element path
                "date_2", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_date_received", getElements("table_i_date_received")}, // element path
                "date_1", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_type", getElements("table_i_type")}, // element path
                "type", // key for data value (the name)
                where)){return false;}
        Functions.getText(driver, new String[]{"table_i_status", getElements("table_i_status")}, // element path
                "status", // key for data value (the name)
                where);
        if(!Functions.getText(driver,new String[]{"table_i_desc", getElements("table_i_desc")}, // element path
                "desc", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"table_i_module", getElements("table_i_module")}, // element path
                "module", // key for data value (the name)
                where)){return false;}
        return true;
    }
    public boolean getFechaModified (TestDriver driver) {
        driver.getReport().addHeader("GET FECHA", 3, false);
        String where = " GET FECHA";
        if(!Functions.getText(driver,new String[]{"table_i_date_modified", getElements("table_i_date_modified")}, // element path
                "date_2", // key for data value (the name)
                where)){return false;}
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_id", getElements("search_i_id")},
                "id", getData("id"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_client_system", getElements("search_i_client_system")},
                "system", getData("system"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_client_registered", getElements("search_i_client_registered")},
                "regis",getData("regis"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_client_request", getElements("search_i_client_request")},
                "request",getData("request"), where)) {
            return false;
        }
        if (!getData("status").equalsIgnoreCase(" ")) {
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_status", getElements("search_sl_status")},
                    getData("status"), "status", where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_received_01", getElements("search_i_date_received_01")},
                "date_1",getData("date_1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_date_received_02", getElements("search_i_date_received_02")},
                "date_1b",masDia("date_1"), where)) {
            return false;
        }
        if (!getData("date_2").equalsIgnoreCase(" ")) {
            if (!Functions.insertInput(driver, new String[]{"search_i_date_modified_01", getElements("search_i_date_modified_01")},
                    "date_2", getData("date_2"), where)) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"search_i_date_modified_02", getElements("search_i_date_modified_02")},
                    "date_2b", masDia("date_2"), where)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_type", getElements("search_i_type")},
                "type",getData("type"), where)) {
            return false;
        }
/*        if (!Functions.insertInput(driver, new String[]{"search_i_desc", getElements("search_i_desc")},
                "desc",getData("desc"), where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"search_i_module", getElements("search_i_module")},
                "module",getData("module"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"synchronization_e_result", getElements("synchronization_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public String masDia (String data ) {
        String date = getData(data);
        String days = date.substring(0,2);
        int pNumero = Integer.parseInt(days);
        String fin_date = String.valueOf(pNumero+1);
        date = date.replace(days, fin_date);
        return date;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"synchronization_b_edit", getElements("synchronization_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver,3 , 600);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_status", getElements("add_sl_status")},
                "IGNORED", "status", where)) {
                return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"synchronization_b_detach", getElements("synchronization_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

}
