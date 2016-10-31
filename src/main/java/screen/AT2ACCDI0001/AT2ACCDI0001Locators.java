package screen.AT2ACCDI0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 28/10/2016.
 */
public class AT2ACCDI0001Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2ACCDI0001Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

        //AT2BOOSA0001

        // Busqueda de reservas con hotel

        elements.put("boosa1_i_creation_date","//*[contains(@id, '1:id4::content')]");
        elements.put("boosa1_b_advanced_search","//*[contains(@id, '1:cb2')]");
        elements.put("boosa1_ch_only_hotel","//*[contains(@id, 'it20::content')]");
        elements.put("boosa1_b_search","//*[contains(@id, '1:cb3')]");
        elements.put("boosa1_e_result1","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("boosa1_e_result2","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[2]/td[1]");
        elements.put("boosa1_e_result3","//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[3]/td[1]");


        /*elements.put("", "//*[contains(@id, '");*/
    }

}
