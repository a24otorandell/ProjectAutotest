package screen.AT2TRFSU0012;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 06/09/2016.
 */
public class AT2TRFSU0012Locators {


    Map<String, String> elements = new HashMap<>();

    public AT2TRFSU0012Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {


        //ADD

        elements.put("b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("add_i_code", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("add_i_description", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("add_cb_terminal", "//*[contains(@id, 'sbc4::content')]");
        elements.put("add_lov", "//*[contains(@id, 'pcgt1:gaerCodAeropuertoId::lovIconId')]");
        elements.put("add_i_tercod", "//*[contains(@id, 'pcgt1:gaerCodAeropuertoId::content')]");
        elements.put("add_i_tercod2", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");


    }
}
