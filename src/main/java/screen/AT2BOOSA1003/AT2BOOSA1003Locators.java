package screen.AT2BOOSA1003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 15/07/2016
 * @see Map
 */
public class AT2BOOSA1003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA1003Locators() {
        setElements();
    }

    /**
     * Gets the elements that are a Map of two strings
     *
     * @return Map{String,String}
     */
    public Map<String, String> getElements() {
        return elements;
    }

    /**
     * Sets the elements with an element_reference as first string and a xpath for the second
     * This elements are the ones that will we used in the test
     */
    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        /* GENERAL */
        elements.put("general_b_generate_estimation", "//*[contains(@id, 'pt1:dyntdc:r1:1:cl1')]");
        elements.put("general_b_cancel_estimation", "//*[contains(@id, 'pt1:dyntdc:r1:1:cl2')]");
        elements.put("general_lov_booking", "//*[contains(@id, 'pt1:dyntdc:r1:1:cb2::icon')]");
        elements.put("general_i_booking", "//*[contains(@id, 'pt1:dyntdc:r1:1:it4::content')]");
        elements.put("general_lov_booking_i_receptive", "//*[contains(@id, 'it19::content')]");
        elements.put("general_lov_booking_i_locator", "//*[contains(@id, 'it25::content')]");
        elements.put("general_lov_booking_b_search", "//*[contains(@id, 'cb1')]");

        elements.put("general_i_ad", "//*[contains(@id, 'it14::content')]");
        elements.put("general_i_ch", "//*[contains(@id, 'it6:content')]");
        elements.put("general_i_inf", "//*[contains(@id, 'it7::content')]");

        elements.put("general_b_select_date", "//*[contains(@id, 'id4::glyph')]");
        elements.put("general_b_return_to_booking", "//*[contains(@id, 'cl3')]");

        elements.put("general_original_booking_e_total", "//*[contains(@id, 'pgl33')]/tbody/tr/td[3]/span");
        elements.put("general_booking_estimation_e_total", "//*[contains(@id, 'pgl32')]/tbody/tr/td[3]/span");

        elements.put("general_b_save_changes_to_booking", "//*[contains(@id, 'cb4')]");
        elements.put("general_b_save_changes_to_booking_e_info", "//*[contains(@id, 'doc0::msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("general_b_save_changes_to_booking_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("general_b_cancel_changes", "//*[contains(@id, 'cb3')]");

        /* TABS */
        elements.put("general_e_sales_hotel", "//*[contains(@id, 'sdi1::disAcr')]");
        elements.put("general_e_transfers", "//*[contains(@id, 'sdi2::disAcr')]");

        /* SALES HOTEL RECORDS */
        elements.put("sales_hotel_e_num_records", "//*[contains(@id, 'pc1:t12::oc')]/table/tbody/tr/td[3]");

        elements.put("sales_hotel_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");

        elements.put("sales_hotel_b_add_i_start_date", "//*[contains(@id, ':id1::content')]");
        elements.put("sales_hotel_b_add_i_nights", "//*[contains(@id, ':it1::content')]");
        elements.put("sales_hotel_b_add_i_end_date", "//*[contains(@id, ':id3::content')]");
        elements.put("sales_hotel_b_add_lov_hotel", "//*[contains(@id, ':transNomHotelId::lovIconId')]");
        elements.put("sales_hotel_b_add_i_hotel", "//*[contains(@id, ':transNomHotelId::content')]");
        elements.put("sales_hotel_b_add_i_contract", "//*[contains(@id, ':it3::content')]");
        elements.put("sales_hotel_b_add_b_contract", "//*[contains(@id, ':cb3')]");
        elements.put("sales_hotel_b_add_i_units", "//*[contains(@id, ':it2::content')]");
        elements.put("sales_hotel_b_add_lov_room", "//*[contains(@id, ':transGthaCodHabitId::lovIconId')]");
        elements.put("sales_hotel_b_add_i_room", "//*[contains(@id, ':transGthaCodHabitId::content')]");
        elements.put("sales_hotel_b_add_lov_characteristic", "//*[contains(@id, ':transGchaCodCaracId::lovIconId')]");
        elements.put("sales_hotel_b_add_i_characteristic", "//*[contains(@id, ':transGchaCodCaracId::content')]");
        elements.put("sales_hotel_b_add_lov_board", "//*[contains(@id, ':transGregCodRegId::lovIconId')]");
        elements.put("sales_hotel_b_add_i_board", "//*[contains(@id, ':transGregCodRegId::content')]");
        elements.put("sales_hotel_b_add_i_adult", "//*[contains(@id, ':it7::content')]");
        elements.put("sales_hotel_b_add_i_child", "//*[contains(@id, ':it8::content')]");
        elements.put("sales_hotel_b_add_i_infant", "//*[contains(@id, ':it9::content')]");
        elements.put("sales_hotel_b_add_ck_pi", "//*[contains(@id, ':sbc2::content')]/span/img");
        elements.put("sales_hotel_b_add_ck_si", "//*[contains(@id, ':sbc1::content')]/span/img");
        elements.put("sales_hotel_b_add_i_transfer", "//*[contains(@id, ':soc7::content')]");

        elements.put("sales_hotel_b_add_b_add_distribution", "//*[contains(@id, 'ctb1::icon')]");


        elements.put("sales_hotel_b_remove", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("sales_hotel_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("sales_hotel_e_record", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr/td[1]");
        elements.put("sales_hotel_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("sales_hotel_b_actions_b_data_history", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("sales_hotel_b_actions_b_open_contract_maintenance", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("sales_hotel_b_actions_b_detailed_availability", "//*[contains(@id, 'pcgm1:dc_cmi2')]/td[2]");
        elements.put("sales_hotel_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("sales_hotel_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");
        elements.put("sales_hotel_b_cancel_changes", "//*[contains(@id, 'cxBeSh1')]");

        /* SALES HOTEL QBE */
        elements.put("sales_hotel_b_qbe_i_start_date", "//*[contains(@id, 'pc1:t1:id2::content')]");
        elements.put("sales_hotel_b_qbe_i_nights", "//*[contains(@id, 'pc1:t1:id8::content')]");
        elements.put("sales_hotel_b_qbe_i_end_date", "//*[contains(@id, 'pc1:t1:id4::content')]");
        elements.put("sales_hotel_b_qbe_i_hotel", "//*[contains(@id, 'pc1:t1:it12::content')]");
        elements.put("sales_hotel_b_qbe_i_contract", "//*[contains(@id, 'pc1:t1:it13::content')]");
        elements.put("sales_hotel_b_qbe_i_units", "//*[contains(@id, 'pc1:t1:it14::content')]");
        elements.put("sales_hotel_b_qbe_i_room", "//*[contains(@id, 'pc1:t1:it4::content')]");
        elements.put("sales_hotel_b_qbe_i_characteristic", "//*[contains(@id, 'pc1:t1:it10::content')]");
        elements.put("sales_hotel_b_qbe_i_rate", "//*[contains(@id, 'pc1:t1:it16::content')]");
        elements.put("sales_hotel_b_qbe_i_board", "//*[contains(@id, 'pc1:t1:it11::content')]");
        elements.put("sales_hotel_b_qbe_i_adult", "//*[contains(@id, 'pc1:t1:it18::content')]");
        elements.put("sales_hotel_b_qbe_i_child", "//*[contains(@id, 'pc1:t1:it19::content')]");
        elements.put("sales_hotel_b_qbe_i_infant", "//*[contains(@id, 'pc1:t1:it20::content')]");
        elements.put("sales_hotel_b_qbe_i_si", "//*[contains(@id, 'pc1:t1:soc4::content')]");
        elements.put("sales_hotel_b_qbe_i_pi", "//*[contains(@id, 'pc1:t1:soc5::content')]");
        elements.put("sales_hotel_b_qbe_i_date_send_hotel", "//*[contains(@id, 'pc1:t1:it21::content')]");
        elements.put("sales_hotel_b_qbe_i_cancellation_date", "//*[contains(@id, 'pc1:t1:id6::content')]");
        elements.put("sales_hotel_b_qbe_i_transfer", "//*[contains(@id, 'pc1:t1:soc6::content')]");
        elements.put("sales_hotel_b_qbe_i_product_office", "//*[contains(@id, 'pc1:t1:it15::content')]");
        elements.put("sales_hotel_b_qbe_i_product", "//*[contains(@id, 'pc1:t1:it17::content')]");

        /* SALES HOTEL DISTRIBUTION RECORDS */
        elements.put("sales_hotel_distribution_b_open_distribution", "//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("sales_hotel_distribution_b_add", "//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("sales_hotel_distribution_b_delete", "//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
        elements.put("sales_hotel_distribution_b_actions", "//*[contains(@id, 'pc2:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("sales_hotel_distribution_b_actions_b_data_history", "//*[contains(@id, 'pc2:pcgm1:dc_cmi0')]/td[2]");
        elements.put("sales_hotel_distribution_b_actions_b_data_history_b_ok", "//*[contains(@id, 'pc2:pcgm1:d22::ok')]");
        elements.put("sales_hotel_distribution_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("sales_hotel_distribution_b_detach_table", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("sales_hotel_distribution_e_result", "//*[contains(@id, 'pc2:t5::db')]/table/tbody/tr[1]/td[1]");

        /* SALES HOTEL DISTRIBUTION QBE */
        elements.put("sales_hotel_distribution_b_qbe_i_order", "/*//*[contains(@id, 'pc2:t5:it22::content')]");
        elements.put("sales_hotel_distribution_b_qbe_i_name", "/*//*[contains(@id, 'pc2:t5:it24::content')]");
        elements.put("sales_hotel_distribution_b_qbe_i_surname", "/*//*[contains(@id, 'pc2:t5:it25::content')]");
        elements.put("sales_hotel_distribution_b_qbe_i_age", "/*//*[contains(@id, 'pc2:t5:it28::content')]");
        elements.put("sales_hotel_distribution_b_qbe_i_type", "/*//*[contains(@id, 'pc2:t5:soc3::content')]");
        elements.put("sales_hotel_distribution_b_qbe_i_room", "/*//*[contains(@id, 'pc2:t5:it26::content')]");

        /* TRANSFERS RECORDS */
        elements.put("transfers_b_add", "//*[contains(@id, 'pc1:pcgt2:boton_add')]");
        elements.put("transfers_b_expand_buttons", "//*[contains(@id, 'pc1:pcgt2:dc_t1::eoi')]");
        elements.put("transfers_b_delete", "//*[contains(@id, 'pc1:pcgt2:boton_remove')]");
        elements.put("transfers_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("transfers_e_record", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("transfers_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("transfers_b_actions_b_no_hotel", "//*[contains(@id, 'pc1:pcgm2:dc_cmi1')]/td[2]");
        elements.put("transfers_b_detach_table", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("transfers_b_detach_table_b_close", "//*[contains(@id, 'pc1::_afrDetachDialogId::close')]");
        elements.put("transfers_b_cancel_changes", "//*[contains(@id, 'cxBeTr1')]");

        /* TRANSFERS QBE */
        elements.put("transfers_b_qbe_i_transfer_order", "//*[contains(@id, 'pc1_afr_t1_afr_ot1::content')]");
        elements.put("transfers_b_qbe_i_transfer_date", "//*[contains(@id, 'pc1:t1:id23::content')]");
        elements.put("transfers_b_qbe_i_departure_zone", "//*[contains(@id, 'c59::content')]");
        elements.put("transfers_b_qbe_i_departure_hotel", "//*[contains(@id, 'c1::content')]");
        elements.put("transfers_b_qbe_i_arrival_zone", "//*[contains(@id, 'c4::content')]");
        elements.put("transfers_b_qbe_i_arrival_hotel", "//*[contains(@id, 'c5::content')]");
        elements.put("transfers_b_qbe_i_sale_service_type", "//*[contains(@id, 'pc1:t1:soc12::content')]");
        elements.put("transfers_b_qbe_i_sale_contract", "//*[contains(@id, 'c3::content')]");
        elements.put("transfers_b_qbe_i_purchase_contract", "//*[contains(@id, 'c15::content')]");
        elements.put("transfers_b_qbe_i_transport", "//*[contains(@id, 'c11::content')]");
        elements.put("transfers_b_qbe_i_vehicle_type", "//*[contains(@id, 'c6::content')]");
        elements.put("transfers_b_qbe_i_vehicle_type2", "//*[contains(@id, 'c8::content')]");
        elements.put("transfers_b_qbe_i_flight", "//*[contains(@id, 'c7::content')]");
        elements.put("transfers_b_qbe_i_flight_hour", "//*[contains(@id, 'pc1:t1:id24::content')]");
        elements.put("transfers_b_qbe_i_departure", "//*[contains(@id, 'c20::content')]");
        elements.put("transfers_b_qbe_i_status", "//*[contains(@id, 'c31::content')]");
        elements.put("transfers_b_qbe_i_main_passenger_name", "//*[contains(@id, 'c68::content')]");
        elements.put("transfers_b_qbe_i_real", "//*[contains(@id, 'pc1:t1:soc5::content')]");
        elements.put("transfers_b_qbe_i_dis", "//*[contains(@id, 'pc1:t1:soc2::content')]");
        elements.put("transfers_b_qbe_i_nh", "//*[contains(@id, 'pc1:t1:soc4::content')]");
        elements.put("transfers_b_qbe_i_adults", "//*[contains(@id, 'c30::content')]");
        elements.put("transfers_b_qbe_i_children", "//*[contains(@id, 'c37::content')]");
        elements.put("transfers_b_qbe_i_infant", "//*[contains(@id, 'c54::content')]");

        /* TRANSFERS EDIT */
        elements.put("transfers_edit_i_transfer_date", "//*[contains(@id, 'pc1:t1:0:id1::content')]");
        elements.put("transfers_edit_lov_transport",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValues7::lovIconId')]");
        elements.put("transfers_edit_i_transport",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValues7::content')]");
        elements.put("transfers_edit_lov_transport_i_transport",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValues7::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfers_edit_lov_vehicle_type",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesTipVeh::lovIconId')]");
        elements.put("transfers_edit_i_vehicle_type",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesTipVeh::content')]");
        elements.put("transfers_edit_lov_vehicle_type_i_code",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesTipVeh::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfers_edit_lov_flight",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::lovIconId')]");
        elements.put("transfers_edit_i_flight",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::content')]");
        elements.put("transfers_edit_lov_flight_i_hour",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfers_edit_lov_flight_i_flight",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::_afrLovInternalQueryId:value10::content')]");
        elements.put("transfers_edit_lov_flight_lov_departure",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::_afrLovInternalQueryId:value20::lovIconId')]");
        elements.put("transfers_edit_lov_flight_i_departure",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::_afrLovInternalQueryId:value20::content')]");
        elements.put("transfers_edit_lov_flight_lov_departure_i_airport_code",
                "//*[contains(@id, 'pc1:t1:0:inputListOfValuesNumVuelo::_afrLovInternalQueryId:value20::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfers_edit_i_flight_hour", "//*[contains(@id, 'pc1:t1:0:it20::content')]");
        elements.put("transfers_edit_i_departure", "//*[contains(@id, 'pc1:t1:0:inputListOfValues5::content')]");
        elements.put("transfers_edit_lov_departure", "//*[contains(@id, 'pc1:t1:0:inputListOfValues5::lovIconId')]");
        elements.put("transfers_edit_lov_departure_i_code", "//*[contains(@id, 'pc1:t1:0:inputListOfValues5::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfers_edit_i_pickup_date_time", "//*[contains(@id, 'pc1:t1:0:it2::content')]");
        elements.put("transfers_edit_i_pickup_point", "//*[contains(@id, 'pc1:t1:0:transPickUpNameId2::content')]");
        elements.put("transfers_edit_lov_pickup_point", "//*[contains(@id, 'pc1:t1:0:transPickUpNameId2::lovIconId')]");
        elements.put("transfers_edit_lov_pickup_point_i_pickup_order", "//*[contains(@id, 'pc1:t1:0:transPickUpNameId2::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfers_edit_i_main_passenger_name", "//*[contains(@id, 'pc1:t1:0:it66::content')]");
        elements.put("transfers_edit_i_adults", "//*[contains(@id, 'pc1:t1:0:itt7::content')]");
        elements.put("transfers_edit_i_children", "//*[contains(@id, 'pc1:t1:0:itt8::content')]");
        elements.put("transfers_edit_i_infant", "//*[contains(@id, 'pc1:t1:0:itt12::content')]");
        /**/

        /*DIALOG CANCEL*/
        elements.put("alert_b_ok", "//*[contains(@id, 'doc0::msgDlg::cancel')]");
        elements.put("alert_e_info", "//*[contains(@id, 'doc0::msgDlg::_cnt')]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div");
        elements.put("alert_b_x", "//*[contains(@id, 'doc0::msgDlg::close')]");
        elements.put("alert_box", "//*[contains(@id, 'doc0::msgDlg')]");
    }
}