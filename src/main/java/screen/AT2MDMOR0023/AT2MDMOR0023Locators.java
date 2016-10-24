package screen.AT2MDMOR0023;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMOR0023Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0023Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("MDM_b_actions", "//*[contains(@id, 'id__ctru12pc7:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'id__ctru12pc7:dc_cmi1')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:reportOffices::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:outputText3')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_receptive_description", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_receptive_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_e_company_result", "/*//*[contains(@id, 'reportOffices:0:ot2::content')]");
        elements.put("search_e_company_description_result", "/*//*[contains(@id, 'reportOffices:0:ot5')]");
        elements.put("search_e_office_result", "/*//*[contains(@id, 'reportOffices:0:ot1::content')]");
        elements.put("search_e_receptive_description_result", "/*//*[contains(@id, 'reportOffices:0:ot4::content')]");
        elements.put("search_e_receptive_code_result", "/*//*[contains(@id, 'reportOffices:0:ot3::content')]");
        //QBE
        elements.put("qbe_e_company", "//*[contains(@id, 'afr_reportOfficesc2::content')]");
        elements.put("qbe_e_company_description", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_e_office", "//*[contains(@id, 'afr_reportOfficesc4::content')]");
        elements.put("qbe_e_receptive_description", "//*[contains(@id, 'afr_reportOfficesc1::content')]");
        elements.put("qbe_e_receptive_code", "//*[contains(@id, 'afr_reportOfficesc3::content')]");
    }
}
