package screen.AT2MDMOR0009;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 16/11/2016.
 */
public class AT2MDMOR0009Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0009Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //OFFICES E-MAIL
                elements.put("MDM_oe_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
                elements.put("MDM_oe_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_oe_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
                elements.put("MDM_oe_b_actions", "//*[contains(@id, 'pc1:pcgmc1:dc_m1')]");
                elements.put("MDM_oe_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgmc1:dc_cmi1')]/td[2]");
                elements.put("MDM_oe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_oe_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_oe_e_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_oe_e_records", "//*[contains(@id, 'pc1:ot2')]");
            //EMAILS
                elements.put("MDM_em_b_add", "//*[contains(@id, 'pc2:pcgt2:boton_add')]");
                elements.put("MDM_em_b_delete", "//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
                elements.put("MDM_em_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_em_b_edit", "//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
                elements.put("MDM_em_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_em_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_em_e_result", "//*[contains(@id, 'pc2:mailTab::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_em_e_records", "//*[contains(@id, 'pc2:ot13')]");
        //ADD|MODIFY
            //OFFICES E-MAIL
                elements.put("add_oe_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
                elements.put("add_oe_e_company", "//*[contains(@id, 'pcgt1:it16::content')]");
                elements.put("add_oe_e_company_description", "//*[contains(@id, 'pcgt1:it17::content')]");
                elements.put("add_oe_e_code", "//*[contains(@id, 'pcgt1:it18::content')]");
                elements.put("add_oe_e_code_description", "//*[contains(@id, 'pcgt1:it19::content')]");
                elements.put("add_oe_cb_one_suppl", "//*[contains(@id, 'pcgt1:sbc2::conten')]");
                elements.put("add_oe_i_payable_name", "//*[contains(@id, 'pcgt1:nomPagadero1Id::content')]");
                elements.put("add_oe_lov_payable_name", "//*[contains(@id, 'pcgt1:nomPagadero1Id::lovIconId')]");
                elements.put("add_oe_i_long_payable_name", "//*[contains(@id, 'pcgt1:nomPagaderoLargo1Id::content')]");
                elements.put("add_oe_lov_long_payable_name", "//*[contains(@id, 'pcgt1:nomPagaderoLargo1Id::lovIconId')]");
                elements.put("add_oe_i_ext_supplier_email", "//*[contains(@id, 'pc1:pcgt1:it13::content')]");
                elements.put("add_oe_i_hotelbeds_email", "//*[contains(@id, 'pc1:pcgt1:it14::content')]");
                elements.put("add_oe_i_suppliers_web_email", "//*[contains(@id, 'pcgt1:it12::content')]");
                elements.put("add_oe_i_groups_email", "//*[contains(@id, 'pcgt1:it9::content')]");
                elements.put("add_oe_i_warning_allot_email", "//*[contains(@id, 'pcgt1:it7::content')]");
                elements.put("add_oe_i_proforma_web_email", "//*[contains(@id, 'pcgt1:it11::content')]");
                elements.put("add_oe_i_hotelbeds_offer_email", "//*[contains(@id, 'pcgt1:it4::content')]");
                elements.put("add_oe_i_email_stop_sale_notification", "//*[contains(@id, 'pcgt1:it5::content')]");
                elements.put("add_oe_i_email_grace_period_expenses", "//*[contains(@id, 'pcgt1:it8::content')]");
                elements.put("add_oe_i_mail_sender_to_hotel", "//*[contains(@id, 'pcgt1:it15::content')]");
                elements.put("add_oe_i_mail_sender_to_OS_suppl", "//*[contains(@id, 'pcgt1:it6::content')]");
                elements.put("add_oe_i_transfers_email", "//*[contains(@id, 'pcgt1:it10::content')]");
                elements.put("add_oe_i_change_GPS_zone_email", "//*[contains(@id, 'pcgt1:it35::content')]");
                elements.put("add_oe_i_ext_supp_phone", "//*[contains(@id, 'pcgt1:it3::content')]");
            //EMAILS
                elements.put("add_em_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");
                elements.put("add_em_i_mail_type", "//*[contains(@id, 'pc2:pcgt2:gtmaCodTipoMailId::content')]");
                elements.put("add_em_lov_mail_type", "//*[contains(@id, 'pc2:pcgt2:gtmaCodTipoMailId::lovIconId')]");
                elements.put("add_em_e_mail_type_description", "//*[contains(@id, 'pc2:pcgt2:it33::content')]");
                elements.put("add_em_i_business", "//*[contains(@id, 'pc2:pcgt2:codAgrdivId::content')]");
                elements.put("add_em_lov_business", "//*[contains(@id, 'pc2:pcgt2:codAgrdivId::lovIconId')]");
                elements.put("add_em_e_business_description", "//*[contains(@id, 'pc2:pcgt2:it34::content')]");
                elements.put("add_em_i_mail_address", "//*[contains(@id, 'pc2:pcgt2:it2::content')]");
        //SEARCH
            elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
            elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
            elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
            elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
            elements.put("search_i_company_description", "//*[contains(@id, 'qryId1:value10::content')]");
            elements.put("search_i_code", "//*[contains(@id, 'qryId1:value20::content')]");
            elements.put("search_lov_code", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
            elements.put("search_i_code_description", "//*[contains(@id, 'qryId1:value30::content')]");
            elements.put("search_cb_one_suppl", "//*[contains(@id, 'qryId1:value40::content')]");
            elements.put("search_i_payable_name", "//*[contains(@id, 'qryId1:value50::content')]");
            elements.put("search_lov_payable_name", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
            elements.put("search_i_long_payable_name", "//*[contains(@id, 'qryId1:value60::content')]");
            elements.put("search_lov_long_payable_name", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
            //valores del primer resultado
           /* elements.put("search_e_company_result", "/*//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
            elements.put("search_e_company_description_result", "/*//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
            elements.put("search_e_code_result", "/*//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
            elements.put("search_e_code_description_result", "/*//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
            elements.put("search_e_one_suppl_result", "/*//*[contains(@id, 'pc1:ofceml1:0:sbc1::content')]/span/img");
            elements.put("search_e_payable_name_result", "/*//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
            elements.put("search_e_long_payable_name_result", "/*//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");*/
            //valores del tercer resultado que utilizamos para que la búsqueda funcione
            elements.put("search_e_company_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]");
            elements.put("search_e_company_description_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[2]");
            elements.put("search_e_code_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]");
            elements.put("search_e_code_description_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[4]");
            elements.put("search_e_one_suppl_result", "//*[contains(@id, 'pc1:ofceml1:2:sbc1::content')]/span/img");
            elements.put("search_e_payable_name_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[6]");
            elements.put("search_e_long_payable_name_result", "//*[contains(@id, 'pc1:ofceml1::db')]/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[7]");
        //QBE
            //OFFICES E-MAIL
                elements.put("qbe_oe_i_company", "//*[contains(@id, 'afr_pc1_afr_ofceml1_afr_c3::content')]");
                elements.put("qbe_oe_i_company_description", "//*[contains(@id, 'afr_pc1_afr_ofceml1_afr_c4::content')]");
                elements.put("qbe_oe_i_code", "//*[contains(@id, 'pc1:ofceml1:it1::content')]");
                elements.put("qbe_oe_i_code_description", "//*[contains(@id, 'afr_pc1_afr_ofceml1_afr_c6::content')]");
                elements.put("qbe_oe_sl_one_suppl", "//*[contains(@id, 'pc1:ofceml1:socf4::content')]");
                elements.put("qbe_oe_i_payable_name", "//*[contains(@id, 'afr_pc1_afr_ofceml1_afr_c2::content')]");
                elements.put("qbe_oe_i_long_payable_name", "//*[contains(@id, 'afr_pc1_afr_ofceml1_afr_c1::content')]");
            //EMAILS
                elements.put("qbe_em_i_mail_type", "//*[contains(@id, 'afr_pc2_afr_mailTab_afr_c10::content')]");
                elements.put("qbe_em_i_mail_type_description", "//*[contains(@id, 'afr_pc2_afr_mailTab_afr_c12::content')]");
                elements.put("qbe_em_i_business", "//*[contains(@id, 'afr_pc2_afr_mailTab_afr_c9::content')]");
                elements.put("qbe_em_i_business_description", "//*[contains(@id, 'afr_pc2_afr_mailTab_afr_c8::content')]");
                elements.put("qbe_em_i_mail_address", "//*[contains(@id, 'afr_pc2_afr_mailTab_afr_c11::content')]");
    }
}
