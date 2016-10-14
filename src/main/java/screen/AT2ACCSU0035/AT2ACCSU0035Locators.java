package screen.AT2ACCSU0035;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 13/10/2016.
 */
public class AT2ACCSU0035Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0035Locators(String enviroment) {
        setElements();
    }


    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("taxes_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("taxes_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("taxes_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("taxes_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("taxes_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("taxes_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("taxes_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("taxes_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("taxes_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_company_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_from_date", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_fiscal_zone", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_fiscal_zone", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_description2", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_purchase_percentage", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_purchase_amount", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_sale_percentage", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_sale_amount", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_sl_application_type", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId1:value110::lovIconId')]");
        //QBE
        elements.put("qbe_i_company_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_from_date", "//*[contains(@id, 'resId1:id1::content')]");
        elements.put("qbe_i_fiscal_code", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_description2", "//*[contains(@id, 'afr_resId1c6::content')]");
        elements.put("qbe_i_purchase_percentage", "//*[contains(@id, 'afr_resId1c7::content')]");
        elements.put("qbe_i_purchase_amount", "//*[contains(@id, 'afr_resId1c8::content')]");
        elements.put("qbe_i_sale_percentage", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_sale_amount", "//*[contains(@id, 'afr_resId1c10::content')]");
        elements.put("qbe_sl_application_type", "//*[contains(@id, 'resId1:soc5::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'afr_resId1c12::content')]");
        //ADD
        elements.put("add_i_company_code", "//*[contains(@id, 'pcgt2:codempId::content')]");
        elements.put("add_lov_company_code", "//*[contains(@id, 'pcgt2:codempId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgt2:officeId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgt2:officeId::lovIconId')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt2:plam1')]/td[2]");
        elements.put("add_i_from_date", "//*[contains(@id, 'pcgt2:id2::content')]");
        elements.put("add_i_fiscal_zone", "//*[contains(@id, 'pcgt2:codZonfisId::content')]");
        elements.put("add_lov_fiscal_zone", "//*[contains(@id, 'pcgt2:codZonfisId::lovIconId')]");
        elements.put("add_i_description2", "//*[contains(@id, ''pcgt2:plam2')]/td[2]");
        elements.put("add_i_purchase_percentage", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_i_purchase_amount", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_sale_percentage", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_sale_amount", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_sl_application_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("add_lov_currency", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
    }
}
