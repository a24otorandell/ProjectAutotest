package screen.AT2ACCOP0024;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 29/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCOP0024Manager implements AT2Test {

    AT2ACCOP0024Test test;
    String[] procedure;


    public AT2ACCOP0024Manager() {
        setTest(new AT2ACCOP0024Test());
        this.test.setData(new AT2ACCOP0024Data());
        this.test.setLocators(new AT2ACCOP0024Locators());
    }

    /**
     * Gets an array of Strings with the parameters to do the test
     *
     * @return String[]
     */
    public String[] getProcedure() {
        return procedure;
    }

    /**
     * Sets an array of Strings to a local variable
     *
     * @param procedure String[]
     */
    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    /**
     * Gets AT2ACCOP0024Test object
     *
     * @return AT2ACCO0024PTest
     */
    public AT2ACCOP0024Test getTest() {
        return test;
    }

    /**
     * Sets the object test with a AT2ACCOP0024Test class
     *
     * @param test AT2ACCOP0024Test
     */
    public void setTest(AT2ACCOP0024Test test) {
        this.test = test;
    }

    /**
     * Gets data of the class AT2ACCOP0024Data
     *
     * @return AT2ACCOP0024Data
     */
    public Map<String, String> getData() {
        return this.test.getData().getData();
    }

    /**
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    public boolean start(TestDriver driver) {
        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        getTest().start(driver);
        if (!csedIteration(driver)) {
            return false;
        }
        return true;
    }

    /**
     * Here the procedure sets which tests will be done <br>
     * Creation record(c) , Search record(s) , Edit record(e) , Delete record(d) ,
     * QBE search(q) , Data History(h) , Detach Table(t)
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    private boolean csedIteration(TestDriver driver) {
        String[] procedure = getProcedure();
        for (int i = 0; i < procedure.length; i++) {
            if (getProcedure()[i].equals("s")) {
                getTest().enabler(driver);
                getTest().gettingData(driver);
                getTest().search(driver);
                getTest().reset(driver);
            }
            if (getProcedure()[i].equals("q")) {
                getTest().enabler(driver);
                getTest().gettingData(driver);
                getTest().qbe(driver);
                getTest().reset(driver);
            }
            if (getProcedure()[i].equals("t")) {
                getTest().enabler(driver);
                getTest().detachTable(driver);
                getTest().reset(driver);
            }
            if (getProcedure()[i].equals("x")) {
                if (!getTest().testCSED(driver)) {
                    return false;
                }
            }
        }
        return true;

    }

}
