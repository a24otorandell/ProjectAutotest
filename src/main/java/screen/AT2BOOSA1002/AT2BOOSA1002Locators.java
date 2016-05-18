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
        //SEARCH
        elements.put("boosa1002_search_b_icon", "//*[contains(@id, 'cb2::icon')]");
        elements.put("boosa1002_search_i_booking", "//*[contains(@id, 'it55::content')]");
        elements.put("boosa1002_search_b_search", "//*[contains(@id, '0:cb1header')]");

        elements.put("boosa1002_search_e_result", "//*[contains(@id, 'pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("boosa1002_search_result_b_actions", "//*[contains(@id, 'pc1:pdm12:dc_m1')]");
        elements.put("boosa1002_search_result_actions_b_graphic", "//*[contains(@id, 'pc1:pdm12:dc_cmi9')]/td[2]");
    }
}
