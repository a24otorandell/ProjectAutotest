package screen.AT2ACCCO0052;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

/**
 * @author ajvirgili  Created on 29/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement", ""})
public class AT2ACCCO0052Test {

    protected AT2ACCCO0052Locators locators;
    protected AT2ACCCO0052Data data;
    protected Exception exception;

    /**
     * Void constructor
     */
    public AT2ACCCO0052Test(String enviroment) {
        setData(new AT2ACCCO0052Data(enviroment));
        setLocators(new AT2ACCCO0052Locators(enviroment));
    }

    /**
     * @return an AT2ACCCO0052Locators object
     */
    public AT2ACCCO0052Locators getLocators() {
        return locators;
    }

    /**
     * @param locators Gets the locators given in the ATACCCO0052Locators, a Hashmap with locator_name[0], xpath[1]
     *                 and puts it in the locators variable
     */
    public void setLocators(AT2ACCCO0052Locators locators) {
        this.locators = locators;
    }

    /**
     * @return an AT2ACCCO0052Data object
     */
    public AT2ACCCO0052Data getData() {
        return data;
    }

    /**
     * @param data ATACCCO0052Data data, that has a Hashmap with data_name[0], xpath[1]
     *             and puts it in the data object of this class
     */
    public void setData(AT2ACCCO0052Data data) {
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
        driver.getTestdetails().setScreen("Stop sales 2.0");
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
