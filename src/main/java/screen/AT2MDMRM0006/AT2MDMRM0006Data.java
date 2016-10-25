package screen.AT2MDMRM0006;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 24/10/2016.
 */
public class AT2MDMRM0006Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0006Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0006DataValues.txt");
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
        data.put("channel_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("channel_description", DataGenerator.getRandomAlphanumericSequence(10, true));
        data.put("channel_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("channel_description_edit", DataGenerator.getRandomAlphanumericSequence(10, true));
    }
}
