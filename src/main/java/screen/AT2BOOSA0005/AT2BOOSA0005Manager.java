package screen.AT2BOOSA0005;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by icastaneira on 18/05/2016.
 */
public class AT2BOOSA0005Manager implements AT2Test {

    AT2BOOSA0005Test test;
    String[] procedure;

    public AT2BOOSA0005Manager() {
        setTest(new AT2BOOSA0005Test());
        this.test.setData(new AT2BOOSA0005Data());
        this.test.setLocators(new AT2BOOSA0005Locators());
    }

    public String[] getProcedure() {
        return procedure;
    }

    public AT2BOOSA0005Test getTest() {
        return test;
    }

    public Map<String, String> getData() {
        return this.test.getData().getData();}

    public void setTest(AT2BOOSA0005Test test) {
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
            /*
            if (getProcedure()[i].equals("c")) {
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
                }
                */
                if (getProcedure()[i].equals("x")) {
                    if (!getTest().testCSED(driver)) {
                        return false;
                    }
                }
            }
        return true;

    }

    }
