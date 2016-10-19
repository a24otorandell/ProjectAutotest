package screen.AT2ACTSU1005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2ACTSU1005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACTSU1005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("activities_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("activities_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("activities_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("activities_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("activities_b_actions_audit_data", "//*[contains(@id, 'pc1:pdm2:dc_cmi0')]/td[2]");
        elements.put("activities_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("activities_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("activities_e_result", "//*[contains(@id, 'pc1:setBar::db')]/table/tbody/tr[1]/td[1]");
        elements.put("activities_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //ADD Y MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_prefix", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_code_result", "//*[contains(@id, 'pc1:setBar::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("search_i_prefix", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value20::content')]");
        //QBE
        elements.put("qbe_i_code", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_prefix", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_c3::content')]");
    }
}