package screen.AT2MDMOR0008;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 25/11/2016.
 */
public class AT2MDMOR0008Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0008Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE INCOMING
         */
        //GENERALS
/*        elements.put("office_b_add", "/*//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("office_b_delete", "/*//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("office_b_edit", "/*//*[contains(@id, 'pcgt1:boton_edit')]");*/
        elements.put("office_b_actions", "//*[contains(@id, 'popup1:dc_m1')]");
        elements.put("office_b_actions_b_audit_data", "//*[contains(@id, 'popup1:dc_cmi0')]/td[2]");
        elements.put("audit_ok1", "//*[contains(@id, 'pc2:popup1:d22::ok')]");
        elements.put("office_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("office_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("office_e_result", "//*[contains(@id, 'pc2:table1::db')]/table/tbody/tr[1]/td[1]");
/*        elements.put("office_e_records", "/*//*[contains(@id, 'pc1:ot111')]");*/
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value00::content')]");
        //QBE
        elements.put("qbe_i_company_code", "//*[contains(@id, 'pc2_afr_table1_afr_resId1c1::content')]");
        elements.put("qbe_i_company_name", "//*[contains(@id, 'pc2_afr_table1_afr_resId1c2::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'pc2_afr_table1_afr_resId1c3::content')]");
        elements.put("qbe_i_office_incoming", "//*[contains(@id, 'pc2_afr_table1_afr_resId1c4::content')]");
        elements.put("qbe_i_office_inbound", "//*[contains(@id, 'pc2_afr_table1_afr_resId1c5::content')]");
        /**
         * TABLE ADDRESS
         */
        //GENERAL
        elements.put("address_b_add", "/*//*[contains(@id, 'PCGenericToolbar2:boton_add')]");
        elements.put("address_b_delete", "/*//*[contains(@id, 'PCGenericToolbar2:boton_remove')]");
        elements.put("address_b_edit", "/*//*[contains(@id, 'PCGenericToolbar2:boton_edit')]");
        elements.put("address_b_actions", "//*[contains(@id, 'PCGenericMenu1:dc_m1')]");
        elements.put("address_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("audit_ok2", "//*[contains(@id, 'PCGenericMenu1:d22::ok')]");
        elements.put("address_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("address_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("address_e_result", "//*[contains(@id, 'pc1:table2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("address_e_records", "/*//*[contains(@id, 'pc1:outputText5')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'PCGenericToolbar2:btn_commitExit')]");
        elements.put("add_ck_head", "//*[contains(@id, 'pc1:PCGenericToolbar2:sbc4::content')]");
        elements.put("add_b_data", "//*[contains(@id, 'pc1:PCGenericToolbar2:cb1')]");
        elements.put("add_e_country_code", "//*[contains(@id, 'pc1:PCGenericToolbar2:it21::content')]");
        elements.put("add_e_country_name", "//*[contains(@id, 'pc1:PCGenericToolbar2:it7::content')]");
        elements.put("add_i_street_type", "//*[contains(@id, 'pc1:PCGenericToolbar2:stviaCodTipoViaId::content')]");
        elements.put("add_lov_street_type", "//*[contains(@id, 'pc1:PCGenericToolbar2:stviaCodTipoViaId::lovIconId')]");
        elements.put("add_i_street", "//*[contains(@id, 'pc1:PCGenericToolbar2:it10::content')]");
        elements.put("add_i_number", "//*[contains(@id, 'pc1:PCGenericToolbar2:it4::content')]");
        elements.put("add_i_door", "//*[contains(@id, 'pc1:PCGenericToolbar2:it9::content')]");
        elements.put("add_i_floor", "//*[contains(@id, 'pc1:PCGenericToolbar2:it3::content')]");
        elements.put("add_i_postal_code", "//*[contains(@id, 'pc1:PCGenericToolbar2:it20::content')]");
        elements.put("add_i_town", "//*[contains(@id, 'pc1:PCGenericToolbar2:it2::content')]");
        elements.put("add_i_county", "//*[contains(@id, 'pc1:PCGenericToolbar2:sprvCodProvId::content')]");
        elements.put("add_lov_county", "//*[contains(@id, 'pc1:PCGenericToolbar2:sprvCodProvId::lovIconId')]");
        elements.put("add_i_county_desc", "//*[contains(@id, 'pc1:PCGenericToolbar2:it1::content')]");
        elements.put("add_i_telephone", "//*[contains(@id, 'pc1:PCGenericToolbar2:it18::content')]");
        elements.put("add_i_fax", "//*[contains(@id, 'pc1:PCGenericToolbar2:it11::content')]");
        elements.put("add_i_email", "//*[contains(@id, 'pc1:PCGenericToolbar2:it31::content')]");
        elements.put("add_i_booking_email", "//*[contains(@id, 'pc1:PCGenericToolbar2:it17::content')]");
        elements.put("add_i_banner", "//*[contains(@id, 'pc1:PCGenericToolbar2:it8::content')]");
        elements.put("add_i_image_1", "//*[contains(@id, 'pc1:PCGenericToolbar2:it16::content')]");
        elements.put("add_i_image_2", "//*[contains(@id, 'pc1:PCGenericToolbar2:it19::content')]");
        elements.put("add_i_image_3", "//*[contains(@id, 'pc1:PCGenericToolbar2:it23::content')]");
        elements.put("add_i_link_camera", "//*[contains(@id, 'pc1:PCGenericToolbar2:it14::content')]");
        elements.put("add_i_position_code", "//*[contains(@id, 'pc1:PCGenericToolbar2:scusCodCargoUsuId::content')]");
        elements.put("add_lov_position_code", "//*[contains(@id, 'pc1:PCGenericToolbar2:scusCodCargoUsuId::lovIconId')]");
        elements.put("add_i_position_desc", "//*[contains(@id, 'pc1:PCGenericToolbar2:it32::content')]");
        //QBE
        elements.put("qbe_i_head", "//*[contains(@id, 'selectOneChoice1::content')]");
        elements.put("qbe_i_country_code", "//*[contains(@id, 'pc1_afr_table2_afr_c16::content')]");
        elements.put("qbe_i_country_name", "//*[contains(@id, 'pc1_afr_table2_afr_c6::content')]");
        elements.put("qbe_i_street_type", "//*[contains(@id, 'pc1_afr_table2_afr_c11::content')]");
        elements.put("qbe_i_street", "//*[contains(@id, 'pc1_afr_table2_afr_c20::content')]");
        elements.put("qbe_i_number", "//*[contains(@id, 'pc1_afr_table2_afr_c9::content')]");
        elements.put("qbe_i_door", "//*[contains(@id, 'pc1_afr_table2_afr_c15::content')]");
        elements.put("qbe_i_floor", "//*[contains(@id, 'pc1_afr_table2_afr_c7::content')]");
        elements.put("qbe_i_postal_code", "//*[contains(@id, 'pc1_afr_table2_afr_c2::content')]");
        elements.put("qbe_i_town", "//*[contains(@id, 'pc1_afr_table2_afr_c12::content')]");
        elements.put("qbe_i_county", "//*[contains(@id, 'pc1_afr_table2_afr_c21::content')]");
        elements.put("qbe_i_county_desc", "//*[contains(@id, 'pc1_afr_table2_afr_c17::content')]");
        elements.put("qbe_i_telephone", "//*[contains(@id, 'pc1_afr_table2_afr_c5::content')]");
        elements.put("qbe_i_fax", "//*[contains(@id, 'pc1_afr_table2_afr_c23::content')]");
        elements.put("qbe_i_email", "//*[contains(@id, 'pc1_afr_table2_afr_c1::content')]");
        elements.put("qbe_i_booking_email", "//*[contains(@id, 'pc1_afr_table2_afr_c8::content')]");
        elements.put("qbe_i_banner", "//*[contains(@id, 'pc1_afr_table2_afr_c19::content')]");
        elements.put("qbe_i_image_1", "//*[contains(@id, 'pc1_afr_table2_afr_c22::content')]");
        elements.put("qbe_i_image_2", "//*[contains(@id, 'pc1_afr_table2_afr_c4::content')]");
        elements.put("qbe_i_image_3", "//*[contains(@id, 'pc1_afr_table2_afr_c18::content')]");
        elements.put("qbe_i_link_camera", "//*[contains(@id, 'pc1_afr_table2_afr_c10::content')]");
        elements.put("qbe_i_position_code", "//*[contains(@id, 'pc1_afr_table2_afr_c13::content')]");
        elements.put("qbe_i_position_desc", "//*[contains(@id, 'pc1_afr_table2_afr_c3::content')]");
        /**
         * TABLE LANGUAGE
         */
        //GENERALS
        elements.put("language_b_add", "/*//*[contains(@id, 'PCGenericToolbar3:boton_add')]");
        elements.put("language_b_delete", "/*//*[contains(@id, 'PCGenericToolbar3:boton_remove')]");
        elements.put("language_b_edit", "/*//*[contains(@id, 'PCGenericToolbar3:boton_edit')]");
        elements.put("language_b_actions", "//*[contains(@id, 'PCGenericMenu2:dc_m1')]");
        elements.put("language_b_actions_b_audit_data", "//*[contains(@id, 'PCGenericMenu2:dc_cmi0')]/td[2]");
        elements.put("audit_ok3", "//*[contains(@id, 'PCGenericMenu2:d22::ok')]");
        elements.put("language_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
        elements.put("language_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("language_e_result", "//*[contains(@id, 'pc3:table3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("language_e_records", "/*//*[contains(@id, 'pc3:outputText9')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'PCGenericToolbar3:btn_commitExit')]");
        elements.put("add_i_language", "//*[contains(@id, 'pc3:PCGenericToolbar3:sidiCodIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'pc3:PCGenericToolbar3:sidiCodIdiomaId::lovIconId')]");
        elements.put("add_i_language_des", "//*[contains(@id, 'pc3:PCGenericToolbar3:it26::content')]");
        elements.put("add_i_destination_desc", "//*[contains(@id, 'pc3:PCGenericToolbar3:it29::content')]");
        elements.put("add_i_destination_desc2", "//*[contains(@id, 'pc3:PCGenericToolbar3:it28::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'pc3:PCGenericToolbar3:it24::content')]");
        //QBE
        elements.put("qbe_i_language", "//*[contains(@id, 'pc3_afr_table3_afr_c29::content')]");
        elements.put("qbe_i_language_des", "//*[contains(@id, 'pc3_afr_table3_afr_c26::content')]");
        elements.put("qbe_i_destination_desc", "//*[contains(@id, 'pc3_afr_table3_afr_c27::content')]");
        elements.put("qbe_i_destination_desc2", "//*[contains(@id, 'pc3_afr_table3_afr_c25::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'pc3_afr_table3_afr_c24::content')]");
    }
}
