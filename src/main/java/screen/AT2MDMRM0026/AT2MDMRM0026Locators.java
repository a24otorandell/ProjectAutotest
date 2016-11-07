package screen.AT2MDMRM0026;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMRM0026Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0026Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE COUNTRY
         */
        //GENERALS
        elements.put("segment_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("segment_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("segment_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("segment_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("segment_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("segment_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("segment_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("segment_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("segment_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value10::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_code", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_type", "//*[contains(@id, 'pcgt2:tipoSegmentoId::content')]");
        elements.put("add_lov_type", "//*[contains(@id, 'pcgt2:tipoSegmentoId::lovIconId')]");
        elements.put("add_i_desc", "//*[contains(@id, 'pcgt2:it3::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'afr_c6::content')]");

        /**
         * TABLE MULTI
         */
        //GENERALS
        elements.put("multi_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("multi_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("multi_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("multi_e_result", "//*[contains(@id, 'pc2:t5::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc2:ot4')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_language", "//*[contains(@id, 'pcgt1:codIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'pcgt1:codIdiomaId::lovIconId')]");
        elements.put("add_i_lang_des", "//*[contains(@id, 'pcgt1:it2::content')]");
        //QBE
        elements.put("qbe_i_language", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_lang_des", "//*[contains(@id, 'afr_c4::content')]");
    }
}
