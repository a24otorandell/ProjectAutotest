package screen.AT2MDMSY1002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY1002Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY1002Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("client_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("client_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("client_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("client_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("client_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("client_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("client_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("client_e_result", "//*[contains(@id, 'pc1:userSet::db')]/table/tbody/tr[1]/td[1]");
        elements.put("client_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_client", "//*[contains(@id, 'qryId1:value00::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_client", "//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_password", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("add_i_desc", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("add_i_mail", "//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("add_ck_create", "//*[contains(@id, 'pc1:pcgt2:sbc5::content')]");
        elements.put("add_ck_update", "//*[contains(@id, 'pc1:pcgt2:sbc8::content')]");
        elements.put("add_ck_monitoring", "//*[contains(@id, 'pc1:pcgt2:sbc7::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pc1:pcgt2:sbc6::content')]");
        //QBE
        elements.put("qbe_i_client", "//*[contains(@id, 'pc1_afr_userSet_afr_c3::content')]");
        elements.put("qbe_i_mail", "//*[contains(@id, 'pc1_afr_userSet_afr_c6::content')]");
        elements.put("qbe_sl_create", "//*[contains(@id, 'pc1:userSet:socf4::content')]");
        elements.put("qbe_sl_update", "//*[contains(@id, 'pc1:userSet:soc1::content')]");
        elements.put("qbe_sl_monitoring", "//*[contains(@id, 'pc1:userSet:soc2::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'pc1:userSet:soc3::content')]");
    }
}
