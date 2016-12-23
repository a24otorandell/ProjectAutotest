package screen.AT2MDMRM0052;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 23/12/2016.
 */

/**
 * FALTA PROBAR
 * PONER LA DIRECCIÓN CORRESPONDIENTE A LOS MÉTODOS DE LOS BOTONES: botonDest y botonTo
 */
public class AT2MDMRM0052Sis {
    protected AT2MDMRM0052Locators locators;
    protected AT2MDMRM0052Data data;
    public AT2MDMRM0052Sis() {
    }
    public AT2MDMRM0052Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0052Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0052Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0052Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Query Promotions");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!searchEnquiry(driver)) return false;
        if (!getDataDest(driver)) return false;
        if (!getDataTo(driver)) return false;
        if (!qbeDest(driver)) return false;
        if (!others_actionsDest(driver)) return false;
        if (!search(driver)) return false;
        if (!qbeTo(driver)) return false;
        if (!others_actionsTo(driver)) return false;
        if (!botonDest(driver)) return false;
        if (!botonTo(driver)) return false;
        return true;
    }

    /**
     * SEARCH ENQUIRY
     * @param driver
     * @return
     */
    public boolean searchEnquiry (TestDriver driver) {
        driver.getReport().addHeader("ENQUIRY", 3, false);
        String where = " on SEARCH ENQUIRY";
        if (!Functions.createLovByValue(driver,
                new String[]{"enquiry_lov_campaign", getElements("enquiry_lov_campaign")}, //LoV button
                new String[]{"enquiry_i_campaign", getElements("enquiry_i_campaign")}, //external LoV input
                new String[]{"enquiry_lov_campaign_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "369", // value to search
                "campaing", //name of the data
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"enquiry_lov_group",getElements("enquiry_lov_group")}, // b_lov
                new String[]{"enquiry_i_group", getElements("enquiry_i_group")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "group", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"enquiry_lov_interface",getElements("enquiry_lov_interface")}, // b_lov
                new String[]{"enquiry_i_interface", getElements("enquiry_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"enquiry_b_search", getElements("enquiry_b_search")}, //element to click
                new String[]{"top_to_e_result", getElements("top_to_e_result")}, //element expected to appear
                50, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        return true;
    }

    /**
     * TABLE TOP OFFERS BY DESTINATION
     * @param driver
     * @return
     */
    public boolean getDataDest (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " on GET DATA DESTINATIONS";
        Functions.zoomOut(driver);
        Functions.break_time(driver, 3, 500);
        String[] columns = {"top1","destination1","desc1", "assigned1", "cancelled", "assessed1", "offers", "topto1", "total1"};
        if (!Functions.collectTableData(driver,columns,"//*[contains(@id, 'pc2:t1::db')]",1,where))return false;
        return true;
    }
    private boolean qbeDest(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DESTINATION";
        if (!Functions.clickQbE(driver,
                new String[]{"top_dest_b_qbe", getElements("top_dest_b_qbe")},// query button
                new String[]{"qbe_i_top_dest", getElements("qbe_i_top_dest")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_top_dest", getElements("qbe_i_top_dest")},
                "top1", getData("top1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_dest",getElements("qbe_i_destination_dest")},
                "destination1", getData("destination1"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest_desc_dest", getElements("qbe_i_dest_desc_dest")},
                "desc1", getData("desc1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_assigned_desc", getElements("qbe_i_assigned_desc")},
                "assigned1", getData("assigned1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cancelled",getElements("qbe_i_cancelled")},
                "cancelled", getData("cancelled"), where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"qbe_i_assessed_desc", getElements("qbe_i_assessed_desc")},
                "assessed1", getData("assessed1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_offers", getElements("qbe_i_offers")},
                "offers", getData("offers"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_top_desc",getElements("qbe_i_top_desc")},
                "topto1", getData("topto1"), where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"qbe_i_total_desc", getElements("qbe_i_total_desc")},
                "total1", getData("total1"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_top_dest", getElements("qbe_i_top_dest")}, //any query input
                new String[]{"top_dest_e_result", getElements("top_dest_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actionsDest(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"top_dest_b_detach", getElements("top_dest_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE OFFERS BY TO
     * @param driver
     * @return
     */
    public boolean getDataTo (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " on GET DATA DESTINATIONS";
        Functions.break_time(driver, 3, 500);
        String[] columns = {"topto2","total2","destination2","desc2", "assigned2", "assessed2" };
        if (!Functions.collectTableData(driver,columns,"//*[contains(@id, 'pc1:resId1::db')]",1,where))return false;
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_top_to", getElements("search_i_top_to")},
                "topto2", getData("topto2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_total_to", getElements("search_i_total_to")},
                "total2", getData("total2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_destination_to",getElements("search_i_destination_to")},
                "destination2", getData("destination2"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_assigned_to", getElements("search_i_assigned_to")},
                "assigned2", getData("assigned2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_assessed_to", getElements("search_i_assessed_to")},
                "assessed2", getData("assessed2"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"top_to_e_result", getElements("top_to_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbeTo(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE DESTINATION";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"top_to_e_result", getElements("top_to_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"top_to_b_qbe", getElements("top_to_b_qbe")},// query button
                new String[]{"qbe_i_top_to", getElements("qbe_i_top_to")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_top_to", getElements("qbe_i_top_to")},
                "topto2", getData("topto2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_total_to", getElements("qbe_i_total_to")},
                "total2", getData("total2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_to",getElements("qbe_i_destination_to")},
                "destination2", getData("destination2"), where)){
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dest_desc_to", getElements("qbe_i_dest_desc_to")},
                "desc2", getData("desc2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_assigned_to", getElements("qbe_i_assigned_to")},
                "assigned2", getData("assigned2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_assessed_to", getElements("qbe_i_assessed_to")},
                "assessed2", getData("assessed2"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_top_dest", getElements("qbe_i_top_dest")}, //any query input
                new String[]{"top_to_e_result", getElements("top_to_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actionsTo(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"top_to_b_detach", getElements("top_to_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * BOTONES
     */
    public boolean botonDest (TestDriver driver)  {
        driver.getReport().addHeader("BOTON DESTINATION", 3, false);
        String where = " on BOTON";
        String windowsadf = driver.getDriver().getCurrentUrl();
        if (!Functions.simpleClick(driver,
                new String[]{"destination_b_dest", getElements("destination_b_dest")}, //element to click
                where)){return false;}
        Functions.break_time(driver, 3, 500);
        driver.getDriver().get("");
        Functions.screenshot(driver);
        driver.getDriver().navigate().to(windowsadf);
        return true;
    }
    public boolean botonTo (TestDriver driver)  {
        driver.getReport().addHeader("BOTON TO", 3, false);
        String where = " on BOTON";
        String windowsadf = driver.getDriver().getCurrentUrl();
        if (!Functions.simpleClick(driver,
                new String[]{"to_b_to", getElements("to_b_to")}, //element to click
                where)){return false;}
        Functions.break_time(driver, 3, 500);
        driver.getDriver().get("");
        Functions.screenshot(driver);
        driver.getDriver().navigate().to(windowsadf);
        return true;
    }
}
