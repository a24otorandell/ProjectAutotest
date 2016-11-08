package screen.AT2MDMSY1001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY1001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY1001Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("operator_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("operator_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("operator_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("operator_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("operator_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("operator_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("operator_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("operator_e_result", "//*[contains(@id, 'pc1:gvcc::db')]/table/tbody/tr[1]/td[1]");
        elements.put("operator_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_operator", "//*[contains(@id, 'qryId1:value00::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_operator", "//*[contains(@id, 'it8::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'it4::content')]");
        elements.put("add_sl_type", "//*[contains(@id, 'soc1::content')]");
        elements.put("add_i_user", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_password", "//*[contains(@id, 'it7::content')]");
        elements.put("add_i_password_conf", "//*[contains(@id, 'it13::content')]");
        elements.put("add_i_url_pro", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_url_test", "//*[contains(@id, 'it3::content')]");
        elements.put("add_ck_alternative", "//*[contains(@id, 'pc1:pcgt2:sbc1::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pc1:pcgt2:sbc2::content')]");
        //QBE
        elements.put("qbe_i_operator", "//*[contains(@id, 'pc1_afr_gvcc_afr_resId1c1::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'pc1_afr_gvcc_afr_resId1c2::content')]");
        elements.put("qbe_sl_alternative", "//*[contains(@id, 'pc1:gvcc:soc4::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'pc1:gvcc:soc2::content')]");
    }
}
