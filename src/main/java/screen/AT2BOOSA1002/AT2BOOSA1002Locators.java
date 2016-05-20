package screen.AT2BOOSA1002;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Locators {
    Map<String, String> elements = new HashMap<>();
    public AT2BOOSA1002Locators() {
        setElements();
    }
    public Map<String, String> getElements() {
        return elements;
    }
    public void setElements() {
        //Header
        elements.put("header_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("header_add_i_interface", "//*[contains(@id, 'fintCodInterfaceId::content')]");
        elements.put("header_add_lov_interface", "//*[contains(@id, 'fintCodInterfaceId::lovIconId')]");
        elements.put("header_add_i_to", "//*[contains(@id, 'nomTtooId::content')]");
        elements.put("header_add_lov_to", "//*[contains(@id, 'nomTtooId::lovIconId')]");
        elements.put("header_add_i_branch", "//*[contains(@id, 'gsucCodSucId::content')]");
        elements.put("header_add_lov_branch", "//*[contains(@id, 'gsucCodSucId::lovIconId')]");
        elements.put("header_add_i_user", "//*[contains(@id, 'nomAgenteId::content')]");
        elements.put("header_add_lov_user", "//*[contains(@id, 'ilov1::lovIconId')]");
        elements.put("header_add_i_user", "//*[contains(@id, 'rtreCodTipoRes::content')]");
        elements.put("header_add_lov_user", "//*[contains(@id, 'rtreCodTipoRes::lovIconId')]");
        elements.put("header_add_i_despt", "//*[contains(@id, 'soc11::content')]");
        elements.put("header_add_i_adults", "//*[contains(@id, 'it19::content')]");
        elements.put("header_add_i_child", "//*[contains(@id, 'it20::content')]");
        elements.put("header_add_i_baby", "//*[contains(@id, 'it21::content')]");
        elements.put("header_add_i_pax_mane", "//*[contains(@id, 'it22::content')]");
        elements.put("header_add_i_transfers_valuation", "//*[contains(@id, 'soc3::content')]");
        elements.put("header_add_b_save", "//*[contains(@id, 'pcgt1:boton_commit')]");


        //search
        elements.put("search_b_icon", "//*[contains(@id, 'cb2::icon')]");
        elements.put("search_i_booking", "//*[contains(@id, 'it55::content')]");
        elements.put("search_b_search", "//*[contains(@id, '0:cb1header')]");

        elements.put("search_e_result", "//*[contains(@id, 'pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("search_result_b_actions", "//*[contains(@id, 'pc1:pdm12:dc_m1')]");
        elements.put("search_result_actions_b_graphic", "//*[contains(@id, 'pc1:pdm12:dc_cmi9')]/td[2]");
    }
}
