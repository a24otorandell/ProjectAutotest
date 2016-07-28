package screen.AT2BOOSA1003;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * This class manages the data used on this component to test
 *
 * @author ajvirgili on 15/07/2016
 */
public class AT2BOOSA1003Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2BOOSA1003Data() {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2BOOSA1003Values.txt");
        setData();
    }

    /**
     * Gets the data Map
     *
     * @return a {@code Map} with {String, String}
     */
    public Map<String, String> getData() {
        return data;
    }

    /**
     * Sets the data checking if there is any file to read, if not gets the hardcoded data
     *
     * @see DataHarvester#harvestAll()
     */
    public void setData() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultData();
        }
    }

    /**
     * Sets the hardcoded data in the data Map
     */
    public void setDefaultData() {
        data.put("booking_receptive", "1");
        data.put("booking_sales", "3219229");// only to check
        data.put("booking_transfers", "3219226"); // do not touch

        data.put("sales_start_date", "19/09/2016");
        data.put("sales_nights", "2");
        data.put("sales_end_date", "21/09/2016");
        data.put("sales_hotel", "PALACIO AVENIDA");
        data.put("sales_contract", "CG-TODOS");
        data.put("sales_units", "1");
        data.put("sales_room", "SGL");
        data.put("sales_chracteristic", "ST");
        data.put("sales_rate", "");
        data.put("sales_board", "BB");
        data.put("sales_adult", "1");
        data.put("sales_child", "0");
        data.put("sales_infant", "0");
        data.put("sales_si", "Yes");
        data.put("sales_pi", "Yes");
        data.put("sales_date_send_hotel", "15/07/2016");
        data.put("sales_cancellation_date", "");
        data.put("sales_transfer", "Both");
        data.put("sales_product_office", "");
        data.put("sales_product", "");

        data.put("distribution_order", "1");
        data.put("distribution_name", "Kathyrn");
        data.put("distribution_surname", "Lamb");
        data.put("distribution_age", "30");
        data.put("distribution_type", "");
        data.put("distribution_room", "1");

        data.put("transfers_transfer_order", "");
        data.put("transfers_transfer_date", "");
        data.put("transfers_departure_zone", "");
        data.put("transfers_departure_hotel", "");
        data.put("transfers_arrival_zone", "");
        data.put("transfers_arrival_hotel", "");
        data.put("transfers_sale_service_type", "");
        data.put("transfers_sale_contract", "");
        data.put("transfers_purchase_contract", "");
        data.put("transfers_transport", "");
        data.put("transfers_vehicle_type", "");
        data.put("transfers_vehicle_type2", "");
        data.put("transfers_flight", "");
        data.put("transfers_flight_hour", "");
        data.put("transfers_departure", "");
        data.put("transfers_status", "");
        data.put("transfers_main_passenger_name", "");
        data.put("transfers_real", "");
        data.put("transfers_dis", "");
        data.put("transfers_nh", "");
        data.put("transfers_adults", "");
        data.put("transfers_children", "");
        data.put("transfers_infant", "");

    }
}
