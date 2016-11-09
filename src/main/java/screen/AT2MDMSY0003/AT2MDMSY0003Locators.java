package screen.AT2MDMSY0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMSY0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_ATLAS_parameters", "//*[contains(@id, '1:sdi1::disAcr')]");
                elements.put("MDM_b_general_parameters", "//*[contains(@id, '1:sdi2::disAcr')]");
            //PARAMETERS
                elements.put("MDM_prmt_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_prmt_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_prmt_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_prmt_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_prmt_b_actions", "//*[contains(@id, 'pc1:PCGenericMenu5:dc_m1')]");
                elements.put("MDM_prmt_b_actions_audit_data", "//*[contains(@id, 'pc1:PCGenericMenu5:dc_cmi0')]/td[2]");
                elements.put("MDM_prmt_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_prmt_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_prmt_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_prmt_e_records", "//*[contains(@id, 'pc1:ot17')]");
            //PARAMETERS BY COMPANY
                elements.put("MDM_prmtbc_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
                elements.put("MDM_prmtbc_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
                elements.put("MDM_prmtbc_b_delete_ok", "//*[contains(@id, 'pc3:pcgt3:cbt1')]");
                elements.put("MDM_prmtbc_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
                elements.put("MDM_prmtbc_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
                elements.put("MDM_prmtbc_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
                elements.put("MDM_prmtbc_e_result", "//*[contains(@id, 'pc3:resId2::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_prmtbc_e_records", "//*[contains(@id, 'pc3:ot21')]");
            //GENERAL PARAMETERS
                elements.put("MDM_gprmt_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_gprmt_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_gprmt_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_gprmt_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_gprmt_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_gprmt_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_gprmt_e_result", "//*[contains(@id, 'pc2:tableId1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_gprmt_e_records", "//*[contains(@id, 'pc2:ot5')]");
        //ADD|MODIFY
            //PARAMETERS
                elements.put("add_prmt_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_prmt_i_parameter", "//*[contains(@id, 'pcgt1:it1::content')]");
                elements.put("add_prmt_i_value", "//*[contains(@id, 'pcgt1:it2::content')]");
                elements.put("add_prmt_i_description", "//*[contains(@id, 'pcgt1:it3::content')]");
            //PARAMETERS BY COMPANY
                elements.put("add_prmtbc_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
                elements.put("add_prmtbc_i_company", "//*[contains(@id, 'pcgt3:codEmpId::content')]");
                elements.put("add_prmtbc_lov_company", "//*[contains(@id, 'pcgt3:codEmpId::lovIconId')]");
                elements.put("add_prmtbc_company_result", "//*[contains(@id, 'pcgt3:codEmpId_afrLovInternalTableId::db')]/table/tbody/tr[10]/td[1]");
                //elements.put("add_prmtbc_company_altresult", "//*[contains(@id, 'pcgt3:codEmpId_afrLovInternalTableId::db')]/table/tbody/tr[11]/td[1]");
                elements.put("add_prmtbc_e_company_name", "//*[contains(@id, 'pcgt3:it12::content')]");
                elements.put("add_prmtbc_i_office", "//*[contains(@id, 'pcgt3:transSeqRec1Id::content')]");
                elements.put("add_prmtbc_lov_office", "//*[contains(@id, 'pcgt3:transSeqRec1Id::lovIconId')]");
                elements.put("add_prmtbc_e_office_name", "//*[contains(@id, 'pcgt3:it14::content')]");
                elements.put("add_prmtbc_i_parameter", "//*[contains(@id, 'pcgt3:it13::content')]");
                elements.put("add_prmtbc_i_value", "//*[contains(@id, 'pcgt3:it15::content')]");
                elements.put("add_prmtbc_i_description", "//*[contains(@id, 'pcgt3:it17::content')]");
            //GENERAL PARAMETERS
                elements.put("add_gprmt_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_gprmt_i_parameters_code", "//*[contains(@id, 'pcgt2:it10::content')]");
                elements.put("add_gprmt_sl_parameters_type", "//*[contains(@id, 'pcgt2:soc1::content')]");
                elements.put("add_gprmt_i_supplier", "//*[contains(@id, 'pcgt2:it9::content')]");
                elements.put("add_gprmt_i_description", "//*[contains(@id, 'pcgt2:it8::content')]");
                elements.put("add_gprmt_i_numeric_value", "//*[contains(@id, 'pcgt2:it5::content')]");
                elements.put("add_gprmt_i_non_numeric_value", "//*[contains(@id, 'pcgt2:it11::content')]");
        //SEARCH
            //PARAMETERS
                elements.put("search_prmt_b_search", "//*[contains(@id, 'qryId1::search')]");
                elements.put("search_prmt_b_reset", "//*[contains(@id, 'qryId1::reset')]");
                elements.put("search_prmt_i_parameter", "//*[contains(@id, 'qryId1:value00::content')]");
                elements.put("search_prmt_i_value", "//*[contains(@id, 'qryId1:value10::content')]");
                elements.put("search_prmt_i_description", "//*[contains(@id, 'qryId1:value20::content')]");
            //PARAMETERS BY COMPANY
                elements.put("search_prmtbc_b_search", "//*[contains(@id, 'qryId2::search')]");
                elements.put("search_prmtbc_b_reset", "//*[contains(@id, 'qryId2::reset')]");
                elements.put("search_prmtbc_i_company", "//*[contains(@id, 'qryId2:value00::content')]");
                elements.put("search_prmtbc_lov_company", "//*[contains(@id, 'qryId2:value00::lovIconId')]");
                elements.put("search_prmtbc_i_company_name", "//*[contains(@id, 'qryId2:value10::content')]");
                elements.put("search_prmtbc_i_office", "//*[contains(@id, 'qryId2:value20::content')]");
                elements.put("search_prmtbc_lov_office", "//*[contains(@id, 'qryId2:value20::lovIconId')]");
                elements.put("search_prmtbc_i_office_name", "//*[contains(@id, 'qryId2:value30::content')]");
                elements.put("search_prmtbc_i_parameter", "//*[contains(@id, 'qryId2:value40::content')]");
                elements.put("search_prmtbc_i_value", "//*[contains(@id, 'qryId2:value50::content')]");
                elements.put("search_prmtbc_i_description", "//*[contains(@id, 'qryId2:value60::content')]");
            //GENERAL PARAMETERS
                elements.put("search_gprmt_b_search", "//*[contains(@id, 'q1::search')]");
                elements.put("search_gprmt_b_reset", "//*[contains(@id, 'q1::reset')]");
                elements.put("search_gprmt_i_parameters_code", "//*[contains(@id, 'q1:value00::content')]");
                elements.put("search_gprmt_sl_parameters_type", "//*[contains(@id, 'q1:value10::content')]");
                elements.put("search_gprmt_i_supplier", "//*[contains(@id, 'q1:value20::content')]");
                elements.put("search_gprmt_i_description", "//*[contains(@id, 'q1:value30::content')]");
                elements.put("search_gprmt_i_numeric_value", "//*[contains(@id, 'q1:value40::content')]");
                elements.put("search_gprmt_i_non_numeric_value", "//*[contains(@id, 'q1:value50::content')]");
        //QBE
            //PARAMETERS
                elements.put("qbe_prmt_i_parameter", "//*[contains(@id, 'afr_resId1_afr_resId1c1::content')]");
                elements.put("qbe_prmt_i_value", "//*[contains(@id, 'afr_resId1_afr_resId1c2::content')]");
            //PARAMETERS BY COMPANY
                elements.put("qbe_prmtbc_i_company", "//*[contains(@id, 'afr_resId2_afr_c24::content')]");
                elements.put("qbe_prmtbc_i_company_name", "//*[contains(@id, 'afr_resId2_afr_c5::content')]");
                elements.put("qbe_prmtbc_i_office", "//*[contains(@id, 'afr_resId2_afr_c8::content')]");
                elements.put("qbe_prmtbc_i_office_name", "//*[contains(@id, 'afr_resId2_afr_c6::content')]");
                elements.put("qbe_prmtbc_i_parameter", "//*[contains(@id, 'afr_resId2_afr_c7::content')]");
                elements.put("qbe_prmtbc_i_value", "//*[contains(@id, 'afr_resId2_afr_c2::content')]");
            //GENERAL PARAMETERS
                elements.put("qbe_gprmt_i_parameters_code", "//*[contains(@id, 'afr_tableId1_afr_c11::content')]");
                elements.put("qbe_gprmt_sl_parameters_type", "//*[contains(@id, 'pc2:tableId1:soc7::content')]");
                elements.put("qbe_gprmt_i_supplier", "//*[contains(@id, 'afr_tableId1_afr_resId1c3::content')]");
                elements.put("qbe_gprmt_i_description", "//*[contains(@id, 'afr_tableId1_afr_resId1c4::content')]");
    }
}