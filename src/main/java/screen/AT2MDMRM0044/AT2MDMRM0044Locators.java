package screen.AT2MDMRM0044;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 22/12/2016.
 */
public class AT2MDMRM0044Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0044Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE PROMOTION
         */
        //GENERALS
        elements.put("promotion_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("promotion_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("promotion_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("promotion_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("promotion_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("promotion_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("promotion_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("promotion_e_result", "//*[contains(@id, 'pc1:promo::db')]/table/tbody/tr[1]/td[1]");
        elements.put("promotion_e_records", "//*[contains(@id, 'pc1:ot4')]");
        elements.put("promotion_b_delete_yes", "//*[contains(@id, 'pcgt2:cbt1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_prom_code", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_short_name", "//*[contains(@id, 'value10::content')]");
        elements.put("search_i_sales_channel", "//*[contains(@id, 'value20::content')]");
        elements.put("search_lov_sales_channel", "//*[contains(@id, 'value20::lovIconId')]");
        elements.put("search_sl_observa" , "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_mininum", "//*[contains(@id, 'value40::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'value50::content')]");
        elements.put("search_sl_free", "//*[contains(@id, 'value60::content')]");
        elements.put("search_sl_opaque", "//*[contains(@id, 'value70::content')]");
        elements.put("search_sl_automatic", "//*[contains(@id, 'value80::content')]");
        elements.put("search_sl_display", "//*[contains(@id, 'value90::content')]");
        elements.put("search_sl_active", "//*[contains(@id, 'value100::content')]");
        elements.put("search_i_legend", "//*[contains(@id, 'value110::content')]");
        elements.put("search_i_remarks", "//*[contains(@id, 'value120::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_prom_code", "//*[contains(@id, 'pcgt2:it20::content')]");
        elements.put("add_i_short_name", "//*[contains(@id, 'pcgt2:it21::content')]");
        elements.put("add_i_sales_channel", "//*[contains(@id, 'pcgt2:codCanalVentaId::content')]");
        elements.put("add_lov_sales_channel", "//*[contains(@id, 'pcgt2:codCanalVentaId::lovIconId')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pcgt2:soc2::content')]");
        elements.put("add_ck_free", "//*[contains(@id, 'pcgt2:sbc6::content')]");
        elements.put("add_ck_opaque", "//*[contains(@id, 'pcgt2:sbc5::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pcgt2:sbc4::content')]");
        elements.put("add_i_legend", "//*[contains(@id, 'pcgt2:it19::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'pcgt2:it22::content')]");
        elements.put("add_ck_observa", "//*[contains(@id, 'pcgt2:sbc7::content')]");
        elements.put("add_i_minium", "//*[contains(@id, 'pcgt2:idNroMinCaract::content')]");
        elements.put("add_ck_automatic", "//*[contains(@id, 'pcgt2:sbc8::content')]");
        elements.put("add_ck_display", "//*[contains(@id, 'pcgt2:sbc9::content')]");
        //QBE
        elements.put("qbe_i_prom_code", "//*[contains(@id, 'pc1_afr_promo_afr_resId1c1::content')]");
        elements.put("qbe_i_short_name", "//*[contains(@id, 'pc1_afr_promo_afr_resId1c2::content')]");
        elements.put("qbe_i_sales_channel", "//*[contains(@id, 'pc1_afr_promo_afr_resId1c3::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'pc1:promo:soc4::content')]");
        elements.put("qbe_sl_free", "//*[contains(@id, 'pc1:promo:soc3::content')]");
        elements.put("qbe_sl_opaque", "//*[contains(@id, 'pc1:promo:soc5::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'pc1:promo:soc6::content')]");
        elements.put("qbe_sl_observa", "//*[contains(@id, 'promo:selectOneChoice1::content')]");
        elements.put("qbe_i_minium", "//*[contains(@id, 'pc1_afr_promo_afr_resId1c3::content')]");
        elements.put("qbe_sl_automatic", "//*[contains(@id, 'promo:selectOneChoice2::content')]");
        elements.put("qbe_sl_display", "//*[contains(@id, 'promo:selectOneChoice3::content')]");
        /**
         * TABLE MULTI-LANGUAGE
         */
        //GENERALS
        elements.put("multi_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("multi_b_actions", "//*[contains(@id, 'pcgm3:dc_m1')]");
        elements.put("multi_b_actions_b_audit_data", "//*[contains(@id, 'pcgm3:dc_cmi1')]/td[2]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]/a");
        elements.put("multi_b_extra", "//*[contains(@id, 'pc3:_tbr::eoi')]");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]/a");
        elements.put("multi_e_result", "//*[contains(@id, 'pc3:languag::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc3:ot16')]");
        elements.put("multi_b_delete_yes", "//*[contains(@id, 'pcgt3:cbt1')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("add_i_lang", "//*[contains(@id, 'pcgt3:codIdiomaId::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'pcgt3:codIdiomaId::lovIconId')]");
        elements.put("add_i_prom_name", "//*[contains(@id, 'pcgt3:it25::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt3:it27::content')]");
        elements.put("add_i_ico_path", "//*[contains(@id, 'pcgt3:it24::content')]");
        elements.put("add_i_menu_name", "//*[contains(@id, 'pcgt3:it28::content')]");
        elements.put("add_i_legend2", "//*[contains(@id, 'pcgt3:it29::content')]");
        elements.put("add_i_remarks2", "//*[contains(@id, 'pcgt3:it26::content')]");
        //QBE
        elements.put("qbe_i_lang", "//*[contains(@id, '_pc3_afr_languag_afr_c3::content')]");
        elements.put("qbe_i_promotion", "//*[contains(@id, 'pc3_afr_languag_afr_c4::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'pc3_afr_languag_afr_c7::content')]");
        /**
         * TABLE SUPPLEMENTS
         */
        //GENERALS
        elements.put("supplements_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("supplements_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("supplements_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("supplements_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("supplements_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("supplements_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("supplements_b_extra", "//*[contains(@id, 'pc2:_tbr::eoi')]");
        elements.put("supplements_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("supplements_e_result", "//*[contains(@id, 'pc2:suplem::db')]/table/tbody/tr[1]/td[1]");
        elements.put("supplements_e_records", "//*[contains(@id, 'pc2:ot12')]");
        elements.put("supplements_b_delete_yes", "//*[contains(@id, 'pcgt1:cbt1')]");
        //ADD
        elements.put("add_b_save3", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'pcgt1:indTipsupId::content')]");
        elements.put("add_lov_code", "//*[contains(@id, 'pcgt1:indTipsupId::lovIconId')]");
        elements.put("add_sl_subtipo", "//*[contains(@id, 'pcgt1:soc8::content')]");
        elements.put("add_i_value", "//*[contains(@id, 'pcgt1:it23::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, '_pc2_afr_suplem_afr_c2::content')]");
        elements.put("qbe_i_value", "//*[contains(@id, '_pc2_afr_suplem_afr_c1::content')]");
        elements.put("qbe_i_subtipo", "//*[contains(@id, '_pc2_afr_suplem_afr_c16::content')]");
        /**
         * TABLE CONCEPTS
         */
        //GENERALS
        elements.put("concepts_b_add", "//*[contains(@id, 'pc4:PCGenericToolbar1:boton_add')]");
        elements.put("concepts_b_delete", "//*[contains(@id, 'pc4:PCGenericToolbar1:boton_remove')]");
        elements.put("concepts_b_edit", "//*[contains(@id, 'pc4:PCGenericToolbar1:boton_edit')]");
        elements.put("concepts_b_actions", "//*[contains(@id, 'pc4:PCGenericMenu1:dc_m1')]");
        elements.put("concepts_b_actions_b_audit_data", "//*[contains(@id, 'pc4:PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("concepts_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]/a");
        elements.put("concepts_b_detach", "//*[contains(@id, 'pc4:_dchTbr')]/a");
        elements.put("concepts_e_result", "//*[contains(@id, 'pc4:t20::db')]/table/tbody/tr[1]/td[1]");
        elements.put("concepts_e_records", "//*[contains(@id, 'pc4:outputText5')]");
        elements.put("concepts_b_delete_yes", "//*[contains(@id, 'pc4:PCGenericToolbar1:cbt1')]");
        //ADD
        elements.put("add_b_save4", "//*[contains(@id, 'PCGenericToolbar1:btn_commitExit')]");
        elements.put("add_i_concept", "//*[contains(@id, 'PCGenericToolbar1:it34::content')]");
        elements.put("add_i_concept_name", "//*[contains(@id, 'PCGenericToolbar1:it37::content')]");
        elements.put("add_i_num_days_from", "//*[contains(@id, 'PCGenericToolbar1:it38::content')]");
        elements.put("add_i_num_days_to", "//*[contains(@id, 'PCGenericToolbar1:it39::content')]");
        elements.put("add_i_num_pax_from", "//*[contains(@id, 'PCGenericToolbar1:it40::content')]");
        elements.put("add_i_num_pax_to", "//*[contains(@id, 'PCGenericToolbar1:it41::content')]");
        //QBE
        elements.put("qbe_i_concept", "//*[contains(@id, '_pc4_afr_t20_afr_c18::content')]");
        elements.put("qbe_i_concept_name", "//*[contains(@id, '_pc4_afr_t20_afr_c19::content')]");
        elements.put("qbe_i_num_days_from", "//*[contains(@id, '_pc4_afr_t20_afr_c20::content')]");
        elements.put("qbe_i_num_days_to", "//*[contains(@id, '_pc4_afr_t20_afr_c22::content')]");
        elements.put("qbe_i_num_pax_from", "//*[contains(@id, '_pc4_afr_t20_afr_c21::content')]");
        elements.put("qbe_i_num_pax_to", "//*[contains(@id, '_pc4_afr_t20_afr_c17::content')]");
        /**
         * TABLE LANGUAGE CONCEPT
         */
        //GENERALS
        elements.put("c_lang_b_add", "//*[contains(@id, 'PCGenericToolbar2:boton_add')]");
        elements.put("c_lang_b_delete", "//*[contains(@id, 'PCGenericToolbar2:boton_remove')]");
        elements.put("c_lang_b_edit", "//*[contains(@id, 'PCGenericToolbar2:boton_edit')]");
        elements.put("c_lang_b_actions", "//*[contains(@id, 'PCGenericMenu2:dc_m1')]");
        elements.put("c_lang_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu2:dc_cmi0')]/td[2]");
        elements.put("c_lang_b_qbe", "//*[contains(@id, 'pc5:_qbeTbr')]/a");
        elements.put("c_lang_b_detach", "//*[contains(@id, 'pc5:_dchTbr')]/a");
        elements.put("c_lang_e_result", "//*[contains(@id, 'pc5:t21::db')]/table/tbody/tr[1]/td[1]");
        elements.put("c_lang_e_records", "//*[contains(@id, 'pc5:outputText7')]");
        elements.put("c_lang_b_delete_yes", "//*[contains(@id, 'PCGenericToolbar2:cbt1')]");
        //ADD
        elements.put("add_b_save5", "//*[contains(@id, 'PCGenericToolbar2:btn_commitExit')]");
        elements.put("add_i_lang2", "//*[contains(@id, 'PCGenericToolbar2:codIdioma1Id::content')]");
        elements.put("add_lov_lang2", "//*[contains(@id, 'PCGenericToolbar2:codIdioma1Id::lovIconId')]");
        elements.put("add_i_concept_description", "//*[contains(@id, 'PCGenericToolbar2:it42::content')]");
        //QBE
        elements.put("qbe_i_lang2", "//*[contains(@id, '_pc5_afr_t21_afr_c23::content')]");
        elements.put("qbe_i_concept_description", "//*[contains(@id, '_pc5_afr_t21_afr_c24::content')]");
    }
}
