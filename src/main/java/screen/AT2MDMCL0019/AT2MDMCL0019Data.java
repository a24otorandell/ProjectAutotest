package screen.AT2MDMCL0019;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 19/10/2016.
 */
public class AT2MDMCL0019Data {

    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMCL0019Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2ACCSU0065DataValues.txt");
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
        data.put("agency_name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("major", Integer.toString(DataGenerator.random(0, 99)));
        data.put("sub_major", Integer.toString(DataGenerator.random(0, 99)));
        data.put("detail", Integer.toString(DataGenerator.random(0, 99)));
        data.put("branch_TO", Integer.toString(DataGenerator.random(0, 99)));
        data.put("source_market", Integer.toString(DataGenerator.random(0, 99)));
        data.put("fiscal_number", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("atlas_branch", Integer.toString(DataGenerator.random(0, 99)));
        data.put("credit", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("type", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("interface_description", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("street", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("city", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("postcode", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("telephone", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("fax", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("name", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("surname", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("email", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("agency_name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("major_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("sub_major_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("detail_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("branch_TO_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("source_market_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("fiscal_number_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("atlas_branch_edit", Integer.toString(DataGenerator.random(0, 99)));
        data.put("credit_edit", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("type_edit", DataGenerator.getRandomAlphanumericSequence(1, true));
        data.put("interface_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("id_web_description_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("street_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("city_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("postcode_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("telephone_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("fax_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("name_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("surname_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}