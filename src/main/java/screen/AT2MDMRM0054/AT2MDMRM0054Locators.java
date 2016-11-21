package screen.AT2MDMRM0054;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 18/11/2016.
 */
public class AT2MDMRM0054Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0054Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("query_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("query_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("query_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("query_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("query_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("element_chek", "//*[contains(@id, 'pc1:t1:0:sbc1::content')]/span/img");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'r1:1:cb1')]");
        elements.put("search_i_public_date_from", "//*[contains(@id, 'id3::content')]");
        elements.put("search_i_public_date_to", "//*[contains(@id, 'id4::content')]");
        elements.put("search_i_service_date_from", "//*[contains(@id, 'id2::content')]");
        elements.put("search_i_service_date_to", "//*[contains(@id, 'id1::content')]");
        elements.put("search_i_destination_", "//*[contains(@id, 'codDestinoId::content')]");
        elements.put("search_lov_destination", "//*[contains(@id, 'codDestinoId::lovIconId')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'nomCortoId::content')]");
        elements.put("search_lov_hotel", "//*[contains(@id, 'nomCortoId::lovIconId')]");
        //QBE
        elements.put("qbe_i_hotel", "//*[contains(@id, 'pc1_afr_t1_afr_c11::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'pc1_afr_t1_afr_c13::content')]");
        elements.put("qbe_i_date_from", "//*[contains(@id, 'pc1:t1:id5::content')]");
        elements.put("qbe_i_date_to", "//*[contains(@id, 'pc1:t1:id6::content')]");
        elements.put("qbe_i_market", "//*[contains(@id, 'pc1_afr_t1_afr_c6::content')]");
        elements.put("qbe_i_days", "//*[contains(@id, 'pc1_afr_t1_afr_c9::content')]");
        elements.put("qbe_i_amount", "//*[contains(@id, 'pc1_afr_t1_afr_c8::content')]");
        elements.put("qbe_i_currency", "//*[contains(@id, 'pc1_afr_t1_afr_c1::content')]");
        elements.put("qbe_i_contr_name", "//*[contains(@id, 'pc1_afr_t1_afr_c12::content')]");
        elements.put("qbe_i_contr_number", "//*[contains(@id, 'pc1_afr_t1_afr_c7::content')]");
        elements.put("qbe_i_liberate", "//*[contains(@id, 't1:soc55::content')]");
        elements.put("qbe_i_rate", "//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        elements.put("qbe_i_public", "//*[contains(@id, 't1:id10::content')]");
    }
}
