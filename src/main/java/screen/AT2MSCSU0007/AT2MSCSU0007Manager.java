package screen.AT2MSCSU0007;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 30/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2MSCSU0007Manager implements AT2Test {

    AT2MSCSU0007Test test;
    AT2MSCSU0007Sis sis;
    String[] procedure;
    String env;

    public AT2MSCSU0007Manager(String enviroment) {
        setEnv(enviroment);
        if (getEnv().equalsIgnoreCase("test")) {
            setTest(new AT2MSCSU0007Test(enviroment));
        } else {
            setTestSis(new AT2MSCSU0007Sis(enviroment));
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

    public AT2MSCSU0007Test getTest() {
        return test;
    }

    public void setTest(AT2MSCSU0007Test test) {
        this.test = test;
    }

    public AT2MSCSU0007Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2MSCSU0007Sis sis) {
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
