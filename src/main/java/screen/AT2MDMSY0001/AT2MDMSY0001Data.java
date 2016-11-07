package screen.AT2MDMSY0001;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMSY0001Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMSY0001Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMSY0001DataValues.txt");
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
        data.put("order", Integer.toString(DataGenerator.random(0, 99)));
        data.put("label", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("remarks", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("order_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("label_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("remarks_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
