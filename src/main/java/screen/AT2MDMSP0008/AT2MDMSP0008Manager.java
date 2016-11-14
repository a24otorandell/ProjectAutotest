package screen.AT2MDMSP0008;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0008Manager implements AT2Test {
    AT2MDMSP0008Sis sis;
    AT2MDMSP0008Test test;
    String[] procedure;
    String entorno;


    public AT2MDMSP0008Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")){
            entorno = "test";
            setTest(new AT2MDMSP0008Test());
            this.test.setData(new AT2MDMSP0008Data(enviroment));
            this.test.setLocators(new AT2MDMSP0008Locators(enviroment));
        } else {
            entorno = "sis";
            setTestSis(new AT2MDMSP0008Sis());
            this.sis.setData(new AT2MDMSP0008Data(enviroment));
            this.sis.setLocators(new AT2MDMSP0008Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2MDMSP0008Test getTest() {
        return test;
    }

    public void setTest(AT2MDMSP0008Test test) {
        this.test = test;
    }

    public AT2MDMSP0008Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2MDMSP0008Sis sis) {
        this.sis = sis;
    }


    public Map<String, String> getData() {
        if (entorno.equalsIgnoreCase("test")){
            return this.test.getData().getData();
        } else {
            return this.sis.getData().getData();
        }
    }

    public boolean start(TestDriver driver) {

        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        if (driver.getTestdetails().getEnvironment().equalsIgnoreCase("sis")){
            getTestSis().start(driver);
        } else {
            getTest().start(driver);
        }
        return csedIteration(driver);
    }

    private boolean csedIteration(TestDriver driver) {
        String[] procedure = getProcedure();
        for (int i = 0; i < procedure.length; i++) {
            if (getProcedure()[i].equals("c")){
            }
            if (getProcedure()[i].equals("s")){
            }
            if (getProcedure()[i].equals("e")){
            }
            if (getProcedure()[i].equals("d")){
            }
            if (getProcedure()[i].equals("x") && (driver.getTestdetails().getEnvironment().equalsIgnoreCase("test"))){
                if (!getTest().testCSED(driver)){
                    return false;
                }
            } else if (getProcedure()[i].equals("x") && (driver.getTestdetails().getEnvironment().equalsIgnoreCase("sis"))){
                if (!getTestSis().testCSED(driver)){
                    return false;
                }
            }
        }
        return true;
    }
}
