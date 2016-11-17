package screen.AT2MDMSP0031;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 16/11/2016.
 */
public class AT2MDMSP0031Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0031Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("suppliers_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("suppliers_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("suppliers_b_actions", "//*[contains(@id, 'pcgm19:dc_m1')]");
        elements.put("suppliers_b_actions_audit_data", "//*[contains(@id, 'pcgm19:dc_cmi0')]/td[2]");
        elements.put("suppliers_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("suppliers_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("suppliers_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("suppliers_e_records", "//*[contains(@id, 'pc1:ot22')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_supplier", "//*[contains(@id, 'value00::content')]");
        elements.put("search_lov_supplier", "//*[contains(@id, 'value00::lovIconId')]");
        elements.put("search_i_commercial_name", "//*[contains(@id, 'value10::content')]");
        elements.put("search_sl_service", "//*[contains(@id, 'value20::content')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'value30::content')]");
        elements.put("search_lov_hotel", "//*[contains(@id, 'value30::lovIconId')]");
        elements.put("search_i_url", "//*[contains(@id, 'value50::content')]");
        elements.put("search_i_client_code", "//*[contains(@id, 'value60::content')]");
        elements.put("search_ck_active", "//*[contains(@id, 'value70::content')]");
        elements.put("search_ck_send", "//*[contains(@id, 'value80::content')]");
        elements.put("search_i_mail", "//*[contains(@id, 'value90::content')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_supplier", "//*[contains(@id, 'codProvSapId::content')]");
        elements.put("add_lov_supplier", "//*[contains(@id, 'codProvSapId::lovIconId')]");
        elements.put("add_i_comercial", "//*[contains(@id, 'pcgt2:it5::content')]");
        elements.put("add_sl_service", "//*[contains(@id, 'soc4::content')]");
        elements.put("add_i_hotel", "//*[contains(@id, 'seqHotelId::content')]");
        elements.put("add_lov_hotel", "//*[contains(@id, 'seqHotelId::lovIconId')]");
        elements.put("add_i_hotel_desc", "//*[contains(@id, 'pcgt2:it9::content')]");
        elements.put("add_i_url", "//*[contains(@id, 'it11::content')]");
        elements.put("add_i_client_code", "//*[contains(@id, 'it3::content')]");
        elements.put("add_ck_active", "//*[contains(@id, 'pcgt2:sbc1::content')]");
        elements.put("add_ck_send", "//*[contains(@id, 'pcgt2:sbc2::content')]");
        elements.put("add_i_mail", "//*[contains(@id, 'pcgt2:it1::content')]");
        //QBE
        elements.put("qbe_i_supplier", "//*[contains(@id, 'pc1_afr_resId1_afr_c5::content')]");
        elements.put("qbe_i_comercial", "//*[contains(@id, 'pc1_afr_resId1_afr_c9::content')]");
        elements.put("qbe_sl_service", "//*[contains(@id, 'resId1:wxq4::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'pc1_afr_resId1_afr_c4::content')]");
        elements.put("qbe_i_hotel_desc", "//*[contains(@id, 'pc1_afr_resId1_afr_c10::content')]");
        elements.put("qbe_i_url", "//*[contains(@id, 'pc1_afr_resId1_afr_c11::content')]");
        elements.put("qbe_i_client_code", "//*[contains(@id, 'pc1_afr_resId1_afr_c7::content')]");
        elements.put("qbe_sl_active", "//*[contains(@id, 'resId1:soc6::content')]");
        elements.put("qbe_sl_send", "//*[contains(@id, 'resId1:soc5::content')]");
    }
}
