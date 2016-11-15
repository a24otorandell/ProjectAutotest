package screen.AT2MDMDE0002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 15/11/2016.
 */
public class AT2MDMDE0002Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0002Locators(String enviroment) {
        setElements(enviroment);
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements(String enviroment) {
        /**
         * TABLE DESCRIPTION
         */
        //GENERALS
        elements.put("description1_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("description1_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("description1_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        //elements.put("description1_b_actions", "//*[contains(@id, 'pc1:j_id__ctru45pc10:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("description1_b_actions", "//*[@id='pt1:dyntdc:r1:1:pc1:j_id__ctru45pc7:dc_m1']");

        elements.put("description1_b_actions_audit_data", "//*[contains(@id, 'ctru45pc7:dc_cmi1')]/td[2]");
        elements.put("description1_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("description1_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("description1_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
        elements.put("description1_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("qbe_reset", "//*[contains(@id, '1:pc1:master::ch::t')]/tbody/tr[2]/th/a");
        elements.put("a_delete_ok", "//*[contains(@id, 'pc1:pcgt2:cbt1')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_country", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_country", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_office", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_office", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_region", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_region", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_region_desc", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_time", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_lov_time", "//*[contains(@id, 'qryId1:value70::lovIconId')]");
        elements.put("search_ck_active", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_ck_transfer", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_ck_wkd", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_ck_kd", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_ck_sd", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_area", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("search_i_area_description", "//*[contains(@id, 'qryId1:value140::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_country", "//*[contains(@id, 'pc1:pcgt2:gpaiCodPaisId::content')]");
        elements.put("add_lov_country", "//*[contains(@id, 'pc1:pcgt2:gpaiCodPaisId::lovIconId')]");
        elements.put("add_i_destination", "//*[contains(@id, 'pc1:pcgt2:it3::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pc1:pcgt2:it5::content')]");
        elements.put("add_i_company", "//*[contains(@id, 'pc1:pcgt2:codEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pc1:pcgt2:codEmpId::lovIconId')]");
        elements.put("add_i_office", "//*[contains(@id, 'pc1:pcgt2:codOfi1Id::content')]");
        elements.put("add_lov_office", "//*[contains(@id, 'pc1:pcgt2:codOfi1Id::lovIconId')]");
        elements.put("add_i_office_desc", "//*[contains(@id, 'pc1:pcgt2:it24::content')]");
        elements.put("add_i_region", "//*[contains(@id, 'pc1:pcgt2:codRegion1Id::content')]");
        elements.put("add_lov_region", "//*[contains(@id, 'pc1:pcgt2:codRegion1Id::lovIconId')]");
        elements.put("add_i_region_desc", "//*[contains(@id, 'pc1:pcgt2:it4::content')]");
        elements.put("add_i_time", "//*[contains(@id, 'pc1:pcgt2:tznameId::content')]");
        elements.put("add_lov_time", "//*[contains(@id, 'pc1:pcgt2:tznameId::lovIconId')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pc1:pcgt2:sbc10::content')]");
        elements.put("add_ck_transfer", "//*[contains(@id, 'pc1:pcgt2:sbc9::content')]");
        elements.put("add_ck_wkd", "//*[contains(@id, 'pc1:pcgt2:sbc8::content')]");
        elements.put("add_ck_kd", "//*[contains(@id, 'pc1:pcgt2:sbc7::content')]");
        elements.put("add_ck_sd", "//*[contains(@id, 'pc1:pcgt2:sbc6::content')]");
        elements.put("add_sl_typology", "//*[contains(@id, 'pc1:pcgt2:soc6::content')]");
        //QBE
        elements.put("qbe_i_country", "//*[contains(@id, 'pc1_afr_master_afr_c1::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'pc1_afr_master_afr_c5::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'pc1_afr_master_afr_c9::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'pc1_afr_master_afr_c4::content')]");
        elements.put("qbe_i_office", "//*[contains(@id, 'pc1_afr_master_afr_c8::content')]");
        elements.put("qbe_i_office_desc", "//*[contains(@id, 'pc1_afr_master_afr_c10::content')]");
        elements.put("qbe_i_region", "//*[contains(@id, 'pc1_afr_master_afr_c7::content')]");
        elements.put("qbe_i_region_desc", "//*[contains(@id, 'pc1_afr_master_afr_c2::content')]");
        elements.put("qbe_i_time", "//*[contains(@id, 'pc1_afr_master_afr_c14::content')]");
        elements.put("qbe_sl_typology", "//*[contains(@id, 'pc1:master:selectOneChoice1::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'pc1:master:soc9::content')]");
        elements.put("qbe_sl_transfer", "//*[contains(@id, 'pc1:master:soc1::content')]");
        elements.put("qbe_sl_wkd", "//*[contains(@id, 'pc1:master:soc2::content')]");
        elements.put("qbe_sl_kd", "//*[contains(@id, 'pc1:master:soc3::content')]");
        elements.put("qbe_sl_sd", "//*[contains(@id, 'pc1:master:soc4::content')]");
        /**
         * TAB DESCRIPTION - TABLE DESCRIPTION
         */
        //TAB
        elements.put("desc_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        //GENERALS
        elements.put("description2_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("description2_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("description2_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        if (enviroment.equalsIgnoreCase("sis")) {
            elements.put("description2_b_actions", "//*[contains(@id, 'pc2:j_id__ctru173pc7:dc_m1')]/div/table/tbody/tr/td[2]/a");
            elements.put("description2_b_actions_audit_data", "//*[contains(@id, 'ctru173pc7:dc_cmi1')]/td[2]");
        }
        else {
            elements.put("description2_b_actions", "//*[contains(@id, 'pc2:j_id__ctru171pc7:dc_m1')]/div/table/tbody/tr/td[2]/a");
            elements.put("description2_b_actions_audit_data", "//*[contains(@id, 'ctru171pc7:dc_cmi1')]/td[2]");
        }

        elements.put("description2_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("description2_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("description2_e_result", "//*[contains(@id, 'pc2:RetindestinoId::db')]/table/tbody/tr[1]/td[1]");
        elements.put("description2_e_records", "//*[contains(@id, 'pc2:ot40')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_lang", "//*[contains(@id, 'pc2:pcgt1:sidiCodIdiomaId::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'pc2:pcgt1:sidiCodIdiomaId::lovIconId')]");
        elements.put("add_i_description_lang", "//*[contains(@id, 'pc2:pcgt1:it10::content')]");
        elements.put("add_i_description_lang_2", "//*[contains(@id, 'pc2:pcgt1:it11::content')]");
        //QBE
        elements.put("qbe_i_lang", "//*[contains(@id, 'pc2_afr_RetindestinoId_afr_c17::content')]");
        elements.put("qbe_i_description_lang", "//*[contains(@id, 'pc2_afr_RetindestinoId_afr_c16::content')]");
        /**
         * TAB AREAS - TABLE AREAS
         */
        //TAB
        elements.put("areas_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        //GENERAL
        elements.put("areas_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
        elements.put("areas_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
        elements.put("areas_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
        if (enviroment.equalsIgnoreCase("sis")) {
            elements.put("areas_b_actions", "//*[contains(@id, 'ctru224pc7:dc_m1')]/div/table/tbody/tr/td[2]/a");
            elements.put("areas_b_actions_audit_data", "//*[contains(@id, 'ctru224pc7:dc_cmi1')]/td[2]");
        }
        else {
            elements.put("areas_b_actions", "//*[contains(@id, 'ctru222pc7:dc_m1')]/div/table/tbody/tr/td[2]/a");
            elements.put("areas_b_actions_audit_data", "//*[contains(@id, 'ctru222pc7:dc_cmi1')]/td[2]");
        }
        elements.put("areas_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]/a");
        elements.put("areas_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("areas_e_result", "//*[contains(@id, 'pc3:RetinzonaGe::db')]/table/tbody/tr[1]/td[1]");
        elements.put("areas_e_records", "//*[contains(@id, 'pc3:ot20')]");
        elements.put("b_delete_ok", "//*[contains(@id, 'pc3:pcgt3:cbt1')]");
        //ADD
        elements.put("add_b_save3", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
        elements.put("areas_add_i_area", "//*[contains(@id, 'pc3:pcgt3:it16::content')]");
        elements.put("areas_add_i_description", "//*[contains(@id, 'pc3:pcgt3:it17::content')]");
        elements.put("areas_add_ck_priority", "//*[contains(@id, 'pc3:pcgt3:sbc12::content')]");
        elements.put("areas_add_i_latitude", "//*[contains(@id, 'pc3:pcgt3:it26::content')]");
        elements.put("areas_add_i_longitude", "//*[contains(@id, 'pc3:pcgt3:it27::content')]");
        //QBE
        elements.put("areas_qbe_i_area", "//*[contains(@id, 'pc3_afr_RetinzonaGe_afr_c18::content')]");
        elements.put("areas_qbe_i_description", "//*[contains(@id, 'pc3_afr_RetinzonaGe_afr_c19::content')]");
        elements.put("areas_qbe_sl_priority", "//*[contains(@id, 'pc3:RetinzonaGe:soc5::content')]");
        elements.put("areas_qbe_i_latitude", "//*[contains(@id, 'pc3:RetinzonaGe:filterLatitud::content')]");
        elements.put("areas_qbe_i_longitude", "//*[contains(@id, 'pc3:RetinzonaGe:filterLongitud::content')]");
        /**
         * TAB AREAS - TABLE MULTI
         */
        elements.put("multi_b_add", "//*[contains(@id, 'pcgt4:boton_add')]");
        elements.put("multi_b_delete", "//*[contains(@id, 'pcgt4:boton_remove')]");
        elements.put("multi_b_edit", "//*[contains(@id, 'pcgt4:boton_edit')]");
        elements.put("multi_b_qbe", "//*[contains(@id, 'pc5:_qbeTbr')]/a");
        elements.put("multi_b_detach", "//*[contains(@id, 'pc5:_dchTbr')]");
        elements.put("multi_e_result", "//*[contains(@id, 'pc5:t16::db')]/table/tbody/tr[1]/td[1]");
        elements.put("multi_e_records", "//*[contains(@id, 'pc5:outputText2')]");
        //ADD
        elements.put("add_b_save4", "//*[contains(@id, 'pcgt4:btn_commitExit')]");
        elements.put("multi_add_i_code", "//*[contains(@id, 'pc5:pcgt4:it29::content')]");
        elements.put("multi_add_i_language", "//*[contains(@id, 'pc5:pcgt4:codIdiomaId::content')]");
        elements.put("multi_add_lov_language", "//*[contains(@id, 'pc5:pcgt4:codIdiomaId::lovIconId')]");
        elements.put("multi_add_i_description", "//*[contains(@id, 'pc5:pcgt4:it25::content')]");
        //QBE
        elements.put("multi_qbe_i_code", "//*[contains(@id, 'pc5_afr_t16_afr_c45::content')]");
        elements.put("multi_qbe_i_language", "//*[contains(@id, 'pc5_afr_t16_afr_c44::content')]");
        elements.put("multi_qbe_i_description", "//*[contains(@id, 'pc5_afr_t16_afr_c46::content')]");
        /**
         * TAB EXTERNAL - TABLE EXTERNAL
         */
        //TAB
        elements.put("supplier_tab", "//*[contains(@id, 'sdi3::disAcr')]");
        //GENERALS
        elements.put("supplier_b_add", "//*[contains(@id, 'pcgt5:boton_add')]");
        elements.put("supplier_b_delete", "//*[contains(@id, 'pcgt5:boton_remove')]");
        elements.put("supplier_b_edit", "//*[contains(@id, 'pcgt5:boton_edit')]");
        if (enviroment.equalsIgnoreCase("sis")) {
            elements.put("supplier_b_actions", "//*[contains(@id, 'ctru314pc7:dc_m1')]/div/table/tbody/tr/td[2]/a");
            elements.put("supplier_b_actions_audit_data", "//*[contains(@id, 'ctru314pc7:dc_cmi1')]/td[2]");
        }
        else {
            elements.put("supplier_b_actions", "//*[contains(@id, 'ctru312pc7:dc_m1')]/div/table/tbody/tr/td[2]/a");
            elements.put("supplier_b_actions_audit_data", "//*[contains(@id, 'ctru312pc7:dc_cmi1')]/td[2]");
        }
        elements.put("supplier_b_qbe", "//*[contains(@id, 'pc4:_qbeTbr')]/a");
        elements.put("supplier_b_detach", "//*[contains(@id, 'pc4:_dchTbr')]");
        elements.put("supplier_e_result", "//*[contains(@id, 'pc4:Retindestproext::db')]/table/tbody/tr[1]/td[1]");
        elements.put("supplier_e_records", "//*[contains(@id, 'pc4:ot29')]");
        //ADD
        elements.put("supplier_b_save", "//*[contains(@id, 'pcgt5:btn_commitExit')]");
        elements.put("supplier_add_i_agency", "//*[contains(@id, 'pc4:pcgt5:codInterfaceB2bId::content')]");
        elements.put("supplier_add_lov_agency", "//*[contains(@id, 'pc4:pcgt5:codInterfaceB2bId::lovIconId')]");
        elements.put("supplier_add_i_agency_description", "//*[contains(@id, 'pc4:pcgt5:it23::content')]");
        elements.put("supplier_add_i_office", "//*[contains(@id, 'pc4:pcgt5:codOfiId::content')]");
        elements.put("supplier_add_lov_office", "//*[contains(@id, 'pc4:pcgt5:codOfiId::lovIconId')]");
        elements.put("supplier_add_i_office_description", "//*[contains(@id, 'pc4:pcgt5:it22::content')]");
        //QBE
        elements.put("supplier_i_qbe_agency", "//*[contains(@id, 'pc4_afr_Retindestproext_afr_c24::content')]");
        elements.put("supplier_i_qbe_agency_description", "//*[contains(@id, 'pc4_afr_Retindestproext_afr_c23::content')]");
        elements.put("supplier_i_qbe_office", "//*[contains(@id, 'pc4_afr_Retindestproext_afr_c21::content')]");
        elements.put("supplier_i_qbe_office_description", "//*[contains(@id, 'pc4_afr_Retindestproext_afr_c22::content')]");
    }
}
