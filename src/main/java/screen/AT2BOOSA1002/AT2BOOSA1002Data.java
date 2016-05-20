package screen.AT2BOOSA1002;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;
    public AT2BOOSA1002Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2BOOSA1002Values.txt");
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
        data.put("header_interface","A");
        data.put("header_to","turchese");

    }
}
