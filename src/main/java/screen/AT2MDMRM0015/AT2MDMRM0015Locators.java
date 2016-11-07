package screen.AT2MDMRM0015;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 04/11/2016.
 */
public class AT2MDMRM0015Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0015Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //GROUPS OF CATEGORIES
                elements.put("MDM_grp_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
                elements.put("MDM_grp_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
                elements.put("MDM_grp_b_delete_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
                elements.put("MDM_grp_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
                elements.put("MDM_grp_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]");
                elements.put("MDM_grp_b_actions_audit_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi1')]/td[2]");
                elements.put("MDM_grp_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
                elements.put("MDM_grp_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
                elements.put("MDM_grp_e_result", "//*[contains(@id, 'pc1:master::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_grp_e_records", "//*[contains(@id, 'pc1:outputText3')]");
            //GROUPS OF CATEGORIES DESCRIPTION
                elements.put("MDM_dscr_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
                elements.put("MDM_dscr_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
                elements.put("MDM_dscr_b_delete_ok", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
                elements.put("MDM_dscr_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
                elements.put("MDM_dscr_b_actions", "//*[contains(@id, 'pc2:pcgm1:dc_m1')]");
                elements.put("MDM_dscr_b_actions_audit_data", "//*[contains(@id, 'pc2:pcgm1:dc_cmi1')]/td[2]");
                elements.put("MDM_dscr_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
                elements.put("MDM_dscr_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
                elements.put("MDM_dscr_e_result", "//*[contains(@id, 'pc2:child1::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_dscr_e_records", "//*[contains(@id, 'pc2:outputText7')]");
            //CATEGORIES
                elements.put("MDM_ctgrs_b_add", "//*[contains(@id, 'pcgt3:boton_add')]");
                elements.put("MDM_ctgrs_b_delete", "//*[contains(@id, 'pcgt3:boton_remove')]");
                elements.put("MDM_ctgrs_b_delete_ok", "//*[contains(@id, 'pc3:pcgt3:cbt1')]");
                elements.put("MDM_ctgrs_b_edit", "//*[contains(@id, 'pcgt3:boton_edit')]");
                elements.put("MDM_ctgrs_b_actions", "//*[contains(@id, 'pc3:pcgm3:dc_m1')]");
                elements.put("MDM_ctgrs_b_actions_audit_data", "//*[contains(@id, 'pc3:pcgm3:dc_cmi1')]/td[2]");
                elements.put("MDM_ctgrs_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");
                elements.put("MDM_ctgrs_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");
                elements.put("MDM_ctgrs_e_result", "//*[contains(@id, 'pc3:child2::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_ctgrs_e_records", "//*[contains(@id, 'pc3:outputText10')]");
        //ADD|MODIFY
            //GROUPS OF CATEGORIES
                elements.put("add_grp_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
                elements.put("add_i_group", "//*[contains(@id, 'pcgt1:it3::content')]");
                elements.put("add_i_order", "//*[contains(@id, 'pcgt1:it1::content')]");
            //GROUPS OF CATEGORIES DESCRIPTION
                elements.put("add_dscr_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
                elements.put("add_i_language", "//*[contains(@id, 'pcgt2:codIdiomaId::content')]");
                elements.put("add_lov_language", "//*[contains(@id, 'pcgt2:codIdiomaId::lovIconId')]");
                elements.put("add_i_language_description", "//*[contains(@id, 'pcgt2:it4::content')]");
                elements.put("add_i_language_detailed_description", "//*[contains(@id, 'pcgt2:it5::content')]");
            //CATEGORIES
                elements.put("add_ctgrs_b_save", "//*[contains(@id, 'pcgt3:btn_commitExit')]");
                elements.put("add_i_category", "//*[contains(@id, 'pcgt3:codCategId::content')]");
                elements.put("add_lov_category", "//*[contains(@id, 'pcgt3:codCategId::lovIconId')]");
                elements.put("add_e_category_description", "//*[contains(@id, 'pcgt3:it7::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_group", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_order", "//*[contains(@id, 'qryId1:value10::content')]");
        //QBE
            //GROUPS OF CATEGORIES
                elements.put("qbe_i_group", "//*[contains(@id, 'afr_master_afr_c2::content')]");
                elements.put("qbe_i_order", "//*[contains(@id, 'pc1:master:it::content')]");
            //GROUPS OF CATEGORIES DESCRIPTION
                elements.put("qbe_i_language", "//*[contains(@id, 'afr_child1_afr_c7::content')]");
                elements.put("qbe_i_language_description", "//*[contains(@id, 'afr_child1_afr_c5::content')]");
            //CATEGORIES
                elements.put("qbe_i_category", "//*[contains(@id, 'afr_child2_afr_c8::content')]");
                elements.put("qbe_i_category_description", "//*[contains(@id, 'afr_child2_afr_c9::content')]");
    }

}
