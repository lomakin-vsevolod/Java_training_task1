package com.epam.training.cases;

import model.ElectricCar;

public class FromDTOConverterCase {

    public static ElectricCar getDataConvertToCar(){
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBrand("Skoda");
        electricCar.setModel("Octavia");
        electricCar.setCost(9332);
        electricCar.setConsumption(10);
        electricCar.setMaxSpeed(190);
        electricCar.setBatteryType("lion");
        electricCar.setPowerConsumption(34);

        return electricCar;
    }

    public static ElectricCar getDataNullConvertToCar(){
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBrand("Skoda");
        electricCar.setModel(null);
        electricCar.setCost(9332);
        electricCar.setConsumption(10);
        electricCar.setMaxSpeed(190);
        electricCar.setBatteryType("lion");
        electricCar.setPowerConsumption(34);

        return electricCar;
    }
}
