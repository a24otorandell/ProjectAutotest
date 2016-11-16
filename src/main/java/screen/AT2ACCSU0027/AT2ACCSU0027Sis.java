package screen.AT2ACCSU0027;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by vsolis on 21/09/2016.
 */
public class AT2ACCSU0027Sis {

    protected AT2ACCSU0027Locators locators;
    protected AT2ACCSU0027Data data;

    public AT2ACCSU0027Sis() {

    }

    public AT2ACCSU0027Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2ACCSU0027Locators locators) {
        this.locators = locators;
    }
    public AT2ACCSU0027Data getData() {
        return data;
    }
    public void setData(AT2ACCSU0027Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Office Sending Configuration");
    }
    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){

        if(!Sws_office_sending(driver)){
            return false;
        }


        return false;
    }

    private boolean Sws_office_sending (TestDriver driver){


        if(!Edit_sws(driver)){
            return false;
        }
        if(!Search_sws(driver)){
            return false;
        }
        if(!QBE_sws(driver)){
            return false;
        }
        if(!Other_actions_sws(driver)){
            return false;
        }

        return true;
    }

    private boolean Edit_sws (TestDriver driver){
        driver.getReport().addHeader("EDIT IN SWS",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"SWS_se_b_save",getElements("SWS_se_b_save")}, //element to click
                " on EDIT")){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"SWS_ed_result",getElements("SWS_ed_result")}, //element to click
                " on EDIT")){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"SWS_ed_b_edit",getElements("SWS_ed_b_edit")}, //element to click
                new String[]{"SWS_ed_i_code",getElements("SWS_ed_i_code")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on EDIT")){
            return false;
        }
        Functions.getValue(driver,new String[]{"SWS_ed_i_code",getElements("SWS_ed_i_code")}, // element path
                "code", // key for data value (the name)
                " on EDIT");
        Functions.getValue(driver,new String[]{"SWS_ed_i_desreceptivo",getElements("SWS_ed_i_desreceptivo")}, // element path
                "desrecep", // key for data value (the name)
                " on EDIT");
        if(!Functions.insertInput(driver,new String[]{"SWS_ed_i_Email",getElements("SWS_ed_i_Email")},
                "email",DataGenerator.getRandomAlphanumericSequence(5,true) + "@" + DataGenerator.getRandomAlphanumericSequence(5,true) + ".es"," on EDIT")){
            return false;
        }

        Random value = new Random();
        boolean getRandomBoolean = value.nextBoolean();

        String randomBoolean;

        if(getRandomBoolean){

            randomBoolean = "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("SWS_ed_check_box_contracts"),"contracts",true,true," on EDIT")){
                return false;
            }
        } else {
            randomBoolean = "No";
            if(!Functions.checkboxValue(driver,
                    getElements("SWS_ed_check_box_contracts"),"contracts",false,true," on EDIT")){
                return false;

            }

        }


        Random value2 = new Random();
        boolean getRandomBoolean2 = value2.nextBoolean();

        String randomBoolean2;

        if(getRandomBoolean2){

            randomBoolean2 = "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("SWS_ed_check_box_send_report"),"report",true,true," on EDIT")){
                return false;
            }
        } else {
            randomBoolean2 = "No";
            if(!Functions.checkboxValue(driver,
                    getElements("SWS_ed_check_box_send_report"),"report",false,true," on EDIT")){
                return false;

            }

        }
        Random value3 = new Random();
        boolean getRandomBoolean3 = value3.nextBoolean();

        String randomBoolean3;

        if(getRandomBoolean3){

            randomBoolean3 = "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("SWS_ed_check_box_stop_sales"),"sales",true,true," on EDIT")){
                return false;
            }
        } else {
            randomBoolean3 = "No";
            if(!Functions.checkboxValue(driver,
                    getElements("SWS_ed_check_box_stop_sales"),"sales",false,true," on EDIT")){
                return false;

            }

        }
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"SWS_ed_b_save",getElements("SWS_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                " on EDIT")){
            return false;
        }


        return true;
    }
    private boolean Other_actions_sws (TestDriver driver){

        driver.getReport().addHeader("OTHER ACTIONS IN SWS",3,false);


        if(!Functions.auditData(driver,
                new String[]{"SWS_ac_b_actions",getElements("SWS_ac_b_actions")}, //actions button
                new String[]{"SWS_ac_b_audit_data",getElements("SWS_ac_b_audit_data")}, //audit button
                new String[]{"SWS_ac_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on OTHER ACTIONS")){
            return false;

        }

        if(!Functions.detachTable(driver,
                new String[]{"SWS_b_detach",getElements("SWS_b_detach")}, //detach button
                true,     //screenshot??
                " on OTHER ACTIONS")){
            return false;
        }


        return true;
    }
    private boolean QBE_sws (TestDriver driver){

        driver.getReport().addHeader("  QBE IN SWS",3,false);

        if(!Functions.simpleClick(driver,
                new String[]{"SWS_se_b_reset",getElements("SWS_se_b_reset")}, //element to click
                " on QBE")){
            return false;
        }


        if(!Functions.clickQbE(driver,
                new String[]{"SWS_qbe_b_qbe",getElements("SWS_qbe_b_qbe")},// query button
                new String[]{"SWS_qbe_i_code",getElements("SWS_qbe_i_code")},//any query input
                " on QBE")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"SWS_qbe_i_code",getElements("SWS_qbe_i_code")},
                "qbe_code",data.getData().get("code")," on QBE ")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"SWS_qbe_i_desreceptivo",getElements("SWS_qbe_i_desreceptivo")},
                "qbe_desrecep",data.getData().get("desrecep")," on QBE ")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"SWS_qbe_i_Email",getElements("SWS_qbe_i_Email")},
                "qbe_email",data.getData().get("email")," on QBE ")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"SWS_qbe_select_text_contracts",getElements("SWS_qbe_select_text_contracts")},
                getData("contracts"),"qbe_contracts"," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"SWS_qbe_select_text_send_report",getElements("SWS_qbe_select_text_send_report")},
                getData("report"),"qbe_report"," on QBE")){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"SWS_qbe_select_text_stop_sales",getElements("SWS_qbe_select_text_stop_sales")},
                getData("sales"),"qbe_sales"," on QBE")){
            return false;
        }
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"SWS_qbe_i_Email",getElements("SWS_qbe_i_Email")}, //any query input
                new String[]{"SWS_ed_result",getElements("SWS_ed_result")}, //table result
                " on QBE")){
            return false;
        } // where this operation occurs


        return true;
    }
    private boolean Search_sws (TestDriver driver){

        boolean check_box_contract;
        boolean check_box_report;
        boolean check_box_sales;


        driver.getReport().addHeader(" SEARCH IN SWS",3,false);

        if(!Functions.insertInput(driver,
                new String[]{"SWS_se_i_code",getElements("SWS_se_i_code")},
                "se_code",data.getData().get("code")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"SWS_se_i_desreceptivo",getElements("SWS_se_i_desreceptivo")},
                "se_descrecep",data.getData().get("desrecep")," on SEARCH")){
            return false;
        }
        if(!Functions.insertInput(driver,
                new String[]{"SWS_se_i_Email",getElements("SWS_se_i_Email")},
                "se_email",data.getData().get("email")," on SEARCH")){
            return false;
        }
        if(getData("contracts").equalsIgnoreCase("Yes")){
            check_box_contract = true;
        } else {

            check_box_contract = false;
        }

        if(getData("report").equalsIgnoreCase("Yes")){
            check_box_report = true;
        } else {

            check_box_report = false;
        }


        if(getData("sales").equalsIgnoreCase("Yes")){
            check_box_sales = true;
        } else {


            check_box_sales = false;

        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkboxValue(driver,
                getElements("SWS_se_check_box_contracts"),"contracts",check_box_contract,true," on SEARCH")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkboxValue(driver,
                getElements("SWS_se_check_box_send_report"),"report",check_box_report,true," on SEARCH")){
            return false;
        }
        if(!Functions.checkboxValue(driver,
                getElements("SWS_se_check_box_stop_sales"),"sales",check_box_sales,true," on SEARCH")){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"SWS_se_b_save",getElements("SWS_se_b_save")}, //search button
                new String[]{"SWS_ed_result",getElements("SWS_ed_result")}, //Falta crear este resultado por bug
                " on SEARCH")){
            return false;
        }
        return true;
    }
}
