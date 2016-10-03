package screen.AT2ACCSU0025;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 13/09/2016.
 */
public class AT2ACCSU0025Data {


    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCSU0025Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources  AT2CCSU0025Values.txt");
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
