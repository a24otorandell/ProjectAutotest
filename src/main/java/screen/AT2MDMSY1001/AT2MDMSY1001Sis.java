package screen.AT2MDMSY1001;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

/**
 * Created by aibanez on 08/11/2016.
 */
/**
 * EL CHECK BOX ACTIVE NO LO TOCO EN CREACIÓN NI EDICIÓN, NI QBE, PORQUE A LA HORA DE ELIMINAR SE ACTIVA ESE CHECKBOX
 */
public class AT2MDMSY1001Sis {
    protected AT2MDMSY1001Locators locators;
    protected AT2MDMSY1001Data data;
    public AT2MDMSY1001Sis() {
    }
    public AT2MDMSY1001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMSY1001Locators locators) {
        this.locators = locators;
    }
    public AT2MDMSY1001Data getData() {
        return data;
    }
    public void setData(AT2MDMSY1001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("System");
        driver.getTestdetails().setScreen("Setup GVCC Operator");
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
                new String[]{"operator_b_add", getElements("operator_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_operator",getElements("add_i_operator")},
                "operator", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Credit", "type",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_user",getElements("add_i_user")},
                "user",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_password",getElements("add_i_password")},
                "pass", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_password_conf",getElements("add_i_password_conf")},
                "pass_c",  getData("pass"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_url_pro",getElements("add_i_url_pro")},
                "url_p", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_url_test",getElements("add_i_url_test")},
                "url_t", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_alternative"),"alternative",true,true, where)){return false;}
/*        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_operator",getElements("search_i_operator")},
                "operator", getData("operator"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"operator_e_result", getElements("operator_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"operator_b_edit", getElements("operator_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
//        if (!Functions.insertInput(driver, new String[]{"add_i_operator",getElements("add_i_operator")},
//                "operator", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_description",getElements("add_i_description")},
                "desc", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Debit", "type",  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_user",getElements("add_i_user")},
                "user",  DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_password",getElements("add_i_password")},
                "pass", String.valueOf(DataGenerator.random(1,100)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_password_conf",getElements("add_i_password_conf")},
                "pass_c",  getData("pass"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_url_pro",getElements("add_i_url_pro")},
                "url_p", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_url_test",getElements("add_i_url_test")},
                "url_t", DataGenerator.getRandomAlphanumericSequence(10,false), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_alternative"),"alternative",false,true, where)){return false;}
/*        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",false,true,where)){return false;}*/
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
                new String[]{"operator_e_result", getElements("operator_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"operator_b_qbe", getElements("operator_b_qbe")},// query button
                new String[]{"qbe_i_operator", getElements("qbe_i_operator")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_operator",getElements("qbe_i_operator")},
                "operator", getData("operator"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_description",getElements("qbe_i_description")},
                "desc", getData("desc"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_alternative",getElements("qbe_sl_alternative")},
                getData("alternative"), "alternative", where)){return false;}
//        if (!Functions.selectText(driver,
//                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
//                getData("active"), "active", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_operator", getElements("qbe_i_operator")}, //any query input
                new String[]{"operator_e_result", getElements("operator_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"operator_b_actions", getElements("operator_b_actions")}, //actions button
                new String[]{"operator_b_actions_b_audit_data", getElements("operator_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"operator_b_detach", getElements("operator_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";

        Functions.simpleClick(driver,
                new String[]{"operator_e_result", getElements("operator_e_result")}, //element to click
                where);
        Functions.simpleClick(driver,
                new String[]{"operator_b_delete", getElements("operator_b_delete")}, //element to click
                where);
        Functions.simpleClick(driver,
                new String[]{"b_delete_yes", recursiveXPaths.delete_b_yes}, //element to click
                where);
        Functions.break_time(driver, 3, 600);
        try {
            if (driver.getDriver().findElement(By.xpath("//*[contains(@id, 'pc1:gvcc:1:sbc4::content')]/span/img")).getAttribute("title").equals("unchecked")) {
                driver.getReport().addContent("\"Active\" CHECKBOX IS UNCHECKED. DELETION WORKED", "h3","class='success'" );
            }
        } catch (Exception e) {
            String exc = ("--ERROR: \"Active\" - CHECKBOX IS CHECKED. DELETION DID NOT WORKED");
            e.printStackTrace();
            ErrorManager.process(driver, exc);
        }
/*        if (!Functions.doDeleteNCheck(driver,
                new String[]{"operator_b_delete", getElements("operator_b_delete")},
                new String[]{"operator_e_records", getElements("operator_e_records")},
                where)){

            return false;
        }*/
        return true;
    }
}
