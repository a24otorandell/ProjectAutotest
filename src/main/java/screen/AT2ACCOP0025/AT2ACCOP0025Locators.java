package screen.AT2ACCOP0025;

import java.util.HashMap;
import java.util.Map;

/***
 * Created by ajvirgili on 23/06/2016.
 */
public class AT2ACCOP0025Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0025Locators() {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /* SEARCH */
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_e_result", "//*[contains(@id, 't1::db')]/table/tbody/tr/td[1]");
        elements.put("search_n_records", "//*[contains(@id, 'pc1:ot9')]");

        elements.put("search_i_initialDate", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_initialDate2", "//*[contains(@id, 'qryId1:value01::content')]");
        elements.put("search_i_endDate", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_endDate2", "//*[contains(@id, 'qryId1:value61::content')]");
        elements.put("search_lov_provider", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_provider", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_merchant", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("search_i_merchant", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_lov_paymentMethod", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_paymentMethod", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_fix", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_lov_currencyFix", "//*[contains(@id, 'qryId1:value100::lovIconId')]");
        elements.put("search_i_currencyFix", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_percentage", "//*[contains(@id, 'qryId1:value50::content')]");

        /* RECORDS */
        elements.put("record_interaction_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("record_interaction_b_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("record_interaction_b_add_i_initialDate", "//*[contains(@id, 'pcgt1:id3::content')]");
        elements.put("record_interaction_b_add_i_endDate", "//*[contains(@id, 'pcgt1:id4::content')]");

        elements.put("record_interaction_b_add_i_provider", "//*[contains(@id, 'pcgt1:providerIdId::content')]");
        elements.put("record_interaction_b_add_lov_provider", "//*[contains(@id, 'pcgt1:providerIdId::lovIconId')]");

        elements.put("record_interaction_b_add_i_merchant", "//*[contains(@id, 'pcgt1:merchantId::content')]");
        elements.put("record_interaction_b_add_lov_merchant", "//*[contains(@id, 'pcgt1:merchantId::lovIconId')]");

        elements.put("record_interaction_b_add_i_paymentMethod", "//*[contains(@id, 'pcgt1:payMethodId::content')]");
        elements.put("record_interaction_b_add_lov_paymentMethod", "//*[contains(@id, 'pcgt1:payMethodId::lovIconId')]");

        elements.put("record_interaction_b_add_i_fix", "//*[contains(@id, 'pcgt1:it7::content')]");
        elements.put("record_interaction_b_add_i_percentage", "//*[contains(@id, 'pcgt1:it8::content')]");

        elements.put("record_interaction_b_add_i_currencyFix", "//*[contains(@id, 'pcgt1:fixCurrencyId::content')]");
        elements.put("record_interaction_b_add_lov_currencyFix", "//*[contains(@id, 'pcgt1:fixCurrencyId::lovIconId')]");

        elements.put("record_interaction_b_cancel", "//*[contains(@id, 'pcgt1:boton_rollbackp')]");
        elements.put("record_interaction_b_cancel_b_ok", "//*[contains(@id, 'pcgt1:ctbt1')]");


        elements.put("record_interaction_b_remove", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("record_interaction_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("record_interaction_b_dataHistory", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0']/td[2]')]");
        elements.put("record_interaction_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("record_interaction_b_fullPage", "//*[contains(@id, 'pc1:_dchTbr']/a')]");
        elements.put("record_interaction_b_fullPage_b_close", "//*[contains(@id, ':pc1::_afrDetachDialogId::close')]");//
        elements.put("record_interaction_i_qbe_provider", "//*[contains(@id, 'pc1:t1:it3::content')]"); //

        /* LOVS */
        elements.put("search_lov_provider_i_provider", "//*[contains(@id, 'qryId1:value10::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_lov_provider_i_description", "//*[contains(@id, 'qryId1:value10::_afrLovInternalQueryId:value10::content')]");

        elements.put("search_lov_merchant_i_merchant", "//*[contains(@id, 'qryId1:value70::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_lov_merchant_i_submerchant", "//*[contains(@id, 'qryId1:value70::_afrLovInternalQueryId:value10::content')]");

        elements.put("search_lov_paymentMethod_i_paymentMethod", "//*[contains(@id, 'qryId1:value30::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_lov_paymentMethod_i_description", "//*[contains(@id, 'qryId1:value30::_afrLovInternalQueryId:value10::content')]");

        elements.put("search_lov_currencyFix_i_currency", "//*[contains(@id, 'qryId1:value100::_afrLovInternalQueryId:value00::content')]");
        elements.put("search_lov_currencyFix_i_description", "//*[contains(@id, 'qryId1:value100::_afrLovInternalQueryId:value10::content')]");

        /*elements.put("","//*[contains(@id, '')]");*/

        /*DIALOG CANCEL*/
        elements.put("alert_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");


    }
}