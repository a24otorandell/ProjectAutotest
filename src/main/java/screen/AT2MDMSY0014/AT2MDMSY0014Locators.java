package screen.AT2MDMSY0014;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 16/11/2016.
 */
public class AT2MDMSY0014Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0014Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //OBSERVATION TYPE MAINTENANCE
                elements.put("MDM_otm_b_add", "//*[contains(@id, 'pc1:pcgt:boton_add')]");
                elements.put("MDM_otm_b_delete", "//*[contains(@id, 'pc1:pcgt:boton_remove')]");
                elements.put("MDM_otm_b_delete_ok", "//*[contains(@id, 'pc1:pcgt:cbt1')]");
                elements.put("MDM_otm_b_edit", "//*[contains(@id, 'pc1:pcgt:boton_edit')]");
                elements.put("MDM_otm_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_otm_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_otm_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_otm_e_records", "//*[contains(@id, 'pc1:ot17')]");
            //MULTI-LANGUAGE
                elements.put("MDM_ml_b_add", "//*[contains(@id, 'pc2:pcgt1:boton_add')]");
                elements.put("MDM_ml_b_delete", "//*[contains(@id, 'pc2:pcgt1:boton_remove')]");
                elements.put("MDM_ml_b_delete_ok", "//*[contains(@id, 'pc2:pcgt1:cbt1')]");
                elements.put("MDM_ml_b_edit", "//*[contains(@id, 'pc2:pcgt1:boton_edit')]");
                elements.put("MDM_ml_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_ml_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_ml_e_result", "//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_ml_e_records", "//*[contains(@id, 'pc2:ot8')]");
        //ADD|MODIFY
            //OBSERVATION TYPE MAINTENANCE
                elements.put("add_otm_b_save", "//*[contains(@id, 'pcgt:btn_commitExit')]");
                elements.put("add_otm_i_observation_code", "//*[contains(@id, 'pcgt:it1::content')]");
                elements.put("add_otm_i_observation_description", "//*[contains(@id, 'pcgt:it2::content')]");
                elements.put("add_otm_sl_observation_type", "//*[contains(@id, 'pcgt:soc5::content')]");
                elements.put("add_otm_sl_ind_modo", "//*[contains(@id, 'pcgt:soc4::content')]");
                elements.put("add_otm_cb_purchase_details", "//*[contains(@id, 'pcgt:sbc3::content')]");
                elements.put("add_otm_cb_supplier_sending", "//*[contains(@id, 'pcgt:sbc4::content')]");
            //MULTI-LANGUAGE
                elements.put("add_ml_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_ml_i_language", "//*[contains(@id, 'pcgt1:codIdiomaId::content')]");
                elements.put("add_ml_lov_language", "//*[contains(@id, 'pcgt1:codIdiomaId::lovIconId')]");
                elements.put("add_ml_i_observations", "//*[contains(@id, 'pc2:pcgt1:it3::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_otm_i_observation_code", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_otm_i_observation_description", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_otm_sl_observation_type", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_otm_sl_ind_modo", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_otm_cb_purchase_details", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_otm_cb_supplier_sending", "//*[contains(@id, 'qryId1:value50::content')]");
        //QBE
            //OBSERVATION TYPE MAINTENANCE
                elements.put("qbe_otm_i_observation_code", "//*[contains(@id, 'afr_resId1_afr_resId1c1::content')]");
                elements.put("qbe_otm_i_observation_description", "//*[contains(@id, 'afr_resId1_afr_resId1c2::content')]");
                elements.put("qbe_otm_sl_observation_type", "//*[contains(@id, 'resId1:soc12::content')]");
                elements.put("qbe_otm_sl_ind_modo", "//*[contains(@id, 'resId1:soc3::content')]");
                elements.put("qbe_otm_sl_purchase_details", "//*[contains(@id, 'resId1:soc7::content')]");
                elements.put("qbe_otm_sl_supplier_sending", "//*[contains(@id, 'resId1:soc6::content')]");
            //MULTI-LANGUAGE
                elements.put("qbe_ml_i_language", "//*[contains(@id, 'afr_t1_afr_c5::content')]");
                elements.put("qbe_ml_i_observations", "//*[contains(@id, 'afr_t1_afr_c4::content')]");
    }
}
