package screen.AT2ACCSU0070;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 19/07/2016.
 */
@SuppressWarnings("UnusedParameters")
public class AT2ACCSU0070Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0070Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //<editor-fold desc="search">
        elements.put("search_b_search", "//*[contains(@id, 'cb1')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'msilov1:dc_it1::content')]");
        elements.put("search_lov_hotel", "//*[contains(@id, 'msilov1:dc_ctb1::icon')]");
        elements.put("search_b_delete_hotel", "//*[contains(@id, 'msilov1:dc_ctb3::icon')]");
        elements.put("search_e_hotel_selected", "//*[contains(@id, 'msilov1:dc_pgl4')]/div/span");
        elements.put("search_i_brand", "//*[contains(@id, 'msilov2:dc_it1::content')]");
        elements.put("search_lov_brand", "//*[contains(@id, 'msilov2:dc_ctb1::icon')]");
        elements.put("search_b_delete_brand", "//*[contains(@id, 'msilov2:dc_ctb3::icon')]");
        elements.put("search_e_brand_selected", "//*[contains(@id, 'msilov2:dc_pgl4')]/div/span");
        elements.put("search_i_cadena_hotel", "//*[contains(@id, 'msilov3:dc_it1::content')]");
        elements.put("search_lov_cadena_hotel", "//*[contains(@id, 'msilov3:dc_ctb1::icon')]");
        elements.put("search_b_delete_cadena_hotel", "//*[contains(@id, 'msilov3:dc_ctb3::icon')]");
        elements.put("search_e_cadena_hotel_selected", "//*[contains(@id, 'msilov3:dc_pgl4')]/div/span");
        elements.put("search_i_external_hotel", "//*[contains(@id, 'msilov4:dc_it1::content')]");
        elements.put("search_lov_external_hotel", "//*[contains(@id, 'msilov4:dc_ctb1::icon')]");
        elements.put("search_b_delete_external_hotel", "//*[contains(@id, 'msilov4:dc_ctb3::icon')]");
        elements.put("search_e_external_hotel_selected", "//*[contains(@id, 'msilov4:dc_pgl4')]/div/span");
        //</editor-fold>
        //<editor-fold desc="toolbar">
        elements.put("hotel_desc_b_expand", "//*[contains(@id, 'pc1:ctb3')]");
        elements.put("hotel_desc_b_collapse", "//*[contains(@id, 'pc1:ctb4')]");
        elements.put("hotel_desc_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("hotel_desc_b_go_up", "//*[contains(@id, 'pc1:_upTbr::icon')]");
        elements.put("hotel_desc_b_go_top", "//*[contains(@id, 'pc1:_tpTbr::icon')]");
        elements.put("hotel_desc_b_show_as_top", "//*[contains(@id, 'pc1:_shwTpTbr::icon')]");
        elements.put("hotel_desc_e_num_records", "//*[contains(@id, 'pc1:outputText2')]");
        //</editor-fold>
        //<editor-fold desc="records">
        elements.put("hotel_desc_e_record", "//*[contains(@id, 'pc1:tt1::db')]/table/tbody/tr/td[1]");
        elements.put("hotel_desc_e_plus_first", "//*[contains(@id, 'pc1:tt1:0::di')]");
        elements.put("hotel_desc_e_atlas_hotel_code",
                "//*[contains(@id, 'pc1:tt1::db')]/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("hotel_desc_e_atlas_hotel_name",
                "//*[contains(@id, 'pc1:tt1::db')]/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[4]");
        //</editor-fold>
    }
}