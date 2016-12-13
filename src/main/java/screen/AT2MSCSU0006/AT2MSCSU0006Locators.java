package screen.AT2MSCSU0006;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icastaneira on 12/12/2016.
 */
public class AT2MSCSU0006Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MSCSU0006Locators(String environment) {setElements();}

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /* TABS */
        elements.put("tab_profile_detail", "//*[contains(@id, 'sdi1::disAcr')]");
        elements.put("tab_elements", "//*[contains(@id, 'sdi2::disAcr')]");

        //<editor-fold desc="Profile Detail TAB">
        /* "Profile Detail" TAB, "Profile" TABLE, SEARCH */
        elements.put("profile_detail_tab_profile_table_search_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("profile_detail_tab_profile_table_search_n_records", "//*[contains(@id, 'pc1:ot13')]");

        /* "Profile Detail" TAB, "Profile" TABLE, RECORD INTERACTION */
        elements.put("profile_detail_tab_profile_table_record_intearction_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("profile_detail_tab_profile_table_record_intearction_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("profile_detail_tab_profile_table_record_intearction_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");
        elements.put("profile_detail_tab_profile_table_record_intearction_b_save_cascade_edit", "//*[contains(@id, 'r1:1:cb1')]");

        elements.put("profile_detail_tab_profile_table_record_intearction_i_profile", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("profile_detail_tab_profile_table_record_intearction_i_description", "//*[contains(@id, 'pcgt1:it3::content')]");

        /* "Profile Detail" TAB, "Profile" TABLE, QUERY */
        elements.put("profile_detail_tab_profile_table_query_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");

        elements.put("profile_detail_tab_profile_table_query_i_profile", "//*[contains(@id, '_pc1_afr_t1_afr_c1::content')]");
        elements.put("profile_detail_tab_profile_table_query_i_description", "//*[contains(@id, '_pc1_afr_t1_afr_c2::content')]");

        /* "Profile Detail" TAB, "Profile" TABLE, EXTRA ACTIONS */
        elements.put("profile_detail_tab_profile_table_audit_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("profile_detail_tab_profile_table_audit_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi0')]/td[2]");
        elements.put("profile_detail_tab_profile_table_audit_b_ok", "//*[contains(@id, 'pcgm1:d22::ok')]");

        elements.put("profile_detail_tab_profile_table_detach_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");

        /* "Profile Detail" TAB, "Profile" TABLE, DELETE */
        elements.put("profile_detail_tab_profile_table_delete_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("profile_detail_tab_profile_table_delete_b_yes", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        
        /* "Profile Detail" TAB, "Profile Detail" TABLE, SEARCH */
        elements.put("profile_detail_tab_profile_detail_table_search_e_result", "//*[contains(@id, 'pc3:table3::db')]/table/tbody/tr[1]/td[1]");
        elements.put("profile_detail_tab_profile_detail_table_search_n_records", "//*[contains(@id, 'pc3:outputText6')]");

        /* "Profile Detail" TAB, "Profile Detail" TABLE, RECORD INTERACTION */
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_b_add", "//*[contains(@id, 'pc3:pcgt3:boton_add')]");
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_b_edit", "//*[contains(@id, 'pc3:pcgt3:boton_edit')]");
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_b_save", "//*[contains(@id, 'pc3:pcgt3:btn_commitExit')]");

        elements.put("profile_detail_tab_profile_detail_table_record_intearction_lov_i_profile", "//*[contains(@id, 'pcgt3:preProfileId::content')]");
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_lov_profile_b_lov", "//*[contains(@id, 'pcgt3:preProfileId::lovIconId')]");
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_lov_profile_lov_i_profile", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        elements.put("profile_detail_tab_profile_detail_table_record_intearction_i_operation", "//*[contains(@id, 'pcgt3:preOperationId::content')]");
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_lov_operation_b_lov", "//*[contains(@id, 'pcgt3:preOperationId::lovIconId')]");
        elements.put("profile_detail_tab_profile_detail_table_record_intearction_lov_operation_lov_i_operation", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");

        /* "Profile Detail" TAB, "Profile Detail" TABLE, QUERY */
        elements.put("profile_detail_tab_profile_detail_table_query_b_qbe", "//*[contains(@id, 'pc3:_qbeTbr')]");

        elements.put("profile_detail_tab_profile_detail_table_query_i_profile", "//*[contains(@id, '_pc3_afr_table3_afr_c8::content')]");
        elements.put("profile_detail_tab_profile_detail_table_query_i_operation", "//*[contains(@id, '_pc3_afr_table3_afr_c6::content')]");
        elements.put("profile_detail_tab_profile_detail_table_query_i_element", "//*[contains(@id, '_pc3_afr_table3_afr_c7::content')]");

        /* "Profile Detail" TAB, "Profile Detail" TABLE, EXTRA ACTIONS */
        elements.put("profile_detail_tab_profile_detail_table_audit_b_actions", "//*[contains(@id, 'pc3:pcgm3:dc_m1')]");
        elements.put("profile_detail_tab_profile_detail_table_audit_b_audit", "//*[contains(@id, 'pc3:pcgm3:dc_cmi0')]/td[2]");
        elements.put("profile_detail_tab_profile_detail_table_audit_b_ok", "//*[contains(@id, 'pcgm3:d22::ok')]");

        elements.put("profile_detail_tab_profile_detail_table_detach_b_detach", "//*[contains(@id, 'pc3:_dchTbr')]");

        /* "Profile Detail" TAB, "Profile Detail" TABLE, DELETE */
        elements.put("profile_detail_tab_profile_detail_table_delete_b_delete", "//*[contains(@id, 'pc3:pcgt3:boton_remove')]");
        elements.put("profile_detail_tab_profile_detail_table_delete_b_yes", "//*[contains(@id, 'pc3:pcgt3:cbt1')]");
        //</editor-fold>

        //<editor-fold desc="Elements TAB">
        /* "Elements" TAB, SEARCH */
        elements.put("elements_tab_elements_table_search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("elements_tab_elements_table_search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("elements_tab_elements_table_search_e_result", "//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("elements_tab_elements_table_search_n_records", "//*[contains(@id, 'pc2:outputText4')]");

        elements.put("elements_tab_elements_table_search_sel_operation", "//*[contains(@id, 'qryId1:value00::content')]");

        /* "Elements" TAB, RECORD INTERACTION */
        elements.put("elements_tab_elements_table_record_intearction_b_add", "//*[contains(@id, 'pc2:pcgt2:boton_add')]");
        elements.put("elements_tab_elements_table_record_intearction_b_edit", "//*[contains(@id, 'pc2:pcgt2:boton_edit')]");
        elements.put("elements_tab_elements_table_record_intearction_b_save", "//*[contains(@id, 'pc2:pcgt2:btn_commitExit')]");
        elements.put("elements_tab_elements_table_record_intearction_b_save_cascade_edit", "//*[contains(@id, 'commandButton1')]");

        elements.put("elements_tab_elements_table_record_intearction_sel_operation", "//*[contains(@id, 'pcgt2:soc1::content')]");
        elements.put("elements_tab_elements_table_record_intearction_i_element", "//*[contains(@id, 'pcgt2:it4::content')]");

        /* "Elements" TAB, QbE */
        elements.put("elements_tab_elements_table_query_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");

        elements.put("elements_tab_elements_table_query_sel_operation", "//*[contains(@id, 't2:soc4::content')]");
        elements.put("elements_tab_elements_table_query_i_element", "//*[contains(@id, '_pc2_afr_t2_afr_c4::content')]");

        /* "Elements" TAB, EXTRA ACTIONS */
        elements.put("elements_tab_elements_table_audit_b_actions", "//*[contains(@id, 'pc2:pcgm2:dc_m1')]");
        elements.put("elements_tab_elements_table_audit_b_audit", "//*[contains(@id, 'pc2:pcgm2:dc_cmi0')]/td[2]");
        elements.put("elements_tab_elements_table_audit_b_ok", "//*[contains(@id, 'pcgm2:d22::ok')]");

        elements.put("elements_tab_elements_table_detach_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");

        /* "Elements" TAB, DELETE */
        elements.put("elements_tab_elements_table_delete_b_delete", "//*[contains(@id, 'pc2:pcgt2:boton_remove')]");
        elements.put("elements_tab_elements_table_delete_b_yes", "//*[contains(@id, 'pc2:pcgt2:cbt1')]");
        //</editor-fold>
    }
}
