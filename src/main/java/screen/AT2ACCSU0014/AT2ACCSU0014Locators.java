package screen.AT2ACCSU0014;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 14/10/2016.
 */
public class AT2ACCSU0014Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0014Locators(String enviroment) {
        setElements();
    }


    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("hotel_card_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("hotel_card_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("hotel_card_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("hotel_card_b_actions_b_audit_data", "//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("hotel_card_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("hotel_card_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("hotel_card_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("hotel_card_e_records", "//*[contains(@id, 'pc1:ot2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_hotel_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_destination", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_i_destination_name", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_i_country", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_i_country_name", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_area", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_ck_visible", "//*[contains(@id, 'qryId1:value70::content')]");
        //QBE
        elements.put("qbe_i_hotel_code", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_destination_name", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_country", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("qbe_i_country_name", "//*[contains(@id, 'afr_c7::content')]");
        elements.put("qbe_i_area", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_sl_visible", "//*[contains(@id, 'soc4::content')]");
        //EDIT
        elements.put("edit_i_hotel_code", "//*[contains(@id, 'pcgt1:it10::content')]");
        elements.put("edit_i_hotel", "//*[contains(@id, 'pcgt1:it12::content')]");
        elements.put("edit_i_destination", "//*[contains(@id, 'pcgt1:it9::content')]");
        elements.put("edit_i_destination_name", "//*[contains(@id, 'pcgt1:it8::content')]");
        elements.put("edit_i_country", "//*[contains(@id, 'pcgt1:it11::content')]");
        elements.put("edit_i_country_name", "//*[contains(@id, 'pcgt1:it14::content')]");
        elements.put("edit_i_area", "//*[contains(@id, 'pcgt1:it13::content')]");
        elements.put("edit_ck_visible", "//*[contains(@id, ':pcgt1:sbc2::content')]");
        elements.put("edit_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
    }
}
