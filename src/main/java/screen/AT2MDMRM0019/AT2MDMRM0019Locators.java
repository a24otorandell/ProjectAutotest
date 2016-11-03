package screen.AT2MDMRM0019;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 02/11/2016.
 */
public class AT2MDMRM0019Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0019Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("hotel_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("hotel_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("hotel_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("hotel_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]");
        elements.put("hotel_b_actions_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("hotel_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("hotel_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("hotel_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("hotel_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_sequence", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_lov_sequence", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_desc", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_classification", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_order", "//*[contains(@id, 'qryId1:value50::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_sequence", "//*[contains(@id, 'pcgt2:seqHotelId::content')]");
        elements.put("add_lov_sequence", "//*[contains(@id, 'pcgt2:seqHotelId::lovIconId')]");
        elements.put("add_i_hotel", "//*[contains(@id, 'pcgt2:it2::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt2:codInterfaceId::lovIconId')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt2:it4::content')]");
        elements.put("add_i_classification", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("add_i_order", "//*[contains(@id, 'pcgt2:it1::content')]");
        //QBE
        elements.put("qbe_i_sequence", "//*[contains(@id, '_pc1_afr_t1_afr_c6::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, '_pc1_afr_t1_afr_c3::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, '_pc1_afr_t1_afr_c5::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, '_pc1_afr_t1_afr_c7::content')]");
        elements.put("qbe_i_classification", "//*[contains(@id, '_pc1_afr_t1_afr_c2::content')]");
        elements.put("qbe_i_order", "//*[contains(@id, '_pc1_afr_t1_afr_c4::content')]");
    }
}
