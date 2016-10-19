package screen.AT2ACCSU0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 18/10/2016.
 */
public class AT2ACCSU0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("commisions_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("commisions_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("commisions_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("commisions_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("commisions_b_actions_b_audit_data", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("commisions_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("commisions_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("commisions_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("commisions_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_crs_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_crs_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_brand_code", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_brand_code", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_rate_code", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_rate_code", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_hotel_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_hotel_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_destination_code", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_destination_code", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_interface_code", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_interface_code", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_date_from", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_date_to", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_commission", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_sl_merch", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_sl_active", "//*[contains(@id, 'qryId1:value100::content')]");
        //ADD
        elements.put("add_i_crs_code", "//*[contains(@id, 'pcgt2:codCrsId::content')]");
        elements.put("add_lov_crs_code", "//*[contains(@id, 'pcgt2:codCrsId::lovIconId')]");
        elements.put("add_i_brand_code", "//*[contains(@id, 'pcgt2:codBrandId::content')]");
        elements.put("add_lov_brand_code", "//*[contains(@id, 'pcgt2:codBrandId::lovIconId')]");
        elements.put("add_i_destination_code", "//*[contains(@id, 'pcgt2:codDestinoId::content')]");
        elements.put("add_lov_destination_code", "//*[contains(@id, 'pcgt2:codDestinoId::lovIconId')]");
        elements.put("add_i_interface_code", "//*[contains(@id, 'pcgt2:codInterfaceId::content')]");
        elements.put("add_lov_interface_code", "//*[contains(@id, 'pcgt2:codInterfaceId::lovIconId')]");
        elements.put("add_i_rate_code", "//*[contains(@id, 'pcgt2:codRateId::content')]");
        elements.put("add_lov_rate_code", "//*[contains(@id, 'pcgt2:codRateId::lovIconId')]");
        elements.put("add_sl_merch", "//*[contains(@id, 'pcgt2:soc6::content')]");
        elements.put("add_sl_active", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("add_i_date_from", "//*[contains(@id, 'pcgt2:id2::content')]");
        elements.put("add_i_date_to", "//*[contains(@id, 'pcgt2:id1::content')]");
        elements.put("add_i_hotel_code", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
        elements.put("add_lov_hotel_code", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
        elements.put("add_i_commission", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        //QBE
        elements.put("qbe_i_crs_code", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_brand_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_rate_code", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_hotel_code", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_destination_code", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_interface_code", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_date_from", "//*[contains(@id, 'resId1:id22::content')]");
        elements.put("qbe_i_date_to", "//*[contains(@id, 'resId1:id3::content')]");
        elements.put("qbe_i_commission", "//*[contains(@id, 'afr_resId1c10::content')]");
        elements.put("qbe_sl_merch", "//*[contains(@id, 'resId1:soc1::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'resId1:soc5::content')]");
    }
}
