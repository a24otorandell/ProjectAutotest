package screen.AT2ACCCO0045;


import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import org.openqa.selenium.By;

/**
 * Created by acarrillo on 30/11/2016.
 */
public class AT2ACCCO0045Sis {
    protected AT2ACCCO0045Locators locators;
    protected AT2ACCCO0045Data data;

    public void setData(AT2ACCCO0045Data data) {
        this.data = data;
    }
    public void setLocators(AT2ACCCO0045Locators locators) {
        this.locators = locators;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    private void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Contracting");
        driver.getTestdetails().setScreen("Audit Data 2.0");
    }
    public AT2ACCCO0045Data getData() {
        return data;
    }
    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    public boolean testCSED(TestDriver driver) {
        if (!get_values(driver))return false;
        if (!search_element(driver))return false;
        if (!query_element(driver))return false;
        if (!other_elements(driver))return false;
        return true;
    }
    public boolean search_element (TestDriver driver) {
        driver.getReport().addHeader("SEARCH", 3, false);
        //COMPANY
        if (!Functions.createLovByValue(driver,
                new String[]{"search_company_lov", getElements("search_company_lov")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_company_lov_i_code", getElements("search_company_lov_i_code")}, //internal LoV input
                data.getData().get("company"), // value to search
                "company", //name of the data
                " on COMPANY/OFFICE SEARCH"))return false; //where this operation occurs
        //OFFICE
        if (!Functions.createLovByValue(driver,
                new String[]{"search_office_lov", getElements("search_office_lov")}, //LoV button
                new String[]{"search_i_office", getElements("search_i_office")}, //external LoV input
                new String[]{"search_office_lov_i_code", getElements("search_office_lov_i_code")}, //internal LoV input
                data.getData().get("office"), // value to search
                "office", //name of the data
                " on COMPANY/OFFICE SEARCH"))return false; //where this operation occurs

        //CONTRACT
        if (!Functions.createLovByValue(driver,
                new String[]{"search_contract_lov", getElements("search_contract_lov")}, //LoV button
                new String[]{"search_i_contract", getElements("search_i_contract")}, //external LoV input
                new String[]{"search_contract_lov_i_code", getElements("search_contract_lov_i_code")}, //internal LoV input
                data.getData().get("contract"), // value to search
                "contract", //name of the data
                " on CONTRACT SEARCH"))return false; //where this operation occurs

        //RULE CODE
        if (!Functions.createLovByValue(driver,
                new String[]{"search_rule_code_lov", getElements("search_rule_code_lov")}, //LoV button
                new String[]{"search_i_rule_code", getElements("search_i_rule_code")}, //external LoV input
                new String[]{"search_rule_code_lov_i_code", getElements("search_rule_code_lov_i_code")}, //internal LoV input
                data.getData().get("rule_code"), // value to search
                "rule_code", //name of the data
                " on RULE CODE SEARCH"))return false; //where this operation occurs

        //DATE TEST
        driver.getReport().addContent("DATE TEST");
        //DATE FROM
        if (!Functions.insertInput(driver,
                new String[]{"search_i_date_from",getElements("search_i_date_from")},
                "appdate_from",
                data.getData().get("appdate_from"),
                " on DATE SEARCH"))return false;
        //DATE TO
        if (!Functions.insertInput(driver,
                new String[]{"search_i_date_to",getElements("search_i_date_to")},
                "appdate_to",
                data.getData().get("appdate_to"),
                " on DATE SEARCH"))return false;
        //SEARCH
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
                " on COMPANY/OFFICE SEARCH"))return false; // where
        driver.getReport().addContent("DATE LoV GAVE SUITABLE RESULTS");
        return true;
    }
    public boolean get_values (TestDriver driver) {
        driver.getReport().addHeader("GET VALUES", 3, false);

        search_accepted(driver);
        Functions.zoomOut(driver);
        //RECEPTIVE
        if (!Functions.getText(driver,
                new String[]{"result_e_receptive", getElements("result_e_receptive")}, // element path
                "receptive", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //COMPANY
        if (!Functions.getText(driver,
                new String[]{"result_e_company", getElements("result_e_company")}, // element path
                "company", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //OFFICE
        if (!Functions.getText(driver,
                new String[]{"result_e_office", getElements("result_e_office")}, // element path
                "office", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //CONTRACT
        if (!Functions.getText(driver,
                new String[]{"result_e_contract", getElements("result_e_contract")}, // element path
                "contract", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //RULE CODE
        if (!Functions.getText(driver,
                new String[]{"result_e_rulecode", getElements("result_e_rulecode")}, // element path
                "rule_code", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //DESCRIPTION
        if (!Functions.getText(driver,
                new String[]{"result_e_description", getElements("result_e_description")}, // element path
                "description", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //APP DATE
        if (!Functions.getText(driver,
                new String[]{"result_e_appdate", getElements("result_e_appdate")}, // element path
                "appdate", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs

        String [] appdate = data.getData().get("appdate").split(" ");

        data.getData().put("appdate_from", DataGenerator.getRelativeDate(driver,appdate[0], "dd/MM/yyyy",0, 0, 0));
        data.getData().put("appdate_to",DataGenerator.getRelativeDate(driver,appdate[0], "dd/MM/yyyy",0, 0, 0));

        //VALIDATION
        if (!Functions.getText(driver,
                new String[]{"result_e_uvalidate", getElements("result_e_uvalidate")}, // element path
                "validation", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //STATE
        if (!Functions.getText(driver,
                new String[]{"result_e_state", getElements("result_e_state")}, // element path
                "state", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //USER ACCEPT
        if (!Functions.getText(driver,
                new String[]{"result_e_user_accept", getElements("result_e_user_accept")}, // element path
                "user_accept", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        //DATE ACCEPT
        if (!Functions.getText(driver,
                new String[]{"result_e_date_accept", getElements("result_e_date_accept")}, // element path
                "date_accept", // key for data value (the name)
                " on RESULT"))return false; // where this operation occurs
        Functions.zoomIn(driver);
        return true;
    }
    public boolean query_element (TestDriver driver) {
        driver.getReport().addHeader("SEARCH BY QBE", 3, false);

        Functions.zoomOut(driver);
        if (!Functions.clickQbE(driver,
                new String[]{"tb_query", getElements("tb_query")},// query button
                new String[]{"tb_query_i_receptive", getElements("tb_query_i_receptive")},//any query input
                " on QBE "))return false; // where the operation occurs
        //RECEPTIVE
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_receptive",getElements("tb_query_i_receptive")},
                "receptive",
                data.getData().get("receptive"),
                " on QBE "))return false;
        //COMPANY
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_company",getElements("tb_query_i_company")},
                "company",
                data.getData().get("company"),
                " on QBE "))return false;
        //OFFICE
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_office",getElements("tb_query_i_office")},
                "office",
                data.getData().get("office"),
                " on QBE "))return false;
        //CONTRACT
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_contract",getElements("tb_query_i_contract")},
                "contract",
                data.getData().get("contract"),
                " on QBE "))return false;
        //RULE CODE
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_code",getElements("tb_query_i_code")},
                "rule_code",
                data.getData().get("rule_code"),
                " on QBE "))return false;
        //DESCRIPTION
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_description",getElements("tb_query_i_description")},
                "description",
                data.getData().get("description"),
                " on QBE "))return false;
        //APP DATE
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_appdate",getElements("tb_query_i_appdate")},
                "appdate",
                data.getData().get("appdate"),
                " on QBE "))return false;
        //VALIDATION
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_validation",getElements("tb_query_i_validation")},
                "validation",
                data.getData().get("validation"),
                " on QBE "))return false;
        //STATE
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_state",getElements("tb_query_i_state")},
                "state",
                data.getData().get("state"),
                " on QBE "))return false;
        //USER ACCEPT
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_uaccept",getElements("tb_query_i_uaccept")},
                "user_accept",
                data.getData().get("user_accept"),
                " on QBE "))return false;
        //DATE ACCEPT
        if (!Functions.insertInput(driver,
                new String[]{"tb_query_i_dateaccept",getElements("tb_query_i_dateaccept")},
                "date_accept",
                data.getData().get("date_accept"),
                " on QBE "))return false;
        //SEARCH
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"tb_query_i_receptive", getElements("tb_query_i_receptive")}, //any query input
                new String[]{"search_e_result", getElements("search_e_result")}, //table result
                " on SUBSCREEN"))return false; // where this operation occurs
        Functions.zoomIn(driver);
        return true;
    }
    public boolean other_elements (TestDriver driver) {
        driver.getReport().addHeader("DETACH", 3, false);

        //DETACH
        if (!Functions.detachTable(driver,
                new String[]{"tb_detach",getElements("tb_detach")}, //detach button
                true,     //screenshot??
                " on DETACH"))return false;     //where this occurs
        return true;
    }
    public boolean search_accepted(TestDriver driver) {
        driver.getReport().addHeader("SEARCH ACCETED ELEMENT", 3, false);

        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                " on RESET SEARCH FIELD"))return false;

        Functions.break_time(driver,120,500);
        if (!Functions.selectText(driver,new String[]{"search_i_accepted", getElements("search_i_accepted")},
                "Yes","accepted", " on SEARCH RECORD"))return false;

        if (!Functions.checkClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"search_e_result", getElements("search_e_result")}, //result element
                360,1000,
                " on SEARCH RECORD"))return false; // where
        return true;
    }
}
