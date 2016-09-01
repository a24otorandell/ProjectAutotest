package screen.AT2TRFSU0006;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lchacartegui on 01/09/2016.
 */
public class AT2TRFSU0006Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0006Locators(String environment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {

        //<editor-fold desc="GROUPING TOUR OPERATOR">
        //search
        elements.put("grouping_n_records", "//*[contains(@id, 'pc1:ot4')]"); //number of records retrieved
        elements.put("grouping_b_search", "//*[contains(@id, 'advanceSearchTtooTransfersGroupSetup::search')]"); //search button search
        elements.put("grouping_b_reset", "//*[contains(@id, 'advanceSearchTtooTransfersGroupSetup::reset')]"); //search result
        elements.put("grouping_search_i_code", "//*[contains(@id, 'value00::content')]");
        elements.put("grouping_search_i_description", "//*[contains(@id, 'value10::content')]");
        elements.put("grouping_search_sel_group", "//*[contains(@id, 'value20::content')]");
        elements.put("grouping_search_e_result", "//*[contains(@id, 'tablaTtooTranferGroup::db')]/table/tbody/tr"); //search result

        //add
        elements.put("grouping_b_add", "//*[contains(@id, 'pcgt2:boton_add')]"); //button add
        elements.put("grouping_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]"); //button edit
        elements.put("grouping_add_b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]"); //button save
        elements.put("grouping_add_i_code", "//*[contains(@id, 'it1::content')]");
        elements.put("grouping_add_i_description", "//*[contains(@id, 'it2::content')]");
        elements.put("grouping_add_cb_group", "//*[contains(@id, 'sbc2::content')]");

        //qbe
        elements.put("grouping_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("grouping_qbe_i_code", "//*[contains(@id, 'pc1_afr_tablaTtooTranferGroup_afr_c3::content')]");
        elements.put("grouping_qbe_i_description", "//*[contains(@id, 'pc1_afr_tablaTtooTranferGroup_afr_c2::content')]");
        elements.put("grouping_qbe_sel_group_by_default", "//*[contains(@id, 'pc1:tablaTtooTranferGroup:soc4::content')]");

        //detach
        elements.put("grouping_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");

        //Actions
        elements.put("grouping_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]");
        elements.put("grouping_b_actions_b_audit", "//*[contains(@id, 'pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("grouping_b_actions_b_audit_b_close", "//*[contains(@id, 'd5::close')]");

        //delete
        elements.put("grouping_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");  //button delete
        elements.put("grouping_b_delete_b_yes", "//*[contains(@id, 'pc1:pcgt2:cbt1')]"); //ss delete button yes
        // </editor-fold>


        //<editor-fold desc="TOUR OPERATOR">
        // Add/Edit tour operator
        elements.put("ttoo_b_add", "//*[contains(@id,'pcgt4:boton_add')]"); //button add
        elements.put("ttoo_add_i_ttoo", "//*[contains(@id,'nomCortoTtooId::content')]"); //input language_code
        elements.put("ttoo_add_lov_ttoo", "//*[contains(@id,'nomCortoTtooId::lovIconId')]"); //add lov language_code
        elements.put("ttoo_add_lov_ttoo_i_ttoo", "//*[contains(@id, 'nomCortoTtooId::_afrLovInternalQueryId:value00::content')]"); //ss ttoo input Tour Operator
        elements.put("ttoo_add_lov_ttoo_i_des", "//*[contains(@id, 'nomCortoTtooId::_afrLovInternalQueryId:value10::content']"); //ss ttoo input Description
        elements.put("ttoo_add_e_ttoo_des", "//*[contains(@id,'pc2:pcgt4:it3::content')]"); //add button save
        elements.put("ttoo_add_b_save", "//*[contains(@id,'pcgt4:btn_commitExit')]"); //add button save

        // qbe tour operator
        elements.put("ttoo_b_qbe", "//*[contains(@id,'pc2:_qbeTbr')]"); //button query by example
        elements.put("ttoo_qbe_e_result", "//*[contains(@id, 'tablaTouroperators::db')]/table/tbody/tr");
        elements.put("ttoo_n_records", "//*[contains(@id, 'pc2:ot13')]"); //number of records retrieved
        elements.put("ttoo_qbe_i_ttoo", "//*[contains(@id,'pc2_afr_tablaTouroperators_afr_c4::content')]");
        elements.put("ttoo_qbe_i_no_name", "//*[contains(@id,'pc2_afr_tablaTouroperators_afr_c1::content')]");

        //delete tour operator
        elements.put("ttoo_b_delete", "//*[contains(@id, 'pcgt4:boton_remove')]");
        elements.put("ttoo_b_delete_b_yes", "//*[contains(@id, 'pc2:pcgt4:cbt1')]");

        //detach tour operator
        elements.put("ttoo_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        // </editor-fold>

    }
}
