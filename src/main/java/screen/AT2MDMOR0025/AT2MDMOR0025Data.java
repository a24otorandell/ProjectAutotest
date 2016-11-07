package screen.AT2MDMOR0025;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 07/11/2016.
 */
public class AT2MDMOR0025Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0025Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0025DataValues.txt");
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
        data.put("file_new", "C:\\Users\\aibanez\\Downloads\\hotelbeds.png");
        data.put("file_new2", "C:\\Users\\aibanez\\Downloads\\hotel2.jpg");
    }
}
