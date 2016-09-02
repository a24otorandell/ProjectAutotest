package screen.AT2TRFSU0005;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 01/09/2016.
 */
public class AT2TRFSU0005Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2TRFSU0005Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2TRFSU0005Values.txt");
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
        //data.put("grouping_area", DataGenerator.getRandomAlphanumericSequence(5,false));
        data.put("grouping_area", DataGenerator.getRandomAlphanumericSequence(4, false));
        data.put("update_grouping_area", DataGenerator.getRandomAlphanumericSequence(4, false));
        data.put("grouping_area_description", DataGenerator.getRandomAlphanumericSequence(5, false));
        data.put("update_grouping_area_description", DataGenerator.getRandomAlphanumericSequence(5, false));

        data.put("area_code", "CMAYOR");
        data.put("update_area_code", "CMAR");
        data.put("area_code_description", "Cala Mayor");
        data.put("update_area_code_description", "Camp De Mar");
    }
}
