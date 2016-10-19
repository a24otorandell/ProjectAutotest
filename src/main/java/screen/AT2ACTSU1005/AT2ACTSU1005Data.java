package screen.AT2ACTSU1005;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2ACTSU1005Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACTSU1005Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACTSU1005DataValues.txt");
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
        data.put("prefix", Integer.toString(DataGenerator.random(0, 999)));
        data.put("prefix_edit", Integer.toString(DataGenerator.random(0, 999)));
        data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
