package core.ConnectionDDBB;

import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * This class interacts with the DDBB
 *
 * @author otorandell on 15/02/2016
 * @see Connection
 */
public class ConnectionMSSQL {
    Connection conn;

    public ConnectionMSSQL() {
    }

    /**
     * Gets the var conn
     *
     * @return {@code Connection} object
     * @see Connection
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * Tries to connect to a db with the url, id and password passed by parameters
     *
     * @param db_connect_string String - The url of the database
     * @param db_userid         String - User id to connect at the database
     * @param db_password       SString - User password to connect at the database
     */
    public void dbConnect(String db_connect_string, String db_userid, String db_password) {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
            System.out.println("connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Tries to close the connection
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     */
    public void closeConnection(TestDriver driver) {
        try {
            conn.close();
        } catch (Exception e) {
            String ecode = "--ERROR: closeConnection(): Unable to close connection, probably is already closed.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
    }

    /**
     * Tries to close the connection
     */
    public void closeConnection() {
        try {
            conn.close();
        } catch (Exception e) {
            String ecode = "--ERROR: closeConnection(): Unable to close connection, probably is already closed.";
            e.printStackTrace();
        }
    }
}
