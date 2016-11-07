package screen.AT2MDMRM0018;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 07/11/2016.
 */
public class AT2MDMRM0018Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMRM0018Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMRM0018DataValues.txt");
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
        //TABS - TABS
            data.put("tabs_name", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_image_detail", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_image_on", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_image_off", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_image_detail_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_image_on_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("tabs_image_off_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //TABS - LANGUAGES
            data.put("lang_language_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("lang_language_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //CONFIGURATIONS - CONFIGURATION
            data.put("config_configuration_description", DataGenerator.getRandomAlphanumericSequence(5, true));
            data.put("config_configuration_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //CONFIGURATIONS - TABS PER CONFIGURATION
            data.put("tabconfig_order", Integer.toString(DataGenerator.random(0, 99)));
            data.put("tabconfig_order_edit", Integer.toString(DataGenerator.random(0, 99)));
    }
}