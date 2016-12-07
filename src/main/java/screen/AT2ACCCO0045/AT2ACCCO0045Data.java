package screen.AT2ACCCO0045;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 30/11/2016.
 */
public class AT2ACCCO0045Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCCO0045Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2ACCCO0045Values.txt");
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
