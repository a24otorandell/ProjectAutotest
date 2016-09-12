package screen.AT2MSCSU0007;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajvirgili on 30/06/2016.
 */
public class AT2MSCSU0007Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MSCSU0007Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MSCSU0007Values.txt");
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
        data.put("country_code_url", "AI");
        data.put("update_country_code_url", "ZR");
        data.put("country_description_url", "ANGUILLA");
        data.put("update_country_description_url", "Congo");
        data.put("url_url", DataGenerator.getRandomAlphanumericSequence(12, false));
        data.put("update_url_url", DataGenerator.getRandomAlphanumericSequence(12, false));
        data.put("type", "Secondary");
        data.put("update_type", "Main");

        data.put("country_code_web", DataGenerator.getRandomAlphanumericSequence(3, false));
        data.put("update_country_code_web", DataGenerator.getRandomAlphanumericSequence(3, false));
        data.put("url_web", DataGenerator.getRandomAlphanumericSequence(12, false));
        data.put("update_url_web", DataGenerator.getRandomAlphanumericSequence(12, false));

        data.put("language_code", "CAT");
        data.put("update_language_code", "HEB");
        data.put("web_country_description", DataGenerator.getRandomAlphanumericSequence(12, false));
        data.put("update_web_country_description", DataGenerator.getRandomAlphanumericSequence(12, false));

    }
}
