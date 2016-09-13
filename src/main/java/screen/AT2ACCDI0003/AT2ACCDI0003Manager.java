package screen.AT2ACCDI0003;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author otorandell on 04/03/2016.
 */
public class AT2ACCDI0003Manager implements AT2Test {

    AT2ACCDI0003Test test;
    AT2ACCDI0003Sis sis;
    String[] procedure;
    String enviroment;

    public AT2ACCDI0003Manager(String enviroment) {
        this.enviroment = enviroment;
        if (enviroment.equalsIgnoreCase("test")) {
            setTest(new AT2ACCDI0003Test(enviroment));
        } else {
            setTestSis(new AT2ACCDI0003Sis(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2ACCDI0003Test getTest() {
        return test;
    }

    public void setTest(AT2ACCDI0003Test test) {
        this.test = test;
    }

    public AT2ACCDI0003Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCDI0003Sis sis) {
        this.sis = sis;
    }

    public Map<String, String> getData() {
        if (enviroment.equalsIgnoreCase("test")) {
            return this.test.getData().getData();
        } else {
            return this.sis.getData().getData();
        }
    }

    public boolean start(TestDriver driver) {
        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        if (enviroment.equalsIgnoreCase("sis")) {
            getTestSis().start(driver);
        } else {
            getTest().start(driver);
        }
        return csedIteration(driver);
    }

    private boolean csedIteration(TestDriver driver) {
        //TODO CSED TEST
        String[] procedure = getProcedure();
        for (int i = 0; i < procedure.length; i++) {
               /* if (getProcedure()[i].equals("c")) {
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
                }*/
            if (getProcedure()[i].equals("x")) {
                if (enviroment.equalsIgnoreCase("test")) {
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
