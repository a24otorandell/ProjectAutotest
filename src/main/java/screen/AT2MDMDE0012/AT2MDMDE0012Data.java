package screen.AT2MDMDE0012;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */

public class AT2MDMDE0012Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMDE0012Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMDE0012DataValues.txt");
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
        data.put("destination_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("destination", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("image", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("destination_description", DataGenerator.getRandomAlphanumericSequence(20, true));
        data.put("destination_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("destination_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("image_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("destination_description_edit", DataGenerator.getRandomAlphanumericSequence(20, true));
    }
}