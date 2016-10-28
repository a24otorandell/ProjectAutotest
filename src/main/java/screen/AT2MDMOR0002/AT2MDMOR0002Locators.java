package screen.AT2MDMOR0002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/10/2016.
 */
public class AT2MDMOR0002Locators {    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0002Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    private void setElements() {
        /**
         * TABLE BOOKING TYPES
         */
        //GENERALS
        elements.put("booking_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("booking_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("booking_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("booking_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("booking_b_actions_b_audit_data", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("booking_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("booking_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("booking_e_result", "//*[contains(@id, 'pc1:table1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("booking_e_records", "//*[contains(@id, 'pc1:ot31')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_booking_type", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_ck_groups", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_ck_internet", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_ck_retailer", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_ck_circuits", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_ck_lates", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_ck_island", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_ck_visible", "//*[contains(@id, 'qryId1:value70::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_booking_type", "//*[contains(@id, 'it1::content')]");
        elements.put("add_ck_groups", "//*[contains(@id, 'sbc10::content')]");
        elements.put("add_ck_internet", "//*[contains(@id, 'sbc9::content')]");
        elements.put("add_ck_retailer", "//*[contains(@id, 'sbc12::content')]");
        elements.put("add_ck_circuits", "//*[contains(@id, 'sbc8::content')]");
        elements.put("add_ck_lates", "//*[contains(@id, 'sbc11::content')]");
        elements.put("add_ck_island", "//*[contains(@id, 'sbc13::content')]");
        elements.put("add_ck_visible", "//*[contains(@id, 'sbc14::content')]");
        //QBE
        elements.put("qbe_i_booking_type", "//*[contains(@id, 'afr_c10::content')]");
        elements.put("qbe_sl_groups", "//*[contains(@id, 'soc4::content')]");
        elements.put("qbe_sl_internet", "//*[contains(@id, 'soc1::content')]");
        elements.put("qbe_sl_retailer", "//*[contains(@id, 'soc2::content')]");
        elements.put("qbe_sl_circuits", "//*[contains(@id, 'soc3::content')]");
        elements.put("qbe_sl_lates", "//*[contains(@id, 'soc5::content')]");
        elements.put("qbe_sl_island", "//*[contains(@id, 'soc6::content')]");
        elements.put("qbe_sl_visible", "//*[contains(@id, 'soc7::content')]");

        /**
         * TABLE BOOKING DESCRIPTION
         */
        //GENERALS
        elements.put("booking_des_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("booking_des_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("booking_des_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("booking_des_b_actions", "//*[contains(@id, 'pc2:pcgm2:dc_m1')]");
        elements.put("booking_des_b_actions_b_audit_data", "//*[contains(@id, 'pc2:pcgm2:dc_cmi1')]/td[2]");
        elements.put("booking_des_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("booking_des_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("booking_des_b_result", "//*[contains(@id, 'pc2:table2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("booking_des_e_records", "//*[contains(@id, 'pc2:ot3')]");
        //ADD
        elements.put("desc_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("desc_add_i_lang", "//*[contains(@id, 'sidiCodIdiomaId::content')]");
        elements.put("desc_add_lov_lang", "//*[contains(@id, 'sidiCodIdiomaId::lovIconId')]");
        elements.put("desc_add_i_description", "//*[contains(@id, 'it2::content')]");
        //QBE
        elements.put("qbe_i_lang", "//*[contains(@id, '_afr_c2::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, '_afr_c1::content')]");
    }
}
