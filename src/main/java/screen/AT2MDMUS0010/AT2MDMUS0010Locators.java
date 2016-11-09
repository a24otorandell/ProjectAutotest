package screen.AT2MDMUS0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 09/11/2016.
 */
public class AT2MDMUS0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0010Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("passwords_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("passwords_b_actions_b_change", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("passwords_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("passwords_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("passwords_e_result", "//*[contains(@id, 'pc2:pwdTb::db')]/table/tbody/tr[1]/td[1]");
        elements.put("passwords_e_records", "//*[contains(@id, 'pc1:outputText7')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_user", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_user", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        //GET DATA
        elements.put("table_e_user", "//*[contains(@id, 'pc2:pwdTb::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("table_e_name", "//*[contains(@id, 'pc2:pwdTb::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("table_e_surname1", "//*[contains(@id, 'pc2:pwdTb::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("table_e_surname2", "//*[contains(@id, 'pc2:pwdTb::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        //QBE
        elements.put("qbe_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("qbe_i_user", "//*[contains(@id, 'pc2_afr_pwdTb_afr_c2::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc2_afr_pwdTb_afr_c4::content')]");
        elements.put("qbe_i_surname1", "//*[contains(@id, 'pc2_afr_pwdTb_afr_c1::content')]");
        elements.put("qbe_i_surname2", "//*[contains(@id, 'pc2_afr_pwdTb_afr_c3::content')]");
        //CHANGE PASSWORD
        elements.put("change_i_new_pass", "//*[contains(@id, 'pc2:it2::content')]");
        elements.put("change_i_confirm", "//*[contains(@id, 'pc2:it1::content')]");
        elements.put("change_b_ok", "//*[contains(@id, 'pc2:d3::ok')]");
    }
}
