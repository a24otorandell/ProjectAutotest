package screen.AT2MDMDE0021;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMDE0021Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMDE0021Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("hotelbeds_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("hotelbeds_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("hotelbeds_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("hotelbeds_b_actions", "//*[contains(@id, 'pcgmc1:dc_m1')]");
        elements.put("hotelbeds_b_actions_b_audit_data", "//*[contains(@id, 'pcgmc1:dc_cmi1')]/td[2]");
        elements.put("hotelbeds_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("hotelbeds_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("hotelbeds_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("hotelbeds_e_records", "//*[contains(@id, 'pc1:outputText1')]");
        elements.put("lov_i_altgenericinput2", "//*[contains(@id, '_afrLovInternalQueryId:value30::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_destination", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_destination_desc", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_airport", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_airport", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_airport_desc", "//*[contains(@id, 'qryId1:value40::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_destination", "//*[contains(@id, 'pcgt1:codDestinoId::content')]");
        elements.put("add_lov_destination", "//*[contains(@id, 'pcgt1:codDestinoId::lovIconId')]");
        elements.put("add_i_destination_desc", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_airport", "//*[contains(@id, 'pcgt1:codAeropuertoId::content')]");
        elements.put("add_lov_airport", "//*[contains(@id, 'pcgt1:codAeropuertoId::lovIconId')]");
        elements.put("add_i_airport_desc", "//*[contains(@id, 'pcgt1:it4::content')]");
        //QBE
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_destination_desc", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_airport", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_airport_desc", "//*[contains(@id, 'afr_resId1c10::content')]");
    }
}
