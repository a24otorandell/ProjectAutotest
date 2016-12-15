package screen.AT2ACCSU0020;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 07/12/2016.
 */
public class AT2ACCSU0020Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0020Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }


    public void setElements() {
        elements.put("hpc_actions_b","//*[contains(@id, 'pc4:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hpc_audit_b","//*[contains(@id, 'pc4:pcgm2:dc_cmi1')]");
        elements.put("hpc_audit_ok_b","//*[contains(@id, 'pc4:d2::ok')]");

        elements.put("cli_actions_b","//*[contains(@id, 'pc5:pcgm3:dc_m1')]/div/table/tbody/tr/td[2]/a");

        elements.put("cli_b_actions_b_portail_update","//*[contains(@id, 'pc5:pcgm3:dc_cmi2')]/td[2]");
        elements.put("cli_audit_b","//*[contains(@id, 'pc5:pcgm3:dc_cmi1')]");
        elements.put("cli_audit_ok_b","//*[contains(@id, 'pc5:d7::ok')]");
        elements.put("cli_eoi_1",".//*[@id='pt1:dyntdc:r9:1:pc5:t21::eoi']");

        elements.put("cli_detach_b","//*[contains(@id, 'pc5:_dchTbr')]/ancestor::a[1]/ancestor::div[1]");
        elements.put("hpc_detach_b","//*[contains(@id, 'pc4:_dchTbr')]/ancestor::a[1]/ancestor::div[1]");
        elements.put("gp_detach_b","//*[contains(@id, 'pc3:_dchTbr')]/ancestor::a[1]/ancestor::div[1]");

        elements.put("search_e_result", "//*[contains(@id, 'resId1::db')]/table/tbody/tr"); //search result
        elements.put("n_records", "//*[contains(@id, 'pc1:ot4')]"); //number of records retrieved
        elements.put("b_save", "//*[contains(@id, 'pcgt2:boton_commit')]"); //button save

        //<editor-fold desc="GENERAL PRIORITY TABLE">
        //GENERAL PRIORITY
        elements.put("gp_e_result", "//*[contains(@id, 'resId3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("gp_e_result_no_data", "//*[contains(@id, 'resId3::db')]");
        elements.put("gp_n_records", "//*[contains(@id, 'pc3:ot256')]");
        elements.put("gp_b_actions", "//*[contains(@id, 'pc3:pcgm1:dc_m1')]");
        elements.put("gp_b_actions_b_audit", "//*[contains(@id, 'pc3:pcgm1:dc_cmi1')]/td[2]");
        elements.put("gp_b_actions_b_portail_update", "//*[contains(@id, 'pc3:pcgm1:dc_cmi2')]/td[2]");
        elements.put("gp_b_actions_b_portail_update_b_qbe", "//*[contains(@id, '1:pc6:_qbeTbr')]");
        elements.put("gp_b_actions_b_portail_update_b_detach", "//*[contains(@id, '1:pc6:_dchTbr')]");
        elements.put("gp_b_actions_b_portail_update_b_qbe_i_name", "//*[contains(@id, '1_afr_pc6_afr_t19_afr_c5::content')]");
        elements.put("gp_b_actions_b_portail_update_b_close", "//*[contains(@id, 'r1:1:d4::close')]");
        elements.put("gp_b_actions_b_portail_update_e_no_data", "//*[@id='pt1:dyntdc:r1:1:pc6:t19::db']");
        elements.put("gp_b_actions_b_portail_update_e_result", "//*[contains(@id, 'pc6:t19::db')]/table/tbody/tr[1]/td[1]");
        elements.put("gp_b_actions_b_audit_b_ok", "//*[contains(@id, 'pc3:d5::ok')]");
        elements.put("gp_b_show_toolbar", "//*[contains(@id, 'pc3:tb7::eoi')]");
        elements.put("gp_b_show_detach", "//*[contains(@id, 'pc3:_tbr::eoi')]");
        elements.put("gp_b_show_n_records", "//*[contains(@id, 'pc3:t3::eoi')]");
        elements.put("gp_i_hotel_code","//*[contains(@id, 'pc3:resId3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]"); //
        elements.put("gp_click_e_search","//*[contains(@id, 'pc3:resId3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("gp_click_e_search2","//*[contains(@id, 'pc3:resId3::db')]/table/tbody/tr[2]/td[1]");

        //GENERAL PRIORITY QUERY
        elements.put("gp_b_view", "//*[contains(@id, 'pc3:_vw')]"); //button View
        elements.put("gp_b_qbe_b_clear", "//*[contains(@id, 'pc3:resId3::ch::t')]/tbody/tr[2]/th/a"); //button QbE
        elements.put("gp_b_qbe", "//*[@id='pt1:dyntdc:r1:1:pc3:_qbeTbr']"); //button QbE
        elements.put("gp_qbe_i_hotel_code", "//*[contains(@id, '_afr_res3c1::content')]"); //add lov hotel_code button search
        elements.put("gp_qbe_i_priority", "//*[contains(@id, '_afr_resId3c4::content')]"); //add lov hotel_code result
        elements.put("gp_qbe_i_hotel_desc", "//*[contains(@id, '_afr_resId3c2::content')]");
        elements.put("gp_qbe_i_destination", "//*[contains(@id, '_afr_resId3c3::content')]");
        //GENERAL PRIORITY ADD
        elements.put("gp_b_add", "//*[@id='pt1:dyntdc:r1:1:pc3:pcgt2:boton_add']"); //button add
        elements.put("gp_ss_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]"); //button save
        elements.put("gp_ss_add_i_hotel_code", "//*[contains(@id, 'pcgt2:itA10::content')]"); //add input hotel_code
        elements.put("gp_ss_add_lov_hotel_code", "//*[contains(@id, 'itA10::lovIconId')]"); //add lov hotel_code
        elements.put("gp_ss_add_ss_hotel_code_i_code", "//*[contains(@id, 'itA10::_afrLovInternalQueryId:value00::content')]"); //add lov hotel_code input hotel_code
        elements.put("gp_ss_add_ss_hotel_code_b_search", "//*[contains(@id, 'itA10::_afrLovInternalQueryId::search')]"); //add lov hotel_code button search
        elements.put("gp_ss_add_ss_hotel_code_e_result", "//*[contains(@id, 'itA10_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[1]"); //add lov hotel_code result
        elements.put("gp_ss_add_ss_hotel_code_b_ok", "//*[contains(@id, 'itA10::lovDialogId::ok')]"); //add lov hotel_code button ok
        elements.put("gp_ss_add_i_priority", "//*[contains(@id, 'it3::content')]"); //add input priority
        elements.put("gp_ss_add_i_hotel_desc", "//*[contains(@id, 'it4::content')]");
        //GENERAL PRIORITY EDIT
        elements.put("gp_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("gp_ss_edit_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("gp_ss_edit_i_priority", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("gp_ss_edit_i_hotelId","//*[contains(@id, 'pcgt2:itA10::content')]");
        elements.put("gp_ss_edit_lov_hotelId","//*[contains(@id, ':pcgt2:itA10::lovIconId')]");
        elements.put("gp_ss_edit_i_destination","//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("gp_b_cancel_edit","//*[contains(@id, 'pcgt2:boton_rollbackp')]");
        elements.put("gp_ss_edit_i_desc","//*[contains(@id, 'pcgt2:it4::content')]");
        //GENERAL PRIORITY DELETE
        elements.put("gp_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        //elements.put("gp_ss_delete_b_yes", "//*[contains(@id, 'dConfirmDelete::yes')]");
        //</editor-fold>

        //<editor-fold desc="HOTEL PRIORITY FOR COUNTRY">

        //HOTEL PRIORITY FOR COUNTRY
        elements.put("hpc_e_result", "//*[contains(@id, 'resId4::db')]/table/tbody/tr[1]/td[1]");
        elements.put("hpc_e_result_no_data", "//*[contains(@id, 'resId4::db')]");
        elements.put("hpc_n_records", "//*[contains(@id, 'pc4:ot29')]");
        elements.put("hpc_b_show_toolbar", "//*[contains(@id, 'pc4:t1::eoi')]");
        elements.put("hpc_click_e_search","//*[contains(@id, 'pc4:resId4::db')]/table/tbody/tr[1]/td[1]"); // //*[contains(@id, 'pc4:resId4::db')]/table/tbody/tr[1]/td[1] // //*[contains(@id, 'pt1:dyntdc:r3:1:pc4:resId4::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]
        elements.put("hpc_click_popup_edit","//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("hpc_b_actions_b_portail_update", "//*[contains(@id, 'pc4:pcgm2:dc_cmi2')]/td[2]");


        //HOTEL PRIORITY FOR COUNTRY QUERY
        elements.put("hpc_b_view", "//*[contains(@id, 'pc4:_vw')]"); //button View
        elements.put("hpc_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]"); //button QbE
        elements.put("hpc_b_qbe_b_clear", "//*[contains(@id, 'pc4:resId4::ch::t')]/tbody/tr[2]/th/a"); //button QbE

        elements.put("hpc_qbe_i_hotel_code", "//*[contains(@id, '_afr_res4c1::content')]"); //add lov hotel_code button search
        elements.put("hpc_qbe_i_country_code", "//*[contains(@id, '_afr_res4c4::content')]"); //add lov hotel_code button search
        elements.put("hpc_qbe_i_priority", "//*[contains(@id, '_afr_res4c5::content')]"); //add lov hotel_code result
        elements.put("hpc_qbe_i_hotel_desc", "//*[contains(@id, '_afr_res4c2::content')]");
        elements.put("hpc_qbe_i_hotel_destination", "//*[contains(@id, '_afr_res4c3::content')]");


        //HOTEL PRIORITY FOR DETACH
        elements.put("hpc_e_result","//*[contains(@id, '1:pc4:resId4::db')]/table[1]/tbody/tr[1]/td[1]");
        elements.put("hpc_close_detach_b","//*[contains(@id, '1:pc4::_afrDetachDialogId::close')]");


        //HOTEL PRIORITY FOR COUNTRY ADD
        elements.put("hpc_b_add", "//*[contains(@id, 'pcgt36:boton_add')]"); //button add
        elements.put("hpc_ss_add_b_save", "//*[contains(@id, 'pcgt36:btn_commitExit')]"); //button save
        elements.put("hpc_ss_add_i_hotel_code", "//*[contains(@id, 'itB10::content')]"); //add input hotel_code
        elements.put("hpc_ss_add_lov_hotel_code", "//*[contains(@id, 'itB10::lovIconId')]"); //add lov hotel_code
        elements.put("hpc_ss_add_i_country_code", "//*[contains(@id, 'codPaisId::content')]"); //add input country_code
        elements.put("hpc_ss_add_lov_country_code", "//*[contains(@id, 'codPaisId::lovIconId')]"); //add lov country_code
        elements.put("hpc_ss_add_i_hotel_desc", "//*[contains(@id, 'it6::content')]"); //add input priority
        elements.put("hpc_ss_add_i_hotel_destination", "//*[contains(@id, 'it7::content')]");
        elements.put("hpc_ss_add_i_priority", "//*[contains(@id, 'it8::content')]"); //add input priority

        //HOTEL PRIORITY FOR COUNTRY EDIT
        elements.put("hpc_b_edit", "//*[contains(@id, 'pcgt36:boton_edit')]"); //button edit
        elements.put("hpc_ss_edit_b_save", "//*[contains(@id, 'pcgt36:btn_commitExit')]"); //ss edit button save
        elements.put("hpc_ss_edit_i_priority", "//*[contains(@id, 'it8::content')]"); //ss edit input priority
        elements.put("hpc_ss_edit_i_hotelId","//*[contains(@id, 'pcgt36:itB10::content')]");
        elements.put("hpc_ss_edit_i_country","//*[contains(@id, 'pcgt36:codPaisId::content')]");
        elements.put("hpc_b_cancel_edit","//*[contains(@id, 'pcgt36:boton_rollbackp')]");

        //HOTEL PRIORITY FOR COUNTRY DELETE
        elements.put("hpc_b_delete", "//*[contains(@id, 'pcgt36:boton_remove')]");
        elements.put("hpc_ss_delete_b_yes", "//*[contains(@id, ':pc4:pcgt36:cbt1')]");

        //</editor-fold>

        //<editor-fold desc="HOTEL PRIORITY FOR CLIENT">
        //HOTEL PRIORITY FOR CLIENT AUDIT
        elements.put("cli_actions_b","//*[contains(@id, 'pc5:pcgm3:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("cli_audit_b","//*[contains(@id, 'pc5:pcgm3:dc_cmi1')]");
        elements.put("cli_audit_ok_b","//*[contains(@id, 'pc5:d7::ok')]");

        //HOTEL PRIORITY FOR CLIENT
        elements.put("cli_e_result", "//*[contains(@id, 'resId5::db')]/table/tbody/tr[1]/td[1]");
        elements.put("cli_e_result_no_data", "//*[contains(@id, 'resId5::db')]");
        elements.put("cli_n_records", "//*[contains(@id, 'pc5:ot30')]");
        elements.put("cli_b_show_toolbar", "//*[contains(@id, 'pc5:ot30')]");

        //HOTEL PRIORITY FOR CLIENT QUERY
        elements.put("cli_b_view", "//*[contains(@id, 'pc5:_vw')]"); //button View
        elements.put("cli_b_qbe", "//*[contains(@id, 'pc5:_qbeTbr')]"); //button QbE
        elements.put("cli_b_qbe_b_clear", "//*[contains(@id, 'pc5:resId5::ch::t')]/tbody/tr[2]/th/a"); //button QbE
        elements.put("cli_qbe_i_hotel_code", "//*[contains(@id, 'pc5_afr_resId5_afr_r5c2::content')]"); //add lov hotel_code button search
        elements.put("cli_qbe_i_client_code", "//*[contains(@id, 'pc5_afr_resId5_afr_r5c3::content')]"); //add lov hotel_code button search
        elements.put("cli_qbe_i_priority", "//*[contains(@id, '_afr_r5c5::content')]"); //add lov hotel_code result

        //HOTEL PRIORITY FOR CLIENT ADD
        elements.put("cli_b_add", "//*[contains(@id, 'pcgt23:boton_add')]"); //button add
        elements.put("cli_ss_add_b_save", "//*[contains(@id, 'pcgt23:btn_commitExit')]"); //button save
        elements.put("cli_ss_add_i_hotel_code", "//*[contains(@id, 'ItC10::content')]"); //add input hotel_code
        elements.put("cli_ss_add_lov_hotel_code", "//*[contains(@id, 'ItC10::lovIconId')]"); //add lov hotel_code
        elements.put("cli_ss_add_ss_hotel_code_i_code", "//*[contains(@id, 'ItC10::_afrLovInternalQueryId:value00::content')]"); //add lov hotel_code input hotel_code
        elements.put("cli_ss_add_ss_hotel_code_b_search", "//*[contains(@id, 'ItC10::_afrLovInternalQueryId::search')]"); //add lov hotel_code button search
        elements.put("cli_ss_add_ss_hotel_code_e_result", "//*[contains(@id, 'ItC10_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[1]"); //add lov hotel_code result
        elements.put("cli_ss_add_ss_hotel_code_b_ok", "//*[contains(@id, 'ItC10::lovDialogId::ok')]"); //add lov hotel_code button ok

        elements.put("cli_ss_add_i_client_code", "//*[contains(@id, 'itD10::content')]"); //add input client_code
        elements.put("cli_ss_add_lov_client_code", "//*[contains(@id, 'itD10::lovIconId')]"); //add lov client_code
        elements.put("cli_ss_add_ss_client_code_i_code", "//*[contains(@id, 'itD10::_afrLovInternalQueryId:value00::content')]"); //add lov client_code input client_code
        elements.put("cli_ss_add_ss_client_code_b_search", "//*[contains(@id, 'itD10::_afrLovInternalQueryId::search')]"); //add lov client_code button search
        elements.put("cli_ss_add_ss_client_code_e_result", "//*[contains(@id, 'itD10_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[1]"); //add lov client_code result
        elements.put("cli_ss_add_ss_client_code_b_ok", "//*[contains(@id, 'itD10::lovDialogId::ok')]"); //add lov client_code button ok


        elements.put("cli_click_e_search","//*[contains(@id, 'pc5:resId5::db')]/table/tbody/tr/td[1]");
        elements.put("cli_cli_e_noresult","//*[contains(@id, 'pc5:resId5::db')]");
        elements.put("cli_b_edit","//*[contains(@id, 'pc5:pcgt23:boton_edit')]");
        elements.put("cli_ss_edit_i_hotelId","//*[contains(@id, 'pc5:pcgt23:ItC10::content')]");
        elements.put("cli_ss_edit_i_priority","//*[contains(@id, 'pc5:pcgt23:it14::content')]");
        elements.put("cli_ss_edit_i_client","//*[contains(@id, 'pc5:pcgt23:itD10::content')]");
        elements.put("cli_b_cancel_edit","//*[contains(@id, 'pc5:pcgt23:boton_rollbackp')]");

        elements.put("cli_ss_add_i_des_hotel", "//*[contains(@id, 'pc5:pcgt23:it10::content')]"); //add input priority
        elements.put("cli_ss_add_i_destination", "//*[contains(@id, 'pc5:pcgt23:it11::content')]"); //add input priority
        elements.put("cli_ss_add_i_priority", "//*[contains(@id, 'it14::content')]"); //add input priority

        //HOTEL PRIORITY FOR CLIENT EDIT
        elements.put("cli_b_edit", "//*[contains(@id, 'pcgt23:boton_edit')]"); //button edit
        elements.put("cli_ss_edit_b_save", "//*[contains(@id, 'pc5:pcgt23:btn_commitExit')]"); //ss edit button save
        elements.put("hpc_ss_edit_i_priority", "//*[contains(@id, 'pcgt36:it8::content')]"); //ss edit input priority

        //HOTEL PRIORITY FOR CLIENT DELETE
        elements.put("cli_b_delete", "//*[contains(@id, 'pcgt23:boton_remove')]"); //button delete
        elements.put("cli_ss_delete_b_yes", "//*[contains(@id, 'pc5:pcgt23:cbt1')]");
        elements.put("cli_n_records", "//*[contains(@id, 'pc5:ot30')]"); //number of records retrieved

        //</editor-fold>

        //<editor-fold desc="FILTER BLOCK">
        elements.put("filter_i_country", "//*[contains(@id, '1:itE10::content')]");
        elements.put("filter_lov_country", "//*[contains(@id, '1:itE10::lovIconId')]");
        elements.put("filter_i_destination", "//*[contains(@id, '1:itG10::content')]");
        elements.put("filter_lov_destination", "//*[contains(@id, '1:itG10::lovIconId')]");
        elements.put("filter_i_client", "//*[contains(@id, '1:itH10::content')]");
        elements.put("filter_lov_client", "//*[contains(@id, '1:itH10::lovIconId')]");
        elements.put("filter_i_office", "//*[contains(@id, '1:itK10::content')]");
        elements.put("filter_lov_office", "//*[contains(@id, '1:itK10::lovIconId')]");
        elements.put("filter_lov_office_i_receptive", "//*[contains(@id, '_afrLovInternalQueryId:value30::content')]");
        elements.put("filter_b_aplicar_filtro", "//*[contains(@id, '1:cb1')]");
        elements.put("filter_b_priority", "//*[contains(@id, '1:cb2')]");
        elements.put("filter_b_hotel", "//*[contains(@id, '1:cb3')]");
        elements.put("general_priority_e_result_e_destination", "//*[contains(@id, 'pc3:resId3::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        //<editor-fold desc="PRIORITY OF HOTELS POP UP">
        elements.put("priority_hotels_b_close", "//*[contains(@id, '1:d1::close')]");
        elements.put("priority_hotels_b_qbe", "//*[contains(@id, '1:pc2:_qbeTbr')]");
        elements.put("priority_hotels_b_qbe_i_priority", "//*[contains(@id, 'pc2_afr_resId1_afr_rBCV1::content')]");
        elements.put("priority_hotels_b_qbe_i_hotel", "//*[contains(@id, 'pc2_afr_resId1_afr_reTa2::content')]");
        elements.put("priority_hotels_b_qbe_i_destination", "//*[contains(@id, 'pc2_afr_resId1_afr_rmV45::content')]");
        elements.put("priority_hotels_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("priority_hotels_table_result", "//*[contains(@id, 'pc2:resId1::db')]");
        elements.put("priority_hotels_e_result", "//*[contains(@id, 'pc2:resId1::db')]/table/tbody/tr[1]/td[1]");
        //</editor-fold>
        //<editor-fold desc="HOTEL PRIORITY FOR CLIENT POP UP">
        elements.put("hotel_priority_b_close", "//*[contains(@id, '1:d3::close')]");
        elements.put("hotel_priority_b_qbe", "//*[contains(@id, '1:pc1:_qbeTbr')]");
        elements.put("hotel_priority_b_qbe_i_priority", "//*[contains(@id, 'pc1_afr_resId2_afr_rC2c1::content')]");
        elements.put("hotel_priority_b_qbe_i_hotel", "//*[contains(@id, 'pc1_afr_resId2_afr_Bc2::content')]");
        elements.put("hotel_priority_b_qbe_i_destination", "//*[contains(@id, 'pc1_afr_resId2_afr_rA2c3::content')]");
        elements.put("hotel_priority_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("hotel_priority_table_result", "//*[contains(@id, 'pc1:resId2::db')]");
        elements.put("hotel_priority_e_result", "//*[contains(@id, 'pc1:resId2::db')]/table/tbody/tr[1]/td[1]");
        //</editor-fold>
        //</editor-fold>
    }
}
