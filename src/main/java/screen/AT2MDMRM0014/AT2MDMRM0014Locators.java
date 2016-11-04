package screen.AT2MDMRM0014;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 04/11/2016.
 */
public class AT2MDMRM0014Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0014Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //GROUPING
                elements.put("MDM_grp_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_grp_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_grp_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_grp_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_grp_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
                elements.put("MDM_grp_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi0')]/td[2]");
                elements.put("MDM_grp_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_grp_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_grp_e_result", "//*[contains(@id, 'pc1:master::db')]/table[1]/tbody/tr[1]/td[1]");
                elements.put("MDM_grp_e_records", "//*[contains(@id, 'pc1:outputText3')]");
            //DESCRIPTION
                elements.put("MDM_dscr_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_dscr_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_dscr_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_dscr_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_dscr_b_actions", "//*[contains(@id, 'pc2:pcgm1:dc_m1')]");
                elements.put("MDM_dscr_b_actions_audit_data", "//*[contains(@id, 'pc2:pcgm1:dc_cmi0')]/td[2]");
                elements.put("MDM_dscr_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_dscr_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_dscr_e_result", "//*[contains(@id, 'pc2:child1::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_dscr_e_records", "//*[contains(@id, 'pc2:outputText7')]");
            //BOARDS
                elements.put("MDM_brds_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
                elements.put("MDM_brds_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
                elements.put("MDM_brds_b_delete_ok", "//*[contains(@id, 'pc3:pcgt3:cbt1')]");
                elements.put("MDM_brds_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
                elements.put("MDM_brds_b_actions", "//*[contains(@id, 'pc3:pcgm3:dc_m1')]");
                elements.put("MDM_brds_b_actions_audit_data", "//*[contains(@id, 'pc3:pcgm3:dc_cmi0')]/td[2]");
                elements.put("MDM_brds_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
                elements.put("MDM_brds_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
                elements.put("MDM_brds_e_result", "//*[contains(@id, 'pc3:child2::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_brds_e_records", "//*[contains(@id, 'pc3:outputText10')]");
        //ADD|MODIFY
            //GROUPING
                elements.put("add_grp_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_i_grouping", "//*[contains(@id, 'pcgt1:it4::content')]");
            //DESCRIPTION
                elements.put("add_dscr_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_i_language", "//*[contains(@id, 'pcgt2:codIdiomaId::content')]");
                elements.put("add_lov_language", "//*[contains(@id, 'pcgt2:codIdiomaId::lovIconId')]");
                elements.put("add_i_language_description", "//*[contains(@id, 'pcgt2:it6::content')]");
                elements.put("add_i_web", "//*[contains(@id, 'pcgt2:idWebId::content')]");
                elements.put("add_lov_web", "//*[contains(@id, 'pcgt2:idWebId::lovIconId')]");
                elements.put("add_i_web_description", "//*[contains(@id, 'pcgt2:it7::content')]");
            //BOARDS
                elements.put("add_brds_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
                elements.put("add_i_company", "//*[contains(@id, 'pcgt3:codEmpId::content')]");
                elements.put("add_lov_company", "//*[contains(@id, 'pcgt3:codEmpId::lovIconId')]");
                elements.put("add_e_company_description", "//*[contains(@id, 'pcgt3:it8::content')]");
                elements.put("add_i_board", "//*[contains(@id, 'pcgt3:codRegId::content')]");
                elements.put("add_lov_board", "//*[contains(@id, 'pcgt3:codRegId::lovIconId')]");
                elements.put("add_e_board_description", "//*[contains(@id, 'pcgt3:it9::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_grouping", "//*[contains(@id, 'qryId1:value00::content')]");
        //QBE
            //GROUPING
                elements.put("qbe_i_grouping", "//*[contains(@id, 'afr_master_afr_c1::content')]");
            //DESCRIPTION
                elements.put("qbe_i_language", "//*[contains(@id, 'afr_child1_afr_c4::content')]");
                elements.put("qbe_i_language_description", "//*[contains(@id, 'afr_child1_afr_c2::content')]");
                elements.put("qbe_i_web", "//*[contains(@id, 'afr_child1_afr_c5::content')]");
                elements.put("qbe_i_web_description", "//*[contains(@id, 'afr_child1_afr_c3::content')]");
            //BOARDS
                elements.put("qbe_i_company", "//*[contains(@id, 'afr_child2_afr_c10::content')]");
                elements.put("qbe_i_company_description", "//*[contains(@id, 'afr_child2_afr_c8::content')]");
                elements.put("qbe_i_board", "//*[contains(@id, 'afr_child2_afr_c11::content')]");
                elements.put("qbe_i_board_description", "//*[contains(@id, 'afr_child2_afr_c9::content')]");
    }
}
