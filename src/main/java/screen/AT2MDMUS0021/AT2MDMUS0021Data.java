package screen.AT2MDMUS0021;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMUS0021Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMUS0021Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMUS0021DataValues.txt");
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
        //BUSINESS OWNER
            //RESULT BUSINESS OWNER
                data.put("rbo_code", DataGenerator.getRandomAlphanumericSequence(5, true));
                data.put("rbo_description", DataGenerator.getRandomAlphanumericSequence(5, true));
                data.put("rbo_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //PROCESS OWNER
            //RESULT PROCESS OWNER
                data.put("rpo_code", DataGenerator.getRandomAlphanumericSequence(5, true));
                data.put("rpo_description", DataGenerator.getRandomAlphanumericSequence(5, true));
                data.put("rpo_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}