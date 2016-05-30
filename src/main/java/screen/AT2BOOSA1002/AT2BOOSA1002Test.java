package screen.AT2BOOSA1002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;



/**
 * Created by acarrillo on 18/05/2016.
 */
class AT2BOOSA1002Test {
    protected AT2BOOSA1002Locators locators;
    protected AT2BOOSA1002Data data;

    public AT2BOOSA1002Test() {
    }
    public AT2BOOSA1002Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2BOOSA1002Locators locators) {
        this.locators = locators;
    }
    public AT2BOOSA1002Data getData() {
        return data;
    }
    public void setData(AT2BOOSA1002Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);

        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BOOKINGS");
        driver.getTestdetails().setSubmenu("SALE");
        driver.getTestdetails().setScreen("Bookings Maintenance");
    }
    protected String getElements(String key){
        return this.locators.getElements().get(key);
    }
    public void putData (String key, String value){
        this.data.getData().put(key,value);
        System.out.println("The value is save in "+key+" ("+value+")");
    }
    protected String getData(String key){
        return this.data.getData().get(key);
    }
    protected boolean testCSED(TestDriver driver) {
        return create_header(driver);
    }
    private boolean create_header(TestDriver driver) {
        driver.getReport().addHeader("CREATE NEW BOOKING", 2, true);
        Functions.zoomOut(driver);
        if (!Functions.simpleClick(driver,
                new String[]{"header_add", getElements("header_add")}, //element to click
                " on CREATION HEADER")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_interface",getElements("header_add_lov_interface")}, // b_lov
                new String[]{"header_add_i_interface", getElements("header_add_i_interface")}, // i_lov
                new String[]{"header_ad_i_interface",recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_interface"),
                "header_interface", //Data name
                " on HEADER CREATION")){ return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_to", getElements("header_add_lov_to")}, //LoV button
                new String[]{"header_add_i_to", getElements("header_add_i_to")}, //external LoV input
                new String[]{"header_add_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_to"), // value to search
                "header_to", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_branch", getElements("header_add_lov_branch")}, //LoV button
                new String[]{"header_add_i_branch", getElements("header_add_i_branch")}, //external LoV input
                new String[]{"header_add_lov_branch_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_branch"), // value to search
                "header_branch", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_user", getElements("header_add_lov_user")}, //LoV button
                new String[]{"header_add_i_user", getElements("header_add_i_user")}, //external LoV input
                new String[]{"header_add_lov_user_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_user"), // value to search
                "header_user", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_booking_type", getElements("header_add_lov_booking_type")}, //LoV button
                new String[]{"header_add_i_booking_type", getElements("header_add_i_booking_type")}, //external LoV input
                new String[]{"header_add_lov_booking_type_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_booking_type"), // value to search
                "header_booking_type", //name of the data
                " on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_ag_ref",getElements("header_add_i_ag_ref")},
                "header_ag_ref", getData("header_ag_ref")," on HEADER CREATION")){return false;}
        if (!Functions.selectText(driver,
                new String[]{"header_add_i_despt",getElements("header_add_i_despt")},
                getData("header_despt"),
                "header_despt",
                " on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_adults",getElements("header_add_i_adults")},
                "header_adults", getData("header_adults")," on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_child",getElements("header_add_i_child")},
                "header_child", getData("header_child")," on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_baby",getElements("header_add_i_baby")},
                "header_baby", getData("header_baby")," on HEADER CREATION")){return false;}
        if (!Functions.insertInput(driver, new String[]{"header_add_i_pax_mane",getElements("header_add_i_pax_mane")},
                "header_pax_name", getData("header_pax_name")," on HEADER CREATION")){return false;}
        if (!Functions.selectText(driver,
                new String[]{"header_add_i_transfers_valuation",getElements("header_add_i_transfers_valuation")},
                getData("header_valuation"),
                "header_valuation",
                " on HEADER CREATION")){return false;}
        if (!Functions.simpleClick(driver,
                new String[]{"header_add_b_save", getElements("header_add_b_save")}, //element to click
                " on CREATION HEADER")){return false;}

        if (!Functions.getText(driver,new String[]{"header_edit_booking_tab", getElements("header_edit_booking_tab")}, // element path
                "booking_value", // key for data value (the name)
                " on BOOKING CREATED")){return false;}

        String bookings_value [] = getData("booking_value").split("-");
        putData("booking",bookings_value[1]);
        String recep_value [] = bookings_value[0].split(" ");
        putData("receptive",recep_value[2]);

        return true;
    }

}
