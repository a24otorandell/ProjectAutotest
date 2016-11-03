package screen.AT2MDMCL0029;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 03/11/2016.
 */
public class AT2MDMCL0029Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0029Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE AGENCY
         */
        //GENERALS
        elements.put("agency_b_add", "//*[contains(@id, 'PCGenericToolbar1:boton_add')]");
        elements.put("agency_b_delete", "//*[contains(@id, 'PCGenericToolbar1:boton_remove')]");
        elements.put("agency_b_edit", "//*[contains(@id, 'PCGenericToolbar1:boton_edit')]");
        elements.put("agency_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("agency_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi0')]/td[2]");
        elements.put("agency_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("agency_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("agency_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("agency_e_records", "//*[contains(@id, 'pc1:outputText2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_partner", "//*[contains(@id, 'value00::content')]");
        elements.put("search_lov_partner", "//*[contains(@id, 'value00::lovIconId')]");
        elements.put("search_i_partner_des", "//*[contains(@id, 'value10::content')]");
        elements.put("search_i_short_name", "//*[contains(@id, 'value20::content')]");
        elements.put("search_i_agency_name", "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_external_agency_code", "//*[contains(@id, 'value40::content')]");
        elements.put("search_i_group_code", "//*[contains(@id, 'value50::content')]");
        elements.put("search_lov_group_code", "//*[contains(@id, 'value50::lovIconId')]");
        elements.put("search_i_group_des", "//*[contains(@id, 'value60::content')]");
        elements.put("search_i_language", "//*[contains(@id, 'value70::content')]");
        elements.put("search_lov_language", "//*[contains(@id, 'value70::lovIconId')]");
        elements.put("search_sl_classification", "//*[contains(@id, 'value80::content')]");
        elements.put("search_i_booking_currency", "//*[contains(@id, 'value90::content')]");
        elements.put("search_lov_booking_currency", "//*[contains(@id, 'value90::lovIconId')]");
        elements.put("search_i_invoice_currency", "//*[contains(@id, 'value100::content')]");
        elements.put("search_lov_invoice_currency", "//*[contains(@id, 'value100::lovIconId')]");
        elements.put("search_ck_stop", "//*[contains(@id, 'value110::content')]");
        elements.put("search_sl_credit", "//*[contains(@id, 'value120::content')]");
        elements.put("search_i_credit_amount", "//*[contains(@id, 'value130::content')]");
        elements.put("search_i_credit_currency", "//*[contains(@id, 'value140::content')]");
        elements.put("search_i_tax", "//*[contains(@id, 'value150::content')]");
        elements.put("search_i_tax_percentage", "//*[contains(@id, 'value160::content')]");
        elements.put("search_i_agency", "//*[contains(@id, 'value170::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'PCGenericToolbar1:btn_commitExit')]");
        elements.put("add_i_partner", "//*[contains(@id, 'nomCorttoTransId::content')]");
        elements.put("add_lov_partner", "//*[contains(@id, 'nomCorttoTransId::lovIconId')]");
        elements.put("add_i_partner_des", "//*[contains(@id, 'it47::content')]");
        elements.put("add_i_short_name", "//*[contains(@id, 'it46::content')]");
        elements.put("add_i_agency_name", "//*[contains(@id, 'it33::content')]");
        elements.put("add_i_external_agency_code", "//*[contains(@id, 'it39::content')]");
        elements.put("add_i_group_code", "//*[contains(@id, 'codGrupoId::content')]");
        elements.put("add_lov_group_code", "//*[contains(@id, 'codGrupoId::lovIconId')]");
        elements.put("add_i_group_desc", "//*[contains(@id, 'it32::content')]");
        elements.put("add_i_language", "//*[contains(@id, 'codIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'codIdiomaId::lovIconId')]");
        elements.put("add_sl_classification", "//*[contains(@id, 'soc4::content')]");
        elements.put("add_i_booking_currency", "//*[contains(@id, 'codDivisaResId::content')]");
        elements.put("add_lov_booking_currency", "//*[contains(@id, 'codDivisaResId::lovIconId')]");
        elements.put("add_i_invoice_currency", "//*[contains(@id, 'codDivisaFacId::content')]");
        elements.put("add_lov_invoice_currency", "//*[contains(@id, 'codDivisaFacId::lovIconId')]");
        elements.put("add_ck_stop", "//*[contains(@id, 'sbc3::content')]");
        elements.put("add_sl_credit", "//*[contains(@id, 'soc5::content')]");
        elements.put("add_i_credit_amount", "//*[contains(@id, 'it36::content')]");
        elements.put("add_i_credit_currency", "//*[contains(@id, 'codDivisaCreId::content')]");
        elements.put("add_lov_credit_currency", "//*[contains(@id, 'codDivisaCreId::lovIconId')]");
        elements.put("add_i_tax", "//*[contains(@id, 'it45::content')]");
        elements.put("add_i_tax_percentage", "//*[contains(@id, 'it42::content')]");
        elements.put("add_i_agency", "//*[contains(@id, 'it35::content')]");
        elements.put("add_i_street", "//*[contains(@id, 'it41::content')]");
        elements.put("add_i_town", "//*[contains(@id, 'it40::content')]");
        elements.put("add_i_zip_code", "//*[contains(@id, 'it43::content')]");
        elements.put("add_i_country", "//*[contains(@id, 'inputListOfValues3::content')]");
        elements.put("add_lov_country", "//*[contains(@id, 'inputListOfValues3::lovIconId')]");
        elements.put("add_i_country_des", "//*[contains(@id, 'it38::content')]");
        elements.put("add_i_telephone", "//*[contains(@id, 'it37::content')]");
        elements.put("add_i_email", "//*[contains(@id, 'it44::content')]");
        //QBE
        elements.put("qbe_i_partner", "//*[contains(@id, 'afr_c13::content')]");
        elements.put("qbe_i_partner_des", "//*[contains(@id, 'afr_c14::content')]");
        elements.put("qbe_i_short_name", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_agency_name", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_external_agency_code", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_group_code", "//*[contains(@id, 'afr_resId1c6::content')]");
        elements.put("qbe_i_group_desc", "//*[contains(@id, 'afr_resId1c28::content')]");
        elements.put("qbe_i_language", "//*[contains(@id, 'afr_resId1c14::content')]");
        elements.put("qbe_sl_classification", "//*[contains(@id, 'soc3::content')]");
        elements.put("qbe_i_booking_currency", "//*[contains(@id, 'afr_resId1c10::content')]");
        elements.put("qbe_i_invoice_currency", "//*[contains(@id, 'afr_resId1c11::content')]");
        elements.put("qbe_sl_stop", "//*[contains(@id, 'soc6::content')]");
        elements.put("qbe_sl_credit", "//*[contains(@id, 'soc9::content')]");
        elements.put("qbe_i_credit_amount", "//*[contains(@id, 'afr_resId1c8::content')]");
        elements.put("qbe_i_credit_currency", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_tax", "//*[contains(@id, 'afr_resId1c13::content')]");
        elements.put("qbe_i_tax_percentage", "//*[contains(@id, 'afr_resId1c12::content')]");
        elements.put("qbe_i_agency", "//*[contains(@id, 'afr_resId1c2::content')]");

        /**
         * TAB BRANCH - TABLE BRANCH
         */
        //TAB
        elements.put("branch_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERALS
        elements.put("branch_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("branch_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("branch_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("branch_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("branch_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("branch_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("branch_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("branch_e_result", "//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("branch_e_records", "//*[contains(@id, 'pc2:ot33')]");
        elements.put("branch_e_extra", "//*[contains(@id, 'pc2:t8::eoi')]");
        //ADD
        elements.put("b_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("b_add_i_short_name", "//*[contains(@id, 'it24::content')]");
        elements.put("b_add_ck_stop", "//*[contains(@id, 'sbc2::content')]");
        elements.put("b_add_i_abta", "//*[contains(@id, 'it22::content')]");
        elements.put("b_add_i_name", "//*[contains(@id, 'it23::content')]");
        elements.put("b_add_i_street", "//*[contains(@id, 'it29::content')]");
        elements.put("b_add_i_town", "//*[contains(@id, 'it21::content')]");
        elements.put("b_add_i_zip", "//*[contains(@id, 'it25::content')]");
        elements.put("b_add_i_country", "//*[contains(@id, 'inputListOfValues1::content')]");
        elements.put("b_add_lov_country", "//*[contains(@id, 'inputListOfValues1::lovIconId')]");
        //QBE
        elements.put("b_qbe_i_short_name", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("b_qbe_sl_stop", "//*[contains(@id, 'soc7::content')]");

        /**
         * TAB CURRENCIES - TABLE CURRENCIES
         */
        //TAB
        elements.put("currencies_tab", "//*[contains(@id, 'sdi3::disAcr')]");
        //GENERALS
        elements.put("currencies_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("currencies_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("currencies_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("currencies_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("currencies_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("currencies_b_qbe", "//*[contains(@id, '1:pc3:_qbeTbr')]/a");
        elements.put("currencies_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("currencies_e_result", "//*[contains(@id, 'pc3:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("currencies_e_records", "//*[contains(@id, 'pc3:otp2')]");
        //ADD
        elements.put("c_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("c_add_i_country", "//*[contains(@id, 'codPais2Id::content')]");
        elements.put("c_add_lov_country", "//*[contains(@id, 'codPais2Id::lovIconId')]");
        elements.put("c_add_i_country_des", "//*[contains(@id, 'it20::content')]");
        elements.put("c_add_i_destination", "//*[contains(@id, 'codDestinoId::content')]");
        elements.put("c_add_lov_destination", "//*[contains(@id, 'codDestinoId::lovIconId')]");
        elements.put("c_add_i_destination_des", "//*[contains(@id, 'it19::content')]");//ALE
        elements.put("c_add_i_currency", "//*[contains(@id, 'codDivisaId::content')]");
        elements.put("c_add_lov_currency", "//*[contains(@id, 'codDivisaId::lovIconId')]");
        elements.put("c_add_i_currency_des", "//*[contains(@id, 'it18::content')]");
        //QBE
        elements.put("c_qbe_i_country", "//*[contains(@id, 'pc3_afr_t2_afr_c5::content')]");
        elements.put("c_qbe_i_country_des", "//*[contains(@id, 'pc3_afr_t2_afr_c3::content')]");
        elements.put("c_qbe_i_destination", "//*[contains(@id, 'pc3_afr_t2_afr_c6::content')]");
        elements.put("c_qbe_i_destination_des", "//*[contains(@id, 'pc3_afr_t2_afr_c4::content')]");
        elements.put("c_qbe_i_currency", "//*[contains(@id, 'pc3_afr_t2_afr_c7::content')]");
        elements.put("c_qbe_i_currency_des", "//*[contains(@id, 'pc3_afr_t2_afr_c8::content')]");

    }
}
