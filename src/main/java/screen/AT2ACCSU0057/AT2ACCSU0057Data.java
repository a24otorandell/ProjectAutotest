package screen.AT2ACCSU0057;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCSU0057Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0057Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCSU0057DataValues.txt");
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
        data.put("key", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("age_ext_code", Integer.toString(DataGenerator.random(0, 99)));
        data.put("environment_id", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("key_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("age_ext_code_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("environment_id_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("value_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
