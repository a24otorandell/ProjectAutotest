package screen.AT2ACCDI0028;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

import java.util.Locale;

/**
 * Created by vsolis on 29/11/2016.
 *
 * Campo "Desactivation Date" no funciona, descomentar código cuando lo haga
 */
public class AT2ACCDI0028Test {
    protected AT2ACCDI0028Locators locators;
    protected AT2ACCDI0028Data data;

    public AT2ACCDI0028Test (){

    }

    public AT2ACCDI0028Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCDI0028Locators locators){
        this.locators = locators;
    }

    public AT2ACCDI0028Data getData (){
        return data;
    }

    public void setData (AT2ACCDI0028Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Distribution");
        driver.getTestdetails().setScreen("Exclusions maintenance");
    }

    protected String getElements (String key){
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData (String key){
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){

      //  if(!Exclusions_maintenance_category(driver)){return false;}
        if(!Exclusions_maintenance_binding(driver)){return false;}


     
        return false;
    }

    private boolean Exclusions_maintenance_binding (TestDriver driver){
        if(!Go_exclusions_maintenance_category_binding(driver)){return true;}
        if(!Exclusions_maintenance_category_binding_add(driver)){return true;}
        if(!Exclusions_maintenance_category_binding_search(driver)){return true;}
        return true;
    }

    private boolean Exclusions_maintenance_category_binding_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" SEARCH IN BINDING EXCLUSIONS MAINTENACE 2.0 ",3,false);


        return true;
    }

    private boolean Go_exclusions_maintenance_category_binding (TestDriver driver){
        String where;
        where= " on GO TO BINDING";
        driver.getReport().addHeader(" GO TO BINDING IN  EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"binding_tab", getElements("binding_tab")}, //element to click
                new String[]{"binding_b_add", getElements("binding_b_add")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}

        return true;
    }

    private boolean Exclusions_maintenance_category_binding_add (TestDriver driver){
        String where;
        where= " on ADD";
        driver.getReport().addHeader(" ADD IN BINDING EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"binding_b_add", getElements("binding_b_add")}, //element to click
                new String[]{"binding_i_add_reason", getElements("binding_i_add_reason")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        String sl_reason[] = {"Selling to B2C client", "TEST Other reasons",
                "Category","Reduced commission",
                "Direct contract with the hotel", "Price Differences", "Does not comply with Binding",
                "Client request", "Specific hotel request", "Signed by contract",
                "Technical issues", "Client pricing to be revised", "Administration request",
                 "B2B rate not valid for B2C clients"   };
        if (!Functions.selectTextRandom(driver,
                new String[]{"binding_i_add_reason", getElements("binding_i_add_reason")},
                sl_reason, "sl_reason", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"binding_i_add_start_date",getElements("binding_i_add_start_date")},
                "start_date", DataGenerator.getToday(driver,"dd/MM/yyyy"),  where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("binding_cb_add_main"),"main",true,true, where)){return false;}//where
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_ttoo",getElements("binding_lov_add_ttoo")}, // b_lov
                new String[]{"binding_i_add_ttoo", getElements("binding_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_ttoo_description", getElements("binding_i_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_market",getElements("binding_lov_add_market")}, // b_lov
                new String[]{"binding_i_add_market", getElements("binding_i_add_market")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market_country", //Data name
                where)){return false;}
        Functions.break_time(driver,10,500);
        if(!Functions.getValue(driver,new String[]{"binding_i_add_market_description", getElements("binding_i_add_market_description")}, // element path
                "market_country_description", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_hotel",getElements("binding_lov_add_hotel")}, // b_lov
                new String[]{"binding_i_add_hotel", getElements("binding_i_add_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        Functions.break_time(driver,10,500);
        if(!Functions.getValue(driver,new String[]{"binding_i_add_hotel_description", getElements("binding_i_add_hotel_description")}, // element path
                "hotel_country", // key for data value (the name)
                where)){return false;} // where this operation occurs
   /*     if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_chain",getElements("binding_lov_add_chain")}, // b_lov
                new String[]{"binding_i_add_chain", getElements("binding_i_add_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_des_cadena", getElements("binding_i_add_des_cadena")}, // element path
                "descadena", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_destination",getElements("binding_lov_add_destination")}, // b_lov
                new String[]{"binding_i_add_destination", getElements("binding_i_add_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_destination_description", getElements("binding_i_add_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_country",getElements("binding_lov_add_country")}, // b_lov
                new String[]{"binding_i_add_country", getElements("binding_i_add_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination_country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_country_description", getElements("binding_i_add_country_description")}, // element path
                "destination_country_description", // key for data value (the name)
                where)){return false;} // where this operation occurs*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"binding_b_add_save", getElements("binding_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }

    private boolean Exclusions_maintenance_category (TestDriver driver){
      if(!Exclusions_maintenance_category_add(driver)){return false;}
        if(!Exclusions_maintenance_category_search(driver)){return false;}
        if(!Exclusions_maintenance_category_edit(driver)){return false;}
        if(!Exclusions_maintenance_category_qbe(driver)){return false;}
        if(!Exclusions_maintenance_category_other_actions(driver)){return false;}
      /*  if(!Exclusions_maintenance_category_desactivated(driver)){return false;}*/
        if(!Exclusions_maintenance_category_delete(driver)){return false;}


        return true;
    }

   /* private boolean Exclusions_maintenance_category_desactivated (TestDriver driver){
        String where;
        where= " on DESACTIVATED";
        driver.getReport().addHeader(" DESACTIVATED IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"category_b_edit", getElements("category_b_edit")}, //element to click
                new String[]{"category_cb_add_active", getElements("category_cb_add_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("category_cb_add_active"),"active",false,true, where)){return false;}//where
        if(!Functions.checkClick(driver,
                new String[]{"category_inactive_b_ok", getElements("category_inactive_b_ok")}, //element to click
                new String[]{"category_cb_add_active", getElements("category_cb_add_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_desactivation_date", getElements("category_i_desactivation_date")}, // element path
                "desactivation_date", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_b_add_save", getElements("category_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"category_b_qbe_reset", getElements("category_b_qbe_reset")}, //element to click
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"category_i_search_desactivation_date",getElements("category_i_search_desactivation_date")},
                "desactivation_date", getData("desactivation_date"), where)){return false;}
       if(!Functions.clickSearchAndResult(driver,
                new String[]{"category_b_search", getElements("category_b_search")}, //search button
                new String[]{"category_e_result", getElements("category_e_result")}, //result element
                where)){return false;}

        if (!Functions.simpleClick(driver,
                new String[]{"category_b_reset", getElements("category_b_reset")}, //element to click
                where)){return false;}
           if (!Functions.insertInput(driver, new String[]{"category_i_qbe_desactivation_date",getElements("category_i_qbe_desactivation_date")},
                "desactivation_date", getData("desactivation_date"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"category_i_qbe_desactivation_date", getElements("category_i_qbe_desactivation_date")}, //any query input
                new String[]{"category_e_result", getElements("category_e_result")}, //table result
                where)){return false;} // where this operation occurs
        return true;
    }*/

    private boolean Exclusions_maintenance_category_delete (TestDriver driver){
        String where;
        where= " on DELTE";
        driver.getReport().addHeader(" DELTE IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"category_b_delete",getElements("category_b_delete")},
                new String[]{"category_n_records",getElements("category_n_records")},
                new String[]{"category_b_delete_b_ok",getElements("category_b_delete_b_ok")},
                where)){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_category_other_actions (TestDriver driver){
        String where;
        where= " on OTHER ACTIONS";
        driver.getReport().addHeader(" OTHER ACTIONS IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.auditData(driver,
                new String[]{"category_b_action",getElements("category_b_action")}, //actions button
                new String[]{"category_b_audit",getElements("category_b_audit")}, //audit button
                new String[]{"category_b_audit_b_ok",getElements("category_b_audit_b_ok")}, //audit_b_ok
                where)){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"category_b_detach",getElements("category_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }

        return true;
    }
    private boolean Exclusions_maintenance_category_qbe (TestDriver driver){
        String where;
        where= " on QBE";
        driver.getReport().addHeader(" QBE IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if (!Functions.simpleClick(driver,
                new String[]{"category_b_reset", getElements("category_b_reset")}, //element to click
                where)){return false;}
        if(!Functions.clickQbE(driver,
                new String[]{"category_b_qbe", getElements("category_b_qbe")},// query button
                new String[]{"category_i_qbe_reason", getElements("category_i_qbe_reason")},//any query input
                where)){return false;} // where the operation occurs

        if (!Functions.selectText(driver,
                new String[]{"category_i_qbe_reason",getElements("category_i_qbe_reason")},
                getData("sl_reason"), "sl_reason",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_start_date",getElements("category_i_qbe_start_date")},
                "start_date", getData("start_date"), where)){return false;}

        if (!Functions.selectText(driver,
                new String[]{"category_sel_qbe_active",getElements("category_sel_qbe_active")},
                getData("active"), "active",  where)){return false;}

     /*   if (!Functions.insertInput(driver, new String[]{"category_i_qbe_desactivation_date",getElements("category_i_qbe_desactivation_date")},
                "desactivation_date", getData("desactivation_date"), where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_ttoo",getElements("category_i_qbe_ttoo")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_category",getElements("category_i_qbe_category")},
                "category", getData("category"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_hotel_type",getElements("category_i_qbe_hotel_type")},
                "hotel_type", getData("hotel_type"), where)){return false;}

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"category_i_qbe_start_date", getElements("category_i_qbe_start_date")}, //any query input
                new String[]{"category_e_result", getElements("category_e_result")}, //table result
                where)){return false;} // where this operation occurs
        return true;
    }
    private boolean Exclusions_maintenance_category_edit (TestDriver driver){
       String where;
        where= " on EDIT";
        driver.getReport().addHeader(" ADD IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"category_b_edit", getElements("category_b_edit")}, //element to click
                new String[]{"category_cb_add_active", getElements("category_cb_add_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}

       String sl_reason[] = {"Sellin to B2C client", "TEST Other reasons",
                "Category","Reduced comission",
                "Direct contract with the hotel", "Price Differences", "Does not comply whith Binding",
                "Client request", "Specific hotel request", "Signed by contract",
                "Technical issues", "Client pricing to be revised", "Administration request", "Tes",
                "TEST", "Test reason", "B2B rate not valid for B2C clients"   };
        if (!Functions.selectTextRandom(driver,
                new String[]{"category_sl_reason", getElements("category_sl_reason")},
                sl_reason, "sl_reason", where)){return false;}

        if (!Functions.checkboxValue(driver,
                getElements("category_cb_add_active"),"active",true,true, where)){return false;}//where
   /*     if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_inactive_b_ok", getElements("category_inactive_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"category_i_desactivation_date", getElements("category_i_desactivation_date")}, // element path
                "desactivation_date", // key for data value (the name)
                where)){return false;} // where this operation occurs*/

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_ttoo",getElements("category_lov_add_ttoo")}, // b_lov
                new String[]{"category_i_add_ttoo", getElements("category_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}

        if(!Functions.getValue(driver,new String[]{"category_e_add_ttoo_description", getElements("category_e_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_category",getElements("category_lov_add_category")}, // b_lov
                new String[]{"category_i_add_category", getElements("category_i_add_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_category_description", getElements("category_i_add_category_description")}, // element path
                "category_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_hotel_type",getElements("category_lov_add_hotel_type")}, // b_lov
                new String[]{"category_i_add_hotel_type", getElements("category_i_add_hotel_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_type", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_hotel_type_description", getElements("category_i_add_hotel_type_description")}, // element path
                "hotel_type_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_b_add_save", getElements("category_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }

        return true;
    }
    private boolean Exclusions_maintenance_category_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" ADD IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if (!Functions.selectText(driver,
                new String[]{"category_i_search_reason",getElements("category_i_search_reason")},
                getData("sl_reason"), "sl_reason",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_start_date",getElements("category_i_search_start_date")},
                "start_date", getData("start_date"), where)){return false;}

        if (!Functions.createLovByValue(driver,
                new String[]{"category_lov_search_ttoo", getElements("category_lov_search_ttoo")}, //LoV button
                new String[]{"category_i_search_ttoo", getElements("category_i_search_ttoo")}, //external LoV input
                new String[]{"category_i_search_ttoo_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("tto"), // value to search
                "tto", //name of the data
                 where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_ttoo_description",getElements("category_i_search_ttoo_description")},
                "tto_description", getData("tto_description"), where)){return false;}

        if (!Functions.createLovByValue(driver,
                new String[]{"category_lov_search_category", getElements("category_lov_search_category")}, //LoV button
                new String[]{"category_i_search_category", getElements("category_i_search_category")}, //external LoV input
                new String[]{"input", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("category"), // value to search
                "category", //name of the data
                  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_category_description",getElements("category_i_search_category_description")},
                "category_description", getData("category_description"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"category_lov_search_hotel_type", getElements("category_lov_search_hotel_type")}, //LoV button
                new String[]{"category_i_search_hotel_type", getElements("category_i_search_hotel_type")}, //external LoV input
                new String[]{"input", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel_type"), // value to search
                "hotel_type", //name of the data
                 where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_hotel_type_description",getElements("category_i_search_hotel_type_description")},
                "hotel_type_description", getData("hotel_type_description"), where)){return false;}

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"category_b_search", getElements("category_b_search")}, //search button
                new String[]{"category_e_result", getElements("category_e_result")}, //result element
                 where)){return false;}
        return true;
    }
    private boolean Exclusions_maintenance_category_add (TestDriver driver){
       String where;

        where= " on ADD";
        driver.getReport().addHeader(" ADD IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"category_b_add", getElements("category_b_add")}, //element to click
                new String[]{"category_sl_reason", getElements("category_sl_reason")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                 where)){return false;}

        String sl_reason[] = {"Selling to B2C client", "TEST Other reasons",
                "Category","Reduced commission",
                "Direct contract with the hotel", "Price Differences", "Does not comply with Binding",
                "Client request", "Specific hotel request", "Signed by contract",
                "Technical issues", "Client pricing to be revised", "Administration request", "Tes",
                "TEST", "Test reason", "B2B rate not valid for B2C clients"   };
        if (!Functions.selectTextRandom(driver,
                new String[]{"category_sl_reason", getElements("category_sl_reason")},
                sl_reason, "sl_reason", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_add_start_date",getElements("category_i_add_start_date")},
                "start_date", DataGenerator.getToday(driver,"dd/MM/yyyy"),  where)){return false;}

        if (!Functions.checkboxValue(driver,
                getElements("category_cb_add_active"),"active",true,true, where)){return false;}//where

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_ttoo",getElements("category_lov_add_ttoo")}, // b_lov
                new String[]{"category_i_add_ttoo", getElements("category_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}

        if(!Functions.getValue(driver,new String[]{"category_e_add_ttoo_description", getElements("category_e_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_category",getElements("category_lov_add_category")}, // b_lov
                new String[]{"category_i_add_category", getElements("category_i_add_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_category_description", getElements("category_i_add_category_description")}, // element path
                "category_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_hotel_type",getElements("category_lov_add_hotel_type")}, // b_lov
                new String[]{"category_i_add_hotel_type", getElements("category_i_add_hotel_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_type", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_hotel_type_description", getElements("category_i_add_hotel_type_description")}, // element path
                "hotel_type_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_b_add_save", getElements("category_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }


}
