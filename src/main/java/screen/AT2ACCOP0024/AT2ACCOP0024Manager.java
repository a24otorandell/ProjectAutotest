package screen.AT2ACCOP0024;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 29/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement", "AssignmentToCollectionOrArrayFieldFromParameter"})
public class AT2ACCOP0024Manager implements AT2Test {

    AT2ACCOP0024Test test;
    AT2ACCOP0024Sis sis;
    String[] procedure;
    String env;

    public AT2ACCOP0024Manager(String enviroment) {
        setEnv(enviroment);
        if (getEnv().equalsIgnoreCase("test")) {
            setTest(new AT2ACCOP0024Test(enviroment));
        } else {
            setTestSis(new AT2ACCOP0024Sis(enviroment));
        }
    }

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

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2ACCOP0024Test getTest() {
        return test;
    }

    public void setTest(AT2ACCOP0024Test test) {
        this.test = test;
    }

    public AT2ACCOP0024Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCOP0024Sis sis) {
        this.sis = sis;
    }

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
            if (getProcedure()[i].equals("s")) {
                getTest().enabler(driver);
                getTest().gettingData(driver);
                getTest().search(driver);
                getTest().enabler(driver);
            }
            if (getProcedure()[i].equals("q")) {
                getTest().enabler(driver);
                getTest().gettingData(driver);
                getTest().qbe(driver);
                getTest().enabler(driver);
            }
            if (getProcedure()[i].equals("t")) {
                getTest().enabler(driver);
                getTest().detachTable(driver);
                getTest().enabler(driver);
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
