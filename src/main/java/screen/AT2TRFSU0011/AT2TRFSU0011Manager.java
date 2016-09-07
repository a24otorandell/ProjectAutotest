package screen.AT2TRFSU0011;

import core.TestDriver.TestDriver;
import screen.AT2Test;
import java.util.Map;


/**
 * Created by vsolis on 29/08/2016.
 */
public class AT2TRFSU0011Manager implements AT2Test {
    AT2TFRSU0011Test test;
    AT2TFRSU0011Sis sis;
    String[] procedure;
    String entorno;

    public AT2TRFSU0011Manager(String enviroment) {
        entorno = enviroment;
        if (enviroment.equalsIgnoreCase("test")) {
            setTest(new AT2TFRSU0011Test());
            this.test.setData(new AT2TFRSU0011Data(enviroment));
            this.test.setLocators(new AT2TFRSU0011Locators(enviroment));
        } else {
            setTestSis(new AT2TFRSU0011Sis());
            this.sis.setData(new AT2TFRSU0011Data(enviroment));
            this.sis.setLocators(new AT2TFRSU0011Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2TFRSU0011Test getTest() {
        return test;
    }

    public void setTest(AT2TFRSU0011Test test) {
        this.test = test;
    }

    public AT2TFRSU0011Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2TFRSU0011Sis sis) {
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
