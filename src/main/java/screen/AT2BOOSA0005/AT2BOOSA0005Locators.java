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
        elements.put("element_id", "//*[contains(@id, 'things')]");
    }
}