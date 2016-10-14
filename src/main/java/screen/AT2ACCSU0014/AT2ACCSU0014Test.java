package screen.AT2ACCSU0014;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 14/10/2016.
 */
public class AT2ACCSU0014Test {
    protected AT2ACCSU0014Locators locators;
    protected AT2ACCSU0014Data data;

    public AT2ACCSU0014Test() {

    }

    public AT2ACCSU0014Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0014Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0014Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0014Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Taxes");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }


    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_hotel_card(driver)) return false;
        if (!search_hotel_card(driver)) return false;
        if (!interaction_edit_hotel_card(driver)) return false;
        if (!qbe_hotel_card(driver)) return false;
        if (!others_actions_hotel_card(driver)) return false;
        if (!delete_hotel_card(driver)) return false;
        return false;
    }
    private boolean interaction_record_hotel_card(TestDriver driver) {
        return true;
    }
    private boolean search_hotel_card(TestDriver driver) {
        return true;
    }
    private boolean interaction_edit_hotel_card(TestDriver driver) {
        return true;
    }
    private boolean qbe_hotel_card(TestDriver driver) {
        return true;
    }
    private boolean others_actions_hotel_card(TestDriver driver) {
        return true;
    }
    private boolean delete_hotel_card(TestDriver driver) {
        return true;
    }
}
