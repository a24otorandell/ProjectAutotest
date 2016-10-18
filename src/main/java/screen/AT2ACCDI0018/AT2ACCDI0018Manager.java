package screen.AT2ACCDI0018;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by aibanez on 17/10/2016.
 */
public class AT2ACCDI0018Manager implements AT2Test {
    AT2ACCDI0018Sis sis;
    AT2ACCDI0018Test test;
    String[] procedure;
    String entorno;


    public AT2ACCDI0018Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            entorno = "test";
            setTest(new AT2ACCDI0018Test());
            this.test.setData(new AT2ACCDI0018Data(enviroment));
            this.test.setLocators(new AT2ACCDI0018Locators(enviroment));
        } else {
            entorno = "sis";
            setTestSis(new AT2ACCDI0018Sis());
            this.sis.setData(new AT2ACCDI0018Data(enviroment));
            this.sis.setLocators(new AT2ACCDI0018Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2ACCDI0018Test getTest() {
        return test;
    }

    public void setTest(AT2ACCDI0018Test test) {
        this.test = test;
    }

    public AT2ACCDI0018Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCDI0018Sis sis) {
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
