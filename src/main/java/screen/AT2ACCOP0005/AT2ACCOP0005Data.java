package screen.AT2ACCOP0005;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lchacartegui on 31/08/2016.
 */
public class AT2ACCOP0005Data {

    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCOP0005Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCOP0005Values.txt");
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
