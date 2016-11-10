package screen.AT2MDMRM0033;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 09/11/2016.
 */
public class AT2MDMRM0033Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0033Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //AGENCIES LOCATOR CONTROL
                elements.put("MDM_alc_b_add", "//*[contains(@id, 'pc1:PCGenericToolbar1:boton_add')]");
                elements.put("MDM_alc_b_delete", "//*[contains(@id, 'pc1:PCGenericToolbar1:boton_remove')]");
                elements.put("MDM_alc_b_delete_ok", "//*[contains(@id, 'pc1:PCGenericToolbar1:cbt1')]");
                elements.put("MDM_alc_b_edit", "//*[contains(@id, 'pc1:PCGenericToolbar1:boton_edit')]");
                elements.put("MDM_alc_b_actions", "//*[contains(@id, 'pc1:popup1:dc_m1')]");
                elements.put("MDM_alc_b_actions_audit_data", "//*[contains(@id, 'pc1:popup1:dc_cmi0')]/td[2]");
                elements.put("MDM_alc_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_alc_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_alc_e_result", "//*[contains(@id, 'pc1:resId2::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_alc_e_records", "//*[contains(@id, 'pc1:outputText5')]");
            //VALIDATION TYPE
                elements.put("MDM_vt_b_add", "//*[contains(@id, 'pc2:pcgt1:boton_add')]");
                elements.put("MDM_vt_b_delete", "//*[contains(@id, 'pc2:pcgt1:boton_remove')]");
                elements.put("MDM_vt_b_delete_ok", "//*[contains(@id, 'pc2:pcgt1:cbt1')]");
                elements.put("MDM_vt_b_actions", "//*[contains(@id, 'pc2:pdm4:dc_m1')]");
                elements.put("MDM_vt_b_actions_audit_data", "//*[contains(@id, 'pc2:pdm4:dc_cmi1')]/td[2]");
                elements.put("MDM_vt_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_vt_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_vt_e_result", "//*[contains(@id, 'pc2:resId1::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_vt_b_records", "//*[contains(@id, 'pc2:t1::eoi')]");
                elements.put("MDM_vt_e_records", "//*[contains(@id, 'pc2:ot9')]");
        //ADD|MODIFY
            //AGENCIES LOCATOR CONTROL
                elements.put("add_alc_b_save", "//*[contains(@id, 'pc1:PCGenericToolbar1:btn_commitExit')]");
                elements.put("add_alc_i_validation_type", "//*[contains(@id, 'pc1:PCGenericToolbar1:tipoValidacion1Id::content')]");
                elements.put("add_alc_lov_validation_type", "//*[contains(@id, 'pc1:PCGenericToolbar1:tipoValidacion1Id::lovIconId')]");
                elements.put("add_alc_i_seq_TO", "//*[contains(@id, 'pc1:PCGenericToolbar1:seqTtooId::content')]");
                elements.put("add_alc_lov_seq_TO", "//*[contains(@id, 'pc1:PCGenericToolbar1:seqTtooId::lovIconId')]");
                elements.put("add_alc_e_TO_name", "//*[contains(@id, 'pc1:PCGenericToolbar1:it4::content')]");
                elements.put("add_alc_i_branch_TO", "//*[contains(@id, 'pc1:PCGenericToolbar1:codSucId::content')]");
                elements.put("add_alc_lov_branch_TO", "//*[contains(@id, 'pc1:PCGenericToolbar1:codSucId::lovIconId')]");
                elements.put("add_alc_i_first_char", "//*[contains(@id, 'pc1:PCGenericToolbar1:it3::content')]");
                elements.put("add_alc_i_application_date", "//*[contains(@id, 'pc1:PCGenericToolbar1:id2::content')]");
            //VALIDATION TYPE
                elements.put("add_vt_b_save", "//*[contains(@id, 'pc2:pcgt1:btn_commitExit')]");
                elements.put("add_vt_i_validation_type", "//*[contains(@id, 'pc2:pcgt1:it2::content')]");
                elements.put("add_vt_i_description", "//*[contains(@id, 'pc2:pcgt1:it1::content')]");
        //SEARCH
            //AGENCIES LOCATOR CONTROL
                elements.put("search_alc_b_search", "//*[contains(@id, 'qryId2::search')]");
                elements.put("search_alc_b_reset", "//*[contains(@id, 'qryId2::reset')]");
                elements.put("search_alc_i_validation_type", "//*[contains(@id, 'qryId2:value00::content')]");
                elements.put("search_alc_lov_validation_type", "//*[contains(@id, 'qryId2:value00::lovIconId')]");
                elements.put("search_alc_i_seq_TO", "//*[contains(@id, 'qryId2:value10::content')]");
                elements.put("search_alc_lov_seq_TO", "//*[contains(@id, 'qryId2:value10::lovIconId')]");
                elements.put("search_alc_i_TO_name", "//*[contains(@id, 'qryId2:value20::content')]");
                elements.put("search_alc_i_branch_TO", "//*[contains(@id, 'qryId2:value30::content')]");
                elements.put("search_alc_lov_branch_TO", "//*[contains(@id, 'qryId2:value30::lovIconId')]");
                elements.put("search_alc_i_first_char", "//*[contains(@id, 'qryId2:value40::content')]");
                elements.put("search_alc_i_application_date", "//*[contains(@id, 'qryId2:value50::content')]");
            //VALIDATION TYPE
                elements.put("search_vt_b_search", "//*[contains(@id, 'qryId1::search')]");
                elements.put("search_vt_b_reset", "//*[contains(@id, 'qryId1::reset')]");
                elements.put("search_vt_i_validation_type", "//*[contains(@id, 'qryId1:value00::content')]");
                elements.put("search_vt_i_description", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
            //AGENCIES LOCATOR CONTROL
                elements.put("qbe_alc_i_validation_type", "//*[contains(@id, 'afr_pc1_afr_resId2_afr_resId2c1::content')]");
                elements.put("qbe_alc_i_seq_TO", "//*[contains(@id, 'afr_pc1_afr_resId2_afr_resId2c2::content')]");
                elements.put("qbe_alc_i_TO_name", "//*[contains(@id, 'afr_pc1_afr_resId2_afr_c1::content')]");
                elements.put("qbe_alc_i_branch_TO", "//*[contains(@id, 'afr_pc1_afr_resId2_afr_resId2c3::content')]");
                elements.put("qbe_alc_i_first_char", "//*[contains(@id, 'afr_pc1_afr_resId2_afr_resId2c4::content')]");
                elements.put("qbe_alc_i_application_date", "//*[contains(@id, 'pc1:resId2:id3::content')]");
            //VALIDATION TYPE
                elements.put("qbe_vt_i_validation_type", "//*[contains(@id, 'afr_pc2_afr_resId1_afr_resId1c1::content')]");
    }
}
