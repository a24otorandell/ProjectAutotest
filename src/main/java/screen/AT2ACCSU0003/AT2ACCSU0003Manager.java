package screen.AT2ACCSU0003;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by aibanez on 18/10/2016.
 */
public class AT2ACCSU0003Manager implements AT2Test {
    AT2ACCSU0003Test test;
    AT2ACCSU0003Sis sis;
    String[] procedure;
    String env;

    public AT2ACCSU0003Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            env = "test";
            setTest(new AT2ACCSU0003Test());
            this.test.setData(new AT2ACCSU0003Data(enviroment));
            this.test.setLocators(new AT2ACCSU0003Locators(enviroment));
        } else {
            env = "sis";
            setTestSis(new AT2ACCSU0003Sis());
            this.sis.setData(new AT2ACCSU0003Data(enviroment));
            this.sis.setLocators(new AT2ACCSU0003Locators(enviroment));
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

    public AT2ACCSU0003Test getTest() {
        return test;
    }

    public void setTest(AT2ACCSU0003Test test) {
        this.test = test;
    }

    public AT2ACCSU0003Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCSU0003Sis sis) {
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
