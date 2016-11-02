package screen.AT2MDMRM0042;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 28/10/2016.
 */
public class AT2MDMRM0042Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0042Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:market::db')]/table/tbody/tr[1]/td[1]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_date", "//*[contains(@id, 'pcgt1:id2::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt1:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt1:codInterfaceId::lovIconId')]");
        elements.put("add_e_interface_description", "//*[contains(@id, 'pc1:pcgt1:it7::content')]");
        elements.put("add_i_TO", "//*[contains(@id, 'pcgt1:dES_TTOOId::content')]");
        elements.put("add_lov_TO", "//*[contains(@id, 'pcgt1:dES_TTOOId::lovIconId')]");
        elements.put("add_i_%_endowment", "//*[contains(@id, 'pcgt1:it3::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_date", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_interface_description", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_TO", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_TO", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_%_endowment", "//*[contains(@id, 'qryId1:value40::content')]");
        //QBE
        elements.put("qbe_i_date", "//*[contains(@id, 'pc1:market:id1::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'pc1_afr_market_afr_resId1c2::content')]");
        elements.put("qbe_i_interface_description", "//*[contains(@id, 'pc1_afr_market_afr_resId1c3::content')]");
        elements.put("qbe_i_TO", "//*[contains(@id, 'pc1:market:it37::content')]");
        elements.put("qbe_i_%_endowment", "//*[contains(@id, 'pc1:market:itp19::content')]");
    }
}