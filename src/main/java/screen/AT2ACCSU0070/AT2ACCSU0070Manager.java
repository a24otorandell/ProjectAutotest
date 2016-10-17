package screen.AT2ACCSU0070;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 19/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement", "StatementWithEmptyBody", "AssignmentToCollectionOrArrayFieldFromParameter"})
public class AT2ACCSU0070Manager implements AT2Test {

    AT2ACCSU0070Test test;
    AT2ACCSU0070Sis sis;
    String[] procedure;
    String env;

    public AT2ACCSU0070Manager(String enviroment) {
        setEnv(enviroment);
        if (getEnv().equalsIgnoreCase("test")) {
            setTest(new AT2ACCSU0070Test(enviroment));
        } else {
            setTestSis(new AT2ACCSU0070Sis(enviroment));
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

    public AT2ACCSU0070Test getTest() {
        return test;
    }

    public void setTest(AT2ACCSU0070Test test) {
        this.test = test;
    }

    public AT2ACCSU0070Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCSU0070Sis sis) {
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
