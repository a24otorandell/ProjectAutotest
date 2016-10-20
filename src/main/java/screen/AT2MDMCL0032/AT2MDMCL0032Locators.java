package screen.AT2MDMCL0032;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 20/10/2016.
 */
public class AT2MDMCL0032Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0032Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("pricing_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("pricing_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("pricing_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("pricing_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]");
        elements.put("pricing_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("pricing_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("pricing_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("pricing_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("pricing_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_partner", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_partner", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_desc", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_group", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_group", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_type", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_type", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_aply", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_from", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_to", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_partner_p", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_agency", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_rappel", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_agent", "//*[contains(@id, 'qryId1:value100::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_group", "//*[contains(@id, 'codGrupoId::content')]");
        elements.put("add_lov_group", "//*[contains(@id, 'codGrupoId::lovIconId')]");
        elements.put("add_i_type", "//*[contains(@id, 'codTipoProdId::content')]");
        elements.put("add_lov_type", "//*[contains(@id, 'codTipoProdId::lovIconId')]");
        elements.put("add_i_apli_date", "//*[contains(@id, 'id5::content')]");
        elements.put("add_i_from", "//*[contains(@id, 'id6::content')]");
        elements.put("add_i_to", "//*[contains(@id, 'id4::content')]");
        elements.put("add_i_partner", "//*[contains(@id, 'it5::content')]");
        elements.put("add_i_agency", "//*[contains(@id, 'it6::content')]");
        elements.put("add_i_rappel", "//*[contains(@id, 'it10::content')]");
        elements.put("add_i_agent", "//*[contains(@id, 'it9::content')]");
        //QBE
        elements.put("qbe_i_group","//*[contains(@id, 'afr_c8::content')]");
        elements.put("qbe_i_prod","//*[contains(@id, 'afr_c9::content')]");
        elements.put("qbe_i_apli","//*[contains(@id, 'id1::content')]");
        elements.put("qbe_i_from","//*[contains(@id, 'id3::content')]");
        elements.put("qbe_i_to","//*[contains(@id, 'id2::content')]");
        elements.put("qbe_i_partner","//*[contains(@id, 'it11::content')]");
        elements.put("qbe_i_agency","//*[contains(@id, 'it12::content')]");
        elements.put("qbe_i_rappel","//*[contains(@id, 'it13::content')]");
        elements.put("qbe_i_agent","//*[contains(@id, 'it14::content')]");

/*        elements.put("qbe_i_group","./*//*[@id='pc1_afr_table1_afr_c8::content']");
        elements.put("qbe_i_prod","./*//*[@id='pc1_afr_table1_afr_c9::content']");
        elements.put("qbe_i_apli","./*//*[@id='pc1:table1:id1::content']");
        elements.put("qbe_i_from","./*//*[@id='pc1:table1:id3::content']");
        elements.put("qbe_i_to","./*//*[@id='pc1:table1:id2::content']");
        elements.put("qbe_i_partner","./*//*[@id='pc1:table1:it11::content']");
        elements.put("qbe_i_agency","./*//*[@id='pc1:table1:it12::content']");
        elements.put("qbe_i_rappel","./*//*[@id='pc1:table1:it13::content']");
        elements.put("qbe_i_agent","./*//*[@id='pc1:table1:it14::content']");*/
    }
}
