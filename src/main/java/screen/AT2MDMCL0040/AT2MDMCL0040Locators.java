package screen.AT2MDMCL0040;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 14/11/2016.
 */
public class AT2MDMCL0040Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0040Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("credit_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("credit_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("credit_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("credit_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("credit_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("credit_e_records", "//*[contains(@id, 'pc1:outputText1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_sap",".//*[contains (@id, 'ssrCodId::content')]");
        elements.put("search_lov_sap",".//*[contains (@id, 'ssrCodId::lovIconId')]");
        elements.put("search_i_code", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_short", "//*[contains(@id, 'value10::content')]");
        //QBE
        elements.put("qbe_i_code",".//*[contains (@id, 'afr_resId1_afr_resId1c7::content')]");
        elements.put("qbe_i_short",".//*[contains (@id, 'afr_resId1_afr_resId1c12::content')]");
    }
}
