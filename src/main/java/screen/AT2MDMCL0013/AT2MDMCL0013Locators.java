package screen.AT2MDMCL0013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0013Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0013Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot31')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_ATLAS_number", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_short_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_TO_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_availability_disp", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_availability_iteration_number", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_e_ATLAS_number_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("search_e_short_name_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("search_e_TO_name_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("search_e_availability_disp_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("search_e_availability_iteration_number_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        //QBE
        elements.put("qbe_i_ATLAS_number", "//*[contains(@id, 'it765::content')]");
        elements.put("qbe_i_short_name", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_TO_name", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_sl_availability_disp", "//*[contains(@id, 'soc2::content')]");
        elements.put("qbe_i_availability_iteration_number", "//*[contains(@id, 'afr_c2::content')]");
        //MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_sl_availability_disp", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("add_i_availability_iteration_number", "//*[contains(@id, 'pcgt2:it4::content')]");
    }
}