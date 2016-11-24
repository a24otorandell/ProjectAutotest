package screen.AT2MDMSP0035;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 18/11/2016.
 */
public class AT2MDMSP0035Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0035Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            elements.put("MDM_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
            elements.put("MDM_b_edit", "//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
            elements.put("MDM_b_actions", "//*[contains(@id, 'pc1:pcgm19:dc_m1')]");
            elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgm19:dc_cmi0')]/td[2]");
            elements.put("MDM_b_actions_print", "//*[contains(@id, 'pc1:pcgm19:dc_cmi1')]/td[2]");
            elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
            elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
            elements.put("MDM_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
            elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot22')]");
        //ADD|MODIFY
            elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
            elements.put("add_i_company", "//*[contains(@id, 'pcgt2:operatingCompanyId::content')]");
            elements.put("add_lov_company", "//*[contains(@id, 'pcgt2:operatingCompanyId::lovIconId')]");
            elements.put("add_i_office", "//*[contains(@id, 'pcgt2:operatingOfficeId::content')]");
            elements.put("add_lov_office", "//*[contains(@id, 'pcgt2:operatingOfficeId::lovIconId')]");
            elements.put("add_i_short_name", "//*[contains(@id, 'pcgt2:it3::content')]");
            elements.put("add_i_hotel_code", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
            elements.put("add_lov_hotel_code", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
            elements.put("add_e_hotel_name", "//*[contains(@id, 'pcgt2:it16::content')]");
            elements.put("add_e_hotel_town", "//*[contains(@id, 'pcgt2:it2::content')]");
            elements.put("add_i_transfer_area", "//*[contains(@id, 'pcgt2:gzonCodZonaTransId::content')]");
            elements.put("add_lov_transfer_area", "//*[contains(@id, 'pcgt2:gzonCodZonaTransId::lovIconId')]");
            elements.put("add_e_transfer_area_description", "//*[contains(@id, 'pcgt2:it1::content')]");
            elements.put("add_i_activities_area", "//*[contains(@id, 'pcgt2:gzonCodZonaId::content')]");
            elements.put("add_lov_activities_area", "//*[contains(@id, 'pcgt2:gzonCodZonaId::lovIconId')]");
            elements.put("add_e_activities_area_description", "//*[contains(@id, 'pc1:pcgt2:it15::content')]");
            elements.put("add_i_activities_pickup_point", "//*[contains(@id, 'pcgt2:epreCodPuntoId::content')]");
            elements.put("add_lov_activities_pickup_point", "//*[contains(@id, 'pcgt2:epreCodPuntoId::lovIconId')]");
            elements.put("add_e_activities_pickup_point_name", "//*[contains(@id, 'pcgt2:it14::content')]");
            elements.put("add_cb_sold_by_HHT", "//*[contains(@id, 'pcgt2:sbc4::content')]");
            elements.put("add_cb_active_activities", "//*[contains(@id, 'pcgt2:sbc5::content')]");
            elements.put("add_cb_active_transfers", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
            elements.put("search_i_office", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
            elements.put("search_i_short_name", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_i_hotel_code", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_lov_hotel_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
            elements.put("search_i_transfer_area", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_lov_transfer_area", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
            elements.put("search_i_activities_area", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_lov_activities_area", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
            elements.put("search_i_activities_pickup_point", "//*[contains(@id, 'qryId1:value60::content')]");
            elements.put("search_lov_activities_pickup_point", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
            elements.put("search_cb_sold_by_HHT", "//*[contains(@id, 'qryId1:value70::content')]");
            elements.put("search_cb_active_activities", "//*[contains(@id, 'qryId1:value80::content')]");
            elements.put("search_cb_active_transfers", "//*[contains(@id, 'qryId1:value90::content')]");
            elements.put("search_e_sold_by_HHT_result", "//*[contains(@id, 'pc1:t1:2:sbc2::content')]/span/img");
            elements.put("search_e_active_activities_result", "//*[contains(@id, 'pc1:t1:2:sbc6::content')]/span/img");
            elements.put("search_e_active_transfers_result", "//*[contains(@id, 'pc1:t1:2:sbc3::content')]/span/img");
        //QBE
            elements.put("qbe_i_company", "//*[contains(@id, 't1:it7::content')]");
            elements.put("qbe_i_office", "//*[contains(@id, 't1:it17::content')]");
            elements.put("qbe_i_short_name", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c5::content')]");
            elements.put("qbe_i_hotel_code", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c2::content')]");
            elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c1::content')]");
            elements.put("qbe_i_town", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c9::content')]");
            elements.put("qbe_i_transfer_area", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c3::content')]");
            elements.put("qbe_i_activities_area", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c6::content')]");
            elements.put("qbe_i_activities_pickup_point", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c7::content')]");
            elements.put("qbe_sl_sold_by_HHT", "//*[contains(@id, 't1:soc55::content')]");
            elements.put("qbe_sl_active_activities", "//*[contains(@id, 't1:soc2::content')]");
            elements.put("qbe_sl_active_transfers", "//*[contains(@id, 't1:soc1::content')]");
        //ACTIONS-PRINT
            elements.put("ap_i_transfer_zone", "//*[contains(@id, 'r2:1:inputListOfValues4::content')]");
            elements.put("ap_lov_transfer_zone", "//*[contains(@id, 'r2:1:inputListOfValues4::lovIconId')]");
            elements.put("ap_i_excursion_zone", "//*[contains(@id, 'r2:1:inputListOfValues5::content')]");
            elements.put("ap_lov_excursion_zone", "//*[contains(@id, 'r2:1:inputListOfValues5::lovIconId')]");
            elements.put("ap_i_pickup_point", "//*[contains(@id, 'r2:1:inputListOfValues6::content')]");
            elements.put("ap_lov_pickup_point", "//*[contains(@id, 'r2:1:inputListOfValues6::lovIconId')]");
            elements.put("ap_b_accept", "//*[contains(@id, 'pt1:dyntdc:r1:1:cb1')]");
    }
}