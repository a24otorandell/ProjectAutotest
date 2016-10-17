package screen.AT2ACCCO0049;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 13/10/2016.
 */
public class AT2ACCCO0049Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCCO0049Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("accommodation_b_add","//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("accommodation_b_delete","//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("accommodation_b_edit","//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("accommodation_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("accommodation_b_actions_audit_data","//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
        elements.put("accommodation_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_detach","//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_result","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_result_sis","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr/td[1]");
        elements.put("accommodation_e_records","//*[contains(@id, 'pc1:ot17')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_receptive", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_contract", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_contract", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_hotel", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_atlas_room", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_atlas_room", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_atlas_characteristics", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_atlas_characteristics", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_disney_hotel", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_disney_room", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_package_code", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_calendar_order", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_contract_type", "//*[contains(@id, 'qryId1:value90::content')]");
        //QBE
        elements.put("qbe_i_receptive", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_c9::content')]");
        elements.put("qbe_i_contract", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_description2", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_c8::content')]");
        elements.put("qbe_i_description3", "//*[contains(@id, 'afr_c13::content')]");
        elements.put("qbe_i_atlas_room", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_atlas_characteristics", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_disney_room", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_disney_hotel", "//*[contains(@id, 'afr_c11::content')]");
        elements.put("qbe_i_package_code", "//*[contains(@id, 'afr_c7::content')]");
        elements.put("qbe_i_calendar_order", "//*[contains(@id, 'afr_c10::content')]");
        elements.put("qbe_i_contract_type", "//*[contains(@id, 'afr_c12::content')]");
        //ADD
        elements.put("add_i_receptive", "//*[contains(@id, 'pcgt1:seqRecId::content')]");
        elements.put("add_lov_receptive", "//*[contains(@id, 'pcgt1:seqRecId::lovIconId')]");
        elements.put("add_i_receptive_description", "//*[contains(@id, 'pcgt1:it8::content')]");
        elements.put("add_i_contract", "//*[contains(@id, 'pcgt1:seqContrId::content')]");
        elements.put("add_lov_contract", "//*[contains(@id, 'pcgt1:seqContrId::lovIconId')]");
        elements.put("add_i_contract_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_i_hotel", "//*[contains(@id, 'pcgt1:seqHotel2Id::content')]");
        elements.put("add_lov_hotel", "//*[contains(@id, 'pcgt1:seqHotel2Id::lovIconId')]");
        elements.put("add_i_hotel_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_atlas_room", "//*[contains(@id, 'pcgt1:atlasRoomId::content')]");
        elements.put("add_lov_atlas_room", "//*[contains(@id, 'pcgt1:atlasRoomId::lovIconId')]");
        elements.put("add_i_atlas_characteristics", "//*[contains(@id, 'pcgt1:atlasCaracId::content')]");
        elements.put("add_lov_atlas_characteristics", "//*[contains(@id, 'pcgt1:atlasCaracId::lovIconId')]");
        elements.put("add_i_disney_hotel", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_disney_room", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("add_i_package_code", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_i_calendar_order", "//*[contains(@id, 'pcgt1:it7::content')]");
        elements.put("add_i_contract_type", "//*[contains(@id, 'pcgt1:it6::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        //MODIFY
        elements.put("add_i_receptive", "//*[contains(@id, 'pcgt1:seqRecId::content')]");
        elements.put("add_lov_receptive", "//*[contains(@id, 'pcgt1:seqRecId::lovIconId')]");
        elements.put("add_i_receptive_description", "//*[contains(@id, 'pcgt1:it8::content')]");
        elements.put("add_i_contract", "//*[contains(@id, 'pcgt1:seqContrId::content')]");
        elements.put("add_lov_contract", "//*[contains(@id, 'pcgt1:seqContrId::lovIconId')]");
        elements.put("add_i_contract_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_i_hotel", "//*[contains(@id, 'pcgt1:seqHotel2Id::content')]");
        elements.put("add_lov_hotel", "//*[contains(@id, 'pcgt1:seqHotel2Id::lovIconId')]");
        elements.put("add_i_hotel_description", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_atlas_room", "//*[contains(@id, 'pcgt1:atlasRoomId::content')]");
        elements.put("add_lov_atlas_room", "//*[contains(@id, 'pcgt1:atlasRoomId::lovIconId')]");
        elements.put("add_i_atlas_characteristics", "//*[contains(@id, 'pcgt1:atlasCaracId::content')]");
        elements.put("add_lov_atlas_characteristics", "//*[contains(@id, 'pcgt1:atlasCaracId::lovIconId')]");
        elements.put("add_i_disney_hotel", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_disney_room", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("add_i_package_code", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_i_calendar_order", "//*[contains(@id, 'pcgt1:it7::content')]");
        elements.put("add_i_contract_type", "//*[contains(@id, 'pcgt1:it6::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
    }
}
