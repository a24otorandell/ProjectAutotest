package screen.AT2ACCSU0073;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 06/10/2016.
 */
public class AT2ACCSU0073Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0073Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resourcesAT2CCSU0073Values.txt");
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
