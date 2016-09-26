package screen.AT2ACCOP0020;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 23/09/2016.
 */
public class AT2ACCOP0020Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0020Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //PAYMENT METHOD

        //ADD

        elements.put("payment_method_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("payment_method_add_i_payment_method_code", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("payment_method_add_i_payment_method_name", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("payment_method_add_lov_type", "//*[contains(@id, 'pcgt1:inputListOfValues1::lovIconId')]");
        elements.put("payment_method_add_i_type", "//*[contains(@id, 'pcgt1:inputListOfValues1::content')]");
        elements.put("payment_method_add_chb_enabled", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("payment_method_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //SEARCH

        elements.put("payment_method_se_lov_payment_method_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("payment_method_se_lov_payment_method_code_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("payment_method_se_i_payment_method_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("payment_method_se_y_payment_method_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("payment_method_se_lov_type", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("payment_method_se_lov_type_i_id", "//*[contains(@id, 'qryId1:value20::_afrLovInternalQueryId:value00::content')]");
        elements.put("payment_method_se_i_type", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("payment_method_se_sl_enabled", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("payment_method_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("payment_method_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("payment_method_se_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("payment_method_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("payment_method_ed_i_payment_method_code", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("payment_method_ed_i_payment_method_name", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("payment_method_ed_lov_type", "//*[contains(@id, 'pcgt1:inputListOfValues1::lovIconId')]");
        elements.put("payment_method_ed_i_type", "//*[contains(@id, 'pcgt1:inputListOfValues1::content')]");
        elements.put("payment_method_ed_chb_enabled", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("payment_method_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //QBE

        elements.put("payment_method_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("payment_method_qbe_i_payment_method_code", "//*[contains(@id, 'afr_t1_afr_c2::content')]");
        elements.put("payment_method_qbe_i_payment_method_name", "//*[contains(@id, 'afr_t1_afr_c4::content')]");
        elements.put("payment_method_qbe_i_type", "//*[contains(@id, 'afr_t1_afr_c3::content')]");
        elements.put("payment_method_qbe_e_type", "//*[contains(@id, 'typeId::content')]");
        elements.put("payment_method_qbe_sl_enabled", "//*[contains(@id, 'pc1:t1:soc1::content')]");

        //OTHER ACTIONS

        elements.put("payment_method_oa_b_deacht", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE

        elements.put("payment_method_del_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("payment_method_del_e_records", "//*[contains(@id, 'pc1:ot2')]");
        elements.put("payment_method_del_b_delete_yes", "//*[contains(@id, 'pcgt1:cbt1')]");


        //Go to

        elements.put("payment_method_mapping", "//*[contains(@id, '1:sdi2::disAcr')]");


        //PAYMEN METHOD MAPPING


        //ADD

        elements.put("payment_method_mapping_add_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("payment_method_mapping_add_lov_provider", "//*[contains(@id, 'pcgt2:inputListOfValues2::lovIconId')]");
        elements.put("payment_method_mapping_add_i_provider", "//*[contains(@id, 'pcgt2:inputListOfValues2::content')]");
        elements.put("payment_method_mapping_add_lov_ecp_payment_method_code", "//*[contains(@id, 'pcgt2:inputListOfValues3::lovIconId')]");
        elements.put("payment_method_mapping_add_i_ecp_payment_method_code", "//*[contains(@id, 'pcgt2:inputListOfValues3::content')]");
        elements.put("payment_method_mapping_add_i_psp_payment_method_code", "//*[contains(@id, 'pcgt2:it7::content')]");
        elements.put("payment_method_mapping_add_i_psp_payment_method_name", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("payment_method_mapping_add_chb_autorizable", "//*[contains(@id, 'pcgt2:sbc6::content')]");
        elements.put("payment_method_mapping_add_cdb_enabled", "//*[contains(@id, 'pcgt2:sbc4::content')]");
        elements.put("payment_method_mapping_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //SEARCH

        elements.put("payment_method_mapping_se_lov_provider", "//*[contains(@id, 'qryId2:value00::lovIconId')]");
        elements.put("payment_method_mapping_se_lov_provider_i_provider", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("payment_method_mapping_se_i_provider", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("payment_method_mapping_se_lov_ecp_payment_method_code", "//*[contains(@id, 'qryId2:value10::lovIconId')]");
        elements.put("payment_method_mapping_se_lov_ecp_payment_method_code_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("payment_method_mapping_se_i_ecp_payment_method_code", "//*[contains(@id, 'qryId2:value10::content')]");
        elements.put("payment_method_mapping_se_lov_psp_payment_method_code", "//*[contains(@id, 'qryId2:value20::lovIconId')]");
        elements.put("payment_method_mapping_se_lov_psp_payment_method_code_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("payment_method_mapping_se_i_psp_payment_method_code", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("payment_method_mapping_se_sl_autorizable", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("payment_method_mapping_se_sl_enabled", "//*[contains(@id, 'qryId2:value40::content')]");
        elements.put("payment_method_mapping_se_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("payment_method_mapping_se_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("payment_method_mapping_se_e_result", "//*[contains(@id, 'pc2:t5::db')]/table/tbody/tr[1]/td[1]");

        //EDIT

        elements.put("payment_method_mapping_ed_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("payment_method_mapping_ed_lov_provider", "//*[contains(@id, 'pcgt2:inputListOfValues2::lovIconId')]");
        elements.put("payment_method_mapping_ed_i_provider", "//*[contains(@id, 'pcgt2:inputListOfValues2::content')]");
        elements.put("payment_method_mapping_ed_lov_ecp_payment_method_code", "//*[contains(@id, 'pcgt2:inputListOfValues3::lovIconId')]");
        elements.put("payment_method_mapping_ed_i_ecp_payment_method_code", "//*[contains(@id, 'pcgt2:inputListOfValues3::content')]");
        elements.put("payment_method_mapping_ed_i_psp_payment_method_code", "//*[contains(@id, 'pcgt2:it7::content')]");
        elements.put("payment_method_mapping_ed_i_psp_payment_method_name", "//*[contains(@id, 'pcgt2:it6::content')]");
        elements.put("payment_method_mapping_ed_chb_autorizable", "//*[contains(@id, 'pcgt2:sbc6::content')]");
        elements.put("payment_method_mapping_ed_cdb_enabled", "//*[contains(@id, 'pcgt2:sbc4::content')]");
        elements.put("payment_method_mapping_ed_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //QBE

        elements.put("payment_method_mapping_qbe_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("payment_method_mapping_qbe_i_provider", "//*[contains(@id, 'afr_t5_afr_c8::content')]");
        elements.put("payment_method_mapping_qbe_i_ecp_payment_method_code", "//*[contains(@id, 'afr_t5_afr_c9::content')]");
        elements.put("payment_method_mapping_qbe_i_ecp_payment_method_name", "//*[contains(@id, 'afr_t5_afr_c6::content')]");
        elements.put("payment_method_mapping_qbe_i_psp_payment_method_code", "//*[contains(@id, 'afr_t5_afr_c7::content')]");
        elements.put("payment_method_mapping_qbe_i_psp_payment_method_name", "//*[contains(@id, 'afr_t5_afr_c11::content')]");
        elements.put("payment_method_mapping_qbe_sl_autorizable", "//*[contains(@id, 't5:soc2::content')]");
        elements.put("payment_method_mapping_qbe_sl_enabled", "//*[contains(@id, 't5:soc3::content')]");

        //OTHER ACTIONS

        elements.put("payment_method_mapping_oa_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE

        elements.put("payment_method_mapping_del_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("payment_method_mapping_del_b_delete_b_yes", "//*[contains(@id, 'pcgt2:cbt1')]");
        elements.put("payment_method_mapping_del_e_records", "//*[contains(@id, 'pc2:outputText2')]");


    }
}
