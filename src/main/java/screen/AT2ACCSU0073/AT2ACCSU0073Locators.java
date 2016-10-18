package screen.AT2ACCSU0073;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 06/10/2016.
 */
public class AT2ACCSU0073Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0073Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //BLOCK 1

        // Reason

        //SEARCH VISIBLE

        elements.put("only_visible","//*[contains(@id, 'sbc1::content')]");
        elements.put("search","//*[contains(@id, '1:cb1')]");
        elements.put("reset","//*[contains(@id, 'pc1:t1::ch::t')]/tbody/tr[2]/th/a");


        //ADD

        elements.put("reason_add_b_add","//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("reason_add_i_reason_code","//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("reason_add_i_description","//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("reason_add_ch_visible","//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("reason_add_b_save","//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //SEARCH

        elements.put("reason_se_b_qbe","//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("reason_se_i_reason_code","//*[contains(@id, 't1_afr_c2::content')]");
        elements.put("reason_se_i_description","//*[contains(@id, 't1_afr_c3::content')]");
        elements.put("reason_se_sl_visible","//*[contains(@id, 't1:socz21::content')]");
        elements.put("reason_se_e_first_result","//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("reason_se_e_secod_result","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[2]/td[1]");
        //EDIT

        elements.put("reason_ed_b_edit","//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("reason_ed_i_reason_code","//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("reason_ed_i_description","//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("reason_ed_ch_visible","//*[contains(@id, 'pcgt1:sbc5::content')]");
        elements.put("reasonr_ed_b_save","//*[contains(@id, 'pcgt1:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("reason_oa_b_actions","//*[contains(@id, 'pcgm2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("reason_oa_b_actions_b_data_history","//*[contains(@id, 'pcgm2:dc_cmi0')]/td[2]");
        elements.put("reason_oa_b_actions_b_data_history_b_ok","//*[contains(@id, 'pcgm2:d22::ok')]");
        elements.put("reason_oa_b_detach","//*[contains(@id, 'pc1:_dchTbr')]/a");

        //SUBREASON


        //ADD

        elements.put("subreason_add_b_add","//*[contains(@id, 'PCGenericToolbar1:boton_add')]");
        elements.put("subreason_add_i_subreason_code","//*[contains(@id, 'PCGenericToolbar1:it7::content')]");
        elements.put("subreason_add_i_description","//*[contains(@id, 'PCGenericToolbar1:it8::content')]");
        elements.put("subreason_add_ch_visible","//*[contains(@id, 'PCGenericToolbar1:sbc7::content')]");
        elements.put("subreason_add_b_save","//*[contains(@id, 'PCGenericToolbar1:btn_commitExit')]");


        //SEARCH

        elements.put("subreason_se_b_qbe","//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("subreason_se_i_subreason_code","//*[contains(@id, 'afr_t2_afr_c6::content')]");
        elements.put("subreason_se_i_description","//*[contains(@id, 'afr_t2_afr_c5::content')]");
        elements.put("subreason_se_ch_visible","//*[contains(@id, 'pc2:t2:soc1::content')]");
        elements.put("subreason_se_e_result","//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr/td[1]");

        //ED

        elements.put("subreason_ed_b_edit","//*[contains(@id, 'PCGenericToolbar1:boton_edit')]");
        elements.put("subreason_ed_i_subreason_code","//*[contains(@id, 'PCGenericToolbar1:it7::content')]");
        elements.put("subreason_ed_i_description","//*[contains(@id, 'PCGenericToolbar1:it8::content')]");
        elements.put("subreason_ed_ch_visible","//*[contains(@id, 'PCGenericToolbar1:sbc7::content')]");
        elements.put("subreason_ed_b_save","//*[contains(@id, 'PCGenericToolbar1:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("subreason_oa_b_actions","//*[contains(@id, 'PCGenericMenu1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("subreason_oa_b_actions_b_data_history","//*[contains(@id, 'PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("subreason_oa_b_actions_b_data_history_b_ok","//*[contains(@id, 'PCGenericMenu1:d22::ok')]");
        elements.put("subreason_oa_b_detach","//*[contains(@id, 'pc2:_dchTbr')]/a");


        //REASON DEPARTMENT

        //ADD
        elements.put("reason_department_add_b_add","//*[contains(@id, 'PCGenericToolbar2:boton_add')]");
        elements.put("reason_department_add_i_department_code","//*[contains(@id, 'PCGenericToolbar2:it3::content')]");
        elements.put("reason_department_add_i_description","//*[contains(@id, 'PCGenericToolbar2:it4::content')]");
        elements.put("reason_department_add_ch_visible","//*[contains(@id, 'PCGenericToolbar2:sbc6::content')]");
        elements.put("reason_department_add_b_save","//*[contains(@id, 'PCGenericToolbar2:btn_commitExit')]");


        //SEARCH
        elements.put("reason_department_se_b_qbe","//*[contains(@id, 'pc3:_qbeTbr')]/a");
        elements.put("reason_department_se_i_department_code","//*[contains(@id, 'afr_t3_afr_c8::content')]");
        elements.put("reason_department_se_i_description","//*[contains(@id, 'afr_t3_afr_c9::content')]");
        elements.put("reason_department_se_ch_visible","//*[contains(@id, 'pc3:t3:soc2::content')]");
        elements.put("reason_department_se_e_result","//*[contains(@id, 'pc3:t3::db')]/table/tbody/tr[1]/td[1]");

        //ED
        elements.put("reason_department_ed_b_edit","//*[contains(@id, 'PCGenericToolbar2:boton_edit')]");
        elements.put("reason_department_ed_i_department_code","//*[contains(@id, 'PCGenericToolbar2:it3::content')]");
        elements.put("reason_department_ed_i_description","//*[contains(@id, 'PCGenericToolbar2:it4::content')]");
        elements.put("reason_department_ed_ch_visible","//*[contains(@id, 'PCGenericToolbar2:sbc6::content')]");
        elements.put("reason_department_ed_b_save","//*[contains(@id, 'PCGenericToolbar2:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("reason_department_oa_b_actions","//*[contains(@id, 'PCGenericMenu2:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("reason_department_oa_b_actions_b_data_history","//*[contains(@id, 'PCGenericMenu2:dc_cmi0')]/td[2]");
        elements.put("reason_department_oa_b_actions_b_data_history_b_ok","//*[contains(@id, 'PCGenericMenu2:d22::ok')]");
        elements.put("reason_department_oa_b_detach","//*[contains(@id, 'pc3:_dchTbr')]/a");

        //DELETE
        elements.put("reason_department_del_b_delete","//*[contains(@id, 'PCGenericToolbar2:boton_remove')]");
        elements.put("reason_department_del_e_records","//*[contains(@id, 'outputText5')]");
        elements.put("reason_department_del_b_del_ok","//*[contains(@id, 'PCGenericToolbar2:cbt1')]");


        //SUBREASON DEPARTMENT

        //ADD
        elements.put("subreason_department_add_b_add","//*[contains(@id, 'PCGenericToolbar3:boton_add')]");
        elements.put("subreason_department_add_lov_department_code","//*[contains(@id, 'PCGenericToolbar3:codDepart1Id::lovIconId')]");
        elements.put("subreason_department_add_i_department_code","//*[contains(@id, 'PCGenericToolbar3:codDepart1Id::content')]");
        elements.put("subreason_department_add_lov_department_code_i_code","//*[contains(@id, 'PCGenericToolbar3:codDepart1Id::_afrLovInternalQueryId:value00::content')]");
        elements.put("subreason_department_add_lov_reason_code","//*[contains(@id, 'PCGenericToolbar3:codRazon1Id::lovIconId')]");
        elements.put("subreason_department_add_i_reason_code","//*[contains(@id, 'PCGenericToolbar3:codRazon1Id::content')]");
        elements.put("subreason_department_add_lov_reason_code_i_code","//*[contains(@id, 'PCGenericToolbar3:codRazon1Id::_afrLovInternalQueryId:value00::content')]");
        elements.put("subreason_department_add_b_save","//*[contains(@id, 'PCGenericToolbar3:btn_commitExit')]");


        //SEARCH
        elements.put("subreason_department_se_b_qbe","//*[contains(@id, 'pc4:_qbeTbr')]/a");
        elements.put("subreason_department_se_i_reason_code","//*[contains(@id, 'afr_t4_afr_c11::content')]");
        elements.put("subreason_department_se_i_department_code","//*[contains(@id, 'pc4_afr_t4_afr_c10::content')]");
        elements.put("subreason_department_e_result","//*[contains(@id, 'pc4:t4::db')]/table/tbody/tr/td[1]");

        //ED
        elements.put("subreason_department_ed_b_edit","//*[contains(@id, 'pc4:PCGenericToolbar3:boton_edit')]");
        elements.put("subreason_department_ed_lov_department_code","//*[contains(@id, 'PCGenericToolbar3:codDepart1Id::lovIconId')]");
        elements.put("subreason_department_ed_i_department_code","//*[contains(@id, 'PCGenericToolbar3:codDepart1Id::content')]");
        elements.put("subreason_department_ed_lov_department_code_i_code","//*[contains(@id, 'PCGenericToolbar3:codDepart1Id::_afrLovInternalQueryId:value00::content')]");
        elements.put("subreason_department_ed_lov_reason_code","//*[contains(@id, 'PCGenericToolbar3:codRazon1Id::lovIconId')]");
        elements.put("subreason_department_ed_i_reason_code","//*[contains(@id, 'PCGenericToolbar3:codRazon1Id::content')]");
        elements.put("subreason_department_ed_lov_reason_code_i_code","//*[contains(@id, 'PCGenericToolbar3:codRazon1Id::_afrLovInternalQueryId:value00::content')]");
        elements.put("subreason_department_ed_b_save","//*[contains(@id, 'PCGenericToolbar3:btn_commitExit')]");


        //OTHER ACTIONS
        elements.put("subreason_department_oa_b_actions","//*[contains(@id, 'PCGenericMenu3:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("subreason_department_oa_b_actions_b_data_history","//*[contains(@id, 'pc4:PCGenericMenu3:dc_cmi0')]/td[2]");
        elements.put("subreason_department_oa_b_actions_b_data_history_b_ok","//*[contains(@id, 'PCGenericMenu3:d22::ok')]");
        elements.put("subreason_department_oa_b_detach","//*[contains(@id, 'pc4:_dchTbr')]/a");

        //DELETE
        elements.put("subreason_department_del_b_delete","//*[contains(@id, 'PCGenericToolbar3:boton_remove')]");
        elements.put("subreason_department_del_e_records","//*[contains(@id, 'outputText7')]");
        elements.put("subreason_department_del_b_del_ok","//*[contains(@id, 'PCGenericToolbar3:cbt1')]");






    }
}
