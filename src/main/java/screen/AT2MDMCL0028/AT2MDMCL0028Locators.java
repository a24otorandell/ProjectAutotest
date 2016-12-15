package screen.AT2MDMCL0028;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 28/11/2016.
 */
public class AT2MDMCL0028Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0028Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_partners", "//*[contains(@id, '1:sdi1::disAcr')]");
                elements.put("MDM_b_groups", "//*[contains(@id, '1:sdi2::disAcr')]");
            //PARTNERS
                elements.put("MDM_prtns_b_add", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:boton_add')]");
                elements.put("MDM_prtns_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:boton_remove')]");
                elements.put("MDM_prtns_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:cbt1')]");
                elements.put("MDM_prtns_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:boton_edit')]");
                elements.put("MDM_prtns_b_actions", "//*[contains(@id, 'r1:1:r1:0:pc1:pdm2:dc_m1')]");
                elements.put("MDM_prtns_b_actions_audit_data", "//*[contains(@id, 'r1:1:r1:0:pc1:pdm2:dc_cmi1')]/td[2]");
                elements.put("MDM_prtns_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc1:_qbeTbr')]");
                elements.put("MDM_prtns_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc1:_dchTbr')]");
                elements.put("MDM_prtns_e_result", "//*[contains(@id, 'r1:1:r1:0:pc1:mprtnr::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_prtns_e_records", "//*[contains(@id, 'r1:1:r1:0:pc1:otp2')]");
            //ASSIGNED GROUP
                elements.put("MDM_assg_b_add", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:boton_add')]");
                elements.put("MDM_assg_b_delete", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:boton_remove')]");
                elements.put("MDM_assg_b_delete_ok", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:cbt1')]");
                elements.put("MDM_assg_b_edit", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:boton_edit')]");
                elements.put("MDM_assg_b_actions", "//*[contains(@id, 'r1:1:r1:0:pc2:pdm12:dc_m1')]");
                elements.put("MDM_assg_b_actions_audit_data", "//*[contains(@id, 'r1:1:r1:0:pc2:pdm12:dc_cmi1')]/td[2]");
                elements.put("MDM_assg_b_qbe", "//*[contains(@id, 'r1:1:r1:0:pc2:_qbeTbr')]");
                elements.put("MDM_assg_b_detach", "//*[contains(@id, 'r1:1:r1:0:pc2:_dchTbr')]");
                elements.put("MDM_assg_e_result", "//*[contains(@id, 'r1:1:r1:0:pc2:t1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_assg_e_records", "//*[contains(@id, 'r1:1:r1:0:pc2:ocp2')]");
            //GROUPS
                elements.put("MDM_gr_b_add", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:boton_add')]");
                elements.put("MDM_gr_b_delete", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:boton_remove')]");
                elements.put("MDM_gr_b_delete_ok", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:cbt1')]");
                elements.put("MDM_gr_b_edit", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:boton_edit')]");
                elements.put("MDM_gr_b_actions", "//*[contains(@id, 'r1:1:r2:0:pc2:pdm2:dc_m1')]");
                elements.put("MDM_gr_b_actions_audit_data", "//*[contains(@id, 'r1:1:r2:0:pc2:pdm2:dc_cmi1')]/td[2]");
                elements.put("MDM_gr_b_qbe", "//*[contains(@id, 'r1:1:r2:0:pc2:_qbeTbr')]");
                elements.put("MDM_gr_b_qbe_restart", "//*[contains(@id, 'r1:1:r2:0:pc2:md1::ch::t')]/tbody/tr[2]/th/a");
                elements.put("MDM_gr_b_detach", "//*[contains(@id, 'r1:1:r2:0:pc2:_dchTbr')]");
                elements.put("MDM_gr_e_result", "//*[contains(@id, 'r1:1:r2:0:pc2:md1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_gr_e_records", "//*[contains(@id, 'r1:1:r2:0:pc2:otp2')]");
            //GROUP DESCRIPTION
                elements.put("MDM_grd_b_add", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:boton_add')]");
                elements.put("MDM_grd_b_delete", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:boton_remove')]");
                elements.put("MDM_grd_b_delete_ok", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:cbt1')]");
                elements.put("MDM_grd_b_edit", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:boton_edit')]");
                elements.put("MDM_grd_b_actions", "//*[contains(@id, 'r1:1:r2:0:pc3:pdm3:dc_m1')]");
                elements.put("MDM_grd_b_actions_audit_data", "//*[contains(@id, 'r1:1:r2:0:pc3:pdm3:dc_cmi1')]/td[2]");
                elements.put("MDM_grd_b_qbe", "//*[contains(@id, 'r1:1:r2:0:pc3:_qbeTbr')]");
                elements.put("MDM_grd_b_qbe_restart", "//*[contains(@id, 'r1:1:r2:0:pc3:t1::ch::t')]/tbody/tr[2]/th/a");
                elements.put("MDM_grd_b_detach", "//*[contains(@id, 'r1:1:r2:0:pc3:_dchTbr')]");
                elements.put("MDM_grd_e_result", "//*[contains(@id, 'r1:1:r2:0:pc3:t1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_grd_e_records", "//*[contains(@id, 'r1:1:r2:0:pc3:otp9')]");
            //ASSOCIATED PARTNERS
                elements.put("MDM_assp_b_actions", "//*[contains(@id, 'r1:1:r2:0:pc1:pdm4:dc_m1')]");
                elements.put("MDM_assp_b_actions_audit_data", "//*[contains(@id, 'r1:1:r2:0:pc1:pdm4:dc_cmi1')]/td[2]");
                elements.put("MDM_assp_b_qbe", "//*[contains(@id, 'r1:1:r2:0:pc1:_qbeTbr')]");
                elements.put("MDM_assp_b_detach", "//*[contains(@id, 'r1:1:r2:0:pc1:_dchTbr')]");
                elements.put("MDM_assp_e_result", "//*[contains(@id, 'r1:1:r2:0:pc1:t2::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_assp_e_records", "//*[contains(@id, 'r1:1:r2:0:pc1:otp95')]");
        //ADD|MODIFY
            //PARTNERS
                elements.put("add_prtns_b_save", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:btn_commitExit')]");
                elements.put("add_prtns_e_identif", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:it15::content')]");
                elements.put("add_prtns_sl_nactive", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:soc1::content')]");
                elements.put("add_prtns_i_name", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:it11::content')]");
                elements.put("add_prtns_i_description", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:it14::content')]");
                elements.put("add_prtns_cb_internal", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:sbc3::content')]");
                elements.put("add_prtns_cb_dotmar", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:sbc4::content')]");
                elements.put("add_prtns_i_supplier", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:codProveId::content')]");
                elements.put("add_prtns_lov_supplier", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:codProveId::lovIconId')]");
                elements.put("add_prtns_e_supplier_description", "//*[contains(@id, 'r1:1:r1:0:pc1:pcgt1:it12::content')]");
            //ASSIGNED GROUP
                elements.put("add_assg_b_save", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:btn_commitExit')]");
                elements.put("add_assg_i_group", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:codAgrId::content')]");
                elements.put("add_assg_lov_group", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:codAgrId::lovIconId')]");
                elements.put("add_assg_e_group_description", "//*[contains(@id, 'r1:1:r1:0:pc2:pcgt2:it2::content')]");
            //GROUPS
                elements.put("add_gr_b_save", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:btn_commitExit')]");
                elements.put("add_gr_i_group_code", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:it14::content')]");
                elements.put("add_gr_i_group_name", "//*[contains(@id, 'r1:1:r2:0:pc2:pcgt1:it13::content')]");
            //GROUP DESCRIPTION
                elements.put("add_grd_b_save", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:btn_commitExit')]");
                elements.put("add_grd_i_language", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:codIdioma1Id::content')]");
                elements.put("add_grd_i_lov_language", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:codIdioma1Id::lovIconId')]");
                elements.put("add_grd_i_texto", "//*[contains(@id, 'r1:1:r2:0:pc3:pcgt2:it15::content')]");
        //SEARCH
            //PARTNERS
                elements.put("search_prtns_b_search", "//*[contains(@id, 'r1:1:r1:0:qryId1::search')]");
                elements.put("search_prtns_b_reset", "//*[contains(@id, 'r1:1:r1:0:qryId1::reset')]");
                elements.put("search_prtns_i_identif", "//*[contains(@id, 'r1:1:r1:0:qryId1:value00::content')]");
                elements.put("search_prtns_sl_nactive", "//*[contains(@id, 'r1:1:r1:0:qryId1:value10::content')]");
                elements.put("search_prtns_i_name", "//*[contains(@id, 'r1:1:r1:0:qryId1:value20::content')]");
                elements.put("search_prtns_i_description", "//*[contains(@id, 'r1:1:r1:0:qryId1:value30::content')]");
                elements.put("search_prtns_cb_internal", "//*[contains(@id, 'r1:1:r1:0:qryId1:value40::content')]");
                elements.put("search_prtns_cb_dotmar", "//*[contains(@id, 'r1:1:r1:0:qryId1:value50::content')]");
                elements.put("search_prtns_i_supplier", "//*[contains(@id, 'r1:1:r1:0:qryId1:value60::content')]");
                elements.put("search_prtns_lov_supplier", "//*[contains(@id, 'r1:1:r1:0:qryId1:value60::lovIconId')]");
                elements.put("search_prtns_cb_internal_result", "//*[contains(@id, '')]");
                elements.put("search_prtns_cb_dotmar_result", "//*[contains(@id, '')]");
            //GROUPS
                elements.put("search_gr_b_search", "//*[contains(@id, 'r1:1:r2:0:qryId1::search')]");
                elements.put("search_gr_b_reset", "//*[contains(@id, 'r1:1:r2:0:qryId1::reset')]");
                elements.put("search_gr_i_group_code", "//*[contains(@id, 'r1:1:r2:0:qryId1:value00::content')]");
                elements.put("search_gr_i_group_name", "//*[contains(@id, 'r1:1:r2:0:qryId1:value10::content')]");
            //ASSOCIATED PARTNERS
                elements.put("search_assp_i_identif_result", "//*[contains(@id, 'r1:1:r2:0:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
                elements.put("search_assp_name_result", "//*[contains(@id, 'r1:1:r2:0:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                elements.put("search_assp_i_description_result", "//*[contains(@id, 'r1:1:r2:0:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        //QBE
            //PARTNERS
                elements.put("qbe_prtns_i_identif", "//*[contains(@id, 'r1:1:r1:0:pc1:mprtnr:ipt1::content')]");
                elements.put("qbe_prtns_sl_nactive", "//*[contains(@id, 'r1:1:r1:0:pc1:mprtnr:soc3::content')]");
                elements.put("qbe_prtns_i_name", "//*[contains(@id, 'r1_afr_1_afr_r1_afr_0_afr_pc1_afr_mprtnr_afr_c16::content')]");
                elements.put("qbe_prtns_i_description", "//*[contains(@id, 'r1_afr_1_afr_r1_afr_0_afr_pc1_afr_mprtnr_afr_c13::content')]");
                elements.put("qbe_prtns_sl_internal", "//*[contains(@id, 'r1:1:r1:0:pc1:mprtnr:soc4::content')]");
                elements.put("qbe_prtns_sl_dotmar", "//*[contains(@id, 'r1:1:r1:0:pc1:mprtnr:soc5::content')]");
                elements.put("qbe_prtns_i_supplier", "//*[contains(@id, 'r1_afr_1_afr_r1_afr_0_afr_pc1_afr_mprtnr_afr_c2::content')]");
                elements.put("qbe_prtns_i_supplier_description", "//*[contains(@id, 'r1_afr_1_afr_r1_afr_0_afr_pc1_afr_mprtnr_afr_c11::content')]");
            //ASSIGNED GROUP
                elements.put("qbe_assg_i_group", "//*[contains(@id, 'r1_afr_1_afr_r1_afr_0_afr_pc2_afr_t1_afr_c6::content')]");
                elements.put("qbe_assg_i_group_description", "//*[contains(@id, 'r1_afr_1_afr_r1_afr_0_afr_pc2_afr_t1_afr_c15::content')]");
            //GROUPS
                elements.put("qbe_gr_i_group_code", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc2_afr_md1_afr_c2::content')]");
                elements.put("qbe_gr_i_group_name", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc2_afr_md1_afr_c7::content')]");
            //GROUP DESCRIPTION
                elements.put("qbe_grd_i_language", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc3_afr_t1_afr_c10::content')]");
                elements.put("qbe_grd_i_texto", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc3_afr_t1_afr_c5::content')]");
            //ASSOCIATED PARTNERS
                elements.put("qbe_assp_i_identif", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc1_afr_t2_afr_c15::content')]");
                elements.put("qbe_assp_i_name", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc1_afr_t2_afr_c16::content')]");
                elements.put("qbe_assp_i_description", "//*[contains(@id, 'r1_afr_1_afr_r2_afr_0_afr_pc1_afr_t2_afr_c14::content')]");
    }
}