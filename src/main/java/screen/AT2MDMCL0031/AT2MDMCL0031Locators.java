package screen.AT2MDMCL0031;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2MDMCL0031Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0031Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERAL
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("MDM_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pc1:pdm2:dc_cmi1')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:hotel::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_partner", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_partner", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_TO_exp", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_group", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value30::content')]");
        //QBE
        elements.put("qbe_i_partner", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_group", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_c1::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_partner", "//*[contains(@id, 'pcgt1:nomCortoTtooTransId::content')]");
        elements.put("add_lov_partner", "//*[contains(@id, 'pcgt1:nomCortoTtooTransId::lovIconId')]");
        elements.put("add_i_group", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        //MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_partner", "//*[contains(@id, 'pcgt1:nomCortoTtooTransId::content')]");
        elements.put("add_lov_partner", "//*[contains(@id, 'pcgt1:nomCortoTtooTransId::lovIconId')]");
        elements.put("add_i_group", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it3::content')]");
    }
}
