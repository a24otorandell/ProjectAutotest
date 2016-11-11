package screen.AT2MDMUS0005;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 11/11/2016.
 */
public class AT2MDMUS0005Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2MDMUS0005Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //GENERAL
            elements.put("MDM_show_buttons", "//*[contains(@id, 'r1:1:pcgt5:dc_t1::eoi')]");
        //ADD
            elements.put("add_b_save", "//*[contains(@id, 'r1:1:pcgt5:boton_commit')]");
            elements.put("add_i_new_password", "//*[contains(@id, 'r1:1:it3::content')]");
            elements.put("add_i_confirm_password", "//*[contains(@id, 'r1:1:it2::content')]");
    }
}
