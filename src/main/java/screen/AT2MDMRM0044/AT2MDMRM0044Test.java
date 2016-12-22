package screen.AT2MDMRM0044;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 22/12/2016.
 */

/**
 * EN LA CREACIÓN SELECCIONO EN EL CAMPO TYPE ENTRE PROMOTION Y OFFER PORQUE CON ESOS CAMPOS LOS CHECKBOX DE FREE Y OPAQUE ESTAN DESACTIVADOS
 * EN LA EDICIÓN CAMBIO A VALUATION PARA QUE SE ACTIVEN LOS CHECKBOX (AL ACTIVARLOS, SE DESACTIVAN) Y PODER USARLOS, ADEMÁS ESTA OPCIÓN ACTIVA LA TABLA SUPPLEMENTS.
 * EN LA QBE LOS SELECT DE FREE Y OPAQUE NO FILTRAN CORRECTAMENTE.
 * NO DEJA ELIMINAR EL REGISTRO DE LA TERCERA TABLA POR OVERLAPPING.
 */
public class AT2MDMRM0044Test {                        
    protected AT2MDMRM0044Locators locators;
    protected AT2MDMRM0044Data data;
    public AT2MDMRM0044Test() {
    }
    public AT2MDMRM0044Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMRM0044Locators locators) {
        this.locators = locators;
    }
    public AT2MDMRM0044Data getData() {
        return data;
    }
    public void setData(AT2MDMRM0044Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Market");
        driver.getTestdetails().setScreen("Promotions");
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
        if (!interaction_add_2(driver)) return false;
        if (!qbe_2(driver)) return false;
        if (!interaction_edit_2(driver)) return false;
        if (!qbe_2(driver)) return false;
        if (!others_actions_2(driver)) return false;
        if (!interaction_add_3(driver)) return false;
        if (!qbe_3(driver)) return false;
        if (!interaction_edit_3(driver)) return false;
        if (!qbe_3(driver)) return false;
        if (!others_actions_3(driver)) return false;
        if (!interaction_add_4(driver)) return false;
        if (!qbe_4(driver)) return false;
        if (!interaction_edit_4(driver)) return false;
        if (!qbe_4(driver)) return false;
        if (!others_actions_4(driver)) return false;
        if (!interaction_add_5(driver)) return false;
        if (!qbe_5(driver)) return false;
        if (!interaction_edit_5(driver)) return false;
        if (!qbe_5(driver)) return false;
        if (!others_actions_5(driver)) return false;
        if (!delete_5(driver)) return false;
        if (!delete_4(driver)) return false;
        if (!delete_2(driver)) return false;
        if (!delete(driver)) return false;
        return true;
    }

    /**
     * METHODS TABLE PROMOTION
     * @param driver
     * @return
     */
    public boolean interaction_add (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD";
        if (!Functions.checkClick(driver,
                new String[]{"promotion_b_add", getElements("promotion_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_prom_code",getElements("add_i_prom_code")},
                "prom_code", String.valueOf(DataGenerator.random(111,9999)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name",getElements("add_i_short_name")},
                "short_name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_sales_channel",getElements("add_lov_sales_channel")}, // b_lov
                new String[]{"add_i_sales_channel", getElements("add_i_sales_channel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "sales", //Data name
                where)){return false;}
        String list_options[] = {"Offer", "Promotion"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_type", getElements("add_sl_type")},
                list_options, "type", where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_legend",getElements("add_i_legend")},
                "legend", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks",getElements("add_i_remarks")},
                "remarks", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_observa"),"observa",true,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_minium",getElements("add_i_minium")},
                "minium", String.valueOf(DataGenerator.random(1,12)), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_automatic"),"automatic",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_display"),"display",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_prom_code",getElements("search_i_prom_code")},
                "prom_code", getData("prom_code"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_short_name",getElements("search_i_short_name")},
                "short_name", getData("short_name"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_sales_channel", getElements("search_lov_sales_channel")}, //LoV button
                new String[]{"search_i_sales_channel", getElements("search_i_sales_channel")}, //external LoV input
                new String[]{"search_lov_sales_channel_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("sales"), // value to search
                "sales", //name of the data
                where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_observa",getElements("search_sl_observa")},
                getData("observa"), "observa", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_mininum",getElements("search_i_mininum")},
                "minium", getData("minium"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type",getElements("search_sl_type")},
                getData("type"), "type", where)){return false;}
        if (getData("type").equalsIgnoreCase("Valuation")) {
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_free", getElements("search_sl_free")},
                    getData("free"), "free", where)) {
                return false;
            }
            if (!Functions.selectText(driver,
                    new String[]{"search_sl_opaque", getElements("search_sl_opaque")},
                    getData("opaque"), "opaque", where)) {
                return false;
            }
        }
        if (!Functions.selectText(driver,
                new String[]{"search_sl_automatic",getElements("search_sl_automatic")},
                getData("automatic"), "automatic", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_display",getElements("search_sl_display")},
                getData("display"), "display", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"search_sl_active",getElements("search_sl_active")},
                getData("active"), "active", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_legend",getElements("search_i_legend")},
                "legend", getData("legend"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_remarks",getElements("search_i_remarks")},
                "remarks", getData("remarks"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"promotion_e_result", getElements("promotion_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"promotion_b_edit", getElements("promotion_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_sales_channel",getElements("add_i_sales_channel")},
                "sales", "", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Valuation", "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prom_code",getElements("add_i_prom_code")},
                "prom_code", String.valueOf(DataGenerator.random(111,9999)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_short_name",getElements("add_i_short_name")},
                "short_name", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_free"),"free",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_opaque"),"opaque",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_legend",getElements("add_i_legend")},
                "legend", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks",getElements("add_i_remarks")},
                "remarks", DataGenerator.getRandomAlphanumericSequence(6,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_observa"),"observa",false,true,where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_minium",getElements("add_i_minium")},
                "minium", String.valueOf(DataGenerator.random(1,12)), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_automatic"),"automatic",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_display"),"display",false,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"promotion_e_result", getElements("promotion_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"promotion_b_qbe", getElements("promotion_b_qbe")},// query button
                new String[]{"qbe_i_prom_code", getElements("qbe_i_prom_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_prom_code", getElements("qbe_i_prom_code")},
                "prom_code", getData("prom_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_short_name",getElements("qbe_i_short_name")},
                "short_name", getData("short_name"), where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"qbe_i_sales_channel", getElements("qbe_i_sales_channel")},
                "sales", getData("sales"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}

        //NO FILTRAN CORRECTAMENTE
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_free", getElements("qbe_sl_free")},
                getData("free"), "free", where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_opaque", getElements("qbe_sl_opaque")},
                getData("opaque"), "opaque", where)) {
            return false;
        }
        Functions.zoomOut(driver);
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "active", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_observa",getElements("qbe_sl_observa")},
                getData("observa"), "observa", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_minium",getElements("qbe_i_minium")},
                "minium", getData("minium"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_automatic",getElements("qbe_sl_automatic")},
                getData("automatic"), "automatic", where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_display",getElements("qbe_sl_display")},
                getData("display"), "display", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_prom_code", getElements("qbe_i_prom_code")}, //any query input
                new String[]{"promotion_e_result", getElements("promotion_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA";
        if(!Functions.auditData(driver,
                new String[]{"promotion_b_actions",getElements("promotion_b_actions")}, //actions button
                new String[]{"promotion_b_actions_b_audit_data",getElements("promotion_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"promotion_b_detach", getElements("promotion_b_detach")}, //detach button
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
                new String[]{"promotion_b_delete", getElements("promotion_b_delete")}, //button delete
                new String[]{"promotion_e_records", getElements("promotion_e_records")}, // result
                new String[]{"promotion_b_delete_yes", getElements("promotion_b_delete_yes")}, //delete button yes
                where)){return false;}
        return true;
    }

    /**
     * METHODS TABLE MULTI
     * @param driver
     * @return
     */
    public boolean interaction_add_2 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 2";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_add", getElements("multi_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prom_name",getElements("add_i_prom_name")},
                "prom_name", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_ico_path",getElements("add_i_ico_path")},
                "ico", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_menu_name",getElements("add_i_menu_name")},
                "menu", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_legend2",getElements("add_i_legend2")},
                "legend2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks2",getElements("add_i_remarks2")},
                "remarks2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"multi_b_edit", getElements("multi_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang",getElements("add_lov_lang")}, // b_lov
                new String[]{"add_i_lang", getElements("add_i_lang")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_prom_name",getElements("add_i_prom_name")},
                "prom_name", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_ico_path",getElements("add_i_ico_path")},
                "ico", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_menu_name",getElements("add_i_menu_name")},
                "menu", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_legend2",getElements("add_i_legend2")},
                "legend2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_remarks2",getElements("add_i_remarks2")},
                "remarks2", DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        if (!Functions.clickQbE(driver,
                new String[]{"multi_b_qbe", getElements("multi_b_qbe")},// query button
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang", getElements("qbe_i_lang")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_promotion", getElements("qbe_i_promotion")},
                "prom_name", getData("prom_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description", getElements("qbe_i_description")},
                "desc", getData("desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_lang", getElements("qbe_i_lang")}, //any query input
                new String[]{"multi_e_result", getElements("multi_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_2(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA 2";
        if(!Functions.auditData(driver,
                new String[]{"multi_b_actions",getElements("multi_b_actions")}, //actions button
                new String[]{"multi_b_actions_b_audit_data",getElements("multi_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.simpleClick(driver,
                new String[]{"multi_b_extra", getElements("multi_b_extra")}, //element to click
                where)){return false;}
        if (!Functions.detachTable(driver,
                new String[]{"multi_b_detach", getElements("multi_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 2";
        if (!Functions.doDelete(driver,
                new String[]{"multi_b_delete", getElements("multi_b_delete")},
                new String[]{"multi_b_delete_yes", getElements("multi_b_delete_yes")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TABLE SUPPLEMENTS
     * @param driver
     * @return
     */
    public boolean interaction_add_3 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 3";
        if (!Functions.checkClick(driver,
                new String[]{"supplements_b_add", getElements("supplements_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_code",getElements("add_lov_code")}, // b_lov
                new String[]{"add_i_code", getElements("add_i_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code", //Data name
                where)){return false;}
        String list_options[] = {"G1", "G2", "G3", "G4", "G5", "L1", "L2" };
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_subtipo", getElements("add_sl_subtipo")},
                list_options, "subtipo", where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_value", getElements("add_i_value")}, // element path
                "value", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 3";
        if (!Functions.checkClick(driver,
                new String[]{"supplements_b_edit", getElements("supplements_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_code",getElements("add_lov_code")}, // b_lov
                new String[]{"add_i_code", getElements("add_i_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "code", //Data name
                where)){return false;}
        String list_options[] = {"G1", "G2", "G3", "G4", "G5", "L1", "L2" };
        if (!Functions.selectTextRandom(driver,
                new String[]{"add_sl_subtipo", getElements("add_sl_subtipo")},
                list_options, "subtipo", where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_value", getElements("add_i_value")}, // element path
                "value", // key for data value (the name)
                where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save3", getElements("add_b_save3")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 3";
        if (!Functions.clickQbE(driver,
                new String[]{"supplements_b_qbe", getElements("supplements_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_value", getElements("qbe_i_value")},
                "value", getData("value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_subtipo", getElements("qbe_i_subtipo")},
                "subtipo", getData("subtipo"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"supplements_e_result", getElements("supplements_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_3(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA 3";
        if(!Functions.auditData(driver,
                new String[]{"supplements_b_actions",getElements("supplements_b_actions")}, //actions button
                new String[]{"supplements_b_actions_b_audit_data",getElements("supplements_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 3";
        if (!Functions.detachTable(driver,
                new String[]{"supplements_b_detach", getElements("supplements_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * METHODS TABLE CONCEPTS
     * @param driver
     * @return
     */
    public boolean interaction_add_4 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 4";
        if (!Functions.checkClick(driver,
                new String[]{"concepts_b_add", getElements("concepts_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_concept",getElements("add_i_concept")},
                "concept", DataGenerator.getRandomAlphanumericSequence(5, false),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_concept_name",getElements("add_i_concept_name")},
                "concept_name", DataGenerator.getRandomAlphanumericSequence(5, false),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_days_from",getElements("add_i_num_days_from")},
                "d_from", String.valueOf(DataGenerator.random(1,10)),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_days_to",getElements("add_i_num_days_to")},
                "d_to", String.valueOf(DataGenerator.random(11,20)),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_pax_from",getElements("add_i_num_pax_from")},
                "p_from", String.valueOf(DataGenerator.random(1,10)),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_pax_to",getElements("add_i_num_pax_to")},
                "p_to", String.valueOf(DataGenerator.random(11,20)),where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_4(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 4";
        if (!Functions.checkClick(driver,
                new String[]{"concepts_b_edit", getElements("concepts_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_concept",getElements("add_i_concept")},
                "concept", DataGenerator.getRandomAlphanumericSequence(5, false),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_concept_name",getElements("add_i_concept_name")},
                "concept_name", DataGenerator.getRandomAlphanumericSequence(5, false),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_days_from",getElements("add_i_num_days_from")},
                "d_from", String.valueOf(DataGenerator.random(1,10)),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_days_to",getElements("add_i_num_days_to")},
                "d_to", String.valueOf(DataGenerator.random(11,20)),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_pax_from",getElements("add_i_num_pax_from")},
                "p_from", String.valueOf(DataGenerator.random(1,10)),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_num_pax_to",getElements("add_i_num_pax_to")},
                "p_to", String.valueOf(DataGenerator.random(11,20)),where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save4", getElements("add_b_save4")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_4(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 4";
        if (!Functions.clickQbE(driver,
                new String[]{"concepts_b_qbe", getElements("concepts_b_qbe")},// query button
                new String[]{"qbe_i_concept", getElements("qbe_i_concept")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_concept",getElements("qbe_i_concept")},
                "concept", getData("concept"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_concept_name",getElements("qbe_i_concept_name")},
                "concept_name", getData("concept_name"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_num_days_from",getElements("qbe_i_num_days_from")},
                "d_from", getData("d_from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_num_days_to",getElements("qbe_i_num_days_to")},
                "d_to", getData("d_to"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_num_pax_from",getElements("qbe_i_num_pax_from")},
                "p_from", getData("p_from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_num_pax_to",getElements("qbe_i_num_pax_to")},
                "p_to", getData("p_to"),where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_concept", getElements("qbe_i_concept")}, //any query input
                new String[]{"concepts_e_result", getElements("concepts_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_4(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA 4";
        if(!Functions.auditData(driver,
                new String[]{"concepts_b_actions",getElements("concepts_b_actions")}, //actions button
                new String[]{"concepts_b_actions_b_audit_data",getElements("concepts_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 4";
        if (!Functions.detachTable(driver,
                new String[]{"concepts_b_detach", getElements("concepts_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_4(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 4";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"concepts_b_delete", getElements("concepts_b_delete")},
                new String[]{"concepts_e_records", getElements("concepts_e_records")},
                new String[]{"concepts_b_delete_yes", getElements("concepts_b_delete_yes")},
                where)){
            return false;
        }
        return true;
    }

    /**
     * METHODS TABLE CONCEPTS LANG
     * @param driver
     * @return
     */
    public boolean interaction_add_5 (TestDriver driver) {
        driver.getReport().addHeader("CREATTION", 3, false);
        String where = " ADD 5";
        if (!Functions.checkClick(driver,
                new String[]{"c_lang_b_add", getElements("c_lang_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang2",getElements("add_lov_lang2")}, // b_lov
                new String[]{"add_i_lang2", getElements("add_i_lang2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang2", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_concept_description",getElements("add_i_concept_description")},
                "concept_desc", DataGenerator.getRandomAlphanumericSequence(5, false),where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save5", getElements("add_b_save5")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_5(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 5";
        if (!Functions.checkClick(driver,
                new String[]{"c_lang_b_edit", getElements("c_lang_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_lang2",getElements("add_lov_lang2")}, // b_lov
                new String[]{"add_i_lang2", getElements("add_i_lang2")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang2", //Data name
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_concept_description",getElements("add_i_concept_description")},
                "concept_desc", DataGenerator.getRandomAlphanumericSequence(5, false),where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save5", getElements("add_b_save5")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_5(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 5";
        if (!Functions.clickQbE(driver,
                new String[]{"c_lang_b_qbe", getElements("c_lang_b_qbe")},// query button
                new String[]{"qbe_i_lang2", getElements("qbe_i_lang2")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_lang2",getElements("qbe_i_lang2")},
                "lang2", getData("lang2"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_concept_description",getElements("qbe_i_concept_description")},
                "concept_desc", getData("concept_desc"),where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_lang2", getElements("qbe_i_lang2")}, //any query input
                new String[]{"c_lang_e_result", getElements("c_lang_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_5(TestDriver driver) {
        driver.getReport().addHeader("AUDIT DATA", 3, false);
        String where = " on AUDIT DATA 5";
        if(!Functions.auditData(driver,
                new String[]{"c_lang_b_actions",getElements("c_lang_b_actions")}, //actions button
                new String[]{"c_lang_b_actions_b_audit_data",getElements("c_lang_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){return false;}
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 5";
        if (!Functions.detachTable(driver,
                new String[]{"c_lang_b_detach", getElements("c_lang_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_5(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 5";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"c_lang_b_delete", getElements("c_lang_b_delete")},
                new String[]{"c_lang_e_records", getElements("c_lang_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
