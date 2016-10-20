package screen.AT2MDMOR0012;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/10/2016.
 */
public class AT2MDMOR0012Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0012Data (String enviroment){
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2MDMOR0012Values.txt");
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
