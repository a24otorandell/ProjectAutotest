package screen.AT2MDMSY0013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMSY0013Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0013Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
            elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
            elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
            elements.put("MDM_b_actions", "//*[contains(@id, 'pc1:pcgmc1:dc_m1')]");
            elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgmc1:dc_cmi0')]/td[2]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'pc1:outputText1')]");
        //ADD|MODIFY
            elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
            elements.put("add_i_sales_channel_code", "//*[contains(@id, 'pcgt1:it1::content')]");
            elements.put("add_i_sale_description", "//*[contains(@id, 'pcgt1:it2::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_sales_channel_code", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_i_sale_description", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
            elements.put("qbe_i_sales_channel_code", "//*[contains(@id, 'afr_resId1_afr_c2::content')]");
            elements.put("qbe_i_sale_description", "//*[contains(@id, 'afr_resId1_afr_c1::content')]");
    }
}
