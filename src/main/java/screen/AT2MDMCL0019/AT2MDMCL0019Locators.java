package screen.AT2MDMCL0019;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0019Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0019Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("MDM_b_actions_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_agency_name", "//*[contains(@id, 'pcgt2:it13::content')]");
        elements.put("add_e_agency_code", "//*[contains(@id, 'pcgt2:it18::content')]");
        elements.put("add_i_major", "//*[contains(@id, 'pcgt2:it11::content')]");
        elements.put("add_i_sub_major", "//*[contains(@id, 'pcgt2:it15::content')]");
        elements.put("add_i_detail", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_branch_TO", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_source_market", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_i_fiscal_number", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_atlas_code", "//*[contains(@id, 'pcgt2:ageCodAtlasId::content')]");
        elements.put("add_lov_atlas_code", "//*[contains(@id, 'pcgt2:ageCodAtlasId::lovIconId')]");
        elements.put("add_e_atlas_description", "//*[contains(@id, 'pcgt2:it22::content')]");
        elements.put("add_i_atlas_branch", "//*[contains(@id, 'pcgt2:it8::content')]");
        elements.put("add_i_credit", "//*[contains(@id, 'pcgt2:it14::content')]");
        elements.put("add_i_type", "//*[contains(@id, 'pcgt2:it12::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt2:fintCodInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt2:fintCodInterfaceId::lovIconId')]");
        elements.put("add_e_interface_description", "//*[contains(@id, 'pcgt2:it25::content')]");
        elements.put("add_i_id_web", "//*[contains(@id, 'pcgt2:idWebId::content')]");
        elements.put("add_lov_id_web", "//*[contains(@id, 'pcgt2:idWebId::lovIconId')]");
        elements.put("add_e_id_web_description", "//*[contains(@id, 'pcgt2:it23::content')]");
        elements.put("add_i_street", "//*[contains(@id, 'pcgt2:it16::content')]");
        elements.put("add_i_country", "//*[contains(@id, 'pcgt2:agePaiCodigoId::content')]");
        elements.put("add_lov_country", "//*[contains(@id, 'pcgt2:agePaiCodigoId::lovIconId')]");
        elements.put("add_e_country_name", "//*[contains(@id, 'pcgt2:it24::content')]");
        elements.put("add_i_city", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_postcode", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_i_telephone", "//*[contains(@id, 'pcgt2:it19::content')]");
        elements.put("add_i_fax", "//*[contains(@id, 'pcgt2:it9::content')]");
        elements.put("add_i_name", "//*[contains(@id, 'pcgt2:it17::content')]");
        elements.put("add_i_surname", "//*[contains(@id, 'pcgt2:it7::content')]");
        elements.put("add_i_email", "//*[contains(@id, 'pcgt2:it21::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_agency_name", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_agency_code", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_major", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_sub_major", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_detail", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_branch_TO", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_source_market", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_fiscal_number", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_atlas_code", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_lov_atlas_code", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("search_i_atlas_description", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_atlas_branch", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_i_credit", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_type", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value130::lovIconId')]");
        elements.put("search_i_interface_description", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("search_i_id_web", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("search_lov_id_web", "//*[contains(@id, 'qryId1:value150::lovIconId')]");
        elements.put("search_i_id_web_description", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("search_i_street", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("search_i_country", "//*[contains(@id, 'qryId1:value180::content')]");
        elements.put("search_lov_country", "//*[contains(@id, 'qryId1:value180::lovIconId')]");
        elements.put("search_i_country_name", "//*[contains(@id, 'qryId1:value190::content')]");
        elements.put("search_i_city", "//*[contains(@id, 'qryId1:value200::content')]");
        elements.put("search_i_postcode", "//*[contains(@id, 'qryId1:value210::content')]");
        elements.put("search_i_telephone", "//*[contains(@id, 'qryId1:value220::content')]");
        elements.put("search_i_fax", "//*[contains(@id, 'qryId1:value230::content')]");
        elements.put("search_i_name", "//*[contains(@id, 'qryId1:value240::content')]");
        elements.put("search_i_surname", "//*[contains(@id, 'qryId1:value250::content')]");
        elements.put("search_i_email", "//*[contains(@id, 'qryId1:value260::content')]");
        //QBE
        elements.put("qbe_i_agency_name", "//*[contains(@id, 'afr_c23::content')]");
        elements.put("qbe_i_agency_code", "//*[contains(@id, 'pc1:t1:it26::content')]");
        elements.put("qbe_i_major", "//*[contains(@id, 'pc1:t1:it27::content')]");
        elements.put("qbe_i_sub_major", "//*[contains(@id, 'pc1:t1:it28::content')]");
        elements.put("qbe_i_detail", "//*[contains(@id, 'pc1:t1:it29::content')]");
        elements.put("qbe_i_branch_TO", "//*[contains(@id, 'pc1:t1:it30::content')]");
        elements.put("qbe_i_source_market", "//*[contains(@id, 'pc1:t1:it31::content')]");
        elements.put("qbe_i_fiscal_number", "//*[contains(@id, 'afr_c17::content')]");
        elements.put("qbe_i_atlas_code", "//*[contains(@id, 'afr_c13::content')]");
        elements.put("qbe_i_atlas_description", "//*[contains(@id, 'afr_c26::content')]");
        elements.put("qbe_i_atlas_branch", "//*[contains(@id, 'pc1:t1:it32::content')]");
        elements.put("qbe_i_credit", "//*[contains(@id, 'afr_c20::content')]");
        elements.put("qbe_i_type", "//*[contains(@id, 'afr_c18::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_interface_description", "//*[contains(@id, 'afr_c27::content')]");
        elements.put("qbe_i_id_web", "//*[contains(@id, 'pc1:t1:it33::content')]");
        elements.put("qbe_i_id_web_description", "//*[contains(@id, 'afr_c24::content')]");
        elements.put("qbe_i_street", "//*[contains(@id, 'afr_c12::content')]");
        elements.put("qbe_i_country", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_country_name", "//*[contains(@id, 'afr_c25::content')]");
        elements.put("qbe_i_city", "//*[contains(@id, 'afr_c8::content')]");
        elements.put("qbe_i_postcode", "//*[contains(@id, 'afr_c10::content')]");
        elements.put("qbe_i_telephone", "//*[contains(@id, 'afr_c15::content')]");
        elements.put("qbe_i_fax", "//*[contains(@id, 'afr_c9::content')]");
        elements.put("qbe_i_name", "//*[contains(@id, 'afr_c21::content')]");
        elements.put("qbe_i_surname", "//*[contains(@id, 'afr_c11::content')]");
        elements.put("qbe_i_email", "//*[contains(@id, 'afr_c19::content')]");
    }
}