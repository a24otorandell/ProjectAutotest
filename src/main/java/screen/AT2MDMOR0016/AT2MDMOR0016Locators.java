package screen.AT2MDMOR0016;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMOR0016Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMOR0016Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("transfers_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("transfers_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("transfers_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("transfers_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("transfers_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("transfers_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("transfers_e_records", "//*[contains(@id, 'pc1:ot35')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_date", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("search_i_b_company", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("search_lov_b_company", "//*[contains(@id, 'qryId1:value10::lovIconId')]");
        elements.put("search_i_b_office", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("search_lov_b_office", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("search_i_contracting", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("search_lov_contracting", "//*[contains(@id, 'qryId1:value30::lovIconId')]");
        elements.put("search_i_location", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("search_lov_location", "//*[contains(@id, 'qryId1:value40::lovIconId')]");
        elements.put("search_sl_service", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("search_sl_allotment", "//*[contains(@id, 'qryId1:value60::content')]");
        elements.put("search_i_p_contracting", "//*[contains(@id, 'qryId1:value70::content')]");
        elements.put("search_i_p_billing", "//*[contains(@id, 'qryId1:value80::content')]");
        elements.put("search_i_p_allotment", "//*[contains(@id, 'qryId1:value90::content')]");
        elements.put("search_i_extra", "//*[contains(@id, 'qryId1:value100::content')]");
        elements.put("search_lov_extra", "//*[contains(@id, 'qryId1:value100::lovIconId')]");
        //ADD
        elements.put("add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_date", "//*[contains(@id, 'pc1:pcgt1:id2::content')]");
        elements.put("add_i_b_company", "//*[contains(@id, 'pc1:pcgt1:cODEMPFAC1Id::content')]");
        elements.put("add_lov_b_company", "//*[contains(@id, 'pc1:pcgt1:cODEMPFAC1Id::lovIconId')]");
        elements.put("add_i_b_office", "//*[contains(@id, 'pc1:pcgt1:cODOFIFACId::content')]");
        elements.put("add_lov_b_office", "//*[contains(@id, 'pc1:pcgt1:cODOFIFACId::lovIconId')]");
        elements.put("add_i_location", "//*[contains(@id, 'pc1:pcgt1:inputListOfValues1::content')]");
        elements.put("add_lov_location", "//*[contains(@id, 'pc1:pcgt1:inputListOfValues1::lovIconId')]");
        elements.put("add_i_b_desc", "//*[contains(@id, 'pc1:pcgt1:it5::content')]");
        elements.put("add_i_contracting", "//*[contains(@id, 'pc1:pcgt1:codEmpContratacion1Id::content')]");
        elements.put("add_lov_contracting", "//*[contains(@id, 'pc1:pcgt1:codEmpContratacion1Id::lovIconId')]");
        elements.put("add_sl_service", "//*[contains(@id, 'pc1:pcgt1:soc3::content')]");
        elements.put("add_sl_allotment", "//*[contains(@id, 'pc1:pcgt1:soc2::content')]");
        elements.put("add_i_p_contracting", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        elements.put("add_p_billing", "//*[contains(@id, 'pc1:pcgt1:it3::content')]");
        elements.put("add_p_allotment", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
        elements.put("add_i_extra", "//*[contains(@id, 'pc1:pcgt1:inputListOfValues2::content')]");
        elements.put("add_lov_extra", "//*[contains(@id, 'pc1:pcgt1:inputListOfValues2::lovIconId')]");
        //QBE
        elements.put("qbe_i_date", "//*[contains(@id, 'pc1:resId1:id1::content')]");
        elements.put("qbe_i_b_company", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_b_office", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_location", "//*[contains(@id, 'afr_resId1c6::content')]");
        elements.put("qbe_i_b_des", "//*[contains(@id, 'afr_resId1c4::content')]");
        elements.put("qbe_i_contracting", "//*[contains(@id, 'afr_resId1c5::content')]");
        elements.put("qbe_sl_service", "//*[contains(@id, 'pc1:resId1:socc4::content')]");
        elements.put("qbe_sl_allotment", "//*[contains(@id, 'pc1:resId1:socc44::content')]");
        elements.put("qbe_i_p_contracting", "//*[contains(@id, 'afr_resId1c9::content')]");
        elements.put("qbe_i_p_billing", "//*[contains(@id, 'afr_resId1c10::content')]");
        elements.put("qbe_i_p_allotment", "//*[contains(@id, 'afr_resId1c11::content')]");
        elements.put("qbe_i_p_extra", "//*[contains(@id, 'afr_resId1c12::content')]");
    }
}
