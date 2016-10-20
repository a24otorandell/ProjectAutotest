package screen.AT2CARSU0012;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2CARSU0012Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2CARSU0012Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("languaje_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("languaje_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("languaje_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("languaje_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("languaje_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("languaje_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("languaje_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("languaje_e_result", "//*[contains(@id, ':pc1:langMap::db')]/table/tbody/tr/td[1]");
        elements.put("languaje_e_records", "//*[contains(@id, 'pc1:ot8')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_external", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_external", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value10::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_external_lang", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_external_int", "//*[contains(@id, 'pcgt2:pidCodProvId::content')]");
        elements.put("add_lov_external_int", "//*[contains(@id, 'pcgt2:pidCodProvId::lovIconId')]");
        elements.put("add_i_des_external", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_atlas_lan", "//*[contains(@id, 'pcgt2:pidCodidioma1Id::content')]");
        elements.put("add_lov_atlas", "//*[contains(@id, 'pcgt2:pidCodidioma1Id::lovIconId')]");
        elements.put("add_i_des_altas", "//*[contains(@id, 'pcgt2:it4::content')]");
        //QBE
        elements.put("qbe_i_external_lang", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_external_int", "//*[contains(@id, 'pc1:langMap:it52::content')]");
        elements.put("qbe_i_desc_lang", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_atlas", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'afr_c3::content')]");
    }
}
