package screen.AT2ACCCO0052;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 15/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement", "AssignmentToCollectionOrArrayFieldFromParameter"})
public class AT2ACCCO0052Manager implements AT2Test {

    AT2ACCCO0052Test test;
    String[] procedure;


    public AT2ACCCO0052Manager() {
        setTest(new AT2ACCCO0052Test());
        this.test.setData(new AT2ACCCO0052Data());
        this.test.setLocators(new AT2ACCCO0052Locators());
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
     * Gets AT2ACCCO0052Test object
     *
     * @return AT2ACCCO0052Test
     */
    public AT2ACCCO0052Test getTest() {
        return test;
    }

    /**
     * Sets the object test with a AT2ACCCO0052Test class
     *
     * @param test AT2ACCCO0052Test
     */
    public void setTest(AT2ACCCO0052Test test) {
        this.test = test;
    }

    /**
     * Gets data of the class AT2ACCCO0052Data
     *
     * @return AT2ACCCO0052Data
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
            }
            if (getProcedure()[i].equals("q")) {
            }
            if (getProcedure()[i].equals("t")) {
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