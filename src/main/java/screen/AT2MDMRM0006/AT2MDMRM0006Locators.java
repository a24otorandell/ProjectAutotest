package screen.AT2MDMRM0006;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMRM0006Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMRM0006Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        //CHANNEL
        elements.put("MDM_b_channel_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("MDM_b_channel_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("MDM_b_channel_actions", "//*[contains(@id, 'pcgm2:dc_m1')]");
        elements.put("MDM_b_channel_actions_audit_data", "//*[contains(@id, 'pc2:pcgm2:dc_cmi1')]/td[2]");
        elements.put("MDM_b_channel_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]");
        elements.put("MDM_b_channel_show_detach", "//*[contains(@id, '_tbr::eoi')]");
        elements.put("MDM_b_channel_detach", "//*[contains(@id, 'pc2:_dchTbr')]");
        elements.put("MDM_e_channel_result", "//*[contains(@id, 'Retexc1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_channel_show_records", "//*[contains(@id, 'toolbar1::eoi')]");
        elements.put("MDM_e_channel_records", "//*[contains(@id, 'pc2:outputText3')]");
        //CHANNEL DESCRIPTION
        elements.put("MDM_b_channel_description_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("MDM_b_channel_description_edit", "//*[contains(@id, 'pcgt2:boton_edit')]");
        elements.put("MDM_b_channel_description_delete", "//*[contains(@id, 'pcgt2:boton_remove')]");
        elements.put("MDM_b_channel_description_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("MDM_b_channel_description_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("MDM_e_channel_description_result", "//*[contains(@id, 'dett1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("MDM_e_channel_description_records", "//*[contains(@id, 'pc1:outputText5')]");
        //ADD|MODIFY
        //CHANNEL
        elements.put("add_b_channel_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("add_i_channel_code", "//*[contains(@id, 'pcgt1:it1::content')]");
        //CHANNEL DESCRIPTION
        elements.put("add_b_channel_description_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");
        elements.put("add_i_language", "//*[contains(@id, 'pcgt2:sidiCodIdiomaId::content')]");
        elements.put("add_lov_language", "//*[contains(@id, 'pcgt2:sidiCodIdiomaId::lovIconId')]");
        elements.put("add_e_description_result", "//*[contains(@id, 'pc1:dett1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("add_i_channel_description", "//*[contains(@id, 'pcgt2:it2::content')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("search_b_reset", "//*[contains(@id, 'qryId1::reset')]");
        elements.put("search_i_channel_code", "//*[contains(@id, 'qryId1:value00::content')]");
        //QBE
        //CHANNEL
        elements.put("qbe_i_channel_code", "//*[contains(@id, 'afr_resId1c1::content')]");
        //CHANNEL DESCRIPTION
        elements.put("qbe_i_language", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("qbe_i_description", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("qbe_i_channel_description", "//*[contains(@id, 'afr_c4::content')]");
    }
}
