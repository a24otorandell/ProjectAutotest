package core.TestDriver;

import core.CommonActions.CommonProcedures;
import core.ErrorManager.ErrorManager;
import core.HTMLReport.AutoReport;
import core.Jira.JiraUpdate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import screen.AT2Test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * This class is basically the core of the test.<br>
 * Creates an object of most of the important classes and works with them.
 *
 * @author otorandell on 10/02/2016
 * @see DriverDetails
 * @see Class
 * @see AT2Test
 * @see TestDetails
 * @see UserDetails
 * @see Date
 * @see DateFormat
 * @see AutoReport
 * @see WebDriver
 */
@SuppressWarnings({"unused", ""})
public class TestDriver {

    //<editor-fold desc="ATTRIBUTES">
    DriverDetails driverdetails;
    Class<?> clazz;
    AT2Test test;
    TestDetails testdetails;
    UserDetails userdetails;
    DateFormat testdateformat;
    Date testdate;
    AutoReport report;
    WebDriver driver;
    JiraUpdate jira;
    long teststart = 0;
    long testend;
    int teststatus = 0;
    boolean logouterror = false;
    boolean jirastatus = true;
    String currentwork;
    //</editor-fold>

    //<editor-fold desc="GETTERES & SETTERS">

    //<editor-fold desc="CONSTRUCTOR">

    /**
     * Constructor of the principal class of the project
     *
     * @param args String[] - Arguments of the Main run
     */
    public TestDriver(String[] args) {
        driverdetails = new DriverDetails();
        testdetails = new TestDetails();
        userdetails = new UserDetails();
        setTestdateformat("yyyy/MM/dd HH:mm:ss");
        setTestdate();
        DetailsAdmin detailsadmin = new DetailsAdmin();
        detailsadmin.setAll(driverdetails, testdetails, userdetails, args);
        report = new AutoReport();

    }

    /**
     * Gets the {@code AT2Test} object
     *
     * @return {@code AT2Test}
     * @see AT2Test
     */
    public AT2Test getTest() {
        return test;
    }

    /**
     * Gets the {@code Class<?>} object
     *
     * @return {@code Class}
     * @see Class
     */
    public Class<?> getClazz() {
        return clazz;
    }

    /**
     * Gets a string that contains where will work the test
     *
     * @return {@code String}
     */
    public String getCurrentwork() {
        return currentwork;
    }

    /**
     * Gets a string that contains where will work the test
     *
     * @param currentwork String -
     */
    public void setCurrentwork(String currentwork) {
        this.currentwork = currentwork;
    }

    /**
     * Gets the {@code DriverDetails} object
     *
     * @return {@code DriverDetails}
     * @see DriverDetails
     */
    public DriverDetails getDriverdetails() {
        return driverdetails;
    }

    /**
     * Gets the integer that determines the status of the test<br>
     * <ul>
     * <li>-1 test not finalized</li>
     * <li>0 test ended without errors</li>
     * <li>1 test ended with errors</li>
     * </ul>
     *
     * @return {@code Integer}
     */
    public int getTeststatus() {
        return teststatus;
    }

    /**
     * Gets the integer that determines the status of the test<br>
     * <ul>
     * <li>-1 test not finalized</li>
     * <li>0 test ended without errors</li>
     * <li>1 test ended with errors</li>
     * </ul>
     *
     * @param teststatus Integer - Status of the test
     */
    public void setTeststatus(int teststatus) {
        this.teststatus = teststatus;
    }

    /**
     * Gets the {@code TestDetails} object
     *
     * @return {@code TestDetails}
     * @see TestDetails
     */
    public TestDetails getTestdetails() {
        return testdetails;
    }

    /**
     * Gets the {@code UserDetails} object
     *
     * @return {@code UserDetails}
     * @see UserDetails
     */
    public UserDetails getUserdetails() {
        return userdetails;
    }

    /**
     * Gets the {@code AutoReport} object
     *
     * @return {@code AutoReport}
     * @see AutoReport
     */
    public AutoReport getReport() {
        return report;
    }

    /**
     * Gets the {@code WebDriver} object
     *
     * @return {@code WebDriver}
     * @see WebDriver
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Sets the {@code WebDriver} object
     *
     * @param driver WebDriver - Object that we use as a basis to make our TestDriver
     * @see WebDriver
     */
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Gets a {@code boolean} that determines if the log out was successful
     *
     * @return {@code boolean}
     */
    public boolean isLogouterror() {
        return logouterror;
    }

    /**
     * Sets a {@code boolean} that determines if the log out was successful
     *
     * @param logouterror boolean - Control of the correct log out
     */
    public void setLogouterror(boolean logouterror) {
        this.logouterror = logouterror;
    }

    /**
     * Sets the format date to the object {@code testdateformat}
     *
     * @param testdateformat String - Format to set on the date
     * @see DateFormat
     * @see SimpleDateFormat
     */
    public void setTestdateformat(String testdateformat) {
        DateFormat dateformant;
        dateformant = new SimpleDateFormat(testdateformat);
        this.testdateformat = dateformant;
    }

    /**
     * Gets the {@code long} var to calculate the duration of the test
     *
     * @return {@code long}
     */
    public long getTeststart() {
        return teststart;
    }

    /**
     * Gets a {@code long} var to calculate the duration of the test
     *
     * @return {@code long}
     */
    public long getTestend() {
        return testend;
    }

    /**
     * Sets a {@code long} var to calculate the duration of the test with the current time in miliseconds
     *
     * @see System#currentTimeMillis()
     */
    public void setTestend() {
        this.testend = System.currentTimeMillis();
    }

    /**
     * Gets the testdate which is the system date as {@code Date}
     *
     * @return {@code Date}
     * @see Date
     */
    public Date getTestdate() {
        return testdate;
    }
    //</editor-fold>

    /**
     * Sets the testdate with the system date as {@code Date}
     */
    public void setTestdate() {
        this.testdate = new Date();
    }
    //</editor-fold>

    /**
     * This function basically starts the test ToDo
     *
     * @see CommonProcedures#atlasLogIn(TestDriver)
     */
    public void testStart() {
        System.out.println("Welcome to Autotest 2.0");
        if (checkExistence(this.getTestdetails().getTestname())) {
            switch (driverdetails.getBrowser()) {
                case "ff":
                    openFFDriver();
                    break;
                case "ie":
                    openIEDriver();
                    break;
                case "eg":
                    openEdgeDriver();
                    break;
                case "ch":
                    openChromeDriver();
                    break;
                default:
                    driver.quit();
                    break;
            }

            this.driver.get(this.driverdetails.getUrl());
            this.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            setCurrentwork("REGRESSION");
            createTest();
            if (CommonProcedures.atlasLogIn(this)) {
                test();
            }

            after();
        }
    }

    /**
     *
     */
    public void after() {
        //JiraUpdate jira;
        switch (getCurrentwork()) {
            case "REGRESSION":
                CommonProcedures.atlaslogOut(this);
                getReport().saveReport(this);
                if (jiraWorkflowStart() && jirastatus) {
                    this.jirastatus = false;
                    jira = new JiraUpdate(this);
                    jira.start();
                    System.out.println("Test updated sacssefull in Jira.");
                }
                break;
            case "JIRA":
                jira.jiraLogOut();
                break;
            case "RESET":
                break;
        }
        endTheRun();
    }

    /**
     * This function opens the mozilla firefox explorer and miximizes the window
     */
    public void openFFDriver() {
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
    }

    public void openIEDriver() {
        this.driver = new InternetExplorerDriver();
        this.driver.manage().window().maximize();
    }

    public void openChromeDriver() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    public void openEdgeDriver() {
        this.driver = new EdgeDriver();
        this.driver.manage().window().maximize();
    }
    /**
     * This function tries to make instances of the classes component that you specified on the args
     */
    public void createTest() {
        String testname = this.getTestdetails().getTestname();
        try {
            this.clazz = Class.forName("screen." + testname + "." + testname + "Manager");
            Constructor<?> ctor = this.clazz.getConstructor();
            this.test = (AT2Test) ctor.newInstance(new Object[]{});
        } catch (Exception e) {
            String message = "-- ERROR -- test(); Not able to find the class referent to the current test(" + testname + "), ir it has invalid structure, please check";
            e.printStackTrace();
            ErrorManager.process(this, message);
        }
    }

    /**
     * This function checks if the test has started
     *
     * @return {@code boolean}
     */
    public boolean test() {
        try {
            if (test.start(this)) {
                return false;
            }
        } catch (Exception e) {
            String message = "-- ERROR -- test(); Not able to find the class referent to the current test, or it has invalid structure, please check";
            e.printStackTrace();
            ErrorManager.process(this, message);
            return false;
        }
        return true;
    }

    /**
     * This function checks the existence of the classes of the component specified in the args
     *
     * @param testname String - Code of the component to test
     * @return {@code boolean}
     */
    public boolean checkExistence(String testname) {
        boolean exist = true;
        try {
            this.clazz = Class.forName("screen." + testname + "." + testname + "Manager");
        } catch (Exception e) {
            exist = false;
            System.out.println("-- ERROR -- checkTestExistence(); Not able to find the class referent to the current test(" + testname + "), or it has invalid structure, please check");
        }
        return exist;
    }

    /**
     * This funtion closes the WebDriver and wait 2 secs
     */
    public void closeDriver() {
        this.driver.close();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ToDo
     *
     * @return {@code boolean}
     */
    public boolean jiraWorkflowStart() {
        String fileName = "c:/SisVersion.txt";
        File f = new File(fileName);

        return !getTestdetails().getIssue().equals("") && f.exists();
    }

    /**
     * Exits the code
     *
     * @see System#exit(int)
     */
    public void endTheRun() {
        System.exit(teststatus);
    }

}