package screen.AT2BOOSA1002;

import core.TestDriver.TestDriver;


import java.util.Map;

/**
 * Created by acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Manager {
    AT2BOOSA1002Test test;
    String[] procedure;

    public AT2BOOSA1002Manager() {
        setTest(new AT2BOOSA1002Test());
        this.test.setData(new AT2BOOSA1002Data());
        this.test.setLocators(new AT2BOOSA1002Locators());
    }

    public String[] getProcedure() {
        return procedure;
    }

    public AT2BOOSA1002Test getTest() {
        return test;
    }

    public Map<String, String> getData() {
        return this.test.getData().getData();}

    public void setTest(AT2BOOSA1002Test test) {
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
