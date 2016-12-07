package screen.AT2MDMRM0037;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMRM0037Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0037Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE CAMPAING
         */
        //GENERALS
        elements.put("campaing_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("campaing_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("campaing_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("campaing_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("campaing_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("campaing_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("campaing_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("campaing_e_result", "//*[contains(@id, 'pc1:camp::db')]/table/tbody/tr[1]/td[1]");
        elements.put("campaing_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("campaing_rb_all", "//*[contains(@id, '1:sor4:_1')]");
        elements.put("campaing_b_delete_yes", "//*[contains(@id, 'pcgt2:cbt1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_campaign", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_sl_manual", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_ck_affect", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_ledger", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_ledger", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pc1:pcgt2:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pc1:pcgt2:codInterfaceId::lovIconId')]");
        elements.put("add_i_interface_desc", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_campaign", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_sl_manual", "//*[contains(@id, 'pc1:pcgt2:soc2::content')]");
        elements.put("add_ck_affect", "//*[contains(@id, 'pcgt2:sbc2::content')]");
        elements.put("add_i_ledger", "//*[contains(@id, 'pcgt2:numCtaBancaria1Id::content')]");
        elements.put("add_lov_ledger", "//*[contains(@id, 'pcgt2:numCtaBancaria1Id::lovIconId')]");
        //QBE
        elements.put("qbe_i_interface", "//*[contains(@id, 'camp_afr_c2::content')]");
        elements.put("qbe_i_interface_desc", "//*[contains(@id, 'camp_afr_c5::content')]");
        elements.put("qbe_i_campaign", "//*[contains(@id, 'camp_afr_c3::content')]");
        elements.put("qbe_i_name_ca", "//*[contains(@id, 'camp_afr_c4::content')]");
        elements.put("qbe_sl_manual", "//*[contains(@id, 'camp:soc3::content')]");
        elements.put("qbe_sl_affect", "//*[contains(@id, 'camp:soc4::content')]");
        elements.put("qbe_i_ledger", "//*[contains(@id, 'camp_afr_c6::content')]");
        /**
         * TABLE TRANSFER
         */
        //GENERALS
        elements.put("transfer_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("transfer_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("transfer_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        elements.put("transfer_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("transfer_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("transfer_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("transfer_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("transfer_e_result", "//*[contains(@id, 'pc2:vouch::db')]/table/tbody/tr[1]/td[1]");
        elements.put("transfer_e_records", "//*[contains(@id, 'pc2:ot7')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("add_i_voucher_nr", "//*[contains(@id, 'pcgt3:it23::content')]");
        elements.put("add_i_voucher_name", "//*[contains(@id, 'pcgt3:it21::content')]");
        elements.put("add_i_control", "//*[contains(@id, 'pcgt3:it19::content')]");
        elements.put("add_i_to", "//*[contains(@id, 'pcgt3:seqTtoo1Id::content')]");
        elements.put("add_lov_to", "//*[contains(@id, 'pcgt3:seqTtoo1Id::lovIconId')]");
        elements.put("add_i_begin_trip", "//*[contains(@id, 'pcgt3:id8::content')]");
        elements.put("add_i_end_trip", "//*[contains(@id, 'pcgt3:id7::content')]");
        elements.put("add_i_begin_voucher", "//*[contains(@id, 'pcgt3:id6::content')]");
        elements.put("add_i_end_voucher", "//*[contains(@id, 'pcgt3:id5::content')]");
        elements.put("add_i_associated_partner", "//*[contains(@id, 'pcgt3:seqAfiliadoId::content')]");
        elements.put("add_lov_associated_partner", "//*[contains(@id, 'pcgt3:seqAfiliadoId::lovIconId')]");
        elements.put("add_i_associated_desc", "//*[contains(@id, 'pcgt3:it20::content')]");
        elements.put("add_i_allot", "//*[contains(@id, 'pcgt3:it24::content')]");
        elements.put("add_i_availability", "//*[contains(@id, 'pcgt3:it26::content')]");
        elements.put("add_i_100x100", "//*[contains(@id, 'pcgt3:it17::content')]");
        elements.put("add_i_amount", "//*[contains(@id, 'pcgt3:it25::content')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pcgt3:codDivisaId::content')]");
        elements.put("add_lov_currency", "//*[contains(@id, 'pcgt3:codDivisaId::lovIconId')]");
        elements.put("add_i_mail", "//*[contains(@id, 'pcgt3:it18::content')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt3:empresaId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt3:empresaId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pcgt3:oficinaId::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pcgt3:oficinaId::lovIconId')]");
        elements.put("add_i_depart", "//*[contains(@id, 'pcgt3:departamentoId::content')]");
        elements.put("add_lov_depart", "//*[contains(@id, 'pcgt3:departamentoId::lovIconId')]");
        elements.put("add_i_notes", "//*[contains(@id, 'pcgt3:it22::content')]");
        //QBE
        elements.put("qbe_i_voucher_nr", "//*[contains(@id, 'vouch:it8::content')]");
        elements.put("qbe_i_voucher_name", "//*[contains(@id, 'vouch_afr_c14::content')]");
        elements.put("qbe_i_control", "//*[contains(@id, '_afr_vouch_afr_c24::content')]");
        elements.put("qbe_i_begin_trip", "//*[contains(@id, 'vouch:id4::content')]");
        elements.put("qbe_i_end_trip", "//*[contains(@id, 'vouch:id1::content')]");
        elements.put("qbe_i_begin_voucher", "//*[contains(@id, 'vouch:id3::content')]");
        elements.put("qbe_i_end_voucher", "//*[contains(@id, 'vouch:id2::content')]");
        elements.put("qbe_i_associated_partner", "//*[contains(@id, 'vouch:it2::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'vouch_afr_c22::content')]");
        elements.put("qbe_i_allot", "//*[contains(@id, 'vouch:it28::content')]");
        elements.put("qbe_i_availability", "//*[contains(@id, 'vouch:it30::content')]");
        elements.put("qbe_i_100x100", "//*[contains(@id, 'vouch:it31::content')]");
        elements.put("qbe_i_amount", "//*[contains(@id, 'vouch:it29::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'vouch_afr_c18::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'vouch_afr_c8::conten')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'vouch:it32::content')]");
        elements.put("qbe_i_depart", "//*[contains(@id, 'vouch_afr_c10::content')]");
    }
}
