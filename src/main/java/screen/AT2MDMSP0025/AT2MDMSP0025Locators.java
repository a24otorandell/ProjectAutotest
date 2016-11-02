package screen.AT2MDMSP0025;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 02/11/2016.
 */
public class AT2MDMSP0025Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0025Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        //MARKET
        elements.put("MDM_market_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_market_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("MDM_market_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        elements.put("MDM_market_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("MDM_market_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("MDM_market_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("MDM_market_b_actions_copy_market", "//*[contains(@id, 'pcgm1:dc_cmi2')]/td[2]");
        elements.put("MDM_market_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_market_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_market_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_market_e_records", "//*[contains(@id, 'pc1:ot111')]");
        //MARKET COUNTRY
        elements.put("MDM_marketc_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_marketc_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_marketc_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
        elements.put("MDM_marketc_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_marketc_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("MDM_marketc_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("MDM_marketc_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("MDM_marketc_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("MDM_marketc_e_result", "//*[contains(@id, 'pc2:detail::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_marketc_e_records", "//*[contains(@id, 'pc2:ot222')]");
        //ADD|MODIFY
        //MARKET
        elements.put("add_market_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_market_i_market", "//*[contains(@id, 'pcgt1:it6::content')]");
        elements.put("add_market_i_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_market_i_country", "//*[contains(@id, 'pcgt1:inputListOfValues1::content')]");
        elements.put("add_market_lov_country", "//*[contains(@id, 'pcgt1:inputListOfValues1::lovIconId')]");
        elements.put("add_market_i_country_description", "//*[contains(@id, 'pcgt1:it8::content')]");
        elements.put("add_market_i_actions_copy_market", "//*[contains(@id, '1:it17::content')]");
        elements.put("add_market_i_actions_copy_description", "//*[contains(@id, '1:it15::content')]");
        elements.put("add_market_b_actions_copy_save", "//*[contains(@id, '1:cb1')]");
        //MARKET COUNTRY
        elements.put("add_marketc_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_marketc_i_country", "//*[contains(@id, 'pcgt2:spaiCodPaisId::content')]");
        elements.put("add_marketc_lov_country", "//*[contains(@id, 'pcgt2:spaiCodPaisId::lovIconId')]");
        elements.put("add_marketc_e_country_description", "//*[contains(@id, 'pcgt2:it1::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_market", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
        //MARKET
        elements.put("qbe_market_i_market", "//*[contains(@id, 'afr_master_afr_resId1c1::content')]");
        elements.put("qbe_market_i_description", "//*[contains(@id, 'afr_master_afr_resId1c2::content')]");
        //MARKET_DESCRIPTION
        elements.put("qbe_marketc_i_country", "//*[contains(@id, 'afr_detail_afr_c2::content')]");
        elements.put("qbe_marketc_i_country_description", "//*[contains(@id, 'afr_detail_afr_c3::content')]");
    }
}
