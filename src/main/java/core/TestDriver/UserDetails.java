package core.TestDriver;

/**
 * This class controls the user variables that we use on the test
 *
 * @author otorandell on 09/02/2016
 */
public class UserDetails {
    String username = "";
    String password = "";
    boolean DDBBCredentials = false;

    public UserDetails() {
    }

    /**
     * Gets a boolean to check if the priority of use about the used user can be changed
     *
     * @return {@code boolean}
     */
    public boolean isDDBBCredentials() {
        return DDBBCredentials;
    }

    /**
     * Sets a boolean to check if the priority of use about the used user can be changed
     *
     * @param DDBBCredentials boolean - Control of the change of user priority
     */
    public void setDDBBCredentials(boolean DDBBCredentials) {
        this.DDBBCredentials = DDBBCredentials;
    }

    /**
     * Gets a string with the user name to log in the enviroment to test
     *
     * @return {@code String}
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets a string with the user name to log in the enviroment to test
     *
     * @param username String - User name to log in the envoronment
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets a string with the user password to log in the enviroment to test
     *
     * @return {@code string}
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets a string with the user password to log in the enviroment to test
     *
     * @param password String - User password to log in the environment
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
