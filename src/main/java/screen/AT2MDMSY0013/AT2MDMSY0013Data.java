package screen.AT2MDMSY0013;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMSY0013Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0013Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSY0013DataValues.txt");
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
        data.put("sales_channel_code", DataGenerator.getRandomAlphanumericSequence(2, true));
        data.put("sale_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("sales_channel_code_edit", DataGenerator.getRandomAlphanumericSequence(2, true));
        data.put("sale_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
