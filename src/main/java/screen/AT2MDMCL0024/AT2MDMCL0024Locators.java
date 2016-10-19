package screen.AT2MDMCL0024;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 19/10/2016.
 */
public class AT2MDMCL0024Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0024Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("commision_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("commision_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("commision_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("commision_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("commision_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("commision_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("commision_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("commision_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("commision_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_atlas", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_short", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_short", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_sap", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_sap", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_to", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_date_from", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_date_to", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_sl_commision_type", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_commision_margin", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_ck_bank", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_ck_excl", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_ck_incl", "//*[contains(@id, 'qryId1:value100::content')]");
        //ADD
        elements.put("add_i_atlas", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_i_short", "//*[contains(@id, 'pcgt2:nomCortoTtooId::content')]");
        elements.put("add_lov_short", "//*[contains(@id, 'pcgt2:nomCortoTtooId::lovIconId')]");
        elements.put("add_i_sap", "//*[contains(@id, 'pcgt2:codProve1Id::content')]");
        elements.put("add_lov_sap", "//*[contains(@id, 'pcgt2:codProve1Id::lovIconId')]");
        elements.put("add_i_to", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_date_from", "//*[contains(@id, 'pcgt2:id3::content')]");
        elements.put("add_i_date_to", "//*[contains(@id, 'pcgt2:id4::content')]");
        elements.put("add_sl_commision_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_i_commision_margin", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_ck_bank", "//*[contains(@id, 'pcgt2:sbc2::content')]");
        elements.put("add_ck_excl", "//*[contains(@id, 'pcgt2:sbc5::content')]");
        elements.put("add_ck_incl", "//*[contains(@id, 'pcgt2:sbc6::content')]");
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        //QBE
        elements.put("qbe_i_atlas", "//*[contains(@id, 'afr_c7::content')]");
        elements.put("qbe_i_short", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_sap", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_supplier", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_date_from", "//*[contains(@id, 't1:id1::content')]");
        elements.put("qbe_i_date_to", "//*[contains(@id, 't1:id2::content')]");
        elements.put("qbe_sl_commision_type", "//*[contains(@id, 't1:soc2::content')]");
        elements.put("qbe_i_commision_margin", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_sl_bank", "//*[contains(@id, 't1:soc7::content')]");
        elements.put("qbe_sl_excl", "//*[contains(@id, 't1:soc3::content')]");
        elements.put("qbe_sl_incl", "//*[contains(@id, 't1:soc6::content')]");
    }
}
