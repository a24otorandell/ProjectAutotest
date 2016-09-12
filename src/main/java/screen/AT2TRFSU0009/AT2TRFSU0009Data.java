package screen.AT2TRFSU0009;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 12/09/2016.
 */
public class AT2TRFSU0009Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2TRFSU0009Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2TRFSU0009Values.txt");
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

    }
}
