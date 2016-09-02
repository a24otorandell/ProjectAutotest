package screen.AT2ACCCO0053;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 15/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement", "AssignmentToCollectionOrArrayFieldFromParameter"})
public class AT2ACCCO0053Manager implements AT2Test {

    AT2ACCCO0053Test test;
    AT2ACCCO0053Sis sis;
    String[] procedure;
    String env;


    public AT2ACCCO0053Manager(String enviroment) {
        setEnv(enviroment);
        if (getEnv().equalsIgnoreCase("test")) {
            setTest(new AT2ACCCO0053Test(enviroment));
        } else {
            setTestSis(new AT2ACCCO0053Sis(enviroment));
        }

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
     * Gets AT2ACCCO0053Test object
     *
     * @return AT2ACCCO0053Test
     */
    public AT2ACCCO0053Test getTest() {
        return test;
    }

    /**
     * Sets the object test with a AT2ACCCO0053Test class
     *
     * @param test AT2ACCCO0053Test
     */
    public void setTest(AT2ACCCO0053Test test) {
        this.test = test;
    }


    public AT2ACCCO0053Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCCO0053Sis sis) {
        this.sis = sis;
    }

    /**
     * Gets data of the class AT2ACCCO0053Data
     *
     * @return AT2ACCCO0053Data
     */
    public Map<String, String> getData() {
        if (getEnv().equalsIgnoreCase("test")) {
            return this.test.getData().getData();
        } else {
            return this.sis.getData().getData();
        }
    }

    public String getEnv() {
        return this.env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    /**
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    public boolean start(TestDriver driver) {
        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        if (getEnv().equalsIgnoreCase("sis")) {
            getTestSis().start(driver);
        } else {
            getTest().start(driver);
        }
        return csedIteration(driver);
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
            if (getProcedure()[i].equals("c")) {
            }
            if (getProcedure()[i].equals("s")) {
            }
            if (getProcedure()[i].equals("e")) {
            }
            if (getProcedure()[i].equals("d")) {
            }
            if (getProcedure()[i].equals("x")) {
                if (driver.getTestdetails().getEnvironment().equalsIgnoreCase("test")) {
                    if (!getTest().testCSED(driver)) {
                        return false;
                    }
                } else {
                    if (!getTestSis().testCSED(driver)) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

}
