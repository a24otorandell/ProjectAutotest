package screen.AT2MDMSP0028;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 11/11/2016.
 */
public class AT2MDMSP0028Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMSP0028Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //SELECT TEXT
        elements.put("select_text_supplier", "//*[contains(@id, 'r1:1:soc1::content')]");
        //OK
        elements.put("select_text_supplier_ok", "//*[contains(@id, 'r1:1:cb3')]");
    }
}
