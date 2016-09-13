package screen.AT2TRFSU0009;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 12/09/2016.
 */
public class AT2TRFSU0009Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0009Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("transfer_day_ad_b_add", "//*[contains(@id, 'tgenericbar0:boton_add')]");
        elements.put("transfer_day_ad_check_box_active", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailIndActivo::content')]");
        elements.put("transfer_day_ad_lov_company", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodEmpresa::lovIconId')]");
        elements.put("transfer_day_ad_i_company_code", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodEmpresa::content')]");
        elements.put("transfer_day_ad_i_description", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailDescEmpresa::content')]");
        elements.put("transfer_day_ad_lov_office", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodOficina::lovIconId')]");
        elements.put("transfer_day_ad_i_office_code", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodOficina::content')]");
        elements.put("transfer_day_ad_i_office_descriptoin", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailDescOficina::content')]");
        elements.put("transfer_day_ad_i_date_from", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailFechaDesde::content')]");
        elements.put("transfer_day_ad_i_date_to", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailFechaHasta::content')]");
        elements.put("transfer_day_ad_i_time", "//*[contains(@id, 'tgenericbar0:it2::content')]");
        elements.put("transfer_day_ad_i_remarks", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailObservaciones::content')]");
        elements.put("transfer_day_ad_selec_text_ind", "//*[contains(@id, 'tgenericbar0:soc2::content')]");
        elements.put("transfer_day_ad_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");


        //SEARCH

        elements.put("transfer_day_se_select_text_active", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("transfer_day_se_lov_company", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("transfer_day_se_i_company_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("transfer_day_se_i_company", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("transfer_day_se_lov_offce", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("transfer_day_se_i_office_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("transfer_day_se_i_office", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("transfer_day_se_i_date_form", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("transfer_day_se_i_date_to", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("transfer_day_se_i_time", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("transfer_day_se_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("transfer_day_se_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("transfer_day_se_b_result", "//*[contains(@id, 'trt1::db')]/table/tbody/tr[1]/td[1]");


        //EDIT

        elements.put("transfer_day_ed_b_edit", "//*[contains(@id, 'tgenericbar0:boton_edit')]");
        elements.put("transfer_day_ed_check_box_active", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailIndActivo::content')]");
        elements.put("transfer_day_ed_lov_company", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodEmpresa::lovIconId')]");
        elements.put("transfer_day_ed_i_company_code", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodEmpresa::content')]");
        elements.put("transfer_day_ed_i_description", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailDescEmpresa::content')]");
        elements.put("transfer_day_ed_lov_office", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodOficina::lovIconId')]");
        elements.put("transfer_day_ed_i_office_code", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailCodOficina::content')]");
        elements.put("transfer_day_ed_i_office_description", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailDescOficina::content')]");
        elements.put("transfer_day_ed_i_date_from", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailFechaDesde::content')]");
        elements.put("transfer_day_ed_i_date_to", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailFechaHasta::content')]");
        elements.put("transfer_day_ed_i_time", "//*[contains(@id, 'tgenericbar0:it2::content')]");
        elements.put("transfer_day_ed_i_remarks", "//*[contains(@id, 'tgenericbar0:ReTTrTransferDayVODetailObservaciones::content')]");
        elements.put("transfer_day_ed_selec_text_ind", "//*[contains(@id, 'tgenericbar0:soc2::content')]");
        elements.put("transfer_day_ed_b_save", "//*[contains(@id, 'tgenericbar0:btn_commitExit')]");


        //QBE

        elements.put("transfer_day_qbe_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("transfer_day_qbe_select_text_active", "//*[contains(@id, 'trt1:soc1::content')]");
        elements.put("transfer_day_qbe_cod_company", "//*[contains(@id, 'trt1_afr_ReTTrTransferDayVOCodEmpresaCol::content')]");
        elements.put("transfer_day_qbe_cod_office", "//*[contains(@id, 'trt1_afr_ReTTrTransferDayVOCodOficinaCol::content')]");
        elements.put("transfer_day_qbe_i_office_description", "//*[contains(@id, 'afr_ReTTrTransferDayVODescOficinaCol::content')]");
        elements.put("transfer_day_qbe_i_date_from", "//*[contains(@id, 'trt1:id2::content')]");
        elements.put("transfer_day_qbe_i_date_to", "//*[contains(@id, 'trt1:id1::content')]");
        elements.put("transfer_day_qbe_i_time", "//*[contains(@id, 'afr_trt1_afr_c1::content')]");
        elements.put("transfer_day_qbe_i_remarks", "//*[contains(@id, 'afr_ReTTrTransferDayVOObservacionesCol::content')]");


        //OTHER ACTIONS
        elements.put("transfer_day_ac_b_actions", "//*[contains(@id, 'tgenericMenu0:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("transfer_day_ac_b_audit_data", "//*[contains(@id, 'tgenericMenu0:dc_cmi1')]/td[2]");
        elements.put("transfer_day_ac_b_auidit_data_exit", "//*[contains(@id, 'dialog1::close')]");
        elements.put("transfer_day_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE

        elements.put("transfer_day_del_b_delete", "//*[contains(@id, 'tgenericbar0:boton_remove')]");
        elements.put("transfer_day_del_b_ok", "//*[contains(@id, 'tgenericbar0:cbt1')]");
        elements.put("transfer_day_records", "//*[contains(@id, 'pc1:ot2')]");

    }

}
