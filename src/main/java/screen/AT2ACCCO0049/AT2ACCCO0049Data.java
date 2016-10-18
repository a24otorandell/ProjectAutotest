package screen.AT2ACCCO0049;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 13/10/2016.
 */
public class AT2ACCCO0049Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2ACCCO0049Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCCO0049DataValues.txt");
        setData();
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")){
            setDefaultData();
        }
    }

    public void setDefaultData() {
        data.put("disney_hotel", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("disney_room", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("package_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contract_type", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("calendar_order", Integer.toString(DataGenerator.random(0, 99)));
        data.put("disney_hotel_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("disney_room_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("package_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("contract_type_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("calendar_order_edit", Integer.toString(DataGenerator.random(0, 99)));
    }
}