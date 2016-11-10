package screen.AT2MDMSY0023;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 09/11/2016.
 */
public class AT2MDMSY0023Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0023Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
            elements.put("MDM_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
            elements.put("MDM_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //ADD|MODIFY
            elements.put("add_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
            elements.put("add_i_application", "//*[contains(@id, 'pc1:pcgt1:it7::content')]");
            elements.put("add_i_group", "//*[contains(@id, 'pc1:pcgt1:it6::content')]");
            elements.put("add_i_name", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
            elements.put("add_i_value", "//*[contains(@id, 'pc1:pcgt1:it4::content')]");
            elements.put("add_i_type", "//*[contains(@id, 'pc1:pcgt1:it5::content')]");
            elements.put("add_i_remarks", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");
            elements.put("add_i_parameter_value", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_environment", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_environment", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        //QBE
            elements.put("qbe_i_application", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c5::content')]");
            elements.put("qbe_i_group", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c4::content')]");
            elements.put("qbe_i_name", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c7::content')]");
            elements.put("qbe_i_value", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c6::content')]");
            elements.put("qbe_i_type", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c3::content')]");
            elements.put("qbe_i_remarks", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c2::content')]");
            elements.put("qbe_i_parameter_value", "//*[contains(@id, 'afr_pc1_afr_resId1_afr_c8::content')]");
    }
}