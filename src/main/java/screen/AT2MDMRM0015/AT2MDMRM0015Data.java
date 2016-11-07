package screen.AT2MDMRM0015;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 04/11/2016.
 */
public class AT2MDMRM0015Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0015Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0015DataValues.txt");
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
        data.put("group", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("order", Integer.toString(DataGenerator.random(0, 99)));
        data.put("language_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("language_detailed_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("group_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("order_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("language_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("language_detailed_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
