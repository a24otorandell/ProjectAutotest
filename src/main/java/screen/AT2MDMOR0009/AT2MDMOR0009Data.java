package screen.AT2MDMOR0009;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 16/11/2016.
 */
public class AT2MDMOR0009Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMOR0009Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2MDMOR0009DataValues.txt");
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
        data.put("ext_supplier_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hotelbeds_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("suppliers_web_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("groups_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("warning_allot_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("proforma_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("hotelbeds_offers_email_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("email_stop_sale_notification_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("email_grace_period_expenses_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mail_sender_to_hotel_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mail_sender_to_OS_suppl_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("transfers_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("change_GPS_zone_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("ext_supp_phone_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mail_address", DataGenerator.getRandomAlphanumericSequence(5, true));
        data.put("mail_address_edit", DataGenerator.getRandomAlphanumericSequence(5, true));
    }
}
