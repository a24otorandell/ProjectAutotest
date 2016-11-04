package screen.AT2MDMDE0025;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 04/11/2016.
 */
public class AT2MDMDE0025Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0025Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //AIRPORTS
                elements.put("MDM_ap_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_ap_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_ap_b_delete_ok", "//*[contains(@id, 'pc1:pcgt2:cbt1')]");
                elements.put("MDM_ap_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_ap_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
                elements.put("MDM_ap_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_ap_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_ap_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_ap_e_result", "//*[contains(@id, 'pc1:Master::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_ap_e_records", "//*[contains(@id, 'pc1:outputText3')]");
            //MULTI-LANGUAGES
                elements.put("MDM_ml_b_add", "//*[contains(@id, 'pc2:PCGenericToolbar1:boton_add')]");
                elements.put("MDM_ml_b_delete", "//*[contains(@id, 'pc2:PCGenericToolbar1:boton_remove')]");
                elements.put("MDM_ml_b_delete_ok", "//*[contains(@id, 'pc2:PCGenericToolbar1:cbt1')]");
                elements.put("MDM_ml_b_edit", "//*[contains(@id, 'pc2:PCGenericToolbar1:boton_edit')]");
                elements.put("MDM_ml_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_ml_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_ml_e_result", "//*[contains(@id, 'pc2:Child::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_ml_e_records", "//*[contains(@id, 'pc2:ot7')]");
        //ADD|MODIFY
            //AIRPORTS
                elements.put("add_ap_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_ap_i_airport_code", "//*[contains(@id, 'pcgt2:it4::content')]");
                elements.put("add_ap_i_airport_name", "//*[contains(@id, 'pcgt2:it3::content')]");
            //MULTI-LANGUAGES
        elements.put("add_ml_b_save", "//*[contains(@id, 'pc2:PCGenericToolbar1:btn_commitExit')]");
        elements.put("add_ml_i_language", "//*[contains(@id, 'pc2:PCGenericToolbar1:codIdiomaId::content')]");
        elements.put("add_ml_lov_language", "//*[contains(@id, 'pc2:PCGenericToolbar1:codIdiomaId::lovIconId')]");
        elements.put("add_ml_i_airport_name", "//*[contains(@id, 'pc2:PCGenericToolbar1:it5::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_airport_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_airport_name", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
            //AIRPORTS
                elements.put("qbe_ap_i_airport_code", "//*[contains(@id, 'afr_Master_afr_c1::content')]");
                elements.put("qbe_ap_i_airport_name", "//*[contains(@id, 'afr_Master_afr_c2::content')]");
            //MULTI-LANGUAGES
                elements.put("qbe_ml_i_language", "//*[contains(@id, 'afr_Child_afr_c4::content')]");
                elements.put("qbe_ml_i_airport_name", "//*[contains(@id, 'afr_Child_afr_c3::content')]");
    }
}
