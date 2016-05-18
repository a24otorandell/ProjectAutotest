package screen.AT2BOOSA0005;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icastaneira on 17/05/2016.
 */
public class AT2BOOSA0005Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2BOOSA0005Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2BOOSA0005Values.txt");
        setData();
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData() {
        this.data = harvester.harvestAll();
        if(data.get("empty").equals("true")){
            setDefaultData();
        }
    }

    public void setDefaultData(){
        //TODO FILL WITH DATA
    }
}