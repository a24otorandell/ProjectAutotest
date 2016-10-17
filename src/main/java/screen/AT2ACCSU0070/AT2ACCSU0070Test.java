package screen.AT2ACCSU0070;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * @author ajvirgili on 19/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCSU0070Test {

    protected AT2ACCSU0070Locators locators;
    protected AT2ACCSU0070Data data;

    public AT2ACCSU0070Test(String enviroment) {
        setData(new AT2ACCSU0070Data(enviroment));
        setLocators(new AT2ACCSU0070Locators(enviroment));
    }

    public AT2ACCSU0070Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0070Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0070Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0070Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!searchFull(driver)) {
            return false;
        }
        if (!checkRecord(driver)) {
            return false;
        }
        if (!cleanSearch(driver)) {
            return false;
        }


        return false;
    }

    protected boolean searchFull(TestDriver driver) {
        driver.getReport().addHeader("Complete search (using all fields)", 3, true);
        if (!searchHotel(driver)) {
            return false;
        }
        if (!searchBrand(driver)) {
            return false;
        }
        if (!searchCadena(driver)) {
            return false;
        }
        if (!searchExternal(driver)) {
            return false;
        }
        return true;
    }

    protected boolean searchHotel(TestDriver driver) {
        String on = " On: Search by Hotel";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")},
                "hotel_code", "472",
                "hotel_desc", "VINCCI BOSC DE MAR",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchBrand(TestDriver driver) {
        String on = " On: Search by Brand";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_brand", getElements("search_lov_brand")},
                "brand_code", "INDEPEND",
                "brand_desc", "INDEPEND",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchCadena(TestDriver driver) {
        String on = " On: Search by Cadena Hotel";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_cadena_hotel", getElements("search_lov_cadena_hotel")},
                "chain_code", "VINCC",
                "chain_desc", "VINCCI HOTELES",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchExternal(TestDriver driver) {
        String on = " On: Search by Exernal Hotel";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_external_hotel", getElements("search_lov_external_hotel")},
                "ex_hotel_code", "472",
                "ex_hotel_desc", "Vincci Bosc de Mar",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean cleanSearch(TestDriver driver) {
        String on = " On: Clean search block";
        String noVal = "No selected values";
        String[] inputs = {"hotel", "brand", "cadena_hotel", "external_hotel"};

        for (String button : inputs) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_delete_" + button, getElements("search_b_delete_" + button)},
                    new String[]{"logout_button", recursiveXPaths.logout},
                    on)) {
                return false;
            }
        }
        for (String input : inputs) {
            if (!Functions.getText(driver,
                    new String[]{"search_e_" + input + "_selected", getElements("search_e_" + input + "_selected")},
                    input + "_values",
                    on)) {
                return false;
            }
        }
        if (getData("hotel_values").equalsIgnoreCase(noVal)
                && getData("brand_values").equalsIgnoreCase(noVal)
                && getData("brand_values").equalsIgnoreCase(noVal)
                && getData("brand_values").equalsIgnoreCase(noVal)) {
            driver.getReport().addContent("Search block cleaned", "h5", "");
            System.out.println("Search block cleaned");
        }
        return true;
    }

    protected boolean checkRecord(TestDriver driver) {
        String on = " On: Check record";
        if (!Functions.checkClick(driver,
                new String[]{"hotel_desc_e_plus_first", getElements("hotel_desc_e_plus_first")},
                new String[]{"hotel_desc_e_atlas_hotel_code", getElements("hotel_desc_e_atlas_hotel_code")},
                on)) {
            return false;
        }

        return true;
    }

}
