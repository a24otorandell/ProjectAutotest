package screen.AT2MDMSY1004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 08/11/2016.
 */
public class AT2MDMSY1004Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY1004Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("configuration_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("configuration_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("configuration_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("configuration_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("configuration_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi0')]/td[2]");
        elements.put("configuration_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("configuration_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("configuration_e_result", "//*[contains(@id, 'pc1:ReTVcCo::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configuration_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_config", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_currency", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_currency", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_company", "//*[contains(@id, 'pc1:pcgt2:empresaId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pc1:pcgt2:empresaId::lovIconId')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pc1:pcgt2:divisaId::content')]");
        elements.put("add_lov_currency", "//*[contains(@id, 'pc1:pcgt2:divisaId::lovIconId')]");
        elements.put("add_i_from_date", "//*[contains(@id, 'pc1:pcgt2:id4::content')]");
        elements.put("add_i_to_date", "//*[contains(@id, 'pc1:pcgt2:id3::content')]");
        elements.put("add_i_payment", "//*[contains(@id, 'pc1:pcgt2:divisaPagoId::content')]");
        elements.put("add_lov_payment", "//*[contains(@id, 'pc1:pcgt2:divisaPagoId::lovIconId')]");
        elements.put("add_i_vcc", "//*[contains(@id, 'pc1:pcgt2:operadorId::content')]");
        elements.put("add_lov_vcc", "//*[contains(@id, 'pc1:pcgt2:operadorId::lovIconId')]");
        elements.put("add_i_vcc2", "//*[contains(@id, 'pc1:pcgt2:operadorAltId::content')]");
        elements.put("add_lov_vcc2", "//*[contains(@id, 'pc1:pcgt2:operadorAltId::lovIconId')]");
        elements.put("add_i_percentage", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("add_i_max", "//*[contains(@id, 'pc1:pcgt2:it1::content')]");
        //QBE
        elements.put("qbe_i_config", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c1::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c2::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c3::content')]");
        elements.put("qbe_i_from_date", "//*[contains(@id, 'pc1:ReTVcCo:id1::content')]");
        elements.put("qbe_i_to_date", "//*[contains(@id, 'pc1:ReTVcCo:id2::content')]");
        elements.put("qbe_i_payment", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c6::content')]");
        elements.put("qbe_i_vcc", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c7::content')]");
        elements.put("qbe_i_vcc2", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c8::content')]");
        elements.put("qbe_i_percentage", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c9::content')]");
        elements.put("qbe_i_max", "//*[contains(@id, 'pc1_afr_ReTVcCo_afr_resId1c10::content')]");

    }
}
