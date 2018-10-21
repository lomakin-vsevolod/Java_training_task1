package com.epam.training.util;


import com.epam.training.dto.CarDTO;
import model.CarType;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonFileHandler {

    private final static Logger logger = Logger.getLogger(JsonFileHandler.class);

    private static final String FILES_LOCATION = "src\\test\\resources\\";

    public JSONObject readJsonFile(String fileName) {
        JSONParser parser = new JSONParser();
        try {
            Object object = parser
                    .parse(new FileReader(FILES_LOCATION + fileName));

            JSONObject jsonObject = (JSONObject) object;
            return jsonObject;
        } catch (FileNotFoundException fe) {
            logger.error("File not found!");
            fe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CarDTO> convertJsonObject(JSONObject jsonObject) {
        List<CarDTO> carDTOList = new ArrayList<CarDTO>();
        JSONArray cars = (JSONArray) jsonObject.get("cars");

        for (Object car : cars) {
            JSONObject carJsonObject = (JSONObject) car;
            CarDTO carDTOObject = new CarDTO();
            if (carJsonObject.get("carType") != null) {
                carDTOObject.setCarType(carJsonObject.get("carType").toString());
                if (carDTOObject.getCarType().equals(CarType.electric.toString())) {
                    if (carJsonObject.get("batteryType") != null) carDTOObject.setBatteryType(carJsonObject.get("batteryType").toString());
                    if (carJsonObject.get("powerConsumption") != null) carDTOObject.setPowerConsumption(Integer.decode(carJsonObject.get("powerConsumption").toString()));
                }
                if (carDTOObject.getCarType().equals(CarType.gasoline.toString())) {
                    if (carJsonObject.get("fuelType") != null) carDTOObject.setFuelType(carJsonObject.get("fuelType").toString());
                    if (carJsonObject.get("fuelConsumption") != null)carDTOObject.setFuelConsumption(Integer.decode(carJsonObject.get("fuelConsumption").toString()));
                }
            }
            if (carJsonObject.get("brand") != null) carDTOObject.setBrand(carJsonObject.get("brand").toString());
            if (carJsonObject.get("model") != null) carDTOObject.setModel(carJsonObject.get("model").toString());
            if (carJsonObject.get("cost") != null)
                carDTOObject.setCost(Integer.decode(carJsonObject.get("cost").toString()));
            if (carJsonObject.get("consumption") != null)
                carDTOObject.setConsumption(Integer.decode(carJsonObject.get("consumption").toString()));
            if (carJsonObject.get("maxSpeed") != null)
                carDTOObject.setMaxSpeed(Integer.decode(carJsonObject.get("maxSpeed").toString()));

            carDTOList.add(carDTOObject);
            logger.debug("CarDTO added to list: " + carDTOObject.toString());
        }
        return carDTOList;
    }

}
