package screen.AT2TRFSU0016;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 07/09/2016.
 */
public class AT2TRFSU0016Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0016Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("b_add", "//*[contains(@id, 'pcgt2:boton_add')]");
        elements.put("add_lov", "//*[contains(@id, 'pcgt2:codSuplId::lovIconId')]");
        elements.put("add_lov_alc", "//*[contains(@id, 'pcgt2:codSuplId_afrLovInternalTableId::db')]/table/tbody/tr[9]/td[1]");
        elements.put("add_i_stype", "//*[contains(@id, 'pcgt2:codSuplId::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt2:it3::content')]");
        elements.put("add_ss_pursa", "//*[contains(@id, 'pcgt2:soc4::content')]");
        elements.put("add_lov2", "//*[contains(@id, 'pcgt2:desProvId::lovIconId')]");
        elements.put("add_i_supli", "//*[contains(@id, 'pcgt2:desProvId::content')]");
        elements.put("add_ss_perun", "//*[contains(@id, 'pcgt2:soc3::content')]");
        elements.put("add_i_unit", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_lov3", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("add_lov4", "//*[contains(@id, 'pcgt2:codGuiaId::lovIconId')]");
        elements.put("add_i_guide", "//*[contains(@id, 'pcgt2:codGuiaId::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");
        elements.put("b_save", "//*[contains(@id, 'pcgt2:btn_commitExit')]");

        //Search

        elements.put("s_lov", "//*[contains(@id, 'qryId1:value00::lovIconId')]");
        elements.put("s_i_additional", "//*[contains(@id, 'qryId1:value00::content')]");
        elements.put("s_ss_pursa", "//*[contains(@id, 'qryId1:value10::content')]");
        elements.put("s_lov2", "//*[contains(@id, 'qryId1:value20::lovIconId')]");
        elements.put("s_i_supli", "//*[contains(@id, 'qryId1:value20::content')]");
        elements.put("s_ss_perun", "//*[contains(@id, 'qryId1:value30::content')]");
        elements.put("s_i_unit", "//*[contains(@id, 'qryId1:value40::content')]");
        elements.put("s_lov3", "//*[contains(@id, 'qryId1:value50::lovIconId')]");
        elements.put("", "//*[contains(@id, 'qryId1:value50::content')]");
        elements.put("add_i_unit", "//*[contains(@id, 'pcgt2:it1::content')]");
        elements.put("add_lov3", "//*[contains(@id, 'pcgt2:codDivisaId::lovIconId')]");
        elements.put("add_i_currency", "//*[contains(@id, 'pcgt2:codDivisaId::content')]");
        elements.put("add_lov4", "//*[contains(@id, 'pcgt2:codGuiaId::lovIconId')]");
        elements.put("add_i_guide", "//*[contains(@id, 'pcgt2:codGuiaId::content')]");
        elements.put("add_i_remarks", "//*[contains(@id, 'pc1:pcgt2:it2::content')]");


    }
}
