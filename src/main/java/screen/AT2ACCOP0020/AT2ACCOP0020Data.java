package screen.AT2ACCOP0020;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 23/09/2016.
 */
public class AT2ACCOP0020Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCOP0020Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2ACCOP0020Values.txt");
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
