package screen.AT2MDMSP0036;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 21/12/2016.
 */
public class AT2MDMSP0036Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0036Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERALS
        elements.put("hotel_b_actions", "//*[contains(@id, 'pcgm1:dc_m1')]");
        elements.put("hotel_b_actions_b2b", "//*[contains(@id, 'pcgm1:dc_cmi4')]/td[2]");
        elements.put("search_b_search", "//*[contains(@id, 'qryId1::search')]");
        elements.put("hotel_e_result", "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[1]/td[1]");
    }
}
