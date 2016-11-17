package screen.AT2ACTSU1007;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 17/11/2016.
 */
public class AT2ACTSU1007Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACTSU1007Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2ACTSU1007Values.txt");
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
