package screen.AT2ACCSU0072;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 19/072016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCSU0072Manager implements AT2Test {

    AT2ACCSU0072Test test;
    String[] procedure;

    public AT2ACCSU0072Manager() {
        setTest(new AT2ACCSU0072Test());
        this.test.setData(new AT2ACCSU0072Data());
        this.test.setLocators(new AT2ACCSU0072Locators());
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2ACCSU0072Test getTest() {
        return test;
    }

    public void setTest(AT2ACCSU0072Test test) {
        this.test = test;
    }

    public Map<String, String> getData() {
        return this.test.getData().getData();
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
            if (getProcedure()[i].equals("c")) {
            }
            if (getProcedure()[i].equals("s")) {
            }
            if (getProcedure()[i].equals("e")) {
            }
            if (getProcedure()[i].equals("d")) {
            }
            if (getProcedure()[i].equals("x")) {
                if (!getTest().testCSED(driver)) {
                    return false;
                }
            }
        }
        return true;

    }

}
