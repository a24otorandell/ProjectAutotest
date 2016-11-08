package screen.AT2MDMSY1003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY1003Locators {    
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY1003Locators(String enviroment) {
        setElements();
    }

    public java.util.Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("parameters_b_add", "//*[contains(@id, 'toolbar_ParametersGvccTBBean:boton_add')]");
        elements.put("parameters_b_delete", "//*[contains(@id, 'toolbar_ParametersGvccTBBean:boton_remove')]");
        elements.put("parameters_b_edit", "//*[contains(@id, 'toolbar_ParametersGvccTBBean:boton_edit')]");
        elements.put("parameters_b_actions", "//*[contains(@id, 'pcgmc1:dc_m1')]");
        elements.put("parameters_b_actions_b_audit_data", "//*[contains(@id, 'pcgmc1:dc_cmi1')]/td[2]");
        elements.put("parameters_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("parameters_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("parameters_e_result", "//*[contains(@id, 'pc1:tabmp::db')]/table/tbody/tr[1]/td[1]");
        elements.put("parameters_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_param", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value10::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'toolbar_ParametersGvccTBBean:btn_commitExit')]");
        elements.put("add_i_param", "//*[contains(@id, 'it4::content')]");
        elements.put("add_i_value", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_type", "//*[contains(@id, 'it5::content')]");
        elements.put("add_sl_environment", "//*[contains(@id, 'soc1::content')]");
        elements.put("add_i_desc", "//*[contains(@id, 'it3::content')]");
        //QBE
        elements.put("qbe_i_param", "//*[contains(@id, 'pc1_afr_tabmp_afr_c1::content')]");
        elements.put("qbe_i_value", "//*[contains(@id, 'pc1_afr_tabmp_afr_c4::content')]");
        elements.put("qbe_i_type", "//*[contains(@id, 'pc1_afr_tabmp_afr_c3::content')]");
        elements.put("qbe_sl_environment", "//*[contains(@id, 'pc1:tabmp:soc3::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'pc1_afr_tabmp_afr_c2::content')]");
    }
}
