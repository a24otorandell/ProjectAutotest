package screen.AT2TRFSU0002;


import core.TestDriver.TestDriver;

import screen.AT2Test;

import java.util.Map;

/**
 * Created by vsolis on 08/09/2016.
 */
public class AT2TRFSU0002Manager implements AT2Test {

    AT2TRFSU0002Test test;
    AT2TRFSU0002Sis sis;
    String[] procedure;
    String entorno;

    public AT2TRFSU0002Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            entorno = "test";
            setTest(new AT2TRFSU0002Test());
            this.test.setData(new AT2TRFSU0002Data(enviroment));
            this.test.setLocators(new AT2TRFSU0002Locators(enviroment));
        } else {
            entorno = "sis";
            setTestSis(new AT2TRFSU0002Sis());
            this.sis.setData(new AT2TRFSU0002Data(enviroment));
            this.sis.setLocators(new AT2TRFSU0002Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2TRFSU0002Test getTest() {
        return test;
    }

    public void setTest(AT2TRFSU0002Test test) {
        this.test = test;
    }

    public AT2TRFSU0002Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2TRFSU0002Sis sis) {
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
        if (entorno.equalsIgnoreCase("sis")) {
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
