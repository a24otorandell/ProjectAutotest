package screen.AT2BOOSA0005;


import core.CommonActions.Functions;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by icastaneira on 17/05/2016.
 */
public class AT2BOOSA0005Test {

    protected AT2BOOSA0005Locators locators;
    protected AT2BOOSA0005Data data;

    public AT2BOOSA0005Test() {

    }

    public AT2BOOSA0005Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSA0005Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSA0005Data getData() {
        return data;
    }

    public void setData(AT2BOOSA0005Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        driver.getTestdetails().setScreen("AT2BOOSA1002");
        CommonProcedures.goToScreen(driver);
        driver.getTestdetails().setScreen("AT2BOOSA0005");
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Bookings");
        driver.getTestdetails().setSubmenu("Sales");
        driver.getTestdetails().setScreen("Occupancy Graphic 2.0");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(final TestDriver driver) {
        driver.getReport().addHeader("\"Occupancy graphic 2.0\" TEST START:", 2, true);
        if(!searchBooking(driver)){return false;}
        if(!navigateToBOOSA0005(driver)){return false;}
        if(!monthlyData(driver)){return false;}
        return true;
    }

    private boolean searchBooking(final TestDriver driver) {
        if(!(Functions.checkClick(driver,
                new String[]{"boosa1002_search_b_icon", getElements("boosa1002_search_b_icon")},
                new String[]{"glass", recursiveXPaths.glass},
                " on \"AT2BOOSA1002\" BOOKING SEARCH"))) {return false;}
        if(!(Functions.insertInput(driver,
                new String[]{"boosa1002_search_i_booking", getElements("boosa1002_search_i_booking")},
                "booking_search",
                getData("booking_number"),
                " on \"AT2BOOSA1002\" BOOKING SEARCH"))) {return false;}
        if(!(Functions.clickSearchAndResult(driver,
                new String[]{"boosa1002_search_b_search", getElements("boosa1002_search_b_search")},
                new String[]{"boosa1002_search_e_result", getElements("boosa1002_search_e_result")},
                " on \"AT2BOOSA1002\" BOOKING SEARCH"))) {return false;}
        return true;
    }

    private boolean navigateToBOOSA0005(final TestDriver driver) {
        if(!(Functions.checkClick(driver,
                new String[]{"boosa1002_search_result_b_actions", getElements("boosa1002_search_result_b_actions")},
                new String[]{"boosa1002_search_result_actions_b_graphic", getElements("boosa1002_search_result_actions_b_graphic")},
                " on \"AT2BOOSA1002\" BOOKING SEARCH"))) {return false;}
        if(!(Functions.checkClickByAbsence(driver,
                new String[]{"boosa1002_search_result_actions_b_graphic", getElements("boosa1002_search_result_actions_b_graphic")},
                new String[]{"boosa1002_search_result_actions_b_graphic", getElements("boosa1002_search_result_actions_b_graphic")},
                " on \"AT2BOOSA1002\" BOOKING SEARCH"))) {return false;}
        return true;
    }

    private boolean monthlyData(final TestDriver driver) {
        if(!(Functions.simpleClick(driver,
                new String[]{"boosa0005_search_b_monthly", getElements("boosa0005_search_b_monthly")},
                " on \"AT2BOOSA0005\" CONSULT"))) {return false;}
        if(!(Functions.screenshot(driver))) {return false;}
        return true;
    }

    private boolean detailsTest(final TestDriver driver) {
        if(!(Functions.checkClick(driver,
                new String[]{"boosa0005_search_b_detail", getElements("boosa0005_search_b_detail")},
                new String[]{"glass", recursiveXPaths.glass},
                " on \"AT2BOOSA0005\" DETAILS"))) {return false;}

        if (driver.getDriver().findElements(By.xpath(getElements("boosa0005_detail_of_units_e_result"))).size() > 0 &&
                driver.getDriver().findElement(By.xpath(getElements("boosa0005_detail_of_units_e_result"))).isDisplayed()) {
            //getData from result
            //query
        } else {
            if (!(Functions.screenshot(driver))) {
                return false;
            }
        }

        if(!(Functions.checkClickByAbsence(driver,
                new String[]{"boosa0005_detail_b_close", getElements("boosa0005_detail_b_close")},
                new String[]{"glass", recursiveXPaths.glass},
                " on \"AT2BOOSA1002\" BOOKING SEARCH"))) {return false;}
        return true;
    }
}
