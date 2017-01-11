package screen.AT2MDMCL0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 11/01/2017.
 */
public class AT2MDMCL0001Locators {
    Map<String, String> elements = new HashMap<>();

    public  AT2MDMCL0001Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //region AT2MDMCL0001
        //GENERAL BUTTONS
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("results_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("results_b_detach", "//*[contains(@id, '1484139429735')]");
        elements.put("results_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("results_e_records", "//*[contains(@id, 'pc1:ot42')]");
        elements.put("results_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        //SEARCH
        elements.put("search_i_shot_name", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_commercial_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_atlas_number", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_main_acount", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_fiscal_number", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_ls_status", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_ls_commercial_brand", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_ls_customer_type", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_ls_sub-type", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_ls_admin_type", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_ls_relationship", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_ls_group", "//*[contains(@id, 'qryId1:value110::content')]");
        elements.put("search_i_street", "//*[contains(@id, 'qryId1:value120::content')]");
        elements.put("search_i_post_code", "//*[contains(@id, 'qryId1:value130::content')]");
        elements.put("search_i_phone", "//*[contains(@id, 'qryId1:value140::content')]");
        elements.put("search_i_email", "//*[contains(@id, 'qryId1:value150::content')]");
        elements.put("search_ls_source_market", "//*[contains(@id, 'qryId1:value160::content')]");
        elements.put("search_ls_indwebprepay", "//*[contains(@id, 'qryId1:value170::content')]");
        elements.put("search_ls_indautocanx", "//*[contains(@id, 'qryId1:value180::content')]");
        elements.put("search_ls_indprepaycentral", "//*[contains(@id, 'qryId1:value190::content')]");
        elements.put("search_i_prepay_email", "//*[contains(@id, 'qryId1:value200::content')]");
        elements.put("search_i_collections_company", "//*[contains(@id, 'qryId1:value210::content')]");
        elements.put("search_lov_collections_company", "//*[contains(@id, 'qryId1:value210::lovIconId')]");
        elements.put("search_i_crc", "//*[contains(@id, 'qryId1:value220::content')]");
        elements.put("search_lov_crc", "//*[contains(@id, 'qryId1:value220::lovIconId')]");
        elements.put("search_i_sap_code", "//*[contains(@id, 'qryId1:value230::content')]");
        //QBE
        elements.put("results_qbe_i_shot_name", "//*[contains(@id, 't1_afr_c10::content')]");
        elements.put("results_qbe_i_commercial_name", "//*[contains(@id, 't1_afr_c8::content')]");
        elements.put("results_qbe_i_atlas_number", "//*[contains(@id, 't1_afr_c9::content')]");
        elements.put("results_qbe_i_main_acount", "//*[contains(@id, 't1_afr_c6::content')]");
        elements.put("results_qbe_i_sap_code", "//*[contains(@id, 't1_afr_c13::content')]");
        elements.put("results_qbe_i_fiscal_number", "//*[contains(@id, 't1_afr_c5::content')]");
        elements.put("results_qbe_ls_status", "//*[contains(@id, 't1:soc29::content')]");
        elements.put("results_qbe_ls_commercial_brand", "//*[contains(@id, 't1:soc12::content')]");
        elements.put("results_qbe_ls_customer_type", "//*[contains(@id, 't1:soc50::content')]");
        elements.put("results_qbe_ls_indshowtax", "//*[contains(@id, 't1:soc2::content')]");
        elements.put("results_qbe_ls_admin_type", "//*[contains(@id, 't1:soc13::content')]");
        elements.put("results_qbe_ls_relationship", "//*[contains(@id, 't1:soc14::content')]");
        elements.put("results_qbe_ls_group", "//*[contains(@id, 't1:soc15::content')]");
        elements.put("results_qbe_ls_destination_services", "//*[contains(@id, 'pc1:t1:soc23::content')]");
        elements.put("results_qbe_i_account_owner", "//*[contains(@id, 'pc1_afr_t1_afr_c14::content')]");
        elements.put("results_qbe_ls_source_market", "//*[contains(@id, 't1:soc17::content')]");
        elements.put("results_qbe_ls_indwebprepay", "//*[contains(@id, 't1:soc222::content')]");
        elements.put("results_qbe_ls_indautocanx", "//*[contains(@id, 't1:soc223::content')]");
        elements.put("results_qbe_ls_indprepaycentral", "//*[contains(@id, 't1:soc224::content')]");
        elements.put("results_qbe_i_prepay_email", "//*[contains(@id, 't1_afr_c43::content')]");
        elements.put("results_qbe_i_collections_company", "//*[contains(@id, 't1_afr_c44::content')]");
        elements.put("results_qbe_i_crc", "//*[contains(@id, 't1_afr_c49::content')]");
        elements.put("results_qbe_ls_tripAdvisor", "//*[contains(@id, 't1:soc19::content')]");
        //CREATION
        //CUSTOMER REGISTER REQUEST
        elements.put("creation_ls_administrative_customer", "//*[contains(@id, 'choiceAdmCustType::content')]");
        elements.put("creation_i_atlas_short_name", "//*[contains(@id, 'it45::content')]");
        elements.put("creation_i_commercial_name", "//*[contains(@id, 'it46::content')]");
        elements.put("creation_ls_relationship", "//*[contains(@id, 'qryId1:value230::content')]");
        elements.put("creation_ls_division", "//*[contains(@id, 'qryId1:value230::content')]");
        elements.put("creation_ls_direct_hotel_payment", "//*[contains(@id, 'qryId1:value230::content')]");
        elements.put("creation_ls_source_market", "//*[contains(@id, 'qryId1:value230::content')]");
        elements.put("creation_ls_office_comments", "//*[contains(@id, 'qryId1:value230::content')]");


        //endregion

    }

}
