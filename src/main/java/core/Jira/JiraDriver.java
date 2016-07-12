package core.Jira;

import core.TestDriver.TestDriver;

/**
 * This class gathers all the info refferent to the actions with JIRA
 *
 * @author otorandell on 12/02/2016
 * @see TestDriver
 */
public class JiraDriver {
    TestDriver driver;

    /**
     * The JiraDriver needs TestDriver to work. So as parameter to construct one JiraDetails is necessary a TestDriver object
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     */
    public JiraDriver(TestDriver driver) {
        this.driver = driver;
    }

    /**
     * Gets the TestDriver object
     *
     * @return {@code TestDriver}
     */
    public TestDriver getDriver() {
        return driver;
    }

    /**
     * Sets the TestDriver object
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     */
    public void setDriver(TestDriver driver) {
        this.driver = driver;
    }

    /**
     * Sets the currentowrk of the TestDriver to JIRA and calls
     *
     * @param jiradetails Jiradetails - This object gathers all the info refferent to the actions with JIRA
     * @see JiraDetails#getUrl()
     */
    public void driverSetUp(JiraDetails jiradetails) {
        driver.setCurrentwork("JIRA");
        setJiraURL(jiradetails.getUrl());
    }

    /**
     * Sets the url to JIRA
     *
     * @param url String - JIRA url
     */
    private void setJiraURL(String url) {
        driver.getDriverdetails().setUrl(url);
    }
}
