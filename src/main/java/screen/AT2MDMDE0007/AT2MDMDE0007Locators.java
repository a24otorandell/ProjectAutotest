package screen.AT2MDMDE0007;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMDE0007Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0007Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //INTEREST POINTS
                elements.put("MDM_ip_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_ip_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_ip_b_delete_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
                elements.put("MDM_ip_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_ip_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
                elements.put("MDM_ip_b_actions_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi0')]/td[2]");
                elements.put("MDM_ip_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_ip_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_ip_e_result", "//*[contains(@id, 'pc1:Master::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_ip_e_records", "//*[contains(@id, 'pc1:outputText7')]");
            //MULTI-LANGUAGE
                elements.put("MDM_ml_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_ml_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_ml_b_delete_ok", "//*[contains(@id, 'pcgt1:cbt1')]");
                elements.put("MDM_ml_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_ml_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
                elements.put("MDM_ml_b_actions_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
                elements.put("MDM_ml_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_ml_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_ml_e_result", "//*[contains(@id, 'pc2:Child::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_ml_e_records", "//*[contains(@id, 'pc2:ot7')]");
        //ADD|MODIFY
            //INTEREST POINTS
                elements.put("add_ip_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_i_destination_code", "//*[contains(@id, 'pcgt2:codDestinoId::content')]");
                elements.put("add_lov_destination_code", "//*[contains(@id, 'pcgt2:codDestinoId::lovIconId')]");
                elements.put("add_e_destination_description", "//*[contains(@id, 'pcgt2:it4::content')]");
                elements.put("add_e_country", "//*[contains(@id, 'pcgt2:it5::content')]");
                elements.put("add_i_area_code", "//*[contains(@id, 'pcgt2:zonSeqZonaId::content')]");
                elements.put("add_lov_area_code", "//*[contains(@id, 'pcgt2:zonSeqZonaId::lovIconId')]");
                elements.put("add_e_area_name", "//*[contains(@id, 'pcgt2:it3::content')]");
                elements.put("add_i_tpi_longitude", "//*[contains(@id, 'pcgt2:it7::content')]");
                elements.put("add_i_tpi_latitude", "//*[contains(@id, 'pcgt2:it9::content')]");
                elements.put("add_i_tpi_telephone", "//*[contains(@id, 'pcgt2:it8::content')]");
                elements.put("add_i_tpi_description", "//*[contains(@id, 'pcgt2:it6::content')]");
            //MULTI-LANGUAGE
                elements.put("add_ml_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_i_language", "//*[contains(@id, 'pcgt1:it12::content')]");
                elements.put("add_i_name", "//*[contains(@id, 'pcgt1:it10::content')]");
                elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it11::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_destination_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_destination_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_destination_description", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_country", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_area_code", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_area_code", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_area_name", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_tpi_longitude", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_tpi_latitude", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_tpi_telephone", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_tpi_description", "//*[contains(@id, 'qryId1:value80::content')]");
        //QBE
        //INTEREST POINTS
        elements.put("qbe_ip_i_destination_code", "//*[contains(@id, 'afr_Master_afr_c17::content')]");
        elements.put("qbe_ip_i_destination_description", "//*[contains(@id, 'afr_Master_afr_c8::content')]");
        elements.put("qbe_ip_i_country", "//*[contains(@id, 'afr_Master_afr_c1::content')]");
        elements.put("qbe_ip_i_area_code", "//*[contains(@id, 'afr_Master_afr_c20::content')]");
        elements.put("qbe_ip_i_area_name", "//*[contains(@id, 'afr_Master_afr_c19::content')]");
        elements.put("qbe_ip_i_tpi_longitude", "//*[contains(@id, 'afr_Master_afr_c2::content')]");
        elements.put("qbe_ip_i_tpi_latitude", "//*[contains(@id, 'afr_Master_afr_c24::content')]");
        elements.put("qbe_ip_i_tpi_telephone", "//*[contains(@id, 'afr_Master_afr_c22::content')]");
        //MULTI-LANGUAGE
        elements.put("qbe_ml_i_language", "//*[contains(@id, 'afr_Child_afr_c23::content')]");
        elements.put("qbe_ml_i_name", "//*[contains(@id, 'afr_Child_afr_c5::content')]");
        elements.put("qbe_ml_i_description", "//*[contains(@id, 'afr_Child_afr_c7::content')]");
    }
}