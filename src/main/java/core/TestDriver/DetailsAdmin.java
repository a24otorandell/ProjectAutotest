package core.TestDriver;

import core.ConnectionDDBB.ConnectionMSSQL;
import core.ConnectionDDBB.DDBBInteractions;
import core.FileGestor.DataHarvester;

import java.io.File;

//import java.util.List;

/**
 * This class consists on determine the specifics parameters to configure the test arrangement
 *
 * @author otorandell on 09/02/2016
 * @author ajvirgili on 01/07/2016
 */
@SuppressWarnings("unused")
public class DetailsAdmin {

    public DetailsAdmin() {
    }

    /**
     * Calls all the other set functions in this class
     *
     * @param driverdetails DriverDetails - This object controls the variables of the url enviroment and browser
     * @param testdetails   TestDetails - This object sets the some of the configuration variables
     * @param userdetails   Userdetails - This object controls the user variables
     * @param args          String[] - Arguments of the Main run
     */
    public void setAll(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails, String[] args) {
        setFileDetails(driverdetails, testdetails, userdetails);
        setArgsDetails(driverdetails, testdetails, userdetails, args);
        setDDBBCredentials(userdetails);
        setDefaults(driverdetails, testdetails, userdetails);
        setURL(driverdetails, testdetails);
    }

    /**
     * Sets in which enviroment url will be the test
     *
     * @param driverdetails DriverDetails - This object controls the variables of the url enviroment and browser
     * @param testdetails   TestDetails - This object sets the some of the configuration variables
     */
    private void setURL(DriverDetails driverdetails, TestDetails testdetails) {
        switch (testdetails.getEnvironment()) {
            case "des":
                driverdetails.setUrl("http://atladfdes.hotelbeds.com/ATLAS20/faces/atlas");
                break;
            case "test":
                driverdetails.setUrl("http://atladftest.hotelbeds.com/ATLAS20/faces/atlas");
                break;
            case "sis":
                driverdetails.setUrl("http://atladfsis.hotelbeds.com/ATLAS20/faces/atlas");
                break;
            case "pro":
                driverdetails.setUrl("http://atladf.hotelbeds.com/ATLAS20/faces/atlas");
                break;
            default:
                driverdetails.setUrl("http://atladftest.hotelbeds.com/ATLAS20/faces/atlas");
                break;
        }
    }

    /**
     * Set which arguments data will be by default if they are not specified
     *
     * @param driverdetails DriverDetails - This object controls the variables of the url enviroment and browser
     * @param testdetails   TestDetails - This object sets the some of the configuration variables
     * @param userdetails   Userdetails - This object controls the user variables
     */
    private void setDefaults(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails) {
        if (driverdetails.getBrowser().equals("")) {
            driverdetails.setBrowser("ff");
        }
        if (testdetails.getEnvironment().equals("")) {
            testdetails.setEnvironment("test");
        }
        if (testdetails.getCsedProcedure().equals("")) {
            testdetails.setCsedProcedure("x");
        }
    }

    /**
     * Getting the arguments sets the (-e)enviroment, (-br)browser, (-p)password, (-t)test, (-u)user, (-i)issue, (-c)csed
     * to work with
     *
     * @param driverdetails DriverDetails - This object controls the variables of the url enviroment and browser
     * @param testdetails   TestDetails - This object sets the some of the configuration variables
     * @param userdetails   Userdetails - This object controls the user variables
     * @param args          String[] - Arguments of the Main run
     */
    private void setArgsDetails(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (!(args.length <= (i + 1))) {
                switch (args[i]) {
                    case "-e":
                        i++;
                        testdetails.setEnvironment(args[i].toLowerCase());
                        break;
                    case "-br":
                        i++;
                        driverdetails.setBrowser(args[i].toLowerCase());
                        break;
                    case "-p":
                        i++;
                        userdetails.setPassword(args[i]);
                        break;
                    case "-t":
                        i++;
                        testdetails.setTestname(args[i].toUpperCase());
                        break;
                    case "-u":
                        i++;
                        userdetails.setUsername(args[i].toLowerCase());
                        break;
                    case "-i":
                        i++;
                        testdetails.setIssue(args[i]);
                        break;
                    case "-c":
                        i++;
                        testdetails.setCsedProcedure(args[i]);
                        break;
                    case "":
                        break;
                }
            }
        }
    }

    /**
     * Gets the arguments from a file and sets them
     *
     * @param driverdetails DriverDetails - This object controls the variables of the url enviroment and browser
     * @param testdetails   TestDetails - This object sets the some of the configuration variables
     * @param userdetails   Userdetails - This object controls the user variables
     * @see DataHarvester
     */
    public void setFileDetails(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails) {
        String filepath = "C:/AutotestInfo.txt";
        //AS
        DataHarvester harvester = new DataHarvester(filepath);
        File file = new File(filepath);
        if (harvester.exist_file(file)) {
            driverdetails.setBrowser(harvester.harvest("browser"));
            testdetails.setEnvironment(harvester.harvest("environment"));
            testdetails.setTestname(harvester.harvest("screen"));
            testdetails.setIssue(harvester.harvest("issue"));
            testdetails.setCsedProcedure(harvester.harvest("csed"));
            userdetails.setUsername(harvester.harvest("user"));
            userdetails.setPassword(harvester.harvest("password"));
        }
    }

    /**
     * Connects with a db to obtain an user and a password, and update the value of usage related at that user
     *
     * @param userdetails Userdetails - This object controls the user variables
     * @see ConnectionMSSQL
     * @see UserDetails
     * @see DDBBInteractions
     */
    public void setDDBBCredentials(UserDetails userdetails) {
        if (userdetails.getUsername().equals("") && userdetails.getPassword().equals("")) {
            ConnectionMSSQL connection = new ConnectionMSSQL();
            connection.dbConnect("jdbc:jtds:sqlserver://VS-GORGBLAU;databaseName=Testing;", "betatester", "betatester");
            String[] user = DDBBInteractions.getOptimalUser(connection);
            userdetails.setUsername(user[0]);
            userdetails.setPassword(user[1]);
            DDBBInteractions.updateTable(connection, user[0], 1);
            userdetails.setDDBBCredentials(true);
            connection.closeConnection();
        }

    }

}

