package core.TestDriver;

import core.ConnectionDDBB.ConnectionMSSQL;
import core.ConnectionDDBB.DDBBInteractions;
import core.FileGestor.DataHarvester;

import java.util.List;

/**
 * Created by otorandell on 09/02/2016.
 */
public class DetailsAdmin {

    public DetailsAdmin() {
    }

    public void setAll(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails, String[] args){
        setFileDetails(driverdetails, testdetails, userdetails);
        setArgsDetails(driverdetails, testdetails, userdetails, args);
        setDDBBCredentials(userdetails);
        setDefaults(driverdetails, testdetails, userdetails);
        setURL(driverdetails, testdetails);
    }

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

    private void setDefaults(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails) {

    }

    private void setArgsDetails(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (!(args.length <= (i + 1))) {
                if (args[i].equals("-e")) {
                    i++;
                    testdetails.setEnvironment(args[i].toLowerCase());
                } else if (args[i].equals("-br")) {
                    i++;
                   driverdetails.setBrowser(args[i].toLowerCase());
                } else if (args[i].equals("-p")) {
                    i++;
                    userdetails.setPassword(args[i]);
                } else if (args[i].equals("-t")) {
                    i++;
                    testdetails.setTestname(args[i].toUpperCase());
                } else if (args[i].equals("-u")) {
                    i++;
                    userdetails.setUsername(args[i].toLowerCase());
                } else if (args[i].equals("-i")) {
                    i++;
                    testdetails.setIssue(args[i]);
                }
                else if (args[i].equals("-c")) {
                    i++;
                    testdetails.setCsedProcedure(args[i]);
                }
            }
        }
    }

    public void setFileDetails(DriverDetails driverdetails, TestDetails testdetails, UserDetails userdetails){
        String filepath = "C:/AutotestInfo.txt";
        //AS
        DataHarvester harvester = new DataHarvester(filepath);
        driverdetails.setBrowser(harvester.harvest("browser"));
        testdetails.setEnvironment(harvester.harvest("environment"));
        testdetails.setTestname(harvester.harvest("screen"));
        testdetails.setIssue(harvester.harvest("issue"));
        testdetails.setCsedProcedure(harvester.harvest("csed"));
        userdetails.setUsername(harvester.harvest("user"));
        userdetails.setPassword(harvester.harvest("password"));
    }

    public void setDDBBCredentials(UserDetails userdetails){
        if(userdetails.getUsername().equals("") && userdetails.getPassword().equals("")){
        ConnectionMSSQL connection = new ConnectionMSSQL();
        connection.dbConnect("jdbc:jtds:sqlserver://VS-GORGBLAU;databaseName=Testing;", "betatester", "betatester");
        String[]user = DDBBInteractions.getOptimalUser(connection);
        userdetails.setUsername(user[0]);
        userdetails.setPassword(user[1]);
        DDBBInteractions.updateTable(connection, user[1], 1);
        userdetails.setDDBBCredentials(true);
        connection.closeConnection();
        }

    }

}

