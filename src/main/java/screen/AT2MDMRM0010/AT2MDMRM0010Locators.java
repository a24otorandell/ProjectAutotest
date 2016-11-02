package screen.AT2MDMRM0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/10/2016.
 */
public class AT2MDMRM0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0010Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("time_b_edit", "//*[contains(@id, 'pcgtid0:boton_edit')]");
        elements.put("time_b_actions", "//*[contains(@id, 'pcgmid0:dc_m1')]");
        elements.put("time_b_actions_b_audit_data", "//*[contains(@id, 'pcgmid0:dc_cmi0')]/td[2]");
        elements.put("time_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("time_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("time_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("time_e_records", "//*[contains(@id, 'pc1:ot1id0')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_to_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_to_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_to_desc", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_cancel", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_time", "//*[contains(@id, 'qryId1:value40::content')]");
        //EDIT
        elements.put("add_b_save", "//*[contains(@id, 'pcgtid0:btn_commitExit')]");
        elements.put("edit_i_to_code", "//*[contains(@id, 'it1::content')]");
        elements.put("edit_i_to_name", "//*[contains(@id, 'it2::content')]");
        elements.put("edit_i_to_desc", "//*[contains(@id, 'it3::content')]");
        elements.put("edit_i_cancel", "//*[contains(@id, 'it4::content')]");
        elements.put("edit_i_time", "//*[contains(@id, 'it5::content')]");
        //QBE
        elements.put("qbe_i_to_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_to_name", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_to_desc", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_cancel", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_time", "//*[contains(@id, 'afr_resId1c5::content')]");
    }
}
