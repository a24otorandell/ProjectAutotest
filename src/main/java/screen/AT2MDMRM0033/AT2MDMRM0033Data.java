package screen.AT2MDMRM0033;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 09/11/2016.
 */
public class AT2MDMRM0033Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0033Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0033DataValues.txt");
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
        data.put("first_char", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("application_date", DataGenerator.getToday());
        data.put("second_validation_type", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("first_char_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("application_date_edit", DataGenerator.getRelativeDateToday("dd/MM/yyyy", 0, 1, 0));
        data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
