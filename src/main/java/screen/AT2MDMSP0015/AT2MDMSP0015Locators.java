package screen.AT2MDMSP0015;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMSP0015Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0015Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_services", "//*[contains(@id, 'r1:1:sdi1::disAcr')]");
                elements.put("MDM_b_stops", "//*[contains(@id, 'r1:1:sdi2::disAcr')]");
                elements.put("MDM_b_restrictions", "//*[contains(@id, 'r1:1:sdi3::disAcr')]");
                elements.put("MDM_b_conditions", "//*[contains(@id, 'r1:1:sdi4::disAcr')]");
            //EXTERNAL AGENCIES
                elements.put("MDM_ea_b_add", "//*[contains(@id, 'pc1:pcgtid0:boton_add')]");
                elements.put("MDM_ea_b_delete", "//*[contains(@id, 'pc1:pcgtid0:boton_remove')]");
                elements.put("MDM_ea_b_delete_ok", "//*[contains(@id, 'pc1:pcgtid0:cbt1')]");
                elements.put("MDM_ea_b_edit", "//*[contains(@id, 'pc1:pcgtid0:boton_edit')]");
                elements.put("MDM_ea_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_ea_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_ea_e_result", "//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_ea_e_records", "//*[contains(@id, 'pc1:ot1id0')]");
            //SERVICES
                elements.put("MDM_srvcs_b_add", "//*[contains(@id, 'pc2:pcgtid1:boton_add')]");
                elements.put("MDM_srvcs_b_delete", "//*[contains(@id, 'pc2:pcgtid1:boton_remove')]");
                elements.put("MDM_srvcs_b_delete_ok", "//*[contains(@id, 'pc2:pcgtid1:cbt1')]");
                elements.put("MDM_srvcs_b_edit", "//*[contains(@id, 'pc2:pcgtid1:boton_edit')]");
                elements.put("MDM_srvcs_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_srvcs_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_srvcs_e_result", "//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_srvcs_e_records", "//*[contains(@id, 'pc2:ot1id1')]");
            //STOPS
                elements.put("MDM_stps_b_add", "//*[contains(@id, 'pc3:pcgtid2:boton_add')]");
                elements.put("MDM_stps_b_delete", "//*[contains(@id, 'pc3:pcgtid2:boton_remove')]");
                elements.put("MDM_stps_b_delete_ok", "//*[contains(@id, 'pc3:pcgtid2:cbt1')]");
                elements.put("MDM_stps_b_edit", "//*[contains(@id, 'pc3:pcgtid2:boton_edit')]");
                elements.put("MDM_stps_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
                elements.put("MDM_stps_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
                elements.put("MDM_stps_e_result", "//*[contains(@id, 'pc3:t2::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_stps_e_records", "//*[contains(@id, 'pc3:ot1id2')]");
            //RESTRICTIONS
                elements.put("MDM_rst_b_add", "//*[contains(@id, 'pc4:pcgtid4:boton_add')]");
                elements.put("MDM_rst_b_delete", "//*[contains(@id, 'pc4:pcgtid4:boton_remove')]");
                elements.put("MDM_rst_b_delete_ok", "//*[contains(@id, 'pc4:pcgtid4:cbt1')]");
                elements.put("MDM_rst_b_edit", "//*[contains(@id, 'pc4:pcgtid4:boton_edit')]");
                elements.put("MDM_rst_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]");
                elements.put("MDM_rst_b_detach", "//*[contains(@id, 'pc4:_dchTbr')]");
                elements.put("MDM_rst_e_result", "//*[contains(@id, 'pc4:t3::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_rst_e_records", "//*[contains(@id, 'pc4:ot1id4')]");
            //CONDITIONS
                elements.put("MDM_cndtn_b_add", "//*[contains(@id, 'pc5:pcgtid6:boton_add')]");
                elements.put("MDM_cndtn_b_delete", "//*[contains(@id, 'pc5:pcgtid6:boton_remove')]");
                elements.put("MDM_cndtn_b_delete_ok", "//*[contains(@id, 'pc5:pcgtid6:cbt1')]");
                elements.put("MDM_cndtn_b_edit", "//*[contains(@id, 'pc5:pcgtid6:boton_edit')]");
                elements.put("MDM_cndtn_b_qbe", "//*[contains(@id, 'pc5:_qbeTbr')]");
                elements.put("MDM_cndtn_b_detach", "//*[contains(@id, 'pc5:_dchTbr')]");
                elements.put("MDM_cndtn_e_result", "//*[contains(@id, 'pc5:t4::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_cndtn_e_records", "//*[contains(@id, 'pc5:ot1id6')]");
        //ADD|MODIFY
            //EXTERNAL AGENCIES
                elements.put("add_ea_b_save", "//*[contains(@id, 'r1:1:pc1:pcgtid0:btn_commitExit')]");
                elements.put("add_ea_e_code", "//*[contains(@id, 'r1:1:pc1:pcgtid0:it3::content')]");
                elements.put("add_ea_i_name", "//*[contains(@id, 'r1:1:pc1:pcgtid0:it4::content')]");
                elements.put("add_ea_sl_atlas", "//*[contains(@id, 'r1:1:pc1:pcgtid0:soc1::content')]");
                elements.put("add_ea_i_description", "//*[contains(@id, 'r1:1:pc1:pcgtid0:it2::content')]");
                elements.put("add_ea_i_SAP_code", "//*[contains(@id, 'r1:1:pc1:pcgtid0:it5::content')]");
                elements.put("add_ea_i_supplier", "//*[contains(@id, 'r1:1:pc1:pcgtid0:it1::content')]");
                elements.put("add_ea_i_product", "//*[contains(@id, 'r1:1:pc1:pcgtid0:codTipoProdId::content')]");
                elements.put("add_ea_lov_product", "//*[contains(@id, 'r1:1:pc1:pcgtid0:codTipoProdId::lovIconId')]");
            //SERVICES
                elements.put("add_srvcs_b_save", "//*[contains(@id, 'r1:1:pc2:pcgtid1:btn_commitExit')]");
                elements.put("add_srvcs_sl_service_type", "//*[contains(@id, 'r1:1:pc2:pcgtid1:soc2::content')]");
                elements.put("add_srvcs_sl_parameters_type", "//*[contains(@id, 'r1:1:pc2:pcgtid1:soc3::content')]");
            //STOPS
                elements.put("add_stps_b_save", "//*[contains(@id, 'r1:1:pc3:pcgtid2:btn_commitExit')]");
                elements.put("add_stps_e_sequence", "//*[contains(@id, 'r1:1:pc3:pcgtid2:it8::content')]");
                elements.put("add_stps_e_external_agency", "//*[contains(@id, 'r1:1:pc3:pcgtid2:ageExtCodId::content')]");
                elements.put("add_stps_sl_stop_type", "//*[contains(@id, 'r1:1:pc3:pcgtid2:soc6::content')]");
                elements.put("add_stps_i_stop_time", "//*[contains(@id, 'r1:1:pc3:pcgtid2:it7::content')]");
                elements.put("add_stps_i_start_time", "//*[contains(@id, 'r1:1:pc3:pcgtid2:it6::content')]");
                elements.put("add_stps_sl_status", "//*[contains(@id, 'r1:1:pc3:pcgtid2:soc4::content')]");
                elements.put("add_stps_i_stop_date", "//*[contains(@id, 'r1:1:pc3:pcgtid2:id4::content')]");
                elements.put("add_stps_i_start_date", "//*[contains(@id, 'r1:1:pc3:pcgtid2:id3::content')]");
                elements.put("add_stps_i_comments", "//*[contains(@id, 'r1:1:pc3:pcgtid2:it27::content')]");
            //RESTRICTIONS
                elements.put("add_rst_b_save", "//*[contains(@id, 'r1:1:pc4:pcgtid4:btn_commitExit')]");
                elements.put("add_rst_e_id", "//*[contains(@id, 'r1:1:pc4:pcgtid4:it11::content')]");
                elements.put("add_rst_e_external_agency", "//*[contains(@id, 'r1:1:pc4:pcgtid4:ageExtCod1Id::content')]");
                elements.put("add_rst_i_interface", "//*[contains(@id, 'r1:1:pc4:pcgtid4:codIntfId::content')]");
                elements.put("add_rst_lov_interface", "//*[contains(@id, 'r1:1:pc4:pcgtid4:codIntfId::lovIconId')]");
                elements.put("add_rst_i_TO", "//*[contains(@id, 'r1:1:pc4:pcgtid4:seqTtooId::content')]");
                elements.put("add_rst_lov_TO", "//*[contains(@id, 'r1:1:pc4:pcgtid4:seqTtooId::lovIconId')]");
                elements.put("add_rst_i_destination", "//*[contains(@id, 'r1:1:pc4:pcgtid4:codDestinoId::content')]");
                elements.put("add_rst_lov_destination", "//*[contains(@id, 'r1:1:pc4:pcgtid4:codDestinoId::lovIconId')]");
                elements.put("add_rst_i_app_id", "//*[contains(@id, 'r1:1:pc4:pcgtid4:it12::content')]");
                elements.put("add_rst_i_country", "//*[contains(@id, 'r1:1:pc4:pcgtid4:codPais1Id::content')]");
                elements.put("add_rst_lov_country", "//*[contains(@id, 'r1:1:pc4:pcgtid4:codPais1Id::lovIconId')]");
                elements.put("add_rst_i_TO_branch", "//*[contains(@id, 'r1:1:pc4:pcgtid4:it10::content')]");
                elements.put("add_rst_sl_service_type", "//*[contains(@id, 'r1:1:pc4:pcgtid4:soc7::content')]");
                elements.put("add_rst_e_filter_type", "//*[contains(@id, 'r1:1:pc4:pcgtid4:it29::content')]");
            //CONDITIONS
                elements.put("add_cndtn_b_save", "//*[contains(@id, 'r1:1:pc5:pcgtid6:btn_commitExit')]");
                elements.put("add_cndtn_i_name", "//*[contains(@id, 'r1:1:pc5:pcgtid6:it14::content')]");
                elements.put("add_cndtn_i_conditional_type", "//*[contains(@id, 'r1:1:pc5:pcgtid6:tipconNomId::content')]");
                elements.put("add_cndtn_lov_conditional_type", "//*[contains(@id, 'r1:1:pc5:pcgtid6:tipconNomId::lovIconId')]");
                elements.put("add_cndtn_i_value", "//*[contains(@id, 'r1:1:pc5:pcgtid6:valorId::content')]");
                elements.put("add_cndtn_lov_value", "//*[contains(@id, 'r1:1:pc5:pcgtid6:valorId::lovIconId')]");
                elements.put("add_cndtn_e_TO", "//*[contains(@id, 'r1:1:pc5:pcgtid6:it13::content')]");
                elements.put("add_cndtn_i_nom_tip", "//*[contains(@id, 'r1:1:pc5:pcgtid6:it15::content')]");
                elements.put("add_cndtn_i_description", "//*[contains(@id, 'r1:1:pc5:pcgtid6:it30::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_name", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_sl_atlas", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_i_description", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_i_SAP_code", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_i_supplier", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_i_product", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_lov_product", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
            elements.put("search_e_rst_id_result", "//*[contains(@id, 'r1:1:pc4:t3::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]");
        //QBE
            //EXTERNAL AGENCIES
                elements.put("qbe_ea_i_code", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c1::content')]");
                elements.put("qbe_ea_i_name", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c2::content')]");
                elements.put("qbe_ea_i_atlas", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c3::content')]");
                elements.put("qbe_ea_i_description", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c4::content')]");
                elements.put("qbe_ea_i_SAP_code", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c5::content')]");
                elements.put("qbe_ea_i_supplier", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c6::content')]");
                elements.put("qbe_ea_i_product", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_resId1c7::content')]");
            //SERVICES
                elements.put("qbe_srvcs_sl_service_type", "//*[contains(@id, 'r1:1:pc2:t1:socid0::content')]");
                elements.put("qbe_srvcs_sl_parameters_type", "//*[contains(@id, 'r1:1:pc2:t1:socid1::content')]");
            //STOPS
                elements.put("qbe_stps_i_sequence", "//*[contains(@id, 'afr_pc3_afr_t2_afr_c3::content')]");
                elements.put("qbe_stps_i_external_agency", "//*[contains(@id, 'afr_pc3_afr_t2_afr_c4::content')]");
                elements.put("qbe_stps_sl_stop_type", "//*[contains(@id, 'r1:1:pc3:t2:socid5::content')]");
                elements.put("qbe_stps_i_stop_time", "//*[contains(@id, 'afr_pc3_afr_t2_afr_c6::content')]");
                elements.put("qbe_stps_i_start_time", "//*[contains(@id, 'afr_pc3_afr_t2_afr_c7::content')]");
                elements.put("qbe_stps_sl_status", "//*[contains(@id, 'r1:1:pc3:t2:socid58::content')]");
                elements.put("qbe_stps_i_stop_date", "//*[contains(@id, 'r1:1:pc3:t2:id1::content')]");
                elements.put("qbe_stps_i_start_date", "//*[contains(@id, 'r1:1:pc3:t2:id2::content')]");
            //RESTRICTIONS
                elements.put("qbe_rst_i_id", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c12::content')]");
                elements.put("qbe_rst_i_external_agency", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c19::content')]");
                elements.put("qbe_rst_i_interface", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c13::content')]");
                elements.put("qbe_rst_i_TO", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c17::content')]");
                elements.put("qbe_rst_i_destination", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c14::content')]");
                elements.put("qbe_rst_i_app_id", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c16::content')]");
                elements.put("qbe_rst_i_country", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c15::content')]");
                elements.put("qbe_rst_i_TO_branch", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c11::content')]");
                elements.put("qbe_rst_sl_service_type", "//*[contains(@id, 'r1:1:pc4:t3:socid11::content')]");
                elements.put("qbe_rst_i_filter_type", "//*[contains(@id, 'afr_pc4_afr_t3_afr_c10::content')]");
            //CONDITIONS
                elements.put("qbe_cndtn_i_name", "//*[contains(@id, 'afr_pc5_afr_t4_afr_c20::content')]");
                elements.put("qbe_cndtn_i_conditional_type", "//*[contains(@id, 'afr_pc5_afr_t4_afr_c21::content')]");
                elements.put("qbe_cndtn_i_value", "//*[contains(@id, 'afr_pc5_afr_t4_afr_c24::content')]");
                elements.put("qbe_cndtn_i_TO", "//*[contains(@id, 'afr_pc5_afr_t4_afr_c23::content')]");
                elements.put("qbe_cndtn_i_nom_tip", "//*[contains(@id, 'afr_pc5_afr_t4_afr_c22::content')]");
    }
}