package screen.AT2MDMUS0023;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 08/11/2016.
 */
public class AT2MDMUS0023Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMUS0023Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMUS0023DataValues.txt");
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
        //PARAMETERS
        data.put("location", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("network_topology", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("IP", DataGenerator.ipGenerator());
        data.put("location_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("network_topology_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("IP_edit", DataGenerator.ipGenerator());
    }
}
