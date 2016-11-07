package screen.AT2MDMOR0025;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMOR0025Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0025Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("company_b_add", "//*[contains(@id, 'dc_t1::oc')]//*[contains(@id, 'pc1:pcgt1:boton_add')]");
//        elements.put("company_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("company_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("company_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("company_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("company_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("company_e_result", "//*[contains(@id, 'pc1:picTec::db')]/table/tbody/tr[1]/td[1]");
        elements.put("company_e_records", "//*[contains(@id, 'pc1:otp2')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_template", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_order", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_i_lang", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_lang", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_company", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_company", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_receptive", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_i_dfrom", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_i_dtoy", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_sl_type", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_interface", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'qryId1:value80::lovIconId')]");
        elements.put("search_i_web", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_lov_web", "//*[contains(@id, 'qryId1:value90::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_template", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("add_i_order", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("add_i_lang", "//*[contains(@id, 'pcgt1:codIdiomaId::content')]");
        elements.put("add_lov_lang", "//*[contains(@id, 'pcgt1:codIdiomaId::lovIconId')]");
        elements.put("add_i_company", "//*[contains(@id, 'pcgt1:gempCodEmpId::content')]");
        elements.put("add_lov_company", "//*[contains(@id, 'pcgt1:gempCodEmpId::lovIconId')]");
        elements.put("add_i_receptive", "//*[contains(@id, 'pcgt1:grecSeqRecId::content')]");
        elements.put("add_lov_receptive", "//*[contains(@id, 'pcgt1:grecSeqRecId::lovIconId')]");
        elements.put("add_i_dfrom", "//*[contains(@id, 'pcgt1:id1::content')]");
        elements.put("add_i_dto", "//*[contains(@id, 'pcgt1:id2::content')]");
        elements.put("add_sl_type", "//*[contains(@id, 'pcgt1:soc3::content')]");
        elements.put("add_i_interface", "//*[contains(@id, 'pcgt1:codInterfaceId::content')]");
        elements.put("add_lov_interface", "//*[contains(@id, 'pcgt1:codInterfaceId::lovIconId')]");
        elements.put("add_i_web", "//*[contains(@id, 'pcgt1:idWebId::content')]");
        elements.put("add_lov_web", "//*[contains(@id, 'pcgt1:idWebId::lovIconId')]");
        elements.put("add_i_file1", "//*[contains(@id, 'pcgt1:if1::content')]");
        elements.put("add_i_file2", "//*[contains(@id, 'pcgt1:if2::content')]");
        elements.put("add_i_file3", "//*[contains(@id, 'pcgt1:if3::content')]");

        //QBE
        elements.put("qbe_i_template", "//*[contains(@id, 'afr_c10::content')]");
        elements.put("qbe_i_order", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_lang", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("qbe_i_company", "//*[contains(@id, 'afr_c6::content')]");
        elements.put("qbe_i_receptive", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_dfrom", "//*[contains(@id, 'picTec:id3::content')]");
        elements.put("qbe_i_dtoy", "//*[contains(@id, 'picTec:id4::content')]");
        elements.put("qbe_sl_type", "//*[contains(@id, 'picTec:soc2::content')]");
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_c1::content')]");
        elements.put("qbe_i_web", "//*[contains(@id, 'afr_c4::content')]");
    }
}
