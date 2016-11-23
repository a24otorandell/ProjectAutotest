package screen.AT2MDMCL0012;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 22/11/2016.
 */
public class AT2MDMCL0012Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0012Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE PLATFORM
         */
        //GENERALS
        elements.put("platform_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("platform_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("platform_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("platform_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("platform_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("platform_b_actions_delete", "//*[contains(@id, 'pdm2:dc_cmi3')]/td[2]");
        elements.put("platform_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("platform_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("platform_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("platform_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("platform_b_ok_delete" ,"//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_platform", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'value10::content')]");
        elements.put("search_ck_email", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_ck_push", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_ck_voucher", "//*[contains(@id, 'qryId1:value40::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_platform", "//*[contains(@id, 'it1::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'it2::content')]");
        elements.put("add_ck_email", "//*[contains(@id, 'pc1:pcgt1:sbc3::content')]");
        elements.put("add_ck_push", "//*[contains(@id, 'pc1:pcgt1:sbc4::content')]");
        elements.put("add_ck_voucher", "//*[contains(@id, 'pc1:pcgt1:sbc8::content')]");
        //QBE
        elements.put("qbe_i_platform","//*[contains(@id,'pc1:resId1:it24::content')]");
        elements.put("qbe_i_desc","//*[contains(@id,'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("qbe_sl_email","//*[contains(@id,'pc1:resId1:soc2::content')]");
        elements.put("qbe_sl_push","//*[contains(@id,'pc1:resId1:soc1::content')]");
        elements.put("qbe_sl_voucher","//*[contains(@id,'selectOneChoice1::content')]");
        /**
         * TABLE PLATFORM FREE
         */
        //GENERALS
        elements.put("free_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("free_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("free_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("free_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("free_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("free_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("free_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("free_e_result", "//*[contains(@id, 'pc2:pfee::db')]/table/tbody/tr[1]/td[1]");
        elements.put("free_e_records", "//*[contains(@id, 'pc2:ot8')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_app_date_start", "//*[contains(@id, 'id2::content')]");
        elements.put("add_i_app_date_end", "//*[contains(@id, 'id1::content')]");
        elements.put("add_i_to_code", "//*[contains(@id, 'seqTtooId::content')]");
        elements.put("add_lov_to_code", "//*[contains(@id, 'seqTtooId::lovIconId')]");
        elements.put("add_e_to_code_name", "//*[contains(@id, 'pc2:pcgt2:it9::content')]");
        elements.put("add_i_country", "//*[contains(@id, 'paisMercadoId::content')]");
        elements.put("add_lov_country", "//*[contains(@id, 'paisMercadoId::lovIconId')]");
        elements.put("add_i_country_info", "//*[contains(@id, 'pc2:pcgt2:ot37')]");
        elements.put("add_i_date_from", "//*[contains(@id, 'id8::content')]");
        elements.put("add_i_date_to", "//*[contains(@id, 'id7::content')]");
        elements.put("add_i_amount", "//*[contains(@id, 'it10::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'codDivisaId::content')]");
        elements.put("add_lov_currency", "//*[contains(@id, 'codDivisaId::lovIconId')]");
        elements.put("add_i_currency_info", "//*[contains(@id, 'pc2:pcgt2:ot38')]");
        elements.put("add_i_imp", "//*[contains(@id, 'it11::content')]");
        elements.put("add_sl_canceled", "//*[contains(@id, 'soc3::content')]");
        elements.put("add_ck_tax", "//*[contains(@id, 'sbc6::content')]");
        //QBE
        elements.put("qbe_i_app_date_start", "//*[contains(@id, 'pc2:pfee:id4::content')]");
        elements.put("qbe_i_app_date_end", "//*[contains(@id, 'id6::content')]");
        elements.put("qbe_i_to_code", "//*[contains(@id, '_afr_c2::content')]");
        elements.put("qbe_i_to_name", "//*[contains(@id, 'pc2_afr_pfee_afr_c9::content')]");
        elements.put("qbe_i_country_code", "//*[contains(@id, '_afr_c26::content')]");
        elements.put("qbe_i_country_name", "//*[contains(@id, 'pc2_afr_pfee_afr_c15::content')]");
        elements.put("qbe_i_date_from", "//*[contains(@id, 'id5::content')]");
        elements.put("qbe_i_date_to", "//*[contains(@id, 'id3::content')]");
        elements.put("qbe_i_amount", "//*[contains(@id, '_afr_c20::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, '_afr_c11::content')]");
        elements.put("qbe_i_currency_des", "//*[contains(@id, 'pc2_afr_pfee_afr_c16::content')]");
        elements.put("qbe_i_imp", "//*[contains(@id, '_afr_c4::content')]");
        elements.put("qbe_sl_canceled", "//*[contains(@id, 'soc5::content')]");
        elements.put("qbe_sl_tax", "//*[contains(@id, 'soc6::content')]");
    }
}
