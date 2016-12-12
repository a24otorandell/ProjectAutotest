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
    }
}
