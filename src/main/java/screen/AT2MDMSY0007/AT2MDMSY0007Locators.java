package screen.AT2MDMSY0007;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMSY0007Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0007Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //DOMAINS
                elements.put("MDM_dms_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_dms_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_dms_b_delete_ok", "//*[contains(@id, 'pc1:pcgt2:cbt1')]");
                elements.put("MDM_dms_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_dms_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_dms_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_dms_e_records", "//*[contains(@id, 'pc1:ot2')]");
            //MULTI-LANGUAGE
                elements.put("MDM_ml_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_ml_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_ml_b_delete_ok", "//*[contains(@id, 'pc2:pcgt1:cbt1')]");
                elements.put("MDM_ml_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_ml_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_ml_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_ml_e_result", "//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_ml_e_records", "//*[contains(@id, 'pc2:ot8')]");
        //ADD|MODIFY
            //DOMAINS
                elements.put("add_dms_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_dms_i_domain_code", "//*[contains(@id, 'pcgt2:it2::content')]");
                elements.put("add_dms_i_value", "//*[contains(@id, 'pcgt2:it1::content')]");
            //MULTI-LANGUAGE
                elements.put("add_ml_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_ml_i_language", "//*[contains(@id, 'pcgt1:sidiCodIdiomaId::content')]");
                elements.put("add_ml_lov_language", "//*[contains(@id, 'pcgt1:sidiCodIdiomaId::lovIconId')]");
                elements.put("add_ml_i_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_domain_code", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_i_value", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
            //DOMAINS
                elements.put("qbe_dms_i_domain_code", "//*[contains(@id, 'afr_resId1_afr_resId1c1::content')]");
                elements.put("qbe_dms_i_value", "//*[contains(@id, 'afr_resId1_afr_resId1c2::content')]");
            //MULTI-LANGUAGE
                elements.put("qbe_ml_i_language", "//*[contains(@id, 'afr_t1_afr_c2::content')]");
                elements.put("qbe_ml_i_description", "//*[contains(@id, 'afr_t1_afr_c1::content')]");
    }

}
