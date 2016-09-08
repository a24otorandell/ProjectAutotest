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

        elements.put("b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("add_lov", "//*[contains(@id, 'pcgt2:codSuplId::lovIconId')]");
        elements.put("add_lov_alc", "//*[contains(@id, 'pcgt2:codSuplId_afrLovInternalTableId::db')]/table/tbody/tr[9]/td[1]");
        elements.put("add_i_stype", "//*[contains(@id, 'pcgt2:codSuplId::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_ss_pursa", "//*[contains(@id, 'pcgt2:soc4::content')]");
        elements.put("add_lov2", "//*[contains(@id, 'pcgt2:desProvId::lovIconId')]");
        elements.put("add_i_supli", "//*[contains(@id, 'pcgt2:desProvId::content')]");
        elements.put("add_ss_perun", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("add_i_unit", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_lov3", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("add_lov4", "//*[contains(@id, 'pcgt2:codGuiaId::lovIconId')]");
        elements.put("add_i_guide", "//*[contains(@id, 'pcgt2:codGuiaId::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //Search

        elements.put("s_lov", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("s_i_additional", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("s_lov_suplement", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("s_ss_pursa", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("s_lov2", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("s_lov2_suplic", "//*[contains(@id, 'qryId1:value20::_afrLovInternalQueryId:value10::content')]");
        elements.put("s_i_supli", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("s_ss_perun", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("s_i_unit", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("s_lov3", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("s_lov3_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("s_i_curren", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("s_lov4", "//*[contains(@id, 'qryId1:value60::lovIconId')]");
        elements.put("s_lov4_code", "//*[contains(@id, 'value60::_afrLovInternalQueryId:value00::content')]");
        elements.put("s_i_guide", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("s_i_remarks", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("result", "//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("b_reset", "//*[contains(@id, 'qryId1::reset')]");


        //Edit
        elements.put("b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("ed_lov", "//*[contains(@id, 'pcgt2:codSuplId::lovIconId')]");
        elements.put("ed_lov_alc", "//*[contains(@id, 'pcgt2:codSuplId_afrLovInternalTableId::db')]/table/tbody/tr[9]/td[1]");
        elements.put("ed_i_stype", "//*[contains(@id, 'pcgt2:codSuplId::content')]");
        elements.put("ed_i_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("ed_ss_pursa", "//*[contains(@id, 'pcgt2:soc4::content')]");
        elements.put("ed_lov2", "//*[contains(@id, 'pcgt2:desProvId::lovIconId')]");
        elements.put("ed_i_supli", "//*[contains(@id, 'pcgt2:desProvId::content')]");
        elements.put("ed_ss_perun", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("ed_i_unit", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("ed_lov3", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("ed_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("ed_lov4", "//*[contains(@id, 'pcgt2:codGuiaId::lovIconId')]");
        elements.put("ed_i_guide", "//*[contains(@id, 'pcgt2:codGuiaId::content')]");
        elements.put("ed_i_remarks", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");


        //Qbe
        elements.put("b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("qbe_type", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_t1_afr_c9::content')]");
        elements.put("qbe_description", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_t1_afr_c4::content')]");
        elements.put("qbe_pursa", "//*[contains(@id, 't1:soc5::content')]");
        elements.put("qbe_suplier", "//*[contains(@id, 'afr_r1_afr_1_afr_pc1_afr_t1_afr_c8::content')]");
        elements.put("qbe_peruni", "//*[contains(@id, 't1:soc6::content')]");
        elements.put("qbe_unit", "//*[contains(@id, 'afr_1_afr_pc1_afr_t1_afr_c7::content')]");
        elements.put("qbe_currency", "//*[contains(@id, 'afr_pc1_afr_t1_afr_c6::content')]");
        elements.put("qbe_guide", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
        elements.put("qbe_remarks", "//*[contains(@id, 'pc1_afr_t1_afr_c2::content')]");

        //other actions

        elements.put("b_actions", "//*[contains(@id, 'pdm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("o_ac_auditdata", "//*[contains(@id, 'pdm2:dc_cmi1')]/td[2]");
        elements.put("b_ac_exit", "//*[contains(@id, 'dyntdc:r1:1:d62::close')]");
        elements.put("b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //delete

        elements.put("b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("b_del_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
        elements.put("records", "//*[contains(@id, 'pc1:ot2')]");

    }
}
