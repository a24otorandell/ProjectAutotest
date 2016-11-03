package screen.AT2MDMSP0033;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMSP0033Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0033Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //SP ROLES
                elements.put("MDM_sproles_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_sproles_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_sproles_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_sproles_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_sproles_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
                elements.put("MDM_sproles_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
                elements.put("MDM_sproles_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_sproles_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_sproles_e_result", "//*[contains(@id, 'pc1:md1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_sproles_e_records", "//*[contains(@id, 'pc1:ot11')]");
            //SP PROFILES FOR CURRENT ROLE
                elements.put("MDM_spprofiles_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_spprofiles_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_spprofiles_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_spprofiles_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_spprofiles_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
                elements.put("MDM_spprofiles_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
                elements.put("MDM_spprofiles_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_spprofiles_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_spprofiles_e_result", "//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_spprofiles_e_records", "//*[contains(@id, 'pc2:ot13')]");
        //ADD|MODIFY
            //SP ROLES
                elements.put("add_sproles_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_i_code", "//*[contains(@id, 'pcgt1:it2::content')]");
                elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it1::content')]");
            //SP PROFILES FOR CURRENT ROLE
                elements.put("add_spprofiles_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_i_profile_code", "//*[contains(@id, 'pcgt2:codProfileId::content')]");
                elements.put("add_lov_profile_code", "//*[contains(@id, 'pcgt2:codProfileId::lovIconId')]");
                elements.put("add_e_profile_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
            //SP ROLES
                elements.put("qbe_sproles_i_code", "//*[contains(@id, 'afr_md1_afr_c4::content')]");
                elements.put("qbe_sproles_i_description", "//*[contains(@id, 'afr_md1_afr_c8::content')]");
            //SP PROFILES FOR CURRENT ROLE
                elements.put("qbe_spprofiles_i_profile_code", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
                elements.put("qbe_spprofiles_i_profile_description", "//*[contains(@id, 'afr_t1_afr_c6::content')]");
    }
}