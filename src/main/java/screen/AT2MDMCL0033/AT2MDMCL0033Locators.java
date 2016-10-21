package screen.AT2MDMCL0033;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/10/2016.
 */
public class AT2MDMCL0033Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0033Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("agency_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("agency_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("agency_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("agency_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("agency_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("agency_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("agency_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("agency_e_result", "//*[contains(@id, 'pc1:politic::db')]/table/tbody/tr[1]/td[1]");
        elements.put("agency_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_to", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_to", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_to_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_group", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_group", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_finish_date", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_product", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_product", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_application_date", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_from", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_f_to", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_agency", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_rappel", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_agent", "//*[contains(@id, 'qryId1:value100::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_to", "//*[contains(@id, 'nomCortoTtooNameId::content')]");
        elements.put("add_lov_to", "//*[contains(@id, 'nomCortoTtooNameId::lovIconId')]");
        elements.put("add_i_group", "//*[contains(@id, 'codGrupoId::content')]");
        elements.put("add_lov_group", "//*[contains(@id, 'codGrupoId::lovIconId')]");
        elements.put("add_i_finish_date", "//*[contains(@id, 'id7::content')]");
        elements.put("add_i_product", "//*[contains(@id, 'codTipoProdId::content')]");
        elements.put("add_lov_product", "//*[contains(@id, 'codTipoProdId::lovIconId')]");
        elements.put("add_i_application_date", "//*[contains(@id, 'id8::content')]");
        elements.put("add_i_from", "//*[contains(@id, 'id5::content')]");
        elements.put("add_i_f_to", "//*[contains(@id, 'id6::content')]");
        elements.put("add_i_agency", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_rappel", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_agent", "//*[contains(@id, 'it7::content')]");
        //QBE
        elements.put("qbe_i_to", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_group", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_product", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_application_date", "//*[contains(@id, 'id2::content')]");
        elements.put("qbe_i_finish_date", "//*[contains(@id, 'id4::content')]");
        elements.put("qbe_i_from", "//*[contains(@id, 'id3::content')]");
        elements.put("qbe_i_f_to", "//*[contains(@id, 'id1::content')]");
        elements.put("qbe_i_agency", "//*[contains(@id, 'afr_resId1c8::content')]");
        elements.put("qbe_i_rappel", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_agent", "//*[contains(@id, 'afr_resId1c10::content')]");
    }
}
