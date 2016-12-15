package screen.AT2ACCSU0020;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;

/**
 * Created by acarrillo on 07/12/2016.
 */
public class AT2ACCSU0020Test {
    protected AT2ACCSU0020Locators locators;
    protected AT2ACCSU0020Data data;
    private boolean testNormal_cli1=false; //false = test SDCSESD // true = test CSESD
    private boolean testNormal_cli2=false; //false = test SDCSESD // true = test CSESD

    public void setData(AT2ACCSU0020Data data) {
        this.data = data;
    }
    public void setLocators(AT2ACCSU0020Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0020Data getData() {
        return data;
    }
    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Hotel positioning 2.0");
    }
    
    public boolean testCSED(TestDriver driver) {
        if (!test_regression_SDCSESD_gp(driver))return false;
        if (!test_regression_SDCSESD_hpc(driver))return false;
        if (!test_regression_SDCSESD_cli(driver))return false;
        if (!test_regression_SDCSESD_filter(driver))return false;
        return true;
    }

    private boolean test_regression_SDCSESD_gp(TestDriver driver) {
        driver.getReport().addHeader("TEST CSED IN GENERAL PRIORITY BLOCK", 3, false);
        Functions.zoomOut(driver,3);
        if (!getData_gp(driver,1))return false;
        if (!delete_n_records(driver,"gp_n_records","gp_b_delete","gp_b_show_toolbar","gp_b_show_n_records","\" on GENERAL PRIORITY DELETE\""))return false;
        if (!getData_gp(driver,2))return false;
        if (!delete_n_records(driver,"gp_n_records","gp_b_delete","gp_b_show_toolbar","gp_b_show_n_records","\" on GENERAL PRIORITY DELETE\""))return false;
        if (!fill_create_gp(driver,1))return false;
        if (!query_gp(driver,1))return false;
        if (!edit_gp(driver,2))return false;
        if (!query_gp(driver,2))return false;
        if (!audit_gp(driver))return false;
        if (!fill_create_gp(driver,1))return false;
        if (!detach(driver,"gp_detach_b"))return false;
        if (!portail_update_gp(driver))return false;
        Functions.zoomIn(driver);
        driver.getReport().closeBlock();
        return true;
    }
    private boolean portail_update_gp(TestDriver driver) {
        driver.getReport().addHeader("PORTAIL UPDATE OPTION", 3, false);
        if ((Functions.displayed(driver, getElements("gp_b_show_toolbar")))&& !(Functions.displayed(driver, getElements("gp_b_actions")))) {
            if (!Functions.checkClick(driver,
                    new String[]{"gp_b_show_toolbar", getElements("gp_b_show_toolbar")},
                    new String[]{"gp_b_actions", getElements("gp_b_actions")},
                    " to SHOW HIDDEN TOOLBAR (RESOLUTION SCREEN-SIZE ISSUES)")) return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"gp_b_actions", getElements("gp_b_actions")},
                new String[]{"gp_b_actions_b_portail_update", getElements("gp_b_actions_b_portail_update")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        if (!Functions.checkClick(driver,
                new String[]{"gp_b_actions_b_portail_update", getElements("gp_b_actions_b_portail_update")},
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        if (!no_data_to_display(driver,"gp_b_actions_b_portail_update_e_result")){
            //if (!Functions.displayed(driver,getElements("gp_b_actions_b_portail_update_e_no_data"))){
            //get values: nunca ha tenido valores por lo tanto no hemos podido programar el coger valores
            if (!Functions.clickQbE(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe", getElements("gp_b_actions_b_portail_update_b_qbe")},
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")},
                    " CLICK IN PORTAIL OPTIONS")) return false;
            if (!Functions.insertInput(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")}, //input
                    "portail_update_name", //data_name
                    data.getData().get("portail_update_name"),
                    " CLICK IN PORTAIL OPTIONS"))return false; //where
            if (!Functions.enterQueryAndClickResult(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")}, //query input
                    new String[]{"gp_b_actions_b_portail_update_e_result", getElements("gp_b_actions_b_portail_update_e_result")}, //result
                    ""))return false; //where
        }else{
            driver.getReport().addContent("The Portail Update pop up has not values", "h3","");
            Functions.screenshot(driver,false);
        }
        if (!detach(driver,"gp_b_actions_b_portail_update_b_detach"))return false;
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        return true;
    }
    private boolean audit_gp(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        if ((Functions.displayed(driver, getElements("gp_b_show_toolbar")))&& !(Functions.displayed(driver, getElements("gp_b_if (!Functionss")))) {
            if (!Functions.checkClick(driver,
                    new String[]{"gp_b_show_toolbar", getElements("gp_b_show_toolbar")},
                    new String[]{"gp_b_actions", getElements("gp_b_actions")},
                    " to SHOW HIDDEN TOOLBAR (RESOLUTION SCREEN-SIZE ISSUES)")) return false;
        }
        if (!Functions.auditData(driver,
                new String[]{"gp_b_actions",getElements("gp_b_actions")}, //if (!Functionss button
                new String[]{"gp_b_actions_b_audit",getElements("gp_b_actions_b_audit")}, //audit button
                new String[]{"gp_b_actions_b_audit_b_ok",getElements("gp_b_actions_b_audit_b_ok")}, //audit_b_oK
                false,
                " on cli audit data"))return false; //where this occurs
        return true;
    }
    private boolean edit_gp(TestDriver driver, int num_element) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        if ((Functions.displayed(driver, getElements("gp_b_show_toolbar")))&&(Functions.displayed(driver, getElements("gp_b_edit")))){
            if (!Functions.simpleClick(driver,
                    new String[]{"gp_b_show_toolbar", getElements("gp_b_show_toolbar")}, //element to click
                    " on Click toolbar colapsed"))return false;
        }
        //CLICK EDIT
        if (!Functions.checkClick(driver,
                new String[]{"gp_b_edit", getElements("gp_b_edit")}, //e1
                recursiveXPaths.glass, //e2
                " on CLIECK EDIT BUTTON"))return false;//where
        if (!Functions.createLovByValue(driver,
                new String[]{"gp_ss_add_lov_hotel_code",getElements("gp_ss_add_lov_hotel_code")}, // b_lov
                new String[]{"gp_ss_add_i_hotel_code", getElements("gp_ss_add_i_hotel_code")}, // i_lov
                new String[]{"gp_ss_add_i_hotel_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                data.getData().get("gp_hotel_code"+num_element), //value
                "gp_hotel_code"+num_element, //data_name
                " on GENERAL PRIORITY"))return false; //where
        //PRIORITY
        if (!Functions.insertInput(driver,
                new String[]{"gp_ss_edit_i_priority", getElements("gp_ss_edit_i_priority")}, //input
                "gp_priority"+num_element, //data_name
                data.getData().get("gp_priority"+num_element),
                " on GENERAL PRIORITY EDIT"))return false; //where
        //SAVE
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"gp_ss_edit_b_save", getElements("gp_ss_edit_b_save")}, //e1
                recursiveXPaths.glass, //e2
                " on GENERAL PRIORITY EDIT"))return false; //where
        return true;
    }
    private boolean query_gp(TestDriver driver, int num_element) {
        driver.getReport().addHeader("SEARCH BY QBE THE RECORD", 3, false);
        if ((Functions.displayed(driver, getElements("gp_b_show_detach")))&&(Functions.displayed(driver, getElements("gp_b_qbe")))){
            if (!Functions.checkClick(driver,
                    new String[]{"gp_b_show_detach", getElements("gp_b_show_detach")},
                    new String[]{"gp_b_qbe", getElements("gp_b_qbe")},
                    " to SHOW HIDDEN TOOLBAR (RESOLUTION SCREEN-SIZE ISSUES)"))return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"gp_b_qbe", getElements("gp_b_qbe")}, //query_input
                new String[]{"gp_qbe_i_hotel_desc", getElements("gp_qbe_i_hotel_desc")}, //qbe_button
                " on ACTIVE QBE"))return false; //where
        if (!Functions.insertInput(driver,
                new String[]{"gp_qbe_i_hotel_desc", getElements("gp_qbe_i_hotel_desc")}, //input
                "hotel_desc"+num_element, //data_name
                 data.getData().get("hotel_desc"+num_element), //value
                " on QBE HOTEL PRIORITY FOR COUNTRY"))return false; //where
        if (!Functions.insertInput(driver,
                new String[]{"gp_qbe_i_destination", getElements("gp_qbe_i_destination")}, //input
                "gp_destination"+num_element, //data_name
                 data.getData().get("gp_destination"+num_element), //value
                " on QBE HOTEL DESTINATION FOR COUNTRY"))return false; //where
        //QUERY
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"gp_qbe_i_hotel_desc", getElements("gp_qbe_i_hotel_desc")}, //query input
                new String[]{"gp_e_result", getElements("gp_e_result")}, //result
                ""))return false; //where
        return true;
    }
    private boolean fill_create_gp(TestDriver driver,int num_element) {
        driver.getReport().addHeader("CREATE A NEW RECORD", 3, false);
        if ((Functions.displayed(driver, getElements("gp_b_show_toolbar")))&& (Functions.displayed(driver, getElements("gp_b_add")))){
            if (!Functions.checkClick(driver,
                    new String[]{"gp_b_show_toolbar", getElements("gp_b_show_toolbar")},
                    new String[]{"gp_b_add", getElements("gp_b_add")},
                    " to SHOW HIDDEN TOOLBAR (RESOLUTION SCREEN-SIZE ISSUES)"))return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"gp_b_add", getElements("gp_b_add")}, //e1
                recursiveXPaths.glass, //e2
                ""))return false; //where
        Functions.break_time(driver,30,500);
        if (!Functions.createLovByValue(driver,
                new String[]{"gp_ss_add_lov_hotel_code",getElements("gp_ss_add_lov_hotel_code")}, // b_lov
                new String[]{"gp_ss_add_i_hotel_code", getElements("gp_ss_add_i_hotel_code")}, // i_lov
                new String[]{"gp_ss_add_i_hotel_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                 data.getData().get("gp_hotel_code"+num_element), //value
                "gp_hotel_code", //data_name
                " on GENERAL PRIORITY"))return false; //where
        if (!Functions.insertInput(driver,
                new String[]{"gp_ss_add_i_priority", getElements("gp_ss_add_i_priority")}, //input
                "gp_priority", //data_name
                data.getData().get("gp_priority"+num_element), //value
                " on GENERAL PRIORITY"))return false; //where
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"gp_ss_add_b_save", getElements("gp_ss_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                " on GENERAL PRIORITY ADD"))return false; //where
        return true;
    }
    private boolean getData_gp(TestDriver driver,int num_element) {
        driver.getReport().addHeader("GET VALUES FROM TABLE RESULT", 3, false);
        if (!Functions.simpleClick(driver,
                new String[]{"gp_click_e_search", getElements("gp_click_e_search")}, //element to click
                " on SEARCH ELEMENT"))return false;
        if ((Functions.displayed(driver, getElements("gp_b_show_toolbar")))&&(Functions.displayed(driver, getElements("gp_b_edit")))){
            if (!Functions.simpleClick(driver,
                    new String[]{"gp_b_show_toolbar", getElements("gp_b_show_toolbar")}, //element to click
                    " on Click toolbar colapsed"))return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"gp_b_edit", getElements("gp_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on button edit getData_gp"))return false;
        if (!Functions.getValue(driver,new String[]{"gp_ss_edit_i_hotelId", getElements("gp_ss_edit_i_hotelId")}, // element path
                "gp_hotel_code"+num_element, // key for data value (the name)
                " on edit getData_gp"))return false; // whoere this operation occurs
        if (!Functions.getValue(driver,
                new String[]{"gp_ss_edit_i_destination", getElements("gp_ss_edit_i_destination")}, //e1
                "gp_destination"+num_element, //data_name
                " on HOTEL PRIORITY for COUNTRY"))return false; //where
        if (!Functions.getValue(driver,
                new String[]{"gp_ss_edit_i_desc", getElements("gp_ss_edit_i_desc")}, //e1
                "hotel_desc"+num_element, //data_name
                " on HOTEL PRIORITY for COUNTRY"))return false; //where
        if (!Functions.getValue(driver,new String[]{"gp_ss_edit_i_priority", getElements("gp_ss_edit_i_priority")}, // element path
                "gp_priority"+num_element, // key for data value (the name)
                " on edit getData_gp"))return false; // whoere this operation occurs
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"gp_b_cancel_edit", getElements("gp_b_cancel_edit")}, //e1
                recursiveXPaths.glass, //e2
                " on GENERAL PRIORITY ADD"))return false; //where
        if (!Functions.simpleClick(driver,
                new String[]{"gp_click_e_search", getElements("gp_click_e_search")}, //element to click
                " on SEARCH ELEMENT"))return false;
        return true;
    }

    private boolean test_regression_SDCSESD_hpc(TestDriver driver) {
        driver.getReport().addHeader("TEST CSED IN HOTEL PRIORITY FOR COUNTRY BLOCK", 3, false);
        Functions.zoomOut(driver,4);
        if (!getData_hpc(driver,1))return false;
        if (!delete_hpc(driver))return false;
        if (!getData_hpc(driver,2))return false;
        if (!delete_hpc(driver))return false;
        if (!fill_create_hpc(driver,1))return false;
        if (!query_hpc(driver,1))return false;
        if (!edit_hpc(driver,2))return false;
        if (!query_hpc(driver,2))return false;
        if (!audit_hpc(driver))return false;
        if (!fill_create_hpc(driver,1))return false;
        if (!detach(driver,"hpc_detach_b"))return false;
        if (!portail_update_hpc(driver))return false;
        Functions.zoomIn(driver);
        driver.getReport().closeBlock();
        return true;
    }
    private boolean portail_update_hpc(TestDriver driver) {
        driver.getReport().addHeader("PORTAIL UPDATE OPTION", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"hpc_actions_b", getElements("hpc_actions_b")},
                new String[]{"hpc_b_actions_b_portail_update", getElements("hpc_b_actions_b_portail_update")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        if (!Functions.checkClick(driver,
                new String[]{"hpc_b_actions_b_portail_update", getElements("hpc_b_actions_b_portail_update")},
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        if (!no_data_to_display(driver,"gp_b_actions_b_portail_update_e_result")){
            //if (!Functions.displayed(driver,getElements("gp_b_actions_b_portail_update_e_no_data"))){
            //get values: nunca ha tenido valores por lo tanto no hemos podido programar el coger valores
            if (!Functions.clickQbE(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe", getElements("gp_b_actions_b_portail_update_b_qbe")},
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")},
                    " CLICK IN PORTAIL OPTIONS")) return false;
            if (!Functions.insertInput(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")}, //input
                    "portail_update_name", //data_name
                    data.getData().get("portail_update_name"),
                    " CLICK IN PORTAIL OPTIONS"))return false; //where
            if (!Functions.enterQueryAndClickResult(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")}, //query input
                    new String[]{"gp_b_actions_b_portail_update_e_result", getElements("gp_b_actions_b_portail_update_e_result")}, //result
                    ""))return false; //where
        }else{
            driver.getReport().addContent("The Portail Update pop up has not values", "h3","");
            Functions.screenshot(driver,false);
        }
        if (!detach(driver,"gp_b_actions_b_portail_update_b_detach"))return false;
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        return true;
    }
    private boolean audit_hpc(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        if (!Functions.auditData(driver,
                new String[]{"hpc_actions_b",getElements("hpc_actions_b")}, //Functionss button
                new String[]{"hpc_audit_b",getElements("hpc_audit_b")}, //audit button
                new String[]{"hpc_audit_ok_b",getElements("hpc_audit_ok_b")}, //audit_b_ok
                " on cli audit data"))return false; //where this occurs
        return true;
    }
    private boolean edit_hpc(TestDriver driver, int num_element) {
        driver.getReport().addHeader("EDIT A RECORD", 3, false);
        //CLICK EDIT
        if (!Functions.checkClick(driver,
                new String[]{"hpc_b_edit", getElements("hpc_b_edit")}, //e1
                recursiveXPaths.glass, //e2
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        if (!Functions.createLovByValue(driver,
                new String[]{"hpc_ss_add_lov_hotel_code", getElements("hpc_ss_add_lov_hotel_code")},
                new String[]{"hpc_ss_add_i_hotel_code", getElements("hpc_ss_add_i_hotel_code")}, //input
                new String[]{"hpc_ss_add_ss_hotel_code_i_code", recursiveXPaths.lov_i_genericinput}, //input inside lov
                data.getData().get("hpc_hotel_code"+num_element), //value
                "hpc_hotel_code"+num_element, //data_name
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        //COUNTRY CODE
        if (!Functions.createLovByValue(driver,
                new String[]{"hpc_ss_add_lov_country_code", getElements("hpc_ss_add_lov_country_code")},
                new String[]{"hpc_ss_add_i_country_code", getElements("hpc_ss_add_i_country_code")}, //input
                new String[]{"hpc_ss_add_ss_country_code_i_code", recursiveXPaths.lov_i_genericinput}, //input inside lov
                data.getData().get("hpc_country_code"+num_element), //value
                "hpc_country_code"+num_element, //data_name
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        //PRIORITY
        if (!Functions.insertInput(driver,
                new String[]{"hpc_ss_add_i_priority", getElements("hpc_ss_add_i_priority")}, //input
                "hpc_priority"+num_element, //data_name
                data.getData().get("hpc_priority"+num_element), //value
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hpc_ss_add_b_save", getElements("hpc_ss_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                " on GENERAL PRIORITY EDIT"))return false; //where
        return true;
    }
    private boolean query_hpc(TestDriver driver, int num_element) {
        driver.getReport().addHeader("SEARCH BY QBE", 3, false);
        if (!Functions.clickQbE(driver,
                new String[]{"hpc_b_qbe", getElements("hpc_b_qbe")}, //query_input
                new String[]{"hpc_qbe_i_hotel_desc", getElements("hpc_qbe_i_hotel_desc")}, //qbe_button
                " on QBE HPC"))return false; //where
        //HOTEL DESC
        if (!Functions.insertInput(driver,
                new String[]{"hpc_qbe_i_hotel_desc", getElements("hpc_qbe_i_hotel_desc")}, //input
                "hpc_hotel_desc"+num_element, //data_name
                 data.getData().get("hpc_hotel_desc"+num_element), //value
                " on QBE HPC"))return false; //where
        if (!Functions.insertInput(driver,
                new String[]{"hpc_qbe_i_hotel_destination", getElements("hpc_qbe_i_hotel_destination")}, //input
                "hpc_hotel_destination"+num_element, //data_name
                data.getData().get("hpc_hotel_destination"+num_element), //value
                " on QBE HPC"))return false; //where
        //QUERY
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"hpc_qbe_i_hotel_desc", getElements("hpc_qbe_i_hotel_desc")}, //query input
                new String[]{"hpc_e_result", getElements("hpc_e_result")}, //result
                " on QBE HPC"))return false; //where
        return true;
    }
    private boolean delete_hpc(TestDriver driver) {
        driver.getReport().addHeader("DELETE THE RECORD", 3, false);
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"hpc_b_delete", getElements("hpc_b_delete")}, //button delete
                new String[]{"hpc_n_records", getElements("hpc_n_records")}, // result
                new String[]{"hpc_ss_delete_b_yes", getElements("hpc_ss_delete_b_yes")}, //delete button yes
                " on HOTEL PRIORITY COUNTRY DELETE")){return false;}
        return true;

    }
    private boolean fill_create_hpc(TestDriver driver, int num_element) {
        driver.getReport().addHeader("CREATE A NEW RECORD", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"hpc_b_add", getElements("hpc_b_add")}, //e1
                recursiveXPaths.glass, //e2
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        if (!Functions.createLovByValue(driver,
                new String[]{"hpc_ss_add_lov_hotel_code", getElements("hpc_ss_add_lov_hotel_code")},
                new String[]{"hpc_ss_add_i_hotel_code", getElements("hpc_ss_add_i_hotel_code")}, //input
                new String[]{"hpc_ss_add_ss_hotel_code_i_code", recursiveXPaths.lov_i_genericinput}, //input inside lov
                 data.getData().get("hpc_hotel_code"+num_element), //value
                "hpc_hotel_code"+num_element, //data_name
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        //COUNTRY CODE
        if (!Functions.createLovByValue(driver,
                new String[]{"hpc_ss_add_lov_country_code", getElements("hpc_ss_add_lov_country_code")},
                new String[]{"hpc_ss_add_i_country_code", getElements("hpc_ss_add_i_country_code")}, //input
                new String[]{"hpc_ss_add_ss_country_code_i_code", recursiveXPaths.lov_i_genericinput}, //input inside lov
                 data.getData().get("hpc_country_code"+num_element), //value
                "hpc_country_code"+num_element, //data_name
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        //PRIORITY
        if (!Functions.insertInput(driver,
                new String[]{"hpc_ss_add_i_priority", getElements("hpc_ss_add_i_priority")}, //input
                "hpc_priority"+num_element, //data_name
                 data.getData().get("hpc_priority"+num_element), //value
                " on HOTEL PRIORITY COUNTRY"))return false; //where
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hpc_ss_add_b_save", getElements("hpc_ss_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                " on GENERAL PRIORITY ADD"))return false; //where
        return true;
    }
    private boolean getData_hpc(TestDriver driver, int num_element) {
        String where = " IN HOTEL PRIORITY FOR COUNTRY";
        driver.getReport().addHeader("GET VALUES FROM TABLE RESULT", 3, false);
        if (!Functions.simpleClick(driver,
                new String[]{"hpc_click_e_search", getElements("hpc_click_e_search")}, //element to click
                " SELECT ELMENET "+where))return false;
        if (!Functions.checkClick(driver,
                new String[]{"hpc_b_edit", getElements("hpc_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " CLIECK EDIT "+where))return false;
        if (!Functions.getValue(driver,new String[]{"hpc_ss_add_i_hotel_code", getElements("hpc_ss_add_i_hotel_code")}, // element path
                "hpc_hotel_code"+num_element, // key for data value (the name)
                where))return false; // whoere this operation occurs
        if (!Functions.getValue(driver,
                new String[]{"hpc_ss_add_i_hotel_desc", getElements("hpc_ss_add_i_hotel_desc")}, //e1
                "hpc_hotel_desc"+num_element, //data_name
                where))return false; //where
        if (!Functions.getValue(driver,
                new String[]{"hpc_ss_add_i_hotel_destination", getElements("hpc_ss_add_i_hotel_destination")}, //e1
                "hpc_hotel_destination"+num_element, //data_name
                where))return false; //where
        if (!Functions.getValue(driver,
                new String[]{"hpc_ss_add_i_country_code", getElements("hpc_ss_add_i_country_code")}, //e1
                "hpc_country_code"+num_element, //data_name
                where))return false; //where
        if (!Functions.getValue(driver,new String[]{"hpc_ss_add_i_priority", getElements("hpc_ss_add_i_priority")}, // element path
                "hpc_priority"+num_element, // key for data value (the name)
                where))return false; // whoere this operation occurs
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hpc_b_cancel_edit", getElements("hpc_b_cancel_edit")}, //e1
                recursiveXPaths.glass, //e2
                where))return false; //where
        if (!Functions.simpleClick(driver,
                new String[]{"hpc_e_result", getElements("hpc_e_result")}, //element to click
                where))return false;
        return true;
    }

    private boolean test_regression_SDCSESD_cli(TestDriver driver) {
        driver.getReport().addHeader("TEST CSED IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
        Functions.zoomOut(driver,4);
        if (!getData_cli(driver,1))return false;
        if (!getData_cli(driver,2))return false;
        if (!fill_create_cli(driver,1, true))return false;
        if (!query_cli(driver,1))return false;
        if (!fill_create_cli(driver,2, false))return false;
        if (!query_cli(driver,2))return false;
        if (!audit_cli(driver))return false;
        if (!detach(driver,"cli_detach_b"))return false;
        if (!leave_everything_the_same(driver))return false;
        if (!portail_update_cli(driver))return false;
        Functions.zoomIn(driver);
        driver.getReport().closeBlock();
        return true;
    }
    private boolean portail_update_cli(TestDriver driver) {
        driver.getReport().addHeader("PORTAIL UPDATE OPTION IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"cli_actions_b", getElements("cli_actions_b")},
                new String[]{"cli_b_actions_b_portail_update", getElements("cli_b_actions_b_portail_update")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        if (!Functions.checkClick(driver,
                new String[]{"cli_b_actions_b_portail_update", getElements("cli_b_actions_b_portail_update")},
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        if (!no_data_to_display(driver,"gp_b_actions_b_portail_update_e_result")){
            //if (!Functions.displayed(driver,getElements("gp_b_actions_b_portail_update_e_no_data"))){
            //get values: nunca ha tenido valores por lo tanto no hemos podido programar el coger valores
            if (!Functions.clickQbE(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe", getElements("gp_b_actions_b_portail_update_b_qbe")},
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")},
                    " CLICK IN PORTAIL OPTIONS")) return false;
            if (!Functions.insertInput(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")}, //input
                    "portail_update_name", //data_name
                    data.getData().get("portail_update_name"),
                    " CLICK IN PORTAIL OPTIONS"))return false; //where
            if (!Functions.enterQueryAndClickResult(driver,
                    new String[]{"gp_b_actions_b_portail_update_b_qbe_i_name", getElements("gp_b_actions_b_portail_update_b_qbe_i_name")}, //query input
                    new String[]{"gp_b_actions_b_portail_update_e_result", getElements("gp_b_actions_b_portail_update_e_result")}, //result
                    ""))return false; //where
        }else{
            driver.getReport().addContent("The Portail Update pop up has not values", "h3","");
            Functions.screenshot(driver,false);
        }
        if (!detach(driver,"gp_b_actions_b_portail_update_b_detach"))return false;
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                new String[]{"gp_b_actions_b_portail_update_b_close", getElements("gp_b_actions_b_portail_update_b_close")},
                " CLICK IN PORTAIL OPTIONS")) return false;
        return true;
    }
    private boolean leave_everything_the_same(TestDriver driver) {
        driver.getReport().addHeader("PROCESS LEAVE EVERYTHING THE SAME IN HOTEL PRIORITY FOR CLIENT BLOCK", 2, false);
        if (testNormal_cli1){
            if (!delete_cli(driver))return false;
        }else{
            if (testNormal_cli2){
                if (!fill_create_cli(driver, 1, false)) return false;
            }else {
                if (!fill_create_cli(driver,1, true))return false;
            }
        }
        return true;
    }
    private boolean audit_cli(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
        Functions.zoomIn(driver);
        Functions.zoomOut(driver,3);
        if (!Functions.auditData(driver,
                new String[]{"cli_actions_b",getElements("cli_actions_b")}, //Functionss button
                new String[]{"cli_audit_b",getElements("cli_audit_b")}, //audit button
                new String[]{"cli_audit_ok_b",getElements("cli_audit_ok_b")}, //audit_b_ok
                false,
                " on cli audit data"))return false;//where this occurs
        return true;
    }
    private boolean getData_cli(TestDriver driver, int num_element) {
        driver.getReport().addHeader("GET VALUES IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
        //if (driver.getDriver().findElement(By.xpath(getElements("cli_cli_e_noresult"))).getSize().getHeight()>0 && driver.getDriver().findElement(By.xpath(getElements("cli_cli_e_noresult"))).isDisplayed()){
        if (no_data_to_display(driver,"cli_click_e_search")){
            if (num_element == 1) {
                testNormal_cli1 = true;
            }else{
                testNormal_cli2 = true;
            }
        }else{
            if (!Functions.simpleClick(driver,
                new String[]{"cli_click_e_search", getElements("cli_click_e_search")}, //element to click
                " on click e search cli"))return false;
            if (!Functions.checkClick(driver,
                    new String[]{"cli_b_edit", getElements("cli_b_edit")}, //element to click
                    recursiveXPaths.glass, //element expected to appear
                    " on button edit getData_cli"))return false;
            if (!Functions.getValue(driver,new String[]{"cli_ss_edit_i_hotelId", getElements("cli_ss_edit_i_hotelId")}, // element path
                    "cli_hotel_code"+num_element, // key for data value (the name)
                    " on edit getData_cli"))return false;// whoere this operation occurs
            if (!Functions.getValue(driver,new String[]{"cli_ss_edit_i_priority", getElements("cli_ss_edit_i_priority")}, // element path
                    "cli_priority"+num_element, // key for data value (the name)
                    " on edit getData_cli"))return false; // whoere this operation occurs
            if (!Functions.getValue(driver,
                    new String[]{"cli_ss_edit_i_client", getElements("cli_ss_edit_i_client")}, //e1
                    "hotel_client"+num_element, //data_name
                    " on HOTEL PRIORITY for client"))return false; //where
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"cli_b_cancel_edit", getElements("cli_b_cancel_edit")}, //e1
                    recursiveXPaths.glass, //e2
                    " on hotel priority cancel edit b"))return false; //where
            if (!delete_cli(driver))return false;
        }
        return true;
    }
    private boolean fill_create_cli(TestDriver driver, int num_element, boolean creation) {
        String where = "";
        String value_hotel_lov = "";
        String value_client_lov = "";
        String value_priority = String.valueOf(DataGenerator.random(1, 5));;
        String [] result_lov = recursiveXPaths.lov_e_result;

        if ((num_element == 1 && this.testNormal_cli1==false) || (num_element == 2 && this.testNormal_cli2==false)) {
            value_hotel_lov = data.getData().get("cli_hotel_code" + num_element);
            value_client_lov = data.getData().get("hotel_client" + num_element);
            value_priority = data.getData().get("cli_priority" + num_element);
        }

       /* if (num_element == 1 && this.testNormal_cli1==false){
            value_hotel_lov = data.getData().get("cli_hotel_code"+num_element);
            value_client_lov = data.getData().get("hotel_client"+num_element);
            value_priority = data.getData().get("cli_priority"+num_element);
        }*/
        if (num_element == 2 && this.testNormal_cli2==true){
            result_lov = recursiveXPaths.lov_e_altresult;
        }/*else if (num_element == 2 && this.testNormal_cli2==false){
            value_hotel_lov = data.getData().get("cli_hotel_code"+num_element);
            value_client_lov = data.getData().get("hotel_client"+num_element);
            value_priority = data.getData().get("cli_priority"+num_element);
        }*/
        if (creation) {
            driver.getReport().addHeader("CREATE A NEW RECORD IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
            where = " on CREATION IN HOTEL PRIORITY FOR CLIENT BLOCK";
            if (!Functions.checkClick(driver,
                    new String[]{"cli_b_add", getElements("cli_b_add")}, //e1
                    recursiveXPaths.glass, //e2
                    where)) return false; //where
        }else {
            driver.getReport().addHeader("EDITION A RECORD IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
            where = " on EDITION IN HOTEL PRIORITY FOR CLIENT BLOCK";
            if (!Functions.checkClick(driver,
                    new String[]{"cli_b_edit", getElements("cli_b_edit")}, //e1
                    recursiveXPaths.glass, //e2
                    where)) return false; //where
        }
            if (!Functions.createLovByValue(driver,
                    new String[]{"cli_ss_add_lov_hotel_code",getElements("cli_ss_add_lov_hotel_code")}, // b_lov
                    new String[]{"cli_ss_add_i_hotel_code", getElements("cli_ss_add_i_hotel_code")}, // i_lov
                    new String[]{"cli_ss_add_lov_hotel_code_i_code",recursiveXPaths.lov_i_genericinput},
                    result_lov, // lov internal result
                    value_hotel_lov,
                    "cli_hotel_code"+num_element,
                    where))return false; // where the operation occurs
            if (!Functions.createLovByValue(driver,
                    new String[]{"cli_ss_add_lov_client_code",getElements("cli_ss_add_lov_client_code")}, // b_lov
                    new String[]{"cli_ss_add_i_client_code", getElements("cli_ss_add_i_client_code")}, // i_lov
                    new String[]{"ccli_ss_add_lov_client_code_i_code",recursiveXPaths.lov_i_genericinput},
                    result_lov, // lov internal result
                    value_client_lov, //Data name
                    "hotel_client"+num_element,
                    where))return false; // where the operation occurs
            if (!Functions.insertInput(driver,
                    new String[]{"cli_ss_add_i_priority", getElements("cli_ss_add_i_priority")}, //input
                    "cli_priority"+num_element, //data_name
                    value_priority, //value
                    where))return false; //where
                if (!Functions.getValue(driver,
                        new String[]{"cli_ss_add_i_des_hotel", getElements("cli_ss_add_i_des_hotel")}, //e1
                        "cli_des_hotel"+num_element, //data_name
                        where))return false; //where
                if (!Functions.getValue(driver,
                        new String[]{"cli_ss_add_i_destination", getElements("cli_ss_add_i_destination")}, //e1
                        "cli_destination_hotel"+num_element, //data_name
                        where))return false; //where
            //SAVE
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"cli_ss_add_b_save", getElements("cli_ss_add_b_save")}, //e1
                    recursiveXPaths.glass, //e2
                    where))return false; //where
        return true;
    }
    private boolean query_cli(TestDriver driver, int num_element) {
        driver.getReport().addHeader("SEARCH BY QBE IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
        //CLICK QbE
        Functions.clickQbE(driver,
                new String[]{"cli_b_qbe", getElements("cli_b_qbe")},
                new String[]{"cli_qbe_i_hotel_code", getElements("cli_qbe_i_hotel_code")},
                " on query cli");
        Functions.insertInput(driver,
                new String[]{"cli_qbe_i_hotel_code", getElements("cli_qbe_i_hotel_code")}, //input
                "des_hotel"+num_element, //data_name
                 "%"+data.getData().get("cli_des_hotel"+num_element), //value
                " on query cli"); //where
        Functions.insertInput(driver,
                new String[]{"cli_qbe_i_client_code", getElements("cli_qbe_i_client_code")}, //input
                "des_hotel"+num_element, //data_name
                data.getData().get("cli_destination_hotel"+num_element), //value
                " on query cli"); //where
        //QUERY
        Functions.enterQueryAndClickResult(driver,
                new String[]{"cli_qbe_i_hotel_code", getElements("cli_qbe_i_hotel_code")}, //query input
                new String[]{"cli_e_result", getElements("cli_e_result")}, //result
                " on query cli"); //where
        return true;
    }
    private boolean delete_cli(TestDriver driver) {
        driver.getReport().addHeader("DELETE THE RECORD IN HOTEL PRIORITY FOR CLIENT BLOCK", 3, false);
        if (!Functions.simpleClick(driver,
                new String[]{"cli_click_e_search", getElements("cli_click_e_search")}, //element to click
                " on click e search cli"))return false;
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"cli_b_delete", getElements("cli_b_delete")}, //button delete
                new String[]{"cli_n_records", getElements("cli_n_records")}, // result
                new String[]{"cli_ss_delete_b_yes", getElements("cli_ss_delete_b_yes")}, //delete button yes
                " on HOTEL PRIORITY FROM CLIENT DELETE")){return false;}
        /*Functions.simpleClick(driver,
                new String[]{"cli_click_e_search", getElements("cli_click_e_search")}, //element to click
                " on where");

        Functions.checkClick(driver,
                new String[]{"cli_b_delete", getElements("cli_b_delete")},
                recursiveXPaths.glass,
                " on HOTEL PRIORITY COUNTRY DELETE");
        Functions.checkClickByAbsence(driver,
                new String[]{"cli_ss_delete_b_yes", recursiveXPaths.delete_b_yes},
                recursiveXPaths.glass,
                " on HOTEL PRIORITY COUNTRY DELETE");*/
      /*  Functions.checkDelete(driver,
                new String[]{"cli_e_result_no_data", getElements("cli_e_result_no_data")});*/

        return true;
    }

    private boolean test_regression_SDCSESD_filter(TestDriver driver) {
        driver.getReport().addHeader("TEST CSED IN FILTER BLOCK", 3, false);
        if (!clear_all_qbe(driver))return false;
        if (!apply_filter(driver))return false;
        if (!priority_hotels(driver))return false;
        if (!hotel_priority_for_client(driver))return false;
        driver.getReport().closeBlock();
        return true;
    }

    private boolean clear_all_qbe(TestDriver driver) {
        driver.getReport().addHeader("CLEAR ALL VALUES IN QBE", 3, false);
        if ((Functions.displayed(driver, getElements("gp_b_show_detach")))&&(Functions.displayed(driver, getElements("gp_b_qbe")))){
            if (!Functions.checkClick(driver,
                    new String[]{"gp_b_show_detach", getElements("gp_b_show_detach")},
                    new String[]{"gp_b_qbe", getElements("gp_b_qbe")},
                    " to SHOW HIDDEN TOOLBAR (RESOLUTION SCREEN-SIZE ISSUES)"))return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"gp_b_qbe", getElements("gp_b_qbe")}, //query_input
                new String[]{"gp_qbe_i_hotel_desc", getElements("gp_qbe_i_hotel_desc")}, //qbe_button
                " on VERIFY QBE GENERAL PRIORITY "))return false; //where
        if (!Functions.simpleClick(driver,
                new String[]{"gp_b_qbe_b_clear", getElements("gp_b_qbe_b_clear")}, //element to click
                " on CLEAR QBE GENERAL PRIORITY ")){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"hpc_b_qbe", getElements("hpc_b_qbe")}, //query_input
                new String[]{"hpc_qbe_i_hotel_desc", getElements("hpc_qbe_i_hotel_desc")}, //qbe_button
                " on VERIFY QBE HOTEL PRIORITY"))return false; //where
        if (!Functions.simpleClick(driver,
                new String[]{"hpc_b_qbe_b_clear", getElements("hpc_b_qbe_b_clear")}, //element to click
                " on CLEAR QBE HOTEL PRIORITY"))return false;
        if (!Functions.clickQbE(driver,
                new String[]{"cli_b_qbe", getElements("cli_b_qbe")},
                new String[]{"cli_qbe_i_hotel_code", getElements("cli_qbe_i_hotel_code")},
                " on VERIFY QBE PRIORITI FOR CLIENT"))return false;
        if (!Functions.simpleClick(driver,
                new String[]{"cli_b_qbe_b_clear", getElements("cli_b_qbe_b_clear")}, //element to click
                " on CLEAR QBE PRIORITI FOR CLIENT"))return false;
        return true;
    }
    private boolean hotel_priority_for_client(TestDriver driver) {
        driver.getReport().addHeader("HOTEL PRIORITY FOR CLIENT POP UP", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"filter_b_hotel", getElements("filter_b_hotel")},
                new String[]{"hotel_priority_b_close", getElements("hotel_priority_b_close")},
                " OPEN HOTEL PRIORITY FOR CLIENT POP UP")) return false;
        if (!no_data_to_display(driver,"hotel_priority_e_result")){
            String[] columns = {"hotel_priority_priority","hotel_priority_hotel","hotel_priority_destination"};
            if (!Functions.collectTableData(driver,columns,getElements("hotel_priority_table_result"),1," on GET VALUES IN HOTEL PRIORITY FOR CLIENT POP UP"))return false;
            if (!Functions.clickQbE(driver,
                    new String[]{"hotel_priority_b_qbe", getElements("hotel_priority_b_qbe")},
                    new String[]{"hotel_priority_b_qbe_i_priority", getElements("hotel_priority_b_qbe_i_priority")},
                    " on HOTEL PRIORITY FOR CLIENT POP UP")) return false;
            if (!Functions.insertInput(driver,
                    new String[]{"hotel_priority_b_qbe_i_priority", getElements("hotel_priority_b_qbe_i_priority")}, //input
                    "hotel_priority_priority", //data_name
                    data.getData().get("hotel_priority_priority"),
                    " on HOTEL PRIORITY FOR CLIENT POP UP"))return false; //where
            if (!Functions.insertInput(driver,
                    new String[]{"hotel_priority_b_qbe_i_hotel", getElements("hotel_priority_b_qbe_i_hotel")}, //input
                    "hotel_priority_hotel", //data_name
                    data.getData().get("hotel_priority_hotel"),
                    " on HOTEL PRIORITY FOR CLIENT POP UP"))return false; //where
            if (!Functions.insertInput(driver,
                    new String[]{"hotel_priority_b_qbe_i_destination", getElements("hotel_priority_b_qbe_i_destination")}, //input
                    "hotel_priority_destination", //data_name
                    data.getData().get("hotel_priority_destination"),
                    " on HOTEL PRIORITY FOR CLIENT POP UP"))return false; //where
            if (!Functions.enterQueryAndClickResult(driver,
                    new String[]{"hotel_priority_b_qbe_i_destination", getElements("hotel_priority_b_qbe_i_destination")}, //query input
                    new String[]{"hotel_priority_e_result", getElements("hotel_priority_e_result")}, //result
                    " on HOTEL PRIORITY FOR CLIENT POP UP"))return false; //where
        }else{
            driver.getReport().addContent("The Portail Update pop up has not values", "h3","");
            Functions.screenshot(driver,false);
        }
        if (!detach(driver,"hotel_priority_b_detach"))return false;
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_priority_b_close", getElements("hotel_priority_b_close")},
                new String[]{"hotel_priority_b_close", getElements("hotel_priority_b_close")},
                " on HOTEL PRIORITY FOR CLIENT POP UP")) return false;
        return true;
    }
    private boolean priority_hotels(TestDriver driver) {
        driver.getReport().addHeader("PRIORITY OF HOTELS(country) POP UP", 3, false);
        if (!Functions.checkClick(driver,
                new String[]{"filter_b_priority", getElements("filter_b_priority")},
                new String[]{"priority_hotels_b_close", getElements("priority_hotels_b_close")},
                " OPEN PRIORITY OF HOTELS POP UP")) return false;
        if (!no_data_to_display(driver,"priority_hotels_e_result")){
            String[] columns = {"priority_hotles_priority","priority_hotles_hotel","priority_hotles_destination"};
            if (!Functions.collectTableData(driver,columns,getElements("priority_hotels_table_result"),1," on GET VALUES IN PRIORITY OF HOTELS POP UP"))return false;
            if (!Functions.clickQbE(driver,
                    new String[]{"priority_hotels_b_qbe", getElements("priority_hotels_b_qbe")},
                    new String[]{"priority_hotels_b_qbe_i_priority", getElements("priority_hotels_b_qbe_i_priority")},
                    " on PRIORITY OF HOTELS POP UP")) return false;
            if (!Functions.insertInput(driver,
                    new String[]{"priority_hotels_b_qbe_i_priority", getElements("priority_hotels_b_qbe_i_priority")}, //input
                    "priority_hotles_priority", //data_name
                    data.getData().get("priority_hotles_priority"),
                    " on PRIORITY OF HOTELS POP UP"))return false; //where
            if (!Functions.insertInput(driver,
                    new String[]{"priority_hotels_b_qbe_i_hotel", getElements("priority_hotels_b_qbe_i_hotel")}, //input
                    "priority_hotles_hotel", //data_name
                    data.getData().get("priority_hotles_hotel"),
                    " on PRIORITY OF HOTELS POP UP"))return false; //where
            if (!Functions.insertInput(driver,
                    new String[]{"priority_hotels_b_qbe_i_destination", getElements("priority_hotels_b_qbe_i_destination")}, //input
                    "priority_hotles_destination", //data_name
                    data.getData().get("priority_hotles_destination"),
                    " on PRIORITY OF HOTELS POP UP"))return false; //where
            if (!Functions.enterQueryAndClickResult(driver,
                    new String[]{"priority_hotels_b_qbe_i_destination", getElements("priority_hotels_b_qbe_i_destination")}, //query input
                    new String[]{"priority_hotels_e_result", getElements("priority_hotels_e_result")}, //result
                    " on PRIORITY OF HOTELS POP UP"))return false; //where
        }else{
            driver.getReport().addContent("The Portail Update pop up has not values", "h3","");
            Functions.screenshot(driver,false);
        }
        if (!detach(driver,"priority_hotels_b_detach"))return false;
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"priority_hotels_b_close", getElements("priority_hotels_b_close")},
                new String[]{"priority_hotels_b_close", getElements("priority_hotels_b_close")},
                " on PRIORITY OF HOTELS POP UP")) return false;
        return true;
    }
    private boolean apply_filter(TestDriver driver) {
        driver.getReport().addHeader("APPLY FILTER", 3, false);
        //VALORES HARCODEADOS APOSTA --> ALEX 09/12/2016
        if (!Functions.createLovByValue(driver,
                new String[]{"filter_lov_country",getElements("filter_lov_country")}, // b_lov
                new String[]{"filter_i_country", getElements("filter_i_country")}, // i_lov
                new String[]{"filter_i_country_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "ES", //value
                "filter_country", //data_name
                " on FILTER BLOCK"))return false; //where
        if (!Functions.createLovByValue(driver,
                new String[]{"filter_lov_destination",getElements("filter_lov_destination")}, // b_lov
                new String[]{"filter_i_destination", getElements("filter_i_destination")}, // i_lov
                new String[]{"filter_lov_destination_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "PMI", //value
                "filter_destination", //data_name
                " on FILTER BLOCK"))return false; //where
        if(!Functions.createLov(driver,
                new String[]{"filter_lov_client",getElements("filter_lov_client")}, // b_lov
                new String[]{"filter_i_client", getElements("filter_i_client")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "filter_client", //Data name
                " on FILTER BLOCK")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"filter_lov_office",getElements("filter_lov_office")}, // b_lov
                new String[]{"filter_i_office", getElements("filter_i_office")}, // i_lov
                new String[]{"filter_lov_office_i_receptive", getElements("filter_lov_office_i_receptive")}, //internal LoV input
                "1", //value
                "filter_receptive", //data_name
                " on FILTER BLOCK"))return false; //where
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"filter_b_aplicar_filtro",getElements("filter_b_aplicar_filtro")},
                new String[]{"gp_e_result", getElements("gp_e_result")},
                " on FILTER BLOCK"))return false;
        if (!Functions.getText(driver,new String[]{"general_priority_e_result_e_destination", getElements("general_priority_e_result_e_destination")}, // element path
                "gp_desstination", // key for data value (the name)
                " on edit getData_gp"))return false; // whoere this operation occurs

        if (data.getData().get("gp_desstination").equals(data.getData().get("filter_destination"))){
            driver.getReport().addContent("The filter has been applied correctly");
            Functions.screenshot(driver);
        }else{
            ErrorManager.process(driver,"The filter hasn't been applied correctly");
            return false;
        }
        return true;
    }

    private boolean delete_n_records(TestDriver driver, String n_records, String b_delete,String b_showtoolbar, String b_showNrecords, String where) {
        driver.getReport().addHeader("EDIT A NEW RECORD", 3, false);

        // se diferencia del metodo se Functions por ciclar el mostar los botones
        driver.getReport().addContent("Deleting Record:", "h5", "");
        try {
            if ((Functions.displayed(driver,getElements(b_showNrecords)))&&(!Functions.displayed(driver, getElements(n_records)))){
                Functions.simpleClick(driver,
                        new String[]{b_showNrecords, getElements(b_showNrecords)}, //element to click
                        where);
            }
        } catch (Exception e) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records + " or cast it to integer before delete was done.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
        if ((Functions.displayed(driver, getElements(b_showtoolbar)))&&(!Functions.displayed(driver, getElements(b_delete)))){
            Functions.simpleClick(driver,
                    new String[]{b_showtoolbar, getElements(b_showtoolbar)}, //element to click
                    where);
        }
        Functions.checkClick(driver,
                new String[]{b_delete, getElements(b_delete)}, //e1
                recursiveXPaths.glass, //e2
                where); //where
        Functions.checkClickByAbsence(driver,
                new String[]{"b_delete_yes", recursiveXPaths.delete_b_yes},
                recursiveXPaths.glass, where);
        return true;
    }
    private boolean detach(TestDriver driver, String detach) {
        driver.getReport().addHeader("DETACH TABLE", 3, false);
        Functions.zoomIn(driver);
        Functions.zoomOut(driver,3);
        if (!Functions.detachTable(driver,
                new String[]{detach,getElements(detach)}, //detach button
                true,false," on detach"))return false;     //where this occurs
        return true;
    }
    private boolean no_data_to_display (TestDriver driver, String xpath) {
        String xpath_table [];
        if (!Functions.displayed(driver, getElements(xpath))) {
            xpath_table = getElements(xpath).split("/table");
            Functions.getText(driver,
                    new String[]{xpath, xpath_table[0]}, //e1
                    "no_data_value", //data_name
                    " on HOTEL PRIORITY COUNTRY"); //where
            if (data.getData().get("no_data_value").equals("No data to display.")) {
                driver.getReport().addContent("The table restult hasn't values");
                return true;
            }
        }
        return false;
    }
}
