package screen.AT2MDMCL0003;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 28/11/2016.
 */
public class AT2MDMCL0003Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMCL0003Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE INPUTS
         */
        //GENERALS
        elements.put("inputs_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("inputs_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("inputs_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("inputs_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("inputs_b_actions_rules", "//*[contains(@id, 'pcgm1:dc_cmi2')]/td[2]");
        elements.put("inputs_b_actions_rules_cancel", "//*[contains(@id, 'd2::cancel')]");
      //  elements.put("inputs_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("inputs_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("inputs_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("inputs_e_records", "//*[contains(@id, 'pc1:id1')]");
        elements.put("inputs_b_ok_delete", "//*[contains(@id, 'dialogConfirmDelete::yes')]");
        //SEARCH
        elements.put("search_b_show_search", "//*[contains(@id, 'pb2::_afrDscl')]");
        elements.put("search_b_search", "//*[contains(@id, 'cb1')]");
        elements.put("search_i_commercial_brand", "//*[contains(@id, '0:soc6::content')]");
        elements.put("search_i_customer_connectivity", "//*[contains(@id, '1:soc6::content')]");
        elements.put("search_i_source_market", "//*[contains(@id, '2:soc6::content')]");
        //ADD
        elements.put("add_b_save1", "//*[contains(@id, 'pcgt1:boton_commit')]");
        elements.put("add_i_commercial_brand", "//*[contains(@id, '0:it5::content')]");
        elements.put("add_i_customer_connectivity", "//*[contains(@id, '1:it5::content')]");
        elements.put("add_i_source_market", "//*[contains(@id, '2:it5::content')]");
        elements.put("add_i_collections_company", "//*[contains(@id, 'it25::content')]");
        /**
         * TABLE OUTPUTS
         */
        //GENERALS
        elements.put("outputs_b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("outputs_b_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("outputs_b_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("outputs_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("outputs_e_result", "//*[contains(@id, 'pc2:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("outputs_e_records", "//*[contains(@id, 'pc2:id2')]");
        elements.put("outputs_b_ok_delete", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        //ADD
        elements.put("add_b_save2", "//*[contains(@id, 'r1:0:pcgt1:boton_commit')]");
        elements.put("edit_i_collections_company", "//*[contains(@id, 'it5::content')]");
    }
    
}
