package screen.AT2BOOSA1003;

import core.TestDriver.TestDriver;
import screen.AT2Test;

import java.util.Map;

/**
 * @author ajvirgili on 15/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement", "AssignmentToCollectionOrArrayFieldFromParameter", "StatementWithEmptyBody"})
public class AT2BOOSA1003Manager implements AT2Test {
    /**
     * ToDo Falta gestionar la busqueda previa de una reserva para después generar las estimaciones
     */

    AT2BOOSA1003Test test;
    AT2BOOSA1003Sis sis;
    String[] procedure;
    String env;


    public AT2BOOSA1003Manager(String enviroment) {
        setEnv(enviroment);
        if (getEnv().equalsIgnoreCase("test")) {
            setTest(new AT2BOOSA1003Test(enviroment));
        } else {
            setTestSis(new AT2BOOSA1003Sis(enviroment));
        }
    }

    public AT2BOOSA1003Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2BOOSA1003Sis sis) {
        this.sis = sis;
    }

    public String getEnv() {
        return this.env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    /**
     * Gets an array of Strings with the parameters to do the test
     *
     * @return String[]
     */
    public String[] getProcedure() {
        return procedure;
    }

    /**
     * Sets an array of Strings to a local variable
     *
     * @param procedure String[]
     */
    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    /**
     * Gets AT2BOOSA1003Test object
     *
     * @return AT2BOOSA1003Test
     */
    public AT2BOOSA1003Test getTest() {
        return test;
    }

    /**
     * Sets the object test with a AT2BOOSA1003Test class
     *
     * @param test AT2BOOSA1003Test
     */
    public void setTest(AT2BOOSA1003Test test) {
        this.test = test;
    }

    /**
     * Gets data of the class AT2BOOSA1003Data
     *
     * @return AT2BOOSA1003Data
     */
    public Map<String, String> getData() {
        if (getEnv().equalsIgnoreCase("test")) {
            return this.test.getData().getData();
        } else {
            return this.sis.getData().getData();
        }
    }

    /**
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    public boolean start(TestDriver driver) {
        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        getTest().start(driver);
        if (!csedIteration(driver)) {
            return false;
        }
        return true;
    }

    /**
     * Here the procedure sets which tests will be done <br>
     * Creation record(c) , Search record(s) , Edit record(e) , Delete record(d) ,
     * QBE search(q) , Data History(h) , Detach Table(t)
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
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
                if (driver.getTestdetails().getEnvironment().equalsIgnoreCase("test")) {
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
