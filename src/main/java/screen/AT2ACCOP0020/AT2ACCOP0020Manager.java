package screen.AT2ACCOP0020;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by vsolis on 23/09/2016.
 */
public class AT2ACCOP0020Manager implements AT2Test {


    AT2ACCOP0020Test test;
    AT2ACCOP0020Sis sis;
    String[] procedure;
    String entorno;

    public AT2ACCOP0020Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            entorno = "test";
            setTest(new AT2ACCOP0020Test());
            this.test.setData(new AT2ACCOP0020Data(enviroment));
            this.test.setLocators(new AT2ACCOP0020Locators(enviroment));
        } else {
            entorno = "sis";
            setTestSis(new AT2ACCOP0020Sis());
            this.sis.setData(new AT2ACCOP0020Data(enviroment));
            this.sis.setLocators(new AT2ACCOP0020Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2ACCOP0020Test getTest() {
        return test;
    }

    public void setTest(AT2ACCOP0020Test test) {
        this.test = test;
    }

    public AT2ACCOP0020Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCOP0020Sis sis) {
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