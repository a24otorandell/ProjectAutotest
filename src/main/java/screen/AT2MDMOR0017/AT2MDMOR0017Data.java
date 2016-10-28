package screen.AT2MDMOR0017;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 27/10/2016.
 */
public class AT2MDMOR0017Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0017Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMOR0017DataValues.txt");
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
        data.put("notes", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("label", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("order_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("notes_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("label_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
