package screen.AT2MDMSY0032;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 11/11/2016.
 */
public class AT2MDMSY0032Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0032Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_actions", "//*[contains(@id, 'r1:1:pc1:PCGenericMenu3:dc_m1')]");
            elements.put("MDM_b_actions_all", "//*[contains(@id, 'r1:1:pc1:PCGenericMenu3:dc_cmi1')]/td[2]");
            elements.put("MDM_b_actions_no_one", "//*[contains(@id, 'r1:1:pc1:PCGenericMenu3:dc_cmi2')]/td[2]");
            elements.put("MDM_b_actions_refresh", "//*[contains(@id, 'r1:1:pc1:PCGenericMenu3:dc_cmi3')]/td[2]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'r1:1:pc1:_qbeTbr')]");
            elements.put("MDM_b_qbe_clear", "//*[contains(@id, 'r1:1:pc1:resId1::ch::t')]/tbody/tr[2]/th/a");
            elements.put("MDM_b_detach", "//*[contains(@id, 'r1:1:pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'r1:1:pc1:outputText7')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'r1:1:qryId1::reset')]");
            elements.put("search_i_user", "//*[contains(@id, 'r1:1:qryId1:value00::content')]");
            elements.put("search_i_name", "//*[contains(@id, 'r1:1:qryId1:value10::content')]");
            elements.put("search_i_table", "//*[contains(@id, 'r1:1:qryId1:value20::content')]");
            elements.put("search_i_last_refresh", "//*[contains(@id, 'r1:1:qryId1:value30::content')]");
            elements.put("search_e_user_result", "//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
            elements.put("search_e_name_result", "//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
            elements.put("search_e_table_result", "//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
            elements.put("search_e_last_refresh_result", "//*[contains(@id, 'r1:1:pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        //QBE
            elements.put("qbe_i_user", "//*[contains(@id, 'afr_resId1_afr_resId1c1::content')]");
            elements.put("qbe_i_name", "//*[contains(@id, 'afr_resId1_afr_resId1c2::content')]");
            elements.put("qbe_i_table", "//*[contains(@id, 'afr_resId1_afr_resId1c3::content')]");
            elements.put("qbe_i_last_refresh", "//*[contains(@id, 'r1:1:pc1:resId1:id1::content')]");
    }
}
