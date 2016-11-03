package screen.AT2MDMDE0012;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */

public class AT2MDMDE0012Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0012Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //DESTINATIONS MAINTENANCE
                elements.put("MDM_dm_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_dm_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_dm_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_dm_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_dm_b_actions", "//*[contains(@id, 'pdm222:dc_m1')]");
                elements.put("MDM_dm_b_actions_audit_data", "//*[contains(@id, 'pdm222:dc_cmi1')]/td[2]");
                elements.put("MDM_dm_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_dm_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_dm_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_dm_e_records", "//*[contains(@id, 'pc1:ot351')]");
            //MULTI-LANGUAGE
                elements.put("MDM_ml_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_ml_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_ml_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_ml_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_ml_b_actions", "//*[contains(@id, 'pdm22:dc_m1')]");
                elements.put("MDM_ml_b_actions_audit_data", "//*[contains(@id, 'pdm22:dc_cmi1')]/td[2]");
                elements.put("MDM_ml_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_ml_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_ml_e_result", "//*[contains(@id, 'pc2:child::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_ml_e_records", "//*[contains(@id, 'pc2:ot352')]");
        //ADD|MODIFY
            //DESTINATIONS MAINTENANCE
                elements.put("add_dm_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_i_country_code", "//*[contains(@id, 'pcgt1:gpaiCodPaisId::content')]");
                elements.put("add_lov_country_code", "//*[contains(@id, 'pcgt1:gpaiCodPaisId::lovIconId')]");
                elements.put("add_i_destination_code", "//*[contains(@id, 'pcgt1:it1::content')]");
                elements.put("add_i_destination", "//*[contains(@id, 'pcgt1:it2::content')]");
                elements.put("add_i_image", "//*[contains(@id, 'pcgt1:it3::content')]");
            //MULTI-LANGUAGE
                elements.put("add_ml_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_i_language", "//*[contains(@id, 'pcgt2:sidiCodIdiomaId::content')]");
                elements.put("add_lov_language", "//*[contains(@id, 'pcgt2:sidiCodIdiomaId::lovIconId')]");
                elements.put("add_i_name", "//*[contains(@id, 'pcgt2:it533::content')]");
                elements.put("add_i_destination_description", "//*[contains(@id, 'pcgt2:it34::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_country_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_country_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_destination_code", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_image", "//*[contains(@id, 'qryId1:value30::content')]");
        //QBE
            //DESTINATIONS MAINTENANCE
                elements.put("qbe_dm_i_country_code", "//*[contains(@id, 'afr_resId1_afr_resId1c1::content')]");
                elements.put("qbe_dm_i_destination_code", "//*[contains(@id, 'afr_resId1_afr_resId1c2::content')]");
                elements.put("qbe_dm_i_destination", "//*[contains(@id, 'afr_resId1_afr_resId1c3::content')]");
                elements.put("qbe_dm_i_image", "//*[contains(@id, 'afr_resId1_afr_resId1c4::content')]");
            //MULTI-LANGUAGE
                elements.put("qbe_ml_i_language", "//*[contains(@id, 'afr_pc2_afr_child_afr_c3::content')]");
                elements.put("qbe_ml_i_name", "//*[contains(@id, 'afr_pc2_afr_child_afr_c2::content')]");
    }
}