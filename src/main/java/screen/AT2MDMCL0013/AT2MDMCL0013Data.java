package screen.AT2MDMCL0013;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0013Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0013Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMCL0013DataValues.txt");
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
        data.put("availability_iteration_number", Integer.toString(DataGenerator.random(0, 99)));
    }
}
