package screen.AT2MDMDE0010;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 18/11/2016.
 */
public class AT2MDMDE0010Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0010Locators(String enviroment) {
        setElements(enviroment);
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements(String enviroment) {
        //GENERALS
        elements.put("restricted_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("restricted_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("restricted_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("restricted_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("restricted_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("restricted_e_records", "//*[contains(@id, 'pc1:ot35')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_id", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_external", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_external", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_ttoo", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_ttoo", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_dest", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_lov_dest", "//*[contains(@id, 'ryId1:value70::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_id", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_external", "//*[contains(@id, 'pcgt2:ageExtCod1Id::content')]");
        elements.put("add_lov_external", "//*[contains(@id, 'pcgt2:ageExtCod1Id::lovIconId')]");
        elements.put("add_i_external_name", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt2:codIntf1Id::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt2:codIntf1Id::lovIconId')]");
        elements.put("add_i_interface_desc", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtoo1Id::content')]");
        elements.put("add_lov_ttoo", "//*[contains(@id, 'pc1:pcgt2:seqTtoo1Id::lovIconId')]");
        elements.put("add_i_ttoo_name", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_dest", "//*[contains(@id, 'pc1:pcgt2:codDestino1Id::content')]");
        elements.put("add_lov_dest", "//*[contains(@id, 'pc1:pcgt2:codDestino1Id::lovIconId')]");
        elements.put("add_i_dest_desc", "//*[contains(@id, 'pcgt2:it5::content')]");
        //QBE
        elements.put("qbe_i_id", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c1::content')]");
        elements.put("qbe_i_external", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("qbe_i_external_name", "//*[contains(@id, 'pc1_afr_resId1_afr_c1::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c3::content')]");
        elements.put("qbe_i_interface_des", "//*[contains(@id, 'pc1_afr_resId1_afr_c2::content')]");
        elements.put("qbe_i_ttoo", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c5::content')]");
        elements.put("qbe_i_ttoo_name", "//*[contains(@id, 'pc1_afr_resId1_afr_c3::content')]");
        elements.put("qbe_i_dest", "//*[contains(@id, 'pc1_afr_resId1_afr_resId1c7::content')]");
        elements.put("qbe_i_dest_desc", "//*[contains(@id, 'pc1_afr_resId1_afr_c4::content')]");
    }
}
