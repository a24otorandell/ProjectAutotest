package screen.AT2MDMDE0015;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 24/10/2016.
 */
public class AT2MDMDE0015Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0015Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("b2b_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("b2b_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("b2b_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("b2b_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("b2b_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("b2b_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("b2b_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("b2b_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("b2b_e_records", "//*[contains(@id, 'pc1:31')]");
        elements.put("lov_i_altgenericinput2", "//*[contains(@id, '_afrLovInternalQueryId:value30::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_destination", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_agency", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_agency", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_receptive", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_b2b", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_b2b", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_zone", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_ck_active", "//*[contains(@id, 'qryId1:value60::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("add_i_destination", "//*[contains(@id, 'pcgt2:destinoId::content')]");
        elements.put("add_lov_destination", "//*[contains(@id, 'pcgt2:destinoId::lovIconId')]");
        elements.put("add_i_info_des", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_agency", "//*[contains(@id, 'pcgt2:codAgeExtId::content')]");
        elements.put("add_lov_agency", "//*[contains(@id, 'pcgt2:codAgeExtId::lovIconId')]");
        elements.put("add_i_info_age", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_i_receptive", "//*[contains(@id, 'pcgt2:secRecId::content')]");
        elements.put("add_lov_receptive", "//*[contains(@id, 'pcgt2:secRecId::lovIconId')]");
        elements.put("add_i_info_rec", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_i_b2b", "//*[contains(@id, 'pcgt2:seqDestB2bId::content')]");
        elements.put("add_lov_b2b", "//*[contains(@id, 'pcgt2:seqDestB2bId::lovIconId')]");
        elements.put("add_i_info_b2b", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_i_zone", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_i_intf", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        //QBE
        elements.put("qbe_sl_type", "//*[contains(@id, 'soc3::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_info_des", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_agency", "//*[contains(@id, 'it7::content')]");
        elements.put("qbe_i_info_age", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_i_receptive", "//*[contains(@id, 'it8::content')]");
        elements.put("qbe_i_info_rec", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_b2b", "//*[contains(@id, 'afr_resId1c7::content')]");
        elements.put("qbe_i_info_b2b", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_zone", "//*[contains(@id, 'it9::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'soc4::content')]");
    }
}

