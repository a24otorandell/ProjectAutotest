package screen.AT2ACCSU0056;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2ACCSU0056Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0056Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERAL
        elements.put("accommodation_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("accommodation_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("accommodation_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("accommodation_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("accommodation_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("accommodation_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        //elements.put("accommodation_e_result_sis","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr/td[1]");
        elements.put("accommodation_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_client_exp", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_product_exp", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_creation_user", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_e_rule_sequence_result", "//*[contains(@id, 'pc1:resId1::db')]/table[1]/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        //QBE
        elements.put("qbe_i_rule_sequence", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_client_exp", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_product_exp", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_resId1c4::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_client_exp", "//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("add_i_product_exp", "//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        //MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_client_exp", "//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("add_i_product_exp", "//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
    }
}