package screen.AT2BOOSA0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icastaneira on 17/05/2016.
 */
public class AT2BOOSA0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA0005Locators() {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //<editor-fold desc="AT2BOOSA1002">
        //SEARCH
        elements.put("boosa1002_search_b_icon", "//*[contains(@id, 'cb2::icon')]");
        elements.put("boosa1002_search_i_booking", "//*[contains(@id, 'it55::content')]");
        elements.put("boosa1002_search_b_search", "//*[contains(@id, '0:cb1header')]");

        elements.put("boosa1002_search_e_result", "//*[contains(@id, 'pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("boosa1002_search_result_b_actions", "//*[contains(@id, 'pc1:pdm12:dc_m1')]");
        elements.put("boosa1002_search_result_actions_b_graphic", "//*[contains(@id, 'pc1:pdm12:dc_cmi9')]/td[2]");
        //</editor-fold>

        //SEARCH
        elements.put("boosa0005_search_b_monthly", "//*[contains(@id, '1:cb1')]");
        elements.put("boosa0005_search_b_detail", "//*[contains(@id, '1:cb2')]");
        elements.put("boosa1002_search_b_search", "//*[contains(@id, '0:cb1header')]");

        //DETAIL
        elements.put("boosa0005_detail_b_close", "//*[contains(@id, 'd2::ok')]");

        elements.put("boosa0005_detail_of_units_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr/td[1]");
        elements.put("boosa0005_detail_of_units_e_result_no_data", "//*[contains(@id, 'pc1:resId1::db')]");

        elements.put("boosa0005_detail_of_units_result_e_from_date", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_till_date", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_n_booking", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_room", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_room_code", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_cod_car", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_general_name", "//*[contains(@id, 'pc1:resId1::db')]");
        elements.put("boosa0005_detail_of_units_result_e_included", "//*[contains(@id, 'pc1:resId1::db')]");

        elements.put("boosa0005_detail_of_units_query_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("boosa0005_detail_of_units_query_b_clear_qbe", "//*[contains(@id, 'pc1:resId1::ch::t')]/tbody/tr[2]/th/a");

        elements.put("boosa0005_detail_of_units_query_i_from_date", "//*[contains(@id, 'resId1:id3::content')]");
        elements.put("boosa0005_detail_of_units_query_i_till_date", "//*[contains(@id, 'resId1:id4::content')]");
        elements.put("boosa0005_detail_of_units_query_i_n_booking", "//*[contains(@id, '_pc1_afr_resId1_afr_c7::content')]");
        elements.put("boosa0005_detail_of_units_query_i_room", "//*[contains(@id, '_afr_pc1_afr_resId1_afr_c8::content')]");
        elements.put("boosa0005_detail_of_units_query_i_room_code", "//*[contains(@id, '_pc1_afr_resId1_afr_c9::content')]");
        elements.put("boosa0005_detail_of_units_query_i_cod_car", "//*[contains(@id, '_pc1_afr_resId1_afr_c2::content')]");
        elements.put("boosa0005_detail_of_units_query_i_general_name", "//*[contains(@id, '_pc1_afr_resId1_afr_c5::content')]");
        elements.put("boosa0005_detail_of_units_query_sel_included", "//*[contains(@id, 'resId1:soc3::content')]");
    }
}