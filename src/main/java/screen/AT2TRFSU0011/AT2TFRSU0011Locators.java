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
        elements.put("rules_tb_add_i_depertures", "//*[contains(@id, 'inputText6::content)']");
        elements.put("rules_dep_add_i_pax", "//*[contains(@id, 'inputText7::content')]");
        elements.put("rules_dep_add_i_every", "//*[contains(@id, 'inputText8::content')]");
        elements.put("rules_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]");
        elements.put("rules_b_actions_toperator", "//*[contains(@id, 'tgenericMenu0:dc_cmi2')]/td[2]");

        //CALIDAD_VUELOS_TIEMPO

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
        //add
        elements.put("antela_cr_b_add", "//*[contains(@id, 'pc2:tgenericbar1:boton_add')]");
        elements.put("antela_cr_b_save", "//*[contains(@id, 'pc1:tgenericbar0:btn_commitExit')]");
        elements.put("antela_cr_sel_ad", "//*[contains(@id, 'tgenericbar0:soc1::content')]");
        elements.put("antela_cr_i_transfer", "//*[contains(@id, 'tgenericbar0:codTipotrasId::content')]");
        elements.put("antela_cr_i_transfer_null", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("antela_cr_i_time", "//*[contains(@id, 'tgenericbar0:it4::content')]");
        //qbe
        elements.put("antela_qbe_b", "//*[contains(@id, 'dyntdc:r1:2:pc2:_qbeTbr']/a");
        elements.put("antela_qbe_sel_ad", "//*[contains(@id, 'pc2:t6:soc6::content')]");
        elements.put("antela_qbe_i_time", "//*[contains(@id, 'pc2_afr_t6_afr_c1::content')]");
        elements.put("antela_qbe_i_transfer", "//*[contains(@id, 'pc2_afr_t6_afr_c4::content')]");
        elements.put("antela_qbe_i_description", "//*[contains(@id, 'pc2_afr_t6_afr_c3::content')]");
        //edit
        elements.put("antela_ed_b_edit", "//*[contains(@id, 'tgenericbar1:boton_edit')]");
        elements.put("antela_ed_b_save", "//*[contains(@id, 'pc1:tgenericbar0:btn_commitExit')]");
        elements.put("antela_ed_sel_ad", "//*[contains(@id, 'tgenericbar0:soc1::content')]");
        elements.put("antela_ed_lov", "//*[contains(@id, 'tgenericbar1:codTipotras1Id::lovIconId']");
        elements.put("antela_ed_i_transfer", "//*[contains(@id, 'tgenericbar0:codTipotrasId::content')]");
        elements.put("antela_ed_i_transfer_null", "//*[contains(@id, 'tgenericbar0:it3::content')]");
        elements.put("antela_ed_i_time", "//*[contains(@id, 'tgenericbar0:it4::content')]");
        //detach
        elements.put("antela_detach_b", "//*[contains(@id, 'pc2:_dchTbr']/a");
        //delete
        elements.put("antela_b_delete", "//*[contains(@id, 'pc2:tgenericbar1:boton_remove']");
        elements.put("antela_ss_delete_b_yes", "//*[contains(@id, 'tgenericbar1:cbt1')]");




    }
}

