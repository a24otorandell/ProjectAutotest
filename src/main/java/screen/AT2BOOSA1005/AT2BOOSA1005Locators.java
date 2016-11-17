package screen.AT2BOOSA1005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 17/11/2016.
 */
public class AT2BOOSA1005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA1005Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

        //SEARCH RECEPTIVE

        elements.put("booking_reconfirmations_management_sr_lov_receptive","//*[contains(@id, 'receptiveId::lovIconId')]");
        elements.put("booking_reconfirmations_management_sr_lov_receptive_i_receptive","//*[contains(@id, 'receptiveId::_afrLovInternalQueryId:value00::content')]");
        elements.put("booking_reconfirmations_management_sr_i_receptive","//*[contains(@id, 'receptiveId::content')]");

        //SEARCH GENERAL
        elements.put("booking_reconfirmations_management_se_manage_call_registrers_pop_up","//*[contains(@id, 'pc1:t1:22:cb2::icon')]");
        elements.put("booking_reconfirmations_management_se_manage_call_registrers_pop_up_i_call_date","//*[contains(@id, 'id13::content')]");
        elements.put("booking_reconfirmations_management_se_manage_call_registrers_pop_upi_contact_i_concatact","//*[contains(@id, 'it7::content')]");
        elements.put("booking_reconfirmations_management_se_manage_call_registrers_pop_up_comments","//*[contains(@id, ':it8::content')]");
        elements.put("booking_reconfirmations_management_se_manage_call_registrers_pop_up_position_of_contact","//*[contains(@id, 'it13::content')]");
        elements.put("booking_reconfirmations_management_se_manage_call_registrers_pop_up_b_save","//*[contains(@id, 'pcgt2:boton_commit')]");
        elements.put("booking_reconfirmations_management_se_i_booking_ref","//*[contains(@id, 'it2::content')]");
        elements.put("booking_reconfirmations_management_se_i_booking_start_date","//*[contains(@id, 'id7::content')]");
        elements.put("booking_reconfirmations_management_se_i_booking_end_date","//*[contains(@id, 'id8::content')]");
        elements.put("booking_reconfirmations_management_se_i_stay_date_from","//*[contains(@id, 'id1::content')]");
        elements.put("booking_reconfirmations_management_se_i_stay_date_to","//*[contains(@id, 'id5::content')]");
        elements.put("booking_reconfirmations_management_se_i_creatrion_date_from","//*[contains(@id, 'id2::content')]");
        elements.put("booking_reconfirmations_management_se_i_creation_date_to","//*[contains(@id, 'id15::content')]");
        elements.put("booking_reconfirmations_management_se_i_reconf_date_from","//*[contains(@id, 'id4::content')]");
        elements.put("booking_reconfirmations_management_se_i_reconf_date_to","//*[contains(@id, 'id16::content')]");
        elements.put("booking_reconfirmations_management_se_i_sending_date_from","//*[contains(@id, 'id6::content')]");
        elements.put("booking_reconfirmations_management_se_i_sending_date_to","//*[contains(@id, 'id3::content')]");
        elements.put("booking_reconfirmations_management_se_lov_hotel","//*[contains(@id, 'hotelId::lovIconId')]");
        elements.put("booking_reconfirmations_management_se_lov_hotel_i_hotel_code","//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("booking_reconfirmations_management_se_i_hotel","//*[contains(@id, 'hotelId::content')]");
        elements.put("booking_reconfirmations_management_se_multilov_destination","//*[contains(@id, 'msilov1:dc_ctb1::icon')]");
        elements.put("booking_reconfirmations_management_se_multilov_zone","//*[contains(@id, 'msilov2:dc_ctb1::icon')]");
        elements.put("booking_reconfirmations_management_se_sl_booking_status","//*[contains(@id, 'soc1::content')]");
        elements.put("booking_reconfirmations_management_se_sl_conf_estatus","//*[contains(@id, 'smc1::drop')]");
        elements.put("booking_reconfirmations_management_se_sl_conf_status_all","//*[contains(@id, 'smc1::saId')]");
        elements.put("booking_reconfirmations_management_se_i_confirmation_ref","//*[contains(@id, 'it1::content')]");
        elements.put("booking_reconfirmations_management_se_i_booking_amount","//*[contains(@id, 'it4::content')]");
        elements.put("booking_reconfirmations_management_se_lov_to","//*[contains(@id, '1:ttooId::lovIconId')]");
        elements.put("booking_reconfirmations_management_se_lov_to_i_seq_tto","//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("booking_reconfirmations_management_se_lov_to_i_ttoo_name","//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("booking_reconfirmations_management_se_i_to","//*[contains(@id, '1:ttooId::content')]");
        elements.put("booking_reconfirmations_management_se_lov_premium","//*[contains(@id, 'premiumId::lovIconId')]");
        elements.put("booking_reconfirmations_management_se_lov_premium_i_code","//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("booking_reconfirmations_management_se_lov_premium_i_description","//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("booking_reconfirmations_management_se_i_premium","//*[contains(@id, 'premiumId::content')]");
        elements.put("booking_reconfirmations_management_se_sl_bms","//*[contains(@id, 'soc2::content')]");
        elements.put("booking_reconfirmations_management_se_sl_integration","//*[contains(@id, 'soc3::content')]");
        elements.put("booking_reconfirmations_management_se_lov_staff_member","//*[contains(@id, 'staffMemberId::lovIconId')]");
        elements.put("booking_reconfirmations_management_se_lov_staff_member_i_code","//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("booking_reconfirmations_management_se_lov_staff_member_i_user","//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("booking_reconfirmations_management_se_i_staff_member","//*[contains(@id, 'staffMemberId::content')]");
        elements.put("booking_reconfirmations_management_se_b_search","//*[contains(@id, '1:cb1')]");
        elements.put("booking_reconfirmations_management_se_e_record","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");


        //RESULTS
        elements.put("booking_reconfirmations_management_re_e_atlas_co","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("booking_reconfirmations_management_re_e_atlas_office","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("booking_reconfirmations_management_re_e_incoming_office","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("booking_reconfirmations_management_re_e_booking_ref","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("booking_reconfirmations_management_re_e_hotel_code","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("booking_reconfirmations_management_re_e_hotel","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
        elements.put("booking_reconfirmations_management_re_e_name","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
        elements.put("booking_reconfirmations_management_re_e_arrival","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[9]");
        elements.put("booking_reconfirmations_management_re_e_departure","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[10]");
        elements.put("booking_reconfirmations_management_re_e_last_minute","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[11]");
        elements.put("booking_reconfirmations_management_re_e_confirmation_no","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[12]");
        elements.put("booking_reconfirmations_management_re_e_status","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[13]");
        elements.put("booking_reconfirmations_management_re_e_send_client","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[14]");
        elements.put("booking_reconfirmations_management_re_e_denied_obs","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[15]");
        elements.put("booking_reconfirmations_management_re_e_conf_method","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[16]");
        elements.put("booking_reconfirmations_management_re_e_no_of_sendings","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[17]");
        elements.put("booking_reconfirmations_management_re_e_to","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[18]");
        elements.put("booking_reconfirmations_management_re_e_staff_member","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[19]");
        elements.put("booking_reconfirmations_management_re_e_value","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[20]");
        elements.put("booking_reconfirmations_management_re_e_hotel_phone","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[21]");
        elements.put("booking_reconfirmations_management_re_e_hotel_mail","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[22]");
        elements.put("booking_reconfirmations_management_re_e_fax","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[23]");
        elements.put("booking_reconfirmations_management_re_e_selecct_all","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[24]");


        //QBE
        elements.put("booking_reconfirmations_management_qbe_i_atlas_co","//*[contains(@id, 'pc1_afr_t1_afr_c1::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c14::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c15::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c20::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c21::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c12::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c3::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1:t1:id10::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1:t1:id12::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c6::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");
        elements.put("booking_reconfirmations_management_qbe_","//*[contains(@id, '");


    }
}
