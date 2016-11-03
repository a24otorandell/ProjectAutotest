package screen.AT2MDMDE0007;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 03/11/2016.
 */
public class AT2MDMDE0007Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMDE0007Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMDE0007DataValues.txt");
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
        //INTEREST POINTS
            data.put("tpi_longitude", Integer.toString(DataGenerator.random(0, 99)));
            data.put("tpi_latitude", Integer.toString(DataGenerator.random(0, 99)));
            data.put("tpi_telephone", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tpi_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tpi_longitude_edit", Integer.toString(DataGenerator.random(0, 99)));
            data.put("tpi_latitude_edit", Integer.toString(DataGenerator.random(0, 99)));
            data.put("tpi_telephone_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tpi_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //MULTI-LANGUAGE
            data.put("language", DataGenerator.getRandomAlphanumericSequence(3, true));
            data.put("name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("language_edit", DataGenerator.getRandomAlphanumericSequence(3, true));
            data.put("name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
