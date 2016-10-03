package screen.AT2ACCSU0018;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 29/09/2016.
 */
public class AT2ACCSU0018Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0018Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //ADD

        elements.put("hotel_comments_add_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("hotel_comments_add_i_from", "//*[contains(@id, 'pcgt2:id5::content')]");
        elements.put("hotel_comments_add_i_to", "//*[contains(@id, 'pcgt2:id6::content')]");
        elements.put("hotel_comments_add_sl_date_type", "//*[contains(@id, 'pcgt2:soc2::content')]");
        elements.put("hotel_comments_add_e_to", "//*[contains(@id, 'pcgt2:it11::content')]");
        elements.put("hotel_comments_add_lov_to_desc", "//*[contains(@id, 'pcgt2:desTtoo1Id::lovIconId')]");
        elements.put("hotel_comments_add_i_to_desc", "//*[contains(@id, 'pcgt2:desTtoo1Id::content')]");
        elements.put("hotel_comments_add_lov_hotel", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
        elements.put("hotel_comments_add_i_hotel", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
        elements.put("hotel_comments_add_e_hotel_description", "//*[contains(@id, 'pcgt2:it9::content')]");
        elements.put("hotel_comments_add_lov_chain", "//*[contains(@id, 'pcgt2:codCadenaId::lovIconId')]");
        elements.put("hotel_comments_add_i_chain", "//*[contains(@id, 'pcgt2:codCadenaId::content')]");
        elements.put("hotel_comments_add_e_chain_description", "//*[contains(@id, 'pcgt2:it10::content')]");
        elements.put("hotel_comments_add_ch_send_hotel", "//*[contains(@id, 'pcgt2:sbc4::content')]");
        elements.put("hotel_comments_add_ch_voucher", "//*[contains(@id, 'pcgt2:sbc3::content')]");
        elements.put("hotel_comments_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");


        //SEARCH

        elements.put("hotel_comments_se_i_from", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("hotel_comments_se_i_to", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("hotel_comments_se_sl_date_type", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("hotel_comments_se_lov_hotel", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("hotel_comments_se_lov_hotel_i_seqhotel", "//*[contains(@id, 'qryId1:value30::_afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_comments_se_i_hotel", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("hotel_comments_se_lov_chain", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("hotel_comments_se_lov_chain_i_code", "//*[contains(@id, 'qryId1:value40::_afrLovInternalQueryId:value10::content')]");
        elements.put("hotel_comments_se_i_chain", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("hotel_comments_se_ch_send_hotel", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("hotel_comments_se_ch_voucher", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("hotel_comments_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("hotel_comments_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("hotel_comments_se_e_result", "//*[contains(@id, 'resId1::db')]/table/tbody/tr[1]/td[1]");


        //EDIT

        elements.put("hotel_comments_ed_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("hotel_comments_ed_i_from", "//*[contains(@id, 'pcgt2:id5::content')]");
        elements.put("hotel_comments_ed_i_to", "//*[contains(@id, 'pcgt2:id6::content')]");
        elements.put("hotel_comments_ed_sl_date_type", "//*[contains(@id, 'pcgt2:soc2::content')]");
        elements.put("hotel_comments_ed_e_to", "//*[contains(@id, 'pcgt2:it11::content')]");
        elements.put("hotel_comments_ed_lov_to_desc", "//*[contains(@id, 'pcgt2:desTtoo1Id::lovIconId')]");
        elements.put("hotel_comments_ed_i_to_desc", "//*[contains(@id, 'pcgt2:desTtoo1Id::content')]");
        elements.put("hotel_comments_ed_lov_hotel", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
        elements.put("hotel_comments_ed_i_hotel", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
        elements.put("hotel_comments_ed_e_hotel_description", "//*[contains(@id, 'pcgt2:it9::content')]");
        elements.put("hotel_comments_ed_lov_chain", "//*[contains(@id, 'pcgt2:codCadenaId::lovIconId')]");
        elements.put("hotel_comments_ed_i_chain", "//*[contains(@id, 'pcgt2:codCadenaId::content')]");
        elements.put("hotel_comments_ed_e_chain_description", "//*[contains(@id, 'pcgt2:it10::content')]");
        elements.put("hotel_comments_ed_ch_send_hotel", "//*[contains(@id, 'pcgt2:sbc4::content')]");
        elements.put("hotel_comments_ed_ch_voucher", "//*[contains(@id, 'pcgt2:sbc3::content')]");
        elements.put("hotel_comments_ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("hotel_comments_ed_lov_chain_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");


        //QBE

        elements.put("hotel_comments_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("hotel_comments_qbe_i_from", "//*[contains(@id, 'resId1:id2::content')]");
        elements.put("hotel_comments_qbei_to", "//*[contains(@id, 'resId1:id1::content')]");
        elements.put("hotel_comments_qbe_sl_date_type", "//*[contains(@id, 'resId1:soc3::content')]");
        elements.put("hotel_comments_qbe_to", "//*[contains(@id, 'afr_resId1_afr_c6::content')]");
        elements.put("hotel_comments_qbe_to_desc", "//*[contains(@id, 'afr_resId1_afr_c3::content')]");
        elements.put("hotel_comments_qbe_hotel", "//*[contains(@id, 'afr_resId1_afr_c9::content')]");
        elements.put("hotel_comments_qbe_hotel_description", "//*[contains(@id, 'afr_resId1_afr_c10::content')]");
        elements.put("hotel_comments_qbe_chain", "//*[contains(@id, 'afr_resId1_afr_c2::content')]");
        elements.put("hotel_comments_qbe_chain_description", "//*[contains(@id, 'afr_resId1_afr_c11::content')]");
        elements.put("hotel_comments_qbe_ch_send_hotel", "//*[contains(@id, 'resId1:soc4::content')]");
        elements.put("hotel_comments_qbe_ch_voucher", "//*[contains(@id, 'resId1:soc5::content')]");


        //OTHER ACTIONS

        elements.put("hotel_comments_oa_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hotel_comments_oa_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("hotel_comments_oa_b_aduit_data_ok", "//*[contains(@id, 'dia1::ok')]");
        elements.put("hotel_comments_oa_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE

        elements.put("hotel_comments_del_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("hotel_comments_del_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("hotel_comments_del_b_delete_b_ok", "//*[contains(@id, 'pc1:pcgt2:cbt1')]");


        //MULTI-LENGUAJE


        //ADD

        elements.put("multi_lenguaje_add_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("multi_lenguaje_add_i_lenguage", "//*[contains(@id, 'pcgt3:it12::content')]");
        elements.put("multi_lenguaje_add_i_remarks", "//*[contains(@id, 'pcgt3:it13::content')]");
        elements.put("multi_lenguaje_add_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");

        //SEARCH

        elements.put("multi_lenguaje_se_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("multi_lenguaje_se_i_lenaguage", "//*[contains(@id, 'afr_resId2_afr_c13::content')]");
        elements.put("multi_lenguaje_se_i_remarks", "//*[contains(@id, 'afr_resId2_afr_c12::content')]");

        //EDIT

        elements.put("multi_lenguaje_ed_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("multi_lenguaje_ed_i_lenguage", "//*[contains(@id, 'pcgt3:it12::content')]");
        elements.put("multi_lenguaje_ed_i_remarks", "//*[contains(@id, 'pcgt3:it13::content')]");
        elements.put("multi_lenguaje_ed_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");

        //OTHER ACTIONS

        elements.put("multi_lenguaje_oa_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("multi_lenguaje_oa_b_adit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("multi_lenguaje_oa_b_audit_data_b_ok", "//*[contains(@id, 'd2::ok')]");
        elements.put("multi_lenguaje_oa_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE

        elements.put("multi_lenguaje_del_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("multi_lenguaje_del_e_records", "//*[contains(@id, 'pc2:ot10')]");
        elements.put("multi_lenguaje_del_b_delete_b_yes", "//*[contains(@id, 'pcgt3:cbt1')]");


    }

}
