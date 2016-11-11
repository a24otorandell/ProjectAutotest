package screen.AT2MDMCL0019;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0019Test {
    protected AT2MDMCL0019Locators locators;
    protected AT2MDMCL0019Data data;

    public AT2MDMCL0019Test() {
    }
    public AT2MDMCL0019Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0019Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0019Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0019Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Agencies");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_MDM(driver)) return false;
        if (!search_MDM(driver)) return false;
        if (!interaction_edit_MDM(driver)) return false;
        if (!qbe_MDM(driver)) return false;
        if (!others_actions_MDM(driver)) return false;
        if (!delete_MDM(driver)) return false;
        return false;
    }

    private boolean interaction_record_MDM(TestDriver driver) {
        driver.getReport().addHeader("CREATION RECORD", 3, false);
        String where = " on CREATION";
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_add", getElements("MDM_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency_name", getElements("add_i_agency_name")}, // element path
                "agency_name", getData("agency_name"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_agency_code", getElements("add_e_agency_code")}, // element path
                "agency_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_major", getElements("add_i_major")}, // element path
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sub_major", getElements("add_i_sub_major")}, // element path
                "sub_major", getData("sub_major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_detail", getElements("add_i_detail")}, // element path
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_branch_TO", getElements("add_i_branch_TO")}, // element path
                "branch_TO", getData("branch_TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source_market", getElements("add_i_source_market")}, // element path
                "source_market", getData("source_market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fiscal_number", getElements("add_i_fiscal_number")}, // element path
                "fiscal_number", getData("fiscal_number"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_code", getElements("add_lov_atlas_code")}, // b_lov
                new String[]{"add_i_atlas_code", getElements("add_i_atlas_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_atlas_description", getElements("add_e_atlas_description")}, // element path
                "atlas_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_branch", getElements("add_i_atlas_branch")}, // element path
                "atlas_branch", getData("atlas_branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credit", getElements("add_i_credit")}, // element path
                "credit", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")}, // element path
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_interface_description", getElements("add_e_interface_description")}, // element path
                "interface_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.createLov(driver,
                new String[]{"add_lov_id_web", getElements("add_lov_id_web")}, // b_lov
                new String[]{"add_i_id_web", getElements("add_i_id_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "id_web", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_id_web_description", getElements("add_e_id_web_description")}, // element path
                "id_web_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_street", getElements("add_i_street")}, // element path
                "street", getData("street"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_country", getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_country_name", getElements("add_e_country_name")}, // element path
                "country_name", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_city", getElements("add_i_city")}, // element path
                "city", getData("city"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_postcode", getElements("add_i_postcode")}, // element path
                "postcode", getData("postcode"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_telephone", getElements("add_i_telephone")}, // element path
                "telephone", getData("telephone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fax", getElements("add_i_fax")}, // element path
                "fax", getData("fax"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_surname", getElements("add_i_surname")}, // element path
                "surname", getData("surname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_email", getElements("add_i_email")}, // element path
                "email", getData("email"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_MDM(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        Functions.break_time(driver, 30, 500);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_agency_name", getElements("search_i_agency_name")}, // element path
                "agency_name", getData("agency_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_agency_code", getElements("search_i_agency_code")}, // element path
                "agency_code", getData("agency_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_major", getElements("search_i_major")}, // element path
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_sub_major", getElements("search_i_sub_major")}, // element path
                "sub_major", getData("sub_major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_detail", getElements("search_i_detail")}, // element path
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_branch_TO", getElements("search_i_branch_TO")}, // element path
                "branch_TO", getData("branch_TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_source_market", getElements("search_i_source_market")}, // element path
                "source_market", getData("source_market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_fiscal_number", getElements("search_i_fiscal_number")}, // element path
                "fiscal_number", getData("fiscal_number"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_atlas_code", getElements("search_lov_atlas_code")}, //LoV button
                new String[]{"search_i_atlas_code", getElements("search_i_atlas_code")}, //external LoV input
                new String[]{"search_lov_atlas_code_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("atlas_code"), // value to search
                "atlas_code", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_description", getElements("search_i_atlas_description")}, // element path
                "atlas_description", "%" + getData("atlas_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_atlas_branch", getElements("search_i_atlas_branch")}, // element path
                "atlas_branch", getData("atlas_branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_credit", getElements("search_i_credit")}, // element path
                "credit", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_type", getElements("search_i_type")}, // element path
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("interface"), // value to search
                "interface", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_interface_description", getElements("search_i_interface_description")}, // element path
                "interface_description", getData("interface_description"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_id_web", getElements("search_lov_id_web")}, //LoV button
                new String[]{"search_i_id_web", getElements("search_i_id_web")}, //external LoV input
                new String[]{"search_lov_id_web_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("id_web"), // value to search
                "id_web", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_id_web_description", getElements("search_i_id_web_description")}, // element path
                "id_web_description", getData("id_web_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_street", getElements("search_i_street")}, // element path
                "street", getData("street"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_country", getElements("search_lov_country")}, //LoV button
                new String[]{"search_i_country", getElements("search_i_country")}, //external LoV input
                new String[]{"search_lov_country_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("country"), // value to search
                "country", //name of the data
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_country_name", getElements("search_i_country_name")}, // element path
                "country_name", getData("country_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_city", getElements("search_i_city")}, // element path
                "city", getData("city"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_postcode", getElements("search_i_postcode")}, // element path
                "postcode", getData("postcode"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_telephone", getElements("search_i_telephone")}, // element path
                "telephone", getData("telephone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_fax", getElements("search_i_fax")}, // element path
                "fax", getData("fax"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_name", getElements("search_i_name")}, // element path
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_surname", getElements("search_i_surname")}, // element path
                "surname", getData("surname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_email", getElements("search_i_email")}, // element path
                "email", getData("email"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                " on SEARCH")) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_MDM(TestDriver driver) {
        driver.getReport().addHeader("EDITION RECORD", 3, false);
        String where = " on EDITION";
        if (!Functions.checkClick(driver,
                new String[]{"MDM_b_edit", getElements("MDM_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_agency_name", getElements("add_i_agency_name")}, // element path
                "agency_name", getData("agency_name_edit"), where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_agency_code", getElements("add_e_agency_code")}, // element path
                "agency_code", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_major", getElements("add_i_major")}, // element path
                "major", getData("major_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sub_major", getElements("add_i_sub_major")}, // element path
                "sub_major", getData("sub_major_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_detail", getElements("add_i_detail")}, // element path
                "detail", getData("detail_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_branch_TO", getElements("add_i_branch_TO")}, // element path
                "branch_TO", getData("branch_TO_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_source_market", getElements("add_i_source_market")}, // element path
                "source_market", getData("source_market_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fiscal_number", getElements("add_i_fiscal_number")}, // element path
                "fiscal_number", getData("fiscal_number_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_atlas_code", getElements("add_lov_atlas_code")}, // b_lov
                new String[]{"add_i_atlas_code", getElements("add_i_atlas_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "atlas_code", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_atlas_description", getElements("add_e_atlas_description")}, // element path
                "atlas_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_atlas_branch", getElements("add_i_atlas_branch")}, // element path
                "atlas_branch", getData("atlas_branch_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_credit", getElements("add_i_credit")}, // element path
                "credit", getData("credit_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_type", getElements("add_i_type")}, // element path
                "type", getData("type_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_interface", getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_interface_description", getElements("add_e_interface_description")}, // element path
                "interface_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.createLov(driver,
                new String[]{"add_lov_id_web", getElements("add_lov_id_web")}, // b_lov
                new String[]{"add_i_id_web", getElements("add_i_id_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "id_web", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_id_web_description", getElements("add_e_id_web_description")}, // element path
                "id_web_description", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_street", getElements("add_i_street")}, // element path
                "street", getData("street_edit"), where)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"add_lov_country", getElements("add_lov_country")}, // b_lov
                new String[]{"add_i_country", getElements("add_i_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)) {
            return false;
        }
        if (!Functions.getText(driver, new String[]{"add_e_country_name", getElements("add_e_country_name")}, // element path
                "country_name", // key for data value (the name)
                where)) {
            return false;
        } // where this operation occurs
        if (!Functions.insertInput(driver, new String[]{"add_i_city", getElements("add_i_city")}, // element path
                "city", getData("city_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_postcode", getElements("add_i_postcode")}, // element path
                "postcode", getData("postcode_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_telephone", getElements("add_i_telephone")}, // element path
                "telephone", getData("telephone_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_fax", getElements("add_i_fax")}, // element path
                "fax", getData("fax_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_name", getElements("add_i_name")}, // element path
                "name", getData("name_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_surname", getElements("add_i_surname")}, // element path
                "surname", getData("surname_edit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_email", getElements("add_i_email")}, // element path
                "email", getData("email_edit"), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_MDM(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        Functions.zoomOut(driver, 3);
        if (!Functions.clickQbE(driver,
                new String[]{"MDM_b_qbe", getElements("MDM_b_qbe")},// query button
                new String[]{"qbe_i_agency_name", getElements("qbe_i_agency_name")},//any query input
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency_name", getElements("qbe_i_agency_name")},
                "agency_name", getData("agency_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency_code", getElements("qbe_i_agency_code")},
                "agency_code", getData("agency_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_major", getElements("qbe_i_major")},
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_sub_major", getElements("qbe_i_sub_major")},
                "sub_major", getData("sub_major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_detail", getElements("qbe_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch_TO", getElements("qbe_i_branch_TO")},
                "branch_TO", getData("branch_TO"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_source_market", getElements("qbe_i_source_market")},
                "source_market", getData("source_market"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_fiscal_number", getElements("qbe_i_fiscal_number")},
                "fiscal_number", getData("fiscal_number"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_code", getElements("qbe_i_atlas_code")},
                "atlas_code", getData("atlas_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_description", getElements("qbe_i_atlas_description")},
                "atlas_description", "%" + getData("atlas_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_atlas_branch", getElements("qbe_i_atlas_branch")},
                "atlas_branch", getData("atlas_branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_credit", getElements("qbe_i_credit")},
                "credit", getData("credit"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_type", getElements("qbe_i_type")},
                "type", getData("type"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface_description", getElements("qbe_i_interface_description")},
                "interface_description", getData("interface_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_id_web", getElements("qbe_i_id_web")},
                "id_web", getData("id_web"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_id_web_description", getElements("qbe_i_id_web_description")},
                "id_web_description", getData("id_web_description"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_street", getElements("qbe_i_street")},
                "street", getData("street"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country", getElements("qbe_i_country")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_name", getElements("qbe_i_country_name")},
                "country_name", getData("country_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_city", getElements("qbe_i_city")},
                "city", getData("city"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_postcode", getElements("qbe_i_postcode")},
                "postcode", getData("postcode"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_telephone", getElements("qbe_i_telephone")},
                "telephone", getData("telephone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_fax", getElements("qbe_i_fax")},
                "fax", getData("fax"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_surname", getElements("qbe_i_surname")},
                "surname", getData("surname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_email", getElements("qbe_i_email")},
                "email", getData("email"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_agency_name", getElements("qbe_i_agency_name")}, //search button
                new String[]{"MDM_e_result", getElements("MDM_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean others_actions_MDM(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS - AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"MDM_b_actions", getElements("MDM_b_actions")}, //actions button
                new String[]{"MDM_b_actions_audit_data", getElements("MDM_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER ACTIONS - DETACH", 3, false);
        where = " on DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"MDM_b_detach", getElements("MDM_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_MDM(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"MDM_b_delete", getElements("MDM_b_delete")},
                new String[]{"MDM_e_records", getElements("MDM_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
