package screen.AT2TRFSU0005;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 01/09/2016.
 */
public class AT2TRFSU0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /* SEARCH */
        elements.put("search_i_grouping_area", "//*[contains(@id, 'Area:value00::content')]");
        elements.put("search_i_description", "//*[contains(@id, 'Area:value10::content')]");
        elements.put("search_b_search", "//*[contains(@id, 'Area::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'Area::reset')]");
        /* GROUPING AREA RECORDS */
        elements.put("ga_records_b_add", "//*[contains(@id,'pc1:pcgt1:dc_t1')]//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("ga_records_b_add_i_grouping_area", "//*[contains(@id, 'codAgrupPopup::content')]"); //same for edit
        elements.put("ga_records_b_add_i_description", "//*[contains(@id, 'it5::content')]"); //same for edit
        elements.put("ga_records_b_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]"); // same for edit
        elements.put("ga_records_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("ga_records_b_delete_b_ok", "//*[contains(@id, 'cbt1')]");
        elements.put("ga_records_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("ga_records_b_actions", "//*[contains(@id, 'pc1:pdm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("ga_records_b_actions_b_data_history", "//*[contains(@id, 'pc1:pdm2:dc_cmi1')]/td[2]");
        elements.put("ga_records_b_actions_b_data_history_b_ok", "//*[contains(@id, 'd1::close')]");
                /* GROUPING AREA QBE */
        elements.put("ga_records_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("ga_records_b_qbe_i_grouping_area", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("ga_records_b_qbe_i_description", "//*[contains(@id, 'afr_c1::content')]");

        elements.put("ga_records_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("ga_records_e_record", "//*[contains(@id, 'pc1:tabla::db')]/table/tbody/tr/td[1]");
        elements.put("ga_records_e_record_num", "//*[contains(@id, 'pc1:ot20')]");
        /* AREAS RECORDS */
        elements.put("area_records_b_add", "//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("area_records_b_add_i_area_code", "//*[contains(@id, 'pc2:pcgt2:gzonCodZonaId::content')]"); //same for edit
        elements.put("area_records_b_add_lov_area_code", "//*[contains(@id, 'pc2:pcgt2:gzonCodZonaId::lovIconId')]"); //same for edit
        elements.put("area_records_b_add_lov_area_code_i_area_code", "//*[contains(@id, 'pc2:pcgt2:gzonCodZonaId::_afrLovInternalQueryId:value00::content')]"); //same for edit
        elements.put("area_records_b_add_lov_area_code_i_area_description", "//*[contains(@id, 'pc2:pcgt2:gzonCodZonaId::_afrLovInternalQueryId:value10::content')]"); //same for edit
        elements.put("area_records_b_add_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]"); //same for edit
        elements.put("area_records_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("area_records_b_delete_b_ok", "//*[contains(@id, 'cbt1')]");
        elements.put("area_records_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("area_records_b_actions", "//*[contains(@id, 'pc2:pcgm2:dc_m1')]/div/table/tbody/tr/td[3]");
        elements.put("area_records_b_actions_b_data_history", "//*[contains(@id, 'pt1:dyntdc:r1:1:pc2:pcgm2:dc_cmi1')]/td[2]");
        elements.put("area_records_b_actions_b_data_history_b_ok", "//*[contains(@id, 'd4::close')]");
                /* AREAS QBE */
        elements.put("area_records_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("area_records_b_qbe_i_grouping_area", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("area_records_b_qbe_i_description", "//*[contains(@id, 'afr_c4::content')]");

        elements.put("area_records_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("area_records_e_record", "//*[contains(@id, 'pc2:tablaAreaGroupingArea::db')]/table/tbody/tr/td[1]");
        elements.put("area_records_e_record_num", "//*[contains(@id, 'pc2:ot5')]");

        /*elements.put("","//*[contains(@id, '')]");*/


    }
}