package screen.AT2MDMCL0022;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by jmrios on 25/11/2016.
 */
public class AT2MDMCL0022Manager implements AT2Test {
    AT2MDMCL0022Sis sis;
    AT2MDMCL0022Test test;
    String[] procedure;
    String entorno;

    public AT2MDMCL0022Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            entorno = "test";
            setTest(new AT2MDMCL0022Test());
            this.test.setData(new AT2MDMCL0022Data(enviroment));
            this.test.setLocators(new AT2MDMCL0022Locators(enviroment));
        } else {
            entorno = "sis";
            setTestSis(new AT2MDMCL0022Sis());
            this.sis.setData(new AT2MDMCL0022Data(enviroment));
            this.sis.setLocators(new AT2MDMCL0022Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2MDMCL0022Test getTest() {
        return test;
    }

    public void setTest(AT2MDMCL0022Test test) {
        this.test = test;
    }

    public AT2MDMCL0022Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2MDMCL0022Sis sis) {
        this.sis = sis;
    }

    public Map<String, String> getData() {
        if (entorno.equalsIgnoreCase("test")) {
            return this.test.getData().getData();
        } else {
            return this.sis.getData().getData();
        }
    }

    public boolean start(TestDriver driver) {

        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        if (driver.getTestdetails().getEnvironment().equalsIgnoreCase("sis")) {
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
            if (getProcedure()[i].equals("x") && (driver.getTestdetails().getEnvironment().equalsIgnoreCase("test"))) {
                if (!getTest().testCSED(driver)) {
                    return false;
                }
            } else if (getProcedure()[i].equals("x") && (driver.getTestdetails().getEnvironment().equalsIgnoreCase("sis"))) {
                if (!getTestSis().testCSED(driver)) {
                    return false;
                }
            }
        }
        return true;
    }
}
