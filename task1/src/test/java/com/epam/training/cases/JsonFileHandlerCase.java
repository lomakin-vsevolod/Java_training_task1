package com.epam.training.cases;

import com.epam.training.dto.CarDTO;

public class JsonFileHandlerCase {

    public static CarDTO getDataConvertJsonObject(){
        CarDTO carDTO = new CarDTO();
        carDTO.setCarType("electric");
        carDTO.setBrand("Skoda");
        carDTO.setModel("Octavia");
        carDTO.setCost(9332);
        carDTO.setConsumption(10);
        carDTO.setMaxSpeed(190);
        carDTO.setBatteryType("lion");
        carDTO.setPowerConsumption(34);

        return carDTO;
    }

    public static CarDTO getNullDataConvertJsonObject(){
        CarDTO carDTO = new CarDTO();
        carDTO.setCarType(null);
        carDTO.setBrand("Skoda");
        carDTO.setModel(null);
        carDTO.setCost(9332);
        carDTO.setConsumption(10);
        carDTO.setMaxSpeed(190);
        carDTO.setBatteryType(null);
        carDTO.setPowerConsumption(0);

        return carDTO;
    }

}
