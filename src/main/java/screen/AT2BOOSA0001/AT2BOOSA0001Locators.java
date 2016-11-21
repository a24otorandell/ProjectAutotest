package screen.AT2BOOSA0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2BOOSA0001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA0001Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

         //ADVANCED SEARCH

        elements.put("advanced_search_ch_client", "//*[contains(@id, 'gttoSeqTtooId::lovIconId')]");
        elements.put("advanced_search_lov_client", "//*[contains(@id, 'gttoSeqTtooId::dropdownPopup::popupsearch')]");
        elements.put("advanced_search_lov_client_i_client", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("advanced_search_i_client", "//*[contains(@id, 'gttoSeqTtooId::content')]");
        elements.put("advanced_search_lov_interface", "//*[contains(@id, 'bookingInterfaceId::lovIconId')]");
        elements.put("advanced_search_lov_interface_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("advanced_search_sl_crc", "//*[contains(@id, 'soc6::content')]");
        elements.put("advanced_search_i_client_reference", "//*[contains(@id, 'it12::content')]");
        elements.put("advanced_search_", "//*[contains(@id, 'bookingInterfaceId::content')]");
        elements.put("advanced_search_i_interface", "//*[contains(@id, 'bookingInterfaceId::content')]");
        elements.put("advanced_search_i_interface", "//*[contains(@id, 'bookingInterfaceId::content')]");






          // SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'dyntdc:r1:1:cb3')]");
        elements.put("search_i_creation", "//*[contains(@id, 'r1:1:id4::content')]");
        elements.put("search_i_from", "//*[contains(@id, 'r1:1:id3::content')]");
        elements.put("search_i_to", "//*[contains(@id, 'r1:1:id6::content')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'grecSeqRecId::content')]");
        elements.put("search_lov_receptive", "//*[contains(@id, 'grecSeqRecId::lovIconId')]");

        elements.put("search_i_interface", "//*[contains(@id, 'bookingInterfaceId::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'bookingInterfaceId::lovIconId')]");
        elements.put("search_i_interface_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'nomCortoNomHotId::content')]");
        elements.put("search_i_cancellation_date", "//*[contains(@id, 'id2::content')]");


        // ADVANCED SEARCH
        elements.put("search_b_advanced_search", "//*[contains(@id, 'dyntdc:r1:1:cb2')]");
        elements.put("advanced_search_b_show", "//*[contains(@id, 'pb3::_afrDscl')]");
        elements.put("advanced_search_sel_cancelled", "//*[contains(@id, 'soc5::content')]");


        //SIMPLE SEARACH
        elements.put("query_lov_receptive", "//*[contains(@id, '1:grecSeqRecId::lovIconId')]");
        elements.put("query_lov_i_receptive", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("query_simple_i_receptive", "//*[contains(@id, '1:grecSeqRecId::content')]");
        elements.put("query_simple_i_creation_date", "//*[contains(@id, '1:id4::content')]");
        elements.put("query_b_search", "//*[contains(@id, '1:cb3')]");
        elements.put("query_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("query_e_result_real", "pc1:t1::db')]");
        elements.put("query_b_reset", "1:cb4')]");


        // QUERY


        elements.put("query_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");

        elements.put("query_i_receptive", "//*[contains(@id, 'pc1_afr_t1_afr_c17::content')]");
        elements.put("query_i_atlas_company", "//*[contains(@id, '_afr_t1_afr_c37::content')]");
        elements.put("query_i_atlas_office", "//*[contains(@id, '_afr_t1_afr_c16::content')]");
        elements.put("query_i_booking_reference", "//*[contains(@id, '_afr_t1_afr_c30::content')]");
        elements.put("query_i_creation_date", "//*[contains(@id, 'pc1:t1:id14::content')]");
        elements.put("query_i_client", "//*[contains(@id, '_afr_t1_afr_c43::content')]");
        elements.put("query_i_branch", "//*[contains(@id, '_afr_t1_afr_c23::content')]");
        elements.put("query_i_crc", "//*[contains(@id, '_afr_t1_afr_c31::content')]");
        elements.put("query_i_pax_name", "//*[contains(@id, '_afr_t1_afr_c36::content')]");
        elements.put("query_i_adults", "//*[contains(@id, '_afr_t1_afr_c48::content')]");
        elements.put("query_i_children", "//*[contains(@id, '_afr_t1_afr_c22::content')]");
        elements.put("query_i_babies", "//*[contains(@id, '_afr_t1_afr_c59::content')]");
        elements.put("query_i_hotel_code", "//*[contains(@id, '_afr_t1_afr_c46::content')]");
        elements.put("query_i_first_hotel", "//*[contains(@id, '_afr_t1_afr_c56::content')]");
        elements.put("query_i_arrival_booking", "//*[contains(@id, 'pc1:t1:id12::content')]");
        elements.put("query_i_departure_booking", "//*[contains(@id, 'pc1:t1:id19::content')]");
        elements.put("query_i_hotel_send", "//*[contains(@id, 'pc1:t1:id20::content')]");
        elements.put("query_i_client_reference", "//*[contains(@id, '_afr_t1_afr_c39::content')]");
        elements.put("query_i_interface", "//*[contains(@id, '_afr_t1_afr_c28::content')]");
        elements.put("query_i_booking_status", "//*[contains(@id, '_afr_t1_afr_c15::content')]");
        elements.put("query_i_description", "//*[contains(@id, '_afr_t1_afr_c4::content')]");
        elements.put("query_i_canrec_status", "//*[contains(@id, '_afr_t1_afr_c54::content')]");
        elements.put("query_i_canrec_description", "//*[contains(@id, '_afr_t1_afr_c29::content')]");
        elements.put("query_i_invoiced_company", "//*[contains(@id, '_afr_t1_afr_c18::content')]");
        elements.put("query_i_cost", "//*[contains(@id, '_afr_t1_afr_c38::content')]");
        elements.put("query_i_sale", "//*[contains(@id, '_afr_t1_afr_c10::content')]");
        elements.put("query_i_profit", "//*[contains(@id, '_afr_t1_afr_c11::content')]");
        elements.put("query_i_profitability", "//*[contains(@id, '_afr_t1_afr_c24::content')]");
        elements.put("query_i_currency", "//*[contains(@id, '_afr_t1_afr_c53::content')]");
        elements.put("query_i_bm", "//*[contains(@id, 'selectOneChoice12::content')]");
        elements.put("query_i_bco", "//*[contains(@id, 't1:soc29::content')]");
        elements.put("query_i_ticket_number", "//*[contains(@id, '_afr_t1_afr_c3::content')]");
        elements.put("query_i_room", "//*[contains(@id, '_afr_t1_afr_c1::content')]");
        elements.put("query_i_type_of_room", "//*[contains(@id, '_afr_t1_afr_c5::content')]");
        elements.put("query_i_cancellation_date", "//*[contains(@id, 'pc1:t1:id15::content')]");
        elements.put("query_i_cancellation_fee_date", "//*[contains(@id, 'pc1:t1:id13::content')]");
        elements.put("query_i_auto_cancellation_date_time", "//*[contains(@id, 'pc1:t1:id11::content')]");
        elements.put("query_i_client_code", "//*[contains(@id, '_afr_t1_afr_c44::content')]");
        elements.put("query_i_customer", "//*[contains(@id, '_afr_t1_afr_c7::content')]");
        elements.put("query_i_sap_client_code", "//*[contains(@id, '_afr_t1_afr_c8::content')]");
        elements.put("query_i_destination", "//*[contains(@id, '_afr_t1_afr_c58::content')]");
        elements.put("query_i_country_market", "//*[contains(@id, '_afr_t1_afr_c55::content')]");
        elements.put("query_i_paid", "//*[contains(@id, 't1:soc351::content')]");
        elements.put("query_i_invoiced", "//*[contains(@id, 't1:soc31::content')]");
        elements.put("query_i_multi_destination", "//*[contains(@id, 't1:soc32::content')]");
        elements.put("query_i_transfer", "//*[contains(@id, 't1:soc33::content')]");
        elements.put("query_i_retailer", "//*[contains(@id, 't1:soc34::content')]");
        elements.put("query_i_refundable", "//*[contains(@id, 't1:soc35::content')]");
        elements.put("query_i_excluded_cancellation_process", "//*[contains(@id, '_afr_t1_afr_c14::content')]");
        elements.put("query_i_error_message", "//*[contains(@id, '_afr_t1_afr_c50::content')]");
        elements.put("query_i_n_attempts", "//*[contains(@id, '_afr_t1_afr_c57::content')]");
        elements.put("query_i_cancellation_reason", "//*[contains(@id, 'pc1:t1:soc30::content')]");
        elements.put("query_i_booking_type", "//*[contains(@id, '_afr_t1_afr_c60::content')]");
        elements.put("query_i_contract_code", "//*[contains(@id, '_afr_t1_afr_c62::content')]");
        elements.put("query_i_contract_name", "//*[contains(@id, '_afr_t1_afr_c61::content')]");






        // TOOLBAR
        elements.put("tb_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]/div/table/tbody/tr/td[3]/div");
        elements.put("tb_b_audit", "//*[contains(@id, 'pc1:pcgm2:dc_cmi0')]/td[2]");
        elements.put("tb_b_detach", "//*[contains(@id, 'dyntdc:r1:1:pc1:_dchTbr')]");

        // RESULT
        elements.put("result_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("result_n_records", "//*[contains(@id, 'pc1:outputText2')]");

        elements.put("result_e_receptive", "//*[contains(@id, 'ot50::content')]");
        elements.put("result_e_atlas_company", "//*[contains(@id, 'ot40::content')]");
        elements.put("result_e_atlas_office", "//*[contains(@id, 'ot36::content')]");
        elements.put("result_e_booking_reference", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("result_e_creation_date", "//*[contains(@id, 'ot16::content')]");
        elements.put("result_e_client", "//*[contains(@id, 'ot23::content')]");
        elements.put("result_e_branch", "//*[contains(@id, 'ot45::content')]");
        elements.put("result_e_crc", "//*[contains(@id, 'ot42::content')]");
        elements.put("result_e_pax_name", "//*[contains(@id, 'ot20::content')]");
        elements.put("result_e_adults", "//*[contains(@id, 'ot24::content')]");
        elements.put("result_e_children", "//*[contains(@id, 'ot63::content')]");
        elements.put("result_e_babies", "//*[contains(@id, 'ot49::content')]");
        elements.put("result_e_hotel_code", "//*[contains(@id, 'ot29::content')]");
        elements.put("result_e_first_hotel", "//*[contains(@id, 'ot19::content')]");
        elements.put("result_e_arrival_booking", "//*[contains(@id, 'ot21::content')]");
        elements.put("result_e_departure_booking", "//*[contains(@id, 'ot55::content')]");
        elements.put("result_e_hotel_send", "//*[contains(@id, 'ot7')]");

        elements.put("result_e_client_reference", "//*[contains(@id, 'ot47::content')]");
        elements.put("result_e_interface", "//*[contains(@id, 'ot1::content')]");
        elements.put("result_e_booking_status", "//*[contains(@id, 'ot48::content')]");
        elements.put("result_e_description", "//*[contains(@id, 'ot30::content')]");
        elements.put("result_e_canrec_status", "//*[contains(@id, 'ot53::content')]");
        elements.put("result_e_canrec_description", "//*[contains(@id, 'ot34::content')]");
        elements.put("result_e_invoiced_company", "//*[contains(@id, 'ot3::content')]");
        elements.put("result_e_cost", "//*[contains(@id, 'ot26::content')]");
        elements.put("result_e_sale", "//*[contains(@id, 'ot2::content')]");
        elements.put("result_e_profit", "//*[contains(@id, 'ot12::content')]");
        elements.put("result_e_profitability", "//*[contains(@id, 'ot46::content')]");
        elements.put("result_e_currency", "//*[contains(@id, 'ot38::content')]");

        elements.put("result_e_bm", "//*[contains(@id, 'sbc2::content')]/span/img");
        elements.put("result_e_bco", "//*[contains(@id, 'sbc3::content')]/span/img");
        elements.put("result_e_ticket_number", "//*[contains(@id, 'ot57::content')]");
        elements.put("result_e_room", "//*[contains(@id, 'ot4::content')]");
        elements.put("result_e_type_of_room", "//*[contains(@id, 'ot6::content')]");
        elements.put("result_e_cancellation_date", "//*[contains(@id, 'ot5::content')]");
        elements.put("result_e_cancellation_fee_date", "//*[contains(@id, 'ot61::content')]");
        elements.put("result_e_auto_cancellation_date_time", "//*[contains(@id, 'ot10')]");
        elements.put("result_e_client_code", "//*[contains(@id, 'ot33::content')]");
        elements.put("result_e_customer", "//*[contains(@id, 'ot28::content')]");
        elements.put("result_e_sap_client_code", "//*[contains(@id, 'ot9::content')]");
        elements.put("result_e_destination", "//*[contains(@id, 'ot8::content')]");
        elements.put("result_e_country_market", "//*[contains(@id, 'ot31::content')]");
        elements.put("result_e_paid", "//*[contains(@id, 'sbc4::content')]/span/img");
        elements.put("result_e_invoiced", "//*[contains(@id, 'sbc5::content')]/span/img");
        elements.put("result_e_multi_destination", "//*[contains(@id, 'sbc6::content')]/span/img");
        elements.put("result_e_transfer", "//*[contains(@id, 'sbc7::content')]/span/img");
        elements.put("result_e_retailer", "//*[contains(@id, 'sbc8::content')]/span/img");
        elements.put("result_e_refundable", "//*[contains(@id, 'sbc9::content')]/span/img");
        elements.put("result_e_excluded_cancellation_process", "//*[contains(@id, 'ot11')]");
        elements.put("result_e_error_message", "//*[contains(@id, 'ot35::content')]");
        elements.put("result_e_n_attempts", "//*[contains(@id, 'ot32::content')]");
        elements.put("result_e_cancellation_reason", "//*[contains(@id, 'soc9::content')]");
        elements.put("result_e_booking_type", "//*[contains(@id, 'ot39::content')]");
        elements.put("result_e_contract_code", "//*[contains(@id, 'ot37::content')]");
        elements.put("result_e_contract_name", "//*[contains(@id, 'ot41::content')]");

/*
        elements.put("result_e_client", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("result_e_branch", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
        elements.put("result_e_crc", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
        elements.put("result_e_pax_name", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[9]");
        elements.put("result_e_adults", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[10]");
        elements.put("result_e_children", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[11]");
        elements.put("result_e_babies", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[12]");
        elements.put("result_e_hotel_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[13]");
        elements.put("result_e_first_hotel", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[14]");
        elements.put("result_e_arrival_booking", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[15]");
        elements.put("result_e_departure_booking", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[16]");
        elements.put("result_e_hotel_send", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[17]");
        elements.put("result_e_client_reference", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[18]");
        elements.put("result_e_interface", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[19]");
        elements.put("result_e_booking_status", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[20]");
        elements.put("result_e_description", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[21]");
        elements.put("result_e_canrec_status", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[22]");
        elements.put("result_e_canrec_description", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[23]");
        elements.put("result_e_invoiced_company", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[24]");
        elements.put("result_e_cost", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[25]");
        elements.put("result_e_sale", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[26]");
        elements.put("result_e_profit", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[27]");
        elements.put("result_e_profitability", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[28]");
        elements.put("result_e_currency", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[28]");
        elements.put("result_e_bm", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[29]");
        elements.put("result_e_bco", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[30]");
        elements.put("result_e_ticket_number", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[31]");
        elements.put("result_e_room", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[32]");
        elements.put("result_e_type_of_room", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[33]");
        elements.put("result_e_cancellation_date", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[34]");
        elements.put("result_e_cancellation_fee_date", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[35]");
        elements.put("result_e_auto_cancellation_date_time", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[36]");
        elements.put("result_e_client_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[37]");
        elements.put("result_e_customer", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[38]");
        elements.put("result_e_sap_client_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[39]");
        elements.put("result_e_destination", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[40]");
        elements.put("result_e_country_market", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[41]");
        elements.put("result_e_paid", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[42]");
        elements.put("result_e_invoiced", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[43]");
        elements.put("result_e_multi_destination", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[44]");
        elements.put("result_e_transfer", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[45]");
        elements.put("result_e_retailer", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[46]");
        elements.put("result_e_refundable", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[47]");
        elements.put("result_e_excluded_cancellation_process", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[48]");
        elements.put("result_e_error_message", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[49]");
        elements.put("result_e_n_attempts", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[50]");
        elements.put("result_e_cancellation_reason", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[51]");
        elements.put("result_e_booking_type", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[52]");
        elements.put("result_e_contract_code", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[53]");
        elements.put("result_e_contract_name", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[54]");
*/
    }

    }

