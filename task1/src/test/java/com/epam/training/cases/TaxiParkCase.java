package com.epam.training.cases;

import manager.TaxiPark;
import model.Car;
import model.ElectricCar;
import model.GasolineCar;

import java.util.ArrayList;
import java.util.List;

public class TaxiParkCase {

    public void addCar(TaxiPark taxiPark, List<Car> addCarList){
        for (Car car :addCarList){
            taxiPark.addCar(car);
        }
    }

    public static List<Car> getDataToAddSingleCar(){
        List<Car> carList = new ArrayList<Car>();
        ElectricCar electricCar1 = new ElectricCar();

        electricCar1.setBrand("Kia");
        electricCar1.setModel("Rio");
        electricCar1.setCost(5000);
        electricCar1.setConsumption(10);
        electricCar1.setMaxSpeed(190);
        electricCar1.setBatteryType("lion");
        electricCar1.setPowerConsumption(34);
        carList.add(electricCar1);

        return carList;
    }

    public static List<Car> getDataToAddMultipleCar(){
        List<Car> carList = new ArrayList<Car>();
        ElectricCar electricCar1 = new ElectricCar();

        electricCar1.setBrand("Kia");
        electricCar1.setModel("Rio");
        electricCar1.setCost(5000);
        electricCar1.setConsumption(10);
        electricCar1.setMaxSpeed(190);
        electricCar1.setBatteryType("lion");
        electricCar1.setPowerConsumption(34);
        carList.add(electricCar1);

        GasolineCar gasolineCar1 = new GasolineCar();
        gasolineCar1.setBrand("Volkswagen");
        gasolineCar1.setModel("Polo");
        gasolineCar1.setCost(10534);
        gasolineCar1.setConsumption(25);
        gasolineCar1.setMaxSpeed(200);
        gasolineCar1.setFuelType("diesel");
        gasolineCar1.setFuelConsumption(30);
        carList.add(gasolineCar1);

        return carList;
    }

    public void deleteCar(TaxiPark taxiPark, List<Integer> indexList){
        for(Integer index: indexList){
            taxiPark.deleteCar(index);
        }
    }

    public static List<Integer> getDataToDeleteSingleCar(){
        List<Integer> indexList = new ArrayList<Integer>();
        indexList.add(1);

        return indexList;
    }

    public static List<Integer> getDataToDeleteMultipleCar(){
        List<Integer> indexList = new ArrayList<Integer>();
        indexList.add(1);
        indexList.add(1);

        return indexList;
    }

}
