package screen.AT2TRFSU0016;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 07/09/2016.
 */
public class AT2TRFSU0016Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0016Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("aditional_add_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("aditional_add_lov_suplements_type", "//*[contains(@id, 'pcgt2:codSuplId::lovIconId')]");
        elements.put("aditional_add_lov_table_i_bim", "//*[contains(@id, 'pcgt2:codSuplId_afrLovInternalTableId::db')]/table/tbody/tr[9]/td[1]");
        elements.put("aditional_add_i_suplements_type", "//*[contains(@id, 'pcgt2:codSuplId::content')]");
        elements.put("aditional_add_e_suplementss_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("aditional_add_sl_purcharse_or_sale", "//*[contains(@id, 'pcgt2:soc4::content')]");
        elements.put("aditional_add_lov_suplier_name", "//*[contains(@id, 'pcgt2:desProvId::lovIconId')]");
        elements.put("aditional_add_i_suplier_name", "//*[contains(@id, 'pcgt2:desProvId::content')]");
        elements.put("aditional_add_sl_person_or_unit", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("aditional_add_i_unit_price", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("aditional_add_lov_currency", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("aditional_add_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("aditional_add_lov_guide", "//*[contains(@id, 'pcgt2:codGuiaId::lovIconId')]");
        elements.put("aditional_add_i_guide", "//*[contains(@id, 'pcgt2:codGuiaId::content')]");
        elements.put("aditional_add_i_remarks", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("aditional_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //Search

        elements.put("aditional_se_lov_suplements_type", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("aditional_se_i_suplements_type", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("aditional_se_lov_suplements_type_i_suplement_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("aditional_se_sl_purcharse_or_sale", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("aditional_se_lov_suplier_name", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("aditional_se_lov_suplier_name_i_short_name", "//*[contains(@id, 'qryId1:value20::_afrLovInternalQueryId:value10::content')]");
        elements.put("aditional_se_i_suplier_name", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("aditional_se_sl_person_or_unit", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("aditional_se_i_unit_price", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("aditional_se_lov_currency", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("aditional_se_lov_currency_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("aditional_se_i_currency", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("aditional_se_lov_guide", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("aditional_se_lov_guide_i_code", "//*[contains(@id, 'value60::_afrLovInternalQueryId:value00::content')]");
        elements.put("aditional_se_i_guide", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("aditional_se_i_remarks", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("aditional_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("aditional_se_result", "//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("aditional_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");


        //Edit
        elements.put("aditional_ed_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("aditional_ed_lov_suplements_type", "//*[contains(@id, 'pcgt2:codSuplId::lovIconId')]");
        elements.put("aditional_ed_lov_table_i_bim", "//*[contains(@id, 'pcgt2:codSuplId_afrLovInternalTableId::db')]/table/tbody/tr[9]/td[1]");
        elements.put("aditional_ed_i_suplements_type", "//*[contains(@id, 'pcgt2:codSuplId::content')]");
        elements.put("aditional_ed_e_suplementss_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("aditional_ed_sl_purcharse_or_sale", "//*[contains(@id, 'pcgt2:soc4::content')]");
        elements.put("aditional_ed_lov_suplier_name", "//*[contains(@id, 'pcgt2:desProvId::lovIconId')]");
        elements.put("aditional_ed_i_suplier_name", "//*[contains(@id, 'pcgt2:desProvId::content')]");
        elements.put("aditional_ed_sl_person_or_unit", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("aditional_ed_i_unit_price", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("aditional_ed_lov_currency", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("aditional_ed_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("aditional_ed_lov_guide", "//*[contains(@id, 'pcgt2:codGuiaId::lovIconId')]");
        elements.put("aditional_ed_i_guide", "//*[contains(@id, 'pcgt2:codGuiaId::content')]");
        elements.put("aditional_ed_i_remarks", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("aditional_ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //Qbe
        elements.put("aditional_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("aditional_qbe_i_suplements_type", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_t1_afr_c9::content')]");
        elements.put("aditional_qbe_i_suplementss_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_t1_afr_c4::content')]");
        elements.put("aditional_qbe_sl_purcharse_or_sale", "//*[contains(@id, 't1:soc5::content')]");
        elements.put("aditional_qbe_i_suplier_name", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_t1_afr_c8::content')]");
        elements.put("aditional_qbe_sl_person_or_unit", "//*[contains(@id, 't1:soc6::content')]");
        elements.put("aditional_qbe_i_unit_price", "//*[contains(@id, 'afr_1_afr_pc1_afr_t1_afr_c7::content')]");
        elements.put("aditional_qbe_i_currency", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c6::content')]");
        elements.put("aditional_qbe_i_guide", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
        elements.put("aditional_qbe_i_remarks", "//*[contains(@id, 'pc1_afr_t1_afr_c2::content')]");

        //other actions

        elements.put("aditional_oc_b_actions", "//*[contains(@id, 'pdm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("aditional_oc_b_audit_data", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("aditional_oc_b_exit", "//*[contains(@id, 'dyntdc:r1:1:d62::close')]");
        elements.put("aditional_oc_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete

        elements.put("aditional_del_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("aditional_del_b_delete_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
        elements.put("aditional_del_records", "//*[contains(@id, 'pc1:ot2')]");


    }
}
