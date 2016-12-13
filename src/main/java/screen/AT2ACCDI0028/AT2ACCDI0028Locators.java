package screen.AT2ACCDI0028;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 29/11/2016.
 */
public class AT2ACCDI0028Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCDI0028Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){
        //ADD
        elements.put("category_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("category_sl_reason", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("category_i_add_start_date", "//*[contains(@id, 'pc1:pcgt1:id3::content')]");
        elements.put("category_lov_add_ttoo", "//*[contains(@id, 'pc1:pcgt1:seqTtooId::lovIconId')]");
        elements.put("category_i_add_ttoo", "//*[contains(@id, 'pc1:pcgt1:seqTtooId::content')]");
        elements.put("category_e_add_ttoo_description", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");
        elements.put("category_lov_add_category", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::lovIconId')]");
        elements.put("category_i_add_category_description", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        elements.put("category_i_add_category", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::content')]");
        elements.put("category_i_add_category_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("category_lov_add_hotel_type", "//*[contains(@id, 'pc1:pcgt1:codTipoEstabId::lovIconId')]");
        elements.put("category_i_add_hotel_type", "//*[contains(@id, 'pc1:pcgt1:codTipoEstabId::content')]");
        elements.put("category_i_add_hotel_type_description", "//*[contains(@id, 'pc1:pcgt1:it4::content')]");
        elements.put("category_cb_add_active", "//*[contains(@id, 'pc1:pcgt1:sbc2::content')]");
        elements.put("category_b_add_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
        //SEARCH
        elements.put("category_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("category_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("category_n_records", "//*[contains(@id, 'pc1:ot13')]");
        elements.put("category_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("category_i_search_reason", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("category_i_search_start_date", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("category_i_search_desactivation_date", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("category_lov_search_ttoo", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("category_i_search_ttoo", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("category_i_search_ttoo_description", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("category_lov_search_category", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("category_i_search_category", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("category_i_search_category_description", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("category_lov_search_hotel_type", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("category_i_search_hotel_type", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("category_i_search_hotel_type_description", "//*[contains(@id, 'qryId1:value80::content')]");
        //EDIT
        elements.put("category_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("category_i_edit_reason", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("category_i_edit_start_date", "//*[contains(@id, 'pc1:pcgt1:id3::content')]");
        elements.put("category_lov_edit_ttoo", "//*[contains(@id, 'pc1:pcgt1:seqTtooId::lovIconId')]");
        elements.put("category_i_edit_ttoo", "//*[contains(@id, 'pc1:pcgt1:seqTtooId::content')]");
        elements.put("category_i_edit_ttoo_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("category_lov_edit_category", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::lovIconId')]");
        elements.put("category_i_edit_category", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::content')]");
        elements.put("category_i_edit_category_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("category_lov_edit_hotel_type", "//*[contains(@id, 'pc1:pcgt1:codTipoEstabId::lovIconId')]");
        elements.put("category_i_edit_hotel_type", "//*[contains(@id, 'pc1:pcgt1:codTipoEstabId::content')]");
        elements.put("category_i_edit_hotel_type_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("category_cb_edit_active", "//*[contains(@id, 'pc1:pcgt1:sbc2::content')]");
        elements.put("category_b_edit_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
        elements.put("category_inactive_b_ok", "//*[contains(@id, 'd3::ok')]");
        elements.put("category_i_desactivation_date", "//*[contains(@id, 'pc1:pcgt1:id4::content')]");
        //DETACH
        elements.put("category_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        //AUDITDATA
        elements.put("category_b_action", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("category_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("category_b_audit_b_ok", "//*[contains(@id, 'pc1:pcgm1:d22::ok')]");
        //QBE
        elements.put("category_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("category_b_qbe_reset", "//*[contains(@id, 'pc1:t1::ch::t')]/tbody/tr[2]/th/a");
        elements.put("category_i_qbe_reason", "//*[contains(@id, 'pc1:t1:soc10::content')]");
        elements.put("category_i_qbe_start_date", "//*[contains(@id, 'pc1:t1:id6::content')]");
        elements.put("category_sel_qbe_active", "//*[contains(@id, 'pc1:t1:soc12::content')]");
        elements.put("category_i_qbe_ttoo", "//*[contains(@id, 'pc1_afr_t1_afr_c3::content')]");
        elements.put("category_i_qbe_category", "//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("category_i_qbe_hotel_type", "//*[contains(@id, 'pc1_afr_t1_afr_c2::content')]");
        elements.put("category_i_qbe_desactivation_date", "//*[contains(@id, 'pc1:t1:id5::content')]");

        //DELETE
        elements.put("category_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("category_b_delete_b_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        ///////////////////////////////////////////// BINDING TAB /////////////////////////////////////////////////////
        elements.put("binding_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        elements.put("binding_b_menu", "//*[contains(@id, 'pc1:pcgt2:dc_t1::eoi')]");
        //ADD
        elements.put("binding_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("binding_add_e_sequence", "//*[contains(@id, 'pc1:pcgt2:it15::content')]");
        elements.put("binding_i_add_reason", "//*[contains(@id, 'pc1:pcgt2:soc2::content')]");
        elements.put("binding_i_add_start_date", "//*[contains(@id, 'pc1:pcgt2:id3::content')]");
        elements.put("binding_i_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::content')]");
        elements.put("binding_lov_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::lovIconId')]");
        elements.put("binding_i_add_ttoo_description", "//*[contains(@id, 'pc1:pcgt2:sbc3::content')]");
        elements.put("binding_cb_add_main", "//*[contains(@id, 'pc1:pcgt2:sbc3::content')]");
        elements.put("binding_cb_add_active", "//*[contains(@id, 'pc1:pcgt2:sbc4::content')]");
        elements.put("binding_i_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::content')]");
        elements.put("binding_lov_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::lovIconId')]");
        elements.put("binding_i_add_market_description", "//*[contains(@id, 'pc1:pcgt2:it8')]");
        elements.put("binding_i_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::content')]");
        elements.put("binding_lov_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::lovIconId')]");
        elements.put("binding_i_add_hotel_description", "//*[contains(@id, 'pc1:pcgt2:it12::content')]");
        elements.put("binding_i_add_chain", "//*[contains(@id, 'pcgt2:codCadenaId::content')]");
        elements.put("binding_lov_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::lovIconId')]");
        elements.put("binding_i_add_des_cadena", "//*[contains(@id, 'pc1:pcgt2:it7::content')]");
        elements.put("binding_i_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::content')]");
        elements.put("binding_lov_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::lovIconId')]");
        elements.put("binding_i_add_destination_description", "//*[contains(@id, 'pc1:pcgt2:it10::content')]");
        elements.put("binding_i_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::content')]");
        elements.put("binding_lov_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::lovIconId')]");
        elements.put("binding_i_add_country_description", "//*[contains(@id, 'pc1:pcgt2:it13::content')]");
        elements.put("binding_b_add_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        //SEARCH
        elements.put("binding_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("binding_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("binding_n_records", "//*[contains(@id, 'r1:0:pc1:exBindCount')]");
        elements.put("binding_e_result", "//*[contains(@id, 'pc1:exBind::db')]/table/tbody/tr[1]/td[1]");
        elements.put("binding_i_search_sequence", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("binding_i_search_reason", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("binding_i_search_start_date", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("binding_cb_main", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("binding_lov_search_ttoo", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("binding_i_search_ttoo", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("binding_i_search_ttoo_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("binding_lov_search_market", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("binding_i_search_market", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("binding_i_search_market_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("binding_lov_search_hotel", "//*[contains(@id, 'qryId1:value100::lovIconId')]");
        elements.put("binding_i_search_hotel", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("binding_i_search_hotel_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("binding_i_search_chain", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("binding_lov_search_chain", "//*[contains(@id, 'qryId1:value120::lovIconId')]");
        elements.put("binding_i_search_chain_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("binding_lov_search_destination", "//*[contains(@id, 'qryId1:value140::lovIconId')]");
        elements.put("binding_i_search_destination", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("binding_i_search_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("binding_lov_search_country", "//*[contains(@id, 'qryId1:value160::lovIconId')]");
        elements.put("binding_i_search_country", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("binding_i_search_country_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        //EDIT
        elements.put("binding_b_edit", "//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        //QBE
        elements.put("binding_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("binding_i_qbe_reason", "//*[contains(@id, 'pc1:exBind:socid0::content')]");
        elements.put("binding_i_qbe_start_date", "//*[contains(@id, 'pc1:exBind:id2::content')]");
        elements.put("binding_i_qbe_ttoo", "//*[contains(@id, 'pc1_afr_exBind_afr_c13::content')]");
        elements.put("binding_i_qbe_market", "//*[contains(@id, 'pc1_afr_exBind_afr_c9::content')]");
        elements.put("binding_i_qbe_hotel", "//*[contains(@id, 'pc1_afr_exBind_afr_c2::content')]");
        elements.put("binding_i_qbe_chain", "//*[contains(@id, 'pc1_afr_exBind_afr_c14::content')]");
        elements.put("binding_i_qbe_destination", "//*[contains(@id, 'pc1_afr_exBind_afr_c8::content')]");
        elements.put("binding_i_qbe_country", "//*[contains(@id, 'pc1_afr_exBind_afr_c12::content')]");
        //AUDITDATA
        elements.put("binding_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("binding_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        //DETACH
        elements.put("binding_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        ///////////////////////////////////////////// GENERALS TAB /////////////////////////////////////////////////////
        elements.put("generals_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        elements.put("generals_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("generals_e_sequence", "//*[contains(@id, 'pc1:exGeneral::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        //SEARCH
        elements.put("generals_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("generals_i_search_reason", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("generals_i_search_sequence", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("generals_i_search_ie", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("generals_i_search_start_date", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("generals_i_search_ttoo", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("generals_lov_search_ttoo", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("generals_i_search_ttoo_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_cb_search_b2b", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("generals_cb_search_main_acount", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("generals_i_search_classification", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("generals_lov_search_classification", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("generals_i_search_classification_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_i_search_hotel", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("generals_lov_search_hotel", "//*[contains(@id, 'qryId1:value110::lovIconId')]");
        elements.put("generals_i_search_hotel_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_i_search_chain", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("generals_lov_search_chain", "//*[contains(@id, 'qryId1:value130::lovIconId')]");
        elements.put("generals_i_search_chain_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_i_search_destination", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("generals_lov_search_destination", "//*[contains(@id, 'qryId1:value150::lovIconId')]");
        elements.put("generals_i_search_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_i_search_market", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("generals_lov_search_market", "//*[contains(@id, 'qryId1:value170::lovIconId')]");
        elements.put("generals_i_search_market_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_i_search_country", "//*[contains(@id, 'qryId1:value190::content')]");
        elements.put("generals_lov_search_country", "//*[contains(@id, 'qryId1:value190::lovIconId')]");
        elements.put("generals_i_search_country_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("generals_i_search_application", "//*[contains(@id, 'qryId1:value210::content')]");
        elements.put("generals_n_records", "//*[contains(@id, 'r6:0:pc1:exGeneralCount')]");
        elements.put("generals_e_result", "//*[contains(@id, 'pc1:exGeneral::db')]/table/tbody/tr[1]/td[1]");
        //EDIT
        elements.put("generals_b_edit", "//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        //ADD
        elements.put("generals_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("generals_e_secuence", "//*[contains(@id, 'pcgt2:it17::content')]");
        elements.put("generals_i_add_reason", "//*[contains(@id, 'pc1:pcgt2:soc8::content')]");
        elements.put("generals_sl_add_ie", "//*[contains(@id, 'pc1:pcgt2:soc5::content')]");
        elements.put("generals_i_add_start_date", "//*[contains(@id, 'pc1:pcgt2:id2::content')]");
        elements.put("generals_i_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::content')]");
        elements.put("generals_lov_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::lovIconId')]");
        elements.put("generals_e_add_ttoo_descriptión", "//*[contains(@id, 'pc1:pcgt2:it15::content')]");
        elements.put("generals_i_add_classification", "//*[contains(@id, 'pc1:pcgt2:codClasifId::content')]");
        elements.put("generals_lov_add_classification", "//*[contains(@id, 'pc1:pcgt2:codClasifId::lovIconId')]");
        elements.put("generals_e_add_classification_description", "//*[contains(@id, 'pc1:pcgt2:it6::content')]");
        elements.put("generals_i_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::content')]");
        elements.put("generals_lov_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::lovIconId')]");
        elements.put("generals_e_add_hotel_description", "//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("generals_i_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::content')]");
        elements.put("generals_lov_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::lovIconId')]");
        elements.put("generals_lov_add_chain_description", "//*[contains(@id, 'pc1:pcgt2:it14::content')]");
        elements.put("generals_i_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::content')]");
        elements.put("generals_lov_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::lovIconId')]");
        elements.put("generals_e_add_destination_description", "//*[contains(@id, 'pc1:pcgt2:it11::content')]");
        elements.put("generals_i_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::content')]");
        elements.put("generals_lov_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::lovIconId')]");
        elements.put("generals_e_add_market_description", "//*[contains(@id, 'pc1:pcgt2:it13::content')]");
        elements.put("generals_i_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::content')]");
        elements.put("generals_lov_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::lovIconId')]");
        elements.put("generals_e_add_country_description", "//*[contains(@id, 'pc1:pcgt2:it16::content')]");
        elements.put("generals_b_add_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        elements.put("generals_sl_aplication", "//*[contains(@id, 'pc1:pcgt2:soc4::content')]");
        elements.put("generals_cb_add_b2b", "//*[contains(@id, 'pc1:pcgt2:sbc4::content')]");
        elements.put("generals_cb_add_main_acount", "//*[contains(@id, 'pc1:pcgt2:sbc7::content')]");
        elements.put("generals_i_add_active", "//*[contains(@id, 'pc1:pcgt2:sbc6::content')]");
        elements.put("generals_lov_add_active_yes", "//*[contains(@id, 'pc1:d2::yes')]");
        //QBE
        elements.put("generals_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("generals_i_qbe_sequence", "//*[contains(@id, 'pc1_afr_exGeneral_afr_resId1c1::content')]");
        elements.put("generals_i_qbe_reason", "//*[contains(@id, 'pc1:exGeneral:socid0::content')]");
        elements.put("generals_i_qbe_ie", "//*[contains(@id, 'pc1:exGeneral:soc6::content')]");
        elements.put("generals_i_qbe_start_date", "//*[contains(@id, 'pc1:exGeneral:id5::content')]");
        elements.put("generals_i_qbe_active", "//*[contains(@id, 'pc1:exGeneral:soc7::content')]");
        elements.put("generals_i_qbe_ttoo", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c8::content')]");
        elements.put("generals_i_qbe_main_acount", "//*[contains(@id, 'pc1:exGeneral:soc1::content')]");
        elements.put("generals_i_qbe_classification", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c11::content')]");
        elements.put("generals_i_qbe_exclude_b2b", "//*[contains(@id, 'pc1:exGeneral:soc9::content')]");
        elements.put("generals_i_qbe_hotel", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c13::content')]");
        elements.put("generals_i_qbe_chain", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c15::content')]");
        elements.put("generals_i_qbe_destination", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c16::content')]");
        elements.put("generals_i_qbe_market", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c17::content')]");
        elements.put("generals_i_qbe_country", "//*[contains(@id, '_pc1_afr_exGeneral_afr_resId1c18::content')]");
        elements.put("generals_i_qbe_application", "//*[contains(@id, 'pc1:exGeneral:soc10::content')]");
        //AUDIT
        elements.put("generals_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("generals_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("generals_b_ok", "//*[contains(@id, 'd22::ok')]");
        //DETACH
        elements.put("generals_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");

        // ACTIONS COPY EXCLUSIONS



        ///////////////////////////////////////////// ATLAS TAB /////////////////////////////////////////////////////
        elements.put("atlas_tab", "//*[contains(@id, 'sdi3::disAcr')]");
        elements.put("atlas_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        //ADD
        elements.put("atlas_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("atlas_i_add_reasons", "//*[contains(@id, 'pc1:pcgt2:soc2::content')]");
        elements.put("atlas_i_add_start_date", "//*[contains(@id, 'pc1:pcgt2:id3::content')]");
        elements.put("atlas_i_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::content')]");
        elements.put("atlas_lov_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::lovIconId')]");
        elements.put("atlas_cb_add_b2b", "//*[contains(@id, 'pc1:pcgt2:sbc2::content')]");
        elements.put("atlas_i_add_classification", "//*[contains(@id, 'pc1:pcgt2:codClasifId::content')]");
        elements.put("atlas_lov_add_classification", "//*[contains(@id, 'pc1:pcgt2:codClasifId::lovIconId')]");
        elements.put("atlas_i_add_receptive", "//*[contains(@id, 'pc1:pcgt2:seqRecId::content')]");
        elements.put("atlas_lov_add_receptive", "//*[contains(@id, 'pc1:pcgt2:seqRecId::lovIconId')]");
        elements.put("atlas_i_add_contract", "//*[contains(@id, 'pc1:pcgt2:seqContrId::content')]");
        elements.put("atlas_lov_add_contract", "//*[contains(@id, 'pc1:pcgt2:seqContrId::lovIconId')]");
        elements.put("atlas_i_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::content')]");
        elements.put("atlas_lov_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::lovIconId')]");
        elements.put("atlas_i_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::content')]");
        elements.put("atlas_lov_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::lovIconId')]");
        elements.put("atlas_i_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::content')]");
        elements.put("atlas_lov_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::lovIconId')]");
        elements.put("atlas_i_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::content')]");
        elements.put("atlas_lov_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::lovIconId')]");
        elements.put("atlas_i_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::content')]");
        elements.put("atlas_lov_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::lovIconId')]");
        elements.put("atlas_i_add_application", "//*[contains(@id, 'pc1:pcgt2:soc1::content')]");
        elements.put("atlas_b_add_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        //SEARCH
        elements.put("atlas_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("atlas_n_records", "//*[contains(@id, 'r5:0:pc1:exAtlasTbCount')]");
        elements.put("atlas_e_result", "//*[contains(@id, 'pc1:exAtlasTb::db')]/table/tbody/tr[1]/td[1]");
        elements.put("atlas_i_search_reasons", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("atlas_i_search_start_date", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("atlas_i_search_ttoo", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("atlas_lov_search_ttoo", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("atlas_i_search_ttoo_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_cb_search_b2b", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("atlas_i_search_classification", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("atlas_lov_search_classification", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("atlas_i_search_classification_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_receptive", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("atlas_lov_search_receptive", "//*[contains(@id, 'qryId1:value110::lovIconId')]");
        elements.put("atlas_i_search_receptive_code", "//*[contains(@id, '_afrLovInternalQueryId:value30::content')]");
        elements.put("atlas_i_search_contract", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("atlas_lov_search_contract", "//*[contains(@id, 'qryId1:value120::lovIconId')]");
        elements.put("atlas_i_search_contract_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_hotel", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("atlas_lov_search_hotel", "//*[contains(@id, 'qryId1:value140::lovIconId')]");
        elements.put("atlas_i_search_hotel_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_chain", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("atlas_lov_search_chain", "//*[contains(@id, 'qryId1:value160::lovIconId')]");
        elements.put("atlas_i_search_chain_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_destination", "//*[contains(@id, 'qryId1:value180::content')]");
        elements.put("atlas_lov_search_destination", "//*[contains(@id, 'qryId1:value180::lovIconId')]");
        elements.put("atlas_i_search_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_market", "//*[contains(@id, 'qryId1:value200::content')]");
        elements.put("atlas_lov_search_market", "//*[contains(@id, 'qryId1:value200::lovIconId')]");
        elements.put("atlas_i_search_market_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_country", "//*[contains(@id, 'qryId1:value220::content')]");
        elements.put("atlas_lov_search_country", "//*[contains(@id, 'qryId1:value220::lovIconId')]");
        elements.put("atlas_i_search_country_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("atlas_i_search_application", "//*[contains(@id, 'qryId1:value240::content')]");
        //EDIT
        elements.put("atlas_b_edit", "//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        //QBE
        elements.put("atlas_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("atlas_i_qbe_reason", "//*[contains(@id, 'pc1:exAtlasTb:socid0::content')]");
        elements.put("atlas_i_qbe_start_date", "//*[contains(@id, 'pc1:exAtlasTb:id1::content')]");
        elements.put("atlas_i_qbe_ttoo", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c7::content')]");
        elements.put("atlas_i_qbe_classification", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c10::content')]");
        elements.put("atlas_i_qbe_receptive", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c12::content')]");
        elements.put("atlas_i_qbe_contract", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c13::content')]");
        elements.put("atlas_i_qbe_hotel", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c15::content')]");
        elements.put("atlas_i_qbe_chain", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c17::content')]");
        elements.put("atlas_i_qbe_destination", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c19::content')]");
        elements.put("atlas_i_qbe_market", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c21::content')]");
        elements.put("atlas_i_qbe_country", "//*[contains(@id, 'pc1_afr_exAtlasTb_afr_resId1c23::content')]");
        elements.put("atlas_i_qbe_application", "//*[contains(@id, 'pc1:exAtlasTb:soc10::content')]");
        //AUDIT
        elements.put("atlas_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("atlas_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("atlas_b_ok", "//*[contains(@id, 'd22::ok')]");
        //DETACH
        elements.put("atlas_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        ///////////////////////////////////////////// SI TAB /////////////////////////////////////////////////////
        elements.put("si_tab", "//*[contains(@id, 'sdi4::disAcr')]");
        //ADD
        elements.put("si_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("si_i_add_reason", "//*[contains(@id, 'pc1:pcgt2:soc2::content')]");
        elements.put("si_i_add_start_date", "//*[contains(@id, 'pc1:pcgt2:id8::content')]");
        elements.put("si_i_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::content')]");
        elements.put("si_lov_add_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtooId::lovIconId')]");
        elements.put("si_cb_add_b2b", "//*[contains(@id, 'pc1:pcgt2:sbc3::content')]");
        elements.put("si_i_add_classification", "//*[contains(@id, 'pc1:pcgt2:codClasifId::content')]");
        elements.put("si_lov_add_classification", "//*[contains(@id, 'pc1:pcgt2:codClasifId::lovIconId')]");
        elements.put("si_i_add_agency", "//*[contains(@id, 'pc1:pcgt2:ageExtCodId::content')]");
        elements.put("si_lov_add_agency", "//*[contains(@id, 'pc1:pcgt2:ageExtCodId::lovIconId')]");
        elements.put("si_i_add_agency_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_add_crs", "//*[contains(@id, 'pc1:pcgt2:codCrsId::content')]");
        elements.put("si_lov_add_crs", "//*[contains(@id, 'pc1:pcgt2:codCrsId::lovIconId')]");
        elements.put("si_i_add_brand", "//*[contains(@id, 'pc1:pcgt2:codCrsBrandId::content')]");
        elements.put("si_lov_add_brand", "//*[contains(@id, 'pc1:pcgt2:codCrsBrandId::lovIconId')]");
        elements.put("si_i_add_rate", "//*[contains(@id, 'pc1:pcgt2:codRateId::content')]");
        elements.put("si_lov_add_rate", "//*[contains(@id, 'pc1:pcgt2:codRateId::lovIconId')]");
        elements.put("si_i_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::content')]");
        elements.put("si_lov_add_hotel", "//*[contains(@id, 'pc1:pcgt2:seqHotelId::lovIconId')]");
        elements.put("si_i_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::content')]");
        elements.put("si_lov_add_chain", "//*[contains(@id, 'pc1:pcgt2:codCadenaId::lovIconId')]");
        elements.put("si_i_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::content')]");
        elements.put("si_lov_add_destination", "//*[contains(@id, 'pc1:pcgt2:codDestinoId::lovIconId')]");
        elements.put("si_i_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::content')]");
        elements.put("si_lov_add_market", "//*[contains(@id, 'pc1:pcgt2:codPaisId::lovIconId')]");
        elements.put("si_i_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::content')]");
        elements.put("si_lov_add_country", "//*[contains(@id, 'pc1:pcgt2:codPaisDestinoId::lovIconId')]");
        elements.put("si_i_add_application", "//*[contains(@id, 'pc1:pcgt2:soc10::content')]");
        elements.put("si_b_add_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        //EDIT
        elements.put("si_b_edit", "//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        //SEARCH
        elements.put("si_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("si_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("si_e_result", "//*[contains(@id, 'pc1:siTabTb::db')]/table/tbody/tr[1]/td[1]");
        elements.put("si_n_records", "//*[contains(@id, 'pc1:siTabTbCount')]");
        elements.put("si_i_search_reason", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("si_i_search_start_date", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("si_i_search_ttoo", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("si_lov_search_ttoo", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("si_i_search_ttoo_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_cb_search_b2b", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("si_i_search_classification", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("si_lov_search_classification", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        elements.put("si_i_search_classification_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_agency", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("si_lov_search_agency", "//*[contains(@id, 'qryId1:value110::lovIconId')]");
        elements.put("si_i_search_agency_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_crs", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("si_lov_search_crs", "//*[contains(@id, 'qryId1:value130::lovIconId')]");
        elements.put("si_i_search_crs_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_brand", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("si_lov_search_brand", "//*[contains(@id, 'qryId1:value150::lovIconId')]");
        elements.put("si_i_search_brand_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_rate", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("si_lov_search_rate", "//*[contains(@id, 'qryId1:value170::lovIconId')]");
        elements.put("si_i_search_rate_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_hotel", "//*[contains(@id, 'qryId1:value190::content')]");
        elements.put("si_lov_search_hotel", "//*[contains(@id, 'qryId1:value190::lovIconId')]");
        elements.put("si_i_search_hotel_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_chain", "//*[contains(@id, 'qryId1:value210::content')]");
        elements.put("si_lov_search_chain", "//*[contains(@id, 'qryId1:value210::lovIconId')]");
        elements.put("si_i_search_chain_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_destination", "//*[contains(@id, 'qryId1:value230::content')]");
        elements.put("si_lov_search_destination", "//*[contains(@id, 'qryId1:value230::lovIconId')]");
        elements.put("si_i_search_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_market", "//*[contains(@id, 'qryId1:value250::content')]");
        elements.put("si_lov_search_market", "//*[contains(@id, 'qryId1:value250::lovIconId')]");
        elements.put("si_i_search_market_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_country", "//*[contains(@id, 'qryId1:value270::content')]");
        elements.put("si_lov_search_country", "//*[contains(@id, 'qryId1:value270::lovIconId')]");
        elements.put("si_i_search_country_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("si_i_search_application", "//*[contains(@id, 'qryId1:value290::content')]");
        //AUDIT
        elements.put("si_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("si_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("si_b_ok", "//*[contains(@id, 'd22::ok')]");
        //DETACH
        elements.put("si_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        //QBE
        elements.put("si_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("si_i_qbe_reason", "//*[contains(@id, 'pc1:siTabTb:selectOneChoice121::content')]");
        elements.put("si_i_qbe_start_date", "//*[contains(@id, 'pc1:siTabTb:id5::content')]");
        elements.put("si_i_qbe_ttoo", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c7::content')]");
        elements.put("si_i_qbe_classification", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c9::content')]");
        elements.put("si_i_qbe_agency", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c10::content')]");
        elements.put("si_i_qbe_crs", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c11::content')]");
        elements.put("si_i_qbe_brand", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c12::content')]");
        elements.put("si_i_qbe_rate", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c13::content')]");
        elements.put("si_i_qbe_hotel", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c14::content')]");
        elements.put("si_i_qbe_chain", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c15::content')]");
        elements.put("si_i_qbe_destination", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c16::content')]");
        elements.put("si_i_qbe_market", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c17::content')]");
        elements.put("si_i_qbe_country", "//*[contains(@id, 'pc1_afr_siTabTb_afr_resId1c18::content')]");
        elements.put("si_i_qbe_application", "//*[contains(@id, 'pc1:siTabTb:soc9::content')]");
        ///////SI PARADAS B2B/////////////
        elements.put("si_e_result_b2b", "//*[contains(@id, 'pc2:tb2Tab::db')]/table/tbody/tr[1]/td[1]");
        elements.put("si_n_records_b2b", "//*[contains(@id, 'pc2:ot4')]");
        //ADD
        elements.put("si_b_add_b2b", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("si_i_add_b2b_stop_hour", "//*[contains(@id, 'pc2:pcgt1:it9::content')]");
        elements.put("si_i_add_b2b_start_hour", "//*[contains(@id, 'pc2:pcgt1:it10::content')]");
        elements.put("si_b_add_b2b_save", "//*[contains(@id, 'pc2:pcgt1:btn_commitExit')]");
        //EDIT
        elements.put("si_b_edit_b2b", "//*[contains(@id, 'pc2:pcgt1:boton_edit')]");
        elements.put("si_i_edit_b2b_stop_hour", "//*[contains(@id, 'pc2:pcgt1:it9::content')]");
        elements.put("si_i_edit_b2b_start_hour", "//*[contains(@id, 'pc2:pcgt1:it10::content')]");
        elements.put("si_b_edit_b2b_save", "//*[contains(@id, 'pc2:pcgt1:btn_commitExit')]");
        //DETACH
        elements.put("si_b_detach_b2b", "//*[contains(@id, 'pc2:_dchTbr')]");
        //QBE
        elements.put("si_b_qbe_b2b", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("si_i_qbe_b2b_agency", "//*[contains(@id, 'pc2_afr_tb2Tab_afr_c4::content')]");
        elements.put("si_i_qbe_b2b_stop_hour", "//*[contains(@id, 'pc2_afr_tb2Tab_afr_c2::content')]");
        elements.put("si_i_qbe_b2b_start_hour", "//*[contains(@id, 'pc2_afr_tb2Tab_afr_c5::content')]");
        //DELETE
        elements.put("si_b_delete_b2b", "//*[contains(@id, 'pc2:pcgt1:boton_remove')]");
        //////////////////////////////////////////// PRODUCT ///////////////////////////////////////////////////////////
        elements.put("product_tab", "//*[contains(@id, 'sdi9::disAcr')]");
        elements.put("product_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr/td[1]");
        elements.put("product_n_records", "//*[contains(@id, 'pc1:outputText2')]");
        //ADD
        elements.put("product_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("product_i_add_reason", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("product_i_add_destination", "//*[contains(@id, 'pc1:pcgt1:codDestinoId::content')]");
        elements.put("product_lov_add_destination", "//*[contains(@id, 'pc1:pcgt1:codDestinoId::lovIconId')]");
        elements.put("product_i_add_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("product_i_add_area", "//*[contains(@id, 'pc1:pcgt1:seqZonaGeId::content')]");
        elements.put("product_lov_add_area", "//*[contains(@id, 'pc1:pcgt1:seqZonaGeId::lovIconId')]");
        elements.put("product_i_add_hotel", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::content')]");
        elements.put("product_lov_add_hotel", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::lovIconId')]");
        elements.put("product_i_add_chain", "//*[contains(@id, 'pc1:pcgt1:codCadenaId::content')]");
        elements.put("product_lov_add_chain", "//*[contains(@id, 'pc1:pcgt1:codCadenaId::lovIconId')]");
        elements.put("product_i_add_reservation_from", "//*[contains(@id, 'pc1:pcgt1:id8::content')]");
        elements.put("product_i_add_arrival_from", "//*[contains(@id, 'pc1:pcgt1:id9::content')]");
        elements.put("product_i_add_explain", "//*[contains(@id, 'pc1:pcgt1:it9::content')]");
        elements.put("product_b_add_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
        elements.put("product_b_add_save_yes", "//*[contains(@id, 'd2::yes')]");
        //SEARCH
        elements.put("product_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("product_i_search_reason", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("product_i_search_destination", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("product_lov_search_destination", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("product_i_search_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("product_i_search_area", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("product_lov_search_area", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("product_i_search_area_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("product_i_search_hotel", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("product_lov_search_hotel", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("product_i_search_hotel_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("product_i_search_chain", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("product_lov_search_chain", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("product_i_search_chain_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("product_i_search_reservation_from", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("product_i_search_arrival_from", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("product_i_search_explain", "//*[contains(@id, 'qryId1:value160::content')]");
        //EDIT
        elements.put("product_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("product_i_edit_reason", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        elements.put("product_i_edit_destination", "//*[contains(@id, 'pc1:pcgt1:codDestinoId::content')]");
        elements.put("product_lov_edit_destination", "//*[contains(@id, 'pc1:pcgt1:codDestinoId::lovIconId')]");
        elements.put("product_i_edit_destination_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("product_i_edit_area", "//*[contains(@id, 'pc1:pcgt1:seqZonaGeId::content')]");
        elements.put("product_lov_edit_area", "//*[contains(@id, 'pc1:pcgt1:seqZonaGeId::lovIconId')]");
        elements.put("product_i_edit_hotel", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::content')]");
        elements.put("product_lov_edit_hotel", "//*[contains(@id, 'pc1:pcgt1:codCategoriaId::lovIconId')]");
        elements.put("product_i_edit_chain", "//*[contains(@id, 'pc1:pcgt1:codCadenaId::content')]");
        elements.put("product_lov_edit_chain", "//*[contains(@id, 'pc1:pcgt1:codCadenaId::lovIconId')]");
        elements.put("product_i_edit_reservation_from", "//*[contains(@id, 'pc1:pcgt1:id8::content')]");
        elements.put("product_i_edit_arrival_from", "//*[contains(@id, 'pc1:pcgt1:id9::content')]");
        elements.put("product_i_edit_explain", "//*[contains(@id, 'pc1:pcgt1:it9::content')]");
        elements.put("product_b_edit_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
        elements.put("product_b_edit_save_yes", "//*[contains(@id, 'd2::yes')]");
        //DELETE
        elements.put("product_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        //AUDIT DATA
        elements.put("product_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("product_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        //DETACH
        elements.put("product_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        //QBE
        elements.put("product_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("product_i_qbe_reason", "//*[contains(@id, 'pc1:t1:soc3::content')]");
        elements.put("product_i_qbe_destination", "//*[contains(@id, 'pc1_afr_t1_afr_c14::content')]");
        elements.put("product_i_qbe_area", "//*[contains(@id, 'pc1_afr_t1_afr_c8::content')]");
        elements.put("product_i_qbe_hotel", "//*[contains(@id, 'pc1_afr_t1_afr_c1::content')]");
        elements.put("product_i_qbe_chain", "//*[contains(@id, 'pc1_afr_t1_afr_c10::content')]");
        elements.put("product_i_qbe_reservation_from", "//*[contains(@id, 'pc1:t1:id4::content')]");
        elements.put("product_i_qbe_arrival_from", "//*[contains(@id, 'pc1:t1:id3::content')]");
        elements.put("product_i_qbe_explain", "//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        ///////////////////////////////////////////// SI RULES TAB /////////////////////////////////////////////////////
        elements.put("rules_tab", "//*[contains(@id, 'r1:1:sdi5::disAcr')]");
        //ADD
        elements.put("rules_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("rules_i_add_client", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("rules_i_add_product", "//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("rules_i_add_description", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("rules_b_add_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        //EDIT
        elements.put("rules_b_edit", "//*[contains(@id, 'pc1:pcgt2:boton_edit')]");
        elements.put("rules_i_edit_client", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("rules_i_edit_product", "//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        elements.put("rules_i_edit_description", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("rules_b_edit_save", "//*[contains(@id, 'pc1:pcgt2:btn_commitExit')]");
        //SEARCH
        elements.put("rules_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("rules_n_records", "//*[contains(@id, 'pc1:outputText1')]");
        elements.put("rules_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("rules_i_search_client", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("rules_i_search_product", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("rules_i_search_description", "//*[contains(@id, 'qryId1:value30::content')]");
        //DELETE
        elements.put("rules_b_delete", "//*[contains(@id, 'pc1:pcgt2:boton_remove')]");
        //DETACH
        elements.put("rules_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        //AUDIT DATA
        elements.put("rules_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("rules_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        //QBE
        elements.put("rules_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("rules_i_qbe_client", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("rules_i_qbe_product", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c3::content')]");
        elements.put("rules_i_qbe_description", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c4::content')]");
        ///////////////////////////////////////////// QUERY TAB /////////////////////////////////////////////////////
        elements.put("query_tab", "//*[contains(@id, 'sdi6::disAcr')]");
        //SEARCH
        elements.put("query_b_search", "//*[contains(@id, '0:cb1')]");
        elements.put("query_n_records", "//*[contains(@id, 'pc1:outputText1')]");
        elements.put("query_e_result", "//*[contains(@id, 'pc1:excQTb::db')]/table/tbody/tr[1]/td[1]");
        elements.put("query_i_search_ttoo", "//*[contains(@id, 'consTtooId::content')]");
        elements.put("query_lov_search_ttoo", "//*[contains(@id, 'consTtooId::lovIconId')]");
        elements.put("query_i_search_ttoo_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("query_i_search_chain", "//*[contains(@id, 'consCadenaId::content')]");
        elements.put("query_lov_search_chain", "//*[contains(@id, 'consCadenaId::lovIconId')]");
        elements.put("query_i_search_chain_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("query_i_search_market", "//*[contains(@id, 'consPaisId::content')]");
        elements.put("query_lov_search_market", "//*[contains(@id, 'consPaisId::lovIconId')]");
        elements.put("query_i_search_market_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        //QBE
        elements.put("query_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("query_i_qbe_ttoo", "//*[contains(@id, 'pc1_afr_excQTb_afr_c9::content')]");
        elements.put("query_i_qbe_chain", "//*[contains(@id, 'pc1_afr_excQTb_afr_c1::content')]");
        elements.put("query_i_qbe_market", "//*[contains(@id, 'pc1_afr_excQTb_afr_c7::content')]");
        //AUDIT
        elements.put("query_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("query_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        //DETACH
        elements.put("query_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        //////////////////////////////////////////// DISCONNECT TAB ////////////////////////////////////////////////////
        elements.put("disconnect_tab", "//*[contains(@id, 'r1:1:sdi7::disAcr')]");
    }
}
