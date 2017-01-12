package screen.AT2MDMCL0001;

import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.FileGestor.DataHarvester;
import sun.text.resources.cldr.yav.FormatData_yav;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by acarrillo on 11/01/2017.
 */
public class AT2MDMCL0001Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0001Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMCL0001Values.txt");
        setData();
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultData();
        }
    }
    public void setDefaultData() {
        //CREATION-CUSTOMER RISTER REQUEST
        String list_administrative_customer[] = {"COMPANY", "CRUISES", "HOTEL","TOUR DESK"};
        data.put("administrative_customer",(list_administrative_customer[new Random().nextInt(list_administrative_customer.length)]));
        data.put("short_name","name_"+ DataGenerator.getRandomAlphanumericSequence(6,false));
        data.put("commercial_name","name_"+ DataGenerator.getRandomAlphanumericSequence(6,false));
        String list_relationship[] = {"3rd Party", "Associated inhous", "Inhouse"};
        data.put("relationship",(list_relationship[new Random().nextInt(list_relationship.length)]));
        String list_division[] = {"Destination Services", "Hotelbeds", "TAB"};
        data.put("division",(list_division[new Random().nextInt(list_division.length)]));
        String list_direct_hotel_payment[] = {"Yes", "both", "no"};
        data.put("direct_hotel_payment",(list_direct_hotel_payment[new Random().nextInt(list_direct_hotel_payment.length)]));
        data.put("source_market","Spain");
        data.put("office_comments","comments_"+ DataGenerator.getRandomAlphanumericSequence(25,false));
        //CREATION-ADMINISTRATIVE PROFILE-ADDRES
        data.put("fiscal_number","B"+ DataGenerator.getRandomAlphanumericSequence(8,false));
        data.put("fiscal_name", DataGenerator.getRandomAlphanumericSequence(6,false));
        data.put("administrative_street","C/ "+ DataGenerator.getRandomAlphanumericSequence(9,false));
        data.put("city",DataGenerator.getRandomAlphanumericSequence(6,false));
        data.put("post_code", String.valueOf(DataGenerator.random(00000,99999)));
        data.put("country","Spain");
        data.put("province","ISLAS BALEARES");
        //Only use in local langauge have a special characters
        //data.put("local_name",DataGenerator.getRandomAlphanumericSequence(6,false));
        //data.put("street_local",DataGenerator.getRandomAlphanumericSequence(6,false));
        //data.put("city_local",DataGenerator.getRandomAlphanumericSequence(6,false));
        data.put("billing_language","Castellano");
        //CREATION-ADMINISTRATIVE PROFILE-CONTACT
        data.put("administrative_phone", String.valueOf(DataGenerator.random(1000,999999999)));
        data.put("administrative_email",DataGenerator.getRandomAlphanumericSequence(6,false)+"@"+
                DataGenerator.getRandomAlphanumericSequence(4,false)+".es");
        data.put("fax", String.valueOf(DataGenerator.random(1000,999999999)));
        data.put("contact_language","Ingles");
        //CREATION-COMMERCIAL PROFILE-ADDRES
        data.put("commercial_street","C/ "+ DataGenerator.getRandomAlphanumericSequence(9,false));
        data.put("account_owner",DataGenerator.getRandomAlphanumericSequence(6,false));
        String salutation[] = {"Dr", "Mr", "Mrs","Ms"};
        data.put("salutation",(salutation[new Random().nextInt(salutation.length)]));
        data.put("first_name",DataGenerator.getRandomAlphanumericSequence(6,false));
        data.put("last_name",DataGenerator.getRandomAlphanumericSequence(6,false));
        data.put("comercial_phone",String.valueOf(DataGenerator.random(1000,999999999)));
        data.put("commercial_email",DataGenerator.getRandomAlphanumericSequence(6,false)+"@"+
                DataGenerator.getRandomAlphanumericSequence(4,false)+".es");
        data.put("currency_to_invoice","Euro");

    }
}
