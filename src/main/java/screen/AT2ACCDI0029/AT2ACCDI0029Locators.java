package screen.AT2ACCDI0029;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 18/10/2016.
 */
public class AT2ACCDI0029Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCDI0029Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("opaque_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("opaque_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("opaque_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("opaque_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
        elements.put("opaque_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("opaque_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("opaque_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("opaque_e_result", "//*[contains(@id, 'pc1:opaque::db')]/table/tbody/tr[1]/td[1]");
        elements.put("opaque_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_incoming_office", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_market_country", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_market_country", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_country", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_chain", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_chain", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_hotel_code", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_lov_hotel_code", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("search_i_hotel_name", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_sl_opaque_type", "//*[contains(@id, 'qryId1:value80::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt2:codEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt2:codEmpId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgt2:ofiTransId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgt2:ofiTransId::lovIconId')]");
        elements.put("add_i_incoming_office", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_market_country", "//*[contains(@id, 'pcgt2:codPaisId::content')]");
        elements.put("add_lov_market_country", "//*[contains(@id, 'pcgt2:codPaisId::lovIconId')]");
        elements.put("add_i_country", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_chain", "//*[contains(@id, 'pcgt2:codCadenaId::content')]");
        elements.put("add_lov_chain", "//*[contains(@id, 'pcgt2:codCadenaId::lovIconId')]");
        elements.put("add_i_hotel_code", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
        elements.put("add_lov_hotel_code", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
        elements.put("add_i_hotel_name", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_sl_opaque_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        //QBE
        elements.put("qbe_i_company", "//*[contains(@id, 'pc1_afr_opaque_afr_c6::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'pc1_afr_opaque_afr_c5::content')]");
        elements.put("qbe_i_incoming_office", "//*[contains(@id, 'pc1_afr_opaque_afr_c1::content')]");
        elements.put("qbe_i_market", "//*[contains(@id, 'pc1_afr_opaque_afr_c3::content')]");
        elements.put("qbe_i_country", "//*[contains(@id, 'pc1_afr_opaque_afr_c10::content')]");
        elements.put("qbe_i_chain", "//*[contains(@id, 'pc1_afr_opaque_afr_c4::content')]");
        elements.put("qbe_i_hotel_code", "//*[contains(@id, 'pc1_afr_opaque_afr_c8::content')]");
        elements.put("qbe_i_hotel_name", "//*[contains(@id, 'pc1_afr_opaque_afr_c9::content')]");
        elements.put("qbe_sl_opaque_type", "//*[contains(@id, 'pc1:opaque:soc7::content')]");
    }
}
