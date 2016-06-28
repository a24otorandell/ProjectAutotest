package screen.AT2ACCOP0025;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/***
 * Created by ajvirgili on 23/06/2016.
 */
public class AT2ACCOP0025Manager implements AT2Test {

    AT2ACCOP0025Test test;
    String[] procedure;

    public AT2ACCOP0025Manager() {
        setTest(new AT2ACCOP0025Test());
        this.test.setData(new AT2ACCOP0025Data());
        this.test.setLocators(new AT2ACCOP0025Locators());
    }

    public String[] getProcedure() {
        return procedure;
    }

    public AT2ACCOP0025Test getTest() {
        return test;
    }

    public Map<String, String> getData() {
        return this.test.getData().getData();
    }

    public void setTest(AT2ACCOP0025Test test) {
        this.test = test;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public boolean start(TestDriver driver) {
        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        getTest().start(driver);
        if (!csedIteration(driver)) {
            return false;
        }
        return true;
    }

    private boolean csedIteration(TestDriver driver) {
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
                if (!getTest().testCSED(driver)) {
                    return false;
                }
            }
        }
        return true;

    }

}
