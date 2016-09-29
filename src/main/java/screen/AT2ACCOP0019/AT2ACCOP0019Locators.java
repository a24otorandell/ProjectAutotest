package screen.AT2ACCOP0019;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 28/09/2016.
 */
public class AT2ACCOP0019Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0019Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }


    public void setElements() {


        //GIVE ELEMENTS
        elements.put("card_ips", "//*[contains(@id, 'qryId1:value80::pop')]/li[4]/ul/li[3]/label");
        elements.put("aed_united", "//*[contains(@id, 'qryId1:value70::pop')]/li[4]/ul/li[1]/label");
        elements.put("afn_afgan", "//*[contains(@id, 'qryId1:value70::pop')]/li[4]/ul/li[2]/label");
        elements.put("alypay_sis", "//*[contains(@id, 'qryId1:value80::pop')]/li[4]/ul/li[1]/label");
        elements.put("amex_ssl", "//*[contains(@id, 'qryId1:value80::pop')]/li[4]/ul/li[2]/label");

        elements.put("alypay_test", "//*[contains(@id, 'qryId1:value80::pop')]/li[4]/ul/li[1]/label");


        //ADD

        elements.put("mercant_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("mercant_add_lov_provider", "//*[contains(@id, 'pspMainId::lovIconId')]");
        elements.put("mercant_add_i_provider", "//*[contains(@id, 'pspMainId::content')]");
        elements.put("mercant_add_i_mercant", "//*[contains(@id, 'it5::content')]");
        elements.put("mercant_add_i_submercant", "//*[contains(@id, 'it4::content')]");
        elements.put("mercant_add_lov_country_code", "//*[contains(@id, 'codPaisId::lovIconId')]");
        elements.put("mercant_add_i_counter_code", "//*[contains(@id, 'codPaisId::content')]");
        elements.put("mercant_add_i_user", "//*[contains(@id, 'it6::content')]");
        elements.put("mercant_add_i_password", "//*[contains(@id, 'it1::content')]");
        elements.put("mercant_add_i_capture_delay", "//*[contains(@id, 'it3::content')]");
        elements.put("mercant_add_b_add_currency_and_payment_methods", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("mercant_add_lov_currency", "//*[contains(@id, 'msilov1:dc_ctb1::icon')]");
        elements.put("mercant_add_e_currency_code", "//*[contains(@id, 'msilov1:dc_t2::db')]/table/tbody/tr[1]/td[2]");
        elements.put("mercant_add_e_currency_pass", "//*[contains(@id, 'msilov1:dc_ctb4::icon')]");
        elements.put("mercant_add_e_currency_description", "//*[contains(@id, 'msilov1:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("mercant_add_lov_currency_b_ok", "//*[contains(@id, 'msilov1:dc_ctb5')]");
        elements.put("mercant_add_lov_payment_method", "//*[contains(@id, 'msilov2:dc_ctb1::icon')]");
        elements.put("mercant_add_e_payment_method_code", "//*[contains(@id, 'msilov2:dc_t2::db')]/table/tbody/tr[1]/td[3]");
        elements.put("mercant_add_e_payment_pass", "//*[contains(@id, 'msilov2:dc_ctb4::icon')]");
        elements.put("mercant_add_e_payment_method_description", "//*[contains(@id, 'msilov2:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("mercant_add_lov_payment_method_b_ok", "//*[contains(@id, 'msilov2:dc_ctb5')]");
        elements.put("mercant_add_b_save_currency_and_payment_methods", "//*[contains(@id, 'pcgt4:boton_commit')]");
        elements.put("mercant_add_b_save", "//*[contains(@id, 'pcgt2:boton_commit')]");
        elements.put("mercant_add_lov_currenzy_i_currenzy_code", "//*[contains(@id, 'msilov1:dc_q1:value00::content')]");
        elements.put("mercant_add_lov_currenzy_b_search", "//*[contains(@id, 'msilov1:dc_q1::search')]");
        elements.put("mercant_add_lov_payment_method_i_payment_methood", "//*[contains(@id, 'msilov2:dc_q1:value10::content')]");
        elements.put("mercant_add_lov_payment_method_b_search", "//*[contains(@id, 'msilov2:dc_q1::search')]");

        //SEARCH

        elements.put("mercant_se_lov_provider", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("mercant_se_lov_provider_i_psp_code", "//*[contains(@id, 'qryId1:value00::_afrLovInternalQueryId:value00::content')]");
        elements.put("mercant_se_i_provider", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("mercant_se_i_merchant", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("mercant_se_i_submerchant", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("mercant_se_lov_ocuntry_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("mercant_se_lov_country_code_i_country_code", "//*[contains(@id, 'qryId1:value30::_afrLovInternalQueryId:value00::content')]");
        elements.put("mercant_se_i_country_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("mercant_se_sl_active", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("mercant_se_i_creation_date", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("mercant_se_i_delete_date", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("mercant_se_sl_currency", "//*[contains(@id, 'qryId1:value70::drop')]");
        elements.put("mercant_se_sl_currency_ch_aed", "//*[contains(@id, 'qryId1:value70::pop')]/li[4]/ul/li[1]/label/input");
        elements.put("mercant_se_sl_payment_method", "//*[contains(@id, 'qryId1:value80::drop')]");
        elements.put("mercant_se_sl_payment_method_credit_payment", "//*[contains(@id, 'qryId1:value80::pop')]/li[4]/ul/li[1]/label/input");
        elements.put("mercant_se_sl_payment_method_alipay", "//*[contains(@id, 'qryId1:value80::pop')]/li[4]/ul/li[1]/label");
        elements.put("mercant_se_b_save", "//*[contains(@id, 'qryId1::search')]");
        elements.put("mercant_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("mercant_se_e_result", "//*[contains(@id, 'tMerch::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("mercant_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("mercant_ed_lov_provider", "//*[contains(@id, 'pspMainId::lovIconId')]");
        elements.put("mercant_ed_i_provider", "//*[contains(@id, 'pspMainId::content')]");
        elements.put("mercant_ed_i_mercant", "//*[contains(@id, 'it5::content')]");
        elements.put("mercant_ed_i_submercant", "//*[contains(@id, 'it4::content')]");
        elements.put("mercant_ed_lov_country_code", "//*[contains(@id, 'codPaisId::lovIconId')]");
        elements.put("mercant_ed_i_counter_code", "//*[contains(@id, 'codPaisId::content')]");
        elements.put("mercant_ed_i_user", "//*[contains(@id, 'it6::content')]");
        elements.put("mercant_ed_i_password", "//*[contains(@id, '1:it1::content')]");
        elements.put("mercant_ed_i_capture_delay", "//*[contains(@id, 'it2::content')]");
        elements.put("mercant_ed_b_ed_currency_and_payment_methods", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("mercant_ed_lov_currency", "//*[contains(@id, 'tCurr:2:currencyId::lovIconId')]");
        elements.put("mercant_ed_lov_currcency_i_currency_code", "//*[contains(@id, 'tCurr:2:currencyId::_afrLovInternalQueryId:value00::content')]");
        elements.put("mercant_ed_i_currcy", "//*[contains(@id, 'tCurr:2:currencyId::content')]");
        elements.put("mercant_ed_e_currency_description", "//*[contains(@id, 'msilov1:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("mercant_ed_lov_currency_b_ok", "//*[contains(@id, 'msilov1:dc_ctb5')]");
        elements.put("mercant_ed_lov_payment_method", "//*[contains(@id, 'msilov2:dc_ctb1::icon')]");
        elements.put("mercant_ed_e_payment_method_code", "//*[contains(@id, 'msilov2:dc_t2::db')]/table/tbody/tr[1]/td[3]");
        elements.put("mercant_ed_e_payment_method_pass", "//*[contains(@id, 'msilov2:dc_ctb4::icon')]");
        elements.put("mercant_ed_e_payment_method_description", "//*[contains(@id, 'msilov2:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("mercant_ed_lov_payment_method_b_ok", "//*[contains(@id, 'msilov2:dc_ctb5')]");
        elements.put("mercant_ed_b_save_currency_and_payment_methods", "//*[contains(@id, 'pcgt4:boton_commit')]");
        elements.put("mercant_ed_b_save", "//*[contains(@id, 'pcgt2:boton_commit')]");
        elements.put("mercant_ed_e_currency_table", "//*[contains(@id, 'tCurr::db')]/table/tbody/tr[1]/td");

        //QBE

        elements.put("mercant_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("mercant_qbe_i_provider", "//*[contains(@id, 'afr_tMerch_afr_c5::content')]");
        elements.put("mercant_qbe_i_provider_description", "//*[contains(@id, 'afr_tMerch_afr_c11::content')]");
        elements.put("mercant_qbe_i_merchant", "//*[contains(@id, 'afr_tMerch_afr_c4::content')]");
        elements.put("mercant_qbe_i_submerchant", "//*[contains(@id, 'afr_tMerch_afr_c3::content')]");
        elements.put("mercant_qbe_i_country_code", "//*[contains(@id, 'afr_tMerch_afr_c8::content')]");
        elements.put("mercant_qbe_i_user", "//*[contains(@id, 'afr_tMerch_afr_c7::content')]");
        elements.put("mercant_qbe_i_password", "//*[contains(@id, 'afr_tMerch_afr_c2::content')]");
        elements.put("mercant_qbe_i_capture_delay", "//*[contains(@id, 'afr_tMerch_afr_c6::content')]");
        elements.put("mercant_qbe_i_secure_hash", "//*[contains(@id, 'afr_tMerch_afr_c9::content')]");
        elements.put("mercant_qbe_i_currency", "//*[contains(@id, 'afr_tMerch_afr_c10::content')]");
        elements.put("mercant_qbe_i_payment_method", "//*[contains(@id, 'afr_tMerch_afr_c1::content')]");

        //OTHER ACTIONS
        elements.put("mercant_oa_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("mercant_oa_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("mercant_oa_b_audit_data_ok", "//*[contains(@id, '1:d8::ok')]");
        elements.put("mercant_oa_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE

        elements.put("mercant_del_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("mercant_del_b_delete_b_ok", "//*[contains(@id, 'dyntdc:r1:1:ctbt1')]");


    }
}
