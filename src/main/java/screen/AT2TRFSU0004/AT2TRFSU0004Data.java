package screen.AT2TRFSU0004;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lchacartegui on 02/09/2016.
 */
public class AT2TRFSU0004Data {

    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2TRFSU0004Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2TRFSU0004Values.txt");
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
        data.put("add_language", "ALE");
        data.put("update_add_language", "ARA");
    }
}
