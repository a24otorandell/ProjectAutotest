package screen.AT2MDMUS0015;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 09/11/2016.
 */
public class AT2MDMUS0015Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0015Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("users_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("users_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("users_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("users_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("users_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("users_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("users_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("users_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("users_e_records", "//*[contains(@id, 'pc1:outputText7')]");
        elements.put("users_b_reset", "//*[contains(@id, 'resId1::ch::t')]/tbody/tr[2]/th/a");
        //SEARCB
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_user", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_code", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("add_i_user", "//*[contains(@id, 'pc1:pcgt1:codUsuId::content')]");
        elements.put("add_lov_user", "//*[contains(@id, 'pc1:pcgt1:codUsuId::lovIconId')]");
        elements.put("add_i_user_name", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pc1:pcgt1:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pc1:pcgt1:codInterfaceId::lovIconId')]");
        elements.put("add_i_interface_des", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
        //QBE
        elements.put("qbe_sl_type", "//*[contains(@id, 'pc1:resId1:soc3::content')]");
        elements.put("qbe_i_user", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("qbe_i_user_name", "//*[contains(@id, 'pc1_afr_resId1_afr_c2::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c4::content')]");
        elements.put("qbe_i_interface_des", "//*[contains(@id, 'pc1_afr_resId1_afr_c1::content')]");
        //COPY USER
        elements.put("search_i_from_user", "//*[contains(@id, 'usUiniId::content')]");
        elements.put("search_lov_from_user", "//*[contains(@id, 'usUiniId::lovIconId')]");
        elements.put("search_i_to_user", "//*[contains(@id, 'usufinId::content')]");
        elements.put("search_lov_to_user", "//*[contains(@id, 'usufinId::lovIconId')]");
        elements.put("search_b_copy", "//*[contains(@id, 's2:cb1')]");
    }
}
