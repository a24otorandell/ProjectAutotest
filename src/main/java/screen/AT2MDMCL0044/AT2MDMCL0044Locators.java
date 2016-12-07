package screen.AT2MDMCL0044;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/11/2016.
 */
public class AT2MDMCL0044Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0044Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_notification_configuration", "//*[contains(@id, '1:sdi3::disAcr')]");
                elements.put("MDM_b_notification_type", "//*[contains(@id, '1:sdi1::disAcr')]");
                elements.put("MDM_b_notification_properties", "//*[contains(@id, '1:sdi2::disAcr')]");
            //CLIENT NOTIFICATIONS
                elements.put("MDM_cn_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
                elements.put("MDM_cn_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
                elements.put("MDM_cn_b_actions", "//*[contains(@id, 'pc3:pcgm3:dc_m1')]");
                elements.put("MDM_cn_b_actions_audit_data", "//*[contains(@id, 'pc3:pcgm3:dc_cmi0')]/td[2]");
                elements.put("MDM_cn_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
                elements.put("MDM_cn_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
                elements.put("MDM_cn_e_result", "//*[contains(@id, 'pc3:t7::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_cn_e_records", "//*[contains(@id, 'pc3:ot20')]");
            //CONFIGURATION DETAIL
                elements.put("MDM_cd_b_add", "//*[contains(@id, 'pcgt4:boton_add')]");
                elements.put("MDM_cd_b_delete", "//*[contains(@id, 'pcgt4:boton_remove')]");
                elements.put("MDM_cd_b_delete_ok", "//*[contains(@id, 'pcgt4:cbt1')]");
                elements.put("MDM_cd_b_edit", "//*[contains(@id, 'pcgt4:boton_edit')]");
                elements.put("MDM_cd_b_actions", "//*[contains(@id, 'pc4:pcgm4:dc_m1')]");
                elements.put("MDM_cd_b_actions_audit_data", "//*[contains(@id, 'pc4:pcgm4:dc_cmi0')]/td[2]");
                elements.put("MDM_cd_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]");
                elements.put("MDM_cd_b_detach", "//*[contains(@id, 'pc4:_dchTbr')]");
                elements.put("MDM_cd_e_result", "//*[contains(@id, 'pc4:t10::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_cd_e_records", "//*[contains(@id, 'pc4:ot25')]");
            //NOTIFICATION TYPE
                elements.put("MDM_nt_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_nt_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_nt_b_delete_ok", "//*[contains(@id, 'pcgt1:cbt1')]");
                elements.put("MDM_nt_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_nt_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
                elements.put("MDM_nt_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi0')]/td[2]");
                elements.put("MDM_nt_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_nt_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_nt_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_nt_e_records", "//*[contains(@id, 'pc1:ot6')]");
            //NOTIFICATION PROPERTIES
                elements.put("MDM_np_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_np_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_np_b_delete_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
                elements.put("MDM_np_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_np_b_actions", "//*[contains(@id, 'pc2:pcgm1:dc_m1')]");
                elements.put("MDM_np_b_actions_audit_data", "//*[contains(@id, 'pc2:pcgm1:dc_cmi0')]/td[2]");
                elements.put("MDM_np_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_np_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_np_e_result", "//*[contains(@id, 'pc2:t5::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_np_e_records", "//*[contains(@id, 'pc2:outputText2')]");
         //ADD|MODIFY
            //CLIENT NOTIFICATIONS
                elements.put("add_cn_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
                elements.put("add_cn_i_client", "//*[contains(@id, 'pcgt3:ntcSeqTtooId::content')]");
                elements.put("add_cn_lov_client", "//*[contains(@id, 'pcgt3:ntcSeqTtooId::lovIconId')]");
                elements.put("add_cn_i_branch", "//*[contains(@id, 'pcgt3:ntcCodSucId::content')]");
                elements.put("add_cn_lov_branch", "//*[contains(@id, 'pcgt3:ntcCodSucId::lovIconId')]");
                elements.put("add_cn_i_type", "//*[contains(@id, 'pcgt3:ntcTypeId::content')]");
                elements.put("add_cn_lov_type", "//*[contains(@id, 'pcgt3:ntcTypeId::lovIconId')]");
                elements.put("add_cn_sl_frequency", "//*[contains(@id, 'pcgt3:soc1::content')]");
                elements.put("add_cn_cb_active", "//*[contains(@id, 'pcgt3:sbc4::content')]");
            //CONFIGURATION DETAIL
                elements.put("add_cd_b_save", "//*[contains(@id, 'pcgt4:btn_commitExit')]");
                elements.put("add_cd_i_property", "//*[contains(@id, 'pcgt4:npvPropertyId::content')]");
                elements.put("add_cd_lov_property", "//*[contains(@id, 'pcgt4:npvPropertyId::lovIconId')]");
                elements.put("add_cd_i_property_fourth_result", "//*[contains(@id, 'pcgt4:npvPropertyId_afrLovInternalTableId::db')]/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td[1]");
                elements.put("add_cd_i_value", "//*[contains(@id, 'pcgt4:it8::content')]");
            //NOTIFICATION TYPE
                elements.put("add_nt_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_nt_i_type", "//*[contains(@id, 'pcgt1:it2::content')]");
                elements.put("add_nt_i_description", "//*[contains(@id, 'pcgt1:it1::content')]");
                elements.put("add_nt_cb_active", "//*[contains(@id, 'pcgt1:sbc1::content')]");
            //NOTIFICATION PROPERTIES
                elements.put("add_np_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_np_i_property", "//*[contains(@id, 'pcgt2:it7::content')]");
                elements.put("add_np_i_description", "//*[contains(@id, 'pcgt2:it3::content')]");
                elements.put("add_np_i_default", "//*[contains(@id, 'pcgt2:it4::content')]");
        //SEARCH
            //CLIENT NOTIFICATIONS
                elements.put("search_cn_b_search", "//*[contains(@id, 'qryId3::search')]");
                elements.put("search_cn_b_reset", "//*[contains(@id, 'qryId3::reset')]");
                elements.put("search_cn_i_client", "//*[contains(@id, 'qryId3:value00::content')]");
                elements.put("search_cn_i_branch", "//*[contains(@id, 'qryId3:value10::content')]");
                elements.put("search_cn_i_type", "//*[contains(@id, 'qryId3:value20::content')]");
            //NOTIFICATION TYPE
                elements.put("search_nt_b_search", "//*[contains(@id, 'qryId1::search')]");
                elements.put("search_nt_b_reset", "//*[contains(@id, 'qryId1::reset')]");
                elements.put("search_nt_i_type", "//*[contains(@id, 'qryId1:value00::content')]");
            //NOTIFICATION PROPERTIES
                elements.put("search_np_b_search", "//*[contains(@id, 'qryId2::search')]");
                elements.put("search_np_b_reset", "//*[contains(@id, 'qryId2::reset')]");
                elements.put("search_np_i_property", "//*[contains(@id, 'qryId2:value00::content')]");
        //QBE
            //CLIENT NOTIFICATIONS
                elements.put("qbe_cn_i_client", "//*[contains(@id, 'afr_pc3_afr_t7_afr_c8::content')]");
                elements.put("qbe_cn_i_branch", "//*[contains(@id, 'afr_pc3_afr_t7_afr_c11::content')]");
                elements.put("qbe_cn_i_type", "//*[contains(@id, 'afr_pc3_afr_t7_afr_c10::content')]");
                elements.put("qbe_cn_sl_frequency", "//*[contains(@id, 'pc3:t7:selectOneChoice17::content')]");
                elements.put("qbe_cn_sl_active", "//*[contains(@id, 'pc3:t7:selectOneChoice14::content')]");
            //CONFIGURATION DETAIL
                elements.put("qbe_cd_i_property", "//*[contains(@id, 'afr_pc4_afr_t10_afr_c14::content')]");
                elements.put("qbe_cd_i_value", "//*[contains(@id, 'afr_pc4_afr_t10_afr_c15::content')]");
            //NOTIFICATION TYPE
                elements.put("qbe_nt_i_type", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c2::content')]");
                elements.put("qbe_nt_i_description", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c1::content')]");
                elements.put("qbe_nt_sl_active", "//*[contains(@id, 'pc1:t1:soc2::content')]");
            //NOTIFICATION PROPERTIES
                elements.put("qbe_np_i_property", "//*[contains(@id, 'afr_pc2_afr_t5_afr_c6::content')]");
                elements.put("qbe_np_i_description", "//*[contains(@id, 'afr_pc2_afr_t5_afr_c7::content')]");
                elements.put("qbe_np_i_default", "//*[contains(@id, 'afr_pc2_afr_t5_afr_c5::content')]");
    }
}