package screen.AT2ACCOP0021;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 26/09/2016.
 */
public class AT2ACCOP0021Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0021Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //TEMPLATE MANAGEMENT

        //ADD

        elements.put("template_management_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("template_management_add_i_template_code", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("template_management_add_i_template_name", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("template_management_add_cb_enabled", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("template_management_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //SEARCH

        elements.put("template_management_se_lov_template_code", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("template_management_se_lov_template_code_i_template", "//*[contains(@id, 'qryId1:value00::_afrLovInternalQueryId:value00::content')]");
        elements.put("template_management_se_i_template_code", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("template_management_se_i_template_name", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("template_management_se_sl_enabled", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("template_management_se_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("template_management_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("template_management_se_e_result", "//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");


        //EDIT

        elements.put("template_management_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("template_management_ed_i_template_code", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("template_management_ed_i_template_name", "//*[contains(@id, 'pcgt1:it5::content')]");
        elements.put("template_management_ed_cb_enabled", "//*[contains(@id, 'pcgt1:sbc1::content')]");
        elements.put("template_management_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");

        //QBE


        elements.put("template_management_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("template_management_qbe_i_template_code", "//*[contains(@id, 't1_afr_c3::content')]");
        elements.put("template_management_qbe_i_template_name", "//*[contains(@id, 't1_afr_c1::content')]");
        elements.put("template_management_qbe_sl_enabled", "//*[contains(@id, 't1:soc1::content')]");

        //OTHER ACTIONS

        elements.put("template_management_oa_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");

        //DELETE


        elements.put("template_management_del_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("template_management_del_b_delete_ok", "//*[contains(@id, 'pcgt1:cbt1')]");
        elements.put("template_management_del_e_record", "//*[contains(@id, 'pc1:outputText1')]");


        //GO TO
        elements.put("go_to_template_mapping_management", "//*[contains(@id, '1:sdi1::disAcr')]");
        elements.put("go_to_template_management","//*[contains(@id, '1:sdi8::disAcr')]");



        //TEMPLATE MAPPING MANAGEMENT


        //ADD

        elements.put("template_mapping_add_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("template_mapping_add_lov_pc_template_code", "//*[contains(@id, 'pcgt2:pcTemplateCode1Id::lovIconId')]");
        elements.put("template_mapping_add_i_pc_template_code", "//*[contains(@id, 'pcgt2:pcTemplateCode1Id::content')]");
        elements.put("template_mapping_add_lov_provider", "//*[contains(@id, 'pc2:pcgt2:providerId1Id::lovIconId')]");
        elements.put("template_mapping_add_i_provider", "//*[contains(@id, 'pcgt2:providerId1Id::content')]");
        elements.put("template_mapping_add_cb_enabled", "//*[contains(@id, 'pc2:pcgt2:sbc4::content')]");
        elements.put("template_mapping_add_i_psp_template_code", "//*[contains(@id, 'pc2:pcgt2:it3::content')]");
        elements.put("template_mapping_add_i_psp_template_name", "//*[contains(@id, 'pc2:pcgt2:it12::content')]");
        elements.put("template_mapping_add_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");


        //SEARCH

        elements.put("template_mapping_se_lov_pc_template_code", "//*[contains(@id, 'qryId2:value00::lovIconId')]");
        elements.put("template_mapping_se_lov_pc_template_code_i_template", "//*[contains(@id, 'qryId2:value00::_afrLovInternalQueryId:value00::content')]");
        elements.put("template_mapping_se_i_pc_template_code", "//*[contains(@id, 'qryId2:value00::content')]");
        elements.put("template_mapping_se_sl_provider", "//*[contains(@id, 'qryId2:value10::drop')]");
        elements.put("template_mapping_se_sl_provider_digital_river", "//*[contains(@id, 'qryId2:value10::pop')]/li[4]/ul/li[1]/label/input");
        elements.put("template_mapping_se_lov_psp_template_code", "//*[contains(@id, 'qryId2:value20::lovIconId')]");
        elements.put("template_mapping_se_lov_psp_template_code_i_template", "//*[contains(@id, 'qryId2:value20::_afrLovInternalQueryId:value00::content')]");
        elements.put("template_mapping_se_i_psp_template_code", "//*[contains(@id, 'qryId2:value20::content')]");
        elements.put("template_mapping_se_sl_enabled", "//*[contains(@id, 'qryId2:value30::content')]");
        elements.put("template_mapping_se_b_search", "//*[contains(@id, 'qryId2::search')]");
        elements.put("template_mapping_se_b_reset", "//*[contains(@id, 'qryId2::reset')]");
        elements.put("template_mapping_se_e_result", "//*[contains(@id, 't2::db')]/table/tbody/tr[1]/td[1]");


        //EDIT

        elements.put("template_mapping_ed_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("template_mapping_ed_lov_pc_template_code", "//*[contains(@id, 'pcgt2:pcTemplateCode1Id::lovIconId')]");
        elements.put("template_mapping_ed_i_pc_template_code", "//*[contains(@id, 'pcgt2:pcTemplateCode1Id::content')]");
        elements.put("template_mapping_ed_lov_provider", "//*[contains(@id, 'pc2:pcgt2:providerId1Id::lovIconId')]");
        elements.put("template_mapping_ed_i_provider", "//*[contains(@id, 'pcgt2:providerId1Id::content')]");
        elements.put("template_mapping_ed_cb_enabled", "//*[contains(@id, 'pc2:pcgt2:sbc4::content')]");
        elements.put("template_mapping_ed_i_psp_template_code", "//*[contains(@id, 'pc2:pcgt2:it3::content')]");
        elements.put("template_mapping_ed_i_psp_template_name", "//*[contains(@id, 'pc2:pcgt2:it12::content')]");
        elements.put("template_mapping_ed_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");
        //QBE

        elements.put("template_mapping_qbe_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("template_mapping_qbe_i_provider", "//*[contains(@id, 't2_afr_c11::content')]");
        elements.put("template_mapping_qbe_i_pc_template_code", "//*[contains(@id, 't2_afr_c9::content')]");
        elements.put("template_mapping_qbe_i_template_name", "//*[contains(@id, 't2_afr_c10::content')]");
        elements.put("template_mapping_qbe_i_psp_template_code", "//*[contains(@id, 't2_afr_c5::content')]");
        elements.put("template_mapping_qbe_i_psp_template_name", "//*[contains(@id, 't2_afr_c8::content')]");
        elements.put("template_mapping_qbe_sl_enabled", "//*[contains(@id, 't2:soc2::content')]");
        elements.put("template_mapping_qbe_e_template_name_result","//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[3]");

        //OTHER ACTIONS

        elements.put("template_mapping_oa_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");

        //DELETE

        elements.put("template_mapping_del_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("template_mapping_del_b_delete_ok", "//*[contains(@id, 'pcgt2:cbt1')]");
        elements.put("template_mapping_del_e_record", "//*[contains(@id, 'outputText3')]");


    }
}
