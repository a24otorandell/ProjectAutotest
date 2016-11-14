package screen.AT2MDMSP0012;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 10/11/2016.
 */
public class AT2MDMSP0012Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0012Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach","//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result","//*[contains(@id, 'r1:1:pc1:t2::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records","//*[contains(@id, 'pc1:ot3')]");
        //SEARCH
            elements.put("search_b_consult", "//*[contains(@id, '1:cb1')]");
            elements.put("search_b_reset_password", "//*[contains(@id, '1:cb2')]");
            elements.put("search_b_reset_password_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
            elements.put("search_i_user", "//*[contains(@id, '1:usuId::content')]");
            elements.put("search_lov_user", "//*[contains(@id, '1:usuId::lovIconId')]");
            //elements.put("search_e_company_code_result", "//*[contains(@id, 'r1:1:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
            elements.put("search_e_company_code_result", "//*[contains(@id, 'r1:1:pc1:t2:0:ot49')]");
            //elements.put("search_e_office_result", "//*[contains(@id, 'r1:1:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
            elements.put("search_e_office_result", "//*[contains(@id, 'r1:1:pc1:t2:0:it2')]");
            //elements.put("search_e_description_result", "//*[contains(@id, 'r1:1:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
            elements.put("search_e_description_result", "//*[contains(@id, 'r1:1:pc1:t2:0:it1')]");
            //elements.put("search_e_hotel_result", "//*[contains(@id, 'r1:1:pc1:t2::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
            elements.put("search_e_hotel_result", "//*[contains(@id, 'r1:1:pc1:t2:0:it42')]");
        //QBE
            elements.put("qbe_i_company_code", "//*[contains(@id, 'afr_pc1_afr_t2_afr_c2::content')]");
            elements.put("qbe_i_office", "//*[contains(@id, 'afr_pc1_afr_t2_afr_c4::content')]");
            elements.put("qbe_i_description", "//*[contains(@id, 'afr_pc1_afr_t2_afr_c3::content')]");
            elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_pc1_afr_t2_afr_c5::content')]");
    }
}