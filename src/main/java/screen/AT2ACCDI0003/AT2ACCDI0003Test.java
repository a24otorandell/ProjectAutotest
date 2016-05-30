package screen.AT2ACCDI0003;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

/**
 * Created by otorandell on 29/12/2015.
 */
public class AT2ACCDI0003Test {

    protected AT2ACCDI0003Locators locators;
    protected AT2ACCDI0003Data data;

    public AT2ACCDI0003Test() {

    }

    public AT2ACCDI0003Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCDI0003Locators locators) {
        this.locators = locators;
    }

    public AT2ACCDI0003Data getData() {
        return data;
    }

    public void setData(AT2ACCDI0003Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        driver.getTestdetails().setScreen("AT2BOOSA1002");
        CommonProcedures.goToScreen(driver);
        driver.getTestdetails().setScreen("AT2ACCDI0003");

    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accomodation");
        driver.getTestdetails().setSubmenu("Distribution");
        driver.getTestdetails().setScreen("Availability General");
    }
    protected String getElements(String key){
        String value = this.locators.getElements().get(key);
        return value;
    }
    protected String getData(String key){
        String value = this.data.getData().get(key);
        return value;
    }
    protected boolean testCSED(TestDriver driver) {
//3091401
           if(!getBookingProcedure(driver)){return false;}
           if(!goToScreen(driver)){return false;}
           if(!search(driver)){return false;}
        //   if(!edit){return false;} // NOT IMPLEMENTED
           if(!query(driver)){return false;}
           if(!detachTable(driver)){return false;}
        //   if(!delete(driver)){return false;} // NOT IMPLEMENTED
        return true;

    }

    private boolean detachTable(TestDriver driver) {
        if(!Functions.detachTable(driver,
                new String[]{"accdi0003_b_detach",getElements("accdi0003_b_detach")}, //detach button
                true,     //screenshot??
                " on AT2ACCDI0003")){return false;}
        return true;
    }

    private boolean query(TestDriver driver) {
        if(!Functions.clickQbE(driver,
                new String[]{"x", getElements("x")},// query button
                new String[]{"y", getElements("y")},//any query input
                "where")){return false;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_hotel",getElements("accdi0003_b_qbe_i_hotel")},
                "hotel", getData("hotel")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_contract",getElements("accdi0003_b_qbe_i_contract")},
                "contract", getData("contract")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_availability",getElements("accdi0003_b_qbe_i_availability")},
                "availability", getData("availability")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_room",getElements("accdi0003_b_qbe_i_room")},
                "room", getData("room")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_characteristics",getElements("accdi0003_b_qbe_i_characteristics")},
                "characteristics", getData("characteristics")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_rate",getElements("accdi0003_b_qbe_i_rate")},
                "rate", getData("rate")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_release",getElements("accdi0003_b_qbe_i_release")},
                "release", getData("release")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_amountpernight",getElements("accdi0003_b_qbe_i_amountpernight")},
                "amountpernight", getData("amountpernight")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_totalamount",getElements("accdi0003_b_qbe_i_totalamount")},
                "totalamount", getData("totalamount")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_retailer",getElements("accdi0003_b_qbe_i_retailer")},
                "retailer", getData("retailer")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_checkin",getElements("accdi0003_b_qbe_i_checkin")},
                "checkin", getData("checkin")," on AT2ACCDI0003")){return true;}
        if (!Functions.insertInput(driver, new String[]{"accdi0003_b_qbe_i_board",getElements("accdi0003_b_qbe_i_board")},
                "board", getData("board")," on AT2ACCDI0003")){return true;}
        if (!Functions.selectText(driver,
                new String[]{"accdi0003_b_qbe_select_touroperator",getElements("accdi0003_b_qbe_select_touroperator")},
                getData("touroperator"),
                "touroperator",
                " where")){return false;};
      return true;
    }

    private boolean search(TestDriver driver) {
        if(!Functions.createLov(driver,
                new String[]{"accdi0003_lov_destination",getElements("accdi0003_lov_destination")}, // b_lov
                new String[]{"accdi0003_i_destination", getElements("accdi0003_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                " on AT2ACCDI0003")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"accdi0003_lov_area",getElements("accdi0003_lov_area")}, // b_lov
                new String[]{"accdi0003_i_area", getElements("accdi0003_i_area")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "area", //Data name
                " on AT2ACCDI0003")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"accdi0003_lov_hotel",getElements("accdi0003_lov_hotel")}, // b_lov
                new String[]{"accdi0003_i_hotel", getElements("accdi0003_i_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                " on AT2ACCDI0003")){if (!Functions.simpleClick(driver,
                recursiveXPaths.lov_b_ok, //element to click
                " on AT2ACCDI0003")){return false;}}
        if(!Functions.createLov(driver,
                new String[]{"accdi0003_lov_rate",getElements("accdi0003_lov_rate")}, // b_lov
                new String[]{"accdi0003_i_rate", getElements("accdi0003_i_rate")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "rate", //Data name
                " on AT2ACCDI0003")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"accdi0003_lov_transfer",getElements("accdi0003_lov_transfer")}, // b_lov
                new String[]{"accdi0003_i_transfer", getElements("accdi0003_i_transfer")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer", //Data name
                " on AT2ACCDI0003")){return false;}
        if(!Functions.createLov(driver,
                new String[]{"accdi0003_lov_board",getElements("accdi0003_lov_board")}, // b_lov
                new String[]{"accdi0003_i_board", getElements("accdi0003_i_board")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "board", //Data name
                " on AT2ACCDI0003")){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"accdi0003_b_search", getElements("accdi0003_b_search")}, //search button
                new String[]{"accdi0003_e_result", getElements("accdi0003_e_result")}, //result element
                " on SEARCH")){return false;}

        return true;
    }

    private boolean goToScreen(TestDriver driver) {


        if (!Functions.checkClick(driver,
                new String[]{"boosa1002_b_bookingsearch", getElements("boosa1002_b_bookingsearch")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on AT2BOOSA1002")) {
            return false;}
        if (!Functions.insertInput(driver, new String[]{"boosa1002_b_bookingsearch_i_booking",getElements("boosa1002_b_bookingsearch_i_booking")},
                "booking_reference", getData("booking_reference")," on BOOSA10002")){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"boosa1002_b_bookingsearch_b_search", getElements("boosa1002_b_bookingsearch_b_search")}, //element to click
                new String[]{"boosa1002_purchasehotels_e_result_b_c", getElements("boosa1002_purchasehotels_e_result_b_c")}, //element expected to appear
                " on AT2BOOSA1002")) {
            return false;}
        if (!Functions.checkClick(driver,
                new String[]{"boosa1002_purchasehotels_e_result_b_c", getElements("boosa1002_purchasehotels_e_result_b_c")}, //element to click
                new String[]{"glass", recursiveXPaths.glass}, //element expected to appear
                " on AT2BOOSA1002")) {
            return false;}
        return true;
    }

    private boolean getBookingProcedure(TestDriver driver) {

        driver.getReport().addHeader("GETTING BOOKING REFERENCE",2,true);
        if (!Functions.checkClick(driver,
                new String[]{"boosa1002_b_searchbook", getElements("boosa1002_b_searchbook")}, //element to click
                new String[]{"boosa0001_b_search", getElements("boosa0001_b_search")}, //element expected to appear
                " on AT2BOOSA1002")) {
            return false;
        }
        int i =0;
        do {
        Functions.insertInput(driver, new String[]{"boosa0001_i_creationdate",getElements("boosa0001_i_creationdate")},
                "booking_creation_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy",0,-i,0)," on BOOSA0001");

        Functions.simpleClick(driver,
                new String[]{"boosa0001_b_search", getElements("boosa0001_b_search")}, //element to click
                " on BOOSA0001");
        i++;
            System.out.println("");
            System.out.println(driver.getDriver().findElements(By.xpath("boosa0001_e_result")).size());
            System.out.println("");
        }while(driver.getDriver().findElements(By.xpath("boosa0001_e_result")).size()<1 && i <10);

        if(!Functions.getText(driver,new String[]{"boosa0001_e_result_e_bookreference", getElements("boosa0001_e_result_e_bookreference")}, // element path
                "booking_reference", // key for data value (the name)
                " on BOOSA0001")){return false;}

        if(!Functions.checkClickByAbsence(driver,
                new String[]{"boosa0001_b_closetab", getElements("boosa0001_b_closetab")}, //element to click
                new String[]{"boosa0001_b_search", getElements("boosa0001_b_search")}, //element expected to appear
                " on BOOSA0001")){return false;}

        return true;
    }


}
