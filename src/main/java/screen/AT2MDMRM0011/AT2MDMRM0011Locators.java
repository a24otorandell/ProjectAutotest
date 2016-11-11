package screen.AT2MDMRM0011;

import core.CommonActions.DataGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMRM0011Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0011Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //ID WEB
                elements.put("MDM_id_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
                elements.put("MDM_id_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
                elements.put("MDM_id_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_id_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
                elements.put("MDM_id_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
                elements.put("MDM_id_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_id_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_id_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_id_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_id_e_records", "//*[contains(@id, 'pc1:ot111')]");
            //PREPAYMENT BOOK. CANCELLATION CONFIGURATION
                elements.put("MDM_pbcc_b_add", "//*[contains(@id, 'pc2:pcgt2:boton_add')]");
                elements.put("MDM_pbcc_b_delete", "//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
                elements.put("MDM_pbcc_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_pbcc_b_edit", "//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
                elements.put("MDM_pbcc_b_actions", "//*[contains(@id, 'pc2:pcgm2:dc_m1')]");
                elements.put("MDM_pbcc_b_actions_audit_data", "//*[contains(@id, 'pc2:pcgm2:dc_cmi1')]/td[2]");
                elements.put("MDM_id_b_actions_audit_data_ok", "//*[contains(@id, '1:pc2:d2::ok')]");
                elements.put("MDM_pbcc_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_pbcc_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_pbcc_e_result", "//*[contains(@id, 'pc2:detail::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_pbcc_e_records", "//*[contains(@id, 'pc2:ot222')]");
        //ADD|MODIFY
            //ID WEB
                elements.put("add_id_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
                elements.put("add_id_e_id", "//*[contains(@id, 'pc1:pcgt1:it4::content')]");
                elements.put("add_id_i_name", "//*[contains(@id, 'pc1:pcgt1:it7::content')]");
                elements.put("add_id_i_url", "//*[contains(@id, 'pc1:pcgt1:it8::content')]");
                elements.put("add_id_i_url_form", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
                elements.put("add_id_sl_std", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
                elements.put("add_id_i_brand", "//*[contains(@id, 'pc1:pcgt1:codBrandId::content')]");
                elements.put("add_id_lov_brand", "//*[contains(@id, 'pc1:pcgt1:codBrandId::lovIconId')]");
                elements.put("add_id_e_brand_description", "//*[contains(@id, 'pc1:pcgt1:it5::content')]");
                elements.put("add_id_i_id_web", "//*[contains(@id, 'pc1:pcgt1:idWebPrepayId::content')]");
                elements.put("add_id_lov_id_web", "//*[contains(@id, 'pc1:pcgt1:idWebPrepayId::lovIconId')]");
                elements.put("add_id_i_web_code", "//*[contains(@id, 'pc1:pcgt1:it6::content')]");
                elements.put("add_id_i_send_days_costs_cancellation", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");
                elements.put("add_id_i_days_send_previous_days_costs_cancellation", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
                elements.put("add_id_i_days_previous_to_first_send_cancellation", "//*[contains(@id, 'pc1:pcgt1:it9::content')]");
                elements.put("add_id_i_description", "//*[contains(@id, 'pc1:pcgt1:it10::content')]");
            //PREPAYMENT BOOK. CANCELLATION CONFIGURATION
                elements.put("add_pbcc_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");
                elements.put("add_pbcc_i_application_date", "//*[contains(@id, 'pc2:pcgt2:id1::content')]");
                elements.put("add_pbcc_i_interface", "//*[contains(@id, 'pc2:pcgt2:it16::content')]");
                elements.put("add_pbcc_i_number_of_days_previous_cancel_prepayment", "//*[contains(@id, 'pc2:pcgt2:it15::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_id", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_i_name", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_i_url", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_i_url_form", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_sl_std", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_i_brand", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_lov_brand", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
            elements.put("search_i_brand_description", "//*[contains(@id, 'qryId1:value60::content')]");
            elements.put("search_i_id_web", "//*[contains(@id, 'qryId1:value70::content')]");
            elements.put("search_lov_id_web", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
            elements.put("search_i_web_code", "//*[contains(@id, 'qryId1:value80::content')]");
            elements.put("search_i_send_days_costs_cancellation", "//*[contains(@id, 'qryId1:value90::content')]");
            elements.put("search_i_days_send_previous_days_costs_cancellation", "//*[contains(@id, 'qryId1:value100::content')]");
            elements.put("search_i_days_previous_to_first_send_cancellation", "//*[contains(@id, 'qryId1:value110::content')]");
            elements.put("search_i_description", "//*[contains(@id, 'qryId1:value120::content')]");
        //QBE
            //ID WEB
                elements.put("qbe_id_i_id", "//*[contains(@id, 'pc1:master:it27::content')]");
                elements.put("qbe_id_i_name", "//*[contains(@id, 'afr_pc1_afr_master_afr_c16::content')]");
                elements.put("qbe_id_i_url", "//*[contains(@id, 'afr_pc1_afr_master_afr_c14::content')]");
                elements.put("qbe_id_i_url_form", "//*[contains(@id, 'afr_pc1_afr_master_afr_c2::content')]");
                elements.put("qbe_id_sl_std", "//*[contains(@id, 'pc1:master:soc4::content')]");
                elements.put("qbe_id_i_brand", "//*[contains(@id, 'pc1:master:it29::content')]");
                elements.put("qbe_id_i_brand_description", "//*[contains(@id, 'afr_pc1_afr_master_afr_column1::content')]");
                elements.put("qbe_id_i_id_web", "//*[contains(@id, 'pc1:master:it26::content')]");
                elements.put("qbe_id_i_web_code", "//*[contains(@id, 'afr_pc1_afr_master_afr_c17::content')]");
                elements.put("qbe_id_i_send_days_costs_cancellation", "//*[contains(@id, 'pc1:master:it25::content')]");
                elements.put("qbe_id_i_days_send_previous_days_costs_cancellation", "//*[contains(@id, 'pc1:master:it24::content')]");
                elements.put("qbe_id_i_days_previous_to_first_send_cancellation", "//*[contains(@id, 'pc1:master:it22::content')]");
            //PREPAYMENT BOOK. CANCELLATION CONFIGURATION
                elements.put("qbe_pbcc_i_application_date", "//*[contains(@id, 'pc2:detail:id63::content')]");
                elements.put("qbe_pbcc_i_interface", "//*[contains(@id, 'afr_pc2_afr_detail_afr_c3::content')]");
                elements.put("qbe_pbcc_i_number_of_days_previous_cancel_prepayment", "//*[contains(@id, 'pc2:detail:it28::content')]");
        }
}