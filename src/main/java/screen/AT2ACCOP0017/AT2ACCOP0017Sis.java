package screen.AT2ACCOP0017;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by acarrillo on 28/11/2016.
 */
public class AT2ACCOP0017Sis {
    protected AT2ACCOP0017Locators locators;
    protected AT2ACCOP0017Data data;

    public void setData(AT2ACCOP0017Data data) {
        this.data = data;
    }
    public void setLocators(AT2ACCOP0017Locators locators) {
        this.locators = locators;
    }
    public AT2ACCOP0017Data getData() {
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
        driver.getTestdetails().setMainmenu("Acomodation");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Error Monitoring");
    }
    public boolean testCSED(TestDriver driver) {
        if (!getvalues(driver))return false;
        if (!getvaluesNull(driver))return false;
        if (!qbe(driver))return false;
        if (!validationError(driver))return false;
        if (!qbeValidationError(driver))return false;
        if (!processError(driver))return false;
        if (!processErrorTabCE_Payment(driver))return false;
        if (!processErrorTabCE_itp(driver))return false;
        if (!search(driver))return false;
        if (!extraActions(driver))return false;

        return true;
    }

    private boolean getvalues(TestDriver driver) {
        driver.getReport().addHeader("GIVE ELEMENTS IN MAIN TABLE", 3, false);
        Functions.zoomOut(driver,8);
        String where = " GIVE VALUE FROM MAIN TABLE";
        if (!Functions.insertInput(driver, new String[]{"search_i_datefrom", getElements("search_i_datefrom")},
                "clear",
                "",
                where))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_dateto", getElements("search_i_dateto")},
                "clear",
                "",
                where))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_valdatefrom", getElements("search_i_valdatefrom")},
                "clear",
                "",
                where))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_valdateto", getElements("search_i_valdateto")},
                "clear",
                "",
                where))return false;
        if (!Functions.clickQbE(driver,
                new String[]{"tb_b_query", getElements("tb_b_query")},
                new String[]{"tb_b_query_i_error", getElements("tb_b_query_i_error")},
                where))return false;
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")},
                "qbe_e_order_code",
                "e%-%",
                where))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                where))return false;
        String[] columns = {"qbe_e_error","qbe_e_operation","qbe_e_order_code","qbe_e_transaction","qbe_e_receptivo","qbe_e_booking","qbe_e_operation_type",
                "qbe_e_type","qbe_e_order_report","qbe_e_financial_report","qbe_e_message","qbe_e_date","qbe_e_error_code","qbe_e_tech_error_desc",
                "qbe_e_map_error_code","qbe_e_map_error_desc","qbe_e_psp_error_code","qbe_e_psp_error_desc","qbe_e_token_error","qbe_e_warning",
                "qbe_e_validated","qbe_e_validated_by","qbe_e_validate_date"};
        if (!Functions.collectTableData(driver,columns,getElements("tb_error_monitoring"),1,where))return false;

        /*GET TEXT TAB ERROR_MONITORING*/
        List<WebElement> allFieldElements = driver.getDriver().findElements(By.xpath(getElements("tb_error_monitoring")));
        for (int i = 0; i < allFieldElements.size(); i++) {
            List <WebElement> warningIcon = allFieldElements.get(i).findElements(By.tagName("img"));
            if(warningIcon.size() > 0){
                data.getData().put("qbe_e_warning", "Yes");
                driver.getReport().addContent("Content (Yes) taken from tb_b_query_e_warning on QbE Waning");
            }else{
                data.getData().put("qbe_e_warning", "No");
                driver.getReport().addContent("Content (No) taken from tb_b_query_e_warning on QbE Waning");
            }
        }
        /*GET TEXT TAB ERROR_MONITORING*/
        if(data.getData().get("qbe_e_validated").equals("0")){
            data.getData().put("qbe_e_validated", "No");
            driver.getReport().addContent("Content (No) taken from tb_b_query_e_validated on QbE Waning");
        }else{
            data.getData().put("qbe_e_warning", "Yes");
            driver.getReport().addContent("Content (Yes) taken from tb_b_query_e_validated on QbE Waning");
        }
        return true;
    }
    private boolean getvaluesNull(TestDriver driver) {
        driver.getReport().addHeader("ORDER THE ELEMENTS NULL AND GIVE AGAIN", 3, false);
        //Se realiza un segundo getText debido al ser una tabla donde no todos los campos tienen contenido y se reordena las columnas
        //buscamos por todos los campos, ya que no todos lo campos estan rellenados en esta tabla
        Functions.break_time(driver, 30, 500);
        if (data.getData().get("qbe_e_error").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_error", getElements("tb_b_query_b_error")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
              /*GET TEXT ERROR*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_error", getElements("tb_b_query_e_error")}, // element path
                    "qbe_e_error", // key for data value (the name)
                    " on QbE TAB MONITORING"))return false;
        }
        if (data.getData().get("qbe_e_operation").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_operation", getElements("tb_b_query_b_operation")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_operation", getElements("tb_b_query_e_operation")}, // element path
                    "qbe_e_operation", // key for data value (the name)
                    " on QbE operation"))return false;
        }
        if (data.getData().get("qbe_e_order_code").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_order_code", getElements("tb_b_query_b_order_code")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_order_code", getElements("tb_b_query_e_order_code")}, // element path
                    "qbe_e_order_code", // key for data value (the name)
                    " on QbE payment"))return false;
        }
        if (data.getData().get("qbe_e_transaction").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_transaction", getElements("tb_b_query_b_transaction")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_transaction", getElements("tb_b_query_e_transaction")}, // element path
                    "qbe_e_transaction", // key for data value (the name)
                    " on QbE transaction"))return false;
        }
        if (data.getData().get("qbe_e_receptivo").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_receptivo", getElements("tb_b_query_b_receptivo")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT BOOKING*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_receptivo", getElements("tb_b_query_e_receptivo")}, // element path
                    "qbe_e_receptivo", // key for data value (the name)
                    " on QbE receptivo"))return false;
        }
        if (data.getData().get("qbe_e_booking").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_booking", getElements("tb_b_query_b_booking")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT BOOKING*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_booking", getElements("tb_b_query_e_booking")}, // element path
                    "qbe_e_booking", // key for data value (the name)
                    " on QbE booking"))return false;
        }
        if (data.getData().get("qbe_e_operation_type").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_select_otype", getElements("tb_b_query_b_select_otype")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT OPERATION TYPE*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_operation_type", getElements("tb_b_query_e_operation_type")}, // element path
                    "qbe_e_operation_type", // key for data value (the name)
                    " on QbE operation_type"))return false;
        }

        if (data.getData().get("qbe_e_type").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_select_type", getElements("tb_b_query_b_select_type")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT OPERATION TYPE*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_type", getElements("tb_b_query_e_type")}, // element path
                    "qbe_e_type", // key for data value (the name)
                    " on QbE operation_type"))return false;
        }


        if (data.getData().get("qbe_e_order_report").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_orderreport", getElements("tb_b_query_b_orderreport")}, //element to click
                    " on QbE MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT ORDER REPORT*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_order_report", getElements("tb_b_query_e_order_report")}, // element path
                    "qbe_e_order_report", // key for data value (the name)
                    " on QbE order report"))return false;
        }
        if (data.getData().get("qbe_e_financial_report").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_financialreport", getElements("tb_b_query_b_financialreport")}, //element to click
                    " on QbE MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT FINANCIAL REPORT*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_financial_report", getElements("tb_b_query_e_financial_report")}, // element path
                    "qbe_e_financial_report", // key for data value (the name)
                    " on QbE financial report"))return false;
        }
        if (data.getData().get("qbe_e_message").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_message", getElements("tb_b_query_b_message")}, //element to click
                    " on QbE MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT MESSAGE*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_message", getElements("tb_b_query_e_message")}, // element path
                    "qbe_e_message", // key for data value (the name)
                    " on QbE MESSAGE"))return false;
        }
        if (data.getData().get("qbe_e_date").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_date", getElements("tb_b_query_b_date")}, //element to click
                    " on QbE MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT DATE*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_date", getElements("tb_b_query_e_date")}, // element path
                    "qbe_e_date", // key for data value (the name)
                    " on QbE date"))return false;
        }
        if (data.getData().get("qbe_e_error_code").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_techerrorcode", getElements("tb_b_query_b_techerrorcode")}, //element to click
                    " on QbE MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT TECH ERROR CODE*/
            if (!Functions.getText(driver,
                    new String[]{"tb_b_query_e_tech_error_code", getElements("tb_b_query_e_tech_error_code")}, // element path
                    "qbe_e_error_code", // key for data value (the name)
                    " on QbE tech error code"))return false;
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_tech_error_desc", getElements("tb_b_query_e_tech_error_desc")}, // element path
                    "qbe_e_tech_error_desc", // key for data value (the name)
                    " on QbE tech error desc"))return false;
        }
        if (data.getData().get("qbe_e_map_error_code").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_maperrorcode", getElements("tb_b_query_b_maperrorcode")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT MAP ERROR DESC*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_map_error_code", getElements("tb_b_query_e_map_error_code")}, // element path
                    "qbe_e_map_error_code", // key for data value (the name)
                    " on QbE map error desc"))return false;
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_map_error_desc", getElements("tb_b_query_e_map_error_desc")}, // element path
                    "qbe_e_map_error_desc", // key for data value (the name)
                    " on QbE map error desc"))return false;
        }

        if (data.getData().get("qbe_e_psp_error_code").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_pspecode", getElements("tb_b_query_b_pspecode")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT PSP ERROR CODE*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_psp_error_code", getElements("tb_b_query_e_psp_error_code")}, // element path
                    "qbe_e_psp_error_code", // key for data value (the name)
                    " on QbE psp error code"))return false;
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_psp_error_desc", getElements("tb_b_query_e_psp_error_desc")}, // element path
                    "qbe_e_psp_error_desc", // key for data value (the name)
                    " on QbE psp error desc"))return false;
        }
        if (data.getData().get("qbe_e_token_error").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_token", getElements("tb_b_query_b_token")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT TOKEN ERROR*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_token_error", getElements("tb_b_query_e_token_error")}, // element path
                    "qbe_e_token_error", // key for data value (the name)
                    " on QbE ERROR"))return false;
        }
        if (data.getData().get("qbe_e_validated").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_validated", getElements("tb_b_query_b_validated")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT VALIDATED*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_validated", getElements("tb_b_query_e_validated")}, // element path
                    "qbe_e_validated", // key for data value (the name)
                    " on QbE validated"))return false;
        }
        if (data.getData().get("qbe_e_validated_by").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_validatedby", getElements("tb_b_query_b_validatedby")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT VALIDATED BY*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_validated_by", getElements("tb_b_query_e_validated_by")}, // element path
                    "qbe_e_validated_by", // key for data value (the name)
                    " on QbE validated by"))return false;
        }
        if (data.getData().get("qbe_e_validate_date").equals(" ")) {
            if (!Functions.simpleClick(driver,
                    new String[]{"tb_b_query_b_validateddate", getElements("tb_b_query_b_validateddate")}, //element to click
                    " on QbE TAB MONITORING"))return false;
            Functions.break_time(driver, 30, 500);
            /*GET TEXT VALIDATED DATE*/
            if (!Functions.getText(driver, new String[]{"tb_b_query_e_validated_date", getElements("tb_b_query_e_validated_date")}, // element path
                    "qbe_e_validate_date", // key for data value (the name)
                    " on QbE validate date"))return false;
        }
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("SEARCH BY QBE", 3, false);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_error", getElements("tb_b_query_i_error")},
                "error",
                data.getData().get("qbe_e_error"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_error", getElements("tb_b_query_i_error")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_error", getElements("tb_b_query_i_error")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_operation", getElements("tb_b_query_i_operation")},
                "qbe_e_operation",
                data.getData().get("qbe_e_operation"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_operation", getElements("tb_b_query_i_operation")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_operation", getElements("tb_b_query_i_operation")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")},
                "qbe_e_order_code",
                data.getData().get("qbe_e_order_code"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")},
                "clean_qbe",
                "e%-%",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_transaction", getElements("tb_b_query_i_transaction")},
                "qbe_e_transaction",
                data.getData().get("qbe_e_transaction"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_transaction", getElements("tb_b_query_i_transaction")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);


        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_transaction", getElements("tb_b_query_i_transaction")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_receptivo", getElements("tb_b_query_i_receptivo")},
                "qbe_e_receptivo",
                data.getData().get("qbe_e_receptivo"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_booking", getElements("tb_b_query_i_booking")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_receptivo", getElements("tb_b_query_i_receptivo")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_booking", getElements("tb_b_query_i_booking")},
                "qbe_e_booking",
                data.getData().get("qbe_e_booking"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_booking", getElements("tb_b_query_i_booking")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_booking", getElements("tb_b_query_i_booking")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_select_otype", getElements("tb_b_query_select_otype")},
                "Cancel",
                "qbe_e_operation_type",
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_select_otype", getElements("tb_b_query_select_otype")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " on QBE BOOKING"))return false;
        Functions.break_time(driver,30,500);


        //Clean QbE
        if (!Functions.selectText(driver, new String[]{"tb_b_query_select_otype", getElements("tb_b_query_select_otype")},
                "",
                "clean_qbe",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_select_type", getElements("tb_b_query_select_type")},
                data.getData().get("qbe_e_type"),
                "qbe_e_type",
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_select_otype", getElements("tb_b_query_select_otype")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);


        //Clean QbE
        if (!Functions.selectText(driver, new String[]{"tb_b_query_select_type", getElements("tb_b_query_select_type")},
                "",
                "clean_qbe",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_orderreport", getElements("tb_b_query_i_orderreport")},
                "order_report",
                data.getData().get("qbe_e_order_report"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_orderreport", getElements("tb_b_query_i_orderreport")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_orderreport", getElements("tb_b_query_i_orderreport")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_financialreport", getElements("tb_b_query_i_financialreport")},
                "qbe_e_financial_report",
                data.getData().get("qbe_e_financial_report"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_financialreport", getElements("tb_b_query_i_financialreport")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_financialreport", getElements("tb_b_query_i_financialreport")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_message", getElements("tb_b_query_i_message")},
                "qbe_e_message",
                data.getData().get("qbe_e_message"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_message", getElements("tb_b_query_i_message")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);


        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_message", getElements("tb_b_query_i_message")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_date", getElements("tb_b_query_i_date")},
                "qbe_e_date",
                data.getData().get("qbe_e_date"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_date", getElements("tb_b_query_i_date")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_date", getElements("tb_b_query_i_date")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_techerrorcode", getElements("tb_b_query_i_techerrorcode")},
                "qbe_e_error_code",
                data.getData().get("qbe_e_error_code"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_techerrordesc", getElements("tb_b_query_i_techerrordesc")},
                "tech_error_desc",
                data.getData().get("qbe_e_tech_error_desc"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_techerrordesc", getElements("tb_b_query_i_techerrordesc")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_techerrorcode", getElements("tb_b_query_i_techerrorcode")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_techerrordesc", getElements("tb_b_query_i_techerrordesc")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_maperrorcode", getElements("tb_b_query_i_maperrorcode")},
                "qbe_e_map_error_code",
                data.getData().get("qbe_e_map_error_code"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_maperrordesc", getElements("tb_b_query_i_maperrordesc")},
                "qbe_e_map_error_desc",
                data.getData().get("qbe_e_map_error_desc"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_maperrordesc", getElements("tb_b_query_i_maperrordesc")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_maperrorcode", getElements("tb_b_query_i_maperrorcode")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_maperrordesc", getElements("tb_b_query_i_maperrordesc")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_pspecode", getElements("tb_b_query_i_pspecode")},
                "qbe_e_psp_error_code",
                data.getData().get("qbe_e_psp_error_code"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_pspedesc", getElements("tb_b_query_i_pspedesc")},
                "qbe_e_psp_error_desc",
                data.getData().get("qbe_e_psp_error_desc"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_pspedesc", getElements("tb_b_query_i_pspedesc")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);


        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_pspecode", getElements("tb_b_query_i_pspecode")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_pspedesc", getElements("tb_b_query_i_pspedesc")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_token", getElements("tb_b_query_i_token")},
                "qbe_e_token_error",
                data.getData().get("qbe_e_token_error"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_token", getElements("tb_b_query_i_token")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);


        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_token", getElements("tb_b_query_i_token")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_i_warning", getElements("tb_b_query_i_warning")},
                data.getData().get("qbe_e_warning"),
                "qbe_e_warning",
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver,  new String[]{"tb_b_query_i_validated", getElements("tb_b_query_i_validated")},
                data.getData().get("qbe_e_validated"),
                "qbe_e_validated",
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_validated", getElements("tb_b_query_i_validated")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;

        //Clean QbE
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_i_validated", getElements("tb_b_query_i_validated")},
                "",
                "clean_qbe",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_i_warning", getElements("tb_b_query_i_warning")},
                "",
                "clean_qbe",
                " on CLEAN QBE"))return false;
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validatedby", getElements("tb_b_query_i_validatedby")},
                "validated_by",
                data.getData().get("qbe_e_validated_by"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_validatedby", getElements("tb_b_query_i_validatedby")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validatedby", getElements("tb_b_query_i_validatedby")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validateddate", getElements("tb_b_query_i_validateddate")},
                "validated_date",
                data.getData().get("qbe_e_validate_date"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_validateddate", getElements("tb_b_query_i_validateddate")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);

        //Clean QbE
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validateddate", getElements("tb_b_query_i_validateddate")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        return true;
    }
    private boolean validationError(TestDriver driver) {
        driver.getReport().addHeader("VALIDATE ERROR OPTION", 3, false);

        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")},
                "qbe_e_order_code",
                "e%-%",/*eliminar esta linea cuando funcione todo el código*/
                //data.getData().get("qbe_e_order_code"),
                " on SEARCH QBE PAYMENT"))return false;
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_error", getElements("tb_b_query_i_error")},
                "qbe_e_error",
                data.getData().get("qbe_e_error"),/*eliminar esta linea cuando funcione todo el código*/
                //data.getData().get("qbe_e_order_code"),
                " on SEARCH QBE PAYMENT"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " on RECORD QBE"))return false;
        if (!Functions.checkClick(driver,
                new String[]{"b_validate", getElements("b_validate")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " to OPEN \"ERROR_MONITORING\" VALIDATION DIALOG"))return false;
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"b_validate_b_yes", getElements("b_validate_b_yes")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                " to ACCEPT VALIDATION"))return false;
        return true;
    }
    private boolean qbeValidationError(TestDriver driver) {
        driver.getReport().addHeader("SEARCH BY QBE THE ELEMENT VALIDATED", 3, false);

        if (!Functions.selectText(driver,  new String[]{"tb_b_query_i_validated", getElements("tb_b_query_i_validated")},
                "Yes",
                "validated",
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        //Clean QbE
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validatedby", getElements("tb_b_query_i_validatedby")},
                "validated_by",
                driver.getUserdetails().getUsername(),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;

        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validateddate", getElements("tb_b_query_i_validateddate")},
                "validated_date",
                DataGenerator.getToday(driver,"dd/MM/yyyy"),
                " \"ERROR MONITORING\" TABLE QUERY"))return false;

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_validateddate", getElements("tb_b_query_i_validateddate")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validateddate", getElements("tb_b_query_i_validateddate")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_validatedby", getElements("tb_b_query_i_validatedby")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_i_validated", getElements("tb_b_query_i_validated")},
                "",
                "clean_qbe",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        return true;
    }
    public boolean processError(TestDriver driver) {
        driver.getReport().addHeader("PROCESS ERROR OPTION", 3, false);
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")},
                "qbe_e_order_code",
                "e%-%",/*eliminar esta linea cuando funcione todo el código*/
                //data.getData().get("qbe_e_order_code"),
                " on SEARCH QBE PAYMENT"))return false;
        if (!Functions.insertInput(driver, new String[]{"tb_b_query_i_error", getElements("tb_b_query_i_error")},
                "clean_qbe",
                "",
                " on CLEAN QBE"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.selectText(driver, new String[]{"tb_b_query_i_warning", getElements("tb_b_query_i_warning")},
                data.getData().get("qbe_e_warning"),
                "qbe_e_warning",
                " \"ERROR MONITORING\" TABLE QUERY"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.getText(driver, new String[]{"tb_b_query_e_error", getElements("tb_b_query_e_error")}, // element path
                "qbe_e_error", // key for data value (the name)
                " on QbE record"))return false;
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_b_query_i_order_code", getElements("tb_b_query_i_order_code")}, //any query input
                new String[]{"search_e_record", getElements("search_e_record")}, //table result
                " on RECORD QBE"))return false;
        if (!Functions.simpleClick(driver,
                new String[]{"error_b_process_error", getElements("error_b_process_error")}, //element to click
                " on CLICK PROCESS ERROR"))return false;
        return true;
    }
    private boolean processErrorTabCE_Payment(TestDriver driver) {
        driver.getReport().addHeader("PROCESS ERROR BLOCK PAYMENT", 3, false);
        Functions.zoomIn(driver);
        Functions.break_time(driver,30,500);
        if (!Functions.simpleClick(driver,
                new String[]{"data_process_b_search", getElements("data_process_b_search")}, //element to click
                " on \"ERROR PROCESSING\" TAB SEARCH"))return false;
        Functions.screenshot(driver,false);
        Functions.break_time(driver,30,500);
        //<editor-fold desc="EDIT PAYMENT">

        //GetText ITP - ITP DETAIL
        if (!Functions.getValue(driver,
                new String[]{"itp_detail_i_itp", getElements("itp_detail_i_itp")}, // element path
                "itp_detail_e_itp", // key for data value (the name)
                " on getText ITP DETAIL - ITP"))return false;
        Functions.break_time(driver,30,500);

        //GetText Status Payment
        if (!Functions.getValue(driver,
                new String[]{"paymnent_i_status", getElements("paymnent_i_status")}, // element path
                "pay_e_status", // key for data value (the name)
                " on getText STATUS PAYMENT"))return false;
        Functions.break_time(driver,30,500);

        //GetText PSP Status Payment
        if (!Functions.getValue(driver,
                new String[]{"paymnent_i_psp_status", getElements("paymnent_i_psp_status")}, // element path
                "pay_e_psp_status", // key for data value (the name)
                " on getText PSP STATUS PAYMENT"))return false;
        Functions.break_time(driver,30,500);

        String[] status = {"PENDING_USER","CANCELLED","REFUSED","ERROR","ACTIVE"};

        int random;
        String chosen;
        do {
            random = DataGenerator.random(0, 4);
            chosen = status[random];
        }while (data.getData().get("pay_e_status").equals(chosen));

        if (!Functions.createLovByValue(driver,
                new String[]{"paymnent_lov_status", getElements("paymnent_lov_status")}, //LoV button
                new String[]{"paymnent_i_status", getElements("paymnent_i_status")}, //external LoV input
                new String[]{"paymnent_lov_status_i_status", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                chosen, // value to search
                "pay_e_status", //name of the data
                " on PAYMENT STATUS"))return false;

        /*String[] estado = {"CANCELLED", "PENDING", "ACTIVE", "AUTHORIZED"};
        String elegir;
        do {
            random = Functions.random(0, 3);
            elegir = estado[random];
        }while (data.getData().get("pay_e_status").equals(elegir));*/
        Functions.break_time(driver,30,500);

        if (!Functions.insertInput(driver,
                new String[]{"paymnent_i_psp_status", getElements("paymnent_i_psp_status")},
                "pay_e_psp_status",
                chosen,
                " on PAYMENT PSP STATUS"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.insertInput(driver,
                new String[]{"paymnent_i_amount", getElements("paymnent_i_amount")},
                "pay_amount",
                "2500",
                " on PAYMENT AMOUNT"))return false;

        if (!Functions.insertInput(driver,
                new String[]{"paymnent_i_exponent", getElements("paymnent_i_exponent")},
                "pay_exponent",
                "2",
                " on PAYMENT EXPONENT"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.createLov(driver,
                new String[]{"paymnent_i_currency_lov", getElements("paymnent_i_currency_lov")}, // b_lov
                new String[]{"paymnent_i_currency", getElements("paymnent_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "pay_currency", //Data name
                " on PAYMENT CURRENCY"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.selectText(driver,
                new String[]{"paymnent_ls_payment_method",getElements("paymnent_ls_payment_method")},
                "ALIPAY",
                "payment_method",
                " on PAYMENT METHOD"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.checkClick(driver,
                new String[]{"process_b_process", getElements("process_b_process")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on \"PAYMENT DETAIL\" TAB SEARCH PROCESS"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"search_b_process_b_ok", getElements("search_b_process_b_ok")}, //element to click
                new String[]{"search_b_process_b_ok", getElements("search_b_process_b_ok")}, //element to click
                " on \"PAYMENT DETAIL\" TAB SEARCH PROCESS"))return false;
        Functions.break_time(driver,240,1000);
        if ((driver.getDriver().findElements(By.xpath(getElements("process_error_mensage"))).size()>0)
                && (driver.getDriver().findElement(By.xpath(getElements("process_error_mensage"))).isDisplayed())){
            if (!Functions.getText(driver,
                    new String[]{"process_error_mensage", getElements("process_error_mensage")}, // element path
                    "error_mensage", // key for data value (the name)
                    " on PROCESS DATA ERROR"))return false;
            if (data.getData().get("error_mensage").equals("Cannot actualize the data")){
                String ecode = "--ERROR: Data not processed, exist any problem with the modification data";
                ErrorManager.process(driver, ecode);
                return false;
            }
        }
        Functions.screenshot(driver,true);
        if (!Functions.simpleClick(driver,
                new String[]{"data_process_b_search", getElements("data_process_b_search")}, //element to click
                " on SEARCH IN PROCESS TO VERYFI THAT CHANGES IS SAVE"))return false;
        Functions.screenshot(driver,true);

        if (!Functions.simpleClick(driver,
                new String[]{"process_b_clear", getElements("process_b_clear")}, //element to click
                " on where"))return false;
        Functions.zoomOut(driver);
        return true;
    }
    private boolean processErrorTabCE_itp(TestDriver driver) {
        driver.getReport().addHeader("PROCESS ERROR BLOCK ITP", 3, false);
        Functions.break_time(driver,30,500);
        if (!Functions.simpleClick(driver,
                new String[]{"data_proces_b_itp", getElements("data_proces_b_itp")}, //element to click
                " on \"ERROR PROCESSING\" TAB SEARCH ITP"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.insertInput(driver,
                new String[]{"data_process_i_itp", getElements("data_process_i_itp")},
                "itp_detail_e_itp",
                data.getData().get("itp_detail_e_itp"),
                " on SEARCH IPT DATA PROCESS"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.simpleClick(driver,
                new String[]{"data_process_b_search", getElements("data_process_b_search")}, //element to click
                " on \"ERROR PROCESSING\" TAB SEARCH"))return false;
        Functions.screenshot(driver, true);

        Functions.break_time(driver,30,500);

        //GetText Status Payment
        if (!Functions.getValue(driver,
                new String[]{"itp_detail_i_status", getElements("itp_detail_i_status")}, // element path
                "itp_e_status", // key for data value (the name)
                " on getText STATUS ITP"))return false;

        String[] status = {"PENDING","REFUNDING","ERROR","ACTIVE","CREATING"};

        int random;
        String chosen;
        do {
            random = DataGenerator.random(0, 4);
            chosen = status[random];
        } while (data.getData().get("itp_e_status").equals(chosen));
        Functions.break_time(driver,30,500);

        if (!Functions.createLovByValue(driver,
                new String[]{"itp_detail_lov_status", getElements("itp_detail_lov_status")}, //LoV button
                new String[]{"itp_detail_i_status", getElements("itp_detail_i_status")}, //external LoV input
                new String[]{"itp_detail_lov_status_i_status", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                chosen, // value to search
                "itp_e_status", //name of the data
                " on ITP STATUS"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.insertInput(driver,
                new String[]{"itp_detail_i_amount", getElements("itp_detail_i_amount")},
                "itp_e_amount",
                "1245",
                " on ITP AMOUNT"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.insertInput(driver,
                new String[]{"itp_detail_i_exponent", getElements("itp_detail_i_exponent")},
                "itp_e_exponent",
                "1",
                " on ITP EXPONENT"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.createLov(driver,
                new String[]{"itp_detail_lov_currency", getElements("itp_detail_lov_currency")}, // b_lov
                new String[]{"itp_detail_i_currency", getElements("itp_detail_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "itp_currency", //Data name
                " on ITP CURRENCY"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.checkClick(driver,
                new String[]{"process_b_process", getElements("process_b_process")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on \"PAYMENT DETAIL\" TAB SEARCH PROCESS"))return false;
        Functions.break_time(driver,30,500);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"search_b_process_b_ok", getElements("search_b_process_b_ok")}, //element to click
                new String[]{"search_b_process_b_ok", getElements("search_b_process_b_ok")}, //element to click
                " on \"PAYMENT DETAIL\" TAB SEARCH PROCESS"))return false;
        Functions.break_time(driver,240,1000);
        if ((driver.getDriver().findElements(By.xpath(getElements("process_error_mensage"))).size()>0)
                && (driver.getDriver().findElement(By.xpath(getElements("process_error_mensage"))).isDisplayed())){
            if (!Functions.getText(driver,
                    new String[]{"process_error_mensage", getElements("process_error_mensage")}, // element path
                    "error_mensage", // key for data value (the name)
                    " on PROCESS DATA ERROR"))return false;
            if (data.getData().get("error_mensage").equals("Cannot actualize the data")){
                String ecode = "--ERROR: Data not processed, exist any problem with the modification data";
                ErrorManager.process(driver, ecode);
                return false;
            }
        }
        Functions.screenshot(driver,true);

        if (!Functions.simpleClick(driver,
                new String[]{"process_b_clear", getElements("process_b_clear")}, //element to click
                " on where"))return false;
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH BLOCK", 3, false);
        Functions.break_time(driver,30,500);
        /*SIMPLE CLICK CAMBIAR DE PESTAÑA A AT2ACCOP0017*/
        if (!Functions.simpleClick(driver,
                new String[]{"screen_principal", getElements("screen_principal")}, //element to click
                " on GO TO SCREEN AT2ACCOP0017"))return false;
        Functions.break_time(driver,30,500);
        if (!Functions.simpleClick(driver,
                new String[]{"tb_clean_query", getElements("tb_clean_query")}, //element to click
                " on GO TO SCREEN AT2ACCOP0017"))return false;
        Functions.break_time(driver,120,1000);
        /*BUSCAR POR SEARCH LOS DATOS DE GET TEXT*/
        if (!Functions.insertInput(driver, new String[]{"search_i_operation", getElements("search_i_operation")},
                "qbe_e_operation",
                data.getData().get("qbe_e_operation"),
                " ON SEARCH OPERATION"))return false;
        if (!search_and_reset(driver,"search_i_operation"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_transaction", getElements("search_i_transaction")},
                "qbe_e_transaction",
                data.getData().get("qbe_e_transaction"),
                " ON SEARCH TRANSACTION"))return false;
        if (!search_and_reset(driver,"search_i_transaction"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_orderreport", getElements("search_i_orderreport")},
                "qbe_e_order_report",
                data.getData().get("qbe_e_order_report"),
                " on SEARCH ORDER REPORT"))return false;
        if (!search_and_reset(driver,"search_i_orderreport"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_financialreport", getElements("search_i_financialreport")},
                "qbe_e_financial_report",
                data.getData().get("qbe_e_financial_report"),
                " on SEARCH FINANCIAL REPORT"))return false;
        if (!search_and_reset(driver,"search_i_financialreport"))return false;
        if (!Functions.createLovByValue(driver,
                new String[]{"search_i_receptive_b_lov", getElements("search_i_receptive_b_lov")}, //LoV button
                new String[]{"search_i_receptive", getElements("search_i_receptive")}, //external LoV input
                new String[]{"search_i_receptive_b_lov_i_receptive", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                data.getData().get("qbe_e_receptivo"), // value to search
                "qbe_e_receptivo", //name of the data
                " on SEARCH ERROR CODE"))return false;
        if (!search_and_reset(driver,"search_i_receptive"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_booking", getElements("search_i_booking")},
                "qbe_e_booking",
                data.getData().get("qbe_e_booking"),
                " on SEARCH BOOKING"))return false;
        if (!search_and_reset(driver,"search_i_booking"))return false;
        //BUG EN DESPLEGABLE DE OPERATION TYPE
        if (!Functions.insertInput(driver, new String[]{"search_i_order_code", getElements("search_i_order_code")},
                "qbe_e_order_code",
                data.getData().get("qbe_e_order_code"),
                " on SEARCH ORDER CODE"))return false;
        if (!search_and_reset(driver,"search_i_order_code"))return false;
        //BUG EN DESPLEGABLE DE OPERATION TYPE
        if (!Functions.selectText(driver,
                new String[]{"search_select_otype", getElements("search_select_otype")},
                data.getData().get("qbe_e_operation_type"),
                "qbe_e_operation_type",
                " on SEARCH SELECT OPERATION TYPE"))return false;
        if (!search_and_clear_list(driver,"search_select_otype"))return false;
        //BUG EN DESPLEGABLE DE OPERATION TYPE
        if (!Functions.selectText(driver,
                new String[]{"search_select_type", getElements("search_select_type")},
                data.getData().get("qbe_e_type"),
                "qbe_e_type",
                " on SEARCH SELECT OPERATION TYPE"))return false;
        if (!search_and_clear_list(driver,"search_select_type"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_message", getElements("search_i_message")},
                "qbe_e_message",
                data.getData().get("qbe_e_message"),
                " on SEARCH MESSAGE"))return false;
        if (!search_and_reset(driver,"search_i_message"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_datefrom", getElements("search_i_datefrom")},
                "qbe_e_date",
                data.getData().get("qbe_e_date"),
                " on SEARCH DATE FROM"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_dateto", getElements("search_i_dateto")},
                "qbe_e_date",
                data.getData().get("qbe_e_date"),
                " on SEARCH DATE TO"))return false;
        if (!search_and_cleardates(driver,"search_i_datefrom","search_i_dateto"))return false;
        if (!Functions.createLovByValue(driver,
                new String[]{"search_i_techerrorcode_b_lov", getElements("search_i_techerrorcode_b_lov")}, //LoV button
                new String[]{"search_i_techerrorcode", getElements("search_i_techerrorcode")}, //external LoV input
                new String[]{"search_i_techerrorcode_b_lov_i_error_code", getElements("search_i_techerrorcode_b_lov_i_error_code")}, //internal LoV input
                data.getData().get("qbe_e_error_code"), // value to search
                "qbe_e_error_code", //name of the data
                " on SEARCH ERROR CODE"))return false;
        if (!search_and_reset(driver,"search_i_techerrorcode"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_techerrordesc", getElements("search_i_techerrordesc")},
                "qbe_e_tech_error_desc",
                data.getData().get("qbe_e_tech_error_desc"),
                " on SEARCH ERROR DESC"))return false;
        if (!search_and_reset(driver,"search_i_techerrordesc"))return false;
        if (!Functions.createLovByValue(driver,
                new String[]{"search_i_maperrorcode_b_lov", getElements("search_i_maperrorcode_b_lov")}, //LoV button
                new String[]{"search_i_maperrorcode", getElements("search_i_maperrorcode")}, //external LoV input
                new String[]{"search_i_maperrorcode_b_lov_i_error_code", getElements("search_i_maperrorcode_b_lov_i_error_code")}, //internal LoV input
                data.getData().get("qbe_e_map_error_code"), // value to search
                "qbe_e_map_error_code", //name of the data
                " on SEARCH MAP ERROR CODE"))return false;
        if (!search_and_reset(driver,"search_i_maperrorcode"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_maperrordesc", getElements("search_i_maperrordesc")},
                "qbe_e_map_error_desc",
                data.getData().get("qbe_e_map_error_desc"),
                " on SEARCH MAP ERROR DESC"))return false;
        if (!search_and_reset(driver,"search_i_maperrordesc"))return false;
        //BUG EN DESPLEGABLE WARNING
        if (!Functions.selectText(driver,
                new String[]{"search_select_warning", getElements("search_select_warning")},
                data.getData().get("qbe_e_warning"),
                "qbe_e_warning",
                " on SEARCH WARNING"))return false;
        if (!search_and_clear_list(driver,"search_select_warning"))return false;
        //BUG EN DESPLEGABLE VALIDATED
        if (!Functions.selectText(driver,
                new String[]{"search_select_validate", getElements("search_select_validate")},
                data.getData().get("qbe_e_warning"),
                "qbe_e_warning",
                " on SEARCH WARNING"))return false;
        if (!search_and_clear_list(driver,"search_select_validate"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_validatedby", getElements("search_i_validatedby")},
                "qbe_e_validated_by",
                data.getData().get("qbe_e_validated_by"),
                " on SEARCH VALIDATED BY"))return false;
        if (!search_and_reset(driver,"search_i_validatedby"))return false;
        //calendar
        if (!Functions.insertInput(driver, new String[]{"search_i_valdatefrom", getElements("search_i_valdatefrom")},
                "qbe_e_validate_date",
                data.getData().get("qbe_e_validate_date"),
                " on SEARCH DATE FROM"))return false;
        if (!Functions.insertInput(driver, new String[]{"search_i_valdateto", getElements("search_i_valdateto")},
                "qbe_e_validate_date",
                data.getData().get("qbe_e_validate_date"),
                " on SEARCH DATE TO"))return false;
        /*GENERIC SEARCH*/
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_record", getElements("search_e_record")}, //result element
                " on SEARCH"))return false;

        return true;
    }
    private boolean extraActions(TestDriver driver) {
        driver.getReport().addHeader("DETACH", 3, false);
        if (!Functions.detachTable(driver,
                new String[]{"tb_b_detach", getElements("tb_b_detach")}, //detach button
                true,
                " to DETACH TABLE"))return false;
        return true;
    }

    private boolean search_and_reset(TestDriver driver,String xpath){
        /*GENERIC SEARCH*/
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_record", getElements("search_e_record")}, //result element
                " on SEARCH"))return false;
        if (!Functions.insertInput(driver,
                new String[]{xpath, getElements(xpath)}, //element to click
                "clear_input",
                "",
                " on RESET SEARCH BLOCK"))return false;
        return true;
    }
    private boolean search_and_clear_list(TestDriver driver,String xpath){
        /*GENERIC SEARCH*/
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_record", getElements("search_e_record")}, //result element
                " on SEARCH"))return false;
        if (!Functions.selectText(driver,
                new String[]{xpath, getElements(xpath)}, //element to click
                "",
                "clear_input",
                " on RESET SEARCH BLOCK"))return false;
        return true;
    }
    private boolean search_and_cleardates(TestDriver driver,String xpath1,String xpath2){
        /*GENERIC SEARCH*/
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_record", getElements("search_e_record")}, //result element
                " on SEARCH"))return false;
        if (!Functions.insertInput(driver,
                new String[]{xpath1, getElements(xpath1)}, //element to click
                "clear_input",
                "",
                " on RESET SEARCH BLOCK"))return false;
        if (!Functions.insertInput(driver,
                new String[]{xpath2, getElements(xpath2)}, //element to click
                "clear_input",
                "",
                " on RESET SEARCH BLOCK"))return false;
        return true;
    }
}
