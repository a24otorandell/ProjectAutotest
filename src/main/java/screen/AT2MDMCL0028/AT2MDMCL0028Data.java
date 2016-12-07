package screen.AT2MDMCL0028;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 28/11/2016.
 */
public class AT2MDMCL0028Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0028Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMCL0028DataValues.txt");
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
        //PARTNERS
        data.put("prtns_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prtns_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prtns_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("prtns_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GROUPS
        data.put("gr_group_code", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gr_group_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gr_group_code_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("gr_group_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        //GROUP DESCRIPTION
        data.put("grd_texto", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("grd_texto_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}