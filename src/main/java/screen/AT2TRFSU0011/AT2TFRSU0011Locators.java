package screen.AT2TRFSU0011;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 29/08/2016.
 */
public class AT2TFRSU0011Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2TFRSU0011Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //QUALTIY RULES
        //qbe
        elements.put("qbe_b", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("qbe_select_active", "//*[contains(@id, 'pc1:table1:soc4::content')]");
        elements.put("qbe_to_group_i", "//*[contains(@id, 'pc1_afr_table1_afr_c2::content')]");
        elements.put("qbe_i_desc", "//*[contains(@id, 'pc1_afr_table1_afr_c1::content')]");
        //detach
        elements.put("detach_b", "//*[contains(@id, 'pc1:_dchTbr')]");
        //Actions
        elements.put("b_actions", "//*[contains(@id, 'pc1:tgenericMenu0:dc_mb1')]/div[1]");
        elements.put("b_actions_b_audit", "//*[contains(@id, 'pc1:tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("b_actions_b_close", "//*[contains(@id, 'dialog1::close')]");
        elements.put("b_actions_b_teporary", "//*[contains(@id, 'tgenericMenu0:dc_cmi2')]/td[2]");
        elements.put("b_actions_b_incompatibility", "//*[contains(@id, 'tgenericMenu0:dc_cmi3')]/td[2]");
        elements.put("b_actions_b_exclusive", "//*[contains(@id, 'tgenericMenu0:dc_cmi4')]/td[2]");
        elements.put("b_actions_b_maximum", "//*[contains(@id, 'tgenericMenu0:dc_cmi6')]/td[2]");


        //search
        elements.put("n_records", "//*[contains(@id, 'pc1:ot2')]"); //number of records retrieved
        elements.put("b_search", "//*[contains(@id, 'queryQualityNormas::search')]");
        elements.put("search_sel_active", "//*[contains(@id, 'queryQualityNormas:value00::content')]");
        elements.put("search_i_to_group", "//*[contains(@id, 'queryQualityNormas:value10::content')]");
        elements.put("search_i_desc", "//*[contains(@id, 'queryQualityNormas:value20::content')]");
        elements.put("search_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr");
        //add
        elements.put("b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("ss_add_cb_active", "//*[contains(@id, 'sbc2::content')]");
        elements.put("ss_add_i_to_group", "//*[contains(@id, 'tTOOGroupId::content')]");
        elements.put("ss_add_i_to_group_description", "//*[contains(@id, 'pc1:tgenericbar0:it1::content')]");
        elements.put("ss_add_lov_to_group", "//*[contains(@id, 'tTOOGroupId::lovIconId')]");
        elements.put("ss_add_lov_to_group_i_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("ss_add_ss_to_group_b_search", "//*[contains(@id, 'tTOOGroupId::_afrLovInternalQueryId::search')]");
        elements.put("ss_add_ss_to_group_e_result", "//*[contains(@id, 'tTOOGroupId_afrLovInternalTableId::db')]/table/tbody/tr");
        elements.put("ss_add_ss_to_group_b_ok", "//*[contains(@id, 'tTOOGroupId::lovDialogId::ok')]");
        elements.put("ss_add_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");//save and close
        //edit
        elements.put("b_edit", "//*[contains(@id, 'pc1:tgenericbar0:boton_edit')]");
        elements.put("ss_edit_cb_active", "//*[contains(@id, 'sbc2::content')]");
        elements.put("ss_edit_i_to_group", "//*[contains(@id, 'tTOOGroupId::content')]");
        elements.put("ss_edit_i_to_group_description", "//*[contains(@id, 'pc1:tgenericbar0:it1::content')]");
        elements.put("ss_edit_lov_to_group", "//*[contains(@id, 'tTOOGroupId::lovIconId')]");
        elements.put("ss_edit_ss_to_group_b_search", "//*[contains(@id, 'tTOOGroupId::_afrLovInternalQueryId::search')]");
        elements.put("ss_edit_ss_to_group_e_result", "//*[contains(@id, 'tTOOGroupId_afrLovInternalTableId::db')]/table/tbody/tr");
        elements.put("ss_edit_ss_to_group_b_ok", "//*[contains(@id, 'tTOOGroupId::lovDialogId::ok')]");
        elements.put("ss_edit_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");//save and close
        //delete
        elements.put("b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("ss_delete_b_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");
        elements.put("n_records", "//*[contains(@id, 'pc1:ot2')]");

        //TEMPORALY RULES

        //Temporary Quality Rules
        elements.put("rules_b_save", "//*[contains(@id, ':detailToolbar:boton_commit')]");
        elements.put("rules_b_save_b_ok", "//*[contains(@id, 'dyntdc:r1:2:d3::ok')]");
        elements.put("rules_gr_add_i_arrivals", "//*[contains(@id, 'it1::content')]");
        elements.put("rules_gr_add_i_departures", "//*[contains(@id, 'it2::content')]");
        elements.put("rules_nu_add_i_arrivals", "//*[contains(@id, 'inputText1::content')]");
        elements.put("rules_nu_add_i_departures", "//*[contains(@id, 'inputText2::content')]");
        elements.put("rules_ti_add_i_arrivals", "//*[contains(@id, 'inputText3::content')]");
        elements.put("rules_ti_add_i_departures", "//*[contains(@id, 'inputText4::content')]");
        elements.put("rules_tb_add_i_arrivals", "//*[contains(@id, 'inputText5::content')]");
        elements.put("rules_tb_add_i_depertures", "//*[contains(@id, 'inputText6::content')]");
        elements.put("rules_dep_add_i_pax", "//*[contains(@id, 'inputText7::content')]");
        elements.put("rules_dep_add_i_every", "//*[contains(@id, 'inputText8::content')]");
        elements.put("rules_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]");
        elements.put("rules_b_actions_toperator", "//*[contains(@id, 'tgenericMenu0:dc_cmi2')]/td[2]");

        //CALIDAD_VUELOS_TIEMPO


        //actions
        elements.put("tiempo_b_actions", "//*[contains(@id, 'tgenericMenu1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("tiempo_b_actions_tour", "//*[contains(@id, 'tgenericMenu1:dc_cmi2')]/td[2]");
        //search
        elements.put("tiempo_n_records", "//*[contains(@id, 'pc1:ot2')]"); //number of records retrieved
        elements.put("tiempo_b_advanced", "//*[contains(@id, ':quickQueryVuelos:cl1')]");
        elements.put("tiempo_search_sel_ad", "//*[contains(@id, 'queryVuelos:value00')]");
        elements.put("tiempo_search_i_time", "//*[contains(@id, 'queryVuelos:value10::content')]");
        elements.put("tiempo_search_i_transfer", "//*[contains(@id, 'queryVuelos:value20::content')]");
        elements.put("tiempo_search_lov", "//*[contains(@id, 'queryVuelos:value20::lovIconId')]");
        elements.put("tiempo_search_i_description", "//*[contains(@id, 'queryVuelos:value30::content')]");
        elements.put("tiempo_b_search", "//*[contains(@id, 'queryVuelos::search')]");
        //add
        elements.put("tiempo_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("tiempo_cr_b_save", "//*[contains(@id, 'pc1:tgenericbar0:btn_commitExit')]");
        elements.put("tiempo_cr_sel_ad", "//*[contains(@id, 'tgenericbar0:soc1::content')]");
        elements.put("tiempo_cr_lov", "//*[contains(@id, 'codTipotrasId::lovIconId')]");
        elements.put("tiempo_cr_i_transfer", "//*[contains(@id, 'tgenericbar0:codTipotrasId::content')]");
        elements.put("tiempo_cr_i_transfer_null", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("tiempo_cr_i_time", "//*[contains(@id, 'tgenericbar0:it4::content')]");
        //qbe
        elements.put("tiempo_qbe_b", "//*[contains(@id, ':_qbeTbr']/a");
        elements.put("tiempo_qbe_sel_ad", "//*[contains(@id, 't1:soc5::content')]");
        elements.put("tiempo_qbe_i_time", "//*[contains(@id, 'pc1_afr_t1_afr_c10::content')]");
        elements.put("tiempo_qbe_i_transfer", "//*[contains(@id, 'pc1_afr_t1_afr_c13::content')]");
        elements.put("tiempo_qbe_i_description", "//*[contains(@id, 'pc1_afr_t1_afr_c13::content')]");
        //edit
        elements.put("tiempo_ed_b_edit", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("tiempo_ed_b_save", "//*[contains(@id, 'pc1:tgenericbar0:btn_commitExit')]");
        elements.put("tiempo_ed_sel_ad", "//*[contains(@id, 'tgenericbar0:soc1::content')]");
        elements.put("tiempo_ed_i_transfer", "//*[contains(@id, 'tgenericbar0:codTipotrasId::content')]");
        elements.put("tiempo_ed_i_transfer_null", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("tiempo_ed_i_time", "//*[contains(@id, 'tgenericbar0:it4::content')]");
        //detach
        elements.put("tiempo_detach_b", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        //delete
        elements.put("tiempo_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("tiempo_ss_delete_b_yes", "//*[contains(@id, 'pc1:tgenericbar1:cbt1')]");

        //CALIDAD_TIEMPO_ANTELA

        //search
        elements.put("antela_n_records", "//*[contains(@id, 'pc2:ot20')]"); //number of records retrieved
        elements.put("antela_b_advanced", "//*[contains(@id, ':quickQueryCalidadTiempoAnt:cl2')]");
        elements.put("antela_search_sel_ad", "//*[contains(@id, 'queryCalidadTiempoAnt:value00::content')]");
        elements.put("antela_search_i_time", "//*[contains(@id, 'queryCalidadTiempoAnt:value10::content')]");
        elements.put("antela_search_i_transfer", "//*[contains(@id, 'queryCalidadTiempoAnt:value20::content')]");
        elements.put("antela_search_lov", "//*[contains(@id, 'queryCalidadTiempoAnt:value20::lovIconId')]");
        elements.put("antela_search_i_description", "//*[contains(@id, 'queryCalidadTiempoAnt:value30::content')]");
        elements.put("antela_search_b_search", "//*[contains(@id, 'queryCalidadTiempoAnt::search')]");
        elements.put("antela_search_t_result", "//*[contains(@id, 'pc2:t6::db')]/table/tbody/tr[1]/td[1]");
        elements.put("antela_search_lov_i_internal", "//*[contains(@id, 'afrLovInternalTableId::db')]/table/tbody/tr/td[1]");
        elements.put("antela_search_lov_i_des", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        //add
        elements.put("antela_cr_b_add", "//*[contains(@id, 'pc2:tgenericbar1:boton_add')]");
        elements.put("antela_cr_b_save", "//*[contains(@id, 'tgenericbar1:btn_commitExit')]");
        elements.put("antela_cr_sel_ad", "//*[contains(@id, 'tgenericbar1:soc2::content')]");
        elements.put("antela_cr_i_description", "//*[contains(@id, 'tgenericbar1:it10::content')]");
        elements.put("antela_cr_i_lov", "//*[contains(@id, 'tgenericbar1:codTipotras1Id::lovIconId')]");
        elements.put("antela_cr_i_transfer", "//*[contains(@id, 'tgenericbar1:codTipotras1Id::content')]");
        elements.put("antela_cr_i_transfer_null", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("antela_cr_i_time", "//*[contains(@id, 'pc2:tgenericbar1:it9::content')]");
        //qbe
        elements.put("antela_qbe_b", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("antela_qbe_sel_ad", "//*[contains(@id, 'pc2:t6:soc6::content')]");
        elements.put("antela_qbe_i_time", "//*[contains(@id, 'pc2_afr_t6_afr_c1::content')]");
        elements.put("antela_qbe_i_transfer", "//*[contains(@id, 'pc2_afr_t6_afr_c4::content')]");
        elements.put("antela_qbe_i_description", "//*[contains(@id, 'pc2_afr_t6_afr_c3::content')]");
        //edit
        elements.put("antela_ed_b_edit", "//*[contains(@id, 'tgenericbar1:boton_edit')]");
        elements.put("antela_ed_b_save", "//*[contains(@id, 'tgenericbar1:btn_commitExit')]");
        elements.put("antela_ed_sel_ad", "//*[contains(@id, 'tgenericbar1:soc2::content')]");
        elements.put("antela_ed_lov", "//*[contains(@id, 'tgenericbar1:codTipotras1Id::lovIconId')]");
        elements.put("antela_ed_i_transfer", "//*[contains(@id, 'tgenericbar1:codTipotras1Id::content')]");
        elements.put("antela_ed_i_description", "//*[contains(@id, 'tgenericbar1:it10::content')]");
        elements.put("antela_ed_i_time", "//*[contains(@id, 'tgenericbar1:it9::content')]");
        //detach
        elements.put("antela_detach_b", "//*[contains(@id, 'pc2:_dchTbr')]/a");

        //actions
        elements.put("antela_b_actions", "//*[contains(@id, 'tgenericMenu2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("antela_b_auditdata", "//*[contains(@id, 'tgenericMenu2:dc_cmi1')]/td[2]");
        elements.put("antela_b_audit_close", "//*[contains(@id, 'dialog2::close')]");



        //delete
        elements.put("antela_b_delete", "//*[contains(@id, 'tgenericbar1:boton_remove')]");
        elements.put("antela_ss_delete_b_yes", "//*[contains(@id, 'tgenericbar1:cbt1')]");



        //INCOMPATIBILITY OF AREAS


        //search
        elements.put("areas_s_lov", "//*[contains(@id, 'queryIncompatibility:value00::lovIconId')]");
        elements.put("areas_s_i_code1", "//*[contains(@id, 'queryIncompatibility:value00::content')]");
        elements.put("areas_s_i_description", "//*[contains(@id, 'queryIncompatibility:value10::content')]");
        elements.put("areas_s_lov2", "//*[contains(@id, 'queryIncompatibility:value20::lovIconId')]");
        elements.put("areas_s_i_code2", "//*[contains(@id, 'queryIncompatibility:value20::content')]");
        elements.put("areas_s_i_description2", "//*[contains(@id, 'queryIncompatibility:value30::content')]");
        elements.put("areas_i_b_search", "//*[contains(@id, 'queryIncompatibility::search')]");
        elements.put("areas_i_result", "//*[contains(@id, 'tableIncomp::db')]/table/tbody/tr/td[1]");
        elements.put("areas_i_lov_transfer", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("areas_i_lov_transfer2", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");


        //add
        elements.put("areas_ad_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("areas_ad_lov", "//*[contains(@id, 'tgenericbar0:codZona1Id::lovIconId')]");
        elements.put("areas_ad_i_code1", "//*[contains(@id, 'tgenericbar0:codZona1Id::content')]");
        elements.put("areas_ad_i_description", "//*[contains(@id, 'tgenericbar0:it2::content')]");
        elements.put("areas_ad_lov2", "//*[contains(@id, 'tgenericbar0:codZona2Id::lovIconId')]");
        elements.put("areas_ad_i_code2", "//*[contains(@id, 'tgenericbar0:codZona2Id::content')]");
        elements.put("areas_ad_i:description2", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("areas_ad_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");


        //QBE
        elements.put("areas_qbe_b_qbe", "//*[contains(@id, '_qbeTbr')]/a");
        elements.put("areas_qbe_i_code1", "//*[contains(@id, 'tableIncomp_afr_c8::content')]");
        elements.put("areas_qbe_i_description", "//*[contains(@id, 'tableIncomp_afr_c12::content')]");
        elements.put("areas_qbe_code2", "//*[contains(@id, 'tableIncomp_afr_c6::content')]");
        elements.put("areas_qbe_i_description2", "//*[contains(@id, 'tableIncomp_afr_c2::content')]");

        //edit
        elements.put("areas_ed_b_ed", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("areas_ed_lov", "//*[contains(@id, 'tgenericbar0:codZona1Id::lovIconId')]");
        elements.put("areas_ad_i_code1", "//*[contains(@id, 'tgenericbar0:codZona1Id::content')]");
        elements.put("areas_ed_lov2", "//*[contains(@id, 'tgenericbar0:codZona2Id::lovIconId')]");
        elements.put("areas_ad_i_code2", "//*[contains(@id, 'tgenericbar0:codZona2Id::content')]");
        elements.put("areas_ed_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");
        elements.put("areas_ed_lov_code1_result3", "//*[contains(@id, 'pc1:tgenericbar0:codZona1Id_afrLovInternalTableId::db')]/table/tbody/tr[3]/td[1]");
        elements.put("areas_ed_lov_code1_result4", "//*[contains(@id, 'tgenericbar0:codZona2Id_afrLovInternalTableId::db')]/table/tbody/tr[4]/td[1]");

        //detach
        elements.put("areas_detach_b", "//*[contains(@id, 'pc1:_dchTbr')]/a");


        //delete
        elements.put("areas_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("areas_ss_delete_b_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");
        elements.put("areas_records", "//*[contains(@id, 'pc1:ot3')]");

        //actions
        elements.put("areas_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("areas_b_actions_tour", "//*[contains(@id, 'tgenericMenu0:dc_cmi2')]/td[2]");
        elements.put("areas_b_audit_data", "//*[contains(@id, 'tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("areas_b_close", "//*[contains(@id, 'dialog1::close')]");


        //Exclusive areas

        //add
        elements.put("exclusive_ad_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("exclusive_ad_lov", "//*[contains(@id, 'tgenericbar0:codZonaId::lovIconId')]");
        elements.put("exclusive_ad_i_transfer", "//*[contains(@id, 'tgenericbar0:codZonaId::content')]");
        elements.put("exclusive_ad_i_description", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("exclusive_ad_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");


        //search
        elements.put("exclusive_s_lov", "//*[contains(@id, 'queryExclusiveTransArea:value00::lovIconId')]");
        elements.put("exclusive_s_i_transfer", "//*[contains(@id, 'queryExclusiveTransArea:value00::content')]");
        elements.put("exclusive_s_lov_transfer", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("exclusive_i_b_search", "//*[contains(@id, 'queryExclusiveTransArea::search')]");
        elements.put("exclusive_result", "//*[contains(@id, 't1::db')]/table/tbody/tr/td[1]");


        //qbe
        elements.put("exclusive_qbe_b_qbe", "//*[contains(@id, '_qbeTbr')]/a");
        elements.put("exclusive_qbe_i_transfer", "//*[contains(@id, '_afr_t1_afr_c1::content')]");
        elements.put("exclusive_qbe_i_description", "//*[contains(@id, '_afr_t1_afr_c2::content')]");

        //edit

        elements.put("exclusive_ed_b_edit", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("exclusive_ed_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");
        elements.put("exclusive_ed_lov", "//*[contains(@id, 'tgenericbar0:codZonaId::lovIconId')]");
        elements.put("exclusive_ed_i_transfer", "//*[contains(@id, 'tgenericbar0:codZonaId::content')]");
        elements.put("exclusive_ed_i_description", "//*[contains(@id, 'tgenericbar0:it1::content')]");

        //actions
        elements.put("exclusive_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]");
        elements.put("exclusive_b_actions_auditdata", "//*[contains(@id, 'tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("exclusive_b_actions_b_close", "//*[contains(@id, 'd2::close')]");
        elements.put("exclusive_b_actions_tour", "//*[contains(@id, 'tgenericMenu0:dc_cmi2')]/td[2]");


        //detach
        elements.put("exclusive_detach_b", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete
        elements.put("exclusive_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("exclusive_ss_delete_b_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");
        elements.put("exclusive_records", "//*[contains(@id, 'pc1:ot6')]");


        //MAXIMUM SEATS OF A HOTEL

        //add
        elements.put("maximum_ad_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("maximum_ad_lov", "//*[contains(@id, 'tgenericbar0:nomcortoId::lovIconId')]");
        elements.put("maximum_ad_i_hotel", "//*[contains(@id, 'tgenericbar0:nomcortoId::content')]");
        elements.put("maximum_ad_i_description", "//*[contains(@id, 'tgenericbar0:it2::content')]");
        elements.put("maximum_ad_i_stops", "//*[contains(@id, 'tgenericbar0:it7::content')]");
        elements.put("maximum_ad_seats", "//*[contains(@id, 'tgenericbar0:it1::content')]");
        elements.put("maximum_ad_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");
        elements.put("maximum_ad_i_code", "//*[contains(@id, 'tablaSeats::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]");


        //search
        elements.put("maximum_s_i_stops", "//*[contains(@id, 'queryMaximumSeats:value00::content')]");
        elements.put("maximum_s_i_seats", "//*[contains(@id, 'queryMaximumSeats:value10::content')]");
        elements.put("maximum_b_search", "//*[contains(@id, 'queryMaximumSeats::search')]");
        elements.put("maximum_result", "//*[contains(@id, 'tablaSeats::db')]/table/tbody/tr/td[1]");

        //qbe

        elements.put("maximum_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("maximum_qbe_code", "//*[contains(@id, '_afr_tablaSeats_afr_c4::content')]");
        elements.put("maximum_qbe_hotel", "//*[contains(@id, '_afr_tablaSeats_afr_c3::content')]");
        elements.put("maximum_qbe_description", "//*[contains(@id, '_afr_tablaSeats_afr_c2::content')]");
        elements.put("maximum_qbe_stops", "//*[contains(@id, '_afr_tablaSeats_afr_c1::content')]");
        elements.put("maximum_qbe_seats", "//*[contains(@id, '_afr_tablaSeats_afr_c5::content')]");

        //actions
        elements.put("maximum_b_actions", "//*[contains(@id, '_afr_tablaSeats_afr_c5::content')]");
        elements.put("maximum_b_actions_tour", "//*[contains(@id, 'tgenericMenu0:dc_cmi2')]/td[2]");


        //detach
        elements.put("maximum_detach_b", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete
        elements.put("maximum_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("maximum_ss_delete_b_yes", "//*[contains(@id, 'tgenericbar0:cbt1')]");
        elements.put("maximum_records", "//*[contains(@id, 'pc1:ot2')]");
    }
}

