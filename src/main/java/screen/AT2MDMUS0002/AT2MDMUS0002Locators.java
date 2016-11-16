package screen.AT2MDMUS0002;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 15/11/2016.
 */
public class AT2MDMUS0002Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0002Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
            //JOB POSITION
                elements.put("MDM_jp_b_add", "//*[contains(@id, 'r1:1:pc1:pcgt2:boton_add')]");
                elements.put("MDM_jp_b_delete", "//*[contains(@id, 'r1:1:pc1:pcgt2:boton_remove')]");
                elements.put("MDM_jp_b_delete_ok", "//*[contains(@id, 'r1:1:pc1:pcgt2:cbt1')]");
                elements.put("MDM_jp_b_edit", "//*[contains(@id, 'r1:1:pc1:pcgt2:boton_edit')]");
                elements.put("MDM_jp_b_qbe", "//*[contains(@id, 'r1:1:pc1:_qbeTbr')]");
                elements.put("MDM_jp_b_qbe_clear", "//*[contains(@id, 'r1:1:pc1:MasterT::ch::t')]/tbody/tr[2]/th/a");
                elements.put("MDM_jp_b_detach", "//*[contains(@id, 'r1:1:pc1:_dchTbr')]");
                elements.put("MDM_jp_e_result", "//*[contains(@id, 'r1:1:pc1:MasterT::db')]/table/tbody/tr/td[1]");
                elements.put("MDM_jp_e_records", "//*[contains(@id, 'r1:1:pc1:ot2')]");
            //JOB POSITION PRINTER
                elements.put("MDM_jpp_b_add", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_add')]");
                elements.put("MDM_jpp_b_delete", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_remove')]");
                elements.put("MDM_jpp_b_delete_ok", "//*[contains(@id, 'r1:1:pc2:pcgt1:cbt1')]");
                elements.put("MDM_jpp_b_edit", "//*[contains(@id, 'r1:1:pc2:pcgt1:boton_edit')]");
                elements.put("MDM_jpp_b_qbe", "//*[contains(@id, 'r1:1:pc2:_qbeTbr')]");
                elements.put("MDM_jpp_b_qbe_clear", "//*[contains(@id, 'r1:1:pc2:ChildT::ch::t')]/tbody/tr[2]/th/a");
                elements.put("MDM_jpp_b_detach", "//*[contains(@id, 'r1:1:pc2:_dchTbr')]");
                elements.put("MDM_jpp_e_result", "//*[contains(@id, 'r1:1:pc2:ChildT::db')]/table/tbody/tr[1]/td[1]");
                elements.put("MDM_jpp_e_records", "//*[contains(@id, 'r1:1:pc2:ot12')]");
            //ACTIONS
                elements.put("MDM_act_b_search_ip", "//*[contains(@id, 'r1:1:cb1')]");
                elements.put("MDM_act_b_copy_id", "//*[contains(@id, 'r1:1:cb2')]");
                elements.put("MDM_act_b_copy_paper_type", "//*[contains(@id, 'r1:1:cb3')]");
        //ADD|MODIFY
            //JOB POSITION
                elements.put("add_jp_b_save", "//*[contains(@id, 'r1:1:pc1:pcgt2:btn_commitExit')]");
                elements.put("add_jp_i_job_position", "//*[contains(@id, 'r1:1:pc1:pcgt2:it7::content')]");
                elements.put("add_jp_i_description", "//*[contains(@id, 'r1:1:pc1:pcgt2:it3::content')]");
                elements.put("add_jp_i_short_name", "//*[contains(@id, 'r1:1:pc1:pcgt2:it2::content')]");
                elements.put("add_jp_i_company", "//*[contains(@id, 'r1:1:pc1:pcgt2:gdofGofiPempCodEmpId::content')]");
                elements.put("add_jp_lov_company", "//*[contains(@id, 'r1:1:pc1:pcgt2:gdofGofiPempCodEmpId::lovIconId')]");
                elements.put("add_jp_e_company_description", "//*[contains(@id, 'r1:1:pc1:pcgt2:it8::content')]");
                elements.put("add_jp_i_office", "//*[contains(@id, 'r1:1:pc1:pcgt2:gdofGofiCodOfiId::content')]");
                elements.put("add_jp_lov_office", "//*[contains(@id, 'r1:1:pc1:pcgt2:gdofGofiCodOfiId::lovIconId')]");
                elements.put("add_jp_e_office_description", "//*[contains(@id, 'r1:1:pc1:pcgt2:it1::content')]");
                elements.put("add_jp_i_department", "//*[contains(@id, 'r1:1:pc1:pcgt2:gdofGdepCodDepartId::content')]");
                elements.put("add_jp_lov_department", "//*[contains(@id, 'r1:1:pc1:pcgt2:gdofGdepCodDepartId::lovIconId')]");
                elements.put("add_jp_e_department_description", "//*[contains(@id, 'r1:1:pc1:pcgt2:it9::content')]");
            //JOB POSITION PRINTER
                elements.put("add_jpp_b_save", "//*[contains(@id, 'r1:1:pc2:pcgt1:btn_commitExit')]");
                elements.put("add_jpp_i_spooler", "//*[contains(@id, 'r1:1:pc2:pcgt1:giprSpoolerId::content')]");
                elements.put("add_jpp_lov_spooler", "//*[contains(@id, 'r1:1:pc2:pcgt1:giprSpoolerId::lovIconId')]");
                elements.put("add_jpp_e_printer", "//*[contains(@id, 'r1:1:pc2:pcgt1:it14::content')]");
                elements.put("add_jpp_i_paper", "//*[contains(@id, 'r1:1:pc2:pcgt1:gtplCodTipoPapelId::content')]");
                elements.put("add_jpp_lov_paper", "//*[contains(@id, 'r1:1:pc2:pcgt1:gtplCodTipoPapelId::lovIconId')]");
                elements.put("add_jpp_e_company", "//*[contains(@id, 'r1:1:pc2:pcgt1:it13::content')]");
                elements.put("add_jpp_e_office", "//*[contains(@id, 'r1:1:pc2:pcgt1:it12::content')]");
                elements.put("add_jpp_e_department", "//*[contains(@id, 'r1:1:pc2:pcgt1:it10::content')]");
                elements.put("add_jpp_cb_default", "//*[contains(@id, 'r1:1:pc2:pcgt1:sbc1::content')]");
        //SEARCH
            //JOB POSITION
                elements.put("search_b_search", "//*[contains(@id, 'r1:1:qryId1::search')]");
                elements.put("search_b_reset", "//*[contains(@id, 'r1:1:qryId1::reset')]");
                elements.put("search_jp_i_job_position", "//*[contains(@id, 'r1:1:qryId1:value00::content')]");
                elements.put("search_jp_i_description", "//*[contains(@id, 'r1:1:qryId1:value10::content')]");
                elements.put("search_jp_i_short_name", "//*[contains(@id, 'r1:1:qryId1:value20::content')]");
                elements.put("search_jp_i_company", "//*[contains(@id, 'r1:1:qryId1:value30::content')]");
                elements.put("search_jp_lov_company", "//*[contains(@id, 'r1:1:qryId1:value30::lovIconId')]");
                elements.put("search_jp_i_company_description", "//*[contains(@id, 'r1:1:qryId1:value40::content')]");
                elements.put("search_jp_i_office", "//*[contains(@id, 'r1:1:qryId1:value50::content')]");
                elements.put("search_jp_lov_office", "//*[contains(@id, 'r1:1:qryId1:value50::lovIconId')]");
                elements.put("search_jp_i_office_description", "//*[contains(@id, 'r1:1:qryId1:value60::content')]");
                elements.put("search_jp_i_department", "//*[contains(@id, 'r1:1:qryId1:value70::content')]");
                elements.put("search_jp_lov_department", "//*[contains(@id, 'r1:1:qryId1:value70::lovIconId')]");
                elements.put("search_jp_i_department_description", "//*[contains(@id, 'r1:1:qryId1:value80::content')]");
            //ACTIONS
                elements.put("search_act_i_spooler", "//*[contains(@id, 'r1:1:uISpoolerTransId::content')]");
                elements.put("search_act_lov_spooler", "//*[contains(@id, 'r1:1:uISpoolerTransId::lovIconId')]");
                elements.put("search_act_i_ip_address", "//*[contains(@id, 'r1:1:it17::content')]");
        //QBE
            //JOB POSITION
                elements.put("qbe_jp_i_job_position", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c5::content')]");
                elements.put("qbe_jp_i_description", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c10::content')]");
                elements.put("qbe_jp_i_short_name", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c3::content')]");
                elements.put("qbe_jp_i_company", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c6::content')]");
                elements.put("qbe_jp_i_company_description", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c7::content')]");
                elements.put("qbe_jp_i_office", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c4::content')]");
                elements.put("qbe_jp_i_office_description", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c2::content')]");
                elements.put("qbe_jp_i_department", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c8::content')]");
                elements.put("qbe_jp_i_department_description", "//*[contains(@id, 'r1_afr_1_afr_pc1_afr_MasterT_afr_c9::content')]");
            //JOB POSITION PRINTER
                elements.put("qbe_jpp_i_spooler", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_ChildT_afr_c14::content')]");
                elements.put("qbe_jpp_i_printer", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_ChildT_afr_c12::content')]");
                elements.put("qbe_jpp_i_paper", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_ChildT_afr_c16::content')]");
                elements.put("qbe_jpp_i_company", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_ChildT_afr_c15::content')]");
                elements.put("qbe_jpp_i_office", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_ChildT_afr_c17::content')]");
                elements.put("qbe_jpp_i_department", "//*[contains(@id, 'r1_afr_1_afr_pc2_afr_ChildT_afr_c11::content')]");
                elements.put("qbe_jpp_sl_default", "//*[contains(@id, 'r1:1:pc2:ChildT:soc3::content')]");
    }
}
