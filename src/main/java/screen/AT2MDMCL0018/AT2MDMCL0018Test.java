package screen.AT2MDMCL0018;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.xml.internal.bind.v2.model.runtime.RuntimeNonElementRef;
import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 22/11/2016.
 */

/**
 * SE HARDCODEA LA PRIMERA BUSQUEDA PARA ENCONTRAR REGISTROS QUE TENGA DATOS EN LA SEGUNDA TABLA
 * EN LA EDICIÓN NO SE EDITAN TODOS LOS CAMPOS PORQUE ESTAN RELACIONADAS LAS DOS TABLAS Y SI SE EDITAN, SE PIERDE LA RELACIÓN
 * NO SE PUEEDE ELIMINAR DE LA PRIMERA TABLA PORQUE ESTA RELACIONADA CON OTRAS PANTALLAS
 */
public class AT2MDMCL0018Test {
    protected AT2MDMCL0018Locators locators;
    protected AT2MDMCL0018Data data;
    public AT2MDMCL0018Test() {
    }
    public AT2MDMCL0018Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMCL0018Locators locators) {
        this.locators = locators;
    }
    public AT2MDMCL0018Data getData() {
        return data;
    }
    public void setData(AT2MDMCL0018Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Clients");
        driver.getTestdetails().setScreen("Client Credentials");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if(!first_search_t1(driver)) return false;
        if(!getData_t1(driver)) return false;
        if (!search_t1(driver)) return false;
        if (!interaction_edit_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if(!getData_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!delete_t2(driver)) return false;
/*        if (!delete_t1(driver)) return false;*/
        return true;
    }

    private boolean first_search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_to_branch", getElements("search_i_to_branch")},
                "to", "0", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_interface", getElements("search_i_interface")},
                "interface", "H", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_branch_number", getElements("search_i_branch_number")},
                "branch", "0", where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_cache", getElements("search_i_cache")},
                "cache", "10", where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"client_e_result", getElements("client_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    public boolean getData_t1 (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " GET DATA 1";
        if (!Functions.simpleClick(driver,
                new String[]{"client_e_result", getElements("client_e_result")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"client_b_edit", getElements("client_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.getValue(driver,
                new String[]{"add_i_agency_id", getElements("add_i_agency_id")}, // element path
                "agency", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_to_branch", getElements("add_i_to_branch")}, // element path
                "to", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_interface", getElements("add_i_interface")}, // element path
                "interface", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_major", getElements("add_i_major")}, // element path
                "major", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_submajor", getElements("add_i_submajor")}, // element path
                "sub", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_detail", getElements("add_i_detail")}, // element path
                "detail", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_cache", getElements("add_i_cache")}, // element path
                "cache", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"add_i_branch_number", getElements("add_i_branch_number")}, // element path
                "branch", // key for data value (the name)
                where);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_agency_id", getElements("search_i_agency_id")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_to_branch", getElements("search_i_to_branch")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_interface", getElements("search_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_major", getElements("search_i_major")},
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_submajor", getElements("search_i_submajor")},
                "sub", getData("sub"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_detail", getElements("search_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_branch_number", getElements("search_i_branch_number")},
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"search_i_cache", getElements("search_i_cache")},
                "cache", getData("cache"), where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"client_e_result", getElements("client_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t1(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 1";
        if (!Functions.checkClick(driver,
                new String[]{"client_b_edit", getElements("client_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_major", getElements("add_i_major")},
                "major", String.valueOf(DataGenerator.random(1,800)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_submajor", getElements("add_i_submajor")},
                "sub", String.valueOf(DataGenerator.random(1,100)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_detail", getElements("add_i_detail")},
                "detail", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_branch_number", getElements("add_i_branch_number")},
                "branch", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_cache", getElements("add_i_cache")},
                "cache", String.valueOf(DataGenerator.random(1,10)), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"client_e_result", getElements("client_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"client_b_qbe", getElements("client_b_qbe")},// query button
                new String[]{"qbe_i_agency", getElements("qbe_i_agency")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch_to", getElements("qbe_i_branch_to")},
                "to", getData("to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_interface", getElements("qbe_i_interface")},
                "interface", getData("interface"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_major", getElements("qbe_i_major")},
                "major", getData("major"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_subMajor", getElements("qbe_i_subMajor")},
                "sub", getData("sub"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_detail", getElements("qbe_i_detail")},
                "detail", getData("detail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_cache", getElements("qbe_i_cache")},
                "cache", getData("cache"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_branch_number", getElements("qbe_i_branch_number")},
                "branch", getData("branch"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_agency", getElements("qbe_i_agency")}, //any query input
                new String[]{"client_e_result", getElements("client_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"client_b_actions", getElements("client_b_actions")}, //actions button
                new String[]{"client_b_actions_audit_data", getElements("client_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"client_b_detach", getElements("client_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t1(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 1";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"client_b_delete", getElements("client_b_delete")},
                new String[]{"client_e_records", getElements("client_e_records")},
                new String[]{"client_b_ok", getElements("client_b_ok")},
                where)){
            return false;
        }
        return true;
    }

    public boolean getData_t2 (TestDriver driver) {
        driver.getReport().addHeader("GET DATA", 3, false);
        String where = " GET DATA 2";
        if (!Functions.simpleClick(driver,
                new String[]{"agencies_e_result", getElements("agencies_e_result")}, //element to click
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"agencies_b_edit", getElements("agencies_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.getValue(driver,
                new String[]{"a_add_i_agency_code", getElements("a_add_i_agency_code")}, // element path
                "agency2", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_to_branch", getElements("a_add_i_to_branch")}, // element path
                "to2", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_agency_name", getElements("a_add_i_agency_name")}, // element path
                "a_name", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_major", getElements("a_add_i_major")}, // element path
                "major2", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_submajor", getElements("a_add_i_submajor")}, // element path
                "sub2", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_detail", getElements("a_add_i_detail")}, // element path
                "detail2", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_atlas_code", getElements("a_add_i_atlas_code")}, // element path
                "atlas", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_atlas_branch", getElements("a_add_i_atlas_branch")}, // element path
                "a_branch", // key for data value (the name)
                where);
        Functions.getValue(driver,
                new String[]{"a_add_i_interface", getElements("a_add_i_interface")}, // element path
                "interface2", // key for data value (the name)
                where);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"agencies_b_edit", getElements("agencies_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_add_i_to_branch", getElements("a_add_i_to_branch")},
                "to2", String.valueOf(DataGenerator.random(1,9)), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_add_i_agency_name", getElements("a_add_i_agency_name")},
                "a_name", DataGenerator.getRandomAlphanumericSequence(10,false), where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //e1
                recursiveXPaths.glass, //e2
                where)) return false; //where
        return true;
    }
    private boolean qbe_t2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        if (!Functions.clickQbE(driver,
                new String[]{"agencies_b_qbe", getElements("agencies_b_qbe")},// query button
                new String[]{"a_qbe_i_agency_code", getElements("a_qbe_i_agency_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_agency_code", getElements("a_qbe_i_agency_code")},
                "agency2", getData("agency2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_to_branch", getElements("a_qbe_i_to_branch")},
                "to2", getData("to2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_agency_name", getElements("a_qbe_i_agency_name")},
                "a_name", getData("a_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_major", getElements("a_qbe_i_major")},
                "major2", getData("major2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_submajor", getElements("a_qbe_i_submajor")},
                "sub2", getData("sub2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_detail", getElements("a_qbe_i_detail")},
                "detail2", getData("detail2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_atlas_code", getElements("a_qbe_i_atlas_code")},
                "atlas", getData("atlas"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_atlas_branch", getElements("a_qbe_i_atlas_branch")},
                "a_branch", getData("a_branch"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"a_qbe_i_interface", getElements("a_qbe_i_interface")},
                "interface2", getData("interface2"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"a_qbe_i_agency_code", getElements("a_qbe_i_agency_code")}, //any query input
                new String[]{"agencies_e_result", getElements("agencies_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 2";
        Functions.break_time(driver, 2, 400);
        if (!Functions.auditData(driver,
                new String[]{"agencies_b_actions", getElements("agencies_b_actions")}, //actions button
                new String[]{"agencies_b_actions_audit_data", getElements("agencies_b_actions_audit_data")}, //audit button
                new String[]{"audit_b_ok", getElements("agencies_ok_audit")}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"agencies_b_detach", getElements("agencies_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"agencies_b_delete", getElements("agencies_b_delete")},
                new String[]{"agencies_e_records", getElements("agencies_e_records")},
                where)){
            return false;
        }
        return true;
    }
}
