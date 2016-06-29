package screen.AT2ACCOP0025;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/***
 * Created by ajvirgili on 23/06/2016.
 */
public class AT2ACCOP0025Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCOP0025Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCOP0025Values.txt");
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
        data.put("initial_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-5, -2), 0));
        data.put("update_initial_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(-10, -6), 0));
        data.put("end_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(1, 5), 0));
        data.put("update_end_date", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, DataGenerator.random(6, 10), 0));
        data.put("provider", Integer.toString(1));
        data.put("update_provider", Integer.toString(2));
        data.put("update_provider_description", "World Pay");
        data.put("merchant", "SAIBSA PRUEBA");
        data.put("update_merchant", "prueba55");
        data.put("update_submerchant", "prueba55");
        data.put("payment_method", "CARD");
        data.put("update_payment_method", "VISA");
        data.put("update_payment_method_description", "Visa");
        data.put("fix", Integer.toString(DataGenerator.random(1, 10)));
        data.put("update_fix", Integer.toString(DataGenerator.random(1, 10)));
        data.put("percentage", Integer.toString(DataGenerator.random(1, 100)));
        data.put("update_percentage", Integer.toString(DataGenerator.random(1, 100)));
        data.put("currency_fix", "GBP");
        data.put("update_currency_fix", "EUR");
        data.put("update_currency_fix_description", "Euro");
    }
}
