package screen.AT2MDMCL0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0003Locators(String enviroment) {
        setElements(enviroment);
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements(String entorno) {
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

        if (entorno.equalsIgnoreCase("sis")) {
            //region CL_Activate_WebPrepayment_DR
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
            elements.put("add_i_collections_company", "//*[contains(@id, '0:it25::content')]");
            //endregion

            //region CL_WebUser_DR
            /**
             * SELECT CL_WebUser_DR
             */
            //SEARCH
            elements.put("search_i_commercial_country", "//*[contains(@id, '3:soc6::content')]");
            elements.put("search_i_commercial_brand2", "//*[contains(@id, '4:soc6::content')]");
            elements.put("search_i_customer_connectivity2", "//*[contains(@id, '5:soc6::content')]");
            elements.put("search_i_commercial_province", "//*[contains(@id, '6:soc6::content')]");
            elements.put("search_i_direct_hotel", "//*[contains(@id, '7:soc6::content')]");
            elements.put("search_i_web_user", "//*[contains(@id, '8:soc6::content')]");
            elements.put("search_i_type_widget", "//*[contains(@id, '9:soc6::content')]");
            elements.put("search_i_hotelextras", "//*[contains(@id, '10:soc6::content')]");
            elements.put("search_i_princing", "//*[contains(@id, '11:soc6::content')]");
            //ADD
            elements.put("add_i_commercial_country", "//*[contains(@id, '3:it5::content')]");
            elements.put("add_i_commercial_brand2", "//*[contains(@id, '4:it5::content')]");
            elements.put("add_i_customer_connectivity2", "//*[contains(@id, '5:it5::content')]");
            elements.put("add_i_comercial_province", "//*[contains(@id, '6:it5::content')]");
            elements.put("add_i_direct_hotel", "//*[contains(@id, '7:it5::content')]");
            elements.put("add_i_web_user", "//*[contains(@id, '8:it5::content')]");
            elements.put("add_i_type_widget", "//*[contains(@id, '9:it5::content')]");
            elements.put("add_i_hotelextras", "//*[contains(@id, '10:it5::content')]");
            elements.put("add_i_princing", "//*[contains(@id, '11:it5::content')]");
            elements.put("add_i_interface", "//*[contains(@id, '1:it25::content')]");
            elements.put("add_i_web", "//*[contains(@id, 'it62::content')]");
            //endregion

            //region CL_WebUser_Cbranch_DR
            /**
             * SELECT
             */
            //SEARCH
            elements.put("search_i_commercial_country3", "//*[contains(@id, '12:soc6::content')]");
            elements.put("search_i_commercial_brand3", "//*[contains(@id, '13:soc6::content')]");
            elements.put("search_i_customer_connectivity3", "//*[contains(@id, '14:soc6::content')]");
            elements.put("search_i_commercial_province3", "//*[contains(@id, '15:soc6::content')]");
            elements.put("search_i_direct_hotel3", "//*[contains(@id, '16:soc6::content')]");
            elements.put("search_i_web_user3", "//*[contains(@id, '17:soc6::content')]");
            //ADD
            elements.put("add_i_commercial_country3", "//*[contains(@id, '12:it5::content')]");
            elements.put("add_i_commercial_brand3", "//*[contains(@id, '13:it5::content')]");
            elements.put("add_i_customer_connectivity3", "//*[contains(@id, '14:it5::content')]");
            elements.put("add_i_comercial_province3", "//*[contains(@id, '15:it5::content')]");
            elements.put("add_i_direct_hotel3", "//*[contains(@id, '16:it5::content')]");
            elements.put("add_i_web_user3", "//*[contains(@id, '17:it5::content')]");
            elements.put("add_i_interface3", "//*[contains(@id, '3:it25::content')]");
            elements.put("add_i_web3", "//*[contains(@id, 'it62::content')]");
            //endregion

            //region CL_WebUser_Dbranch_DR
            /**
             * SELECT CL_WebUser_Dbranch_DR
             */
            //SEARCH
            elements.put("search_i_commercial_country4", "//*[contains(@id, '18:soc6::content')]");
            elements.put("search_i_commercial_brand4", "//*[contains(@id, '19:soc6::content')]");
            elements.put("search_i_customer_connectivity4", "//*[contains(@id, '20:soc6::content')]");
            elements.put("search_i_commercial_province4", "//*[contains(@id, '21:soc6::content')]");
            elements.put("search_i_direct_hotel4", "//*[contains(@id, '22:soc6::content')]");
            elements.put("search_i_web_user4", "//*[contains(@id, '23:soc6::content')]");
            elements.put("search_i_type_widget4", "//*[contains(@id, '24:soc6::content')]");
            //ADD
            elements.put("add_i_commercial_country4", "//*[contains(@id, '18:it5::content')]");
            elements.put("add_i_commercial_brand4", "//*[contains(@id, '19:it5::content')]");
            elements.put("add_i_customer_connectivity4", "//*[contains(@id, '20:it5::content')]");
            elements.put("add_i_comercial_province4", "//*[contains(@id, '21:it5::content')]");
            elements.put("add_i_direct_hotel4", "//*[contains(@id, '22:it5::content')]");
            elements.put("add_i_web_user4", "//*[contains(@id, '23:it5::content')]");
            elements.put("add_i_type_widget4", "//*[contains(@id, '24:it5::content')]");
            elements.put("add_i_interface4", "//*[contains(@id, '5:it25::content')]");
            elements.put("add_i_web4", "//*[contains(@id, 'it62::content')]");
            //endregion

            //region CL_HX2_SAPCode_DR
            /**
             * SELECT CL_HX2_SAPCode_DR
             */
            //SEARCH
            elements.put("search_i_invoicing", "//*[contains(@id, '25:soc6::content')]");
            elements.put("search_i_office", "//*[contains(@id, '26:soc6::content')]");
            //ADD
            elements.put("add_i_invoicing", "//*[contains(@id, '25:it5::content')]");
            elements.put("add_i_office", "//*[contains(@id, '26:it5::content')]");
            elements.put("add_i_sap", "//*[contains(@id, '7:it25::content')]");
            //endregion

            //region SP_AdministrativeSupplier_DR
            /**
             * SELECT SP_AdministrativeSupplier_DR
             */
            //SEARCH
            elements.put("search_i_supplier", "//*[contains(@id, '27:soc6::content')]");
            elements.put("search_i_sup_sub", "//*[contains(@id, '28:soc6::content')]");
            //ADD
            elements.put("add_i_supplier", "//*[contains(@id, '27:it5::content')]");
            elements.put("add_i_sup_sub", "//*[contains(@id, '28:it5::content')]");
            elements.put("add_i_adm", "//*[contains(@id, '8:it25::content')]");
            //endregion

            //region SP_SAPSupplier_DR
            /**
             * SELECT SP_SAPSupplier_DR
             */
            //SEARCH
            elements.put("search_i_atlas_c", "//*[contains(@id, '29:soc6::content')]");
            elements.put("search_i_atlas_o", "//*[contains(@id, '30:soc6::content')]");
            elements.put("search_i_sap_c", "//*[contains(@id, '31:soc6::content')]");
            elements.put("search_i_adm_s", "//*[contains(@id, '32:soc6::content')]");
            //ADD
            elements.put("add_i_atlas_c", "//*[contains(@id, '29:it5::content')]");
            elements.put("add_i_atlas_o", "//*[contains(@id, '30:it5::content')]");
            elements.put("add_i_sap_c", "//*[contains(@id, '31:it5::content')]");
            elements.put("add_i_adm_s", "//*[contains(@id, '32:it5::content')]");
            elements.put("add_i_sap_group", "//*[contains(@id, '9:it25::content')]");
            elements.put("add_i_account", "//*[contains(@id, '10:it25::content')]");
            elements.put("add_i_pay", "//*[contains(@id, '11:it25::content')]");
            elements.put("add_i_credit", "//*[contains(@id, '12:it25::content')]");
            //endregion

            //region SP_SAPCustomer_DR
            /**
             * SELECT SP_SAPCustomer_DR
             */
            //SEARCH
            elements.put("search_i_bussiness", "//*[contains(@id, '33:soc6::content')]");
            elements.put("search_i_atlas_o_c", "//*[contains(@id, '34:soc6::content')]");
            elements.put("search_i_atlas_o_o", "//*[contains(@id, '35:soc6::content')]");
            //ADD
            elements.put("add_i_bussiness", "//*[contains(@id, '33:it5::content')]");
            elements.put("add_i_atlas_o_c", "//*[contains(@id, '34:it5::content')]");
            elements.put("add_i_atlas_o_o", "//*[contains(@id, '35:it5::content')]");
            elements.put("add_i_payments8", "//*[contains(@id, '13:it25::content')]");
            elements.put("add_i_credit8", "//*[contains(@id, '14:it25::content')]");
            elements.put("add_i_sap8", "//*[contains(@id, '15:it25::content')]");
            elements.put("add_i_gl", "//*[contains(@id, '16:it25::content')]");
            elements.put("add_i_class", "//*[contains(@id, '17:it25::content')]");
            elements.put("add_i_comercial8", "//*[contains(@id, '18:it25::content')]");
            elements.put("add_i_treasury", "//*[contains(@id, '19:it25::content')]");
            elements.put("add_i_save", "//*[contains(@id, '20:it25::content')]");
            elements.put("add_i_payment_m", "//*[contains(@id, '21:it25::content')]");
            elements.put("add_i_ar", "//*[contains(@id, '22:it25::content')]");
            elements.put("add_i_dunning_p", "//*[contains(@id, '23:it25::content')]");
            elements.put("add_i_dunning_b", "//*[contains(@id, '24:it25::content')]");
            elements.put("add_i_account8", "//*[contains(@id, '25:it25::content')]");
            //endregion

            //region SP_ICs_DR
            /**
             * SELECT SP_ICs_DR
             */
            //SEARCH
            elements.put("search_i_adm_sup", "//*[contains(@id, '36:soc6::content')]");
            elements.put("search_i_atlas_o_c9", "//*[contains(@id, 37:soc6::content')]");
            elements.put("search_i_atlas_o_o9", "//*[contains(@id, '38:soc6::content')]");
            elements.put("search_i_account9", "//*[contains(@id, '39:soc6::content')]");
            elements.put("search_i_management", "//*[contains(@id, '40:soc6::content')]");
            elements.put("search_i_hotel_chain", "//*[contains(@id, '41:soc6::content')]");
            elements.put("search_i_brand", "//*[contains(@id, '42:soc6::content')]");
            //ADD
            elements.put("add_i_adm_sup", "//*[contains(@id, '36:it5::content')]");
            elements.put("add_i_atlas_o_c9", "//*[contains(@id, '37:it5::content')]");
            elements.put("add_i_atlas_o_o9", "//*[contains(@id, '38:it5::content')]");
            elements.put("add_i_account9", "//*[contains(@id, '39:it5::content')]");
            elements.put("add_i_management", "//*[contains(@id, '40:it5::content')]");
            elements.put("add_i_hotel_chain", "//*[contains(@id, '41:it5::content')]");
            elements.put("add_i_brand", "//*[contains(@id, '42:it5::content')]");
            elements.put("add_i_ap_s", "//*[contains(@id, '26:it25::content')]");
            elements.put("add_i_ap_g", "//*[contains(@id, '27:it25::content')]");
            elements.put("add_i_ap_a", "//*[contains(@id, '28:it25::content')]");
            elements.put("add_i_chain", "//*[contains(@id, '29:it25::content')]");
            //endregion

            //region SP_SupplierClassification_DR
            /**
             * SELECT SP_SupplierClassification_DR
             */
            //SEARCH
            elements.put("search_i_supplier10", "//*[contains(@id, '43:soc6::content')]");
            //ADD
            elements.put("add_i_supplier10", "//*[contains(@id, '43:it5::content')]");
            elements.put("add_i_supplier_c_10", "//*[contains(@id, '30:it25::content')]");
            //endregion

            //region CL_Administrative_classification_DR
            /**
             * SELECT CL_Administrative_classification_DR
             */
            //SEARCH
            elements.put("search_i_source", "//*[contains(@id, '44:soc6::content')]");
            elements.put("search_i_customer", "//*[contains(@id, '45:soc6::content')]");
            elements.put("search_i_comercial_b", "//*[contains(@id, '46:soc6::content')]");
            elements.put("search_i_white", "//*[contains(@id, '47:soc6::content')]");
            elements.put("search_i_connectivity", "//*[contains(@id, '48:soc6::content')]");
            //ADD
            elements.put("add_i_source", "//*[contains(@id, '44:it5::content')]");
            elements.put("add_i_customer", "//*[contains(@id, '45:it5::content')]");
            elements.put("add_i_comercial_b", "//*[contains(@id, '46:it5::content')]");
            elements.put("add_i_white", "//*[contains(@id, '47:it5::content')]");
            elements.put("add_i_connectivity", "//*[contains(@id, '48:it5::content')]");
            elements.put("add_i_adm_cust", "//*[contains(@id, '31:it25::content')]");
            //endregion

            //region CL_InvoicingCompanies_DR
            /**
             * SELECT CL_InvoicingCompanies_DR
             */
            //SEARCH
            elements.put("search_i_adm_class", "//*[contains(@id, '49:soc6::content')]");
            elements.put("search_i_c_brand", "//*[contains(@id, '50:soc6::content')]");
            elements.put("search_i_pais", "//*[contains(@id, '51:soc6::content')]");
            elements.put("search_i_hotel_pay", "//*[contains(@id, '52:soc6::content')]");
            elements.put("search_i_provincia", "//*[contains(@id, '53:soc6::content')]");
            elements.put("search_i_fiscal", "//*[contains(@id, '54:soc6::content')]");
            elements.put("search_i_asia", "//*[contains(@id, '55:soc6::content')]");
            elements.put("search_i_white12", "//*[contains(@id, '56:soc6::content')]");
            elements.put("search_i_cust_con12", "//*[contains(@id, '57:soc6::content')]");
            elements.put("search_i_princing12", "//*[contains(@id, '58:soc6::content')]");
            elements.put("search_i_type", "//*[contains(@id, '59:soc6::content')]");
            elements.put("search_i_adquisition", "//*[contains(@id, '60:soc6::content')]");
            //ADD
            elements.put("add_i_adm_class", "//*[contains(@id, '49:it5::content')]");
            elements.put("add_i_c_brand", "//*[contains(@id, '50:it5::content')]");
            elements.put("add_i_pais", "//*[contains(@id, '51:it5::content')]");
            elements.put("add_i_hotel_pay", "//*[contains(@id, '52:it5::content')]");
            elements.put("add_i_provincia", "//*[contains(@id, '53:it5::content')]");
            elements.put("add_i_fiscal", "//*[contains(@id, '54:it5::content')]");
            elements.put("add_i_asia", "//*[contains(@id, '55:it5::content')]");
            elements.put("add_i_white12", "//*[contains(@id, '56:it5::content')]");
            elements.put("add_i_cust_con12", "//*[contains(@id, '57:it5::content')]");
            elements.put("add_i_princing12", "//*[contains(@id, '58:it5::content')]");
            elements.put("add_i_type", "//*[contains(@id, '59:it5::content')]");
            elements.put("add_i_adquisition", "//*[contains(@id, '60:it5::content')]");
            elements.put("add_i_credito", "//*[contains(@id, '32:it25::content')]");
            elements.put("add_i_credito_g", "//*[contains(@id, '33:it25::content')]");
            elements.put("add_i_c_saldo", "//*[contains(@id, '34:it25::content')]");
            elements.put("add_i_credito_t", "//*[contains(@id, '35:it62::content')]");
            elements.put("add_i_empresa", "//*[contains(@id, '36:it25::content')]");
            elements.put("add_i_oficina", "//*[contains(@id, '37:it25::content')]");
            elements.put("add_i_canal", "//*[contains(@id, '38:it25::content')]");
            elements.put("add_i_d_factura", "//*[contains(@id, '39:it25::content')]");
            elements.put("add_i_d_reserva", "//*[contains(@id, '40:it25::content')]");
            elements.put("add_i_c_divisa", "//*[contains(@id, '41:it25::content')]");
            elements.put("add_i_check", "//*[contains(@id, '42:it25::content')]");
            elements.put("add_i_imp_c", "//*[contains(@id, '43:it25::content')]");
            elements.put("add_i_imp_r", "//*[contains(@id, '44:it25::content')]");
            elements.put("add_i_class_o", "//*[contains(@id, '45:it25::content')]");
            elements.put("add_i_class_rap", "//*[contains(@id, '46:it25::content')]");
            elements.put("add_i_tipo_com", "//*[contains(@id, '47:it25::content')]");
            elements.put("add_i_tipo_rap", "//*[contains(@id, '48:it25::content')]");
            elements.put("add_i_pais_o", "//*[contains(@id, '49:it25::content')]");
            elements.put("add_i_divisa_res", "//*[contains(@id, '50:it25::content')]");
            elements.put("add_i_imp_cred", "//*[contains(@id, '51:it25::content')]");
            elements.put("add_i_divisa_cred", "//*[contains(@id, '52:it25::content')]");
            elements.put("add_i_traslados", "//*[contains(@id, '53:it25::content')]");
            elements.put("add_i_ent_sal", "//*[contains(@id, '54:it25::content')]");
            elements.put("add_i_venta", "//*[contains(@id, '55:it25::content')]");
            elements.put("add_i_ind_p", "//*[contains(@id, '56:it25::content')]");
            elements.put("add_i_ind_v", "//*[contains(@id, '57:it25::content')]");
            elements.put("add_i_ind_pc", "//*[contains(@id, '58:it25::content')]");
            elements.put("add_i_ind_tpv", "//*[contains(@id, '59:it25::content')]");
            elements.put("add_i_ind_tr", "//*[contains(@id, '60:it25::content')]");
            elements.put("add_i_one", "//*[contains(@id, '61:it25::content')]");
            elements.put("add_i_atlas_r", "//*[contains(@id, '62:it25::content')]");
            elements.put("add_i_ref_o", "//*[contains(@id, '63:it25::content')]");
            elements.put("add_i_cli_pro", "//*[contains(@id, '64:it25::content')]");
            //endregion

            //region CL_SAPCustomerGroup_DR
            /**
             * SELECT CL_SAPCustomerGroup_DR
             */
            //SEARCH
            elements.put("search_i_relation", "//*[contains(@id, '61:soc6::content')]");
            //ADD
            elements.put("add_i_relation", "//*[contains(@id, '61:it5::content')]");
            elements.put("add_i_grupo", "//*[contains(@id, '65:it25::content')]");
            //endregion

            //region CL_SAPCustomer_DR
            /**
             * SELECT CL_SAPCustomer_DR
             */
            //SEARCH
            elements.put("search_i_relation14", "//*[contains(@id, '62:soc6::content')]");
            elements.put("search_i_grupo14", "//*[contains(@id, '63:soc6::content')]");
            elements.put("search_i_adm_type", "//*[contains(@id, '64:soc6::content')]");
            //ADD
            elements.put("add_i_relation14", "//*[contains(@id, '62:it5::content')]");
            elements.put("add_i_grupo14", "//*[contains(@id, '63:it5::content')]");
            elements.put("add_i_adm_type", "//*[contains(@id, '64:it5::content')]");
            elements.put("add_i_sap_a_group", "//*[contains(@id, '66:it25::content')]");
            elements.put("add_i_adm_clas", "//*[contains(@id, '67:it25::content')]");
            //endregion

            //region CL_SAPSupplier_DR
            /**
             * SELECT CL_SAPSupplier_DR
             */
            //SEARCH
            elements.put("search_i_pago_h", "//*[contains(@id, '65:soc6::content')]");
            elements.put("search_i_white15", "//*[contains(@id, '66:soc6::content')]");
            elements.put("search_i_pais_cli", "//*[contains(@id, '67:soc6::content')]");
            elements.put("search_i_adm_cus", "//*[contains(@id, '68:soc6::content')]");
            //ADD
            elements.put("add_i_pago_h", "//*[contains(@id, '65:it5::content')]");
            elements.put("add_i_white15", "//*[contains(@id, '66:it5::content')]");
            elements.put("add_i_pais_cli", "//*[contains(@id, '37:it5::content')]");
            elements.put("add_i_adm_cus", "//*[contains(@id, '68:it5::content')]");
            elements.put("add_i_g_cuenta", "//*[contains(@id, '68:it25::content')]");
            elements.put("add_i_c_associada", "//*[contains(@id, '69:it25::content')]");
            elements.put("add_i_clave", "//*[contains(@id, '70:it25::content')]");
            elements.put("add_i_grupo15", "//*[contains(@id, '71:it25::content')]");
            elements.put("add_i_condi", "//*[contains(@id, '72:it25::content')]");
            elements.put("add_i_condi_abono", "//*[contains(@id, '73:it25::content')]");
            elements.put("add_i_ver", "//*[contains(@id, '74:it25::content')]");
            elements.put("add_i_via", "//*[contains(@id, '75:it25::content')]");
            elements.put("add_i_bloqueo", "//*[contains(@id, '76:it25::content')]");
            elements.put("add_i_clave_a", "//*[contains(@id, '77:it25::content')]");
            elements.put("add_i_pago", "//*[contains(@id, '78:it25::content')]");
            elements.put("add_i_paga_alt", "//*[contains(@id, '79:it25::content')]");
            elements.put("add_i_adm15", "//*[contains(@id, '80:it25::content')]");
            //endregion

            //region CL_Extensions_DR
            /**
             * SELECT CL_Extensions_DR
             */
            //SEARCH
            elements.put("search_i_duplicity", "//*[contains(@id, '69:soc6::content')]");
            //ADD
            elements.put("add_i_duplicity", "//*[contains(@id, '69:it5::content')]");
            elements.put("add_ck_sap", "//*[contains(@id, 'sbc2::content')]");
            //endregion CL_SAPCustomerType_DR

            //region CL_SAPCustomerType_DR
            /**
             * SELECT CL_SAPCustomerType_DR
             */
            //SEARCH
            elements.put("search_i_domiciliado", "//*[contains(@id, '70:soc6::content')]");
            elements.put("search_i_sap_account17", "//*[contains(@id, '71:soc6::content')]");
            elements.put("search_i_pais17", "//*[contains(@id, '72:soc6::content')]");
            elements.put("search_i_adm_cus17", "//*[contains(@id, '73:soc6::content')]");
            elements.put("search_i_adquisition17", "//*[contains(@id, '74:soc6::content')]");
            //ADD
            elements.put("add_i_domiciliado", "//*[contains(@id, '70:it5::content')]");
            elements.put("add_i_sap_account17", "//*[contains(@id, '71:it5::content')]");
            elements.put("add_i_pais17", "//*[contains(@id, '72:it5::content')]");
            elements.put("add_i_adm_cus17", "//*[contains(@id, '73:it5::content')]");
            elements.put("add_i_adquisition17", "//*[contains(@id, '74:it5::content')]");
            elements.put("add_i_c_associada17", "//*[contains(@id, '82:it25::content')]");
            elements.put("add_i_clave17", "//*[contains(@id, '83:it25::content')]");
            elements.put("add_i_grupo17", "//*[contains(@id, '84:it25::content')]");
            elements.put("add_i_condi17", "//*[contains(@id, '85:it25::content')]");
            elements.put("add_i_condi_abono17", "//*[contains(@id, '86:it25::content')]");
            elements.put("add_i_grabar", "//*[contains(@id, '87:it25::content')]");
            elements.put("add_i_via17", "//*[contains(@id, '88:it25::content')]");
            elements.put("add_i_clave_a17", "//*[contains(@id, '89:it25::content')]");
            elements.put("add_i_pago_unico", "//*[contains(@id, '90:it25::content')]");
            elements.put("add_i_paga_alt17", "//*[contains(@id, '91:it25::content')]");
            //endregion

            //region CL_AtlasAdmin_classification_DR
            /**
             * SELECT CL_AtlasAdmin_classification_DR
             */
            //SEARCH
            elements.put("search_i_source18", "//*[contains(@id, '75:soc6::content')]");
            elements.put("search_i_adm_cus18", "//*[contains(@id, '76:soc6::content')]");
            elements.put("search_i_division18", "//*[contains(@id, '77:soc6::content')]");
            //ADD
            elements.put("add_i_source18", "//*[contains(@id, '75:it5::content')]");
            elements.put("add_i_adm_cus18", "//*[contains(@id, '76:it5::content')]");
            elements.put("add_i_division18", "//*[contains(@id, '77:it5::content')]");
            elements.put("add_i_customer18", "//*[contains(@id, '92:it25::content')]");
            elements.put("add_i_comercial_b18", "//*[contains(@id, '93:it25::content')]");
            elements.put("add_i_white18", "//*[contains(@id, '94:it25::content')]");
            elements.put("add_i_cust_sub", "//*[contains(@id, '95:it25::content')]");
            elements.put("add_i_acquisition", "//*[contains(@id, '96:it25::content')]");
            elements.put("add_i_cust_con", "//*[contains(@id, '97:it25::content')]");
            //endregion
        }
        else {
            //region CL_Activate_WebPrepayment_DR
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
            elements.put("add_i_collections_company", "//*[contains(@id, '0:it25::content')]");
            //endregion

            //region CL_WebUser_DR
            /**
             * SELECT CL_WebUser_DR
             */
            //SEARCH
            elements.put("search_i_commercial_country", "//*[contains(@id, '3:soc6::content')]");
            elements.put("search_i_commercial_brand2", "//*[contains(@id, '4:soc6::content')]");
            elements.put("search_i_customer_connectivity2", "//*[contains(@id, '5:soc6::content')]");
            elements.put("search_i_commercial_province", "//*[contains(@id, '6:soc6::content')]");
            elements.put("search_i_direct_hotel", "//*[contains(@id, '7:soc6::content')]");
            elements.put("search_i_web_user", "//*[contains(@id, '8:soc6::content')]");
            elements.put("search_i_type_widget", "//*[contains(@id, '9:soc6::content')]");
            elements.put("search_i_hotelextras", "//*[contains(@id, '10:soc6::content')]");
            elements.put("search_i_princing", "//*[contains(@id, '11:soc6::content')]");
            elements.put("search_i_hotelmodel", "//*[contains(@id, '12:soc6::content')]");
            //ADD
            elements.put("add_i_commercial_country", "//*[contains(@id, '3:it5::content')]");
            elements.put("add_i_commercial_brand2", "//*[contains(@id, '4:it5::content')]");
            elements.put("add_i_customer_connectivity2", "//*[contains(@id, '5:it5::content')]");
            elements.put("add_i_comercial_province", "//*[contains(@id, '6:it5::content')]");
            elements.put("add_i_direct_hotel", "//*[contains(@id, '7:it5::content')]");
            elements.put("add_i_web_user", "//*[contains(@id, '8:it5::content')]");
            elements.put("add_i_type_widget", "//*[contains(@id, '9:it5::content')]");
            elements.put("add_i_hotelextras", "//*[contains(@id, '10:it5::content')]");
            elements.put("add_i_princing", "//*[contains(@id, '11:it5::content')]");
            elements.put("add_i_hotelmodel", "//*[contains(@id, '12:it5::content')]");
            elements.put("add_i_interface", "//*[contains(@id, '1:it25::content')]");
            elements.put("add_i_web", "//*[contains(@id, 'it62::content')]");
            //endregion

            //region CL_WebUser_Cbranch_DR
            /**
             * SELECT
             */
            //SEARCH
            elements.put("search_i_commercial_country3", "//*[contains(@id, '13:soc6::content')]");
            elements.put("search_i_commercial_brand3", "//*[contains(@id, '14:soc6::content')]");
            elements.put("search_i_customer_connectivity3", "//*[contains(@id, '15:soc6::content')]");
            elements.put("search_i_commercial_province3", "//*[contains(@id, '16:soc6::content')]");
            elements.put("search_i_direct_hotel3", "//*[contains(@id, '17:soc6::content')]");
            elements.put("search_i_web_user3", "//*[contains(@id, '18:soc6::content')]");
            elements.put("search_i_hotelextras3", "//*[contains(@id, '19:soc6::content')]");
            //ADD
            elements.put("add_i_commercial_country3", "//*[contains(@id, '13:it5::content')]");
            elements.put("add_i_commercial_brand3", "//*[contains(@id, '14:it5::content')]");
            elements.put("add_i_customer_connectivity3", "//*[contains(@id, '15:it5::content')]");
            elements.put("add_i_comercial_province3", "//*[contains(@id, '16:it5::content')]");
            elements.put("add_i_direct_hotel3", "//*[contains(@id, '17:it5::content')]");
            elements.put("add_i_web_user3", "//*[contains(@id, '18:it5::content')]");
            elements.put("add_i_hotelextras3", "//*[contains(@id, '19:it5::content')]");
            elements.put("add_i_interface3", "//*[contains(@id, '3:it25::content')]");
            elements.put("add_i_web3", "//*[contains(@id, 'it62::content')]");
            //endregion

            //region CL_WebUser_Dbranch_DR
            /**
             * SELECT CL_WebUser_Dbranch_DR
             */
            //SEARCH
            elements.put("search_i_commercial_country4", "//*[contains(@id, '20:soc6::content')]");
            elements.put("search_i_commercial_brand4", "//*[contains(@id, '21:soc6::content')]");
            elements.put("search_i_customer_connectivity4", "//*[contains(@id, '22:soc6::content')]");
            elements.put("search_i_commercial_province4", "//*[contains(@id, '23:soc6::content')]");
            elements.put("search_i_direct_hotel4", "//*[contains(@id, '24:soc6::content')]");
            elements.put("search_i_web_user4", "//*[contains(@id, '25:soc6::content')]");
            elements.put("search_i_type_widget4", "//*[contains(@id, '26:soc6::content')]");
            elements.put("search_i_hotelextras4", "//*[contains(@id, '27:soc6::content')]");
            //ADD
            elements.put("add_i_commercial_country4", "//*[contains(@id, '20:it5::content')]");
            elements.put("add_i_commercial_brand4", "//*[contains(@id, '21:it5::content')]");
            elements.put("add_i_customer_connectivity4", "//*[contains(@id, '22:it5::content')]");
            elements.put("add_i_comercial_province4", "//*[contains(@id, '23:it5::content')]");
            elements.put("add_i_direct_hotel4", "//*[contains(@id, '24:it5::content')]");
            elements.put("add_i_web_user4", "//*[contains(@id, '25:it5::content')]");
            elements.put("add_i_type_widget4", "//*[contains(@id, '26:it5::content')]");
            elements.put("add_i_hotelextras4", "//*[contains(@id, '27:it5::content')]");
            elements.put("add_i_interface4", "//*[contains(@id, '5:it25::content')]");
            elements.put("add_i_web4", "//*[contains(@id, 'it62::content')]");
            //endregion

            //region CL_HX2_SAPCode_DR
            /**
             * SELECT CL_HX2_SAPCode_DR
             */
            //SEARCH
            elements.put("search_i_invoicing", "//*[contains(@id, '28:soc6::content')]");
            elements.put("search_i_office", "//*[contains(@id, '29:soc6::content')]");
            //ADD
            elements.put("add_i_invoicing", "//*[contains(@id, '28:it5::content')]");
            elements.put("add_i_office", "//*[contains(@id, '29:it5::content')]");
            elements.put("add_i_sap", "//*[contains(@id, '7:it25::content')]");
            //endregion

            //region SP_AdministrativeSupplier_DR
            /**
             * SELECT SP_AdministrativeSupplier_DR
             */
            //SEARCH
            elements.put("search_i_supplier", "//*[contains(@id, '30:soc6::content')]");
            elements.put("search_i_sup_sub", "//*[contains(@id, '31:soc6::content')]");
            //ADD
            elements.put("add_i_supplier", "//*[contains(@id, '30:it5::content')]");
            elements.put("add_i_sup_sub", "//*[contains(@id, '31:it5::content')]");
            elements.put("add_i_adm", "//*[contains(@id, '8:it25::content')]");
            //endregion

            //region SP_SAPSupplier_DR
            /**
             * SELECT SP_SAPSupplier_DR
             */
            //SEARCH
            elements.put("search_i_atlas_c", "//*[contains(@id, '32:soc6::content')]");
            elements.put("search_i_atlas_o", "//*[contains(@id, '33:soc6::content')]");
            elements.put("search_i_sap_c", "//*[contains(@id, '34:soc6::content')]");
            elements.put("search_i_adm_s", "//*[contains(@id, '35:soc6::content')]");
            //ADD
            elements.put("add_i_atlas_c", "//*[contains(@id, '32:it5::content')]");
            elements.put("add_i_atlas_o", "//*[contains(@id, '33:it5::content')]");
            elements.put("add_i_sap_c", "//*[contains(@id, '34:it5::content')]");
            elements.put("add_i_adm_s", "//*[contains(@id, '35:it5::content')]");
            elements.put("add_i_sap_group", "//*[contains(@id, '9:it25::content')]");
            elements.put("add_i_account", "//*[contains(@id, '10:it25::content')]");
            elements.put("add_i_pay", "//*[contains(@id, '11:it25::content')]");
            elements.put("add_i_credit", "//*[contains(@id, '12:it25::content')]");
            //endregion

            //region SP_SAPCustomer_DR
            /**
             * SELECT SP_SAPCustomer_DR
             */
            //SEARCH
            elements.put("search_i_bussiness", "//*[contains(@id, '36:soc6::content')]");
            elements.put("search_i_atlas_o_c", "//*[contains(@id, '37:soc6::content')]");
            elements.put("search_i_atlas_o_o", "//*[contains(@id, '38:soc6::content')]");
            //ADD
            elements.put("add_i_bussiness", "//*[contains(@id, '36:it5::content')]");
            elements.put("add_i_atlas_o_c", "//*[contains(@id, '37:it5::content')]");
            elements.put("add_i_atlas_o_o", "//*[contains(@id, '38:it5::content')]");
            elements.put("add_i_payments8", "//*[contains(@id, '13:it25::content')]");
            elements.put("add_i_credit8", "//*[contains(@id, '14:it25::content')]");
            elements.put("add_i_sap8", "//*[contains(@id, '15:it25::content')]");
            elements.put("add_i_gl", "//*[contains(@id, '16:it25::content')]");
            elements.put("add_i_class", "//*[contains(@id, '17:it25::content')]");
            elements.put("add_i_comercial8", "//*[contains(@id, '18:it25::content')]");
            elements.put("add_i_treasury", "//*[contains(@id, '19:it25::content')]");
            elements.put("add_i_save", "//*[contains(@id, '20:it25::content')]");
            elements.put("add_i_payment_m", "//*[contains(@id, '21:it25::content')]");
            elements.put("add_i_ar", "//*[contains(@id, '22:it25::content')]");
            elements.put("add_i_dunning_p", "//*[contains(@id, '23:it25::content')]");
            elements.put("add_i_dunning_b", "//*[contains(@id, '24:it25::content')]");
            elements.put("add_i_account8", "//*[contains(@id, '25:it25::content')]");
            //endregion

            //region SP_ICs_DR
            /**
             * SELECT SP_ICs_DR
             */
            //SEARCH
            elements.put("search_i_adm_sup", "//*[contains(@id, '39:soc6::content')]");
            elements.put("search_i_atlas_o_c9", "//*[contains(@id, '40:soc6::content')]");
            elements.put("search_i_atlas_o_o9", "//*[contains(@id, '41:soc6::content')]");
            elements.put("search_i_account9", "//*[contains(@id, '42:soc6::content')]");
            elements.put("search_i_management", "//*[contains(@id, '43:soc6::content')]");
            elements.put("search_i_hotel_chain", "//*[contains(@id, '44:soc6::content')]");
            elements.put("search_i_brand", "//*[contains(@id, '45:soc6::content')]");
            //ADD
            elements.put("add_i_adm_sup", "//*[contains(@id, '39:it5::content')]");
            elements.put("add_i_atlas_o_c9", "//*[contains(@id, '40:it5::content')]");
            elements.put("add_i_atlas_o_o9", "//*[contains(@id, '41:it5::content')]");
            elements.put("add_i_account9", "//*[contains(@id, '42:it5::content')]");
            elements.put("add_i_management", "//*[contains(@id, '43:it5::content')]");
            elements.put("add_i_hotel_chain", "//*[contains(@id, '44:it5::content')]");
            elements.put("add_i_brand", "//*[contains(@id, '45:it5::content')]");
            elements.put("add_i_ap_s", "//*[contains(@id, '26:it25::content')]");
            elements.put("add_i_ap_g", "//*[contains(@id, '27:it25::content')]");
            elements.put("add_i_ap_a", "//*[contains(@id, '28:it25::content')]");
            elements.put("add_i_chain", "//*[contains(@id, '29:it25::content')]");
            //endregion

            //region SP_SupplierClassification_DR
            /**
             * SELECT SP_SupplierClassification_DR
             */
            //SEARCH
            elements.put("search_i_supplier10", "//*[contains(@id, '46:soc6::content')]");
            //ADD
            elements.put("add_i_supplier10", "//*[contains(@id, '46:it5::content')]");
            elements.put("add_i_supplier_c_10", "//*[contains(@id, '30:it25::content')]");
            //endregion

            //region CL_Administrative_classification_DR
            /**
             * SELECT CL_Administrative_classification_DR
             */
            //SEARCH
            elements.put("search_i_source", "//*[contains(@id, '47:soc6::content')]");
            elements.put("search_i_customer", "//*[contains(@id, '48:soc6::content')]");
            elements.put("search_i_comercial_b", "//*[contains(@id, '49:soc6::content')]");
            elements.put("search_i_white", "//*[contains(@id, '50:soc6::content')]");
            elements.put("search_i_connectivity", "//*[contains(@id, '51:soc6::content')]");
            //ADD
            elements.put("add_i_source", "//*[contains(@id, '47:it5::content')]");
            elements.put("add_i_customer", "//*[contains(@id, '48:it5::content')]");
            elements.put("add_i_comercial_b", "//*[contains(@id, '49:it5::content')]");
            elements.put("add_i_white", "//*[contains(@id, '50:it5::content')]");
            elements.put("add_i_connectivity", "//*[contains(@id, '51:it5::content')]");
            elements.put("add_i_adm_cust", "//*[contains(@id, '31:it25::content')]");
            //endregion

            //region CL_InvoicingCompanies_DR
            /**
             * SELECT CL_InvoicingCompanies_DR
             */
            //SEARCH
            elements.put("search_i_adm_class", "//*[contains(@id, '52:soc6::content')]");
            elements.put("search_i_c_brand", "//*[contains(@id, '53:soc6::content')]");
            elements.put("search_i_pais", "//*[contains(@id, '54:soc6::content')]");
            elements.put("search_i_hotel_pay", "//*[contains(@id, '55:soc6::content')]");
            elements.put("search_i_provincia", "//*[contains(@id, '56:soc6::content')]");
            elements.put("search_i_fiscal", "//*[contains(@id, '57:soc6::content')]");
            elements.put("search_i_asia", "//*[contains(@id, '58:soc6::content')]");
            elements.put("search_i_white12", "//*[contains(@id, '59:soc6::content')]");
            elements.put("search_i_cust_con12", "//*[contains(@id, '60:soc6::content')]");
            elements.put("search_i_princing12", "//*[contains(@id, '61:soc6::content')]");
            elements.put("search_i_type", "//*[contains(@id, '62:soc6::content')]");
            elements.put("search_i_adquisition", "//*[contains(@id, '63:soc6::content')]");
            //ADD
            elements.put("add_i_adm_class", "//*[contains(@id, '52:it5::content')]");
            elements.put("add_i_c_brand", "//*[contains(@id, '53:it5::content')]");
            elements.put("add_i_pais", "//*[contains(@id, '54:it5::content')]");
            elements.put("add_i_hotel_pay", "//*[contains(@id, '55:it5::content')]");
            elements.put("add_i_provincia", "//*[contains(@id, '56:it5::content')]");
            elements.put("add_i_fiscal", "//*[contains(@id, '57:it5::content')]");
            elements.put("add_i_asia", "//*[contains(@id, '58:it5::content')]");
            elements.put("add_i_white12", "//*[contains(@id, '59:it5::content')]");
            elements.put("add_i_cust_con12", "//*[contains(@id, '60:it5::content')]");
            elements.put("add_i_princing12", "//*[contains(@id, '61:it5::content')]");
            elements.put("add_i_type", "//*[contains(@id, '62:it5::content')]");
            elements.put("add_i_adquisition", "//*[contains(@id, '63:it5::content')]");
            elements.put("add_i_credito", "//*[contains(@id, '32:it25::content')]");
            elements.put("add_i_credito_g", "//*[contains(@id, '33:it25::content')]");
            elements.put("add_i_c_saldo", "//*[contains(@id, '34:it25::content')]");
            elements.put("add_i_credito_t", "//*[contains(@id, '35:it62::content')]");
            elements.put("add_i_empresa", "//*[contains(@id, '36:it25::content')]");
            elements.put("add_i_oficina", "//*[contains(@id, '37:it25::content')]");
            elements.put("add_i_canal", "//*[contains(@id, '38:it25::content')]");
            elements.put("add_i_d_factura", "//*[contains(@id, '39:it25::content')]");
            elements.put("add_i_d_reserva", "//*[contains(@id, '40:it25::content')]");
            elements.put("add_i_c_divisa", "//*[contains(@id, '41:it25::content')]");
            elements.put("add_i_check", "//*[contains(@id, '42:it25::content')]");
            elements.put("add_i_imp_c", "//*[contains(@id, '43:it25::content')]");
            elements.put("add_i_imp_r", "//*[contains(@id, '44:it25::content')]");
            elements.put("add_i_class_o", "//*[contains(@id, '45:it25::content')]");
            elements.put("add_i_class_rap", "//*[contains(@id, '46:it25::content')]");
            elements.put("add_i_tipo_com", "//*[contains(@id, '47:it25::content')]");
            elements.put("add_i_tipo_rap", "//*[contains(@id, '48:it25::content')]");
            elements.put("add_i_pais_o", "//*[contains(@id, '49:it25::content')]");
            elements.put("add_i_divisa_res", "//*[contains(@id, '50:it25::content')]");
            elements.put("add_i_imp_cred", "//*[contains(@id, '51:it25::content')]");
            elements.put("add_i_divisa_cred", "//*[contains(@id, '52:it25::content')]");
            elements.put("add_i_traslados", "//*[contains(@id, '53:it25::content')]");
            elements.put("add_i_ent_sal", "//*[contains(@id, '54:it25::content')]");
            elements.put("add_i_venta", "//*[contains(@id, '55:it25::content')]");
            elements.put("add_i_ind_p", "//*[contains(@id, '56:it25::content')]");
            elements.put("add_i_ind_v", "//*[contains(@id, '57:it25::content')]");
            elements.put("add_i_ind_pc", "//*[contains(@id, '58:it25::content')]");
            elements.put("add_i_ind_tpv", "//*[contains(@id, '59:it25::content')]");
            elements.put("add_i_ind_tr", "//*[contains(@id, '60:it25::content')]");
            elements.put("add_i_one", "//*[contains(@id, '61:it25::content')]");
            elements.put("add_i_atlas_r", "//*[contains(@id, '62:it25::content')]");
            elements.put("add_i_ref_o", "//*[contains(@id, '63:it25::content')]");
            elements.put("add_i_cli_pro", "//*[contains(@id, '64:it25::content')]");
            elements.put("add_i_billing", "//*[contains(@id, '65:it25::content')]");
            //endregion

            //region CL_SAPCustomerGroup_DR
            /**
             * SELECT CL_SAPCustomerGroup_DR
             */
            //SEARCH
            elements.put("search_i_relation", "//*[contains(@id, '64:soc6::content')]");
            //ADD
            elements.put("add_i_relation", "//*[contains(@id, '64:it5::content')]");
            elements.put("add_i_grupo", "//*[contains(@id, '66:it25::content')]");
            //endregion

            //region CL_SAPCustomer_DR
            /**
             * SELECT CL_SAPCustomer_DR
             */
            //SEARCH
            elements.put("search_i_relation14", "//*[contains(@id, '65:soc6::content')]");
            elements.put("search_i_grupo14", "//*[contains(@id, '66:soc6::content')]");
            elements.put("search_i_adm_type", "//*[contains(@id, '67:soc6::content')]");
            //ADD
            elements.put("add_i_relation14", "//*[contains(@id, '65:it5::content')]");
            elements.put("add_i_grupo14", "//*[contains(@id, '66:it5::content')]");
            elements.put("add_i_adm_type", "//*[contains(@id, '67:it5::content')]");
            elements.put("add_i_sap_a_group", "//*[contains(@id, '67:it25::content')]");
            elements.put("add_i_adm_clas", "//*[contains(@id, '68:it25::content')]");
            //endregion

            //region CL_SAPSupplier_DR
            /**
             * SELECT CL_SAPSupplier_DR
             */
            //SEARCH
            elements.put("search_i_pago_h", "//*[contains(@id, '68:soc6::content')]");
            elements.put("search_i_white15", "//*[contains(@id, '69:soc6::content')]");
            elements.put("search_i_pais_cli", "//*[contains(@id, '70:soc6::content')]");
            elements.put("search_i_adm_cus", "//*[contains(@id, '71:soc6::content')]");
            //ADD
            elements.put("add_i_pago_h", "//*[contains(@id, '68:it5::content')]");
            elements.put("add_i_white15", "//*[contains(@id, '69:it5::content')]");
            elements.put("add_i_pais_cli", "//*[contains(@id, '70:it5::content')]");
            elements.put("add_i_adm_cus", "//*[contains(@id, '71:it5::content')]");
            elements.put("add_i_g_cuenta", "//*[contains(@id, '69:it25::content')]");
            elements.put("add_i_c_associada", "//*[contains(@id, '70:it25::content')]");
            elements.put("add_i_clave", "//*[contains(@id, '71:it25::content')]");
            elements.put("add_i_grupo15", "//*[contains(@id, '72:it25::content')]");
            elements.put("add_i_condi", "//*[contains(@id, '73:it25::content')]");
            elements.put("add_i_condi_abono", "//*[contains(@id, '74:it25::content')]");
            elements.put("add_i_ver", "//*[contains(@id, '75:it25::content')]");
            elements.put("add_i_via", "//*[contains(@id, '76:it25::content')]");
            elements.put("add_i_bloqueo", "//*[contains(@id, '77:it25::content')]");
            elements.put("add_i_clave_a", "//*[contains(@id, '78:it25::content')]");
            elements.put("add_i_pago", "//*[contains(@id, '79:it25::content')]");
            elements.put("add_i_paga_alt", "//*[contains(@id, '80:it25::content')]");
            elements.put("add_i_adm15", "//*[contains(@id, '81:it25::content')]");
            //endregion

            //region CL_Extensions_DR
            /**
             * SELECT CL_Extensions_DR
             */
            //SEARCH
            elements.put("search_i_duplicity", "//*[contains(@id, '72:soc6::content')]");
            //ADD
            elements.put("add_i_duplicity", "//*[contains(@id, '72:it5::content')]");
            elements.put("add_ck_sap", "//*[contains(@id, 'sbc2::content')]");
            //endregion CL_SAPCustomerType_DR

            //region CL_SAPCustomerType_DR
            /**
             * SELECT CL_SAPCustomerType_DR
             */
            //SEARCH
            elements.put("search_i_domiciliado", "//*[contains(@id, '73:soc6::content')]");
            elements.put("search_i_sap_account17", "//*[contains(@id, '74:soc6::content')]");
            elements.put("search_i_pais17", "//*[contains(@id, '75:soc6::content')]");
            elements.put("search_i_adm_cus17", "//*[contains(@id, '76:soc6::content')]");
            elements.put("search_i_adquisition17", "//*[contains(@id, '77:soc6::content')]");
            //ADD
            elements.put("add_i_domiciliado", "//*[contains(@id, '73:it5::content')]");
            elements.put("add_i_sap_account17", "//*[contains(@id, '74:it5::content')]");
            elements.put("add_i_pais17", "//*[contains(@id, '75:it5::content')]");
            elements.put("add_i_adm_cus17", "//*[contains(@id, '76:it5::content')]");
            elements.put("add_i_adquisition17", "//*[contains(@id, '77:it5::content')]");
            elements.put("add_i_c_associada17", "//*[contains(@id, '83:it25::content')]");
            elements.put("add_i_clave17", "//*[contains(@id, '84:it25::content')]");
            elements.put("add_i_grupo17", "//*[contains(@id, '85:it25::content')]");
            elements.put("add_i_condi17", "//*[contains(@id, '86:it25::content')]");
            elements.put("add_i_condi_abono17", "//*[contains(@id, '87:it25::content')]");
            elements.put("add_i_grabar", "//*[contains(@id, '88:it25::content')]");
            elements.put("add_i_via17", "//*[contains(@id, '89:it25::content')]");
            elements.put("add_i_clave_a17", "//*[contains(@id, '90:it25::content')]");
            elements.put("add_i_pago_unico", "//*[contains(@id, '91:it25::content')]");
            elements.put("add_i_paga_alt17", "//*[contains(@id, '92:it25::content')]");
            //endregion

            //region CL_AtlasAdmin_classification_DR
            /**
             * SELECT CL_AtlasAdmin_classification_DR
             */
            //SEARCH
            elements.put("search_i_source18", "//*[contains(@id, '78:soc6::content')]");
            elements.put("search_i_adm_cus18", "//*[contains(@id, '79:soc6::content')]");
            elements.put("search_i_division18", "//*[contains(@id, '80:soc6::content')]");
            //ADD
            elements.put("add_i_source18", "//*[contains(@id, '78:it5::content')]");
            elements.put("add_i_adm_cus18", "//*[contains(@id, '79:it5::content')]");
            elements.put("add_i_division18", "//*[contains(@id, '80:it5::content')]");
            elements.put("add_i_customer18", "//*[contains(@id, '93:it25::content')]");
            elements.put("add_i_comercial_b18", "//*[contains(@id, '94:it25::content')]");
            elements.put("add_i_white18", "//*[contains(@id, '95:it25::content')]");
            elements.put("add_i_cust_sub", "//*[contains(@id, '96:it25::content')]");
            elements.put("add_i_acquisition", "//*[contains(@id, '97:it25::content')]");
            elements.put("add_i_cust_con", "//*[contains(@id, '98:it25::content')]");
            //endregion
        }
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
        if (entorno.equalsIgnoreCase("sis")) {
            //region CL_Activate_WebPrepayment_DR
            /**
             * SELECT CL_Activate_WebPrepayment_DR
             */
            //EDIT
            elements.put("add_b_save2", "//*[contains(@id, 'r1:0:pcgt1:boton_commit')]");
            elements.put("edit_i_collections_company", "//*[contains(@id, 'it5::content')]");
            //endregion

            //region CL_WebUser_DR,  CL_WebUser_Cbranch_DR Y CL_WebUser_Dbranch_DR
            /**
             * SELECT CL_WebUser_DR,  CL_WebUser_Cbranch_DR Y CL_WebUser_Dbranch_DR
             */
            //EDIT
            elements.put("edit_i_interface", "//*[contains(@id, 'it5::content')]");
            elements.put("edit_i_web", "//*[contains(@id, 'it6::content')]");
            //endregion

            //region CL_HX2_SAPCode_DR
            /**
             * SELECT CL_HX2_SAPCode_DR
             */
            //EDIT
            elements.put("edit_i_sap", "//*[contains(@id, 'it5::content')]");
            //endregion

            //region SP_AdministrativeSupplier_DR
            /**
             * SELECT SP_AdministrativeSupplier_DR
             */
            //EDIT
            elements.put("edit_i_adm", "//*[contains(@id, 'it5::content')]");
            //endregion

            //region SP_SAPSupplier_DR
            /**
             * SELECT SP_SAPSupplier_DR
             */
            //EDIT
            elements.put("edit_i_sap_group", "//*[contains(@id, '9:it5::content')]");
            elements.put("edit_i_account", "//*[contains(@id, '10:it5::content')]");
            elements.put("edit_i_pay", "//*[contains(@id, '11:it5::content')]");
            elements.put("edit_i_credit", "//*[contains(@id, '12:it5::content')]");
            //endregion

            //region SP_SAPCustomer_DR
            /**
             * SELECT SP_SAPCustomer_DR
             */
            //EDIT
            elements.put("edit_i_payments8", "//*[contains(@id, '13:it5::content')]");
            elements.put("edit_i_credit8", "//*[contains(@id, '14:it5::content')]");
            elements.put("edit_i_sap8", "//*[contains(@id, '15:it5::content')]");
            elements.put("edit_i_gl", "//*[contains(@id, '16:it5::content')]");
            elements.put("edit_i_class", "//*[contains(@id, '17:it5::content')]");
            elements.put("edit_i_comercial8", "//*[contains(@id, '18:it5::content')]");
            elements.put("edit_i_treasury", "//*[contains(@id, '19:it5::content')]");
            elements.put("edit_i_save", "//*[contains(@id, '20:it5::content')]");
            elements.put("edit_i_payment_m", "//*[contains(@id, '21:it5::content')]");
            elements.put("edit_i_ar", "//*[contains(@id, '22:it5::content')]");
            elements.put("edit_i_dunning_p", "//*[contains(@id, '23:it5::content')]");
            elements.put("edit_i_dunning_b", "//*[contains(@id, '24:it5::content')]");
            elements.put("edit_i_account8", "//*[contains(@id, '25:it5::content')]");
            //endregion

            //region SP_ICs_DR
            /**
             * SELECT SP_ICs_DR
             */
            //EDIT
            elements.put("edit_i_ap_s", "//*[contains(@id, '26:it5::content')]");
            elements.put("edit_i_ap_g", "//*[contains(@id, '27:it5::content')]");
            elements.put("edit_i_ap_a", "//*[contains(@id, '28:it5::content')]");
            elements.put("edit_i_chain", "//*[contains(@id, '29:it5::content')]");
            //endregion

            //region SP_SupplierClassification_DR
            /**
             * SELECT SP_SupplierClassification_DR
             */
            //EDIT
            elements.put("edit_i_supplier_c_10", "//*[contains(@id, '30:it5::content')]");
            //endregion

            //region CL_Administrative_classification_DR
            /**
             * SELECT CL_Administrative_classification_DR
             */
            //EDIT
            elements.put("edit_i_adm_cust", "//*[contains(@id, '31:it5::content')]");
            //endregion

            //region CL_InvoicingCompanies_DR
            /**
             * SELECT CL_InvoicingCompanies_DR
             */
            //EDIT
            elements.put("edit_i_credito", "//*[contains(@id, '32:it5::content')]");
            elements.put("edit_i_credito_g", "//*[contains(@id, '33:it5::content')]");
            elements.put("edit_i_c_saldo", "//*[contains(@id, '34:it5::content')]");
            elements.put("edit_i_credito_t", "//*[contains(@id, '35:it6::content')]");
            elements.put("edit_i_empresa", "//*[contains(@id, '36:it5::content')]");
            elements.put("edit_i_oficina", "//*[contains(@id, '37:it5::content')]");
            elements.put("edit_i_canal", "//*[contains(@id, '38:it5::content')]");
            elements.put("edit_i_d_factura", "//*[contains(@id, '39:it5::content')]");
            elements.put("edit_i_d_reserva", "//*[contains(@id, '40:it5::content')]");
            elements.put("edit_i_c_divisa", "//*[contains(@id, '41:it5::content')]");
            elements.put("edit_i_check", "//*[contains(@id, '42:it5::content')]");
            elements.put("edit_i_imp_c", "//*[contains(@id, '43:it5::content')]");
            elements.put("edit_i_imp_r", "//*[contains(@id, '44:it5::content')]");
            elements.put("edit_i_class_o", "//*[contains(@id, '45:it5::content')]");
            elements.put("edit_i_class_rap", "//*[contains(@id, '46:it5::content')]");
            elements.put("edit_i_tipo_com", "//*[contains(@id, '47:it5::content')]");
            elements.put("edit_i_tipo_rap", "//*[contains(@id, '48:it5::content')]");
            elements.put("edit_i_pais_o", "//*[contains(@id, '49:it5::content')]");
            elements.put("edit_i_divisa_res", "//*[contains(@id, '50:it5::content')]");
            elements.put("edit_i_imp_cred", "//*[contains(@id, '51:it5::content')]");
            elements.put("edit_i_divisa_cred", "//*[contains(@id, '52:it5::content')]");
            elements.put("edit_i_traslados", "//*[contains(@id, '53:it5::content')]");
            elements.put("edit_i_ent_sal", "//*[contains(@id, '54:it5::content')]");
            elements.put("edit_i_venta", "//*[contains(@id, '55:it5::content')]");
            elements.put("edit_i_ind_p", "//*[contains(@id, '56:it5::content')]");
            elements.put("edit_i_ind_v", "//*[contains(@id, '57:it5::content')]");
            elements.put("edit_i_ind_pc", "//*[contains(@id, '58:it5::content')]");
            elements.put("edit_i_ind_tpv", "//*[contains(@id, '59:it5::content')]");
            elements.put("edit_i_ind_tr", "//*[contains(@id, '60:it5::content')]");
            elements.put("edit_i_one", "//*[contains(@id, '61:it5::content')]");
            elements.put("edit_i_atlas_r", "//*[contains(@id, '62:it5::content')]");
            elements.put("edit_i_ref_o", "//*[contains(@id, '63:it5::content')]");
            elements.put("edit_i_cli_pro", "//*[contains(@id, '64:it5::content')]");
            //endregion

            //region CL_SAPCustomerGroup_DR
            /**
             * SELECT CL_SAPCustomerGroup_DR
             */
            //EDIT
            elements.put("edit_i_grupo", "//*[contains(@id, '65:it5::content')]");
            //endregion

            //region CL_SAPCustomer_DR
            /**
             * SELECT CL_SAPCustomer_DR
             */
            //EDIT
            elements.put("edit_i_sap_a_group", "//*[contains(@id, '66:it5::content')]");
            elements.put("edit_i_adm_clas", "//*[contains(@id, '67:it5::content')]");
            //endregion

            //region CL_SAPSupplier_DR
            /**
             * SELECT CL_SAPSupplier_DR
             */
            //EDIT
            elements.put("edit_i_g_cuenta", "//*[contains(@id, '68:it5::content')]");
            elements.put("edit_i_c_associada", "//*[contains(@id, '69:it5::content')]");
            elements.put("edit_i_clave", "//*[contains(@id, '70:it5::content')]");
            elements.put("edit_i_grupo15", "//*[contains(@id, '71:it5::content')]");
            elements.put("edit_i_condi", "//*[contains(@id, '72:it5::content')]");
            elements.put("edit_i_condi_abono", "//*[contains(@id, '73:it5::content')]");
            elements.put("edit_i_ver", "//*[contains(@id, '74:it5::content')]");
            elements.put("edit_i_via", "//*[contains(@id, '75:it5::content')]");
            elements.put("edit_i_bloqueo", "//*[contains(@id, '76:it5::content')]");
            elements.put("edit_i_clave_a", "//*[contains(@id, '77:it5::content')]");
            elements.put("edit_i_pago", "//*[contains(@id, '78:it5::content')]");
            elements.put("edit_i_paga_alt", "//*[contains(@id, '79:it5::content')]");
            elements.put("edit_i_adm15", "//*[contains(@id, '80:it5::content')]");
            //endregion

            //region CL_Extensions_DR
            /**
             * SELECT CL_Extensions_DR
             */
            //EDIT
            elements.put("edit_ck_sap", "//*[contains(@id, 'sbc1::content')]");
            //endregion

            //region CL_SAPCustomerType_DR
            /**
             * SELECT CL_SAPCustomerType_DR
             */
            //EDIT
            elements.put("edit_i_c_associada17", "//*[contains(@id, '82:it5::content')]");
            elements.put("edit_i_clave17", "//*[contains(@id, '83:it5::content')]");
            elements.put("edit_i_grupo17", "//*[contains(@id, '84:it5::content')]");
            elements.put("edit_i_condi17", "//*[contains(@id, '85:it5::content')]");
            elements.put("edit_i_condi_abono17", "//*[contains(@id, '86:it5::content')]");
            elements.put("edit_i_grabar", "//*[contains(@id, '87:it5::content')]");
            elements.put("edit_i_via17", "//*[contains(@id, '88:it5::content')]");
            elements.put("edit_i_clave_a17", "//*[contains(@id, '89:it5::content')]");
            elements.put("edit_i_pago_unico", "//*[contains(@id, '90:it5::content')]");
            elements.put("edit_i_paga_alt17", "//*[contains(@id, '91:it5::content')]");
            //endregion

            //region CL_AtlasAdmin_classification_DR
            /**
             * SELECT CL_AtlasAdmin_classification_DR
             */
            //EDIT
            elements.put("edit_i_customer18", "//*[contains(@id, '92:it5::content')]");
            elements.put("edit_i_comercial_b18", "//*[contains(@id, '93:it5::content')]");
            elements.put("edit_i_white18", "//*[contains(@id, '94:it5::content')]");
            elements.put("edit_i_cust_sub", "//*[contains(@id, '95:it5::content')]");
            elements.put("edit_i_acquisition", "//*[contains(@id, '96:it5::content')]");
            elements.put("edit_i_cust_con", "//*[contains(@id, '97:it5::content')]");
            //endregion}
        }
        else {
            //region CL_Activate_WebPrepayment_DR
            /**
             * SELECT CL_Activate_WebPrepayment_DR
             */
            //EDIT
            elements.put("add_b_save2", "//*[contains(@id, 'r1:0:pcgt1:boton_commit')]");
            elements.put("edit_i_collections_company", "//*[contains(@id, 'it5::content')]");
            //endregion

            //region CL_WebUser_DR,  CL_WebUser_Cbranch_DR Y CL_WebUser_Dbranch_DR
            /**
             * SELECT CL_WebUser_DR,  CL_WebUser_Cbranch_DR Y CL_WebUser_Dbranch_DR
             */
            //EDIT
            elements.put("edit_i_interface", "//*[contains(@id, 'it5::content')]");
            elements.put("edit_i_web", "//*[contains(@id, 'it6::content')]");
            //endregion

            //region CL_HX2_SAPCode_DR
            /**
             * SELECT CL_HX2_SAPCode_DR
             */
            //EDIT
            elements.put("edit_i_sap", "//*[contains(@id, 'it5::content')]");
            //endregion

            //region SP_AdministrativeSupplier_DR
            /**
             * SELECT SP_AdministrativeSupplier_DR
             */
            //EDIT
            elements.put("edit_i_adm", "//*[contains(@id, 'it5::content')]");
            //endregion

            //region SP_SAPSupplier_DR
            /**
             * SELECT SP_SAPSupplier_DR
             */
            //EDIT
            elements.put("edit_i_sap_group", "//*[contains(@id, '9:it5::content')]");
            elements.put("edit_i_account", "//*[contains(@id, '10:it5::content')]");
            elements.put("edit_i_pay", "//*[contains(@id, '11:it5::content')]");
            elements.put("edit_i_credit", "//*[contains(@id, '12:it5::content')]");
            //endregion

            //region SP_SAPCustomer_DR
            /**
             * SELECT SP_SAPCustomer_DR
             */
            //EDIT
            elements.put("edit_i_payments8", "//*[contains(@id, '13:it5::content')]");
            elements.put("edit_i_credit8", "//*[contains(@id, '14:it5::content')]");
            elements.put("edit_i_sap8", "//*[contains(@id, '15:it5::content')]");
            elements.put("edit_i_gl", "//*[contains(@id, '16:it5::content')]");
            elements.put("edit_i_class", "//*[contains(@id, '17:it5::content')]");
            elements.put("edit_i_comercial8", "//*[contains(@id, '18:it5::content')]");
            elements.put("edit_i_treasury", "//*[contains(@id, '19:it5::content')]");
            elements.put("edit_i_save", "//*[contains(@id, '20:it5::content')]");
            elements.put("edit_i_payment_m", "//*[contains(@id, '21:it5::content')]");
            elements.put("edit_i_ar", "//*[contains(@id, '22:it5::content')]");
            elements.put("edit_i_dunning_p", "//*[contains(@id, '23:it5::content')]");
            elements.put("edit_i_dunning_b", "//*[contains(@id, '24:it5::content')]");
            elements.put("edit_i_account8", "//*[contains(@id, '25:it5::content')]");
            //endregion

            //region SP_ICs_DR
            /**
             * SELECT SP_ICs_DR
             */
            //EDIT
            elements.put("edit_i_ap_s", "//*[contains(@id, '26:it5::content')]");
            elements.put("edit_i_ap_g", "//*[contains(@id, '27:it5::content')]");
            elements.put("edit_i_ap_a", "//*[contains(@id, '28:it5::content')]");
            elements.put("edit_i_chain", "//*[contains(@id, '29:it5::content')]");
            //endregion

            //region SP_SupplierClassification_DR
            /**
             * SELECT SP_SupplierClassification_DR
             */
            //EDIT
            elements.put("edit_i_supplier_c_10", "//*[contains(@id, '30:it5::content')]");
            //endregion

            //region CL_Administrative_classification_DR
            /**
             * SELECT CL_Administrative_classification_DR
             */
            //EDIT
            elements.put("edit_i_adm_cust", "//*[contains(@id, '31:it5::content')]");
            //endregion

            //region CL_InvoicingCompanies_DR
            /**
             * SELECT CL_InvoicingCompanies_DR
             */
            //EDIT
            elements.put("edit_i_credito", "//*[contains(@id, '32:it5::content')]");
            elements.put("edit_i_credito_g", "//*[contains(@id, '33:it5::content')]");
            elements.put("edit_i_c_saldo", "//*[contains(@id, '34:it5::content')]");
            elements.put("edit_i_credito_t", "//*[contains(@id, '35:it6::content')]");
            elements.put("edit_i_empresa", "//*[contains(@id, '36:it5::content')]");
            elements.put("edit_i_oficina", "//*[contains(@id, '37:it5::content')]");
            elements.put("edit_i_canal", "//*[contains(@id, '38:it5::content')]");
            elements.put("edit_i_d_factura", "//*[contains(@id, '39:it5::content')]");
            elements.put("edit_i_d_reserva", "//*[contains(@id, '40:it5::content')]");
            elements.put("edit_i_c_divisa", "//*[contains(@id, '41:it5::content')]");
            elements.put("edit_i_check", "//*[contains(@id, '42:it5::content')]");
            elements.put("edit_i_imp_c", "//*[contains(@id, '43:it5::content')]");
            elements.put("edit_i_imp_r", "//*[contains(@id, '44:it5::content')]");
            elements.put("edit_i_class_o", "//*[contains(@id, '45:it5::content')]");
            elements.put("edit_i_class_rap", "//*[contains(@id, '46:it5::content')]");
            elements.put("edit_i_tipo_com", "//*[contains(@id, '47:it5::content')]");
            elements.put("edit_i_tipo_rap", "//*[contains(@id, '48:it5::content')]");
            elements.put("edit_i_pais_o", "//*[contains(@id, '49:it5::content')]");
            elements.put("edit_i_divisa_res", "//*[contains(@id, '50:it5::content')]");
            elements.put("edit_i_imp_cred", "//*[contains(@id, '51:it5::content')]");
            elements.put("edit_i_divisa_cred", "//*[contains(@id, '52:it5::content')]");
            elements.put("edit_i_traslados", "//*[contains(@id, '53:it5::content')]");
            elements.put("edit_i_ent_sal", "//*[contains(@id, '54:it5::content')]");
            elements.put("edit_i_venta", "//*[contains(@id, '55:it5::content')]");
            elements.put("edit_i_ind_p", "//*[contains(@id, '56:it5::content')]");
            elements.put("edit_i_ind_v", "//*[contains(@id, '57:it5::content')]");
            elements.put("edit_i_ind_pc", "//*[contains(@id, '58:it5::content')]");
            elements.put("edit_i_ind_tpv", "//*[contains(@id, '59:it5::content')]");
            elements.put("edit_i_ind_tr", "//*[contains(@id, '60:it5::content')]");
            elements.put("edit_i_one", "//*[contains(@id, '61:it5::content')]");
            elements.put("edit_i_atlas_r", "//*[contains(@id, '62:it5::content')]");
            elements.put("edit_i_ref_o", "//*[contains(@id, '63:it5::content')]");
            elements.put("edit_i_cli_pro", "//*[contains(@id, '64:it5::content')]");
            elements.put("edit_i_billing", "//*[contains(@id, '65:it5::content')]");
            //endregion

            //region CL_SAPCustomerGroup_DR
            /**
             * SELECT CL_SAPCustomerGroup_DR
             */
            //EDIT
            elements.put("edit_i_grupo", "//*[contains(@id, '66:it5::content')]");
            //endregion

            //region CL_SAPCustomer_DR
            /**
             * SELECT CL_SAPCustomer_DR
             */
            //EDIT
            elements.put("edit_i_sap_a_group", "//*[contains(@id, '67:it5::content')]");
            elements.put("edit_i_adm_clas", "//*[contains(@id, '68:it5::content')]");
            //endregion

            //region CL_SAPSupplier_DR
            /**
             * SELECT CL_SAPSupplier_DR
             */
            //EDIT
            elements.put("edit_i_g_cuenta", "//*[contains(@id, '69:it5::content')]");
            elements.put("edit_i_c_associada", "//*[contains(@id, '70:it5::content')]");
            elements.put("edit_i_clave", "//*[contains(@id, '71:it5::content')]");
            elements.put("edit_i_grupo15", "//*[contains(@id, '72:it5::content')]");
            elements.put("edit_i_condi", "//*[contains(@id, '73:it5::content')]");
            elements.put("edit_i_condi_abono", "//*[contains(@id, '74:it5::content')]");
            elements.put("edit_i_ver", "//*[contains(@id, '75:it5::content')]");
            elements.put("edit_i_via", "//*[contains(@id, '76:it5::content')]");
            elements.put("edit_i_bloqueo", "//*[contains(@id, '77:it5::content')]");
            elements.put("edit_i_clave_a", "//*[contains(@id, '78:it5::content')]");
            elements.put("edit_i_pago", "//*[contains(@id, '79:it5::content')]");
            elements.put("edit_i_paga_alt", "//*[contains(@id, '80:it5::content')]");
            elements.put("edit_i_adm15", "//*[contains(@id, '81:it5::content')]");
            //endregion

            //region CL_Extensions_DR
            /**
             * SELECT CL_Extensions_DR
             */
            //EDIT
            elements.put("edit_ck_sap", "//*[contains(@id, 'sbc1::content')]");
            //endregion

            //region CL_SAPCustomerType_DR
            /**
             * SELECT CL_SAPCustomerType_DR
             */
            //EDIT
            elements.put("edit_i_c_associada17", "//*[contains(@id, '83:it5::content')]");
            elements.put("edit_i_clave17", "//*[contains(@id, '84:it5::content')]");
            elements.put("edit_i_grupo17", "//*[contains(@id, '85:it5::content')]");
            elements.put("edit_i_condi17", "//*[contains(@id, '86:it5::content')]");
            elements.put("edit_i_condi_abono17", "//*[contains(@id, '87:it5::content')]");
            elements.put("edit_i_grabar", "//*[contains(@id, '88:it5::content')]");
            elements.put("edit_i_via17", "//*[contains(@id, '89:it5::content')]");
            elements.put("edit_i_clave_a17", "//*[contains(@id, '90:it5::content')]");
            elements.put("edit_i_pago_unico", "//*[contains(@id, '91:it5::content')]");
            elements.put("edit_i_paga_alt17", "//*[contains(@id, '92:it5::content')]");
            //endregion

            //region CL_AtlasAdmin_classification_DR
            /**
             * SELECT CL_AtlasAdmin_classification_DR
             */
            //EDIT
            elements.put("edit_i_customer18", "//*[contains(@id, '93:it5::content')]");
            elements.put("edit_i_comercial_b18", "//*[contains(@id, '94:it5::content')]");
            elements.put("edit_i_white18", "//*[contains(@id, '95:it5::content')]");
            elements.put("edit_i_cust_sub", "//*[contains(@id, '96:it5::content')]");
            elements.put("edit_i_acquisition", "//*[contains(@id, '97:it5::content')]");
            elements.put("edit_i_cust_con", "//*[contains(@id, '98:it5::content')]");
            //endregion}
        }
    }
    
}
