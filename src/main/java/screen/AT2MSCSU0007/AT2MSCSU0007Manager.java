package screen.AT2MSCSU0007;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 30/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2MSCSU0007Manager implements AT2Test {

    AT2MSCSU0007Test test;
    String[] procedure;

    public AT2MSCSU0007Manager() {
        setTest(new AT2MSCSU0007Test());
        this.test.setData(new AT2MSCSU0007Data());
        this.test.setLocators(new AT2MSCSU0007Locators());
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2MSCSU0007Test getTest() {
        return test;
    }

    public void setTest(AT2MSCSU0007Test test) {
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

            if (getProcedure()[i].equals("x")) {
                if (!getTest().testCSED(driver)) {
                    return false;
                }
            }
        }
        return true;

    }

}
