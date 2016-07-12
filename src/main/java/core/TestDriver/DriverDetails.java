package core.TestDriver;

/**
 * This class controls the variables of the url enviroment and browser where the test will be done
 *
 * @author otorandell on 08/02/2016
 */
public class DriverDetails {
    String browser = "";
    String url = "";

    public DriverDetails() {

    }

    /**
     * Gets the string variable which determines the browser used on the test
     *
     * @return a {@code String} with the name/code of the browser
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Sets the string variable which determines the broser used on the test
     *
     * @param browser String - Value of the browser which use to test
     */
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    /**
     * Gets the string variable which determines the enviroment to test
     *
     * @return a {@code String}
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the string variable which determines the enviroment to test
     *
     * @param url String - Url of the enviroment
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
