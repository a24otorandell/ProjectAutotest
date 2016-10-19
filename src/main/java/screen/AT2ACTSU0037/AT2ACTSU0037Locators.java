package screen.AT2ACTSU0037;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2ACTSU0037Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACTSU0037Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("suppliers_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("suppliers_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("suppliers_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("suppliers_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("suppliers_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("suppliers_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("suppliers_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("suppliers_e_result", "//*[contains(@id, 'pc1:distab::db')]/table/tbody/tr/td[1]");
        elements.put("suppliers_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_to", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_to", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_to_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_days", "//*[contains(@id, 'qryId1:value50::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_i_to", "//*[contains(@id, 'pcgt2:seqTtooId::content')]");
        elements.put("add_lov_to", "//*[contains(@id, 'pcgt2:seqTtooId::lovIconId')]");
        elements.put("add_i_to_name", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::lovIconId')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_i_days", "//*[contains(@id, 'pcgt2:it2::content')]");
        //QBE
        elements.put("qbe_sl_type", "//*[contains(@id, 'soc2::content')]");
        elements.put("qbe_i_to", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_to_name", "//*[contains(@id, 'afr_resId1c6::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_days", "//*[contains(@id, 'afr_resId1c3::content')]");
    }
}
