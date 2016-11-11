package screen.AT2MDMCL0043;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 04/11/2016.
 */
public class AT2MDMCL0043Sis {
    protected AT2MDMCL0043Locators locators;
    protected AT2MDMCL0043Data data;
    public AT2MDMCL0043Sis() {
    }
    public AT2MDMCL0043Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0043Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0043Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0043Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Set up grace period");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add_inclusions(driver)) return false;
        if (!search_inclusions(driver)) return false;
        if (!interaction_edit_inclusions(driver)) return false;
        if (!qbe_inclusions(driver)) return false;
        if (!others_actions_inclusions(driver)) return false;
        if (!delete_inclusions(driver)) return false;
        if (!interaction_add_exclusions(driver)) return false;
        if (!search_exclusions(driver)) return false;
        if (!interaction_edit_exclusions(driver)) return false;
        if (!qbe_exclusions(driver)) return false;
        if (!others_actions_exclusions(driver)) return false;
        if (!delete_exclusions(driver)) return false;
        return true;
    }

    /**
     * TABLE INCLUSIONS
     * @param driver
     * @return
     */
    public boolean interaction_add_inclusions (TestDriver driver) {
        driver.getReport().addHeader("CREATTION AGENCY", 3, false);
        String where = " ADD INCLUSIONS";
        if (!Functions.checkClick(driver,
                new String[]{"inclusions_b_add", getElements("inclusions_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"i_add_sl_service",getElements("i_add_sl_service")},
                "Extras", "service_i", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"i_add_i_aplicc", getElements("i_add_i_aplicc")},
                "apli_i", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_add_i_desactivate", getElements("i_add_i_desactivate")},
                "desc_i", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_add_i_advanced", getElements("i_add_i_advanced")},
                "adva_i", String.valueOf(DataGenerator.random(1,400)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_add_i_grace", getElements("i_add_i_grace")},
                "grace_i", String.valueOf(DataGenerator.random(1,5)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_to",getElements("i_add_lov_to")}, // b_lov
                new String[]{"i_add_i_to", getElements("i_add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_i", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_agency", getElements("i_add_lov_agency")},
                new String[]{"i_add_i_agency",getElements("i_add_i_agency")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency_i", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_idweb", getElements("i_add_lov_idweb")},
                new String[]{"i_add_i_idweb",getElements("i_add_i_idweb")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_i", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_interface",getElements("i_add_lov_interface")}, // b_lov
                new String[]{"i_add_i_interface", getElements("i_add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface_i", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"i_add_b_save", getElements("i_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_inclusions(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH INCLUSIONS";
        if (!Functions.selectText(driver,
                new String[]{"i_search_sl_service",getElements("i_search_sl_service")},
                getData("service_i"), "service_i", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"i_search_i_applic", getElements("i_search_i_applic")},
                "apli_i", getData("apli_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_search_i_desactivate", getElements("i_search_i_desactivate")},
                "desc_i", getData("desc_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_search_i_advance", getElements("i_search_i_advance")},
                "adva_i", getData("adva_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_search_i_grace", getElements("i_search_i_grace")},
                "grace_i", getData("grace_i"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"i_search_lov_to", getElements("i_search_lov_to")}, //LoV button
                new String[]{"i_search_i_to", getElements("i_search_i_to")}, //external LoV input
                new String[]{"search_lov_to_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("to_i"), // value to search
                "to_i", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"i_search_lov_agency", getElements("i_search_lov_agency")}, //LoV button
                new String[]{"i_search_i_agency", getElements("i_search_i_agency")}, //external LoV input
                new String[]{"search_lov_agency_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("agency_i"), // value to search
                "agency_i", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"i_search_lov_idweb", getElements("i_search_lov_idweb")}, //LoV button
                new String[]{"i_search_i_idweb", getElements("i_search_i_idweb")}, //external LoV input
                new String[]{"search_lov_web_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("web_i"), // value to search
                "web_i", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"i_search_lov_interface", getElements("i_search_lov_interface")}, //LoV button
                new String[]{"i_search_i_interface", getElements("i_search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface_i"), // value to search
                "interface_i", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"i_search_b_search", getElements("i_search_b_search")}, //search button
                new String[]{"inclusions_e_result", getElements("inclusions_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_inclusions(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION AGENCY";
        if (!Functions.checkClick(driver,
                new String[]{"inclusions_b_edit", getElements("inclusions_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"i_add_sl_service",getElements("i_add_sl_service")},
                "Hotel", "service_i", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"i_add_i_aplicc", getElements("i_add_i_aplicc")},
                "apli_i", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_add_i_desactivate", getElements("i_add_i_desactivate")},
                "desc_i", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_add_i_advanced", getElements("i_add_i_advanced")},
                "adva_i", String.valueOf(DataGenerator.random(1,400)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_add_i_grace", getElements("i_add_i_grace")},
                "grace_i", String.valueOf(DataGenerator.random(1,5)), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_to",getElements("i_add_lov_to")}, // b_lov
                new String[]{"i_add_i_to", getElements("i_add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_i", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_agency", getElements("i_add_lov_agency")},
                new String[]{"i_add_i_agency",getElements("i_add_i_agency")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency_i", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_idweb", getElements("i_add_lov_idweb")},
                new String[]{"i_add_i_idweb",getElements("i_add_i_idweb")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_i", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"i_add_lov_interface",getElements("i_add_lov_interface")}, // b_lov
                new String[]{"i_add_i_interface", getElements("i_add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface_i", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"i_add_b_save", getElements("i_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_inclusions(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE INCLUSIONS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"i_search_b_reset", getElements("i_search_b_reset")}, //search button
                new String[]{"inclusions_e_result", getElements("inclusions_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"inclusions_b_qbe", getElements("inclusions_b_qbe")},// query button
                new String[]{"i_qbe_i_aplicc", getElements("i_qbe_i_aplicc")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.selectText(driver,
                new String[]{"i_qbe_sl_service",getElements("i_qbe_sl_service")},
                getData("service_i"), "service_i", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_aplicc", getElements("i_qbe_i_aplicc")},
                "apli_i", getData("apli_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_desactivate", getElements("i_qbe_i_desactivate")},
                "desc_i", getData("desc_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_advanced", getElements("i_qbe_i_advanced")},
                "adva_i", getData("adva_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_grace", getElements("i_qbe_i_grace")},
                "grace_i", getData("grace_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_to", getElements("i_qbe_i_to")},
                "to_i", getData("to_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_agency", getElements("i_qbe_i_agency")},
                "agency_i", getData("agency_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_idweb", getElements("i_qbe_i_idweb")},
                "web_i", getData("web_i"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"i_qbe_i_interface", getElements("i_qbe_i_interface")},
                "interface_i", getData("interface_i"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"i_search_i_applic", getElements("i_search_i_applic")}, //any query input
                new String[]{"inclusions_e_result", getElements("inclusions_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_inclusions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA INCLUSIONS";
        if (!Functions.auditData(driver,
                new String[]{"inclusions_b_actions", getElements("inclusions_b_actions")}, //actions button
                new String[]{"inclusions_b_actions_audit_data", getElements("inclusions_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH INCLUSIONS";
        if (!Functions.detachTable(driver,
                new String[]{"inclusions_b_detach", getElements("inclusions_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_inclusions(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA INCLUSIONS";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"inclusions_b_delete", getElements("inclusions_b_delete")},
                new String[]{"inclusions_e_records", getElements("inclusions_e_records")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * TABLE EXCLUSUIONS
     * @param driver
     * @return
     */
    public boolean interaction_add_exclusions (TestDriver driver) {
        driver.getReport().addHeader("CREATTION AGENCY", 3, false);
        String where = " ADD EXCLUSIONS";
        if (!Functions.checkClick(driver,
                new String[]{"exclusions_b_add", getElements("exclusions_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"e_add_sl_service",getElements("e_add_sl_service")},
                "Charges", "service_e", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"e_add_i_aplicc", getElements("e_add_i_aplicc")},
                "apli_e", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_add_i_desactivate", getElements("e_add_i_desactivate")},
                "desc_e", DataGenerator.getToday(), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_to",getElements("e_add_lov_to")}, // b_lov
                new String[]{"e_add_i_to", getElements("e_add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_e", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_agency", getElements("e_add_lov_agency")},
                new String[]{"e_add_i_agency",getElements("e_add_i_agency")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency_e", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_idweb", getElements("e_add_lov_idweb")},
                new String[]{"e_add_i_idweb",getElements("e_add_i_idweb")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_e", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_interface",getElements("e_add_lov_interface")}, // b_lov
                new String[]{"e_add_i_interface", getElements("e_add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface_e", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"e_add_b_save", getElements("e_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_exclusions(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH EXCLUSIONS";
        if (!Functions.selectText(driver,
                new String[]{"e_search_sl_service",getElements("e_search_sl_service")},
                getData("service_e"), "service_e", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"e_search_i_applic", getElements("e_search_i_applic")},
                "apli_e", getData("apli_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_search_i_desactivate", getElements("e_search_i_desactivate")},
                "desc_e", getData("desc_e"), where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"e_search_lov_to", getElements("e_search_lov_to")}, //LoV button
                new String[]{"e_search_i_to", getElements("e_search_i_to")}, //external LoV input
                new String[]{"search_lov_to_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("to_e"), // value to search
                "to_e", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"e_search_lov_agency", getElements("e_search_lov_agency")}, //LoV button
                new String[]{"e_search_i_agency", getElements("e_search_i_agency")}, //external LoV input
                new String[]{"search_lov_agency_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("agency_e"), // value to search
                "agency_e", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"e_search_lov_idweb", getElements("e_search_lov_idweb")}, //LoV button
                new String[]{"e_search_i_idweb", getElements("e_search_i_idweb")}, //external LoV input
                new String[]{"search_lov_web_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("web_e"), // value to search
                "web_e", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"e_search_lov_interface", getElements("e_search_lov_interface")}, //LoV button
                new String[]{"e_search_i_interface", getElements("e_search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface_e"), // value to search
                "interface_e", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"e_search_b_search", getElements("e_search_b_search")}, //search button
                new String[]{"exclusions_e_result", getElements("exclusions_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_exclusions(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION AGENCY";
        if (!Functions.checkClick(driver,
                new String[]{"exclusions_b_edit", getElements("exclusions_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"e_add_sl_service",getElements("e_add_sl_service")},
                "Transfer", "service_e", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"e_add_i_aplicc", getElements("e_add_i_aplicc")},
                "apli_e", DataGenerator.getToday(), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_add_i_desactivate", getElements("e_add_i_desactivate")},
                "desc_e", DataGenerator.getToday(), where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_to",getElements("e_add_lov_to")}, // b_lov
                new String[]{"e_add_i_to", getElements("e_add_i_to")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "to_e", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_agency", getElements("e_add_lov_agency")},
                new String[]{"e_add_i_agency",getElements("e_add_i_agency")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency_e", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_idweb", getElements("e_add_lov_idweb")},
                new String[]{"e_add_i_idweb",getElements("e_add_i_idweb")}, // b_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web_e", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"e_add_lov_interface",getElements("e_add_lov_interface")}, // b_lov
                new String[]{"e_add_i_interface", getElements("e_add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface_e", //Data name
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"e_add_b_save", getElements("e_add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_exclusions(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE EXCLUSIONS";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"e_search_b_reset", getElements("e_search_b_reset")}, //search button
                new String[]{"exclusions_e_result", getElements("exclusions_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"exclusions_b_qbe", getElements("exclusions_b_qbe")},// query button
                new String[]{"e_qbe_i_aplicc", getElements("e_qbe_i_aplicc")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        Functions.zoomOut(driver);
        if (!Functions.selectText(driver,
                new String[]{"e_qbe_sl_service",getElements("e_qbe_sl_service")},
                getData("service_e"), "service_e", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"e_qbe_i_aplicc", getElements("e_qbe_i_aplicc")},
                "apli_e", getData("apli_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_qbe_i_desactivate", getElements("e_qbe_i_desactivate")},
                "desc_e", getData("desc_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_qbe_i_to", getElements("e_qbe_i_to")},
                "to_e", getData("to_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_qbe_i_agency", getElements("e_qbe_i_agency")},
                "agency_e", getData("agency_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_qbe_i_idweb", getElements("e_qbe_i_idweb")},
                "web_e", getData("web_e"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"e_qbe_i_interface", getElements("e_qbe_i_interface")},
                "interface_e", getData("interface_e"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"e_qbe_i_aplicc", getElements("e_qbe_i_aplicc")}, //any query input
                new String[]{"exclusions_e_result", getElements("exclusions_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_exclusions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA EXCLUSIONS";
        if (!Functions.auditData(driver,
                new String[]{"exclusions_b_actions", getElements("exclusions_b_actions")}, //actions button
                new String[]{"exclusions_b_actions_audit_data", getElements("exclusions_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH INCLUSIONS";
        if (!Functions.detachTable(driver,
                new String[]{"exclusions_b_detach", getElements("exclusions_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_exclusions(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA EXCLUSIONS";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"exclusions_b_delete", getElements("exclusions_b_delete")},
                new String[]{"exclusions_e_records", getElements("exclusions_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
