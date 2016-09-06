package screen.AT2ACCCO0053;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * @author ajvirgili  Created on 29/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement", ""})
public class AT2ACCCO0053Sis {

    protected AT2ACCCO0053Locators locators;
    protected AT2ACCCO0053Data data;
    protected Exception exception;

    /**
     * Void constructor
     */
    public AT2ACCCO0053Sis(String enviroment) {
        setData(new AT2ACCCO0053Data(enviroment));
        setLocators(new AT2ACCCO0053Locators(enviroment));
    }

    /**
     * @return an AT2ACCCO0053Locators object
     */
    public AT2ACCCO0053Locators getLocators() {
        return locators;
    }

    /**
     * @param locators Gets the locators given in the ATACCCO0053Locators, a Hashmap with locator_name[0], xpath[1]
     *                 and puts it in the locators variable
     */
    public void setLocators(AT2ACCCO0053Locators locators) {
        this.locators = locators;
    }

    /**
     * @return an AT2ACCCO0053Data object
     */
    public AT2ACCCO0053Data getData() {
        return data;
    }

    /**
     * @param data ATACCCO0053Data data, that has a Hashmap with data_name[0], xpath[1]
     *             and puts it in the data object of this class
     */
    public void setData(AT2ACCCO0053Data data) {
        this.data = data;
    }

    /**
     * This function calls the setScreenInfo to establish some data and then the goToScreen function
     *
     * @param driver Object that manages the core of the test
     * @see CommonProcedures#goToScreen(TestDriver)
     * @see #setScreenInfo(TestDriver)
     */
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    /**
     * This function sets the test details for the report created
     *
     * @param driver Object that manages the core of the test
     * @see TestDriver#getTestdetails()
     */
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Contract");
        driver.getTestdetails().setScreen("Stops sales 2.0");
    }

    /**
     * @param key String with the locator_name to get
     * @return String with an xpath
     */
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    /**
     * @param key String with the data_name to get
     * @return String with an xpath
     */
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    /**
     * In this function we call the funtions that we want to do in a full test
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean testCSED(TestDriver driver) {
        CommonProcedures.styleGuide(driver);
        return false;
    }


}
