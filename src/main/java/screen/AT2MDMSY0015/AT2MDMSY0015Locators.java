package screen.AT2MDMSY0015;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 21/11/2016.
 */
public class AT2MDMSY0015Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSY0015Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //TABS
                elements.put("MDM_b_rollback_core2", "//*[contains(@id, 'r1:1:sdi1::disAcr')]");
                elements.put("MDM_b_hotelbeds_reference", "//*[contains(@id, 'r1:1:sdi2::disAcr')]");
            //ROLLBACK CORE2
                elements.put("MDM_rbc2_b_add", "//*[contains(@id, 'r1:1:pc1:pcgt2:boton_add')]");
                elements.put("MDM_rbc2_b_delete", "//*[contains(@id, 'r1:1:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_rbc2_b_delete_ok", "//*[contains(@id, 'r1:1:pc1:pcgt2:cbt1')]");
                elements.put("MDM_rbc2_b_edit", "//*[contains(@id, 'r1:1:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_rbc2_b_qbe", "//*[contains(@id, 'r1:1:pc1:_qbeTbr')]");
                elements.put("MDM_rbc2_b_detach", "//*[contains(@id, 'r1:1:pc1:_dchTbr')]");
                elements.put("MDM_rbc2_e_result", "//*[contains(@id, 'r1:1:pc1:rolback::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_rbc2_e_records", "//*[contains(@id, 'r1:1:pc1:ot2')]");
            //PARAMETERS ROLLBACK C2
                elements.put("MDM_prb2_b_add", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_add')]");
                elements.put("MDM_prb2_b_delete", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_remove')]");
                elements.put("MDM_prb2_b_delete_ok", "//*[contains(@id, 'r1:1:pc2:pcgt1:cbt1')]");
                elements.put("MDM_prb2_b_edit", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_edit')]");
                elements.put("MDM_prb2_b_qbe", "//*[contains(@id, 'r1:1:pc2:_qbeTbr')]");
                elements.put("MDM_prb2_b_detach", "//*[contains(@id, 'r1:1:pc2:_dchTbr')]");
                elements.put("MDM_prb2_e_result", "//*[contains(@id, 'r1:1:pc2:rolparm::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_prb2_e_records", "//*[contains(@id, 'r1:1:pc2:ot16')]");
            //ASSISTED ROLLBACK CORE2
                elements.put("MDM_arc2_b_add", "//*[contains(@id, 'r1:1:pc3:pcgt3:boton_add')]");
                elements.put("MDM_arc2_b_delete", "//*[contains(@id, 'r1:1:pc3:pcgt3:boton_remove')]");
                elements.put("MDM_arc2_b_delete_ok", "//*[contains(@id, 'r1:1:pc3:pcgt3:cbt1')]");
                elements.put("MDM_arc2_b_edit", "//*[contains(@id, 'r1:1:pc3:pcgt3:boton_edit')]");
                elements.put("MDM_arc2_b_qbe", "//*[contains(@id, 'r1:1:pc3:_qbeTbr')]");
                elements.put("MDM_arc2_b_detach", "//*[contains(@id, 'r1:1:pc3:_dchTbr')]");
                elements.put("MDM_arc2_e_result", "//*[contains(@id, 'r1:1:pc3:asisted::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_arc2_e_records", "//*[contains(@id, 'r1:1:pc3:ot29')]");
            //PARAMETERS ROLLBACK C2 (2)
                elements.put("MDM_prrb2_b_add", "//*[contains(@id, 'r1:1:pc4:pcgt4:boton_add')]");
                elements.put("MDM_prrb2_b_delete", "//*[contains(@id, 'r1:1:pc4:pcgt4:boton_remove')]");
                elements.put("MDM_prrb2_b_delete_ok", "//*[contains(@id, 'r1:1:pc4:pcgt4:cbt1')]");
                elements.put("MDM_prrb2_b_edit", "//*[contains(@id, 'r1:1:pc4:pcgt4:boton_edit')]");
                elements.put("MDM_prrb2_b_qbe", "//*[contains(@id, 'r1:1:pc4:_qbeTbr')]");
                elements.put("MDM_prrb2_b_detach", "//*[contains(@id, 'r1:1:pc4:_dchTbr')]");
                elements.put("MDM_prrb2_e_result", "//*[contains(@id, 'r1:1:pc4:params::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_prrb2_e_records", "//*[contains(@id, 'r1:1:pc4:ot36')]");
            //ADD|MODIFY
                //ROLLBACK CORE2
                    elements.put("add_rbc2_b_save", "//*[contains(@id, 'r1:1:pc1:pcgt2:btn_commitExit')]");
                    elements.put("add_rbc2_e_sequence", "//*[contains(@id, 'r1:1:pc1:pcgt2:it2::content')]");
                    elements.put("add_rbc2_e_date", "//*[contains(@id, 'r1:1:pc1:pcgt2:id3::content')]");
                    elements.put("add_rbc2_i_external_agency_code", "//*[contains(@id, 'r1:1:pc1:pcgt2:ageExtCodId::content')]");
                    elements.put("add_rbc2_lov_external_agency_code", "//*[contains(@id, 'r1:1:pc1:pcgt2:ageExtCodId::lovIconId')]");
                    elements.put("add_rbc2_e_external_agency_name", "//*[contains(@id, 'r1:1:pc1:pcgt2:it3::content')]");
                    elements.put("add_rbc2_i_B2B_reference", "//*[contains(@id, 'r1:1:pc1:pcgt2:it6::content')]");
                    elements.put("add_rbc2_i_hotelbeds_reference", "//*[contains(@id, 'r1:1:pc1:pcgt2:it4::content')]");
                    elements.put("add_rbc2_i_modification_date", "//*[contains(@id, 'r1:1:pc1:pcgt2:id4::content')]");
                    elements.put("add_rbc2_i_remarks", "//*[contains(@id, 'r1:1:pc1:pcgt2:it5::content')]");
                    elements.put("add_rbc2_i_status", "//*[contains(@id, 'r1:1:pc1:pcgt2:it1::content')]");
                //PARAMETERS ROLLBACK C2
                    elements.put("add_prb2_b_save", "//*[contains(@id, 'r1:1:pc2:pcgt1:btn_commitExit')]");
                    elements.put("add_prb2_e_sequence", "//*[contains(@id, 'r1:1:pc2:pcgt1:it9::content')]");
                    elements.put("add_prb2_i_name", "//*[contains(@id, 'r1:1:pc2:pcgt1:it8::content')]");
                    elements.put("add_prb2_i_value", "//*[contains(@id, 'r1:1:pc2:pcgt1:it7::content')]");
                //ASSISTED ROLLBACK CORE2
                    elements.put("add_arc2_b_save", "//*[contains(@id, 'r1:1:pc3:pcgt3:btn_commitExit')]");
                    elements.put("add_arc2_e_sequence", "//*[contains(@id, 'r1:1:pc3:pcgt3:it10::content')]");
                    elements.put("add_arc2_e_creation_date", "//*[contains(@id, 'r1:1:pc3:pcgt3:id6::content')]");
                    elements.put("add_arc2_sl_service_type", "//*[contains(@id, 'r1:1:pc3:pcgt3:soc2::content')]");
                    elements.put("add_arc2_sl_service_status", "//*[contains(@id, 'r1:1:pc3:pcgt3:soc1::content')]");
                    elements.put("add_arc2_i_external_agency_code", "//*[contains(@id, 'r1:1:pc3:pcgt3:ageExtCod1Id::content')]");
                    elements.put("add_arc2_lov_external_agency_code", "//*[contains(@id, 'r1:1:pc3:pcgt3:ageExtCod1Id::lovIconId')]");
                    elements.put("add_arc2_e_nom", "//*[contains(@id, 'r1:1:pc3:pcgt3:it13::content')]");
                    elements.put("add_arc2_i_remarks", "//*[contains(@id, 'r1:1:pc3:pcgt3:it12::content')]");
                    elements.put("add_arc2_i_status", "//*[contains(@id, 'r1:1:pc3:pcgt3:it11::content')]");
                //PARAMETERS ROLLBACK C2 (2)
                    elements.put("add_prrb2_b_save", "//*[contains(@id, 'r1:1:pc4:pcgt4:btn_commitExit')]");
                    elements.put("add_prrb2_e_sequence", "//*[contains(@id, 'r1:1:pc4:pcgt4:it16::content')]");
                    elements.put("add_prrb2_i_name", "//*[contains(@id, 'r1:1:pc4:pcgt4:it14::content')]");
                    elements.put("add_prrb2_i_value", "//*[contains(@id, 'r1:1:pc4:pcgt4:it15::content')]");
            //SEARCH
                //ROLLBACK CORE2
                    elements.put("search_rbc2_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
                    elements.put("search_rbc2_b_reset", "//*[contains(@id, 'r1:1:qryId1::reset')]");
                    elements.put("search_rbc2_i_sequence", "//*[contains(@id, 'r1:1:qryId1:value00::content')]");
                    elements.put("search_rbc2_i_creation_date", "//*[contains(@id, 'r1:1:qryId1:value10::content')]");
                    elements.put("search_rbc2_i_external_agency_code", "//*[contains(@id, 'r1:1:qryId1:value20::content')]");
                    elements.put("search_rbc2_lov_external_agency_code", "//*[contains(@id, 'r1:1:qryId1:value20::lovIconId')]");
                    elements.put("search_rbc2_i_external_agency_description", "//*[contains(@id, 'r1:1:qryId1:value30::content')]");
                    elements.put("search_rbc2_i_B2B_reference", "//*[contains(@id, 'r1:1:qryId1:value40::content')]");
                    elements.put("search_rbc2_i_hotelbeds_reference", "//*[contains(@id, 'r1:1:qryId1:value50::content')]");
                    elements.put("search_rbc2_i_modification_date", "//*[contains(@id, 'r1:1:qryId1:value60::content')]");
                    elements.put("search_rbc2_i_remarks", "//*[contains(@id, 'r1:1:qryId1:value70::content')]");
                    elements.put("search_rbc2_i_status", "//*[contains(@id, 'r1:1:qryId1:value80::content')]");
                    elements.put("search_rbc2_e_sequence_result", "//*[contains(@id, 'r1:1:pc1:rolback::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
                    elements.put("search_rbc2_e_creation_date_result", "//*[contains(@id, 'r1:1:pc1:rolback::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                    elements.put("search_rbc2_e_modification_date_result", "//*[contains(@id, 'r1:1:pc1:rolback::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
                    elements.put("search_prb2_e_sequence_result", "//*[contains(@id, 'r1:1:pc2:rolparm::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]");
                //ASSISTED ROLLBACK CORE2
                    elements.put("search_arc2_b_search", "//*[contains(@id, 'r1:1:qryId2::search')]");
                    elements.put("search_arc2_b_reset", "//*[contains(@id, 'r1:1:qryId2::reset')]");
                    elements.put("search_arc2_i_sequence", "//*[contains(@id, 'r1:1:qryId2:value00::content')]");
                    elements.put("search_arc2_i_creation_date", "//*[contains(@id, 'r1:1:qryId2:value10::content')]");
                    elements.put("search_arc2_sl_service_type", "//*[contains(@id, 'r1:1:qryId2:value20::content')]");
                    elements.put("search_arc2_sl_service_status", "//*[contains(@id, 'r1:1:qryId2:value30::content')]");
                    elements.put("search_arc2_i_external_agency_code", "//*[contains(@id, 'r1:1:qryId2:value40::content')]");
                    elements.put("search_arc2_lov_external_agency_code", "//*[contains(@id, 'r1:1:qryId2:value40::lovIconId')]");
                    elements.put("search_arc2_i_external_agency_description", "//*[contains(@id, 'r1:1:qryId2:value50::content')]");
                    elements.put("search_arc2_i_remarks", "//*[contains(@id, 'r1:1:qryId2:value60::content')]");
                    elements.put("search_arc2_i_status", "//*[contains(@id, 'r1:1:qryId2:value70::content')]");
                    elements.put("search_arc2_e_sequence_result", "//*[contains(@id, 'r1:1:pc3:asisted::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
                    elements.put("search_arc2_e_creation_date_result", "//*[contains(@id, 'r1:1:pc3:asisted::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
                    elements.put("search_prrb2_e_sequence_result", "//*[contains(@id, 'r1:1:pc4:params::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
            //QBE
                //ROLLBACK CORE2
                    elements.put("qbe_rbc2_i_sequence", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c7::content')]");
                    elements.put("qbe_rbc2_i_date", "//*[contains(@id, 'r1:1:pc1:rolback:id2::content')]");
                    elements.put("qbe_rbc2_i_external_agency_code", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c5::content')]");
                    elements.put("qbe_rbc2_i_external_agency_name", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c1::content')]");
                    elements.put("qbe_rbc2_i_B2B_reference", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c4::content')]");
                    elements.put("qbe_rbc2_i_hotelbeds_reference", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c6::content')]");
                    elements.put("qbe_rbc2_i_modification_date", "//*[contains(@id, 'r1:1:pc1:rolback:id7::content')]");
                    elements.put("qbe_rbc2_i_remarks", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c3::content')]");
                    elements.put("qbe_rbc2_i_status", "//*[contains(@id, 'afr_pc1_afr_rolback_afr_c8::content')]");
                //PARAMETERS ROLLBACK C2
                    elements.put("qbe_prb2_i_sequence", "//*[contains(@id, 'afr_pc2_afr_rolparm_afr_c10::content')]");
                    elements.put("qbe_prb2_i_name", "//*[contains(@id, 'afr_pc2_afr_rolparm_afr_c11::content')]");
                    elements.put("qbe_prb2_i_value", "//*[contains(@id, 'afr_pc2_afr_rolparm_afr_c12::content')]");
                //ASSISTED ROLLBACK CORE2
                    elements.put("qbe_arc2_i_sequence", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c15::content')]");
                    elements.put("qbe_arc2_i_creation_date", "//*[contains(@id, 'r1:1:pc3:asisted:id5::content')]");
                    elements.put("qbe_arc2_i_service_type", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c18::content')]");
                    elements.put("qbe_arc2_i_service_status", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c17::content')]");
                    elements.put("qbe_arc2_i_external_agency_code", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c16::content')]");
                    elements.put("qbe_arc2_i_nom", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c19::content')]");
                    elements.put("qbe_arc2_i_remarks", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c20::content')]");
                    elements.put("qbe_arc2_i_status", "//*[contains(@id, 'afr_pc3_afr_asisted_afr_c13::content')]");
                //PARAMETERS ROLLBACK C2 (2)
                    elements.put("qbe_prrb2_i_sequence", "//*[contains(@id, 'afr_pc4_afr_params_afr_c24::content')]");
                    elements.put("qbe_prrb2_i_name", "//*[contains(@id, 'afr_pc4_afr_params_afr_c23::content')]");
                    elements.put("qbe_prrb2_i_value", "//*[contains(@id, 'afr_pc4_afr_params_afr_c22::content')]");
    }
}