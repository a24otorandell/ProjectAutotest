package screen.AT2MDMOR0025;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMOR0025Sis {
    protected AT2MDMOR0025Locators locators;
    protected AT2MDMOR0025Data data;
    public AT2MDMOR0025Sis() {
    }
    public AT2MDMOR0025Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0025Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0025Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0025Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Labels");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_add(driver)) return false;
        if (!search(driver)) return false;
        if (!interaction_edit(driver)) return false;
        if (!qbe(driver)) return false;
        if (!others_actions(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"company_b_add", getElements("company_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_template",getElements("add_i_template")},
                "template", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order",getElements("add_i_order")},
                "order",String.valueOf(DataGenerator.random(1,40)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_receptive",getElements("add_lov_receptive")}, // b_lov
                new String[]{"add_i_receptive", getElements("add_i_receptive")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "receptive", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_dfrom",getElements("add_i_dfrom")},
                "from", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_dto",getElements("add_i_dto")},
                "to",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8,3), 0), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Hotel", "type", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web",getElements("add_lov_web")}, // b_lov
                new String[]{"add_i_web", getElements("add_i_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web", //Data name
                where)){return false;}

        if (!Functions.fileUploader(driver,
                new String[]{"add_i_file1", getElements("add_i_file1")},
                new String[]{"logo1", getData("file_new")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_i_file2", getElements("add_i_file2")},
                new String[]{"logo2", getData("file_new")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_i_file3", getElements("add_i_file3")},
                new String[]{"logo3", getData("file_new")},
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_template",getElements("search_i_template")},
                "template", getData("template"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_order",getElements("search_i_order")},
                "order", getData("order"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_lang", getElements("search_lov_lang")}, //LoV button
                new String[]{"search_i_lang", getElements("search_i_lang")}, //external LoV input
                new String[]{"search_lov_lang_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("lang"), // value to search
                "lang", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_company", getElements("search_lov_company")}, //LoV button
                new String[]{"search_i_company", getElements("search_i_company")}, //external LoV input
                new String[]{"search_lov_company_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("company"), // value to search
                "company", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_receptive", getElements("search_lov_receptive")}, //LoV button
                new String[]{"search_i_receptive", getElements("search_i_receptive")}, //external LoV input
                new String[]{"search_lov_receptive_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("receptive"), // value to search
                "receptive", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_dfrom",getElements("search_i_dfrom")},
                "from", getData("from"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_dtoy",getElements("search_i_dtoy")},
                "to", getData("to"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_interface", getElements("search_lov_interface")}, //LoV button
                new String[]{"search_i_interface", getElements("search_i_interface")}, //external LoV input
                new String[]{"search_lov_interface_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("interface"), // value to search
                "interface", //name of the data
                where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_web", getElements("search_lov_web")}, //LoV button
                new String[]{"search_i_web", getElements("search_i_web")}, //external LoV input
                new String[]{"search_lov_web_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("web"), // value to search
                "web", //name of the data
                where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"company_e_result", getElements("company_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"company_b_edit", getElements("company_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_template",getElements("add_i_template")},
                "template", DataGenerator.getRandomAlphanumericSequence(3,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_order",getElements("add_i_order")},
                "order",String.valueOf(DataGenerator.random(1,40)), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_company",getElements("add_lov_company")}, // b_lov
                new String[]{"add_i_company", getElements("add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_receptive",getElements("add_lov_receptive")}, // b_lov
                new String[]{"add_i_receptive", getElements("add_i_receptive")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "receptive", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_dfrom",getElements("add_i_dfrom")},
                "from", DataGenerator.getToday(), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_dto",getElements("add_i_dto")},
                "to",  DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(8,3), 0), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Transfer", "type", where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_interface",getElements("add_lov_interface")}, // b_lov
                new String[]{"add_i_interface", getElements("add_i_interface")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "interface", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_web",getElements("add_lov_web")}, // b_lov
                new String[]{"add_i_web", getElements("add_i_web")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "web", //Data name
                where)){return false;}

        if (!Functions.fileUploader(driver,
                new String[]{"add_i_file1", getElements("add_i_file1")},
                new String[]{"logo1", getData("file_new2")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_i_file2", getElements("add_i_file2")},
                new String[]{"logo2", getData("file_new2")},
                where)) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"add_i_file3", getElements("add_i_file3")},
                new String[]{"logo3", getData("file_new2")},
                where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        Functions.zoomOut(driver);
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //element to click
                where)){return false;}
        if (!Functions.clickQbE(driver,
                new String[]{"company_b_qbe", getElements("company_b_qbe")},// query button
                new String[]{"qbe_i_template", getElements("qbe_i_template")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_template", getElements("qbe_i_template")},
                "template", getData("template"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_order", getElements("qbe_i_order")},
                "order", getData("order"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company", getElements("qbe_i_company")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")},
                "receptive", getData("receptive"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dfrom", getElements("qbe_i_dfrom")},
                "from", getData("from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_dtoy", getElements("qbe_i_dtoy")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_web", getElements("qbe_i_web")},
                "web", getData("web"), where)) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_template", getElements("qbe_i_template")}, //any query input
                new String[]{"company_e_result", getElements("company_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
/*        if (!Functions.auditData(driver,
                new String[]{"product_b_actions", getElements("product_b_actions")}, //actions button
                new String[]{"product_b_actions_b_audit_data", getElements("product_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }*/
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"company_b_detach", getElements("company_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"company_b_delete", getElements("company_b_delete")},
                new String[]{"company_e_records", getElements("company_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
