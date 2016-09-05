package screen.AT2MDMCL0030;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author otorandell on 04/03/2016.
 */
@SuppressWarnings({"AssignmentToCollectionOrArrayFieldFromParameter", "unused"})
public class AT2MDMCL0030Manager implements AT2Test {

    AT2MDMCL0030Test test;
    AT2MDMCL0030Sis sis;
    String[] procedure;
    String env;

    public AT2MDMCL0030Manager(String enviroment) {
        setEnv(enviroment);
        if (getEnv().equalsIgnoreCase("test")) {
            setTest(new AT2MDMCL0030Test(enviroment));
        } else {
            setTestSis(new AT2MDMCL0030Sis(enviroment));
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

    public AT2MDMCL0030Test getTest() {
        return test;
    }

    public void setTest(AT2MDMCL0030Test test) {
        this.test = test;
    }

    public AT2MDMCL0030Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2MDMCL0030Sis sis) {
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
                getTest().enabler(driver);
                getTest().recordInteraction(driver, true);
                getTest().reset(driver);
            }
            if (getProcedure()[i].equals("s")) {
                getTest().enabler(driver);
                getTest().search(driver);
                getTest().reset(driver);
            }
            if (getProcedure()[i].equals("e")) {
                getTest().enabler(driver);
                getTest().recordInteraction(driver, false);
                getTest().reset(driver);
            }
            if (getProcedure()[i].equals("d")) {
                getTest().enabler(driver);
                getTest().delete(driver);
                getTest().reset(driver);
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
