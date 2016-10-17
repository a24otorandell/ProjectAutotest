package screen.AT2ACCSU0057;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCSU0057Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0057Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("accommodation_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("accommodation_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("accommodation_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("accommodation_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_result", "//*[contains(@id, 'resId1::db')]/table[1]/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_records", "//*[contains(@id, 'pc1:ot278')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_key", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_age_ext_code", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_environment_id", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_value", "//*[contains(@id, 'qryId1:value30::content')]");
        //QBE
        elements.put("qbe_i_key", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_age_ext_code", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_environment_id", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_value", "//*[contains(@id, 'afr_resId1c4::content')]");
        //ADD
        elements.put("add_i_key", "//*[contains(@id, 'pcgt3:it3::content')]");
        elements.put("add_i_age_ext_code", "//*[contains(@id, 'pcgt3:it1::content')]");
        elements.put("add_i_environment_id", "//*[contains(@id, 'pcgt3:it2::content')]");
        elements.put("add_i_value", "//*[contains(@id, 'pcgt3:it4::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        //MODIFY
        elements.put("add_i_key", "//*[contains(@id, 'pcgt3:it3::content')]");
        elements.put("add_i_age_ext_code", "//*[contains(@id, 'pcgt3:it1::content')]");
        elements.put("add_i_environment_id", "//*[contains(@id, 'pcgt3:it2::content')]");
        elements.put("add_i_value", "//*[contains(@id, 'pcgt3:it4::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
    }
}
