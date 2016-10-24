package screen.AT2MDMDE0013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMDE0013Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0013Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("b2b_b_add", "//*[contains(@id, 'pcgt:boton_add')]");
        elements.put("b2b_b_delete", "//*[contains(@id, 'pcgt:boton_remove')]");
        elements.put("b2b_b_edit", "//*[contains(@id, 'pcgt:boton_edit')]");
        elements.put("b2b_b_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("b2b_b_actions_b_audit_data", "//*[contains(@id, 'pcgm2:dc_cmi1')]/td[2]");
        elements.put("b2b_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("b2b_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("b2b_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("b2b_e_records", "//*[contains(@id, 'pc1:ot35')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_destination", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_area", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_area", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_area_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_external_supplier", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_external_supplier", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_external_name", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_b2b", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_lov_b2b", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("search_i_b2b_des", "//*[contains(@id, 'qryId1:value60::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt:btn_commitExit')]");
        elements.put("add_i_destination", "//*[contains(@id, 'pcgt:idesCodDestino1Id::content')]");
        elements.put("add_lov_destination", "//*[contains(@id, 'pcgt:idesCodDestino1Id::lovIconId')]");
        elements.put("add_i_area", "//*[contains(@id, 'pcgt:izgeSeqZonaGe1Id::content')]");
        elements.put("add_lov_area", "//*[contains(@id, 'pcgt:izgeSeqZonaGe1Id::lovIconId')]");
        elements.put("add_i_area_name", "//*[contains(@id, 'pc1:pcgt:it3::content')]");
        elements.put("add_i_external_supplier", "//*[contains(@id, 'pcgt:codInterfaceB2b1Id::content')]");
        elements.put("add_lov_external_supplier", "//*[contains(@id, 'pcgt:codInterfaceB2b1Id::lovIconId')]");
        elements.put("add_i_external_name", "//*[contains(@id, 'pc1:pcgt:desInter::content')]");
        elements.put("add_i_b2b", "//*[contains(@id, 'pcgt:seqDestinoB2b1Id::content')]");
        elements.put("add_lov_b2b", "//*[contains(@id, 'pcgt:seqDestinoB2b1Id::lovIconId')]");
        elements.put("add_i_b2b_des", "//*[contains(@id, 'pc1:pcgt:desDest::content')]");
        //QBE
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_c9::content')]");
        elements.put("qbe_i_area", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_area_name", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_external_supplier", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_external_name", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_b2b", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_b2b_des", "//*[contains(@id, 'afr_c7::content')]");
    }
}
