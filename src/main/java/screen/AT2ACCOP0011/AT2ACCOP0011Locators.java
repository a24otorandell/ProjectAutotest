package screen.AT2ACCOP0011;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 22/09/2016.
 */
public class AT2ACCOP0011Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0011Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("mapping_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("mapping_add_i_error", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("mapping_add_i_error_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("mapping_add_sl_priority", "//*[contains(@id, 'pcgt1:soc1::content')]");
        elements.put("mapping_add_i_email", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("mapping_add_b_exit", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //SEARCH

        elements.put("mapping_se_i_error", "//*[contains(@id, 'value00::content')]");
        elements.put("mapping_se_i_email", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("mapping_se_sl_priority", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("mapping_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("mapping_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("mapping_se_e_result", "//*[contains(@id, 'resId1::db')]/table/tbody/tr/td[1]");

        //EDIT

        elements.put("mapping_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("mapping_ed_i_error", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("mapping_ed_i_error_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("mapping_ed_sl_priority", "//*[contains(@id, 'pcgt1:soc1::content')]");
        elements.put("mapping_ed_i_email", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("mapping_ed_b_exit", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //QBE

        elements.put("mapping_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("mapping_qbe_i_error", "//*[contains(@id, 'afr_resId1_afr_resId1c1::content')]");
        elements.put("mapping_qbe_i_error_description", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("mapping_qbe_i_email", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("mapping_qbe_sl_priority", "//*[contains(@id, 'resId1:soc3::content')]");

        //OTHER ACTIONS
        elements.put("mapping_oa_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE
        elements.put("mapping_del_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("mapping_del_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("mapping_del_b_delete_yes", "//*[contains(@id, 'pcgt1:cbt1')]");
    }
}
