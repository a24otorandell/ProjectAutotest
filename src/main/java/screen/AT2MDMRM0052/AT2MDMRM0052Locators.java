package screen.AT2MDMRM0052;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 23/12/2016.
 */
public class AT2MDMRM0052Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0052Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /**
         * TABLE TOP OFFERS BY DESTINATION
         */
        //GENERALS
        elements.put("top_dest_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("top_dest_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("top_dest_e_result", "//*[contains(@id, 'pc2:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("top_dest_e_records", "//*[contains(@id, 'pc2:ot2')]");
        //QBE
        elements.put("qbe_i_top_dest","//*[contains(@id, 'pc2_afr_t1_afr_c8::content')]");
        elements.put("qbe_i_destination_dest","//*[contains(@id,'pc2_afr_t1_afr_c3::content')]");
        elements.put("qbe_i_dest_desc_dest","//*[contains(@id,'pc2_afr_t1_afr_c4::content')]");
        elements.put("qbe_i_assigned_desc","//*[contains(@id,'pc2_afr_t1_afr_c6::content')]");
        elements.put("qbe_i_cancelled","//*[contains(@id,'pc2_afr_t1_afr_c2::content')]");
        elements.put("qbe_i_assessed_desc","//*[contains(@id,'pc2_afr_t1_afr_c5::content')]");
        elements.put("qbe_i_offers","//*[contains(@id,'pc2_afr_t1_afr_c7::content')]");
        elements.put("qbe_i_top_desc","//*[contains(@id,'pc2_afr_t1_afr_c1::content')]");
        elements.put("qbe_i_total_desc","//*[contains(@id,'pc2_afr_t1_afr_c9::content')]");
        /**
         * TABLE TOP OFFERS BY TO
         */
        //GENERALS
        elements.put("top_to_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("top_to_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("top_to_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("top_to_e_records", "//*[contains(@id, 'pc1:ot19')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_top_to", "//*[contains(@id, 'value00::content')]");
        elements.put("search_i_total_to", "//*[contains(@id, 'value10::content')]");
        elements.put("search_i_destination_to", "//*[contains(@id, 'value20::content')]");
        elements.put("search_i_assigned_to", "//*[contains(@id, 'value30::content')]");
        elements.put("search_i_assessed_to", "//*[contains(@id, 'value40::content')]");
        //QBE
        elements.put("qbe_i_top_to","//*[contains(@id,'pc1_afr_resId1_afr_resId1c1::content')]");
        elements.put("qbe_i_total_to","//*[contains(@id,'pc1_afr_resId1_afr_resId1c2::content')]");
        elements.put("qbe_i_destination_to","//*[contains(@id,'pc1_afr_resId1_afr_resId1c3::content')]");
        elements.put("qbe_i_dest_desc_to","//*[contains(@id,'pc1_afr_resId1_afr_resId1c4::content')]");
        elements.put("qbe_i_assigned_to","//*[contains(@id,'pc1_afr_resId1_afr_resId1c5::content')]");
        elements.put("qbe_i_assessed_to","//*[contains(@id,'pc1_afr_resId1_afr_resId1c6::content')]");
        /**
         * SEARCH ENQUIRY
         */
        elements.put("enquiry_b_search","//*[contains(@id, '1:cb1')]");
        elements.put("enquiry_lov_campaign","//*[contains(@id,'1:cOD_CAMPANYAId::lovIconId')]");
        elements.put("enquiry_i_campaign","//*[contains(@id,'1:cOD_CAMPANYAId::content')]");
        elements.put("enquiry_lov_group","//*[contains(@id,'1:cOD_GRUPOId::lovIconId')]");
        elements.put("enquiry_i_group","//*[contains(@id,'1:cOD_GRUPOId::content')]");
        elements.put("enquiry_lov_interface","//*[contains(@id,'1:cOD_INTERFId::lovIconId')]");
        elements.put("enquiry_i_interface","//*[contains(@id,'1:cOD_INTERFId::content')]");
        /**
         * BOTONES
         */
        elements.put("destination_b_dest", "//*[contains(@id, '1:cb2')]");
        elements.put("to_b_to", "//*[contains(@id, '1:cb3')]");
    }
}
