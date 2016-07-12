package core.ErrorManager;

import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * This class in theory tries to control and manage the errors of the test
 *
 * @author otorandell on 31/12/2015
 */
public class ErrorManager {
    /**
     * When an error occurs during the test launch it redirects here where all the procedures to manage the error are done<br>
     * Adds to the html report the line of the error, does a screeshot and sets the test status to fail.
     *
     * @param driver  TestDriver - This class manages all the information referent to the current test.
     * @param message String - The data name of the element and its xpath
     */
    public static void process(TestDriver driver, String message) {
        driver.getReport().addContent(message, "p", "class='error'");
        Functions.screenshot(driver);
        driver.setTeststatus(1);
    }

    /*
     * Errors that need special attendance will be called here, and will be applied in function of @type. This method
     * is expected to grow during Autotest live to handle all the weird situations the program can encounter
     *
     * @param driver this class manages all the information referent to the current test.
     * @param message
     * @param type
     */
   /* public static void process(TestDriver driver, String message, String type) {

        driver.getReport().addContent(message, "p", "class='error'");
        Functions.screenshot(driver);
        driver.setTeststatus(1);
        driver.specialLogout(type);

    }*/
}

