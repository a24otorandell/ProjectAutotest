package core.CommonActions;

import core.ConnectionDDBB.ConnectionMSSQL;
import core.ConnectionDDBB.DDBBInteractions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class collects most of the usual procedures<br>
 *
 * @author otorandell on 11/02/2016
 */
public class CommonProcedures {

    /**
     * This method is used to log into Atlas2.0, it uses the parameters the current driver has assigned.
     *
     * @param driver TestDriver - This class manages all the information referent to the current test.
     * @return {@code boolean} to control the process flow
     * @see Functions
     * @see WebDriverWait
     * @see ErrorManager
     */
    public static boolean atlasLogIn(TestDriver driver) {
        if (driver.getCurrentwork().equals("REGRESSION")) {
            if (!Functions.insertInput(driver, new String[]{"User Input", recursiveXPaths.userinput}, "username", driver.getUserdetails().getUsername(), " on login screen")) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"Password Input", recursiveXPaths.passinput}, "password", driver.getUserdetails().getPassword(), " on login screen")) {
                return false;
            }
            if (!Functions.checkClick(driver, new String[]{"Login Button", recursiveXPaths.loginbutton}, new String[]{"Logout Button", recursiveXPaths.logout}, " on login screen")) {
                return false;
            }
            WebDriverWait wdw = new WebDriverWait(driver.getDriver(), 40, 500);
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(recursiveXPaths.logout)));
            if (driver.getDriver().findElements(By.xpath("//*[@id='cblopg1']")).size() > 0) {
                String ecode = "--ERROR: Log In: User " + driver.getUserdetails().getUsername() + " has not company and office associated.";
                ErrorManager.process(driver, ecode);
                return false;

            }
        } else if (driver.getCurrentwork().equals("JIRA")) {
            if (!Functions.insertInput(driver, recursiveXPaths.jirauserinput, "username", driver.getUserdetails().getUsername(), " on JIRA login screen")) {
                return false;
            }
            if (!Functions.insertInput(driver, recursiveXPaths.jirapassimput, "password", driver.getUserdetails().getPassword(), " on JIRA login screen")) {
                return false;
            }
            if (!Functions.checkClick(driver, recursiveXPaths.jiraloginbutton, recursiveXPaths.jiralogoutbutton, " on JIRA login screen")) {
                return false;
            }
            WebDriverWait wdw = new WebDriverWait(driver.getDriver(), 40, 500);
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(recursiveXPaths.jiralogoutbutton[1])));
        }
        return true;
    }

    /**
     * This method search and click the target component screen to be tested
     *
     * @param driver TestDriver - This class manages all the information referent to the current test.
     * @return {@code boolean} to control the process flow
     * @see Functions
     * @see ErrorManager
     */
    public static boolean goToScreen(TestDriver driver) {
        try {
            Functions.break_time(driver, 10, 500);
            if (!Functions.checkClick(driver, new String[]{"Search icon", recursiveXPaths.searchicon}, new String[]{"Component input", recursiveXPaths.componentinput}, 180, 500, " on main ATLAS page")) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"Component", recursiveXPaths.componentinput}, "Component", driver.getTestdetails().getTestname(), " on main ATLAS page")) {
                return false;
            }
            if (!Functions.checkClick(driver, new String[]{"Search component icon", recursiveXPaths.searchcomponent}, new String[]{"Component result", recursiveXPaths.result}, 180, 500, " on main ATLAS page")) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver, new String[]{"Component result", recursiveXPaths.result}, new String[]{"Component result", recursiveXPaths.result}, 360, 500, " on main ATLAS page")) {
                return false;
            }
        } catch (Exception e) {
            String ecode = "--ERROR: goToScreen(): Unable to enter the selected screen, maybe the server is running too slow..";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * @param driver              TestDriver - This class manages all the information referent to the current test.
     * @param number_screens_open - This variable is an integer that works depending on the number of tabs have open
     * @see Functions
     * @see ErrorManager
     */
    public static boolean goToScreen(TestDriver driver, int number_screens_open) {
        /*try {
            String componentinput;
            String searchicon = "//*[contains(@id, 'pt1:searchminimenu::icon')]";
            if (driver.getTestdetails().getEnvironment().equals("sis")) {
                componentinput = "//*[contains(@id, 'j_id__ctru158::content')]";
            } else {
                componentinput = "//*[contains(@id, 'j_id__ctru158::content')]";
            }
            String searchcomponent = "//*[contains(@id, 'pt_i2::icon')]";
            String result = "//*[contains(@id, 'pt_i3:"+number_screens_open+":cl3')]";
            Functions.checkClick(driver, new String[]{"Search icon", searchicon}, new String[]{"Component input", componentinput}, 180, 500, " on main ATLAS page");
            Functions.insertInput(driver, new String[]{"Component", componentinput}, "Component", driver.getTestdetails().getTestname(), " on main ATLAS page");
            Functions.checkClick(driver, new String[]{"Search component icon", searchcomponent}, new String[]{"Component result", result}, 180, 500, " on main ATLAS page");

            Functions.checkClickByAbsence(driver, new String[]{"Component result", result}, new String[]{"Component result", result}, 360, 500, " on main ATLAS page");
        } catch (Exception e) {
            String ecode = "--ERROR: goToScreen(): Unable to enter the selected screen, maybe the server is running too slow..";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);*/

        try {
            String result = "//*[contains(@id, 'pt_i3:" + number_screens_open + ":cl3')]";
            Functions.break_time(driver, 10, 500);
            if (!Functions.checkClick(driver, new String[]{"Search icon", recursiveXPaths.searchicon}, new String[]{"Component input", recursiveXPaths.componentinput}, 180, 500, " on main ATLAS page")) {
                return false;
            }
            if (!Functions.insertInput(driver, new String[]{"Component", recursiveXPaths.componentinput}, "Component", driver.getTestdetails().getTestname(), " on main ATLAS page")) {
                return false;
            }
            if (!Functions.checkClick(driver, new String[]{"Search component icon", recursiveXPaths.searchcomponent}, new String[]{"Component result", result}, 180, 500, " on main ATLAS page")) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver, new String[]{"Component result", result}, new String[]{"Component result", result}, 360, 500, " on main ATLAS page")) {
                return false;
            }
        } catch (Exception e) {
            String ecode = "--ERROR: goToScreen(): Unable to enter the selected screen, maybe the server is running too slow..";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }
    /**
     * This method logs out of Atlas2.0 and checks that it's done correcly, otherwise will notify it.
     *
     * @param driver TestDriver - This class manages all the information referent to the current test.
     * @see TestDriver
     * @see Functions
     */
    public static void atlaslogOut(TestDriver driver) {
        if (driver.getDriver().findElements(By.xpath(recursiveXPaths.logout)).size() > 0 && !driver.isLogouterror()) {
            driver.setLogouterror(true); //This flag prevents from looping here forever in case of logout error
            Functions.simpleClick(driver, new String[]{"Logout Button", recursiveXPaths.logout}, " on main ATLAS page.");
            checkAlert(driver);
        } else {
            driver.getReport().addContent("--WARNING-- Logout Button was not found, it's possible that it was never reached, check the screenshot", "p", "class='warning'");
            Functions.screenshot(driver);
        }
        //Checking logout worked as intended
        if (driver.getDriver().findElements(By.xpath(recursiveXPaths.userinput)).size() > 0) {
            driver.getReport().addContent("Logout Correct.", "p", "class='succes'");
            if (driver.getUserdetails().isDDBBCredentials()) {
                updateDDBBPriority(-1, driver);
            }

        } else {
            driver.getReport().addContent("Logout Failed, user priority was not updated", "p", "class='error'");
            Functions.screenshot(driver);
        }
        driver.setTestend();
        driver.closeDriver();
    }

    /**
     * This method searches for a possible alert popup and closes it.
     *
     * @param driver TestDriver - This class manages all the information referent to the current test.
     * @see Thread#sleep(long)
     */
    private static void checkAlert(TestDriver driver) {
        try {
            Thread.sleep(3000);
            Alert alert = driver.getDriver().switchTo().alert();
            //EXIST ALERT??
            if (alert.getText() != null) {
                driver.getReport().addContent("BROWSER ALERT FOUND: " + alert.getText() + " --ALERT is being accepted.", "p", "warning");
                alert.accept();
                driver.getDriver().switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method updates the priority field of the current user for the test.
     *
     * @param increment Integer - Value that will increment the priority field in the selected row
     * @param driver    TestDriver - This class manages all the information referent to the current test.
     * @see ConnectionMSSQL
     * @see DDBBInteractions
     */
    public static void updateDDBBPriority(int increment, TestDriver driver) {
        ConnectionMSSQL connection = new ConnectionMSSQL();
        connection.dbConnect("jdbc:jtds:sqlserver://VS-GORGBLAU;databaseName=Testing;", "betatester", "betatester");
        DDBBInteractions.updateTable(connection, driver.getUserdetails().getUsername(), increment);
        connection.closeConnection(driver);
    }

    /**
     * Este metodo es para generalizar un reporting para las pantallas de testing de guia de estilo y finalmente se
     * realiza una captura de pantalla.
     *
     * @param driver TestDriver - This class manages all the information referent to the current test.
     */
    public static void styleGuide(TestDriver driver) {
        driver.getReport().addContent("", "br", "");
        driver.getReport().addContent("This screen is a style guide and for this reason, only enters and get out.", "h3", "class='success'");
        driver.getReport().addContent("", "br", "");
        Functions.screenshot(driver);
    }
}

