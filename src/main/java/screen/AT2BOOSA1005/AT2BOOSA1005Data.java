package screen.AT2BOOSA1005;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 17/11/2016.
 */
public class AT2BOOSA1005Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2BOOSA1005Data (String enviroment){
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources  AT2BOOSA1005Values.txt");
        setData();
    }

    public Map<String, String> getData (){
        return data;
    }

    public void setData (){
        this.data = harvester.harvestAll();
        if(data.get("empty").equals("true")){
            setDefaultData();
        }
    }

    public void setDefaultData (){

    }
}
