package core.TestDriver;

/**
 * This class sets the some of the variables to determine the configuration of the test:
 * <ul><li>MainMenu <i>(ej: MSC=miscelaneous, ACC=accomodations)</i></li>
 * <li>SubMenu <i>(ej:OP=operations, SU=Setup</i></li>
 * <li>Component(screen)</li>
 * <li>Environment</li>
 * <li>Issue</li>
 * <li>Procedure of the test</li></ul>
 *
 * @author otorandell on 09/02/2016
 */
public class TestDetails {
    String environment = "";
    String testname = "";
    String mainmenu;
    String submenu;
    String screen;
    String issue;
    String csedprocedure;

    public TestDetails() {
    }

    /**
     * Gets the string var with the issue code
     *
     * @return {@code String}
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the string var with the issue code
     *
     * @param issue String - Value of the issue about the test
     */
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * Gets the string var with the procedures to test
     *
     * @return {@code String}
     */
    public String getCsedProcedure() {
        return csedprocedure;
    }

    /**
     * Sets the string var with the procedures to test
     *
     * @param csedprocedure String - Values of the csed process inline
     */
    public void setCsedProcedure(String csedprocedure) {
        this.csedprocedure = csedprocedure;
    }

    /**
     * Gets the string with the url of the environment to test
     *
     * @return {@code String}
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the string with the url of the environment to test
     *
     * @param environment String - Url of the environment to test
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Gets the string with the code of the component to test<br>
     * <i>AT2XXXXXNNNN</i>
     *
     * @return {@code String}
     */
    public String getTestname() {
        return testname;
    }

    /**
     * Sets the string with the code of the component to test<br>
     * <i>AT2XXXXXNNNN</i>
     *
     * @param testname String - Code of the component
     */
    public void setTestname(String testname) {
        this.testname = testname;
    }

    /**
     * Gets the string with the section of the component to test
     *
     * @return {@code String}
     */
    public String getMainmenu() {
        return mainmenu;
    }

    /**
     * Sets the string with the section of the component to test
     *
     * @param mainmenu String - Section of the component
     */
    public void setMainmenu(String mainmenu) {
        this.mainmenu = mainmenu;
    }

    /**
     * Gets the string with the type of the component to test
     *
     * @return {@code String}
     */
    public String getSubmenu() {
        return submenu;
    }

    /**
     * Sets the string with the type of the component to test
     *
     * @param submenu String - Type of the component
     */
    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }

    /**
     * Gets the string with the alias of the component to test
     *
     * @return {@code String}
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Sets the string with the alias of the component to test
     *
     * @param screen String - Alias of the component
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }

    /**
     * ToDo
     *
     * @return {@code String}
     */
    public String getMenu() {
        String[] splitted = getTestname().split("AT2");
        return splitted[1].substring(0, 2);
    }
}
