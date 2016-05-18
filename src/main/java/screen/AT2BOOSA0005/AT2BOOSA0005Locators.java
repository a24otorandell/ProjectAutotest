package screen.AT2BOOSA0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icastaneira on 17/05/2016.
 */
public class AT2BOOSA0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA0005Locators() {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //<editor-fold desc="AT2BOOSA1002">
        //SEARCH
        elements.put("boosa1002_search_b_icon", "//*[contains(@id, 'cb2::icon')]");
        elements.put("boosa1002_search_i_booking", "//*[contains(@id, 'it55::content')]");
        elements.put("boosa1002_search_b_search", "//*[contains(@id, '0:cb1header')]");

        elements.put("boosa1002_search_e_result", "//*[contains(@id, 'pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("boosa1002_search_result_b_actions", "//*[contains(@id, 'pc1:pdm12:dc_m1')]");
        elements.put("boosa1002_search_result_actions_b_graphic", "//*[contains(@id, 'pc1:pdm12:dc_cmi9')]/td[2]");
        //</editor-fold>

        //SEARCH
        elements.put("boosa0005_search_b_monthly", "//*[contains(@id, '1:cb1')]");
        elements.put("boosa0005_search_b_detail", "//*[contains(@id, '1:cb2')]");
        elements.put("boosa1002_search_b_search", "//*[contains(@id, '0:cb1header')]");
    }
}