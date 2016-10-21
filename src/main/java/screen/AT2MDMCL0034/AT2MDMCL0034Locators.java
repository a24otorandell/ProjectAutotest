package screen.AT2MDMCL0034;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 20/10/2016.
 */
public class AT2MDMCL0034Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0034Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("MDM_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:hotel::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_partner", "//*[contains(@id, 'pcgt1:seqTtooId::content')]");
        elements.put("add_lov_partner", "//*[contains(@id, 'pcgt1:seqTtooId::lovIconId')]");
        elements.put("add_e_partner_description", "//*[contains(@id, 'pcgt1:it9::content')]");
        elements.put("add_i_date_from", "//*[contains(@id, 'pcgt1:id2::content')]");
        elements.put("add_i_origin_currency_code", "//*[contains(@id, 'pcgt1:codDivisaOriId::content')]");
        elements.put("add_lov_origin_currency_code", "//*[contains(@id, 'pcgt1:codDivisaOriId::lovIconId')]");
        elements.put("add_e_origin_currency_code_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_destination_currency_code", "//*[contains(@id, 'pcgt1:codDivisaDesId::content')]");
        elements.put("add_lov_destination_currency_code", "//*[contains(@id, 'pcgt1:codDivisaDesId::lovIconId')]");
        elements.put("add_e_destination_currency_code_description", "//*[contains(@id, 'pcgt1:it8::content')]");
        elements.put("add_i_tax_number", "//*[contains(@id, 'pcgt1:it1::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_partner", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_partner", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_partner_description", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_partner_result", "//*[contains(@id, 'pc1:hotel::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("search_i_date_from", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_origin_currency_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_origin_currency_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_origin_currency_result", "//*[contains(@id, 'pc1:hotel::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("search_i_destination_currency_code", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_destination_currency_code", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_destination_currency_result", "//*[contains(@id, 'pc1:hotel::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("search_i_tax_number", "//*[contains(@id, 'qryId1:value50::content')]");
        //QBE
        elements.put("qbe_i_partner_name", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_date_from", "//*[contains(@id, 'hotel:id1::content')]");
        elements.put("qbe_i_origin_currency_code", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_origin_currency", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_destination_currency_code", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_destination_currency", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_tax_number", "//*[contains(@id, 'hotel:itt1::content')]");
    }
}