package screen.AT2MDMUS0021;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMUS0021Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0021Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_business_owner", "//*[contains(@id, '1:sdi1::disAcr')]");
                elements.put("MDM_b_process_owner", "//*[contains(@id, '1:sdi2::disAcr')]");
            //BUSINESS OWNER
                //RESULTS BUSINESS OWNER
                    elements.put("MDM_rbo_b_add", "//*[contains(@id, 'r1:0:pc1:pcgt1:boton_add')]");
                    elements.put("MDM_rbo_b_delete", "//*[contains(@id, 'r1:0:pc1:pcgt1:boton_remove')]");
                    elements.put("MDM_rbo_b_delete_ok", "//*[contains(@id, 'r1:0:pc1:pcgt1:cbt1')]");
                    elements.put("MDM_rbo_b_edit", "//*[contains(@id, 'r1:0:pc1:pcgt1:boton_edit')]");
                    elements.put("MDM_rbo_b_actions", "//*[contains(@id, 'r1:0:pc1:pcgm1:dc_m1')]");
                    elements.put("MDM_rbo_b_actions_audit_data", "//*[contains(@id, 'r1:0:pc1:pcgm1:dc_cmi0')]/td[2]");
                    elements.put("MDM_rbo_b_qbe", "//*[contains(@id, 'r1:0:pc1:_qbeTbr')]");
                    elements.put("MDM_rbo_b_detach", "//*[contains(@id, 'r1:0:pc1:_dchTbr')]");
                    elements.put("MDM_rbo_e_result", "//*[contains(@id, 'r1:0:pc1:t1::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_rbo_e_records", "//*[contains(@id, 'r1:0:pc1:outputText2')]");
                //BO RESULTS USERS
                    elements.put("MDM_boru_b_add", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:boton_add')]");
                    elements.put("MDM_boru_b_delete", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:boton_remove')]");
                    elements.put("MDM_boru_b_delete_ok", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:cbt1')]");
                    elements.put("MDM_boru_b_edit", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:boton_edit')]");
                    elements.put("MDM_boru_b_actions", "//*[contains(@id, 'r1:0:pc2:PCGenericMenu2:dc_m1')]");
                    elements.put("MDM_boru_b_actions_audit_data", "//*[contains(@id, 'r1:0:pc2:PCGenericMenu2:dc_cmi0')]/td[2]");
                    elements.put("MDM_boru_b_qbe", "//*[contains(@id, 'r1:0:pc2:_qbeTbr')]");
                    elements.put("MDM_boru_b_detach", "//*[contains(@id, 'r1:0:pc2:_dchTbr')]");
                    elements.put("MDM_boru_e_result", "//*[contains(@id, 'r1:0:pc2:table4::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_boru_e_records", "//*[contains(@id, 'r1:0:pc2:outputText6')]");
            //PROCESS OWNER
                //RESULTS PROCESS OWNER
                    elements.put("MDM_rpo_b_add", "//*[contains(@id, 'r2:0:pc1:pcgt1:boton_add')]");
                    elements.put("MDM_rpo_b_delete", "//*[contains(@id, 'r2:0:pc1:pcgt1:boton_remove')]");
                    elements.put("MDM_rpo_b_delete_ok", "//*[contains(@id, 'r2:0:pc1:pcgt1:cbt1')]");
                    elements.put("MDM_rpo_b_edit", "//*[contains(@id, 'r2:0:pc1:pcgt1:boton_edit')]");
                    elements.put("MDM_rpo_b_actions", "//*[contains(@id, 'r2:0:pc1:pcgm1:dc_m1')]");
                    elements.put("MDM_rpo_b_actions_audit_data", "//*[contains(@id, 'r2:0:pc1:pcgm1:dc_cmi0')]/td[2]");
                    elements.put("MDM_rpo_b_qbe", "//*[contains(@id, 'r2:0:pc1:_qbeTbr')]");
                    elements.put("MDM_rpo_b_detach", "//*[contains(@id, 'r2:0:pc1:_dchTbr')]");
                    elements.put("MDM_rpo_e_result", "//*[contains(@id, 'r2:0:pc1:t1::db')]/table/tbody/tr[1]/td[1]");
                    elements.put("MDM_rpo_e_records", "//*[contains(@id, 'r2:0:pc1:outputText2')]");
                //PO RESULTS USERS
                    elements.put("MDM_poru_b_add", "//*[contains(@id, 'r2:0:pc2:pcgt2:boton_add')]");
                    elements.put("MDM_poru_b_delete", "//*[contains(@id, 'r2:0:pc2:pcgt2:boton_remove')]");
                    elements.put("MDM_poru_b_delete_ok", "//*[contains(@id, 'r2:0:pc2:pcgt2:cbt1')]");
                    elements.put("MDM_poru_b_edit", "//*[contains(@id, 'r2:0:pc2:pcgt2:boton_edit')]");
                    elements.put("MDM_poru_b_actions", "//*[contains(@id, 'r2:0:pc2:PCGenericMenu2:dc_m1')]");
                    elements.put("MDM_poru_b_actions_audit_data", "//*[contains(@id, 'r2:0:pc2:PCGenericMenu2:dc_cmi0')]/td[2]");
                    elements.put("MDM_poru_b_qbe", "//*[contains(@id, 'r2:0:pc2:_qbeTbr')]");
                    elements.put("MDM_poru_b_detach", "//*[contains(@id, 'r2:0:pc2:_dchTbr')]");
                    elements.put("MDM_poru_e_result", "//*[contains(@id, 'r2:0:pc2:t5::db')]/table/tbody/tr/td[1]");
                    elements.put("MDM_poru_e_records", "//*[contains(@id, 'r2:0:pc2:outputText6')]");
        //ADD|MODIFY
            //BUSINESS OWNER
                //RESULTS BUSINESS OWNER
                    elements.put("add_rbo_b_save", "//*[contains(@id, 'r1:0:pc1:pcgt1:btn_commitExit')]");
                    elements.put("add_rbo_i_code", "//*[contains(@id, 'r1:0:pc1:pcgt1:it2::content')]");
                    elements.put("add_rbo_i_description", "//*[contains(@id, 'r1:0:pc1:pcgt1:it1::content')]");
                //BO RESULT USERS
                    elements.put("add_boru_b_save", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:btn_commitExit')]");
                    elements.put("add_boru_i_owner", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:codBusownId::content')]");
                    elements.put("add_boru_lov_owner", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:codBusownId::lovIconId')]");
                    elements.put("add_boru_sl_user_type", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:soc1::content')]");
                    elements.put("add_boru_i_user", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:codUsuId::content')]");
                    elements.put("add_boru_lov_user", "//*[contains(@id, 'r1:0:pc2:PCGenericToolbar2:codUsuId::lovIconId')]");
            //PROCESS OWNER
                //RESULTS PROCESS OWNER
                    elements.put("add_rpo_b_save", "//*[contains(@id, 'r2:0:pc1:pcgt1:btn_commitExit')]");
                    elements.put("add_rpo_i_code", "//*[contains(@id, 'r2:0:pc1:pcgt1:it2::content')]");
                    elements.put("add_rpo_i_description", "//*[contains(@id, 'r2:0:pc1:pcgt1:it1::content')]");
                //PO RESULT USERS
                    elements.put("add_poru_b_save", "//*[contains(@id, 'r2:0:pc2:pcgt2:btn_commitExit')]");
                    elements.put("add_poru_i_owner", "//*[contains(@id, 'r2:0:pc2:pcgt2:codPrcownId::content')]");
                    elements.put("add_poru_lov_owner", "//*[contains(@id, 'r2:0:pc2:pcgt2:codPrcownId::lovIconId')]");
                    elements.put("add_poru_sl_user_type", "//*[contains(@id, 'r2:0:pc2:pcgt2:soc1::content')]");
                    elements.put("add_poru_i_user", "//*[contains(@id, 'r2:0:pc2:pcgt2:codUsuId::content')]");
                    elements.put("add_poru_lov_user", "//*[contains(@id, 'r2:0:pc2:pcgt2:codUsuId::lovIconId')]");
        //SEARCH
            //BUSINESS OWNER
                //RESULTS BUSINESS OWNER
                    elements.put("search_rbo_b_search", "//*[contains(@id, 'r1:1:r1:0:qryId1::search')]");
                    elements.put("search_rbo_b_reset", "//*[contains(@id, 'r1:1:r1:0:qryId1::reset')]");
                    elements.put("search_rbo_i_code", "//*[contains(@id, 'r1:0:qryId1:value00::content')]");
                    elements.put("search_rbo_i_description", "//*[contains(@id, 'r1:0:qryId1:value10::content')]");
                //BO RESULT USERS
                    elements.put("search_boru_b_search", "//*[contains(@id, 'r1:1:r1:0:qryId2::search')]");
                    elements.put("search_boru_b_reset", "//*[contains(@id, 'r1:1:r1:0:qryId2::reset')]");
                    elements.put("search_boru_i_owner", "//*[contains(@id, 'r1:0:qryId2:value00::content')]");
                    elements.put("search_boru_lov_owner", "//*[contains(@id, 'r1:0:qryId2:value00::lovIconId')]");
                    elements.put("search_boru_i_user", "//*[contains(@id, 'r1:0:qryId2:value10::content')]");
                    elements.put("search_boru_lov_user", "//*[contains(@id, 'r1:0:qryId2:value10::lovIconId')]");
                    elements.put("search_boru_sl_user_type", "//*[contains(@id, 'r1:0:qryId2:value20::content')]");
            //PROCESS OWNER
                //RESULTS PROCESS OWNER
                    elements.put("search_rpo_b_search", "//*[contains(@id, 'r1:1:r2:0:qryId1::search')]");
                    elements.put("search_rpo_b_reset", "//*[contains(@id, 'r1:1:r2:0:qryId1::reset')]");
                    elements.put("search_rpo_i_code", "//*[contains(@id, 'r2:0:qryId1:value00::content')]");
                    elements.put("search_rpo_i_description", "//*[contains(@id, 'r2:0:qryId1:value10::content')]");
                //PO RESULT USERS
                    elements.put("search_poru_b_search", "//*[contains(@id, 'r1:1:r2:0:qryId2::search')]");
                    elements.put("search_poru_b_reset", "//*[contains(@id, 'r1:1:r2:0:qryId2::reset')]");
                    elements.put("search_poru_i_owner", "//*[contains(@id, 'r2:0:qryId2:value00::content')]");
                    elements.put("search_poru_lov_owner", "//*[contains(@id, 'r2:0:qryId2:value00::lovIconId')]");
                    elements.put("search_poru_i_user", "//*[contains(@id, 'r2:0:qryId2:value10::content')]");
                    elements.put("search_poru_lov_user", "//*[contains(@id, 'r2:0:qryId2:value10::lovIconId')]");
                    elements.put("search_poru_sl_user_type", "//*[contains(@id, 'r2:0:qryId2:value20::content')]");
        //QBE
            //BUSINESS OWNER
                //RESULTS BUSINESS OWNER
                    elements.put("qbe_rbo_i_code", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t1_afr_c2::content')]");
                    elements.put("qbe_rbo_i_description", "//*[contains(@id, 'r1_afr_0_afr_pc1_afr_t1_afr_c1::content')]");
                //BO RESULT USERS
                    elements.put("qbe_boru_i_owner", "//*[contains(@id, 'r1_afr_0_afr_pc2_afr_table4_afr_c3::content')]");
                    elements.put("qbe_boru_i_user_type", "//*[contains(@id, 'r1_afr_0_afr_pc2_afr_table4_afr_c4::content')]");
                    elements.put("qbe_boru_i_user", "//*[contains(@id, 'r1_afr_0_afr_pc2_afr_table4_afr_c5::content')]");
            //PROCESS OWNER
                //RESULTS PROCESS OWNER
                    elements.put("qbe_rpo_i_code", "//*[contains(@id, 'r2_afr_0_afr_pc1_afr_t1_afr_c1::content')]");
                    elements.put("qbe_rpo_i_description", "//*[contains(@id, 'r2_afr_0_afr_pc1_afr_t1_afr_c2::content')]");
                //PO RESULT USERS
                    elements.put("qbe_poru_i_owner", "//*[contains(@id, 'r2_afr_0_afr_pc2_afr_t5_afr_c3::content')]");
                    elements.put("qbe_poru_i_user_type", "//*[contains(@id, 'r2_afr_0_afr_pc2_afr_t5_afr_c4::content')]");
                    elements.put("qbe_poru_i_user", "//*[contains(@id, 'r2_afr_0_afr_pc2_afr_t5_afr_c5::content')]");
    }
}
