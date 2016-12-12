package screen.AT2MDMCL0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * SELECT TEXT
         */
        elements.put("derivation_sl_type", "//*[contains(@id, '1:soc1::content')]");
        /**
         * TABLE INPUTS
         */
        //GENERALS
        elements.put("inputs_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("inputs_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("inputs_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("inputs_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("inputs_b_actions_rules", "//*[contains(@id, 'pcgm1:dc_cmi2')]/td[2]");
        elements.put("inputs_b_actions_rules_cancel", "//*[contains(@id, 'd2::cancel')]");
      //  elements.put("inputs_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("inputs_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("inputs_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("inputs_e_records", "//*[contains(@id, 'pc1:id1')]");
        elements.put("inputs_b_ok_delete", "//*[contains(@id, 'dialogConfirmDelete::yes')]");
        /**
         * SELECT CL_Activate_WebPrepayment_DR
         */
        //SEARCH
        elements.put("search_b_show_search", "//*[contains(@id, 'pb2::_afrDscl')]");
        elements.put("search_b_search", "//*[contains(@id, 'cb1')]");
        elements.put("search_i_commercial_brand", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_customer_connectivity", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_source_market", "//*[contains(@id, '2:soc6::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt1:boton_commit')]");
        elements.put("add_i_commercial_brand", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_customer_connectivity", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_source_market", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_collections_company", "//*[contains(@id, 'it25::content')]");
        /**
         * RULES CHANGE
         */
        //GENERALS
        elements.put("rules_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("rules_b_detach", "//*[contains(@id, 'r4:0:pc1:_dchTbr')]/a");
        elements.put("rules_e_result", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        //QBE
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("qbe_i_date", "//*[contains(@id, 'pc1:t1:id1::content')]");
        elements.put("qbe_i_rule", "//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        elements.put("qbe_i_type", "//*[contains(@id, 'pc1_afr_t1_afr_c3::content')]");
        elements.put("qbe_i_original", "//*[contains(@id, 'pc1_afr_t1_afr_c6::content')]");
        elements.put("qbe_i_new", "//*[contains(@id, 'pc1_afr_t1_afr_c1::content')]");
        //TABLE
        elements.put("table_i_user", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("table_i_date", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[2]");
        elements.put("table_i_rule", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[3]");
        elements.put("table_i_type", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[4]");
        elements.put("table_i_original", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[5]");
        elements.put("table_i_new", "//*[contains(@id, 'r4:0:pc1:t1::db')]/table/tbody/tr[1]/td[6]");
        /**
         * SELECT CL_WebUser_DR
         */
        //SEARCH
        elements.put("search_i_commercial_country", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_commercial_brand2", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_customer_connectivity2", "//*[contains(@id, '2:soc6::content')]");
        elements.put("search_i_commercial_province", "//*[contains(@id, '3:soc6::content')]");
        elements.put("search_i_direct_hotel", "//*[contains(@id, '4:soc6::content')]");
        elements.put("search_i_web_user", "//*[contains(@id, '5:soc6::content')]");
        elements.put("search_i_type_widget", "//*[contains(@id, '6:soc6::content')]");
        elements.put("search_i_hotelextras", "//*[contains(@id, '7:soc6::content')]");
        elements.put("search_i_princing", "//*[contains(@id, '8:soc6::content')]");
        elements.put("search_i_hotelmodel", "//*[contains(@id, '9:soc6::content')]");
        //ADD
        elements.put("add_i_commercial_country", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_commercial_brand2", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_customer_connectivity2", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_comercial_province", "//*[contains(@id, '3:it5::content')]");
        elements.put("add_i_direct_hotel", "//*[contains(@id, '4:it5::content')]");
        elements.put("add_i_web_user", "//*[contains(@id, '5:it5::content')]");
        elements.put("add_i_type_widget", "//*[contains(@id, '6:it5::content')]");
        elements.put("add_i_hotelextras", "//*[contains(@id, '7:it5::content')]");
        elements.put("add_i_princing", "//*[contains(@id, '8:it5::content')]");
        elements.put("add_i_hotelmodel", "//*[contains(@id, '9:it5::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'it25::content')]");
        elements.put("add_i_web", "//*[contains(@id, 'it62::content')]");
        elements.put("edit_i_commercial_country", "//*[contains(@id, '1:it5::content')]");
        elements.put("edit_i_commercial_brand2", "//*[contains(@id, '2:it5::content')]");
        elements.put("edit_i_customer_connectivity2", "//*[contains(@id, '3:it5::content')]");
        elements.put("edit_i_comercial_province", "//*[contains(@id, '4:it5::content')]");
        elements.put("edit_i_direct_hotel", "//*[contains(@id, '5:it5::content')]");
        elements.put("edit_i_web_user", "//*[contains(@id, '6:it5::content')]");
        elements.put("edit_i_type_widget", "//*[contains(@id, '7:it5::content')]");
        elements.put("edit_i_hotelextras", "//*[contains(@id, '8:it5::content')]");
        elements.put("edit_i_princing", "//*[contains(@id, '9:it5::content')]");
        elements.put("edit_i_hotelmodel", "//*[contains(@id, '0:it5::content')]");
        /**
         * SELECT CL_WebUser_Cbranch_DR
         */
        //SEARCH
        elements.put("search_i_commercial_country3", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_commercial_brand3", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_customer_connectivity3", "//*[contains(@id, '2:soc6::content')]");
        elements.put("search_i_commercial_province3", "//*[contains(@id, '3:soc6::content')]");
        elements.put("search_i_direct_hotel3", "//*[contains(@id, '4:soc6::content')]");
        elements.put("search_i_web_user3", "//*[contains(@id, '5:soc6::content')]");
        elements.put("search_i_hotelextras3", "//*[contains(@id, '6:soc6::content')]");
        //ADD
        elements.put("add_i_commercial_country3", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_commercial_brand3", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_customer_connectivity3", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_comercial_province3", "//*[contains(@id, '3:it5::content')]");
        elements.put("add_i_direct_hotel3", "//*[contains(@id, '4:it5::content')]");
        elements.put("add_i_web_user3", "//*[contains(@id, '5:it5::content')]");
        elements.put("add_i_hotelextras3", "//*[contains(@id, '6:it5::content')]");
        elements.put("add_i_interface3", "//*[contains(@id, 'it25::content')]");
        elements.put("add_i_web3", "//*[contains(@id, 'it62::content')]");
        /**
         * SELECT CL_WebUser_Dbranch_DR
         */
        //SEARCH
        elements.put("search_i_commercial_country4", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_commercial_brand4", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_customer_connectivity4", "//*[contains(@id, '2:soc6::content')]");
        elements.put("search_i_commercial_province4", "//*[contains(@id, '3:soc6::content')]");
        elements.put("search_i_direct_hotel4", "//*[contains(@id, '4:soc6::content')]");
        elements.put("search_i_web_user4", "//*[contains(@id, '5:soc6::content')]");
        elements.put("search_i_type_widget4", "//*[contains(@id, '6:soc6::content')]");
        elements.put("search_i_hotelextras4", "//*[contains(@id, '7:soc6::content')]");
        //ADD
        elements.put("add_i_commercial_country4", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_commercial_brand4", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_customer_connectivity4", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_comercial_province4", "//*[contains(@id, '3:it5::content')]");
        elements.put("add_i_direct_hotel4", "//*[contains(@id, '4:it5::content')]");
        elements.put("add_i_web_user4", "//*[contains(@id, '5:it5::content')]");
        elements.put("add_i_type_widget4", "//*[contains(@id, '6:it5::content')]");
        elements.put("add_i_hotelextras4", "//*[contains(@id, '7:it5::content')]");
        elements.put("add_i_interface4", "//*[contains(@id, 'it25::content')]");
        elements.put("add_i_web4", "//*[contains(@id, 'it62::content')]");
        /**
         * SELECT CL_HX2_SAPCode_DR
         */
        //SEARCH
        elements.put("search_i_invoicing", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_office", "//*[contains(@id, '1:soc6::content')]");
        //ADD
        elements.put("add_i_invoicing", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_office", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_sap", "//*[contains(@id, 'it25::content')]");
        /**
         * SELECT SP_AdministrativeSupplier_DR
         */
        //SEARCH
        elements.put("search_i_supplier", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_sup_sub", "//*[contains(@id, '1:soc6::content')]");
        //ADD
        elements.put("add_i_supplier", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_sup_sub", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_adm", "//*[contains(@id, 'it25::content')]");
        /**
         * SELECT SP_SAPSupplier_DR
         */
        //SEARCH
        elements.put("search_i_atlas_c", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_atlas_o", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_sap_c", "//*[contains(@id, '2:soc6::content')]");
        elements.put("search_i_adm_s", "//*[contains(@id, '3:soc6::content')]");
        //ADD
        elements.put("add_i_atlas_c", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_atlas_o", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_sap_c", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_adm_s", "//*[contains(@id, '3:it5::content')]");
        elements.put("add_i_sap_group", "//*[contains(@id, '0:it25::content')]");
        elements.put("add_i_account", "//*[contains(@id, '1:it25::content')]");
        elements.put("add_i_pay", "//*[contains(@id, '2:it25::content')]");
        elements.put("add_i_credit", "//*[contains(@id, '3:it25::content')]");


        /**
         * SELECT SP_SupplierClassification_DR
         */
        //SEARCH
        elements.put("search_i_supplier10", "//*[contains(@id, '0:soc6::content')]");
        //ADD
        elements.put("add_i_supplier10", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_supplier_c_10", "//*[contains(@id, 'it25::content')]");


        /**
         * SELECT CL_SAPCustomerGroup_DR
         */
        //SEARCH
        elements.put("search_i_relation", "//*[contains(@id, '0:soc6::content')]");
        //ADD
        elements.put("add_i_relation", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_grupo", "//*[contains(@id, 'it25::content')]");
        /**
         * SELECT CL_SAPCustomer_DR
         */
        //SEARCH
        elements.put("search_i_relation14", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_grupo14", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_adm_type", "//*[contains(@id, '2:soc6::content')]");
        //ADD
        elements.put("add_i_relation14", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_grupo14", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_adm_type", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_sap_a_group", "//*[contains(@id, '0:it25::content')]");
        elements.put("add_i_adm_clas", "//*[contains(@id, '1:it25::content')]");
        /**
         * SELECT CL_Extensions_DR
         */
        //SEARCH
        elements.put("search_i_duplicity", "//*[contains(@id, '0:soc6::content')]");
        //ADD
        elements.put("add_i_duplicity", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_ck_sap", "//*[contains(@id, 'sbc2::content')]");
        /**
         * TABLE OUTPUTS
         */
        //GENERALS
        elements.put("outputs_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("outputs_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("outputs_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("outputs_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("outputs_e_result", "//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("outputs_e_records", "//*[contains(@id, 'pc2:id2')]");
        elements.put("outputs_b_ok_delete", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        /**
         * SELECT CL_Activate_WebPrepayment_DR
         */
        //EDIT
        elements.put("add_b_save2", "//*[contains(@id, 'r1:0:pcgt1:boton_commit')]");
        elements.put("edit_i_collections_company", "//*[contains(@id, 'it5::content')]");
        /**
         * SELECT CL_WebUser_DR,  CL_WebUser_Cbranch_DR Y CL_WebUser_Dbranch_DR
         */
        //EDIT
        elements.put("edit_i_interface", "//*[contains(@id, 'it5::content')]");
        elements.put("edit_i_web", "//*[contains(@id, 'it6::content')]");
        /**
         * SELECT CL_HX2_SAPCode_DR
         */
        //EDIT
        elements.put("edit_i_sap", "//*[contains(@id, 'it5::content')]");
        /**
         * SELECT SP_AdministrativeSupplier_DR
         */
        //EDIT
        elements.put("edit_i_adm", "//*[contains(@id, 'it5::content')]");
        /**
         * SELECT SP_SAPSupplier_DR
         */
        //EDIT
        elements.put("edit_i_sap_group", "//*[contains(@id, '0:it5::content')]");
        elements.put("edit_i_account", "//*[contains(@id, '1:it5::content')]");
        elements.put("edit_i_pay", "//*[contains(@id, '2:it5::content')]");
        elements.put("edit_i_credit", "//*[contains(@id, '3:it5::content')]");



        /**
         * SELECT SP_SupplierClassification_DR
         */
        //EDIT
        elements.put("edit_i_supplier_c_10", "//*[contains(@id, 'it5::content')]");


        /**
         * SELECT CL_SAPCustomerGroup_DR
         */
        //EDIT
        elements.put("edit_i_grupo", "//*[contains(@id, 'it5::content')]");
        /**
         * SELECT CL_SAPCustomer_DR
         */
        //EDIT
        elements.put("edit_i_sap_a_group", "//*[contains(@id, '0:it5::content')]");
        elements.put("edit_i_adm_clas", "//*[contains(@id, '1:it5::content')]");
        /**
         * SELECT CL_Extensions_DR
         */
        //EDIT
        elements.put("edit_ck_sap", "//*[contains(@id, 'sbc1::content')]");
    }
    
}
