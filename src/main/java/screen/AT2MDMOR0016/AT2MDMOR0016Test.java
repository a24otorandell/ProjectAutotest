package screen.AT2MDMOR0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMOR0016Test {
    protected AT2MDMOR0016Locators locators;
    protected AT2MDMOR0016Data data;
    public AT2MDMOR0016Test() {
    }
    public AT2MDMOR0016Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0016Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0016Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0016Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Transfer pricing CANCO");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_transfers(driver)) return false;
        if (!search_transfers(driver)) return false;
        if (!interaction_edit_transfers(driver)) return false;
        if (!qbe_transfers(driver)) return false;
        if (!others_actions_transfers(driver)) return false;
        if (!delete_transfers(driver)) return false;
        return true;
    }

    private boolean interaction_record_transfers(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkClick(driver,
                new String[]{"transfers_b_add", getElements("transfers_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date",getElements("add_i_date")},
                "date", DataGenerator.getToday(), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_b_company",getElements("add_lov_b_company")}, // b_lov
                new String[]{"add_i_b_company", getElements("add_i_b_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_b_office",getElements("add_lov_b_office")}, // b_lov
                new String[]{"add_i_b_office", getElements("add_i_b_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_location",getElements("add_lov_location")}, // b_lov
                new String[]{"add_i_location", getElements("add_i_location")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "location", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_b_desc", getElements("add_i_b_desc")}, // element path
                "des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_contracting",getElements("add_lov_contracting")}, // b_lov
                new String[]{"add_i_contracting", getElements("add_i_contracting")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "contracting", //Data name
                where)){return false;}

        if (!Functions.selectText(driver,
                new String[]{"add_sl_service", getElements("add_sl_service")},
                "Extras", "service", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_allotment", getElements("add_sl_allotment")},
                "All", "allotment", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_p_contracting",getElements("add_i_p_contracting")},
                "p_contracting",String.valueOf(DataGenerator.randomFloat(1,2)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_p_billing",getElements("add_p_billing")},
                "p_billing",String.valueOf(DataGenerator.randomFloat(1,2)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_p_allotment",getElements("add_p_allotment")},
                "p_allotment",String.valueOf(DataGenerator.randomFloat(1,2)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_extra",getElements("add_lov_extra")}, // b_lov
                new String[]{"add_i_extra", getElements("add_i_extra")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_transfers(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_date",getElements("search_i_date")},
                "date", getData("date"), where)){return false;}
        Functions.break_time(driver, 10, 800);
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_b_company", getElements("search_lov_b_company")}, //LoV button
                new String[]{"search_i_b_company", getElements("search_i_b_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_b_office", getElements("search_lov_b_office")}, //LoV button
                new String[]{"search_i_b_office", getElements("search_i_b_office")}, //external LoV input
                new String[]{"search_lov_office_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("office"), // value to search
                "office", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_contracting", getElements("search_lov_contracting")}, //LoV button
                new String[]{"search_i_contracting", getElements("search_i_contracting")}, //external LoV input
                new String[]{"search_lov_contracting_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("contracting"), // value to search
                "contracting", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_location", getElements("search_lov_location")}, //LoV button
                new String[]{"search_i_location", getElements("search_i_location")}, //external LoV input
                new String[]{"search_lov_location_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("location"), // value to search
                "location", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_service", getElements("search_sl_service")},
                getData("service"), "service", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_allotment", getElements("search_sl_allotment")},
                getData("allotment"), "allotment", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_p_contracting",getElements("search_i_p_contracting")},
                "p_contracting", getData("p_contracting"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_p_billing",getElements("search_i_p_billing")},
                "p_billing", getData("p_billing"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_p_allotment",getElements("search_i_p_allotment")},
                "p_allotment", getData("p_allotment"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_extra", getElements("search_lov_extra")}, //LoV button
                new String[]{"search_i_extra", getElements("search_i_extra")}, //external LoV input
                new String[]{"search_lov_location_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("extra"), // value to search
                "extra", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"transfers_e_result", getElements("transfers_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_transfers(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"transfers_b_edit", getElements("transfers_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_date",getElements("add_i_date")},
                "date", DataGenerator.getToday(), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_b_company",getElements("add_lov_b_company")}, // b_lov
                new String[]{"add_i_b_company", getElements("add_i_b_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_b_office",getElements("add_lov_b_office")}, // b_lov
                new String[]{"add_i_b_office", getElements("add_i_b_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_location",getElements("add_lov_location")}, // b_lov
                new String[]{"add_i_location", getElements("add_i_location")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "location", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_b_desc", getElements("add_i_b_desc")}, // element path
                "des", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_contracting",getElements("add_lov_contracting")}, // b_lov
                new String[]{"add_i_contracting", getElements("add_i_contracting")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "contracting", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_extra",getElements("add_i_extra")},
                "extra","", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_service", getElements("add_sl_service")},
                "Hotel", "service", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"add_sl_allotment", getElements("add_sl_allotment")},
                "All", "allotment", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_p_contracting",getElements("add_i_p_contracting")},
                "p_contracting",String.valueOf(DataGenerator.randomFloat(1,2)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_p_billing",getElements("add_p_billing")},
                "p_billing",String.valueOf(DataGenerator.randomFloat(1,2)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_p_allotment",getElements("add_p_allotment")},
                "p_allotment",String.valueOf(DataGenerator.randomFloat(1,2)), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_transfers(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"transfers_e_result", getElements("transfers_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"transfers_b_qbe", getElements("transfers_b_qbe")},// query button
                new String[]{"qbe_i_b_company", getElements("qbe_i_b_company")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_date", getElements("qbe_i_date")},
                "date", getData("date"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b_company", getElements("qbe_i_b_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b_office", getElements("qbe_i_b_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_location", getElements("qbe_i_location")},
                "location", getData("location"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_b_des", getElements("qbe_i_b_des")},
                "des", getData("des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_contracting", getElements("qbe_i_contracting")},
                "contracting", getData("contracting"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_service", getElements("qbe_sl_service")},
                getData("service"), "service", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_allotment", getElements("qbe_sl_allotment")},
                getData("allotment"), "allotment", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_p_contracting", getElements("qbe_i_p_contracting")},
                "p_contracting", getData("p_contracting"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_p_billing", getElements("qbe_i_p_billing")},
                "p_billing", getData("p_billing"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_p_allotment", getElements("qbe_i_p_allotment")},
                "p_allotment", getData("p_allotment"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_p_extra", getElements("qbe_i_p_extra")},
                "extra", getData("extra"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_b_company", getElements("qbe_i_b_company")}, //any query input
                new String[]{"transfers_e_result", getElements("transfers_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_transfers(TestDriver driver) {
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        String where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"transfers_b_detach", getElements("transfers_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_transfers(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"transfers_b_delete", getElements("transfers_b_delete")},
                new String[]{"transfers_e_records", getElements("transfers_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
