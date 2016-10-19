package screen.AT2ACCDI0018;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 17/10/2016.
 */
public class AT2ACCDI0018Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCDI0018Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("cancellation_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("cancellation_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("cancellation_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("cancellation_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("cancellation_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("cancellation_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("cancellation_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("cancellation_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("cancellation_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_to", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_to", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_to_description", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_booking_type", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_booking_type", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_from_date", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_to_date", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_days", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_time", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_cost", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_amount_cost", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_extra", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_amount_extra", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId1:value140::lovIconId')]");
        elements.put("search_sl_application_type", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("search_sl_application_cost", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("search_ck_net_amount", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("search_sl_only_generics", "//*[contains(@id, 'qryId1:value180::content')]");
        //ADD
        elements.put("add_i_code", "//*[contains(@id, 'pcgt2:it18::content')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt2:transCodEmpCopyId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt2:transCodEmpCopyId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgt2:transCodOfiCopyId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgt2:transCodOfiCopyId::lovIconId')]");
        elements.put("add_i_to", "//*[contains(@id, 'pcgt2:gastoCancelSeqTtooId::content')]");
        elements.put("add_lov_to", "//*[contains(@id, 'pcgt2:gastoCancelSeqTtooId::lovIconId')]");
        elements.put("add_i_to_desc", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_booking_type", "//*[contains(@id, 'pcgt2:codTipoResId::content')]");
        elements.put("add_lov_booking_type", "//*[contains(@id, 'pcgt2:codTipoResId::lovIconId')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::lovIconId')]");
        elements.put("add_i_from_date", "//*[contains(@id, 'pcgt2:id3::content')]");
        elements.put("add_i_to_date", "//*[contains(@id, 'pcgt2:id4::content')]");
        elements.put("add_i_days", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_i_time", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_cost", "//*[contains(@id, 'pcgt2:it7::content')]");
        elements.put("add_i_amount_cost", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_extra", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_i_amount_extra", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("add_lov_currency", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("add_sl_application_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_sl_application_cost", "//*[contains(@id, 'pcgt2:soc2::content')]");
        elements.put("add_ck_net_amount", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        //QBE
        elements.put("qbe_b_reset", "//*[contains(@id, 't1::ch::t')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'afr_c17::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'afr_c18::content')]");
        elements.put("qbe_i_to", "//*[contains(@id, 't1:it27::content')]");
        elements.put("qbe_i_to_desc", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_booking_type", "//*[contains(@id, 'afr_c12::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_c11::content')]");
        elements.put("qbe_i_from_date", "//*[contains(@id, 't1:id2::content')]");
        elements.put("qbe_i_to_date", "//*[contains(@id, 't1:id1::content')]");
        elements.put("qbe_i_days", "//*[contains(@id, 't1:it9::content')]");
        elements.put("qbe_i_time", "//*[contains(@id, 't1:it11::content')]");
        elements.put("qbe_i_cost", "//*[contains(@id, 't1:it12::content')]");
        elements.put("qbe_i_amount_cost", "//*[contains(@id, 't1:it13::content')]");
        elements.put("qbe_i_extra", "//*[contains(@id, 't1:it14::content')]");
        elements.put("qbe_i_amount_extra", "//*[contains(@id, 't1:it15::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'afr_c10::content')]");
        elements.put("qbe_sl_application_type", "//*[contains(@id, 't1:soc7::content')]");
        elements.put("qbe_sl_application_cost", "//*[contains(@id, 't1:soc5::content')]");
        elements.put("qbe_sl_net_amount", "//*[contains(@id, 't1:soc6::content')]");
    }
}
