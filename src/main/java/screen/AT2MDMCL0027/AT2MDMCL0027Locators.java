package screen.AT2MDMCL0027;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0027Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0027Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERAL
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_group", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_short_name", "//*[contains(@id, 'pcgt2:nomCortoTtooId::content')]");
        elements.put("add_lov_short_name", "//*[contains(@id, 'pcgt2:nomCortoTtooId::lovIconId')]");
        elements.put("add_i_language", "//*[contains(@id, 'pcgt2:codIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'pcgt2:codIdiomaId::lovIconId')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_group", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_short_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_short_name", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_language", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_language", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        //QBE
        elements.put("qbe_i_group", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_short_name", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, 'afr_resId1c3::content')]");
    }
}