package screen.AT2MDMOR0024;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMOR0024Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0024Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("MDM_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("MDM_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("MDM_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[1]");
        elements.put("MDM_e_records", "//*[contains(@id, 'pc1:ot3')]");
        //ADD|MODIFY
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_region_subregion_code", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_region_subregion_name", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_i_region_code", "//*[contains(@id, 'pcgt1:esSubregionDe1Id::content')]");
        elements.put("add_lov_region_code", "//*[contains(@id, 'pcgt1:esSubregionDe1Id::lovIconId')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_region_subregion_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_region_subregion_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_region_subregion_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_region_subregion_name", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_region_code", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_region_code", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        //QBE
        elements.put("qbe_i_region_subregion_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_region_subregion_name", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_region_code", "//*[contains(@id, 'afr_resId1c3::content')]");
    }
}
