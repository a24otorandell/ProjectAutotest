package screen.AT2ACCSU0055;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/10/2016.
 */
public class AT2ACCSU0055Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0055Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        //-----------CHAINS TABLE
        elements.put("accommodation_b_chains_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("accommodation_b_chains_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("accommodation_b_chains_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("accommodation_b_chains_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
        elements.put("accommodation_b_chains_actions_audit_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi1')]/td[2]");
        elements.put("accommodation_b_chains_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_chains_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_chains_result", "//*[contains(@id, 'pc1:chain::db')]/table/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_chains_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("accommodation_b_chains_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        //-----------BRANDS TABLE
        elements.put("accommodation_b_brands_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("accommodation_b_brands_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("accommodation_b_brands_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("accommodation_b_brands_actions", "//*[contains(@id, 'pc2:pcgm1:dc_m1')]");
        elements.put("accommodation_b_brands_actions_audit_data", "//*[contains(@id, ':pc2:pcgm1:dc_cmi1')]/td[2]");
        elements.put("accommodation_b_brands_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("accommodation_b_brands_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("accommodation_e_brands_result", "//*[contains(@id, 'pc2:brands::db')]/table/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_brands_records", "//*[contains(@id, 'pc2:ot6')]");
        //ADD|MODIFY
        //-----------CHAINS TABLE
        elements.put("add_b_chains_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
        elements.put("add_i_crs_code", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_crs_name", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_crs_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_ls_chains_registration_status_indicator", "//*[contains(@id, 'pc1:pcgt1:soc1::content')]");
        //-----------BRANDS TABLE
        elements.put("add_b_brands_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");
        elements.put("add_i_brand_code", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_brand_name", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_ls_brands_registration_status_indicator", "//*[contains(@id, 'pcgt2:soc2::content')]");
        //SEARCH
        //-----------CHAINS TABLE
        elements.put("search_b_chains_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_chains_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_crs_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_crs_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_crs_description", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_ls_chains_registration_status_indicator", "//*[contains(@id, 'qryId1:value30::content')]");
        //-----------BRANDS TABLE
        elements.put("search_b_brands_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("search_b_brands_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("search_i_brand_code", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("search_i_brand_name", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("search_ls_brand_registration_status_indicator", "//*[contains(@id, 'qryId2:value20::content')]");
        //QBE
        //-----------CHAINS TABLE
        elements.put("qbe_i_crs_code", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_crs_name", "//*[contains(@id, 'afr_cc1::content')]");
        elements.put("qbe_i_crs_description", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_ls_chains_registration_status_indicator", "//*[contains(@id, 'chain:soc6::content')]");
        //-----------BRANDS TABLE
        elements.put("qbe_i_brand_code", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_brand_name", "//*[contains(@id, 'afr_c7::content')]");
        elements.put("qbe_ls_brand_registration_status_indicator", "//*[contains(@id, 'brands:fil2::content')]");
    }
}