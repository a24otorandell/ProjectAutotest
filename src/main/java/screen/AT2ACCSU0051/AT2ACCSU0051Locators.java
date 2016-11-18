package screen.AT2ACCSU0051;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2ACCSU0051Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCSU0051Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){
        //ESTABLISHMENT HOTEL DATA

        //ADD
        elements.put("establishment_hotel_data_add_b_add","//*[contains(@id, 'pc1:pcgt2:boton_add')]");


    }
}
