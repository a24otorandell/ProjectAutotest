package screen.AT2ACCSU0058;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 18/10/2016.
 */
public class AT2ACCSU0058Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0058Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERAL
        elements.put("accommodation_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("accommodation_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("accommodation_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("accommodation_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_hotel_id", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_rate_plan", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_baseboard_type", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_contract_name", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_incoming_office", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_contr_seq", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_hsi_user", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_register_status", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_activ_date", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_room_id", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_dis_hot_id", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_dis_room_id", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_seq_age_ext", "//*[contains(@id, 'qryId1:value130::content')]");
        //QBE
        elements.put("qbe_i_hotel_id", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_rate_plan", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_baseboard_type", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_contract_name", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_incoming_office", "//*[contains(@id, 'afr_resId1c6::content')]");
        elements.put("qbe_i_contr_seq", "//*[contains(@id, 'afr_resId1c7::content')]");
        elements.put("qbe_i_hsi_user", "//*[contains(@id, 'afr_resId1c8::content')]");
        elements.put("qbe_i_register_status", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_activ_date", "//*[contains(@id, 'pc1:resId1:id1::content')]");
        elements.put("qbe_i_room_id", "//*[contains(@id, 'afr_resId1c11::content')]");
        elements.put("qbe_i_dis_hot_id", "//*[contains(@id, 'afr_resId1c12::content')]");
        elements.put("qbe_i_dis_room_id", "//*[contains(@id, 'afr_resId1c13::content')]");
        elements.put("qbe_i_seq_age_ext", "//*[contains(@id, 'afr_resId1c14::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        elements.put("add_i_hotel_id", "//*[contains(@id, 'pc1:pcgt2:it9::content')]");
        elements.put("add_i_rate_plan", "//*[contains(@id, 'pc1:pcgt2:it6::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("add_i_baseboard_type", "//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_contract_name", "//*[contains(@id, 'pc1:pcgt2:it7::content')]");
        elements.put("add_i_incoming_office", "//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("add_i_contr_seq", "//*[contains(@id, 'pc1:pcgt2:it11::content')]");
        elements.put("add_i_hsi_user", "//*[contains(@id, 'pc1:pcgt2:it12::content')]");
        elements.put("add_i_register_status", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("add_i_activ_date", "//*[contains(@id, 'pc1:pcgt2:id2::content')]");
        elements.put("add_i_room_id", "//*[contains(@id, 'pc1:pcgt2:it10::content')]");
        elements.put("add_i_dis_hot_id", "//*[contains(@id, 'pc1:pcgt2:it13::content')]");
        elements.put("add_i_dis_room_id", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("add_i_seq_age_ext", "//*[contains(@id, 'pc1:pcgt2:it8::content')]");
        //MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        elements.put("add_i_hotel_id", "//*[contains(@id, 'pc1:pcgt2:it9::content')]");
        elements.put("add_i_rate_plan", "//*[contains(@id, 'pc1:pcgt2:it6::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("add_i_baseboard_type", "//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_contract_name", "//*[contains(@id, 'pc1:pcgt2:it7::content')]");
        elements.put("add_i_incoming_office", "//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("add_i_contr_seq", "//*[contains(@id, 'pc1:pcgt2:it11::content')]");
        elements.put("add_i_hsi_user", "//*[contains(@id, 'pc1:pcgt2:it12::content')]");
        elements.put("add_i_register_status", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("add_i_activ_date", "//*[contains(@id, 'pc1:pcgt2:id2::content')]");
        elements.put("add_i_room_id", "//*[contains(@id, 'pc1:pcgt2:it10::content')]");
        elements.put("add_i_dis_hot_id", "//*[contains(@id, 'pc1:pcgt2:it13::content')]");
        elements.put("add_i_dis_room_id", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("add_i_seq_age_ext", "//*[contains(@id, 'pc1:pcgt2:it8::content')]");
    }
}