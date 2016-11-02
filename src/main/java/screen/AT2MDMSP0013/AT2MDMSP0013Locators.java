package screen.AT2MDMSP0013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMSP0013Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0013Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("profiles_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("profiles_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("profiles_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("profiles_b_actions", "//*[contains(@id, 'PCGenericMenu5:dc_m1')]");
        elements.put("profiles_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu5:dc_cmi0')]/td[2]");
        elements.put("profiles_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("profiles_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("profiles_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("profiles_e_records", "//*[contains(@id, 'pc1:ot22')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_profile", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'value10::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_profile", "//*[contains(@id, 'it1::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'it2::content')]");
        //QBE
        elements.put("qbe_i_profile", "//*[contains(@id, '_resId1c1::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, '_resId1_afr_c2::content')]");
    }
}
