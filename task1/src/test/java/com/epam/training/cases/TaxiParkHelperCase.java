package com.epam.training.cases;

import model.Car;
import model.ElectricCar;
import model.GasolineCar;

import java.util.ArrayList;
import java.util.List;

public class TaxiParkHelperCase {

    public static List<Car> getExpectedFindBySpeed(){
        List<Car> carList = new ArrayList<Car>();

        ElectricCar electricCar1 = new ElectricCar();
        electricCar1.setBrand("Skoda");
        electricCar1.setModel("Octavia");
        electricCar1.setCost(9332);
        electricCar1.setConsumption(10);
        electricCar1.setMaxSpeed(190);
        electricCar1.setBatteryType("lion");
        electricCar1.setPowerConsumption(34);
        carList.add(electricCar1);

        GasolineCar gasolineCar1 = new GasolineCar();
        gasolineCar1.setBrand("Lada");
        gasolineCar1.setModel("Sputnik");
        gasolineCar1.setCost(5433);
        gasolineCar1.setConsumption(15);
        gasolineCar1.setMaxSpeed(150);
        gasolineCar1.setFuelType("diesel");
        gasolineCar1.setFuelConsumption(12);
        carList.add(gasolineCar1);

        return carList;
    }

    public static List<Car> getExpectedSortByConsumption(){
        List<Car> carList = new ArrayList<Car>();

        ElectricCar electricCar1 = new ElectricCar();
        electricCar1.setBrand("Skoda");
        electricCar1.setModel("Octavia");
        electricCar1.setCost(9332);
        electricCar1.setConsumption(10);
        electricCar1.setMaxSpeed(190);
        electricCar1.setBatteryType("lion");
        electricCar1.setPowerConsumption(34);
        carList.add(electricCar1);

        GasolineCar gasolineCar1 = new GasolineCar();
        gasolineCar1.setBrand("Lada");
        gasolineCar1.setModel("Sputnik");
        gasolineCar1.setCost(5433);
        gasolineCar1.setConsumption(15);
        gasolineCar1.setMaxSpeed(150);
        gasolineCar1.setFuelType("diesel");
        gasolineCar1.setFuelConsumption(12);
        carList.add(gasolineCar1);

        GasolineCar gasolineCar2 = new GasolineCar();
        gasolineCar2.setBrand("Renault");
        gasolineCar2.setModel("Logan");
        gasolineCar2.setCost(10234);
        gasolineCar2.setConsumption(23);
        gasolineCar2.setMaxSpeed(220);
        gasolineCar2.setFuelType("diesel");
        gasolineCar2.setFuelConsumption(12);
        carList.add(gasolineCar2);

        return carList;
    }
}
